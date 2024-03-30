package com.google.android.material.snackbar;

import X.AnonymousClass04F;
import X.AnonymousClass064;
import X.C017807p;
import X.C17130qm;
import X.C36391kE;
import X.C90484aE;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public class SnackbarContentLayout extends LinearLayout implements C17130qm {
    public int A00;
    public Button A01;
    public TextView A02;
    public final TimeInterpolator A03;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public void B0y(int i, int i2) {
        this.A02.setAlpha(1.0f);
        long j = (long) i2;
        ViewPropertyAnimator duration = this.A02.animate().alpha(0.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.A03;
        long j2 = (long) 0;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.A01.getVisibility() == 0) {
            this.A01.setAlpha(1.0f);
            this.A01.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    public void B0x(int i, int i2) {
        this.A02.setAlpha(0.0f);
        long j = (long) i2;
        ViewPropertyAnimator duration = this.A02.animate().alpha(1.0f).setDuration(j);
        TimeInterpolator timeInterpolator = this.A03;
        long j2 = (long) i;
        duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
        if (this.A01.getVisibility() == 0) {
            this.A01.setAlpha(0.0f);
            this.A01.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
        }
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A02.getPaddingTop() == i2 && this.A02.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A02;
        if (A01(textView)) {
            AnonymousClass04F.A06(textView, AnonymousClass04F.A03(textView), i2, AnonymousClass04F.A02(textView), i3);
            return true;
        }
        C90484aE.A17(textView, i2, i3);
        return true;
    }

    public static boolean A01(View view) {
        return view.isPaddingRelative();
    }

    public Button getActionView() {
        return this.A01;
    }

    public TextView getMessageView() {
        return this.A02;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.A02 = C36391kE.A0P(this, R.id.snackbar_text);
        this.A01 = (Button) findViewById(R.id.snackbar_action);
    }

    public void onMeasure(int i, int i2) {
        boolean A002;
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            Layout layout = this.A02.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                dimensionPixelSize = dimensionPixelSize2;
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            } else {
                if (this.A00 > 0 && this.A01.getMeasuredWidth() > this.A00) {
                    A002 = A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
                }
                A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
            }
            if (A002) {
                super.onMeasure(i, i2);
            }
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.A00 = i;
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = C017807p.A01(AnonymousClass064.A02, context, R.attr.f4nameremoved);
    }
}
