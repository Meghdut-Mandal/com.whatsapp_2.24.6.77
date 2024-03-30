package X;

/* renamed from: X.6J1  reason: invalid class name */
public abstract class AnonymousClass6J1 {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;

    static {
        long j = (long) 3;
        long j2 = j << 32;
        A01 = (((long) 0) & 4294967295L) | j2;
        A02 = (((long) 1) & 4294967295L) | j2;
        A00 = j2 | (((long) 2) & 4294967295L);
        A03 = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static String A00(long j) {
        if (j == A01) {
            return "Rgb";
        }
        if (j == A02) {
            return "Xyz";
        }
        if (j == A00) {
            return "Lab";
        }
        if (j == A03) {
            return "Cmyk";
        }
        return "Unknown";
    }
}
