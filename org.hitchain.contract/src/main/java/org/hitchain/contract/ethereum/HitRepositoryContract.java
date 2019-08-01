/*******************************************************************************
 * Copyright (c) 2019-07-11 @author <a href="mailto:iffiff1@gmail.com">Tyler Chen</a>.
 * All rights reserved.
 *
 * Contributors:
 *     <a href="mailto:iffiff1@gmail.com">Tyler Chen</a> - initial API and implementation.
 ******************************************************************************/
package org.hitchain.contract.ethereum;

/**
 * HitRepositoryContract
 *
 * @author <a href="mailto:iffiff1@gmail.com">Tyler Chen</a>
 * @since 2019-07-11
 * auto generate by qdp.
 */
public class HitRepositoryContract {
    //binary code
    public static final String bytes="608060405234801561001057600080fd5b50600280546001600160a01b03191633179055604080516001815290517f3b0a8ddef325df2bfdfa6b430ae4c8421841cd135bfa8fb5e432f200787520bb9181900360200190a1611fa6806100666000396000f3fe608060405234801561001057600080fd5b50600436106102275760003560e01c806374d0a676116101305780639d582a24116100b8578063d317e8a71161007c578063d317e8a71461096d578063e19d894f14610a11578063eacd8bc614610a34578063f06099af14610b5d578063ffa1ad7414610c0157610227565b80639d582a241461083f578063ab9fb4e914610862578063af640d0f1461088e578063b0700eb514610896578063b5440758146108c257610227565b806384da92a7116100ff57806384da92a7146107275780638da5cb5b146107cb5780639021495a146107d3578063945737e5146107f65780639d28ff4a1461081357610227565b806374d0a6761461063257806377296f761461065e5780637f2651631461067b578063820e93f51461071f57610227565b80633ea46a94116101b35780634e4a7053116101825780634e4a705314610465578063547ddca8146104ab57806362df6273146104b35780636be7658b146105e35780636f693de31461060f57610227565b80633ea46a941461037357806345fc5161146103905780634923e067146104345780634a712f2a1461043c57610227565b806321d0bb77116101fa57806321d0bb77146102f957806327d0f4ae146103165780632d5764551461035b57806332e39f82146103635780633a0e61741461036b57610227565b806306fdde031461022c5780630b94a3c3146102a95780630c606348146102d757806313029dd0146102f1575b600080fd5b610234610c09565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561026e578181015183820152602001610256565b50505050905090810190601f16801561029b5780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6102d5600480360360408110156102bf57600080fd5b50803590602001356001600160a01b0316610c97565b005b6102df610dbd565b60408051918252519081900360200190f35b6102df610dc2565b6102d56004803603602081101561030f57600080fd5b5035610dc7565b61033f6004803603606081101561032c57600080fd5b5080359060208101359060400135610e9c565b604080516001600160a01b039092168252519081900360200190f35b6102df610ec8565b6102df610ecd565b6102df610ed2565b6102346004803603602081101561038957600080fd5b5035610ed7565b6102df600480360360208110156103a657600080fd5b810190602081018135600160201b8111156103c057600080fd5b8201836020820111156103d257600080fd5b803590602001918460018302840111600160201b831117156103f357600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550610f3f945050505050565b6102df610f79565b6102346004803603606081101561045257600080fd5b5080359060208101359060400135610f7e565b6104976004803603606081101561047b57600080fd5b50803590602081013590604001356001600160a01b0316610ff7565b604080519115158252519081900360200190f35b6102df61101d565b6102d5600480360360608110156104c957600080fd5b81359190810190604081016020820135600160201b8111156104ea57600080fd5b8201836020820111156104fc57600080fd5b803590602001918460018302840111600160201b8311171561051d57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b81111561056f57600080fd5b82018360208201111561058157600080fd5b803590602001918460018302840111600160201b831117156105a257600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611022945050505050565b6102d5600480360360408110156105f957600080fd5b50803590602001356001600160a01b03166111ff565b6102d56004803603604081101561062557600080fd5b50803590602001356112fb565b6102d56004803603604081101561064857600080fd5b50803590602001356001600160a01b03166113eb565b6102df6004803603602081101561067457600080fd5b50356114e7565b6102d56004803603602081101561069157600080fd5b810190602081018135600160201b8111156106ab57600080fd5b8201836020820111156106bd57600080fd5b803590602001918460018302840111600160201b831117156106de57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506114f9945050505050565b6102346115a1565b6102d56004803603602081101561073d57600080fd5b810190602081018135600160201b81111561075757600080fd5b82018360208201111561076957600080fd5b803590602001918460018302840111600160201b8311171561078a57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506115fb945050505050565b61033f61164b565b610497600480360360408110156107e957600080fd5b508035906020013561165a565b6102346004803603602081101561080c57600080fd5b503561167a565b6102d56004803603604081101561082957600080fd5b50803590602001356001600160a01b03166116e2565b6102df6004803603604081101561085557600080fd5b50803590602001356117de565b6102d56004803603604081101561087857600080fd5b50803590602001356001600160a01b03166117fb565b6102df6118eb565b6102d5600480360360408110156108ac57600080fd5b50803590602001356001600160a01b03166118f1565b6102d5600480360360408110156108d857600080fd5b81359190810190604081016020820135600160201b8111156108f957600080fd5b82018360208201111561090b57600080fd5b803590602001918460018302840111600160201b8311171561092c57600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295506119b8945050505050565b6102d56004803603602081101561098357600080fd5b810190602081018135600160201b81111561099d57600080fd5b8201836020820111156109af57600080fd5b803590602001918460018302840111600160201b831117156109d057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611b48945050505050565b6102d560048036036040811015610a2757600080fd5b5080359060200135611b7a565b6102d560048036036040811015610a4a57600080fd5b810190602081018135600160201b811115610a6457600080fd5b820183602082011115610a7657600080fd5b803590602001918460018302840111600160201b83111715610a9757600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295949360208101935035915050600160201b811115610ae957600080fd5b820183602082011115610afb57600080fd5b803590602001918460018302840111600160201b83111715610b1c57600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611c65945050505050565b6102d560048036036020811015610b7357600080fd5b810190602081018135600160201b811115610b8d57600080fd5b820183602082011115610b9f57600080fd5b803590602001918460018302840111600160201b83111715610bc057600080fd5b91908080601f016020809104026020016040519081016040528093929190818152602001838380828437600092019190915250929550611d1e945050505050565b6102df611d48565b6000805460408051602060026001851615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015610c8f5780601f10610c6457610100808354040283529160200191610c8f565b820191906000526020600020905b815481529060010190602001808311610c7257829003601f168201915b505050505081565b60025482906001600160a01b0316331480610cda5750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b610ce357600080fd5b82600081118015610d1457506000818152600560205260409020546002600019610100600184161502019091160415155b610d1d57600080fd5b83600360008211610d2d57600080fd5b60018110158015610d3f575060058111155b610d4857600080fd5b6000828152600b6020908152604080832084845290915290205460ff16151560011415610d7457600080fd5b6001600160a01b038516610d8757600080fd5b610d9386866003611d50565b60408051600181529051600080516020611f5b8339815191529181900360200190a1505050505050565b600581565b600381565b6002546001600160a01b03163314610dde57600080fd5b600081118015610e38575060066000527f13da86008ba1c6922daee3e07db95305ef49ebced9f5467a0b8613fcc6b343e36020527f819f6e146ede1b34d5e0ea50870a4b108df6f5b7c5231f9cb3a9bce47f553663548111155b610e4157600080fd5b60008181527f382f0c3b6e5d0b2411b8e0321a49f1716d3bd7946cfd3e5b8dbbcdf070a483d460205260408120610e7791611e78565b60408051600181529051600080516020611f5b8339815191529181900360200190a150565b60086020908152600093845260408085208252928452828420905282529020546001600160a01b031681565b600181565b600481565b600081565b60066020908152600091825260409182902080548351601f600260001961010060018616150201909316929092049182018490048402810184019094528084529091830182828015610c8f5780601f10610c6457610100808354040283529160200191610c8f565b60006060829050600181511015610f5a576000915050610f74565b805160209182012060009081526004909152604090205490505b919050565b600681565b600960209081526000938452604080852082529284528284208152908352918190208054825160026001831615610100026000190190921691909104601f810185900485028201850190935282815292909190830182828015610c8f5780601f10610c6457610100808354040283529160200191610c8f565b600760209081526000938452604080852082529284528284209052825290205460ff1681565b600281565b8260008111801561105357506000818152600560205260409020546002600019610100600184161502019091160415155b61105c57600080fd5b8151829061106957600080fd5b8351849061107657600080fd5b60008681526006602090815260409182902080548351601f600260001961010060018616150201909316929092049182018490048402810184019094528084526060939283018282801561110b5780601f106110e05761010080835404028352916020019161110b565b820191906000526020600020905b8154815290600101906020018083116110ee57829003601f168201915b5050505050905080516000148061112f575080805190602001208280519060200120145b61113857600080fd5b6002546001600160a01b03163314806111795750600087815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b806111ab5750600087815260076020908152604080832060028452825280832033845290915290205460ff1615156001145b6111b457600080fd5b600087815260066020908152604090912086516111d392880190611ebf565b5060408051600181529051600080516020611f5b8339815191529181900360200190a150505050505050565b60025482906001600160a01b03163314806112425750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b61124b57600080fd5b8260008111801561127c57506000818152600560205260409020546002600019610100600184161502019091160415155b61128557600080fd5b8360026000821161129557600080fd5b600181101580156112a7575060058111155b6112b057600080fd5b6000828152600b6020908152604080832084845290915290205460ff161515600114156112dc57600080fd5b6001600160a01b0385166112ef57600080fd5b610d9386866002611d50565b60025482906001600160a01b031633148061133e5750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b61134757600080fd5b816001811015801561135a575060058111155b61136357600080fd5b8360008111801561139457506000818152600560205260409020546002600019610100600184161502019091160415155b61139d57600080fd5b6000858152600b60209081526040808320878452825291829020805460ff1916600190811790915582519081529151600080516020611f5b8339815191529281900390910190a15050505050565b60025482906001600160a01b031633148061142e5750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b61143757600080fd5b8260008111801561146857506000818152600560205260409020546002600019610100600184161502019091160415155b61147157600080fd5b8360026000821161148157600080fd5b60018110158015611493575060058111155b61149c57600080fd5b6000828152600b6020908152604080832084845290915290205460ff161515600114156114c857600080fd5b6001600160a01b0385166114db57600080fd5b610d9386866002611d87565b60046020526000908152604090205481565b6002546001600160a01b0316331461151057600080fd5b8051819061151d57600080fd5b8051602080830191909120600081815260049092526040909120541561154257600080fd5b6003805460010190819055600082815260046020908152604080832084905592825260058152919020845161157992860190611ebf565b5060408051600181529051600080516020611f5b8339815191529181900360200190a1505050565b60018054604080516020600284861615610100026000190190941693909304601f81018490048402820184019092528181529291830182828015610c8f5780601f10610c6457610100808354040283529160200191610c8f565b6002546001600160a01b0316331461161257600080fd5b8051611625906000906020840190611ebf565b5060408051600181529051600080516020611f5b8339815191529181900360200190a150565b6002546001600160a01b031681565b600b60209081526000928352604080842090915290825290205460ff1681565b60056020908152600091825260409182902080548351601f600260001961010060018616150201909316929092049182018490048402810184019094528084529091830182828015610c8f5780601f10610c6457610100808354040283529160200191610c8f565b60025482906001600160a01b03163314806117255750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b61172e57600080fd5b8260008111801561175f57506000818152600560205260409020546002600019610100600184161502019091160415155b61176857600080fd5b8360036000821161177857600080fd5b6001811015801561178a575060058111155b61179357600080fd5b6000828152600b6020908152604080832084845290915290205460ff161515600114156117bf57600080fd5b6001600160a01b0385166117d257600080fd5b610d9386866003611d87565b600a60209081526000928352604080842090915290825290205481565b6002546001600160a01b0316331461181257600080fd5b8160008111801561184357506000818152600560205260409020546002600019610100600184161502019091160415155b61184c57600080fd5b8260016000821161185c57600080fd5b6001811015801561186e575060058111155b61187757600080fd5b6000828152600b6020908152604080832084845290915290205460ff161515600114156118a357600080fd5b6001600160a01b0384166118b657600080fd5b6118c285856001611d50565b60408051600181529051600080516020611f5b8339815191529181900360200190a15050505050565b60035481565b6002546001600160a01b0316331461190857600080fd5b8160008111801561193957506000818152600560205260409020546002600019610100600184161502019091160415155b61194257600080fd5b8260016000821161195257600080fd5b60018110158015611964575060058111155b61196d57600080fd5b6000828152600b6020908152604080832084845290915290205460ff1615156001141561199957600080fd5b6001600160a01b0384166119ac57600080fd5b6118c285856001611d87565b816000811180156119e957506000818152600560205260409020546002600019610100600184161502019091160415155b6119f257600080fd5b6000825111611a0057600080fd5b6002546001600160a01b0316331480611a415750600083815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b80611a735750600083815260076020908152604080832060028452825280832033845290915290205460ff1615156001145b80611aa55750600083815260076020908152604080832060038452825280832033845290915290205460ff1615156001145b15611ae8576000838152600b602090815260408083206004845290915290205460ff16151560011415611ad757600080fd5b611ae383836004611e10565b611b21565b6000838152600b602090815260408083206005845290915290205460ff16151560011415611b1557600080fd5b611b2183836005611e10565b60408051600181529051600080516020611f5b8339815191529181900360200190a1505050565b6002546001600160a01b03163314611b5f57600080fd5b6000815111611b6d57600080fd5b610e776000826006611e10565b60025482906001600160a01b0316331480611bbd5750600081815260076020908152604080832060018085529083528184203385529092529091205460ff161515145b611bc657600080fd5b8160018110158015611bd9575060058111155b611be257600080fd5b83600081118015611c1357506000818152600560205260409020546002600019610100600184161502019091160415155b611c1c57600080fd5b6000858152600b60209081526040808320878452825291829020805460ff191690558151600181529151600080516020611f5b8339815191529281900390910190a15050505050565b6002546001600160a01b03163314611c7c57600080fd5b80518190611c8957600080fd5b6000611c9484610f3f565b905060008111611ca357600080fd5b83516020808601919091208351848301206000828152600484526040808220829055858252600585529020865192939192611ce092880190611ebf565b506000818152600460209081526040918290208590558151600181529151600080516020611f5b8339815191529281900390910190a1505050505050565b6002546001600160a01b03163314611d3557600080fd5b8051611625906001906020840190611ebf565b637858947c81565b60009283526007602090815260408085209285529181528184206001600160a01b039093168452919091529020805460ff19169055565b600083815260076020908152604080832084845282528083206001600160a01b03909516808452948252808320805460ff19166001908117909155868452600a835281842085855280845282852080549886526008855283862087875285528386209890920180865297845291842080546001600160a01b031916909617909555929091525255565b6000838152600a60209081526040808320848452825280832054868452600983528184208585528352818420600190910180855290835292208451611e5792860190611ebf565b506000938452600a6020908152604080862093865292905292209190915550565b50805460018160011615610100020316600290046000825580601f10611e9e5750611ebc565b601f016020900490600052602060002090810190611ebc9190611f3d565b50565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f10611f0057805160ff1916838001178555611f2d565b82800160010185558215611f2d579182015b82811115611f2d578251825591602001919060010190611f12565b50611f39929150611f3d565b5090565b611f5791905b80821115611f395760008155600101611f43565b9056fe3b0a8ddef325df2bfdfa6b430ae4c8421841cd135bfa8fb5e432f200787520bba165627a7a723058207b85622631c711b93e8acac0232a8bfbeb7e5548ebbdbfb54bf635678ae72db50029";
}
