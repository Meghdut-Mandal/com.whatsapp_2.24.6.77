package X;

import android.view.View;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2iE  reason: invalid class name and case insensitive filesystem */
public class C48892iE extends C33541fX {
    public Object A00;
    public final int A01;

    public C48892iE(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C48892iE(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.whatsapp.chatinfo.ListChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: com.whatsapp.chatinfo.ContactInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: com.whatsapp.chatinfo.ListChatInfoActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: com.whatsapp.chatinfo.ListChatInfoActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x034f, code lost:
        r1.A0D(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0352, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x041c, code lost:
        if (r0 != null) goto L_0x0404;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0448, code lost:
        r0.A0X(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x044b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04a4, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x053a, code lost:
        r4.Btl(r3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x053e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0595, code lost:
        r2.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0598, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0643, code lost:
        r5.Btl(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0646, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0768, code lost:
        if (r4 != false) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x07ca, code lost:
        r4.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x07cd, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r15) {
        /*
            r14 = this;
            int r0 = r14.A01
            switch(r0) {
                case 0: goto L_0x0282;
                case 1: goto L_0x029a;
                case 2: goto L_0x000f;
                case 3: goto L_0x02ac;
                case 4: goto L_0x02b2;
                case 5: goto L_0x02d6;
                case 6: goto L_0x0087;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x031b;
                case 12: goto L_0x032a;
                case 13: goto L_0x032a;
                case 14: goto L_0x0334;
                case 15: goto L_0x033f;
                case 16: goto L_0x0353;
                case 17: goto L_0x0359;
                case 18: goto L_0x00ba;
                case 19: goto L_0x0371;
                case 20: goto L_0x0379;
                case 21: goto L_0x03ca;
                case 22: goto L_0x0429;
                case 23: goto L_0x044f;
                case 24: goto L_0x047a;
                case 25: goto L_0x00c8;
                case 26: goto L_0x016e;
                case 27: goto L_0x04a8;
                case 28: goto L_0x0181;
                case 29: goto L_0x04c2;
                case 30: goto L_0x04d3;
                case 31: goto L_0x01b9;
                case 32: goto L_0x04ec;
                case 33: goto L_0x04fa;
                case 34: goto L_0x0514;
                case 35: goto L_0x053f;
                case 36: goto L_0x057d;
                case 37: goto L_0x0599;
                case 38: goto L_0x079f;
                case 39: goto L_0x0614;
                case 40: goto L_0x0624;
                case 41: goto L_0x01fb;
                case 42: goto L_0x0667;
                case 43: goto L_0x068b;
                case 44: goto L_0x06b9;
                case 45: goto L_0x06d0;
                case 46: goto L_0x021b;
                case 47: goto L_0x06dd;
                case 48: goto L_0x06f4;
                case 49: goto L_0x076b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r14.A00
            X.4kv r0 = (X.C95434kv) r0
            X.4PO r0 = r0.A06
            r0.BTG()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r4 = r14.A00
            X.4ze r4 = (X.C102264ze) r4
            int r6 = r4.A05
            r0 = -1
            if (r6 != r0) goto L_0x001a
            int r6 = r4.A04
        L_0x001a:
            if (r6 == r0) goto L_0x000e
            X.7kF r0 = r4.A09
            X.9up r5 = r0.BGG(r6)
            android.view.View r2 = r4.A0H
            android.content.Context r1 = r2.getContext()
            r0 = 0
            android.content.Intent r7 = X.AnonymousClass190.A1S(r1, r0, r0)
            X.4PF r0 = r4.A01
            if (r0 == 0) goto L_0x004c
            X.367 r3 = r0.B9s(r6)
            if (r3 == 0) goto L_0x004c
            java.lang.String r1 = r3.A01
            java.lang.String r0 = "collection_index"
            r7.putExtra(r0, r1)
            java.lang.String r1 = r3.A02
            java.lang.String r0 = "product_index"
            r7.putExtra(r0, r1)
            java.lang.String r1 = r3.A00
            java.lang.String r0 = "collection_id"
            r7.putExtra(r0, r1)
        L_0x004c:
            android.widget.ImageView r3 = r4.A03
            r0 = 2131431278(0x7f0b0f6e, float:1.848428E38)
            java.lang.Object r0 = r3.getTag(r0)
            if (r0 != 0) goto L_0x005d
            r1 = 1
            java.lang.String r0 = "partial_loaded"
            r7.putExtra(r0, r1)
        L_0x005d:
            X.4PG r0 = r4.A02
            if (r0 == 0) goto L_0x0064
            r0.Bdb(r5, r6)
        L_0x0064:
            com.whatsapp.jid.UserJid r8 = r4.A0C
            java.lang.String r11 = r5.A0F
            X.0wQ r0 = r4.A00
            boolean r13 = r0.A0M(r8)
            int r0 = r3.getWidth()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            int r0 = r3.getHeight()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            android.content.Context r6 = r2.getContext()
            r12 = 3
            X.AnonymousClass3SM.A01(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0087:
            int r1 = r15.getId()
            r0 = 2131428239(0x7f0b038f, float:1.8478117E38)
            if (r1 != r0) goto L_0x00a2
            java.lang.Object r2 = r14.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r2 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r2
            X.4Sr r1 = r2.A02
            if (r1 == 0) goto L_0x009f
            X.1sN r0 = r2.A03
            java.util.Set r0 = r0.A03
            r1.BbF(r0)
        L_0x009f:
            r2.A1b()
        L_0x00a2:
            int r1 = r15.getId()
            r0 = 2131428241(0x7f0b0391, float:1.847812E38)
            if (r1 != r0) goto L_0x000e
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment r0 = (com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment) r0
            X.1sN r1 = r0.A03
            java.util.Set r0 = r1.A03
            r0.clear()
            X.C39461sN.A01(r1)
            return
        L_0x00ba:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r0 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r0
            X.4oI r0 = r0.A05
            if (r0 == 0) goto L_0x000e
            android.view.View r0 = r0.A0H
            r0.performClick()
            return
        L_0x00c8:
            java.lang.Object r3 = r14.A00
            X.52q r3 = (X.C1029452q) r3
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.52t r2 = r3.A00
            if (r2 == 0) goto L_0x000e
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x0794
            r0 = 2
            if (r1 == r0) goto L_0x0794
            com.whatsapp.calling.controls.viewmodel.ParticipantsListViewModel r8 = r3.A00
            if (r8 == 0) goto L_0x000e
            com.whatsapp.jid.UserJid r4 = r2.A02
            android.content.Context r7 = r15.getContext()
            X.1PZ r3 = r8.A05
            X.1hi r0 = r8.A0A
            boolean r0 = X.C36351kA.A1W(r0)
            r2 = 16
            if (r0 == 0) goto L_0x00f2
            r2 = 35
        L_0x00f2:
            java.lang.Integer r1 = X.C36391kE.A0r()
            r0 = 22
            r3.A01(r1, r0, r2)
            X.1NG r6 = r8.A03
            boolean r0 = r6.A0O(r4)
            if (r0 == 0) goto L_0x0133
            android.app.Activity r5 = X.C24801Dv.A00(r7)
            X.14u r5 = (X.C225314u) r5
            X.16D r0 = r8.A06
            X.141 r3 = r0.A09(r4)
            r2 = 2131895990(0x7f1226b6, float:1.9426829E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0L()
            X.171 r0 = r8.A07
            java.lang.String r0 = r0.A0H(r3)
            r3 = 0
            java.lang.String r2 = X.C36391kE.A0v(r7, r0, r1, r3, r2)
            r1 = 2131886926(0x7f12034e, float:1.9408445E38)
            X.2rN r0 = new X.2rN
            r0.<init>(r5, r4, r6, r3)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = com.whatsapp.blocklist.UnblockDialogFragment.A03(r0, r2, r1, r3)
            java.lang.String r0 = "UnblockDialogFragment"
            r5.Btl(r1, r0)
            return
        L_0x0133:
            X.61I r3 = r8.A00
            if (r3 == 0) goto L_0x0155
            com.whatsapp.voipcalling.VoipActivityV2 r2 = r3.A00
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.VoipActivityV2.A01(r2)
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.isCallFull()
            if (r0 == 0) goto L_0x0778
            r1 = 6
            X.3FU r0 = new X.3FU
            r0.<init>()
            com.whatsapp.voipcalling.VoipErrorDialogFragment r1 = com.whatsapp.voipcalling.VoipErrorDialogFragment.A05(r0, r1)
            java.lang.String r0 = "VoipErrorDialogFragment"
            r2.A3o(r1, r0)
            return
        L_0x0155:
            X.5Fb r0 = r8.A04
            X.6YM r2 = r0.A01
            if (r2 == 0) goto L_0x000e
            com.whatsapp.voipcalling.CallInfo r1 = com.whatsapp.voipcalling.Voip.getCallInfo()
            boolean r0 = r1.isCallFull()
            if (r0 == 0) goto L_0x078f
            java.util.List r1 = java.util.Collections.singletonList(r4)
            r0 = 6
            r2.A0l(r1, r0)
            return
        L_0x016e:
            java.lang.Object r2 = r14.A00
            com.whatsapp.calling.views.PermissionDialogFragment r2 = (com.whatsapp.calling.views.PermissionDialogFragment) r2
            android.app.Dialog r0 = r2.A01
            r0.dismiss()
            X.4Su r1 = r2.A04
            if (r1 == 0) goto L_0x000e
            int r0 = r2.A00
            r1.Bcc(r0)
            return
        L_0x0181:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.2Sj r1 = r4.A15
            if (r1 == 0) goto L_0x018f
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A07 = r0
        L_0x018f:
            X.1EV r0 = r4.A1D
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x000e
            X.1EU r0 = r4.A1E
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFV()
            if (r0 == 0) goto L_0x000e
            android.content.Intent r2 = X.C36441kJ.A0H(r4, r0)
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "extra_jid"
            android.content.Intent r3 = r2.putExtra(r0, r1)
            goto L_0x07ca
        L_0x01b9:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.1NG r1 = r4.A0V
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = r1.A0O(r0)
            java.lang.String r3 = "account_info_block"
            if (r0 == 0) goto L_0x0798
            X.1NG r2 = r4.A0V
            X.141 r1 = r4.A0z
            r0 = 1
            r2.A0G(r4, r1, r3, r0)
            X.0xf r1 = r4.A13
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            boolean r0 = X.AnonymousClass3M3.A01(r1, r0)
            if (r0 == 0) goto L_0x000e
            X.0xf r2 = r4.A13
            X.0wU r5 = r4.A04
            X.0yW r3 = r4.A14
            X.1Cv r1 = r4.A0w
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r4 = X.C36351kA.A0k(r0)
            java.lang.Integer r6 = X.C36371kC.A0n()
            r8 = 2
            r7 = 0
            X.C65093Qs.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x01fb:
            java.lang.Object r1 = r14.A00
            X.2Dw r1 = (X.C43102Dw) r1
            X.00S r0 = r1.A05
            r0.invoke()
            android.content.Context r0 = r1.A00
            android.app.Activity r2 = X.C24801Dv.A00(r0)
            boolean r0 = r2 instanceof X.C225014r
            if (r0 == 0) goto L_0x000e
            X.14r r2 = (X.C225014r) r2
            X.11F r0 = r1.A03
            com.whatsapp.mute.ui.MuteDialogFragment r1 = X.AnonymousClass3RD.A00(r0)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x021b:
            java.lang.Object r5 = r14.A00
            com.whatsapp.community.CommunityHomeActivity r5 = (com.whatsapp.community.CommunityHomeActivity) r5
            X.3H3 r0 = r5.A0T
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0238
            X.1qm r1 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131891653(0x7f1215c5, float:1.9418032E38)
            X.C39001qm.A02(r5, r1, r0)
            X.C39001qm.A04(r5, r1)
            r1.A0b()
            return
        L_0x0238:
            X.147 r2 = r5.A0k
            if (r2 == 0) goto L_0x000e
            X.1tr r0 = r5.A0d
            if (r0 == 0) goto L_0x000e
            X.0xQ r1 = r5.A0f
            X.16D r0 = r1.A0C
            X.141 r0 = r0.A0A(r2)
            if (r0 != 0) goto L_0x0279
            r4 = 0
        L_0x024b:
            X.1tr r0 = r5.A0d
            X.1hi r0 = r0.A0K
            int r0 = X.C36341k9.A07(r0)
            r13 = 1
            int r0 = r0 - r13
            if (r0 >= r4) goto L_0x07ce
            X.01z r4 = r5.getSupportFragmentManager()
            X.147 r6 = r5.A0k
            X.147 r7 = r5.A0l
            java.util.List r8 = java.util.Collections.emptyList()
            X.3xz r9 = X.C82003xz.A00
            r0 = 0
            X.1vp r10 = new X.1vp
            r10.<init>(r5, r0)
            X.C36321k7.A0v(r4, r0, r6)
            r0 = 5
            X.C36381kD.A1K(r8, r0, r9)
            r11 = 17
            r12 = 6
            X.C54422sv.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0279:
            X.17X r0 = r1.A0U
            int r0 = r0.A01(r2)
            int r4 = r0 + -1
            goto L_0x024b
        L_0x0282:
            android.content.Context r3 = r15.getContext()
            java.lang.Object r2 = r14.A00
            X.8WH r2 = (X.AnonymousClass8WH) r2
            com.whatsapp.jid.UserJid r1 = r2.A0q
            java.lang.Integer r0 = X.C36391kE.A0r()
            android.content.Intent r1 = X.C36431kI.A0E(r3, r1, r0)
            X.1Dv r0 = r2.A01
            r0.A06(r3, r1)
            return
        L_0x029a:
            java.lang.Object r0 = r14.A00
            X.8WH r0 = (X.AnonymousClass8WH) r0
            X.7yU r2 = r0.A0h
            X.0wD r0 = r2.A0H
            boolean r1 = r0.A09()
            X.00s r0 = r2.A08
            X.C36341k9.A18(r0, r1)
            return
        L_0x02ac:
            java.lang.Object r0 = r14.A00
            X.C36431kI.A1N(r0)
            return
        L_0x02b2:
            java.lang.Object r2 = r14.A00
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r2 = (com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r2
            int r1 = r2.A00
            r0 = -1
            if (r1 != r0) goto L_0x02c5
            X.17Y r2 = r2.A01
            r1 = 2131887616(0x7f120600, float:1.9409844E38)
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x02c5:
            X.33v[] r0 = r2.A03
            r0 = r0[r1]
            java.lang.String r1 = r0.A01
            X.4PH r0 = r2.A02
            if (r0 == 0) goto L_0x02d2
            r0.Ben(r1)
        L_0x02d2:
            r2.A1c()
            return
        L_0x02d6:
            java.lang.Object r4 = r14.A00
            X.8Wd r4 = (X.C174338Wd) r4
            X.9Y1 r2 = r4.A0E
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.9Y1 r0 = r4.A0E
            X.C36321k7.A0p(r1, r0)
            r0 = 32
            X.C36401kF.A1F(r1, r0)
            r0 = 50
            X.C36411kG.A1G(r1, r0)
            X.4kf r0 = r4.A0H
            X.9Uf r0 = r0.A02
            X.00r r0 = r0.A03
            java.util.List r0 = X.C36401kF.A0w(r0)
            boolean r0 = X.AnonymousClass9ZJ.A00(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01(r0)
            com.whatsapp.jid.UserJid r0 = r4.A0M
            r1.A00 = r0
            r2.A03(r1)
            X.4kf r0 = r4.A0H
            X.3Ba r3 = r0.A06
            com.whatsapp.jid.UserJid r2 = r0.A05
            r1 = 2
            r0 = 0
            com.whatsapp.biz.cart.view.fragment.CartFragment r0 = r3.A00(r2, r0, r1)
            r4.Btm(r0)
            return
        L_0x031b:
            java.lang.Object r2 = r14.A00
            X.5uh r2 = (X.C122345uh) r2
            X.5w7 r1 = r2.A01
            r0 = 4
            r1.A01 = r0
            X.00s r0 = r2.A00
            r0.A0D(r1)
            return
        L_0x032a:
            java.lang.Object r0 = r14.A00
            X.0D3 r0 = (X.AnonymousClass0D3) r0
            android.view.View r0 = r0.A0H
            r0.callOnClick()
            return
        L_0x0334:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r0
            X.1Rs r1 = r0.A0d
            java.lang.Integer r0 = X.C36421kH.A0W()
            goto L_0x034f
        L_0x033f:
            java.lang.Object r0 = r14.A00
            com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment r0 = (com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment) r0
            X.00T r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            X.7yE r0 = (X.C167537yE) r0
            X.1Rs r1 = r0.A03
            X.3Mi r0 = X.C64023Mi.A00
        L_0x034f:
            r1.A0D(r0)
            return
        L_0x0353:
            java.lang.Object r0 = r14.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0359:
            android.content.Intent r2 = X.C36431kI.A0C()
            java.lang.Object r1 = r14.A00
            com.whatsapp.calling.VoipAppUpdateActivity r1 = (com.whatsapp.calling.VoipAppUpdateActivity) r1
            X.1fu r0 = r1.A00
            android.net.Uri r0 = r0.A00()
            r2.setData(r0)
            r1.startActivity(r2)
            r1.finish()
            return
        L_0x0371:
            java.lang.Object r0 = r14.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r0 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r0
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet.A0x(r0)
            return
        L_0x0379:
            java.lang.Object r1 = r14.A00
            X.52e r1 = (X.C1028452e) r1
            X.6rN r6 = r1.A00
            if (r6 == 0) goto L_0x03c6
            X.1dg r0 = r1.A01
            if (r0 == 0) goto L_0x03c6
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r5 = r0.A00
            X.0V9 r0 = r5.A03
            if (r0 == 0) goto L_0x038f
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r1, r5)
            return
        L_0x038f:
            android.content.Context r4 = r5.A1D()
            if (r4 != 0) goto L_0x0399
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onMultiContactPhotoClicked context null"
            goto L_0x04a4
        L_0x0399:
            X.72P r0 = r6.A01
            java.util.ArrayList r0 = r0.A03
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r0 = X.C36391kE.A0t(r0)
            X.5Nh r0 = (X.C107265Nh) r0
            X.6by r3 = r0.A09()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.callhistory.group.GroupCallLogActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "call_log_key"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r5.A0F
            r0.A0X(r6)
            return
        L_0x03c6:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onMultiContactPhotoClicked call item/event listener is null"
            goto L_0x04a4
        L_0x03ca:
            java.lang.Object r5 = r14.A00
            X.52e r5 = (X.C1028452e) r5
            X.6rN r3 = r5.A00
            if (r3 == 0) goto L_0x0426
            X.1dg r0 = r5.A01
            if (r0 == 0) goto L_0x0426
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r4 = r0.A00
            X.0V9 r0 = r4.A03
            if (r0 == 0) goto L_0x03e0
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r5, r4)
            return
        L_0x03e0:
            X.72P r1 = r3.A01
            X.141 r0 = r1.A02()
            if (r0 != 0) goto L_0x041f
            r0 = 0
        L_0x03e9:
            java.util.ArrayList r2 = r1.A03
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x041c
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            java.lang.Object r1 = X.C36391kE.A0t(r1)
            X.5Nh r1 = (X.C107265Nh) r1
            com.whatsapp.jid.GroupJid r1 = r1.A0D
            if (r1 == 0) goto L_0x041c
            r0 = r1
        L_0x0404:
            X.00T r1 = r5.A0I
            android.view.View r2 = X.C36361kB.A0I(r1)
            java.lang.Integer r1 = X.C36381kD.A0n()
            X.3Pd r1 = X.C64713Pd.A00(r2, r0, r1)
            X.01I r0 = r4.A0h()
            r1.A02(r0)
        L_0x0419:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r4.A0F
            goto L_0x0448
        L_0x041c:
            if (r0 == 0) goto L_0x0419
            goto L_0x0404
        L_0x041f:
            com.whatsapp.jid.Jid r0 = X.C36431kI.A0h(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            goto L_0x03e9
        L_0x0426:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onSingleContactPhotoClicked call item/event listener is null"
            goto L_0x04a4
        L_0x0429:
            java.lang.Object r1 = r14.A00
            X.52e r1 = (X.C1028452e) r1
            X.6rN r3 = r1.A00
            if (r3 == 0) goto L_0x044c
            X.1dg r0 = r1.A01
            if (r0 == 0) goto L_0x044c
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = r0.A00
            X.0V9 r0 = r2.A03
            if (r0 == 0) goto L_0x043f
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r1, r2)
            return
        L_0x043f:
            X.72P r1 = r3.A01
            X.141 r0 = r3.A03
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A06(r1, r2, r0)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r2.A0F
        L_0x0448:
            r0.A0X(r3)
            return
        L_0x044c:
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/viewHolderClicked call item/event listener is null"
            goto L_0x04a4
        L_0x044f:
            r0 = 0
            X.AnonymousClass00C.A0D(r15, r0)
            java.lang.Object r1 = r14.A00
            X.52d r1 = (X.C1028352d) r1
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1dj r2 = r1.A04
            if (r2 == 0) goto L_0x0477
            X.141 r0 = r1.A05
            if (r0 == 0) goto L_0x0477
            X.11F r1 = r0.A0H
            if (r1 == 0) goto L_0x0477
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r2 = r2.A00
            java.lang.Integer r0 = X.C36381kD.A0n()
            X.3Pd r1 = X.C64713Pd.A00(r15, r1, r0)
            X.01I r0 = r2.A0h()
            r1.A02(r0)
            return
        L_0x0477:
            java.lang.String r0 = "ScheduledCallItemViewHolder/contactPhotoClicked event listener, group contact, and/or chat jid is null"
            goto L_0x04a4
        L_0x047a:
            java.lang.Object r6 = r14.A00
            X.52d r6 = (X.C1028352d) r6
            java.util.List r0 = X.AnonymousClass0D3.A0I
            X.1dj r0 = r6.A04
            if (r0 == 0) goto L_0x04a2
            X.141 r5 = r6.A05
            if (r5 == 0) goto L_0x04a2
            long r3 = r6.A01
            X.72P r2 = r6.A02
            if (r2 != 0) goto L_0x0494
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r0.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A09(r0, r5, r3)
            return
        L_0x0494:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r1 = r0.A00
            X.0V9 r0 = r1.A03
            if (r0 == 0) goto L_0x049e
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A07(r6, r1)
            return
        L_0x049e:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A06(r2, r1, r5)
            return
        L_0x04a2:
            java.lang.String r0 = "ScheduledCallItemViewHolder/viewHolderClicked event listener and/or chat jid is null"
        L_0x04a4:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x04a8:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.2Sj r1 = r2.A15
            if (r1 == 0) goto L_0x04b6
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A0B = r0
        L_0x04b6:
            X.141 r0 = r2.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            android.content.Intent r0 = X.AnonymousClass190.A0k(r2, r0)
            goto L_0x0595
        L_0x04c2:
            java.lang.Object r3 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.2XH r2 = r3.A1A
            X.141 r0 = r3.A0z
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0k(r0)
            r0 = 0
            r2.A07(r3, r1, r0)
            return
        L_0x04d3:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.2Sj r1 = r2.A15
            if (r1 == 0) goto L_0x04e1
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A08 = r0
        L_0x04e1:
            X.19g r0 = r2.A11
            X.3ty r1 = r0.A07()
            r0 = 0
            X.C79593ty.A00(r1, r14, r0)
            return
        L_0x04ec:
            com.whatsapp.interop.ui.InteropSystemAboutBottomSheet r2 = new com.whatsapp.interop.ui.InteropSystemAboutBottomSheet
            r2.<init>()
            java.lang.Object r1 = r14.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 0
            r1.Btl(r2, r0)
            return
        L_0x04fa:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.2Sj r1 = r4.A15
            if (r1 == 0) goto L_0x0508
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A05 = r0
        L_0x0508:
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r1 = X.C36351kA.A0k(r0)
            r0 = 0
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r3 = X.C53902s5.A00(r1, r0)
            goto L_0x053a
        L_0x0514:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.2Sj r1 = r4.A15
            if (r1 == 0) goto L_0x0522
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A05 = r0
        L_0x0522:
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            r2 = 0
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r3.<init>()
            android.os.Bundle r1 = X.C36331k8.A07(r0)
            java.lang.String r0 = "business_state_id"
            r1.putInt(r0, r2)
            r3.A17(r1)
        L_0x053a:
            r0 = 0
            r4.Btl(r3, r0)
            return
        L_0x053f:
            java.lang.Object r3 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r3 = (com.whatsapp.chatinfo.ContactInfoActivity) r3
            X.9jr r4 = r3.A0R
            X.141 r0 = r3.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            java.lang.String r7 = X.AnonymousClass143.A03(r0)
            java.lang.Integer r6 = r3.A1a
            boolean r9 = com.whatsapp.chatinfo.ContactInfoActivity.A1B(r3)
            boolean r10 = com.whatsapp.chatinfo.ContactInfoActivity.A19(r3)
            r8 = 7
            r5 = 0
            r4.A06(r5, r6, r7, r8, r9, r10)
            X.2EI r2 = r3.A0h
            X.9uI r1 = r3.A0S
            r0 = 12
            r2.A0V(r1, r0)
            X.141 r0 = r3.A0z
            com.whatsapp.jid.UserJid r2 = X.C36351kA.A0k(r0)
            boolean r0 = r2 instanceof X.C223313w
            if (r0 == 0) goto L_0x0579
            X.0wU r1 = r3.A04
            r0 = 29
            X.C36411kG.A1M(r1, r3, r2, r0)
            return
        L_0x0579:
            r3.A3x(r2)
            return
        L_0x057d:
            java.lang.Object r2 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r2 = (com.whatsapp.chatinfo.ContactInfoActivity) r2
            X.2Sj r1 = r2.A15
            if (r1 == 0) goto L_0x058b
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A05 = r0
        L_0x058b:
            X.141 r0 = r2.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            android.content.Intent r0 = X.AnonymousClass190.A0u(r2, r0)
        L_0x0595:
            r2.startActivity(r0)
            return
        L_0x0599:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r5 = (com.whatsapp.chatinfo.ContactInfoActivity) r5
            X.2Sj r1 = r5.A15
            if (r1 == 0) goto L_0x05a7
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.A05 = r0
        L_0x05a7:
            X.0yC r1 = r5.A0D
            r0 = 7131(0x1bdb, float:9.993E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x05ef
            X.185 r4 = r5.A0j
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r8 = X.C36351kA.A0k(r0)
            X.18y r2 = r5.A0m
            r7 = 0
            boolean r6 = X.C36341k9.A1a(r4, r8)
            r1 = 2
            X.AnonymousClass00C.A0D(r2, r1)
            com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet r3 = new com.whatsapp.conversation.conversationrow.bottomsheets.PrivacyInfoBottomSheet
            r3.<init>()
            X.3U1 r0 = new X.3U1
            r0.<init>((X.AnonymousClass185) r4, (X.C235618y) r2, (com.whatsapp.jid.UserJid) r8)
            int r4 = r0.A03()
            X.011[] r2 = new X.AnonymousClass011[r1]
            java.lang.String r1 = r8.getRawString()
            java.lang.String r0 = "jid"
            X.C36341k9.A1J(r0, r1, r2, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.String r0 = "business_state_id"
            X.C36341k9.A1J(r0, r1, r2, r6)
            android.os.Bundle r0 = X.C05430Pr.A00(r2)
            r3.A17(r0)
        L_0x05ed:
            r0 = 0
            goto L_0x0643
        L_0x05ef:
            X.185 r3 = r5.A0j
            X.141 r0 = r5.A0z
            com.whatsapp.jid.UserJid r2 = X.C36351kA.A0k(r0)
            X.18y r1 = r5.A0m
            X.3U1 r0 = new X.3U1
            r0.<init>((X.AnonymousClass185) r3, (X.C235618y) r1, (com.whatsapp.jid.UserJid) r2)
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r3 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C36331k8.A07(r2)
            int r1 = r0.A03()
            java.lang.String r0 = "business_state_id"
            r2.putInt(r0, r1)
            r3.A17(r2)
            goto L_0x05ed
        L_0x0614:
            java.lang.Object r1 = r14.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r1 = (com.whatsapp.chatinfo.ListChatInfoActivity) r1
            X.8dx r0 = r1.A3t()
            android.content.Intent r0 = X.AnonymousClass190.A0k(r1, r0)
            r1.startActivity(r0)
            return
        L_0x0624:
            java.lang.Object r5 = r14.A00
            com.whatsapp.chatinfo.ListChatInfoActivity r5 = (com.whatsapp.chatinfo.ListChatInfoActivity) r5
            X.17X r1 = r5.A0M
            X.8dx r0 = r5.A3t()
            boolean r0 = r1.A0F(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0647
            r0 = 5
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A03(r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getCanonicalName()
        L_0x0643:
            r5.Btl(r3, r0)
            return
        L_0x0647:
            X.8dx r0 = r5.A3t()
            r4 = 0
            r3 = 1
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r2 = new com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C36331k8.A07(r0)
            java.lang.String r0 = "provider_category"
            r1.putInt(r0, r3)
            java.lang.String r0 = "display_name"
            r1.putString(r0, r4)
            r2.A17(r1)
            X.C36421kH.A1A(r2, r5)
            return
        L_0x0667:
            java.lang.Object r5 = r14.A00
            com.whatsapp.community.AboutCommunityBottomSheetFragment r5 = (com.whatsapp.community.AboutCommunityBottomSheetFragment) r5
            r5.A1b()
            X.1Sq r4 = r5.A01
            android.content.Context r1 = r5.A1D()
            java.lang.Class<X.01L> r0 = X.AnonymousClass01L.class
            android.app.Activity r3 = X.C24801Dv.A01(r1, r0)
            X.147 r2 = r5.A04
            X.01I r1 = r5.A0i()
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r1.findViewById(r0)
            r4.Bkv(r3, r0, r2)
            return
        L_0x068b:
            android.content.Intent r3 = X.C36431kI.A0B()
            java.lang.Object r2 = r14.A00
            com.whatsapp.community.CommunityAddMembersBottomSheet r2 = (com.whatsapp.community.CommunityAddMembersBottomSheet) r2
            java.lang.String r1 = r2.A0E
            if (r1 != 0) goto L_0x069e
            java.lang.String r0 = "linkUri"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x069e:
            java.lang.String r0 = "android.intent.extra.TEXT"
            r3.putExtra(r0, r1)
            java.lang.String r0 = "text/plain"
            X.C36371kC.A18(r3, r0)
            r0 = 2131894318(0x7f12202e, float:1.9423437E38)
            java.lang.String r0 = r2.A0n(r0)
            android.content.Intent r1 = android.content.Intent.createChooser(r3, r0)
            r0 = 106(0x6a, float:1.49E-43)
            r2.startActivityForResult(r1, r0)
            return
        L_0x06b9:
            r2 = 0
            android.content.Context r1 = r15.getContext()
            java.lang.Object r0 = r14.A00
            com.whatsapp.community.CommunityHomeActivity r0 = (com.whatsapp.community.CommunityHomeActivity) r0
            X.147 r0 = r0.A0l
            android.content.Intent r1 = X.AnonymousClass190.A0W(r1, r0)
            android.content.Context r0 = r15.getContext()
            X.C05290Pd.A00(r0, r1, r2)
            return
        L_0x06d0:
            java.lang.Object r3 = r14.A00
            com.whatsapp.community.CommunityHomeActivity r3 = (com.whatsapp.community.CommunityHomeActivity) r3
            X.1Sq r2 = r3.A0R
            X.147 r1 = r3.A0l
            r0 = 0
            r2.A02(r3, r1, r0)
            return
        L_0x06dd:
            java.lang.Object r3 = r14.A00
            X.3H1 r3 = (X.AnonymousClass3H1) r3
            X.0xT r1 = r3.A04
            java.lang.String r0 = "507914914497920"
            android.net.Uri r2 = r1.A02(r0)
            X.AnonymousClass00C.A08(r2)
            X.1Dv r1 = r3.A00
            X.155 r0 = r3.A01
            X.C36361kB.A0y(r0, r2, r1)
            return
        L_0x06f4:
            java.lang.Object r2 = r14.A00
            com.whatsapp.community.EditCommunityActivity r2 = (com.whatsapp.community.EditCommunityActivity) r2
            com.whatsapp.WaEditText r0 = r2.A08
            android.text.Editable r0 = r0.getText()
            java.lang.String r6 = ""
            if (r0 != 0) goto L_0x0703
            r0 = r6
        L_0x0703:
            java.lang.String r5 = X.C36411kG.A0z(r0)
            boolean r0 = X.AnonymousClass14B.A0F(r5)
            if (r0 == 0) goto L_0x0718
            r0 = 2131891284(0x7f121454, float:1.9417284E38)
            java.lang.String r0 = r2.getString(r0)
            r2.A3i(r0)
            return
        L_0x0718:
            android.content.Intent r3 = X.C36431kI.A0D()
            r4 = 0
            X.171 r1 = r2.A02
            X.141 r0 = r2.A06
            java.lang.String r0 = r1.A0H(r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0731
            java.lang.String r0 = "extra_community_name"
            r3.putExtra(r0, r5)
            r4 = 1
        L_0x0731:
            com.whatsapp.WaEditText r0 = r2.A07
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto L_0x073a
            r0 = r6
        L_0x073a:
            java.lang.String r1 = X.C36411kG.A0z(r0)
            X.141 r0 = r2.A06
            X.3QL r0 = r0.A0K
            if (r0 == 0) goto L_0x0768
            java.lang.String r0 = r0.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0768
            java.lang.String r0 = "extra_community_description"
            r3.putExtra(r0, r1)
        L_0x0751:
            r0 = -1
            r2.setResult(r0, r3)
        L_0x0755:
            android.view.View r0 = r2.A00
            boolean r0 = X.AnonymousClass1N2.A00(r0)
            if (r0 == 0) goto L_0x0764
            X.1N2 r1 = r2.A0C
            android.view.View r0 = r2.A00
            r1.A01(r0)
        L_0x0764:
            r2.finish()
            return
        L_0x0768:
            if (r4 == 0) goto L_0x0755
            goto L_0x0751
        L_0x076b:
            java.lang.Object r0 = r14.A00
            com.whatsapp.community.JoinGroupBottomSheetFragment r0 = (com.whatsapp.community.JoinGroupBottomSheetFragment) r0
            X.1ue r0 = r0.A0N
            X.1hi r1 = r0.A0e
            r0 = 1
            X.C36341k9.A16(r1, r0)
            return
        L_0x0778:
            boolean r0 = com.whatsapp.voipcalling.VoipActivityV2.A1P(r1, r2)
            if (r0 == 0) goto L_0x078a
            r0 = 34
            X.3UW r1 = new X.3UW
            r1.<init>(r4, r3, r0)
            r0 = 0
            com.whatsapp.voipcalling.VoipActivityV2.A0m(r1, r2, r0)
            return
        L_0x078a:
            r0 = 1
            com.whatsapp.voipcalling.VoipActivityV2.A0o(r4, r2, r0)
            return
        L_0x078f:
            r0 = 1
            r2.A0Y(r4, r1, r0)
            return
        L_0x0794:
            X.C1029452q.A02(r3)
            return
        L_0x0798:
            java.lang.String r1 = "biz_account_info_block"
            r0 = 0
            com.whatsapp.chatinfo.ContactInfoActivity.A15(r4, r3, r1, r0)
            return
        L_0x079f:
            java.lang.Object r4 = r14.A00
            com.whatsapp.chatinfo.ContactInfoActivity r4 = (com.whatsapp.chatinfo.ContactInfoActivity) r4
            X.3Gc r1 = r4.A1W
            X.141 r0 = r4.A0z
            com.whatsapp.jid.UserJid r0 = X.C36351kA.A0k(r0)
            java.util.ArrayList r2 = r1.A00(r0)
            r2.size()
            android.content.Intent r3 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity"
            r3.setClassName(r1, r0)
            java.lang.String r1 = "edit_mode"
            r0 = 0
            r3.putExtra(r1, r0)
            java.lang.String r0 = "vcard_sender_infos"
            r3.putParcelableArrayListExtra(r0, r2)
        L_0x07ca:
            r4.startActivity(r3)
            return
        L_0x07ce:
            X.1qm r3 = X.AnonymousClass3LW.A00(r5)
            r0 = 2131886460(0x7f12017c, float:1.94075E38)
            r3.A0d(r0)
            android.content.res.Resources r2 = r5.getResources()
            r1 = 2131755047(0x7f100027, float:1.9140962E38)
            java.lang.Object[] r0 = new java.lang.Object[r13]
            X.C36331k8.A1W(r0, r4)
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)
            r3.A0p(r0)
            X.C39001qm.A04(r5, r3)
            X.C36341k9.A11(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48892iE.A02(android.view.View):void");
    }

    public void onClick(View view) {
        if (22 - this.A01 == 0) {
            AnonymousClass00C.A0D(view, 0);
            List list = AnonymousClass0D3.A0I;
            C32481dg r0 = ((C1028452e) this.A00).A01;
            if (r0 == null) {
                Log.w("CallsHistoryCallItemViewHolder/viewHolderClicked event listener is null");
                return;
            } else if (r0.A00.A03 != null) {
                A02(view);
                return;
            }
        }
        super.onClick(view);
    }
}
