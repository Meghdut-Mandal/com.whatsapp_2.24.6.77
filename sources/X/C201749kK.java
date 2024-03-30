package X;

import java.io.StringWriter;
import java.util.Iterator;

/* renamed from: X.9kK  reason: invalid class name and case insensitive filesystem */
public abstract class C201749kK {
    public static String A02(CharSequence... charSequenceArr) {
        int i = 0;
        int i2 = -1;
        for (int i3 = 0; i3 < r8; i3++) {
            int length = charSequenceArr[i3].length();
            i += length;
            if (i2 != -2 && length > 0) {
                int i4 = i2;
                i2 = -2;
                if (i4 == -1) {
                    i2 = i3;
                }
            }
        }
        if (i == 0) {
            return "";
        }
        if (i2 > 0) {
            return charSequenceArr[i2].toString();
        }
        StringBuilder A0h = C90524aI.A0h(i);
        for (CharSequence append : charSequenceArr) {
            A0h.append(append);
        }
        return A0h.toString();
    }

    public static String A01(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringWriter stringWriter = new StringWriter(length);
        StringBuilder A0h = C90524aI.A0h(4);
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (z2) {
                A0h.append(charAt);
                if (A0h.length() == 4) {
                    try {
                        stringWriter.write((char) Integer.parseInt(A0h.toString(), 16));
                        A0h.setLength(0);
                        z = false;
                        z2 = false;
                    } catch (NumberFormatException e) {
                        throw new C21831Ab9(AnonymousClass000.A0l(A0h, "Unable to parse unicode value: ", AnonymousClass000.A0u()), e);
                    }
                }
            } else if (z) {
                int i2 = 34;
                if (charAt != '\"') {
                    i2 = 39;
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            i2 = 8;
                            if (charAt != 'b') {
                                i2 = 12;
                                if (charAt != 'f') {
                                    i2 = 10;
                                    if (charAt != 'n') {
                                        i2 = 13;
                                        if (charAt != 'r') {
                                            i2 = 9;
                                            if (charAt != 't') {
                                                if (charAt != 'u') {
                                                    stringWriter.write(charAt);
                                                } else {
                                                    z = false;
                                                    z2 = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            stringWriter.write(92);
                        }
                        z = false;
                    }
                }
                stringWriter.write(i2);
                z = false;
            } else if (charAt == '\\') {
                z = true;
            } else {
                stringWriter.write(charAt);
            }
        }
        if (z) {
            stringWriter.write(92);
        }
        return stringWriter.toString();
    }

    public static void A03(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass001.A08(str);
        }
    }

    public static String A00(Iterable iterable, String str, String str2) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        while (true) {
            A0u.append(str2);
            A0u.append(it.next());
            A0u.append(str2);
            if (!it.hasNext()) {
                return A0u.toString();
            }
            A0u.append(str);
        }
    }
}
