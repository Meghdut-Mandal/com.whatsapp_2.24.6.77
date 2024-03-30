package X;

import java.util.NoSuchElementException;

/* renamed from: X.0Mm  reason: invalid class name and case insensitive filesystem */
public final class C04910Mm extends C12200hf {
    public boolean A00;
    public final /* synthetic */ Object A01;

    public C04910Mm(Object obj) {
        this.A01 = obj;
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1Q(this.A00 ? 1 : 0);
    }

    public final Object next() {
        if (!this.A00) {
            this.A00 = true;
            return this.A01;
        }
        throw new NoSuchElementException();
    }
}
