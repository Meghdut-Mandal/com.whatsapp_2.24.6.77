package X;

import android.graphics.Point;
import android.graphics.Rect;

/* renamed from: X.6PI  reason: invalid class name */
public class AnonymousClass6PI {
    public static final AnonymousClass6PI A03 = new AnonymousClass6PI((Point) null, (Rect) null, 3);
    public static final AnonymousClass6PI A04 = new AnonymousClass6PI((Point) null, (Rect) null, 0);
    public final int A00;
    public final Rect A01;
    public final Point A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass6PI r5 = (AnonymousClass6PI) obj;
            if (this.A00 != r5.A00 || !C1901797e.A00(this.A01, r5.A01) || !C1901797e.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass6PI(Point point, Rect rect, int i) {
        this.A00 = i;
        this.A01 = rect;
        this.A02 = point;
    }

    public int hashCode() {
        Object[] A1Q = C36441kJ.A1Q();
        AnonymousClass000.A1J(A1Q, this.A00);
        A1Q[1] = this.A01;
        return C90484aE.A0D(this.A02, A1Q);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FlexState{separationType=");
        A0u.append(this.A00);
        A0u.append(", bounds=");
        A0u.append(this.A01);
        A0u.append(", parentDimensions=");
        return C90464aC.A0X(this.A02, A0u);
    }
}
