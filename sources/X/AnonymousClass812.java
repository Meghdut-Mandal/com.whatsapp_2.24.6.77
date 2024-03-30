package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.812  reason: invalid class name */
public class AnonymousClass812 extends C1684680s {
    public float A0B() {
        return A0C(this.A06.BAb(), A03());
    }

    public float A0C(C202689mQ r12, float f) {
        Object obj;
        Number number;
        Object obj2 = r12.A0E;
        if (obj2 == null || (obj = r12.A08) == null) {
            throw AnonymousClass001.A09("Missing values for keyframe.");
        }
        C199409fG r3 = this.A03;
        float f2 = f;
        if (r3 != null && (number = (Number) r3.A01(obj2, obj, r12.A0A, r12.A07.floatValue(), f2, A04(), this.A02)) != null) {
            return number.floatValue();
        }
        float f3 = r12.A02;
        if (f3 == -3987645.8f) {
            f3 = C36441kJ.A03(obj2);
            r12.A02 = f3;
        }
        float f4 = r12.A00;
        if (f4 == -3987645.8f) {
            f4 = C36441kJ.A03(r12.A08);
            r12.A00 = f4;
        }
        PointF pointF = C200579hd.A00;
        return AnonymousClass001.A00(f4, f3, f);
    }

    public AnonymousClass812(List list) {
        super(list);
    }
}
