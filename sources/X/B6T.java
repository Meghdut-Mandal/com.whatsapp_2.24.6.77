package X;

import java.util.Collection;
import java.util.Set;

public interface B6T<E> extends Collection<E> {
    int add(Object obj, int i);

    boolean add(Object obj);

    boolean contains(Object obj);

    boolean containsAll(Collection collection);

    int count(Object obj);

    Set elementSet();

    Set entrySet();

    int remove(Object obj, int i);

    boolean remove(Object obj);

    boolean setCount(Object obj, int i, int i2);

    int size();
}
