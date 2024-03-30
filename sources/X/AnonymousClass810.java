package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.810  reason: invalid class name */
public class AnonymousClass810 extends C1684680s {
    public int A0B(C202689mQ r10, float f) {
        Object obj;
        Number number;
        float f2 = f;
        Object obj2 = r10.A0E;
        if (obj2 == null || (obj = r10.A08) == null) {
            throw AnonymousClass001.A09("Missing values for keyframe.");
        }
        C199409fG r1 = this.A03;
        if (r1 != null && (number = (Number) r1.A01(obj2, obj, r10.A0A, r10.A07.floatValue(), f2, A04(), this.A02)) != null) {
            return number.intValue();
        }
        int i = r10.A04;
        if (i == 784923401) {
            i = AnonymousClass000.A0I(obj2);
            r10.A04 = i;
        }
        int i2 = r10.A03;
        if (i2 == 784923401) {
            i2 = AnonymousClass000.A0I(r10.A08);
            r10.A03 = i2;
        }
        PointF pointF = C200579hd.A00;
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    public AnonymousClass810(List list) {
        super(list);
    }
}
