package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

public class B7D extends C21164AAy {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B7D(AnonymousClass6OQ r1, B2S b2s, B2S b2s2, AnonymousClass1UA r4, C128936Ee r5, int i) {
        super(b2s);
        this.A04 = i;
        this.A00 = r4;
        this.A03 = r1;
        this.A01 = b2s2;
        this.A02 = r5;
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A04;
        AnonymousClass1UA r1 = (AnonymousClass1UA) this.A00;
        AnonymousClass6OQ r6 = (AnonymousClass6OQ) this.A03;
        AnonymousClass6P0 r3 = r6.A01;
        B33 A002 = ((C1257060y) r1.A01.get()).A00(r3);
        C21163AAx aAx = new C21163AAx((B2S) this.A01, r3, r1.A02, r1.A00);
        C128936Ee r8 = (C128936Ee) this.A02;
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        X509Certificate x509Certificate3 = x509Certificate;
        if (i != 0) {
            A002.BlY(r6, aAx, r8, num2, publicKey2, x509Certificate3);
            return;
        }
        if (r8 == null) {
            r8 = C128936Ee.A00();
        }
        A002.BlZ(r6, aAx, r8, num2, publicKey2, x509Certificate3);
    }
}
