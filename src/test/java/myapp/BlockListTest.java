package myapp;

import blocklist.utils.BlockChainList;

public class BlockListTest {
	public static void main(String[] arg){
		System.out.println("Adding blocks to list...");
		BlockChainList<String> bCList = new BlockChainList<String>(5);
		bCList.add("Block1 Data");
		System.out.println("Added 1");
		bCList.add("Block2 Data");
		System.out.println("Added 2");
		bCList.add("Block3 Data");
		System.out.println("Added 3");
		bCList.add("Block4 Data");
		System.out.println("Added 4");
		
		System.out.println("Is Chain Valid? : "+bCList.isChainValid());
		
		//Tampering
		bCList.get(2).setData("Something else");
		
		System.out.println("Is Chain Valid after Tampering? : "+bCList.isChainValid());
	}
}
