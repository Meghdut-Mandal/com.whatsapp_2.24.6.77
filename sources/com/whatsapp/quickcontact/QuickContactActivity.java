package com.whatsapp.quickcontact;

import X.AnonymousClass005;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass190;
import X.AnonymousClass1CF;
import X.AnonymousClass1EM;
import X.AnonymousClass1FR;
import X.AnonymousClass1HJ;
import X.AnonymousClass1HO;
import X.AnonymousClass1HP;
import X.AnonymousClass1LI;
import X.AnonymousClass1LV;
import X.AnonymousClass1MK;
import X.AnonymousClass1ND;
import X.AnonymousClass1NK;
import X.AnonymousClass1P5;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass1T4;
import X.AnonymousClass2XH;
import X.AnonymousClass3EV;
import X.AnonymousClass3KV;
import X.AnonymousClass3QZ;
import X.AnonymousClass3U9;
import X.AnonymousClass4W3;
import X.AnonymousClass4YF;
import X.AnonymousClass4YG;
import X.AnonymousClass4YS;
import X.AnonymousClass5Ng;
import X.C011004s;
import X.C05290Pd;
import X.C107265Nh;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C18950u5;
import X.C19430v1;
import X.C19460v5;
import X.C19470v6;
import X.C20230xE;
import X.C20430xY;
import X.C20500xf;
import X.C21710zg;
import X.C220412q;
import X.C226815j;
import X.C230717b;
import X.C24631De;
import X.C27541Op;
import X.C27721Pm;
import X.C27731Pn;
import X.C27751Pr;
import X.C27761Ps;
import X.C31021b9;
import X.C31031bA;
import X.C32011co;
import X.C32251dE;
import X.C32661dz;
import X.C32811eE;
import X.C32931eR;
import X.C34661hR;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C49202ij;
import X.C49212ik;
import X.C53562rW;
import X.C65383Rv;
import X.C81143wX;
import X.C87094Nl;
import X.C87854Qk;
import X.C89354Wf;
import X.C89584Xc;
import X.C90224Zo;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.util.FloatingChildLayout;

public class QuickContactActivity extends AnonymousClass155 implements C87094Nl {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public C19460v5 A09;
    public C19460v5 A0A;
    public AnonymousClass1LI A0B;
    public AnonymousClass1ND A0C;
    public AnonymousClass1MK A0D;
    public AnonymousClass1T4 A0E;
    public AnonymousClass1LV A0F;
    public C20230xE A0G;
    public AnonymousClass1Pp A0H;
    public AnonymousClass16D A0I;
    public AnonymousClass16I A0J;
    public AnonymousClass171 A0K;
    public C27731Pn A0L;
    public C27761Ps A0M;
    public C65383Rv A0N;
    public C20430xY A0O;
    public AnonymousClass1HJ A0P;
    public C220412q A0Q;
    public AnonymousClass17X A0R;
    public AnonymousClass1HO A0S;
    public AnonymousClass3KV A0T;
    public AnonymousClass141 A0U;
    public C27751Pr A0V;
    public C20500xf A0W;
    public C27541Op A0X;
    public C230717b A0Y;
    public AnonymousClass1CF A0Z;
    public C32931eR A0a;
    public GroupJid A0b;
    public AnonymousClass147 A0c;
    public AnonymousClass1P5 A0d;
    public AnonymousClass2XH A0e;
    public C24631De A0f;
    public AnonymousClass3EV A0g;
    public AnonymousClass1FR A0h;
    public AnonymousClass3QZ A0i;
    public C31021b9 A0j;
    public C31031bA A0k;
    public C32251dE A0l;
    public StatusesViewModel A0m;
    public C32661dz A0n;
    public C32811eE A0o;
    public FloatingChildLayout A0p;
    public AnonymousClass1EM A0q;
    public AnonymousClass13J A0r;
    public C107265Nh A0s;
    public AnonymousClass1HP A0t;
    public C27721Pm A0u;
    public AnonymousClass5Ng A0v;
    public AnonymousClass005 A0w;
    public AnonymousClass005 A0x;
    public boolean A0y;
    public boolean A0z;
    public C49202ij A10;
    public C49212ik A11;
    public AnonymousClass1RY A12;
    public boolean A13;
    public final C226815j A14;
    public final C87854Qk A15;
    public final C34661hR A16;
    public final C32011co A17;
    public final AnonymousClass1NK A18;

