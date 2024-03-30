package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* renamed from: X.4be  reason: invalid class name and case insensitive filesystem */
public class C91214be extends Drawable {
    public Rect A00 = AnonymousClass001.A06();
    public final int A01;
    public final Paint A02;
    public final Path A03;
    public final Path A04;
    public final Path A05;
    public final Path A06;

    public int getOpacity() {
        return -2;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91214be(int i, int i2) {
        this.A01 = i;
        Paint A0K = C36441kJ.A0K();
        this.A02 = A0K;
        A0K.setColor(i2);
        this.A05 = A00(C023109s.A00, i);
        this.A06 = A00(C023109s.A01, i);
        this.A03 = A00(C023109s.A0C, i);
        this.A04 = A00(C023109s.A0G, i);
    }

    public static Path A00(Integer num, int i) {
        float f;
        float f2;
        float f3;
        float f4;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
            case 2:
                f = 0.0f;
                break;
            default:
                f = 1.0f;
                break;
        }
        int i2 = ((int) f) * i;
        switch (intValue) {
            case 0:
            case 1:
                f2 = 0.0f;
                break;
            default:
                f2 = 1.0f;
                break;
        }
        int i3 = ((int) f2) * i;
        switch (intValue) {
            case 0:
            case 2:
                f3 = 1.0f;
                break;
            default:
                f3 = 2.0f;
                break;
        }
        int i4 = ((int) f3) * i;
        switch (intValue) {
            case 0:
            case 1:
                f4 = 1.0f;
                break;
            default:
                f4 = 2.0f;
                break;
        }
        Region region = new Region(i2, i3, i4, ((int) f4) * i);
        Path A0M = C36441kJ.A0M();
        float f5 = (float) i;
        A0M.addCircle(f5, f5, f5, Path.Direction.CW);
        Region region2 = new Region();
        region2.setPath(A0M, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region.getBoundaryPath();
    }

    public void draw(Canvas canvas) {
        int A032 = C36421kH.A03(this);
        int i = this.A01 * 2;
        Rect rect = this.A00;
        float f = (float) (((A032 - i) - rect.left) - rect.right);
        int height = getBounds().height() - i;
        Rect rect2 = this.A00;
        int i2 = rect2.top;
        canvas.translate((float) rect2.left, (float) i2);
        Path path = this.A05;
        Paint paint = this.A02;
        canvas.drawPath(path, paint);
        path.close();
        canvas.translate(f, 0.0f);
        Path path2 = this.A06;
        canvas.drawPath(path2, paint);
        path2.close();
        canvas.translate(0.0f, (float) ((height - i2) - rect2.bottom));
        Path path3 = this.A04;
        canvas.drawPath(path3, paint);
        path3.close();
        canvas.translate(-f, 0.0f);
        Path path4 = this.A03;
        canvas.drawPath(path4, paint);
        path4.close();
    }
}
