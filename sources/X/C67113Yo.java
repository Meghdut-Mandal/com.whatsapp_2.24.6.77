package X;

import android.view.View;

/* renamed from: X.3Yo  reason: invalid class name and case insensitive filesystem */
public class C67113Yo implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C67113Yo(C1271967i r1, C140456lc r2, C160377ku r3, int i) {
        this.A03 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = r2;
                this.A02 = r3;
                this.A00 = r1;
                return;
            default:
                this.A00 = r2;
                this.A01 = r3;
                this.A02 = r1;
                return;
        }
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new C67113Yo(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0333, code lost:
        X.C36371kC.A16(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0336, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0553, code lost:
        r3 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0557, code lost:
        r4.Bdd(r3, X.AnonymousClass6WN.A00(r6, r5), X.AnonymousClass6WN.A02(r6, r5), X.AnonymousClass6WN.A01(r6, r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0566, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0567, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0662, code lost:
        r7 = 35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0668, code lost:
        if (r6.A0G() == false) goto L_0x06a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x066a, code lost:
        r10 = X.C36421kH.A0P(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x066e, code lost:
        if (r5 != false) goto L_0x0696;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0670, code lost:
        r3 = r9.A00;
        r8 = r3.A0G;
        r2 = X.AnonymousClass3UL.A04(r3.A0A, r3.A0K, r3.A0T, r6);
        r1 = r3.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x068c, code lost:
        if (X.C36421kH.A1a(r3.A0F.A0T.A01) != false) goto L_0x0690;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x068e, code lost:
        r7 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0694, code lost:
        if (r8.BPb(r1, r10, r2, r7) != false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0696, code lost:
        r3 = r9.A00;
        com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A0A(r3, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x069b, code lost:
        r3.A0F.A0Y(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x06a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06a1, code lost:
        r3 = r9.A00;
        r2 = r3.A0G;
        r1 = r3.A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x06b3, code lost:
        if (X.C36421kH.A1a(r3.A0F.A0T.A01) != false) goto L_0x06b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x06b5, code lost:
        r7 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x06b7, code lost:
        r2.Bua(r1, r6, r7, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x070c, code lost:
        r5 = r0.A00;
        r4 = r5.A0h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0712, code lost:
        if (r4 == null) goto L_0x0736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0714, code lost:
        r3 = true;
        r0 = X.AnonymousClass000.A1S(r8.A08, 2);
        r2 = r5.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x071f, code lost:
        if (r0 == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0727, code lost:
        if (X.C34681hT.A0N(r5.A0W) != false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0729, code lost:
        r2.BNr(r4, r8, 3, r3);
        r5.A0F.A0Y(r6, r8.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0733, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0734, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0736, code lost:
        com.whatsapp.util.Log.w("voip/CallsFragment no activity registered to join ongoing call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x073b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x089f, code lost:
        r3.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x08a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09ac, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09af, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0a7a, code lost:
        throw X.C36331k8.A0Z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0a81, code lost:
        throw X.C36331k8.A0d("groupParticipantsManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0a88, code lost:
        throw X.C36331k8.A0d("callsManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a89, code lost:
        r0 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a8b, code lost:
        if (r0 == null) goto L_0x0a97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a8d, code lost:
        ((X.AnonymousClass1ND) r0.get()).Bua(r5, r7, 16, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a96, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0a9d, code lost:
        throw X.C36331k8.A0d("callsManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018a, code lost:
        r5 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0194, code lost:
        if (r7.A0G() == false) goto L_0x0a89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0196, code lost:
        r4 = X.C36421kH.A0P(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019a, code lost:
        if (r6 != false) goto L_0x01c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x019c, code lost:
        r0 = r5.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x019e, code lost:
        if (r0 == null) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01a0, code lost:
        r3 = (X.AnonymousClass1ND) r0.get();
        r0 = r5.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a8, code lost:
        if (r0 == null) goto L_0x0a7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01aa, code lost:
        r2 = (X.AnonymousClass17X) r0.get();
        r1 = r5.A02;
        r0 = r5.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01b4, code lost:
        if (r0 == null) goto L_0x0a76;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01c4, code lost:
        if (r3.BPb(r5, r4, X.AnonymousClass3UL.A04(r1, (X.AnonymousClass16D) r0.get(), r2, r7), 16) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01c6, code lost:
        com.whatsapp.calling.fragment.CallConfirmationFragment.A08(r5, r7, 16, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01cd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r22) {
        /*
            r21 = this;
            r10 = r22
            r7 = r21
            int r0 = r7.A03
            switch(r0) {
                case 2: goto L_0x0455;
                case 3: goto L_0x0052;
                case 4: goto L_0x0478;
                case 5: goto L_0x0098;
                case 6: goto L_0x00c6;
                case 7: goto L_0x04bf;
                case 8: goto L_0x00f8;
                case 9: goto L_0x04dc;
                case 10: goto L_0x0505;
                case 11: goto L_0x0533;
                case 12: goto L_0x0569;
                case 13: goto L_0x0582;
                case 14: goto L_0x05a8;
                case 15: goto L_0x05bc;
                case 16: goto L_0x05db;
                case 17: goto L_0x05ed;
                case 18: goto L_0x05ff;
                case 19: goto L_0x063f;
                case 20: goto L_0x0651;
                case 21: goto L_0x06bb;
                case 22: goto L_0x06e9;
                case 23: goto L_0x06fb;
                case 24: goto L_0x0173;
                case 25: goto L_0x017f;
                case 26: goto L_0x073c;
                case 27: goto L_0x076d;
                case 28: goto L_0x0785;
                case 29: goto L_0x01ce;
                case 30: goto L_0x0255;
                case 31: goto L_0x0287;
                case 32: goto L_0x07b8;
                case 33: goto L_0x07e3;
                case 34: goto L_0x07ff;
                case 35: goto L_0x080f;
                case 36: goto L_0x0829;
                case 37: goto L_0x002a;
                case 38: goto L_0x02bf;
                case 39: goto L_0x033a;
                case 40: goto L_0x0838;
                case 41: goto L_0x03b6;
                case 42: goto L_0x0848;
                case 43: goto L_0x0883;
                case 44: goto L_0x08a3;
                case 45: goto L_0x08c4;
                case 46: goto L_0x08e6;
                case 47: goto L_0x08fe;
                case 48: goto L_0x0964;
                case 49: goto L_0x099d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r7.A01
            X.6lc r4 = (X.C140456lc) r4
            java.lang.Object r3 = r7.A02
            X.7ku r3 = (X.C160377ku) r3
            X.68b r2 = new X.68b
            r2.<init>()
            r0 = 0
            r2.A0A(r4, r0)
            java.lang.Object r1 = r7.A00
            X.67i r1 = (X.C1271967i) r1
            r0 = 1
            r2.A0A(r1, r0)
            X.6MO r0 = r2.A08()
            X.C131756Qk.A02(r1, r4, r0, r3)
        L_0x0029:
            return
        L_0x002a:
            java.lang.Object r3 = r7.A00
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r0 = r7.A01
            X.B66 r0 = (X.B66) r0
            java.lang.Object r4 = r7.A02
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            android.content.Context r1 = r3.getContext()
            java.lang.Class r0 = r0.BFn()
            android.content.Intent r2 = X.C36441kJ.A0H(r1, r0)
            X.9lY r0 = r4.A0M
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "extra_transaction_id"
            r2.putExtra(r0, r1)
            X.3Qa r0 = r4.A1J
            X.AnonymousClass3UJ.A00(r2, r0)
            goto L_0x0333
        L_0x0052:
            java.lang.Object r9 = r7.A00
            X.3Tz r9 = (X.C65923Tz) r9
            java.lang.Object r2 = r7.A01
            X.0wg r2 = (X.C19890wg) r2
            java.lang.Object r4 = r7.A02
            X.0v0 r4 = (X.C19420v0) r4
            X.1qK r0 = r9.A04
            if (r0 == 0) goto L_0x0069
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0069
            return
        L_0x0069:
            X.1qN r0 = r9.A03
            if (r0 == 0) goto L_0x0074
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x0074
            return
        L_0x0074:
            X.1mW r10 = (X.C37501mW) r10
            android.graphics.drawable.Drawable r0 = r10.A01
            if (r0 == 0) goto L_0x0029
            int[] r3 = r10.A04
            if (r3 == 0) goto L_0x0029
            boolean r0 = X.AnonymousClass3UO.A02(r3)
            if (r0 == 0) goto L_0x09b0
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r2.A00(r0)
            java.lang.String r0 = X.AnonymousClass3TY.A00(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0a6f
            X.C65923Tz.A01(r10, r9)
            return
        L_0x0098:
            java.lang.Object r0 = r7.A00
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.Object r1 = r7.A01
            X.02E r1 = (X.AnonymousClass02E) r1
            java.lang.Object r3 = r7.A02
            X.7yS r3 = (X.C167627yS) r3
            if (r0 == 0) goto L_0x0029
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0029
            java.lang.String r2 = r0.toString()
            if (r2 == 0) goto L_0x0029
            X.01I r0 = r1.A0i()
            X.14u r1 = X.C36401kF.A0L(r0)
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            r1.Bu1(r0)
            if (r3 == 0) goto L_0x0029
            r3.A0T(r2)
            return
        L_0x00c6:
            java.lang.Object r1 = r7.A00
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r6 = r7.A01
            X.6lc r6 = (X.C140456lc) r6
            java.lang.Object r5 = r7.A02
            X.67i r5 = (X.C1271967i) r5
            boolean r0 = r1.isChecked()
            r4 = r0 ^ 1
            r1.setChecked(r4)
            r0 = 40
            X.7ku r3 = r6.A0X(r0)
            if (r3 == 0) goto L_0x0029
            X.68b r2 = new X.68b
            r2.<init>()
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A0A(r0, r1)
            X.6MO r0 = r2.A08()
            X.C131756Qk.A02(r5, r6, r0, r3)
            return
        L_0x00f8:
            java.lang.Object r6 = r7.A00
            X.4Nh r6 = (X.C87054Nh) r6
            java.lang.Object r1 = r7.A01
            X.1yI r1 = (X.C42111yI) r1
            java.lang.Object r2 = r7.A02
            X.3uw r2 = (X.C80153uw) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.WaImageView r0 = r1.A00
            android.content.Context r1 = X.C36371kC.A0B(r0)
            java.lang.String r7 = r2.A01
            X.3dg r6 = (X.C69533dg) r6
            int r0 = X.C36341k9.A05(r1)
            int r0 = X.AnonymousClass00F.A00(r1, r0)
            com.whatsapp.mentions.MentionableEntry r9 = r6.A06
            android.text.Editable r5 = r9.getText()
            if (r5 == 0) goto L_0x015f
            X.1m9 r4 = new X.1m9
            r4.<init>(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "/"
            java.lang.String r8 = X.AnonymousClass000.A0p(r0, r7, r1)
            java.lang.String r2 = r5.toString()
            r1 = 47
            r0 = 0
            X.AnonymousClass00C.A0D(r2, r0)
            int r0 = r2.length()
            int r0 = r0 + -1
            int r3 = X.AnonymousClass099.A08(r2, r1, r0)
            int r2 = r9.getSelectionEnd()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r8)
            r0 = 32
            java.lang.String r0 = X.AnonymousClass000.A0t(r1, r0)
            r5.replace(r3, r2, r0)
            int r0 = X.C36441kJ.A09(r7, r3)
            int r1 = r0 + 1
            r0 = 33
            r5.setSpan(r4, r3, r1, r0)
        L_0x015f:
            com.whatsapp.jid.UserJid r2 = r6.A02
            if (r2 == 0) goto L_0x0029
            java.lang.String r0 = "imagine"
            boolean r0 = X.AnonymousClass00C.A0J(r7, r0)
            if (r0 == 0) goto L_0x0029
            X.1NM r1 = r6.A04
            X.2oa r0 = X.C51912oa.IMAGINE_CMD_IN_CMD_PICKER_CLICK
            r1.A08(r0, r2)
            return
        L_0x0173:
            java.lang.Object r1 = r7.A00
            X.2DY r1 = (X.AnonymousClass2DY) r1
            java.lang.Object r7 = r7.A02
            X.141 r7 = (X.AnonymousClass141) r7
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r6 = 1
            goto L_0x018a
        L_0x017f:
            java.lang.Object r1 = r7.A00
            X.2DY r1 = (X.AnonymousClass2DY) r1
            java.lang.Object r7 = r7.A02
            X.141 r7 = (X.AnonymousClass141) r7
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r6 = 0
        L_0x018a:
            X.4Nk r5 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r5 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r5
            boolean r0 = r7.A0G()
            r8 = 16
            if (r0 == 0) goto L_0x0a89
            com.whatsapp.jid.GroupJid r4 = X.C36421kH.A0P(r7)
            if (r6 != 0) goto L_0x01c6
            X.005 r0 = r5.A06
            if (r0 == 0) goto L_0x0a82
            java.lang.Object r3 = r0.get()
            X.1ND r3 = (X.AnonymousClass1ND) r3
            X.005 r0 = r5.A08
            if (r0 == 0) goto L_0x0a7b
            java.lang.Object r2 = r0.get()
            X.17X r2 = (X.AnonymousClass17X) r2
            X.0wQ r1 = r5.A02
            X.005 r0 = r5.A07
            if (r0 == 0) goto L_0x0a76
            java.lang.Object r0 = r0.get()
            X.16D r0 = (X.AnonymousClass16D) r0
            java.util.List r0 = X.AnonymousClass3UL.A04(r1, r0, r2, r7)
            boolean r0 = r3.BPb(r5, r4, r0, r8)
            if (r0 != 0) goto L_0x0029
        L_0x01c6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            com.whatsapp.calling.fragment.CallConfirmationFragment.A08(r5, r7, r0, r6)
            return
        L_0x01ce:
            java.lang.Object r3 = r7.A00
            X.27v r3 = (X.AnonymousClass27v) r3
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r7.A02
            X.391 r6 = (X.AnonymousClass391) r6
            int r0 = r1.size()
            r5 = 0
            r7 = 1
            if (r0 != r7) goto L_0x01fa
            java.lang.Object r0 = r1.get(r5)
            X.141 r0 = (X.AnonymousClass141) r0
            X.11F r0 = X.C36351kA.A0j(r0)
            java.lang.String r1 = X.AnonymousClass3U8.A04(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0029
            X.AnonymousClass27v.A0y(r3, r1)
            return
        L_0x01fa:
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            java.util.Iterator r8 = r1.iterator()
        L_0x0202:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x022f
            X.141 r1 = X.C36391kE.A0f(r8)
            X.0ts r0 = r3.A0I
            java.lang.String r2 = X.AnonymousClass171.A02(r3, r0, r1)
            X.11F r0 = X.C36351kA.A0j(r1)
            java.lang.String r1 = X.AnonymousClass3U8.A04(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0202
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0202
            X.3XG r0 = new X.3XG
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x0202
        L_0x022f:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0029
            r2 = 2131891032(0x7f121358, float:1.9416773E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            com.whatsapp.TextEmojiLabel r0 = r6.A02
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = X.C36391kE.A0v(r3, r0, r1, r5, r2)
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r2 = com.whatsapp.contact.picker.PhoneNumberSelectionDialog.A03(r0, r4)
            X.09Y r1 = X.C36341k9.A0O(r3)
            java.lang.String r0 = "phone_number_selection_dialog"
            r1.A0D(r2, r0)
            r1.A02()
            return
        L_0x0255:
            java.lang.Object r6 = r7.A00
            X.1vk r6 = (X.C40561vk) r6
            java.lang.Object r5 = r7.A01
            X.141 r5 = (X.AnonymousClass141) r5
            java.lang.Object r1 = r7.A02
            X.1yL r1 = (X.C42141yL) r1
            boolean r0 = r5.A0x
            if (r0 == 0) goto L_0x0029
            android.view.View r0 = r1.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131886161(0x7f120051, float:1.9406893E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            X.171 r0 = r6.A00
            X.C36361kB.A1F(r0, r5, r2, r1)
            java.lang.String r0 = r4.getString(r3, r2)
            r10.announceForAccessibility(r0)
            com.whatsapp.contact.picker.SelectedContactsList r0 = r6.A01
            X.4UZ r0 = r0.A08
            r0.B2c(r5)
            return
        L_0x0287:
            java.lang.Object r5 = r7.A00
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r1 = r7.A01
            X.0v5 r1 = (X.C19460v5) r1
            java.lang.Object r4 = r7.A02
            X.00S r4 = (X.AnonymousClass00S) r4
            r3 = 1
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x02a4
            r1.A02()
            java.lang.String r0 = "getMessageQRActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02a4:
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.qrcode.contactqr.ContactQrActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "scan"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            if (r4 == 0) goto L_0x0029
            r4.invoke()
            return
        L_0x02bf:
            java.lang.Object r3 = r7.A00
            X.2IH r3 = (X.AnonymousClass2IH) r3
            java.lang.Object r5 = r7.A01
            X.3T1 r5 = (X.AnonymousClass3T1) r5
            java.lang.Object r8 = r7.A02
            X.B66 r8 = (X.B66) r8
            X.9lY r0 = r5.A0M
            boolean r0 = r0.A0K()
            if (r0 == 0) goto L_0x0337
            X.9lY r0 = r5.A0M
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0337
            X.1EU r0 = r3.A09
            X.AnonymousClass1EU.A00(r0)
            X.1Ed r1 = r0.A05
            X.3Qa r4 = r5.A1J
            java.lang.String r0 = r4.A01
            X.9lY r7 = r1.A0J(r0)
            if (r7 == 0) goto L_0x0310
            X.9lY r6 = r5.A0M
            int r1 = r6.A02
            r0 = 18
            if (r1 == r0) goto L_0x0310
            X.11F r2 = r7.A0C
            boolean r1 = r7.A0Q
            java.lang.String r0 = r7.A0L
            X.3Qa r4 = new X.3Qa
            r4.<init>(r2, r0, r1)
            X.6c9 r0 = r6.A05()
            if (r0 == 0) goto L_0x0310
            X.1Yo r1 = r3.A0A
            X.9lY r0 = r5.A0M
            X.6c9 r0 = r0.A05()
            r1.A04(r0)
        L_0x0310:
            if (r8 == 0) goto L_0x0029
            java.lang.Class r1 = r8.BFn()
            if (r1 == 0) goto L_0x0029
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C36441kJ.A0H(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "chat"
            r2.putExtra(r1, r0)
            X.9lY r0 = r5.A0M
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "extra_transaction_id"
            r2.putExtra(r0, r1)
            X.AnonymousClass3UJ.A00(r2, r4)
        L_0x0333:
            X.C36371kC.A16(r2, r3)
            return
        L_0x0337:
            X.3Qa r4 = r5.A1J
            goto L_0x0310
        L_0x033a:
            java.lang.Object r3 = r7.A00
            X.2IH r3 = (X.AnonymousClass2IH) r3
            java.lang.Object r4 = r7.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            java.lang.Object r2 = r7.A02
            X.B66 r2 = (X.B66) r2
            X.0wQ r1 = r3.A0T
            X.9lY r0 = r4.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0D
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x0a9e
            X.0wQ r1 = r3.A0T
            X.9lY r0 = r4.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x0a9e
            X.9lC r2 = r3.A0B
            X.9lY r0 = r4.A0M
            java.lang.String r1 = r0.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0029
            java.util.HashSet r0 = r2.A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            X.9lC r2 = r3.A0B
            X.9lY r5 = r4.A0M
            if (r5 == 0) goto L_0x03a8
            java.lang.String r0 = r5.A0K
            if (r0 == 0) goto L_0x03a8
            int r1 = r5.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x03a8
            X.0wQ r1 = r2.A04
            com.whatsapp.jid.UserJid r0 = r5.A0D
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x03a8
            X.9lY r0 = r4.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 != 0) goto L_0x03a8
            java.util.HashSet r1 = r2.A00
            X.9lY r0 = r4.A0M
            java.lang.String r0 = r0.A0K
            r1.remove(r0)
            X.9lY r0 = r4.A0M
            java.lang.String r1 = r0.A0K
            X.3Qa r0 = r4.A1J
            X.C202179lC.A02(r2, r0, r1)
        L_0x03a8:
            android.view.View r1 = r3.A0G
            r0 = 0
            r1.setVisibility(r0)
            X.1RJ r1 = r3.A0H
            r0 = 8
            r1.A03(r0)
            return
        L_0x03b6:
            java.lang.Object r8 = r7.A00
            X.3fI r8 = (X.C70523fI) r8
            java.lang.Object r3 = r7.A01
            java.lang.Object r9 = r7.A02
            java.util.Set r9 = (java.util.Set) r9
            X.4Uv r0 = r8.A0M
            X.0wU r2 = r0.getWaWorkers()
            r1 = 10
            X.3v9 r0 = new X.3v9
            r0.<init>(r8, r3, r1)
            r2.Bp1(r0)
            X.0yW r4 = r8.A0d
            X.1DW r6 = r8.A0b
            X.17V r7 = r8.A0e
            X.1AW r5 = r8.A0s
            X.1EO r3 = r8.A0t
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0029
            java.util.Iterator r10 = r9.iterator()
            r2 = 0
            r8 = -1
            r11 = r2
            r1 = -1
        L_0x03e8:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0418
            X.3T1 r0 = X.C36391kE.A0l(r10)
            if (r1 != r8) goto L_0x03f7
            int r1 = r0.A1I
            r11 = r0
        L_0x03f7:
            int r0 = r0.A1I
            if (r1 == r0) goto L_0x03e8
        L_0x03fb:
            java.util.Iterator r1 = r9.iterator()
            r8 = 0
        L_0x0400:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x041a
            X.3T1 r0 = X.C36391kE.A0l(r1)
            if (r8 != 0) goto L_0x0411
            X.3Qa r0 = r0.A1J
            X.11F r8 = r0.A00
            goto L_0x0400
        L_0x0411:
            boolean r0 = X.C64933Qa.A05(r0, r8)
            if (r0 != 0) goto L_0x0400
            return
        L_0x0418:
            r2 = r11
            goto L_0x03fb
        L_0x041a:
            if (r8 == 0) goto L_0x0029
            X.2R4 r1 = new X.2R4
            r1.<init>()
            boolean r0 = X.AnonymousClass143.A0G(r8)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            int r0 = r9.size()
            java.lang.Long r0 = X.C36441kJ.A0y(r0)
            r1.A03 = r0
            java.lang.Integer r0 = X.C36361kB.A0i()
            r1.A02 = r0
            java.lang.String r0 = r8.getRawString()
            java.lang.String r0 = r7.A03(r0)
            r1.A04 = r0
            if (r2 == 0) goto L_0x0451
            int r0 = X.C55802vD.A00(r6, r2, r5, r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A01 = r0
        L_0x0451:
            r4.Bly(r1)
            return
        L_0x0455:
            java.lang.Object r4 = r7.A00
            X.3Tz r4 = (X.C65923Tz) r4
            java.lang.Object r0 = r7.A01
            X.0ts r0 = (X.C18820ts) r0
            java.lang.Object r3 = r7.A02
            X.3PU r3 = (X.AnonymousClass3PU) r3
            boolean r0 = X.C36351kA.A1Y(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0470
            int r1 = r3.A04
        L_0x046a:
            androidx.viewpager.widget.ViewPager r0 = r4.A0K
            r0.A0J(r1, r2)
            return
        L_0x0470:
            X.1nQ[] r0 = r4.A0P
            int r1 = r0.length
            int r1 = r1 - r2
            int r0 = r3.A04
            int r1 = r1 - r0
            goto L_0x046a
        L_0x0478:
            java.lang.Object r4 = r7.A00
            X.3Tz r4 = (X.C65923Tz) r4
            java.lang.Object r2 = r7.A01
            int[] r2 = (int[]) r2
            java.lang.Object r5 = r7.A02
            X.1mW r5 = (X.C37501mW) r5
            X.C65923Tz.A04(r4, r2)
            X.0wg r0 = r4.A0N
            X.AnonymousClass3TY.A03(r0, r2)
            r5.setEmoji(r2)
            X.2M9 r1 = new X.2M9
            r1.<init>(r2)
            r0 = 0
            long r10 = X.C1898996a.A00(r1, r0)
            X.1H2 r6 = r4.A0M
            android.content.Context r0 = r4.A0A
            android.content.res.Resources r7 = r0.getResources()
            X.2M9 r8 = new X.2M9
            r8.<init>(r2)
            r9 = 1061158912(0x3f400000, float:0.75)
            android.graphics.drawable.Drawable r3 = r6.A06(r7, r8, r9, r10)
            long r1 = r5.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x04b7
            r5.A01 = r3
            r5.invalidate()
        L_0x04b7:
            android.view.View r1 = r4.A0E
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x04bf:
            java.lang.Object r4 = r7.A00
            X.6lc r4 = (X.C140456lc) r4
            java.lang.Object r3 = r7.A01
            X.7ku r3 = (X.C160377ku) r3
            java.lang.Object r2 = r7.A02
            X.67i r2 = (X.C1271967i) r2
            X.68b r1 = new X.68b
            r1.<init>()
            r0 = 0
            r1.A0A(r4, r0)
            X.6MO r0 = r1.A08()
            X.C131756Qk.A02(r2, r4, r0, r3)
            return
        L_0x04dc:
            java.lang.Object r3 = r7.A00
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r0 = r7.A01
            X.1fu r0 = (X.C33771fu) r0
            android.content.pm.PackageManager r2 = r3.getPackageManager()
            android.net.Uri r0 = r0.A00()
            android.content.Intent r1 = X.C36391kE.A0G(r0)
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            if (r0 == 0) goto L_0x0501
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0501
            r3.startActivity(r1)
        L_0x0501:
            r3.finish()
            return
        L_0x0505:
            java.lang.Object r6 = r7.A00
            X.6WN r6 = (X.AnonymousClass6WN) r6
            java.lang.Object r5 = r7.A01
            X.5EL r5 = (X.AnonymousClass5EL) r5
            java.lang.Object r4 = r7.A02
            android.view.View r4 = (android.view.View) r4
            X.6s9 r7 = r5.A0B
            X.7gC r3 = r5.A09
            X.7lq r2 = r5.A0A
            X.6V2 r1 = r6.A0H
            java.lang.String r0 = r7.A0F
            r1.A04(r4, r3, r2, r0)
            X.7jF r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0567
            boolean r0 = r7.A0P
            boolean r1 = r7.A0R
            if (r0 == 0) goto L_0x052f
            r0 = 0
            if (r1 == 0) goto L_0x0553
            r0 = 5
            goto L_0x0553
        L_0x052f:
            if (r1 == 0) goto L_0x0567
            r0 = 4
            goto L_0x0553
        L_0x0533:
            java.lang.Object r6 = r7.A00
            X.6WN r6 = (X.AnonymousClass6WN) r6
            java.lang.Object r5 = r7.A01
            X.5EL r5 = (X.AnonymousClass5EL) r5
            java.lang.Object r4 = r7.A02
            android.view.View r4 = (android.view.View) r4
            X.6s9 r0 = r5.A0B
            X.7gC r3 = r5.A09
            X.7lq r2 = r5.A0A
            X.6V2 r1 = r6.A0H
            java.lang.String r0 = r0.A0F
            r1.A04(r4, r3, r2, r0)
            X.7jF r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0567
            r0 = 2
        L_0x0553:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0557:
            java.lang.Integer r2 = X.AnonymousClass6WN.A00(r6, r5)
            java.lang.Integer r1 = X.AnonymousClass6WN.A02(r6, r5)
            java.lang.Integer r0 = X.AnonymousClass6WN.A01(r6, r5)
            r4.Bdd(r3, r2, r1, r0)
            return
        L_0x0567:
            r3 = 0
            goto L_0x0557
        L_0x0569:
            java.lang.Object r2 = r7.A00
            X.6Za r2 = (X.C133566Za) r2
            java.lang.Object r0 = r7.A01
            X.4PN r0 = (X.AnonymousClass4PN) r0
            java.lang.Object r3 = r7.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            r0.BaF()
            r1 = 1
            r2.A0D = r1
            X.5DR r0 = r2.A0J
            r0.A02(r1)
            goto L_0x089f
        L_0x0582:
            java.lang.Object r4 = r7.A00
            X.2Xr r4 = (X.AnonymousClass2Xr) r4
            java.lang.Object r3 = r7.A01
            X.3Fo r3 = (X.C62283Fo) r3
            java.lang.Object r2 = r7.A02
            androidx.appcompat.widget.AppCompatCheckBox r1 = r4.A00
            boolean r0 = r1.isChecked()
            r3.A00 = r0
            boolean r1 = r1.isChecked()
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = r4.A01
            X.1sN r0 = r0.A03
            java.util.Set r0 = r0.A03
            if (r1 == 0) goto L_0x05a4
            r0.add(r2)
            return
        L_0x05a4:
            r0.remove(r2)
            return
        L_0x05a8:
            java.lang.Object r2 = r7.A01
            X.6bf r2 = (X.C134826bf) r2
            java.lang.Object r1 = r7.A02
            X.02t r1 = (X.C006302t) r1
            X.C36321k7.A0x(r2, r1)
            X.6bB r0 = r2.A05
            r0.A00()
            r1.invoke(r2)
            return
        L_0x05bc:
            java.lang.Object r4 = r7.A00
            X.1wT r4 = (X.C41011wT) r4
            java.lang.Object r0 = r7.A01
            X.141 r0 = (X.AnonymousClass141) r0
            java.lang.Object r3 = r7.A02
            X.1yd r3 = (X.C42321yd) r3
            r2 = 0
            X.11F r1 = X.C36351kA.A0j(r0)
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.widget.ImageView r0 = r3.A02
            X.3Pd r1 = X.C64713Pd.A00(r0, r1, r2)
            com.whatsapp.calling.callhistory.group.GroupCallLogActivity r0 = r4.A01
            r1.A02(r0)
            return
        L_0x05db:
            java.lang.Object r1 = r7.A00
            X.4o1 r1 = (X.C96864o1) r1
            java.lang.Object r4 = r7.A01
            X.3dw r4 = (X.C69693dw) r4
            java.lang.Object r6 = r7.A02
            X.141 r6 = (X.AnonymousClass141) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r5 = 0
            X.1de r9 = r1.A00
            goto L_0x0662
        L_0x05ed:
            java.lang.Object r1 = r7.A00
            X.4o1 r1 = (X.C96864o1) r1
            java.lang.Object r4 = r7.A01
            X.3dw r4 = (X.C69693dw) r4
            java.lang.Object r6 = r7.A02
            X.141 r6 = (X.AnonymousClass141) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r5 = 1
            X.1de r9 = r1.A00
            goto L_0x0662
        L_0x05ff:
            java.lang.Object r2 = r7.A00
            X.0yB r2 = (X.C20800yB) r2
            java.lang.Object r1 = r7.A01
            X.005 r1 = (X.AnonymousClass005) r1
            java.lang.Object r3 = r7.A02
            android.view.View r3 = (android.view.View) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r0 = 3
            X.AnonymousClass00C.A0D(r10, r0)
            r0 = 5370(0x14fa, float:7.525E-42)
            int r0 = r2.A07(r0)
            if (r0 <= 0) goto L_0x062d
            r0 = 5757(0x167d, float:8.067E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x062d
            java.lang.Object r2 = r1.get()
            X.6W1 r2 = (X.AnonymousClass6W1) r2
            X.0wk r1 = r2.A03
            r0 = 0
            X.C80223v3.A01(r1, r2, r0)
        L_0x062d:
            android.content.Context r2 = r3.getContext()
            android.content.Context r1 = r10.getContext()
            r0 = 16
            android.content.Intent r0 = X.C36381kD.A0C(r1, r0)
            r2.startActivity(r0)
            return
        L_0x063f:
            java.lang.Object r1 = r7.A00
            X.4o5 r1 = (X.C96904o5) r1
            java.lang.Object r4 = r7.A01
            X.3dx r4 = (X.C69703dx) r4
            java.lang.Object r6 = r7.A02
            X.141 r6 = (X.AnonymousClass141) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r5 = 0
            X.1de r9 = r1.A01
            goto L_0x0662
        L_0x0651:
            java.lang.Object r1 = r7.A00
            X.4o5 r1 = (X.C96904o5) r1
            java.lang.Object r4 = r7.A01
            X.3dx r4 = (X.C69703dx) r4
            java.lang.Object r6 = r7.A02
            X.141 r6 = (X.AnonymousClass141) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            r5 = 1
            X.1de r9 = r1.A01
        L_0x0662:
            boolean r0 = r6.A0G()
            r7 = 35
            if (r0 == 0) goto L_0x06a1
            com.whatsapp.jid.GroupJid r10 = X.C36421kH.A0P(r6)
            if (r5 != 0) goto L_0x0696
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r9.A00
            X.1ND r8 = r3.A0G
            X.17X r2 = r3.A0T
            X.0wQ r1 = r3.A0A
            X.16D r0 = r3.A0K
            java.util.List r2 = X.AnonymousClass3UL.A04(r1, r0, r2, r6)
            android.content.Context r1 = r3.A1D()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            X.1hh r0 = r0.A0T
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 != 0) goto L_0x0690
            r7 = 16
        L_0x0690:
            boolean r0 = r8.BPb(r1, r10, r2, r7)
            if (r0 != 0) goto L_0x069b
        L_0x0696:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r9.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A0A(r3, r6, r5)
        L_0x069b:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            r0.A0Y(r4, r5)
            return
        L_0x06a1:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r9.A00
            X.1ND r2 = r3.A0G
            android.content.Context r1 = r3.A0a()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0F
            X.1hh r0 = r0.A0T
            java.lang.CharSequence r0 = r0.A01
            boolean r0 = X.C36421kH.A1a(r0)
            if (r0 != 0) goto L_0x06b7
            r7 = 16
        L_0x06b7:
            r2.Bua(r1, r6, r7, r5)
            goto L_0x069b
        L_0x06bb:
            java.lang.Object r0 = r7.A00
            X.4o2 r0 = (X.C96874o2) r0
            java.lang.Object r6 = r7.A01
            X.5Nh r6 = (X.C107265Nh) r6
            java.lang.Object r5 = r7.A02
            X.6rO r5 = (X.C143956rO) r5
            X.C36391kE.A1T(r6)
            X.1df r0 = r0.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r4 = r0.A00
            X.01I r3 = r4.A0h()
            if (r3 == 0) goto L_0x0736
            int r1 = r6.A08
            r0 = 2
            boolean r2 = X.AnonymousClass000.A1S(r1, r0)
            X.1ND r1 = r4.A0G
            r0 = 3
            r1.BNr(r3, r6, r0, r2)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r4.A0F
            boolean r0 = r6.A0K
            r1.A0Y(r5, r0)
            return
        L_0x06e9:
            java.lang.Object r0 = r7.A00
            X.4o2 r0 = (X.C96874o2) r0
            java.lang.Object r8 = r7.A01
            X.5Nh r8 = (X.C107265Nh) r8
            java.lang.Object r6 = r7.A02
            X.6rO r6 = (X.C143956rO) r6
            X.C36391kE.A1T(r8)
            X.1df r0 = r0.A00
            goto L_0x070c
        L_0x06fb:
            java.lang.Object r0 = r7.A00
            X.809 r0 = (X.AnonymousClass809) r0
            java.lang.Object r8 = r7.A01
            X.5Nh r8 = (X.C107265Nh) r8
            java.lang.Object r6 = r7.A02
            X.6rO r6 = (X.C143956rO) r6
            X.C36391kE.A1T(r8)
            X.1df r0 = r0.A01
        L_0x070c:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r5 = r0.A00
            X.01I r4 = r5.A0h()
            if (r4 == 0) goto L_0x0736
            int r1 = r8.A08
            r3 = 1
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            X.1ND r2 = r5.A0G
            r1 = 3
            if (r0 == 0) goto L_0x0734
            X.0yC r0 = r5.A0W
            boolean r0 = X.C34681hT.A0N(r0)
            if (r0 != 0) goto L_0x0734
        L_0x0729:
            r2.BNr(r4, r8, r1, r3)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r1 = r5.A0F
            boolean r0 = r8.A0K
            r1.A0Y(r6, r0)
            return
        L_0x0734:
            r3 = 0
            goto L_0x0729
        L_0x0736:
            java.lang.String r0 = "voip/CallsFragment no activity registered to join ongoing call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x073c:
            java.lang.Object r2 = r7.A00
            com.whatsapp.companiondevice.SetDeviceNicknameFragment r2 = (com.whatsapp.companiondevice.SetDeviceNicknameFragment) r2
            java.lang.Object r5 = r7.A01
            java.lang.Object r1 = r7.A02
            android.widget.EditText r1 = (android.widget.EditText) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            X.00T r0 = r2.A06
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel r4 = (com.whatsapp.companiondevice.LinkedDeviceEnterNicknameViewModel) r4
            android.text.Editable r0 = r1.getText()
            if (r0 == 0) goto L_0x075e
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x0760
        L_0x075e:
            java.lang.String r3 = ""
        L_0x0760:
            X.0wU r2 = r4.A02
            r1 = 36
            X.74l r0 = new X.74l
            r0.<init>(r4, r5, r3, r1)
            r2.Boy(r0)
            return
        L_0x076d:
            java.lang.Object r2 = r7.A00
            X.2Gc r2 = (X.AnonymousClass2Gc) r2
            java.lang.Object r1 = r7.A01
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r0 = r7.A02
            X.2Fy r0 = (X.C43272Fy) r0
            com.whatsapp.contact.picker.ContactPickerFragment r2 = r2.A05
            java.lang.String r1 = r1.A0J()
            java.util.List r0 = r0.A00
            r2.A1y(r1, r0)
            return
        L_0x0785:
            java.lang.Object r4 = r7.A00
            X.27v r4 = (X.AnonymousClass27v) r4
            java.lang.Object r3 = r7.A01
            X.141 r3 = (X.AnonymousClass141) r3
            java.lang.Object r2 = r7.A02
            X.3Gg r2 = (X.C62463Gg) r2
            boolean r0 = r4.A48(r3)
            if (r0 == 0) goto L_0x079f
            boolean r0 = r3.A0x
            if (r0 != 0) goto L_0x079f
            r4.A3y(r3)
            return
        L_0x079f:
            boolean r0 = r4.A48(r3)
            if (r0 == 0) goto L_0x07b4
            boolean r0 = r3.A0x
            if (r0 == 0) goto L_0x07b4
            r0 = 2131894892(0x7f12226c, float:1.9424602E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 1
            r2.A00(r1, r0)
        L_0x07b4:
            r4.B2c(r3)
            return
        L_0x07b8:
            java.lang.Object r0 = r7.A00
            X.0wD r0 = (X.C19600wD) r0
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r7.A02
            X.17Y r2 = (X.AnonymousClass17Y) r2
            r1 = 0
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x07dc
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.calllink.view.CallLinkActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x07dc:
            r0 = 2131887345(0x7f1204f1, float:1.9409294E38)
            r2.A06(r0, r1)
            return
        L_0x07e3:
            java.lang.Object r4 = r7.A00
            X.28d r4 = (X.AnonymousClass28d) r4
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r7.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            X.141 r0 = r4.A0I
            X.11F r1 = r0.A0H
            boolean r0 = r4.A0L
            r0 = r0 ^ 1
            android.content.Intent r0 = X.AnonymousClass190.A0p(r3, r1, r0)
            X.C05290Pd.A00(r3, r0, r2)
            return
        L_0x07ff:
            java.lang.Object r2 = r7.A00
            X.5Iz r2 = (X.C106265Iz) r2
            java.lang.Object r1 = r7.A01
            X.8Yy r1 = (X.C174918Yy) r1
            java.lang.Object r0 = r7.A02
            X.5Nh r0 = (X.C107265Nh) r0
            X.C174918Yy.A0C(r2, r1, r0)
            return
        L_0x080f:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r7.A01
            X.B66 r3 = (X.B66) r3
            java.lang.Object r0 = r7.A02
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            android.content.Context r2 = r1.getContext()
            X.4V7 r1 = X.AnonymousClass3SS.A02(r1)
            X.9lY r0 = r0.A0M
            r3.BQa(r2, r1, r0)
            return
        L_0x0829:
            java.lang.Object r0 = r7.A00
            android.view.View r0 = (android.view.View) r0
            r0.getContext()
            android.content.Context r0 = r0.getContext()
            X.AnonymousClass3SS.A01(r0)
            return
        L_0x0838:
            java.lang.Object r2 = r7.A00
            X.8Yw r2 = (X.C174898Yw) r2
            java.lang.Object r1 = r7.A01
            X.2bJ r1 = (X.AnonymousClass2bJ) r1
            java.lang.Object r0 = r7.A02
            android.content.Context r0 = (android.content.Context) r0
            r2.A2E(r0, r1)
            return
        L_0x0848:
            java.lang.Object r6 = r7.A00
            X.14u r6 = (X.C225314u) r6
            java.lang.Object r1 = r7.A01
            X.383 r1 = (X.AnonymousClass383) r1
            java.lang.Object r5 = r7.A02
            X.1Uw r5 = (X.C28981Uw) r5
            r4 = 1
            X.005 r0 = r1.A02
            java.lang.Object r3 = X.C36411kG.A0v(r0)
            X.0y9 r3 = (X.C20780y9) r3
            X.3hE r0 = r1.A01
            X.00s r2 = r0.A00
            r1 = 9
            X.4ZI r0 = new X.4ZI
            r0.<init>(r5, r1)
            X.08S r0 = X.AnonymousClass0VV.A00(r0, r2)
            java.lang.Object r0 = r0.A04()
            X.3IZ r0 = (X.AnonymousClass3IZ) r0
            r1 = 1
            if (r0 == 0) goto L_0x0881
            X.2La r0 = r0.A00
            boolean r0 = r0.A0L()
            if (r0 != r4) goto L_0x0881
        L_0x087d:
            X.C200659hu.A00(r6, r3, r5, r1)
            return
        L_0x0881:
            r1 = 0
            goto L_0x087d
        L_0x0883:
            java.lang.Object r2 = r7.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r0 = r7.A01
            X.3Fy r0 = (X.C62383Fy) r0
            java.lang.Object r3 = r7.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            X.0xT r1 = r0.A01
            java.lang.String r0 = "728928448599090"
            android.content.Intent r1 = X.C36341k9.A0D(r1, r0)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            r2.startActivity(r1)
        L_0x089f:
            r3.dismiss()
            return
        L_0x08a3:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r3 = r7.A01
            X.3J9 r3 = (X.AnonymousClass3J9) r3
            java.lang.Object r2 = r7.A02
            X.3J9 r2 = (X.AnonymousClass3J9) r2
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            android.view.View r1 = r1.getRootView()
            r0 = 8
            r1.setVisibility(r0)
            X.4T9 r1 = r3.A01
            X.AUj r0 = r2.A02
            r1.BVu(r0)
            return
        L_0x08c4:
            java.lang.Object r0 = r7.A00
            X.2iT r0 = (X.C49042iT) r0
            java.lang.Object r4 = r7.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.Object r3 = r7.A02
            android.app.Dialog r3 = (android.app.Dialog) r3
            com.whatsapp.group.GroupMembersSelector r2 = r0.A00
            X.190 r1 = X.C36441kJ.A0j()
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Intent r0 = X.C36391kE.A0F(r0, r1, r4)
            r2.startActivity(r0)
            r3.dismiss()
            goto L_0x09ac
        L_0x08e6:
            java.lang.Object r5 = r7.A00
            X.3B1 r5 = (X.AnonymousClass3B1) r5
            java.lang.Object r4 = r7.A01
            X.147 r4 = (X.AnonymousClass147) r4
            java.lang.Object r3 = r7.A02
            X.147 r3 = (X.AnonymousClass147) r3
            X.040 r2 = r5.A0A
            r1 = 0
            com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1 r0 = new com.whatsapp.group.SuggestGroupResultHandler$showSnackBar$1$1$1$1
            r0.<init>(r5, r4, r3, r1)
            X.C36331k8.A1T(r0, r2)
            return
        L_0x08fe:
            java.lang.Object r6 = r7.A00
            com.whatsapp.inappsupport.ui.SupportVideoActivity r6 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r6
            java.lang.Object r5 = r7.A01
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            java.lang.Object r4 = r7.A02
            X.38P r4 = (X.AnonymousClass38P) r4
            r3 = 0
            r0 = 2
            X.AnonymousClass00C.A0D(r4, r0)
            X.3Qq r1 = r6.A3i()
            X.3Qq r0 = r6.A3i()
            boolean r0 = r0.A0b()
            r0 = r0 ^ 1
            r1.A0W(r0)
            X.3Qq r0 = r6.A3i()
            boolean r2 = r0.A0b()
            r1 = 2131234052(0x7f080d04, float:1.8084259E38)
            r0 = 2131894726(0x7f1221c6, float:1.9424265E38)
            if (r2 == 0) goto L_0x0936
            r1 = 2131234054(0x7f080d06, float:1.8084263E38)
            r0 = 2131894727(0x7f1221c7, float:1.9424267E38)
        L_0x0936:
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r0, r3)
            r0.show()
            r0 = 2131103013(0x7f060d25, float:1.781848E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass3UF.A01(r6, r1, r0)
            r5.setImageDrawable(r0)
            X.9SQ r1 = r4.A02
            X.3Qq r0 = r4.A03
            int r5 = r0.A04()
            int r6 = r0.A05()
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x0961
            java.lang.String r3 = "on"
        L_0x095b:
            r4 = 4
            r2 = 0
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0961:
            java.lang.String r3 = "off"
            goto L_0x095b
        L_0x0964:
            java.lang.Object r0 = r7.A00
            X.1vy r0 = (X.C40701vy) r0
            java.lang.Object r1 = r7.A01
            X.141 r1 = (X.AnonymousClass141) r1
            java.lang.Object r2 = r7.A02
            X.34t r2 = (X.C596534t) r2
            android.content.Context r0 = r0.A04
            android.app.Activity r5 = X.C24801Dv.A00(r0)
            X.14u r5 = (X.C225314u) r5
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = X.C36381kD.A0e(r1, r0)
            X.2bQ r0 = r2.A01
            com.whatsapp.invites.RevokeInviteDialogFragment r4 = new com.whatsapp.invites.RevokeInviteDialogFragment
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass001.A07()
            X.C18740tg.A06(r1)
            X.C36371kC.A1B(r3, r1)
            long r1 = r0.A1N
            java.lang.String r0 = "invite_row_id"
            r3.putLong(r0, r1)
            r4.A17(r3)
            r5.Btm(r4)
            return
        L_0x099d:
            java.lang.Object r2 = r7.A00
            com.whatsapp.invites.InviteGroupParticipantsActivity r2 = (com.whatsapp.invites.InviteGroupParticipantsActivity) r2
            java.lang.Object r1 = r7.A01
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r0 = r7.A02
            X.147 r0 = (X.AnonymousClass147) r0
            com.whatsapp.invites.InviteGroupParticipantsActivity.A01(r2, r0, r1)
        L_0x09ac:
            r2.finish()
            return
        L_0x09b0:
            boolean r0 = X.AnonymousClass3UO.A03(r3)
            if (r0 == 0) goto L_0x0a72
            android.content.SharedPreferences r1 = X.C36341k9.A0E(r4)
            java.lang.String r0 = "skin_emoji_tip"
            int r1 = X.C36371kC.A01(r1, r0)
            r0 = 1
            if (r1 >= r0) goto L_0x0a57
            int r0 = r1 + 1
            r4.A1F(r0)
            int[] r12 = r10.A04
            android.view.View r8 = r9.A0E
            r0 = 2131427709(0x7f0b017d, float:1.8477042E38)
            android.view.ViewGroup r7 = X.C36411kG.A0P(r8, r0)
            r7.removeAllViews()
            android.content.Context r13 = r9.A0A
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166430(0x7f0704de, float:1.7947105E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131166428(0x7f0704dc, float:1.7947101E38)
            int r0 = r1.getDimensionPixelSize(r0)
            int r0 = r6 - r0
            int r5 = r0 / 2
            int[][] r14 = X.AnonymousClass3UO.A0A(r12)
            r4 = 6
            r11 = 0
            r3 = 0
        L_0x09f9:
            r2 = r14[r3]
            android.widget.ImageView r1 = X.C36361kB.A0L(r8)
            r1.setPadding(r5, r5, r5, r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r6, r6)
            r1.setLayoutParams(r0)
            X.1H2 r15 = r9.A0M
            android.content.res.Resources r16 = r13.getResources()
            r19 = -1
            X.2M9 r0 = new X.2M9
            r0.<init>(r2)
            r18 = 1061158912(0x3f400000, float:0.75)
            r17 = r0
            android.graphics.drawable.Drawable r0 = r15.A06(r16, r17, r18, r19)
            r1.setImageDrawable(r0)
            r0 = 4
            A00(r1, r9, r2, r10, r0)
            r7.addView(r1)
            int r3 = r3 + 1
            if (r3 < r4) goto L_0x09f9
            r0 = 2131433518(0x7f0b182e, float:1.8488824E38)
            android.widget.ImageView r1 = X.C36391kE.A0N(r8, r0)
            r1.setPadding(r5, r5, r5, r5)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r1.setScaleType(r0)
            android.content.res.Resources r16 = r13.getResources()
            X.2M9 r0 = new X.2M9
            r0.<init>(r12)
            r17 = r0
            android.graphics.drawable.Drawable r0 = r15.A06(r16, r17, r18, r19)
            r1.setImageDrawable(r0)
            r8.setVisibility(r11)
            return
        L_0x0a57:
            java.lang.String r0 = "emoji_modifiers"
            android.content.SharedPreferences r1 = r2.A00(r0)
            java.lang.String r0 = X.AnonymousClass3TY.A01(r3)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0a6b
            X.C65923Tz.A02(r10, r9)
            return
        L_0x0a6b:
            X.AnonymousClass3TY.A03(r2, r3)
            goto L_0x0a72
        L_0x0a6f:
            X.AnonymousClass3TY.A02(r2, r3)
        L_0x0a72:
            X.C65923Tz.A04(r9, r3)
            return
        L_0x0a76:
            java.lang.RuntimeException r0 = X.C36331k8.A0Z()
            throw r0
        L_0x0a7b:
            java.lang.String r0 = "groupParticipantsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a82:
            java.lang.String r0 = "callsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a89:
            X.005 r0 = r5.A06
            if (r0 == 0) goto L_0x0a97
            java.lang.Object r0 = r0.get()
            X.1ND r0 = (X.AnonymousClass1ND) r0
            r0.Bua(r5, r7, r8, r6)
            return
        L_0x0a97:
            java.lang.String r0 = "callsManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0a9e:
            android.content.Context r1 = r3.getContext()
            java.lang.Class r0 = r2.BFn()
            android.content.Intent r1 = X.C36441kJ.A0H(r1, r0)
            X.3Qa r0 = r4.A1J
            X.AnonymousClass3UJ.A00(r1, r0)
            X.C36371kC.A16(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67113Yo.onClick(android.view.View):void");
    }

    public C67113Yo(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
    }
}
