package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass01L;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass0QD;
import X.AnonymousClass11F;
import X.AnonymousClass190;
import X.AnonymousClass1Ax;
import X.AnonymousClass1N2;
import X.AnonymousClass1QZ;
import X.AnonymousClass1XN;
import X.AnonymousClass3XM;
import X.AnonymousClass3Y1;
import X.AnonymousClass4O2;
import X.AnonymousClass4T8;
import X.AnonymousClass55M;
import X.AnonymousClass55N;
import X.AnonymousClass63V;
import X.AnonymousClass6O1;
import X.AnonymousClass6R3;
import X.AnonymousClass6UI;
import X.AnonymousClass7LL;
import X.AnonymousClass7gY;
import X.AnonymousClass7gZ;
import X.C001700s;
import X.C006302t;
import X.C012005e;
import X.C023409w;
import X.C023509x;
import X.C05250Oz;
import X.C109325Xd;
import X.C113225fC;
import X.C119575q5;
import X.C122495uw;
import X.C135566cu;
import X.C145316th;
import X.C154417Sc;
import X.C157347co;
import X.C158237gb;
import X.C162377oU;
import X.C163447qD;
import X.C163637qW;
import X.C165177t0;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C18840tu;
import X.C19420v0;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C33311f5;
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
import X.C36431kI;
import X.C36441kJ;
import X.C87794Qe;
import X.C88234Rx;
import X.C88314Sf;
import X.C90484aE;
import X.C90504aG;
import X.C95314kY;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ExpressionsBottomSheetView extends LinearLayout implements C18700tb {
    public ViewPager A00;
    public C88314Sf A01;
    public C19420v0 A02;
    public C18820ts A03;
    public AnonymousClass6O1 A04;
    public AnonymousClass7gY A05;
    public AnonymousClass7gZ A06;
    public C119575q5 A07;
    public C119575q5 A08;
    public C95314kY A09;
    public AnonymousClass4T8 A0A;
    public AnonymousClass4O2 A0B;
    public C157347co A0C;
    public C20810yC A0D;
    public AnonymousClass3XM A0E;
    public C87794Qe A0F;
    public AnonymousClass190 A0G;
    public AnonymousClass11F A0H;
    public C88234Rx A0I;
    public AnonymousClass1N2 A0J;
    public AnonymousClass005 A0K;
    public AnonymousClass1QZ A0L;
    public List A0M;
    public C006302t A0N;
    public boolean A0O;
    public boolean A0P;
    public int A0Q;
    public View A0R;
    public FrameLayout A0S;
    public WaImageView A0T;
    public C122495uw A0U;
    public final View.OnTouchListener A0V;
    public final View A0W;
    public final ViewGroup A0X;
    public final MaterialButton A0Y;
    public final MaterialButton A0Z;
    public final MaterialButton A0a;
    public final MaterialButton A0b;
    public final MaterialButtonToggleGroup A0c;
    public final WaTextView A0d;
    public final Handler A0e;
    public final View A0f;
    public final View A0g;
    public final LinearLayout A0h;
    public final ConstraintLayout A0i;
    public final AnonymousClass00T A0j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (AnonymousClass11F) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final boolean A09(MotionEvent motionEvent, ExpressionsBottomSheetView expressionsBottomSheetView) {
        int action = motionEvent.getAction();
        if (action == 0) {
            ExpressionsKeyboardViewModel expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
            C36331k8.A1T(new ExpressionsKeyboardViewModel$onEmojiBackspaceClick$1(expressionsViewModel, (C023509x) null), C109325Xd.A00(expressionsViewModel));
            expressionsBottomSheetView.A0e.sendEmptyMessageDelayed(0, (long) ViewConfiguration.getKeyRepeatTimeout());
            AnonymousClass6O1.A01(expressionsBottomSheetView.getExpressionUserJourneyLogger(), 41, 1, 4);
            return true;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            expressionsBottomSheetView.A0e.removeMessages(0);
            return true;
        }
    }

    public static /* synthetic */ void getCurrentBottomSheetState$annotations() {
    }

    public static /* synthetic */ void setExpressionsTabs$default(ExpressionsBottomSheetView expressionsBottomSheetView, int i, Integer num, Integer num2, Integer num3, Integer num4, int i2, Object obj) {
        Integer num5 = num3;
        Integer num6 = num2;
        Integer num7 = num;
        Integer num8 = null;
        if ((i2 & 2) != 0) {
            num7 = null;
        }
        if ((i2 & 4) != 0) {
            num6 = null;
        }
        if ((i2 & 8) != 0) {
            num5 = null;
        }
        if ((i2 & 16) == 0) {
            num8 = num4;
        }
        expressionsBottomSheetView.A0F(num7, num6, num5, num8, i);
    }

    private final void setTabsPadding(boolean z) {
        int i;
        if (z) {
            i = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
        } else {
            i = 0;
        }
        this.A0c.setPadding(i, 0, i, 0);
    }

    public final void A0B() {
        this.A0F = null;
        this.A0I = null;
        this.A05 = null;
        this.A01 = null;
        this.A0A = null;
        this.A09 = null;
        this.A0B = null;
        Activity A062 = C36361kB.A06(this);
        AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01L r4 = (AnonymousClass01L) A062;
        List list = C113225fC.A00;
        AnonymousClass00C.A0D(r4, 0);
        if (!r4.getSupportFragmentManager().A0E) {
            ArrayList<AnonymousClass02E> A0I2 = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass02E A0N2 = r4.getSupportFragmentManager().A0N(AnonymousClass001.A0C(it));
                if (A0N2 != null) {
                    A0I2.add(A0N2);
                }
            }
            AnonymousClass09Y A0O2 = C36341k9.A0O(r4);
            for (AnonymousClass02E A082 : A0I2) {
                A0O2.A08(A082);
            }
            A0O2.A00(true);
        }
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0D = r2;
    }

    public final void setAvatarEditorLauncherLazy(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0K = r2;
    }

    public final void setEmojiPrerenderCacheFactory(C157347co r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0C = r2;
    }

    public final void setExpressionUserJourneyLogger(AnonymousClass6O1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setExpressionsSearchListener(AnonymousClass4T8 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0A = r2;
    }

    public final void setImeUtils(AnonymousClass1N2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0J = r2;
    }

    public final void setTabSelectionListener(AnonymousClass4O2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setWaIntents(AnonymousClass190 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0G = r2;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    private final void A01() {
        String A0w = C36381kD.A0w(this.A0H);
        Activity A062 = C36361kB.A06(this);
        AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AnonymousClass01z supportFragmentManager = ((AnonymousClass01I) A062).getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        this.A09 = new C95314kY(supportFragmentManager, A0w, getExpressionsViewModel().A00, false, false);
    }

    private final void A02() {
        FrameLayout frameLayout = this.A0S;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        WaImageView waImageView = this.A0T;
        if (waImageView != null) {
            waImageView.setImageResource(R.drawable.vec_ic_edit);
            waImageView.setOnClickListener(C135566cu.A00);
        }
    }

    private final void A04(View.OnTouchListener onTouchListener, AnonymousClass00S r5, int i, int i2) {
        FrameLayout frameLayout = this.A0S;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        WaImageView waImageView = this.A0T;
        if (waImageView != null) {
            waImageView.setImageResource(i);
            C36331k8.A0q(waImageView.getContext(), waImageView, i2);
            AnonymousClass3Y1.A00(waImageView, r5, 23);
            if (onTouchListener != null) {
                waImageView.setLongClickable(true);
                waImageView.setOnTouchListener(onTouchListener);
            } else {
                waImageView.setLongClickable(false);
                waImageView.setOnTouchListener((View.OnTouchListener) null);
            }
        }
        C36331k8.A0y(this.A0R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r5, int r6, boolean r7) {
        /*
            if (r7 == 0) goto L_0x002e
            r0 = 2131429870(0x7f0b09ee, float:1.8481425E38)
            if (r6 != r0) goto L_0x002f
            X.55N r4 = X.AnonymousClass55N.A00
        L_0x0009:
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r5.getExpressionsViewModel()
            r0.A0S(r4)
        L_0x0010:
            boolean r0 = X.C90504aG.A1W(r5)
            if (r0 == 0) goto L_0x002e
            if (r4 == 0) goto L_0x002c
            X.5q5 r0 = r5.A08
            if (r0 == 0) goto L_0x002c
            X.6O1 r3 = r5.getExpressionUserJourneyLogger()
            r2 = 1
            int r1 = X.AnonymousClass6R3.A00(r0)
            int r0 = X.AnonymousClass6R3.A01(r4)
            X.AnonymousClass6O1.A01(r3, r0, r2, r1)
        L_0x002c:
            r5.A08 = r4
        L_0x002e:
            return
        L_0x002f:
            r0 = 2131430532(0x7f0b0c84, float:1.8482768E38)
            if (r6 != r0) goto L_0x0037
            X.55O r4 = X.AnonymousClass55O.A00
            goto L_0x0009
        L_0x0037:
            r0 = 2131427878(0x7f0b0226, float:1.8477385E38)
            if (r6 != r0) goto L_0x003f
            X.55M r4 = X.AnonymousClass55M.A00
            goto L_0x0009
        L_0x003f:
            r0 = 2131434376(0x7f0b1b88, float:1.8490564E38)
            if (r6 != r0) goto L_0x0047
            X.55P r4 = X.AnonymousClass55P.A00
            goto L_0x0009
        L_0x0047:
            r4 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A07(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0317, code lost:
        if (r1 == null) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0151, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("expressions tray tag=");
        r1.append(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0163, code lost:
        throw X.AnonymousClass000.A0c(" is not supported", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r7 = r7;
        X.C36331k8.A1I(r6, r7);
        r1 = r6.getSupportFragmentManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e7, code lost:
        if (r1.A0E != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01e9, code lost:
        r0 = new X.AnonymousClass09Y(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ee, code lost:
        if (r4 == null) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f0, code lost:
        r0.A07(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f3, code lost:
        r0.A0E(r7, r5, com.whatsapp.R.id.expressions_tray_fragment_container);
        r0.A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView r9, X.AnonymousClass55Q r10) {
        /*
            java.util.List r4 = r10.A03
            X.0yC r0 = r9.getAbProps()
            r2 = 5627(0x15fb, float:7.885E-42)
            boolean r0 = r0.A0E(r2)
            if (r0 == 0) goto L_0x0398
            java.util.List r0 = r9.A0M
        L_0x0010:
            boolean r0 = X.AnonymousClass00C.A0J(r4, r0)
            r3 = 0
            if (r0 != 0) goto L_0x0060
            com.google.android.material.button.MaterialButton r1 = r9.A0Z
            X.55N r0 = X.AnonymousClass55N.A00
            boolean r0 = r4.contains(r0)
            r5 = 8
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r9.A0a
            X.55O r0 = X.AnonymousClass55O.A00
            boolean r0 = r4.contains(r0)
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r9.A0Y
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = r4.contains(r0)
            int r0 = X.C36351kA.A00(r0)
            r1.setVisibility(r0)
            com.google.android.material.button.MaterialButton r1 = r9.A0b
            X.55P r0 = X.AnonymousClass55P.A00
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x0051
            r5 = 0
        L_0x0051:
            r1.setVisibility(r5)
            X.0yC r0 = r9.getAbProps()
            boolean r0 = r0.A0E(r2)
            if (r0 == 0) goto L_0x038d
            r9.A0M = r4
        L_0x0060:
            int r1 = r4.size()
            r0 = 1
            if (r1 != r0) goto L_0x0068
            r3 = 1
        L_0x0068:
            r9.setTabsPadding(r3)
            X.0yC r0 = r9.getAbProps()
            boolean r0 = r0.A0E(r2)
            X.5q5 r3 = r10.A02
            if (r0 == 0) goto L_0x0290
            boolean r2 = r10.A04
            X.4O2 r0 = r9.A0B
            if (r0 == 0) goto L_0x008a
            X.3lO r0 = (X.C74303lO) r0
            X.3fk r0 = r0.A00
            boolean r1 = r3 instanceof X.AnonymousClass55N
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4B
            if (r1 == 0) goto L_0x028b
            r0.requestFocus()
        L_0x008a:
            r9.A07 = r3
            r9.A03()
            X.55N r0 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x020d
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r9.getExpressionsViewModel()
            int r1 = r0.A00
            r0 = 7
            if (r1 != r0) goto L_0x01fb
            r9.A02()
        L_0x00a3:
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r9.A0c
            r1 = 2131429870(0x7f0b09ee, float:1.8481425E38)
            r0 = 1
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r2, r1, r0)
            java.lang.String r5 = "emoji_expressions_fragment"
        L_0x00ae:
            android.app.Activity r7 = X.C36361kB.A06(r9)
            java.lang.String r8 = "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"
            X.AnonymousClass00C.A0E(r7, r8)
            X.01L r7 = (X.AnonymousClass01L) r7
            java.util.List r1 = X.C113225fC.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x00c3:
            boolean r0 = r6.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x00e2
            java.lang.String r2 = X.AnonymousClass001.A0C(r6)
            X.01z r1 = r7.getSupportFragmentManager()
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x00e2
            X.02E r4 = r1.A0N(r2)
            if (r4 == 0) goto L_0x00c3
            boolean r0 = r4.A15()
            if (r0 == 0) goto L_0x00c3
        L_0x00e2:
            android.app.Activity r0 = X.C36361kB.A06(r9)
            X.AnonymousClass00C.A0E(r0, r8)
            X.01L r0 = (X.AnonymousClass01L) r0
            r7 = 0
            X.AnonymousClass00C.A0D(r0, r7)
            X.01z r1 = r0.getSupportFragmentManager()
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x0140
            X.02E r6 = r1.A0N(r5)
            if (r6 == 0) goto L_0x0140
            android.app.Activity r2 = X.C36361kB.A06(r9)
            X.AnonymousClass00C.A0E(r2, r8)
            X.01L r2 = (X.AnonymousClass01L) r2
            X.AnonymousClass00C.A0D(r2, r7)
            X.01z r0 = r2.getSupportFragmentManager()
            boolean r0 = r0.A0E
            if (r0 != 0) goto L_0x013a
            boolean r0 = r6.A15()
            if (r0 != 0) goto L_0x013a
            X.01z r1 = r2.getSupportFragmentManager()
            int r0 = r6.A07
            X.02E r0 = r1.A0L(r0)
            if (r0 == 0) goto L_0x013a
            X.01z r0 = r2.getSupportFragmentManager()
            r0.A0T()
            X.09Y r1 = X.C36341k9.A0O(r2)
            if (r4 == 0) goto L_0x0133
            r1.A07(r4)
        L_0x0133:
            r1.A09(r6)
            r0 = 1
            r1.A00(r0)
        L_0x013a:
            android.graphics.Bitmap r0 = r10.A01
            r9.setDynamicAvatarIcon(r0, r3)
            return
        L_0x0140:
            android.app.Activity r6 = X.C36361kB.A06(r9)
            X.AnonymousClass00C.A0E(r6, r8)
            X.01L r6 = (X.AnonymousClass01L) r6
            int r0 = r5.hashCode()
            r2 = 0
            switch(r0) {
                case -1761741734: goto L_0x0164;
                case -417416307: goto L_0x01a1;
                case 637593295: goto L_0x01af;
                case 1123566326: goto L_0x01bd;
                default: goto L_0x0151;
            }
        L_0x0151:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "expressions tray tag="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " is not supported"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0c(r0, r1)
            throw r0
        L_0x0164:
            java.lang.String r0 = "avatar_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0151
            com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment r7 = new com.whatsapp.expressionstray.avatars.AvatarExpressionsFragment
            r7.<init>()
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r9.getExpressionsViewModel()
            int r1 = r0.A00
            r0 = 7
            boolean r1 = X.C36381kD.A1U(r1, r0)
            android.os.Bundle r8 = X.AnonymousClass001.A07()
            X.11F r0 = r9.A0H
            if (r0 == 0) goto L_0x0188
            java.lang.String r2 = r0.getRawString()
        L_0x0188:
            java.lang.String r0 = "rawChatJid"
            r8.putString(r0, r2)
            java.lang.String r0 = "shouldAnimateStickers"
            r8.putBoolean(r0, r1)
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r9.getExpressionsViewModel()
            int r1 = r0.A00
            java.lang.String r0 = "arg_search_opener"
            r8.putInt(r0, r1)
            r7.A17(r8)
            goto L_0x01d9
        L_0x01a1:
            java.lang.String r0 = "emoji_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0151
            com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment r7 = new com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment
            r7.<init>()
            goto L_0x01d9
        L_0x01af:
            java.lang.String r0 = "gif_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0151
            com.whatsapp.expressionstray.gifs.GifExpressionsFragment r7 = new com.whatsapp.expressionstray.gifs.GifExpressionsFragment
            r7.<init>()
            goto L_0x01d9
        L_0x01bd:
            java.lang.String r0 = "sticker_expressions_fragment"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0151
            X.11F r0 = r9.A0H
            if (r0 == 0) goto L_0x01cd
            java.lang.String r2 = r0.getRawString()
        L_0x01cd:
            X.3XM r1 = r9.A0E
            com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel r0 = r9.getExpressionsViewModel()
            int r0 = r0.A00
            com.whatsapp.expressionstray.stickers.StickerExpressionsFragment r7 = X.C110705b6.A00(r1, r2, r0, r7, r7)
        L_0x01d9:
            X.02E r7 = (X.AnonymousClass02E) r7
            r2 = 2131430203(0x7f0b0b3b, float:1.84821E38)
            X.C36331k8.A1I(r6, r7)
            X.01z r1 = r6.getSupportFragmentManager()
            boolean r0 = r1.A0E
            if (r0 != 0) goto L_0x013a
            X.09Y r0 = new X.09Y
            r0.<init>(r1)
            if (r4 == 0) goto L_0x01f3
            r0.A07(r4)
        L_0x01f3:
            r0.A0E(r7, r5, r2)
            r0.A03()
            goto L_0x013a
        L_0x01fb:
            X.7LN r4 = new X.7LN
            r4.<init>(r9)
            android.view.View$OnTouchListener r2 = r9.A0V
            r1 = 2131231508(0x7f080314, float:1.80791E38)
            r0 = 2131886639(0x7f12022f, float:1.9407863E38)
            r9.A04(r2, r4, r1, r0)
            goto L_0x00a3
        L_0x020d:
            X.55O r0 = X.AnonymousClass55O.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x022d
            r9.A02()
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r9.A0c
            r1 = 2131430532(0x7f0b0c84, float:1.8482768E38)
            r0 = 1
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r2, r1, r0)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131889950(0x7f120f1e, float:1.9414578E38)
            r1.setText(r0)
            java.lang.String r5 = "gif_expressions_fragment"
            goto L_0x00ae
        L_0x022d:
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x025f
            if (r2 == 0) goto L_0x025b
            X.7LM r4 = new X.7LM
            r4.<init>(r9)
            r2 = 0
            r1 = 2131234109(0x7f080d3d, float:1.8084374E38)
            r0 = 2131886619(0x7f12021b, float:1.9407822E38)
            r9.A04(r2, r4, r1, r0)
        L_0x0246:
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r9.A0c
            r1 = 2131427878(0x7f0b0226, float:1.8477385E38)
            r0 = 1
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r2, r1, r0)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131886616(0x7f120218, float:1.9407816E38)
            r1.setText(r0)
            java.lang.String r5 = "avatar_expressions_fragment"
            goto L_0x00ae
        L_0x025b:
            r9.A02()
            goto L_0x0246
        L_0x025f:
            X.55P r0 = X.AnonymousClass55P.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x013a
            X.7LO r4 = new X.7LO
            r4.<init>(r9)
            r2 = 0
            r1 = 2131233882(0x7f080c5a, float:1.8083914E38)
            r0 = 2131894621(0x7f12215d, float:1.9424052E38)
            r9.A04(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r2 = r9.A0c
            r1 = 2131434376(0x7f0b1b88, float:1.8490564E38)
            r0 = 1
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r2, r1, r0)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131894659(0x7f122183, float:1.942413E38)
            r1.setText(r0)
            java.lang.String r5 = "sticker_expressions_fragment"
            goto L_0x00ae
        L_0x028b:
            r0.clearFocus()
            goto L_0x008a
        L_0x0290:
            int r6 = r10.A00
            boolean r2 = r10.A04
            if (r6 < 0) goto L_0x013a
            X.4kY r0 = r9.A09
            r7 = 0
            if (r0 == 0) goto L_0x013a
            java.util.List r0 = r0.A04
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x013a
            X.4O2 r0 = r9.A0B
            if (r0 == 0) goto L_0x02b4
            X.3lO r0 = (X.C74303lO) r0
            X.3fk r0 = r0.A00
            boolean r1 = r3 instanceof X.AnonymousClass55N
            com.whatsapp.mentions.MentionableEntry r0 = r0.A4B
            if (r1 == 0) goto L_0x031c
            r0.requestFocus()
        L_0x02b4:
            X.4kY r0 = r9.A09
            if (r0 == 0) goto L_0x02ba
            r0.A02 = r3
        L_0x02ba:
            r4 = 0
            if (r0 == 0) goto L_0x031a
            android.util.SparseArray r0 = r0.A01
            java.lang.Object r1 = r0.get(r6)
            X.02E r1 = (X.AnonymousClass02E) r1
        L_0x02c5:
            boolean r0 = r1 instanceof X.AnonymousClass7gZ
            if (r0 == 0) goto L_0x02cc
            r4 = r1
            X.7gZ r4 = (X.AnonymousClass7gZ) r4
        L_0x02cc:
            r5 = 1
            if (r4 == 0) goto L_0x02d2
            r4.Br5(r5)
        L_0x02d2:
            X.7gZ r1 = r9.A06
            if (r1 == 0) goto L_0x02df
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x02df
            r1.Br5(r7)
        L_0x02df:
            r9.A06 = r4
            r9.A07 = r3
            r9.A03()
            androidx.viewpager.widget.ViewPager r1 = r9.A00
            if (r1 == 0) goto L_0x0315
            int r0 = r1.getCurrentItem()
            if (r0 != r6) goto L_0x0315
        L_0x02f0:
            r1.setCurrentItem(r6)
        L_0x02f3:
            X.55N r0 = X.AnonymousClass55N.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0320
            X.7LP r4 = new X.7LP
            r4.<init>(r9)
            android.view.View$OnTouchListener r2 = r9.A0V
            r1 = 2131231508(0x7f080314, float:1.80791E38)
            r0 = 2131886639(0x7f12022f, float:1.9407863E38)
            r9.A04(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r9.A0c
            r0 = 2131429870(0x7f0b09ee, float:1.8481425E38)
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r1, r0, r5)
            goto L_0x013a
        L_0x0315:
            r9.A0O = r5
            if (r1 != 0) goto L_0x02f0
            goto L_0x02f3
        L_0x031a:
            r1 = r4
            goto L_0x02c5
        L_0x031c:
            r0.clearFocus()
            goto L_0x02b4
        L_0x0320:
            X.55O r0 = X.AnonymousClass55O.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x033d
            r9.A02()
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r9.A0c
            r0 = 2131430532(0x7f0b0c84, float:1.8482768E38)
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r1, r0, r5)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131889950(0x7f120f1e, float:1.9414578E38)
        L_0x0338:
            r1.setText(r0)
            goto L_0x013a
        L_0x033d:
            X.55M r0 = X.AnonymousClass55M.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x0368
            if (r2 == 0) goto L_0x0364
            X.7LQ r4 = new X.7LQ
            r4.<init>(r9)
            r2 = 0
            r1 = 2131234109(0x7f080d3d, float:1.8084374E38)
            r0 = 2131886619(0x7f12021b, float:1.9407822E38)
            r9.A04(r2, r4, r1, r0)
        L_0x0356:
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r9.A0c
            r0 = 2131427878(0x7f0b0226, float:1.8477385E38)
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r1, r0, r5)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131886616(0x7f120218, float:1.9407816E38)
            goto L_0x0338
        L_0x0364:
            r9.A02()
            goto L_0x0356
        L_0x0368:
            X.55P r0 = X.AnonymousClass55P.A00
            boolean r0 = X.AnonymousClass00C.A0J(r3, r0)
            if (r0 == 0) goto L_0x013a
            X.7LR r4 = new X.7LR
            r4.<init>(r9)
            r2 = 0
            r1 = 2131233882(0x7f080c5a, float:1.8083914E38)
            r0 = 2131894621(0x7f12215d, float:1.9424052E38)
            r9.A04(r2, r4, r1, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r9.A0c
            r0 = 2131434376(0x7f0b1b88, float:1.8490564E38)
            com.google.android.material.button.MaterialButtonToggleGroup.A01(r1, r0, r5)
            com.whatsapp.WaTextView r1 = r9.A0d
            r0 = 2131894659(0x7f122183, float:1.942413E38)
            goto L_0x0338
        L_0x038d:
            X.4kY r0 = r9.A09
            if (r0 == 0) goto L_0x0060
            r0.A04 = r4
            r0.A09()
            goto L_0x0060
        L_0x0398:
            X.4kY r0 = r9.A09
            if (r0 == 0) goto L_0x03a0
            java.util.List r0 = r0.A04
            goto L_0x0010
        L_0x03a0:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView.A08(com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView, X.55Q):void");
    }

    /* access modifiers changed from: private */
    public final ExpressionsKeyboardViewModel getExpressionsViewModel() {
        return (ExpressionsKeyboardViewModel) this.A0j.getValue();
    }

    private final void setDynamicAvatarIcon(Bitmap bitmap, C119575q5 r6) {
        if (bitmap != null) {
            MaterialButton materialButton = this.A0Y;
            materialButton.setIconTint((ColorStateList) null);
            materialButton.setIcon(new BitmapDrawable(getResources(), bitmap));
            if (!AnonymousClass00C.A0J(r6, AnonymousClass55M.A00)) {
                ColorMatrix colorMatrix = new ColorMatrix();
                colorMatrix.setSaturation(0.0f);
                Drawable drawable = materialButton.A01;
                if (drawable != null) {
                    drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                return;
            }
            Drawable drawable2 = materialButton.A01;
            if (drawable2 != null) {
                drawable2.clearColorFilter();
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            MaterialButton materialButton2 = this.A0Y;
            materialButton2.setIconTint(AnonymousClass00F.A04(context, R.drawable.expression_tab_icon_color_selector));
            materialButton2.setIconResource(R.drawable.ic_avatar_tray_normal);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0L;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0L = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final AnonymousClass005 getAvatarEditorLauncherLazy() {
        AnonymousClass005 r0 = this.A0K;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("avatarEditorLauncherLazy");
    }

    public final C157347co getEmojiPrerenderCacheFactory() {
        C157347co r0 = this.A0C;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("emojiPrerenderCacheFactory");
    }

    public final AnonymousClass6O1 getExpressionUserJourneyLogger() {
        AnonymousClass6O1 r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("expressionUserJourneyLogger");
    }

    public final AnonymousClass1N2 getImeUtils() {
        AnonymousClass1N2 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("imeUtils");
    }

    public final AnonymousClass190 getWaIntents() {
        AnonymousClass190 r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0X();
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setCurrentChatJid(AnonymousClass11F r2) {
        this.A0H = r2;
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        expressionsViewModel.A03 = r2;
        expressionsViewModel.A0A.A00.setValue(r2);
    }

    private final void A03() {
        if (AnonymousClass1Ax.A03(getAbProps(), 7929)) {
            Rect A062 = AnonymousClass001.A06();
            if (getGlobalVisibleRect(A062)) {
                ViewGroup.MarginLayoutParams A0K2 = C36371kC.A0K(this.A0i);
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
                int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.f7nameremoved);
                float height = ((float) (A062.height() - this.A0Q)) / ((float) (getHeight() - this.A0Q));
                int i = (int) (((float) dimensionPixelOffset) * height);
                int i2 = 0;
                if (0 < i) {
                    i2 = i;
                }
                int i3 = (int) (((float) dimensionPixelOffset2) * height);
                int i4 = 0;
                if (0 < i3) {
                    i4 = i3;
                }
                if ((this.A07 instanceof AnonymousClass55N) || C36341k9.A04(getContext()) == 2) {
                    this.A0h.setVisibility(8);
                    View view = this.A0W;
                    C36411kG.A1A(view, dimensionPixelOffset);
                    view.setPadding(0, 0, 0, 0);
                    return;
                }
                LinearLayout linearLayout = this.A0h;
                linearLayout.setVisibility(0);
                C36411kG.A1A(linearLayout, i2);
                View view2 = this.A0W;
                view2.getLayoutParams().height = dimensionPixelOffset + i2;
                int i5 = i2 - dimensionPixelOffset;
                A0K2.topMargin = i5;
                view2.setPadding(i4, i2, 0, 0);
                this.A0g.setPadding(i4 - dimensionPixelOffset2, i5, 0, 0);
            }
        }
    }

    public static final void A05(ExpressionsBottomSheetView expressionsBottomSheetView) {
        ExpressionsKeyboardViewModel expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
        expressionsViewModel.A07.A02(30, 1, AnonymousClass6R3.A00(expressionsViewModel.A02));
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onSearchStarted$1(expressionsViewModel, (String) null, (C023509x) null), C109325Xd.A00(expressionsViewModel));
    }

    public static final void A06(ExpressionsBottomSheetView expressionsBottomSheetView) {
        ExpressionsKeyboardViewModel expressionsViewModel = expressionsBottomSheetView.getExpressionsViewModel();
        expressionsViewModel.A07.A02(30, 1, AnonymousClass6R3.A00(expressionsViewModel.A02));
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onSearchStarted$1(expressionsViewModel, (String) null, (C023509x) null), C109325Xd.A00(expressionsViewModel));
    }

    public final void A0A() {
        C158237gb r1;
        AnonymousClass02E A0N2;
        C158237gb r12;
        if (C90504aG.A1W(this)) {
            Iterator it = C113225fC.A00.iterator();
            while (it.hasNext()) {
                String A0C2 = AnonymousClass001.A0C(it);
                Activity A062 = C36361kB.A06(this);
                AnonymousClass00C.A0E(A062, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                AnonymousClass01L r13 = (AnonymousClass01L) A062;
                C36321k7.A0w(r13, A0C2);
                AnonymousClass01z supportFragmentManager = r13.getSupportFragmentManager();
                if (supportFragmentManager.A0E) {
                    A0N2 = null;
                } else {
                    A0N2 = supportFragmentManager.A0N(A0C2);
                }
                if ((A0N2 instanceof C158237gb) && (r12 = (C158237gb) A0N2) != null) {
                    r12.BTx();
                }
            }
            return;
        }
        if (this.A09 == null) {
            A01();
        }
        C95314kY r4 = this.A09;
        int i = 0;
        if (r4 != null && !r4.A05) {
            r4.A05 = true;
            int size = r4.A04.size();
            if (size >= 0) {
                while (true) {
                    AnonymousClass02E r14 = (AnonymousClass02E) r4.A01.get(i);
                    if ((r14 instanceof C158237gb) && (r1 = (C158237gb) r14) != null) {
                        r1.BTx();
                    }
                    if (i != size) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void A0C() {
        C95314kY r1;
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass63V r3 = expressionsViewModel.A09;
        r3.A00 = 5;
        C119575q5 r12 = expressionsViewModel.A02;
        r3.A00(r12, r12, 2);
        r3.A01 = null;
        if (!C90504aG.A1W(this) && (r1 = this.A09) != null) {
            r1.A05 = false;
        }
        setCurrentChatJid((AnonymousClass11F) null);
    }

    public final void A0D() {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        AnonymousClass63V r2 = expressionsViewModel.A09;
        if (r2.A01 == null) {
            r2.A01 = C36361kB.A0l();
        }
        C119575q5 r1 = expressionsViewModel.A02;
        r2.A00(r1, r1, 1);
    }

    public final void A0E(int i) {
        Rect A062 = AnonymousClass001.A06();
        if (getGlobalVisibleRect(A062)) {
            int height = getHeight() - A062.height();
            if (i == 1) {
                C90484aE.A17(this.A0X, 1, height);
            } else if (i == 3) {
                C90484aE.A17(this.A0X, 1, 0);
                getExpressionsViewModel().A09.A00 = 3;
            } else if (i == 4) {
                C90484aE.A17(this.A0X, 1, height);
                getExpressionsViewModel().A09.A00 = 4;
                this.A0Q = A062.height();
            }
            A03();
        }
    }

    public final void A0F(Integer num, Integer num2, Integer num3, Integer num4, int i) {
        C95314kY r0;
        int i2 = i;
        if (!C90504aG.A1W(this) && (r0 = this.A09) != null) {
            r0.A00 = i;
        }
        if (getExpressionsViewModel().A00 == 7) {
            C36391kE.A1C(getResources(), this.A0X, R.color.f6nameremoved);
        }
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onTabsUpdated$1(expressionsViewModel, num, num3, num2, num4, (C023509x) null, i2), C109325Xd.A00(expressionsViewModel));
    }

    public final void A0G(String str) {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onMoveToAvatarCategory$1(expressionsViewModel, str, (C023509x) null), C109325Xd.A00(expressionsViewModel));
    }

    public final void A0H(String str) {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onMoveToStickerPage$1(expressionsViewModel, str, (C023509x) null), C109325Xd.A00(expressionsViewModel));
    }

    public final void A0I(String str) {
        ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onMoveToStickerTab$1(expressionsViewModel, (C023509x) null), C109325Xd.A00(expressionsViewModel));
        ExpressionsKeyboardViewModel expressionsViewModel2 = getExpressionsViewModel();
        C36331k8.A1T(new ExpressionsKeyboardViewModel$onSearchStarted$1(expressionsViewModel2, str, (C023509x) null), C109325Xd.A00(expressionsViewModel2));
    }

    public final AnonymousClass11F getCurrentChatJid() {
        return this.A0H;
    }

    public final ViewGroup getRootView() {
        return this.A0X;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getAbProps().A0E(6641) && AnonymousClass00C.A0J(C36341k9.A0E(getWaSharedPreferences()).getString("expressions_keyboard_selected_tab", "EMOJI"), "EMOJI")) {
            ExpressionsKeyboardViewModel expressionsViewModel = getExpressionsViewModel();
            C122495uw r4 = this.A0U;
            C36381kD.A1R(expressionsViewModel.A0G, new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(r4, (C023509x) null), C109325Xd.A00(expressionsViewModel));
        }
        if (!C90504aG.A1W(this)) {
            if (this.A09 == null) {
                A01();
            }
            ViewPager viewPager = this.A00;
            if (viewPager != null) {
                viewPager.setLayoutDirection(C36401kF.A1X(getWhatsAppLocale()) ? 1 : 0);
                C95314kY r1 = this.A09;
                if (r1 != null) {
                    viewPager.setOffscreenPageLimit(r1.A04.size());
                } else {
                    r1 = null;
                }
                viewPager.setAdapter(r1);
                viewPager.A0K(new C163637qW(this, 0));
            }
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A0c;
        materialButtonToggleGroup.A06.add(new C163447qD(this, 1));
        AnonymousClass3Y1.A00(this.A0W, this, 22);
        AnonymousClass3Y1.A00(this.A0d, this, 21);
        C001700s r3 = getExpressionsViewModel().A05;
        AnonymousClass012 A002 = AnonymousClass0QD.A00(this);
        AnonymousClass00C.A0B(A002);
        C165177t0.A00(A002, r3, new C154417Sc(this), 13);
        AnonymousClass012 A003 = AnonymousClass0QD.A00(this);
        if (A003 != null) {
            C36331k8.A1T(new ExpressionsBottomSheetView$observeExpressionsSideEffects$1$1(A003, this, (C023509x) null), C33311f5.A00(A003));
        }
        C36331k8.A0q(getContext(), this.A0Z, R.string.f12nameremoved);
        C36331k8.A0q(getContext(), this.A0a, R.string.f12nameremoved);
        C36331k8.A0q(getContext(), this.A0Y, R.string.f12nameremoved);
        C36331k8.A0q(getContext(), this.A0b, R.string.f12nameremoved);
    }

    public final void setAdapterFunStickerData(AnonymousClass3XM r2) {
        if (C90504aG.A1W(this)) {
            this.A0E = r2;
            return;
        }
        C95314kY r0 = this.A09;
        if (r0 != null) {
            r0.A03 = r2;
        }
    }

    public final void setEmojiClickListener(C88314Sf r1) {
        this.A01 = r1;
    }

    public final void setExpressionsDismissListener(AnonymousClass7gY r1) {
        this.A05 = r1;
    }

    public final void setGifSelectionListener(C87794Qe r1) {
        this.A0F = r1;
    }

    public final void setShapeSelectionListener(C006302t r1) {
        this.A0N = r1;
    }

    public final void setStickerSelectionListener(C88234Rx r1) {
        this.A0I = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context, AttributeSet attributeSet, int i, AnonymousClass11F r9) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A0P) {
            this.A0P = true;
            C27861Qc r2 = (C27861Qc) ((C27851Qb) generatedComponent());
            C18800tq r1 = r2.A0M;
            this.A0D = C36341k9.A0V(r1);
            this.A0J = C90504aG.A0W(r1);
            this.A0G = C36351kA.A0h(r1);
            this.A03 = C36341k9.A0T(r1);
            this.A02 = C36351kA.A0Y(r1);
            this.A0K = C18840tu.A00(r2.A0L.A04);
            this.A0C = (C157347co) r2.A00.get();
            this.A04 = C36351kA.A0c(r1.A00);
        }
        this.A0j = C36431kI.A1I(new AnonymousClass7LL(this));
        this.A0H = r9;
        this.A0M = C023409w.A00;
        this.A0e = new C162377oU(Looper.getMainLooper(), this, 3);
        this.A0V = new AnonymousClass6UI(this, 6);
        LayoutInflater.from(context).inflate(getAbProps().A0E(5627) ? R.layout.f9nameremoved : R.layout.f9nameremoved, this, true);
        this.A0X = (ViewGroup) C36361kB.A0G(this, R.id.expressions_view_root);
        this.A0f = C36361kB.A0G(this, R.id.browser_view);
        if (!getAbProps().A0E(5627)) {
            this.A00 = (ViewPager) C012005e.A02(this, R.id.browser_content);
        }
        this.A0W = C36361kB.A0G(this, R.id.search_button);
        this.A0S = C36441kJ.A0T(this, R.id.contextual_action_button_holder);
        this.A0T = C36431kI.A0X(this, R.id.contextual_action_button);
        this.A0R = C012005e.A02(this, R.id.contextual_action_badge);
        this.A0c = (MaterialButtonToggleGroup) C36361kB.A0G(this, R.id.browser_tabs);
        this.A0Z = (MaterialButton) C36361kB.A0G(this, R.id.emojis);
        this.A0h = (LinearLayout) C36361kB.A0G(this, R.id.search_bar_layout);
        this.A0i = (ConstraintLayout) C36361kB.A0G(this, R.id.search_input_layout);
        this.A0g = C36361kB.A0G(this, R.id.search_entry_icon);
        this.A0d = C36341k9.A0Q(this, R.id.search_entry);
        this.A0a = (MaterialButton) C36361kB.A0G(this, R.id.gifs);
        this.A0Y = (MaterialButton) C36361kB.A0G(this, R.id.avatar_stickers);
        this.A0b = (MaterialButton) C36361kB.A0G(this, R.id.stickers);
        if (getAbProps().A0E(6641)) {
            C157347co emojiPrerenderCacheFactory = getEmojiPrerenderCacheFactory();
            Resources resources = getResources();
            AnonymousClass00C.A08(resources);
            C18800tq r0 = ((C145316th) emojiPrerenderCacheFactory).A00.A01;
            this.A0U = new C122495uw(resources, (AnonymousClass1XN) r0.A7G.get(), C36351kA.A0e(r0), C36341k9.A0V(r0));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (AnonymousClass11F) null);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExpressionsBottomSheetView(Context context) {
        this(context, (AttributeSet) null, 0, (AnonymousClass11F) null);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpressionsBottomSheetView(Context context, AttributeSet attributeSet, int i, AnonymousClass11F r7, int i2, C05250Oz r9) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, C36391kE.A01(i2, i), (i2 & 8) != 0 ? null : r7);
    }
}
