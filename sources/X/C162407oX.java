package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7oX  reason: invalid class name and case insensitive filesystem */
public class C162407oX extends View {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C162407oX(Context context, Object obj, int i) {
        super(context);
        this.A01 = i;
        this.A00 = obj;
    }

    public void onDraw(Canvas canvas) {
        Path path;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this.A01 != 0) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        AnonymousClass6F8 r5 = (AnonymousClass6F8) this.A00;
        if (r5 instanceof AnonymousClass5CU) {
            AnonymousClass5CU r4 = (AnonymousClass5CU) r5;
            PointF pointF = r4.A02;
            if (pointF != null && (i = r4.A01) != -1) {
                if (i != 0) {
                    if (i == 1) {
                        float f6 = pointF.y - pointF.x;
                        RectF rectF = r4.A03;
                        float f7 = rectF.left;
                        float f8 = f7 + f6;
                        float f9 = rectF.top;
                        if (f8 >= f9) {
                            f9 = f8;
                        } else {
                            f7 = f9 - f6;
                        }
                        f3 = rectF.right;
                        f4 = f3 + f6;
                        f5 = rectF.bottom;
                        if (f4 > f5) {
                            f3 = f5 - f6;
                        }
                    } else if (i == 2) {
                        f = pointF.x;
                        RectF rectF2 = r4.A03;
                        f2 = rectF2.top;
                        f3 = f;
                        f4 = rectF2.bottom;
                    } else if (i == 3) {
                        float f10 = pointF.y + pointF.x;
                        RectF rectF3 = r4.A03;
                        f = rectF3.left;
                        float f11 = f10 - f;
                        f2 = rectF3.bottom;
                        if (f11 <= f2) {
                            f2 = f11;
                        } else {
                            f = f10 - f2;
                        }
                        f3 = rectF3.right;
                        f4 = f10 - f3;
                        f5 = rectF3.top;
                        if (f4 < f5) {
                            f3 = f10 - f5;
                        }
                    } else {
                        return;
                    }
                    f4 = f5;
                } else {
                    RectF rectF4 = r4.A03;
                    f = rectF4.left;
                    f2 = pointF.y;
                    f3 = rectF4.right;
                    f4 = f2;
                }
                path = C36441kJ.A0M();
                path.rewind();
                path.moveTo(f, f2);
                path.lineTo(f3, f4);
            } else {
                return;
            }
        } else {
            path = ((AnonymousClass5CT) r5).A01;
        }
        if (path != null) {
            canvas.drawPath(path, r5.A02);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (1 - this.A01 != 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }
}
