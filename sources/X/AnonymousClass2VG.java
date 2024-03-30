package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.group.GroupChatInfoActivity;

/* renamed from: X.2VG  reason: invalid class name */
public class AnonymousClass2VG extends C61483Cb {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextEmojiLabel A03;
    public final TextEmojiLabel A04;
    public final TextEmojiLabel A05;
    public final AnonymousClass3SF A06;
    public final ImageView A07;
    public final C589531r A08;
    public final /* synthetic */ GroupChatInfoActivity A09;

    public AnonymousClass2VG(View view, C589531r r4, GroupChatInfoActivity groupChatInfoActivity) {
        this.A09 = groupChatInfoActivity;
        this.A01 = C012005e.A02(view, R.id.group_chat_info_layout_root);
        this.A06 = AnonymousClass3SF.A01(view, groupChatInfoActivity.A0R, R.id.name);
        this.A03 = C36401kF.A0O(view, R.id.status);
        ImageView A0G = C36401kF.A0G(view, R.id.wdsProfilePicture);
        C36381kD.A1B(A0G, C012005e.A02(view, R.id.avatar));
        this.A07 = A0G;
        this.A02 = C36391kE.A0O(view, R.id.owner);
        this.A05 = C36401kF.A0O(view, R.id.secondary_name_view);
        this.A04 = C36401kF.A0O(view, R.id.secondary_name_alternative_view);
        this.A00 = C012005e.A02(view, R.id.group_chat_info_layout);
        this.A08 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01d9, code lost:
        if (r13 <= 0) goto L_0x01db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C87834Qi r25, X.C61953Ed r26, java.util.ArrayList r27) {
        /*
            r24 = this;
            r12 = r25
            r13 = r24
            r13.A00 = r12
            android.widget.TextView r11 = r13.A02
            r10 = 8
            r11.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r3 = r13.A05
            r3.setVisibility(r10)
            com.whatsapp.TextEmojiLabel r4 = r13.A04
            r4.setVisibility(r10)
            boolean r0 = r12 instanceof X.C75083me
            X.C18740tg.A0C(r0)
            X.3me r12 = (X.C75083me) r12
            X.141 r2 = r12.A00
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0l(r2)
            com.whatsapp.group.GroupChatInfoActivity r9 = r13.A09
            boolean r17 = X.C36431kI.A1V(r9, r1)
            X.3SF r6 = r13.A06
            r16 = 0
            com.whatsapp.TextEmojiLabel r0 = r6.A01
            r5 = r16
            r0.setText(r5)
            r7 = 2130970020(0x7f0405a4, float:1.7548738E38)
            r5 = 2131101134(0x7f0605ce, float:1.781467E38)
            X.C36321k7.A0M(r9, r0, r7, r5)
            com.whatsapp.TextEmojiLabel r8 = r13.A03
            r5 = r16
            r8.setText(r5)
            r5 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r9, r8, r5)
            X.171 r7 = r9.A0j
            X.147 r5 = r9.A1Y
            int r14 = r7.A07(r2, r5)
            X.2ol r5 = X.C52022ol.UNKNOWN
            if (r17 == 0) goto L_0x016c
            r6.A02()
            X.1RY r6 = r9.A0l
            r15 = r6
            X.0wQ r6 = r9.A02
            X.142 r6 = X.C36381kD.A0T(r6)
            android.widget.ImageView r7 = r13.A07
            r15.A08(r7, r6)
        L_0x0068:
            X.171 r6 = r9.A0j
            java.lang.String r6 = r6.A0G(r5, r2, r14)
            boolean r14 = r12 instanceof X.AnonymousClass2VH
            r5 = 0
            r18 = r27
            if (r14 == 0) goto L_0x0102
            r4 = 1
            r7.setClickable(r4)
            r4 = 3
            if (r17 == 0) goto L_0x018e
            X.0yC r0 = r9.A0D
            boolean r0 = X.C36431kI.A1X(r0)
            if (r0 == 0) goto L_0x00f8
            X.1YZ r0 = r9.A18
            X.3Jg r1 = r0.A00()
            if (r1 == 0) goto L_0x00f5
            java.lang.String r12 = r1.A02
            if (r12 == 0) goto L_0x00f5
            java.lang.String r6 = r1.A03
            if (r6 == 0) goto L_0x00f5
            long r2 = r1.A00
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x00f5
            long r0 = r1.A01
            int r13 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r13 == 0) goto L_0x00f5
            long r14 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r13.toMillis(r2)
            long r0 = r0 + r2
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00f5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r12)
            java.lang.String r0 = " "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r6, r1)
        L_0x00bb:
            boolean r0 = X.AnonymousClass14B.A0F(r1)
            if (r0 != 0) goto L_0x00f1
            r8.setVisibility(r5)
            r8.A0I(r1)
        L_0x00c7:
            boolean r0 = X.AnonymousClass22g.A0p(r9)
            if (r0 == 0) goto L_0x00e0
            r11.setVisibility(r5)
            X.12q r1 = r9.A0J
            X.147 r0 = r9.A1Y
            int r0 = r1.A05(r0)
            if (r0 != r4) goto L_0x00ea
            r0 = 2131888041(0x7f1207a9, float:1.9410706E38)
            r11.setText(r0)
        L_0x00e0:
            r0 = r16
            r7.setOnClickListener(r0)
            r0 = 2
            X.C011504z.A06(r7, r0)
        L_0x00e9:
            return
        L_0x00ea:
            r0 = 2131890051(0x7f120f83, float:1.9414783E38)
            r11.setText(r0)
            goto L_0x00e0
        L_0x00f1:
            r8.setVisibility(r10)
            goto L_0x00c7
        L_0x00f5:
            r1 = r16
            goto L_0x00bb
        L_0x00f8:
            X.1WR r0 = r9.A0K
            java.lang.String r0 = r0.A00()
            r8.A0I(r0)
            goto L_0x00c7
        L_0x0102:
            boolean r0 = r12 instanceof X.AnonymousClass2VI
            X.C18740tg.A0C(r0)
            X.2VI r12 = (X.AnonymousClass2VI) r12
            X.0ts r11 = r9.A0q
            long r2 = r12.A00
            boolean r10 = r12.A01
            long r0 = java.lang.System.currentTimeMillis()
            int r0 = X.AnonymousClass6XI.A00(r0, r2)
            java.lang.String r13 = X.AnonymousClass3UM.A00(r11, r2)
            r12 = 1
            if (r0 != 0) goto L_0x0158
            r1 = 2131892137(0x7f1217a9, float:1.9419014E38)
        L_0x0121:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r5] = r13
        L_0x0125:
            java.lang.String r0 = r9.getString(r1, r0)
            java.lang.String r1 = X.AnonymousClass3UM.A01(r11, r0, r2)
            if (r17 == 0) goto L_0x014f
            r0 = 2131892140(0x7f1217ac, float:1.941902E38)
            if (r10 == 0) goto L_0x0137
            r0 = 2131892139(0x7f1217ab, float:1.9419018E38)
        L_0x0137:
            java.lang.String r0 = X.C36351kA.A0w(r9, r1, r12, r0)
            r7.setClickable(r5)
            r8.setVisibility(r5)
            r8.A0I(r0)
            if (r6 == 0) goto L_0x00e9
            r4.setVisibility(r5)
            r0 = r18
            r4.A0J(r6, r0, r5, r5)
            return
        L_0x014f:
            r0 = 2131892135(0x7f1217a7, float:1.941901E38)
            if (r10 == 0) goto L_0x0137
            r0 = 2131892134(0x7f1217a6, float:1.9419008E38)
            goto L_0x0137
        L_0x0158:
            if (r0 != r12) goto L_0x015e
            r1 = 2131892138(0x7f1217aa, float:1.9419016E38)
            goto L_0x0121
        L_0x015e:
            java.lang.String r0 = X.C20040wv.A09(r11, r2)
            r1 = 2131892136(0x7f1217a8, float:1.9419012E38)
            java.lang.Object[] r0 = X.C36411kG.A1b(r0)
            r0[r12] = r13
            goto L_0x0125
        L_0x016c:
            X.171 r5 = r9.A0j
            X.34G r7 = r5.A0C(r2, r14)
            X.2ol r5 = r7.A00
            boolean r23 = r2.A0N()
            r19 = r7
            r20 = r2
            r21 = r16
            r22 = r14
            r18 = r6
            r18.A04(r19, r20, r21, r22, r23)
            X.1RY r6 = r9.A0l
            android.widget.ImageView r7 = r13.A07
            r6.A08(r7, r2)
            goto L_0x0068
        L_0x018e:
            java.lang.Boolean r12 = X.C18750th.A03
            android.view.View r14 = r13.A00
            r12 = 2131886157(0x7f12004d, float:1.9406885E38)
            X.C33521fV.A03(r14, r12)
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0u()
            X.3CG r12 = new X.3CG
            r12.<init>(r9)
            r15 = 2131897109(0x7f122b15, float:1.9429098E38)
            android.content.Context r12 = r12.A00
            java.lang.String r12 = X.C36401kF.A0o(r12, r15)
            r14.append(r12)
            java.lang.String r12 = X.AnonymousClass143.A03(r1)
            java.lang.String r12 = X.AnonymousClass000.A0q(r12, r14)
            X.C011004s.A08(r7, r12)
            r12 = 10
            X.C48902iF.A00(r7, r13, r1, r12)
            boolean r12 = r7 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            r14 = r26
            if (r12 == 0) goto L_0x01cc
            r13 = r7
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r13 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r13
            if (r26 != 0) goto L_0x01f9
            r12 = 0
        L_0x01c9:
            r13.setStatusIndicatorEnabled(r12)
        L_0x01cc:
            if (r26 == 0) goto L_0x01db
            boolean r12 = r14.A00()
            if (r12 == 0) goto L_0x01db
            int r13 = r14.A01
            r12 = 2131886163(0x7f120053, float:1.9406897E38)
            if (r13 > 0) goto L_0x01de
        L_0x01db:
            r12 = 2131886162(0x7f120052, float:1.9406895E38)
        L_0x01de:
            X.C33521fV.A03(r7, r12)
            X.1tr r7 = r9.A1H
            boolean r7 = r7.A0U(r1)
            if (r7 == 0) goto L_0x0211
            r1 = 2131100242(0x7f060252, float:1.781286E38)
            X.C36331k8.A0r(r9, r0, r1)
            X.C36331k8.A0r(r9, r8, r1)
            r0 = 2131894889(0x7f122269, float:1.9424596E38)
            r8.setText(r0)
            return
        L_0x01f9:
            int r12 = r14.A01
            if (r12 <= 0) goto L_0x020e
            X.5TU r15 = X.AnonymousClass5TU.UNSEEN
        L_0x01ff:
            X.5QJ r12 = new X.5QJ
            r12.<init>(r15)
            r13.setProfileStatus(r12)
            boolean r12 = r9.A24
            boolean r12 = X.AnonymousClass3TM.A03(r14, r12)
            goto L_0x01c9
        L_0x020e:
            X.5TU r15 = X.AnonymousClass5TU.SEEN
            goto L_0x01ff
        L_0x0211:
            X.17X r7 = r9.A0M
            X.147 r0 = r9.A1Y
            X.C18740tg.A06(r1)
            boolean r0 = r7.A0J(r0, r1)
            if (r0 == 0) goto L_0x0234
            r11.setVisibility(r5)
            X.12q r1 = r9.A0J
            X.147 r0 = r9.A1Y
            int r1 = r1.A05(r0)
            r0 = 2131890051(0x7f120f83, float:1.9414783E38)
            if (r1 != r4) goto L_0x0231
            r0 = 2131888041(0x7f1207a9, float:1.9410706E38)
        L_0x0231:
            r11.setText(r0)
        L_0x0234:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0242
            r3.setVisibility(r5)
            r0 = r18
            r3.A0J(r6, r0, r5, r5)
        L_0x0242:
            X.0yC r3 = r9.A0D
            X.0wo r1 = r9.A07
            android.content.Context r0 = r8.getContext()
            java.lang.String r0 = X.AnonymousClass3SX.A02(r0, r1, r2, r3)
            if (r0 == 0) goto L_0x0257
            r8.setVisibility(r5)
            r8.A0I(r0)
            return
        L_0x0257:
            r8.setVisibility(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2VG.A00(X.4Qi, X.3Ed, java.util.ArrayList):void");
    }
}
