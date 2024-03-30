package X;

import java.util.Iterator;

/* renamed from: X.0ib  reason: invalid class name and case insensitive filesystem */
public final class C12750ib implements C16970qV {
    public final C006302t A00;
    public final C16970qV A01;

    public Iterator iterator() {
        return new C13480jw(this.A01.iterator(), this.A00);
    }

    public C12750ib(C006302t r1, C16970qV r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
