package X;

/* renamed from: X.6kf  reason: invalid class name and case insensitive filesystem */
public final class C139886kf implements C157767ee {
    public int BEZ(int i) {
        int i2 = i % 10;
        if (i2 == 1) {
            if (i % 100 != 11) {
                return 1;
            }
            return 5;
        } else if (i2 < 2 || i2 > 4) {
            return 5;
        } else {
            int i3 = i % 100;
            if (i3 < 12 || i3 > 14) {
                return 3;
            }
            return 5;
        }
    }
}
