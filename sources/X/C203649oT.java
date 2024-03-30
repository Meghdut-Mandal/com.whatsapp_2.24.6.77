package X;

import java.util.Arrays;

/* renamed from: X.9oT  reason: invalid class name and case insensitive filesystem */
public class C203649oT {
    public transient long[] entries;
    public transient Object[] keys;
    public transient float loadFactor;
    public transient int modCount;
    public transient int size;
    public transient int[] table;
    public transient int threshold;
    public transient int[] values;

    public C203649oT(int i, float f) {
        init(3, 1.0f);
    }

    public static int getNext(long j) {
        return (int) j;
    }

    public static long[] newEntries(int i) {
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public void init(int i, float f) {
        int closedTableSize = C20770y8.closedTableSize(3, (double) 1.0f);
        this.table = newTable(closedTableSize);
        this.loadFactor = 1.0f;
        this.keys = new Object[3];
        this.values = new int[3];
        this.entries = newEntries(3);
        this.threshold = Math.max(1, (int) (((float) closedTableSize) * 1.0f));
    }

    public int nextIndexAfterRemove(int i, int i2) {
        return i - 1;
    }

    private int hashTableMask() {
        return this.table.length - 1;
    }

    public static int[] newTable(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void resizeMeMaybe(int i) {
        int length = this.entries.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            } else if (max == length) {
                return;
            }
            resizeEntries(max);
        }
    }

    private void resizeTable(int i) {
        if (this.table.length >= 1073741824) {
            this.threshold = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.loadFactor)) + 1;
        int[] newTable = newTable(i);
        long[] jArr = this.entries;
        int length = newTable.length - 1;
        for (int i3 = 0; i3 < this.size; i3++) {
            int hash = getHash(jArr[i3]);
            int i4 = hash & length;
            int i5 = newTable[i4];
            newTable[i4] = i3;
            jArr[i3] = (((long) hash) << 32) | (((long) i5) & 4294967295L);
        }
        this.threshold = i2;
        this.table = newTable;
    }

    public void clear() {
        this.modCount++;
        Arrays.fill(this.keys, 0, this.size, (Object) null);
        Arrays.fill(this.values, 0, this.size, 0);
        Arrays.fill(this.table, -1);
        Arrays.fill(this.entries, -1);
        this.size = 0;
    }

    public int firstIndex() {
        if (this.size == 0) {
            return -1;
        }
        return 0;
    }

    public AnonymousClass9Y5 getEntry(int i) {
        C20740y5.A01(i, this.size);
        return new C170818Hp(this, i);
    }

    public Object getKey(int i) {
        C20740y5.A01(i, this.size);
        return this.keys[i];
    }

    public int getValue(int i) {
        C20740y5.A01(i, this.size);
        return this.values[i];
    }

    public void insertEntry(int i, Object obj, int i2, int i3) {
        this.entries[i] = (((long) i3) << 32) | 4294967295L;
        this.keys[i] = obj;
        this.values[i] = i2;
    }

    public int nextIndex(int i) {
        int i2 = i + 1;
        if (i2 >= this.size) {
            return -1;
        }
        return i2;
    }

    public int put(Object obj, int i) {
        C20080wz.checkPositive(i, "count");
        long[] jArr = this.entries;
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int smearedHash = C20770y8.smearedHash(obj);
        int hashTableMask = hashTableMask() & smearedHash;
        int i2 = this.size;
        int[] iArr2 = this.table;
        int i3 = iArr2[hashTableMask];
        if (i3 == -1) {
            iArr2[hashTableMask] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (getHash(j) != smearedHash || !C1897595l.A00(obj, objArr[i3])) {
                    int next = getNext(j);
                    if (next == -1) {
                        jArr[i3] = swapNext(j, i2);
                        break;
                    }
                    i3 = next;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            resizeMeMaybe(i5);
            insertEntry(i2, obj, i, smearedHash);
            this.size = i5;
            if (i2 >= this.threshold) {
                resizeTable(this.table.length * 2);
            }
            this.modCount++;
            return 0;
        }
        throw AnonymousClass001.A09("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    public int removeEntry(int i) {
        return remove(this.keys[i], getHash(this.entries[i]));
    }

    public void resizeEntries(int i) {
        this.keys = Arrays.copyOf(this.keys, i);
        this.values = Arrays.copyOf(this.values, i);
        long[] jArr = this.entries;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.entries = copyOf;
    }

    public void setValue(int i, int i2) {
        C20740y5.A01(i, this.size);
        this.values[i] = i2;
    }

    public static int getHash(long j) {
        return C90514aH.A0D(j);
    }

    private int remove(Object obj, int i) {
        int hashTableMask = hashTableMask() & i;
        int i2 = this.table[hashTableMask];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (getHash(this.entries[i2]) != i || !C1897595l.A00(obj, this.keys[i2])) {
                    int next = getNext(this.entries[i2]);
                    if (next == -1) {
                        break;
                    }
                    i3 = i2;
                    i2 = next;
                } else {
                    int i4 = this.values[i2];
                    if (i3 == -1) {
                        this.table[hashTableMask] = getNext(this.entries[i2]);
                    } else {
                        long[] jArr = this.entries;
                        jArr[i3] = swapNext(jArr[i3], getNext(jArr[i2]));
                    }
                    moveLastEntry(i2);
                    this.size--;
                    this.modCount++;
                    return i4;
                }
            }
        }
        return 0;
    }

    public int get(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return 0;
        }
        return this.values[indexOf];
    }

    public int indexOf(Object obj) {
        int smearedHash = C20770y8.smearedHash(obj);
        int i = this.table[hashTableMask() & smearedHash];
        while (i != -1) {
            long j = this.entries[i];
            if (getHash(j) == smearedHash && C1897595l.A00(obj, this.keys[i])) {
                return i;
            }
            i = getNext(j);
        }
        return -1;
    }

    public void moveLastEntry(int i) {
        int size2 = size() - 1;
        if (i < size2) {
            Object[] objArr = this.keys;
            objArr[i] = objArr[size2];
            int[] iArr = this.values;
            iArr[i] = iArr[size2];
            objArr[size2] = null;
            iArr[size2] = 0;
            long[] jArr = this.entries;
            long j = jArr[size2];
            jArr[i] = j;
            jArr[size2] = -1;
            int hash = getHash(j) & hashTableMask();
            int[] iArr2 = this.table;
            int i2 = iArr2[hash];
            if (i2 == size2) {
                iArr2[hash] = i;
                return;
            }
            while (true) {
                long j2 = jArr[i2];
                int next = getNext(j2);
                if (next == size2) {
                    jArr[i2] = swapNext(j2, i);
                    return;
                }
                i2 = next;
            }
        } else {
            this.keys[i] = null;
            this.values[i] = 0;
            this.entries[i] = -1;
        }
    }

    public int size() {
        return this.size;
    }

    public static long swapNext(long j, int i) {
        return (j & -4294967296L) | C165597tg.A0C(i);
    }

    public C203649oT(int i) {
        this(3, 1.0f);
    }

    public C203649oT() {
        init(3, 1.0f);
    }
}
