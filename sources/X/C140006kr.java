package X;

/* renamed from: X.6kr  reason: invalid class name and case insensitive filesystem */
public final class C140006kr implements C157767ee {
    public int BEZ(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        int i2 = i % 100;
        if (i2 < 3) {
            return 5;
        }
        if (i2 <= 10) {
            return 3;
        }
        if (i2 > 99) {
            return 5;
        }
        return 4;
    }
}
