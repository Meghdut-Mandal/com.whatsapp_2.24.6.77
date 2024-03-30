package X;

public class A8A implements C22904AyG {
    public boolean B6t(C200269h0 r5, C200269h0 r6, AnonymousClass9LX r7) {
        boolean z;
        boolean z2;
        AnonymousClass8TA r2;
        AnonymousClass8T8 r0;
        String str;
        boolean z3 = r5 instanceof AnonymousClass8TA;
        if (z3) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = r6 instanceof AnonymousClass8TA;
        if (z4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 ^ z)) {
            return false;
        }
        if (z) {
            if (z3) {
                r2 = (AnonymousClass8TA) r5;
                if ((r6 instanceof AnonymousClass8T8) || (r6 instanceof AnonymousClass8TC)) {
                    r0 = r6.A05();
                    str = r0.A01;
                } else {
                    if (r6 instanceof AnonymousClass8T6) {
                        str = ((AnonymousClass8T6) r6).toString();
                    }
                    str = "";
                }
            } else {
                throw C173738Sv.A00("Expected regexp node");
            }
        } else if (z4) {
            r2 = (AnonymousClass8TA) r6;
            if ((r5 instanceof AnonymousClass8T8) || (r5 instanceof AnonymousClass8TC)) {
                r0 = r5.A05();
                str = r0.A01;
            } else {
                if (r5 instanceof AnonymousClass8T6) {
                    str = ((AnonymousClass8T6) r5).toString();
                }
                str = "";
            }
        } else {
            throw C173738Sv.A00("Expected regexp node");
        }
        return C36361kB.A1Z(str, r2.A00);
    }
}
