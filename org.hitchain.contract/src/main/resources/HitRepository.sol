pragma solidity 0.5.6;

/**
 * @author Tyler Chen
 * @title HitRepository
 * @dev The contract to save the repository informations, last update: 2019-06-29, version: 0.0.3.
 */
contract HitRepository {
    /**
     * @dev the event for use to find out the transaction is success or fail.
     */
    event Success(bool value);
    /**
     * @dev the user name.
     */
    string public name;
    /**
     * @dev the user email.
     */
    string public email;
    /**
     * @dev the contract/repository owner.
     */
    address public owner;
    /**
     * @dev repository id also as repository id.
     */
    uint256 public id;
    /**
     * @dev repository name mapping to repository id.
     */
    mapping(uint256 => uint256) public hash_id;
    /**
     * @dev repository id mapping to repository name.
     */
    mapping(uint256 => string ) public id_name;
    /**
     * @dev repository id mapping to repository url.
     */
    mapping(uint256 => string ) public id_url;
    /**
     * @dev repository id mapping to address by type, use for delegator, member and pull request member.
     */
    mapping(uint256 => mapping(uint256 => mapping(address => bool))) public id_type_address;
    /**
     * @dev repository id mapping to address count by type.
     */
    mapping(uint256 => mapping(uint256 => mapping(uint256 => address))) public id_type_count_address;
    /**
     * @dev repository id mapping to string by type, use for pull request url.
     */
    mapping(uint256 => mapping(uint256 => mapping(uint256 => string))) public id_type_count_string;
    /**
     * @dev repository id mapping to string count by type.
     */
    mapping(uint256 => mapping(uint256 => uint256)) public id_type_count;
    /**
     * @dev repository id mapping to disable by type.
     */
    mapping(uint256 => mapping(uint256 => bool)) public id_type_disable;
    //
    /**
     * @dev this type use for owner settings.
     */
    uint256 public constant TYPE_OWNER = uint256(0);
    /**
     * @dev how to search delegator, var count = id_type_count(id, 1),
     * @dev var address = id_type_count_address(id, 1, count), var enable = id_type_address(id, 1, address).
     */
    uint256 public constant TYPE_DELEGATOR = uint256(1);
    /**
     * @dev how to search member, var count = id_type_count(id, 2),
     * @dev var address = id_type_count_address(id, 2, count), var enable = id_type_address(id, 2, address).
     */
    uint256 public constant TYPE_MEMBER = uint256(2);
    /**
     * @dev how to search pr member, var count = id_type_count(id, 3),
     * @dev var address = id_type_count_address(id, 3, count), var enable = id_type_address(id, 3, address).
     */
    uint256 public constant TYPE_PR_MEMBER = uint256(3);
    /**
     * @dev how to search authorized pr, var count = id_type_count(id, 4),
     * @dev var string = id_type_count_string(id, 4, count).
     */
    uint256 public constant TYPE_PR_AUTH = uint256(4);
    /**
     * @dev how to search community pr, var count = id_type_count(id, 5),
     * @dev var string = id_type_count_string(id, 5, count).
     */
    uint256 public constant TYPE_PR_COMM = uint256(5);
    /**
     * @dev how to search started repository, var count = id_type_count(0, 6),
     * @dev var string = id_type_count_string(0, 6, count).
     */
    uint256 public constant TYPE_STARTED = uint256(6);
    /**
     * @dev contract version.
     */
    uint256 public constant VERSION = uint256(2019071100);

    /**
     * @dev create the contract with the contract owner.
     */
    constructor() public {
        owner = msg.sender;
        emit Success(true);
    }
    /**
     * @dev Throws if called by any account other than the owner.
     */
    modifier onlyOwner() {
        require(msg.sender == owner);
        _;
    }
    /**
     * @dev Throws if called by any account other than the owner or delegator.
     * @param _id the repository id.
     */
    modifier hasAuthority(uint256 _id) {
        require(msg.sender == owner
        || id_type_address[_id][TYPE_DELEGATOR][msg.sender] == true);
        _;
    }
    /**
     * @dev Throws if the repository is not exists.
     * @param _id the repository id.
     */
    modifier hasRepository(uint256 _id) {
        require(_id > 0 && bytes(id_name[_id]).length > 0);
        _;
    }
    /**
     * @dev Throws if the type is not exists.
     * @param _type the data type.
     */
    modifier hasType(uint256 _type) {
        require(_type >= TYPE_DELEGATOR && _type <= TYPE_PR_COMM);
        _;
    }
    /**
     * @dev Throws if the type is disable.
     * @param _id the repository id.
     * @param _type the data type.
     */
    modifier hasTypeEnable(uint256 _id, uint256 _type) {
        require(_id > 0);
        require(_type >= TYPE_DELEGATOR && _type <= TYPE_PR_COMM);
        require(id_type_disable[_id][_type] != true);
        _;
    }
    /**
     * @dev get repository id by name.
     * @param _name The repository name.
     */
    function repositoryId(string memory _name) public view returns (uint256) {
        bytes memory nameBytes = bytes(_name);
        if(nameBytes.length < 1) {
            return uint256(0);
        }
        uint256 hash = uint256(keccak256(nameBytes));
        return hash_id[hash];
    }
    /**
     * @dev update user name.
     * @param _name The user name.
     */
    function updateName(string memory _name) public onlyOwner {
        name = _name;
        emit Success(true);
    }
    /**
     * @dev update user email.
     * @param _email The user email.
     */
    function updateEmail(string memory _email) public onlyOwner {
        email = _email;
        emit Success(true);
    }
    /**
     * @dev add repository.
     * @param _name The repository name.
     */
    function addRepository(string memory _name) public onlyOwner {
        bytes memory nameBytes = bytes(_name);
        require(nameBytes.length > 0);
        uint256 hash = uint256(keccak256(nameBytes));// hash repository name.
        require(hash_id[hash] == 0); // make sure the new repository name is not exists.
        //
        id = id + 1;// repository id.
        hash_id[hash] = id;// mapping hash with id.
        id_name[id] = _name;// mapping id with repository name.
        emit Success(true);
    }
    /**
     * @dev update repository name.
     * @param _name The repository name.
     * @param _newName The new repository name.
     */
    function updateRepository(string memory _name, string memory _newName) public onlyOwner {
        bytes memory newNameBytes = bytes(_newName);
        require(newNameBytes.length > 0);
        uint256 idx = repositoryId(_name);
        require(idx > 0);
        //
        uint256 hash = uint256(keccak256(bytes(_name)));
        uint256 hashNew = uint256(keccak256(newNameBytes));
        delete hash_id[hash];// remove old hash
        id_name[idx] = _newName;// set new repository name.
        hash_id[hashNew] = idx;// add new hash and point to old repository id.
        emit Success(true);
    }
    /**
     * @dev update repository url by repository id.
     * @param _id The repository id.
     * @param _url The repository url.
     */
    function updateUrl(uint256 _id, string memory _url, string memory _urlNew) public hasRepository(_id) {
        bytes memory urlNewBytes = bytes(_urlNew);
        require(urlNewBytes.length > 0);
        bytes memory urlBytes = bytes(_url);
        require(urlBytes.length > 0);
        bytes memory currentUrlBytes = bytes(id_url[_id]);
        require(currentUrlBytes.length == 0 || keccak256(urlBytes) == keccak256(currentUrlBytes));// verfify the old url.
        // owner or delegator or repository member can update url.
        require(msg.sender == owner
        || id_type_address[_id][TYPE_DELEGATOR][msg.sender] == true
        || id_type_address[_id][TYPE_MEMBER][msg.sender] == true);
        //
        id_url[_id] = _urlNew;
        emit Success(true);
    }
    /**
     * @dev add repository delegator by repository id.
     * @param _id The repository id.
     * @param _address The repository delegator.
     */
    function addDelegator(uint256 _id, address _address) public onlyOwner hasRepository(_id) hasTypeEnable(_id, TYPE_DELEGATOR) {
        require(_address != address(0));
        //
        addTypeAddressById(_id, _address, TYPE_DELEGATOR);
        emit Success(true);
    }
    /**
     * @dev remove repository delegator by repository id.
     * @param _id The repository id.
     * @param _address The repository delegator.
     */
    function removeDelegator(uint256 _id, address _address) public onlyOwner hasRepository(_id) hasTypeEnable(_id, TYPE_DELEGATOR) {
        require(_address != address(0));
        //
        removeTypeAddressById(_id, _address, TYPE_DELEGATOR);
        emit Success(true);
    }
    /**
     * @dev add repository member by repository id.
     * @param _id The repository id.
     * @param _address The repository member.
     */
    function addMember(uint256 _id, address _address) public hasAuthority(_id) hasRepository(_id) hasTypeEnable(_id, TYPE_MEMBER) {
        require(_address != address(0));
        //
        addTypeAddressById(_id, _address, TYPE_MEMBER);
        emit Success(true);
    }
    /**
     * @dev remove repository member by repository id.
     * @param _id The repository id.
     * @param _address The repository member.
     */
    function removeMember(uint256 _id, address _address) public hasAuthority(_id) hasRepository(_id) hasTypeEnable(_id, TYPE_MEMBER) {
        require(_address != address(0));
        //
        removeTypeAddressById(_id, _address, TYPE_MEMBER);
        emit Success(true);
    }
    /**
     * @dev add repository pull request member by repository id.
     * @param _id The repository id.
     * @param _address The repository member.
     */
    function addPrMember(uint256 _id, address _address) public hasAuthority(_id) hasRepository(_id) hasTypeEnable(_id, TYPE_PR_MEMBER) {
        require(_address != address(0));
        //
        addTypeAddressById(_id, _address, TYPE_PR_MEMBER);
        emit Success(true);
    }
    /**
     * @dev remove repository pull request member by repository id.
     * @param _id The repository id.
     * @param _address The repository member.
     */
    function removePrMember(uint256 _id, address _address) public hasAuthority(_id) hasRepository(_id) hasTypeEnable(_id, TYPE_PR_MEMBER) {
        require(_address != address(0));
        //
        removeTypeAddressById(_id, _address, TYPE_PR_MEMBER);
        emit Success(true);
    }
    /**
     * @dev add pull request by repository id.
     * @param _id The repository id.
     * @param _url The pull request url.
     */
    function addPullRequest(uint256 _id, string memory _url) public hasRepository(_id) {
        require(bytes(_url).length > 0);
        // owner, delegator, repository member and pull request member is authorized.
        if(msg.sender == owner
        || id_type_address[_id][TYPE_DELEGATOR][msg.sender] == true
        || id_type_address[_id][TYPE_MEMBER][msg.sender] == true
        || id_type_address[_id][TYPE_PR_MEMBER][msg.sender] == true) {
            require(id_type_disable[_id][TYPE_PR_AUTH] != true);
            addTypeStringById(_id, _url, TYPE_PR_AUTH);
        } else {
            require(id_type_disable[_id][TYPE_PR_COMM] != true);
            addTypeStringById(_id, _url, TYPE_PR_COMM);
        }
        emit Success(true);
    }
    /**
     * @dev add started repository.
     * @param _url The hit repository url.
     */
    function addStarted(string memory _url) public onlyOwner {
        require(bytes(_url).length > 0);
        //
        addTypeStringById(TYPE_OWNER, _url, TYPE_STARTED);
        emit Success(true);
    }
    /**
     * @dev remove started repository.
     * @param _startedIndex started repository index.
     */
    function removeStarted(uint256 _startedIndex) public onlyOwner {
        require(_startedIndex > 0 && _startedIndex <= id_type_count[TYPE_OWNER][TYPE_STARTED]);
        //
        delete id_type_count_string[TYPE_OWNER][TYPE_STARTED][_startedIndex];
        emit Success(true);
    }
    /**
     * @dev disable type by repository id.
     * @param _id The repository id.
     * @param _type The data type.
     */
    function disableType(uint256 _id, uint256 _type) public hasAuthority(_id) hasType(_type) hasRepository(_id) {
        id_type_disable[_id][_type] = true;
        emit Success(true);
    }
    /**
     * @dev enable type by repository id.
     * @param _id The repository id.
     * @param _type The data type.
     */
    function enableType(uint256 _id, uint256 _type) public hasAuthority(_id) hasType(_type) hasRepository(_id) {
        id_type_disable[_id][_type] = false;
        emit Success(true);
    }
    /**
     * @dev add address to type.
     * @param _id The repository id.
     * @param _address address.
     * @param _type type.
     */
    function addTypeAddressById(uint256 _id, address _address, uint256 _type) private {
        id_type_address[_id][_type][_address] = true;// add address to type
        uint256 typeCount = id_type_count[_id][_type] + 1;// address count
        id_type_count_address[_id][_type][typeCount] = _address;// address index
        id_type_count[_id][_type] = typeCount;// set count
    }
    /**
     * @dev remove address from type.
     * @param _id The repository id.
     * @param _address address.
     * @param _type type.
     */
    function removeTypeAddressById(uint256 _id, address _address, uint256 _type) private {
        id_type_address[_id][_type][_address] = false;// just set address as false
    }
    /**
     * @dev add string to type.
     * @param _id The repository id.
     * @param _string string.
     * @param _type type.
     */
    function addTypeStringById(uint256 _id, string memory _string, uint256 _type) private {
        uint256 typeCount = id_type_count[_id][_type] + 1;// string count
        id_type_count_string[_id][_type][typeCount] = _string;// add string
        id_type_count[_id][_type] = typeCount;// set count
    }
}