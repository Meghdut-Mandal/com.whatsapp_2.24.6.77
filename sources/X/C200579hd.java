package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.9hd  reason: invalid class name and case insensitive filesystem */
public abstract class C200579hd {
    public static final PointF A00 = new PointF();

    public static int A00(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!C36401kF.A1U(i ^ i2) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static void A01(C17520rY r3, C201629k0 r4, C201629k0 r5, List list, int i) {
        if (r4.A01(r3.getName(), i)) {
            String name = r3.getName();
            C201629k0 r1 = new C201629k0(r5);
            r1.A01.add(name);
            C201629k0 r0 = new C201629k0(r1);
            r0.A00 = r3;
            list.add(r0);
        }
    }
}
