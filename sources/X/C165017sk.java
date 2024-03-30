package X;

/* renamed from: X.7sk  reason: invalid class name and case insensitive filesystem */
public class C165017sk implements C22993Azj {
    public Object A00;
    public final int A01;

    public C165017sk(C203399nx r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public static void A00(C203399nx r2, C203399nx r3, int i) {
        C203539oF.A06(r3, new C165017sk(r2, i), new String[0]);
    }

    public final Object B15(C203399nx r4) {
        int i;
        int i2 = this.A01;
        C203399nx r2 = (C203399nx) this.A00;
        switch (i2) {
            case 0:
            case 1:
                i = 3;
                break;
            case 2:
                i = 14;
                break;
            case 3:
                return new C184828t4(r4, r2, 22);
            case 12:
                i = 25;
                break;
            default:
                return new C184838t5(r4, r2, 11);
        }
        return new C184818t3(r4, r2, i);
    }
}
