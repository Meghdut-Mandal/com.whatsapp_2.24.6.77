package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0M8  reason: invalid class name */
public abstract class AnonymousClass0M8 extends AnonymousClass0eZ {
    public static final Map zzb = new ConcurrentHashMap();
    public AnonymousClass0YB zzc = AnonymousClass0YB.A04;

    public static final void A04(StringBuilder sb, int i, String str, Object obj) {
        String A00;
        if (obj instanceof List) {
            for (Object A04 : (List) obj) {
                A04(sb, i, str, A04);
            }
        } else if (obj instanceof Map) {
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                A04(sb, i, str, A0y.next());
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C10960fV r0 = C10960fV.A00;
                A00 = AnonymousClass0QV.A00(new AnonymousClass0M5(((String) obj).getBytes(AnonymousClass0WB.A04)));
            } else if (obj instanceof C10960fV) {
                sb.append(": \"");
                A00 = AnonymousClass0QV.A00((C10960fV) obj);
            } else {
                if (obj instanceof AnonymousClass0M8) {
                    sb.append(" {");
                    A03((AnonymousClass0eZ) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A04(sb, i4, "key", entry.getKey());
                    A04(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A00);
            sb.append('\"');
        }
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null || (cls = getClass()) != obj.getClass()) {
            return false;
        }
        return C07150Wn.A02.A00(cls).Byt(this, obj);
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza = C07150Wn.A02.A00(getClass()).zza(this);
        this.zza = zza;
        return zza;
    }

    public static Object A01(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final String A02(String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                A0u.append("_");
            }
            A0u.append(Character.toLowerCase(charAt));
        }
        return A0u.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:98:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C17630rj r12, java.lang.StringBuilder r13, int r14) {
        /*
            java.util.HashMap r5 = X.AnonymousClass001.A0J()
            java.util.HashMap r4 = X.AnonymousClass001.A0J()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r12.getClass()
            java.lang.reflect.Method[] r7 = r0.getDeclaredMethods()
            int r6 = r7.length
            r3 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r2 = "get"
            if (r1 >= r6) goto L_0x0047
            r9 = r7[r1]
            java.lang.String r0 = r9.getName()
            r4.put(r0, r9)
            java.lang.Class[] r0 = r9.getParameterTypes()
            int r0 = r0.length
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = r9.getName()
            r5.put(r0, r9)
            java.lang.String r0 = r9.getName()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = r9.getName()
            r8.add(r0)
        L_0x0044:
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0047:
            java.util.Iterator r11 = r8.iterator()
        L_0x004b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x01fd
            java.lang.String r8 = X.AnonymousClass001.A0C(r11)
            boolean r0 = r8.startsWith(r2)
            if (r0 == 0) goto L_0x01fa
            r0 = 3
            java.lang.String r6 = r8.substring(r0)
        L_0x0060:
            java.lang.String r1 = "List"
            boolean r0 = r6.endsWith(r1)
            r7 = 1
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r6.endsWith(r0)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = r6.substring(r3, r7)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r6.length()
            int r0 = r0 + -4
            java.lang.String r0 = r6.substring(r7, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r1.concat(r0)
            java.lang.Object r9 = r5.get(r8)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00b7
            java.lang.Class r1 = r9.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r6 = A02(r10)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A01(r9, r12, r0)
        L_0x00b3:
            A04(r13, r14, r6, r0)
            goto L_0x004b
        L_0x00b7:
            java.lang.String r1 = "Map"
            boolean r0 = r6.endsWith(r1)
            if (r0 == 0) goto L_0x0114
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x0114
            java.lang.String r0 = r6.substring(r3, r7)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r0 = r6.length()
            int r0 = r0 + -3
            java.lang.String r0 = r6.substring(r7, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r9 = r1.concat(r0)
            java.lang.Object r1 = r5.get(r8)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x0114
            java.lang.Class r8 = r1.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0114
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r1.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x0114
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)
            if (r0 == 0) goto L_0x0114
            java.lang.String r6 = A02(r9)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A01(r1, r12, r0)
            goto L_0x00b3
        L_0x0114:
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "set"
            java.lang.String r0 = r0.concat(r1)
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "Bytes"
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L_0x0144
            int r0 = r6.length()
            int r0 = r0 + -5
            java.lang.String r0 = r6.substring(r3, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            boolean r0 = r5.containsKey(r0)
            if (r0 != 0) goto L_0x004b
        L_0x0144:
            java.lang.String r0 = r6.substring(r3, r7)
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r6.substring(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = r1.concat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r0 = r2.concat(r0)
            java.lang.Object r7 = r5.get(r0)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r1 = java.lang.String.valueOf(r6)
            java.lang.String r0 = "has"
            java.lang.String r0 = r0.concat(r1)
            java.lang.Object r6 = r5.get(r0)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r7 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r1 = A01(r7, r12, r0)
            if (r6 != 0) goto L_0x01f3
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x0198
            r0 = r1
        L_0x0189:
            boolean r0 = X.AnonymousClass000.A1X(r0)
        L_0x018d:
            if (r0 == 0) goto L_0x004b
        L_0x018f:
            java.lang.String r0 = A02(r10)
            A04(r13, r14, r0, r1)
            goto L_0x004b
        L_0x0198:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x01a1
            int r0 = X.AnonymousClass000.A0I(r1)
            goto L_0x018d
        L_0x01a1:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x01b1
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L_0x018d
        L_0x01b1:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x01c5
            r0 = r1
            java.lang.Number r0 = (java.lang.Number) r0
            double r6 = r0.doubleValue()
            long r8 = java.lang.Double.doubleToRawLongBits(r6)
            r6 = 0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            goto L_0x018d
        L_0x01c5:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x01d2
            java.lang.String r0 = ""
        L_0x01cb:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004b
            goto L_0x018f
        L_0x01d2:
            boolean r0 = r1 instanceof X.C10960fV
            if (r0 == 0) goto L_0x01d9
            X.0fV r0 = X.C10960fV.A00
            goto L_0x01cb
        L_0x01d9:
            boolean r0 = r1 instanceof X.C17630rj
            if (r0 == 0) goto L_0x01e7
            r0 = r1
            X.0qI r0 = (X.C16910qI) r0
            X.0M8 r0 = r0.Bys()
            if (r1 == r0) goto L_0x004b
            goto L_0x018f
        L_0x01e7:
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x018f
            r0 = r1
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            goto L_0x018d
        L_0x01f3:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = A01(r6, r12, r0)
            goto L_0x0189
        L_0x01fa:
            r6 = r8
            goto L_0x0060
        L_0x01fd:
            X.0M8 r12 = (X.AnonymousClass0M8) r12
            X.0YB r3 = r12.zzc
            if (r3 == 0) goto L_0x021c
            r2 = 0
        L_0x0204:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x021c
            int[] r0 = r3.A02
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A03
            r0 = r0[r2]
            A04(r13, r14, r1, r0)
            int r2 = r2 + 1
            goto L_0x0204
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0M8.A03(X.0rj, java.lang.StringBuilder, int):void");
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        A0u.append(obj);
        A03(this, A0u, 0);
        return A0u.toString();
    }

    public final /* synthetic */ AnonymousClass0M8 Bys() {
        return AnonymousClass0M7.zzb;
    }
}
