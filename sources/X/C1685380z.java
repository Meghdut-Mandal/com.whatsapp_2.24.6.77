package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.80z  reason: invalid class name and case insensitive filesystem */
public class C1685380z extends C1684680s {
    public int A0B(C202689mQ r11, float f) {
        Object obj;
        Number number;
        Object obj2 = r11.A0E;
        if (obj2 == null || (obj = r11.A08) == null) {
            throw AnonymousClass001.A09("Missing values for keyframe.");
        }
        C199409fG r2 = this.A03;
        float f2 = f;
        if (r2 != null && (number = (Number) r2.A01(obj2, obj, r11.A0A, r11.A07.floatValue(), f2, A04(), this.A02)) != null) {
            return number.intValue();
        }
        PointF pointF = C200579hd.A00;
        return C200309h8.A02(C165597tg.A01(1.0f, f, 0.0f), AnonymousClass000.A0I(obj2), AnonymousClass000.A0I(r11.A08));
    }

    public C1685380z(List list) {
        super(list);
    }
}
