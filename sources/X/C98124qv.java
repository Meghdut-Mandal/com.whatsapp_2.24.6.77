package X;

import android.content.Context;
import android.util.AttributeSet;

/* renamed from: X.4qv  reason: invalid class name and case insensitive filesystem */
public class C98124qv extends C98134qw implements C157837el {
    public C123055vr A00;
    public final AnonymousClass6Y3 A01 = new AnonymousClass6Y3(this, AnonymousClass6RN.A00);

    public C98124qv(Context context) {
        super(context, (AttributeSet) null);
    }

    public void offsetLeftAndRight(int i) {
        if (i != 0) {
            super.offsetLeftAndRight(i);
            AnonymousClass5YV.A00(this, this.A01);
        }
    }

    public void offsetTopAndBottom(int i) {
        if (i != 0) {
            super.offsetTopAndBottom(i);
            AnonymousClass5YV.A00(this, this.A01);
        }
    }

    public void onMeasure(int i, int i2) {
        C123055vr r2 = this.A00;
        if (r2 == null) {
            setMeasuredDimension(0, 0);
        } else {
            setMeasuredDimension(r2.A02.A03.width(), r2.A02.A03.height());
        }
    }

    public void setRenderTree(C123055vr r2) {
        if (this.A00 != r2) {
            if (r2 == null) {
                this.A01.A0D();
            }
            this.A00 = r2;
            requestLayout();
        }
    }

    public void setRenderTreeUpdateListener(AnonymousClass7cH r4) {
        AnonymousClass6Y3 r2 = this.A01;
        C123655wr r1 = r2.A00;
        if (r1 == null) {
            r1 = new C123655wr(r2, r2.A05);
        }
        r1.A00 = r4;
        r2.A00 = r1;
    }

    public final C123055vr getCurrentRenderTree() {
        return this.A00;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01.A0B();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01.A0C();
    }

    public void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            AnonymousClass5YV.A00(this, this.A01);
        }
    }

    public void setTranslationY(float f) {
        if (f != getTranslationY()) {
            super.setTranslationY(f);
            AnonymousClass5YV.A00(this, this.A01);
        }
    }
}
