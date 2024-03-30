package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0ht  reason: invalid class name and case insensitive filesystem */
public abstract class C12340ht implements Iterator, AnonymousClass00W {
    public Object A00;
    public AnonymousClass0Ng A01 = AnonymousClass0Ng.NotReady;

    public abstract void A00();

    public boolean hasNext() {
        AnonymousClass0Ng r0 = this.A01;
        AnonymousClass0Ng r3 = AnonymousClass0Ng.Failed;
        if (r0 != r3) {
            int ordinal = r0.ordinal();
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 0) {
                this.A01 = r3;
                A00();
                if (this.A01 == AnonymousClass0Ng.Ready) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw AnonymousClass001.A08("Failed requirement.");
    }

    public Object next() {
        if (hasNext()) {
            this.A01 = AnonymousClass0Ng.NotReady;
            return this.A00;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
