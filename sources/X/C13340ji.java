package X;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: X.0ji  reason: invalid class name and case insensitive filesystem */
public final class C13340ji extends AbstractList implements C17840s9, RandomAccess {
    public final C17840s9 A00;

    public final C17840s9 Byl() {
        return this;
    }

    public final List Byq() {
        return this.A00.Byq();
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        return ((AnonymousClass0M2) this.A00).get(i);
    }

    public final Iterator iterator() {
        return new C12210hg(this);
    }

    public final ListIterator listIterator(int i) {
        return new C12410i0(this, i);
    }

    public final int size() {
        return this.A00.size();
    }

    public C13340ji(C17840s9 r1) {
        this.A00 = r1;
    }
}
