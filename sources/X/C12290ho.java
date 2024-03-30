package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.0ho  reason: invalid class name and case insensitive filesystem */
public class C12290ho implements Iterator, AnonymousClass00W {
    public int A00;
    public final /* synthetic */ C001100m A01;

    public C12290ho(C001100m r1) {
        this.A01 = r1;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01.size());
    }

    public Object next() {
        if (hasNext()) {
            C001100m r2 = this.A01;
            int i = this.A00;
            this.A00 = i + 1;
            return r2.get(i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
