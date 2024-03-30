package X;

/* renamed from: X.5dm  reason: invalid class name and case insensitive filesystem */
public abstract class C112365dm {
    public static final long A00;

    static {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(0.5f);
        A00 = (floatToRawIntBits & 4294967295L) | (floatToRawIntBits << 32);
    }
}
