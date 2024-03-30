package X;

import java.util.List;

/* renamed from: X.60r  reason: invalid class name and case insensitive filesystem */
public class C1256360r {
    public List A00;

    public boolean A00() {
        for (C33281f2 isValid : this.A00) {
            if (!isValid.isValid()) {
                return false;
            }
        }
        return true;
    }

    public C1256360r(C33281f2... r4) {
        int length = r4.length;
        this.A00 = C36441kJ.A14(length);
        for (int i = 0; i < length; i = 1) {
            C33281f2 r1 = r4[i];
            if (r1 != null) {
                this.A00.add(r1);
            }
        }
    }
}
