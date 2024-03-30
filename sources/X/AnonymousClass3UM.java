package X;

import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3UM  reason: invalid class name */
public final class AnonymousClass3UM {
    public static final AnonymousClass3UM A00 = new AnonymousClass3UM();
    public static final Pattern A01 = Pattern.compile("à\\(s\\)");
    public static final Pattern A02 = Pattern.compile("la\\(s\\)");

    public static final String A00(C18820ts r1, long j) {
        AnonymousClass00C.A0D(r1, 0);
        Calendar instance = Calendar.getInstance(C36401kF.A0x(r1));
        instance.setTimeInMillis(j);
        return A03(r1, instance);
    }

    public static final String A04(C18820ts r15, Calendar calendar, Calendar calendar2) {
        String str;
        int i;
        String str2;
        String str3;
        String A0y;
        String str4;
        String str5;
        C18820ts r6 = r15;
        Calendar calendar3 = calendar;
        Calendar calendar4 = calendar2;
        if (C18820ts.A00(r15).A00) {
            i = 229;
            if (calendar3.get(11) == calendar4.get(11)) {
                i = 230;
            }
        } else {
            int A002 = C26621Kw.A00(C36401kF.A0x(r15));
            if (A002 == 2 || A002 == 3) {
                String A0A = r15.A0A(223);
                AnonymousClass00C.A08(A0A);
                AnonymousClass3UM r1 = A00;
                str = r15.A0C(231, r1.A02(r15, A0A, calendar3), r1.A02(r15, A0A, calendar4));
                AnonymousClass00C.A08(str);
                return str;
            }
            i = 228;
            if (calendar3.get(11) != calendar4.get(11)) {
                i = 226;
                if (calendar3.get(9) == calendar4.get(9)) {
                    i = 227;
                }
            }
        }
        String A0A2 = r15.A0A(i);
        AnonymousClass00C.A08(A0A2);
        int length = A0A2.length();
        StringBuilder A0u = AnonymousClass000.A0u();
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (i2 < length) {
            char charAt = A0A2.charAt(i2);
            if (charAt == '\'') {
                z = !z;
            } else {
                if (!z) {
                    z = false;
                    if (AnonymousClass099.A09("ahHKm", charAt, 0, false) != -1) {
                        int i3 = i2;
                        while (i3 < length && A0A2.charAt(i3) == charAt) {
                            i3++;
                        }
                        int i4 = i3 - i2;
                        if (charAt == 'a') {
                            Calendar calendar5 = calendar4;
                            if (!z2) {
                                calendar5 = calendar3;
                            }
                            int i5 = 220;
                            if (calendar5.get(9) == 0) {
                                i5 = 211;
                            }
                            String A0A3 = r6.A0A(i5);
                            AnonymousClass00C.A08(A0A3);
                            A0u.append(A0A3);
                            z2 = true;
                        } else {
                            if (charAt == 'h') {
                                Calendar calendar6 = calendar4;
                                if (!z3) {
                                    calendar6 = calendar3;
                                }
                                int i6 = calendar6.get(10);
                                if (i6 == 0) {
                                    i6 = 12;
                                }
                                Locale A0x = C36401kF.A0x(r6);
                                if (i4 == 1) {
                                    str5 = "%d";
                                } else {
                                    str5 = "%02d";
                                }
                                Object[] objArr = new Object[1];
                                C36331k8.A1W(objArr, i6);
                                A0y = C36391kE.A0y(str5, A0x, objArr, 1);
                            } else if (charAt == 'H') {
                                Calendar calendar7 = calendar4;
                                if (!z3) {
                                    calendar7 = calendar3;
                                }
                                Locale A0x2 = C36401kF.A0x(r6);
                                if (i4 == 1) {
                                    str4 = "%d";
                                } else {
                                    str4 = "%02d";
                                }
                                Object[] objArr2 = new Object[1];
                                AnonymousClass000.A1L(objArr2, calendar7.get(11), 0);
                                A0y = C36391kE.A0y(str4, A0x2, objArr2, 1);
                            } else if (charAt == 'K') {
                                Calendar calendar8 = calendar4;
                                if (!z3) {
                                    calendar8 = calendar3;
                                }
                                int i7 = calendar8.get(10);
                                Locale A0x3 = C36401kF.A0x(r6);
                                if (i4 == 1) {
                                    str3 = "%d";
                                } else {
                                    str3 = "%02d";
                                }
                                Object[] objArr3 = new Object[1];
                                C36331k8.A1W(objArr3, i7);
                                A0y = C36391kE.A0y(str3, A0x3, objArr3, 1);
                            } else if (charAt == 'm') {
                                Calendar calendar9 = calendar4;
                                if (!z4) {
                                    calendar9 = calendar3;
                                }
                                Locale A0x4 = C36401kF.A0x(r6);
                                if (i4 == 1) {
                                    str2 = "%d";
                                } else {
                                    str2 = "%02d";
                                }
                                Object[] objArr4 = new Object[1];
                                AnonymousClass000.A1L(objArr4, calendar9.get(12), 0);
                                A0u.append(C36391kE.A0y(str2, A0x4, objArr4, 1));
                                z4 = true;
                            }
                            A0u.append(A0y);
                            z3 = true;
                        }
                        i2 = i3 - 1;
                    }
                }
                A0u.append(charAt);
            }
            i2++;
        }
        str = A0u.toString();
        AnonymousClass00C.A08(str);
        return str;
    }

