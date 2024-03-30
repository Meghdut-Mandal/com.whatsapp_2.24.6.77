package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hh  reason: invalid class name and case insensitive filesystem */
public final class C12220hh implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ C10960fV A02;

    public C12220hh() {
    }

    public C12220hh(C10960fV r2) {
        this.A02 = r2;
        this.A00 = 0;
        this.A01 = r2.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public final /* synthetic */ Object next() {
        int i = this.A00;
        if (i < this.A01) {
            this.A00 = i + 1;
            return Byte.valueOf(((AnonymousClass0M5) this.A02).zza[i]);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw AnonymousClass001.A0D();
    }
}
