package com.whatsapp.conversation.conversationrow.carousel;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C05250Oz;
import X.C18700tb;
import X.C19630wG;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public final class CarouselItemSelectionView extends View implements C18700tb {
    public C19630wG A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public boolean A03;
    public final Paint A04;
    public final Rect A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onDraw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        super.onDraw(canvas);
        if (this.A03) {
            Rect rect = this.A05;
            getDrawingRect(rect);
            canvas.drawRect(rect, this.A04);
        }
    }

    public final void setWaContext(C19630wG r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public final C19630wG getWaContext() {
        C19630wG r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("waContext");
    }

    public final void setRowSelected(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            setSelected(z);
            invalidate();
        }
    }

    public boolean isSelected() {
        return this.A03;
    }

    public /* synthetic */ CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36351kA.A0W(C36391kE.A0W(generatedComponent()));
        }
        this.A05 = AnonymousClass001.A06();
        Paint A0K = C36441kJ.A0K();
        this.A04 = A0K;
        C36381kD.A16(getWaContext().A00, A0K, R.color.f6nameremoved);
        C36431kI.A1L(A0K);
        A0K.setAntiAlias(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CarouselItemSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
