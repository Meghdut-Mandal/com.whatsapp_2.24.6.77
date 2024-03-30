package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.PeerAvatarLayout;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Objects;

/* renamed from: X.2HP  reason: invalid class name */
public final class AnonymousClass2HP extends C80183uz {
    public int A00;
    public View A01;
    public AnimationSet A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public PeerAvatarLayout A06;
    public AnonymousClass3KV A07;
    public C107265Nh A08;
    public CallState A09;
    public WDSButton A0A;
    public boolean A0B;
    public final ViewGroup A0C;
    public final C19730wQ A0D;
    public final C30531aM A0E;
    public final AnonymousClass1ND A0F;
    public final AnonymousClass16D A0G;
    public final AnonymousClass141 A0H;
    public final C20810yC A0I;
    public final C19770wU A0J;
    public final AnonymousClass1NK A0K = new AnonymousClass4YF(this, 1);
    public final C27721Pm A0L;
    public final AnonymousClass00T A0M = C36431kI.A1I(AnonymousClass4I3.A00);
    public final AnonymousClass171 A0N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2HP(ViewGroup viewGroup, C19730wQ r4, C30531aM r5, AnonymousClass1ND r6, AnonymousClass16D r7, AnonymousClass171 r8, AnonymousClass4V7 r9, AnonymousClass141 r10, C20810yC r11, C19770wU r12, C27721Pm r13, int i) {
        super(r9, 2);
        AnonymousClass00C.A0D(r11, 1);
        AnonymousClass00C.A0D(r4, 2);
        C36321k7.A17(r12, r7, r8, 3);
        C36321k7.A1C(r6, r5, r13, r9, r10);
        AnonymousClass00C.A0D(viewGroup, 11);
        this.A0I = r11;
        this.A0D = r4;
        this.A0J = r12;
        this.A0G = r7;
        this.A0N = r8;
        this.A0F = r6;
        this.A0E = r5;
        this.A0L = r13;
        this.A0H = r10;
        this.A0C = viewGroup;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r15.size() <= 8) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.view.View r12, X.AnonymousClass2HP r13, X.C107265Nh r14, java.util.ArrayList r15) {
        /*
            r7 = 0
            r8 = 1
            X.AnonymousClass00C.A0D(r15, r8)
            r2 = 2
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.0yC r1 = r13.A0I
            r0 = 5722(0x165a, float:8.018E-42)
            boolean r11 = r1.A0E(r0)
            r4 = 8
            if (r11 == 0) goto L_0x001d
            int r0 = r15.size()
            r10 = 1
            if (r0 > r4) goto L_0x001e
        L_0x001d:
            r10 = 0
        L_0x001e:
            r9 = 5
            if (r11 == 0) goto L_0x0052
            r1 = 8
            if (r10 == 0) goto L_0x0026
            r1 = 5
        L_0x0026:
            int r0 = r15.size()
            if (r0 <= r1) goto L_0x002d
            r0 = r1
        L_0x002d:
            java.util.List r0 = r15.subList(r7, r0)
            X.AnonymousClass00C.A08(r0)
            java.util.ArrayList r5 = X.C36321k7.A0J(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x003c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0054
            X.141 r1 = X.C36391kE.A0f(r3)
            X.AnonymousClass00C.A0B(r1)
            X.3ds r0 = new X.3ds
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x003c
        L_0x0052:
            r1 = 3
            goto L_0x0026
        L_0x0054:
            r6.addAll(r5)
            if (r10 == 0) goto L_0x0073
            java.lang.Object[] r3 = new java.lang.Object[r8]
            int r0 = r15.size()
            int r0 = r0 - r9
            X.AnonymousClass000.A1L(r3, r0, r7)
            r0 = 2131892766(0x7f121a1e, float:1.942029E38)
            X.2ft r1 = new X.2ft
            r1.<init>(r3, r0)
            X.3dt r0 = new X.3dt
            r0.<init>(r1)
            r6.add(r0)
        L_0x0073:
            if (r11 == 0) goto L_0x00ae
            com.whatsapp.WaTextView r3 = r13.A05
            if (r3 == 0) goto L_0x0091
            android.content.res.Resources r1 = X.C36341k9.A0F(r12)
            r0 = 2131166924(0x7f0706cc, float:1.7948107E38)
            float r0 = X.C36441kJ.A00(r1, r0)
            r3.setTextSize(r7, r0)
            int r0 = r14.A08
            if (r0 != r2) goto L_0x00a3
            r1 = 2131895804(0x7f1225fc, float:1.9426451E38)
        L_0x008e:
            r3.setText(r1)
        L_0x0091:
            com.whatsapp.WaTextView r0 = r13.A04
            if (r0 == 0) goto L_0x0098
            r0.setVisibility(r4)
        L_0x0098:
            com.whatsapp.calling.PeerAvatarLayout r0 = r13.A06
            if (r0 == 0) goto L_0x009f
            r0.A16(r6)
        L_0x009f:
            A02(r13)
            return
        L_0x00a3:
            boolean r0 = r14.A0K
            r1 = 2131886548(0x7f1201d4, float:1.9407678E38)
            if (r0 == 0) goto L_0x008e
            r1 = 2131895636(0x7f122554, float:1.942611E38)
            goto L_0x008e
        L_0x00ae:
            com.whatsapp.WaTextView r9 = r13.A05
            if (r9 == 0) goto L_0x00de
            android.content.res.Resources r1 = X.C36341k9.A0F(r12)
            r0 = 2131166923(0x7f0706cb, float:1.7948105E38)
            float r0 = X.C36441kJ.A00(r1, r0)
            r9.setTextSize(r7, r0)
            android.content.res.Resources r5 = X.C36341k9.A0F(r12)
            r4 = 2131755187(0x7f1000b3, float:1.9141246E38)
            int r3 = r15.size()
            java.lang.Object[] r2 = new java.lang.Object[r2]
            X.171 r1 = r13.A0N
            X.141 r0 = r13.A0H
            X.C36361kB.A1F(r1, r0, r2, r7)
            int r0 = r15.size()
            X.AnonymousClass000.A1L(r2, r0, r8)
            X.C36351kA.A16(r5, r9, r2, r4, r3)
        L_0x00de:
            com.whatsapp.WaTextView r0 = r13.A04
            if (r0 == 0) goto L_0x00e5
            r0.setVisibility(r7)
        L_0x00e5:
            android.content.Context r0 = X.C36371kC.A0B(r12)
            A00(r0, r13, r7)
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HP.A01(android.view.View, X.2HP, X.5Nh, java.util.ArrayList):void");
    }

    public static final void A00(Context context, AnonymousClass2HP r6, boolean z) {
        WaTextView waTextView = r6.A04;
        if (waTextView != null) {
            ViewGroup.LayoutParams layoutParams = waTextView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int i = dimensionPixelSize;
            if (z) {
                i = 0;
            }
            marginLayoutParams.setMargins(i, 0, dimensionPixelSize, 0);
            waTextView.setLayoutParams(marginLayoutParams);
        }
    }

    public static final void A03(AnonymousClass2HP r1) {
        AnimationSet animationSet = r1.A02;
        if (animationSet != null) {
            animationSet.cancel();
            r1.A02 = null;
            WaImageView waImageView = r1.A03;
            if (waImageView != null) {
                waImageView.clearAnimation();
                waImageView.setScaleX(1.0f);
                waImageView.setScaleY(1.0f);
                waImageView.setAlpha(0.75f);
            }
        }
    }

    public static final void A04(AnonymousClass2HP r2) {
        if (r2.A07 == null && r2.A08 == null) {
            r2.A0A(false);
        } else if (r2.A01 == null) {
            r2.A08();
        } else {
            r2.A0J.Bp1(C80223v3.A00(r2, 44));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r13.A0H.A0r != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass2HP r13) {
        /*
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()
            com.whatsapp.wds.components.button.WDSButton r2 = r13.A0A
            if (r2 == 0) goto L_0x0023
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x001f
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x0018
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            if (r1 == r0) goto L_0x0018
            X.3KV r0 = r13.A07
            if (r0 == 0) goto L_0x001f
        L_0x0018:
            X.141 r0 = r13.A0H
            boolean r1 = r0.A0r
            r0 = 1
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            r2.setEnabled(r0)
        L_0x0023:
            android.view.View r0 = r13.A01
            r9 = 1
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.isShown()
            if (r0 != r9) goto L_0x00b4
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A0A
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.isEnabled()
            if (r0 != r9) goto L_0x00b4
            android.view.animation.AnimationSet r0 = r13.A02
            if (r0 != 0) goto L_0x00b1
            com.whatsapp.WaImageView r3 = r13.A03
            if (r3 == 0) goto L_0x00b1
            android.graphics.drawable.Drawable r0 = r3.getDrawable()
            if (r0 != 0) goto L_0x0051
            com.whatsapp.wds.components.button.WDSButton r0 = r13.A0A
            if (r0 == 0) goto L_0x00b2
            android.graphics.drawable.Drawable r0 = r0.getBackground()
        L_0x004e:
            r3.setImageDrawable(r0)
        L_0x0051:
            android.view.animation.AnimationSet r2 = r13.A02
            if (r2 != 0) goto L_0x00aa
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131168365(0x7f070c6d, float:1.795103E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r8 = (float) r0
            float r0 = X.C36441kJ.A01(r3)
            float r6 = r8 / r0
            float r6 = r6 + r5
            float r0 = X.C36441kJ.A02(r3)
            float r8 = r8 / r0
            float r8 = r8 + r5
            r10 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r4 = new android.view.animation.ScaleAnimation
            r7 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r12 = 1056964608(0x3f000000, float:0.5)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            r3 = -1
            r4.setRepeatCount(r3)
            r2 = 1061158912(0x3f400000, float:0.75)
            r1 = 0
            android.view.animation.AlphaAnimation r0 = new android.view.animation.AlphaAnimation
            r0.<init>(r2, r1)
            r0.setRepeatCount(r3)
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r9)
            r2.addAnimation(r4)
            r2.addAnimation(r0)
            r2.setRepeatMode(r9)
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            android.view.animation.Interpolator r0 = (android.view.animation.Interpolator) r0
            r2.setInterpolator(r0)
            r0 = 1500(0x5dc, double:7.41E-321)
            r2.setDuration(r0)
            r13.A02 = r2
        L_0x00aa:
            com.whatsapp.WaImageView r0 = r13.A03
            if (r0 == 0) goto L_0x00b1
            r0.startAnimation(r2)
        L_0x00b1:
            return
        L_0x00b2:
            r0 = 0
            goto L_0x004e
        L_0x00b4:
            A03(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2HP.A02(X.2HP):void");
    }
}
