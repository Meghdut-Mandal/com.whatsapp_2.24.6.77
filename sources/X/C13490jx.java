package X;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: X.0jx  reason: invalid class name and case insensitive filesystem */
public class C13490jx extends C12290ho implements ListIterator, AnonymousClass00W {
    public final /* synthetic */ C001100m A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13490jx(C001100m r2, int i) {
        super(r2);
        this.A00 = r2;
        AnonymousClass0YP.A02(i, r2.size());
        this.A00 = i;
    }

    public boolean hasPrevious() {
        return AnonymousClass000.A1R(this.A00);
    }

    public int previousIndex() {
        return this.A00 - 1;
    }

    public void add(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public Object previous() {
        if (hasPrevious()) {
            C001100m r1 = this.A00;
            int i = this.A00 - 1;
            this.A00 = i;
            return r1.get(i);
        }
        throw new NoSuchElementException();
    }

    public void set(Object obj) {
        throw AnonymousClass000.A0x();
    }

    public int nextIndex() {
        return this.A00;
    }
}
