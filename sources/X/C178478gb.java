package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8gb  reason: invalid class name and case insensitive filesystem */
public class C178478gb extends C178498gd {
    public final /* synthetic */ C135086c7 A00;
    public final /* synthetic */ C22954Az6 A01;
    public final /* synthetic */ AnonymousClass8gL A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ boolean A04;

    public void A05(C202059ky r15) {
        A00(r15);
        this.A01.BfL((UserJid) null, (C135086c7) null, (C135086c7) null, (C135086c7) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    public void A06(C202059ky r15) {
        A00(r15);
        this.A01.BfL((UserJid) null, (C135086c7) null, (C135086c7) null, (C135086c7) null, r15, (String) null, (String) null, (String) null, false, false, false, this.A04, false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178478gb(Context context, AnonymousClass17Y r8, C135086c7 r9, C22954Az6 az6, C29221Vu r11, AnonymousClass9YX r12, AnonymousClass8gL r13, Integer num, boolean z) {
        super(context, r8, r11, r12, "upi-get-vpa-name");
        this.A02 = r13;
        this.A01 = az6;
        this.A04 = z;
        this.A03 = num;
        this.A00 = r9;
    }

    private void A00(C202059ky r4) {
        AnonymousClass5GM r0 = this.A02.A02;
        r0.A02.A01(r4, this.A03, "upi-get-vpa-name");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if ("1".equals(r2.getString("blocked")) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if ("1".equals(r2.getString("vpaValid")) == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0085, code lost:
        if ("1".equals(r2.getString("verifiedMerchant")) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c9, code lost:
        if ("1".equals(r2.getString("blocked")) == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e1, code lost:
        if ("1".equals(r1.getString("merchant")) == false) goto L_0x00e3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r21) {
        /*
            r20 = this;
            X.9nx r4 = X.C203399nx.A03(r21)
            r1 = r20
            if (r4 == 0) goto L_0x0110
            X.8aw r3 = new X.8aw
            r3.<init>()
            X.8gL r6 = r1.A02
            X.16T r2 = r6.A00
            r0 = 7
            r3.A04(r2, r4, r0)
            X.6vT r4 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x010d
            java.lang.String r0 = "vpa"
            java.lang.String r2 = r2.getString(r0)
        L_0x0025:
            java.lang.String r0 = "upiHandle"
            X.6c7 r9 = X.C165617ti.A0P(r4, r5, r2, r0)
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x010a
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getString(r0)
        L_0x0035:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0054
            X.9Xv r4 = r6.A01
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = "blocked"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "1"
            boolean r2 = r0.equals(r2)
            r0 = 1
            if (r2 != 0) goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            r4.A02(r9, r0)
        L_0x0054:
            X.5GM r4 = r6.A02
            java.lang.Integer r2 = r1.A03
            java.lang.String r0 = "upi-get-vpa-name"
            r4.A04(r2, r0)
            X.Az6 r6 = r1.A01
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0072
            java.lang.String r0 = "vpaValid"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r2)
            r15 = 1
            if (r0 != 0) goto L_0x0073
        L_0x0072:
            r15 = 0
        L_0x0073:
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0087
            java.lang.String r0 = "verifiedMerchant"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r2)
            r16 = 1
            if (r0 != 0) goto L_0x0089
        L_0x0087:
            r16 = 0
        L_0x0089:
            X.6vT r4 = X.C146356vT.A00()
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0108
            java.lang.String r0 = "vpaName"
            java.lang.String r2 = r2.getString(r0)
        L_0x0097:
            java.lang.String r0 = "accountHolderName"
            X.6c7 r8 = X.C165617ti.A0P(r4, r5, r2, r0)
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0106
            java.lang.String r0 = "vpaId"
            java.lang.String r12 = r2.getString(r0)
        L_0x00a7:
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x0104
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getString(r0)
        L_0x00b1:
            com.whatsapp.jid.UserJid r7 = X.C36431kI.A0l(r0)
            X.6c7 r10 = r1.A00
            android.os.Bundle r2 = r3.A00
            if (r2 == 0) goto L_0x00cb
            java.lang.String r0 = "blocked"
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r2)
            r17 = 1
            if (r0 != 0) goto L_0x00cd
        L_0x00cb:
            r17 = 0
        L_0x00cd:
            boolean r2 = r1.A04
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x00e3
            java.lang.String r0 = "merchant"
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r19 = 1
            if (r0 != 0) goto L_0x00e5
        L_0x00e3:
            r19 = 0
        L_0x00e5:
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0102
            java.lang.String r0 = "token"
            java.lang.String r13 = r1.getString(r0)
        L_0x00ef:
            android.os.Bundle r1 = r3.A00
            if (r1 == 0) goto L_0x0100
            java.lang.String r0 = "mcc"
            java.lang.String r14 = r1.getString(r0)
        L_0x00f9:
            r11 = 0
            r18 = r2
            r6.BfL(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0100:
            r14 = 0
            goto L_0x00f9
        L_0x0102:
            r13 = 0
            goto L_0x00ef
        L_0x0104:
            r0 = 0
            goto L_0x00b1
        L_0x0106:
            r12 = 0
            goto L_0x00a7
        L_0x0108:
            r2 = 0
            goto L_0x0097
        L_0x010a:
            r0 = 0
            goto L_0x0035
        L_0x010d:
            r2 = 0
            goto L_0x0025
        L_0x0110:
            java.lang.String r0 = "PAY: IndiaUpiPayNonWaVpaAction verifyPaymentVpa: missing account node"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 0
            r1.A00(r3)
            X.Az6 r2 = r1.A01
            r11 = 0
            boolean r14 = r1.A04
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r12 = 0
            r13 = 0
            r15 = 0
            r4 = r3
            r2.BfL(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178478gb.A07(X.9nx):void");
    }
}
