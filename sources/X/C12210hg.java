package X;

import java.util.Iterator;

/* renamed from: X.0hg  reason: invalid class name and case insensitive filesystem */
public final class C12210hg implements Iterator {
    public final Iterator A00;
    public final /* synthetic */ C13340ji A01;

    public C12210hg(C13340ji r2) {
        this.A01 = r2;
        this.A00 = r2.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
