package X;

/* renamed from: X.0QV  reason: invalid class name */
public abstract class AnonymousClass0QV {
    public static String A00(C10960fV r5) {
        String str;
        StringBuilder sb = new StringBuilder(r5.A02());
        for (int i = 0; i < r5.A02(); i++) {
            int A01 = r5.A01(i);
            if (A01 != 34) {
                if (A01 == 39) {
                    str = "\\'";
                } else if (A01 != 92) {
                    switch (A01) {
                        case 7:
                            str = "\\a";
                            break;
                        case 8:
                            str = "\\b";
                            break;
                        case 9:
                            str = "\\t";
                            break;
                        case 10:
                            str = "\\n";
                            break;
                        case 11:
                            str = "\\v";
                            break;
                        case 12:
                            str = "\\f";
                            break;
                        case 13:
                            str = "\\r";
                            break;
                        default:
                            if (A01 < 32 || A01 > 126) {
                                sb.append('\\');
                                sb.append((char) (((A01 >>> 6) & 3) + 48));
                                sb.append((char) (((A01 >>> 3) & 7) + 48));
                                A01 = (A01 & 7) + 48;
                            }
                            sb.append((char) A01);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                sb.append(str);
            } else {
                str = "\\\"";
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
