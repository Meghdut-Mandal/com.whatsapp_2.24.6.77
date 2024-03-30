package X;

/* renamed from: X.6Hd  reason: invalid class name and case insensitive filesystem */
public abstract class C129476Hd {
    public static final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(Float.NaN);
        A00 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }
}
