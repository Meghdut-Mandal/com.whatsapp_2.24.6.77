package X;

/* renamed from: X.2i5  reason: invalid class name and case insensitive filesystem */
public class C48802i5 extends C33541fX {
    public Object A00;
    public boolean A01;
    public final int A02;

    public C48802i5(int i, Object obj, boolean z) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            switch(r0) {
                case 0: goto L_0x00e4;
                case 1: goto L_0x0152;
                case 2: goto L_0x00a2;
                case 3: goto L_0x003a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r10.A00
            X.2ev r4 = (X.C47532ev) r4
            r4.A0D()
            java.lang.Integer r0 = X.C36361kB.A0i()
            r4.A02 = r0
            java.lang.String r5 = r4.A04
            if (r5 == 0) goto L_0x0039
            boolean r8 = r10.A01
            android.content.Context r2 = r4.A0B()
            X.2bV r0 = r4.A0C
            X.3Qa r0 = r0.A1J
            java.lang.String r6 = r0.A01
            X.AnonymousClass00C.A07(r6)
            X.1Du r3 = r4.A00
            r7 = 0
            X.1DW r1 = r4.A09
            android.net.Uri r0 = android.net.Uri.parse(r5)
            int r0 = r1.A0C(r0)
            r9 = 1
            if (r0 != r9) goto L_0x0036
            r9 = 0
        L_0x0036:
            X.AnonymousClass3MP.A00(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0039:
            return
        L_0x003a:
            java.lang.Object r5 = r10.A00
            com.whatsapp.quickcontact.QuickContactActivity r5 = (com.whatsapp.quickcontact.QuickContactActivity) r5
            X.141 r0 = r5.A0U
            boolean r0 = r0.A0G()
            r8 = 7
            if (r0 == 0) goto L_0x0077
            X.0yC r1 = r5.A0D
            r0 = 0
            boolean r0 = X.C34681hT.A0R(r1, r0)
            if (r0 == 0) goto L_0x0077
            X.005 r0 = r5.A0x
            java.lang.Object r1 = r0.get()
            X.0y9 r1 = (X.C20780y9) r1
            java.lang.Class<X.0xm> r0 = X.C20570xm.class
            r1.A01(r0)
            boolean r2 = r10.A01
            X.141 r1 = r5.A0U
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r1 = X.C36381kD.A0e(r1, r0)
            X.147 r1 = (X.AnonymousClass147) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet r1 = X.C53402rG.A00(r1, r8, r2)
            java.lang.String r0 = "LGCCallConfirmationSheet"
            r5.Btl(r1, r0)
            return
        L_0x0077:
            X.0v0 r2 = r5.A09
            X.141 r1 = r5.A0U
            boolean r9 = r10.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r0 = com.whatsapp.calling.fragment.CallConfirmationFragment.A07(r5, r2, r1, r0, r9)
            if (r0 != 0) goto L_0x0039
            X.1ND r4 = r5.A0C
            X.141 r3 = r5.A0U
            X.17X r2 = r5.A0R
            X.0wQ r1 = r5.A02
            X.16D r0 = r5.A0I
            java.util.List r7 = X.AnonymousClass3UL.A04(r1, r0, r2, r3)
            X.147 r6 = r5.A0c
            int r0 = r4.Buc(r5, r6, r7, r8, r9)
            if (r0 != 0) goto L_0x0039
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r5, r0)
            return
        L_0x00a2:
            java.lang.Object r5 = r10.A00
            X.3FH r5 = (X.AnonymousClass3FH) r5
            X.00S r0 = r5.A04
            r0.invoke()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x00cf
            android.content.Context r4 = r5.A00
            X.1X4 r3 = r5.A01
            X.14p r1 = r5.A02
            boolean r0 = r1 instanceof X.C225314u
            if (r0 == 0) goto L_0x00c7
            X.14u r1 = (X.C225314u) r1
            android.view.View r2 = r1.A00
        L_0x00bd:
            X.11F r1 = r5.A03
            java.lang.Integer r0 = X.C36361kB.A0j()
            X.AnonymousClass1DH.A00(r4, r2, r3, r1, r0)
            return
        L_0x00c7:
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r2 = X.C03570Gk.A0B(r1, r0)
            goto L_0x00bd
        L_0x00cf:
            X.14p r2 = r5.A02
            boolean r0 = r2 instanceof X.C225014r
            if (r0 == 0) goto L_0x0039
            X.14r r2 = (X.C225014r) r2
            X.11F r1 = r5.A03
            X.2oi r0 = X.C51992oi.CONTACT_INFO
            com.whatsapp.mute.ui.MuteDialogFragment r1 = X.AnonymousClass3RD.A01(r1, r0)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x00e4:
            java.lang.Object r4 = r10.A00
            com.whatsapp.calling.callhistory.CallLogActivity r4 = (com.whatsapp.calling.callhistory.CallLogActivity) r4
            X.141 r3 = r4.A0Q
            X.17X r2 = r4.A0N
            X.0wQ r1 = r4.A02
            X.16D r0 = r4.A0E
            java.util.List r6 = X.AnonymousClass3UL.A04(r1, r0, r2, r3)
            X.141 r0 = r4.A0Q
            if (r0 == 0) goto L_0x0150
            X.11F r0 = r0.A0H
            com.whatsapp.jid.GroupJid r1 = X.C36441kJ.A0l(r0)
        L_0x00fe:
            boolean r0 = r4.A0Z
            if (r0 == 0) goto L_0x014e
            if (r1 == 0) goto L_0x014e
            X.0yC r3 = r4.A0D
            X.0wQ r2 = r4.A02
            X.17X r0 = r4.A0N
            X.17r r0 = r0.A07
            int r1 = r0.A0B(r1)
            boolean r0 = X.C34681hT.A0D(r2, r3, r1)
            if (r0 == 0) goto L_0x014e
            boolean r1 = X.C34681hT.A0C(r2, r3, r1)
            if (r1 != 0) goto L_0x014e
            r3 = 1
        L_0x011d:
            boolean r8 = r10.A01
            if (r8 != 0) goto L_0x013e
            X.1ND r2 = r4.A08
            r1 = 4
            X.11F r0 = r4.A0T
            X.147 r0 = X.C65533Sl.A01(r0)
            boolean r0 = r2.BPb(r4, r0, r6, r1)
            if (r0 == 0) goto L_0x013e
            X.0yC r1 = r4.A0D
            r0 = 5429(0x1535, float:7.608E-42)
            int r0 = r1.A07(r0)
        L_0x0138:
            if (r0 != 0) goto L_0x0039
            r4.finish()
            return
        L_0x013e:
            if (r3 != 0) goto L_0x0039
            X.1ND r3 = r4.A08
            r7 = 4
            X.11F r0 = r4.A0T
            com.whatsapp.jid.GroupJid r5 = X.C36441kJ.A0l(r0)
            int r0 = r3.Buc(r4, r5, r6, r7, r8)
            goto L_0x0138
        L_0x014e:
            r3 = 0
            goto L_0x011d
        L_0x0150:
            r1 = 0
            goto L_0x00fe
        L_0x0152:
            boolean r0 = r10.A01
            java.lang.Object r3 = r10.A00
            com.whatsapp.calling.views.PermissionDialogFragment r3 = (com.whatsapp.calling.views.PermissionDialogFragment) r3
            if (r0 == 0) goto L_0x0165
            r0 = 1
            r3.A0B = r0
            X.01I r0 = r3.A0i()
            X.AnonymousClass3UJ.A06(r0)
            return
        L_0x0165:
            android.app.Dialog r0 = r3.A01
            r0.dismiss()
            X.0v0 r2 = r3.A08
            java.lang.String[] r1 = r3.A0E
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0F(r3, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48802i5.A02(android.view.View):void");
    }
}
