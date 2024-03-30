package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.6Px  reason: invalid class name and case insensitive filesystem */
public abstract class C131646Px {
    public Canvas A00;
    public final Paint A01;
    public final List A02 = AnonymousClass001.A0I();
    public final float A03;

    public static ArrayList A02(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("points");
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            A0I.add(new PointF(((float) jSONArray.getInt(i)) / 100.0f, ((float) jSONArray.getInt(i + 1)) / 100.0f));
        }
        return A0I;
    }

    public void A04(Canvas canvas) {
        Canvas canvas2 = canvas;
        if (this instanceof C104985Cu) {
            C104985Cu.A01(canvas, (C104985Cu) this, 0);
            return;
        }
        C104975Ct r2 = (C104975Ct) this;
        for (PointF pointF : r2.A02) {
            r2.A08(canvas2, r2.A01, pointF.x, pointF.y, (int) r2.A01);
        }
    }

    public void A05(PointF pointF, long j) {
        if (this instanceof C104985Cu) {
            C104985Cu r5 = (C104985Cu) this;
            long max = Math.max(j, r5.A02 + 1);
            r5.A02.add(pointF);
            r5.A05.add(C90504aG.A0h(max, r5.A03));
            AnonymousClass6LM r7 = r5.A04;
            C91064bP r10 = r7.A02;
            r10.set(pointF);
            while (((double) r7.A00) + 3.0d < ((double) max)) {
                AnonymousClass6LM.A00(r7);
            }
            C91064bP r6 = r7.A03;
            float A05 = C90494aF.A05(r6, r10);
            float f = A05;
            C91064bP r2 = new C91064bP();
            while (f > 0.0f && A05 > 0.0f) {
                r2.set(r6);
                AnonymousClass6LM.A00(r7);
                A05 = C90494aF.A05(r6, r2);
                f -= A05;
            }
            AnonymousClass643 r4 = r7.A01;
            long j2 = r4.A02;
            C91064bP r1 = r4.A00;
            if (r1 != r4.A01) {
                r4.A00(r1, j2);
                r4.A01 = r4.A00;
            }
            Canvas canvas = r5.A00;
            if (canvas != null) {
                C104985Cu.A01(canvas, r5, r5.A00);
            }
        }
    }

    public void A06(PointF pointF, long j) {
        if (this instanceof C104985Cu) {
            C104985Cu r5 = (C104985Cu) this;
            if (r5.A02 <= j) {
                r5.A02.add(pointF);
                r5.A05.add(C90504aG.A0h(j, r5.A03));
                AnonymousClass6LM r6 = r5.A04;
                r6.A02.set(pointF);
                while (((double) r6.A00) + 3.0d < ((double) j)) {
                    AnonymousClass6LM.A00(r6);
                }
                Canvas canvas = r5.A00;
                if (canvas != null) {
                    C104985Cu.A01(canvas, r5, r5.A00);
                    return;
                }
                return;
            }
            return;
        }
        C104975Ct r2 = (C104975Ct) this;
        List list = r2.A02;
        if (list.isEmpty() || !list.get(C36431kI.A07(list)).equals(pointF)) {
            list.add(pointF);
            Canvas canvas2 = r2.A00;
            if (canvas2 != null) {
                r2.A08(canvas2, r2.A01, pointF.x, pointF.y, (int) r2.A01);
            }
        }
    }

    public C131646Px(Bitmap bitmap, Paint paint, PointF pointF, float f, int i) {
        if (bitmap != null) {
            Canvas A0A = C90524aI.A0A(bitmap);
            float f2 = (float) i;
            A0A.scale(f2, f2);
            if (pointF != null) {
                A0A.translate(-pointF.x, -pointF.y);
            }
            this.A00 = A0A;
        }
        this.A03 = f;
        this.A01 = paint;
    }

    public void A03(Bitmap bitmap, PointF pointF, int i) {
        Canvas A0A = C90524aI.A0A(bitmap);
        float f = (float) i;
        A0A.scale(f, f);
        if (pointF != null) {
            A0A.translate(-pointF.x, -pointF.y);
        }
        this.A00 = A0A;
    }

    public void A07(JSONObject jSONObject) {
        JSONArray A0u = C90524aI.A0u();
        for (PointF pointF : this.A02) {
            A0u.put((int) (pointF.x * 100.0f));
            A0u.put((int) (pointF.y * 100.0f));
        }
        jSONObject.put("points", A0u);
        jSONObject.put("width", (int) (this.A03 * 100.0f));
    }
}
