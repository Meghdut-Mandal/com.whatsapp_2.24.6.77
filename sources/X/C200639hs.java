package X;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.9hs  reason: invalid class name and case insensitive filesystem */
public abstract class C200639hs {
    public static final char[] A00;

    static {
        char[] cArr = new char[80];
        A00 = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void A00(B63 b63, StringBuilder sb, int i) {
        int i2;
        StringBuilder sb2;
        int i3;
        int ordinal;
        Object obj;
        boolean equals;
        Method method;
        String substring;
        B63 b632 = b63;
        HashSet A16 = C36441kJ.A16();
        HashMap A0J = AnonymousClass001.A0J();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = b632.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method2 = declaredMethods[i4];
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getName().length() >= 3) {
                if (method2.getName().startsWith("set")) {
                    A16.add(method2.getName());
                } else if (C165597tg.A1T(method2) && method2.getParameterTypes().length == 0) {
                    C165607th.A1P(method2, A0J, treeMap);
                }
            }
            i4++;
        }
        Iterator A10 = C36371kC.A10(treeMap);
        while (true) {
            sb2 = sb;
            i3 = i;
            if (!A10.hasNext()) {
                break;
            }
            Map.Entry A11 = AnonymousClass000.A11(A10);
            String substring2 = C90494aF.A0f(A11).substring(i2);
            if (substring2.endsWith("List") && !substring2.endsWith("OrBuilderList") && !substring2.equals("List") && (method = (Method) A11.getValue()) != null && method.getReturnType().equals(List.class)) {
                substring = substring2.substring(0, substring2.length() - 4);
            } else if (!substring2.endsWith("Map") || substring2.equals("Map") || (method = (Method) A11.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !C165597tg.A1T(method)) {
                if (A16.contains(C36321k7.A0D("set", substring2))) {
                    if (substring2.endsWith("Bytes")) {
                        StringBuilder A0v = AnonymousClass000.A0v("get");
                        C165577te.A1O(substring2, A0v, 0, substring2.length() - 5);
                        if (treeMap.containsKey(A0v.toString())) {
                        }
                    }
                    Method method3 = (Method) A11.getValue();
                    Method method4 = (Method) A0J.get(C36321k7.A0D("has", substring2));
                    if (method3 != null) {
                        Object A0T = C170918Hz.A0T(method3, b632, new Object[0]);
                        if (method4 == null) {
                            if (A0T instanceof Boolean) {
                                equals = !AnonymousClass000.A1X(A0T);
                            } else {
                                if (A0T instanceof Integer) {
                                    ordinal = AnonymousClass000.A0I(A0T);
                                } else if (A0T instanceof Float) {
                                    ordinal = Float.floatToRawIntBits(C36441kJ.A03(A0T));
                                } else if (A0T instanceof Double) {
                                    ordinal = (Double.doubleToRawLongBits(C90504aG.A01(A0T)) > 0 ? 1 : (Double.doubleToRawLongBits(C90504aG.A01(A0T)) == 0 ? 0 : -1));
                                } else {
                                    if (A0T instanceof String) {
                                        obj = "";
                                    } else if (A0T instanceof C21674AUx) {
                                        obj = C21674AUx.A00;
                                    } else if (A0T instanceof B63) {
                                        if (A0T == ((C22901AyD) A0T).BAu()) {
                                        }
                                    } else if (A0T instanceof Enum) {
                                        ordinal = ((Enum) A0T).ordinal();
                                    }
                                    equals = A0T.equals(obj);
                                }
                                if (ordinal == 0) {
                                }
                            }
                            if (equals) {
                            }
                        } else if (!AnonymousClass000.A1X(C170918Hz.A0T(method4, b632, new Object[0]))) {
                        }
                        A01(sb2, i3, substring2, A0T);
                    }
                }
                i2 = 3;
            } else {
                substring = substring2.substring(0, substring2.length() - 3);
            }
            A01(sb2, i3, substring, C170918Hz.A0T(method, b632, new Object[0]));
            i2 = 3;
        }
        C202229lJ r3 = ((C170918Hz) b632).unknownFields;
        if (r3 != null) {
            for (int i5 = 0; i5 < r3.count; i5++) {
                A01(sb2, i3, String.valueOf(r3.A02[i5] >>> 3), r3.A03[i5]);
            }
        }
    }

    public static void A01(StringBuilder sb, int i, String str, Object obj) {
        String A002;
        if (obj instanceof List) {
            Iterator A13 = C90514aH.A13(obj);
            while (A13.hasNext()) {
                A01(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                A01(sb, i, str, A0y.next());
            }
        } else {
            sb.append(10);
            int i2 = i;
            while (i2 > 0) {
                char[] cArr = A00;
                int i3 = 80;
                if (i2 <= 80) {
                    i3 = i2;
                }
                sb.append(cArr, 0, i3);
                i2 -= i3;
            }
            if (!str.isEmpty()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append(Character.toLowerCase(C165597tg.A00(str)));
                for (int i4 = 1; i4 < str.length(); i4++) {
                    A0u.append(Character.toLowerCase(C165607th.A00(str, A0u, i4)));
                }
                str = A0u.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C22898AyA ayA = C21674AUx.A01;
                A002 = C1898295t.A00(new AnonymousClass8I5(((String) obj).getBytes(AnonymousClass9BD.A04)));
            } else if (obj instanceof C21674AUx) {
                sb.append(": \"");
                A002 = C1898295t.A00((C21674AUx) obj);
            } else {
                if (obj instanceof C170918Hz) {
                    sb.append(" {");
                    A00((C21070A7h) obj, sb, i + 2);
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i5 = i + 2;
                    A01(sb, i5, "key", entry.getKey());
                    A01(sb, i5, "value", entry.getValue());
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("\n");
                while (i > 0) {
                    char[] cArr2 = A00;
                    int i6 = 80;
                    if (i <= 80) {
                        i6 = i;
                    }
                    sb.append(cArr2, 0, i6);
                    i -= i6;
                }
                sb.append("}");
                return;
            }
            sb.append(A002);
            sb.append('\"');
        }
    }
}
