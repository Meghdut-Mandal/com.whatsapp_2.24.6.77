package X;

import java.util.Iterator;

/* renamed from: X.76R  reason: invalid class name */
public final class AnonymousClass76R implements Iterator, AnonymousClass00W {
    public int A00;
    public final /* synthetic */ C1506876f A01;

    public AnonymousClass76R(C1506876f r1) {
        this.A01 = r1;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.size());
    }

    public Object next() {
        Object[] objArr = this.A01.A01;
        int i = this.A00;
        this.A00 = i + 1;
        return C90524aI.A0d(objArr, i);
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
