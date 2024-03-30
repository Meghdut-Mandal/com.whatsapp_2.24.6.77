package X;

/* renamed from: X.6Ry  reason: invalid class name and case insensitive filesystem */
public abstract class C132056Ry {
    public final int A00;
    public final Object A01;

    public static boolean A00(int i) {
        return i == 9 || i == 8 || i == 10;
    }

    public static boolean A01(C132056Ry r3, Object obj) {
        if (r3 == obj) {
            return true;
        }
        if (!(obj instanceof C132056Ry)) {
            return false;
        }
        C132056Ry r4 = (C132056Ry) obj;
        return C1901797e.A00(r3.A01, r4.A01) && C1901797e.A00(Integer.valueOf(r3.A00), Integer.valueOf(r4.A00));
    }

    public C132056Ry(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
