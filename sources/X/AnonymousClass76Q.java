package X;

import java.util.Iterator;

/* renamed from: X.76Q  reason: invalid class name */
public final class AnonymousClass76Q implements Iterator, AnonymousClass00W {
    public final Iterator A00;

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public AnonymousClass76Q(C94674ib r2) {
        this.A00 = r2.A08.iterator();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
