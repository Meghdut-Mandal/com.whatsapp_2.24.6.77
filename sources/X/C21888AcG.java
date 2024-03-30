package X;

import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: X.AcG  reason: case insensitive filesystem */
public final class C21888AcG extends AbstractList<C21671AUq> implements RandomAccess {
    public static final C198369dR A02 = new C198369dR();
    public final int[] A00;
    public final C21671AUq[] A01;

    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof C21671AUq)) {
            return super.contains(obj);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ Object get(int i) {
        return this.A01[i];
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null || (obj instanceof C21671AUq)) {
            return super.indexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null || (obj instanceof C21671AUq)) {
            return super.lastIndexOf(obj);
        }
        return -1;
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof C21671AUq)) {
            return super.remove(obj);
        }
        return false;
    }

    public final /* bridge */ int size() {
        return this.A01.length;
    }

    public C21888AcG(int[] iArr, C21671AUq[] aUqArr) {
        this.A01 = aUqArr;
        this.A00 = iArr;
    }
}
