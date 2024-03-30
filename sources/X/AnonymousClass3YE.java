package X;

import android.view.View;

/* renamed from: X.3YE  reason: invalid class name */
public class AnonymousClass3YE implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3YE(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass3YE(obj, obj2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03f3, code lost:
        r2.putExtra(r1, r0);
        r4.A05.A1p(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0463, code lost:
        r0.A04 = r2;
        r3.A07 = r0;
        r0.A00 = r3;
        X.C36331k8.A12(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x046c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04f9, code lost:
        if (r4.A09.A00(r4.A05.A0D(r4.A0A)) != false) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0597, code lost:
        r3.Btm(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x059a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0229, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x06de;
                case 1: goto L_0x026c;
                case 2: goto L_0x022d;
                case 3: goto L_0x0213;
                case 4: goto L_0x01ee;
                case 5: goto L_0x06b0;
                case 6: goto L_0x068b;
                case 7: goto L_0x061c;
                case 8: goto L_0x0604;
                case 9: goto L_0x05f8;
                case 10: goto L_0x05ec;
                case 11: goto L_0x01ae;
                case 12: goto L_0x0178;
                case 13: goto L_0x002a;
                case 14: goto L_0x001e;
                case 15: goto L_0x0156;
                case 16: goto L_0x059f;
                case 17: goto L_0x0570;
                case 18: goto L_0x055b;
                case 19: goto L_0x0120;
                case 20: goto L_0x00f3;
                case 21: goto L_0x0538;
                case 22: goto L_0x0521;
                case 23: goto L_0x0515;
                case 24: goto L_0x0502;
                case 25: goto L_0x0502;
                case 26: goto L_0x04d0;
                case 27: goto L_0x049f;
                case 28: goto L_0x0479;
                case 29: goto L_0x00d7;
                case 30: goto L_0x046d;
                case 31: goto L_0x044e;
                case 32: goto L_0x040a;
                case 33: goto L_0x00bd;
                case 34: goto L_0x03fc;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03d4;
                case 37: goto L_0x0005;
                case 38: goto L_0x0005;
                case 39: goto L_0x03b4;
                case 40: goto L_0x037a;
                case 41: goto L_0x035a;
                case 42: goto L_0x0333;
                case 43: goto L_0x0325;
                case 44: goto L_0x00ab;
                case 45: goto L_0x02ec;
                case 46: goto L_0x02d1;
                case 47: goto L_0x0036;
                case 48: goto L_0x02a2;
                case 49: goto L_0x0296;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r12.A00
            X.2Gc r1 = (X.AnonymousClass2Gc) r1
            java.lang.Object r0 = r12.A01
            X.141 r0 = (X.AnonymousClass141) r0
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r1.A05
            X.11F r0 = X.C36351kA.A0j(r0)
            java.lang.String r0 = X.AnonymousClass3U8.A04(r0)
            java.util.Objects.requireNonNull(r0)
            com.whatsapp.contact.picker.ContactPickerFragment.A0J(r1, r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.Object r1 = r12.A00
            X.8X1 r1 = (X.AnonymousClass8X1) r1
            java.lang.Object r2 = r12.A01
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r0 = r1.A03
            goto L_0x0229
        L_0x002a:
            java.lang.Object r1 = r12.A00
            X.8Wz r1 = (X.C174468Wz) r1
            java.lang.Object r2 = r12.A01
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.02t r0 = r1.A02
            goto L_0x0229
        L_0x0036:
            java.lang.Object r4 = r12.A00
            X.2Gx r4 = (X.C43322Gx) r4
            java.lang.Object r5 = r12.A01
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x00a9
            r1 = 2131434890(0x7f0b1d8a, float:1.8491607E38)
            X.01L r0 = r4.A0U
            android.view.View r1 = r0.findViewById(r1)
            X.3CG r0 = r4.A0Y
            android.os.Bundle r3 = X.AnonymousClass3CG.A00(r5, r1, r0)
        L_0x0051:
            X.141 r0 = r4.A0I
            com.whatsapp.jid.UserJid r6 = X.C36351kA.A0k(r0)
            android.content.Intent r2 = r5.getIntent()
            r1 = 0
            java.lang.String r0 = "mat_entry_point"
            int r2 = r2.getIntExtra(r0, r1)
            r1 = 2
            X.0yC r7 = r4.A0d
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = r7.A0E(r0)
            if (r0 == 0) goto L_0x0073
            r0 = 10
            if (r2 != r0) goto L_0x0073
            r1 = 26
        L_0x0073:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            boolean r0 = r4.A0L
            r1 = r0 ^ 1
            boolean r0 = X.C43322Gx.A06(r4)
            if (r0 != 0) goto L_0x008f
            boolean r0 = X.C55942vR.A00(r7)
            if (r0 == 0) goto L_0x00a7
            X.141 r0 = r4.A0I
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x00a7
        L_0x008f:
            r0 = 1
        L_0x0090:
            android.content.Intent r0 = X.AnonymousClass190.A0w(r5, r6, r2, r1, r0)
            X.C05290Pd.A00(r5, r0, r3)
            X.1YG r2 = r4.A0b
            if (r2 == 0) goto L_0x001d
            X.11F r0 = r4.A0e
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r0)
            r0 = 11
            X.AnonymousClass1YG.A01(r2, r1, r0)
            return
        L_0x00a7:
            r0 = 0
            goto L_0x0090
        L_0x00a9:
            r3 = 0
            goto L_0x0051
        L_0x00ab:
            java.lang.Object r2 = r12.A00
            X.1vd r2 = (X.C40491vd) r2
            java.lang.Object r1 = r12.A01
            X.3Gs r1 = (X.C62583Gs) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x001d
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = r2.A00
            com.whatsapp.contact.picker.PhoneContactsSelector.A0v(r1, r0)
            return
        L_0x00bd:
            java.lang.Object r0 = r12.A00
            X.3eu r0 = (X.C70283eu) r0
            java.lang.Object r2 = r12.A01
            X.141 r2 = (X.AnonymousClass141) r2
            android.app.Activity r1 = r0.A03
            X.3IL r0 = r2.A0F
            if (r0 == 0) goto L_0x001d
            X.190 r0 = X.C36441kJ.A0j()
            android.content.Intent r0 = r0.A1V(r1, r2)
            r1.startActivity(r0)
            return
        L_0x00d7:
            java.lang.Object r2 = r12.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r12.A01
            X.1oI r1 = (X.C38321oI) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            boolean r0 = r2 instanceof X.AnonymousClass01I
            if (r0 == 0) goto L_0x001d
            X.1fs r1 = r1.getContextualHelpHandler()
            X.01I r2 = (X.AnonymousClass01I) r2
            java.lang.String r0 = "events"
            r1.A01(r2, r0)
            return
        L_0x00f3:
            java.lang.Object r1 = r12.A00
            X.30r r1 = (X.C586930r) r1
            java.lang.Object r5 = r12.A01
            X.3QK r5 = (X.AnonymousClass3QK) r5
            java.util.List r0 = X.AnonymousClass0D3.A0I
            com.whatsapp.community.ManageGroupsInCommunityActivity r4 = r1.A00
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x001d
            X.1uf r1 = r4.A0B
            r0 = 17
            X.3v7 r3 = new X.3v7
            r3.<init>(r5, r1, r0)
            X.3Bh r2 = r4.A07
            X.16D r1 = r4.A0E
            com.whatsapp.jid.GroupJid r0 = r5.A02
            X.141 r0 = r1.A08(r0)
            X.9j8 r0 = r2.A00(r4, r0, r3)
            r0.A02()
            return
        L_0x0120:
            java.lang.Object r1 = r12.A00
            com.whatsapp.community.CommunityAddMembersBottomSheet r1 = (com.whatsapp.community.CommunityAddMembersBottomSheet) r1
            java.lang.Object r4 = r12.A01
            X.147 r4 = (X.AnonymousClass147) r4
            android.content.Context r0 = r1.A1D()
            android.app.Activity r3 = X.C24801Dv.A00(r0)
            boolean r0 = r3 instanceof X.AnonymousClass01L
            if (r0 == 0) goto L_0x001d
            X.01I r3 = (X.AnonymousClass01I) r3
            if (r3 == 0) goto L_0x001d
            X.01z r2 = r3.getSupportFragmentManager()
            X.AnonymousClass00C.A08(r2)
            X.00T r0 = r1.A0F
            X.147 r5 = X.C36431kI.A0k(r0)
            r0 = 4
            X.2qk r7 = new X.2qk
            r7.<init>(r1, r0)
            r9 = 1
            X.09w r6 = X.C023409w.A00
            X.4ND r8 = X.AnonymousClass4ND.A00
            r10 = 6
            r11 = 1
            X.C54422sv.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0156:
            java.lang.Object r2 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            java.lang.Object r3 = r12.A01
            X.01z r3 = (X.AnonymousClass01z) r3
            X.1NU r1 = r2.A0U
            X.141 r0 = r2.A0z
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0k(r0)
            java.lang.String r5 = "profile_view"
            r0 = 1
            X.AnonymousClass00C.A0D(r3, r0)
            if (r4 == 0) goto L_0x001d
            X.1NP r0 = r1.A01
            boolean r6 = r0.A03(r4)
            r1.A00(r2, r3, r4, r5, r6)
            return
        L_0x0178:
            java.lang.Object r5 = r12.A00
            X.6WU r5 = (X.AnonymousClass6WU) r5
            java.lang.Object r4 = r12.A01
            X.6YT r4 = (X.AnonymousClass6YT) r4
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0188
            r4.A0N()
            return
        L_0x0188:
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            r3 = 1
            android.view.animation.ScaleAnimation r2 = X.C36391kE.A0M(r1, r0)
            r0 = 220(0xdc, double:1.087E-321)
            r2.setDuration(r0)
            android.view.animation.OvershootInterpolator r0 = new android.view.animation.OvershootInterpolator
            r0.<init>()
            r2.setInterpolator(r0)
            X.C89214Vr.A00(r2, r5, r4, r3)
            com.whatsapp.WaImageView r0 = r5.A0H
            r0.startAnimation(r2)
            com.whatsapp.CircularProgressBar r0 = r5.A04
            if (r0 == 0) goto L_0x001d
            r0.startAnimation(r2)
            return
        L_0x01ae:
            java.lang.Object r3 = r12.A00
            X.3Ho r3 = (X.C62793Ho) r3
            java.lang.Object r2 = r12.A01
            X.30i r2 = (X.C586030i) r2
            java.util.List r0 = X.AnonymousClass0D3.A0I
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "GroupChatViewHolder/onGroupClicked: "
            r1.append(r0)
            java.lang.String r0 = r3.A01
            X.C36321k7.A1a(r1, r0)
            X.141 r4 = r3.A00
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r3 = r2.A00
            r1 = 1
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r0 = "calling-tooltip-scenario"
            r2.putInt(r0, r1)
            X.190 r1 = X.C36441kJ.A0j()
            android.content.Context r0 = r3.A0a()
            android.content.Intent r0 = r1.A1W(r0, r4)
            r0.putExtras(r2)
            r3.A1C(r0)
            X.00S r0 = r3.A02
            if (r0 == 0) goto L_0x001d
            r0.invoke()
            return
        L_0x01ee:
            java.lang.Object r0 = r12.A00
            X.4oG r0 = (X.C97014oG) r0
            java.lang.Object r1 = r12.A01
            X.52t r1 = (X.C1029752t) r1
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r0 = r0.A00
            if (r0 == 0) goto L_0x001d
            com.whatsapp.jid.UserJid r3 = r1.A02
            X.61I r0 = r0.A00
            if (r0 == 0) goto L_0x001d
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            X.6YM r0 = r0.A0r
            if (r0 == 0) goto L_0x001d
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r0.A1E
            r1 = 34
            X.74e r0 = new X.74e
            r0.<init>(r3, r1)
            r2.execute(r0)
            return
        L_0x0213:
            java.lang.Object r2 = r12.A00
            X.2DW r2 = (X.AnonymousClass2DW) r2
            java.lang.Object r1 = r12.A01
            X.2DV r1 = (X.AnonymousClass2DV) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.141 r0 = r2.A00
            com.whatsapp.jid.UserJid r2 = X.C36411kG.A0k(r0)
            if (r2 == 0) goto L_0x001d
            X.02t r0 = r1.A05
        L_0x0229:
            r0.invoke(r2)
            return
        L_0x022d:
            java.lang.Object r1 = r12.A00
            X.3JW r1 = (X.AnonymousClass3JW) r1
            java.lang.Object r4 = r12.A01
            X.1ye r4 = (X.C42331ye) r4
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.141 r0 = r1.A02
            com.whatsapp.jid.UserJid r3 = X.C36411kG.A0k(r0)
            if (r3 == 0) goto L_0x001d
            X.00T r2 = r4.A03
            java.lang.Object r1 = X.C36381kD.A0p(r2)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            java.lang.Object r0 = X.C36381kD.A0p(r2)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            X.03v r1 = r4.A05
            java.lang.Object r0 = X.C36381kD.A0p(r2)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r3, r0)
            return
        L_0x026c:
            java.lang.Object r1 = r12.A00
            X.3JW r1 = (X.AnonymousClass3JW) r1
            java.lang.Object r3 = r12.A01
            X.1ye r3 = (X.C42331ye) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            X.141 r0 = r1.A02
            com.whatsapp.jid.UserJid r2 = X.C36411kG.A0k(r0)
            if (r2 == 0) goto L_0x001d
            X.03v r1 = r3.A05
            X.00T r0 = r3.A03
            java.lang.Object r0 = X.C36381kD.A0p(r0)
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            boolean r0 = r0.isChecked()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.invoke(r2, r0)
            return
        L_0x0296:
            java.lang.Object r1 = r12.A00
            X.28f r1 = (X.AnonymousClass28f) r1
            java.lang.Object r0 = r12.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.Bbx(r0)
            return
        L_0x02a2:
            java.lang.Object r3 = r12.A00
            com.whatsapp.conversation.ConversationEntryActionButton r3 = (com.whatsapp.conversation.ConversationEntryActionButton) r3
            java.lang.Object r2 = r12.A01
            X.4Ue r2 = (X.C88824Ue) r2
            long r0 = java.lang.System.currentTimeMillis()
            r3.A01 = r0
            X.4Zx r2 = (X.C90314Zx) r2
            int r0 = r2.A01
            switch(r0) {
                case 0: goto L_0x02c0;
                case 1: goto L_0x02c9;
                default: goto L_0x02b7;
            }
        L_0x02b7:
            java.lang.Object r1 = r2.A00
            com.whatsapp.status.playback.MessageReplyActivity r1 = (com.whatsapp.status.playback.MessageReplyActivity) r1
            r0 = 0
            com.whatsapp.status.playback.MessageReplyActivity.A0l(r1, r0)
            return
        L_0x02c0:
            java.lang.Object r1 = r2.A00
            X.3fk r1 = (X.C70803fk) r1
            r0 = 0
            r1.A2Z(r0)
            return
        L_0x02c9:
            java.lang.Object r0 = r2.A00
            com.whatsapp.notification.PopupNotification r0 = (com.whatsapp.notification.PopupNotification) r0
            com.whatsapp.notification.PopupNotification.A0J(r0)
            return
        L_0x02d1:
            java.lang.Object r0 = r12.A00
            com.whatsapp.conversation.CommentsBottomSheet r0 = (com.whatsapp.conversation.CommentsBottomSheet) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.mentions.MentionableEntry r2 = (com.whatsapp.mentions.MentionableEntry) r2
            X.00T r0 = r0.A0U
            java.lang.Object r1 = r0.getValue()
            X.1uV r1 = (X.C40001uV) r1
            java.lang.String r0 = r2.getStringText()
            X.AnonymousClass00C.A08(r0)
            r1.A0S(r0)
            return
        L_0x02ec:
            java.lang.Object r6 = r12.A00
            X.1w2 r6 = (X.C40741w2) r6
            java.lang.Object r5 = r12.A01
            X.141 r5 = (X.AnonymousClass141) r5
            r0 = 1
            X.AnonymousClass00C.A0D(r5, r0)
            com.whatsapp.contact.picker.SelectedListContactPickerFragment r4 = r6.A01
            java.util.Map r3 = r4.A3o
            java.util.Iterator r2 = X.AnonymousClass000.A0z(r3)
        L_0x0300:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0323
            java.lang.Object r1 = r2.next()
            boolean r0 = X.AnonymousClass00C.A0J(r1, r5)
            if (r0 == 0) goto L_0x0300
        L_0x0310:
            X.141 r1 = (X.AnonymousClass141) r1
            if (r1 == 0) goto L_0x031f
            X.11F r0 = r1.A0H
            r3.remove(r0)
            r4.A1l()
            r4.A1g()
        L_0x031f:
            r6.A0L(r5)
            return
        L_0x0323:
            r1 = 0
            goto L_0x0310
        L_0x0325:
            java.lang.Object r0 = r12.A00
            X.3et r0 = (X.C70273et) r0
            java.lang.Object r1 = r12.A01
            java.util.List r1 = (java.util.List) r1
            X.27v r0 = r0.A02
            r0.A43(r1)
            return
        L_0x0333:
            java.lang.Object r4 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A01
            X.141 r3 = (X.AnonymousClass141) r3
            X.1dz r2 = r4.A2B
            r0 = 6
            r1 = 0
            r2.A02(r1, r0)
            X.1dz r0 = r4.A2B
            r0.A01()
            boolean r0 = r4.A31
            if (r0 == 0) goto L_0x0356
            android.content.Intent r2 = X.C36431kI.A0D()
            r1 = 1
            java.lang.String r0 = "call_type"
            android.content.Intent r1 = r2.putExtra(r0, r1)
        L_0x0356:
            r4.A1p(r1, r3)
            return
        L_0x035a:
            java.lang.Object r2 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r2 = (com.whatsapp.contact.picker.ContactPickerFragment) r2
            java.lang.Object r1 = r12.A01
            android.content.Intent r1 = (android.content.Intent) r1
            X.1dz r0 = r2.A2B
            r0.A01()
            X.3Rv r4 = r2.A10
            X.01I r3 = r2.A0i()
            java.lang.String r0 = "newly_added_contact_phone_number_key"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r1 = "sms:"
            r0 = 0
            r4.A02(r3, r0, r2, r1)
            return
        L_0x037a:
            java.lang.Object r4 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r4 = (com.whatsapp.contact.picker.ContactPickerFragment) r4
            java.lang.Object r3 = r12.A01
            android.content.Intent r3 = (android.content.Intent) r3
            X.6OF r2 = r4.A1s
            java.util.Random r0 = r2.A02
            if (r0 != 0) goto L_0x038f
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A02 = r0
        L_0x038f:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A01 = r0
            X.58e r1 = new X.58e
            r1.<init>()
            java.lang.Integer r0 = X.C36381kD.A0m()
            r1.A01 = r0
            X.AnonymousClass6OF.A00(r1, r2)
            X.1Dv r1 = r4.A0K
            android.content.Context r0 = r4.A0a()
            r1.A06(r0, r3)
            X.C68733cN.A01(r4)
            return
        L_0x03b4:
            java.lang.Object r0 = r12.A00
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            java.lang.Object r3 = r12.A01
            android.content.Context r3 = (android.content.Context) r3
            X.3L5 r2 = r0.A0c
            r1 = 7
            r0 = 1
            r2.A01(r1, r0)
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x03d4:
            java.lang.Object r4 = r12.A00
            X.2Gc r4 = (X.AnonymousClass2Gc) r4
            java.lang.Object r3 = r12.A01
            X.141 r3 = (X.AnonymousClass141) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "call_type"
            r0 = 1
            goto L_0x03f3
        L_0x03e4:
            java.lang.Object r4 = r12.A00
            X.2Gc r4 = (X.AnonymousClass2Gc) r4
            java.lang.Object r3 = r12.A01
            X.141 r3 = (X.AnonymousClass141) r3
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = "call_type"
            r0 = 2
        L_0x03f3:
            r2.putExtra(r1, r0)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r4.A05
            r0.A1p(r2, r3)
            return
        L_0x03fc:
            java.lang.Object r0 = r12.A00
            X.2Gc r0 = (X.AnonymousClass2Gc) r0
            java.lang.Object r1 = r12.A01
            X.3en r1 = (X.C70223en) r1
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r0.A05
            r0.A1s(r1)
            return
        L_0x040a:
            java.lang.Object r0 = r12.A00
            X.1yn r0 = (X.C42421yn) r0
            java.lang.Object r5 = r12.A01
            X.3SB r5 = (X.AnonymousClass3SB) r5
            X.30v r2 = r0.A05
            boolean r0 = r5.A02()
            if (r0 != 0) goto L_0x0442
            com.whatsapp.companiondevice.LinkedDevicesActivity r4 = r2.A00
            X.0yC r1 = r4.A0D
            r0 = 4757(0x1295, float:6.666E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0442
            com.whatsapp.jid.DeviceJid r3 = r5.A07
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.LinkedDeviceEditDeviceActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "device_jid_raw_string"
            r2.putExtra(r0, r1)
            r4.startActivity(r2)
            return
        L_0x0442:
            com.whatsapp.companiondevice.LinkedDevicesActivity r3 = r2.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = r3.A08
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A07 = r5
            goto L_0x0463
        L_0x044e:
            java.lang.Object r0 = r12.A00
            X.1yn r0 = (X.C42421yn) r0
            java.lang.Object r1 = r12.A01
            X.38U r1 = (X.AnonymousClass38U) r1
            X.30v r0 = r0.A05
            com.whatsapp.companiondevice.LinkedDevicesActivity r3 = r0.A00
            com.whatsapp.companiondevice.LinkedDevicesSharedViewModel r2 = r3.A08
            com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment r0 = new com.whatsapp.companiondevice.LinkedDevicesDetailDialogFragment
            r0.<init>()
            r0.A0A = r1
        L_0x0463:
            r0.A04 = r2
            r3.A07 = r0
            r0.A00 = r3
            X.C36331k8.A12(r0, r3)
            return
        L_0x046d:
            java.lang.Object r1 = r12.A00
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView r1 = (com.whatsapp.community.subgroup.views.CommunityViewGroupsView) r1
            java.lang.Object r0 = r12.A01
            X.01L r0 = (X.AnonymousClass01L) r0
            com.whatsapp.community.subgroup.views.CommunityViewGroupsView.setViewClickListener$lambda$0(r1, r0, r13)
            return
        L_0x0479:
            java.lang.Object r0 = r12.A00
            X.1q4 r0 = (X.C38781q4) r0
            java.lang.Object r5 = r12.A01
            android.content.Context r5 = (android.content.Context) r5
            X.1Dv r4 = r0.A00
            X.147 r3 = r0.A0A
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.community.deactivate.DeactivateCommunityDisclaimerActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = r3.getRawString()
            java.lang.String r0 = "parent_group_jid"
            r2.putExtra(r0, r1)
            r4.A06(r5, r2)
            return
        L_0x049f:
            java.lang.Object r1 = r12.A00
            X.1q4 r1 = (X.C38781q4) r1
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r4 = X.C24801Dv.A00(r0)
            X.14u r4 = (X.C225314u) r4
            X.147 r0 = r1.A0A
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.community.CommunityDeleteDialogFragment r3 = new com.whatsapp.community.CommunityDeleteDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.util.ArrayList r1 = X.AnonymousClass143.A07(r1)
            java.lang.String r0 = "selectedParentJids"
            r2.putStringArrayList(r0, r1)
            r3.A17(r2)
            r4.Btm(r3)
            return
        L_0x04d0:
            java.lang.Object r4 = r12.A00
            X.1q4 r4 = (X.C38781q4) r4
            java.lang.Object r0 = r12.A01
            android.content.Context r0 = (android.content.Context) r0
            android.app.Activity r3 = X.C24801Dv.A00(r0)
            X.14u r3 = (X.C225314u) r3
            X.147 r2 = r4.A0A
            X.0yC r1 = r4.A08
            r0 = 2818(0xb02, float:3.949E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x04fb
            X.16D r1 = r4.A05
            X.147 r0 = r4.A0A
            X.141 r1 = r1.A0D(r0)
            X.1EL r0 = r4.A09
            boolean r0 = r0.A00(r1)
            r1 = 1
            if (r0 == 0) goto L_0x04fc
        L_0x04fb:
            r1 = 0
        L_0x04fc:
            com.whatsapp.community.CommunitySpamReportDialogFragment r0 = com.whatsapp.community.CommunitySpamReportDialogFragment.A03(r2, r1)
            goto L_0x0597
        L_0x0502:
            java.lang.Object r2 = r12.A00
            X.1Sq r2 = (X.C28431Sq) r2
            java.lang.Object r1 = r12.A01
            android.view.View r1 = (android.view.View) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            android.content.Context r1 = r1.getContext()
            r0 = 2
            r2.BuY(r1, r0, r0)
            return
        L_0x0515:
            java.lang.Object r1 = r12.A00
            X.1rN r1 = (X.C39161rN) r1
            java.lang.Object r0 = r12.A01
            X.3K2 r0 = (X.AnonymousClass3K2) r0
            X.C39161rN.setupPopupMenu$lambda$2(r1, r0, r13)
            return
        L_0x0521:
            java.lang.Object r4 = r12.A00
            X.1yK r4 = (X.C42131yK) r4
            java.lang.Object r3 = r12.A01
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.0xE r2 = r4.A02
            android.content.Context r1 = r4.A00
            X.AnonymousClass00C.A07(r1)
            android.view.View r0 = r4.A01
            r2.Bl0(r1, r0, r3)
            return
        L_0x0538:
            java.lang.Object r2 = r12.A00
            com.whatsapp.community.NewCommunityActivity r2 = (com.whatsapp.community.NewCommunityActivity) r2
            r0 = 0
            r2.A0F = r0
            java.lang.Object r1 = r12.A01
            X.1RJ r1 = (X.AnonymousClass1RJ) r1
            r0 = 8
            r1.A03(r0)
            X.1Sk r1 = r2.A0A
            X.1Sp r0 = r1.A02
            java.lang.String r4 = r0.A00()
            java.lang.Integer r2 = r0.A00
            r3 = 0
            r6 = 9
            r7 = 4
            r5 = r3
            r1.A08(r2, r3, r4, r5, r6, r7)
            return
        L_0x055b:
            java.lang.Object r2 = r12.A00
            X.14u r2 = (X.C225314u) r2
            java.lang.Object r1 = r12.A01
            android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog r0 = new com.whatsapp.chatlock.dialogs.ChatLockPrivacySettingsUnlockClearDialog
            r0.<init>(r1)
            r2.Btm(r0)
            return
        L_0x0570:
            java.lang.Object r3 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.2Sj r1 = r3.A15
            if (r1 == 0) goto L_0x0582
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A00 = r0
        L_0x0582:
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r3.A1M
            if (r0 == 0) goto L_0x059b
            X.3Ed r0 = r0.A0S(r2)
            if (r0 == 0) goto L_0x059b
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x059b
            com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment r0 = new com.whatsapp.chatinfo.ViewPhotoOrStatusDialogFragment
            r0.<init>()
        L_0x0597:
            r3.Btm(r0)
            return
        L_0x059b:
            com.whatsapp.chatinfo.ContactInfoActivity.A0x(r3)
            return
        L_0x059f:
            java.lang.Object r4 = r12.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            java.lang.Object r5 = r12.A01
            X.3Ni r5 = (X.C64273Ni) r5
            X.2EI r2 = r4.A0h
            X.9uI r1 = r4.A0S
            r0 = 2
            r2.A0V(r1, r0)
            X.141 r3 = r5.A00
            if (r3 == 0) goto L_0x05bd
            X.1ND r2 = r4.A0Z
            r1 = 6
            X.1NE r2 = (X.AnonymousClass1NE) r2
            r0 = 0
            r2.Bua(r4, r3, r1, r0)
            return
        L_0x05bd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "tel:"
            r1.append(r0)
            java.lang.String r0 = r5.A02
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.net.Uri r2 = android.net.Uri.parse(r0)
            java.lang.String r1 = "android.intent.action.DIAL"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x05db }
            goto L_0x05eb
        L_0x05db:
            r1 = move-exception
            java.lang.String r0 = "contact_info/dial dialer app not found"
            com.whatsapp.util.Log.w(r0, r1)
            X.17Y r2 = r4.A05
            r1 = 2131895677(0x7f12257d, float:1.9426194E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x05eb:
            return
        L_0x05ec:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r12.A01
            X.4fT r0 = (X.C93034fT) r0
            X.C93034fT.setViewModel$lambda$7(r1, r0, r13)
            return
        L_0x05f8:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r1 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r1
            java.lang.Object r0 = r12.A01
            X.4fT r0 = (X.C93034fT) r0
            X.C93034fT.setViewModel$lambda$5(r1, r0, r13)
            return
        L_0x0604:
            java.lang.Object r0 = r12.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r0
            java.lang.Object r2 = r12.A01
            android.view.View r2 = (android.view.View) r2
            X.00T r0 = r0.A0L
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r1 = (com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel) r1
            android.content.Context r0 = X.C36371kC.A0B(r2)
            r1.A0U(r0)
            return
        L_0x061c:
            java.lang.Object r2 = r12.A00
            X.2DY r2 = (X.AnonymousClass2DY) r2
            java.lang.Object r1 = r12.A01
            X.3e1 r1 = (X.C69743e1) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4Nk r3 = r2.A00
            X.3Jh r5 = r1.A01
            int r2 = r2.A04()
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r3 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r3
            X.11F r6 = r5.A03
            X.1wM r1 = r3.A03
            if (r1 != 0) goto L_0x063b
            java.lang.RuntimeException r0 = X.C36331k8.A0Y()
            throw r0
        L_0x063b:
            java.util.List r0 = r1.A00
            r0.remove(r2)
            r1.A09(r2)
            X.00T r0 = r3.A0B
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r4 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel) r4
            X.040 r3 = X.C109325Xd.A00(r4)
            X.02l r2 = r4.A08
            r1 = 0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1 r0 = new com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1
            r0.<init>(r4, r5, r1)
            X.C36381kD.A1R(r2, r0, r3)
            X.05L r5 = r4.A0A
        L_0x065c:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.util.Iterator r2 = r0.iterator()
        L_0x066b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0684
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3Jh r0 = (X.C63243Jh) r0
            X.11F r0 = r0.A03
            boolean r0 = X.AnonymousClass00C.A0J(r0, r6)
            if (r0 != 0) goto L_0x066b
            r3.add(r1)
            goto L_0x066b
        L_0x0684:
            boolean r0 = r5.B3B(r4, r3)
            if (r0 == 0) goto L_0x065c
            return
        L_0x068b:
            java.lang.Object r1 = r12.A00
            X.2DY r1 = (X.AnonymousClass2DY) r1
            java.lang.Object r4 = r12.A01
            X.3e1 r4 = (X.C69743e1) r4
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.4Nk r3 = r1.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r3 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r3
            X.1Dv r2 = r3.A01
            X.190 r1 = r3.A04
            if (r1 == 0) goto L_0x06ab
            X.3Jh r0 = r4.A01
            X.11F r0 = r0.A03
            android.content.Intent r0 = X.C36391kE.A0F(r3, r1, r0)
            r2.A07(r3, r0)
            return
        L_0x06ab:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x06b0:
            java.lang.Object r0 = r12.A00
            X.4oG r0 = (X.C97014oG) r0
            java.lang.Object r4 = r12.A01
            android.view.View r4 = (android.view.View) r4
            X.C36391kE.A1T(r4)
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r1 = r0.A00
            if (r1 == 0) goto L_0x06d8
            X.5Fb r0 = r1.A04
            r0.A06()
            X.1hi r0 = r1.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            if (r0 == 0) goto L_0x06d8
            X.1PZ r3 = r1.A05
            r2 = 5
            r1 = 35
            java.lang.Integer r0 = X.C36391kE.A0r()
            r3.A01(r0, r2, r1)
        L_0x06d8:
            r0 = 8
            r4.setVisibility(r0)
            return
        L_0x06de:
            java.lang.Object r4 = r12.A00
            X.14u r4 = (X.C225314u) r4
            java.lang.Object r0 = r12.A01
            X.3XX r0 = (X.AnonymousClass3XX) r0
            int r3 = r0.A04
            int r2 = r0.A03
            int r1 = r0.A05
            r0 = 1
            com.whatsapp.SingleSelectionDialogFragment r0 = com.whatsapp.SingleSelectionDialogFragment.A06(r0, r3, r2, r1)
            r4.Btm(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YE.onClick(android.view.View):void");
    }
}
