package X;

import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;

/* renamed from: X.1dg  reason: invalid class name and case insensitive filesystem */
public class C32481dg {
    public final /* synthetic */ CallsHistoryFragmentV2 A00;

    public C32481dg(CallsHistoryFragmentV2 callsHistoryFragmentV2) {
        this.A00 = callsHistoryFragmentV2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        if (X.C34681hT.A0P(r2.A0W, r2.A0T.A07.A0B(r9)) != false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0188, code lost:
        if (r7.BPc(r8, r9, r10, r11, true, r13, false) == false) goto L_0x0136;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C143946rN r22, X.C1028452e r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = r0.A00
            X.0V9 r0 = r2.A03
            if (r0 == 0) goto L_0x000e
            r0 = r23
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r0, r2)
            return
        L_0x000e:
            X.01I r15 = r2.A0h()
            if (r15 != 0) goto L_0x001a
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked activity null"
        L_0x0016:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x001a:
            r4 = r22
            X.72P r8 = r4.A01
            java.util.ArrayList r7 = r8.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)
            r14 = 0
            java.lang.Object r6 = r0.get(r14)
            X.5Nh r6 = (X.C107265Nh) r6
            X.141 r5 = r4.A03
            boolean r0 = r7.isEmpty()
            r3 = r24
            if (r0 != 0) goto L_0x0063
            java.lang.Object r0 = r7.get(r14)
            X.5Nh r0 = (X.C107265Nh) r0
            X.3Ir r1 = r0.A0C
            if (r1 == 0) goto L_0x0063
            boolean r0 = r15 instanceof X.C225314u
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r1.A02
            java.lang.String r0 = X.AnonymousClass3UD.A05(r0, r3)
            android.net.Uri r6 = android.net.Uri.parse(r0)
            X.1ND r5 = r2.A0G
            X.14u r15 = (X.C225314u) r15
            X.1fu r0 = r2.A0C
            r0.A00()
            X.17Y r1 = r2.A09
            r0 = 12
            X.AnonymousClass3UL.A06(r6, r15, r1, r5, r0)
        L_0x005d:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r2.A0F
            r0.A0Y(r4, r3)
            return
        L_0x0063:
            boolean r0 = r8.A04()
            if (r0 == 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00d3
            X.0yb r0 = r2.A0P
            android.view.inputmethod.InputMethodManager r1 = r0.A0N()
            android.view.View r0 = r15.getCurrentFocus()
            if (r1 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            android.os.IBinder r0 = r0.getWindowToken()
            r1.hideSoftInputFromWindow(r0, r14)
        L_0x0080:
            boolean r0 = r15 instanceof X.C225314u
            if (r0 == 0) goto L_0x00bf
            X.0yC r0 = r2.A0W
            boolean r0 = X.C34681hT.A0R(r0, r14)
            if (r0 == 0) goto L_0x00bf
            X.14u r15 = (X.C225314u) r15
            X.6by r5 = r6.A04
            X.AnonymousClass00C.A0D(r5, r14)
            com.whatsapp.calling.callconfirmationsheet.ui.AdhocCallConfirmationSheet r8 = new com.whatsapp.calling.callconfirmationsheet.ui.AdhocCallConfirmationSheet
            r8.<init>()
            r0 = 2
            X.011[] r7 = new X.AnonymousClass011[r0]
            java.lang.String r1 = "call_log_message_key"
            X.011 r0 = new X.011
            r0.<init>(r1, r5)
            r7[r14] = r0
            r6 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r6)
            java.lang.String r1 = "is_from_call_log"
            X.011 r0 = new X.011
            r0.<init>(r1, r5)
            r7[r6] = r0
            android.os.Bundle r0 = X.C05430Pr.A00(r7)
            r8.A17(r0)
            java.lang.String r0 = "LGCCallConfirmationSheet"
            r15.Btl(r8, r0)
            goto L_0x005d
        L_0x00bf:
            X.0yC r5 = r2.A0W
            X.0wQ r1 = r2.A0A
            X.16D r0 = r2.A0K
            r20 = 21
            r18 = r5
            r19 = r6
            r16 = r1
            r17 = r0
            X.AnonymousClass3UD.A06(r15, r16, r17, r18, r19, r20)
            goto L_0x005d
        L_0x00d3:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r2.A0F
            X.1hh r0 = r0.A0T
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            r11 = 2
            r12 = 1
            if (r0 == 0) goto L_0x00f6
            r11 = 35
        L_0x00e5:
            boolean r0 = r8.A04()
            if (r0 != 0) goto L_0x011c
            X.141 r1 = r8.A02()
            X.1ND r0 = r2.A0G
            r0.Bua(r15, r1, r11, r3)
            goto L_0x005d
        L_0x00f6:
            int r0 = r8.A00()
            if (r0 == 0) goto L_0x00e5
            if (r0 == r12) goto L_0x0119
            if (r0 == r11) goto L_0x0117
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onCallButtonClicked call origin null. Call type: "
            r1.append(r0)
            int r0 = r8.A00()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0016
        L_0x0117:
            r11 = 1
            goto L_0x00e5
        L_0x0119:
            r11 = 9
            goto L_0x00e5
        L_0x011c:
            if (r5 == 0) goto L_0x005d
            boolean r0 = r15 instanceof X.C225314u
            if (r0 == 0) goto L_0x005d
            com.whatsapp.jid.GroupJid r9 = r6.A0D
            if (r24 == 0) goto L_0x015c
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x015c
            java.lang.Object r0 = r7.get(r14)
            X.5Nh r0 = (X.C107265Nh) r0
            com.whatsapp.jid.GroupJid r0 = r0.A0D
            if (r0 == 0) goto L_0x015c
        L_0x0136:
            X.14u r15 = (X.C225314u) r15
            boolean r0 = r5.A0G()
            if (r0 == 0) goto L_0x018b
            X.0yC r0 = r2.A0W
            boolean r0 = X.C34681hT.A0R(r0, r14)
            if (r0 == 0) goto L_0x018b
            java.lang.Class<X.147> r0 = X.AnonymousClass147.class
            com.whatsapp.jid.Jid r0 = r5.A06(r0)
            X.C18740tg.A06(r0)
            X.147 r0 = (X.AnonymousClass147) r0
            com.whatsapp.calling.callconfirmationsheet.ui.LGCCallConfirmationSheet r1 = X.C53402rG.A00(r0, r11, r3)
            java.lang.String r0 = "LGCCallConfirmationSheet"
            r15.Btl(r1, r0)
            goto L_0x005d
        L_0x015c:
            int r0 = r6.A08
            if (r0 == r12) goto L_0x0136
            X.1ND r7 = r2.A0G
            X.17X r6 = r2.A0T
            X.0wQ r1 = r2.A0A
            X.16D r0 = r2.A0K
            java.util.List r10 = X.AnonymousClass3UL.A04(r1, r0, r6, r5)
            android.content.Context r8 = r2.A1D()
            if (r9 == 0) goto L_0x0183
            X.0yC r1 = r2.A0W
            X.17X r0 = r2.A0T
            X.17r r0 = r0.A07
            int r0 = r0.A0B(r9)
            boolean r0 = X.C34681hT.A0P(r1, r0)
            r13 = 1
            if (r0 == 0) goto L_0x0184
        L_0x0183:
            r13 = 0
        L_0x0184:
            boolean r0 = r7.BPc(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != 0) goto L_0x005d
            goto L_0x0136
        L_0x018b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            com.whatsapp.calling.fragment.CallConfirmationFragment.A08(r15, r5, r0, r3)
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32481dg.A00(X.6rN, X.52e, boolean):void");
    }
}