    public static final String A01(C18820ts r3, String str, long j) {
        Matcher matcher;
        String str2;
        String str3;
        C36321k7.A0w(r3, str);
        String A06 = r3.A06();
        int hashCode = A06.hashCode();
        if (hashCode != 3246) {
            if (hashCode != 3588 || !A06.equals("pt")) {
                return str;
            }
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            int i = instance.get(11);
            boolean z = false;
            if (i == 0) {
                z = C18820ts.A00(r3).A00;
            } else if (i == 1 || (i == 13 && !C18820ts.A00(r3).A00)) {
                z = true;
            }
            Matcher matcher2 = A01.matcher(str);
            if (z) {
                str3 = "à";
            } else {
                str3 = "às";
            }
            String replaceAll = matcher2.replaceAll(str3);
            AnonymousClass00C.A08(replaceAll);
            return replaceAll;
        } else if (!A06.equals("es")) {
            return str;
        } else {
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(j);
            int i2 = instance2.get(11);
            if (i2 == 1 || (i2 == 13 && !C18820ts.A00(r3).A00)) {
                matcher = A02.matcher(str);
                str2 = "la";
            } else {
                matcher = A02.matcher(str);
                str2 = "las";
            }
            String replaceAll2 = matcher.replaceAll(str2);
            AnonymousClass00C.A0B(replaceAll2);
            return replaceAll2;
        }
    }

