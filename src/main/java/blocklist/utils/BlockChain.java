package blocklist.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface BlockChain<E>{
	public boolean add(Block<E> block);

	public Block<E> get(int index);

	public E set(int index, E element);

	public void add(int index, Block<E> element);

	public E remove(int index);

	public int indexOf(Block<E> block);

	public int lastIndexOf(Block<E> block);

	public void clear();

	public boolean addAll(int index, Collection<Block<E>> blockCollection);

	public Iterator<Block<E>> iterator();

	public ListIterator<Block<E>> listIterator();

	public ListIterator<Block<E>> listIterator(final int index);

	public List<Block<E>> subList(int fromIndex, int toIndex);

	public boolean equals(Object o);

	public int hashCode();
}
