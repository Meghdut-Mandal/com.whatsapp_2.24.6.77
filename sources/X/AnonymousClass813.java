package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.813  reason: invalid class name */
public class AnonymousClass813 extends C1684680s {
    public final PointF A00 = new PointF();

    public PointF A0B(C202689mQ r12, float f, float f2, float f3) {
        Object obj;
        Object obj2 = r12.A0E;
        if (obj2 == null || (obj = r12.A08) == null) {
            throw AnonymousClass001.A09("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C199409fG r3 = this.A03;
        if (r3 != null) {
            PointF pointF3 = (PointF) r3.A01(pointF, pointF2, r12.A0A, r12.A07.floatValue(), f, A04(), this.A02);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.A00;
        pointF4.set(AnonymousClass001.A00(pointF2.x, pointF.x, f2), AnonymousClass001.A00(pointF2.y, pointF.y, f3));
        return pointF4;
    }

    public AnonymousClass813(List list) {
        super(list);
    }
}
