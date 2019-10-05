package blocklist.utils;

import java.util.RandomAccess;

public class BlockChainList<E> extends AbstractBlockChain<E>
    implements BlockChain<E>, RandomAccess, Cloneable, java.io.Serializable{

	private int nonce 								= 5;
	private static final String INITIAL_HASH_VALUE	= "0";
	private static final long serialVersionUID 		= 37798004195996572L;
	
	public BlockChainList(int nonce){
		this.nonce = nonce;
	}
	
	public boolean add(E data){
		String previousHashValue 	= (!baseList.isEmpty()) ? baseList.get(baseList.size()-1).getCurrentHashValue() : BlockChainList.INITIAL_HASH_VALUE;
		Block<E> block 				= new Block<E>(data, previousHashValue).mineBlock(this.nonce);
		return add(block);
	} 
	
	public Boolean isChainValid(){
		Block<E> currentBlock; 
		Block<E> previousBlock;
		String hashTarget = new String(new char[this.nonce]).replace('\0', '0');
		for(int i = 1; i < baseList.size(); i++) {
			currentBlock 	= baseList.get(i);
			previousBlock 	= baseList.get(i-1);
			if(!currentBlock.getCurrentHashValue().equals(currentBlock.calculateHash()) ){
				return false;
			}
			if(!previousBlock.getCurrentHashValue().equals(currentBlock.getPreviousHashValue())){
				System.out.println("Previous Hashes not equal");
				return false;
			}
			if(!currentBlock.getCurrentHashValue().substring( 0, this.nonce).equals(hashTarget)){
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
}