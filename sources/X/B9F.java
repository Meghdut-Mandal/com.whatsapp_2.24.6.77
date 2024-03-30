package X;

import android.graphics.Point;

public class B9F implements C157797eh {
    public Object A00;
    public final int A01;

    public B9F(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BYD(Point point, Integer num) {
        Object[] objArr;
        int i;
        int i2;
        long j;
        if (this.A01 != 0) {
            A29 a29 = (A29) this.A00;
            if (!a29.A0e) {
                if (a29.A0D) {
                    j = 4000;
                } else {
                    j = 2000;
                }
                synchronized (a29) {
                    A29.A07(a29);
                    a29.A0d = a29.A0S.A02("reset_focus", new B8U((Object) a29, 2), j);
                }
                return;
            }
            return;
        }
        C20952A0j a0j = (C20952A0j) this.A00;
        AnonymousClass9EO r5 = a0j.A0E;
        if (r5 != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue == 4 || intValue == 5) {
                        i2 = 13;
                    } else if (intValue == 1) {
                        i2 = 14;
                    } else {
                        return;
                    }
                    C20952A0j.A04(a0j, r5, i2);
                    return;
                } else if (point != null) {
                    objArr = C36431kI.A1a(r5, point, 2);
                    i = 12;
                } else {
                    return;
                }
            } else if (point != null) {
                objArr = C36431kI.A1a(r5, point, 2);
                i = 11;
            } else {
                return;
            }
            C20952A0j.A04(a0j, objArr, i);
        }
    }
}
