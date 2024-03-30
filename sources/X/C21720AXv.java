package X;

import java.util.Iterator;

/* renamed from: X.AXv  reason: case insensitive filesystem */
public final class C21720AXv implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C21885AcB A01;

    public C21720AXv(C21885AcB acB) {
        this.A01 = acB;
        this.A00 = acB.A00.iterator();
    }

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
