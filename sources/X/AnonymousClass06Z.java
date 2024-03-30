package X;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: X.06Z  reason: invalid class name */
public class AnonymousClass06Z {
    public static final float[] A08 = {0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] A09 = {0.0f, 0.5f, 1.0f};
    public static final int[] A0A = new int[4];
    public static final int[] A0B = new int[3];
    public int A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final Paint A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07 = new Path();

    public AnonymousClass06Z() {
        Paint paint = new Paint();
        this.A06 = paint;
        Paint paint2 = new Paint();
        this.A05 = paint2;
        this.A02 = 1140850688;
        this.A01 = 335544320;
        this.A00 = 0;
        paint2.setColor(1140850688);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.A03 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.A04 = new Paint(paint3);
    }
}
