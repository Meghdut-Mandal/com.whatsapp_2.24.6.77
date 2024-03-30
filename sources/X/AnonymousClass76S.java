package X;

import java.util.Iterator;

/* renamed from: X.76S  reason: invalid class name */
public final class AnonymousClass76S implements Iterator, AnonymousClass00W {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass6YK A02;

    public AnonymousClass76S(AnonymousClass6YK r1, int i, int i2) {
        this.A01 = i2;
        this.A02 = r1;
        this.A00 = i;
    }

    public boolean hasNext() {
        return AnonymousClass000.A1T(this.A00, this.A01);
    }

    public Object next() {
        if (!hasNext()) {
            return null;
        }
        AnonymousClass6YK r3 = this.A02;
        Object[] objArr = r3.A0H;
        int i = this.A00;
        this.A00 = i + 1;
        if (i >= r3.A0B) {
            i += r3.A09;
        }
        return objArr[i];
    }

    public void remove() {
        throw AnonymousClass000.A0x();
    }
}
