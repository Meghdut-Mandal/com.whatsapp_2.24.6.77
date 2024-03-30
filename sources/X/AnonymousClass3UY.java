package X;

import android.content.Context;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.3UY  reason: invalid class name */
public abstract class AnonymousClass3UY {
    public static String A01(C224914p r3, int i, long j) {
        return r3.getString(i, new Object[]{A0D(r3.A00, j)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r6 = new java.lang.Object[1];
        r4 = new java.lang.Object[1];
        r6[X.C36361kB.A1b(r4, r9)] = java.lang.String.format(X.C36401kF.A0x(r8), "%d", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        return r8.A0K(r6, r7, (long) r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.C18820ts r8, int r9, int r10) {
        /*
            r0 = 7
            if (r10 != r0) goto L_0x0012
            long r3 = (long) r9
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            r0 = 2131891191(0x7f1213f7, float:1.9417095E38)
            java.lang.String r0 = r8.A0B(r0)
            return r0
        L_0x0012:
            switch(r10) {
                case 0: goto L_0x002e;
                case 1: goto L_0x002b;
                case 2: goto L_0x0028;
                case 3: goto L_0x0025;
                case 4: goto L_0x0022;
                case 5: goto L_0x001f;
                case 6: goto L_0x001c;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "Invalid duration unit"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x001c:
            r7 = 296(0x128, float:4.15E-43)
            goto L_0x0030
        L_0x001f:
            r7 = 287(0x11f, float:4.02E-43)
            goto L_0x0030
        L_0x0022:
            r7 = 294(0x126, float:4.12E-43)
            goto L_0x0030
        L_0x0025:
            r7 = 275(0x113, float:3.85E-43)
            goto L_0x0030
        L_0x0028:
            r7 = 279(0x117, float:3.91E-43)
            goto L_0x0030
        L_0x002b:
            r7 = 284(0x11c, float:3.98E-43)
            goto L_0x0030
        L_0x002e:
            r7 = 290(0x122, float:4.06E-43)
        L_0x0030:
            long r1 = (long) r9
            r0 = 1
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.util.Locale r5 = X.C36401kF.A0x(r8)
            java.lang.Object[] r4 = new java.lang.Object[r0]
            boolean r3 = X.C36361kB.A1b(r4, r9)
            java.lang.String r0 = "%d"
            java.lang.String r0 = java.lang.String.format(r5, r0, r4)
            r6[r3] = r0
            java.lang.String r0 = r8.A0K(r6, r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UY.A03(X.0ts, int, int):java.lang.String");
    }

    public static String A06(C18820ts r9, long j) {
        C18740tg.A0C(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        int A0B = (int) C36391kE.A0B(j2 % 60000);
        if (i > 0) {
            return r9.A0C(244, A04(r9, i, 2), A04(r9, i2, 1));
        } else if (i2 > 0) {
            return A04(r9, i2, 1);
        } else {
            return A04(r9, A0B, 0);
        }
    }

    public static String A0A(C18820ts r10, long j) {
        C18740tg.A0C(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        int i = (int) (j / 3600000);
        long j2 = j % 3600000;
        int i2 = (int) (j2 / 60000);
        String A03 = A03(r10, (int) C36391kE.A0B(j2 % 60000), 0);
        if (i > 0) {
            return r10.A0C(238, r10.A0C(243, A03(r10, i, 2), A03(r10, i2, 1)), A03);
        } else if (i2 <= 0) {
            return A03;
        } else {
            return r10.A0C(244, A03(r10, i2, 1), A03);
        }
    }

    public static String A0C(C18820ts r14, long j) {
        String A0C;
        int i;
        int i2;
        C18740tg.A0C(C36401kF.A1U((j > 0 ? 1 : (j == 0 ? 0 : -1))));
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        if (j3 - (60000 * j4) > 0) {
            j4++;
        }
        if (j4 == 60) {
            j2++;
            j4 = 0;
        }
        if (j2 == 0) {
            i2 = (int) j4;
            A0C = A03(r14, i2, 1);
            i = R.plurals.f10nameremoved;
        } else {
            A0C = r14.A0C(239, A04(r14, (int) j2, 2), A04(r14, (int) j4, 1));
            i = R.plurals.f10nameremoved;
            i2 = (int) (j2 + j4);
        }
        long j5 = (long) i2;
        return r14.A0L(new Object[]{A0C}, i, j5);
    }

    public static String A0E(C18820ts r3, long j) {
        C51812oQ r0;
        int A00 = AnonymousClass6XI.A00(System.currentTimeMillis(), j);
        if (A00 == 0) {
            r0 = C51812oQ.LTE_24_HOURS;
        } else if (A00 == 1) {
            r0 = C51812oQ.GT_24_HOURS_AND_LTE_48_HOURS;
        } else if (A00 < 7) {
            r0 = C51812oQ.GT_48_HOURS_AND_LTE_7_DAYS;
        } else {
            r0 = C51812oQ.GT_7_DAYS;
        }
        int ordinal = r0.ordinal();
        if (ordinal == 0) {
            return C20040wv.A00(r3);
        }
        if (ordinal == 1) {
            return C20040wv.A01(r3);
        }
        if (ordinal != 2) {
            return C20040wv.A08(r3, j);
        }
        return C20040wv.A06(r3, j);
    }

    public static void A0I(VerifyPhoneNumber verifyPhoneNumber, int i, long j) {
        VerifyPhoneNumber.A1M(verifyPhoneNumber, verifyPhoneNumber.getString(i, new Object[]{A0D(verifyPhoneNumber.A00, j)}));
    }

    public static String A00(Context context, C18820ts r5, long j, long j2) {
        if (((int) Math.floor(((double) (j - j2)) / 3600000.0d)) < 12) {
            return C36391kE.A0v(context, AnonymousClass3UM.A00(r5, j), new Object[1], 0, R.string.f12nameremoved);
        }
        return C36321k7.A0B(context.getResources(), AnonymousClass6XI.A00(j, j2), 0, R.plurals.f10nameremoved);
    }

    public static String A04(C18820ts r8, int i, int i2) {
        int i3;
        if (i2 != 0) {
            i3 = 286;
            if (i2 != 1) {
                i3 = 281;
            }
        } else {
            i3 = 292;
        }
        Object[] objArr = new Object[1];
        Object[] objArr2 = new Object[1];
        objArr[C36361kB.A1b(objArr2, i)] = String.format(C36401kF.A0x(r8), "%d", objArr2);
        return r8.A0K(objArr, i3, (long) i);
    }

    public static String A07(C18820ts r18, long j) {
        long j2;
        long j3;
        String str;
        Object[] objArr;
        Long valueOf;
        if (j >= 3600) {
            j2 = j / 3600;
            j -= 3600 * j2;
        } else {
            j2 = 0;
        }
        if (j >= 60) {
            j3 = j / 60;
            j -= 60 * j3;
        } else {
            j3 = 0;
        }
        int i = 222;
        if (j2 > 0) {
            i = 221;
        }
        C18820ts r1 = r18;
        String A0A = r1.A0A(i);
        int length = A0A.length();
        StringBuilder sb = new StringBuilder(length);
        Locale A0x = C36401kF.A0x(r1);
        int i2 = 0;
        while (i2 < length) {
            char charAt = A0A.charAt(i2);
            if (charAt == 'h' || charAt == 'm' || charAt == 's') {
                int i3 = i2 + 1;
                if (i3 >= length || A0A.charAt(i3) != charAt) {
                    str = "%d";
                    i3 = i2;
                } else {
                    str = "%02d";
                }
                if (charAt == 'h') {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j2);
                } else if (charAt != 'm') {
                    if (charAt == 's') {
                        objArr = new Object[1];
                        valueOf = Long.valueOf(j);
                    }
                    i2 = i3;
                } else {
                    objArr = new Object[1];
                    valueOf = Long.valueOf(j3);
                }
                objArr[0] = valueOf;
                sb.append(String.format(A0x, str, objArr));
                i2 = i3;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static String A09(C18820ts r6, long j) {
        String A09;
        int i;
        if (j == -1) {
            return r6.A0B(R.string.f12nameremoved);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = AnonymousClass6XI.A00(currentTimeMillis, j);
        if (A00 == 0) {
            i = R.string.f12nameremoved;
        } else if (A00 == -1) {
            i = R.string.f12nameremoved;
        } else {
            if (A00 > -30) {
                A09 = AnonymousClass6XI.A03(r6, C20040wv.A03(r6, j), AnonymousClass3UM.A00(r6, j));
            } else if (AnonymousClass6XI.A05(currentTimeMillis, j)) {
                A09 = C20040wv.A03(r6, j);
            } else {
                A09 = C20040wv.A09(r6, j);
            }
            return r6.A0D(R.string.f12nameremoved, A09);
        }
        return r6.A0D(i, AnonymousClass3UM.A00(r6, j));
    }

    public static String A02(C19970wo r3, C18820ts r4, long j) {
        long A00 = C19970wo.A00(r3);
        if (AnonymousClass6XI.A00(A00, j) == 1) {
            return C20040wv.A01(r4);
        }
        if (AnonymousClass6XI.A00(A00, j) == 0) {
            return C20040wv.A00(r4);
        }
        if (AnonymousClass6XI.A00(A00, j) == -1) {
            return C20040wv.A0A(C36401kF.A0x(r4), r4.A0A(273));
        }
        if (!AnonymousClass6XI.A05(j, A00)) {
            return C20040wv.A05(r4, j);
        }
        return C20040wv.A07(r4, j);
    }

    public static String A05(C18820ts r6, int i, long j) {
        int i2;
        Object[] objArr;
        String A04;
        String str;
        String A06 = r6.A06();
        if ("en".equals(A06) || "de".equals(A06) || "es".equals(A06)) {
            if (i <= 30) {
                i2 = R.string.f12nameremoved;
                objArr = new Object[1];
                A04 = C20040wv.A04(r6, j);
            } else {
                if (C20040wv.A01 == null) {
                    C20040wv.A01 = DateFormat.getDateInstance(2, C36401kF.A0x(r6));
                }
                return r6.A0D(R.string.f12nameremoved, ((DateFormat) C20040wv.A01.clone()).format(new Date(j)));
            }
        } else if (i <= 30) {
            i2 = R.string.f12nameremoved;
            objArr = new Object[1];
            A04 = C20040wv.A09(r6, j);
        } else {
            i2 = R.string.f12nameremoved;
            objArr = new Object[1];
            str = C20040wv.A09(r6, j);
            objArr[0] = str;
            return r6.A0D(i2, objArr);
        }
        str = AnonymousClass6XI.A03(r6, A04, AnonymousClass3UM.A00(r6, j));
        objArr[0] = str;
        return r6.A0D(i2, objArr);
    }

    public static String A08(C18820ts r5, long j) {
        int i;
        String A09;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = AnonymousClass6XI.A00(currentTimeMillis, j);
        if (A00 == 0) {
            i = R.string.f12nameremoved;
        } else if (A00 == 1) {
            i = R.string.f12nameremoved;
        } else {
            if (AnonymousClass6XI.A05(currentTimeMillis, j)) {
                A09 = C20040wv.A03(r5, j);
            } else {
                A09 = C20040wv.A09(r5, j);
            }
            return r5.A0D(R.string.f12nameremoved, AnonymousClass6XI.A03(r5, A09, AnonymousClass3UM.A00(r5, j)));
        }
        return AnonymousClass3UM.A01(r5, r5.A0D(i, AnonymousClass3UM.A00(r5, j)), j);
    }

    public static String A0B(C18820ts r8, long j) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        int A00 = AnonymousClass6XI.A00(currentTimeMillis, j);
        if (A00 == 0) {
            int i = (int) ((currentTimeMillis - j) / 60000);
            if (i < 1) {
                return r8.A0B(R.string.f12nameremoved);
            }
            if (i < 60) {
                long j2 = (long) i;
                Object[] objArr = new Object[1];
                Object[] objArr2 = new Object[1];
                objArr[C36361kB.A1b(objArr2, i)] = String.format(C36401kF.A0x(r8), "%d", objArr2);
                return r8.A0K(objArr, 270, j2);
            }
            str = C20040wv.A00(r8);
        } else if (A00 == 1) {
            str = C20040wv.A01(r8);
        } else if (AnonymousClass6XI.A05(currentTimeMillis, j)) {
            str = C20040wv.A03(r8, j);
        } else {
            str = C20040wv.A09(r8, j);
        }
        return AnonymousClass6XI.A03(r8, str, AnonymousClass3UM.A00(r8, j));
    }

    public static String A0D(C18820ts r12, long j) {
        long j2 = j / 3600000;
        long j3 = (j - (3600000 * j2)) / 60000;
        if (j2 == 0) {
            if (j3 == 0) {
                return A03(r12, (int) C36391kE.A0B(j), 0);
            }
            return A03(r12, (int) j3, 1);
        } else if (j3 == 0) {
            return A03(r12, (int) j2, 2);
        } else {
            return r12.A0C(244, A03(r12, (int) j2, 2), A03(r12, (int) j3, 1));
        }
    }

    public static String A0F(C18820ts r2, long j, boolean z) {
        int A00 = AnonymousClass6XI.A00(System.currentTimeMillis(), j);
        if (A00 == 0) {
            return AnonymousClass3UM.A00(r2, j);
        }
        if (A00 == 1) {
            return C20040wv.A01(r2);
        }
        if (z) {
            return C20040wv.A0C(r2, 0).format(new Date(j));
        }
        return C20040wv.A09(r2, j);
    }

    public static String A0G(C18820ts r5, Object[] objArr, int i, int i2, int i3, long j, boolean z) {
        Object[] copyOf;
        String A09;
        int A00 = AnonymousClass6XI.A00(System.currentTimeMillis(), j);
        int length = objArr.length;
        if (length == 0) {
            copyOf = new String[1];
        } else {
            copyOf = Arrays.copyOf(objArr, 2);
        }
        if (A00 == 0 || A00 == 1) {
            C36411kG.A1H(r5, AnonymousClass3UM.A00(r5, j), copyOf, length);
            if (A00 != 0) {
                i = i2;
            }
            return AnonymousClass3UM.A01(r5, r5.A0D(i, copyOf), j);
        }
        if (A00 > 30 || !z) {
            A09 = C20040wv.A09(r5, j);
        } else {
            A09 = AnonymousClass6XI.A03(r5, C20040wv.A09(r5, j), AnonymousClass3UM.A00(r5, j));
        }
        C36411kG.A1H(r5, A09, copyOf, length);
        return r5.A0D(i3, copyOf);
    }

    public static void A0H(TextView textView, C19970wo r3, C18820ts r4, long j) {
        textView.setText(A0B(r4, r3.A08(j)));
    }
}
