package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;

/* renamed from: X.0sb  reason: invalid class name and case insensitive filesystem */
public class C18090sb extends Property {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18090sb(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0017;
                case 2: goto L_0x0012;
                case 3: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Class<android.graphics.Rect> r1 = android.graphics.Rect.class
            java.lang.String r0 = "clipBounds"
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "translationAlpha"
            goto L_0x0009
        L_0x0012:
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r0 = "translations"
            goto L_0x0009
        L_0x0017:
            java.lang.Class<float[]> r1 = float[].class
            java.lang.String r0 = "nonTranslations"
            goto L_0x0009
        L_0x001c:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r0 = "thumbPos"
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18090sb.<init>(int):void");
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        float f;
        switch (this.A00) {
            case 0:
                f = ((SwitchCompat) obj).mThumbPosition;
                break;
            case 3:
                f = AnonymousClass0W5.A02.A00((View) obj);
                break;
            case 4:
                return AnonymousClass0VN.A00((View) obj);
            default:
                return null;
        }
        return Float.valueOf(f);
    }

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        C07070Wf r5;
        switch (this.A00) {
            case 0:
                ((SwitchCompat) obj).setThumbPosition(((Number) obj2).floatValue());
                return;
            case 1:
                r5 = (C07070Wf) obj;
                float[] fArr = (float[]) obj2;
                System.arraycopy(fArr, 0, r5.A04, 0, fArr.length);
                break;
            case 2:
                r5 = (C07070Wf) obj;
                PointF pointF = (PointF) obj2;
                r5.A00 = pointF.x;
                r5.A01 = pointF.y;
                break;
            case 3:
                float floatValue = ((Number) obj2).floatValue();
                AnonymousClass0W5.A02.A04((View) obj, floatValue);
                return;
            default:
                AnonymousClass0VN.A01((View) obj, (Rect) obj2);
                return;
        }
        float[] fArr2 = r5.A04;
        fArr2[2] = r5.A00;
        fArr2[5] = r5.A01;
        Matrix matrix = r5.A02;
        matrix.setValues(fArr2);
        AnonymousClass0W5.A02.A01(matrix, r5.A03);
    }
}
