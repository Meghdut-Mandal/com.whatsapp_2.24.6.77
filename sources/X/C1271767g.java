package X;

import java.io.File;

/* renamed from: X.67g  reason: invalid class name and case insensitive filesystem */
public final class C1271767g {
    public long A00;
    public C1263363n A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C1495971y A05;

    public File A00() {
        File file = this.A05.A06;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        return C36441kJ.A0w(file, AnonymousClass000.A0r(".", A0u, 0));
    }

    public File A01() {
        File file = this.A05.A06;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        A0u.append(".");
        A0u.append(0);
        return C90464aC.A0K(file, ".tmp", A0u);
    }

    public C1271767g(C1495971y r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        this.A04 = new long[r2.A05];
    }
}
