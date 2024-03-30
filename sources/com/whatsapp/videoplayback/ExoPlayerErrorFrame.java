package com.whatsapp.videoplayback;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public final class ExoPlayerErrorFrame extends FrameLayout implements C18700tb {
    public View.OnClickListener A00;
    public View A01;
    public FrameLayout A02;
    public TextView A03;
    public AnonymousClass1QZ A04;
    public boolean A05;
    public final FrameLayout A06;
    public final CircularProgressBar A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.A06 = (FrameLayout) inflate;
        this.A07 = (CircularProgressBar) C36361kB.A0F(this, R.id.loading);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A04;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final int getErrorScreenVisibility() {
        FrameLayout frameLayout = this.A02;
        if (frameLayout != null) {
            return frameLayout.getVisibility();
        }
        return 8;
    }

    public final void setLoadingViewVisibility(int i) {
        this.A07.setVisibility(i);
    }

    public final void setOnRetryListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ ExoPlayerErrorFrame(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ExoPlayerErrorFrame(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