    private final String A02(C18820ts r11, String str, Calendar calendar) {
        String str2;
        String A0y;
        String str3;
        String str4;
        String str5;
        int[] iArr;
        int[] iArr2;
        int length = str.length();
        StringBuilder A0u = AnonymousClass000.A0u();
        int i = 0;
        boolean z = false;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                z = !z;
            } else if (z || AnonymousClass099.A09("aBhHKm", charAt, 0, false) == -1) {
                A0u.append(charAt);
            } else {
                int i2 = i;
                while (i2 < length && str.charAt(i2) == charAt) {
                    i2++;
                }
                int i3 = i2 - i;
                if (charAt == 'a') {
                    int i4 = 220;
                    if (calendar.get(9) == 0) {
                        i4 = 211;
                    }
                    A0y = r11.A0A(i4);
                    AnonymousClass00C.A08(A0y);
                } else if (charAt == 'B') {
                    Locale A0x = C36401kF.A0x(r11);
                    String[] strArr = C26621Kw.A04;
                    String languageTag = A0x.toLanguageTag();
                    AnonymousClass008 r1 = C113205fA.A00;
                    AnonymousClass36Y r5 = (AnonymousClass36Y) r1.get(languageTag);
                    if (r5 == null && (r5 = (AnonymousClass36Y) r1.get(A0x.getLanguage())) == null) {
                        int i5 = 220;
                        if (calendar.get(9) == 0) {
                            i5 = 211;
                        }
                        A0y = r11.A0A(i5);
                    } else {
                        int i6 = calendar.get(11);
                        if (calendar.get(12) == 0 && (iArr = r5.A00) != null && (iArr2 = r5.A01) != null) {
                            int i7 = 0;
                            while (true) {
                                if (i7 >= iArr.length) {
                                    break;
                                } else if (iArr[i7] == i6) {
                                    A0y = r11.A0A(iArr2[i7]);
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                        A0y = r11.A0A(r5.A02[i6]);
                    }
                } else if (charAt == 'h') {
                    int i8 = calendar.get(10);
                    if (i8 == 0) {
                        i8 = 12;
                    }
                    Locale A0x2 = C36401kF.A0x(r11);
                    if (i3 == 1) {
                        str5 = "%d";
                    } else {
                        str5 = "%02d";
                    }
                    Object[] objArr = new Object[1];
                    C36331k8.A1W(objArr, i8);
                    A0y = C36391kE.A0y(str5, A0x2, objArr, 1);
                } else if (charAt == 'H') {
                    Locale A0x3 = C36401kF.A0x(r11);
                    if (i3 == 1) {
                        str4 = "%d";
                    } else {
                        str4 = "%02d";
                    }
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1L(objArr2, calendar.get(11), 0);
                    A0y = C36391kE.A0y(str4, A0x3, objArr2, 1);
                } else if (charAt == 'K') {
                    int i9 = calendar.get(10);
                    Locale A0x4 = C36401kF.A0x(r11);
                    if (i3 == 1) {
                        str3 = "%d";
                    } else {
                        str3 = "%02d";
                    }
                    Object[] objArr3 = new Object[1];
                    C36331k8.A1W(objArr3, i9);
                    A0y = C36391kE.A0y(str3, A0x4, objArr3, 1);
                } else {
                    if (charAt == 'm') {
                        Locale A0x5 = C36401kF.A0x(r11);
                        if (i3 == 1) {
                            str2 = "%d";
                        } else {
                            str2 = "%02d";
                        }
                        Object[] objArr4 = new Object[1];
                        AnonymousClass000.A1L(objArr4, calendar.get(12), 0);
                        A0y = C36391kE.A0y(str2, A0x5, objArr4, 1);
                    }
                    i = i2 - 1;
                }
                A0u.append(A0y);
                i = i2 - 1;
            }
            i++;
        }
        return C36381kD.A0y(A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 == 3) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(X.C18820ts r3, java.util.Calendar r4) {
        /*
            X.C36321k7.A0w(r3, r4)
            X.1Kv r0 = X.C18820ts.A00(r3)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x001b
            r2 = 225(0xe1, float:3.15E-43)
        L_0x000d:
            X.3UM r1 = A00
            java.lang.String r0 = r3.A0A(r2)
            X.AnonymousClass00C.A08(r0)
            java.lang.String r0 = r1.A02(r3, r0, r4)
            return r0
        L_0x001b:
            java.util.Locale r0 = X.C36401kF.A0x(r3)
            int r1 = X.C26621Kw.A00(r0)
            r0 = 2
            if (r1 == r0) goto L_0x002b
            r0 = 3
            r2 = 224(0xe0, float:3.14E-43)
            if (r1 != r0) goto L_0x000d
        L_0x002b:
            r2 = 223(0xdf, float:3.12E-43)
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UM.A03(X.0ts, java.util.Calendar):java.lang.String");
    }
}
