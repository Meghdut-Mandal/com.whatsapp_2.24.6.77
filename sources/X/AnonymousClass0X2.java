package X;

import java.io.IOException;
import java.math.RoundingMode;

/* renamed from: X.0X2  reason: invalid class name */
public abstract class AnonymousClass0X2 {
    public static final AnonymousClass0X2 A00 = new C04950Mq(new AnonymousClass0XB("base16()", "0123456789ABCDEF".toCharArray()));
    public static final AnonymousClass0X2 A01 = new C04940Mp("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final AnonymousClass0X2 A02 = new C04940Mp("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    public static final AnonymousClass0X2 A03 = new C04960Mr(new AnonymousClass0XB("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567".toCharArray()), '=');
    public static final AnonymousClass0X2 A04 = new C04960Mr(new AnonymousClass0XB("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV".toCharArray()), '=');

    public final String A00(byte[] bArr, int i) {
        C07320Xe.A02(0, i, bArr.length);
        AnonymousClass0XB r0 = ((C04960Mr) this).A00;
        StringBuilder sb = new StringBuilder(r0.A02 * AnonymousClass0QZ.A00(i, r0.A03, RoundingMode.CEILING));
        try {
            A01(sb, bArr, 0, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public abstract void A01(Appendable appendable, byte[] bArr, int i, int i2);
}
