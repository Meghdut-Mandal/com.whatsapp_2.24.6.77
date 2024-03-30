package X;

import java.util.Iterator;

/* renamed from: X.AXz  reason: case insensitive filesystem */
public class C21722AXz implements Iterator {
    public Iterator A00;
    public final /* synthetic */ C21887AcF A01;

    public C21722AXz(C21887AcF acF) {
        this.A01 = acF;
        this.A00 = acF.A00.iterator();
    }

    public boolean hasNext() {
        return this.A00.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        return this.A00.next();
    }

    public void remove() {
        throw AnonymousClass001.A0D();
    }
}
