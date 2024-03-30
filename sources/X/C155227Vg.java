package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Vg  reason: invalid class name and case insensitive filesystem */
public final class C155227Vg extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C160057kO $callback;
    public final /* synthetic */ X509Certificate $encryptionCert;
    public final /* synthetic */ C128936Ee $operationRetryState;
    public final /* synthetic */ Integer $passwordKeyId;
    public final /* synthetic */ PublicKey $passwordPublicKey;
    public final /* synthetic */ String $userDeleteReason;
    public final /* synthetic */ AnonymousClass6OQ $userEntity;
    public final /* synthetic */ C145536u3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155227Vg(AnonymousClass6OQ r2, C160057kO r3, C128936Ee r4, C145536u3 r5, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        super(1);
        this.this$0 = r5;
        this.$encryptionCert = x509Certificate;
        this.$userEntity = r2;
        this.$passwordPublicKey = publicKey;
        this.$passwordKeyId = num;
        this.$callback = r3;
        this.$operationRetryState = r4;
        this.$userDeleteReason = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r14 != 406) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008e, code lost:
        if (r7.A03() == false) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            X.5V6 r12 = X.C90514aH.A0d(r16)
            X.6u3 r7 = r15.this$0
            java.security.cert.X509Certificate r11 = r15.$encryptionCert
            X.6OQ r4 = r15.$userEntity
            java.security.PublicKey r10 = r15.$passwordPublicKey
            java.lang.Integer r8 = r15.$passwordKeyId
            X.7kO r5 = r15.$callback
            X.6Ee r6 = r15.$operationRetryState
            java.lang.String r9 = r15.$userDeleteReason
            r0 = 1
            X.750 r3 = new X.750
            r3.<init>((X.AnonymousClass6OQ) r4, (X.C160057kO) r5, (X.C128936Ee) r6, (X.C145536u3) r7, (java.lang.Integer) r8, (java.lang.String) r9, (java.security.PublicKey) r10, (java.security.cert.X509Certificate) r11)
            X.6u3 r8 = r15.this$0
            X.6Wn r11 = r8.A01
            X.7kO r6 = r15.$callback
            X.6Ee r7 = r15.$operationRetryState
            X.6OQ r5 = r15.$userEntity
            java.lang.String r9 = r15.$userDeleteReason
            X.7VR r4 = new X.7VR
            r4.<init>(r5, r6, r7, r8, r9)
            X.C36321k7.A0v(r6, r0, r7)
            X.9nx r0 = r12.node
            int r14 = X.AnonymousClass3ME.A00(r0)
            X.1ft r1 = r11.A01
            java.lang.String r2 = X.C133066Wn.A00(r14)
            r0 = 6
            r1.A03(r2, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "SupportUser/Delete User Error: "
            X.C36321k7.A1R(r0, r2, r1)
            X.0yC r1 = r11.A00
            r0 = 5823(0x16bf, float:8.16E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x006f
            r0 = 400(0x190, float:5.6E-43)
            if (r14 != r0) goto L_0x005c
            r0 = 0
            r6.Bi5(r0)
        L_0x0059:
            X.0AJ r0 = X.AnonymousClass0AJ.A00
            return r0
        L_0x005c:
            if (r14 == r0) goto L_0x009e
            r0 = 500(0x1f4, float:7.0E-43)
            if (r14 == r0) goto L_0x0094
            r0 = 503(0x1f7, float:7.05E-43)
            if (r14 == r0) goto L_0x0094
            r0 = 405(0x195, float:5.68E-43)
            if (r14 == r0) goto L_0x0090
            r0 = 406(0x196, float:5.69E-43)
            if (r14 == r0) goto L_0x009e
            goto L_0x0059
        L_0x006f:
            r0 = 304(0x130, float:4.26E-43)
            if (r14 == r0) goto L_0x008a
            r0 = 409(0x199, float:5.73E-43)
            if (r14 == r0) goto L_0x008a
            r0 = 480(0x1e0, float:6.73E-43)
            if (r14 == r0) goto L_0x0090
            r0 = 400(0x190, float:5.6E-43)
            if (r14 == r0) goto L_0x008a
            r0 = 401(0x191, float:5.62E-43)
            if (r14 == r0) goto L_0x008a
            r9 = r6
            r10 = r7
            r13 = r3
            X.C133066Wn.A01(r9, r10, r11, r12, r13, r14)
            goto L_0x0059
        L_0x008a:
            boolean r0 = r7.A03()
            if (r0 != 0) goto L_0x0094
        L_0x0090:
            X.C133066Wn.A02(r6, r7, r11, r12, r4)
            goto L_0x0059
        L_0x0094:
            boolean r0 = r7.A04()
            if (r0 == 0) goto L_0x009e
            r3.run()
            goto L_0x0059
        L_0x009e:
            r6.BWk(r12)
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C155227Vg.invoke(java.lang.Object):java.lang.Object");
    }
}
