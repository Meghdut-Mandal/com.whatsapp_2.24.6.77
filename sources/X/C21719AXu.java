package X;

import java.util.Iterator;

/* renamed from: X.AXu  reason: case insensitive filesystem */
public final class C21719AXu implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C21883Ac9 A01;

    public final boolean hasNext() {
        return this.A00.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.A00.next();
    }

    public C21719AXu(C21883Ac9 ac9) {
        this.A01 = ac9;
        this.A00 = ac9.A00.iterator();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
