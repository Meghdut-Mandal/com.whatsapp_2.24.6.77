package X;

import java.io.File;
import java.nio.charset.Charset;

/* renamed from: X.67l  reason: invalid class name and case insensitive filesystem */
public final class C1272267l {
    public long A00;
    public C1269666k A01;
    public boolean A02;
    public final String A03;
    public final long[] A04;
    public final /* synthetic */ C1496071z A05;

    public File A00() {
        C1496071z r1 = this.A05;
        Charset charset = C1496071z.A0E;
        File file = r1.A06;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        return C36441kJ.A0w(file, AnonymousClass000.A0r(".", A0u, 0));
    }

    public File A01() {
        C1496071z r1 = this.A05;
        Charset charset = C1496071z.A0E;
        File file = r1.A06;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.A03);
        A0u.append(".");
        A0u.append(0);
        return C90464aC.A0K(file, ".tmp", A0u);
    }

    public C1272267l(C1496071z r2, String str) {
        this.A05 = r2;
        this.A03 = str;
        Charset charset = C1496071z.A0E;
        this.A04 = new long[r2.A04];
    }
}
