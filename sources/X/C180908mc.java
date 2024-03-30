package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8mc  reason: invalid class name and case insensitive filesystem */
public class C180908mc extends AI9 {
    public final /* synthetic */ C193909Nj A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C180908mc(UserJid userJid, C193909Nj r4) {
        super(r4.A02, userJid, r4.A05);
        this.A00 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r1.equals("fail") == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BiM(X.C203399nx r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "status"
            X.9nx r0 = r13.A0c(r0)
            r4 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r5 = r12
            if (r0 == 0) goto L_0x0062
            X.9nx[] r2 = r0.A02
            if (r2 == 0) goto L_0x0062
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0062
            r0 = 0
            r3 = r2[r0]
            java.lang.String r0 = "user"
            X.C203399nx.A0A(r3, r0)
            java.lang.String r0 = "t"
            r2 = 0
            long r9 = X.C203399nx.A02(r3, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            java.lang.String r0 = "code"
            int r0 = X.C203399nx.A01(r3, r0, r4)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "type"
            java.lang.String r1 = r3.A0i(r0, r2)
            java.lang.String r8 = r3.A0e()
            if (r1 == 0) goto L_0x0048
            java.lang.String r0 = "fail"
            boolean r0 = r1.equals(r0)
            r11 = 1
            if (r0 != 0) goto L_0x005e
        L_0x0048:
            r11 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x005e
            X.9Nj r0 = r12.A00
            X.0wG r0 = r0.A01
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)
            r0 = 2131888648(0x7f120a08, float:1.9411937E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x005e:
            r5.A01(r6, r7, r8, r9, r11)
            return
        L_0x0062:
            java.lang.String r2 = "NO_CHANGE_FIX"
            java.lang.String r0 = r12.A01
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x007f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = r12.A01
            r1.append(r0)
            java.lang.String r0 = ","
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
        L_0x007d:
            r12.A01 = r2
        L_0x007f:
            r11 = 0
            r8 = 0
            r9 = 0
            r7 = r6
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C180908mc.BiM(X.9nx, java.lang.String):void");
    }
}
