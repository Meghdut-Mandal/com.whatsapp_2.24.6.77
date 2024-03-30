package X;

import android.graphics.PointF;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: X.6NK  reason: invalid class name */
public class AnonymousClass6NK {
    public static final PointF A07 = new C91064bP();
    public float A00 = 0.0f;
    public float A01 = 1.0f;
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public AnonymousClass6OI A04;
    public AnonymousClass6OI A05;
    public final NavigableMap A06 = new TreeMap();

    public void A00(PointF pointF, PointF pointF2) {
        AnonymousClass6OI r8 = this.A05;
        if (r8 == null) {
            PointF pointF3 = A07;
            float f = pointF3.x;
            float[] fArr = {f, f, pointF2.x, pointF.x};
            float f2 = pointF3.y;
            this.A05 = new AnonymousClass6OI(fArr, new float[]{f2, f2, pointF2.y, pointF.y});
            return;
        }
        float[] fArr2 = r8.A01;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = r8.A02;
        AnonymousClass6OI r2 = new AnonymousClass6OI(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A05 = r2;
        this.A06.put(Float.valueOf(this.A02), r2);
        this.A02 += this.A05.A00();
    }
}
