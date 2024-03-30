package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.5Cu  reason: invalid class name and case insensitive filesystem */
public class C104985Cu extends C131646Px {
    public int A00 = 0;
    public float A01;
    public final long A02;
    public final long A03;
    public final AnonymousClass6LM A04;
    public final List A05 = AnonymousClass001.A0I();
    public final float A06;
    public final AnonymousClass6NK A07;
    public final float[] A08 = new float[4];

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C104985Cu(android.graphics.Bitmap r10, android.graphics.Paint r11, android.graphics.PointF r12, android.graphics.PointF r13, float r14, float r15, int r16, long r17) {
        /*
            r9 = this;
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r13
            r7 = r14
            r8 = r16
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()
            r9.A05 = r0
            r0 = 4
            float[] r0 = new float[r0]
            r9.A08 = r0
            r0 = 0
            r9.A00 = r0
            r0 = r17
            r9.A03 = r0
            X.6LM r2 = new X.6LM
            r2.<init>(r12, r0)
            r9.A04 = r2
            X.643 r2 = r2.A01
            X.6NK r2 = r2.A03
            r9.A07 = r2
            r9.A06 = r15
            r9.A02 = r0
            float r2 = r9.A00(r8)
            r9.A01 = r2
            r9.A06(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C104985Cu.<init>(android.graphics.Bitmap, android.graphics.Paint, android.graphics.PointF, android.graphics.PointF, float, float, int, long):void");
    }

    private float A00(int i) {
        float f = (this.A03 * 0.03f) - 0.125f;
        if (f < 0.125f) {
            f = 0.125f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        return (f * this.A06) / ((float) i);
    }

    public static void A01(Canvas canvas, C104985Cu r11, int i) {
        float A002;
        AnonymousClass6NK r4 = r11.A07;
        float f = r11.A01;
        r4.A03 = f;
        int floor = ((int) Math.floor((double) (r4.A02 / f))) + 1;
        while (true) {
            r11.A00 = i;
            if (i < floor) {
                float[] fArr = r11.A08;
                float f2 = ((float) i) * r4.A03;
                if (f2 < r4.A01 || f2 > r4.A00) {
                    Map.Entry floorEntry = r4.A06.floorEntry(Float.valueOf(f2));
                    if (floorEntry == null) {
                        r4.A04 = null;
                        r4.A01 = 1.0f;
                        A002 = 0.0f;
                    } else {
                        r4.A04 = (AnonymousClass6OI) floorEntry.getValue();
                        float A032 = C36441kJ.A03(floorEntry.getKey());
                        r4.A01 = A032;
                        A002 = A032 + r4.A04.A00();
                    }
                    r4.A00 = A002;
                }
                AnonymousClass6OI r7 = r4.A04;
                float f3 = 1.0f;
                if (r7 != null) {
                    float A003 = r7.A00();
                    if (A003 != 0.0f) {
                        f3 = (f2 - r4.A01) / A003;
                    }
                } else {
                    r7 = r4.A05;
                }
                r7.A01(fArr, f3);
                PointF pointF = new PointF(fArr[2], fArr[3]);
                float f4 = r11.A03;
                float f5 = pointF.x;
                float f6 = pointF.y;
                double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
                float f7 = C113305fK.A00;
                float f8 = 0.0f;
                float sqrt2 = (((float) Math.sqrt(sqrt)) - 0.0f) / ((0.4f * f4) - 0.0f);
                if (sqrt2 >= 0.0f) {
                    f8 = sqrt2;
                    if (sqrt2 > 1.0f) {
                        f8 = 1.0f;
                    }
                }
                int i2 = (int) (f4 * (1.0f - (f7 * ((f8 * f8) * (3.0f - (f8 * 2.0f))))));
                float f9 = fArr[0];
                float f10 = fArr[1];
                Paint paint = r11.A01;
                paint.setStrokeWidth((float) i2);
                canvas.drawPoint(f9, f10, paint);
                i = r11.A00 + 1;
            } else {
                return;
            }
        }
    }

    public void A03(Bitmap bitmap, PointF pointF, int i) {
        super.A03(bitmap, pointF, i);
        this.A01 = A00(i);
    }

    public void A07(JSONObject jSONObject) {
        super.A07(jSONObject);
        JSONArray A0u = C90524aI.A0u();
        for (Object put : this.A05) {
            A0u.put(put);
        }
        jSONObject.put("times", A0u);
    }
}
