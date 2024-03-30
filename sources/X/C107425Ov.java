package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.5Ov  reason: invalid class name and case insensitive filesystem */
public final class C107425Ov extends C145566uA {
    public final /* synthetic */ C160057kO A00;
    public final /* synthetic */ C128936Ee A01;
    public final /* synthetic */ C135086c7 A02;
    public final /* synthetic */ C135086c7 A03;
    public final /* synthetic */ C135086c7 A04;
    public final /* synthetic */ C135086c7 A05;
    public final /* synthetic */ C135086c7 A06;
    public final /* synthetic */ C145546u7 A07;
    public final /* synthetic */ Integer A08;

    public void BiT(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C36321k7.A0w(x509Certificate, x509Certificate2);
        C145546u7 r7 = this.A07;
        C135086c7 r2 = this.A02;
        Integer num2 = this.A08;
        AnonymousClass00C.A0B(publicKey);
        int A072 = C36411kG.A07(num);
        C160057kO r0 = this.A00;
        C128936Ee r1 = this.A01;
        C145546u7.A04(r0, r1, r2, this.A04, this.A03, this.A05, this.A06, r7, num2, publicKey, x509Certificate, A072);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107425Ov(C160057kO r1, C128936Ee r2, C135086c7 r3, C135086c7 r4, C135086c7 r5, C135086c7 r6, C135086c7 r7, C145546u7 r8, Integer num) {
        super(r1);
        this.A00 = r1;
        this.A07 = r8;
        this.A02 = r3;
        this.A08 = num;
        this.A04 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
    }
}
