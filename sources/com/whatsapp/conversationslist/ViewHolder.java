package com.whatsapp.conversationslist;

import X.AnonymousClass000;
import X.AnonymousClass00N;
import X.AnonymousClass171;
import X.AnonymousClass1JZ;
import X.AnonymousClass1RJ;
import X.AnonymousClass1RY;
import X.AnonymousClass3TD;
import X.AnonymousClass5S3;
import X.AnonymousClass6K4;
import X.AnonymousClass7gQ;
import X.AnonymousClass9DN;
import X.AnonymousClass9DO;
import X.AnonymousClass9DP;
import X.AnonymousClass9DQ;
import X.C012005e;
import X.C164667sB;
import X.C18820ts;
import X.C19460v5;
import X.C19630wG;
import X.C200229gu;
import X.C201679k6;
import X.C20810yC;
import X.C220712t;
import X.C28251Rx;
import X.C33301f4;
import X.C33511fU;
import X.C36341k9;
import X.C36391kE;
import X.C36401kF;
import X.C50912mq;
import X.C65783Tl;
import X.C97024oH;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.components.ConversationListRowHeaderView;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

public class ViewHolder extends C97024oH implements AnonymousClass00N {
    public C201679k6 A00;
    public AnonymousClass7gQ A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewStub A06;
    public final ImageView A07;
    public final ImageView A08;
    public final ImageView A09;
    public final TextView A0A;
    public final AnonymousClass9DO A0B;
    public final AnonymousClass9DP A0C;
    public final TextEmojiLabel A0D;
    public final TextEmojiLabel A0E;
    public final AnonymousClass1RY A0F;
    public final C200229gu A0G;
    public final C33301f4 A0H;
    public final C28251Rx A0I;
    public final C18820ts A0J;
    public final C20810yC A0K;
    public final C65783Tl A0L;
    public final AnonymousClass1RJ A0M;
    public final AnonymousClass1RJ A0N;
    public final AnonymousClass1RJ A0O;
    public final AnonymousClass1RJ A0P;
    public final AnonymousClass1RJ A0Q;
    public final AnonymousClass1RJ A0R;
    public final AnonymousClass1RJ A0S;
    public final AnonymousClass1RJ A0T;
    public final AnonymousClass1RJ A0U;
    public final AnonymousClass1RJ A0V;
    public final AnonymousClass1RJ A0W;
    public final AnonymousClass1RJ A0X;
    public final AnonymousClass1RJ A0Y;
    public final AnonymousClass6K4 A0Z = new C50912mq();
    public final AnonymousClass9DN A0a;
    public final AnonymousClass9DQ A0b;
    public final C220712t A0c;
    public final AnonymousClass1RJ A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        if (r3.A0E(7887) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(X.AnonymousClass7gQ r64, X.C34211gd r65, X.C61953Ed r66, int r67, int r68, boolean r69, boolean r70) {
        /*
            r63 = this;
            r61 = r67
            r1 = r63
            android.content.Context r16 = X.C36441kJ.A0F(r1)
            X.7gQ r2 = r1.A01
            r4 = r64
            boolean r0 = X.C1901797e.A00(r2, r4)
            if (r0 != 0) goto L_0x0028
            X.0yC r3 = r1.A0K
            r0 = 7887(0x1ecf, float:1.1052E-41)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2 instanceof X.C132056Ry
            if (r0 == 0) goto L_0x0040
            X.6Ry r2 = (X.C132056Ry) r2
            boolean r0 = X.C132056Ry.A01(r2, r4)
            if (r0 == 0) goto L_0x0040
        L_0x0028:
            X.0yC r3 = r1.A0K
            r0 = 7887(0x1ecf, float:1.1052E-41)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x0049
        L_0x0032:
            X.9k6 r2 = r1.A00
            X.7gQ r0 = r1.A01
            r4 = r65
            r3 = r68
            r1 = r69
            r2.A0T(r0, r4, r3, r1)
            return
        L_0x0040:
            X.9k6 r0 = r1.A00
            if (r0 == 0) goto L_0x0047
            r0.A0R()
        L_0x0047:
            r1.A01 = r4
        L_0x0049:
            X.9k6 r2 = r1.A00
            if (r2 == 0) goto L_0x0057
            X.6C3 r0 = r2.A00
            if (r0 == 0) goto L_0x0057
            r0.A02()
            r0 = 0
            r2.A00 = r0
        L_0x0057:
            android.widget.ImageView r2 = r1.A07
            r0 = 0
            r2.setTag(r0)
            r0 = 3580(0xdfc, float:5.017E-42)
            boolean r0 = r3.A0E(r0)
            r56 = r66
            r62 = r70
            if (r0 == 0) goto L_0x029b
            boolean r0 = r4 instanceof X.C106465Ju
            if (r0 == 0) goto L_0x029b
            r61 = 7
        L_0x006f:
            r0 = 7110(0x1bc6, float:9.963E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x018a
            X.9DO r2 = r1.A0B
            X.1Rx r0 = r1.A0I
            r23 = r0
            X.1f4 r0 = r1.A0H
            r21 = r0
            X.1RY r0 = r1.A0F
            r28 = r0
            X.3Tl r0 = r1.A0L
            r18 = r0
            X.1Mz r0 = r2.A00
            X.0tq r0 = r0.A01
            X.0wo r33 = X.C36351kA.A0V(r0)
            X.0yC r45 = X.C36341k9.A0V(r0)
            X.17Y r19 = X.C36351kA.A0M(r0)
            X.004 r2 = r0.A4r
            java.lang.Object r14 = r2.get()
            X.1Sj r14 = (X.C28371Sj) r14
            X.0wQ r20 = X.C36351kA.A0N(r0)
            X.0wG r34 = X.C36351kA.A0W(r0)
            X.0wU r59 = X.C36341k9.A0Z(r0)
            X.004 r2 = r0.A0y
            java.lang.Object r13 = r2.get()
            X.1HX r13 = (X.AnonymousClass1HX) r13
            X.12q r39 = X.C36351kA.A0a(r0)
            X.0xf r46 = r0.AzV()
            X.1FR r53 = X.C36431kI.A0p(r0)
            X.1Pp r25 = X.C36361kB.A0V(r0)
            X.16D r26 = X.C36341k9.A0R(r0)
            X.004 r2 = r0.A2G
            java.lang.Object r12 = r2.get()
            X.1dv r12 = (X.C32621dv) r12
            X.004 r2 = r0.A2R
            java.lang.Object r11 = r2.get()
            X.165 r11 = (X.AnonymousClass165) r11
            X.0yb r32 = X.C36351kA.A0U(r0)
            X.171 r27 = X.C36341k9.A0S(r0)
            X.0ts r36 = X.C36341k9.A0T(r0)
            X.1EM r57 = X.C36371kC.A0l(r0)
            X.1EU r52 = X.C36381kD.A0f(r0)
            X.1NG r22 = X.C36381kD.A0V(r0)
            X.004 r2 = r0.A4O
            java.lang.Object r10 = r2.get()
            X.1Cv r10 = (X.C24541Cv) r10
            X.1EL r47 = X.C36381kD.A0d(r0)
            X.004 r2 = r0.A1O
            java.lang.Object r9 = r2.get()
            X.1HJ r9 = (X.AnonymousClass1HJ) r9
            X.1CR r55 = X.C36371kC.A0j(r0)
            X.004 r2 = r0.A4s
            java.lang.Object r8 = r2.get()
            X.1Jd r8 = (X.C26171Jd) r8
            X.004 r2 = r0.A7p
            java.lang.Object r7 = r2.get()
            X.1LU r7 = (X.AnonymousClass1LU) r7
            X.0v0 r35 = X.C36351kA.A0Y(r0)
            X.004 r2 = r0.A1q
            java.lang.Object r6 = r2.get()
            X.1LV r6 = (X.AnonymousClass1LV) r6
            X.004 r2 = r0.A4M
            java.lang.Object r5 = r2.get()
            X.1HO r5 = (X.AnonymousClass1HO) r5
            X.1EV r51 = X.C36371kC.A0h(r0)
            X.004 r2 = r0.A8V
            java.lang.Object r4 = r2.get()
            X.1T1 r4 = (X.AnonymousClass1T1) r4
            X.0v6 r17 = X.C19470v6.A00
            X.004 r2 = r0.A4H
            java.lang.Object r3 = r2.get()
            X.1AW r3 = (X.AnonymousClass1AW) r3
            X.1eG r49 = r0.AzZ()
            X.004 r2 = r0.A4K
            java.lang.Object r2 = r2.get()
            X.1eR r2 = (X.C32931eR) r2
            X.004 r15 = r0.A1M
            X.005 r60 = X.C18840tu.A00(r15)
            X.004 r0 = r0.A1b
            java.lang.Object r0 = r0.get()
            X.12t r0 = (X.C220712t) r0
            X.8a4 r15 = new X.8a4
            r29 = r21
            r30 = r23
            r31 = r1
            r37 = r9
            r38 = r0
            r40 = r11
            r41 = r5
            r42 = r10
            r43 = r8
            r44 = r7
            r48 = r2
            r50 = r14
            r54 = r3
            r58 = r18
            r18 = r12
            r21 = r4
            r23 = r13
            r24 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
        L_0x0186:
            r1.A00 = r15
            goto L_0x0032
        L_0x018a:
            X.9DP r2 = r1.A0C
            X.1f4 r0 = r1.A0H
            r23 = r0
            X.1Rx r0 = r1.A0I
            r21 = r0
            X.1RY r0 = r1.A0F
            r28 = r0
            X.3Tl r0 = r1.A0L
            r18 = r0
            X.1Mz r0 = r2.A00
            X.0tq r0 = r0.A01
            X.0wo r33 = X.C36351kA.A0V(r0)
            X.0yC r45 = X.C36341k9.A0V(r0)
            X.17Y r19 = X.C36351kA.A0M(r0)
            X.004 r2 = r0.A4r
            java.lang.Object r14 = r2.get()
            X.1Sj r14 = (X.C28371Sj) r14
            X.0wQ r20 = X.C36351kA.A0N(r0)
            X.0wG r34 = X.C36351kA.A0W(r0)
            X.0wU r59 = X.C36341k9.A0Z(r0)
            X.004 r2 = r0.A0y
            java.lang.Object r13 = r2.get()
            X.1HX r13 = (X.AnonymousClass1HX) r13
            X.12q r39 = X.C36351kA.A0a(r0)
            X.0xf r46 = r0.AzV()
            X.1FR r53 = X.C36431kI.A0p(r0)
            X.1Pp r25 = X.C36361kB.A0V(r0)
            X.16D r26 = X.C36341k9.A0R(r0)
            X.004 r2 = r0.A2G
            java.lang.Object r12 = r2.get()
            X.1dv r12 = (X.C32621dv) r12
            X.004 r2 = r0.A2R
            java.lang.Object r11 = r2.get()
            X.165 r11 = (X.AnonymousClass165) r11
            X.0yb r32 = X.C36351kA.A0U(r0)
            X.171 r27 = X.C36341k9.A0S(r0)
            X.0ts r36 = X.C36341k9.A0T(r0)
            X.1EM r57 = X.C36371kC.A0l(r0)
            X.1EU r52 = X.C36381kD.A0f(r0)
            X.1NG r22 = X.C36381kD.A0V(r0)
            X.004 r2 = r0.A4O
            java.lang.Object r10 = r2.get()
            X.1Cv r10 = (X.C24541Cv) r10
            X.1EL r47 = X.C36381kD.A0d(r0)
            X.004 r2 = r0.A1O
            java.lang.Object r9 = r2.get()
            X.1HJ r9 = (X.AnonymousClass1HJ) r9
            X.1CR r55 = X.C36371kC.A0j(r0)
            X.004 r2 = r0.A4s
            java.lang.Object r8 = r2.get()
            X.1Jd r8 = (X.C26171Jd) r8
            X.004 r2 = r0.A7p
            java.lang.Object r7 = r2.get()
            X.1LU r7 = (X.AnonymousClass1LU) r7
            X.0v0 r35 = X.C36351kA.A0Y(r0)
            X.004 r2 = r0.A1q
            java.lang.Object r6 = r2.get()
            X.1LV r6 = (X.AnonymousClass1LV) r6
            X.004 r2 = r0.A4M
            java.lang.Object r5 = r2.get()
            X.1HO r5 = (X.AnonymousClass1HO) r5
            X.1EV r51 = X.C36371kC.A0h(r0)
            X.004 r2 = r0.A8V
            java.lang.Object r4 = r2.get()
            X.1T1 r4 = (X.AnonymousClass1T1) r4
            X.0v6 r17 = X.C19470v6.A00
            X.004 r2 = r0.A4H
            java.lang.Object r3 = r2.get()
            X.1AW r3 = (X.AnonymousClass1AW) r3
            X.1eG r49 = r0.AzZ()
            X.004 r2 = r0.A4K
            java.lang.Object r2 = r2.get()
            X.1eR r2 = (X.C32931eR) r2
            X.004 r15 = r0.A1M
            X.005 r60 = X.C18840tu.A00(r15)
            X.004 r0 = r0.A1b
            java.lang.Object r0 = r0.get()
            X.12t r0 = (X.C220712t) r0
            X.8a3 r15 = new X.8a3
            r29 = r23
            r30 = r21
            r31 = r1
            r37 = r9
            r38 = r0
            r40 = r11
            r41 = r5
            r42 = r10
            r43 = r8
            r44 = r7
            r48 = r2
            r50 = r14
            r54 = r3
            r58 = r18
            r18 = r12
            r21 = r4
            r23 = r13
            r24 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            goto L_0x0186
        L_0x029b:
            boolean r0 = r4 instanceof X.C106475Jv
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4 instanceof X.C106455Jt
            if (r0 == 0) goto L_0x0334
            X.9DQ r0 = r1.A0b
            X.3Tl r8 = r1.A0L
            X.1RY r7 = r1.A0F
            X.1Rx r6 = r1.A0I
            X.1Mz r0 = r0.A00
            X.0tq r0 = r0.A01
            X.0wG r27 = X.C36351kA.A0W(r0)
            X.0wo r26 = X.C36351kA.A0V(r0)
            X.0yC r31 = X.C36341k9.A0V(r0)
            X.004 r2 = r0.A4r
            java.lang.Object r5 = r2.get()
            X.1Sj r5 = (X.C28371Sj) r5
            X.0wQ r17 = X.C36351kA.A0N(r0)
            X.12q r29 = X.C36351kA.A0a(r0)
            X.0xf r32 = r0.AzV()
            X.1FR r37 = X.C36431kI.A0p(r0)
            X.16D r20 = X.C36341k9.A0R(r0)
            X.004 r2 = r0.A2R
            java.lang.Object r4 = r2.get()
            X.165 r4 = (X.AnonymousClass165) r4
            X.0yb r25 = X.C36351kA.A0U(r0)
            X.171 r21 = X.C36341k9.A0S(r0)
            X.0ts r28 = X.C36341k9.A0T(r0)
            X.1EM r41 = X.C36371kC.A0l(r0)
            X.1EU r36 = X.C36381kD.A0f(r0)
            X.1NG r19 = X.C36381kD.A0V(r0)
            X.1EL r33 = X.C36381kD.A0d(r0)
            X.1CR r39 = X.C36371kC.A0j(r0)
            X.1EV r35 = X.C36371kC.A0h(r0)
            X.004 r2 = r0.A8V
            java.lang.Object r3 = r2.get()
            X.1T1 r3 = (X.AnonymousClass1T1) r3
            X.004 r2 = r0.A4H
            java.lang.Object r2 = r2.get()
            X.1AW r2 = (X.AnonymousClass1AW) r2
            X.004 r0 = r0.A1M
            X.005 r43 = X.C18840tu.A00(r0)
            X.8a2 r15 = new X.8a2
            r18 = r3
            r22 = r7
            r23 = r6
            r24 = r1
            r30 = r4
            r34 = r5
            r38 = r2
            r40 = r56
            r42 = r8
            r44 = r62
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            goto L_0x0186
        L_0x0334:
            boolean r0 = r4 instanceof X.C106445Js
            if (r0 == 0) goto L_0x0032
            X.9DN r0 = r1.A0a
            X.3Tl r8 = r1.A0L
            X.1f4 r7 = r1.A0H
            X.1Rx r6 = r1.A0I
            X.1Mz r0 = r0.A00
            X.0tq r0 = r0.A01
            X.004 r2 = r0.A4H
            java.lang.Object r5 = r2.get()
            X.1AW r5 = (X.AnonymousClass1AW) r5
            X.0wG r27 = X.C36351kA.A0W(r0)
            X.0wo r26 = X.C36351kA.A0V(r0)
            X.0yC r31 = X.C36341k9.A0V(r0)
            X.004 r2 = r0.A4r
            java.lang.Object r4 = r2.get()
            X.1Sj r4 = (X.C28371Sj) r4
            X.0wQ r17 = X.C36351kA.A0N(r0)
            X.12q r29 = X.C36351kA.A0a(r0)
            X.0xf r32 = r0.AzV()
            X.1FR r37 = X.C36431kI.A0p(r0)
            X.16D r20 = X.C36341k9.A0R(r0)
            X.004 r2 = r0.A2R
            java.lang.Object r3 = r2.get()
            X.165 r3 = (X.AnonymousClass165) r3
            X.0yb r25 = X.C36351kA.A0U(r0)
            X.171 r21 = X.C36341k9.A0S(r0)
            X.0ts r28 = X.C36341k9.A0T(r0)
            X.1EM r39 = X.C36371kC.A0l(r0)
            X.1EU r36 = X.C36381kD.A0f(r0)
            X.1NG r19 = X.C36381kD.A0V(r0)
            X.1EL r33 = X.C36381kD.A0d(r0)
            X.1EV r35 = X.C36371kC.A0h(r0)
            X.004 r2 = r0.A8V
            java.lang.Object r2 = r2.get()
            X.1T1 r2 = (X.AnonymousClass1T1) r2
            X.004 r0 = r0.A1M
            X.005 r41 = X.C18840tu.A00(r0)
            X.8a1 r15 = new X.8a1
            r18 = r2
            r22 = r7
            r23 = r6
            r24 = r1
            r30 = r3
            r34 = r4
            r38 = r5
            r40 = r8
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            goto L_0x0186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ViewHolder.A0G(X.7gQ, X.1gd, X.3Ed, int, int, boolean, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(boolean r5, int r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x000a
            if (r6 != 0) goto L_0x0029
            android.view.View r0 = r4.A04
            X.C34081gQ.A03(r0)
            return
        L_0x000a:
            if (r6 != 0) goto L_0x0029
            X.7gQ r2 = r4.A01
            boolean r0 = r2 instanceof X.C106475Jv
            if (r0 == 0) goto L_0x0044
            X.1Rx r1 = r4.A0I
            X.5Jv r2 = (X.C106475Jv) r2
            X.11F r0 = r2.BDC()
            boolean r0 = r1.BLN(r0)
            if (r0 == 0) goto L_0x0044
            android.view.View r3 = r4.A04
            r0 = 2131231307(0x7f08024b, float:1.8078691E38)
        L_0x0025:
            r3.setBackgroundResource(r0)
            return
        L_0x0029:
            r0 = 1
            android.view.View r3 = r4.A04
            android.content.Context r2 = r3.getContext()
            if (r6 != r0) goto L_0x003d
            r1 = 2130969050(0x7f0401da, float:1.754677E38)
            r0 = 2131100146(0x7f0601f2, float:1.7812665E38)
        L_0x0038:
            int r0 = X.C224514j.A00(r2, r1, r0)
            goto L_0x0025
        L_0x003d:
            r1 = 2130969781(0x7f0404b5, float:1.7548254E38)
            r0 = 2131101050(0x7f06057a, float:1.7814499E38)
            goto L_0x0038
        L_0x0044:
            android.view.View r0 = r4.A04
            X.C34081gQ.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ViewHolder.A0H(boolean, int):void");
    }

    public void A0I(boolean z, int i) {
        AnonymousClass6K4 r0;
        if (this.A0Y.A00() != 0) {
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) this.A07;
            AnonymousClass6K4 r1 = wDSProfilePhoto.A03;
            if ((r1 instanceof C50912mq) && !z) {
                r0 = null;
            } else if (r1 == null && z) {
                r0 = this.A0Z;
            }
            wDSProfilePhoto.setProfileBadge(r0);
        } else if (z) {
            AnonymousClass1RJ r2 = this.A0d;
            C36391kE.A0L(r2, 0).setContentDescription(AnonymousClass3TD.A02(this.A0J, i));
            ((ImageView) r2.A01()).setImageResource(R.drawable.ic_chatlist_ephemeral_v2);
            return;
        }
        this.A0d.A03(8);
    }

    public void A0J(boolean z, boolean z2) {
        AnonymousClass5S3 r1;
        int i = 8;
        if (this.A0Y.A00() == 0) {
            AnonymousClass1RJ r12 = this.A0V;
            ((SelectionCheckView) r12.A01()).A04(z, z2);
            if (z) {
                i = 0;
            }
            r12.A03(i);
            return;
        }
        if (z) {
            r1 = AnonymousClass5S3.CHECKED;
        } else {
            r1 = AnonymousClass5S3.NONE;
        }
        ((WDSProfilePhoto) this.A07).A00(r1, z2);
        this.A0V.A03(8);
    }

    public ViewHolder(Context context, View view, C19460v5 r13, AnonymousClass9DN r14, AnonymousClass9DO r15, AnonymousClass9DP r16, AnonymousClass9DQ r17, AnonymousClass171 r18, AnonymousClass1RY r19, C33301f4 r20, C28251Rx r21, C19630wG r22, C18820ts r23, C220712t r24, C20810yC r25, C65783Tl r26) {
        super(view);
        C20810yC r9 = r25;
        this.A0K = r9;
        C18820ts r8 = r23;
        this.A0J = r8;
        this.A0L = r26;
        this.A0F = r19;
        this.A0H = r20;
        this.A0I = r21;
        this.A0c = r24;
        this.A0a = r14;
        this.A0B = r15;
        this.A0C = r16;
        this.A06 = (ViewStub) C012005e.A02(view, R.id.conversation_row_label_view_stub);
        this.A0b = r17;
        C200229gu r3 = new C200229gu(r22.A00, r13, (ConversationListRowHeaderView) C012005e.A02(view, R.id.conversations_row_header), r18, r8, r9);
        this.A0G = r3;
        this.A04 = C012005e.A02(view, R.id.contact_row_container);
        C33511fU.A03(r3.A04.A01);
        this.A0U = C36341k9.A0X(view, R.id.progressbar_small);
        this.A07 = C36401kF.A0G(view, R.id.contact_photo);
        this.A05 = C012005e.A02(view, R.id.hover_action);
        this.A0Y = C36341k9.A0X(view, R.id.subgroup_contact_photo);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        View A022 = C012005e.A02(view, R.id.conversations_row_ephemeral_status);
        ViewGroup.MarginLayoutParams A0a2 = AnonymousClass000.A0a(A022);
        A0a2.width = dimensionPixelSize2;
        A0a2.height = dimensionPixelSize2;
        A0a2.topMargin = dimensionPixelSize;
        A022.setLayoutParams(A0a2);
        this.A0O = C36341k9.A0X(view, R.id.parent_stack_photo);
        this.A03 = C012005e.A02(view, R.id.contact_selector);
        this.A0D = C36401kF.A0O(view, R.id.single_msg_tv);
        this.A02 = C012005e.A02(view, R.id.bottom_row);
        this.A0E = C36401kF.A0O(view, R.id.msg_from_tv);
        this.A0W = C36341k9.A0X(view, R.id.conversation_row_single_subgroup_bullet);
        this.A0Q = C36341k9.A0X(view, R.id.conversations_row_unseen_important_message_indicator);
        TextView A0O2 = C36391kE.A0O(view, R.id.conversations_row_message_count);
        this.A0A = A0O2;
        this.A0P = C36341k9.A0X(view, R.id.community_unread_indicator);
        this.A09 = C36401kF.A0G(view, R.id.status_indicator);
        this.A0X = C36341k9.A0X(view, R.id.status_reply_indicator);
        this.A08 = C36401kF.A0G(view, R.id.message_type_indicator);
        this.A0S = C36341k9.A0X(view, R.id.payments_indicator);
        this.A0R = C36341k9.A0X(view, R.id.mute_indicator);
        this.A0T = C36341k9.A0X(view, R.id.pin_indicator);
        this.A0R.A07(new C164667sB(this, context, 1));
        this.A0T.A07(new C164667sB(this, context, 2));
        if (r9.A0E(363)) {
            AnonymousClass1JZ.A03(A0O2, context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
        }
        this.A0M = C36341k9.A0X(view, R.id.archived_indicator);
        this.A0V = C36341k9.A0X(view, R.id.selection_check);
        this.A0d = C36341k9.A0X(view, R.id.conversations_row_ephemeral_status);
        this.A0N = C36341k9.A0X(view, R.id.conversations_row_call_type_indicator);
    }
}
