package X;

/* renamed from: X.6kn  reason: invalid class name and case insensitive filesystem */
public final class C139966kn implements C157767ee {
    public int BEZ(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 0) {
            return 3;
        }
        int i2 = i % 100;
        if (i2 >= 2) {
            if (i2 <= 10) {
                return 3;
            }
            if (i2 > 19) {
                return 5;
            }
            return 4;
        }
        return 5;
    }
}
