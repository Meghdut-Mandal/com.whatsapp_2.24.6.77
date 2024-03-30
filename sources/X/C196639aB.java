package X;

/* renamed from: X.9aB  reason: invalid class name and case insensitive filesystem */
public abstract class C196639aB {
    public static final C195549Ut A00;

    static {
        C195549Ut r0;
        if (!C203729od.A05 || !C203729od.A04 || C196949an.A00()) {
            r0 = new C170628Ee();
        } else {
            r0 = new C170638Ef();
        }
        A00 = r0;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new AnonymousClass92J(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw AnonymousClass001.A08(C36381kD.A0z("UTF-8 length does not fit in int: ", C90524aI.A0h(54), ((long) i3) + 4294967296L));
    }
}
