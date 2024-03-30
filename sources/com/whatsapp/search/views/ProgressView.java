package com.whatsapp.search.views;

import X.AnonymousClass1QZ;
import X.C012005e;
import X.C18700tb;
import X.C36441kJ;
import X.C65103Qt;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;

public class ProgressView extends FrameLayout implements C18700tb {
    public AnimatorSet A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public final int A03;
    public final CircularProgressBar A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        View.inflate(context, R.layout.f9nameremoved, this);
        this.A04 = (CircularProgressBar) C012005e.A02(this, R.id.progress_bar);
        this.A03 = C65103Qt.A01(getContext(), 40.0f);
    }

    public ProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ProgressView(Context context) {
        this(context, (AttributeSet) null);
    }
}
