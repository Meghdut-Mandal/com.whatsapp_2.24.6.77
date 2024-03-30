package X;

import java.util.ArrayList;

/* renamed from: X.B9w  reason: case insensitive filesystem */
public class C23214B9w implements C22993Azj {
    public Object A00;
    public final int A01;

    public C23214B9w(C203399nx r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final Object B15(C203399nx r4) {
        C203399nx r1;
        int i;
        switch (this.A01) {
            case 0:
                r1 = (C203399nx) this.A00;
                i = 5;
                break;
            case 1:
            case 2:
            case 10:
                r1 = (C203399nx) this.A00;
                break;
            case 3:
                r1 = (C203399nx) this.A00;
                ArrayList arrayList = C186098vP.A00;
                break;
            case 4:
            case 7:
            case 9:
                return new C184988tK(r4, (C203399nx) this.A00, 2);
            case 5:
                r1 = (C203399nx) this.A00;
                ArrayList arrayList2 = C186068vM.A00;
                break;
            case 6:
                r1 = (C203399nx) this.A00;
                ArrayList arrayList3 = C186238vd.A06;
                break;
            case 8:
                r1 = (C203399nx) this.A00;
                ArrayList arrayList4 = C186078vN.A00;
                break;
            case 11:
            case 13:
            case 15:
                r1 = (C203399nx) this.A00;
                i = 7;
                break;
            case 12:
            case 14:
            case 16:
                r1 = (C203399nx) this.A00;
                i = 8;
                break;
            case 17:
            case 19:
            case 20:
            case 21:
                r1 = (C203399nx) this.A00;
                i = 9;
                break;
            case 18:
            case 22:
                r1 = (C203399nx) this.A00;
                i = 10;
                break;
            case 23:
                r1 = (C203399nx) this.A00;
                i = 12;
                break;
            case 24:
                r1 = (C203399nx) this.A00;
                i = 13;
                break;
            case 25:
                r1 = (C203399nx) this.A00;
                i = 14;
                break;
            default:
                return null;
        }
        i = 6;
        return new C184838t5(r4, r1, i);
    }
}
