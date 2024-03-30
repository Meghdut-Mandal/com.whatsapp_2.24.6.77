package X;

import java.util.ArrayList;

/* renamed from: X.3DU  reason: invalid class name */
public class AnonymousClass3DU implements C22993Azj {
    public Object A00;
    public final int A01;

    public AnonymousClass3DU(C203399nx r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object B15(C203399nx r4) {
        int i;
        int i2 = this.A01;
        C203399nx r2 = (C203399nx) this.A00;
        switch (i2) {
            case 0:
                ArrayList arrayList = AnonymousClass2lM.A00;
                i = 6;
                break;
            case 3:
                return new C184818t3(r4, r2, 22);
            default:
                i = 19;
                break;
        }
        return new C184828t4(r4, r2, i);
    }
}
