package X;

import java.util.Iterator;

/* renamed from: X.0hr  reason: invalid class name and case insensitive filesystem */
public final class C12320hr implements Iterator, AnonymousClass00W {
    public final Iterator A00;
    public final /* synthetic */ C12790if A01;

    public C12320hr(C12790if r2) {
        this.A01 = r2;
        this.A00 = r2.A01.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public Object next() {
        return this.A01.A00.invoke(this.A00.next());
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
