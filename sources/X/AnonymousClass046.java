package X;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* renamed from: X.046  reason: invalid class name */
public final class AnonymousClass046 {
    public static final AnonymousClass046 A02;
    public static final AnonymousClass046 A03;
    public static final AnonymousClass048 A04;
    public static final String A05 = Character.toString(8206);
    public static final String A06 = Character.toString(8207);
    public final AnonymousClass048 A00;
    public final boolean A01;

    static {
        AnonymousClass048 r2 = AnonymousClass047.A01;
        A04 = r2;
        A02 = new AnonymousClass046(r2, false);
        A03 = new AnonymousClass046(r2, true);
    }

    public static int A00(CharSequence charSequence) {
        int i;
        byte directionality;
        byte directionality2;
        byte[] bArr = AnonymousClass0RH.A00;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 < length) {
                if (i3 == 0) {
                    char charAt = charSequence.charAt(i2);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i2);
                        i2 += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i2++;
                        if (charAt < 1792) {
                            directionality2 = AnonymousClass0RH.A00[charAt];
                        } else {
                            directionality2 = Character.getDirectionality(charAt);
                        }
                    }
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            if (i5 == 0) {
                                return 1;
                            }
                        } else if (directionality2 != 9) {
                            switch (directionality2) {
                                case 14:
                                case 15:
                                    i5++;
                                    i4 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i5++;
                                    i4 = 1;
                                    continue;
                                case 18:
                                    i5--;
                                    i4 = 0;
                                    continue;
                            }
                        }
                    } else if (i5 == 0) {
                        return -1;
                    }
                    i3 = i5;
                }
            } else if (i3 == 0) {
                return 0;
            }
        }
        if (i4 != 0) {
            return i4;
        }
        while (i2 > 0) {
            int i6 = i2 - 1;
            char charAt2 = charSequence.charAt(i6);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i2);
                i = i2 - Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i = i6;
                if (charAt2 < 1792) {
                    directionality = AnonymousClass0RH.A00[charAt2];
                } else {
                    directionality = Character.getDirectionality(charAt2);
                }
            }
            switch (directionality) {
                case 14:
                case 15:
                    if (i3 == i5) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i3 == i5) {
                        return 1;
                    }
                    break;
                case 18:
                    i5++;
                    continue;
            }
            i5--;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.CharSequence r5) {
        /*
            byte[] r0 = X.AnonymousClass0RH.A00
            int r4 = r5.length()
            r3 = 0
            r2 = 0
        L_0x0008:
            r0 = 0
            if (r4 <= 0) goto L_0x005a
            int r0 = r4 + -1
            char r1 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x0047
            int r1 = java.lang.Character.codePointBefore(r5, r4)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 - r0
            byte r1 = java.lang.Character.getDirectionality(r1)
        L_0x0024:
            if (r1 == 0) goto L_0x0057
            r0 = 1
            if (r1 == r0) goto L_0x0043
            r0 = 2
            if (r1 == r0) goto L_0x0043
            r0 = 9
            if (r1 == r0) goto L_0x0008
            switch(r1) {
                case 14: goto L_0x0037;
                case 15: goto L_0x0037;
                case 16: goto L_0x003a;
                case 17: goto L_0x003a;
                case 18: goto L_0x0040;
                default: goto L_0x0033;
            }
        L_0x0033:
            if (r2 != 0) goto L_0x0008
            r2 = r3
            goto L_0x0008
        L_0x0037:
            if (r2 != r3) goto L_0x003d
            goto L_0x0059
        L_0x003a:
            if (r2 != r3) goto L_0x003d
            goto L_0x0045
        L_0x003d:
            int r3 = r3 + -1
            goto L_0x0008
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0043:
            if (r3 != 0) goto L_0x0033
        L_0x0045:
            r0 = 1
            return r0
        L_0x0047:
            int r4 = r4 + -1
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L_0x0052
            byte[] r0 = X.AnonymousClass0RH.A00
            byte r1 = r0[r1]
            goto L_0x0024
        L_0x0052:
            byte r1 = java.lang.Character.getDirectionality(r1)
            goto L_0x0024
        L_0x0057:
            if (r3 != 0) goto L_0x0033
        L_0x0059:
            r0 = -1
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass046.A01(java.lang.CharSequence):int");
    }

    public SpannableStringBuilder A03(AnonymousClass048 r7, CharSequence charSequence) {
        AnonymousClass048 r2;
        String str;
        AnonymousClass048 r22;
        String str2;
        if (charSequence == null) {
            return null;
        }
        boolean BN4 = r7.BN4(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (BN4) {
            r2 = AnonymousClass047.A05;
        } else {
            r2 = AnonymousClass047.A04;
        }
        boolean BN42 = r2.BN4(charSequence, 0, charSequence.length());
        boolean z = this.A01;
        if (!z) {
            if (BN42 || A00(charSequence) == 1) {
                str = A05;
            }
            str = "";
        } else {
            if (!BN42 || A00(charSequence) == -1) {
                str = A06;
            }
            str = "";
        }
        spannableStringBuilder.append(str);
        if (BN4 != z) {
            char c = 8234;
            if (BN4) {
                c = 8235;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (BN4) {
            r22 = AnonymousClass047.A05;
        } else {
            r22 = AnonymousClass047.A04;
        }
        boolean BN43 = r22.BN4(charSequence, 0, charSequence.length());
        if (!z) {
            if (BN43 || A01(charSequence) == 1) {
                str2 = A05;
            }
            str2 = "";
        } else {
            if (!BN43 || A01(charSequence) == -1) {
                str2 = A06;
            }
            str2 = "";
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }

    public AnonymousClass046(AnonymousClass048 r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public static AnonymousClass046 A02() {
        boolean z = true;
        if (AnonymousClass044.A00(Locale.getDefault()) != 1) {
            z = false;
        }
        AnonymousClass048 r1 = A04;
        if (r1 != r1) {
            return new AnonymousClass046(r1, z);
        }
        if (z) {
            return A03;
        }
        return A02;
    }
}
