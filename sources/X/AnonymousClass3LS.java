package X;

import android.graphics.PointF;
import com.whatsapp.InteractiveAnnotation;
import com.whatsapp.SerializableLocation;
import com.whatsapp.SerializablePoint;

/* renamed from: X.3LS  reason: invalid class name */
public abstract class AnonymousClass3LS {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (r10 > (r1 * 0.8333333f)) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.whatsapp.InteractiveAnnotation A00(android.widget.ImageView r7, X.C20810yC r8, X.AnonymousClass2bU r9, float r10, float r11) {
        /*
            r6 = 0
            r4 = 1
            int r3 = X.C36361kB.A04(r7, r9, r4)
            android.graphics.drawable.Drawable r5 = r7.getDrawable()
            if (r5 != 0) goto L_0x000e
            r0 = 0
            return r0
        L_0x000e:
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            android.graphics.Matrix r0 = r7.getImageMatrix()
            r0.invert(r1)
            float[] r2 = new float[r3]
            int r0 = r7.getLeft()
            float r0 = (float) r0
            float r0 = r10 - r0
            r2[r6] = r0
            int r0 = r7.getTop()
            float r0 = (float) r0
            float r11 = r11 - r0
            r2[r4] = r11
            float[] r3 = new float[r3]
            int r0 = r5.getIntrinsicWidth()
            float r0 = (float) r0
            r3[r6] = r0
            int r0 = r5.getIntrinsicHeight()
            float r0 = (float) r0
            r3[r4] = r0
            r1.mapPoints(r2)
            float r1 = X.C36441kJ.A01(r7)
            r0 = 1042983595(0x3e2aaaab, float:0.16666667)
            float r0 = r0 * r1
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            r0 = 1062557013(0x3f555555, float:0.8333333)
            float r1 = r1 * r0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            r0 = 0
            if (r1 <= 0) goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            com.whatsapp.InteractiveAnnotation r0 = A01(r8, r9, r2, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3LS.A00(android.widget.ImageView, X.0yC, X.2bU, float, float):com.whatsapp.InteractiveAnnotation");
    }

    public static final InteractiveAnnotation A01(C20810yC r21, AnonymousClass2bU r22, float[] fArr, float[] fArr2, boolean z) {
        InteractiveAnnotation[] interactiveAnnotationArr;
        C20810yC r7 = r21;
        AnonymousClass00C.A0D(r7, 0);
        C65013Qj r0 = r22.A01;
        if (!(r0 == null || (interactiveAnnotationArr = r0.A0b) == null || interactiveAnnotationArr.length == 0)) {
            PointF pointF = new PointF(fArr2[0], fArr2[1]);
            SerializablePoint serializablePoint = new SerializablePoint((double) ((int) fArr[0]), (double) ((int) fArr[1]));
            SerializablePoint serializablePoint2 = new SerializablePoint(serializablePoint.x / ((double) pointF.x), serializablePoint.y / ((double) pointF.y));
            boolean A0E = r7.A0E(6444);
            for (InteractiveAnnotation interactiveAnnotation : interactiveAnnotationArr) {
                if (A0E || (interactiveAnnotation.data instanceof SerializableLocation)) {
                    SerializablePoint[] serializablePointArr = interactiveAnnotation.polygonVertices;
                    SerializablePoint[] serializablePointArr2 = serializablePointArr;
                    AnonymousClass00C.A07(serializablePointArr2);
                    int length = serializablePointArr.length;
                    int i = 0;
                    boolean z2 = false;
                    while (true) {
                        int i2 = length;
                        if (i >= i2) {
                            break;
                        }
                        SerializablePoint serializablePoint3 = serializablePointArr2[i];
                        i++;
                        SerializablePoint serializablePoint4 = serializablePointArr2[i % i2];
                        double d = serializablePoint3.x;
                        double d2 = serializablePoint2.x;
                        if ((d <= d2 && d2 < serializablePoint4.x) || (serializablePoint4.x <= d2 && d2 < serializablePoint3.x)) {
                            double d3 = serializablePoint2.y;
                            double d4 = serializablePoint4.y;
                            double d5 = serializablePoint3.y;
                            double d6 = serializablePoint3.x;
                            if (d3 < (((d4 - d5) * (d2 - d6)) / (serializablePoint4.x - d6)) + d5) {
                                z2 = !z2;
                            }
                        }
                    }
                    if (z2 && (!(interactiveAnnotation.data instanceof C63393Jw) || !z || interactiveAnnotation.skipConfirmation)) {
                        return interactiveAnnotation;
                    }
                }
            }
        }
        return null;
    }
}
