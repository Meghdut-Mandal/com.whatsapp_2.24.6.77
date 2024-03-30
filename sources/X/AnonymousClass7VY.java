package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7VY  reason: invalid class name */
public final class AnonymousClass7VY extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VY(C160057kO r2, C128936Ee r3, C145536u3 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r4;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r2;
        this.$operationRetryState = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        if (r13 != 406) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            X.5V6 r11 = X.C90514aH.A0d(r15)
            X.6u3 r7 = r14.this$0
            java.security.cert.X509Certificate r10 = r14.$encryptionCert
            java.security.PublicKey r9 = r14.$passwordPublicKey
            java.lang.Integer r8 = r14.$passwordKeyId
            X.7kO r5 = r14.$callback
            X.6Ee r6 = r14.$operationRetryState
            X.75A r4 = new X.75A
            r4.<init>((X.C160057kO) r5, (X.C128936Ee) r6, (X.C145536u3) r7, (java.lang.Integer) r8, (java.security.PublicKey) r9, (java.security.cert.X509Certificate) r10)
            X.6u3 r0 = r14.this$0
            X.6Wn r10 = r0.A01
            X.7kO r8 = r14.$callback
            X.6Ee r9 = r14.$operationRetryState
            X.7Un r1 = new X.7Un
            r1.<init>(r8, r9, r0)
            X.C36321k7.A0x(r8, r9)
            r2 = 3
            X.9nx r0 = r11.node
            int r13 = X.AnonymousClass3ME.A00(r0)
            X.1ft r0 = r10.A01
            java.lang.String r3 = X.C133066Wn.A00(r13)
            r0.A03(r3, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SupportUser/Create User Error: "
            X.C36321k7.A1R(r0, r3, r2)
            X.0yC r2 = r10.A00
            r0 = 5823(0x16bf, float:8.16E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x006d
            r0 = 400(0x190, float:5.6E-43)
            if (r13 == r0) goto L_0x0069
            r0 = 500(0x1f4, float:7.0E-43)
            if (r13 == r0) goto L_0x005f
            r0 = 503(0x1f7, float:7.05E-43)
            if (r13 == r0) goto L_0x005f
            r0 = 405(0x195, float:5.68E-43)
            if (r13 == r0) goto L_0x0096
            r0 = 406(0x196, float:5.69E-43)
            if (r13 == r0) goto L_0x0069
        L_0x005c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x005f:
            boolean r0 = r9.A04()
            if (r0 == 0) goto L_0x0069
            r4.run()
            goto L_0x005c
        L_0x0069:
            r8.BWk(r11)
            goto L_0x005c
        L_0x006d:
            r0 = 304(0x130, float:4.26E-43)
            if (r13 == r0) goto L_0x0086
            r0 = 409(0x199, float:5.73E-43)
            if (r13 == r0) goto L_0x0086
            r0 = 480(0x1e0, float:6.73E-43)
            if (r13 == r0) goto L_0x0096
            r0 = 400(0x190, float:5.6E-43)
            if (r13 == r0) goto L_0x0086
            r0 = 401(0x191, float:5.62E-43)
            if (r13 == r0) goto L_0x0086
            r12 = r4
            X.C133066Wn.A01(r8, r9, r10, r11, r12, r13)
            goto L_0x005c
        L_0x0086:
            boolean r0 = r9.A03()
            if (r0 == 0) goto L_0x0096
            X.7On r7 = new X.7On
            r12 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            X.C133066Wn.A03(r8, r10, r11, r7)
            goto L_0x005c
        L_0x0096:
            X.C133066Wn.A02(r8, r9, r10, r11, r1)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VY.invoke(java.lang.Object):java.lang.Object");
    }
}
