package X;

/* renamed from: X.9Z2  reason: invalid class name */
public abstract class AnonymousClass9Z2 {
    public static void A00(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (b2 > -65 || C165607th.A02(b, b2) != 0 || b3 > -65 || b4 > -65) {
            throw new C187318xe("Protocol message had invalid UTF-8.");
        }
        byte b5 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + 56320);
    }

    public static void A01(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (b2 > -65 || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || b3 > -65) {
            throw new C187318xe("Protocol message had invalid UTF-8.");
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }
}
