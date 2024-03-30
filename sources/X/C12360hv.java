package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hv  reason: invalid class name and case insensitive filesystem */
public final class C12360hv implements Iterator, AnonymousClass00W {
    public int A00 = -2;
    public Object A01;
    public final /* synthetic */ C12760ic A02;

    public C12360hv(C12760ic r2) {
        this.A02 = r2;
    }

    private final void A00() {
        Object invoke;
        int i = this.A00;
        C12760ic r0 = this.A02;
        if (i == -2) {
            invoke = r0.A00.invoke();
        } else {
            C006302t r1 = r0.A01;
            Object obj = this.A01;
            AnonymousClass00C.A0B(obj);
            invoke = r1.invoke(obj);
        }
        this.A01 = invoke;
        int i2 = 1;
        if (invoke == null) {
            i2 = 0;
        }
        this.A00 = i2;
    }

    public boolean hasNext() {
        if (this.A00 < 0) {
            A00();
        }
        return AnonymousClass000.A1O(this.A00);
    }

    public Object next() {
        if (this.A00 < 0) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
