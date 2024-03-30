package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.R;

/* renamed from: X.3Zj  reason: invalid class name and case insensitive filesystem */
public class C67323Zj implements AbsListView.OnScrollListener {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final /* synthetic */ C70803fk A05;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (X.AnonymousClass3RT.A00 == false) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r10, int r11) {
        /*
            r9 = this;
            r3 = 1
            if (r11 == 0) goto L_0x002f
            if (r11 != r3) goto L_0x0018
            X.3fk r2 = r9.A05
            int r0 = r2.A04
            if (r0 != 0) goto L_0x0018
            X.1JI r1 = r2.A4b
            X.155 r0 = X.C70803fk.A0C(r2)
            android.view.Window r0 = r0.getWindow()
            r1.A03(r0, r3)
        L_0x0018:
            X.3fk r4 = r9.A05
            android.os.Handler r1 = r4.A6x
            java.lang.Runnable r0 = r4.A7A
            r1.removeCallbacks(r0)
        L_0x0021:
            r4.A04 = r11
            if (r11 == 0) goto L_0x002c
            long r0 = java.lang.System.currentTimeMillis()
        L_0x0029:
            X.C52952qR.A00 = r0
            return
        L_0x002c:
            r0 = 0
            goto L_0x0029
        L_0x002f:
            X.3fk r4 = r9.A05
            X.1JI r1 = r4.A4b
            X.155 r0 = X.C70803fk.A0C(r4)
            android.view.Window r0 = r0.getWindow()
            r1.A02(r0)
            com.whatsapp.conversation.ConversationListView r3 = r4.A2U
            X.4V6 r0 = r4.A2l
            java.util.HashSet r8 = r0.getSeenMessages()
            X.1nd r0 = r3.getConversationCursorAdapter()
            if (r0 == 0) goto L_0x00ad
            X.1nd r0 = r3.getConversationCursorAdapter()
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x00ad
            int r7 = r3.getChildCount()
            r6 = 0
        L_0x005b:
            if (r6 >= r7) goto L_0x0093
            android.view.View r1 = r3.getChildAt(r6)
            boolean r0 = r1 instanceof X.C88244Ry
            if (r0 == 0) goto L_0x00aa
            boolean r0 = r1 instanceof X.AnonymousClass2IR
            if (r0 == 0) goto L_0x00aa
            X.4Ry r1 = (X.C88244Ry) r1
            X.2IS r1 = (X.AnonymousClass2IS) r1
            X.3T1 r5 = r1.getFMessage()
            X.3Qa r0 = r5.A1J
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00aa
            X.1nd r2 = r3.getConversationCursorAdapter()
            int r1 = r2.A06(r5)
            int r0 = r2.A04()
            if (r1 > r0) goto L_0x008f
            X.1Ak r0 = r2.A07
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x00aa
        L_0x008f:
            boolean r0 = X.AnonymousClass3RT.A00
            if (r0 == 0) goto L_0x00ad
        L_0x0093:
            r2 = 0
        L_0x0094:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x00ad
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.C88244Ry
            if (r0 == 0) goto L_0x00a7
            X.4Ry r1 = (X.C88244Ry) r1
            r1.BuP()
        L_0x00a7:
            int r2 = r2 + 1
            goto L_0x0094
        L_0x00aa:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x00ad:
            boolean r0 = X.C70803fk.A1X(r4)
            if (r0 == 0) goto L_0x00cb
            X.3BF r0 = X.C70803fk.A0G(r4)
            X.005 r0 = r0.A07
            java.lang.Object r1 = r0.get()
            X.1GQ r1 = (X.AnonymousClass1GQ) r1
            r0 = 2
            boolean r0 = X.AnonymousClass1GQ.A00(r1, r0)
            if (r0 == 0) goto L_0x00cb
            com.whatsapp.conversation.ConversationListView r0 = r4.A2U
            r0.A03()
        L_0x00cb:
            android.os.Handler r3 = r4.A6x
            java.lang.Runnable r2 = r4.A7A
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67323Zj.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public C67323Zj(C70803fk r1) {
        this.A05 = r1;
    }

    public static void A00(C67323Zj r7, int i, int i2) {
        AnonymousClass4UQ r0;
        C70803fk r2 = r7.A05;
        C38051nd A0D = C70803fk.A0D(r2);
        int count = A0D.getCount();
        boolean z = false;
        while (i <= i2) {
            int headerViewsCount = i - r2.A2U.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1) {
                AnonymousClass3T1 A08 = A0D.getItem(headerViewsCount);
                if ((A08 instanceof AnonymousClass2bI) && ((AnonymousClass2bI) A08).A00 == 129) {
                    z = true;
                }
            }
            i++;
        }
        View findViewById = r2.A2l.findViewById(R.id.footer_container);
        if (z) {
            AnonymousClass4UQ r02 = r2.A2n.A03;
            if (!(r02 == null || !r02.isVisible() || (r0 = r2.A2n.A03) == null)) {
                r0.BKD();
            }
            C36341k9.A0y(findViewById);
            return;
        }
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        AnonymousClass4UQ r03 = r2.A2n.A03;
        if (r03 == null || !r03.isVisible()) {
            C70803fk.A09(r2).A0H(new C81103wT((Object) r7, 33));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0256, code lost:
        if (r0.A04 == 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025a, code lost:
        if (r2.A02 == r1) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x025c, code lost:
        if (r32 == 0) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x025e, code lost:
        r3 = r31 - r0.A2U.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0266, code lost:
        if (r3 < 0) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0268, code lost:
        r8 = r8.getItem(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x026c, code lost:
        if (r8 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x026e, code lost:
        r5 = r8.A0I;
        r0.A2l.getTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x027d, code lost:
        if (X.AnonymousClass6XI.A04(r5, java.lang.System.currentTimeMillis()) != false) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x027f, code lost:
        r5 = X.C36441kJ.A0V(r0.A5M);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x028b, code lost:
        if (r0.A2U.getClipToPadding() == false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028d, code lost:
        r5.setY((float) r0.A2U.getPaddingTop());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0297, code lost:
        r0.A2l.getTime();
        r5.setText(X.AnonymousClass3UY.A0E(r0.A36, r8.A0I));
        r5.setTextSize(r0.A2S.A01(r0.A2l.getResources()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02ba, code lost:
        if (r5.getVisibility() == 0) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02bc, code lost:
        r5.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c9, code lost:
        if (X.AnonymousClass3B6.A00(r0).BLD(r0.A45) != false) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02cb, code lost:
        r20 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        r20.setDuration(200);
        r5.startAnimation(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ea, code lost:
        r11 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ec, code lost:
        if (r11 == 0) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02ee, code lost:
        r8 = r2.A02;
        r3 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f2, code lost:
        if (r3 != 0) goto L_0x02f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f4, code lost:
        r2.A01 = r10;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f7, code lost:
        if (r3 >= r10) goto L_0x02fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02f9, code lost:
        r8 = r8 + (r10 - r3);
        r2.A01 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fe, code lost:
        r7 = r7 - 1;
        r11 = (r11 + r8) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0303, code lost:
        if (r8 >= r1) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0305, code lost:
        if (r1 > r11) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0307, code lost:
        r11 = r31 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0309, code lost:
        r6 = X.C70803fk.A0D(r0);
        r12 = r6.getCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0311, code lost:
        if (r8 > r11) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0313, code lost:
        r4 = r8 - r0.A2U.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x031b, code lost:
        if (r4 < 0) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x031f, code lost:
        if (r4 > (r12 - 1)) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0321, code lost:
        r5 = r6.getItem(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0325, code lost:
        if (r5 == null) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032b, code lost:
        if (r5.A1I != 13) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x032d, code lost:
        r0.A2l.B5S(r5.A1J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0334, code lost:
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0337, code lost:
        if (r7 >= r11) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0339, code lost:
        if (r8 > r7) goto L_0x033e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x033b, code lost:
        r8 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x033e, code lost:
        if (r7 < r8) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0340, code lost:
        if (r1 <= r11) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0343, code lost:
        r0.A5M.A03(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x034b, code lost:
        if (r32 == 0) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x034e, code lost:
        r11.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0355, code lost:
        if (r0.A7a != null) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0361, code lost:
        if (X.C20800yB.A01(X.C21000yV.A01, r0.A3n, 7693) == false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0365, code lost:
        if (r2.A00 == false) goto L_0x0374;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0367, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036e, code lost:
        if (r0.A7a.booleanValue() == false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0370, code lost:
        A00(r2, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0374, code lost:
        r2.A00 = true;
        X.C70803fk.A0K(r0).Boy(new X.C80353vG(r2, r1, r7, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0387, code lost:
        if (r2.A02 == r1) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x038b, code lost:
        if (r0.A04 == 0) goto L_0x0393;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x038d, code lost:
        X.C52952qR.A00 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0393, code lost:
        r2.A02 = r1;
        r2.A04 = r19;
        r4 = r0.A2x;
        r4.A08 = (long) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03a6, code lost:
        if (r1 >= (java.lang.Math.min(100, r10) / 2)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x03a8, code lost:
        r4.A0b(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x03ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f0, code lost:
        if (r3.A0B(r4) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f4, code lost:
        if (r0.A6O != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        r11 = r0.A5Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0101, code lost:
        if (r12 == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0107, code lost:
        if (r11.A00() != 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0109, code lost:
        r5 = X.C36361kB.A0K(new android.view.animation.ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f), 1.0f, 0.0f);
        r5.setDuration(100);
        r0.A5Q.A01().startAnimation(r5);
        r0.A2U.post(new X.C81103wT((java.lang.Object) r2, 34));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013c, code lost:
        r0.A2x.A04 = 0;
        r4 = r0.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        if (r4 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0144, code lost:
        r4.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0151, code lost:
        if (X.C36411kG.A1a(r0.A2x.A1D) == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0153, code lost:
        r4 = ((r31 - r0.A2U.getHeaderViewsCount()) + r32) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0161, code lost:
        if (r2.A03 == r4) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        if (r4 < 0) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0165, code lost:
        r2.A03 = r4;
        r13 = r0.A2x;
        r15 = r8.getItem(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x016d, code lost:
        if (r15 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016f, code lost:
        r14 = X.AnonymousClass001.A0I();
        r12 = r13.A1D;
        r17 = r12.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x017d, code lost:
        if (r17.hasNext() == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017f, code lost:
        r11 = X.C36391kE.A0l(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0189, code lost:
        if (r11.A1O > r15.A1O) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018b, code lost:
        r14.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0195, code lost:
        if (r11.A00() != 8) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0197, code lost:
        r0.A5Q.A03(0);
        r0.A2x.A03 = 0;
        X.C70803fk.A1P(r0, false);
        r5 = X.C36361kB.A0K(new android.view.animation.ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f), 0.0f, 1.0f);
        r5.setDuration(100);
        r0.A5Q.A01().startAnimation(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d5, code lost:
        if ((r31 + r4) < (r0.A2U.getHeaderViewsCount() + r10)) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ea, code lost:
        r13.A1D.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f4, code lost:
        if (r14.isEmpty() != false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f6, code lost:
        r12.removeAll(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f9, code lost:
        X.C40061uh.A08(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01fe, code lost:
        if (r0.A04 != 0) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0200, code lost:
        r11 = r0.A7D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0206, code lost:
        if (r11.isEmpty() != false) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0208, code lost:
        r12 = ((X.AnonymousClass36V) r11.peek()).A00;
        r4 = ((r31 - r0.A2U.getHeaderViewsCount()) + r32) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0220, code lost:
        if (r4 != r8.A04()) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0222, code lost:
        r4 = r4 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0224, code lost:
        if (r4 < 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0226, code lost:
        r3 = r8.getItem(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x022a, code lost:
        if (r3 == null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0232, code lost:
        if (r12.A1O > r3.A1O) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0234, code lost:
        r4 = r31 - r0.A2U.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0240, code lost:
        if (r4 != r8.A04()) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0242, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0244, code lost:
        if (r4 < 0) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0246, code lost:
        r3 = r8.getItem(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x024a, code lost:
        if (r3 == null) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0252, code lost:
        if (r12.A1O < r3.A1O) goto L_0x034e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r30, int r31, int r32, int r33) {
        /*
            r29 = this;
            r2 = r29
            X.3fk r0 = r2.A05
            X.1nd r8 = X.C70803fk.A0D(r0)
            boolean r1 = r8.A0C
            if (r1 == 0) goto L_0x03b3
            com.whatsapp.conversation.ConversationListView r6 = r0.A2U
            r1 = r31
            r6.A00 = r1
            r19 = r32
            int r7 = r31 + r32
            X.1nd r3 = r6.getConversationCursorAdapter()
            int r4 = r3.getCount()
            int r3 = r6.getHeaderViewsCount()
            int r4 = r4 + r3
            r5 = 0
            boolean r3 = X.C36371kC.A1T(r7, r4)
            r6.A0K = r3
            X.0v5 r4 = r6.A03
            boolean r3 = r4.A05()
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r4.A02()
            X.1HX r3 = (X.AnonymousClass1HX) r3
            X.1Hg r3 = r3.A00
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x0046
            boolean r3 = r6.A0B(r5)
            r6.A0K = r3
        L_0x0046:
            boolean r3 = r6.A0K
            if (r3 != 0) goto L_0x0053
            boolean r3 = r6.isInLayout()
            if (r3 != 0) goto L_0x0053
            r6.setTranscriptMode(r5)
        L_0x0053:
            X.1K3 r4 = X.AnonymousClass3B6.A00(r0)
            X.11F r3 = r0.A45
            boolean r3 = r4.BLD(r3)
            if (r3 == 0) goto L_0x00c4
            X.3B6 r3 = X.C70803fk.A0F(r0)
            X.005 r3 = r3.A09
            r3.get()
            X.28d r6 = r0.A2P
            android.view.Window r9 = X.C70803fk.A05(r0)
            com.whatsapp.conversation.ConversationListView r4 = r0.A2U
            X.C36321k7.A0x(r9, r4)
            boolean r3 = r6 instanceof X.C43312Gv
            if (r3 == 0) goto L_0x00c4
            int r3 = r4.getPaddingTop()
            if (r3 == 0) goto L_0x00c4
            boolean r10 = X.AnonymousClass1K4.A02(r4, r1)
            X.2Gv r6 = (X.C43312Gv) r6
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r5 = X.AnonymousClass28d.A00(r6)
            android.content.res.Configuration r3 = r6.A00
            if (r3 == 0) goto L_0x03ac
            int r3 = r3.orientation
            r6 = 2
            boolean r3 = X.AnonymousClass000.A1S(r3, r6)
            if (r3 != 0) goto L_0x00aa
            if (r10 == 0) goto L_0x01e6
            X.1K3 r4 = r5.A05
            com.whatsapp.jid.UserJid r3 = r5.A01
            boolean r3 = r4.BLC(r3)
            if (r3 == 0) goto L_0x01e6
            X.2nK r3 = X.C51132nK.CENTER
        L_0x00a2:
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel.A01(r3, r5)
            r5.A00 = r3
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel.A02(r5)
        L_0x00aa:
            android.view.View r9 = X.C36411kG.A0M(r9)
            X.5NC r9 = (X.AnonymousClass5NC) r9
            if (r9 == 0) goto L_0x00c4
            int r3 = r9.A07
            if (r3 == r6) goto L_0x00c4
            int r4 = r9.A04
            r3 = 1
            boolean r5 = X.AnonymousClass000.A1R(r4)
            r4 = r5 ^ 1
            if (r10 == 0) goto L_0x01d9
            X.AnonymousClass5NC.A03(r9, r3, r4)
        L_0x00c4:
            int r10 = r8.getCount()
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r4 = r3.getAdjustedVisibleItemCount()
            int r4 = r4 + r32
            X.3B6 r3 = X.C70803fk.A0F(r0)
            X.1Hg r3 = r3.A02
            boolean r3 = r3.A00()
            r12 = 0
            if (r3 == 0) goto L_0x01cc
            android.content.res.Resources r4 = X.C70803fk.A04(r0)
            r3 = 2131168384(0x7f070c80, float:1.7951068E38)
            int r4 = r4.getDimensionPixelOffset(r3)
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            if (r3 == 0) goto L_0x00f2
            boolean r3 = r3.A0B(r4)
            if (r3 != 0) goto L_0x00f6
        L_0x00f2:
            boolean r3 = r0.A6O
            if (r3 == 0) goto L_0x00f7
        L_0x00f6:
            r12 = 1
        L_0x00f7:
            r3 = 100
            r6 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r18 = 1
            X.1RJ r11 = r0.A5Q
            if (r12 == 0) goto L_0x018f
            int r11 = r11.A00()
            if (r11 != 0) goto L_0x013c
            r22 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
            r21 = 1065353216(0x3f800000, float:1.0)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1056964608(0x3f000000, float:0.5)
            r25 = 1
            r26 = 1056964608(0x3f000000, float:0.5)
            r27 = 1
            r28 = 1056964608(0x3f000000, float:0.5)
            r20 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            android.view.animation.AnimationSet r5 = X.C36361kB.A0K(r11, r5, r6)
            r5.setDuration(r3)
            X.1RJ r3 = r0.A5Q
            android.view.View r3 = r3.A01()
            r3.startAnimation(r5)
            com.whatsapp.conversation.ConversationListView r5 = r0.A2U
            r4 = 34
            X.3wT r3 = new X.3wT
            r3.<init>((java.lang.Object) r2, (int) r4)
            r5.post(r3)
        L_0x013c:
            X.1uh r3 = r0.A2x
            r3.A04 = r9
            android.widget.TextView r4 = r0.A0g
            if (r4 == 0) goto L_0x0149
            r3 = 8
            r4.setVisibility(r3)
        L_0x0149:
            X.1uh r3 = r0.A2x
            java.util.ArrayList r3 = r3.A1D
            boolean r3 = X.C36411kG.A1a(r3)
            if (r3 == 0) goto L_0x01fc
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r4 = r31 - r3
            int r4 = r4 + r32
            int r4 = r4 - r18
            int r3 = r2.A03
            if (r3 == r4) goto L_0x01fc
            if (r4 < 0) goto L_0x01fc
            r2.A03 = r4
            X.1uh r13 = r0.A2x
            X.3T1 r15 = r8.getItem(r4)
            if (r15 == 0) goto L_0x01ea
            java.util.ArrayList r14 = X.AnonymousClass001.A0I()
            java.util.ArrayList r12 = r13.A1D
            java.util.Iterator r17 = r12.iterator()
        L_0x0179:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x01f0
            X.3T1 r11 = X.C36391kE.A0l(r17)
            long r5 = r11.A1O
            long r3 = r15.A1O
            int r16 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r16 > 0) goto L_0x0179
            r14.add(r11)
            goto L_0x0179
        L_0x018f:
            int r12 = r11.A00()
            r11 = 8
            if (r12 != r11) goto L_0x0149
            X.1RJ r11 = r0.A5Q
            r11.A03(r9)
            X.1uh r11 = r0.A2x
            r11.A03 = r9
            X.C70803fk.A1P(r0, r9)
            r21 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1056964608(0x3f000000, float:0.5)
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 1
            r26 = 1056964608(0x3f000000, float:0.5)
            r27 = 1
            r28 = 1056964608(0x3f000000, float:0.5)
            r20 = r11
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            android.view.animation.AnimationSet r5 = X.C36361kB.A0K(r11, r6, r5)
            r5.setDuration(r3)
            X.1RJ r3 = r0.A5Q
            android.view.View r3 = r3.A01()
            r3.startAnimation(r5)
            goto L_0x0149
        L_0x01cc:
            int r4 = r31 + r4
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r3 = r3 + r10
            if (r4 >= r3) goto L_0x00f6
            goto L_0x00f2
        L_0x01d9:
            boolean r3 = X.AnonymousClass5NC.A06(r9)
            if (r3 != 0) goto L_0x01e1
            if (r5 != 0) goto L_0x00c4
        L_0x01e1:
            X.AnonymousClass5NC.A03(r9, r6, r4)
            goto L_0x00c4
        L_0x01e6:
            X.2nK r3 = X.C51132nK.END
            goto L_0x00a2
        L_0x01ea:
            java.util.ArrayList r3 = r13.A1D
            r3.clear()
            goto L_0x01f9
        L_0x01f0:
            boolean r3 = r14.isEmpty()
            if (r3 != 0) goto L_0x01f9
            r12.removeAll(r14)
        L_0x01f9:
            X.C40061uh.A08(r13)
        L_0x01fc:
            int r3 = r0.A04
            if (r3 != 0) goto L_0x0254
            java.util.Stack r11 = r0.A7D
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x0254
            java.lang.Object r3 = r11.peek()
            X.36V r3 = (X.AnonymousClass36V) r3
            X.3T1 r12 = r3.A00
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r4 = r31 - r3
            int r4 = r4 + r32
            int r4 = r4 - r18
            int r3 = r8.A04()
            if (r4 != r3) goto L_0x0224
            int r4 = r4 + -1
        L_0x0224:
            if (r4 < 0) goto L_0x034e
            X.3T1 r3 = r8.getItem(r4)
            if (r3 == 0) goto L_0x034e
            long r5 = r12.A1O
            long r3 = r3.A1O
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 > 0) goto L_0x034e
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r4 = r31 - r3
            int r3 = r8.A04()
            if (r4 != r3) goto L_0x0244
            int r4 = r4 + 1
        L_0x0244:
            if (r4 < 0) goto L_0x0254
            X.3T1 r3 = r8.getItem(r4)
            if (r3 == 0) goto L_0x034e
            long r5 = r12.A1O
            long r3 = r3.A1O
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 < 0) goto L_0x034e
        L_0x0254:
            int r3 = r0.A04
            if (r3 == 0) goto L_0x034b
            int r3 = r2.A02
            if (r3 == r1) goto L_0x034b
            if (r32 == 0) goto L_0x0385
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r3 = r31 - r3
            if (r3 < 0) goto L_0x0343
            X.3T1 r8 = r8.getItem(r3)
            if (r8 == 0) goto L_0x0343
            long r5 = r8.A0I
            X.4V6 r3 = r0.A2l
            r3.getTime()
            long r3 = java.lang.System.currentTimeMillis()
            boolean r3 = X.AnonymousClass6XI.A04(r5, r3)
            if (r3 != 0) goto L_0x0343
            X.1RJ r3 = r0.A5M
            android.widget.TextView r5 = X.C36441kJ.A0V(r3)
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            boolean r3 = r3.getClipToPadding()
            if (r3 == 0) goto L_0x0297
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getPaddingTop()
            float r3 = (float) r3
            r5.setY(r3)
        L_0x0297:
            X.4V6 r3 = r0.A2l
            r3.getTime()
            X.0ts r6 = r0.A36
            long r3 = r8.A0I
            java.lang.String r3 = X.AnonymousClass3UY.A0E(r6, r3)
            r5.setText(r3)
            X.3Jc r4 = r0.A2S
            X.4V6 r3 = r0.A2l
            android.content.res.Resources r3 = r3.getResources()
            float r3 = r4.A01(r3)
            r5.setTextSize(r3)
            int r3 = r5.getVisibility()
            if (r3 == 0) goto L_0x02ea
            r5.setVisibility(r9)
            X.1K3 r4 = X.AnonymousClass3B6.A00(r0)
            X.11F r3 = r0.A45
            boolean r3 = r4.BLD(r3)
            if (r3 != 0) goto L_0x02ea
            r22 = 0
            r26 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r21 = 1
            r23 = 1
            r24 = 0
            r25 = 1
            r27 = 1
            r28 = 0
            r20 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r3 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r3)
            r5.startAnimation(r6)
        L_0x02ea:
            int r11 = r2.A04
            if (r11 == 0) goto L_0x0385
            int r8 = r2.A02
            int r3 = r2.A01
            if (r3 != 0) goto L_0x02f7
            r2.A01 = r10
            r3 = r10
        L_0x02f7:
            if (r3 >= r10) goto L_0x02fe
            int r3 = r10 - r3
            int r8 = r8 + r3
            r2.A01 = r10
        L_0x02fe:
            int r7 = r7 - r18
            int r11 = r11 + r8
            int r11 = r11 - r18
            if (r8 >= r1) goto L_0x0337
            if (r1 > r11) goto L_0x0337
            int r11 = r31 + -1
        L_0x0309:
            X.1nd r6 = X.C70803fk.A0D(r0)
            int r12 = r6.getCount()
        L_0x0311:
            if (r8 > r11) goto L_0x0353
            com.whatsapp.conversation.ConversationListView r3 = r0.A2U
            int r3 = r3.getHeaderViewsCount()
            int r4 = r8 - r3
            if (r4 < 0) goto L_0x0334
            int r3 = r12 + -1
            if (r4 > r3) goto L_0x0334
            X.3T1 r5 = r6.getItem(r4)
            if (r5 == 0) goto L_0x0334
            int r4 = r5.A1I
            r3 = 13
            if (r4 != r3) goto L_0x0334
            X.4V6 r4 = r0.A2l
            X.3Qa r3 = r5.A1J
            r4.B5S(r3)
        L_0x0334:
            int r8 = r8 + 1
            goto L_0x0311
        L_0x0337:
            if (r7 >= r11) goto L_0x033e
            if (r8 > r7) goto L_0x033e
            int r8 = r7 + 1
            goto L_0x0309
        L_0x033e:
            if (r7 < r8) goto L_0x0309
            if (r1 <= r11) goto L_0x0353
            goto L_0x0309
        L_0x0343:
            X.1RJ r4 = r0.A5M
            r3 = 8
            r4.A03(r3)
            goto L_0x02ea
        L_0x034b:
            if (r32 == 0) goto L_0x0385
            goto L_0x02ea
        L_0x034e:
            r11.clear()
            goto L_0x0254
        L_0x0353:
            java.lang.Boolean r3 = r0.A7a
            if (r3 != 0) goto L_0x0368
            X.0yC r5 = r0.A3n
            X.0yV r4 = X.C21000yV.A01
            r3 = 7693(0x1e0d, float:1.078E-41)
            boolean r3 = X.C20800yB.A01(r4, r5, r3)
            if (r3 == 0) goto L_0x0374
            boolean r3 = r2.A00
            if (r3 == 0) goto L_0x0374
            return
        L_0x0368:
            java.lang.Boolean r3 = r0.A7a
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0385
            A00(r2, r1, r7)
            goto L_0x0385
        L_0x0374:
            r3 = r18
            r2.A00 = r3
            X.0wU r5 = X.C70803fk.A0K(r0)
            r4 = 3
            X.3vG r3 = new X.3vG
            r3.<init>(r2, r1, r7, r4)
            r5.Boy(r3)
        L_0x0385:
            int r3 = r2.A02
            if (r3 == r1) goto L_0x0393
            int r3 = r0.A04
            if (r3 == 0) goto L_0x0393
            long r3 = java.lang.System.currentTimeMillis()
            X.C52952qR.A00 = r3
        L_0x0393:
            r2.A02 = r1
            r3 = r19
            r2.A04 = r3
            X.1uh r4 = r0.A2x
            long r2 = (long) r1
            r4.A08 = r2
            r0 = 100
            int r0 = java.lang.Math.min(r0, r10)
            int r0 = r0 / 2
            if (r1 >= r0) goto L_0x03b3
            r4.A0b(r9)
            return
        L_0x03ac:
            java.lang.String r0 = "currentConfig"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67323Zj.onScroll(android.widget.AbsListView, int, int, int):void");
    }
}
