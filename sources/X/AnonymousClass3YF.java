package X;

import android.view.View;

/* renamed from: X.3YF  reason: invalid class name */
public class AnonymousClass3YF implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass3YF(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new AnonymousClass3YF(obj, obj2, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v170, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v252, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v253, resolved type: com.whatsapp.conversation.conversationrow.InteractiveMessageButton} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02d5, code lost:
        r1.A00(r0.getContext(), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d2, code lost:
        r5.putExtra("extra_jid", X.AnonymousClass143.A03(r0));
        X.AnonymousClass3M9.A01(r5, "acceptInvite");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e0, code lost:
        X.C36371kC.A16(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x050c, code lost:
        r0.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x050f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05e1, code lost:
        if (r2 != 3) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0635, code lost:
        r4.onClick(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0638, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x07e6, code lost:
        r4.Boy(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x07e9, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r7 = r16
            int r0 = r7.A02
            r5 = r17
            switch(r0) {
                case 0: goto L_0x074d;
                case 1: goto L_0x0741;
                case 2: goto L_0x06ce;
                case 3: goto L_0x066f;
                case 4: goto L_0x0233;
                case 5: goto L_0x064d;
                case 6: goto L_0x0639;
                case 7: goto L_0x01f6;
                case 8: goto L_0x01f6;
                case 9: goto L_0x01c3;
                case 10: goto L_0x01c3;
                case 11: goto L_0x0009;
                case 12: goto L_0x0009;
                case 13: goto L_0x0009;
                case 14: goto L_0x0622;
                case 15: goto L_0x060e;
                case 16: goto L_0x05cb;
                case 17: goto L_0x05b3;
                case 18: goto L_0x01a0;
                case 19: goto L_0x0549;
                case 20: goto L_0x053d;
                case 21: goto L_0x0531;
                case 22: goto L_0x0525;
                case 23: goto L_0x0519;
                case 24: goto L_0x0186;
                case 25: goto L_0x0404;
                case 26: goto L_0x03f0;
                case 27: goto L_0x03e4;
                case 28: goto L_0x039d;
                case 29: goto L_0x0378;
                case 30: goto L_0x033c;
                case 31: goto L_0x030e;
                case 32: goto L_0x0152;
                case 33: goto L_0x0132;
                case 34: goto L_0x0302;
                case 35: goto L_0x02f6;
                case 36: goto L_0x02dd;
                case 37: goto L_0x02cb;
                case 38: goto L_0x02c0;
                case 39: goto L_0x02c0;
                case 40: goto L_0x02b2;
                case 41: goto L_0x00e8;
                case 42: goto L_0x0298;
                case 43: goto L_0x0266;
                case 44: goto L_0x00a9;
                case 45: goto L_0x006d;
                case 46: goto L_0x0036;
                case 47: goto L_0x001d;
                case 48: goto L_0x0255;
                case 49: goto L_0x024c;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r2 = r7.A00
            com.whatsapp.conversation.conversationrow.ConversationRowCatalogPreview r2 = (com.whatsapp.conversation.conversationrow.ConversationRowCatalogPreview) r2
            java.lang.Object r1 = r7.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            X.1tm r0 = r2.A00
            if (r0 == 0) goto L_0x001c
            X.05L r0 = r0.A04
            r0.setValue(r1)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r1 = r7.A00
            X.36T r1 = (X.AnonymousClass36T) r1
            java.lang.Object r4 = r7.A01
            X.141 r4 = (X.AnonymousClass141) r4
            r3 = 0
            java.lang.ref.WeakReference r0 = r1.A02
            android.app.Activity r2 = X.C36441kJ.A0D(r0)
            if (r2 == 0) goto L_0x001c
            X.1NG r1 = r1.A01
            java.lang.String r0 = "chat"
            r1.A0G(r2, r4, r0, r3)
            return
        L_0x0036:
            java.lang.Object r2 = r7.A00
            X.36T r2 = (X.AnonymousClass36T) r2
            java.lang.Object r1 = r7.A01
            X.31J r1 = (X.AnonymousClass31J) r1
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            java.lang.ref.WeakReference r0 = r2.A02
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L_0x001c
            X.3fk r4 = r1.A00
            X.11F r1 = r4.A45
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            com.whatsapp.dialogs.DeleteOrArchiveChatDialog r3 = new com.whatsapp.dialogs.DeleteOrArchiveChatDialog
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.lang.String r1 = r1.getRawString()
            java.lang.String r0 = "arg_chat_jid"
            r2.putString(r0, r1)
            r3.A17(r2)
            X.4V6 r0 = r4.A2l
            r0.Btm(r3)
            return
        L_0x006d:
            java.lang.Object r8 = r7.A00
            X.2bI r8 = (X.AnonymousClass2bI) r8
            java.lang.Object r7 = r7.A01
            X.2mm r7 = (X.C50872mm) r7
            r6 = 1
            X.AnonymousClass00C.A0D(r7, r6)
            r0 = r8
            X.8ny r0 = (X.C181748ny) r0
            r5 = 2
            com.whatsapp.jid.GroupJid r4 = r0.A1b(r5)
            com.whatsapp.jid.GroupJid r3 = r0.A1b(r6)
            X.147 r2 = X.C65533Sl.A01(r3)
            if (r2 == 0) goto L_0x0094
            X.0wU r1 = r7.getWaWorkers()
            r0 = 14
            X.C80403vL.A01(r1, r7, r8, r2, r0)
        L_0x0094:
            if (r3 == 0) goto L_0x001c
            if (r4 == 0) goto L_0x001c
            android.app.Activity r2 = X.C36361kB.A05(r7)
            X.14u r2 = (X.C225314u) r2
            if (r2 == 0) goto L_0x001c
            com.whatsapp.community.JoinGroupBottomSheetFragment r1 = com.whatsapp.community.JoinGroupBottomSheetFragment.A03(r3, r4, r6, r5)
            r0 = 0
            r2.Btl(r1, r0)
            return
        L_0x00a9:
            java.lang.Object r5 = r7.A00
            X.2mj r5 = (X.C50842mj) r5
            java.lang.Object r1 = r7.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            r4 = 0
            X.AnonymousClass00C.A0D(r5, r4)
            android.app.Activity r3 = X.C36361kB.A06(r5)
            boolean r0 = r3 instanceof X.AnonymousClass01L
            r2 = 0
            if (r0 == 0) goto L_0x001c
            if (r3 == 0) goto L_0x001c
            X.3Qa r0 = r1.A1J
            if (r0 == 0) goto L_0x001c
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x001c
            X.147 r1 = X.C65533Sl.A01(r0)
            if (r1 == 0) goto L_0x001c
            r5.getWaIntents()
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass190.A0q(r3, r1, r4, r0, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.getTime()
            X.AnonymousClass3M9.A01(r1, r0)
            X.C05290Pd.A00(r3, r1, r2)
            return
        L_0x00e8:
            java.lang.Object r5 = r7.A00
            com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet r5 = (com.whatsapp.conversation.conversationrow.bottomsheets.GenericSystemInfoBottomSheet) r5
            java.lang.Object r4 = r7.A01
            X.3Iz r4 = (X.C63163Iz) r4
            boolean r0 = r5 instanceof com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet
            if (r0 == 0) goto L_0x0119
            r2 = r5
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet r2 = (com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet) r2
            r3 = 2
            com.whatsapp.conversation.conversationrow.bottomsheets.BusinessTransitionInfoBottomSheet.A03(r2, r3)
            int r1 = r2.A01
            r0 = 30
            if (r1 != r0) goto L_0x0119
            X.0yW r2 = r2.A05
            if (r2 == 0) goto L_0x07ab
            X.2PD r1 = new X.2PD
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            java.lang.Integer r0 = X.C36401kF.A0k()
            r1.A01 = r0
            r2.Bly(r1)
        L_0x0119:
            r5.A1c()
            if (r4 == 0) goto L_0x001c
            android.net.Uri r3 = r4.A00
            if (r3 == 0) goto L_0x001c
            X.1Dv r2 = r5.A00
            if (r2 == 0) goto L_0x07a4
            android.content.Context r1 = r5.A0a()
            X.190 r0 = r5.A03
            if (r0 == 0) goto L_0x079f
            X.C36361kB.A0y(r1, r3, r2)
            return
        L_0x0132:
            java.lang.Object r5 = r7.A00
            X.2IR r5 = (X.AnonymousClass2IR) r5
            java.lang.Object r4 = r7.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            if (r0 == 0) goto L_0x001c
            X.147 r3 = X.C65533Sl.A01(r0)
            if (r3 == 0) goto L_0x001c
            X.0wU r2 = r5.A21
            r1 = 7
            X.3vL r0 = new X.3vL
            r0.<init>(r5, r4, r3, r1)
            r2.Bp1(r0)
            return
        L_0x0152:
            java.lang.Object r2 = r7.A00
            X.8Yr r2 = (X.C174848Yr) r2
            java.lang.Object r4 = r7.A01
            android.content.Context r4 = (android.content.Context) r4
            X.0yC r1 = r2.A0G
            r0 = 1948(0x79c, float:2.73E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x001c
            com.whatsapp.WaTextView r0 = r2.A07
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x001c
            X.3T1 r3 = r2.getFMessage()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.polls.PollResultsActivity"
            r2.setClassName(r1, r0)
            X.3Qa r0 = r3.A1J
            X.AnonymousClass3UJ.A00(r2, r0)
            r4.startActivity(r2)
            return
        L_0x0186:
            java.lang.Object r2 = r7.A00
            X.2IR r2 = (X.AnonymousClass2IR) r2
            java.lang.Object r1 = r7.A01
            X.9lY r1 = (X.C202319lY) r1
            X.1VZ r0 = r2.A1G
            X.3T1 r1 = r0.A01(r1)
            X.4V7 r0 = X.AnonymousClass3SS.A02(r2)
            if (r1 == 0) goto L_0x001c
            if (r0 == 0) goto L_0x001c
            r0.BpS(r1)
            return
        L_0x01a0:
            java.lang.Object r3 = r7.A00
            X.2IR r3 = (X.AnonymousClass2IR) r3
            java.lang.Object r1 = r7.A01
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            if (r0 == 0) goto L_0x001c
            r1.size()
            X.0v5 r1 = r3.A0O
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x07b2
            r1.A02()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01c3:
            java.lang.Object r6 = r7.A00
            X.2IS r6 = (X.AnonymousClass2IS) r6
            java.lang.Object r0 = r7.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.3Ky r0 = r0.A0O()
            if (r0 == 0) goto L_0x001c
            com.whatsapp.jid.UserJid r5 = r0.A01
            X.0yC r1 = r6.A0G
            r0 = 5431(0x1537, float:7.61E-42)
            boolean r0 = r1.A0E(r0)
            r4 = 0
            if (r0 == 0) goto L_0x01f4
            java.lang.Integer r3 = X.C36431kI.A14()
        L_0x01e2:
            android.content.Context r2 = r6.getContext()
            r1 = 0
            r0 = 1
            android.content.Intent r1 = X.AnonymousClass190.A0w(r2, r5, r3, r0, r1)
            android.content.Context r0 = r6.getContext()
            X.C05290Pd.A00(r0, r1, r4)
            return
        L_0x01f4:
            r3 = r4
            goto L_0x01e2
        L_0x01f6:
            java.lang.Object r2 = r7.A00
            X.2IR r2 = (X.AnonymousClass2IR) r2
            java.lang.Object r1 = r7.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.3Jw r0 = r1.A0W()
            if (r0 == 0) goto L_0x001c
            X.3Jw r0 = r1.A0W()
            X.1Uw r5 = r0.A01
            X.3Jw r0 = r1.A0W()
            int r0 = r0.A00
            long r8 = (long) r0
            X.3Qa r0 = r1.A1J
            X.11F r0 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass1DT.A06(r0)
            X.005 r0 = r2.A2C
            java.lang.Object r3 = r0.get()
            com.whatsapp.newsletter.NewsletterLinkLauncher r3 = (com.whatsapp.newsletter.NewsletterLinkLauncher) r3
            android.content.Context r4 = r2.getContext()
            if (r1 == 0) goto L_0x0231
            int r7 = r1.intValue()
        L_0x022b:
            X.1Ts r6 = X.C28711Ts.FORWARDED_MESSAGE
            r3.A03(r4, r5, r6, r7, r8)
            return
        L_0x0231:
            r7 = 0
            goto L_0x022b
        L_0x0233:
            java.lang.Object r5 = r7.A00
            X.2HP r5 = (X.AnonymousClass2HP) r5
            java.lang.Object r0 = r7.A01
            android.view.View r0 = (android.view.View) r0
            r4 = 0
            X.1ND r3 = r5.A0F
            X.5Nh r2 = r5.A08
            if (r2 == 0) goto L_0x001c
            android.content.Context r1 = r0.getContext()
            int r0 = r5.A00
            r3.BNr(r1, r2, r0, r4)
            return
        L_0x024c:
            java.lang.Object r1 = r7.A01
            X.3Qn r1 = (X.C65053Qn) r1
            r0 = 0
            r1.A09(r0)
            return
        L_0x0255:
            java.lang.Object r2 = r7.A00
            X.383 r2 = (X.AnonymousClass383) r2
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r2.A00 = r0
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0266:
            java.lang.Object r0 = r7.A00
            X.2mi r0 = (X.C50832mi) r0
            java.lang.Object r5 = r7.A01
            X.014 r5 = (X.AnonymousClass014) r5
            X.C36321k7.A0w(r0, r5)
            X.1uA r3 = r0.A01
            if (r3 != 0) goto L_0x027a
            java.lang.RuntimeException r0 = X.C36331k8.A0a()
            throw r0
        L_0x027a:
            r2 = 0
            X.0wU r1 = r3.A06
            X.1YR r7 = r3.A04
            X.1LV r6 = r3.A02
            X.147 r0 = r3.A05
            java.util.Set r8 = X.C36411kG.A15(r0)
            r0 = 4
            X.4ZI r4 = new X.4ZI
            r4.<init>(r3, r0)
            X.2j5 r3 = new X.2j5
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1.Box(r3, r0)
            return
        L_0x0298:
            java.lang.Object r0 = r7.A00
            X.2Ir r0 = (X.C43562Ir) r0
            java.lang.Object r3 = r7.A01
            X.2bV r3 = (X.AnonymousClass2bV) r3
            X.1e2 r2 = r0.getLinkLauncher()
            android.content.Context r1 = X.C36371kC.A0B(r0)
            java.lang.String r0 = r3.A06
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Bp7(r1, r0, r3)
            return
        L_0x02b2:
            java.lang.Object r2 = r7.A00
            androidx.fragment.app.DialogFragment r2 = (androidx.fragment.app.DialogFragment) r2
            java.lang.Object r1 = r7.A01
            X.01z r1 = (X.AnonymousClass01z) r1
            java.lang.String r0 = "TemplateButtonListBottomSheet"
            r2.A1f(r1, r0)
            return
        L_0x02c0:
            java.lang.Object r0 = r7.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageView r0 = (com.whatsapp.conversation.conversationrow.InteractiveMessageView) r0
            java.lang.Object r2 = r7.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.3FX r1 = r0.A08
            goto L_0x02d5
        L_0x02cb:
            java.lang.Object r0 = r7.A00
            com.whatsapp.conversation.conversationrow.InteractiveMessageButton r0 = (com.whatsapp.conversation.conversationrow.InteractiveMessageButton) r0
            java.lang.Object r2 = r7.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            X.3FX r1 = r0.A03
        L_0x02d5:
            android.content.Context r0 = r0.getContext()
            r1.A00(r0, r2)
            return
        L_0x02dd:
            java.lang.Object r0 = r7.A00
            X.8Ye r0 = (X.C174718Ye) r0
            java.lang.Object r3 = r7.A01
            X.11F r3 = (X.AnonymousClass11F) r3
            r2 = 0
            X.14u r1 = r0.A02
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.Integer r0 = X.C36401kF.A0k()
            android.content.Intent r0 = X.C36431kI.A0E(r1, r3, r0)
            X.C05290Pd.A00(r1, r0, r2)
            return
        L_0x02f6:
            java.lang.Object r1 = r7.A00
            X.8Ye r1 = (X.C174718Ye) r1
            java.lang.Object r0 = r7.A01
            X.2Kc r0 = (X.C43862Kc) r0
            r1.A2D(r0)
            return
        L_0x0302:
            java.lang.Object r1 = r7.A00
            X.8Yw r1 = (X.C174898Yw) r1
            java.lang.Object r0 = r7.A01
            X.2bJ r0 = (X.AnonymousClass2bJ) r0
            r1.A2G(r0)
            return
        L_0x030e:
            java.lang.Object r6 = r7.A00
            X.8Yq r6 = (X.C174838Yq) r6
            java.lang.Object r5 = r7.A01
            X.9lY r5 = (X.C202319lY) r5
            android.content.Context r1 = r6.getContext()
            X.1EU r0 = r6.A01
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BFn()
            android.content.Intent r4 = X.C36441kJ.A0H(r1, r0)
            X.11F r3 = r5.A0C
            boolean r2 = r5.A0Q
            java.lang.String r1 = r5.A0L
            X.3Qa r0 = new X.3Qa
            r0.<init>(r3, r1, r2)
            X.AnonymousClass3UJ.A00(r4, r0)
            android.content.Context r0 = r6.getContext()
            goto L_0x050c
        L_0x033c:
            java.lang.Object r3 = r7.A00
            X.2II r3 = (X.AnonymousClass2II) r3
            java.lang.Object r2 = r7.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            android.content.Context r1 = r3.getContext()
            X.1EU r0 = r3.A02
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BHH()
            android.content.Intent r5 = X.C36441kJ.A0H(r1, r0)
            X.11F r0 = r2.A0J()
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_jid"
            r5.putExtra(r0, r1)
            X.11F r0 = r2.A0J()
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_inviter_jid"
            r5.putExtra(r0, r1)
            java.lang.String r1 = "extra_referral_screen"
            java.lang.String r0 = "chat"
            r5.putExtra(r1, r0)
            goto L_0x03e0
        L_0x0378:
            java.lang.Object r3 = r7.A00
            X.2II r3 = (X.AnonymousClass2II) r3
            java.lang.Object r2 = r7.A01
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            android.content.Context r1 = r3.getContext()
            X.1EU r0 = r3.A02
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.B8B()
            android.content.Intent r5 = X.C36441kJ.A0H(r1, r0)
            java.lang.String r1 = "extra_setup_mode"
            r0 = 1
            r5.putExtra(r1, r0)
            X.11F r0 = r2.A0J()
            goto L_0x03d2
        L_0x039d:
            java.lang.Object r3 = r7.A00
            X.2II r3 = (X.AnonymousClass2II) r3
            java.lang.Object r4 = r7.A01
            X.3T1 r4 = (X.AnonymousClass3T1) r4
            android.content.Context r1 = r3.getContext()
            X.1EU r0 = r3.A02
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.B8B()
            android.content.Intent r5 = X.C36441kJ.A0H(r1, r0)
            java.lang.String r1 = "extra_is_first_payment_method"
            r0 = 1
            r5.putExtra(r1, r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r2 = 2
            r5.putExtra(r0, r2)
            java.lang.String r1 = "extra_skip_value_props_display"
            r0 = 0
            r5.putExtra(r1, r0)
            java.lang.String r0 = "extra_setup_mode"
            r5.putExtra(r0, r2)
            X.11F r0 = r4.A0J()
        L_0x03d2:
            java.lang.String r1 = X.AnonymousClass143.A03(r0)
            java.lang.String r0 = "extra_jid"
            r5.putExtra(r0, r1)
            java.lang.String r0 = "acceptInvite"
            X.AnonymousClass3M9.A01(r5, r0)
        L_0x03e0:
            X.C36371kC.A16(r5, r3)
            return
        L_0x03e4:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r7.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.C36371kC.A16(r0, r1)
            return
        L_0x03f0:
            java.lang.Object r1 = r7.A00
            X.2IH r1 = (X.AnonymousClass2IH) r1
            java.lang.Object r0 = r7.A01
            X.3T1 r0 = (X.AnonymousClass3T1) r0
            X.1Yo r1 = r1.A0A
            X.9lY r0 = r0.A0M
            X.6c9 r0 = r0.A05()
            r1.A04(r0)
            return
        L_0x0404:
            java.lang.Object r2 = r7.A00
            X.2IH r2 = (X.AnonymousClass2IH) r2
            java.lang.Object r3 = r7.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            X.9lY r4 = r3.A0M
            X.8av r0 = r4.A0A
            r14 = 0
            if (r0 == 0) goto L_0x0443
            X.9uo r0 = r0.A02
            if (r0 == 0) goto L_0x0443
            X.1EV r7 = r2.A08
            X.A8P r6 = r2.A1h
            r8 = 0
            X.11F r1 = r4.A0C
            if (r1 != 0) goto L_0x0422
            com.whatsapp.jid.UserJid r1 = r4.A0D
        L_0x0422:
            java.lang.String r0 = r0.A02
            X.3Qa r9 = new X.3Qa
            r9.<init>(r1, r0, r14)
            X.11F r5 = r9.A00
            X.C18740tg.A06(r5)
            android.content.Context r4 = r2.getContext()
            X.9lY r0 = r3.A0M
            X.8av r0 = r0.A0A
            X.9uo r0 = r0.A02
            java.lang.String r12 = r0.A01
            java.lang.String r13 = "chat"
            r15 = -1
            r11 = r8
            r10 = r8
            X.C1901296z.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x0443:
            X.1NG r1 = r2.A0h
            X.C18740tg.A06(r4)
            com.whatsapp.jid.UserJid r0 = r4.A0D
            boolean r0 = X.C36351kA.A1X(r1, r0)
            r6 = 1
            if (r0 == 0) goto L_0x0480
            X.16D r1 = r2.A0l
            X.9lY r0 = r3.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0D
            X.141 r7 = r1.A0D(r0)
            android.content.Context r5 = r2.getContext()
            r4 = 2131892312(0x7f121858, float:1.9419369E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.171 r0 = r2.A0n
            X.C36361kB.A1F(r0, r7, r1, r14)
            java.lang.String r1 = r5.getString(r4, r1)
            X.2rT r0 = new X.2rT
            r0.<init>(r3, r2, r6)
            com.whatsapp.blocklist.UnblockDialogFragment r1 = com.whatsapp.blocklist.UnblockDialogFragment.A03(r0, r1, r14, r14)
            android.content.Context r0 = r2.getContext()
            X.14r r0 = (X.C225014r) r0
            r0.Btm(r1)
            return
        L_0x0480:
            X.A8P r1 = r2.A1h
            android.content.Context r0 = r2.getContext()
            android.content.Intent r4 = r1.A01(r0, r6, r14)
            X.1De r0 = r2.A07
            X.16U r5 = r0.A01()
            X.0ts r1 = r2.A0E
            X.9lY r0 = r3.A0M
            X.16X r0 = r0.A08
            java.lang.String r1 = r5.B7c(r1, r0)
            java.lang.String r0 = "extra_payment_preset_amount"
            r4.putExtra(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "chat"
            r4.putExtra(r1, r0)
            X.3Qa r0 = r3.A1J
            X.11F r5 = r0.A00
            boolean r0 = r5 instanceof com.whatsapp.jid.GroupJid
            java.lang.String r1 = "extra_jid"
            if (r0 == 0) goto L_0x0510
            java.lang.String r0 = r5.getRawString()
            r4.putExtra(r1, r0)
            X.9lY r0 = r3.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            java.lang.String r1 = "extra_receiver_jid"
        L_0x04c1:
            r4.putExtra(r1, r0)
            java.lang.String r5 = "extra_conversation_message_type"
            java.lang.String r1 = r3.A0b()
            java.lang.String r0 = "extra_payment_note"
            r4.putExtra(r0, r1)
            r4.putExtra(r5, r6)
            boolean r0 = r3.A1H()
            if (r0 == 0) goto L_0x04e3
            java.util.List r0 = r3.A0w
            java.lang.String r1 = X.C65713Te.A01(r0)
            java.lang.String r0 = "extra_mentioned_jids"
            r4.putExtra(r0, r1)
        L_0x04e3:
            X.9lY r0 = r3.A0M
            X.6c9 r1 = r0.A05()
            if (r1 == 0) goto L_0x04f0
            java.lang.String r0 = "extra_payment_background"
            r4.putExtra(r0, r1)
        L_0x04f0:
            boolean r0 = r3 instanceof X.C46962bx
            if (r0 == 0) goto L_0x0508
            X.2bx r3 = (X.C46962bx) r3
            X.1Ap r0 = r2.A0D
            X.6c4 r1 = r0.A00(r3)
            java.lang.String r0 = "extra_payment_sticker"
            r4.putExtra(r0, r1)
            java.lang.Integer r1 = r3.A06
            java.lang.String r0 = "extra_payment_sticker_send_origin"
            r4.putExtra(r0, r1)
        L_0x0508:
            android.content.Context r0 = r2.getContext()
        L_0x050c:
            r0.startActivity(r4)
            return
        L_0x0510:
            X.9lY r0 = r3.A0M
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.AnonymousClass143.A03(r0)
            goto L_0x04c1
        L_0x0519:
            java.lang.Object r1 = r7.A00
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            java.lang.Object r0 = r7.A01
            X.2La r0 = (X.C44072La) r0
            X.AnonymousClass8Z0.setupShareToMyStatusButton$lambda$10(r1, r0, r5)
            return
        L_0x0525:
            java.lang.Object r1 = r7.A00
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            java.lang.Object r0 = r7.A01
            X.2La r0 = (X.C44072La) r0
            X.AnonymousClass8Z0.setupNewsletterIcon$lambda$0(r1, r0, r5)
            return
        L_0x0531:
            java.lang.Object r1 = r7.A00
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            java.lang.Object r0 = r7.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.AnonymousClass8Z0.setupAddNewsletterDescriptionButton$lambda$5(r1, r0, r5)
            return
        L_0x053d:
            java.lang.Object r1 = r7.A00
            X.8Z0 r1 = (X.AnonymousClass8Z0) r1
            java.lang.Object r0 = r7.A01
            android.content.Intent r0 = (android.content.Intent) r0
            X.AnonymousClass8Z0.setupShareNewsletterLinkButton$lambda$6(r1, r0, r5)
            return
        L_0x0549:
            java.lang.Object r2 = r7.A00
            X.8Z5 r2 = (X.AnonymousClass8Z5) r2
            java.lang.Object r4 = r7.A01
            X.5J5 r4 = (X.AnonymousClass5J5) r4
            java.util.List r0 = r4.A00
            r0.isEmpty()
            java.util.ArrayList r1 = X.C36441kJ.A15(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x056f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "call logs are empty, message.key="
            r1.append(r0)
            X.3Qa r0 = r4.A1J
            X.C36331k8.A1P(r0, r1)
            return
        L_0x056f:
            java.lang.Object r9 = X.C36441kJ.A12(r1)
            java.lang.String r0 = "null call log"
            X.C18740tg.A07(r9, r0)
            X.5Nh r9 = (X.C107265Nh) r9
            android.content.Context r0 = r2.getContext()
            android.app.Activity r5 = X.C18860tw.A00(r0)
            boolean r0 = r5 instanceof X.AnonymousClass01I
            if (r0 == 0) goto L_0x059a
            boolean r0 = r9.A0M()
            if (r0 == 0) goto L_0x059a
            X.0yC r8 = r2.A0G
            X.0wQ r6 = r2.A0T
            X.16D r7 = r2.A0l
            X.01I r5 = (X.AnonymousClass01I) r5
            r10 = 39
            X.AnonymousClass3UD.A06(r5, r6, r7, r8, r9, r10)
            return
        L_0x059a:
            r4.A1Y()
            X.1ND r3 = r2.A00
            X.16D r1 = r2.A0l
            X.11F r0 = X.C64933Qa.A01(r4)
            X.141 r2 = r1.A0D(r0)
            r1 = 39
            boolean r0 = r4.A1Y()
            r3.Bua(r5, r2, r1, r0)
            return
        L_0x05b3:
            java.lang.Object r3 = r7.A00
            X.2IR r3 = (X.AnonymousClass2IR) r3
            java.lang.Object r2 = r7.A01
            X.0v5 r1 = r3.A0O
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x07dd
            r1.A02()
            java.lang.String r0 = "logEntryPointTap"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x05cb:
            java.lang.Object r4 = r7.A00
            X.2I9 r4 = (X.AnonymousClass2I9) r4
            java.lang.Object r3 = r7.A01
            X.8o2 r3 = (X.C181788o2) r3
            X.2ke r1 = r4.A0D
            X.3Qd r0 = r1.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x05e3
            int r2 = r1.A06()
            r0 = 3
            r1 = 1
            if (r2 == r0) goto L_0x05e4
        L_0x05e3:
            r1 = 0
        L_0x05e4:
            X.3Pr r0 = r4.A0C
            if (r0 == 0) goto L_0x0608
            if (r1 != 0) goto L_0x0608
            X.3T1 r0 = r4.A0K
            X.2bU r0 = (X.AnonymousClass2bU) r0
            X.3Qj r0 = X.AnonymousClass2bU.A00(r0)
            java.io.File r0 = r0.A0I
            if (r0 == 0) goto L_0x0604
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            boolean r0 = X.C36381kD.A1V(r0)
            if (r0 == 0) goto L_0x0604
            X.AnonymousClass2I9.A0F(r4, r3)
            return
        L_0x0604:
            X.AnonymousClass2I9.A0D(r4)
            return
        L_0x0608:
            X.1fX r0 = r4.A0B
            r0.onClick(r5)
            return
        L_0x060e:
            java.lang.Object r0 = r7.A00
            X.8Yz r0 = (X.C174928Yz) r0
            java.lang.Object r4 = r7.A01
            X.1fX r4 = (X.C33541fX) r4
            X.1KI r3 = r0.A0H
            java.lang.Integer r2 = X.C36361kB.A0i()
            r1 = 3
            r0 = 2
            r3.A00(r2, r1, r0)
            goto L_0x0635
        L_0x0622:
            java.lang.Object r0 = r7.A00
            X.8Yz r0 = (X.C174928Yz) r0
            java.lang.Object r4 = r7.A01
            X.1fX r4 = (X.C33541fX) r4
            X.1KI r3 = r0.A0H
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0 = 2
            r3.A00(r1, r2, r0)
        L_0x0635:
            r4.onClick(r5)
            return
        L_0x0639:
            java.lang.Object r2 = r7.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            java.lang.Object r1 = r7.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            android.content.Context r0 = r2.A0a()
            android.content.Intent r0 = X.AnonymousClass190.A0u(r0, r1)
            r2.A1C(r0)
            return
        L_0x064d:
            java.lang.Object r5 = r7.A00
            X.2HI r5 = (X.AnonymousClass2HI) r5
            java.lang.Object r3 = r7.A01
            X.3Jt r3 = (X.C63363Jt) r3
            r4 = 1
            X.3Dn r2 = r5.A06
            X.4V7 r1 = r5.A04
            r0 = 3
            r2.A00(r1, r3, r0)
            X.4On r3 = r5.A02
            if (r3 == 0) goto L_0x066b
            X.1bg r2 = r5.A0B
            r1 = 11389(0x2c7d, float:1.596E-41)
            X.8zX r0 = X.C188408zX.PRIMARY_ACTION
            r2.A00(r0, r3, r1)
        L_0x066b:
            r5.A0A(r4)
            return
        L_0x066f:
            java.lang.Object r4 = r7.A00
            X.2HP r4 = (X.AnonymousClass2HP) r4
            java.lang.Object r6 = r7.A01
            android.view.View r6 = (android.view.View) r6
            r5 = 1
            X.1aM r0 = r4.A0E
            com.whatsapp.voipcalling.CallInfo r3 = r0.B9F()
            r2 = 0
            if (r3 == 0) goto L_0x06cc
            com.whatsapp.voipcalling.CallState r1 = r3.callState
        L_0x0683:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 != r0) goto L_0x06ac
            com.whatsapp.jid.GroupJid r1 = r3.groupJid
            X.5Nh r0 = r4.A08
            if (r0 == 0) goto L_0x068f
            com.whatsapp.jid.GroupJid r2 = r0.A0D
        L_0x068f:
            boolean r0 = X.AnonymousClass00C.A0J(r1, r2)
            if (r0 == 0) goto L_0x06ac
            X.5Nh r0 = r4.A08
            if (r0 == 0) goto L_0x06ac
            int r1 = r0.A08
            r0 = 2
            if (r1 != r0) goto L_0x06ac
            X.1ND r1 = r4.A0F
            android.content.Context r0 = r6.getContext()
            r1.B07(r0, r5)
        L_0x06a7:
            r0 = 9
            r4.A00 = r0
            return
        L_0x06ac:
            X.5Nh r3 = r4.A08
            if (r3 == 0) goto L_0x06bc
            X.1ND r2 = r4.A0F
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A00
            r2.BNr(r1, r3, r0, r5)
            goto L_0x06a7
        L_0x06bc:
            X.3KV r3 = r4.A07
            if (r3 == 0) goto L_0x06a7
            X.1ND r2 = r4.A0F
            android.content.Context r1 = r6.getContext()
            int r0 = r4.A00
            r2.Bug(r1, r3, r0)
            goto L_0x06a7
        L_0x06cc:
            r1 = r2
            goto L_0x0683
        L_0x06ce:
            java.lang.Object r4 = r7.A00
            X.2Gy r4 = (X.C43332Gy) r4
            java.lang.Object r5 = r7.A01
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.Intent r2 = r5.getIntent()
            r1 = 0
            if (r2 == 0) goto L_0x0710
            java.lang.String r0 = "mat_entry_point"
            int r8 = r2.getIntExtra(r0, r1)
        L_0x06e3:
            android.content.Intent r2 = r5.getIntent()
            r1 = -1
            if (r2 == 0) goto L_0x070e
            java.lang.String r0 = "extra_forwarded_message_thread_type"
            int r9 = r2.getIntExtra(r0, r1)
        L_0x06f0:
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "similar_newsletters_session_id"
            java.io.Serializable r7 = r1.getSerializableExtra(r0)
            boolean r0 = r7 instanceof java.lang.Long
            r3 = 0
            if (r0 == 0) goto L_0x070c
            java.lang.Long r7 = (java.lang.Long) r7
        L_0x0701:
            X.2La r0 = r4.A00
            if (r0 != 0) goto L_0x0712
            java.lang.String r0 = "newsletterInfo"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x070c:
            r7 = r3
            goto L_0x0701
        L_0x070e:
            r9 = -1
            goto L_0x06f0
        L_0x0710:
            r8 = 0
            goto L_0x06e3
        L_0x0712:
            X.11F r6 = r0.A06()
            boolean r0 = r4.A0L
            r10 = r0 ^ 1
            android.content.Intent r2 = X.AnonymousClass190.A0n(r5, r6, r7, r8, r9, r10)
            java.lang.String r1 = r4.A0h
            if (r1 == 0) goto L_0x0727
            java.lang.String r0 = "wamo_pc_id"
            r2.putExtra(r0, r1)
        L_0x0727:
            r1 = 2131434890(0x7f0b1d8a, float:1.8491607E38)
            X.01L r0 = r4.A0U
            android.view.View r1 = r0.findViewById(r1)
            boolean r0 = r4.A0L
            if (r0 != 0) goto L_0x073a
            X.3CG r0 = r4.A0Y
            android.os.Bundle r3 = X.AnonymousClass3CG.A00(r5, r1, r0)
        L_0x073a:
            X.AnonymousClass3M9.A00(r2, r5)
            X.C05290Pd.A00(r5, r2, r3)
            return
        L_0x0741:
            java.lang.Object r1 = r7.A00
            X.28f r1 = (X.AnonymousClass28f) r1
            java.lang.Object r0 = r7.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.Bbx(r0)
            return
        L_0x074d:
            java.lang.Object r5 = r7.A00
            X.2Gw r5 = (X.AnonymousClass2Gw) r5
            java.lang.Object r4 = r7.A01
            android.app.Activity r4 = (android.app.Activity) r4
            X.1LV r0 = r5.A06
            X.147 r1 = r5.A0F
            X.147 r2 = r0.A02(r1)
            X.12q r0 = r5.A0B
            boolean r0 = r0.A0O(r1)
            if (r0 == 0) goto L_0x0777
            if (r2 == 0) goto L_0x0777
            X.0xE r1 = r5.A07
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r4.findViewById(r0)
            boolean r0 = r1.Bkz(r4, r0, r2)
            if (r0 == 0) goto L_0x0777
            return
        L_0x0777:
            r3 = 0
            X.141 r0 = r5.A0I
            X.11F r2 = r0.A0H
            boolean r0 = r5.A0L
            r1 = r0 ^ 1
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass190.A0q(r4, r2, r1, r0, r0)
            boolean r0 = r5.A0L
            if (r0 != 0) goto L_0x0798
            r1 = 2131434890(0x7f0b1d8a, float:1.8491607E38)
            X.01L r0 = r5.A0U
            android.view.View r1 = r0.findViewById(r1)
            X.3CG r0 = r5.A0Y
            android.os.Bundle r3 = X.AnonymousClass3CG.A00(r4, r1, r0)
        L_0x0798:
            X.AnonymousClass3M9.A00(r2, r4)
            X.C05290Pd.A00(r4, r2, r3)
            return
        L_0x079f:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x07a4:
            java.lang.String r0 = "activityUtils"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07ab:
            java.lang.String r0 = "wamRuntime"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x07b2:
            android.content.Context r1 = r3.getContext()
            r0 = 2131890828(0x7f12128c, float:1.9416359E38)
            java.lang.String r2 = r1.getString(r0)
            android.app.ProgressDialog r1 = r3.A05
            if (r1 != 0) goto L_0x07cc
            android.content.Context r0 = r3.getContext()
            android.app.ProgressDialog r1 = new android.app.ProgressDialog
            r1.<init>(r0)
            r3.A05 = r1
        L_0x07cc:
            r1.setTitle(r2)
            android.app.ProgressDialog r0 = r3.A05
            r0.show()
            X.0wU r4 = r3.A21
            r0 = 13
            X.3v4 r1 = X.C80233v4.A00(r3, r0)
            goto L_0x07e6
        L_0x07dd:
            X.0wU r4 = r3.A21
            r0 = 45
            X.3v8 r1 = new X.3v8
            r1.<init>(r3, r2, r0)
        L_0x07e6:
            r4.Boy(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YF.onClick(android.view.View):void");
    }
}