    public static void A0F(QuickContactActivity quickContactActivity, boolean z) {
        if (z) {
            FloatingChildLayout floatingChildLayout = quickContactActivity.A0p;
            if (floatingChildLayout.A02 == 1) {
                floatingChildLayout.A02 = 3;
                if (floatingChildLayout.A06.isRunning()) {
                    floatingChildLayout.A06.reverse();
                } else {
                    int[] A1O = C36441kJ.A1O();
                    // fill-array-data instruction
                    A1O[0] = 127;
                    A1O[1] = 0;
                    ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
                    floatingChildLayout.A06 = ofInt;
                    C53562rW.A00(ofInt, floatingChildLayout, 18);
                    floatingChildLayout.A06.setDuration((long) floatingChildLayout.A01).start();
                }
            }
            FloatingChildLayout floatingChildLayout2 = quickContactActivity.A0p;
            C81143wX A002 = C81143wX.A00(quickContactActivity, 2);
            int i = floatingChildLayout2.A03;
            if (i == 1 || i == 2) {
                floatingChildLayout2.A03 = 3;
                floatingChildLayout2.A08.invalidate();
                FloatingChildLayout.A00(floatingChildLayout2, A002, true);
                return;
            }
        }
        quickContactActivity.finish();
        quickContactActivity.overridePendingTransition(0, 0);
    }

    public int A2I() {
        return 78318969;
    }

    public void onBackPressed() {
        A0F(this, true);
    }

    public static void A01(QuickContactActivity quickContactActivity) {
        AnonymousClass5Ng r0 = quickContactActivity.A0v;
        if (r0 != null) {
            C107265Nh A052 = quickContactActivity.A0P.A05(r0.A02());
            if (A052 != null) {
                quickContactActivity.A0s = A052;
                return;
            }
            C49202ij r1 = new C49202ij(new AnonymousClass4YS(quickContactActivity, 2), quickContactActivity.A0P, quickContactActivity.A0v.A02());
            quickContactActivity.A10 = r1;
            C36371kC.A1P(r1, quickContactActivity.A04);
        }
    }

    public static void A07(QuickContactActivity quickContactActivity) {
        AnonymousClass141 A0i2 = C36441kJ.A0i(quickContactActivity.A0I, C36331k8.A0F(quickContactActivity));
        quickContactActivity.A0U = A0i2;
        quickContactActivity.A0c = C36431kI.A0j(A0i2);
        quickContactActivity.A0b = GroupJid.Companion.A02(quickContactActivity.getIntent().getStringExtra("gjid"));
    }

    public void A2F() {
        if (!this.A13) {
            this.A13 = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r2 = A0B2.A00;
            C36321k7.A0X(A0B2, r2, this, C36321k7.A05(A0B2, r2, this));
            this.A0Q = C36351kA.A0a(A0B2);
            this.A0W = A0B2.AzV();
            this.A0C = C36391kE.A0Y(A0B2);
            this.A0u = (C27721Pm) r2.A0t.get();
            this.A0L = C36351kA.A0T(A0B2);
            this.A0Y = (C230717b) A0B2.AOc.get();
            this.A0e = C36411kG.A0m(A0B2);
            this.A0h = C36431kI.A0p(A0B2);
            this.A0D = C36381kD.A0W(A0B2);
            this.A0H = C36361kB.A0V(A0B2);
            this.A0I = C36341k9.A0R(A0B2);
            this.A0r = C36351kA.A0q(A0B2);
            this.A0K = C36341k9.A0S(A0B2);
            this.A0q = C36371kC.A0l(A0B2);
            this.A0t = (AnonymousClass1HP) A0B2.A1G.get();
            this.A0J = C36351kA.A0S(A0B2);
            this.A0A = C19470v6.A00;
            this.A0n = C36371kC.A0k(A0B2);
            this.A0P = (AnonymousClass1HJ) A0B2.A1O.get();
            this.A0o = C36401kF.A0e(A0B2);
            this.A0O = C36421kH.A0K(A0B2);
            this.A0N = (C65383Rv) r2.A2M.get();
            this.A0V = C36381kD.A0b(A0B2);
            this.A0j = (C31021b9) A0B2.A7V.get();
            this.A0F = C36361kB.A0U(A0B2);
            this.A0S = (AnonymousClass1HO) A0B2.A4M.get();
            this.A0w = C18840tu.A00(A0B2.A1Z);
            this.A09 = C36381kD.A0Q(A0B2.A0x);
            this.A0k = (C31031bA) A0B2.A7W.get();
            this.A0d = C36411kG.A0l(A0B2);
            this.A0f = (C24631De) A0B2.A6J.get();
            this.A0E = (AnonymousClass1T4) A0B2.A1p.get();
            this.A0G = C18800tq.A4u(A0B2);
            this.A0R = C36351kA.A0b(A0B2);
            this.A0X = C36381kD.A0c(A0B2);
            this.A0M = C36361kB.A0W(A0B2);
            this.A0l = (C32251dE) r2.A0E.get();
            this.A0x = C18840tu.A00(A0B2.A2i);
            this.A0g = (AnonymousClass3EV) r2.A3A.get();
            this.A0B = C36361kB.A0S(A0B2);
            this.A0Z = C36361kB.A0b(A0B2);
            this.A0a = C36431kI.A0g(A0B2);
        }
    }

