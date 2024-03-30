package X;

import android.graphics.Rect;

/* renamed from: X.1R6  reason: invalid class name */
public final class AnonymousClass1R6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (AnonymousClass00C.A0J(cls2, cls)) {
                AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
                AnonymousClass1R6 r5 = (AnonymousClass1R6) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass1R6(Rect rect) {
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        if (i > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Left must be less than or equal to right, left: ");
            sb.append(i);
            sb.append(", right: ");
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 > i4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("top must be less than or equal to bottom, top: ");
            sb2.append(i2);
            sb2.append(", bottom: ");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds");
        sb.append(" { [");
        sb.append(this.A01);
        sb.append(',');
        sb.append(this.A03);
        sb.append(',');
        sb.append(this.A02);
        sb.append(',');
        sb.append(this.A00);
        sb.append("] }");
        return sb.toString();
    }
}
