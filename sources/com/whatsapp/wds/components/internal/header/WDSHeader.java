package com.whatsapp.wds.components.internal.header;

import X.AnonymousClass00C;
import X.AnonymousClass088;
import X.AnonymousClass1QZ;
import X.AnonymousClass3QI;
import X.C05250Oz;
import X.C18700tb;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36441kJ;
import X.C51372ni;
import X.C63323Jp;
import X.C65723Tf;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;

public final class WDSHeader extends LinearLayout implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public final WaImageView A02;
    public final WaTextView A03;
    public final WaTextView A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public final void setViewState(C63323Jp r3) {
        AnonymousClass00C.A0D(r3, 0);
        Drawable drawable = r3.A00;
        WaImageView waImageView = this.A02;
        C65723Tf.A03(waImageView, drawable);
        waImageView.setImageDrawable(drawable);
        this.A04.setText(r3.A03);
        CharSequence charSequence = r3.A02;
        WaTextView waTextView = this.A03;
        C65723Tf.A03(waTextView, charSequence);
        waTextView.setText(charSequence);
        setSize(r3.A01);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setHeaderImageMarginEnabled(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        WaImageView waImageView = this.A02;
        ViewGroup.LayoutParams layoutParams = waImageView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i4 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
        } else {
            i = 0;
        }
        if (z) {
            i2 = C36341k9.A0F(this).getDimensionPixelOffset(R.dimen.f7nameremoved);
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = waImageView.getLayoutParams();
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
            i3 = 0;
        } else {
            i3 = marginLayoutParams3.rightMargin;
        }
        ViewGroup.LayoutParams layoutParams3 = waImageView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i4 = marginLayoutParams2.bottomMargin;
        }
        C65723Tf.A02(waImageView, new AnonymousClass3QI(i, i2, i3, i4));
    }

    public final void setHeaderTextGravity(int i) {
        this.A04.setGravity(i);
        this.A03.setGravity(i);
    }

    private final void setSize(C51372ni r3) {
        WaTextView waTextView;
        int i;
        int ordinal = r3.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                waTextView = this.A04;
                i = R.style.f13nameremoved;
            }
            AnonymousClass088.A06(this.A03, R.style.f13nameremoved);
        }
        waTextView = this.A04;
        i = R.style.f13nameremoved;
        AnonymousClass088.A06(waTextView, i);
        AnonymousClass088.A06(this.A03, R.style.f13nameremoved);
    }

    public WDSHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public /* synthetic */ WDSHeader(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        setOrientation(1);
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A02 = (WaImageView) C36361kB.A0G(this, R.id.icon);
        this.A04 = C36341k9.A0Q(this, R.id.headline);
        this.A03 = C36341k9.A0Q(this, R.id.description);
    }
}
