package com.whatsapp;

import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C27981Qp;
import X.C34271gk;
import X.C36351kA;
import X.C36381kD;
import X.C36411kG;
import X.C36441kJ;
import X.C66923Xv;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.whatsapp.wds.components.button.WDSButton;

public class WaButtonWithLoader extends RelativeLayout implements C18700tb {
    public View.OnClickListener A00;
    public ProgressBar A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public boolean A04;
    public Button A05;
    public String A06;

    public void A01() {
        this.A04 = false;
        A00();
    }

    public void A02() {
        this.A04 = true;
        A00();
    }

    private void A00() {
        String str;
        Button button = this.A05;
        if (this.A04) {
            str = null;
        } else {
            str = this.A06;
        }
        button.setText(str);
        this.A01.setVisibility(C36351kA.A00(this.A04 ? 1 : 0));
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setEnabled(boolean z) {
        this.A05.setEnabled(z);
        super.setEnabled(z);
    }

    public void setSize(C34271gk r3) {
        Button button = this.A05;
        if (button instanceof WDSButton) {
            ((WDSButton) button).setSize(r3);
        }
    }

    public void setVariant(C27981Qp r4) {
        Drawable indeterminateDrawable;
        Button button = this.A05;
        if (button instanceof WDSButton) {
            ((WDSButton) button).setVariant(r4);
        }
        if (r4 == C27981Qp.TONAL && (indeterminateDrawable = this.A01.getIndeterminateDrawable()) != null) {
            indeterminateDrawable.setColorFilter(AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), PorterDuff.Mode.SRC_IN);
        }
    }

    public WaButtonWithLoader(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A06 = null;
        A03(context);
    }

    public void A03(Context context) {
        View A0J = C36411kG.A0J(LayoutInflater.from(context), this, R.layout.f9nameremoved);
        this.A05 = (Button) C012005e.A02(A0J, R.id.button_view);
        ProgressBar progressBar = (ProgressBar) C012005e.A02(A0J, R.id.loader_view);
        this.A01 = progressBar;
        progressBar.getIndeterminateDrawable().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
        C66923Xv.A01(this.A05, this, 18);
        A00();
    }

    public void setButtonText(int i) {
        setButtonText(C36381kD.A0t(this, i));
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A06 = null;
        A03(context);
    }

    public void setButtonText(String str) {
        this.A06 = str;
        A00();
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public WaButtonWithLoader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A06 = null;
        A03(context);
    }
}
