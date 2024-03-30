package com.whatsapp.registration;

import X.AnonymousClass1QZ;
import X.AnonymousClass1RH;
import X.C18700tb;
import X.C36441kJ;
import X.C89634Xh;
import X.C90124Ze;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.whatsapp.WaTextView;

public class RegistrationScrollView extends ScrollView implements C18700tb {
    public ViewTreeObserver.OnGlobalLayoutListener A00;
    public LinearLayout A01;
    public WaTextView A02;
    public AnonymousClass1QZ A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final ViewTreeObserver.OnScrollChangedListener A07;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A03;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public void setTopAndBottomScrollingElevation(LinearLayout linearLayout, WaTextView waTextView) {
        this.A01 = linearLayout;
        this.A02 = waTextView;
        this.A00 = new C90124Ze(waTextView, linearLayout, this, 4);
        getViewTreeObserver().addOnGlobalLayoutListener(this.A00);
    }

    public RegistrationScrollView(Context context) {
        super(context);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass1RH.A00(getContext());
        this.A07 = new C89634Xh(this, 6);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass1RH.A00(getContext());
        this.A07 = new C89634Xh(this, 6);
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public RegistrationScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A06 = AnonymousClass1RH.A00(getContext());
        this.A07 = new C89634Xh(this, 6);
    }
}
