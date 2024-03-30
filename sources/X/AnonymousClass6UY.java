package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import com.whatsapp.R;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.6UY  reason: invalid class name */
public abstract class AnonymousClass6UY {
    public static float A00 = 1.0f;
    public static Context A01;
    public static long A02;
    public static final float A03 = (((float) Math.sqrt(3.0d)) / 2.0f);
    public static final HashMap A04 = new HashMap(16);

    public static C114635hZ A00() {
        return A01(new C163157pk(0), C90484aE.A0o("hue_", AnonymousClass000.A0u(), 240.0f));
    }

    public static C114635hZ A01(AnonymousClass7eS r13, String str) {
        C114635hZ r5;
        Bitmap createBitmap;
        HashMap hashMap = A04;
        Reference reference = (Reference) hashMap.get(str);
        if (reference == null || (r5 = (C114635hZ) reference.get()) == null) {
            if (((C163157pk) r13).A00 != 0) {
                createBitmap = BitmapFactory.decodeResource(A01.getResources(), R.drawable.ic_map_pin);
            } else {
                Paint A0L = C36441kJ.A0L(1);
                float f = A00 * 10.0f;
                int A06 = C90514aH.A06(2.0f, f);
                int A062 = C90514aH.A06(3.0f, f);
                createBitmap = Bitmap.createBitmap(A06 + 10, A062 + 10, Bitmap.Config.ARGB_4444);
                Canvas A0A = C90524aI.A0A(createBitmap);
                float[] fArr = {240.0f, 1.0f, 1.0f};
                int HSVToColor = Color.HSVToColor(fArr);
                fArr[2] = 0.8f;
                int HSVToColor2 = Color.HSVToColor(fArr);
                fArr[2] = 0.5f;
                int HSVToColor3 = Color.HSVToColor(fArr);
                A0L.setColor(HSVToColor);
                float f2 = 5.0f + f;
                float f3 = (float) (A062 + 5);
                A02(A0A, A0L, f2, f3, f);
                A0L.setColor(HSVToColor3);
                A0A.drawCircle(f2, f2, f / 2.5f, A0L);
                C36421kH.A0q(A0L);
                A0L.setStrokeWidth(A00);
                A0L.setColor(HSVToColor2);
                A02(A0A, A0L, f2, f3, f);
            }
            if (createBitmap == null) {
                return null;
            }
            r5 = new C114635hZ(createBitmap);
            hashMap.put(str, AnonymousClass001.A0F(r5));
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = A02;
        if (j >= 600000 || j == 0) {
            A02 = uptimeMillis;
            Iterator A10 = C36371kC.A10(hashMap);
            while (A10.hasNext()) {
                if (((Reference) C36351kA.A0u(A10)).get() == null) {
                    A10.remove();
                }
            }
        }
        return r5;
    }

    public static void A02(Canvas canvas, Paint paint, float f, float f2, float f3) {
        Path A0M = C36441kJ.A0M();
        float f4 = 2.0f * f3;
        float f5 = f2 - f4;
        A0M.moveTo(f, f5);
        A0M.arcTo(new RectF(f - f3, f5 - f3, f + f3, f5 + f3), 30.0f, -240.0f, true);
        A0M.lineTo(f, f4 + f5);
        C90514aH.A1G(canvas, paint, A0M, f + (A03 * f3), f5 + (f3 * 0.5f));
    }
}
