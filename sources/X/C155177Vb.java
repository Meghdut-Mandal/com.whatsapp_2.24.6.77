package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Vb  reason: invalid class name and case insensitive filesystem */
public final class C155177Vb extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155177Vb(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145536u3 r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006b, code lost:
        if (r2 != 406) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a9, code lost:
        if (r8.A03() == false) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            X.5V6 r14 = X.C90514aH.A0d(r18)
            r0 = r17
            X.6u3 r9 = r0.this$0
            java.security.cert.X509Certificate r12 = r0.$encryptionCert
            X.6OQ r6 = r0.$userEntity
            java.security.PublicKey r11 = r0.$passwordPublicKey
            java.lang.Integer r10 = r0.$passwordKeyId
            X.7kO r7 = r0.$callback
            X.6Ee r8 = r0.$operationRetryState
            X.754 r5 = new X.754
            r5.<init>((X.AnonymousClass6OQ) r6, (X.C160057kO) r7, (X.C128936Ee) r8, (X.C145536u3) r9, (java.lang.Integer) r10, (java.security.PublicKey) r11, (java.security.cert.X509Certificate) r12)
            X.6u3 r9 = r0.this$0
            X.6Wn r13 = r9.A01
            X.7kO r7 = r0.$callback
            X.6Ee r8 = r0.$operationRetryState
            X.6OQ r2 = r0.$userEntity
            X.7VF r1 = new X.7VF
            r1.<init>(r2, r7, r8, r9)
            java.security.cert.X509Certificate r12 = r0.$encryptionCert
            java.security.PublicKey r11 = r0.$passwordPublicKey
            java.lang.Integer r10 = r0.$passwordKeyId
            X.7Op r6 = new X.7Op
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.C36321k7.A0x(r7, r8)
            X.9nx r0 = r14.node
            int r2 = X.AnonymousClass3ME.A00(r0)
            X.1ft r3 = r13.A01
            java.lang.String r4 = X.C133066Wn.A00(r2)
            r0 = 7
            r3.A03(r4, r0)
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SupportUser/Refresh Token Error: "
            X.C36321k7.A1R(r0, r4, r3)
            X.0yC r3 = r13.A00
            r0 = 5823(0x16bf, float:8.16E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x007e
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x00af
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 == r0) goto L_0x0070
            r0 = 503(0x1f7, float:7.05E-43)
            if (r2 == r0) goto L_0x0070
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L_0x00a5
            r0 = 406(0x196, float:5.69E-43)
            if (r2 == r0) goto L_0x007a
        L_0x006d:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x0070:
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x007a
            r5.run()
            goto L_0x006d
        L_0x007a:
            r7.BWk(r14)
            goto L_0x006d
        L_0x007e:
            r0 = 304(0x130, float:4.26E-43)
            if (r2 == r0) goto L_0x009b
            r0 = 409(0x199, float:5.73E-43)
            if (r2 == r0) goto L_0x009b
            r0 = 480(0x1e0, float:6.73E-43)
            if (r2 == r0) goto L_0x00ab
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x009b
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L_0x009b
            r11 = r7
            r12 = r8
            r15 = r5
            r16 = r2
            X.C133066Wn.A01(r11, r12, r13, r14, r15, r16)
            goto L_0x006d
        L_0x009b:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x00ab
            X.C133066Wn.A03(r7, r13, r14, r6)
            goto L_0x006d
        L_0x00a5:
            boolean r0 = r8.A03()
            if (r0 != 0) goto L_0x00af
        L_0x00ab:
            X.C133066Wn.A02(r7, r8, r13, r14, r1)
            goto L_0x006d
        L_0x00af:
            X.005 r0 = r13.A03
            X.1UA r0 = X.C90524aI.A0M(r0)
            X.6P0 r1 = X.C113275fH.A00
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1UU r0 = (X.AnonymousClass1UU) r0
            r0.A06(r1)
            r6.invoke()
            goto L_0x006d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155177Vb.invoke(java.lang.Object):java.lang.Object");
    }
}
