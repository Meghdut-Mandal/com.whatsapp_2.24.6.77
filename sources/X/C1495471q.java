package X;

import java.io.Closeable;

/* renamed from: X.71q  reason: invalid class name and case insensitive filesystem */
public final class C1495471q implements Closeable {
    public final C107775Qv A00;
    public final C107775Qv A01;
    public final C107775Qv A02;
    public final /* synthetic */ AnonymousClass1D9 A03;

    public C1495471q(C107775Qv r1, C107775Qv r2, C107775Qv r3, AnonymousClass1D9 r4) {
        this.A03 = r4;
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = r3;
    }

    public C122645vC A00() {
        String A002;
        AnonymousClass1D9 r4 = this.A03;
        String A003 = this.A02.A00();
        String A004 = this.A01.A00();
        C107775Qv r0 = this.A00;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.A00();
        }
        return new C122645vC(r4, A003, A004, A002);
    }

    public void close() {
        AnonymousClass14X.A02(this.A01);
        AnonymousClass14X.A02(this.A02);
        AnonymousClass14X.A02(this.A00);
    }
}
