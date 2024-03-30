package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.099  reason: invalid class name */
public abstract class AnonymousClass099 extends AnonymousClass098 {
    public static final int A08(CharSequence charSequence, char c, int i) {
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        char[] cArr = {c};
        int length = charSequence.length() - 1;
        if (i > length) {
            i = length;
        }
        while (-1 < i) {
            if (cArr[0] == charSequence.charAt(i)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static final int A09(CharSequence charSequence, char c, int i, boolean z) {
        AnonymousClass00C.A0D(charSequence, 0);
        if (z || !(charSequence instanceof String)) {
            char[] cArr = {c};
            if (z || !(charSequence instanceof String)) {
                if (i < 0) {
                    i = 0;
                }
                C13590k7 A00 = new C15020mZ(i, charSequence.length() - 1).iterator();
                while (A00.hasNext()) {
                    int A002 = A00.A00();
                    if (C15100mh.A02(cArr[0], charSequence.charAt(A002), z)) {
                        return A002;
                    }
                }
                return -1;
            }
        }
        return ((String) charSequence).indexOf(c, i);
    }

    public static final int A0A(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C11020fb r1;
        int i3;
        boolean regionMatches;
        int i4 = i2;
        int i5 = i;
        if (!z2) {
            if (i < 0) {
                i5 = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i4 = length;
            }
            r1 = new C15020mZ(i5, i4);
        } else {
            int length2 = charSequence.length() - 1;
            if (i > length2) {
                i5 = length2;
            }
            if (i2 < 0) {
                i4 = 0;
            }
            r1 = new C11020fb(i5, i4, -1);
        }
        CharSequence charSequence3 = charSequence2;
        boolean z3 = z;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            i3 = r1.A00;
            int i6 = r1.A01;
            int i7 = r1.A02;
            if (i7 > 0) {
                if (i3 > i6) {
                    return -1;
                }
            } else if (i7 >= 0 || i6 > i3) {
                return -1;
            }
            while (true) {
                String str = (String) charSequence3;
                String str2 = (String) charSequence;
                int length3 = charSequence2.length();
                AnonymousClass00C.A0D(str, 0);
                AnonymousClass00C.A0D(str2, 2);
                if (!z) {
                    regionMatches = str.regionMatches(0, str2, i3, length3);
                } else {
                    regionMatches = str.regionMatches(z3, 0, str2, i3, length3);
                }
                if (regionMatches) {
                    break;
                } else if (i3 == i6) {
                    return -1;
                } else {
                    i3 += i7;
                }
            }
        } else {
            int i8 = r1.A00;
            int i9 = r1.A01;
            int i10 = r1.A02;
            if (i10 > 0) {
                if (i8 > i9) {
                    return -1;
                }
            } else if (i10 >= 0 || i9 > i8) {
                return -1;
            }
            while (true) {
                if (A0N(charSequence3, charSequence, 0, i3, charSequence3.length(), z)) {
                    break;
                } else if (i3 == i9) {
                    return -1;
                } else {
                    i8 = i3 + i10;
                }
            }
        }
        return i3;
    }

    public static final int A0B(CharSequence charSequence, String str, int i) {
        CharSequence charSequence2 = charSequence;
        String str2 = str;
        int i2 = i;
        if (!(charSequence2 instanceof String)) {
            return A0A(charSequence2, str2, i2, 0, false, true);
        }
        return ((String) charSequence2).lastIndexOf(str, i);
    }

    public static final int A0C(CharSequence charSequence, String str, int i, boolean z) {
        CharSequence charSequence2 = charSequence;
        AnonymousClass00C.A0D(charSequence2, 0);
        String str2 = str;
        AnonymousClass00C.A0D(str, 1);
        int i2 = i;
        boolean z2 = z;
        if (z || !(charSequence2 instanceof String)) {
            return A0A(charSequence2, str2, i2, charSequence2.length(), z2, false);
        }
        return ((String) charSequence2).indexOf(str, i);
    }

    public static final CharSequence A0D(CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 0);
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A01 = C06780Vb.A01(charSequence.charAt(i2));
            if (z) {
                if (!A01) {
                    break;
                }
                length--;
            } else if (!A01) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String A0E(CharSequence charSequence, String str) {
        boolean A0N;
        String str2 = str;
        CharSequence charSequence2 = charSequence;
        if (charSequence instanceof String) {
            A0N = AnonymousClass098.A07(str, (String) charSequence2, false);
        } else {
            A0N = A0N(str2, charSequence2, 0, 0, charSequence.length(), false);
        }
        if (!A0N) {
            return str2;
        }
        String substring = str2.substring(charSequence2.length());
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static final String A0F(CharSequence charSequence, String str) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(charSequence, 1);
        if (!A0M(str, charSequence)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static final String A0H(String str, String str2) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 2);
        int length = str.length();
        int A08 = A08(str, '.', length - 1);
        if (A08 == -1) {
            return str2;
        }
        String substring = str.substring(A08 + 1, length);
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static final String A0I(String str, String str2, String str3) {
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        AnonymousClass00C.A0D(str3, 2);
        int A0C = A0C(str, str2, 0, false);
        if (A0C == -1) {
            return str3;
        }
        String substring = str.substring(A0C + str2.length(), str.length());
        AnonymousClass00C.A08(substring);
        return substring;
    }

    public static final List A0K(CharSequence charSequence, String str, int i) {
        int i2 = 0;
        int A0C = A0C(charSequence, str, 0, false);
        if (A0C == -1 || i == 1) {
            List singletonList = Collections.singletonList(charSequence.toString());
            AnonymousClass00C.A08(singletonList);
            return singletonList;
        }
        boolean z = false;
        int i3 = 10;
        if (i > 0) {
            z = true;
            i3 = i;
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, A0C).toString());
            i2 = str.length() + A0C;
            if ((z && arrayList.size() == i - 1) || (A0C = A0C(charSequence, str, i2, false)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, A0C).toString());
            i2 = str.length() + A0C;
            break;
        } while ((A0C = A0C(charSequence, str, i2, false)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    public static final List A0L(CharSequence charSequence, String[] strArr, int i) {
        AnonymousClass00C.A0D(charSequence, 0);
        String str = strArr[0];
        if (str.length() != 0) {
            return A0K(charSequence, str, i);
        }
        List asList = Arrays.asList(strArr);
        AnonymousClass00C.A08(asList);
        C18610tR r1 = new C18610tR(new C12830ij(charSequence, new C14810mE(asList), i), 1);
        ArrayList arrayList = new ArrayList(10);
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            C11020fb r0 = (C11020fb) it.next();
            AnonymousClass00C.A0D(r0, 1);
            arrayList.add(charSequence.subSequence(r0.A00, r0.A01 + 1).toString());
        }
        return arrayList;
    }

    public static final boolean A0M(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = charSequence;
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return A0N(charSequence4, charSequence3, charSequence.length() - charSequence2.length(), 0, charSequence2.length(), false);
        }
        String str = (String) charSequence4;
        String str2 = (String) charSequence3;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass00C.A0D(str2, 1);
        return str.endsWith(str2);
    }

    public static final boolean A0N(CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, boolean z) {
        if (i2 >= 0 && i >= 0 && i <= charSequence.length() - i3 && i2 <= charSequence2.length() - i3) {
            int i4 = 0;
            while (i4 < i3) {
                if (C15100mh.A02(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                    i4++;
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean A0O(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        int A0A;
        CharSequence charSequence3 = charSequence2;
        CharSequence charSequence4 = charSequence;
        AnonymousClass00C.A0D(charSequence, 0);
        AnonymousClass00C.A0D(charSequence2, 1);
        boolean z2 = charSequence2 instanceof String;
        boolean z3 = z;
        if (z2) {
            A0A = A0C(charSequence, (String) charSequence3, 0, z);
        } else {
            A0A = A0A(charSequence4, charSequence3, 0, charSequence.length(), z3, false);
        }
        if (A0A < 0) {
            return false;
        }
        return true;
    }

    public static final String A0G(String str, int i) {
        CharSequence charSequence;
        int length = str.length();
        if (i <= length) {
            charSequence = str.subSequence(0, length);
        } else {
            StringBuilder sb = new StringBuilder(i);
            sb.append(str);
            C13590k7 A00 = new C15020mZ(1, i - length).iterator();
            while (A00.hasNext()) {
                A00.A00();
                sb.append(' ');
            }
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final List A0J(CharSequence charSequence) {
        List asList = Arrays.asList(new String[]{"\r\n", "\n", "\r"});
        AnonymousClass00C.A08(asList);
        return C15060md.A00(new C12790if(new C14640lx(charSequence), new C12830ij(charSequence, new C14810mE(asList), 0)));
    }
}
