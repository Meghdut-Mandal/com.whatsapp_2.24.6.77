package X;

import java.util.Iterator;

/* renamed from: X.0hp  reason: invalid class name and case insensitive filesystem */
public final class C12300hp implements Iterator, AnonymousClass00W {
    public int A00;
    public final Iterator A01;

    public C12300hp(Iterator it) {
        AnonymousClass00C.A0D(it, 1);
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= 0) {
            return new C06600Ug(i, this.A01.next());
        }
        AnonymousClass03T.A05();
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
