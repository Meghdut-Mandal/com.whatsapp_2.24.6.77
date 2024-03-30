package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.R;

/* renamed from: X.4VQ  reason: invalid class name */
public class AnonymousClass4VQ extends Drawable {
    public Object A00;
    public Object A01;
    public final int A02 = 0;

    public AnonymousClass4VQ(C38111nj r2) {
        this.A01 = r2;
        this.A00 = C36371kC.A0E();
    }

    public void draw(Canvas canvas) {
        int A002;
        float f;
        float f2;
        if (this.A02 != 0) {
            C64753Ph r4 = (C64753Ph) this.A01;
            if (r4.A00 > 0.0f) {
                AnonymousClass2IM r0 = r4.A0D;
                A002 = C36351kA.A02(r0.getContext(), r0.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved);
                f = (float) (A002 >> 24);
                f2 = r4.A00;
            } else {
                return;
            }
        } else {
            C38111nj r2 = (C38111nj) this.A01;
            if (r2.A00 > 0.0f) {
                A002 = AnonymousClass00F.A00(r2.getContext(), R.color.f6nameremoved);
                f = (float) (A002 >> 24);
                f2 = r2.A00;
            } else {
                return;
            }
        }
        int i = (A002 & 16777215) | (((int) (f * f2)) << 24);
        Paint paint = (Paint) this.A00;
        paint.setColor(i);
        canvas.drawRect(getBounds(), paint);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass4VQ(C64753Ph r2) {
        this.A01 = r2;
        this.A00 = C36371kC.A0E();
    }
}
