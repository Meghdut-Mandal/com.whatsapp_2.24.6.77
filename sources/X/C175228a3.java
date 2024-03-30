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
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.8a3  reason: invalid class name and case insensitive filesystem */
public class C175228a3 extends C201679k6 implements AnonymousClass4Q8 {
    public C175248a5 A00;
    public C175318aC A01;
    public C175318aC A02;
    public C61953Ed A03;
    public C183458qp A04;
    public final int A05;
    public final C19460v5 A06;
    public final AnonymousClass1HX A07;
    public final AnonymousClass1LV A08;
    public final AnonymousClass1Pp A09;
    public final AnonymousClass1RY A0A;
    public final C33301f4 A0B;
    public final C28251Rx A0C;
    public final AnonymousClass1HJ A0D;
    public final AnonymousClass1HO A0E;
    public final C24541Cv A0F;
    public final C26171Jd A0G;
    public final AnonymousClass1LU A0H;
    public final C32931eR A0I;
    public final C32831eG A0J;
    public final AnonymousClass1CR A0K;
    public final C19770wU A0L;
    public final AnonymousClass6K4 A0M = new AnonymousClass5QI(AnonymousClass5TT.VIDEO);
    public final AnonymousClass6K4 A0N = new AnonymousClass5QI(AnonymousClass5TT.VOICE);
    public final AnonymousClass6K4 A0O = new AnonymousClass5QI(AnonymousClass5TT.VOICE_CHAT);
    public final Runnable A0P = new C81113wU((Object) this, 6);
    public final C32621dv A0Q;
    public final AnonymousClass17Y A0R;
    public final C19420v0 A0S;
    public final C220712t A0T;

