package X;

import com.google.protobuf.UnsafeUtil;

/* renamed from: X.9aK  reason: invalid class name and case insensitive filesystem */
public abstract class C196659aK {
    public static final C200009gP A00;

    static {
        C200009gP r0;
        if (!UnsafeUtil.A05 || !UnsafeUtil.A06 || (C196959aq.A00 != null && !C196959aq.A01)) {
            r0 = new C173588Sg();
        } else {
            r0 = new C173598Sh();
        }
        A00 = r0;
    }

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                int length2 = charSequence.length();
                int i3 = 0;
                while (i < length2) {
                    char charAt2 = charSequence.charAt(i);
                    if (charAt2 < 2048) {
                        i3 += (127 - charAt2) >>> 31;
                    } else {
                        i3 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i) >= 65536) {
                                i++;
                            } else {
                                throw new AnonymousClass92L(i, length2);
                            }
                        }
                    }
                    i++;
                }
                i2 += i3;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UTF-8 length does not fit in int: ");
        throw AnonymousClass001.A08(C36411kG.A11(A0u, ((long) i2) + 4294967296L));
    }
}
