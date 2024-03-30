package com.whatsapp.search.views.itemviews;

import X.AnonymousClass000;
import X.AnonymousClass00F;
import X.AnonymousClass1JZ;
import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass3UF;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C46812bi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class VoiceNoteProfileAvatarView extends FrameLayout implements C18700tb {
    public int A00;
    public int A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public C18820ts A05;
    public WDSButton A06;
    public AnonymousClass1QZ A07;
    public int A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;

    public void A04(int i, boolean z, boolean z2, boolean z3) {
        int i2 = 1;
        if (i != 0) {
            i2 = 2;
            if (i != 1) {
                if (i == 2) {
                    i2 = 3;
                } else {
                    throw AnonymousClass000.A0d("Unsupported FastPlaybackPlayerState ", AnonymousClass000.A0u(), i);
                }
            }
        }
        A05(i2, z, z2, z3);
    }

    public void A03() {
        if (!this.A09) {
            this.A09 = true;
            this.A05 = C36341k9.A0U(generatedComponent());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r4.A0B != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(int r18, boolean r19, boolean r20, boolean r21) {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.A08
            r8 = 1
            r9 = 0
            r5 = r18
            boolean r10 = X.C36381kD.A1U(r5, r0)
            r4.A08 = r5
            if (r20 != 0) goto L_0x0103
            if (r21 == 0) goto L_0x0103
            android.widget.ImageView r3 = r4.A02
        L_0x0014:
            if (r18 == 0) goto L_0x002c
            if (r5 == r8) goto L_0x00db
            r7 = 2
            if (r5 == r7) goto L_0x00eb
            com.whatsapp.wds.components.button.WDSButton r6 = r4.A06
            android.content.Context r2 = r4.getContext()
            r1 = 2131889573(0x7f120da5, float:1.9413813E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            X.AnonymousClass000.A1L(r0, r7, r9)
            X.C36341k9.A0s(r2, r6, r0, r1)
        L_0x002c:
            android.widget.ImageView r0 = r4.A04
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A02
            r0.setVisibility(r2)
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x0041
            boolean r0 = r4.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A06
            if (r18 != 0) goto L_0x0073
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r4.A03
            if (r1 != 0) goto L_0x004e
            r2 = 0
        L_0x004e:
            r0.setVisibility(r2)
            r3.setVisibility(r9)
            r4.setClickable(r9)
        L_0x0057:
            if (r19 == 0) goto L_0x0072
            if (r10 == 0) goto L_0x0072
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A06
            if (r18 != 0) goto L_0x0107
            A02(r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x006f
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x006f
            android.widget.ImageView r0 = r4.A03
            A01(r0)
        L_0x006f:
            A01(r3)
        L_0x0072:
            return
        L_0x0073:
            r0.setVisibility(r9)
            android.widget.ImageView r1 = r4.A03
            r0 = 4
            r1.setVisibility(r0)
            r3.setVisibility(r0)
            r4.setClickable(r8)
            if (r21 == 0) goto L_0x00a7
            if (r20 != 0) goto L_0x00c2
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168772(0x7f070e04, float:1.7951855E38)
            int r14 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168769(0x7f070e01, float:1.795185E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r16 = 0
        L_0x009f:
            X.0ts r12 = r4.A05
            com.whatsapp.wds.components.button.WDSButton r11 = r4.A06
            X.AnonymousClass1JZ.A06(r11, r12, r13, r14, r15, r16)
            goto L_0x0057
        L_0x00a7:
            if (r20 != 0) goto L_0x00c2
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168770(0x7f070e02, float:1.7951851E38)
            int r15 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168768(0x7f070e00, float:1.7951847E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r13 = 0
            r14 = 0
            goto L_0x009f
        L_0x00c2:
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168771(0x7f070e03, float:1.7951853E38)
            int r13 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131168768(0x7f070e00, float:1.7951847E38)
            int r16 = r1.getDimensionPixelSize(r0)
            r14 = 0
            r15 = 0
            goto L_0x009f
        L_0x00db:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A06
            android.content.Context r6 = r4.getContext()
            r2 = 2131889573(0x7f120da5, float:1.9413813E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            goto L_0x00fc
        L_0x00eb:
            com.whatsapp.wds.components.button.WDSButton r7 = r4.A06
            android.content.Context r6 = r4.getContext()
            r2 = 2131889574(0x7f120da6, float:1.9413815E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x00fc:
            r1[r9] = r0
            X.C36341k9.A0s(r6, r7, r1, r2)
            goto L_0x002c
        L_0x0103:
            android.widget.ImageView r3 = r4.A04
            goto L_0x0014
        L_0x0107:
            A01(r0)
            boolean r0 = r4.A0A
            if (r0 != 0) goto L_0x0117
            boolean r0 = r4.A0C
            if (r0 != 0) goto L_0x0117
            android.widget.ImageView r0 = r4.A03
            A02(r0)
        L_0x0117:
            A02(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A05(int, boolean, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r3.A0B != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(boolean r4, int r5) {
        /*
            r3 = this;
            r3.A0A = r4
            android.widget.ImageView r2 = r3.A04
            if (r4 == 0) goto L_0x0020
            r1 = 2131231018(0x7f08012a, float:1.8078105E38)
            r2.setImageResource(r1)
            android.widget.ImageView r0 = r3.A02
            r0.setImageResource(r1)
            boolean r0 = r3.A0B
            r1 = 1
            if (r0 == 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            android.widget.ImageView r0 = r3.A03
            if (r1 != 0) goto L_0x001c
            r5 = 0
        L_0x001c:
            r0.setVisibility(r5)
            return
        L_0x0020:
            r0 = 2131231033(0x7f080139, float:1.8078136E38)
            r2.setImageResource(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.views.itemviews.VoiceNoteProfileAvatarView.A06(boolean, int):void");
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A07;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A07 = r0;
        }
        return r0.generatedComponent();
    }

    public void setIconColorTint(int i) {
        AnonymousClass3UF.A0B(getContext(), this.A03, this.A01, i);
    }

    public void setIsForwardedByNonAuthorPttUi(boolean z) {
        A06(z, 8);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        A03();
    }

    private void A00(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        View.inflate(context2, R.layout.f9nameremoved, this);
        this.A04 = C36401kF.A0G(this, R.id.picture);
        this.A02 = C36401kF.A0G(this, R.id.picture_in_group);
        this.A03 = C36401kF.A0G(this, R.id.mic_overlay);
        this.A06 = C36431kI.A0y(this, R.id.fast_playback_overlay);
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, AnonymousClass2x6.A0A);
            View A022 = C012005e.A02(this, R.id.picture_frame);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
            int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(7, Integer.MIN_VALUE);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
            int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            int dimensionPixelSize7 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            obtainStyledAttributes.recycle();
            AnonymousClass1JZ.A07(A022, this.A05, dimensionPixelSize, dimensionPixelSize2, A022.getPaddingRight(), dimensionPixelSize3);
            int i = dimensionPixelSize4;
            int i2 = dimensionPixelSize4;
            int i3 = dimensionPixelSize4;
            AnonymousClass1JZ.A07(this.A04, this.A05, dimensionPixelSize4, i3, i, i2);
            AnonymousClass1JZ.A07(this.A02, this.A05, dimensionPixelSize4, i3, i, i2);
            if (dimensionPixelSize5 != Integer.MIN_VALUE) {
                ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
                layoutParams.height = dimensionPixelSize5;
                layoutParams.width = dimensionPixelSize5;
                this.A04.setLayoutParams(layoutParams);
                this.A02.setLayoutParams(layoutParams);
            }
            this.A01 = R.drawable.mic_played;
            this.A00 = R.drawable.mic_background_incoming;
            this.A03.setBackground(drawable);
            C012005e.A0F(colorStateList, this.A03);
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A03);
            C18820ts r3 = this.A05;
            ImageView imageView = this.A03;
            ImageView imageView2 = imageView;
            C18820ts r17 = r3;
            AnonymousClass1JZ.A06(imageView2, r17, dimensionPixelSize6, A0a.topMargin, A0a.rightMargin, dimensionPixelSize7);
        }
    }

    public static void A01(View view) {
        AlphaAnimation A0D = C36351kA.A0D();
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(A0D);
        animationSet.setDuration(250);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public static void A02(View view) {
        AlphaAnimation A0L = C36371kC.A0L();
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(A0L);
        animationSet.setDuration(250);
        animationSet.setInterpolator(new AccelerateDecelerateInterpolator());
        view.startAnimation(animationSet);
    }

    public int getFastPlaybackViewState() {
        return this.A08;
    }

    public ImageView getGroupProfileImageView() {
        return this.A02;
    }

    public ImageView getProfileImageView() {
        return this.A04;
    }

    public void setIsNewsletterAudioOrPttUi(C46812bi r10) {
        boolean z = true;
        this.A0C = !r10.A1l();
        if (r10.A0W() == null) {
            z = false;
        }
        this.A0B = z;
        ImageView A0N = C36391kE.A0N(this, R.id.headphone_overlay);
        if (this.A0C && A0N != null) {
            this.A01 = R.drawable.headphone_played;
            this.A00 = R.drawable.headphone_background_incoming;
            Drawable mutate = C36381kD.A0H(getContext(), this.A00).mutate();
            ViewGroup.MarginLayoutParams A0a = AnonymousClass000.A0a(this.A03);
            AnonymousClass1JZ.A06(A0N, this.A05, A0a.leftMargin, A0a.topMargin, A0a.rightMargin, A0a.bottomMargin);
            C012005e.A0F(this.A03.getBackgroundTintList(), A0N);
            A0N.setBackground(mutate);
            A0N.setVisibility(0);
            this.A03.setVisibility(8);
            this.A03 = A0N;
        }
    }

    public void setOnFastPlaybackButtonClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
        this.A06.setOnClickListener(onClickListener);
        if (this.A06.getVisibility() == 8 || this.A06.getVisibility() == 4) {
            setClickable(false);
        }
    }

    public void setupIconBackgroundColor(int i) {
        Context context = getContext();
        Drawable mutate = C36381kD.A0H(context, this.A00).mutate();
        ColorStateList A042 = AnonymousClass00F.A04(context, i);
        this.A03.setBackground(mutate);
        C012005e.A0F(A042, this.A03);
    }

    public VoiceNoteProfileAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A0B = false;
        this.A0C = false;
        this.A08 = 0;
        A00(context, attributeSet);
    }

    public VoiceNoteProfileAvatarView(Context context) {
        super(context);
        A03();
        this.A0B = false;
        this.A0C = false;
        this.A08 = 0;
        A00(context, (AttributeSet) null);
    }
}
