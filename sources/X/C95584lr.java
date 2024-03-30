package X;

import java.util.List;

/* renamed from: X.4lr  reason: invalid class name and case insensitive filesystem */
public class C95584lr extends C06730Uv {
    public final List A00;
    public final List A01;

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i, int i2) {
        List list = this.A01;
        boolean z = ((C1262563e) list.get(i)).A00;
        List list2 = this.A00;
        if (z == ((C1262563e) list2.get(i2)).A00 && ((C1262563e) list.get(i)).A01 == ((C1262563e) list2.get(i2)).A01 && ((C1262563e) list.get(i)).A02 == ((C1262563e) list2.get(i2)).A02) {
            return true;
        }
        return false;
    }

    public boolean A04(int i, int i2) {
        C135106c9 r1 = ((C1262563e) this.A01.get(i)).A03;
        C135106c9 r2 = ((C1262563e) this.A00.get(i2)).A03;
        if (r1 == null) {
            if (r2 != null) {
                return false;
            }
            return true;
        } else if (r2 != null) {
            return r1.A0F.equals(r2.A0F);
        }
        return false;
    }

    public C95584lr(List list, List list2) {
        this.A01 = list;
        this.A00 = list2;
    }
}
