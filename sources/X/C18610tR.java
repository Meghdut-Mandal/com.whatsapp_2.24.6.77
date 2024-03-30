package X;

import java.util.Iterator;

/* renamed from: X.0tR  reason: invalid class name and case insensitive filesystem */
public class C18610tR implements Iterable, AnonymousClass00W {
    public Object A00;
    public final int A01;

    public C18610tR(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public Iterator iterator() {
        if (this.A01 != 0) {
            return ((C16970qV) this.A00).iterator();
        }
        return new C13580k6((int[]) this.A00);
    }
}
