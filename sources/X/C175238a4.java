package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8a4  reason: invalid class name and case insensitive filesystem */
public class C175238a4 extends C201679k6 implements AnonymousClass4Q8 {
    public C175278a8 A00;
    public C175288a9 A01;
    public C175258a6 A02;
    public C175298aA A03;
    public C106475Jv A04;
    public C61953Ed A05;
    public C183468qq A06;
    public final int A07;
    public final C32621dv A08;
    public final AnonymousClass1LV A09;
    public final AnonymousClass1Pp A0A;
    public final AnonymousClass1RY A0B;
    public final C33301f4 A0C;
    public final C28251Rx A0D;
    public final C19420v0 A0E;
    public final AnonymousClass1HJ A0F;
    public final AnonymousClass1HO A0G;
    public final C24541Cv A0H;
    public final C32931eR A0I;
    public final C32831eG A0J;
    public final AnonymousClass6K4 A0K = new AnonymousClass5QI(AnonymousClass5TT.VIDEO);
    public final AnonymousClass6K4 A0L = new AnonymousClass5QI(AnonymousClass5TT.VOICE);
    public final AnonymousClass6K4 A0M = new AnonymousClass5QI(AnonymousClass5TT.VOICE_CHAT);
    public final Runnable A0N = new C81113wU((Object) this, 7);
    public final boolean A0O;
    public final C19460v5 A0P;
    public final AnonymousClass17Y A0Q;
    public final AnonymousClass1HX A0R;
    public final C220712t A0S;
    public final C26171Jd A0T;
    public final AnonymousClass1LU A0U;
    public final AnonymousClass1CR A0V;
    public final C19770wU A0W;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r14 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r0 != false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
        if (r6.A05((com.whatsapp.jid.GroupJid) r7) != 3) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        if (r4 != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass9K0 r15, X.C193999Ns r16, X.C175238a4 r17, boolean r18) {
        /*
            r1 = r15
            X.35M r15 = r15.A01
            r2 = r16
            X.141 r10 = r2.A00
            X.11F r7 = r10.A0H
            X.147 r11 = X.C65533Sl.A01(r7)
            r9 = r17
            X.12q r6 = r9.A0A
            int r13 = r6.A05(r11)
            java.lang.String r12 = r2.A05
            X.3LI r0 = r1.A02
            boolean r8 = r0.A0A()
            boolean r14 = r0.A0I
            X.141 r1 = r1.A00
            r5 = 8
            r0 = 0
            if (r7 == 0) goto L_0x0033
            X.0v0 r3 = r9.A0E
            boolean r3 = X.AnonymousClass1DH.A02(r3, r6, r7)
            if (r3 == 0) goto L_0x0033
            int r3 = r9.A07
            switch(r3) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x0033;
                case 2: goto L_0x00e2;
                case 3: goto L_0x0033;
                case 4: goto L_0x0033;
                case 5: goto L_0x0033;
                case 6: goto L_0x0033;
                case 7: goto L_0x00eb;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00f1;
                case 10: goto L_0x0033;
                case 11: goto L_0x00e2;
                default: goto L_0x0033;
            }
        L_0x0033:
            com.whatsapp.conversationslist.ViewHolder r3 = r9.A06
            X.1RJ r4 = r3.A0R
            if (r8 != 0) goto L_0x003b
            r0 = 8
        L_0x003b:
            r4.A03(r0)
        L_0x003e:
            int r4 = r9.A07
            r0 = 3
            if (r4 == r0) goto L_0x00ce
            r8 = 5
            if (r4 == r8) goto L_0x00ce
            X.1RJ r0 = r3.A0T
            if (r14 == 0) goto L_0x004b
        L_0x004a:
            r5 = 0
        L_0x004b:
            r0.A03(r5)
            if (r14 == 0) goto L_0x0053
            r9.A09(r10, r11, r12, r13, r14)
        L_0x0053:
            if (r18 != 0) goto L_0x00c1
            X.3T1 r5 = r2.A02
            if (r5 == 0) goto L_0x00c1
            boolean r0 = X.AnonymousClass3TK.A03(r5, r15)
            r6 = 0
            r16 = 0
            if (r0 == 0) goto L_0x00c1
            X.6C3 r0 = r9.A00
            if (r0 == 0) goto L_0x0069
            r0.A02()
        L_0x0069:
            X.3T1 r0 = r15.A00
            android.util.Pair r11 = r9.A0P(r0)
            android.widget.ImageView r0 = r3.A08
            r4 = 8
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.A09
            r0.setVisibility(r4)
            boolean r4 = r10.A0G()
            X.2bM r0 = r15.A01
            X.3Qa r0 = r0.A1J
            boolean r0 = r0.A02
            if (r4 == 0) goto L_0x00c2
            if (r0 != 0) goto L_0x00c4
            if (r1 == 0) goto L_0x0097
            X.171 r4 = r9.A05
            X.11F r0 = r10.A0H
            int r0 = r4.A09(r0)
            java.lang.String r16 = r4.A0Q(r1, r0)
        L_0x0097:
            X.C18740tg.A06(r15)
            X.0wG r13 = r9.A08
            X.0yC r14 = r9.A0B
            com.whatsapp.TextEmojiLabel r12 = r3.A0D
            android.text.SpannableString r3 = X.AnonymousClass3TK.A00(r11, r12, r13, r14, r15, r16)
            X.AnonymousClass00C.A0D(r12, r6)
            r12.getContext()
            android.graphics.Typeface r0 = X.C33511fU.A01()
            r12.setTypeface(r0, r6)
            if (r3 == 0) goto L_0x00c1
            r0 = 1
            r9.A0C(r3, r0)
            java.util.List r0 = r2.A06
            r7 = 0
            r2 = r9
            r3 = r10
            r4 = r1
            r6 = r0
            r2.A0W(r3, r4, r5, r6, r7)
        L_0x00c1:
            return
        L_0x00c2:
            if (r0 == 0) goto L_0x0097
        L_0x00c4:
            android.content.Context r4 = r9.A01
            r0 = 2131890321(0x7f121091, float:1.941533E38)
            java.lang.String r16 = r4.getString(r0)
            goto L_0x0097
        L_0x00ce:
            boolean r4 = r7 instanceof X.AnonymousClass147
            if (r4 == 0) goto L_0x00db
            com.whatsapp.jid.GroupJid r7 = (com.whatsapp.jid.GroupJid) r7
            int r6 = r6.A05(r7)
            r4 = 1
            if (r6 == r0) goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            X.1RJ r0 = r3.A0T
            if (r4 == 0) goto L_0x004b
            goto L_0x004a
        L_0x00e2:
            com.whatsapp.conversationslist.ViewHolder r3 = r9.A06
            X.1RJ r0 = r3.A0R
            r0.A03(r5)
            goto L_0x003e
        L_0x00eb:
            com.whatsapp.conversationslist.ViewHolder r3 = r9.A06
            X.1RJ r4 = r3.A0R
            goto L_0x003b
        L_0x00f1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "ConversationViewFillerRefactored/this state does not exist. State = "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A06(X.9K0, X.9Ns, X.8a4, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006f, code lost:
        if (r1 == 1) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A09(X.AnonymousClass141 r11, X.AnonymousClass147 r12, java.lang.String r13, int r14, boolean r15) {
        /*
            r10 = this;
            r6 = 0
            r9 = 1
            r0 = 3
            boolean r3 = X.AnonymousClass000.A1S(r14, r0)
            com.whatsapp.conversationslist.ViewHolder r5 = r10.A06
            android.widget.ImageView r4 = r5.A07
            boolean r2 = r4 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r2 == 0) goto L_0x0017
            r1 = r4
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            X.5Tv r0 = X.C108525Tv.CIRCLE
            r1.setProfilePhotoShape(r0)
        L_0x0017:
            int r1 = r10.A07
            r0 = 4
            if (r1 == r0) goto L_0x0071
            r0 = 3
            if (r1 == r0) goto L_0x0071
            r0 = 5
            if (r1 == r0) goto L_0x0071
            r0 = 6
            if (r1 == r0) goto L_0x0071
            if (r1 != r9) goto L_0x0029
            if (r15 == 0) goto L_0x0071
        L_0x0029:
            X.1LV r0 = r10.A09
            boolean r0 = r0.A0K(r12, r14)
            if (r0 == 0) goto L_0x006e
            X.1RJ r7 = r5.A0Y
            android.view.View r8 = r7.A01()
            com.whatsapp.community.SubgroupWithParentView r8 = (com.whatsapp.community.SubgroupWithParentView) r8
            X.1RY r0 = r10.A0B
            r8.setSubgroupProfilePhoto(r11, r14, r0)
            X.11F r1 = r11.A0H
            android.view.View r0 = r8.getTransitionView()
            A04(r0, r1)
            X.0wG r3 = r10.A08
            r2 = 2131886229(0x7f120095, float:1.940703E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.171 r0 = r10.A05
            X.C36361kB.A1F(r0, r11, r1, r6)
            java.lang.String r0 = r3.A02(r2, r1)
            r8.setContentDescription(r0)
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            X.C33521fV.A03(r8, r0)
            r1 = 8
            r4.setVisibility(r1)
            r7.A03(r6)
            X.1RJ r0 = r5.A0O
            r0.A03(r1)
        L_0x006d:
            return
        L_0x006e:
            r8 = 0
            if (r1 != r9) goto L_0x0072
        L_0x0071:
            r8 = 1
        L_0x0072:
            r1 = 8
            if (r3 == 0) goto L_0x00eb
            r4.setVisibility(r6)
            X.1RJ r0 = r5.A0Y
            r0.A03(r1)
            X.1RJ r0 = r5.A0O
            r0.A03(r1)
            if (r2 == 0) goto L_0x008d
            r1 = r4
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            X.5Tv r0 = X.C108525Tv.SQUIRCLE
            r1.setProfilePhotoShape(r0)
        L_0x008d:
            X.1RY r2 = r10.A0B
            r2.A03(r4)
            android.content.res.Resources r7 = r4.getResources()
            if (r8 == 0) goto L_0x00e7
            boolean r0 = X.C222013h.A05
            r5 = 2131231030(0x7f080136, float:1.807813E38)
            if (r0 == 0) goto L_0x00a2
            r5 = 2131231031(0x7f080137, float:1.8078132E38)
        L_0x00a2:
            android.content.res.Resources$Theme r3 = X.C36361kB.A09(r4)
            X.3c1 r1 = X.C68513c1.A00
            X.0yC r0 = r10.A0B
            android.graphics.drawable.Drawable r0 = X.C27751Pr.A00(r3, r7, r1, r0, r5)
            r4.setImageDrawable(r0)
            if (r8 != 0) goto L_0x00ca
            if (r12 == 0) goto L_0x00ca
            X.1LV r0 = r10.A09
            X.147 r1 = r0.A02(r12)
            if (r1 == 0) goto L_0x00ca
            X.16D r0 = r10.A04
            X.16z r0 = r0.A04
            X.141 r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x00ca
            r2.A08(r4, r0)
        L_0x00ca:
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            X.C33521fV.A03(r4, r0)
            boolean r0 = r11.A0G()
            if (r0 == 0) goto L_0x006d
            X.0wG r2 = r10.A08
            r1 = 2131886210(0x7f120082, float:1.9406992E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r6] = r13
            java.lang.String r0 = r2.A02(r1, r0)
            r4.setContentDescription(r0)
            return
        L_0x00e7:
            r5 = 2131233988(0x7f080cc4, float:1.808413E38)
            goto L_0x00a2
        L_0x00eb:
            if (r14 != r9) goto L_0x011a
            r4.setVisibility(r1)
            X.1RJ r0 = r5.A0Y
            r0.A03(r1)
            X.1RJ r0 = r5.A0O
            android.view.View r3 = X.C36391kE.A0L(r0, r6)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r0 = r3 instanceof com.whatsapp.community.CommunityStackView
            if (r0 == 0) goto L_0x0114
            r2 = r3
            com.whatsapp.community.CommunityStackView r2 = (com.whatsapp.community.CommunityStackView) r2
            X.1RY r0 = r10.A0B
            r2.setParentGroupProfilePhoto(r11, r0)
            X.11F r1 = r11.A0H
            com.whatsapp.WaImageView r0 = r2.A00
            A04(r0, r1)
        L_0x0110:
            r3.setFocusable(r6)
            goto L_0x00ca
        L_0x0114:
            java.lang.String r0 = "ConversationViewFillerRefactored/setParentGroupProfilePhoto/Unexpected class instance"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0110
        L_0x011a:
            r4.setVisibility(r6)
            X.1RJ r0 = r5.A0Y
            r0.A03(r1)
            X.1RJ r0 = r5.A0O
            r0.A03(r1)
            if (r14 != r9) goto L_0x0133
            if (r2 == 0) goto L_0x0133
            r1 = r4
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1
            X.5Tv r0 = X.C108525Tv.SQUIRCLE
            r1.setProfilePhotoShape(r0)
        L_0x0133:
            X.1RY r0 = r10.A0B
            r0.A08(r4, r11)
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A09(X.141, X.147, java.lang.String, int, boolean):void");
    }

    private void A0C(CharSequence charSequence, boolean z) {
        CharSequence charSequence2 = charSequence;
        int i = this.A07;
        if ((i == 1 || i == 10) && this.A0B.A0E(4659)) {
            try {
                charSequence2 = AnonymousClass6YV.A0A(charSequence);
            } catch (Throwable th) {
                this.A03.A01.A0E("BaseViewFillerRefactored/fillMessage", C36331k8.A0i("remove rich format ", AnonymousClass000.A0u(), th), true);
            }
        }
        this.A06.A0D.A0H(this.A0H, charSequence2, this.A0L.BFy(), 150, z);
        Boolean bool = C18750th.A03;
    }

    public void Bx0(UserJid userJid, C61953Ed r9) {
        AnonymousClass141 r2;
        C61953Ed r4 = r9;
        this.A05 = r9;
        ImageView imageView = this.A06.A07;
        if (imageView instanceof WDSProfilePhoto) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
            A0B(r9, wDSProfilePhoto);
            String str = null;
            UserJid userJid2 = userJid;
            C192459Hb A022 = A02(userJid, (Set) null);
            if (A022 != null) {
                C193999Ns r0 = A022.A01;
                r2 = r0.A00;
                str = r0.A05;
            } else {
                r2 = null;
            }
            A0A(r2, userJid2, r4, wDSProfilePhoto, str);
        }
    }

    public static AnonymousClass9K0 A01(C02680Bk r7, C175238a4 r8, AnonymousClass11F r9, AnonymousClass3T1 r10) {
        AnonymousClass35M r3;
        AnonymousClass11F r72;
        C65073Qp A0W2;
        AnonymousClass3LI A0d = C36361kB.A0d(r9, r8.A0V);
        r7.A04();
        AnonymousClass141 r6 = null;
        if (r10 == null || (A0W2 = C36371kC.A0W(r8.A0A, r72)) == null || A0W2.A01() <= 0) {
            r3 = null;
        } else {
            r3 = r8.A0T.A0D((r72 = r10.A1J.A00));
            if (r3 != null) {
                AnonymousClass2bM r2 = r3.A01;
                if (r2.A0L() != null) {
                    r6 = r8.A04.A0D(r2.A0L());
                }
            }
        }
        return new AnonymousClass9K0(r6, r3, A0d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r3 != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C192459Hb A02(X.AnonymousClass11F r24, java.util.Set r25) {
        /*
            r23 = this;
            r1 = r24
            r6 = r23
            X.16D r9 = r6.A04
            X.141 r15 = r9.A07(r1)
            r14 = 0
            r7 = r25
            if (r25 == 0) goto L_0x0125
            java.util.HashSet r22 = r9.A0M(r7)
        L_0x0013:
            X.1CR r0 = r6.A0V
            X.3LI r5 = r0.A0S(r1)
            com.whatsapp.jid.GroupJid r2 = X.C36441kJ.A0l(r1)
            boolean r0 = r6.A0F(r1)
            r4 = 0
            r8 = 1
            if (r0 == 0) goto L_0x00b0
            X.3T1 r3 = X.C201679k6.A0J(r6, r1)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            r1 = r14
            if (r3 == 0) goto L_0x0122
        L_0x0030:
            if (r15 == 0) goto L_0x0122
            X.0wQ r10 = r6.A02
            X.1HX r0 = r6.A0R
            X.11F r10 = X.AnonymousClass3TZ.A00(r10, r0, r15, r3)
        L_0x003a:
            if (r1 == 0) goto L_0x00ae
            X.2bM r0 = r1.A01
            X.11F r0 = r0.A0J()
            if (r0 == 0) goto L_0x00ae
            X.141 r0 = r9.A07(r0)
            if (r0 == 0) goto L_0x0052
            X.171 r11 = r6.A05
            java.lang.String r11 = r11.A0I(r0)
            if (r11 != 0) goto L_0x0053
        L_0x0052:
            r1 = r14
        L_0x0053:
            if (r10 == 0) goto L_0x00ab
            X.141 r16 = r9.A07(r10)
        L_0x0059:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r8)
            if (r1 == 0) goto L_0x0070
            X.2bM r8 = r1.A01
            X.3Qa r9 = r8.A1J
            X.11F r8 = r9.A00
            boolean r8 = X.AnonymousClass143.A0G(r8)
            if (r8 == 0) goto L_0x0070
            boolean r8 = r9.A02
            if (r8 != 0) goto L_0x0070
            r4 = 1
        L_0x0070:
            if (r15 == 0) goto L_0x0086
            X.171 r8 = r6.A05
            java.lang.String r20 = r8.A0I(r15)
            if (r3 == 0) goto L_0x0086
            if (r5 == 0) goto L_0x0086
            if (r16 != 0) goto L_0x0080
            if (r10 != 0) goto L_0x0086
        L_0x0080:
            if (r4 != 0) goto L_0x0086
            if (r25 != 0) goto L_0x0087
            if (r22 == 0) goto L_0x0093
        L_0x0086:
            return r14
        L_0x0087:
            if (r22 == 0) goto L_0x0086
            int r7 = r7.size()
            int r4 = r22.size()
            if (r7 != r4) goto L_0x0086
        L_0x0093:
            X.3Ed r4 = r6.A05
            X.9Ns r14 = new X.9Ns
            r21 = r2
            r17 = r3
            r18 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            X.9K0 r2 = new X.9K0
            r2.<init>(r0, r1, r5)
            X.9Hb r0 = new X.9Hb
            r0.<init>(r2, r14)
            return r0
        L_0x00ab:
            r16 = r14
            goto L_0x0059
        L_0x00ae:
            r0 = r14
            goto L_0x0053
        L_0x00b0:
            X.12q r3 = r6.A0A
            int r0 = r3.A05(r2)
            if (r0 != r8) goto L_0x00f1
            X.1LV r0 = r6.A09
            X.147 r1 = (X.AnonymousClass147) r1
            java.util.List r2 = X.C165597tg.A0r(r0, r1)
            int r0 = r2.size()
            if (r0 != r8) goto L_0x0120
            java.lang.Object r0 = r2.get(r4)
            X.3QK r0 = (X.AnonymousClass3QK) r0
            if (r0 == 0) goto L_0x00ef
            com.whatsapp.jid.GroupJid r1 = r0.A02
            if (r1 == 0) goto L_0x00ef
            boolean r0 = r6.A0F(r1)
            if (r0 == 0) goto L_0x00ea
            X.3T1 r3 = X.C201679k6.A0J(r6, r1)
        L_0x00dc:
            if (r3 == 0) goto L_0x0121
            X.1Jd r1 = r6.A0T
            X.3Qa r0 = r3.A1J
            X.11F r0 = r0.A00
            X.35M r1 = r1.A0C(r0)
            goto L_0x0030
        L_0x00ea:
            X.3T1 r3 = r3.A0C(r1)
            goto L_0x00dc
        L_0x00ef:
            r3 = 0
            goto L_0x0121
        L_0x00f1:
            X.3T1 r3 = r3.A0C(r1)
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.1Jd r0 = r6.A0T
            X.35M r1 = r0.A0C(r1)
            if (r3 == 0) goto L_0x0122
            X.0wo r10 = r6.A07
            java.lang.Long r0 = r3.A0g
            if (r0 == 0) goto L_0x0030
            long r12 = r0.longValue()
            long r10 = X.C19970wo.A00(r10)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            int r0 = r3.A0E()
            if (r0 == r8) goto L_0x0030
            X.12t r0 = r6.A0S
            r0.A09(r3)
            goto L_0x0030
        L_0x0120:
            r3 = r14
        L_0x0121:
            r1 = r14
        L_0x0122:
            r10 = r14
            goto L_0x003a
        L_0x0125:
            r22 = r14
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A02(X.11F, java.util.Set):X.9Hb");
    }

    public static C193999Ns A03(C02680Bk r11, C175238a4 r12, AnonymousClass11F r13, Collection collection) {
        AnonymousClass3T1 A052;
        List A0I2;
        AnonymousClass141 A0D2;
        AnonymousClass3QK r0;
        GroupJid groupJid;
        AnonymousClass1LV r3 = r12.A09;
        boolean A0G2 = r3.A0G(r13);
        r11.A04();
        if (A0G2) {
            A0I2 = C165597tg.A0r(r3, C65533Sl.A01(r13));
            if (A0I2.size() != 1 || (r0 = (AnonymousClass3QK) A0I2.get(0)) == null || (groupJid = r0.A02) == null) {
                A052 = null;
            } else if (r12.A0F(groupJid)) {
                A052 = C201679k6.A0J(r12, groupJid);
            } else {
                A052 = r12.A0H.A05(groupJid);
            }
        } else {
            A052 = r12.A0H.A05(r13);
            A0I2 = AnonymousClass001.A0I();
        }
        r11.A04();
        AnonymousClass16D r32 = r12.A04;
        AnonymousClass141 A0D3 = r32.A0D(r13);
        AnonymousClass11F A002 = AnonymousClass3TZ.A00(r12.A02, r12.A0R, A0D3, A052);
        if (A002 == null) {
            A0D2 = null;
        } else {
            A0D2 = r32.A0D(A002);
        }
        r11.A04();
        r11.A04();
        return new C193999Ns(A0D3, A0D2, A052, r12.A05, true, r12.A05.A0I(A0D3), A0I2, r32.A0M(collection));
    }

    public static void A05(C199789fy r11, C175238a4 r12) {
        int i = r11.A02;
        int i2 = r11.A01;
        int i3 = r11.A00;
        ViewHolder viewHolder = r12.A06;
        C200229gu r8 = viewHolder.A0G;
        ConversationListRowHeaderView conversationListRowHeaderView = r8.A03;
        conversationListRowHeaderView.A01.setVisibility(8);
        int i4 = 8;
        if (i2 > 0) {
            i4 = 0;
        }
        conversationListRowHeaderView.getUnreadImportantIndicatorView().setVisibility(i4);
        viewHolder.A02.setVisibility(0);
        viewHolder.A0A.setVisibility(8);
        viewHolder.A0Q.A03(8);
        if (i > 0) {
            C18820ts r5 = r12.A09;
            long j = (long) i;
            conversationListRowHeaderView.getUnreadIndicatorView().setText(r5.A0M().format(j));
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, i, 0);
            conversationListRowHeaderView.getUnreadIndicatorView().setContentDescription(r5.A0L(objArr, R.plurals.f10nameremoved, j));
            r8.A04();
            if (i3 > 1) {
                r8.A01();
            }
        } else {
            r8.A03();
        }
        conversationListRowHeaderView.getUnreadIndicatorView().setVisibility(0);
    }

    public static void A07(C175238a4 r4, int i) {
        int i2 = r4.A07;
        if (i2 != 3 && i2 != 4) {
            C200229gu r3 = r4.A06.A0G;
            Context context = r4.A01;
            C18740tg.A06(context);
            int i3 = R.color.f6nameremoved;
            if (i > 0) {
                i3 = C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
            }
            int A002 = AnonymousClass00F.A00(context, i3);
            ConversationListRowHeaderView conversationListRowHeaderView = r3.A03;
            conversationListRowHeaderView.A01.setTextColor(A002);
            WaTextView waTextView = conversationListRowHeaderView.A01;
            if (i > 0) {
                C33511fU.A03(waTextView);
            } else {
                waTextView.A0C();
            }
        }
    }

    public static void A08(C175238a4 r4, AnonymousClass11F r5, C107265Nh r6) {
        Context context;
        AnonymousClass1RJ r2;
        View view;
        int i;
        WDSProfilePhoto wDSProfilePhoto;
        AnonymousClass6K4 r0;
        if (r6 == null || (context = r4.A01) == null) {
            ViewHolder viewHolder = r4.A06;
            ImageView imageView = viewHolder.A07;
            if (imageView instanceof WDSProfilePhoto) {
                ((WDSProfilePhoto) imageView).setProfileBadge((AnonymousClass6K4) null);
                int A002 = AnonymousClass3TD.A00(r4.A04, r4.A0A, r5);
                viewHolder.A0I(AnonymousClass000.A1R(A002), A002);
                return;
            }
            viewHolder.A0N.A03(8);
            return;
        }
        if (r6.A0K) {
            ViewHolder viewHolder2 = r4.A06;
            ImageView imageView2 = viewHolder2.A07;
            if (imageView2 instanceof WDSProfilePhoto) {
                wDSProfilePhoto = (WDSProfilePhoto) imageView2;
                r0 = r4.A0K;
            } else {
                r2 = viewHolder2.A0N;
                ((ImageView) r2.A01()).setImageResource(R.drawable.ic_voip_chatlist_joinable_video);
                view = r2.A01();
                i = R.string.f12nameremoved;
                C36331k8.A0q(context, view, i);
                r2.A03(0);
                return;
            }
        } else if (r6.A08 == 2) {
            ImageView imageView3 = r4.A06.A07;
            if (imageView3 instanceof WDSProfilePhoto) {
                wDSProfilePhoto = (WDSProfilePhoto) imageView3;
                r0 = r4.A0M;
            } else {
                return;
            }
        } else {
            ViewHolder viewHolder3 = r4.A06;
            ImageView imageView4 = viewHolder3.A07;
            if (imageView4 instanceof WDSProfilePhoto) {
                wDSProfilePhoto = (WDSProfilePhoto) imageView4;
                r0 = r4.A0L;
            } else {
                r2 = viewHolder3.A0N;
                ((ImageView) r2.A01()).setImageResource(R.drawable.ic_voip_chatlist_joinable_voice);
                view = r2.A01();
                i = R.string.f12nameremoved;
                C36331k8.A0q(context, view, i);
                r2.A03(0);
                return;
            }
        }
        wDSProfilePhoto.setProfileBadge(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r10.A01 <= 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A(X.AnonymousClass141 r8, com.whatsapp.jid.UserJid r9, X.C61953Ed r10, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r11, java.lang.String r12) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x005e
            X.0wQ r0 = r7.A02
            boolean r0 = X.C36361kB.A1X(r0, r8)
            if (r0 == 0) goto L_0x0013
            android.content.Context r1 = r7.A01
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r12 = r1.getString(r0)
        L_0x0013:
            if (r12 == 0) goto L_0x005e
            android.content.Context r6 = r7.A01
            r0 = 2131894899(0x7f122273, float:1.9424616E38)
            java.lang.String r5 = r6.getString(r0)
            if (r10 == 0) goto L_0x002b
            boolean r0 = r10.A00()
            if (r0 == 0) goto L_0x002b
            int r1 = r10.A01
            r0 = 1
            if (r1 > 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            r4 = 1
            if (r0 == 0) goto L_0x0043
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2131755382(0x7f100176, float:1.9141642E38)
            int r1 = r10.A01
            java.lang.Object[] r0 = X.C36411kG.A1b(r12)
            X.AnonymousClass000.A1L(r0, r1, r4)
            java.lang.String r12 = r3.getQuantityString(r2, r1, r0)
        L_0x0043:
            if (r9 == 0) goto L_0x0056
            X.12q r1 = r7.A0A
            X.16D r0 = r7.A04
            int r0 = X.AnonymousClass3TD.A00(r0, r1, r9)
            if (r0 <= 0) goto L_0x0056
            r0 = 2131894900(0x7f122274, float:1.9424618E38)
            java.lang.String r12 = X.C36351kA.A0w(r6, r12, r4, r0)
        L_0x0056:
            X.1rZ r0 = new X.1rZ
            r0.<init>(r12, r5)
            X.C012005e.A0V(r11, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A0A(X.141, com.whatsapp.jid.UserJid, X.3Ed, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto, java.lang.String):void");
    }

    private void A0B(C61953Ed r3, WDSProfilePhoto wDSProfilePhoto) {
        if (r3 == null || !r3.A00() || r3.A01 <= 0) {
            wDSProfilePhoto.setStatusIndicatorEnabled(false);
            return;
        }
        wDSProfilePhoto.setProfilePhotoShape(C108525Tv.CIRCLE);
        wDSProfilePhoto.setStatusIndicatorEnabled(true);
        wDSProfilePhoto.setProfileStatus(new AnonymousClass5QJ(AnonymousClass5TU.UNSEEN));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0616, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0617, code lost:
        if (r39 != null) goto L_0x0619;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0619, code lost:
        r19.Bfd(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0620, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0274, code lost:
        if (r12 == 5) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006e, code lost:
        if (r3.A0V.A09() != false) goto L_0x0070;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x039e A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03a3 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x03a8 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x05a3 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05a5 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05b4 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05cd A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x05e9 A[Catch:{ all -> 0x0616 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x060c  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0340 A[Catch:{ all -> 0x0616 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0D(X.C193999Ns r37, X.C175238a4 r38, X.C34211gd r39, int r40) {
        /*
            r0 = r37
            X.141 r6 = r0.A00
            X.141 r0 = r0.A01
            r20 = r0
            r0 = r37
            X.3T1 r5 = r0.A02
            java.util.List r0 = r0.A06
            r35 = r0
            r0 = r37
            java.lang.String r0 = r0.A05
            r34 = r0
            r4 = r38
            android.content.Context r8 = r4.A01
            X.C18740tg.A06(r8)
            r21 = 0
            r19 = r39
            r36 = r40
            com.whatsapp.conversationslist.ViewHolder r3 = r4.A06     // Catch:{ all -> 0x0614 }
            android.view.View r1 = r3.A04     // Catch:{ all -> 0x0614 }
            r11 = 0
            r1.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            com.whatsapp.TextEmojiLabel r0 = r3.A0D     // Catch:{ all -> 0x0614 }
            r33 = r0
            r0.setPlaceholder(r11)     // Catch:{ all -> 0x0614 }
            java.lang.Class<X.11F> r18 = X.AnonymousClass11F.class
            r0 = r18
            com.whatsapp.jid.Jid r2 = r6.A06(r0)     // Catch:{ all -> 0x0614 }
            X.11F r2 = (X.AnonymousClass11F) r2     // Catch:{ all -> 0x0614 }
            X.C18740tg.A06(r2)     // Catch:{ all -> 0x0614 }
            X.147 r9 = X.C65533Sl.A01(r2)     // Catch:{ all -> 0x0614 }
            X.12q r0 = r4.A0A     // Catch:{ all -> 0x0614 }
            r32 = r0
            int r17 = r0.A05(r9)     // Catch:{ all -> 0x0614 }
            r7 = 0
            r27 = 0
            r22 = r4
            r23 = r6
            r24 = r9
            r25 = r34
            r26 = r17
            r22.A09(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0614 }
            boolean r15 = r2 instanceof X.AnonymousClass146     // Catch:{ all -> 0x0614 }
            if (r15 != 0) goto L_0x00a3
            X.1LV r0 = r4.A09     // Catch:{ all -> 0x0614 }
            boolean r0 = r0.A0G(r2)     // Catch:{ all -> 0x0614 }
            r9 = 1
            if (r0 != 0) goto L_0x00a3
            X.1RJ r0 = r3.A0V     // Catch:{ all -> 0x0614 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x007b
        L_0x0070:
            X.1RJ r0 = r3.A0V     // Catch:{ all -> 0x0614 }
            android.view.View r0 = r0.A01()     // Catch:{ all -> 0x0614 }
            com.whatsapp.components.SelectionCheckView r0 = (com.whatsapp.components.SelectionCheckView) r0     // Catch:{ all -> 0x0614 }
            r0.setEnabled(r9)     // Catch:{ all -> 0x0614 }
        L_0x007b:
            X.1Rx r0 = r4.A0D     // Catch:{ all -> 0x0614 }
            r31 = r0
            java.util.Set r0 = r31.BHD()     // Catch:{ all -> 0x0614 }
            boolean r10 = r0.contains(r2)     // Catch:{ all -> 0x0614 }
            r0 = r31
            boolean r12 = r0.Bnh(r2)     // Catch:{ all -> 0x0614 }
            X.11F r0 = r31.BCP()     // Catch:{ all -> 0x0614 }
            boolean r9 = r2.equals(r0)     // Catch:{ all -> 0x0614 }
            if (r10 == 0) goto L_0x009f
            r0 = 2
            r3.A0H(r11, r0)     // Catch:{ all -> 0x0614 }
        L_0x009b:
            r3.A0J(r10, r12)     // Catch:{ all -> 0x0614 }
            goto L_0x00a5
        L_0x009f:
            r3.A0H(r11, r11)     // Catch:{ all -> 0x0614 }
            goto L_0x009b
        L_0x00a3:
            r9 = 0
            goto L_0x0070
        L_0x00a5:
            if (r9 == 0) goto L_0x012b
            r31.B2q()     // Catch:{ all -> 0x0614 }
            android.content.Context r12 = r1.getContext()     // Catch:{ all -> 0x0614 }
            r9 = 2130970397(0x7f04071d, float:1.7549503E38)
            r0 = 2131102027(0x7f06094b, float:1.781648E38)
            if (r10 == 0) goto L_0x00bc
            r9 = 2130969781(0x7f0404b5, float:1.7548254E38)
            r0 = 2131101050(0x7f06057a, float:1.7814499E38)
        L_0x00bc:
            int r0 = X.C224514j.A00(r12, r9, r0)     // Catch:{ all -> 0x0614 }
            int r26 = X.AnonymousClass00F.A00(r8, r0)     // Catch:{ all -> 0x0614 }
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r26 = r26 & r9
            r9 = 2131099675(0x7f06001b, float:1.781171E38)
            int r9 = X.AnonymousClass00F.A00(r8, r9)     // Catch:{ all -> 0x0614 }
            r16 = 1
            X.9lf r14 = new X.9lf     // Catch:{ all -> 0x0614 }
            r27 = 1
            r24 = r0
            r25 = r4
            r22 = r14
            r23 = r1
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0614 }
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x0614 }
            r1.<init>()     // Catch:{ all -> 0x0614 }
            r12 = 2
            java.lang.Object[] r0 = new java.lang.Object[r12]     // Catch:{ all -> 0x0614 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r26)     // Catch:{ all -> 0x0614 }
            java.lang.Integer r10 = X.C165617ti.A0X(r13, r0, r11, r9)     // Catch:{ all -> 0x0614 }
            r0[r16] = r10     // Catch:{ all -> 0x0614 }
            android.animation.ValueAnimator r9 = android.animation.ValueAnimator.ofObject(r1, r0)     // Catch:{ all -> 0x0614 }
            r0 = 300(0x12c, double:1.48E-321)
            r9.setStartDelay(r0)     // Catch:{ all -> 0x0614 }
            r0 = 550(0x226, double:2.717E-321)
            r9.setDuration(r0)     // Catch:{ all -> 0x0614 }
            r9.addUpdateListener(r14)     // Catch:{ all -> 0x0614 }
            r9.start()     // Catch:{ all -> 0x0614 }
            android.animation.ArgbEvaluator r0 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x0614 }
            r0.<init>()     // Catch:{ all -> 0x0614 }
            java.lang.Object[] r1 = X.C36431kI.A1a(r10, r13, r12)     // Catch:{ all -> 0x0614 }
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofObject(r0, r1)     // Catch:{ all -> 0x0614 }
            r0 = 2150(0x866, double:1.062E-320)
            r10.setDuration(r0)     // Catch:{ all -> 0x0614 }
            r10.addUpdateListener(r14)     // Catch:{ all -> 0x0614 }
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet     // Catch:{ all -> 0x0614 }
            r1.<init>()     // Catch:{ all -> 0x0614 }
            android.animation.AnimatorSet$Builder r0 = r1.play(r10)     // Catch:{ all -> 0x0614 }
            r0.after(r9)     // Catch:{ all -> 0x0614 }
            r1.start()     // Catch:{ all -> 0x0614 }
        L_0x012b:
            r10 = 1
            if (r15 != 0) goto L_0x0167
            android.widget.ImageView r9 = r3.A07     // Catch:{ all -> 0x0614 }
            r9.setEnabled(r10)     // Catch:{ all -> 0x0614 }
            A04(r9, r2)     // Catch:{ all -> 0x0614 }
            r13 = 7
            X.3YG r12 = new X.3YG     // Catch:{ all -> 0x0614 }
            r12.<init>(r4, r2, r13)     // Catch:{ all -> 0x0614 }
            X.3YL r1 = new X.3YL     // Catch:{ all -> 0x0614 }
            r0 = r36
            r1.<init>(r4, r0, r13, r2)     // Catch:{ all -> 0x0614 }
            X.B8D r13 = new X.B8D     // Catch:{ all -> 0x0614 }
            r0 = r17
            r13.<init>(r4, r0, r10, r2)     // Catch:{ all -> 0x0614 }
            android.view.View$OnCreateContextMenuListener r0 = r31.BEe()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0159
            android.view.View r10 = r3.A0H     // Catch:{ all -> 0x0614 }
            android.view.View$OnCreateContextMenuListener r0 = r31.BEe()     // Catch:{ all -> 0x0614 }
            r10.setOnCreateContextMenuListener(r0)     // Catch:{ all -> 0x0614 }
        L_0x0159:
            r9.setOnClickListener(r1)     // Catch:{ all -> 0x0614 }
            android.view.View r10 = X.C201679k6.A0I(r12, r13, r9, r3)     // Catch:{ all -> 0x0614 }
            r10.setOnClickListener(r1)     // Catch:{ all -> 0x0614 }
            r10.setOnLongClickListener(r13)     // Catch:{ all -> 0x0614 }
            goto L_0x0185
        L_0x0167:
            r9 = r2
            X.146 r9 = (X.AnonymousClass146) r9     // Catch:{ all -> 0x0614 }
            r0 = 8
            X.3YG r1 = new X.3YG     // Catch:{ all -> 0x0614 }
            r1.<init>(r4, r9, r0)     // Catch:{ all -> 0x0614 }
            android.widget.ImageView r9 = r3.A07     // Catch:{ all -> 0x0614 }
            r9.setEnabled(r11)     // Catch:{ all -> 0x0614 }
            r9.setOnClickListener(r1)     // Catch:{ all -> 0x0614 }
            r0 = r21
            android.view.View r10 = X.C201679k6.A0I(r1, r0, r9, r3)     // Catch:{ all -> 0x0614 }
            r10.setOnClickListener(r1)     // Catch:{ all -> 0x0614 }
            r10.setOnLongClickListener(r0)     // Catch:{ all -> 0x0614 }
        L_0x0185:
            r10.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            com.whatsapp.TextEmojiLabel r0 = r3.A0E     // Catch:{ all -> 0x0614 }
            r25 = r0
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            android.widget.ImageView r0 = r3.A09     // Catch:{ all -> 0x0614 }
            r24 = r0
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            android.widget.ImageView r0 = r3.A08     // Catch:{ all -> 0x0614 }
            r30 = r0
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            X.9gu r0 = r3.A0G     // Catch:{ all -> 0x0614 }
            r29 = r0
            com.whatsapp.components.ConversationListRowHeaderView r0 = r0.A03     // Catch:{ all -> 0x0614 }
            com.whatsapp.WaTextView r0 = r0.A01     // Catch:{ all -> 0x0614 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            r0 = r29
            X.24G r0 = r0.A04     // Catch:{ all -> 0x0614 }
            r28 = r0
            com.whatsapp.TextEmojiLabel r1 = r0.A01     // Catch:{ all -> 0x0614 }
            r1.setPadding(r11, r11, r11, r11)     // Catch:{ all -> 0x0614 }
            X.0wQ r0 = r4.A02     // Catch:{ all -> 0x0614 }
            boolean r0 = X.C36361kB.A1X(r0, r6)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x01e1
            X.0yC r10 = r4.A0B     // Catch:{ all -> 0x0614 }
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r10.A0E(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x01e1
            java.util.List r12 = r31.BFy()     // Catch:{ all -> 0x0614 }
            X.3Tl r10 = r4.A0H     // Catch:{ all -> 0x0614 }
            r1.setPlaceholder(r11)     // Catch:{ all -> 0x0614 }
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = r28
            r0.A07(r6, r10, r12, r1)     // Catch:{ all -> 0x0614 }
        L_0x01d5:
            r0 = r32
            int r21 = r0.A02(r2)     // Catch:{ all -> 0x0614 }
            int r12 = r4.A07     // Catch:{ all -> 0x0614 }
            r1 = 1
            if (r12 != r1) goto L_0x024d
            goto L_0x0219
        L_0x01e1:
            r0 = r32
            boolean r0 = r0.A0O(r2)     // Catch:{ all -> 0x0614 }
            r10 = 1
            if (r0 == 0) goto L_0x020b
            int r1 = r4.A07     // Catch:{ all -> 0x0614 }
            r0 = 4
            if (r1 == r0) goto L_0x01fa
            r0 = 3
            if (r1 == r0) goto L_0x01fa
            r0 = 5
            if (r1 == r0) goto L_0x01fa
            r0 = 6
            if (r1 == r0) goto L_0x01fa
            if (r1 != r10) goto L_0x020b
        L_0x01fa:
            X.0wG r1 = r4.A08     // Catch:{ all -> 0x0614 }
            r0 = 2131888046(0x7f1207ae, float:1.9410716E38)
            java.lang.String r1 = r1.A01(r0)     // Catch:{ all -> 0x0614 }
            X.3Tl r10 = r4.A0H     // Catch:{ all -> 0x0614 }
            r0 = r29
            r0.A07(r10, r1)     // Catch:{ all -> 0x0614 }
            goto L_0x01d5
        L_0x020b:
            java.util.List r12 = r31.BFy()     // Catch:{ all -> 0x0614 }
            X.3Tl r10 = r4.A0H     // Catch:{ all -> 0x0614 }
            r1 = r29
            r0 = r34
            r1.A08(r10, r0, r12)     // Catch:{ all -> 0x0614 }
            goto L_0x01d5
        L_0x0219:
            r0 = r17
            if (r0 != r1) goto L_0x0242
            X.0yC r1 = r4.A0B     // Catch:{ all -> 0x0614 }
            r0 = 6884(0x1ae4, float:9.647E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x02fc
            X.9fy r0 = new X.9fy     // Catch:{ all -> 0x0614 }
            r0.<init>()     // Catch:{ all -> 0x0614 }
            A05(r0, r4)     // Catch:{ all -> 0x0614 }
            r0 = r2
            X.147 r0 = (X.AnonymousClass147) r0     // Catch:{ all -> 0x0614 }
            X.8qq r1 = new X.8qq     // Catch:{ all -> 0x0614 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x0614 }
            r4.A06 = r1     // Catch:{ all -> 0x0614 }
            X.0wU r0 = r4.A0W     // Catch:{ all -> 0x0614 }
            X.C36391kE.A1Q(r1, r0)     // Catch:{ all -> 0x0614 }
            r21 = 0
            goto L_0x0310
        L_0x0242:
            r25.A0C()     // Catch:{ all -> 0x0614 }
            android.view.View r0 = r3.A02     // Catch:{ all -> 0x0614 }
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            r29.A02()     // Catch:{ all -> 0x0614 }
        L_0x024d:
            r0 = r32
            int r16 = r0.A01(r2)     // Catch:{ all -> 0x0614 }
            r0 = r37
            java.lang.Boolean r0 = r0.A04     // Catch:{ all -> 0x0614 }
            r14 = r0
            X.1RJ r0 = r3.A0Q     // Catch:{ all -> 0x0614 }
            r17 = r0
            r1 = 8
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            X.1RJ r0 = r3.A0P     // Catch:{ all -> 0x0614 }
            r13 = r0
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            android.widget.TextView r11 = r3.A0A     // Catch:{ all -> 0x0614 }
            r11.setVisibility(r1)     // Catch:{ all -> 0x0614 }
            r0 = 4
            if (r12 == r0) goto L_0x0276
            r0 = 3
            if (r12 == r0) goto L_0x0276
            r1 = 5
            r0 = 0
            if (r12 != r1) goto L_0x0277
        L_0x0276:
            r0 = 1
        L_0x0277:
            r1 = -1
            if (r0 == 0) goto L_0x029e
            if (r21 > 0) goto L_0x0288
            r0 = r21
            if (r0 == r1) goto L_0x0288
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0614 }
            boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0325
        L_0x0288:
            r13.A03(r7)     // Catch:{ all -> 0x0614 }
            X.0yC r1 = r4.A0B     // Catch:{ all -> 0x0614 }
            r0 = 363(0x16b, float:5.09E-43)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0325
            if (r16 <= 0) goto L_0x0325
            r0 = r17
            r0.A03(r7)     // Catch:{ all -> 0x0614 }
            goto L_0x0325
        L_0x029e:
            if (r21 <= 0) goto L_0x02da
            X.0ts r0 = r4.A09     // Catch:{ all -> 0x0614 }
            r14 = r0
            java.text.NumberFormat r13 = r0.A0M()     // Catch:{ all -> 0x0614 }
            r0 = r21
            long r0 = (long) r0     // Catch:{ all -> 0x0614 }
            r22 = r0
            java.lang.String r0 = r13.format(r0)     // Catch:{ all -> 0x0614 }
            r11.setText(r0)     // Catch:{ all -> 0x0614 }
            java.lang.Object[] r13 = X.AnonymousClass001.A0L()     // Catch:{ all -> 0x0614 }
            r0 = r21
            X.AnonymousClass000.A1L(r13, r0, r7)     // Catch:{ all -> 0x0614 }
            r0 = 2131755392(0x7f100180, float:1.9141662E38)
            r15 = r14
            r14 = r0
            r0 = r22
            java.lang.String r0 = r15.A0L(r13, r14, r0)     // Catch:{ all -> 0x0614 }
            r11.setContentDescription(r0)     // Catch:{ all -> 0x0614 }
            X.C201679k6.A0M(r8, r11)     // Catch:{ all -> 0x0614 }
            X.0yC r0 = r4.A0B     // Catch:{ all -> 0x0614 }
            r1 = 363(0x16b, float:5.09E-43)
            boolean r0 = r0.A0E(r1)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x02f8
            if (r16 <= 0) goto L_0x02f8
            goto L_0x02f3
        L_0x02da:
            r0 = r21
            if (r0 == r1) goto L_0x02e6
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0614 }
            boolean r0 = r1.equals(r14)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0325
        L_0x02e6:
            X.C36391kE.A1K(r11)     // Catch:{ all -> 0x0614 }
            r0 = 2131890911(0x7f1212df, float:1.9416527E38)
            X.C36331k8.A0q(r8, r11, r0)     // Catch:{ all -> 0x0614 }
            X.C201679k6.A0M(r8, r11)     // Catch:{ all -> 0x0614 }
            goto L_0x02f8
        L_0x02f3:
            r0 = r17
            r0.A03(r7)     // Catch:{ all -> 0x0614 }
        L_0x02f8:
            r11.setVisibility(r7)     // Catch:{ all -> 0x0614 }
            goto L_0x0325
        L_0x02fc:
            X.1LV r1 = r4.A09     // Catch:{ all -> 0x0614 }
            r0 = r2
            X.147 r0 = (X.AnonymousClass147) r0     // Catch:{ all -> 0x0614 }
            java.util.List r0 = r1.A05(r0)     // Catch:{ all -> 0x0614 }
            X.9fy r1 = A00(r4, r0)     // Catch:{ all -> 0x0614 }
            int r0 = r1.A02     // Catch:{ all -> 0x0614 }
            r21 = r0
            A05(r1, r4)     // Catch:{ all -> 0x0614 }
        L_0x0310:
            r0 = r25
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            X.C33511fU.A03(r25)     // Catch:{ all -> 0x0614 }
            X.1RJ r13 = r3.A0W     // Catch:{ all -> 0x0614 }
            android.view.View r1 = X.C36391kE.A0L(r13, r11)     // Catch:{ all -> 0x0614 }
            android.widget.ImageView r1 = (android.widget.ImageView) r1     // Catch:{ all -> 0x0614 }
            X.0ts r0 = r4.A09     // Catch:{ all -> 0x0614 }
            X.C201679k6.A0O(r1, r0, r13)     // Catch:{ all -> 0x0614 }
        L_0x0325:
            boolean r0 = r5 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0352
            r0 = r5
            X.2bI r0 = (X.AnonymousClass2bI) r0     // Catch:{ all -> 0x0614 }
            int r1 = r0.A00     // Catch:{ all -> 0x0614 }
            r0 = 2
            if (r1 == r0) goto L_0x0334
            r0 = 3
            if (r1 != r0) goto L_0x0352
        L_0x0334:
            X.0yC r1 = r4.A0B     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = r5.A0b()     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass3M0.A01(r1, r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x03a3
            X.0wG r0 = r4.A08     // Catch:{ all -> 0x0614 }
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x0614 }
            r0 = 2131890034(0x7f120f72, float:1.9414748E38)
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x0614 }
        L_0x034d:
            r0 = r29
            r0.A07(r10, r1)     // Catch:{ all -> 0x0614 }
        L_0x0352:
            X.C18740tg.A06(r8)     // Catch:{ all -> 0x0614 }
            X.1RJ r0 = r3.A0U     // Catch:{ all -> 0x0614 }
            r1 = 8
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            r0 = r24
            r0.setVisibility(r7)     // Catch:{ all -> 0x0614 }
            X.1RJ r0 = r3.A0W     // Catch:{ all -> 0x0614 }
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            X.1RJ r0 = r3.A0X     // Catch:{ all -> 0x0614 }
            r15 = r0
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            r0 = r30
            r0.setVisibility(r1)     // Catch:{ all -> 0x0614 }
            X.1RJ r0 = r3.A0S     // Catch:{ all -> 0x0614 }
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
            r1 = 0
            r0 = r30
            r0.setBackground(r1)     // Catch:{ all -> 0x0614 }
            r0 = r37
            java.util.Set r0 = r0.A07     // Catch:{ all -> 0x0614 }
            r14 = r0
            r0 = r18
            com.whatsapp.jid.Jid r1 = r6.A06(r0)     // Catch:{ all -> 0x0614 }
            X.C18740tg.A06(r1)     // Catch:{ all -> 0x0614 }
            X.11F r1 = (X.AnonymousClass11F) r1     // Catch:{ all -> 0x0614 }
            r0 = r32
            r0.A02(r1)     // Catch:{ all -> 0x0614 }
            boolean r0 = r4.A0E(r6)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x03a8
            int r11 = r35.size()     // Catch:{ all -> 0x0614 }
            r0 = 1
            if (r11 <= r0) goto L_0x03a8
            X.C36391kE.A1K(r33)     // Catch:{ all -> 0x0614 }
            goto L_0x045c
        L_0x03a3:
            java.lang.String r1 = r5.A0b()     // Catch:{ all -> 0x0614 }
            goto L_0x034d
        L_0x03a8:
            r13 = 2
            r11 = 8
            r0 = 7
            if (r12 != r0) goto L_0x03df
            if (r14 == 0) goto L_0x03df
            r0 = r25
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            android.content.res.Resources r13 = r8.getResources()     // Catch:{ all -> 0x0614 }
            r11 = 2131755312(0x7f100130, float:1.91415E38)
            int r8 = r14.size()     // Catch:{ all -> 0x0614 }
            java.lang.Object[] r5 = X.AnonymousClass001.A0L()     // Catch:{ all -> 0x0614 }
            X.171 r1 = r4.A05     // Catch:{ all -> 0x0614 }
            java.lang.String r0 = r1.A0V(r14)     // Catch:{ all -> 0x0614 }
            r5[r7] = r0     // Catch:{ all -> 0x0614 }
            java.lang.String r15 = r13.getQuantityString(r11, r8, r5)     // Catch:{ all -> 0x0614 }
            java.util.List r16 = r31.BFy()     // Catch:{ all -> 0x0614 }
            r17 = 150(0x96, float:2.1E-43)
            r18 = 1
            r13 = r33
            r14 = r10
            r13.A0H(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0614 }
            goto L_0x045c
        L_0x03df:
            X.11F r0 = r6.A0H     // Catch:{ all -> 0x0614 }
            boolean r0 = r0 instanceof X.C177618e5     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x040e
            boolean r0 = r4.A0F(r1)     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x040e
            X.1dv r0 = r4.A08     // Catch:{ all -> 0x0614 }
            java.lang.String r10 = r0.A01(r6)     // Catch:{ all -> 0x0614 }
            if (r10 == 0) goto L_0x040e
            r5 = r25
            r1 = r24
            r0 = r30
            X.C36361kB.A15(r1, r5, r0, r11)     // Catch:{ all -> 0x0614 }
            r0 = r33
            r0.setText(r10)     // Catch:{ all -> 0x0614 }
            r5 = 2130969053(0x7f0401dd, float:1.7546777E38)
            r1 = 2131100148(0x7f0601f4, float:1.781267E38)
            X.C36321k7.A0M(r8, r0, r5, r1)     // Catch:{ all -> 0x0614 }
            X.C33511fU.A03(r33)     // Catch:{ all -> 0x0614 }
            goto L_0x045c
        L_0x040e:
            r1 = 2131101132(0x7f0605cc, float:1.7814665E38)
            r0 = r33
            X.C36331k8.A0r(r8, r0, r1)     // Catch:{ all -> 0x0614 }
            if (r5 == 0) goto L_0x0419
            goto L_0x041b
        L_0x0419:
            r13 = 0
            goto L_0x0437
        L_0x041b:
            boolean r0 = X.C66013Ui.A0n(r5)     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x0437
            int r1 = r5.A1I     // Catch:{ all -> 0x0614 }
            r0 = 19
            if (r1 == r0) goto L_0x0437
            boolean r0 = X.C66013Ui.A0L(r1)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0419
            r0 = r5
            X.4TX r0 = (X.AnonymousClass4TX) r0     // Catch:{ all -> 0x0614 }
            int r1 = r0.BJ8()     // Catch:{ all -> 0x0614 }
            r0 = 1
            if (r1 != r0) goto L_0x0419
        L_0x0437:
            r33.getContext()     // Catch:{ all -> 0x0614 }
            android.graphics.Typeface r1 = X.C33511fU.A01()     // Catch:{ all -> 0x0614 }
            r0 = r33
            r0.setTypeface(r1, r13)     // Catch:{ all -> 0x0614 }
            if (r12 != 0) goto L_0x045f
            X.11F r1 = r6.A0H     // Catch:{ all -> 0x0614 }
            if (r1 == 0) goto L_0x045f
            r0 = r32
            boolean r0 = r0.A0Q(r1)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x045f
            java.lang.String r1 = r6.A0X     // Catch:{ all -> 0x0614 }
            if (r1 != 0) goto L_0x0457
            java.lang.String r1 = ""
        L_0x0457:
            r0 = r33
            r0.A0I(r1)     // Catch:{ all -> 0x0614 }
        L_0x045c:
            r18 = 1
            goto L_0x046e
        L_0x045f:
            r18 = 0
            X.0yC r10 = r4.A0B     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass3T9.A03(r10, r5)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x047a
            r0 = r20
            r4.A0V(r6, r0, r5)     // Catch:{ all -> 0x0614 }
        L_0x046e:
            X.1RJ r1 = r3.A0M     // Catch:{ all -> 0x0614 }
            r0 = r32
            boolean r0 = r0.A0N(r2)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x05a5
            goto L_0x0590
        L_0x047a:
            java.lang.String r17 = ""
            r13 = 1
            if (r5 == 0) goto L_0x04ab
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = r5.A1T(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04ab
            boolean r0 = X.C36401kF.A1Z(r10)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04ab
            r0 = r30
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            r0 = r20
            java.lang.String r10 = r4.A0Q(r6, r0, r5)     // Catch:{ all -> 0x0614 }
            r7 = r17
            r27 = 0
        L_0x049c:
            r22 = r4
            r23 = r6
            r24 = r20
            r25 = r5
            r26 = r35
            r22.A0W(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0614 }
            goto L_0x0569
        L_0x04ab:
            boolean r0 = r6.A0G()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04dc
            X.1EL r0 = r4.A0D     // Catch:{ all -> 0x0614 }
            boolean r0 = r0.A01(r6)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04dc
            r0 = 3180(0xc6c, float:4.456E-42)
            boolean r0 = r10.A0E(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04dc
            r0 = 2131894756(0x7f1221e4, float:1.9424326E38)
            java.lang.String r10 = r8.getString(r0)     // Catch:{ all -> 0x0614 }
            r0 = 2131233221(0x7f0809c5, float:1.8082573E38)
            android.graphics.drawable.Drawable r1 = X.C165587tf.A0D(r8, r0)     // Catch:{ all -> 0x0614 }
            r0 = r30
            r0.setVisibility(r7)     // Catch:{ all -> 0x0614 }
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x0614 }
            r7 = r17
            r0 = 0
            goto L_0x0561
        L_0x04dc:
            X.1NG r10 = r4.A03     // Catch:{ all -> 0x0614 }
            X.11F r0 = r6.A0H     // Catch:{ all -> 0x0614 }
            boolean r0 = X.C36351kA.A1X(r10, r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0518
            X.0xf r7 = r4.A0C     // Catch:{ all -> 0x0614 }
            X.11F r0 = r6.A0H     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass3M3.A01(r7, r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x04fd
            r0 = 2131896083(0x7f122713, float:1.9427017E38)
            java.lang.String r10 = X.C44122Lf.A02(r8, r0)     // Catch:{ all -> 0x0614 }
        L_0x04f7:
            r0 = r24
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            goto L_0x055e
        L_0x04fd:
            boolean r0 = r6.A0E()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0507
            r7 = 2131886920(0x7f120348, float:1.9408432E38)
            goto L_0x0513
        L_0x0507:
            boolean r0 = r6.A0C()     // Catch:{ all -> 0x0614 }
            r7 = 2131886925(0x7f12034d, float:1.9408443E38)
            if (r0 == 0) goto L_0x0513
            r7 = 2131886922(0x7f12034a, float:1.9408437E38)
        L_0x0513:
            java.lang.String r10 = r8.getString(r7)     // Catch:{ all -> 0x0614 }
            goto L_0x04f7
        L_0x0518:
            if (r5 == 0) goto L_0x0557
            android.util.Pair r0 = r4.A0P(r5)     // Catch:{ all -> 0x0614 }
            java.lang.Object r10 = r0.second     // Catch:{ all -> 0x0614 }
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10     // Catch:{ all -> 0x0614 }
            X.3T1 r0 = r5.A0S()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0533
            X.3Qa r0 = r0.A1J     // Catch:{ all -> 0x0614 }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0614 }
            boolean r0 = r0 instanceof X.C177528dw     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x0533
            r15.A03(r7)     // Catch:{ all -> 0x0614 }
        L_0x0533:
            X.0wo r11 = r4.A07     // Catch:{ all -> 0x0614 }
            X.0ts r14 = r4.A09     // Catch:{ all -> 0x0614 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0614 }
            long r15 = r11.A08(r0)     // Catch:{ all -> 0x0614 }
            r0 = r15
            java.lang.String r17 = X.AnonymousClass3UY.A0F(r14, r0, r7)     // Catch:{ all -> 0x0614 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0614 }
            long r15 = r11.A08(r0)     // Catch:{ all -> 0x0614 }
            r0 = r15
            java.lang.String r7 = X.AnonymousClass3UY.A0F(r14, r0, r13)     // Catch:{ all -> 0x0614 }
            android.graphics.drawable.Drawable r1 = X.AnonymousClass3T9.A00(r8, r11, r5)     // Catch:{ all -> 0x0614 }
            r0 = r24
            r0.setImageDrawable(r1)     // Catch:{ all -> 0x0614 }
            goto L_0x0560
        L_0x0557:
            r0 = r24
            r0.setVisibility(r11)     // Catch:{ all -> 0x0614 }
            r10 = r17
        L_0x055e:
            r7 = r17
        L_0x0560:
            r0 = 1
        L_0x0561:
            r27 = 1
            if (r0 != 0) goto L_0x049c
            r20 = 0
            goto L_0x049c
        L_0x0569:
            if (r5 == 0) goto L_0x056c
            goto L_0x056e
        L_0x056c:
            r13 = 0
            goto L_0x0573
        L_0x056e:
            int r1 = r5.A0D     // Catch:{ all -> 0x0614 }
            r0 = 6
            if (r1 == r0) goto L_0x056c
        L_0x0573:
            r4.A0C(r10, r13)     // Catch:{ all -> 0x0614 }
            r1 = r29
            r0 = r17
            r1.A09(r0, r7)     // Catch:{ all -> 0x0614 }
            X.6C3 r0 = r4.A00     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x046e
            android.graphics.drawable.Drawable r0 = r30.getDrawable()     // Catch:{ all -> 0x0614 }
            boolean r0 = r0 instanceof X.AnonymousClass0BQ     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x046e
            X.6C3 r0 = r4.A00     // Catch:{ all -> 0x0614 }
            r0.A02()     // Catch:{ all -> 0x0614 }
            goto L_0x046e
        L_0x0590:
            if (r12 == 0) goto L_0x05a3
            r0 = 6
            if (r12 == r0) goto L_0x05a3
            r0 = 5
            if (r12 == r0) goto L_0x05a3
            r0 = 4
            if (r12 == r0) goto L_0x05a3
            X.0v0 r0 = r4.A0E     // Catch:{ all -> 0x0614 }
            boolean r0 = r0.A2F()     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x05a5
        L_0x05a3:
            r0 = 0
            goto L_0x05a7
        L_0x05a5:
            r0 = 8
        L_0x05a7:
            r1.A03(r0)     // Catch:{ all -> 0x0614 }
            X.0yC r1 = r4.A0B     // Catch:{ all -> 0x0614 }
            X.11F r0 = r6.A0H     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass3RR.A00(r1, r0)     // Catch:{ all -> 0x0614 }
            if (r0 != 0) goto L_0x05c5
            boolean r0 = r6.A0N()     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x05c3
            r0 = 3961(0xf79, float:5.55E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x05c3
            goto L_0x05c5
        L_0x05c3:
            r1 = 0
            goto L_0x05c6
        L_0x05c5:
            r1 = 1
        L_0x05c6:
            r0 = r28
            r0.A0B(r6)     // Catch:{ all -> 0x0614 }
            if (r1 == 0) goto L_0x05d1
            r1 = 1
            r0.A03(r1)     // Catch:{ all -> 0x0614 }
        L_0x05d1:
            r0 = r21
            A07(r4, r0)     // Catch:{ all -> 0x0614 }
            X.16D r1 = r4.A04     // Catch:{ all -> 0x0614 }
            r0 = r32
            int r1 = X.AnonymousClass3TD.A00(r1, r0, r2)     // Catch:{ all -> 0x0614 }
            boolean r0 = X.AnonymousClass000.A1R(r1)
            r3.A0I(r0, r1)     // Catch:{ all -> 0x0614 }
            boolean r0 = r9 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto     // Catch:{ all -> 0x0614 }
            if (r0 == 0) goto L_0x05ff
            r0 = r37
            X.3Ed r0 = r0.A03     // Catch:{ all -> 0x0614 }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r9 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r9     // Catch:{ all -> 0x0614 }
            r4.A0B(r0, r9)     // Catch:{ all -> 0x0614 }
            X.3Ed r0 = r4.A05     // Catch:{ all -> 0x0614 }
            com.whatsapp.jid.UserJid r7 = X.C36401kF.A0b(r2)     // Catch:{ all -> 0x0614 }
            r5 = r4
            r8 = r0
            r10 = r34
            r5.A0A(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0614 }
        L_0x05ff:
            android.view.View r1 = r3.A02     // Catch:{ all -> 0x0614 }
            boolean r0 = r4.A0O     // Catch:{ all -> 0x0614 }
            int r0 = X.C36381kD.A00(r0)
            r1.setVisibility(r0)     // Catch:{ all -> 0x0614 }
            if (r39 == 0) goto L_0x0613
            r1 = r19
            r0 = r36
            r1.Bfd(r0)
        L_0x0613:
            return r18
        L_0x0614:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0616 }
        L_0x0616:
            r2 = move-exception
            if (r39 == 0) goto L_0x0620
            r1 = r19
            r0 = r36
            r1.Bfd(r0)
        L_0x0620:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A0D(X.9Ns, X.8a4, X.1gd, int):boolean");
    }

    private boolean A0E(AnonymousClass141 r5) {
        if (this.A07 != 1) {
            return false;
        }
        if (this.A0A.A05(C36441kJ.A0l(r5.A0H)) == 1) {
            return true;
        }
        return false;
    }

    public void A0S(AnonymousClass9XF r3) {
        AnonymousClass141 r1 = r3.A03;
        if (A0E(r1)) {
            A0X(this.A05.A0H(r1), false);
        } else {
            super.A0S(r3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.8a9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.8a8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.8a9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: X.8a9} */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r7 == 6) goto L_0x0011;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0T(X.AnonymousClass7gQ r10, X.C34211gd r11, int r12, boolean r13) {
        /*
            r9 = this;
            X.5Jv r10 = (X.C106475Jv) r10
            int r7 = r9.A07
            r0 = 4
            if (r7 == r0) goto L_0x0011
            r0 = 3
            if (r7 == r0) goto L_0x0011
            r0 = 5
            if (r7 == r0) goto L_0x0011
            r0 = 6
            r1 = 0
            if (r7 != r0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            if (r1 != 0) goto L_0x0017
            r0 = 1
            if (r7 != r0) goto L_0x004d
        L_0x0017:
            com.whatsapp.conversationslist.ViewHolder r6 = r9.A06
            android.widget.ImageView r5 = r6.A07
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165915(0x7f0702db, float:1.794606E38)
            if (r1 == 0) goto L_0x0027
            r0 = 2131165806(0x7f07026e, float:1.794584E38)
        L_0x0027:
            int r3 = r4.getDimensionPixelSize(r0)
            r2 = 4
            r0 = 2131165946(0x7f0702fa, float:1.7946123E38)
            if (r7 != r2) goto L_0x0034
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
        L_0x0034:
            int r1 = r4.getDimensionPixelSize(r0)
            r0 = 2131165921(0x7f0702e1, float:1.7946073E38)
            if (r7 != r2) goto L_0x0040
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
        L_0x0040:
            X.5TY r1 = X.C201679k6.A0K(r4, r6, r0, r1, r3)
            boolean r0 = r5 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0164
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r5 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r5
            r5.setProfilePhotoSize(r1)
        L_0x004d:
            X.11F r3 = r10.BDC()
            boolean r0 = r10 instanceof X.C106465Ju
            if (r0 == 0) goto L_0x0161
            r0 = r10
            X.5Ju r0 = (X.C106465Ju) r0
            java.util.Set r2 = r0.A01
        L_0x005a:
            X.9Hb r0 = r9.A02(r3, r2)
            if (r0 == 0) goto L_0x00a4
            X.9Ns r2 = r0.A01
            boolean r1 = A0D(r2, r9, r11, r12)
            X.9K0 r0 = r0.A00
            A06(r0, r2, r9, r1)
        L_0x006b:
            r9.A04 = r10
            com.whatsapp.jid.GroupJid r5 = X.C36441kJ.A0l(r3)
            X.0yC r1 = r9.A0B
            r0 = 6120(0x17e8, float:8.576E-42)
            int r1 = r1.A07(r0)
            r0 = 1
            if (r1 < r0) goto L_0x017b
            X.005 r0 = r9.A0I
            java.lang.Object r6 = r0.get()
            X.6X4 r6 = (X.AnonymousClass6X4) r6
            if (r5 == 0) goto L_0x00a3
            X.3T1 r0 = r6.A06(r3)
            if (r0 != 0) goto L_0x00a3
            X.1HO r0 = r9.A0G
            X.5Ng r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0169
            X.1HJ r2 = r9.A0F
            long r0 = r0.A02()
            X.5Nh r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0169
            r6.A09(r5, r0)
        L_0x00a3:
            return
        L_0x00a4:
            if (r13 == 0) goto L_0x00ca
            X.8aA r0 = new X.8aA
            r0.<init>(r9, r3, r2)
            r9.A03 = r0
            java.lang.Object r6 = r0.call()     // Catch:{ all -> 0x01ac }
            X.9Ns r6 = (X.C193999Ns) r6     // Catch:{ all -> 0x01ac }
            if (r6 == 0) goto L_0x006b
            boolean r5 = A0D(r6, r9, r11, r12)
            X.3T1 r0 = r6.A02
            X.8a8 r4 = new X.8a8
            r4.<init>(r9, r3, r0)
            r9.A00 = r4
            X.1f4 r2 = r9.A0C
            X.AA1 r1 = new X.AA1
            r1.<init>(r6, r9, r5)
            goto L_0x00f3
        L_0x00ca:
            X.0yC r1 = r9.A0B
            r0 = 7888(0x1ed0, float:1.1053E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x00fe
            r0 = 7887(0x1ecf, float:1.1052E-41)
            boolean r1 = r1.A0E(r0)
            X.5Jv r0 = r9.A04
            if (r1 == 0) goto L_0x00f8
            boolean r0 = X.C132056Ry.A01(r10, r0)
            if (r0 == 0) goto L_0x00fe
        L_0x00e4:
            X.8a9 r4 = new X.8a9
            r4.<init>(r9, r3, r2)
            r9.A01 = r4
            X.1f4 r2 = r9.A0C
            r0 = 2
            X.B8g r1 = new X.B8g
            r1.<init>(r9, r12, r0, r11)
        L_0x00f3:
            r2.A00(r1, r4)
            goto L_0x006b
        L_0x00f8:
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto L_0x00e4
        L_0x00fe:
            android.content.Context r5 = r9.A01
            X.C18740tg.A06(r5)
            com.whatsapp.conversationslist.ViewHolder r4 = r9.A06
            android.view.View r0 = r4.A04
            r6 = 0
            r0.setPadding(r6, r6, r6, r6)
            android.widget.ImageView r8 = r4.A07
            r8.setEnabled(r6)
            android.view.View r7 = r4.A03
            r0 = 0
            r7.setOnClickListener(r0)
            r8.setOnClickListener(r0)
            r7.setOnLongClickListener(r0)
            r8.setOnLongClickListener(r0)
            r0 = 2131231707(0x7f0803db, float:1.8079503E38)
            r8.setImageResource(r0)
            X.1Pp r1 = r9.A0A
            X.11F r0 = r10.BDC()
            int r0 = X.AnonymousClass1Pp.A00(r1, r0, r6)
            r1.A06(r8, r0)
            r7.setVisibility(r6)
            com.whatsapp.TextEmojiLabel r0 = r4.A0E
            X.C201679k6.A0N(r0, r4)
            X.9gu r0 = r4.A0G
            r0.A05()
            com.whatsapp.TextEmojiLabel r1 = r4.A0D
            r1.setVisibility(r6)
            r0 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r5, r1, r0)
            r1.A0C()
            X.C36391kE.A1K(r1)
            r0 = 80
            r1.setPlaceholder(r0)
            android.view.View r1 = r4.A02
            boolean r0 = r9.A0O
            int r0 = X.C36381kD.A00(r0)
            r1.setVisibility(r0)
            goto L_0x00e4
        L_0x0161:
            r2 = 0
            goto L_0x005a
        L_0x0164:
            X.C34081gQ.A05(r5, r3, r3)
            goto L_0x004d
        L_0x0169:
            com.whatsapp.jid.GroupJid r3 = (com.whatsapp.jid.GroupJid) r3
            X.8a6 r4 = new X.8a6
            r4.<init>(r9, r3)
            r9.A02 = r4
            X.1f4 r2 = r9.A0C
            r0 = 3
            X.B8i r1 = new X.B8i
            r1.<init>(r6, r5, r0)
            goto L_0x01a8
        L_0x017b:
            r0 = 0
            if (r5 == 0) goto L_0x0192
            X.1HO r0 = r9.A0G
            X.5Ng r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0196
            X.1HJ r2 = r9.A0F
            long r0 = r0.A02()
            X.5Nh r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x0196
        L_0x0192:
            A08(r9, r3, r0)
            return
        L_0x0196:
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            X.8a6 r4 = new X.8a6
            r4.<init>(r9, r0)
            r9.A02 = r4
            X.1f4 r2 = r9.A0C
            r0 = 2
            X.B8i r1 = new X.B8i
            r1.<init>(r9, r3, r0)
        L_0x01a8:
            r2.A00(r1, r4)
            return
        L_0x01ac:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.A0T(X.7gQ, X.1gd, int, boolean):void");
    }

    public static C199789fy A00(C175238a4 r12, List list) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
            C220412q r6 = r12.A0A;
            C65073Qp A0W2 = C36371kC.A0W(r6, groupJid);
            if (A0W2 != null) {
                long j = (long) A0W2.A08;
                if (j > 0) {
                    i3++;
                    i = (int) (((long) i) + j);
                }
            }
            i2 += r6.A01(groupJid);
        }
        return new C199789fy(i, i2, i3);
    }

    public static void A04(View view, AnonymousClass11F r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("com.whatsapp.conversationslist.ConversationsFragment");
        C011004s.A08(view, AnonymousClass000.A0q(AnonymousClass143.A03(r3), A0u));
    }

    private boolean A0F(AnonymousClass11F r4) {
        if (C201679k6.A0J(this, r4) == null || this.A0B.A07(6120) < 1) {
            return false;
        }
        return true;
    }

    public void A0R() {
        super.A0R();
        C175298aA r0 = this.A03;
        if (r0 != null) {
            r0.A00.A03();
            this.A03 = null;
        }
        C175278a8 r02 = this.A00;
        if (r02 != null) {
            r02.A00.A03();
            this.A00 = null;
        }
        C175288a9 r03 = this.A01;
        if (r03 != null) {
            r03.A00.A03();
            this.A01 = null;
        }
        C175258a6 r04 = this.A02;
        if (r04 != null) {
            r04.A00.A03();
            this.A02 = null;
        }
        C183468qq r1 = this.A06;
        if (r1 != null) {
            r1.A0D(true);
            this.A01 = null;
        }
    }

    public void A0W(AnonymousClass141 r6, AnonymousClass141 r7, AnonymousClass3T1 r8, List list, boolean z) {
        String A0D2;
        if (!A0E(r6)) {
            super.A0W(r6, r7, r8, list, z);
            return;
        }
        ArrayList A0I2 = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
            C220412q r1 = this.A0A;
            if (r1.A0O(groupJid)) {
                A0D2 = this.A08.A01(R.string.f12nameremoved);
            } else if (r1.A0D(groupJid) != null) {
                A0D2 = r1.A0D(groupJid);
            }
            A0I2.add(A0D2);
        }
        C18820ts r3 = this.A09;
        String A002 = C55782vB.A00(r3, A0I2, false);
        super.A0X(A002, false);
        if (!TextUtils.isEmpty(A002) && A0I2.size() == 1) {
            AnonymousClass1RJ r12 = this.A06.A0W;
            C201679k6.A0O((ImageView) C36391kE.A0L(r12, 0), r3, r12);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175238a4(android.content.Context r29, X.C19460v5 r30, X.C32621dv r31, X.AnonymousClass17Y r32, X.C19730wQ r33, X.AnonymousClass1T1 r34, X.AnonymousClass1NG r35, X.AnonymousClass1HX r36, X.AnonymousClass1LV r37, X.AnonymousClass1Pp r38, X.AnonymousClass16D r39, X.AnonymousClass171 r40, X.AnonymousClass1RY r41, X.C33301f4 r42, X.C28251Rx r43, com.whatsapp.conversationslist.ViewHolder r44, X.C21060yb r45, X.C19970wo r46, X.C19630wG r47, X.C19420v0 r48, X.C18820ts r49, X.AnonymousClass1HJ r50, X.C220712t r51, X.C220412q r52, X.AnonymousClass165 r53, X.AnonymousClass1HO r54, X.C24541Cv r55, X.C26171Jd r56, X.AnonymousClass1LU r57, X.C20810yC r58, X.C20500xf r59, X.AnonymousClass1EL r60, X.C32931eR r61, X.C32831eG r62, X.C28371Sj r63, X.AnonymousClass1EV r64, X.AnonymousClass1EU r65, X.AnonymousClass1FR r66, X.AnonymousClass1AW r67, X.AnonymousClass1CR r68, X.C61953Ed r69, X.AnonymousClass1EM r70, X.C65783Tl r71, X.C19770wU r72, X.AnonymousClass005 r73, int r74, boolean r75) {
        /*
            r28 = this;
            r2 = r28
            r16 = r53
            r15 = r52
            r14 = r49
            r13 = r47
            r12 = r46
            r11 = r45
            r10 = r44
            r9 = r43
            r3 = r29
            r20 = r63
            r5 = r34
            r21 = r64
            r6 = r35
            r22 = r65
            r23 = r66
            r24 = r67
            r7 = r39
            r8 = r40
            r25 = r70
            r26 = r71
            r27 = r73
            r4 = r33
            r19 = r60
            r18 = r59
            r17 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.5TT r1 = X.AnonymousClass5TT.VIDEO
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0K = r0
            X.5TT r1 = X.AnonymousClass5TT.VOICE
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0L = r0
            X.5TT r1 = X.AnonymousClass5TT.VOICE_CHAT
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0M = r0
            r1 = 7
            X.3wU r0 = new X.3wU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.A0N = r0
            r0 = r74
            r2.A07 = r0
            r0 = r32
            r2.A0Q = r0
            r0 = r72
            r2.A0W = r0
            r0 = r36
            r2.A0R = r0
            r0 = r69
            r2.A05 = r0
            r0 = r51
            r2.A0S = r0
            r0 = r75
            r2.A0O = r0
            r0 = r38
            r2.A0A = r0
            r0 = r31
            r2.A08 = r0
            r0 = r55
            r2.A0H = r0
            r0 = r50
            r2.A0F = r0
            r0 = r68
            r2.A0V = r0
            r0 = r62
            r2.A0J = r0
            r0 = r41
            r2.A0B = r0
            r0 = r56
            r2.A0T = r0
            r0 = r57
            r2.A0U = r0
            r0 = r48
            r2.A0E = r0
            r0 = r37
            r2.A09 = r0
            r0 = r54
            r2.A0G = r0
            r0 = r42
            r2.A0C = r0
            r0 = r61
            r2.A0I = r0
            r0 = r30
            r2.A0P = r0
            r2.A0D = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175238a4.<init>(android.content.Context, X.0v5, X.1dv, X.17Y, X.0wQ, X.1T1, X.1NG, X.1HX, X.1LV, X.1Pp, X.16D, X.171, X.1RY, X.1f4, X.1Rx, com.whatsapp.conversationslist.ViewHolder, X.0yb, X.0wo, X.0wG, X.0v0, X.0ts, X.1HJ, X.12t, X.12q, X.165, X.1HO, X.1Cv, X.1Jd, X.1LU, X.0yC, X.0xf, X.1EL, X.1eR, X.1eG, X.1Sj, X.1EV, X.1EU, X.1FR, X.1AW, X.1CR, X.3Ed, X.1EM, X.3Tl, X.0wU, X.005, int, boolean):void");
    }
}
