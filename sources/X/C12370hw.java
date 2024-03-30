package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hw  reason: invalid class name and case insensitive filesystem */
public final class C12370hw implements Iterator, AnonymousClass00W {
    public int A00;
    public boolean A01;
    public final int A02;
    public final int A03;

    public C12370hw(char c) {
        char c2 = 'A';
        this.A03 = 1;
        this.A02 = c;
        boolean z = AnonymousClass00C.A00(65, c) > 0 ? false : true;
        this.A01 = z;
        this.A00 = !z ? c : c2;
    }

    public /* bridge */ /* synthetic */ Object next() {
        int i = this.A00;
        if (i != this.A02) {
            this.A00 = this.A03 + i;
        } else if (this.A01) {
            this.A01 = false;
        } else {
            throw new NoSuchElementException();
        }
        return Character.valueOf((char) i);
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }

    public boolean hasNext() {
        return this.A01;
    }

    public C12370hw() {
    }
}
