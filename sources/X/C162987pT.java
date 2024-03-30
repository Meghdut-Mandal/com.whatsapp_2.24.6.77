package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7pT  reason: invalid class name and case insensitive filesystem */
public class C162987pT extends C145566uA {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162987pT(AnonymousClass6OQ r1, C160057kO r2, C128936Ee r3, C145546u7 r4, int i) {
        super(r2);
        this.A04 = i;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r1;
        this.A01 = r3;
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        int i = this.A04;
        X509Certificate x509Certificate3 = x509Certificate;
        AnonymousClass00C.A0D(x509Certificate3, 0);
        Integer num2 = num;
        PublicKey publicKey2 = publicKey;
        switch (i) {
            case 0:
                AnonymousClass6OQ r0 = (AnonymousClass6OQ) this.A02;
                C135086c7 r3 = r0.A04;
                AnonymousClass00C.A08(r3);
                C160057kO r1 = (C160057kO) this.A00;
                String A002 = AnonymousClass6OQ.A00(r0);
                AnonymousClass00C.A0B(publicKey2);
                int A07 = C36411kG.A07(num2);
                C145546u7.A05(r1, (C128936Ee) this.A01, r3, (C145546u7) this.A03, A002, publicKey2, x509Certificate3, A07);
                return;
            case 1:
                ((C145546u7) this.A03).BlY((AnonymousClass6OQ) this.A02, (C160057kO) this.A00, (C128936Ee) this.A01, num2, publicKey2, x509Certificate3);
                return;
            case 2:
            case 3:
                AnonymousClass6OQ r2 = (AnonymousClass6OQ) this.A02;
                AnonymousClass00C.A0B(publicKey2);
                int A072 = C36411kG.A07(num2);
                C145546u7.A03(r2, (C160057kO) this.A00, (C128936Ee) this.A01, (C145546u7) this.A03, publicKey2, x509Certificate3, A072);
                return;
            default:
                ((C145546u7) this.A03).BlZ((AnonymousClass6OQ) this.A02, (C160057kO) this.A00, (C128936Ee) this.A01, num2, publicKey2, x509Certificate3);
                return;
        }
    }
}
