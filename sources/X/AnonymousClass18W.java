package X;

/* renamed from: X.18W  reason: invalid class name */
public final class AnonymousClass18W<E> extends C20760y7<E> {
    public static final AnonymousClass18W EMPTY;
    public static final Object[] EMPTY_ARRAY;
    public final transient Object[] elements;
    public final transient int hashCode;
    public final transient int mask;
    public final transient int size;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new AnonymousClass18W(objArr, 0, objArr, 0, 0);
    }

    public int internalArrayStart() {
        return 0;
    }

    public boolean isHashCodeFast() {
        return true;
    }

    public boolean isPartialView() {
        return false;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.table;
        if (obj != null && objArr.length != 0) {
            int smearedHash = C20770y8.smearedHash(obj);
            while (true) {
                int i = smearedHash & this.mask;
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    break;
                } else if (obj2.equals(obj)) {
                    return true;
                } else {
                    smearedHash = i + 1;
                }
            }
        }
        return false;
    }

    public int copyIntoArray(Object[] objArr, int i) {
        System.arraycopy(this.elements, 0, objArr, i, this.size);
        return i + this.size;
    }

    public C23931Ak createAsList() {
        return C23931Ak.asImmutableList(this.elements, this.size);
    }

    public AnonymousClass18W(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    public int hashCode() {
        return this.hashCode;
    }

    public Object[] internalArray() {
        return this.elements;
    }

    public int internalArrayEnd() {
        return this.size;
    }

    public C225614x iterator() {
        return asList().iterator();
    }

    public int size() {
        return this.size;
    }
}
