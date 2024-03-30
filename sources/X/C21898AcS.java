package X;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.AcS  reason: case insensitive filesystem */
public class C21898AcS<E> extends AbstractSet<E> implements Serializable {
    public transient Object[] elements;
    public transient int[] entries;
    public transient int metadata;
    public transient int size;
    public transient Object table;

    public int adjustAfterRemove(int i, int i2) {
        return i - 1;
    }

    public void init(int i) {
        this.metadata = Math.min(Math.max(i, 1), 1073741823);
    }

    public void insertEntry(int i, Object obj, int i2, int i3) {
        setEntry(i, C203409ny.maskCombine(i2, 0, i3));
        setElement(i, obj);
    }

    public static C21898AcS create() {
        return new C21898AcS();
    }

    private Set createHashFloodingResistantDelegate(int i) {
        return new LinkedHashSet(i, 1.0f);
    }

    private int hashTableMask() {
        return (1 << (this.metadata & 31)) - 1;
    }

    private Object[] requireElements() {
        Object[] objArr = this.elements;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private int[] requireEntries() {
        int[] iArr = this.entries;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private Object requireTable() {
        Object obj = this.table;
        Objects.requireNonNull(obj);
        return obj;
    }

    public Set delegateOrNull() {
        Object obj = this.table;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int getSuccessor(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            return -1;
        }
        return i2;
    }

    public void incrementModCount() {
        this.metadata += 32;
    }

    public boolean needsAllocArrays() {
        return AnonymousClass000.A1W(this.table);
    }

    public C21898AcS() {
        init(3);
    }

    /* access modifiers changed from: private */
    public Object element(int i) {
        return requireElements()[i];
    }

    private int entry(int i) {
        return requireEntries()[i];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt >= 0) {
            init(readInt);
            for (int i = 0; i < readInt; i++) {
                add(objectInputStream.readObject());
            }
            return;
        }
        throw new InvalidObjectException(AnonymousClass000.A0r("Invalid size: ", C90524aI.A0h(25), readInt));
    }

    private void resizeMeMaybe(int i) {
        int min;
        int length = requireEntries().length;
        if (i > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            resizeEntries(min);
        }
    }

    private int resizeTable(int i, int i2, int i3, int i4) {
        Object createTable = C203409ny.createTable(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            C203409ny.tableSet(createTable, i3 & i5, i4 + 1);
        }
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        for (int i6 = 0; i6 <= i; i6++) {
            int tableGet = C203409ny.tableGet(requireTable, i6);
            while (tableGet != 0) {
                int i7 = tableGet - 1;
                int i8 = requireEntries[i7];
                int hashPrefix = C203409ny.getHashPrefix(i8, i) | i6;
                int i9 = hashPrefix & i5;
                int tableGet2 = C203409ny.tableGet(createTable, i9);
                C203409ny.tableSet(createTable, i9, tableGet);
                requireEntries[i7] = C203409ny.maskCombine(hashPrefix, tableGet2, i5);
                tableGet = C203409ny.getNext(i8, i);
            }
        }
        this.table = createTable;
        setHashTableMask(i5);
        return i5;
    }

    private void setElement(int i, Object obj) {
        requireElements()[i] = obj;
    }

    private void setEntry(int i, int i2) {
        requireEntries()[i] = i2;
    }

    private void setHashTableMask(int i) {
        this.metadata = C203409ny.maskCombine(this.metadata, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public boolean add(Object obj) {
        if (needsAllocArrays()) {
            allocArrays();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull == null) {
            int[] requireEntries = requireEntries();
            Object[] requireElements = requireElements();
            int i = this.size;
            int i2 = i + 1;
            int smearedHash = C20770y8.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int i3 = smearedHash & hashTableMask;
            int tableGet = C203409ny.tableGet(requireTable(), i3);
            if (tableGet == 0) {
                if (i2 <= hashTableMask) {
                    C203409ny.tableSet(requireTable(), i3, i2);
                }
                hashTableMask = resizeTable(hashTableMask, C203409ny.newCapacity(hashTableMask), smearedHash, i);
            } else {
                int hashPrefix = C203409ny.getHashPrefix(smearedHash, hashTableMask);
                int i4 = 0;
                while (true) {
                    int i5 = tableGet - 1;
                    int i6 = requireEntries[i5];
                    if (C203409ny.getHashPrefix(i6, hashTableMask) == hashPrefix && C1897595l.A00(obj, requireElements[i5])) {
                        return false;
                    }
                    int next = C203409ny.getNext(i6, hashTableMask);
                    i4++;
                    if (next != 0) {
                        tableGet = next;
                    } else if (i4 >= 9) {
                        delegateOrNull = convertToHashFloodingResistantImplementation();
                    } else if (i2 <= hashTableMask) {
                        requireEntries[i5] = C203409ny.maskCombine(i6, i2, hashTableMask);
                    }
                }
                hashTableMask = resizeTable(hashTableMask, C203409ny.newCapacity(hashTableMask), smearedHash, i);
            }
            resizeMeMaybe(i2);
            insertEntry(i, obj, smearedHash, hashTableMask);
            this.size = i2;
            incrementModCount();
            return true;
        }
        return delegateOrNull.add(obj);
    }

    public int allocArrays() {
        if (needsAllocArrays()) {
            int i = this.metadata;
            int tableSize = C203409ny.tableSize(i);
            this.table = C203409ny.createTable(tableSize);
            setHashTableMask(tableSize - 1);
            this.entries = new int[i];
            this.elements = new Object[i];
            return i;
        }
        throw AnonymousClass001.A09(String.valueOf("Arrays already allocated"));
    }

    public void clear() {
        if (!needsAllocArrays()) {
            incrementModCount();
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                this.metadata = Math.min(Math.max(size(), 3), 1073741823);
                delegateOrNull.clear();
                this.table = null;
            } else {
                Arrays.fill(requireElements(), 0, this.size, (Object) null);
                C203409ny.tableClear(requireTable());
                Arrays.fill(requireEntries(), 0, this.size, 0);
            }
            this.size = 0;
        }
    }

    public boolean contains(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            if (delegateOrNull != null) {
                return delegateOrNull.contains(obj);
            }
            int smearedHash = C20770y8.smearedHash(obj);
            int hashTableMask = hashTableMask();
            int tableGet = C203409ny.tableGet(requireTable(), smearedHash & hashTableMask);
            if (tableGet != 0) {
                int hashPrefix = C203409ny.getHashPrefix(smearedHash, hashTableMask);
                do {
                    int i = tableGet - 1;
                    int entry = entry(i);
                    if (C203409ny.getHashPrefix(entry, hashTableMask) == hashPrefix && C1897595l.A00(obj, element(i))) {
                        return true;
                    }
                    tableGet = C203409ny.getNext(entry, hashTableMask);
                } while (tableGet != 0);
            }
        }
        return false;
    }

    public Set convertToHashFloodingResistantImplementation() {
        Set createHashFloodingResistantDelegate = createHashFloodingResistantDelegate(hashTableMask() + 1);
        int firstEntryIndex = firstEntryIndex();
        while (firstEntryIndex >= 0) {
            createHashFloodingResistantDelegate.add(element(firstEntryIndex));
            firstEntryIndex = getSuccessor(firstEntryIndex);
        }
        this.table = createHashFloodingResistantDelegate;
        this.entries = null;
        this.elements = null;
        incrementModCount();
        return createHashFloodingResistantDelegate;
    }

    public int firstEntryIndex() {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public boolean isEmpty() {
        return AnonymousClass000.A1Q(size());
    }

    public Iterator iterator() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.iterator();
        }
        return new AYA(this);
    }

