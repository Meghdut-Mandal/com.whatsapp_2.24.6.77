package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.8DG  reason: invalid class name */
public abstract class AnonymousClass8DG extends C21012A3a {
    public static Map zzjr = C90524aI.A0s();
    public C201559js zzjp = C201559js.A05;
    public int zzjq = -1;

    public final /* synthetic */ AnonymousClass8DG Bya() {
        return (AnonymousClass8DG) A06(6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!A06(6).getClass().isInstance(obj)) {
            return false;
        }
        return C165597tg.A0J(this).B6j(this, obj);
    }

    public static int A00(B3S b3s, Object obj) {
        C21012A3a a3a = (C21012A3a) obj;
        AnonymousClass8DG r2 = (AnonymousClass8DG) a3a;
        int i = r2.zzjq;
        if (i != -1) {
            return i;
        }
        int Byv = b3s.Byv(a3a);
        r2.zzjq = Byv;
        return Byv;
    }

    public static C201559js A01(Object obj) {
        AnonymousClass8DG r2 = (AnonymousClass8DG) obj;
        C201559js r1 = r2.zzjp;
        if (r1 != C201559js.A05) {
            return r1;
        }
        C201559js r0 = new C201559js();
        r2.zzjp = r0;
        return r0;
    }

    public static final void A05(StringBuilder sb, int i, String str, Object obj) {
        String A03;
        if (obj instanceof List) {
            Iterator A13 = C90514aH.A13(obj);
            while (A13.hasNext()) {
                A05(sb, i, str, A13.next());
            }
        } else if (obj instanceof Map) {
            Iterator A0y = AnonymousClass000.A0y((Map) obj);
            while (A0y.hasNext()) {
                A05(sb, i, str, A0y.next());
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
                AUv aUv = AUv.A00;
                A03 = A03(new AnonymousClass8D2(((String) obj).getBytes(C197079b6.A00)));
            } else if (obj instanceof AUv) {
                sb.append(": \"");
                A03 = A03((AUv) obj);
            } else {
                if (obj instanceof AnonymousClass8DG) {
                    sb.append(" {");
                    A04((C21012A3a) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    A05(sb, i4, "key", entry.getKey());
                    A05(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    C165567td.A1M(obj, ": ", sb);
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(A03);
            sb.append('\"');
        }
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [X.0oO, java.lang.Object, X.9iG] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.0oO, java.lang.Object, X.9iG] */
    /* JADX WARNING: type inference failed for: r3v19, types: [X.0oO, java.lang.Object, X.9iG] */
    /* JADX WARNING: type inference failed for: r3v26, types: [X.0oO, java.lang.Object, X.9iG] */
    public Object A06(int i) {
        ? r3;
        ? r32;
        ? r33;
        ? r34;
        if (this instanceof AnonymousClass8DC) {
            switch (C1905798y.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8DC();
                case 2:
                    return new AnonymousClass8DA();
                case 3:
                    Object[] A0M = AnonymousClass001.A0M();
                    A0M[0] = "zzbiq";
                    A0M[1] = AnonymousClass8DF.class;
                    return new A3W(AnonymousClass8DC.zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", A0M);
                case 4:
                    return AnonymousClass8DC.zzbir;
                case 5:
                    synchronized (AnonymousClass8DC.class) {
                        C200789iF r0 = C200799iG.A01;
                        r34 = new C200799iG(AnonymousClass8DC.zzbir);
                        AnonymousClass8DC.zzbg = r34;
                    }
                    return r34;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else if (this instanceof AnonymousClass8DF) {
            switch (C1905798y.A00[i - 1]) {
                case 1:
                    return new AnonymousClass8DF();
                case 2:
                    return new AnonymousClass8DB();
                case 3:
                    return new A3W(AnonymousClass8DF.zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return AnonymousClass8DF.zzbiv;
                case 5:
                    synchronized (AnonymousClass8DF.class) {
                        C200789iF r02 = C200799iG.A01;
                        r33 = new C200799iG(AnonymousClass8DF.zzbiv);
                        AnonymousClass8DF.zzbg = r33;
                    }
                    return r33;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw AnonymousClass001.A0D();
            }
        } else {
            boolean z = this instanceof AnonymousClass8DD;
            int i2 = C1905698x.A00[i - 1];
            if (z) {
                switch (i2) {
                    case 1:
                        return new AnonymousClass8DD();
                    case 2:
                        return new AnonymousClass8D9();
                    case 3:
                        return new A3W(AnonymousClass8DD.zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", AnonymousClass90E.A00, "zzbfb", AnonymousClass90F.A00});
                    case 4:
                        return AnonymousClass8DD.zzbfc;
                    case 5:
                        synchronized (AnonymousClass8DD.class) {
                            C200789iF r03 = C200799iG.A01;
                            r32 = new C200799iG(AnonymousClass8DD.zzbfc);
                            AnonymousClass8DD.zzbg = r32;
                        }
                        return r32;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw AnonymousClass001.A0D();
                }
            } else {
                switch (i2) {
                    case 1:
                        return new AnonymousClass8DE();
                    case 2:
                        return new AnonymousClass8D8();
                    case 3:
                        return new A3W(AnonymousClass8DE.zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
                    case 4:
                        return AnonymousClass8DE.zztx;
                    case 5:
                        synchronized (AnonymousClass8DE.class) {
                            C200789iF r04 = C200799iG.A01;
                            r3 = new C200799iG(AnonymousClass8DE.zztx);
                            AnonymousClass8DE.zzbg = r3;
                        }
                        return r3;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw AnonymousClass001.A0D();
                }
            }
        }
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int BK8 = C165597tg.A0J(this).BK8(this);
        this.zzex = BK8;
        return BK8;
    }

    public static Object A02(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw C90524aI.A0e("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw C90524aI.A0e("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static String A03(AUv aUv) {
        String str;
        StringBuilder A0h = C90524aI.A0h(aUv.A02());
        for (int i = 0; i < aUv.A02(); i++) {
            int A01 = aUv.A01(i);
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
                                A01 = C165577te.A07(A0h, A01);
                            }
                            A0h.append((char) A01);
                            continue;
                    }
                } else {
                    str = "\\\\";
                }
                A0h.append(str);
            } else {
                str = "\\\"";
                A0h.append(str);
            }
        }
        return A0h.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        if (r2.getReturnType().equals(java.util.List.class) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        r3 = X.AnonymousClass000.A0u();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (r1 >= r8.length()) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
        r3.append(java.lang.Character.toLowerCase(X.C165607th.A00(r8, r3, r1)));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        A05(r14, r15, r3.toString(), A02(r2, r13, new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (X.C165597tg.A1T(r2) != false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C23118B5x r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            java.util.HashMap r6 = X.AnonymousClass001.A0J()
            java.util.TreeSet r8 = new java.util.TreeSet
            r8.<init>()
            java.lang.Class r0 = r13.getClass()
            java.lang.reflect.Method[] r3 = r0.getDeclaredMethods()
            int r2 = r3.length
            r5 = 0
            r1 = 0
        L_0x0018:
            java.lang.String r4 = "get"
            if (r1 >= r2) goto L_0x0024
            r0 = r3[r1]
            X.C165607th.A1O(r0, r8, r6, r7)
            int r1 = r1 + 1
            goto L_0x0018
        L_0x0024:
            java.util.Iterator r12 = r8.iterator()
        L_0x0028:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r10 = X.AnonymousClass001.A0C(r12)
            java.lang.String r1 = ""
            java.lang.String r9 = r10.replaceFirst(r4, r1)
            java.lang.String r2 = "List"
            boolean r0 = r9.endsWith(r2)
            r3 = 1
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "OrBuilderList"
            boolean r0 = r9.endsWith(r0)
            if (r0 != 0) goto L_0x009c
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L_0x009c
            java.lang.String r2 = X.C165597tg.A0m(r9)
            int r0 = r9.length()
            int r0 = r0 + -4
            java.lang.String r0 = r9.substring(r3, r0)
            java.lang.String r8 = X.C90464aC.A0c(r2, r0)
            java.lang.Object r2 = r7.get(r10)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x009c
            java.lang.Class r11 = r2.getReturnType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x009c
        L_0x0075:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r1 = 0
        L_0x007a:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x008e
            char r0 = X.C165607th.A00(r8, r3, r1)
            char r0 = java.lang.Character.toLowerCase(r0)
            r3.append(r0)
            int r1 = r1 + 1
            goto L_0x007a
        L_0x008e:
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r0 = A02(r2, r13, r0)
            A05(r14, r15, r1, r0)
            goto L_0x0028
        L_0x009c:
            java.lang.String r2 = "Map"
            boolean r0 = r9.endsWith(r2)
            if (r0 == 0) goto L_0x00df
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L_0x00df
            java.lang.String r2 = X.C165597tg.A0m(r9)
            int r0 = r9.length()
            int r0 = r0 + -3
            java.lang.String r0 = r9.substring(r3, r0)
            java.lang.String r8 = X.C90464aC.A0c(r2, r0)
            java.lang.Object r2 = r7.get(r10)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L_0x00df
            java.lang.Class r10 = r2.getReturnType()
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.Class<java.lang.Deprecated> r0 = java.lang.Deprecated.class
            boolean r0 = r2.isAnnotationPresent(r0)
            if (r0 != 0) goto L_0x00df
            boolean r0 = X.C165597tg.A1T(r2)
            if (r0 == 0) goto L_0x00df
            goto L_0x0075
        L_0x00df:
            java.lang.String r0 = "set"
            java.lang.String r0 = X.C90464aC.A0c(r0, r9)
            java.lang.Object r0 = r6.get(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = "Bytes"
            boolean r0 = r9.endsWith(r0)
            if (r0 == 0) goto L_0x0107
            int r0 = r9.length()
            int r0 = r0 + -5
            java.lang.String r0 = r9.substring(r5, r0)
            java.lang.String r0 = X.C90464aC.A0c(r4, r0)
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0028
        L_0x0107:
            java.lang.String r2 = X.C165597tg.A0m(r9)
            java.lang.String r0 = r9.substring(r3)
            java.lang.String r8 = X.C90464aC.A0c(r2, r0)
            java.lang.String r0 = X.C90464aC.A0c(r4, r9)
            java.lang.Object r3 = r7.get(r0)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r0 = "has"
            java.lang.String r0 = X.C90464aC.A0c(r0, r9)
            java.lang.Object r2 = r7.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r3 == 0) goto L_0x0028
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r3 = A02(r3, r13, r0)
            if (r2 != 0) goto L_0x018d
            boolean r0 = r3 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x013f
            boolean r2 = X.AnonymousClass000.A1X(r3)
        L_0x013b:
            if (r2 != 0) goto L_0x0199
            goto L_0x0028
        L_0x013f:
            boolean r0 = r3 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x0148
            int r2 = X.AnonymousClass000.A0I(r3)
            goto L_0x013b
        L_0x0148:
            boolean r0 = r3 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0154
            float r1 = X.C36441kJ.A03(r3)
            r0 = 0
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            goto L_0x013b
        L_0x0154:
            boolean r0 = r3 instanceof java.lang.Double
            if (r0 == 0) goto L_0x0161
            double r9 = X.C90504aG.A01(r3)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            goto L_0x013b
        L_0x0161:
            boolean r0 = r3 instanceof java.lang.String
            if (r0 != 0) goto L_0x016b
            boolean r0 = r3 instanceof X.AUv
            if (r0 == 0) goto L_0x0172
            X.AUv r1 = X.AUv.A00
        L_0x016b:
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0199
        L_0x0172:
            boolean r0 = r3 instanceof X.C23118B5x
            if (r0 == 0) goto L_0x0181
            r0 = r3
            X.Axk r0 = (X.C22889Axk) r0
            X.8DG r0 = r0.Bya()
            if (r3 != r0) goto L_0x0199
            goto L_0x0028
        L_0x0181:
            boolean r0 = r3 instanceof java.lang.Enum
            if (r0 == 0) goto L_0x0199
            r0 = r3
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r2 = r0.ordinal()
            goto L_0x013b
        L_0x018d:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.Object r0 = A02(r2, r13, r0)
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 == 0) goto L_0x0028
        L_0x0199:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r1 = 0
        L_0x019e:
            int r0 = r8.length()
            if (r1 >= r0) goto L_0x01b2
            char r0 = X.C165607th.A00(r8, r2, r1)
            char r0 = java.lang.Character.toLowerCase(r0)
            r2.append(r0)
            int r1 = r1 + 1
            goto L_0x019e
        L_0x01b2:
            java.lang.String r0 = r2.toString()
            A05(r14, r15, r0, r3)
            goto L_0x0028
        L_0x01bb:
            X.8DG r13 = (X.AnonymousClass8DG) r13
            X.9js r3 = r13.zzjp
            if (r3 == 0) goto L_0x01da
            r2 = 0
        L_0x01c2:
            int r0 = r3.A00
            if (r2 >= r0) goto L_0x01da
            int[] r0 = r3.A03
            r0 = r0[r2]
            int r0 = r0 >>> 3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.Object[] r0 = r3.A04
            r0 = r0[r2]
            A05(r14, r15, r1, r0)
            int r2 = r2 + 1
            goto L_0x01c2
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8DG.A04(X.B5x, java.lang.StringBuilder, int):void");
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("# ");
        A0u.append(obj);
        A04(this, A0u, 0);
        return A0u.toString();
    }
}
