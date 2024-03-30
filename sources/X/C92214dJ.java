package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.4dJ  reason: invalid class name and case insensitive filesystem */
public class C92214dJ extends TextureView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public int A02;
    public boolean A03;

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.A03) {
            setTransform((Matrix) null);
        } else {
            int i5 = this.A02;
            if (i5 == 90 || i5 == 270) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Matrix A0B = C90524aI.A0B();
                float f = (float) i5;
                float f2 = (float) measuredWidth;
                float f3 = f2 / 2.0f;
                float f4 = (float) measuredHeight;
                float f5 = f4 / 2.0f;
                A0B.postRotate(f, f3, f5);
                A0B.postScale(f2 / f4, f4 / f2, f3, f5);
                setTransform(A0B);
            }
        }
        this.A03 = false;
        super.onLayout(z, i, i2, i3, i4);
    }

    public void setRotationAngle(int i) {
        if (this.A02 != i) {
            this.A02 = i;
            if (!(i == 90 || i == 270)) {
                this.A02 = 0;
                this.A03 = true;
            }
            requestLayout();
        }
    }

    public C92214dJ(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }
}
