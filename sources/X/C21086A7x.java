package X;

/* renamed from: X.A7x  reason: case insensitive filesystem */
public class C21086A7x implements C22904AyG {
    public boolean B6t(C200269h0 r4, C200269h0 r5, AnonymousClass9LX r6) {
        boolean z;
        int compareTo;
        if (r4 instanceof AnonymousClass8TC) {
            z = true;
        } else {
            z = false;
        }
        if (z && (r5 instanceof AnonymousClass8TC)) {
            compareTo = AnonymousClass8TC.A00(r4, r5);
        } else if ((r4 instanceof AnonymousClass8T8) && (r5 instanceof AnonymousClass8T8)) {
            compareTo = AnonymousClass8T8.A00(r4, r5);
        } else if (!(r4 instanceof AnonymousClass8T9) || !(r5 instanceof AnonymousClass8T9)) {
            return false;
        } else {
            compareTo = r4.A04().A07().compareTo(r5.A04().A07());
        }
        if (compareTo <= 0) {
            return false;
        }
        return true;
    }
}
