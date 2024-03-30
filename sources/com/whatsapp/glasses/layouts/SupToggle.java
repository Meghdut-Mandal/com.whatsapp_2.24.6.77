package com.whatsapp.glasses.layouts;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.C05250Oz;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import android.animation.LayoutTransition;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Map;

public final class SupToggle extends RelativeLayout {
    public int A00;
    public int A01;
    public int A02;
    public ImageView A03;
    public ImageView A04;
    public Map A05;
    public final int A06;
    public final int A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final RelativeLayout A0B;
    public final TextView A0C;
    public final StatusIndicator A0D;
    public final View A0E;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void setTrackHeight$lambda$3$lambda$2(SupToggle supToggle, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        AnonymousClass00C.A0D(supToggle, 0);
        View view = supToggle.A09;
        int A032 = C36341k9.A03(valueAnimator);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = A032;
        view.setLayoutParams(layoutParams);
    }

    public final void setSupCloseIcon(ImageView imageView) {
        AnonymousClass00C.A0D(imageView, 0);
        this.A03 = imageView;
    }

    public final void setSupIcon(ImageView imageView) {
        AnonymousClass00C.A0D(imageView, 0);
        this.A04 = imageView;
    }

    public final void setDoublePressPromptVisibility(boolean z) {
        this.A0D.setDoublePressPromptVisibility(z);
    }

    public final void setImageBitmaps(Map map) {
        this.A05 = map;
        this.A0D.A05 = map;
    }

    public final void setStatusIndicatorVisibility(boolean z) {
        this.A0D.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public final void setViewVisible(boolean z) {
        this.A0E.setVisibility(C36351kA.A00(z ? 1 : 0));
    }

    public final Map getImageBitmaps() {
        return this.A05;
    }

    public final ImageView getSupCloseIcon() {
        return this.A03;
    }

    public final ImageView getSupIcon() {
        return this.A04;
    }

    public /* synthetic */ SupToggle(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        AnonymousClass00C.A08(inflate);
        this.A0E = inflate;
        this.A0B = (RelativeLayout) C36361kB.A0G(inflate, R.id.sup_toggle_view);
        View A0G = C36361kB.A0G(inflate, R.id.sup_toggle_track);
        this.A09 = A0G;
        this.A04 = C36341k9.A0L(inflate, R.id.sup_toggle_icon);
        this.A03 = C36341k9.A0L(inflate, R.id.sup_toggle_close_icon);
        StatusIndicator statusIndicator = (StatusIndicator) C36361kB.A0G(inflate, R.id.sup_toggle_status_indicator);
        this.A0D = statusIndicator;
        this.A08 = C36361kB.A0G(inflate, R.id.glasses_tile_background);
        this.A06 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A01 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A00 = AnonymousClass00F.A00(inflate.getContext(), R.color.f6nameremoved);
        View A0G2 = C36361kB.A0G(inflate, R.id.hint_message);
        this.A0A = A0G2;
        this.A0C = C36341k9.A0M(A0G2, R.id.hint_message_text);
        this.A02 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A07 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(1);
        layoutTransition.setInterpolator(1, new AccelerateDecelerateInterpolator());
        layoutTransition.setDuration(150);
        layoutTransition.setAnimateParentHierarchy(false);
        setLayoutTransition(layoutTransition);
        Drawable background = A0G.getBackground();
        AnonymousClass00C.A0E(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.A02 = background.getIntrinsicHeight();
        statusIndicator.setParentView(inflate);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SupToggle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
