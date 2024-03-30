package com.whatsapp.mediacomposer.doodle.titlebar;

import X.AnonymousClass00C;
import X.AnonymousClass066;
import X.AnonymousClass17Y;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C100744vb;
import X.C122685vG;
import X.C129126Fh;
import X.C135466ck;
import X.C163077pc;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19420v0;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import X.C54762tV;
import X.C91184bb;
import X.C91364bt;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public final class TitleBarView extends RelativeLayout implements C18700tb {
    public int A00;
    public View A01;
    public View A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public ImageView A07;
    public ImageView A08;
    public ImageView A09;
    public RelativeLayout A0A;
    public AnonymousClass17Y A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public C21060yb A0E;
    public C19420v0 A0F;
    public C18820ts A0G;
    public C20810yC A0H;
    public C91184bb A0I;
    public C91184bb A0J;
    public C91184bb A0K;
    public C91184bb A0L;
    public C91184bb A0M;
    public C91184bb A0N;
    public C91184bb A0O;
    public C91184bb A0P;
    public C122685vG A0Q;
    public C129126Fh A0R;
    public C19770wU A0S;
    public WDSButton A0T;
    public AnonymousClass1QZ A0U;
    public Runnable A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A0W) {
            this.A0W = true;
            C18800tq A0W2 = C36391kE.A0W(generatedComponent());
            this.A0G = C36341k9.A0T(A0W2);
            this.A0H = C36341k9.A0V(A0W2);
            this.A0S = C36341k9.A0Z(A0W2);
            this.A0B = C36351kA.A0M(A0W2);
            this.A0Q = (C122685vG) A0W2.A00.A9e.get();
            this.A0F = C36351kA.A0Y(A0W2);
            this.A0E = C36351kA.A0U(A0W2);
        }
        this.A0X = true;
    }

    public static final void setMagicModVisibility$lambda$17$lambda$16(TitleBarView titleBarView, View view) {
        AnonymousClass00C.A0D(titleBarView, 0);
        C129126Fh r0 = titleBarView.A0R;
        if (r0 != null) {
            r0.A03();
        }
    }

    public static final void setTooltipInPosition$lambda$13$lambda$12(TitleBarView titleBarView, View view) {
        AnonymousClass00C.A0D(titleBarView, 0);
        A00(titleBarView);
    }

    public static final void setTooltipInPosition$lambda$14(TitleBarView titleBarView) {
        AnonymousClass00C.A0D(titleBarView, 0);
        WaTextView waTextView = titleBarView.A0C;
        if (waTextView == null) {
            throw C36331k8.A0d("mediaQualityToolTip");
        }
        waTextView.setVisibility(0);
    }

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0H = r2;
    }

    public final void setFont(int i) {
        int i2;
        if (i == 2) {
            i2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        } else {
            i2 = 0;
        }
        WaTextView waTextView = this.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView.setTypeface(C54762tV.A00(C36371kC.A0B(waTextView), i));
        waTextView.setPadding(0, i2, i2, 0);
    }

    public final void setGlobalUI(AnonymousClass17Y r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0B = r2;
    }

    public final void setMediaQualityTooltipUtil(C122685vG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0Q = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0E = r2;
    }

    public final void setToolBarExtra(RelativeLayout relativeLayout) {
        AnonymousClass00C.A0D(relativeLayout, 0);
        this.A0A = relativeLayout;
    }

    public final void setWaSharedPreferences(C19420v0 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0F = r2;
    }

    public final void setWaWorkers(C19770wU r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0S = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A0G = r2;
    }

    public static final void A00(TitleBarView titleBarView) {
        WaTextView waTextView = titleBarView.A0C;
        if (waTextView == null) {
            throw C36331k8.A0d("mediaQualityToolTip");
        } else if (waTextView.getVisibility() == 0) {
            AlphaAnimation A0L2 = C36371kC.A0L();
            A0L2.setInterpolator(new AnonymousClass066());
            A0L2.setDuration(100);
            A0L2.setAnimationListener(new C163077pc(titleBarView, 2));
            WaTextView waTextView2 = titleBarView.A0C;
            if (waTextView2 == null) {
                throw C36331k8.A0d("mediaQualityToolTip");
            }
            waTextView2.startAnimation(A0L2);
        }
    }

    public final void A01(Animation animation) {
        View view = this.A02;
        if (view == null) {
            throw C36331k8.A0d("titleBar");
        } else if (view.getVisibility() != 0) {
            View view2 = this.A02;
            if (view2 == null) {
                throw C36331k8.A0d("titleBar");
            }
            view2.setVisibility(0);
            View view3 = this.A02;
            if (view3 == null) {
                throw C36331k8.A0d("titleBar");
            }
            view3.startAnimation(animation);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0U;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0U = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        C20810yC r0 = this.A0H;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final int getCropToolId() {
        ImageView imageView = this.A04;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C36331k8.A0d("cropTool");
    }

    public final float getCropToolOffsetX() {
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A04;
        if (imageView2 == null) {
            throw C36331k8.A0d("cropTool");
        }
        float x2 = x - imageView2.getX();
        ImageView imageView3 = this.A04;
        if (imageView3 != null) {
            return x2 - imageView3.getTranslationX();
        }
        throw C36331k8.A0d("cropTool");
    }

    public final AnonymousClass17Y getGlobalUI() {
        AnonymousClass17Y r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A06();
    }

    public final float getMagicModToolOffsetX() {
        float f;
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A05;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A05;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final C122685vG getMediaQualityTooltipUtil() {
        C122685vG r0 = this.A0Q;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaQualityTooltipUtil");
    }

    public final float getMediaSettingsToolOffsetX() {
        float f;
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A06;
        float f2 = 0.0f;
        if (imageView2 != null) {
            f = imageView2.getX();
        } else {
            f = 0.0f;
        }
        float f3 = x - f;
        ImageView imageView3 = this.A06;
        if (imageView3 != null) {
            f2 = imageView3.getTranslationX();
        }
        return f3 - f2;
    }

    public final int getPenToolId() {
        ImageView imageView = this.A07;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C36331k8.A0d("penTool");
    }

    public final int getShapeToolId() {
        ImageView imageView = this.A08;
        if (imageView != null) {
            return imageView.getId();
        }
        throw C36331k8.A0d("shapeTool");
    }

    public final float getShapeToolOffsetX() {
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        float x = imageView.getX();
        ImageView imageView2 = this.A08;
        if (imageView2 == null) {
            throw C36331k8.A0d("shapeTool");
        }
        float x2 = x - imageView2.getX();
        ImageView imageView3 = this.A08;
        if (imageView3 != null) {
            return x2 - imageView3.getTranslationX();
        }
        throw C36331k8.A0d("shapeTool");
    }

    public final View getStartingViewFromToolbarExtra() {
        ImageView imageView = this.A03;
        if (imageView != null) {
            return imageView;
        }
        throw C36331k8.A0d("backButton");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A0E;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final int getTextToolId() {
        WaTextView waTextView = this.A0D;
        if (waTextView != null) {
            return waTextView.getId();
        }
        throw C36331k8.A0d("textTool");
    }

    public final float getTextToolOffsetX() {
        ImageView imageView = this.A07;
        if (imageView == null) {
            throw C36331k8.A0d("penTool");
        }
        float x = imageView.getX();
        WaTextView waTextView = this.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        float x2 = x - waTextView.getX();
        WaTextView waTextView2 = this.A0D;
        if (waTextView2 != null) {
            return x2 - waTextView2.getTranslationX();
        }
        throw C36331k8.A0d("textTool");
    }

    public final RelativeLayout getToolbarExtra() {
        RelativeLayout relativeLayout = this.A0A;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        throw C36331k8.A0d("toolBarExtraView");
    }

    public final C19420v0 getWaSharedPreferences() {
        C19420v0 r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public final C19770wU getWaWorkers() {
        C19770wU r0 = this.A0S;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A08();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void setCloseButtonAlpha(float f) {
        ImageView imageView = this.A03;
        if (imageView == null) {
            throw C36331k8.A0d("backButton");
        }
        imageView.setAlpha(f);
    }

    public final void setCropToolVisibility(int i) {
        ImageView imageView = this.A04;
        if (imageView == null) {
            throw C36331k8.A0d("cropTool");
        }
        imageView.setVisibility(i);
    }

    public final void setCropToolX(float f) {
        ImageView imageView = this.A04;
        if (imageView == null) {
            throw C36331k8.A0d("cropTool");
        }
        imageView.setTranslationX(f);
    }

    public final void setMagicModBackgroundColor(int i) {
        C91184bb r0 = this.A0K;
        if (r0 != null) {
            r0.A00(i);
        }
    }

    public final void setMagicModToolX(float f) {
        ImageView imageView = this.A05;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setMagicModVisibility(int i) {
        ViewStub viewStub;
        ImageView imageView = this.A05;
        if (imageView != null) {
            imageView.setVisibility(i);
        } else if (i == 0 && (viewStub = (ViewStub) findViewById(R.id.magic_mod_tool_stub)) != null) {
            viewStub.setLayoutResource(R.layout.f9nameremoved);
            View inflate = viewStub.inflate();
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView2 = (ImageView) inflate;
            imageView2.setVisibility(i);
            C91184bb r2 = new C91184bb(C36371kC.A0B(this), 0);
            r2.A03 = imageView2.getDrawable();
            r2.invalidateSelf();
            C91184bb r0 = this.A0N;
            if (r0 == null) {
                throw C36331k8.A0d("shapeToolDrawable");
            }
            r2.A01(this.A00, r0.A01);
            imageView2.setImageDrawable(r2);
            C135466ck.A00(imageView2, this, 37);
            this.A05 = imageView2;
            this.A0K = r2;
        }
    }

    public final void setMediaQualityVisibility(int i) {
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setVisibility(i);
        }
    }

    public final void setMediaSettingsToolX(float f) {
        ImageView imageView = this.A06;
        if (imageView != null) {
            imageView.setTranslationX(f);
        }
    }

    public final void setMediaToolsVisibility(int i) {
        View view = this.A01;
        if (view == null) {
            throw C36331k8.A0d("mediaTools");
        }
        view.setVisibility(i);
    }

    public final void setPenToolDrawableStrokePreview(boolean z) {
        C91184bb r0 = this.A0M;
        if (r0 == null) {
            throw C36331k8.A0d("penToolDrawable");
        }
        r0.A04 = z;
    }

    public final void setShapeToolDrawableStrokePreview(boolean z) {
        C91184bb r0 = this.A0N;
        if (r0 == null) {
            throw C36331k8.A0d("shapeToolDrawable");
        }
        r0.A04 = z;
    }

    public final void setShapeToolX(float f) {
        ImageView imageView = this.A08;
        if (imageView == null) {
            throw C36331k8.A0d("shapeTool");
        }
        imageView.setTranslationX(f);
    }

    public final void setTextToolX(float f) {
        WaTextView waTextView = this.A0D;
        if (waTextView == null) {
            throw C36331k8.A0d("textTool");
        }
        waTextView.setTranslationX(f);
    }

    public final void setToolbarExtraVisibility(int i) {
        RelativeLayout relativeLayout = this.A0A;
        if (relativeLayout == null) {
            throw C36331k8.A0d("toolBarExtraView");
        }
        relativeLayout.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r6 == 4) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUndoButtonVisibility(int r6) {
        /*
            r5 = this;
            android.widget.ImageView r0 = r5.A09
            java.lang.String r4 = "undoButton"
            if (r0 != 0) goto L_0x000b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x000b:
            int r0 = r0.getVisibility()
            if (r0 == r6) goto L_0x004e
            android.widget.ImageView r0 = r5.A09
            if (r0 != 0) goto L_0x001a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x001a:
            r0.setVisibility(r6)
            r3 = 1065353216(0x3f800000, float:1.0)
            r1 = 4
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r6 == r1) goto L_0x0027
            r0 = 0
            if (r6 != r1) goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r0, r3)
            if (r6 != r1) goto L_0x0045
            X.066 r0 = new X.066
            r0.<init>()
        L_0x0034:
            r2.setInterpolator(r0)
            r0 = 100
            r2.setDuration(r0)
            android.widget.ImageView r0 = r5.A09
            if (r0 != 0) goto L_0x004b
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r4)
            throw r0
        L_0x0045:
            X.02K r0 = new X.02K
            r0.<init>()
            goto L_0x0034
        L_0x004b:
            r0.startAnimation(r2)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView.setUndoButtonVisibility(int):void");
    }

    public final void setUndoToolX(float f) {
        ImageView imageView = this.A09;
        if (imageView == null) {
            throw C36331k8.A0d("undoButton");
        }
        imageView.setTranslationX(f);
    }

    public final View getMagicModTool() {
        return this.A05;
    }

    public final void setBackButtonDrawable(boolean z) {
        int i = R.drawable.new_close;
        if (z) {
            i = R.drawable.new_back;
        }
        C100744vb A002 = C91364bt.A00(getContext(), getWhatsAppLocale(), i);
        C91184bb r0 = this.A0I;
        if (r0 == null) {
            throw C36331k8.A0d("closeButtonDrawable");
        }
        r0.A03 = A002;
        r0.invalidateSelf();
        C91184bb r1 = this.A0I;
        if (r1 == null) {
            throw C36331k8.A0d("closeButtonDrawable");
        }
        r1.A00(this.A00);
        ImageView imageView = this.A03;
        if (imageView == null) {
            throw C36331k8.A0d("backButton");
        }
        C91184bb r02 = this.A0I;
        if (r02 == null) {
            throw C36331k8.A0d("closeButtonDrawable");
        }
        imageView.setImageDrawable(r02);
        ImageView imageView2 = this.A03;
        if (imageView2 == null) {
            throw C36331k8.A0d("backButton");
        }
        imageView2.requestLayout();
        ImageView imageView3 = this.A03;
        if (imageView3 == null) {
            throw C36331k8.A0d("backButton");
        }
        imageView3.setVisibility(C36381kD.A00(0));
        WDSButton wDSButton = this.A0T;
        if (wDSButton == null) {
            throw C36331k8.A0d("doneButton");
        }
        wDSButton.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ TitleBarView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TitleBarView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
