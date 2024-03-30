package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.74K  reason: invalid class name */
public final class AnonymousClass74K implements Runnable {
    public final int A00;
    public final C160057kO A01;
    public final C128936Ee A02;
    public final C135086c7 A03;
    public final C135086c7 A04;
    public final C135086c7 A05;
    public final C135086c7 A06;
    public final C135086c7 A07;
    public final Integer A08;
    public final PublicKey A09;
    public final X509Certificate A0A;
    public final /* synthetic */ C145546u7 A0B;

    public AnonymousClass74K(C160057kO r2, C128936Ee r3, C135086c7 r4, C135086c7 r5, C135086c7 r6, C135086c7 r7, C135086c7 r8, C145546u7 r9, Integer num, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        AnonymousClass00C.A0D(publicKey, 9);
        C36341k9.A1G(r2, r3);
        this.A0B = r9;
        this.A03 = r4;
        this.A08 = num;
        this.A05 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = x509Certificate;
        this.A09 = publicKey;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void run() {
        C145546u7 r7 = this.A0B;
        C135086c7 r2 = this.A03;
        Integer num = this.A08;
        C135086c7 r3 = this.A05;
        C135086c7 r4 = this.A04;
        C135086c7 r5 = this.A06;
        C135086c7 r6 = this.A07;
        X509Certificate x509Certificate = this.A0A;
        C145546u7.A04(this.A01, this.A02, r2, r3, r4, r5, r6, r7, num, this.A09, x509Certificate, this.A00);
    }
}
