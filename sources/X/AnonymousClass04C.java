package X;

/* renamed from: X.04C  reason: invalid class name */
public class AnonymousClass04C implements AnonymousClass04B {
    public static final AnonymousClass04C A00 = new AnonymousClass04C();

    public int B2k(CharSequence charSequence, int i, int i2) {
        int i3 = 2;
        for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i4));
            i3 = 1;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i3 = 2;
                            continue;
                    }
                }
                i3 = 0;
            }
        }
        return i3;
    }
}
