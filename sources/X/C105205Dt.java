package X;

import java.util.Arrays;

/* renamed from: X.5Dt  reason: invalid class name and case insensitive filesystem */
public abstract class C105205Dt extends AnonymousClass5EQ {
    public final int A00;
    public final C158137fr A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            C105205Dt r5 = (C105205Dt) obj;
            return this.A00 == r5.A00 && this.A01 == r5.A01;
        }
        return false;
    }

    public C105205Dt(C158137fr r2, Integer num, int i) {
        super(num.intValue());
        this.A00 = i;
        this.A01 = r2;
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, this.A00);
        return Arrays.hashCode(A0L);
    }
}
