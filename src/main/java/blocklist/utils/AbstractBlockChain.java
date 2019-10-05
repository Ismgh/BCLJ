package blocklist.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class AbstractBlockChain<E> implements BlockChain<E> {
	protected ArrayList<Block<E>> baseList = new ArrayList<Block<E>>();
	
	protected AbstractBlockChain(){
	}
	
	public boolean add(Block<E> block){
		baseList.add(block);
		return true;
	}


	public Block<E> get(int index){
		return baseList.get(index);
	}

	
	public E set(int index, E element){
		throw new UnsupportedOperationException();
	}

	
	public void add(int index, Block<E> element){
		throw new UnsupportedOperationException();
	}

	
	public E remove(int index){
		throw new UnsupportedOperationException();
	}


	public int indexOf(Block<E> block){
		return baseList.indexOf(block);
	}

	
	public int lastIndexOf(Block<E> block){
		return baseList.lastIndexOf(block);
	}


	public void clear(){
		baseList.clear();
	}

	
	public boolean addAll(int index, Collection<Block<E>> blockCollection){
		return baseList.addAll(index,  blockCollection);
	}


	// Iterators
	public Iterator<Block<E>> iterator(){
		return baseList.iterator();
	}

	
	public ListIterator<Block<E>> listIterator(){
		return baseList.listIterator();
	}

	
	public ListIterator<Block<E>> listIterator(final int index){
		return baseList.listIterator(index);
	}

	public List<Block<E>> subList(int fromIndex, int toIndex){
		return baseList.subList(fromIndex, toIndex);
	}

	// Comparison and hashing
	public boolean equals(Object o){
		return baseList.equals(o); 
	}

	
	public int hashCode(){
		return baseList.hashCode();
	}

	protected transient int modCount = 0;
}