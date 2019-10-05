package blocklist.utils;

import java.util.Date;

public final class Block<E>{
	private String currentHashValue;
	private String previousHashValue;
	private long timeStamp;
	private E data;
	private int nonce;
	
	public Block(E data, String previousHashValue){
		super();
		this.data 				= data;
		this.previousHashValue 	= previousHashValue;
		this.timeStamp 			= new Date().getTime();
		this.currentHashValue 	= calculateHash();
	}
	
	public String calculateHash() {
		return HashUtil.calculateHashValue(this.previousHashValue + Long.toString(this.timeStamp) + Integer.toString(this.nonce) +this.data.toString());
	}
	
	public Block<E> mineBlock(int difficulty) {
		String target = new String(new char[difficulty]).replace('\0', '0'); 
		while(!currentHashValue.substring(0, difficulty).equals(target)){
			this.nonce ++;
			currentHashValue = calculateHash();
//			if(currentHashValue.length() < nonce) {
//				break;
//			}
		}
		System.out.println("Block Mined!!! : Curr: " + currentHashValue + " Prev: " + previousHashValue + " nonce : "+ this.nonce);
		return this;
	}

	public String getCurrentHashValue() {
		return currentHashValue;
	}

	public void setCurrentHashValue(String currentHashValue) {
		this.currentHashValue = currentHashValue;
	}

	public String getPreviousHashValue() {
		return previousHashValue;
	}

	public void setPreviousHashValue(String previousHashValue) {
		this.previousHashValue = previousHashValue;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
}