    public void Bx0(UserJid userJid, C61953Ed r9) {
        AnonymousClass141 r2;
        C61953Ed r4 = r9;
        this.A03 = r9;
        ImageView imageView = this.A06.A07;
        if (imageView instanceof WDSProfilePhoto) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView;
            A08(r9, wDSProfilePhoto);
            String str = null;
            UserJid userJid2 = userJid;
            AnonymousClass9OK A012 = A01(userJid, (Set) null);
            if (A012 != null) {
                r2 = A012.A00;
                str = A012.A08;
            } else {
                r2 = null;
            }
            A07(r2, userJid2, r4, wDSProfilePhoto, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        if (r2 != null) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass9OK A01(X.AnonymousClass11F r26, java.util.Set r27) {
        /*
            r25 = this;
            r9 = r26
            r4 = r25
            X.16D r8 = r4.A04
            X.141 r14 = r8.A07(r9)
            r13 = 0
            r5 = r27
            if (r27 == 0) goto L_0x0114
            java.util.HashSet r24 = r8.A0M(r5)
        L_0x0013:
            X.1CR r0 = r4.A0K
            X.3LI r19 = r0.A0S(r9)
            com.whatsapp.jid.GroupJid r1 = X.C36441kJ.A0l(r9)
            boolean r0 = A09(r4, r9)
            r3 = 0
            r7 = 1
            if (r0 == 0) goto L_0x009f
            X.3T1 r2 = X.C201679k6.A0J(r4, r9)
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            r6 = r13
            if (r2 == 0) goto L_0x0111
        L_0x0030:
            if (r14 == 0) goto L_0x0111
            X.0wQ r9 = r4.A02
            X.1HX r0 = r4.A07
            X.11F r0 = X.AnonymousClass3TZ.A00(r9, r0, r14, r2)
        L_0x003a:
            if (r6 == 0) goto L_0x009d
            X.2bM r9 = r6.A01
            X.11F r9 = r9.A0J()
            if (r9 == 0) goto L_0x009d
            X.141 r15 = r8.A07(r9)
        L_0x0048:
            if (r0 == 0) goto L_0x009a
            X.141 r16 = r8.A07(r0)
        L_0x004e:
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r7)
            if (r6 == 0) goto L_0x0067
            X.2bM r7 = r6.A01
            X.3Qa r8 = r7.A1J
            X.11F r7 = r8.A00
            boolean r7 = X.AnonymousClass143.A0G(r7)
            if (r7 == 0) goto L_0x0067
            boolean r7 = r8.A02
            if (r7 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            r3 = 1
        L_0x0067:
            if (r14 == 0) goto L_0x007d
            X.171 r7 = r4.A05
            java.lang.String r22 = r7.A0I(r14)
            if (r2 == 0) goto L_0x007d
            if (r19 == 0) goto L_0x007d
            if (r16 != 0) goto L_0x0077
            if (r0 != 0) goto L_0x007d
        L_0x0077:
            if (r3 != 0) goto L_0x007d
            if (r27 != 0) goto L_0x007e
            if (r24 == 0) goto L_0x008a
        L_0x007d:
            return r13
        L_0x007e:
            if (r24 == 0) goto L_0x007d
            int r3 = r5.size()
            int r0 = r24.size()
            if (r3 != r0) goto L_0x007d
        L_0x008a:
            X.3Ed r0 = r4.A03
            X.9OK r13 = new X.9OK
            r20 = r0
            r23 = r1
            r18 = r6
            r17 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r13
        L_0x009a:
            r16 = r13
            goto L_0x004e
        L_0x009d:
            r15 = r13
            goto L_0x0048
        L_0x009f:
            X.12q r6 = r4.A0A
            int r0 = r6.A05(r1)
            if (r0 != r7) goto L_0x00e0
            X.1LV r0 = r4.A08
            X.147 r9 = (X.AnonymousClass147) r9
            java.util.List r1 = X.C165597tg.A0r(r0, r9)
            int r0 = r1.size()
            if (r0 != r7) goto L_0x010f
            java.lang.Object r0 = r1.get(r3)
            X.3QK r0 = (X.AnonymousClass3QK) r0
            if (r0 == 0) goto L_0x00de
            com.whatsapp.jid.GroupJid r2 = r0.A02
            if (r2 == 0) goto L_0x00de
            boolean r0 = A09(r4, r2)
            if (r0 == 0) goto L_0x00d9
            X.3T1 r2 = X.C201679k6.A0J(r4, r2)
        L_0x00cb:
            if (r2 == 0) goto L_0x0110
            X.1Jd r6 = r4.A0G
            X.3Qa r0 = r2.A1J
            X.11F r0 = r0.A00
            X.35M r6 = r6.A0C(r0)
            goto L_0x0030
        L_0x00d9:
            X.3T1 r2 = r6.A0C(r2)
            goto L_0x00cb
        L_0x00de:
            r2 = 0
            goto L_0x0110
        L_0x00e0:
            X.3T1 r2 = r6.A0C(r9)
            java.util.ArrayList r1 = X.AnonymousClass001.A0I()
            X.1Jd r0 = r4.A0G
            X.35M r6 = r0.A0C(r9)
            if (r2 == 0) goto L_0x0111
            X.0wo r9 = r4.A07
            java.lang.Long r0 = r2.A0g
            if (r0 == 0) goto L_0x0030
            long r11 = r0.longValue()
            long r9 = X.C19970wo.A00(r9)
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0030
            int r0 = r2.A0E()
            if (r0 == r7) goto L_0x0030
            X.12t r0 = r4.A0T
            r0.A09(r2)
            goto L_0x0030
        L_0x010f:
            r2 = r13
        L_0x0110:
            r6 = r13
        L_0x0111:
            r0 = r13
            goto L_0x003a
        L_0x0114:
            r24 = r13
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175228a3.A01(X.11F, java.util.Set):X.9OK");
    }

    public static void A03(C199789fy r11, C175228a3 r12) {
        int i = r11.A02;
        int i2 = r11.A01;
        int i3 = r11.A00;
        ViewHolder viewHolder = r12.A06;
        C200229gu r8 = viewHolder.A0G;
        ConversationListRowHeaderView conversationListRowHeaderView = r8.A03;
        conversationListRowHeaderView.A01.setVisibility(8);
        C33511fU.A03(viewHolder.A0E);
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

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03b5, code lost:
        if (r2 != 5) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007f, code lost:
        if (r2 == 6) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0529, code lost:
        if (r21 != false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x052d, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x054c, code lost:
        if (r39.A05((X.AnonymousClass147) r3) != 3) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0551, code lost:
        if (r13 != false) goto L_0x0553;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d5, code lost:
        if (r2 == 10) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0678, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0679, code lost:
        if (r47 != null) goto L_0x067b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x067b, code lost:
        r16.Bfd(r46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0682, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a7, code lost:
        if (r4.A0V.A09() != false) goto L_0x01a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0360 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0486 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x049b A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x050b A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0527 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0538 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x053d A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0564 A[ADDED_TO_REGION, Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x059f A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x05cd A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0617 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x063d A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0665 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x066e  */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0198 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01d0 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01d8 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01e6 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x026f A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02a7 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0309 A[Catch:{ all -> 0x0678 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0322 A[Catch:{ all -> 0x0678 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass9OK r45, X.C175228a3 r46, X.C34211gd r47, int r48) {
        /*
            r11 = r45
            X.141 r7 = r11.A00
            X.141 r0 = r11.A02
            r45 = r0
            X.35M r0 = r11.A04
            r44 = r0
            X.141 r0 = r11.A01
            r43 = r0
            X.3T1 r0 = r11.A03
            r19 = r0
            java.util.List r0 = r11.A09
            r42 = r0
            X.3LI r0 = r11.A05
            boolean r21 = r0.A0A()
            boolean r0 = r0.A0I
            r20 = r0
            java.lang.String r0 = r11.A08
            r17 = r0
            java.util.Set r0 = r11.A0A
            r22 = r0
            r5 = r46
            android.content.Context r0 = r5.A01
            r41 = r0
            X.C18740tg.A06(r41)
            r16 = r47
            r46 = r48
            com.whatsapp.conversationslist.ViewHolder r4 = r5.A06     // Catch:{ all -> 0x0676 }
            android.view.View r0 = r4.A04     // Catch:{ all -> 0x0676 }
            r27 = r0
            r12 = 0
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            com.whatsapp.TextEmojiLabel r0 = r4.A0D     // Catch:{ all -> 0x0676 }
            r40 = r0
            r0.setPlaceholder(r12)     // Catch:{ all -> 0x0676 }
            X.11F r3 = X.C36351kA.A0j(r7)     // Catch:{ all -> 0x0676 }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x0676 }
            X.147 r10 = X.C65533Sl.A01(r3)     // Catch:{ all -> 0x0676 }
            X.12q r0 = r5.A0A     // Catch:{ all -> 0x0676 }
            r39 = r0
            int r9 = r0.A05(r10)     // Catch:{ all -> 0x0676 }
            r14 = 1
            r0 = 3
            boolean r13 = X.AnonymousClass000.A1S(r9, r0)
            android.widget.ImageView r6 = r4.A07     // Catch:{ all -> 0x0676 }
            boolean r0 = r6 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto     // Catch:{ all -> 0x0676 }
            r18 = r0
            if (r0 == 0) goto L_0x0071
            r1 = r6
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x0676 }
            X.5Tv r0 = X.C108525Tv.CIRCLE     // Catch:{ all -> 0x0676 }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x0676 }
        L_0x0071:
            int r2 = r5.A05     // Catch:{ all -> 0x0676 }
            r0 = 4
            if (r2 == r0) goto L_0x0081
            r0 = 3
            if (r2 == r0) goto L_0x0081
            r0 = 5
            if (r2 == r0) goto L_0x0081
            r0 = 6
            r25 = 0
            if (r2 != r0) goto L_0x0083
        L_0x0081:
            r25 = 1
        L_0x0083:
            if (r25 != 0) goto L_0x00d7
            if (r2 != r14) goto L_0x0089
            if (r20 == 0) goto L_0x00d7
        L_0x0089:
            X.1LV r0 = r5.A08     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.A0K(r10, r9)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x00cf
            X.1RJ r13 = r4.A0Y     // Catch:{ all -> 0x0676 }
            android.view.View r10 = r13.A01()     // Catch:{ all -> 0x0676 }
            com.whatsapp.community.SubgroupWithParentView r10 = (com.whatsapp.community.SubgroupWithParentView) r10     // Catch:{ all -> 0x0676 }
            X.1RY r0 = r5.A0A     // Catch:{ all -> 0x0676 }
            r10.setSubgroupProfilePhoto(r7, r9, r0)     // Catch:{ all -> 0x0676 }
            X.11F r1 = r7.A0H     // Catch:{ all -> 0x0676 }
            android.view.View r0 = r10.getTransitionView()     // Catch:{ all -> 0x0676 }
            A02(r0, r1)     // Catch:{ all -> 0x0676 }
            X.0wG r8 = r5.A08     // Catch:{ all -> 0x0676 }
            r1 = 2131886229(0x7f120095, float:1.940703E38)
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ all -> 0x0676 }
            X.171 r0 = r5.A05     // Catch:{ all -> 0x0676 }
            X.C36361kB.A1F(r0, r7, r14, r12)     // Catch:{ all -> 0x0676 }
            java.lang.String r0 = r8.A02(r1, r14)     // Catch:{ all -> 0x0676 }
            r10.setContentDescription(r0)     // Catch:{ all -> 0x0676 }
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            X.C33521fV.A03(r10, r0)     // Catch:{ all -> 0x0676 }
            r0 = 8
            r6.setVisibility(r0)     // Catch:{ all -> 0x0676 }
            r13.A03(r12)     // Catch:{ all -> 0x0676 }
            X.1RJ r1 = r4.A0O     // Catch:{ all -> 0x0676 }
            r1.A03(r0)     // Catch:{ all -> 0x0676 }
            goto L_0x0193
        L_0x00cf:
            if (r2 == r14) goto L_0x00d7
            r0 = 10
            r24 = 0
            if (r2 != r0) goto L_0x00d9
        L_0x00d7:
            r24 = 1
        L_0x00d9:
            r8 = 8
            r6.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            X.1RJ r1 = r4.A0Y     // Catch:{ all -> 0x0676 }
            r1.A03(r8)     // Catch:{ all -> 0x0676 }
            X.1RJ r0 = r4.A0O     // Catch:{ all -> 0x0676 }
            r0.A03(r8)     // Catch:{ all -> 0x0676 }
            if (r13 == 0) goto L_0x0137
            if (r18 == 0) goto L_0x00f4
            r1 = r6
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x0676 }
            X.5Tv r0 = X.C108525Tv.SQUIRCLE     // Catch:{ all -> 0x0676 }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x0676 }
        L_0x00f4:
            X.1RY r0 = r5.A0A     // Catch:{ all -> 0x0676 }
            r0.A03(r6)     // Catch:{ all -> 0x0676 }
            android.content.res.Resources r13 = r6.getResources()     // Catch:{ all -> 0x0676 }
            if (r24 == 0) goto L_0x010a
            boolean r0 = X.C222013h.A05     // Catch:{ all -> 0x0676 }
            r23 = 2131231030(0x7f080136, float:1.807813E38)
            if (r0 == 0) goto L_0x010d
            r23 = 2131231031(0x7f080137, float:1.8078132E38)
            goto L_0x010d
        L_0x010a:
            r23 = 2131233988(0x7f080cc4, float:1.808413E38)
        L_0x010d:
            android.content.res.Resources$Theme r8 = X.C36361kB.A09(r6)     // Catch:{ all -> 0x0676 }
            X.3c1 r1 = X.C68513c1.A00     // Catch:{ all -> 0x0676 }
            X.0yC r0 = r5.A0B     // Catch:{ all -> 0x0676 }
            r15 = r13
            r13 = r8
            r8 = r1
            r1 = r0
            r0 = r23
            android.graphics.drawable.Drawable r0 = X.C27751Pr.A00(r13, r15, r8, r1, r0)     // Catch:{ all -> 0x0676 }
            r6.setImageDrawable(r0)     // Catch:{ all -> 0x0676 }
            if (r2 == r14) goto L_0x0177
            r0 = 10
            if (r2 == r0) goto L_0x0177
            if (r24 != 0) goto L_0x0177
            if (r10 == 0) goto L_0x0177
            X.0wU r1 = r5.A0L     // Catch:{ all -> 0x0676 }
            X.B7W r0 = new X.B7W     // Catch:{ all -> 0x0676 }
            r0.<init>(r10, r5, r12)     // Catch:{ all -> 0x0676 }
            X.C36391kE.A1Q(r0, r1)     // Catch:{ all -> 0x0676 }
            goto L_0x0177
        L_0x0137:
            if (r9 != r14) goto L_0x013a
            goto L_0x0155
        L_0x013a:
            r6.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            r1.A03(r8)     // Catch:{ all -> 0x0676 }
            r0.A03(r8)     // Catch:{ all -> 0x0676 }
            if (r9 != r14) goto L_0x014f
            if (r18 == 0) goto L_0x014f
            r1 = r6
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r1 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r1     // Catch:{ all -> 0x0676 }
            X.5Tv r0 = X.C108525Tv.SQUIRCLE     // Catch:{ all -> 0x0676 }
            r1.setProfilePhotoShape(r0)     // Catch:{ all -> 0x0676 }
        L_0x014f:
            X.1RY r0 = r5.A0A     // Catch:{ all -> 0x0676 }
            r0.A08(r6, r7)     // Catch:{ all -> 0x0676 }
            goto L_0x0177
        L_0x0155:
            r6.setVisibility(r8)     // Catch:{ all -> 0x0676 }
            r1.A03(r8)     // Catch:{ all -> 0x0676 }
            android.view.View r10 = X.C36391kE.A0L(r0, r12)     // Catch:{ all -> 0x0676 }
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10     // Catch:{ all -> 0x0676 }
            boolean r0 = r10 instanceof com.whatsapp.community.CommunityStackView     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x01de
            r8 = r10
            com.whatsapp.community.CommunityStackView r8 = (com.whatsapp.community.CommunityStackView) r8     // Catch:{ all -> 0x0676 }
            X.1RY r0 = r5.A0A     // Catch:{ all -> 0x0676 }
            r8.setParentGroupProfilePhoto(r7, r0)     // Catch:{ all -> 0x0676 }
            X.11F r1 = r7.A0H     // Catch:{ all -> 0x0676 }
            com.whatsapp.WaImageView r0 = r8.A00     // Catch:{ all -> 0x0676 }
            A02(r0, r1)     // Catch:{ all -> 0x0676 }
        L_0x0174:
            r10.setFocusable(r12)     // Catch:{ all -> 0x0676 }
        L_0x0177:
            r0 = 2131886239(0x7f12009f, float:1.9407051E38)
            X.C33521fV.A03(r6, r0)     // Catch:{ all -> 0x0676 }
            boolean r0 = r7.A0G()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0193
            X.0wG r1 = r5.A08     // Catch:{ all -> 0x0676 }
            r0 = 2131886210(0x7f120082, float:1.9406992E38)
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x0676 }
            r8[r12] = r17     // Catch:{ all -> 0x0676 }
            java.lang.String r0 = r1.A02(r0, r8)     // Catch:{ all -> 0x0676 }
            r6.setContentDescription(r0)     // Catch:{ all -> 0x0676 }
        L_0x0193:
            boolean r0 = r3 instanceof X.AnonymousClass146     // Catch:{ all -> 0x0676 }
            r15 = r0
            if (r0 != 0) goto L_0x01dc
            X.1LV r0 = r5.A08     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.A0G(r3)     // Catch:{ all -> 0x0676 }
            r1 = 1
            if (r0 != 0) goto L_0x01dc
            X.1RJ r0 = r4.A0V     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x01b4
        L_0x01a9:
            X.1RJ r0 = r4.A0V     // Catch:{ all -> 0x0676 }
            android.view.View r0 = r0.A01()     // Catch:{ all -> 0x0676 }
            com.whatsapp.components.SelectionCheckView r0 = (com.whatsapp.components.SelectionCheckView) r0     // Catch:{ all -> 0x0676 }
            r0.setEnabled(r1)     // Catch:{ all -> 0x0676 }
        L_0x01b4:
            X.1Rx r0 = r5.A0C     // Catch:{ all -> 0x0676 }
            r38 = r0
            java.util.Set r0 = r38.BHD()     // Catch:{ all -> 0x0676 }
            boolean r10 = r0.contains(r3)     // Catch:{ all -> 0x0676 }
            r0 = r38
            boolean r1 = r0.Bnh(r3)     // Catch:{ all -> 0x0676 }
            X.11F r0 = r38.BCP()     // Catch:{ all -> 0x0676 }
            boolean r8 = r3.equals(r0)     // Catch:{ all -> 0x0676 }
            if (r10 == 0) goto L_0x01d8
            r0 = 2
            r4.A0H(r12, r0)     // Catch:{ all -> 0x0676 }
        L_0x01d4:
            r4.A0J(r10, r1)     // Catch:{ all -> 0x0676 }
            goto L_0x01e4
        L_0x01d8:
            r4.A0H(r12, r12)     // Catch:{ all -> 0x0676 }
            goto L_0x01d4
        L_0x01dc:
            r1 = 0
            goto L_0x01a9
        L_0x01de:
            java.lang.String r0 = "ConversationViewFiller/setParentGroupProfilePhoto/Unexpected class instance"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0676 }
            goto L_0x0174
        L_0x01e4:
            if (r8 == 0) goto L_0x026c
            r38.B2q()     // Catch:{ all -> 0x0676 }
            android.content.Context r8 = r27.getContext()     // Catch:{ all -> 0x0676 }
            r1 = 2130970397(0x7f04071d, float:1.7549503E38)
            r0 = 2131102027(0x7f06094b, float:1.781648E38)
            if (r10 == 0) goto L_0x01fb
            r1 = 2130969781(0x7f0404b5, float:1.7548254E38)
            r0 = 2131101050(0x7f06057a, float:1.7814499E38)
        L_0x01fb:
            int r1 = X.C224514j.A00(r8, r1, r0)     // Catch:{ all -> 0x0676 }
            r0 = r41
            int r30 = X.AnonymousClass00F.A00(r0, r1)     // Catch:{ all -> 0x0676 }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r30 = r30 & r0
            r8 = 2131099675(0x7f06001b, float:1.781171E38)
            r0 = r41
            int r8 = X.AnonymousClass00F.A00(r0, r8)     // Catch:{ all -> 0x0676 }
            X.9lf r14 = new X.9lf     // Catch:{ all -> 0x0676 }
            r31 = 0
            r26 = r14
            r28 = r1
            r29 = r5
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x0676 }
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x0676 }
            r1.<init>()     // Catch:{ all -> 0x0676 }
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0676 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r30)     // Catch:{ all -> 0x0676 }
            java.lang.Integer r10 = X.C165617ti.A0X(r13, r0, r12, r8)     // Catch:{ all -> 0x0676 }
            r8 = 1
            r0[r8] = r10     // Catch:{ all -> 0x0676 }
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofObject(r1, r0)     // Catch:{ all -> 0x0676 }
            r0 = 300(0x12c, double:1.48E-321)
            r8.setStartDelay(r0)     // Catch:{ all -> 0x0676 }
            r0 = 550(0x226, double:2.717E-321)
            r8.setDuration(r0)     // Catch:{ all -> 0x0676 }
            r8.addUpdateListener(r14)     // Catch:{ all -> 0x0676 }
            r8.start()     // Catch:{ all -> 0x0676 }
            android.animation.ArgbEvaluator r1 = new android.animation.ArgbEvaluator     // Catch:{ all -> 0x0676 }
            r1.<init>()     // Catch:{ all -> 0x0676 }
            r0 = 2
            java.lang.Object[] r0 = X.C36431kI.A1a(r10, r13, r0)     // Catch:{ all -> 0x0676 }
            android.animation.ValueAnimator r10 = android.animation.ValueAnimator.ofObject(r1, r0)     // Catch:{ all -> 0x0676 }
            r0 = 2150(0x866, double:1.062E-320)
            r10.setDuration(r0)     // Catch:{ all -> 0x0676 }
            r10.addUpdateListener(r14)     // Catch:{ all -> 0x0676 }
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet     // Catch:{ all -> 0x0676 }
            r1.<init>()     // Catch:{ all -> 0x0676 }
            android.animation.AnimatorSet$Builder r0 = r1.play(r10)     // Catch:{ all -> 0x0676 }
            r0.after(r8)     // Catch:{ all -> 0x0676 }
            r1.start()     // Catch:{ all -> 0x0676 }
        L_0x026c:
            r0 = 1
            if (r15 != 0) goto L_0x02a7
            r6.setEnabled(r0)     // Catch:{ all -> 0x0676 }
            A02(r6, r3)     // Catch:{ all -> 0x0676 }
            r0 = 5
            X.3YG r8 = new X.3YG     // Catch:{ all -> 0x0676 }
            r8.<init>(r5, r3, r0)     // Catch:{ all -> 0x0676 }
            r1 = 6
            X.3YL r13 = new X.3YL     // Catch:{ all -> 0x0676 }
            r0 = r46
            r13.<init>(r5, r0, r1, r3)     // Catch:{ all -> 0x0676 }
            X.B8D r10 = new X.B8D     // Catch:{ all -> 0x0676 }
            r10.<init>(r5, r9, r12, r3)     // Catch:{ all -> 0x0676 }
            android.view.View$OnCreateContextMenuListener r0 = r38.BEe()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0297
            android.view.View r1 = r4.A0H     // Catch:{ all -> 0x0676 }
            android.view.View$OnCreateContextMenuListener r0 = r38.BEe()     // Catch:{ all -> 0x0676 }
            r1.setOnCreateContextMenuListener(r0)     // Catch:{ all -> 0x0676 }
        L_0x0297:
            r6.setOnClickListener(r13)     // Catch:{ all -> 0x0676 }
            android.view.View r8 = X.C201679k6.A0I(r8, r10, r6, r4)     // Catch:{ all -> 0x0676 }
            r8.setOnClickListener(r13)     // Catch:{ all -> 0x0676 }
            r8.setOnLongClickListener(r10)     // Catch:{ all -> 0x0676 }
            r24 = 0
            goto L_0x02c3
        L_0x02a7:
            r8 = r3
            X.146 r8 = (X.AnonymousClass146) r8     // Catch:{ all -> 0x0676 }
            r0 = 6
            X.3YG r1 = new X.3YG     // Catch:{ all -> 0x0676 }
            r1.<init>(r5, r8, r0)     // Catch:{ all -> 0x0676 }
            r6.setEnabled(r12)     // Catch:{ all -> 0x0676 }
            r6.setOnClickListener(r1)     // Catch:{ all -> 0x0676 }
            r0 = 0
            android.view.View r8 = X.C201679k6.A0I(r1, r0, r6, r4)     // Catch:{ all -> 0x0676 }
            r8.setOnClickListener(r1)     // Catch:{ all -> 0x0676 }
            r24 = 0
            r8.setOnLongClickListener(r0)     // Catch:{ all -> 0x0676 }
        L_0x02c3:
            r8.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            r0 = r40
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            com.whatsapp.TextEmojiLabel r0 = r4.A0E     // Catch:{ all -> 0x0676 }
            r37 = r0
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            android.widget.ImageView r0 = r4.A09     // Catch:{ all -> 0x0676 }
            r36 = r0
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            android.widget.ImageView r0 = r4.A08     // Catch:{ all -> 0x0676 }
            r35 = r0
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            X.9gu r0 = r4.A0G     // Catch:{ all -> 0x0676 }
            r27 = r0
            r10 = 0
            com.whatsapp.components.ConversationListRowHeaderView r0 = r0.A03     // Catch:{ all -> 0x0676 }
            com.whatsapp.WaTextView r0 = r0.A01     // Catch:{ all -> 0x0676 }
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            r0 = r27
            X.24G r0 = r0.A04     // Catch:{ all -> 0x0676 }
            r34 = r0
            com.whatsapp.TextEmojiLabel r8 = r0.A01     // Catch:{ all -> 0x0676 }
            r8.setPadding(r12, r12, r12, r12)     // Catch:{ all -> 0x0676 }
            X.0wQ r0 = r5.A02     // Catch:{ all -> 0x0676 }
            boolean r0 = X.C36361kB.A1X(r0, r7)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0322
            X.0yC r1 = r5.A0B     // Catch:{ all -> 0x0676 }
            r0 = 1967(0x7af, float:2.756E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0322
            java.util.List r13 = r38.BFy()     // Catch:{ all -> 0x0676 }
            X.3Tl r0 = r5.A0H     // Catch:{ all -> 0x0676 }
            r33 = r0
            r8.setPlaceholder(r12)     // Catch:{ all -> 0x0676 }
            r8 = 1065353216(0x3f800000, float:1.0)
            r1 = r34
            r1.A07(r7, r0, r13, r8)     // Catch:{ all -> 0x0676 }
        L_0x031b:
            r0 = r39
            int r8 = r0.A02(r3)     // Catch:{ all -> 0x0676 }
            goto L_0x0354
        L_0x0322:
            r0 = r39
            boolean r0 = r0.A0O(r3)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0343
            if (r25 != 0) goto L_0x032f
            r0 = 1
            if (r2 != r0) goto L_0x0343
        L_0x032f:
            X.0wG r1 = r5.A08     // Catch:{ all -> 0x0676 }
            r0 = 2131888046(0x7f1207ae, float:1.9410716E38)
            java.lang.String r8 = r1.A01(r0)     // Catch:{ all -> 0x0676 }
            X.3Tl r0 = r5.A0H     // Catch:{ all -> 0x0676 }
            r33 = r0
            r1 = r0
            r0 = r27
            r0.A07(r1, r8)     // Catch:{ all -> 0x0676 }
            goto L_0x031b
        L_0x0343:
            java.util.List r13 = r38.BFy()     // Catch:{ all -> 0x0676 }
            X.3Tl r0 = r5.A0H     // Catch:{ all -> 0x0676 }
            r33 = r0
            r8 = r17
            r1 = r0
            r0 = r27
            r0.A08(r1, r8, r13)     // Catch:{ all -> 0x0676 }
            goto L_0x031b
        L_0x0354:
            r1 = 1
            if (r2 == r1) goto L_0x035c
            r0 = 10
            if (r2 == r0) goto L_0x035c
            r1 = 0
        L_0x035c:
            r32 = 1
            if (r1 == 0) goto L_0x0392
            r0 = 1
            if (r9 != r0) goto L_0x0387
            X.0yC r1 = r5.A0B     // Catch:{ all -> 0x0676 }
            r0 = 6884(0x1ae4, float:9.647E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0456
            X.9fy r0 = new X.9fy     // Catch:{ all -> 0x0676 }
            r0.<init>()     // Catch:{ all -> 0x0676 }
            A03(r0, r5)     // Catch:{ all -> 0x0676 }
            r0 = r3
            X.147 r0 = (X.AnonymousClass147) r0     // Catch:{ all -> 0x0676 }
            X.8qp r1 = new X.8qp     // Catch:{ all -> 0x0676 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x0676 }
            r5.A04 = r1     // Catch:{ all -> 0x0676 }
            X.0wU r0 = r5.A0L     // Catch:{ all -> 0x0676 }
            X.C36391kE.A1Q(r1, r0)     // Catch:{ all -> 0x0676 }
            r8 = 0
            goto L_0x0468
        L_0x0387:
            android.view.View r0 = r4.A02     // Catch:{ all -> 0x0676 }
            r0.setVisibility(r12)     // Catch:{ all -> 0x0676 }
            r37.A0C()     // Catch:{ all -> 0x0676 }
            r27.A02()     // Catch:{ all -> 0x0676 }
        L_0x0392:
            r0 = r39
            int r15 = r0.A01(r3)     // Catch:{ all -> 0x0676 }
            java.lang.Boolean r1 = r11.A07     // Catch:{ all -> 0x0676 }
            X.1RJ r0 = r4.A0Q     // Catch:{ all -> 0x0676 }
            r23 = r0
            r13 = 8
            r0.A03(r13)     // Catch:{ all -> 0x0676 }
            X.1RJ r12 = r4.A0P     // Catch:{ all -> 0x0676 }
            r12.A03(r13)     // Catch:{ all -> 0x0676 }
            android.widget.TextView r9 = r4.A0A     // Catch:{ all -> 0x0676 }
            r9.setVisibility(r13)     // Catch:{ all -> 0x0676 }
            r0 = 4
            if (r2 == r0) goto L_0x03b7
            r0 = 3
            if (r2 == r0) goto L_0x03b7
            r0 = 5
            r13 = 0
            if (r2 != r0) goto L_0x03b8
        L_0x03b7:
            r13 = 1
        L_0x03b8:
            r0 = -1
            if (r13 == 0) goto L_0x03dd
            if (r8 > 0) goto L_0x03c7
            if (r8 == r0) goto L_0x03c7
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0468
        L_0x03c7:
            r12.A03(r10)     // Catch:{ all -> 0x0676 }
            X.0yC r1 = r5.A0B     // Catch:{ all -> 0x0676 }
            r0 = 363(0x16b, float:5.09E-43)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0468
            if (r15 <= 0) goto L_0x0468
            r0 = r23
            r0.A03(r10)     // Catch:{ all -> 0x0676 }
            goto L_0x0468
        L_0x03dd:
            if (r8 <= 0) goto L_0x0434
            X.0ts r0 = r5.A09     // Catch:{ all -> 0x0676 }
            r13 = r0
            java.text.NumberFormat r12 = r0.A0M()     // Catch:{ all -> 0x0676 }
            long r0 = (long) r8     // Catch:{ all -> 0x0676 }
            r25 = r0
            java.lang.String r0 = r12.format(r0)     // Catch:{ all -> 0x0676 }
            r9.setText(r0)     // Catch:{ all -> 0x0676 }
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0676 }
            r12 = r0
            X.AnonymousClass000.A1L(r0, r8, r10)     // Catch:{ all -> 0x0676 }
            r0 = 2131755392(0x7f100180, float:1.9141662E38)
            r14 = r13
            r13 = r0
            r0 = r25
            java.lang.String r0 = r14.A0L(r12, r13, r0)     // Catch:{ all -> 0x0676 }
            r9.setContentDescription(r0)     // Catch:{ all -> 0x0676 }
            android.content.Context r12 = r9.getContext()     // Catch:{ all -> 0x0676 }
            r1 = 2131102423(0x7f060ad7, float:1.7817284E38)
            r0 = 2130971051(0x7f0409ab, float:1.755083E38)
            int r1 = X.C224514j.A00(r12, r0, r1)     // Catch:{ all -> 0x0676 }
            r9.setVisibility(r10)     // Catch:{ all -> 0x0676 }
            X.C18740tg.A06(r41)     // Catch:{ all -> 0x0676 }
            r0 = r41
            int r1 = X.AnonymousClass00F.A00(r0, r1)     // Catch:{ all -> 0x0676 }
            X.1lM r0 = new X.1lM     // Catch:{ all -> 0x0676 }
            r0.<init>(r1)     // Catch:{ all -> 0x0676 }
            r9.setBackground(r0)     // Catch:{ all -> 0x0676 }
            X.0yC r1 = r5.A0B     // Catch:{ all -> 0x0676 }
            r0 = 363(0x16b, float:5.09E-43)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0452
            if (r15 <= 0) goto L_0x0452
            goto L_0x044d
        L_0x0434:
            if (r8 == r0) goto L_0x043e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0676 }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0468
        L_0x043e:
            X.C36391kE.A1K(r9)     // Catch:{ all -> 0x0676 }
            r1 = 2131890911(0x7f1212df, float:1.9416527E38)
            r0 = r41
            X.C36331k8.A0q(r0, r9, r1)     // Catch:{ all -> 0x0676 }
            X.C201679k6.A0M(r0, r9)     // Catch:{ all -> 0x0676 }
            goto L_0x0452
        L_0x044d:
            r0 = r23
            r0.A03(r10)     // Catch:{ all -> 0x0676 }
        L_0x0452:
            r9.setVisibility(r10)     // Catch:{ all -> 0x0676 }
            goto L_0x0468
        L_0x0456:
            X.1LV r1 = r5.A08     // Catch:{ all -> 0x0676 }
            r0 = r3
            X.147 r0 = (X.AnonymousClass147) r0     // Catch:{ all -> 0x0676 }
            java.util.List r0 = r1.A05(r0)     // Catch:{ all -> 0x0676 }
            X.9fy r0 = A00(r5, r0)     // Catch:{ all -> 0x0676 }
            int r8 = r0.A02     // Catch:{ all -> 0x0676 }
            A03(r0, r5)     // Catch:{ all -> 0x0676 }
        L_0x0468:
            r0 = r19
            boolean r0 = r0 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x0676 }
            r9 = 2
            if (r0 == 0) goto L_0x04a0
            r0 = r19
            X.2bI r0 = (X.AnonymousClass2bI) r0     // Catch:{ all -> 0x0676 }
            int r1 = r0.A00     // Catch:{ all -> 0x0676 }
            if (r1 == r9) goto L_0x047a
            r0 = 3
            if (r1 != r0) goto L_0x04a0
        L_0x047a:
            X.0yC r1 = r5.A0B     // Catch:{ all -> 0x0676 }
            java.lang.String r0 = r19.A0b()     // Catch:{ all -> 0x0676 }
            boolean r0 = X.AnonymousClass3M0.A01(r1, r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x049b
            X.0wG r0 = r5.A08     // Catch:{ all -> 0x0676 }
            android.content.res.Resources r1 = X.C36421kH.A0B(r0)     // Catch:{ all -> 0x0676 }
            r0 = 2131890034(0x7f120f72, float:1.9414748E38)
            java.lang.String r9 = r1.getString(r0)     // Catch:{ all -> 0x0676 }
        L_0x0493:
            r1 = r33
            r0 = r27
            r0.A07(r1, r9)     // Catch:{ all -> 0x0676 }
            goto L_0x04a0
        L_0x049b:
            java.lang.String r9 = r19.A0b()     // Catch:{ all -> 0x0676 }
            goto L_0x0493
        L_0x04a0:
            r1 = 1
            if (r2 == r1) goto L_0x04a9
            r0 = 10
            if (r2 == r0) goto L_0x04a9
            r32 = 0
        L_0x04a9:
            r23 = 1
            r25 = r5
            r26 = r43
            r27 = r7
            r28 = r45
            r29 = r19
            r30 = r44
            r31 = r42
            r25.A0U(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x0676 }
            boolean r0 = r5.A0A(r7)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x04cb
            int r0 = r42.size()     // Catch:{ all -> 0x0676 }
            if (r0 <= r1) goto L_0x04cb
            X.C36391kE.A1K(r40)     // Catch:{ all -> 0x0676 }
        L_0x04cb:
            r9 = 8
            r0 = 7
            if (r2 != r0) goto L_0x0501
            if (r22 == 0) goto L_0x0501
            r0 = r37
            r0.setVisibility(r9)     // Catch:{ all -> 0x0676 }
            android.content.res.Resources r15 = r41.getResources()     // Catch:{ all -> 0x0676 }
            int r14 = r22.size()     // Catch:{ all -> 0x0676 }
            java.lang.Object[] r13 = new java.lang.Object[r1]     // Catch:{ all -> 0x0676 }
            X.171 r12 = r5.A05     // Catch:{ all -> 0x0676 }
            r0 = r22
            java.lang.String r0 = r12.A0V(r0)     // Catch:{ all -> 0x0676 }
            r13[r10] = r0     // Catch:{ all -> 0x0676 }
            r12 = 2131755312(0x7f100130, float:1.91415E38)
            java.lang.String r27 = r15.getQuantityString(r12, r14, r13)     // Catch:{ all -> 0x0676 }
            java.util.List r28 = r38.BFy()     // Catch:{ all -> 0x0676 }
            r29 = 150(0x96, float:2.1E-43)
            r30 = 1
            r25 = r40
            r26 = r33
            r25.A0H(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0676 }
        L_0x0501:
            X.0v0 r10 = r5.A0S     // Catch:{ all -> 0x0676 }
            r0 = r39
            boolean r0 = X.AnonymousClass1DH.A02(r10, r0, r3)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0527
            switch(r2) {
                case 0: goto L_0x0524;
                case 1: goto L_0x050e;
                case 2: goto L_0x0513;
                case 3: goto L_0x050e;
                case 4: goto L_0x050e;
                case 5: goto L_0x050e;
                case 6: goto L_0x050e;
                case 7: goto L_0x0524;
                case 8: goto L_0x0513;
                case 9: goto L_0x0519;
                case 10: goto L_0x050e;
                case 11: goto L_0x0513;
                default: goto L_0x050e;
            }     // Catch:{ all -> 0x0676 }
        L_0x050e:
            X.1RJ r12 = r4.A0R     // Catch:{ all -> 0x0676 }
            if (r21 == 0) goto L_0x052d
            goto L_0x052b
        L_0x0513:
            X.1RJ r0 = r4.A0R     // Catch:{ all -> 0x0676 }
            r0.A03(r9)     // Catch:{ all -> 0x0676 }
            goto L_0x0532
        L_0x0519:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0676 }
            java.lang.String r0 = "ConversationViewFiller/this state does not exist. State = "
            java.lang.IllegalStateException r0 = X.C90464aC.A0R(r0, r1, r2)     // Catch:{ all -> 0x0676 }
            throw r0     // Catch:{ all -> 0x0676 }
        L_0x0524:
            X.1RJ r12 = r4.A0R     // Catch:{ all -> 0x0676 }
            goto L_0x052b
        L_0x0527:
            X.1RJ r12 = r4.A0R     // Catch:{ all -> 0x0676 }
            if (r21 == 0) goto L_0x052d
        L_0x052b:
            r0 = 0
            goto L_0x052f
        L_0x052d:
            r0 = 8
        L_0x052f:
            r12.A03(r0)     // Catch:{ all -> 0x0676 }
        L_0x0532:
            r0 = 3
            if (r2 == r0) goto L_0x053d
            r0 = 5
            if (r2 == r0) goto L_0x053d
            X.1RJ r12 = r4.A0T     // Catch:{ all -> 0x0676 }
            if (r20 == 0) goto L_0x0555
            goto L_0x0553
        L_0x053d:
            boolean r0 = r3 instanceof X.AnonymousClass147     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x054e
            r12 = r3
            X.147 r12 = (X.AnonymousClass147) r12     // Catch:{ all -> 0x0676 }
            r0 = r39
            int r12 = r0.A05(r12)     // Catch:{ all -> 0x0676 }
            r0 = 3
            r13 = 1
            if (r12 == r0) goto L_0x054f
        L_0x054e:
            r13 = 0
        L_0x054f:
            X.1RJ r12 = r4.A0T     // Catch:{ all -> 0x0676 }
            if (r13 == 0) goto L_0x0555
        L_0x0553:
            r0 = 0
            goto L_0x0557
        L_0x0555:
            r0 = 8
        L_0x0557:
            r12.A03(r0)     // Catch:{ all -> 0x0676 }
            X.1RJ r12 = r4.A0M     // Catch:{ all -> 0x0676 }
            r0 = r39
            boolean r0 = r0.A0N(r3)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0577
            if (r2 == 0) goto L_0x0575
            r0 = 6
            if (r2 == r0) goto L_0x0575
            r0 = 5
            if (r2 == r0) goto L_0x0575
            r0 = 4
            if (r2 == r0) goto L_0x0575
            boolean r0 = r10.A2F()     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0577
        L_0x0575:
            r0 = 0
            goto L_0x0579
        L_0x0577:
            r0 = 8
        L_0x0579:
            r12.A03(r0)     // Catch:{ all -> 0x0676 }
            X.0yC r10 = r5.A0B     // Catch:{ all -> 0x0676 }
            X.11F r0 = r7.A0H     // Catch:{ all -> 0x0676 }
            boolean r0 = X.AnonymousClass3RR.A00(r10, r0)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0594
            boolean r0 = r7.A0N()     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x059a
            r0 = 3961(0xf79, float:5.55E-42)
            boolean r0 = r10.A0E(r0)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x059a
        L_0x0594:
            r0 = r34
            r0.A0B(r7)     // Catch:{ all -> 0x0676 }
            goto L_0x059d
        L_0x059a:
            r23 = 0
            goto L_0x0594
        L_0x059d:
            if (r23 == 0) goto L_0x05a2
            r0.A03(r1)     // Catch:{ all -> 0x0676 }
        L_0x05a2:
            X.11F r0 = r7.A0H     // Catch:{ all -> 0x0676 }
            boolean r0 = r0 instanceof X.C177618e5     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x05c7
            X.1dv r0 = r5.A0Q     // Catch:{ all -> 0x0676 }
            java.lang.String r24 = r0.A01(r7)     // Catch:{ all -> 0x0676 }
            if (r24 == 0) goto L_0x05c7
            boolean r0 = A09(r5, r3)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x05c7
            r10 = r40
            r0 = r24
            r10.setText(r0)     // Catch:{ all -> 0x0676 }
            r0 = r37
            r0.setVisibility(r9)     // Catch:{ all -> 0x0676 }
            r0 = r35
            r0.setVisibility(r9)     // Catch:{ all -> 0x0676 }
        L_0x05c7:
            A05(r5, r8)     // Catch:{ all -> 0x0676 }
            if (r24 == 0) goto L_0x05cd
            goto L_0x0611
        L_0x05cd:
            r9 = 2131101132(0x7f0605cc, float:1.7814665E38)
            r8 = r41
            r0 = r40
            X.C36331k8.A0r(r8, r0, r9)     // Catch:{ all -> 0x0676 }
            if (r19 == 0) goto L_0x0603
            r8 = r19
            r0 = r44
            boolean r0 = X.AnonymousClass3TK.A03(r8, r0)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0603
            boolean r0 = X.C66013Ui.A0n(r19)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x0601
            int r8 = r8.A1I     // Catch:{ all -> 0x0676 }
            r0 = 19
            if (r8 == r0) goto L_0x0601
            boolean r0 = X.C66013Ui.A0L(r8)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x0603
            r0 = r19
            X.4TX r0 = (X.AnonymousClass4TX) r0     // Catch:{ all -> 0x0676 }
            r19 = r0
            int r0 = r19.BJ8()     // Catch:{ all -> 0x0676 }
            if (r0 != r1) goto L_0x0603
        L_0x0601:
            r8 = 2
            goto L_0x0604
        L_0x0603:
            r8 = 0
        L_0x0604:
            r40.getContext()     // Catch:{ all -> 0x0676 }
            android.graphics.Typeface r1 = X.C33511fU.A01()     // Catch:{ all -> 0x0676 }
            r0 = r40
            r0.setTypeface(r1, r8)     // Catch:{ all -> 0x0676 }
            goto L_0x062c
        L_0x0611:
            boolean r0 = A09(r5, r3)     // Catch:{ all -> 0x0676 }
            if (r0 != 0) goto L_0x05cd
            r0 = r36
            r0.setVisibility(r9)     // Catch:{ all -> 0x0676 }
            r9 = 2130969053(0x7f0401dd, float:1.7546777E38)
            r8 = 2131100148(0x7f0601f4, float:1.781267E38)
            r1 = r41
            r0 = r40
            X.C36321k7.A0M(r1, r0, r9, r8)     // Catch:{ all -> 0x0676 }
            X.C33511fU.A03(r40)     // Catch:{ all -> 0x0676 }
        L_0x062c:
            X.16D r1 = r5.A04     // Catch:{ all -> 0x0676 }
            r0 = r39
            int r1 = X.AnonymousClass3TD.A00(r1, r0, r3)     // Catch:{ all -> 0x0676 }
            boolean r0 = X.AnonymousClass000.A1R(r1)
            r4.A0I(r0, r1)     // Catch:{ all -> 0x0676 }
            if (r18 == 0) goto L_0x0653
            X.3Ed r0 = r11.A06     // Catch:{ all -> 0x0676 }
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r6 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r6     // Catch:{ all -> 0x0676 }
            r5.A08(r0, r6)     // Catch:{ all -> 0x0676 }
            X.3Ed r0 = r5.A03     // Catch:{ all -> 0x0676 }
            com.whatsapp.jid.UserJid r10 = X.C36401kF.A0b(r3)     // Catch:{ all -> 0x0676 }
            r8 = r5
            r9 = r7
            r11 = r0
            r12 = r6
            r13 = r17
            r8.A07(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0676 }
        L_0x0653:
            if (r2 != 0) goto L_0x066c
            X.11F r1 = r7.A0H     // Catch:{ all -> 0x0676 }
            if (r1 == 0) goto L_0x066c
            r0 = r39
            boolean r0 = r0.A0Q(r1)     // Catch:{ all -> 0x0676 }
            if (r0 == 0) goto L_0x066c
            java.lang.String r1 = r7.A0X     // Catch:{ all -> 0x0676 }
            if (r1 != 0) goto L_0x0667
            java.lang.String r1 = ""
        L_0x0667:
            r0 = r40
            r0.A0I(r1)     // Catch:{ all -> 0x0676 }
        L_0x066c:
            if (r47 == 0) goto L_0x0675
            r1 = r16
            r0 = r46
            r1.Bfd(r0)
        L_0x0675:
            return
        L_0x0676:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0678 }
        L_0x0678:
            r2 = move-exception
            if (r47 == 0) goto L_0x0682
            r1 = r16
            r0 = r46
            r1.Bfd(r0)
        L_0x0682:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175228a3.A04(X.9OK, X.8a3, X.1gd, int):void");
    }

    public static void A05(C175228a3 r4, int i) {
        int i2 = r4.A05;
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

    public static void A06(C175228a3 r4, AnonymousClass11F r5, C107265Nh r6) {
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
                r0 = r4.A0M;
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
                r0 = r4.A0O;
            } else {
                return;
            }
        } else {
            ViewHolder viewHolder3 = r4.A06;
            ImageView imageView4 = viewHolder3.A07;
            if (imageView4 instanceof WDSProfilePhoto) {
                wDSProfilePhoto = (WDSProfilePhoto) imageView4;
                r0 = r4.A0N;
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
    private void A07(X.AnonymousClass141 r8, com.whatsapp.jid.UserJid r9, X.C61953Ed r10, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r11, java.lang.String r12) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C175228a3.A07(X.141, com.whatsapp.jid.UserJid, X.3Ed, com.whatsapp.wds.components.profilephoto.WDSProfilePhoto, java.lang.String):void");
    }

    private void A08(C61953Ed r3, WDSProfilePhoto wDSProfilePhoto) {
        if (r3 == null || !r3.A00() || r3.A01 <= 0) {
            wDSProfilePhoto.setStatusIndicatorEnabled(false);
            return;
        }
        wDSProfilePhoto.setProfilePhotoShape(C108525Tv.CIRCLE);
        wDSProfilePhoto.setStatusIndicatorEnabled(true);
        wDSProfilePhoto.setProfileStatus(new AnonymousClass5QJ(AnonymousClass5TU.UNSEEN));
    }

    private boolean A0A(AnonymousClass141 r5) {
        if (this.A05 != 1) {
            return false;
        }
        if (this.A0A.A05(C36441kJ.A0l(r5.A0H)) == 1) {
            return true;
        }
        return false;
    }

    public void A0S(AnonymousClass9XF r3) {
        AnonymousClass141 r1 = r3.A03;
        if (A0A(r1)) {
            A0X(this.A05.A0H(r1), false);
        } else {
            super.A0S(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r7 == 6) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0T(X.AnonymousClass7gQ r13, X.C34211gd r14, int r15, boolean r16) {
        /*
            r12 = this;
            X.5Jv r13 = (X.C106475Jv) r13
            X.11F r10 = r13.BDC()
            boolean r0 = r13 instanceof X.C106465Ju
            if (r0 == 0) goto L_0x014b
            r0 = r13
            X.5Ju r0 = (X.C106465Ju) r0
            java.util.Set r9 = r0.A01
        L_0x000f:
            X.9OK r8 = r12.A01(r10, r9)
            int r7 = r12.A05
            r0 = 4
            if (r7 == r0) goto L_0x0022
            r0 = 3
            if (r7 == r0) goto L_0x0022
            r0 = 5
            if (r7 == r0) goto L_0x0022
            r0 = 6
            r1 = 0
            if (r7 != r0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            r6 = 1
            if (r1 != 0) goto L_0x0028
            if (r7 != r6) goto L_0x005e
        L_0x0028:
            com.whatsapp.conversationslist.ViewHolder r5 = r12.A06
            android.widget.ImageView r4 = r5.A07
            android.content.res.Resources r3 = r4.getResources()
            r0 = 2131165915(0x7f0702db, float:1.794606E38)
            if (r1 == 0) goto L_0x0038
            r0 = 2131165806(0x7f07026e, float:1.794584E38)
        L_0x0038:
            int r2 = r3.getDimensionPixelSize(r0)
            r1 = 4
            r0 = 2131165946(0x7f0702fa, float:1.7946123E38)
            if (r7 != r1) goto L_0x0045
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
        L_0x0045:
            int r11 = r3.getDimensionPixelSize(r0)
            r0 = 2131165921(0x7f0702e1, float:1.7946073E38)
            if (r7 != r1) goto L_0x0051
            r0 = 2131166185(0x7f0703e9, float:1.7946608E38)
        L_0x0051:
            X.5TY r1 = X.C201679k6.A0K(r3, r5, r0, r11, r2)
            boolean r0 = r4 instanceof com.whatsapp.wds.components.profilephoto.WDSProfilePhoto
            if (r0 == 0) goto L_0x0146
            com.whatsapp.wds.components.profilephoto.WDSProfilePhoto r4 = (com.whatsapp.wds.components.profilephoto.WDSProfilePhoto) r4
            r4.setProfilePhotoSize(r1)
        L_0x005e:
            if (r8 == 0) goto L_0x0099
            A04(r8, r12, r14, r15)
        L_0x0063:
            com.whatsapp.jid.GroupJid r4 = X.C36441kJ.A0l(r10)
            X.0yC r1 = r12.A0B
            r0 = 6120(0x17e8, float:8.576E-42)
            int r0 = r1.A07(r0)
            if (r0 < r6) goto L_0x015f
            X.005 r0 = r12.A0I
            java.lang.Object r5 = r0.get()
            X.6X4 r5 = (X.AnonymousClass6X4) r5
            if (r4 == 0) goto L_0x0098
            X.3T1 r0 = r5.A06(r10)
            if (r0 != 0) goto L_0x0098
            X.1HO r0 = r12.A0E
            X.5Ng r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x014e
            X.1HJ r2 = r12.A0D
            long r0 = r0.A02()
            X.5Nh r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x014e
            r5.A09(r4, r0)
        L_0x0098:
            return
        L_0x0099:
            if (r16 == 0) goto L_0x00da
            r1 = 0
            X.8aC r0 = new X.8aC
            r0.<init>(r12, r10, r9, r1)
            r12.A01 = r0
            java.lang.Object r0 = r0.call()     // Catch:{ all -> 0x0190 }
            X.9OK r0 = (X.AnonymousClass9OK) r0     // Catch:{ all -> 0x0190 }
            A04(r0, r12, r14, r15)
            X.12q r0 = r12.A0A
            X.3Qp r2 = X.C36371kC.A0W(r0, r10)
            X.0yC r1 = r12.A0B
            r0 = 1605(0x645, float:2.249E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0063
            if (r2 == 0) goto L_0x0063
            long r3 = r2.A01()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0063
            X.8aC r2 = new X.8aC
            r2.<init>(r12, r10, r9, r6)
            r12.A02 = r2
            X.1f4 r1 = r12.A0B
            X.B8g r0 = new X.B8g
            r0.<init>(r12, r15, r6, r14)
            r1.A00(r0, r2)
            goto L_0x0063
        L_0x00da:
            X.8aC r0 = new X.8aC
            r0.<init>(r12, r10, r9, r6)
            r12.A01 = r0
            android.content.Context r2 = r12.A01
            X.C18740tg.A06(r2)
            com.whatsapp.conversationslist.ViewHolder r4 = r12.A06
            android.view.View r0 = r4.A04
            r3 = 0
            r0.setPadding(r3, r3, r3, r3)
            android.widget.ImageView r7 = r4.A07
            r7.setEnabled(r3)
            android.view.View r5 = r4.A03
            r0 = 0
            r5.setOnClickListener(r0)
            r7.setOnClickListener(r0)
            r5.setOnLongClickListener(r0)
            r7.setOnLongClickListener(r0)
            r0 = 2131231707(0x7f0803db, float:1.8079503E38)
            r7.setImageResource(r0)
            X.1Pp r1 = r12.A09
            X.11F r0 = r13.BDC()
            int r0 = X.AnonymousClass1Pp.A00(r1, r0, r3)
            r1.A06(r7, r0)
            r5.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r4.A0E
            X.C201679k6.A0N(r0, r4)
            X.9gu r0 = r4.A0G
            r0.A05()
            com.whatsapp.TextEmojiLabel r1 = r4.A0D
            r1.setVisibility(r3)
            r0 = 2131101132(0x7f0605cc, float:1.7814665E38)
            X.C36331k8.A0r(r2, r1, r0)
            r1.A0C()
            X.C36391kE.A1K(r1)
            r0 = 80
            r1.setPlaceholder(r0)
            X.1f4 r2 = r12.A0B
            X.8aC r1 = r12.A01
            X.B8g r0 = new X.B8g
            r0.<init>(r12, r15, r3, r14)
            r2.A00(r0, r1)
            goto L_0x0063
        L_0x0146:
            X.C34081gQ.A05(r4, r2, r2)
            goto L_0x005e
        L_0x014b:
            r9 = 0
            goto L_0x000f
        L_0x014e:
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            X.8a5 r3 = new X.8a5
            r3.<init>(r12, r10)
            r12.A00 = r3
            X.1f4 r2 = r12.A0B
            X.B8i r1 = new X.B8i
            r1.<init>(r5, r4, r6)
            goto L_0x018c
        L_0x015f:
            r0 = 0
            if (r4 == 0) goto L_0x0176
            X.1HO r0 = r12.A0E
            X.5Ng r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x017a
            X.1HJ r2 = r12.A0D
            long r0 = r0.A02()
            X.5Nh r0 = r2.A05(r0)
            if (r0 == 0) goto L_0x017a
        L_0x0176:
            A06(r12, r10, r0)
            return
        L_0x017a:
            r0 = r10
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            X.8a5 r3 = new X.8a5
            r3.<init>(r12, r0)
            r12.A00 = r3
            X.1f4 r2 = r12.A0B
            r0 = 0
            X.B8i r1 = new X.B8i
            r1.<init>(r12, r10, r0)
        L_0x018c:
            r2.A00(r1, r3)
            return
        L_0x0190:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175228a3.A0T(X.7gQ, X.1gd, int, boolean):void");
    }

    public static C199789fy A00(C175228a3 r12, List list) {
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            GroupJid groupJid = ((AnonymousClass3QK) it.next()).A02;
            C220412q r6 = r12.A0A;
            C65073Qp A0W = C36371kC.A0W(r6, groupJid);
            if (A0W != null) {
                long j = (long) A0W.A08;
                if (j > 0) {
                    i3++;
                    i = (int) (((long) i) + j);
                }
            }
            i2 += r6.A01(groupJid);
        }
        return new C199789fy(i, i2, i3);
    }

    public static void A02(View view, AnonymousClass11F r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("com.whatsapp.conversationslist.ConversationsFragment");
        C011004s.A08(view, AnonymousClass000.A0q(AnonymousClass143.A03(r3), A0u));
    }

    public static boolean A09(C175228a3 r1, AnonymousClass11F r2) {
        if (C201679k6.A0J(r1, r2) == null || r1.A0B.A07(6120) < 1) {
            return false;
        }
        return true;
    }

    public void A0R() {
        super.A0R();
        C36351kA.A1H(this.A01);
        C36351kA.A1H(this.A02);
        C36351kA.A1H(this.A00);
        C36331k8.A1E(this.A04);
    }

    public void A0W(AnonymousClass141 r6, AnonymousClass141 r7, AnonymousClass3T1 r8, List list, boolean z) {
        String A0D2;
        if (!A0A(r6)) {
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
        if (TextUtils.isEmpty(A002) || A0I2.size() != 1) {
            this.A06.A0W.A03(8);
            return;
        }
        AnonymousClass1RJ r12 = this.A06.A0W;
        C201679k6.A0O((ImageView) C36391kE.A0L(r12, 0), r3, r12);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C175228a3(android.content.Context r29, X.C19460v5 r30, X.C32621dv r31, X.AnonymousClass17Y r32, X.C19730wQ r33, X.AnonymousClass1T1 r34, X.AnonymousClass1NG r35, X.AnonymousClass1HX r36, X.AnonymousClass1LV r37, X.AnonymousClass1Pp r38, X.AnonymousClass16D r39, X.AnonymousClass171 r40, X.AnonymousClass1RY r41, X.C33301f4 r42, X.C28251Rx r43, com.whatsapp.conversationslist.ViewHolder r44, X.C21060yb r45, X.C19970wo r46, X.C19630wG r47, X.C19420v0 r48, X.C18820ts r49, X.AnonymousClass1HJ r50, X.C220712t r51, X.C220412q r52, X.AnonymousClass165 r53, X.AnonymousClass1HO r54, X.C24541Cv r55, X.C26171Jd r56, X.AnonymousClass1LU r57, X.C20810yC r58, X.C20500xf r59, X.AnonymousClass1EL r60, X.C32931eR r61, X.C32831eG r62, X.C28371Sj r63, X.AnonymousClass1EV r64, X.AnonymousClass1EU r65, X.AnonymousClass1FR r66, X.AnonymousClass1AW r67, X.AnonymousClass1CR r68, X.C61953Ed r69, X.AnonymousClass1EM r70, X.C65783Tl r71, X.C19770wU r72, X.AnonymousClass005 r73, int r74) {
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
            r4 = r33
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
            r19 = r60
            r18 = r59
            r17 = r58
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            X.5TT r1 = X.AnonymousClass5TT.VIDEO
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0M = r0
            X.5TT r1 = X.AnonymousClass5TT.VOICE
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0N = r0
            X.5TT r1 = X.AnonymousClass5TT.VOICE_CHAT
            X.5QI r0 = new X.5QI
            r0.<init>(r1)
            r2.A0O = r0
            r1 = 6
            X.3wU r0 = new X.3wU
            r0.<init>((java.lang.Object) r2, (int) r1)
            r2.A0P = r0
            r0 = r74
            r2.A05 = r0
            r0 = r32
            r2.A0R = r0
            r0 = r72
            r2.A0L = r0
            r0 = r36
            r2.A07 = r0
            r0 = r69
            r2.A03 = r0
            r0 = r38
            r2.A09 = r0
            r0 = r31
            r2.A0Q = r0
            r0 = r55
            r2.A0F = r0
            r0 = r50
            r2.A0D = r0
            r0 = r68
            r2.A0K = r0
            r0 = r41
            r2.A0A = r0
            r0 = r56
            r2.A0G = r0
            r0 = r57
            r2.A0H = r0
            r0 = r48
            r2.A0S = r0
            r0 = r37
            r2.A08 = r0
            r0 = r54
            r2.A0E = r0
            r0 = r42
            r2.A0B = r0
            r0 = r30
            r2.A06 = r0
            r2.A0C = r9
            r0 = r62
            r2.A0J = r0
            r0 = r61
            r2.A0I = r0
            r0 = r51
            r2.A0T = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C175228a3.<init>(android.content.Context, X.0v5, X.1dv, X.17Y, X.0wQ, X.1T1, X.1NG, X.1HX, X.1LV, X.1Pp, X.16D, X.171, X.1RY, X.1f4, X.1Rx, com.whatsapp.conversationslist.ViewHolder, X.0yb, X.0wo, X.0wG, X.0v0, X.0ts, X.1HJ, X.12t, X.12q, X.165, X.1HO, X.1Cv, X.1Jd, X.1LU, X.0yC, X.0xf, X.1EL, X.1eR, X.1eG, X.1Sj, X.1EV, X.1EU, X.1FR, X.1AW, X.1CR, X.3Ed, X.1EM, X.3Tl, X.0wU, X.005, int):void");
    }
}
