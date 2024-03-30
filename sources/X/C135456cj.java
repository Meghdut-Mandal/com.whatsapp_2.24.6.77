package X;

import android.view.View;
import com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog;
import com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel;

/* renamed from: X.6cj  reason: invalid class name and case insensitive filesystem */
public class C135456cj implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C135456cj(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static VoiceChatBottomSheetViewModel A00(AudioChatBottomSheetDialog audioChatBottomSheetDialog, AnonymousClass1PZ r2, int i) {
        r2.A00(i, 35);
        return (VoiceChatBottomSheetViewModel) audioChatBottomSheetDialog.A0N.getValue();
    }

    public static void A01(View view, Object obj, int i) {
        view.setOnClickListener(new C135456cj(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025d, code lost:
        r3 = r4.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03aa, code lost:
        r0.callOnClick();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x042a, code lost:
        if (r1 == 3) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0622, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0625, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0649, code lost:
        X.AnonymousClass6YT.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x064c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0334;
                case 2: goto L_0x033c;
                case 3: goto L_0x0344;
                case 4: goto L_0x034c;
                case 5: goto L_0x0354;
                case 6: goto L_0x035c;
                case 7: goto L_0x0364;
                case 8: goto L_0x0075;
                case 9: goto L_0x036c;
                case 10: goto L_0x00a2;
                case 11: goto L_0x0385;
                case 12: goto L_0x038d;
                case 13: goto L_0x00c2;
                case 14: goto L_0x03c8;
                case 15: goto L_0x00f1;
                case 16: goto L_0x012a;
                case 17: goto L_0x0176;
                case 18: goto L_0x0196;
                case 19: goto L_0x020c;
                case 20: goto L_0x0236;
                case 21: goto L_0x0395;
                case 22: goto L_0x03a0;
                case 23: goto L_0x03ae;
                case 24: goto L_0x03c8;
                case 25: goto L_0x03b6;
                case 26: goto L_0x03c8;
                case 27: goto L_0x03d0;
                case 28: goto L_0x0576;
                case 29: goto L_0x03d8;
                case 30: goto L_0x05e6;
                case 31: goto L_0x03f4;
                case 32: goto L_0x0438;
                case 33: goto L_0x0442;
                case 34: goto L_0x044e;
                case 35: goto L_0x0275;
                case 36: goto L_0x0295;
                case 37: goto L_0x02d5;
                case 38: goto L_0x0626;
                case 39: goto L_0x045a;
                case 40: goto L_0x046e;
                case 41: goto L_0x0303;
                case 42: goto L_0x047b;
                case 43: goto L_0x0497;
                case 44: goto L_0x04ca;
                case 45: goto L_0x0319;
                case 46: goto L_0x04dc;
                case 47: goto L_0x04f2;
                case 48: goto L_0x051b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            com.whatsapp.jid.UserJid r2 = r3.A3t()
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x0330
            X.0wU r1 = r3.A04
            r0 = 31
            X.C36411kG.A1M(r1, r3, r2, r0)
        L_0x0018:
            return
        L_0x0019:
            java.lang.Object r0 = r14.A00
            X.4oG r0 = (X.C97014oG) r0
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r7 = r0.A00
            if (r7 == 0) goto L_0x0018
            android.content.Context r6 = r15.getContext()
            X.61I r0 = r7.A00
            if (r0 == 0) goto L_0x0018
            if (r6 == 0) goto L_0x0018
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            com.whatsapp.voipcalling.CallInfo r8 = com.whatsapp.voipcalling.VoipActivityV2.A01(r0)
            if (r8 == 0) goto L_0x0531
            X.0yC r3 = r7.A09
            com.whatsapp.voipcalling.CallState r2 = r8.callState
            boolean r1 = r8.isGroupCall
            java.lang.String r0 = "options.enable_add_participant_while_calling_receiver"
            java.lang.Boolean r0 = com.whatsapp.voipcalling.Voip.A03(r0)
            boolean r0 = X.C34681hT.A0Q(r3, r2, r0, r1)
            if (r0 != 0) goto L_0x0531
            X.16D r1 = r7.A06
            com.whatsapp.jid.UserJid r0 = r8.getPeerJid()
            X.141 r5 = X.C36441kJ.A0i(r1, r0)
            X.1qm r4 = X.AnonymousClass3LW.A00(r6)
            boolean r0 = r8.isGroupCall
            r3 = 2131895946(0x7f12268a, float:1.942674E38)
            if (r0 == 0) goto L_0x005d
            r3 = 2131895945(0x7f122689, float:1.9426737E38)
        L_0x005d:
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            X.171 r0 = r7.A07
            java.lang.String r0 = r0.A0H(r5)
            java.lang.String r0 = X.C36391kE.A0v(r6, r0, r2, r1, r3)
            X.C39001qm.A0A(r4, r0)
            X.0FM r0 = r4.create()
            goto L_0x0622
        L_0x0075:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r1 = (com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            if (r1 == 0) goto L_0x0018
            X.5Fb r0 = r1.A04
            X.6OZ r4 = r0.A05()
            java.lang.String r3 = r4.A0B
            if (r3 != 0) goto L_0x008e
            java.lang.String r1 = "CallDataSource/updateShareCallLinkOption/ call link token is null"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return
        L_0x008e:
            java.util.Iterator r2 = X.C36361kB.A0s(r0)
        L_0x0092:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            X.7m5 r1 = X.C90524aI.A0K(r2)
            boolean r0 = r4.A0N
            r1.BgU(r3, r0)
            goto L_0x0092
        L_0x00a2:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.header.ui.CallScreenDetailsLayout r0 = (com.whatsapp.calling.header.ui.CallScreenDetailsLayout) r0
            X.5xi r4 = r0.getCallScreenDetailsStateHolder()
            android.content.Context r3 = X.C36371kC.A0B(r0)
            X.5t8 r0 = r4.A01
            X.141 r1 = r0.A00
            if (r1 == 0) goto L_0x0018
            X.1Dv r2 = r4.A00
            X.190 r0 = r4.A02
            android.content.Intent r1 = r0.A1W(r3, r1)
            java.lang.String r0 = "CallScreenDetailsStateHolder onLonelyStateButtonClicked"
            r2.A08(r3, r1, r0)
            return
        L_0x00c2:
            java.lang.Object r4 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r4 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog) r4
            r3 = 0
            X.1PZ r2 = r4.A1m()
            r1 = 21
            r0 = 35
            r2.A00(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A01
            if (r1 == 0) goto L_0x00da
            r0 = 1
            r1.A0Y(r3, r0)
        L_0x00da:
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.A01
            if (r1 == 0) goto L_0x00e2
            r0 = 4
            r1.A0W(r0)
        L_0x00e2:
            com.whatsapp.components.MaxHeightLinearLayout r2 = r4.A08
            if (r2 == 0) goto L_0x0018
            r1 = 19
            X.74e r0 = new X.74e
            r0.<init>(r4, r1)
            r2.post(r0)
            return
        L_0x00f1:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.7cf r0 = r1.A00
            if (r0 == 0) goto L_0x0018
            boolean r3 = r1.isSelected()
            X.6rj r0 = (X.C144156rj) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1PZ r1 = r2.A1m()
            r0 = 11
            if (r3 == 0) goto L_0x010b
            r0 = 12
        L_0x010b:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r3 = A00(r2, r1, r0)
            X.6YM r2 = r3.A01
            if (r2 == 0) goto L_0x0018
            X.6zT r0 = r2.A2E
            int r1 = r0.A00
            r0 = 3
            if (r1 != r0) goto L_0x053a
            java.lang.String r0 = r3.A04
            boolean r0 = r2.A0r(r0)
            if (r0 != 0) goto L_0x053a
            X.6zT r1 = r2.A2E
            r0 = 46
            X.C148816zT.A02(r1, r0)
            return
        L_0x012a:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.7cf r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            X.6rj r0 = (X.C144156rj) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1PZ r1 = r2.A1m()
            r0 = 6
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r5 = A00(r2, r1, r0)
            android.content.Context r4 = r2.A0a()
            X.0yC r1 = r5.A0K
            r0 = 6688(0x1a20, float:9.372E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x015d
            X.040 r3 = X.C109325Xd.A00(r5)
            X.02l r2 = r5.A0M
            r1 = 0
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1 r0 = new com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel$joinCall$1
            r0.<init>(r4, r5, r1)
            X.C36381kD.A1R(r2, r0, r3)
            return
        L_0x015d:
            X.6YM r2 = r5.A01
            if (r2 == 0) goto L_0x0018
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            X.C18740tg.A06(r1)
            boolean r0 = r2.A1S
            if (r0 != 0) goto L_0x016f
            X.C90474aD.A12(r2, r1)
        L_0x016f:
            X.1ND r1 = r2.A2G
            r0 = 1
            r1.B07(r4, r0)
            return
        L_0x0176:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.7cf r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            X.6rj r0 = (X.C144156rj) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1PZ r1 = r2.A1m()
            r0 = 24
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.6YM r2 = r0.A01
            if (r2 == 0) goto L_0x0018
            r1 = 1
            r0 = 0
            X.AnonymousClass6YM.A0A(r2, r0, r0, r1)
            return
        L_0x0196:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.7cf r1 = r0.A00
            if (r1 == 0) goto L_0x0018
            boolean r0 = r0.isSelected()
            X.6rj r1 = (X.C144156rj) r1
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r1.A00
            X.1PZ r1 = r2.A1m()
            int r0 = X.C36371kC.A00(r0)
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r2 = A00(r2, r1, r0)
            X.5SC r1 = r2.A00
            X.5SC r0 = X.AnonymousClass5SC.Creator
            if (r1 != r0) goto L_0x01ff
            boolean r0 = r2.A06
            r0 = r0 ^ 1
            r2.A06 = r0
            X.00s r4 = r2.A0A
            java.lang.Object r5 = r4.A04()
            X.6DD r5 = (X.AnonymousClass6DD) r5
            if (r5 == 0) goto L_0x0018
            java.util.List r0 = r5.A03
            boolean r3 = r2.A06
            java.util.ArrayList r8 = X.C36321k7.A0J(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x01d4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x054d
            java.lang.Object r1 = r2.next()
            X.66I r1 = (X.AnonymousClass66I) r1
            boolean r0 = r1 instanceof X.AnonymousClass53E
            if (r0 == 0) goto L_0x01f1
            X.53E r1 = (X.AnonymousClass53E) r1
            boolean r0 = r1.A02
            X.53E r1 = new X.53E
            r1.<init>(r3, r0)
        L_0x01ed:
            r8.add(r1)
            goto L_0x01d4
        L_0x01f1:
            boolean r0 = r1 instanceof X.AnonymousClass53F
            if (r0 == 0) goto L_0x01ed
            X.53F r1 = (X.AnonymousClass53F) r1
            boolean r0 = r1.A03
            X.53F r1 = new X.53F
            r1.<init>(r3, r0)
            goto L_0x01ed
        L_0x01ff:
            X.6YM r1 = r2.A01
            if (r1 == 0) goto L_0x0018
            X.74e r0 = new X.74e
            r0.<init>(r1)
            X.C90504aG.A17(r0, r1)
            return
        L_0x020c:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r1 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r1
            X.7cf r0 = r1.A00
            if (r0 == 0) goto L_0x0018
            boolean r3 = r1.isSelected()
            X.6rj r0 = (X.C144156rj) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r2 = r0.A00
            X.1PZ r1 = r2.A1m()
            r0 = 9
            if (r3 == 0) goto L_0x0226
            r0 = 10
        L_0x0226:
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r0 = A00(r2, r1, r0)
            X.6YM r0 = r0.A01
            if (r0 == 0) goto L_0x0018
            X.6zT r1 = r0.A2E
            r0 = 47
            X.C148816zT.A02(r1, r0)
            return
        L_0x0236:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView r0 = (com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetFooterView) r0
            X.7cf r0 = r0.A00
            if (r0 == 0) goto L_0x0018
            X.6rj r0 = (X.C144156rj) r0
            com.whatsapp.calling.lightweightcalling.view.AudioChatBottomSheetDialog r1 = r0.A00
            X.00T r0 = r1.A0N
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel r4 = (com.whatsapp.calling.lightweightcalling.viewmodel.VoiceChatBottomSheetViewModel) r4
            android.content.Context r6 = r1.A0a()
            android.os.Bundle r1 = r1.A0A
            if (r1 == 0) goto L_0x0273
            java.lang.String r0 = "voice_chat_call_from_ui"
            int r9 = r1.getInt(r0)
        L_0x0258:
            r5 = 0
            com.whatsapp.jid.GroupJid r1 = r4.A02
            if (r1 == 0) goto L_0x0018
            X.16D r3 = r4.A0F
            X.141 r2 = r3.A07(r1)
            if (r2 == 0) goto L_0x0018
            X.1HO r0 = r4.A0J
            X.5Ng r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x055e
            X.00s r0 = r4.A09
            X.C36341k9.A19(r0, r5)
            return
        L_0x0273:
            r9 = 0
            goto L_0x0258
        L_0x0275:
            java.lang.Object r4 = r14.A00
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            X.66x r3 = r4.A0u
            int r2 = X.AnonymousClass6YT.A01(r4)
            java.lang.Integer r1 = X.C36431kI.A12()
            r0 = 1
            r3.A02(r1, r0, r2)
            boolean r0 = r4.A0S()
            if (r0 != 0) goto L_0x0018
            X.14u r0 = r4.A0A
            r0.onBackPressed()
            return
        L_0x0295:
            java.lang.Object r4 = r14.A00
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            boolean r0 = r4.A0S()
            if (r0 != 0) goto L_0x0018
            X.7m8 r0 = r4.A0C
            java.lang.String r1 = r0.getFlashMode()
            java.lang.String r0 = "off"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x02d2
            java.lang.String r0 = "auto"
            boolean r0 = r1.equals(r0)
            r3 = 20
            if (r0 != 0) goto L_0x02bb
            r3 = 21
        L_0x02bb:
            X.66x r2 = r4.A0u
            r1 = 1
            int r0 = X.AnonymousClass6YT.A01(r4)
            X.C1270866x.A00(r2, r3, r1, r0)
            X.6WU r1 = r4.A0E
            X.7m8 r0 = r4.A0C
            java.lang.String r0 = r0.BQD()
            r1.A03(r0)
            goto L_0x0649
        L_0x02d2:
            r3 = 22
            goto L_0x02bb
        L_0x02d5:
            java.lang.Object r4 = r14.A00
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            boolean r0 = r4.A0S()
            if (r0 != 0) goto L_0x0018
            X.66x r2 = r4.A0u
            r3 = 1
            int r1 = X.AnonymousClass6YT.A01(r4)
            r0 = 26
            X.C1270866x.A00(r2, r0, r3, r1)
            X.6F9 r2 = r4.A0F
            if (r2 == 0) goto L_0x0018
            com.whatsapp.camera.CameraBottomSheetBehavior r1 = r2.A0B
            r0 = 3
            r1.A0W(r0)
            r1.A00 = r3
            android.view.View r1 = r2.A08
            r0 = 0
            r1.setVisibility(r0)
            r2.A00()
            return
        L_0x0303:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            r0 = 1
            r1.A1Z(r0)
            X.01I r1 = r1.A0i()
            boolean r0 = r1 instanceof X.C157967fa
            if (r0 == 0) goto L_0x0018
            X.7fa r1 = (X.C157967fa) r1
            r1.BTC()
            return
        L_0x0319:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.141 r0 = r2.A0z
            if (r0 == 0) goto L_0x0018
            X.11F r1 = r0.A0H
            if (r1 == 0) goto L_0x0018
            r0 = 7
            com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet r1 = X.C53492rP.A00(r1, r0)
            java.lang.String r0 = "SharePhoneNumberBottomSheet"
            r2.Btl(r1, r0)
            return
        L_0x0330:
            r3.A3w(r2)
            return
        L_0x0334:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$8$lambda$7(r0, r15)
            return
        L_0x033c:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$1(r0, r15)
            return
        L_0x0344:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$2(r0, r15)
            return
        L_0x034c:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$8$lambda$6(r0, r15)
            return
        L_0x0354:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$3(r0, r15)
            return
        L_0x035c:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$5(r0, r15)
            return
        L_0x0364:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.controls.view.CallControlCard r0 = (com.whatsapp.calling.controls.view.CallControlCard) r0
            com.whatsapp.calling.controls.view.CallControlCard.setupOnAttach$lambda$4(r0, r15)
            return
        L_0x036c:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity r1 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity) r1
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x0381
            X.00T r0 = r1.A0B
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r1 = (com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel) r1
            r0 = 0
            r1.A0S(r0)
            return
        L_0x0381:
            r1.finish()
            return
        L_0x0385:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            com.whatsapp.calling.header.ui.CallScreenHeaderView.setupOnAttach$lambda$2(r0, r15)
            return
        L_0x038d:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = (com.whatsapp.calling.header.ui.CallScreenHeaderView) r0
            com.whatsapp.calling.header.ui.CallScreenHeaderView.setupOnAttach$lambda$3(r0, r15)
            return
        L_0x0395:
            java.lang.Object r1 = r14.A00
            X.4fT r1 = (X.C93034fT) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.WaImageButton r0 = r1.A08
            goto L_0x03aa
        L_0x03a0:
            java.lang.Object r1 = r14.A00
            X.4fT r1 = (X.C93034fT) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.WaImageButton r0 = r1.A09
        L_0x03aa:
            r0.callOnClick()
            return
        L_0x03ae:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel r0 = (com.whatsapp.calling.lightweightcalling.viewmodel.AudioChatCallingViewModel) r0
            X.C93034fT.setViewModel$lambda$6(r0, r15)
            return
        L_0x03b6:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog r1 = (com.whatsapp.calling.lightweightcalling.view.VoiceChatIntroCardDialog) r1
            r0 = 1
            r1.A02 = r0
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x03c4
            r0.onClick(r15)
        L_0x03c4:
            r1.A1c()
            return
        L_0x03c8:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x03d0:
            java.lang.Object r0 = r14.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1b()
            return
        L_0x03d8:
            java.lang.Object r4 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r4 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r4
            r3 = 2131893936(0x7f121eb0, float:1.9422663E38)
            boolean r0 = r4.A0H
            r2 = r0 ^ 1
            r1 = 2130903047(0x7f030007, float:1.74129E38)
            r0 = 1
            com.whatsapp.SingleSelectionDialogFragment r2 = com.whatsapp.SingleSelectionDialogFragment.A06(r0, r3, r2, r1)
            X.01z r1 = r4.A0k()
            r0 = 0
            r2.A1f(r1, r0)
            return
        L_0x03f4:
            java.lang.Object r2 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r2 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r2
            android.app.TimePickerDialog r3 = r2.A01
            if (r3 != 0) goto L_0x0434
            android.content.Context r4 = r2.A0a()
            android.app.TimePickerDialog$OnTimeSetListener r5 = r2.A0J
            java.util.Calendar r1 = r2.A0F
            r0 = 11
            int r6 = r1.get(r0)
            java.util.Calendar r1 = r2.A0F
            r0 = 12
            int r7 = r1.get(r0)
            X.0ts r0 = r2.A0B
            X.1Kv r0 = X.C18820ts.A00(r0)
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x042c
            X.0ts r0 = r2.A0B
            java.util.Locale r0 = X.C36401kF.A0x(r0)
            int r1 = X.C26621Kw.A00(r0)
            if (r1 == 0) goto L_0x042c
            r0 = 3
            r8 = 0
            if (r1 != r0) goto L_0x042d
        L_0x042c:
            r8 = 1
        L_0x042d:
            android.app.TimePickerDialog r3 = new android.app.TimePickerDialog
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A01 = r3
        L_0x0434:
            r3.show()
            return
        L_0x0438:
            java.lang.Object r0 = r14.A00
            X.4oJ r0 = (X.C97044oJ) r0
            android.widget.PopupMenu r0 = r0.A02
            r0.show()
            return
        L_0x0442:
            java.lang.Object r1 = r14.A00
            X.4oJ r1 = (X.C97044oJ) r1
            android.content.Context r0 = r15.getContext()
            X.C97044oJ.A00(r0, r1)
            return
        L_0x044e:
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.views.LGCPreCallSheet r1 = (com.whatsapp.calling.views.LGCPreCallSheet) r1
            android.content.Context r0 = X.C36371kC.A0B(r15)
            r1.A1m(r0)
            return
        L_0x045a:
            java.lang.Object r0 = r14.A00
            X.8Wo r0 = (X.C174358Wo) r0
            X.00T r0 = r0.A09
            java.lang.Object r0 = r0.getValue()
            X.7yM r0 = (X.C167607yM) r0
            X.1Rs r1 = r0.A03
            X.8XA r0 = X.AnonymousClass8XA.A00
            r1.A0D(r0)
            return
        L_0x046e:
            java.lang.Object r1 = r14.A00
            X.6YL r1 = (X.AnonymousClass6YL) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 3
            r1.A0R(r0)
            return
        L_0x047b:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            X.00T r0 = r1.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.00r r0 = r0.A00
            java.lang.Object r0 = r0.A04()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x0493
            java.lang.String r0 = ""
        L_0x0493:
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A06(r1, r0)
            return
        L_0x0497:
            java.lang.Object r1 = r14.A00
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = (com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment) r1
            com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment.A05(r1)
            X.00T r0 = r1.A0Q
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r4 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r4
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel r0 = (com.whatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel) r0
            X.00r r0 = r0.A00
            java.lang.Object r3 = r0.A04()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x04b8
            java.lang.String r3 = ""
        L_0x04b8:
            X.00T r0 = r1.A0M
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.9uZ r1 = r1.A0C
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r4.A0S(r1, r2, r3)
            return
        L_0x04ca:
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r1 = (com.whatsapp.chatinfo.ContactInfoActivity) r1
            X.0v5 r0 = r1.A05
            r0.A02()
            com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet r0 = new com.whatsapp.inappsupport.ui.AboutAiSupportAssistantBottomSheet
            r0.<init>()
            r1.Btm(r0)
            return
        L_0x04dc:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.2EI r2 = r4.A0h
            X.9uI r1 = r4.A0S
            r0 = 3
            r2.A0V(r1, r0)
            X.1ND r3 = r4.A0Z
            X.141 r2 = r4.A0z
            r1 = 6
            r0 = 1
            r3.Bua(r4, r2, r1, r0)
            return
        L_0x04f2:
            java.lang.Object r6 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r6 = (com.whatsapp.chatinfo.ContactInfoActivity) r6
            com.whatsapp.jid.UserJid r5 = r6.A3t()
            long r2 = r6.A00
            android.content.Intent r4 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.KeptMessagesActivity"
            r4.setClassName(r1, r0)
            java.lang.String r1 = X.AnonymousClass143.A03(r5)
            java.lang.String r0 = "jid"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "keptMessageCount"
            r4.putExtra(r0, r2)
            r6.startActivity(r4)
            return
        L_0x051b:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            android.content.Context r1 = r2.getApplicationContext()
            com.whatsapp.jid.UserJid r0 = r2.A3t()
            android.content.Intent r1 = X.AnonymousClass190.A0j(r1, r0)
            r0 = 12
            r2.startActivityForResult(r1, r0)
            return
        L_0x0531:
            X.61I r0 = r7.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = r0.A00
            r0 = 0
            com.whatsapp.voipcalling.VoipActivityV2.A1E(r1, r0)
            return
        L_0x053a:
            X.6zT r2 = r2.A2E
            int r1 = r2.A00
            r0 = 3
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r1 = r0 ^ 1
            com.whatsapp.voipcalling.CallInfo r0 = com.whatsapp.voipcalling.Voip.getCallInfo()
            r2.A0C(r0, r1)
            return
        L_0x054d:
            X.5wC r6 = r5.A01
            boolean r9 = r5.A05
            boolean r10 = r5.A04
            X.3Bc r7 = r5.A02
            X.6DD r5 = new X.6DD
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A0C(r5)
            return
        L_0x055e:
            X.1ND r5 = r4.A0D
            X.17X r1 = r4.A0I
            X.0wQ r0 = r4.A0B
            java.util.List r8 = X.AnonymousClass3UL.A04(r0, r3, r1, r2)
            com.whatsapp.jid.GroupJid r7 = r4.A02
            r11 = 1
            boolean r12 = r4.A06
            X.1NE r5 = (X.AnonymousClass1NE) r5
            r10 = 0
            r5.BPc(r6, r7, r8, r9, r10, r11, r12)
            r4.A07 = r11
            return
        L_0x0576:
            java.lang.Object r5 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r5 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r5
            com.whatsapp.WaEditText r0 = r5.A05
            android.text.Editable r0 = r0.getText()
            X.C18740tg.A06(r0)
            java.lang.String r8 = r0.toString()
            boolean r0 = X.AnonymousClass14B.A0F(r8)
            if (r0 == 0) goto L_0x058f
            java.lang.String r8 = r5.A0E
        L_0x058f:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Calendar r0 = r5.A0F
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x05d3
            java.util.Calendar r0 = r5.A0F
            long r3 = r0.getTimeInMillis()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x05d3
            X.0wo r6 = r5.A0A
            X.11F r4 = r5.A0D
            X.0wQ r3 = r5.A02
            X.0xM r2 = r5.A0C
            boolean r13 = r5.A0H
            java.util.Calendar r0 = r5.A0F
            long r11 = r0.getTimeInMillis()
            r1 = 1
            java.lang.String r0 = X.C237919w.A00(r3, r6)
            X.3Qa r7 = new X.3Qa
            r7.<init>(r4, r0, r1)
            long r9 = X.C19970wo.A00(r6)
            X.2c9 r6 = new X.2c9
            r6.<init>(r7, r8, r9, r11, r13)
            r2.A0h(r6)
            r5.A0G = r1
            r5.A1b()
            return
        L_0x05d3:
            X.1qm r1 = X.AnonymousClass3LW.A04(r5)
            r0 = 2131893790(0x7f121e1e, float:1.9422366E38)
            java.lang.String r0 = r5.A0n(r0)
            X.C39001qm.A0A(r1, r0)
            X.0FM r0 = r1.create()
            goto L_0x0622
        L_0x05e6:
            java.lang.Object r2 = r14.A00
            com.whatsapp.calling.schedulecall.ScheduleCallFragment r2 = (com.whatsapp.calling.schedulecall.ScheduleCallFragment) r2
            X.4fy r0 = r2.A08
            if (r0 != 0) goto L_0x0620
            java.util.Calendar r4 = java.util.Calendar.getInstance()
            android.content.Context r7 = r2.A0a()
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            r9 = 0
            r6 = 0
            r10 = -1
            r11 = -1
            r12 = -1
            X.4fy r5 = new X.4fy
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r2.A08 = r5
            android.app.DatePickerDialog$OnDateSetListener r0 = r2.A0I
            r5.A00 = r0
            android.widget.DatePicker r3 = r5.A01
            long r0 = r4.getTimeInMillis()
            r3.setMinDate(r0)
            r1 = 6
            r0 = 180(0xb4, float:2.52E-43)
            r4.add(r1, r0)
            long r0 = r4.getTimeInMillis()
            r3.setMaxDate(r0)
        L_0x0620:
            X.4fy r0 = r2.A08
        L_0x0622:
            r0.show()
            return
        L_0x0626:
            java.lang.Object r4 = r14.A00
            X.6YT r4 = (X.AnonymousClass6YT) r4
            java.util.HashMap r0 = X.AnonymousClass6WU.A0N
            X.66x r3 = r4.A0u
            int r2 = X.AnonymousClass6YT.A01(r4)
            X.7m8 r0 = r4.A0C
            boolean r1 = r0.BLt()
            r0 = 50
            if (r1 == 0) goto L_0x063e
            r0 = 51
        L_0x063e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r3.A02(r1, r0, r2)
            X.AnonymousClass6YT.A08(r4)
        L_0x0649:
            X.AnonymousClass6YT.A06(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C135456cj.onClick(android.view.View):void");
    }
}
