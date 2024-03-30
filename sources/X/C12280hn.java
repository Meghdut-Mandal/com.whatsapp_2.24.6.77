package X;

import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: X.0hn  reason: invalid class name and case insensitive filesystem */
public final class C12280hn implements Iterator, AnonymousClass00W {
    public final /* synthetic */ Enumeration A00;

    public C12280hn(Enumeration enumeration) {
        this.A00 = enumeration;
    }

    public boolean hasNext() {
        return this.A00.hasMoreElements();
    }

    public Object next() {
        return this.A00.nextElement();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
