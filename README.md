Block chaned list code written with java 
Attemp to Java Collection implementation for conceptual Block Chain.
test is the main programme

for example : 
	the code is : 
		BlockChainList<String> bCList = new BlockChainList<String>(5);
		bCList.add("Block1 Data");
		System.out.println("Added 1");
		bCList.add("Block2 Data");
		System.out.println("Added 2");
		bCList.add("Block3 Data");
		System.out.println("Added 3");

	outpute
    Adding blocks to list...
    Block Mined!!! : Curr: 000000222fa6a57e499011c543ef4d436cc7f63a3148ce7e72afec290da14899 Prev: 0 nonce : 3175611
    Added 1
    Block Mined!!! : Curr: 0000021782191b32061bd5210e8176db55d09990e4f296039f9b8d64be5f3933 Prev: 000000222fa6a57e499011c543ef4d436cc7f63a3148ce7e72afec290da14899 nonce : 922002
    Added 2
    Block Mined!!! : Curr: 0000097a62d1392a73e1ea064ff89b665e84f5fb7b7a8b81932846d7ba82c6a7 Prev: 0000021782191b32061bd5210e8176db55d09990e4f296039f9b8d64be5f3933 nonce : 59768
    Added 3
    Block Mined!!! : Curr: 00000e077f27def5ca15c5ba98f87176b62bf7e22ef099ea42cda6db038630a1 Prev: 0000097a62d1392a73e1ea064ff89b665e84f5fb7b7a8b81932846d7ba82c6a7 nonce : 2313843
