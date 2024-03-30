package X;

import java.util.Collection;

/* renamed from: X.2Wx  reason: invalid class name */
public class AnonymousClass2Wx implements AnonymousClass1JB {
    public Object A00;
    public final int A01;

    public AnonymousClass2Wx(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(AnonymousClass2Wx r2, AnonymousClass11F r3) {
        C28981Uw r32;
        if (2 - r2.A01 == 0) {
            AnonymousClass00C.A0D(r3, 0);
            AnonymousClass3OA r1 = (AnonymousClass3OA) r2.A00;
            if ((r3 instanceof C28981Uw) && (r32 = (C28981Uw) r3) != null) {
                r1.A08.A0U(r32, (AnonymousClass3T1) null, C51802oP.UPDATED);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r3 != X.C52382pL.OWNER) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQJ(X.AnonymousClass11F r24, boolean r25) {
        /*
            r23 = this;
            r0 = r24
            r2 = r23
            int r1 = r2.A01
            switch(r1) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x0022;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.Object r2 = r2.A00
            X.3OA r2 = (X.AnonymousClass3OA) r2
            boolean r1 = r0 instanceof X.C28981Uw
            if (r1 == 0) goto L_0x0021
            X.1Uw r0 = (X.C28981Uw) r0
            if (r0 == 0) goto L_0x0021
            com.whatsapp.updates.viewmodels.UpdatesViewModel r3 = r2.A08
            r2 = 0
            X.2oP r1 = X.C51802oP.UPDATED
            r3.A0U(r0, r2, r1)
        L_0x0021:
            return
        L_0x0022:
            java.lang.Object r1 = r2.A00
            X.3fk r1 = (X.C70803fk) r1
            X.141 r5 = r1.A3Y
            X.11F r2 = r5.A0H
            if (r0 != r2) goto L_0x0021
            X.1uL r2 = r1.A2t
            boolean r18 = r2.A0U()
            r10 = 0
            X.1uL r2 = r1.A2t
            X.2pL r3 = r2.A0S()
            if (r3 == 0) goto L_0x0041
            X.2pL r2 = X.C52382pL.OWNER
            r21 = 1
            if (r3 == r2) goto L_0x0043
        L_0x0041:
            r21 = 0
        L_0x0043:
            X.3BF r2 = X.C70803fk.A0G(r1)
            X.005 r2 = r2.A0D
            java.lang.Object r4 = r2.get()
            X.3G3 r4 = (X.AnonymousClass3G3) r4
            X.11F r3 = r1.A45
            X.3Ro r2 = X.C28981Uw.A03
            boolean r2 = r3 instanceof X.C28981Uw
            if (r2 == 0) goto L_0x00c6
            X.1Uw r3 = (X.C28981Uw) r3
        L_0x0059:
            boolean r22 = r4.A01(r3)
            r4 = 0
            r9 = 4
            X.3HD r3 = new X.3HD
            r7 = r4
            r8 = r4
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.C70803fk.A1D(r1, r3)
            boolean r2 = X.C70803fk.A1a(r1)
            if (r2 == 0) goto L_0x0021
            X.1K3 r8 = X.AnonymousClass3B6.A00(r1)
            X.141 r7 = r1.A3Y
            android.widget.LinearLayout r6 = r1.A0e
            android.view.ViewGroup r2 = r1.A0R
            com.whatsapp.conversation.ConversationListView r3 = r1.A2U
            android.view.Window r5 = X.C70803fk.A05(r1)
            X.155 r4 = X.C70803fk.A0C(r1)
            X.1K4 r8 = (X.AnonymousClass1K4) r8
            X.AnonymousClass00C.A0D(r0, r10)
            X.C36321k7.A11(r7, r6, r2)
            X.AnonymousClass00C.A0D(r3, r9)
            X.C36341k9.A1F(r5, r4)
            boolean r1 = r8.BLD(r0)
            if (r1 == 0) goto L_0x0021
            boolean r2 = r8.BLC(r0)
            android.view.View r1 = X.C36411kG.A0M(r5)
            if (r2 == 0) goto L_0x00c8
            X.AnonymousClass1K4.A01(r3, r8, r7)
            if (r1 == 0) goto L_0x00fe
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r0 = r1.findViewById(r0)
            X.4f8 r0 = (X.C92924f8) r0
            if (r0 == 0) goto L_0x0021
            r0.setVisibility(r10)
            r0.A03()
            return
        L_0x00c6:
            r3 = 0
            goto L_0x0059
        L_0x00c8:
            if (r1 == 0) goto L_0x0021
            r0 = 2131428135(0x7f0b0327, float:1.8477906E38)
            android.view.View r1 = r1.findViewById(r0)
            X.4f8 r1 = (X.C92924f8) r1
            if (r1 == 0) goto L_0x00dd
            r0 = 8
            r1.setVisibility(r0)
            r1.A02()
        L_0x00dd:
            r0 = 2131428113(0x7f0b0311, float:1.8477861E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x0021
            r3.removeHeaderView(r0)
            return
        L_0x00ea:
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.Object r2 = r2.A00
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r2 = (com.whatsapp.bonsai.BonsaiConversationTitleViewModel) r2
            com.whatsapp.jid.UserJid r1 = r2.A01
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0021
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel.A02(r2)
            return
        L_0x00fe:
            X.04H r2 = X.C36441kJ.A0b(r4)
            java.lang.Class<com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel> r1 = com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel.class
            X.04R r1 = r2.A00(r1)
            com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel r1 = (com.whatsapp.bonsai.embodiment.BotEmbodimentViewModel) r1
            X.5NC r2 = X.AnonymousClass1K4.A00(r6, r5, r4, r1, r0)
            int r0 = r3.getFirstVisiblePosition()
            boolean r0 = X.AnonymousClass1K4.A02(r3, r0)
            r1 = 1
            if (r0 == 0) goto L_0x011d
            X.AnonymousClass5NC.A03(r2, r1, r1)
            return
        L_0x011d:
            r0 = 2
            X.AnonymousClass5NC.A03(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2Wx.BQJ(X.11F, boolean):void");
    }

    public void BQI() {
    }

    public void BQH(AnonymousClass11F r1) {
        A00(this, r1);
    }

    public void BQL(AnonymousClass11F r1) {
        A00(this, r1);
    }

    public void BQM(AnonymousClass11F r1) {
        A00(this, r1);
    }

    public void BQK(AnonymousClass11F r1, Collection collection, int i) {
        A00(this, r1);
    }
}
