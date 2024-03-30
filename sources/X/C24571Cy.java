package X;

/* renamed from: X.1Cy  reason: invalid class name and case insensitive filesystem */
public class C24571Cy {
    public final C21100yf A00;
    public final C20810yC A01;

    public long A00(C198959eT r6, int i, boolean z) {
        int A04;
        Integer num;
        Integer num2;
        int intValue;
        int A042;
        Integer num3;
        if (i != 2) {
            if (r6 == null || (num3 = r6.A00) == null) {
                intValue = this.A00.A04(C21100yf.A1O);
            } else {
                intValue = num3.intValue();
            }
            A042 = C20800yB.A00(C21000yV.A02, this.A01, 2266);
        } else if (r6 == null || (num2 = r6.A02) == null || (intValue = num2.intValue()) <= 0) {
            C20810yC r4 = this.A01;
            C21000yV r3 = C21000yV.A02;
            int A002 = C20800yB.A00(r3, r4, 2645);
            if (z || r6 == null || (num = r6.A03) == null || A002 == -1 || num.intValue() <= A002) {
                A04 = this.A00.A04(C21100yf.A1R);
            } else {
                A04 = C20800yB.A00(r3, r4, 2646);
            }
            return (long) A04;
        } else {
            A042 = this.A00.A04(C21100yf.A1R);
        }
        A04 = Math.min(intValue, A042);
        return (long) A04;
    }

    public C24571Cy(C21100yf r1, C20810yC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
