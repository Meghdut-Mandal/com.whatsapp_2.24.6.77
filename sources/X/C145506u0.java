package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6u0  reason: invalid class name and case insensitive filesystem */
public final class C145506u0 implements C160057kO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C160057kO A01;
    public final /* synthetic */ C128936Ee A02;
    public final /* synthetic */ C145546u7 A03;
    public final /* synthetic */ PublicKey A04;
    public final /* synthetic */ X509Certificate A05;

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        this.A01.BWk(exc);
    }

    public C145506u0(C160057kO r1, C128936Ee r2, C145546u7 r3, PublicKey publicKey, X509Certificate x509Certificate, int i) {
        this.A03 = r3;
        this.A05 = x509Certificate;
        this.A04 = publicKey;
        this.A00 = i;
        this.A01 = r1;
        this.A02 = r2;
    }

    public void BVK() {
        this.A01.BVK();
    }

    public void Bi5(AnonymousClass6OQ r9) {
        C145546u7 r1 = this.A03;
        X509Certificate x509Certificate = this.A05;
        AnonymousClass00C.A0B(r9);
        PublicKey publicKey = this.A04;
        r1.BlY(r9, this.A01, this.A02, Integer.valueOf(this.A00), publicKey, x509Certificate);
    }
}
