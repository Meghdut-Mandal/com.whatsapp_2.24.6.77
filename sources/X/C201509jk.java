package X;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: X.9jk  reason: invalid class name and case insensitive filesystem */
public abstract class C201509jk {
    public volatile int A00 = -1;

    public C201509jk A02() {
        return (C201509jk) super.clone();
    }

    public void A03(C202569mD r12) {
        AnonymousClass8DQ r2 = (AnonymousClass8DQ) this;
        long j = r2.A01;
        if (j != 0) {
            C202569mD.A01(r12, 8);
            r12.A04(j);
        }
        AnonymousClass8DP[] r0 = r2.A0B;
        int i = 0;
        if (r0 != null && r0.length > 0) {
            int i2 = 0;
            while (true) {
                AnonymousClass8DP[] r1 = r2.A0B;
                if (i2 >= r1.length) {
                    break;
                }
                AnonymousClass8DP r13 = r1[i2];
                if (r13 != null) {
                    C202569mD.A01(r12, 26);
                    if (r13.A00 < 0) {
                        r13.A00 = r13.A04();
                    }
                    C202569mD.A02(r12, r13.A00);
                    r13.A03(r12);
                }
                i2++;
            }
        }
        byte[] bArr = r2.A07;
        byte[] bArr2 = AnonymousClass9AU.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            r12.A03(4, bArr);
        }
        if (!Arrays.equals(r2.A08, bArr2)) {
            r12.A03(6, r2.A08);
        }
        AnonymousClass8DE r14 = r2.A04;
        if (r14 != null) {
            r12.A05(r14, 9);
        }
        int i3 = r2.A00;
        if (i3 != 0) {
            C202569mD.A01(r12, 88);
            C202569mD.A02(r12, i3);
        }
        long j2 = r2.A03;
        if (j2 != 180000) {
            C202569mD.A01(r12, 120);
            r12.A04(C165567td.A05(j2));
        }
        long j3 = r2.A02;
        if (j3 != 0) {
            C202569mD.A02(r12, 136);
            r12.A04(j3);
        }
        byte[] bArr3 = r2.A09;
        if (!Arrays.equals(bArr3, bArr2)) {
            r12.A03(18, bArr3);
        }
        int[] iArr = r2.A0A;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = r2.A0A;
                if (i >= iArr2.length) {
                    break;
                }
                int i4 = iArr2[i];
                C202569mD.A02(r12, 160);
                if (i4 >= 0) {
                    C202569mD.A02(r12, i4);
                } else {
                    r12.A04((long) i4);
                }
                i++;
            }
        }
        AnonymousClass8DD r15 = r2.A05;
        if (r15 != null) {
            r12.A05(r15, 23);
        }
        if (r2.A06) {
            C202569mD.A02(r12, 200);
            byte b = (byte) 1;
            ByteBuffer byteBuffer = r12.A02;
            if (byteBuffer.hasRemaining()) {
                byteBuffer.put(b);
                return;
            }
            throw new C187248xV(byteBuffer.position(), byteBuffer.limit());
        }
    }

    public /* synthetic */ Object clone() {
        throw null;
    }

    public static void A01(Object obj, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        String str2;
        String str3;
        if (obj != null) {
            if (obj instanceof C201509jk) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(A00(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                            A01(obj2, name, stringBuffer, stringBuffer2);
                        } else if (obj2 != null) {
                            int length2 = Array.getLength(obj2);
                            for (int i = 0; i < length2; i++) {
                                A01(Array.get(obj2, i), name, stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        String substring = name3.substring(3);
                        try {
                            if (AnonymousClass000.A1X(AnonymousClass000.A0h(cls, obj, C90464aC.A0c("has", substring)))) {
                                A01(AnonymousClass000.A0h(cls, obj, C90464aC.A0c("get", substring)), substring, stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    str2 = ">\n";
                } else {
                    return;
                }
            } else {
                String A002 = A00(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(A002);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str4 = (String) obj;
                    if (!str4.startsWith("http") && str4.length() > 200) {
                        str4 = String.valueOf(str4.substring(0, 200)).concat("[...]");
                    }
                    int length3 = str4.length();
                    StringBuilder A0h = C90524aI.A0h(length3);
                    for (int i2 = 0; i2 < length3; i2++) {
                        char charAt = str4.charAt(i2);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            Object[] objArr = new Object[1];
                            AnonymousClass000.A1L(objArr, charAt, 0);
                            A0h.append(String.format("\\u%04x", objArr));
                        } else {
                            A0h.append(charAt);
                        }
                    }
                    String obj3 = A0h.toString();
                    str3 = "\"";
                    stringBuffer2.append(str3);
                    stringBuffer2.append(obj3);
                } else {
                    if (obj instanceof byte[]) {
                        byte[] bArr = (byte[]) obj;
                        if (bArr == null) {
                            str3 = "\"\"";
                        } else {
                            stringBuffer2.append('\"');
                            for (byte b : bArr) {
                                byte b2 = b & 255;
                                if (b2 == 92 || b2 == 34) {
                                    stringBuffer2.append('\\');
                                } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                                    Object[] objArr2 = new Object[1];
                                    AnonymousClass000.A1L(objArr2, b2, 0);
                                    stringBuffer2.append(String.format("\\%03o", objArr2));
                                }
                                stringBuffer2.append((char) b2);
                            }
                            stringBuffer2.append('\"');
                        }
                    } else {
                        stringBuffer2.append(obj);
                    }
                    str2 = "\n";
                }
                stringBuffer2.append(str3);
                str2 = "\n";
            }
            stringBuffer2.append(str2);
        }
    }

    public String toString() {
        StringBuffer A0x = C165607th.A0x();
        try {
            A01(this, (String) null, C165607th.A0x(), A0x);
            return A0x.toString();
        } catch (IllegalAccessException | InvocationTargetException e) {
            return C90464aC.A0c("Error printing proto: ", e.getMessage());
        }
    }

    public static String A00(String str) {
        StringBuffer A0x = C165607th.A0x();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    A0x.append('_');
                } else {
                    A0x.append(charAt);
                }
            }
            charAt = Character.toLowerCase(charAt);
            A0x.append(charAt);
        }
        return A0x.toString();
    }
}
