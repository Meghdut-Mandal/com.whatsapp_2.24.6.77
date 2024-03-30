package X;

import java.util.Arrays;

/* renamed from: X.9ny  reason: invalid class name and case insensitive filesystem */
public abstract class C203409ny {
    public static Object createTable(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw AnonymousClass000.A0d("must be power of 2 between 2^1 and 2^30: ", C90524aI.A0h(52), i);
        } else if (i <= 256) {
            return new byte[i];
        } else {
            if (i <= 65536) {
                return new short[i];
            }
            return new int[i];
        }
    }

    public static int getHashPrefix(int i, int i2) {
        return i & (~i2);
    }

    public static int getNext(int i, int i2) {
        return i & i2;
    }

    public static int maskCombine(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static int newCapacity(int i) {
        int i2 = 2;
        if (i < 32) {
            i2 = 4;
        }
        return i2 * (i + 1);
    }

    public static void tableClear(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int tableGet(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i] & 65535;
        }
        return ((int[]) obj)[i];
    }

    public static void tableSet(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static int tableSize(int i) {
        return Math.max(4, C20770y8.closedTableSize(i + 1, 1.0d));
    }

    public static int remove(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int smearedHash = C20770y8.smearedHash(obj);
        int i4 = smearedHash & i;
        int tableGet = tableGet(obj3, i4);
        if (tableGet != 0) {
            int hashPrefix = getHashPrefix(smearedHash, i);
            int i5 = -1;
            while (true) {
                i2 = tableGet - 1;
                i3 = iArr[i2];
                if (getHashPrefix(i3, i) != hashPrefix || !C1897595l.A00(obj, objArr[i2]) || (objArr2 != null && !C1897595l.A00(obj2, objArr2[i2]))) {
                    tableGet = getNext(i3, i);
                    if (tableGet == 0) {
                        break;
                    }
                    i5 = i2;
                }
            }
            int next = getNext(i3, i);
            if (i5 == -1) {
                tableSet(obj3, i4, next);
                return i2;
            }
            iArr[i5] = maskCombine(iArr[i5], next, i);
            return i2;
        }
        return -1;
    }
}