    public /* synthetic */ void A3i() {
        if (!this.A0y) {
            AnonymousClass141 r2 = this.A0U;
            if (r2.A0f && r2.A0G()) {
                AnonymousClass17X r22 = this.A0R;
                AnonymousClass147 r1 = this.A0c;
                C18740tg.A06(r1);
                if (!r22.A0C(r1)) {
                    BO5(R.string.f12nameremoved);
                    return;
                }
            }
            AnonymousClass11F r5 = this.A0U.A0H;
            C18740tg.A06(r5);
            if (!AnonymousClass3U9.A00) {
                startActivity(AnonymousClass190.A0o(getApplicationContext(), r5, (String) null, 0.0f, 0, 0, 0, 0, false));
            } else {
                String stringExtra = getIntent().getStringExtra("transition_name");
                if (stringExtra == null) {
                    stringExtra = C36401kF.A0o(getApplicationContext(), R.string.f12nameremoved);
                }
                boolean A1T = C36371kC.A1T(Build.VERSION.SDK_INT, 24);
                int intExtra = getIntent().getIntExtra("status_bar_color", C36391kE.A05(this));
                int intExtra2 = getIntent().getIntExtra("navigation_bar_color", C36351kA.A01(this, R.attr.f4nameremoved, R.color.f6nameremoved));
                C011004s.A08(this.A08, stringExtra);
                Context applicationContext = getApplicationContext();
                float f = 0.0f;
                if (A1T) {
                    f = 0.5f;
                }
                C05290Pd.A00(this, AnonymousClass190.A0o(applicationContext, r5, stringExtra, f, getWindow().getStatusBarColor(), intExtra, getWindow().getNavigationBarColor(), intExtra2, false), AnonymousClass3U9.A05(this, this.A08, stringExtra));
                if (!A1T) {
                    C36341k9.A0H().postDelayed(C81143wX.A00(this, 1), (long) getResources().getInteger(17694721));
                    return;
                }
            }
            A0F(this, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x007a, code lost:
        if (X.C36391kE.A1X(r10.A0D) == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r11) {
        /*
            r10 = this;
            boolean r0 = X.AnonymousClass3U9.A00
            if (r0 == 0) goto L_0x000d
            android.view.Window r1 = r10.getWindow()
            r0 = 12
            r1.requestFeature(r0)
        L_0x000d:
            super.onCreate(r11)
            X.1Pn r1 = r10.A0L
            java.lang.String r0 = "quick-contact-activity"
            X.1RY r0 = r1.A05(r10, r0)
            r10.A12 = r0
            r0 = 2131896300(0x7f1227ec, float:1.9427457E38)
            r10.setTitle(r0)
            android.content.Intent r6 = r10.getIntent()
            X.C36331k8.A0l(r10)
            r5 = 0
            int r1 = X.C36391kE.A05(r10)
            java.lang.String r0 = "status_bar_color"
            int r0 = r6.getIntExtra(r0, r1)
            android.view.Window r1 = r10.getWindow()
            r3 = 2130706432(0x7f000000, float:1.7014118E38)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.C018107s.A03(r2, r0, r3)
            r1.setStatusBarColor(r0)
            boolean r0 = X.C19550w8.A04()
            if (r0 == 0) goto L_0x005c
            r1 = 2130969973(0x7f040575, float:1.7548643E38)
            r0 = 2131101103(0x7f0605af, float:1.7814606E38)
            int r0 = X.C36351kA.A01(r10, r1, r0)
            android.view.Window r1 = r10.getWindow()
            int r0 = X.C018107s.A03(r2, r0, r3)
            r1.setNavigationBarColor(r0)
        L_0x005c:
            android.view.Window r1 = r10.getWindow()
            r0 = 131072(0x20000, float:1.83671E-40)
            r1.setFlags(r0, r0)
            A07(r10)
            X.0wQ r1 = r10.A02
            X.141 r0 = r10.A0U
            boolean r0 = X.C36361kB.A1X(r1, r0)
            r4 = 1
            if (r0 == 0) goto L_0x007c
            X.0yC r0 = r10.A0D
            boolean r1 = X.C36391kE.A1X(r0)
            r0 = 1
            if (r1 != 0) goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            r10.A0z = r0
            X.3QZ r0 = new X.3QZ
            r0.<init>(r10)
            r10.A0i = r0
            com.whatsapp.quickcontact.QuickContactActivity r1 = r0.A00
            r0 = 2131625989(0x7f0e0805, float:1.8879202E38)
            r1.setContentView((int) r0)
            r0 = 2131431001(0x7f0b0e59, float:1.8483719E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A02 = r0
            r0 = 2131432708(0x7f0b1504, float:1.8487181E38)
            android.widget.ImageView r0 = X.C36411kG.A0Q(r10, r0)
            r10.A08 = r0
            r0 = 2131431726(0x7f0b112e, float:1.848519E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A04 = r0
            r0 = 2131427779(0x7f0b01c3, float:1.8477184E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A00 = r0
            r0 = 2131435113(0x7f0b1e69, float:1.849206E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A06 = r0
            r0 = 2131435212(0x7f0b1ecc, float:1.849226E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A07 = r0
            r0 = 2131428487(0x7f0b0487, float:1.847862E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A01 = r0
            r0 = 2131431059(0x7f0b0e93, float:1.8483837E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A03 = r0
            r0 = 2131427515(0x7f0b00bb, float:1.8476648E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A05 = r0
            X.147 r0 = r10.A0c
            if (r0 == 0) goto L_0x011b
            X.3QZ r0 = r10.A0i
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x011b
            X.1HO r1 = r10.A0S
            X.147 r0 = r10.A0c
            boolean r0 = r1.A07(r0)
            if (r0 == 0) goto L_0x02f2
            X.1HO r1 = r10.A0S
            X.147 r0 = r10.A0c
            X.5Ng r0 = r1.A02(r0)
            r10.A0v = r0
            A01(r10)
        L_0x0102:
            X.3KV r0 = r10.A0T
            if (r0 != 0) goto L_0x011b
            X.0yC r0 = r10.A0D
            boolean r0 = X.C34681hT.A0M(r0)
            if (r0 == 0) goto L_0x011b
            X.1b9 r3 = r10.A0j
            X.147 r2 = r10.A0c
            r1 = 2
            X.4YU r0 = new X.4YU
            r0.<init>(r10, r1)
            r3.A03(r2, r0)
        L_0x011b:
            X.3QZ r3 = r10.A0i
            com.whatsapp.quickcontact.QuickContactActivity r1 = r3.A00
            android.view.View r2 = r1.A04
            r0 = 15
            X.AnonymousClass3Y6.A00(r2, r3, r0)
            android.view.View r7 = r1.A00
            r9 = 1045220557(0x3e4ccccd, float:0.2)
            r2 = 0
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r9, r2, r9, r2)
            r7.setOnTouchListener(r0)
            android.view.View r7 = r1.A06
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r9, r2, r9, r2)
            r7.setOnTouchListener(r0)
            android.view.View r7 = r1.A01
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r9, r2, r9, r2)
            r7.setOnTouchListener(r0)
            android.view.View r7 = r1.A00
            r8 = 3
            X.2i5 r0 = new X.2i5
            r0.<init>(r8, r1, r5)
            r7.setOnClickListener(r0)
            android.view.View r7 = r1.A06
            X.2i5 r0 = new X.2i5
            r0.<init>(r8, r1, r4)
            r7.setOnClickListener(r0)
            android.view.View r7 = r1.A07
            if (r7 == 0) goto L_0x0170
            X.3Z8 r0 = new X.3Z8
            r0.<init>(r9, r2, r9, r2)
            r7.setOnTouchListener(r0)
            android.view.View r7 = r1.A07
            r0 = 15
            X.C48762i0.A00(r7, r1, r0)
        L_0x0170:
            android.view.View r7 = r1.A01
            r0 = 17
            X.AnonymousClass3Y6.A00(r7, r3, r0)
            android.view.View r7 = r1.A03
            r0 = 16
            X.AnonymousClass3Y6.A00(r7, r3, r0)
            android.view.View r7 = r1.A05
            r0 = 14
            X.AnonymousClass3Y6.A00(r7, r3, r0)
            r3.A02()
            r3.A03()
            r0 = 2131430903(0x7f0b0df7, float:1.848352E38)
            android.view.View r7 = r1.findViewById(r0)
            r0 = 13
            X.AnonymousClass3Y6.A00(r7, r3, r0)
            X.141 r8 = r1.A0U
            boolean r0 = r8.A0z
            r7 = 8
            if (r0 != 0) goto L_0x02e5
            boolean r0 = r8.A0G()
            if (r0 != 0) goto L_0x02e5
            X.141 r0 = r1.A0U
            X.11F r0 = r0.A0H
            boolean r0 = r0 instanceof X.C177618e5
            if (r0 != 0) goto L_0x02e5
            r0 = 2131428420(0x7f0b0444, float:1.8478484E38)
            X.C36341k9.A13(r1, r0, r7)
            X.141 r0 = r1.A0U
            X.3IL r0 = r0.A0F
            if (r0 == 0) goto L_0x02eb
            android.view.View r0 = r1.A02
            r0.setVisibility(r5)
        L_0x01be:
            android.view.View r1 = r1.A02
            r0 = 12
            X.AnonymousClass3Y6.A00(r1, r3, r0)
            r3.A04()
            r0 = 2131430338(0x7f0b0bc2, float:1.8482374E38)
            android.view.View r1 = r10.findViewById(r0)
            com.whatsapp.util.FloatingChildLayout r1 = (com.whatsapp.util.FloatingChildLayout) r1
            r10.A0p = r1
            r7 = 11
            X.2s6 r0 = new X.2s6
            r0.<init>(r10, r7)
            r1.A07 = r0
            r3 = 2
            X.C011504z.A06(r1, r3)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131168050(0x7f070b32, float:1.795039E38)
            int r8 = r1.getDimensionPixelOffset(r0)
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "position_top"
            int r1 = r1.getIntExtra(r0, r8)
            android.graphics.Rect r8 = r6.getSourceBounds()
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0p
            r0.A05 = r1
            if (r8 == 0) goto L_0x0242
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "animation_style"
            int r1 = r1.getIntExtra(r0, r3)
            if (r1 != r4) goto L_0x02d4
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.WindowManager r0 = r10.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r6 = r1.heightPixels
            int r3 = r1.widthPixels
            int r1 = r3 / 4
            int r0 = r6 / 4
            int r1 = java.lang.Math.min(r1, r0)
            int r6 = r6 - r1
            int r0 = r6 / 2
            r8.top = r0
            int r0 = r0 + r1
            r8.bottom = r0
            int r3 = r3 - r1
            int r0 = r3 / 2
            r8.left = r0
            int r0 = r0 + r1
            r8.right = r0
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0p
            r0.setChildTargetScreen(r8)
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0p
            r0.A04 = r5
            r0.A00 = r2
        L_0x0242:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "show_get_direction"
            boolean r6 = r1.getBooleanExtra(r0, r5)
            r0 = 2131429565(0x7f0b08bd, float:1.8480806E38)
            r2 = 2131429565(0x7f0b08bd, float:1.8480806E38)
            android.widget.TextView r1 = X.C36391kE.A0Q(r10, r0)
            r3 = 8
            int r0 = X.C36351kA.A00(r6)
            r1.setVisibility(r0)
            if (r6 == 0) goto L_0x026d
            X.C33511fU.A03(r1)
            android.view.View r1 = r10.findViewById(r2)
            r0 = 10
            X.AnonymousClass3Y6.A00(r1, r10, r0)
        L_0x026d:
            android.widget.ImageView r0 = r10.A08
            X.AnonymousClass3Y6.A00(r0, r10, r7)
            android.widget.ImageView r1 = r10.A08
            r0 = 2131894902(0x7f122276, float:1.9424622E38)
            X.C33521fV.A03(r1, r0)
            r10.A0y = r4
            com.whatsapp.util.FloatingChildLayout r6 = r10.A0p
            X.3wX r2 = X.C81143wX.A00(r10, r5)
            r0 = 7
            X.4Zm r1 = new X.4Zm
            r1.<init>((android.view.View) r6, (java.lang.Runnable) r2, (int) r0)
            android.view.ViewTreeObserver r0 = r6.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r1)
            X.16I r1 = r10.A0J
            X.15j r0 = r10.A14
            r1.registerObserver(r0)
            X.141 r0 = r10.A0U
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x02a5
            X.1Op r1 = r10.A0X
            X.4Qk r0 = r10.A15
            r1.A00(r0)
        L_0x02a5:
            X.1HP r1 = r10.A0t
            X.1co r0 = r10.A17
            r1.registerObserver(r0)
            X.1Pm r1 = r10.A0u
            X.1NK r0 = r10.A18
            r1.registerObserver(r0)
            X.1bA r1 = r10.A0k
            X.1hR r0 = r10.A16
            r1.registerObserver(r0)
            X.141 r0 = r10.A0U
            com.whatsapp.jid.Jid r2 = X.C36411kG.A0h(r0)
            X.0v5 r1 = r10.A0A
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0313
            if (r2 == 0) goto L_0x030c
            r1.A02()
            java.lang.String r0 = "initSmbLabelScroller"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x02d4:
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0p
            r0.setChildTargetScreen(r8)
            com.whatsapp.util.FloatingChildLayout r0 = r10.A0p
            if (r1 != r3) goto L_0x02e1
            r0.A04 = r4
            goto L_0x0242
        L_0x02e1:
            r0.A04 = r3
            goto L_0x0242
        L_0x02e5:
            r0 = 2131428420(0x7f0b0444, float:1.8478484E38)
            X.C36341k9.A13(r1, r0, r5)
        L_0x02eb:
            android.view.View r0 = r1.A02
            r0.setVisibility(r7)
            goto L_0x01be
        L_0x02f2:
            X.1HO r3 = r10.A0S
            r0 = 2
            X.4YT r1 = new X.4YT
            r1.<init>(r10, r0)
            X.147 r0 = r10.A0c
            X.2ik r2 = new X.2ik
            r2.<init>(r1, r3, r0)
            r10.A11 = r2
            X.0wU r1 = r10.A04
            java.lang.Void[] r0 = new java.lang.Void[r5]
            r1.Bp0(r2, r0)
            goto L_0x0102
        L_0x030c:
            r0 = 2131433082(0x7f0b167a, float:1.848794E38)
            X.C36341k9.A13(r10, r0, r3)
            goto L_0x0320
        L_0x0313:
            if (r2 == 0) goto L_0x0320
            com.whatsapp.jid.UserJid r3 = X.C36401kF.A0b(r2)
            if (r3 != 0) goto L_0x0324
            java.lang.String r0 = "UserJid should not be null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0320:
            X.C36401kF.A1C(r10)
            return
        L_0x0324:
            X.0yC r2 = r10.A0D
            X.0yV r1 = X.C21000yV.A01
            r0 = 1533(0x5fd, float:2.148E-42)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)
            if (r0 == 0) goto L_0x0320
            X.1dE r0 = r10.A0l
            X.AnonymousClass00C.A0D(r0, r5)
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = X.C68073bI.A00(r10, r0, r4)
            r10.A0m = r1
            X.01N r0 = r10.A06
            r0.A04(r1)
            com.whatsapp.status.viewmodels.StatusesViewModel r2 = r10.A0m
            X.00s r1 = r2.A04
            X.4ZH r0 = new X.4ZH
            r0.<init>(r2, r3, r4)
            X.08S r1 = X.AnonymousClass0VV.A00(r0, r1)
            r0 = 8
            X.C65973Ue.A00(r10, r1, r0)
            goto L_0x0320
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.quickcontact.QuickContactActivity.onCreate(android.os.Bundle):void");
    }

    public QuickContactActivity(int i) {
        this.A13 = false;
        C89354Wf.A00(this, 40);
    }

    public C21710zg A2K() {
        C21710zg A2K = super.A2K();
        C36321k7.A0s(A2K, this);
        return A2K;
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.unregisterObserver(this.A14);
        this.A12.A02();
        if (this.A0U.A0G()) {
            this.A0X.A01(this.A15);
        }
        this.A0t.unregisterObserver(this.A17);
        this.A0u.unregisterObserver(this.A18);
        this.A0k.unregisterObserver(this.A16);
        C49212ik r0 = this.A11;
        if (r0 != null) {
            r0.A0D(true);
            this.A11 = null;
        }
        C49202ij r02 = this.A10;
        if (r02 != null) {
            r02.A0D(true);
            this.A10 = null;
        }
    }

    public QuickContactActivity() {
        this(0);
        this.A14 = AnonymousClass4W3.A00(this, 32);
        this.A15 = new C89584Xc(this, 19);
        this.A17 = new C90224Zo(this, 2);
        this.A18 = new AnonymousClass4YF(this, 5);
        this.A16 = new AnonymousClass4YG(this, 2);
    }
}
