package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.9eA  reason: invalid class name and case insensitive filesystem */
public class C198769eA {
    public PointF A00;
    public boolean A01;
    public final List A02;

    public C198769eA(PointF pointF, List list, boolean z) {
        this.A00 = pointF;
        this.A01 = z;
        this.A02 = C36441kJ.A15(list);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ShapeData{numCurves=");
        A0u.append(this.A02.size());
        A0u.append("closed=");
        A0u.append(this.A01);
        return AnonymousClass000.A0s(A0u);
    }

    public C198769eA() {
        this.A02 = AnonymousClass001.A0I();
    }
}
