package X;

/* renamed from: X.61J  reason: invalid class name */
public class AnonymousClass61J {
    public final C133056Wm A00;

    public AnonymousClass61J(C133056Wm r1) {
        this.A00 = r1;
    }

    public static int A00(AnonymousClass005 r3, int i, int i2) {
        r3.get();
        Integer valueOf = Integer.valueOf(i);
        if (valueOf == null) {
            return i2;
        }
        int intValue = valueOf.intValue();
        int i3 = 0;
        for (int i4 = 0; i4 < 32; i4++) {
            i3 |= ((intValue >> i4) & 1) << (31 - i4);
        }
        return i2 ^ i3;
    }
}
