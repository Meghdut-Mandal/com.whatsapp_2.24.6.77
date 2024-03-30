package X;

/* renamed from: X.04D  reason: invalid class name */
public class AnonymousClass04D implements AnonymousClass04B {
    public static final AnonymousClass04D A00 = new AnonymousClass04D();

    public int B2k(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            if (directionality == 0) {
                z = true;
            } else if (directionality == 1 || directionality == 2) {
                return 0;
            }
        }
        if (z) {
            return 1;
        }
        return 2;
    }
}
