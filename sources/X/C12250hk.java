package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0hk  reason: invalid class name and case insensitive filesystem */
public final class C12250hk implements Iterator, C023509x, AnonymousClass00W {
    public int A00;
    public Iterator A01;
    public C023509x A02;
    public Object A03;

    private final RuntimeException A00() {
        int i = this.A00;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i != 5) {
            return AnonymousClass001.A09(AnonymousClass000.A0r("Unexpected state of the iterator: ", AnonymousClass000.A0u(), i));
        }
        return AnonymousClass001.A09("Iterator has failed.");
    }

    public void A01(Object obj, C023509x r3) {
        this.A03 = obj;
        this.A00 = 3;
        this.A02 = r3;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.A00;
            if (i != 0) {
                if (i == 1) {
                    Iterator it = this.A01;
                    AnonymousClass00C.A0B(it);
                    if (it.hasNext()) {
                        this.A00 = 2;
                        break;
                    }
                    this.A01 = null;
                } else if (i != 2 && i != 3) {
                    if (i == 4) {
                        return false;
                    }
                    throw A00();
                }
            }
            this.A00 = 5;
            C023509x r1 = this.A02;
            AnonymousClass00C.A0B(r1);
            this.A02 = null;
            r1.resumeWith(AnonymousClass0AJ.A00);
        }
        return true;
    }

    public Object next() {
        int i = this.A00;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i == 2) {
            this.A00 = 1;
            Iterator it = this.A01;
            AnonymousClass00C.A0B(it);
            return it.next();
        } else if (i == 3) {
            this.A00 = 0;
            Object obj = this.A03;
            this.A03 = null;
            return obj;
        } else {
            throw A00();
        }
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }

    public void resumeWith(Object obj) {
        AnonymousClass0AN.A00(obj);
        this.A00 = 4;
    }

    public C005102h getContext() {
        return C008903u.A00;
    }
}