    public void moveLastEntry(int i, int i2) {
        int i3;
        int i4;
        Object requireTable = requireTable();
        int[] requireEntries = requireEntries();
        Object[] requireElements = requireElements();
        int size2 = size() - 1;
        if (i < size2) {
            Object obj = requireElements[size2];
            requireElements[i] = obj;
            requireElements[size2] = null;
            requireEntries[i] = requireEntries[size2];
            requireEntries[size2] = 0;
            int smearedHash = C20770y8.smearedHash(obj) & i2;
            int tableGet = C203409ny.tableGet(requireTable, smearedHash);
            int i5 = size2 + 1;
            if (tableGet == i5) {
                C203409ny.tableSet(requireTable, smearedHash, i + 1);
                return;
            }
            do {
                i3 = tableGet - 1;
                i4 = requireEntries[i3];
                tableGet = C203409ny.getNext(i4, i2);
            } while (tableGet != i5);
            requireEntries[i3] = C203409ny.maskCombine(i4, i + 1, i2);
            return;
        }
        requireElements[i] = null;
        requireEntries[i] = 0;
    }

    public boolean remove(Object obj) {
        if (!needsAllocArrays()) {
            Set delegateOrNull = delegateOrNull();
            Object obj2 = obj;
            if (delegateOrNull != null) {
                return delegateOrNull.remove(obj);
            }
            int hashTableMask = hashTableMask();
            int remove = C203409ny.remove(obj2, (Object) null, hashTableMask, requireTable(), requireEntries(), requireElements(), (Object[]) null);
            if (remove != -1) {
                moveLastEntry(remove, hashTableMask);
                this.size--;
                incrementModCount();
                return true;
            }
        }
        return false;
    }

    public void resizeEntries(int i) {
        this.entries = Arrays.copyOf(requireEntries(), i);
        this.elements = Arrays.copyOf(requireElements(), i);
    }

    public int size() {
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.size();
        }
        return this.size;
    }

    public Object[] toArray(Object[] objArr) {
        if (needsAllocArrays()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray(objArr);
        }
        return C23921Aj.toArrayImpl(requireElements(), 0, this.size, objArr);
    }

    public Object[] toArray() {
        if (needsAllocArrays()) {
            return C90524aI.A0w();
        }
        Set delegateOrNull = delegateOrNull();
        if (delegateOrNull != null) {
            return delegateOrNull.toArray();
        }
        return Arrays.copyOf(requireElements(), this.size);
    }
}
