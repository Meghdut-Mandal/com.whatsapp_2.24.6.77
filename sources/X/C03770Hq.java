package X;

/* renamed from: X.0Hq  reason: invalid class name and case insensitive filesystem */
public class C03770Hq extends C06730Uv {
    public final /* synthetic */ C11970hI A00;

    public C03770Hq(C11970hI r1) {
        this.A00 = r1;
    }

    public int A00() {
        return this.A00.A02.size();
    }

    public int A01() {
        return this.A00.A03.size();
    }

    public Object A02(int i, int i2) {
        C11970hI r2 = this.A00;
        Object obj = r2.A03.get(i);
        Object obj2 = r2.A02.get(i2);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    public boolean A03(int i, int i2) {
        C11970hI r3 = this.A00;
        Object obj = r3.A03.get(i);
        Object obj2 = r3.A02.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return r3.A01.A04.A00.A01(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i, int i2) {
        C11970hI r3 = this.A00;
        Object obj = r3.A03.get(i);
        Object obj2 = r3.A02.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return r3.A01.A04.A00.A02(obj, obj2);
            }
            return false;
        } else if (obj2 != null) {
            return false;
        } else {
            return true;
        }
    }
}
