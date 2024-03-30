package X;

import android.view.View;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2iI  reason: invalid class name and case insensitive filesystem */
public class C48932iI extends C33541fX {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C48932iI(C69703dx r2, C32461de r3, ThumbnailButton thumbnailButton) {
        this.A03 = 5;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = thumbnailButton;
    }

    public static void A00(View view, Object obj, Object obj2, Object obj3, int i) {
        view.setOnClickListener(new C48932iI(obj, obj2, obj3, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0472, code lost:
        r2 = X.AnonymousClass001.A07();
        X.AnonymousClass3UJ.A08(r2, r3.A1J);
        r2.putInt("EXISTING_RESPONSE_EXTRA", ((X.C52292pC) r1).value);
        r1 = new com.whatsapp.events.EventResponseBottomSheet();
        r1.A17(r2);
        r0 = "EVENT_RESPONSE_BOTTOM_SHEET";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x048e, code lost:
        r4.Btl(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0491, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x05c3, code lost:
        r1.Btl(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x05c6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0181, code lost:
        X.AnonymousClass3SM.A01(r1, r2, r3, r4, r4, r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0185, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01db, code lost:
        r2.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0228, code lost:
        r1 = X.AnonymousClass190.A0h(r2, r1, r0);
        r0 = X.C36361kB.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x024d, code lost:
        r0.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0250, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.View r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.A03
            r4 = r17
            switch(r1) {
                case 0: goto L_0x0093;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00c6;
                case 3: goto L_0x010d;
                case 4: goto L_0x0125;
                case 5: goto L_0x0186;
                case 6: goto L_0x0196;
                case 7: goto L_0x01b9;
                case 8: goto L_0x01df;
                case 9: goto L_0x020d;
                case 10: goto L_0x021b;
                case 11: goto L_0x0231;
                case 12: goto L_0x0251;
                case 13: goto L_0x0295;
                case 14: goto L_0x02a7;
                case 15: goto L_0x02d7;
                case 16: goto L_0x035d;
                case 17: goto L_0x0392;
                case 18: goto L_0x03e8;
                case 19: goto L_0x041d;
                case 20: goto L_0x0439;
                case 21: goto L_0x0460;
                case 22: goto L_0x0497;
                case 23: goto L_0x0534;
                case 24: goto L_0x0570;
                case 25: goto L_0x059a;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r9 = r0.A00
            com.whatsapp.invites.InviteGroupParticipantsActivity r9 = (com.whatsapp.invites.InviteGroupParticipantsActivity) r9
            java.lang.Object r8 = r0.A02
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r10 = r0.A01
            X.147 r10 = (X.AnonymousClass147) r10
            X.1X4 r7 = r9.A01
            X.0yC r1 = r9.A0D
            X.141 r0 = r9.A08
            boolean r0 = X.AnonymousClass3M0.A00(r0, r1)
            if (r0 == 0) goto L_0x008a
            X.141 r0 = r9.A08
            java.lang.String r12 = r0.A0J()
        L_0x0027:
            java.util.List r1 = r9.A0B
            byte[] r11 = r9.A0C
            com.whatsapp.mentions.MentionableEntry r0 = r9.A09
            java.lang.String r6 = r0.getStringText()
            if (r12 != 0) goto L_0x0038
            java.lang.String r0 = "UserActions - Missing group name during invite"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0038:
            X.0wQ r0 = r7.A03
            com.whatsapp.jid.PhoneUserJid r5 = X.C36441kJ.A0n(r0)
            java.util.Iterator r15 = r1.iterator()
        L_0x0042:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0506
            java.lang.Object r3 = r15.next()
            X.38V r3 = (X.AnonymousClass38V) r3
            X.19w r1 = r7.A11
            com.whatsapp.jid.UserJid r0 = r3.A02
            r13 = 1
            X.3Qa r2 = r1.A02(r0, r13)
            X.0wo r0 = r7.A0K
            long r0 = X.C19970wo.A00(r0)
            X.2bQ r4 = new X.2bQ
            r4.<init>(r2, r0)
            r4.A02 = r13
            X.147 r14 = r3.A01
            java.lang.String r13 = r3.A03
            long r2 = r3.A00
            X.12q r0 = r7.A0U
            int r1 = r0.A05(r14)
            r0 = 0
            r4.A02 = r14
            r4.A03 = r5
            r4.A05 = r12
            r4.A06 = r13
            r4.A01 = r2
            r4.A07 = r0
            r4.A00 = r1
            r4.A04 = r6
            if (r11 == 0) goto L_0x0086
            r4.A1C(r11)
        L_0x0086:
            X.C36401kF.A1E(r7, r4)
            goto L_0x0042
        L_0x008a:
            X.171 r1 = r9.A03
            X.141 r0 = r9.A08
            java.lang.String r12 = r1.A0H(r0)
            goto L_0x0027
        L_0x0093:
            java.lang.Object r3 = r0.A00
            X.1qN r3 = (X.C38881qN) r3
            java.lang.Object r2 = r0.A01
            int[] r2 = (int[]) r2
            X.4QU r1 = r3.A05
            r1.Bgo(r2)
            r3.dismiss()
            java.lang.Object r1 = r0.A02
            android.view.View r1 = (android.view.View) r1
            r0 = 1
            r1.setSelected(r0)
            return
        L_0x00ac:
            java.lang.Object r2 = r0.A01
            X.3GE r2 = (X.AnonymousClass3GE) r2
            java.lang.Runnable r1 = r2.A02
            if (r1 == 0) goto L_0x00b7
            r1.run()
        L_0x00b7:
            X.4P5 r1 = r2.A01
            if (r1 == 0) goto L_0x00be
            r1.BOX()
        L_0x00be:
            java.lang.Object r0 = r0.A02
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r4)
            return
        L_0x00c6:
            java.lang.Object r1 = r0.A00
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            int r2 = r1.A04()
            r1 = -1
            if (r2 == r1) goto L_0x0533
            java.lang.Object r1 = r0.A02
            X.4PD r1 = (X.AnonymousClass4PD) r1
            X.9EB r1 = r1.BBA(r2)
            X.8VL r1 = (X.AnonymousClass8VL) r1
            X.6B4 r1 = r1.A00
            java.lang.Object r2 = r0.A01
            com.whatsapp.biz.cart.view.fragment.CartFragment r2 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r2
            X.9up r0 = r1.A02
            java.lang.String r6 = r0.A0F
            android.os.Bundle r1 = r2.A0b()
            java.lang.String r0 = "extra_product_id"
            java.lang.String r0 = r1.getString(r0)
            X.7yb r1 = r2.A0P
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00fb
            r2.A1b()
            return
        L_0x00fb:
            com.whatsapp.jid.UserJid r3 = r1.A0O
            r2.A1b()
            android.content.Context r1 = r2.A0a()
            r4 = 0
            r8 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1S(r1, r8, r8)
            r7 = 8
            goto L_0x0181
        L_0x010d:
            android.content.Context r3 = r4.getContext()
            java.lang.Object r2 = r0.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            java.lang.Integer r1 = X.C36401kF.A0i()
            android.content.Intent r1 = X.C36431kI.A0E(r3, r2, r1)
            java.lang.Object r0 = r0.A01
            X.1Dv r0 = (X.C24801Dv) r0
            r0.A06(r3, r1)
            return
        L_0x0125:
            java.lang.Object r1 = r0.A00
            X.0D3 r1 = (X.AnonymousClass0D3) r1
            int r2 = r1.A04()
            r1 = -1
            if (r2 == r1) goto L_0x0533
            java.lang.Object r1 = r0.A01
            X.4PD r1 = (X.AnonymousClass4PD) r1
            X.9EB r1 = r1.BBA(r2)
            X.8VK r1 = (X.AnonymousClass8VK) r1
            X.9tP r4 = r1.A00
            java.lang.Object r3 = r0.A02
            com.whatsapp.biz.order.view.fragment.OrderDetailFragment r3 = (com.whatsapp.biz.order.view.fragment.OrderDetailFragment) r3
            X.9Y1 r2 = r3.A09
            X.9Sx r1 = X.C36321k7.A03(r2)
            X.9Y1 r0 = r3.A09
            X.C36321k7.A0p(r1, r0)
            r0 = 39
            X.C36401kF.A1F(r1, r0)
            r0 = 46
            X.C36411kG.A1G(r1, r0)
            java.lang.String r6 = r4.A07
            r1.A0G = r6
            X.6bW r0 = r4.A04
            boolean r0 = X.AnonymousClass000.A1V(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01(r0)
            com.whatsapp.jid.UserJid r0 = r3.A0K
            r1.A00 = r0
            java.lang.String r0 = r3.A0V
            r1.A0F = r0
            r2.A03(r1)
            X.7yJ r0 = r3.A0C
            android.content.Context r1 = r3.A0a()
            com.whatsapp.jid.UserJid r3 = r0.A0C
            r4 = 0
            r8 = 0
            android.content.Intent r2 = X.AnonymousClass190.A1S(r1, r8, r8)
            r7 = 9
        L_0x0181:
            r5 = r4
            X.AnonymousClass3SM.A01(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0186:
            java.lang.Object r2 = r0.A01
            X.1de r2 = (X.C32461de) r2
            java.lang.Object r1 = r0.A02
            X.3dx r1 = (X.C69703dx) r1
            java.lang.Object r0 = r0.A00
            android.view.View r0 = (android.view.View) r0
            r2.A00(r0, r1)
            return
        L_0x0196:
            r3 = 0
            java.lang.Object r1 = r0.A01
            X.141 r1 = (X.AnonymousClass141) r1
            com.whatsapp.jid.Jid r1 = X.C36431kI.A0h(r1)
            X.11F r1 = (X.AnonymousClass11F) r1
            X.3Pd r2 = new X.3Pd
            r2.<init>((android.view.View) r4, (X.AnonymousClass11F) r1, (java.lang.Integer) r3)
            java.lang.Object r1 = r0.A02
            X.37n r1 = (X.C603537n) r1
            android.widget.ImageView r1 = r1.A02
            java.lang.String r1 = X.C011004s.A03(r1)
            r2.A04 = r1
            java.lang.Object r0 = r0.A00
            X.1nH r0 = (X.C37831nH) r0
            com.whatsapp.chatinfo.ListChatInfoActivity r0 = r0.A00
            goto L_0x01db
        L_0x01b9:
            r3 = 0
            java.lang.Object r2 = r0.A01
            X.141 r2 = (X.AnonymousClass141) r2
            java.lang.Class<X.147> r1 = X.AnonymousClass147.class
            X.11F r1 = X.C36441kJ.A0k(r2, r1)
            X.3Pd r2 = new X.3Pd
            r2.<init>((android.view.View) r4, (X.AnonymousClass11F) r1, (java.lang.Integer) r3)
            java.lang.Object r1 = r0.A02
            X.37o r1 = (X.C603637o) r1
            android.widget.ImageView r1 = r1.A03
            java.lang.String r1 = X.C011004s.A03(r1)
            r2.A04 = r1
            java.lang.Object r0 = r0.A00
            X.1nV r0 = (X.C37971nV) r0
            android.app.Activity r0 = r0.A04
        L_0x01db:
            r2.A02(r0)
            return
        L_0x01df:
            java.lang.Object r2 = r0.A02
            X.1qV r2 = (X.C38931qV) r2
            X.14u r1 = r2.getActivity()
            X.01z r3 = r1.getSupportFragmentManager()
            X.AnonymousClass00C.A08(r3)
            X.14u r4 = r2.getActivity()
            X.AnonymousClass00C.A08(r4)
            java.lang.Object r5 = r0.A00
            X.147 r5 = (X.AnonymousClass147) r5
            java.lang.Object r6 = r0.A01
            X.147 r6 = (X.AnonymousClass147) r6
            X.4Iu r9 = new X.4Iu
            r9.<init>(r2)
            r10 = 1
            X.09w r7 = X.C023409w.A00
            X.4IB r8 = X.AnonymousClass4IB.A00
            r11 = 6
            r12 = 1
            X.C54422sv.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x020d:
            java.lang.Object r3 = r0.A00
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 0
            goto L_0x0228
        L_0x021b:
            java.lang.Object r3 = r0.A00
            android.view.View r3 = (android.view.View) r3
            android.content.Context r2 = r3.getContext()
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            r0 = 1
        L_0x0228:
            android.content.Intent r1 = X.AnonymousClass190.A0h(r2, r1, r0)
            android.app.Activity r0 = X.C36361kB.A06(r3)
            goto L_0x024d
        L_0x0231:
            java.lang.Object r2 = r0.A01
            X.2Sc r2 = (X.C45632Sc) r2
            java.lang.Boolean r1 = X.C36371kC.A0m()
            r2.A09 = r1
            java.lang.Object r2 = r0.A02
            com.whatsapp.info.views.StarredMessageInfoView r2 = (com.whatsapp.info.views.StarredMessageInfoView) r2
            android.content.Context r1 = r2.getContext()
            java.lang.Object r0 = r0.A00
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            android.content.Intent r1 = X.AnonymousClass190.A0k(r1, r0)
            X.14u r0 = r2.A00
        L_0x024d:
            r0.startActivity(r1)
            return
        L_0x0251:
            java.lang.Object r6 = r0.A01
            X.141 r6 = (X.AnonymousClass141) r6
            X.3L0 r1 = r6.A0E
            if (r1 == 0) goto L_0x0289
            boolean r1 = r1.A09
            if (r1 == 0) goto L_0x0289
            android.content.Context r1 = r4.getContext()
            X.14u r5 = X.C225314u.A0N(r1)
            if (r5 == 0) goto L_0x0533
            java.lang.Object r1 = r0.A00
            X.2Gc r1 = (X.AnonymousClass2Gc) r1
            X.005 r1 = r1.A0C
            java.lang.Object r4 = r1.get()
            X.1K3 r4 = (X.AnonymousClass1K3) r4
            java.lang.Object r2 = r0.A02
            r1 = 0
            X.4WY r3 = new X.4WY
            r3.<init>(r2, r6, r0, r1)
            X.1K4 r4 = (X.AnonymousClass1K4) r4
            X.1K6 r2 = r4.A04
            java.lang.Integer r1 = X.C36401kF.A0i()
            X.2nm r0 = X.C51412nm.AGENT
            X.AnonymousClass1K6.A00(r5, r3, r2, r0, r1)
            return
        L_0x0289:
            java.lang.Object r1 = r0.A00
            X.2Gc r1 = (X.AnonymousClass2Gc) r1
            java.lang.Object r0 = r0.A02
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            X.AnonymousClass2Gc.A01(r0, r1, r6)
            return
        L_0x0295:
            java.lang.Object r1 = r0.A02
            X.2IR r1 = (X.AnonymousClass2IR) r1
            X.17Y r1 = r1.A0R
            X.14r r4 = r1.A00
            if (r4 == 0) goto L_0x0533
            java.lang.Object r3 = r0.A00
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r1 = r0.A01
            goto L_0x0472
        L_0x02a7:
            java.lang.Object r4 = r0.A00
            X.8Ym r4 = (X.C174798Ym) r4
            X.1NG r2 = r4.A0h
            java.lang.Object r1 = r0.A01
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0O(r1)
            if (r1 == 0) goto L_0x02cf
            X.14u r3 = r4.A01
            r0 = 2
            X.2rT r2 = new X.2rT
            r2.<init>(r3, r4, r0)
            r0 = 2131893132(0x7f121b8c, float:1.9421032E38)
            java.lang.String r1 = r3.getString(r0)
            r0 = 0
            com.whatsapp.blocklist.UnblockDialogFragment r0 = com.whatsapp.blocklist.UnblockDialogFragment.A03(r2, r1, r0, r0)
            r3.Btm(r0)
            return
        L_0x02cf:
            java.lang.Object r0 = r0.A02
            X.11F r0 = (X.AnonymousClass11F) r0
            X.C174798Ym.A0B(r4, r0)
            return
        L_0x02d7:
            java.lang.Object r3 = r0.A00
            X.2IN r3 = (X.AnonymousClass2IN) r3
            java.lang.Object r1 = r0.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.3Qa r1 = r1.A1J
            X.11F r1 = r1.A00
            com.whatsapp.jid.UserJid r1 = X.C36401kF.A0b(r1)
            java.util.List r2 = java.util.Collections.singletonList(r1)
            java.lang.Object r6 = r0.A02
            X.147 r6 = (X.AnonymousClass147) r6
            android.content.Context r0 = r3.getContext()
            X.14u r5 = X.C225314u.A0N(r0)
            if (r6 == 0) goto L_0x0533
            if (r5 == 0) goto L_0x0533
            X.0wD r0 = r3.A0k
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x030d
            X.17Y r2 = r3.A0R
            r1 = 2131886525(0x7f1201bd, float:1.9407631E38)
            r0 = 0
            r2.A06(r1, r0)
            return
        L_0x030d:
            r1 = 2131892104(0x7f121788, float:1.9418947E38)
            r0 = 2131893491(0x7f121cf3, float:1.942176E38)
            r5.Bu2(r1, r0)
            X.0xQ r1 = r3.A1Q
            X.1Cf r0 = r3.A0E
            X.2V9 r4 = new X.2V9
            r4.<init>(r0, r1, r6, r2)
            X.1Rs r2 = r4.A03
            r1 = 1
            X.3UX r0 = new X.3UX
            r0.<init>(r6, r3, r5, r1)
            r2.A08(r5, r0)
            X.1Rs r2 = r4.A02
            r1 = 2
            X.3UX r0 = new X.3UX
            r0.<init>(r6, r3, r5, r1)
            r2.A08(r5, r0)
            X.1Rs r2 = r4.A01
            r1 = 3
            X.3UX r0 = new X.3UX
            r0.<init>(r6, r3, r5, r1)
            r2.A08(r5, r0)
            X.1Rs r2 = r4.A00
            r1 = 30
            X.4Td r0 = new X.4Td
            r0.<init>(r5, r1)
            r2.A08(r5, r0)
            X.0xg r3 = r3.A0G
            X.0wU r2 = r3.A07
            r0 = 24
            X.1j9 r1 = new X.1j9
            r1.<init>(r3, r4, r0)
            java.lang.String r0 = "GroupXmppMethods/sendAddParticipants"
            r2.Bp6(r1, r0)
            return
        L_0x035d:
            java.lang.Object r5 = r0.A00
            X.3TU r5 = (X.AnonymousClass3TU) r5
            java.lang.Object r2 = r0.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            boolean r1 = r2 instanceof X.AnonymousClass2bV
            r4 = 0
            if (r1 == 0) goto L_0x0380
            X.2bV r2 = (X.AnonymousClass2bV) r2
            int r3 = r2.A00
            X.1e2 r2 = r5.A05
            android.content.Context r1 = r5.A04
            java.lang.Object r0 = r0.A01
            X.3Rh r0 = (X.C65243Rh) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Bp8(r1, r0, r4, r3)
            return
        L_0x0380:
            X.1e2 r2 = r5.A05
            android.content.Context r1 = r5.A04
            java.lang.Object r0 = r0.A01
            X.3Rh r0 = (X.C65243Rh) r0
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.Bp7(r1, r0, r4)
            return
        L_0x0392:
            java.lang.Object r4 = r0.A00
            X.2Ke r4 = (X.C43882Ke) r4
            X.0wQ r1 = r4.A01
            com.whatsapp.jid.PhoneUserJid r6 = X.C36371kC.A0e(r1)
            X.0wQ r1 = r4.A01
            X.0wh r1 = r1.A0A
            java.lang.String r2 = r1.A02()
            X.3Sx r5 = new X.3Sx
            r5.<init>()
            X.3F9 r1 = r5.A0A
            r1.A01 = r2
            java.lang.String r7 = X.AnonymousClass3U8.A04(r6)
            r9 = 2
            r8 = 0
            r10 = 1
            r5.A04(r6, r7, r8, r9, r10)
            X.0ts r3 = r4.A05
            X.1N4 r2 = r4.A00
            X.3Ow r1 = new X.3Ow
            r1.<init>(r2, r3)
            java.lang.String r3 = r1.A01(r5)     // Catch:{ 1YJ -> 0x03dc }
            android.content.Context r2 = r4.getContext()     // Catch:{ 1YJ -> 0x03dc }
            java.lang.Object r1 = r0.A01     // Catch:{ 1YJ -> 0x03dc }
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1     // Catch:{ 1YJ -> 0x03dc }
            android.content.Intent r2 = X.C36421kH.A09(r2, r10)     // Catch:{ 1YJ -> 0x03dc }
            X.C36371kC.A17(r2, r1)     // Catch:{ 1YJ -> 0x03dc }
            java.lang.String r1 = "vcard"
            r2.putExtra(r1, r3)     // Catch:{ 1YJ -> 0x03dc }
            X.C36371kC.A16(r2, r4)     // Catch:{ 1YJ -> 0x03dc }
            goto L_0x03e2
        L_0x03dc:
            r2 = move-exception
            java.lang.String r1 = "ReciprocalShare"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x03e2:
            java.lang.Object r0 = r0.A02
            X.C36411kG.A1O(r0)
            return
        L_0x03e8:
            java.lang.Object r1 = r0.A02
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            com.whatsapp.jid.UserJid r2 = X.C36401kF.A0b(r1)
            java.lang.Object r1 = r0.A00
            X.2Kd r1 = (X.C43872Kd) r1
            X.3Gc r1 = r1.A02
            java.util.ArrayList r4 = r1.A00(r2)
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            r4.size()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "edit_mode"
            r0 = 0
            r2.putExtra(r1, r0)
            java.lang.String r0 = "vcard_sender_infos"
            r2.putParcelableArrayListExtra(r0, r4)
            r3.startActivity(r2)
            return
        L_0x041d:
            java.lang.Object r1 = r0.A02
            X.2ML r1 = (X.AnonymousClass2ML) r1
            X.17Y r1 = r1.getGlobalUI()
            X.14r r4 = r1.A00
            if (r4 == 0) goto L_0x0533
            java.lang.Object r2 = r0.A00
            X.2bT r2 = (X.AnonymousClass2bT) r2
            r1 = 0
            java.lang.Object r0 = r0.A01
            X.2nZ r0 = (X.C51282nZ) r0
            com.whatsapp.events.EventInfoBottomSheet r1 = X.C54242sd.A00(r2, r1, r0)
            java.lang.String r0 = "EVENT_INFO_BOTTOM_SHEET"
            goto L_0x048e
        L_0x0439:
            java.lang.Object r1 = r0.A02
            X.1q6 r1 = (X.C38791q6) r1
            X.2XH r2 = r1.getLocationUtils()
            android.content.Context r3 = r1.getContext()
            java.lang.Object r1 = r0.A00
            X.3IM r1 = (X.AnonymousClass3IM) r1
            double r6 = r1.A00
            double r8 = r1.A01
            java.lang.Object r0 = r0.A01
            X.2bT r0 = (X.AnonymousClass2bT) r0
            X.3J7 r0 = r0.A01
            r5 = 0
            if (r0 == 0) goto L_0x045e
            java.lang.String r4 = r0.A02
            java.lang.String r5 = r0.A01
        L_0x045a:
            r2.A08(r3, r4, r5, r6, r8)
            return
        L_0x045e:
            r4 = r5
            goto L_0x045a
        L_0x0460:
            java.lang.Object r1 = r0.A02
            com.whatsapp.events.EventInfoFragment r1 = (com.whatsapp.events.EventInfoFragment) r1
            X.17Y r1 = r1.A02
            if (r1 == 0) goto L_0x0492
            X.14r r4 = r1.A00
            if (r4 == 0) goto L_0x0533
            java.lang.Object r3 = r0.A01
            X.3T1 r3 = (X.AnonymousClass3T1) r3
            java.lang.Object r1 = r0.A00
        L_0x0472:
            X.2pC r1 = (X.C52292pC) r1
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            X.3Qa r0 = r3.A1J
            X.AnonymousClass3UJ.A08(r2, r0)
            int r1 = r1.value
            java.lang.String r0 = "EXISTING_RESPONSE_EXTRA"
            r2.putInt(r0, r1)
            com.whatsapp.events.EventResponseBottomSheet r1 = new com.whatsapp.events.EventResponseBottomSheet
            r1.<init>()
            r1.A17(r2)
            java.lang.String r0 = "EVENT_RESPONSE_BOTTOM_SHEET"
        L_0x048e:
            r4.Btl(r1, r0)
            return
        L_0x0492:
            java.lang.RuntimeException r0 = X.C36321k7.A06()
            throw r0
        L_0x0497:
            java.lang.Object r4 = r0.A02
            com.whatsapp.info.views.EncryptionInfoView r4 = (com.whatsapp.info.views.EncryptionInfoView) r4
            X.17X r1 = r4.getGroupParticipantsManager$app_productinfra_chat_chat_non_modified()
            java.lang.Object r7 = r0.A00
            X.144 r7 = (X.AnonymousClass144) r7
            boolean r1 = r1.A0F(r7)
            r6 = 1
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x04da
            X.005 r1 = r4.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified()
            java.lang.Object r2 = r1.get()
            X.0y9 r2 = (X.C20780y9) r2
            java.lang.Class<X.0xa> r1 = X.C20450xa.class
            r2.A01(r1)
            r1 = 4
            com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet r3 = com.whatsapp.conversation.conversationrow.E2EEDescriptionBottomSheet.A03(r1)
            X.14u r2 = r4.A03
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getCanonicalName()
            r2.Btl(r3, r1)
        L_0x04cd:
            java.lang.Object r1 = r0.A01
            X.2Sc r1 = (X.C45632Sc) r1
            if (r1 == 0) goto L_0x0533
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A05 = r0
            return
        L_0x04da:
            X.14u r5 = r4.A03
            X.005 r1 = r4.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified()
            java.lang.Object r2 = r1.get()
            X.0y9 r2 = (X.C20780y9) r2
            java.lang.Class<X.0x7> r1 = X.C20160x7.class
            r2.A01(r1)
            r4 = 0
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r3 = new com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment
            r3.<init>()
            android.os.Bundle r2 = X.C36331k8.A07(r7)
            java.lang.String r1 = "provider_category"
            r2.putInt(r1, r6)
            java.lang.String r1 = "display_name"
            r2.putString(r1, r4)
            r3.A17(r2)
            r5.Btl(r3, r4)
            goto L_0x04cd
        L_0x0506:
            r0 = -1
            r9.setResult(r0)
            X.17Y r7 = r9.A05
            X.0ts r6 = r9.A06
            r5 = 2131755168(0x7f1000a0, float:1.9141208E38)
            java.util.List r0 = r9.A0B
            int r0 = r0.size()
            long r3 = (long) r0
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            java.util.List r0 = r9.A0B
            int r0 = r0.size()
            boolean r1 = X.C36361kB.A1b(r2, r0)
            java.lang.String r0 = r6.A0L(r2, r5, r3)
            r7.A0E(r0, r1)
            com.whatsapp.invites.InviteGroupParticipantsActivity.A01(r9, r10, r8)
            r9.finish()
        L_0x0533:
            return
        L_0x0534:
            java.lang.Object r2 = r0.A01
            X.2Sc r2 = (X.C45632Sc) r2
            if (r2 == 0) goto L_0x0540
            java.lang.Boolean r1 = X.C36371kC.A0m()
            r2.A05 = r1
        L_0x0540:
            java.lang.Object r1 = r0.A02
            com.whatsapp.info.views.EncryptionInfoView r1 = (com.whatsapp.info.views.EncryptionInfoView) r1
            X.14u r4 = r1.A03
            X.005 r1 = r1.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified()
            java.lang.Object r2 = r1.get()
            X.0y9 r2 = (X.C20780y9) r2
            java.lang.Class<X.0xb> r1 = X.C20460xb.class
            r2.A01(r1)
            java.lang.Object r0 = r0.A00
            X.11F r0 = (X.AnonymousClass11F) r0
            r3 = 0
            com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment r2 = new com.whatsapp.conversation.conversationrow.EncryptionChangeDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.C36331k8.A07(r0)
            java.lang.String r0 = "business_state_id"
            r1.putInt(r0, r3)
            r2.A17(r1)
            r0 = 0
            r4.Btl(r2, r0)
            return
        L_0x0570:
            java.lang.Object r4 = r0.A02
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r4 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r4
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A01
            X.0wU r1 = r4.getWaWorkers$app_productinfra_chat_chat_non_modified()
            r0 = 44
            X.C80403vL.A01(r1, r2, r4, r3, r0)
            X.005 r0 = r4.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified()
            java.lang.Object r1 = r0.get()
            X.0y9 r1 = (X.C20780y9) r1
            java.lang.Class<X.0x5> r0 = X.C20140x5.class
            r1.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberHiddenInCAGBottomSheet
            r2.<init>()
            X.14u r1 = r4.A06
            java.lang.String r0 = "PhoneNumberHiddenInCAGBottomSheet"
            goto L_0x05c3
        L_0x059a:
            java.lang.Object r4 = r0.A02
            com.whatsapp.info.views.PhoneNumberPrivacyInfoView r4 = (com.whatsapp.info.views.PhoneNumberPrivacyInfoView) r4
            java.lang.Object r3 = r0.A00
            java.lang.Object r2 = r0.A01
            X.0wU r1 = r4.getWaWorkers$app_productinfra_chat_chat_non_modified()
            r0 = 44
            X.C80403vL.A01(r1, r2, r4, r3, r0)
            X.005 r0 = r4.getDependencyBridgeRegistryLazy$app_productinfra_chat_chat_non_modified()
            java.lang.Object r1 = r0.get()
            X.0y9 r1 = (X.C20780y9) r1
            java.lang.Class<X.0x4> r0 = X.C20130x4.class
            r1.A01(r0)
            com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet r2 = new com.whatsapp.chatinfo.view.custom.PhoneNumberSharedInCAGBottomSheet
            r2.<init>()
            X.14u r1 = r4.A06
            java.lang.String r0 = "PhoneNumberSharedInCAGBottomSheet"
        L_0x05c3:
            r1.Btl(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48932iI.A02(android.view.View):void");
    }

    public C48932iI(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A01 = obj;
        this.A00 = obj2;
        this.A02 = obj3;
    }
}
