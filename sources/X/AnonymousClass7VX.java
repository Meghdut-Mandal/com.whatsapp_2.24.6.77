package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7VX  reason: invalid class name */
public final class AnonymousClass7VX extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ AnonymousClass6u4 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7VX(AnonymousClass6u4 r2, C160057kO r3, C128936Ee r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r2;
        this.$encryptionCert = x509Certificate;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        if (r1 != 503) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            X.5V6 r12 = X.C90514aH.A0d(r15)
            X.6u4 r6 = r14.this$0
            java.security.cert.X509Certificate r11 = r14.$encryptionCert
            java.security.PublicKey r10 = r14.$passwordPublicKey
            java.lang.Integer r9 = r14.$passwordKeyId
            X.7kO r7 = r14.$callback
            X.6Ee r8 = r14.$operationRetryState
            r1 = 1
            X.75A r5 = new X.75A
            r5.<init>((X.AnonymousClass6u4) r6, (X.C160057kO) r7, (X.C128936Ee) r8, (java.lang.Integer) r9, (java.security.PublicKey) r10, (java.security.cert.X509Certificate) r11)
            X.6u4 r0 = r14.this$0
            X.5w2 r9 = r0.A00
            X.7kO r10 = r14.$callback
            X.6Ee r11 = r14.$operationRetryState
            X.7Ug r4 = new X.7Ug
            r4.<init>(r0, r10, r11)
            X.C36321k7.A0v(r10, r1, r11)
            X.9nx r0 = r12.node
            int r1 = X.AnonymousClass3ME.A00(r0)
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x00b7
            r0 = 409(0x199, float:5.73E-43)
            if (r1 == r0) goto L_0x00b7
            r0 = 480(0x1e0, float:6.73E-43)
            if (r1 == r0) goto L_0x007b
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x00b7
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x00b7
            r0 = 405(0x195, float:5.68E-43)
            if (r1 == r0) goto L_0x00b3
            r0 = 406(0x196, float:5.69E-43)
            if (r1 == r0) goto L_0x0069
            r0 = 408(0x198, float:5.72E-43)
            if (r1 == r0) goto L_0x0069
            r0 = 429(0x1ad, float:6.01E-43)
            if (r1 == r0) goto L_0x0069
            r0 = 481(0x1e1, float:6.74E-43)
            if (r1 == r0) goto L_0x005f
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 == r0) goto L_0x0069
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 == r0) goto L_0x00b3
        L_0x005c:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x005f:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x00b3
            r5.run()
            goto L_0x005c
        L_0x0069:
            java.lang.Long r0 = r11.A01()
            if (r0 == 0) goto L_0x00b3
            X.0wU r3 = r9.A00
            long r1 = r0.longValue()
            java.lang.String r0 = "CommonUserIqErrorHelper/retryOperationWithDelay"
            r3.BpM(r5, r0, r1)
            goto L_0x005c
        L_0x007b:
            boolean r0 = r11.A04()
            if (r0 == 0) goto L_0x00b3
            boolean r0 = r11.A03()
            if (r0 != 0) goto L_0x00b3
            r11.A02()
            X.005 r0 = r9.A01
            java.lang.Object r2 = r0.get()
            X.6Sp r2 = (X.C132196Sp) r2
            java.lang.String r1 = "shops"
            X.6P0 r0 = new X.6P0
            r0.<init>(r1)
            r2.A02(r0)
            X.005 r0 = r9.A03
            java.lang.Object r3 = r0.get()
            X.6Mw r3 = (X.AnonymousClass6Mw) r3
            X.6P0 r2 = new X.6P0
            r2.<init>(r1)
            r1 = 0
            X.5aa r0 = new X.5aa
            r0.<init>(r10, r4, r1)
            r3.A01(r2, r0)
            goto L_0x005c
        L_0x00b3:
            r10.BWk(r12)
            goto L_0x005c
        L_0x00b7:
            X.7Om r8 = new X.7Om
            r13 = r5
            r8.<init>(r9, r10, r11, r12, r13)
            X.005 r3 = r9.A02
            X.1UA r2 = X.C90524aI.A0M(r3)
            java.lang.String r1 = "shops"
            X.6P0 r0 = new X.6P0
            r0.<init>(r1)
            X.6OQ r0 = r2.A00(r0)
            if (r0 != 0) goto L_0x00d4
            r8.invoke()
            goto L_0x005c
        L_0x00d4:
            X.1UA r3 = X.C90524aI.A0M(r3)
            X.6P0 r2 = new X.6P0
            r2.<init>(r1)
            r0 = 0
            X.7rC r1 = new X.7rC
            r1.<init>(r10, r12, r8, r0)
            r0 = 0
            r3.A05(r1, r2, r0, r0)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7VX.invoke(java.lang.Object):java.lang.Object");
    }
}
