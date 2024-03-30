package X;

import java.lang.reflect.Method;

/* renamed from: X.9nl  reason: invalid class name and case insensitive filesystem */
public final class C203309nl {
    public static final C203309nl A04 = new C203309nl(1, 1, "VZCBSIFJD", 2);
    public static final C203309nl A05 = new C203309nl(3, 3, "VZCBSIFJD", 4);
    public static final C203309nl A06 = new C203309nl(2, 2, "VZCBSIFJD", 3);
    public static final C203309nl A07 = new C203309nl(8, 8, "VZCBSIFJD", 9);
    public static final C203309nl A08 = new C203309nl(6, 6, "VZCBSIFJD", 7);
    public static final C203309nl A09 = new C203309nl(5, 5, "VZCBSIFJD", 6);
    public static final C203309nl A0A = new C203309nl(7, 7, "VZCBSIFJD", 8);
    public static final C203309nl A0B = new C203309nl(4, 4, "VZCBSIFJD", 5);
    public static final C203309nl A0C = new C203309nl(0, 0, "VZCBSIFJD", 1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public static int A00(String str) {
        int i = 0;
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            int i3 = i2 + 1;
            if (str.charAt(i2) == 'L') {
                i2 = Math.max(i3, str.indexOf(59, i3) + 1);
            } else {
                i2 = i3;
            }
            i++;
        }
        return i;
    }

    public static int A01(String str) {
        int i = 1;
        char charAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i4 = Math.max(i4, str.indexOf(59, i4) + 1);
                }
                i3++;
                i2 = i4;
            }
            charAt = str.charAt(i2);
        }
        char charAt2 = str.charAt(i2 + 1);
        if (charAt2 == 'V') {
            return i3 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i = 2;
        }
        return (i3 << 2) | i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C203309nl) {
                C203309nl r8 = (C203309nl) obj;
                int i = this.A00;
                int i2 = 10;
                if (i == 12) {
                    i = 10;
                }
                int i3 = r8.A00;
                if (i3 != 12) {
                    i2 = i3;
                }
                if (i == i2) {
                    int i4 = this.A01;
                    int i5 = this.A02;
                    int i6 = r8.A01;
                    if (i5 - i4 == r8.A02 - i6) {
                        while (i4 < i5) {
                            if (this.A03.charAt(i4) == r8.A03.charAt(i6)) {
                                i4++;
                                i6++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public String A06() {
        String str;
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 == 10) {
            str = this.A03;
            i = this.A01 - 1;
            i2 = this.A02 + 1;
        } else if (i3 == 12) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append('L');
            C165577te.A1O(this.A03, A0u, this.A01, this.A02);
            return AnonymousClass000.A0t(A0u, ';');
        } else {
            str = this.A03;
            i = this.A01;
            i2 = this.A02;
        }
        return str.substring(i, i2);
    }

    public int hashCode() {
        int i = this.A00;
        int i2 = i;
        if (i == 12) {
            i2 = 10;
        }
        int i3 = i2 * 13;
        if (i >= 9) {
            int i4 = this.A02;
            for (int i5 = this.A01; i5 < i4; i5++) {
                i3 = (i3 + this.A03.charAt(i5)) * 17;
            }
        }
        return i3;
    }

    public C203309nl(int i, int i2, String str, int i3) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = i3;
    }

    public static String A02(Method method) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append('(');
        for (Class A052 : method.getParameterTypes()) {
            A05(A052, A0u);
        }
        A0u.append(')');
        A05(method.getReturnType(), A0u);
        return A0u.toString();
    }

    public static C203309nl A03(Class cls) {
        if (!cls.isPrimitive()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A05(cls, A0u);
            String obj = A0u.toString();
            return A04(obj, 0, obj.length());
        } else if (cls == Integer.TYPE) {
            return A09;
        } else {
            if (cls == Void.TYPE) {
                return A0C;
            }
            if (cls == Boolean.TYPE) {
                return A04;
            }
            if (cls == Byte.TYPE) {
                return A05;
            }
            if (cls == Character.TYPE) {
                return A06;
            }
            if (cls == Short.TYPE) {
                return A0B;
            }
            if (cls == Double.TYPE) {
                return A07;
            }
            if (cls == Float.TYPE) {
                return A08;
            }
            if (cls == Long.TYPE) {
                return A0A;
            }
            throw new AssertionError();
        }
    }

    public static C203309nl A04(String str, int i, int i2) {
        char charAt = str.charAt(i);
        int i3 = 11;
        if (charAt != '(') {
            if (charAt == 'F') {
                return A08;
            }
            if (charAt == 'L') {
                i3 = 10;
                i++;
                i2--;
            } else if (charAt == 'S') {
                return A0B;
            } else {
                if (charAt == 'V') {
                    return A0C;
                }
                if (charAt == 'I') {
                    return A09;
                }
                if (charAt == 'J') {
                    return A0A;
                }
                if (charAt == 'Z') {
                    return A04;
                }
                if (charAt != '[') {
                    switch (charAt) {
                        case 'B':
                            return A05;
                        case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                            return A06;
                        case 'D':
                            return A07;
                        default:
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("Invalid descriptor: ");
                            throw AnonymousClass000.A0c(str, A0u);
                    }
                } else {
                    i3 = 9;
                }
            }
        }
        return new C203309nl(i3, i, str, i2);
    }

    public static void A05(Class<?> cls, StringBuilder sb) {
        char c;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            sb.append('L');
            sb.append(cls.getName().replace('.', '/'));
            c = ';';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else {
            throw new AssertionError();
        }
        sb.append(c);
    }

    public String toString() {
        return A06();
    }
}
