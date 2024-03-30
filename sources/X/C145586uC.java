package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.6uC  reason: invalid class name and case insensitive filesystem */
public final class C145586uC implements C160077kQ {
    public final /* synthetic */ AnonymousClass6OQ A00;
    public final /* synthetic */ C160227kf A01;
    public final /* synthetic */ C123535wf A02;

    public void BWk(Exception exc) {
        AnonymousClass00C.A0D(exc, 0);
        this.A01.BWl(exc, (Integer) null);
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        AnonymousClass00C.A0D(x509Certificate, 0);
        C123535wf r0 = this.A02;
        AnonymousClass6OQ r1 = this.A00;
        AnonymousClass6PT r4 = r0.A02;
        AnonymousClass57O r5 = r0.A03;
        int i = r0.A00;
        Object obj = r0.A04;
        new AnonymousClass64P(r0.A01, r4, r5, obj, x509Certificate, i).A00(r1, C128936Ee.A00());
    }

    public C145586uC(AnonymousClass6OQ r1, C160227kf r2, C123535wf r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BVM(Exception exc) {
        this.A01.BVK();
    }
}
