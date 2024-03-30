package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.8bp  reason: invalid class name and case insensitive filesystem */
public class C176258bp extends C21164AAy {
    public final /* synthetic */ B2S A00;
    public final /* synthetic */ AnonymousClass1UA A01;
    public final /* synthetic */ AnonymousClass6P0 A02;
    public final /* synthetic */ C128936Ee A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C176258bp(B2S b2s, B2S b2s2, AnonymousClass1UA r3, AnonymousClass6P0 r4, C128936Ee r5, String str) {
        super(b2s);
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = b2s2;
        this.A03 = r5;
        this.A04 = str;
    }

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        AnonymousClass1UA r1 = this.A01;
        AnonymousClass6P0 r3 = this.A02;
        B33 A002 = ((C1257060y) r1.A01.get()).A00(r3);
        AnonymousClass6OQ A003 = r1.A00(r3);
        C21163AAx aAx = new C21163AAx(this.A00, r3, r1.A02, r1.A00);
        C128936Ee r7 = this.A03;
        if (r7 == null) {
            r7 = C128936Ee.A00();
        }
        A002.BlX(A003, aAx, r7, num, this.A04, publicKey, x509Certificate);
    }
}
