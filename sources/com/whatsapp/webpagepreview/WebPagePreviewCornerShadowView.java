package com.whatsapp.webpagepreview;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass38q;
import X.C100744vb;
import X.C18700tb;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.whatsapp.R;

public class WebPagePreviewCornerShadowView extends FrameLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass38q A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    public void A00() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A00 = C36341k9.A0T(A0W);
            this.A01 = (AnonymousClass38q) A0W.A00.A71.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public WebPagePreviewCornerShadowView(Context context) {
        super(context);
        A00();
        setWillNotDraw(false);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode()) {
            int paddingLeft = getPaddingLeft();
            int A0B = AnonymousClass000.A0B(this);
            int A0A = AnonymousClass000.A0A(this);
            Context context = getContext();
            C18740tg.A06(context);
            AnonymousClass38q r5 = this.A01;
            Drawable drawable = r5.A01;
            if (drawable == null) {
                drawable = new C100744vb(context.getResources().getDrawable(R.drawable.corner_overlay), r5.A03);
                r5.A01 = drawable;
            }
            if (C36351kA.A1Y(this.A00)) {
                drawable.setBounds(A0B - drawable.getIntrinsicWidth(), A0A - drawable.getIntrinsicHeight(), A0B, A0A);
            } else {
                drawable.setBounds(paddingLeft, A0A - drawable.getIntrinsicHeight(), drawable.getIntrinsicWidth() + paddingLeft, A0A);
            }
            drawable.draw(canvas);
        }
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
        setWillNotDraw(false);
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A00();
    }

    public WebPagePreviewCornerShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
        setWillNotDraw(false);
    }
}
