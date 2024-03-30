package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.util.SparseArray;
import com.whatsapp.R;
import com.whatsapp.bloks.components.BkCdsBottomSheetFragment;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6oh  reason: invalid class name and case insensitive filesystem */
public class C142326oh implements AnonymousClass7fJ {
    public final AnonymousClass7fJ A00 = new C142316og();
    public final AnonymousClass6VK A01;

    private AlertDialog.Builder A02(C1271967i r11, C100674vP r12, C140456lc r13) {
        C100674vP r6 = r12;
        AlertDialog.Builder message = new AlertDialog.Builder(A01(r12)).setTitle(C140456lc.A0M(r13)).setMessage(C140456lc.A0J(r13));
        C140456lc A0W = r13.A0W(36);
        C1271967i r5 = r11;
        if (A0W != null) {
            message.setPositiveButton(A0W.A0a(36, ""), new C163257pu(r5, r6, A0W, this, 0));
        }
        C140456lc A0W2 = r13.A0W(38);
        if (A0W2 != null) {
            message.setNegativeButton(A0W2.A0a(36, ""), new C163257pu(r5, r6, A0W2, this, 1));
        }
        C140456lc A0W3 = r13.A0W(44);
        if (A0W3 != null) {
            message.setNeutralButton(A0W3.A0a(36, ""), new C163257pu(r5, r6, A0W3, this, 2));
        }
        return message;
    }

    private Object A05(C100674vP r16, AnonymousClass6MO r17, boolean z) {
        C164197rQ A002;
        C164197rQ A003;
        List list = r17.A00;
        String A0s = C36401kF.A0s(list, 0);
        Map A0k = C90494aF.A0k(list, 1);
        C160377ku A012 = AnonymousClass6JJ.A01(list, 2);
        C160377ku A013 = AnonymousClass6JJ.A01(list, 3);
        AnonymousClass6VK r3 = this.A01;
        HashMap A08 = A08(A0k);
        if (z) {
            A002 = C164197rQ.A00(A012, 22);
            A003 = C164197rQ.A00(A013, 23);
            A08.put("nest_data_manifest", "true");
        } else {
            A002 = C164197rQ.A00(A012, 24);
            A003 = C164197rQ.A00(A013, 25);
        }
        C120305rI r12 = (C120305rI) r3.A07.get();
        r12.A00.A04((C134906bn) null, new C163787ql(r16, A003, r12, A002, 1), (Boolean) null, A0s, C90504aG.A0l("params", A08), (String) null, true);
        return null;
    }

    public static HashMap A09(Map map) {
        String obj;
        String obj2;
        String obj3;
        if (map == null) {
            return null;
        }
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            Object value = A11.getValue();
            Object key = A11.getKey();
            boolean z = key instanceof Number;
            if (value == null) {
                if (z || key != null) {
                    obj3 = key.toString();
                } else {
                    obj3 = null;
                }
                A0J.put(obj3, (Object) null);
            } else {
                if (z || key != null) {
                    obj = key.toString();
                } else {
                    obj = null;
                }
                Object value2 = A11.getValue();
                if ((value2 instanceof Number) || value2 != null) {
                    obj2 = value2.toString();
                } else {
                    obj2 = null;
                }
                A0J.put(obj, obj2);
            }
        }
        return A0J;
    }

    public static final int A00(C140456lc r2) {
        if (r2 == null) {
            return 32;
        }
        String A0a = r2.A0a(38, "adjust_pan");
        switch (A0a.hashCode()) {
            case -1009740956:
                if (A0a.equals("adjust_resize")) {
                    return 16;
                }
                break;
            case -205076707:
                if (A0a.equals("adjust_nothing")) {
                    return 48;
                }
                break;
            case 1976678381:
                if (A0a.equals("adjust_pan")) {
                    return 32;
                }
                break;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Unexpected soft input mode ");
        A0u.append(A0a);
        AnonymousClass6RS.A01("WindowSoftInputUtils", AnonymousClass000.A0q("; using default instead", A0u));
        return 32;
    }

    public static Activity A01(C100674vP r1) {
        return (Activity) r1.A00.A02.A00().get(R.id.bloks_host_activity);
    }

    public static C100674vP A03(Object obj) {
        if (obj instanceof C100674vP) {
            return (C100674vP) obj;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(obj, A0u);
        A0u.append("is not an instance of ");
        throw AnonymousClass000.A0g("BloksInterpreterEnvironment", A0u);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C140456lc A04(X.C140456lc r4) {
        /*
            r3 = 15932(0x3e3c, float:2.2325E-41)
            int r1 = r4.A04
            r0 = 13784(0x35d8, float:1.9315E-41)
            if (r1 != r0) goto L_0x0027
            r0 = 42
            java.lang.Object r1 = X.C140456lc.A0I(r4, r0)
            boolean r0 = r1 instanceof java.util.List
            if (r0 == 0) goto L_0x0027
            java.util.List r1 = (java.util.List) r1
        L_0x0014:
            java.util.Iterator r2 = r1.iterator()
        L_0x0018:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            X.6lc r1 = X.C90514aH.A0Y(r2)
            int r0 = r1.A04
            if (r0 != r3) goto L_0x0018
            return r1
        L_0x0027:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x0014
        L_0x002c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142326oh.A04(X.6lc):X.6lc");
    }

    public static Object A06(List list) {
        Object A06;
        Class<BkCdsBottomSheetFragment> cls = BkCdsBottomSheetFragment.class;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            AnonymousClass02E r1 = (AnonymousClass02E) list.get(size);
            if (cls.isInstance(r1)) {
                return cls.cast(r1);
            }
            A06 = A06(r1.A0k().A0T.A04());
        } while (A06 == null);
        return A06;
    }

    public static String A07(C140456lc r4) {
        String str;
        List emptyList;
        int i = r4.A04;
        if (!AnonymousClass000.A1S(i, 13647)) {
            if (i == 13784) {
                Object A0I = C140456lc.A0I(r4, 42);
                if (A0I instanceof List) {
                    emptyList = (List) A0I;
                } else {
                    emptyList = Collections.emptyList();
                }
                Iterator it = emptyList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C140456lc A0Y = C90514aH.A0Y(it);
                    if (A0Y.A04 == 15855) {
                        str = C140456lc.A0M(A0Y);
                        break;
                    }
                }
                Objects.requireNonNull(str);
                return str;
            }
            throw AnonymousClass001.A08("screen should be an instance of BloksScreenData or BloksScreenV2Data");
        }
        str = (String) C140456lc.A0I(r4, 35);
        Objects.requireNonNull(str);
        return str;
    }

    public C142326oh(AnonymousClass6VK r2) {
        this.A01 = r2;
    }

    public static HashMap A08(Map map) {
        String obj;
        HashMap A0J = AnonymousClass001.A0J();
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A11 = AnonymousClass000.A11(A0y);
            boolean z = A11.getValue() instanceof Number;
            Object key = A11.getKey();
            if (z || A11.getValue() != null) {
                obj = A11.getValue().toString();
            } else {
                obj = null;
            }
            A0J.put(key, obj);
        }
        return A0J;
    }

    public static void A0B(AnonymousClass65A r5, C158077fl r6) {
        C160377ku B7y = r6.B7y();
        AnonymousClass6JI.A00(C100674vP.A00(C133266Xn.A00(AnonymousClass6NR.A00().A00, new SparseArray(), (AnonymousClass6WZ) null, r5, (String) null), B7y, (List) null), AnonymousClass6MO.A01, B7y);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v205, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v232, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r2v204 */
    /* JADX WARNING: type inference failed for: r2v236 */
    /* JADX WARNING: type inference failed for: r2v239, types: [X.7ku] */
    /* JADX WARNING: type inference failed for: r2v243, types: [X.7fl] */
    /* JADX WARNING: type inference failed for: r2v245, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v257 */
    /* JADX WARNING: type inference failed for: r2v258 */
    /* JADX WARNING: type inference failed for: r2v259 */
    /* JADX WARNING: type inference failed for: r2v260 */
    /* JADX WARNING: type inference failed for: r2v261 */
    /* JADX WARNING: type inference failed for: r2v262 */
    /* JADX WARNING: type inference failed for: r2v263 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:1001:0x1b8e, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x1b98;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1002:0x1b90, code lost:
        r4.addPointData(r3, X.AnonymousClass000.A1X(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1004:0x1b9a, code lost:
        if ((r1 instanceof int[]) == false) goto L_0x1ba2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1005:0x1b9c, code lost:
        r4.addPointData(r3, (int[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1007:0x1ba4, code lost:
        if ((r1 instanceof long[]) == false) goto L_0x1bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1008:0x1ba6, code lost:
        r4.addPointData(r3, (long[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02b7, code lost:
        r0 = "v";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1010:0x1bae, code lost:
        if ((r1 instanceof java.lang.String[]) == false) goto L_0x1bb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1011:0x1bb0, code lost:
        r4.addPointData(r3, (java.lang.String[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1013:0x1bb8, code lost:
        if ((r1 instanceof double[]) == false) goto L_0x1bc0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1014:0x1bba, code lost:
        r4.addPointData(r3, (double[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1016:0x1bc2, code lost:
        if ((r1 instanceof float[]) == false) goto L_0x1bcb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1017:0x1bc4, code lost:
        r4.addPointData(r3, (float[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1019:0x1bcd, code lost:
        if ((r1 instanceof boolean[]) == false) goto L_0x1bd6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1020:0x1bcf, code lost:
        r4.addPointData(r3, (boolean[]) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1021:0x1bd6, code lost:
        if (r1 == null) goto L_0x1b40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1022:0x1bd8, code lost:
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1023:0x1bde, code lost:
        r4.pointEditingCompleted();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1024:0x1be1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1025:0x1be2, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1026:0x1be5, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1027:0x1be7, code lost:
        r0.markerEnd(r8, r9, 87);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1028:0x1bea, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bd, code lost:
        if (r4.equals(r0) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1030:?, code lost:
        r1.setPrimaryClip(android.content.ClipData.newPlainText(r3, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1031:0x1bf2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1032:0x1bf3, code lost:
        com.whatsapp.util.Log.e("bkinterpreter/clipboard/");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1034:0x1bf8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1035:0x1bf9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1036:0x1bfa, code lost:
        r0 = "Error during annotations map parse";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1037:0x1bfd, code lost:
        r15.A00.A01(r3).A02(new X.AnonymousClass702(r4.A00()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1038:0x1c0f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1041:0x1c20, code lost:
        return java.lang.Boolean.toString(((X.C20800yB) r15.A04.get()).A0E(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1043:0x1c31, code lost:
        return java.lang.Integer.toString(((X.C20800yB) r15.A04.get()).A07(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1045:0x1c3e, code lost:
        return ((X.C20800yB) r15.A04.get()).A09(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1046:0x1c3f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1047:0x1c40, code lost:
        r0 = "Bloks: WaBkGlobalInterpreterExtImpl/getAbPropValue/exception";
        r2 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1048:0x1c42, code lost:
        com.whatsapp.util.Log.e(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1049:0x1c45, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c6, code lost:
        if (r4.equals("w") == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1050:0x1c46, code lost:
        return "0";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02c8, code lost:
        com.whatsapp.util.Log.w(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02cb, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1070:0x0f1c, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02cc, code lost:
        r0 = r11.A00;
        r11 = X.C36351kA.A06(r0, 0);
        r5 = X.C36351kA.A06(r0, 1);
        r10 = X.C36401kF.A0s(r0, 2);
        r4 = r15.A03;
        r0 = r4.A00;
        r9 = X.AnonymousClass61J.A00(r0, r5, r11);
        r7 = X.C122885va.A00(r0, r11);
        r6 = r4.A01;
        r6.get();
        r4 = X.C90474aD.A0A(r9, r7);
        r0 = X.C122885va.A01(r6, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02f3, code lost:
        if (1 != r0) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1093:?, code lost:
        return r9.A00.B6u(r11, r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1094:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1095:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1096:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1097:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1098:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1099:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02f5, code lost:
        r0 = X.C90514aH.A0h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        r3 = r0.A00;
        r0 = r11.A00;
        r5 = X.C36401kF.A0s(r0, 0);
        r0.get(1);
        r0 = r3.A00;
        X.AnonymousClass00C.A0D(r0, 0);
        X.AnonymousClass00C.A0D(r5, 1);
        r7 = X.C129306Gj.A01(X.C129306Gj.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1100:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1101:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1102:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1103:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1104:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1105:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1106:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1107:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1108:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1109:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f9, code lost:
        if (r10 == null) goto L_0x1b16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1110:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1111:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1112:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1113:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1114:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1115:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1116:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1117:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1118:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1119:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fb, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1120:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1121:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1122:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1123:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1124:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1125:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1126:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1127:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1128:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1129:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02fd, code lost:
        r0.flowEndCancel(r4, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1130:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1131:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1132:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1133:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1134:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1135:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1136:?, code lost:
        return "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1137:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1138:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1139:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0300, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0301, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0303, code lost:
        r0 = X.C90514aH.A0h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0307, code lost:
        if (r10 == null) goto L_0x1b13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0309, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x030c, code lost:
        r0 = r11.A00;
        r5 = X.C36351kA.A06(r0, 0);
        r8 = X.C36351kA.A06(r0, 1);
        r6 = X.C36401kF.A0s(r0, 2);
        r0 = X.C90494aF.A0k(r0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x031e, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005c, code lost:
        if (r7 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0320, code lost:
        r7 = X.AnonymousClass001.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0324, code lost:
        if (r0 == null) goto L_0x1b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0326, code lost:
        r4 = X.AnonymousClass000.A0y(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x032e, code lost:
        if (r4.hasNext() == false) goto L_0x1b1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0330, code lost:
        r3 = X.AnonymousClass000.A11(r4);
        r7.put(r3.getKey().toString(), r3.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0344, code lost:
        r0 = r11.A00;
        r7 = X.C36351kA.A06(r0, 0);
        r4 = X.C36351kA.A06(r0, 1);
        r5 = r15.A03;
        r0 = r5.A00;
        r4 = X.AnonymousClass61J.A00(r0, r4, r7);
        r0 = X.C122885va.A00(r0, r7);
        r6 = r5.A01;
        r6.get();
        r4 = X.C90474aD.A0A(r4, r0);
        r0 = X.C122885va.A01(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0367, code lost:
        if (1 != r0) goto L_0x0373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0369, code lost:
        r0 = X.C90514aH.A0h(r6).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x036f, code lost:
        r0.flowEndSuccess(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0372, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0373, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0375, code lost:
        r0 = X.C90514aH.A0h(r6).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x037c, code lost:
        r4 = X.AnonymousClass6MO.A02(r11, 0);
        r5 = A01(r0);
        r0 = ((X.AnonymousClass1EU) r15.A0T.get()).A05().BA6();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0394, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0396, code lost:
        r3 = X.C36441kJ.A0H(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03a4, code lost:
        if (r0.getName().equals("com.whatsapp.support.DescribeProblemActivity") == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03a6, code lost:
        r3.putExtra("com.whatsapp.support.DescribeProblemActivity.from", "payments:transaction");
        r3.putExtra("com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03b2, code lost:
        r3.putExtra("extra_transaction_id", r4);
        r5.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03ba, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        if (r7.isEmpty() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03bb, code lost:
        r4 = r11.A00;
        r5 = X.C90504aG.A0K(r4, 0);
        r13 = (X.AnonymousClass6XK) r4.get(1);
        r10 = X.C90504aG.A0K(r4, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03cb, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03cd, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03cf, code lost:
        if (r10 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03d1, code lost:
        r9 = (java.lang.String) X.C140456lc.A0I(r5, 43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d9, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03db, code lost:
        r16 = X.C140456lc.A0L(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03df, code lost:
        if (r16 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03e1, code lost:
        r8 = r5.A0T(40, -1);
        r6 = X.C140456lc.A0E(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ec, code lost:
        if (r6 == null) goto L_0x043c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        r6 = X.AnonymousClass001.A0I();
        r0 = X.C36431kI.A07(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03ee, code lost:
        r6 = (java.util.Map) X.AnonymousClass6JI.A00(r0, X.C1273868b.A05(X.C1273868b.A00(), r0.A00, 0), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03fe, code lost:
        r4 = r0.A00;
        r10 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A05(X.C133016Wg.A01(r4, (X.C100674vP) null, r10), r9);
        r10.A00 = r4.A02;
        r3 = new X.C123615wn();
        r3.A01 = r9;
        r3.A00 = r8;
        r3.A04 = r6;
        r3.A05 = true;
        r12 = new X.C139046j9(r3);
        r3 = new X.C121315sw();
        r3.A01 = r13;
        r3.A00 = r0;
        X.C132876Vp.A02(r10, (X.AnonymousClass01I) A01(r0), r12, r13, new X.C142086oJ(r3), (X.AnonymousClass7fM) null, r16, A00(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x043b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x043c, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x043e, code lost:
        r1 = X.AnonymousClass6VK.A01(A08(X.C90494aF.A0k(r11.A00, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0450, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0452, code lost:
        ((X.C119095pE) r15.A0E.get()).A01.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x045f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0460, code lost:
        r0 = r11.A00;
        r3 = X.C90494aF.A0k(r0, 0);
        r1 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x046a, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        if (r0 < 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0470, code lost:
        if (r3.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0472, code lost:
        r0 = "properties";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0475, code lost:
        r4 = r11.A00;
        r3 = X.C90494aF.A0k(r4, 0);
        r1 = X.AnonymousClass6JJ.A02(r0, r4, 1);
        r6 = X.AnonymousClass6VK.A01(A08(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x048b, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x048d, code lost:
        r5 = (X.C119095pE) r15.A0E.get();
        r5.A01.put(r6, new X.AnonymousClass6C8(r1.A00, r1.A01, r5.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04a6, code lost:
        r4 = r11.A00;
        r4.get(0);
        r4.get(1);
        r4.get(2);
        r3 = A01(r0);
        r1 = r15.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04bb, code lost:
        if (r1.get() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04bd, code lost:
        r1.get();
        r3.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        r4 = r0 - 1;
        r3 = (X.AnonymousClass02E) r7.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04c3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04c4, code lost:
        r0 = r11.A00;
        r3 = X.C90494aF.A0k(r0, 0);
        r1 = r0.get(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04ce, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x04d4, code lost:
        if (r3.size() <= 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04d6, code lost:
        r0 = "children";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04d8, code lost:
        r0 = X.C90514aH.A15(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04dc, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04de, code lost:
        r0 = r0.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04e2, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0078, code lost:
        if ((r3 instanceof com.whatsapp.bloks.components.BkCdsBottomSheetFragment) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04e4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04e5, code lost:
        r0 = r11.A00;
        r9 = X.C36351kA.A06(r0, 0);
        r10 = X.C36351kA.A06(r0, 1);
        r5 = (X.C140456lc) new X.C164927sb(r0.get(2), 0).A00;
        r7 = "cancel".equals(X.C140456lc.A0J(r5));
        r8 = (java.lang.String) X.C140456lc.A0I(r5, 36);
        r5.A0T(38, -1);
        r5 = r15.A03;
        r0 = r5.A00;
        r4 = X.AnonymousClass61J.A00(r0, r10, r9);
        r0 = X.C122885va.A00(r0, r9);
        r6 = r5.A01;
        r6.get();
        r4 = X.C90474aD.A0A(r4, r0);
        r0 = X.C122885va.A01(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x052b, code lost:
        if (1 != r0) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x052d, code lost:
        r1 = X.C90514aH.A0h(r6).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0533, code lost:
        r1.B7S(new X.AnonymousClass66V(r8, r7), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x053b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x053c, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x053e, code lost:
        r1 = X.C90514aH.A0h(r6).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0545, code lost:
        r0 = r11.A00;
        r6 = X.C36351kA.A06(r0, 0);
        r5 = X.C36351kA.A06(r0, 1);
        r10 = X.C36401kF.A0s(r0, 2);
        r11 = X.C36401kF.A0s(r0, 3);
        r4 = r15.A03;
        r0 = r4.A00;
        r9 = X.AnonymousClass61J.A00(r0, r5, r6);
        r8 = X.C122885va.A00(r0, r6);
        r7 = r4.A01;
        r7.get();
        r4 = X.C90474aD.A0A(r9, r8);
        r0 = X.C122885va.A01(r7, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0572, code lost:
        if (1 != r0) goto L_0x0580;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0574, code lost:
        r0 = X.C90514aH.A0h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0578, code lost:
        if (r10 == null) goto L_0x1be5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x057a, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x057c, code lost:
        r0.flowMarkError(r4, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x057f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0580, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0582, code lost:
        r0 = X.C90514aH.A0h(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0586, code lost:
        if (r10 == null) goto L_0x1be2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0588, code lost:
        r0 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x058b, code lost:
        r0 = r11.A00;
        r9 = X.C36351kA.A06(r0, 0);
        r6 = X.C36351kA.A06(r0, 1);
        r8 = X.C36401kF.A0s(r0, 2);
        r0 = new X.C164927sb(r0.get(3), 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if ((r3 instanceof androidx.fragment.app.DialogFragment) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05a3, code lost:
        if (r8 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05a5, code lost:
        r0 = (X.C140456lc) r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x05a9, code lost:
        if (r0 == null) goto L_0x05d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05ab, code lost:
        r7 = X.C140456lc.A0J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05af, code lost:
        r4 = r15.A03;
        r0 = r4.A00;
        r6 = X.AnonymousClass61J.A00(r0, r6, r9);
        r5 = X.C122885va.A00(r0, r9);
        r4 = r4.A01;
        r0 = X.C122885va.A01(r4, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05c1, code lost:
        if (1 != r0) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05c3, code lost:
        r0 = X.C90514aH.A0h(r4).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x05c9, code lost:
        r0.markerPoint(r5, r6, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05cc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x05cd, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        r3 = (androidx.fragment.app.DialogFragment) r3;
        r6.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x05cf, code lost:
        r0 = X.C90514aH.A0h(r4).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x05d6, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05d8, code lost:
        r3 = X.AnonymousClass6MO.A02(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05e0, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05e2, code lost:
        com.whatsapp.util.Log.e("WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x05e7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x05e8, code lost:
        r1 = ((X.C21060yb) r15.A0W.get()).A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x05f4, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x05f8, code lost:
        r0 = r11.A00;
        r9 = X.C36351kA.A06(r0, 0);
        r6 = X.C36351kA.A06(r0, 1);
        r7 = X.C36401kF.A0s(r0, 2);
        r8 = X.C36401kF.A0s(r0, 3);
        r5 = r15.A03;
        r0 = r5.A00;
        r4 = X.AnonymousClass61J.A00(r0, r6, r9);
        r0 = X.C122885va.A00(r0, r9);
        r6 = r5.A01;
        r6.get();
        r4 = X.C90474aD.A0A(r4, r0);
        r0 = X.C122885va.A01(r6, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0623, code lost:
        if (1 != r0) goto L_0x062f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        if (((com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r3).A1i(r5) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0625, code lost:
        r0 = X.C90514aH.A0h(r6).A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x062b, code lost:
        r0.flowEndFail(r4, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x062e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x062f, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0631, code lost:
        r0 = X.C90514aH.A0h(r6).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0638, code lost:
        r0 = r11.A00;
        r10 = X.C36351kA.A06(r0, 0);
        r9 = X.C36351kA.A06(r0, 1);
        r4 = X.C90494aF.A0k(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0646, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x064c, code lost:
        if (r4.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r13 = X.AnonymousClass000.A0y(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0656, code lost:
        if (r13.hasNext() == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0658, code lost:
        r4 = X.AnonymousClass000.A11(r13);
        r0 = r4.getKey();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0660, code lost:
        if (r0 != null) goto L_0x0664;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0662, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0664, code lost:
        r8 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0668, code lost:
        r0 = r4.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x066c, code lost:
        if (r0 != null) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (X.C36411kG.A1a(r6) == false) goto L_0x1afd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x066f, code lost:
        r7 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0674, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0675, code lost:
        if (r8 == null) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0677, code lost:
        if (r7 == null) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0679, code lost:
        r4 = r15.A03;
        r0 = r4.A00;
        r6 = X.AnonymousClass61J.A00(r0, r9, r10);
        r5 = X.C122885va.A00(r0, r10);
        r12 = r4.A01;
        r4 = X.C90514aH.A0h(r12).A06;
        r0 = X.C90524aI.A0b(r8, X.C133056Wm.A00(r4, r10).A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0697, code lost:
        if (r0 == null) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0699, code lost:
        r0 = r0.intValue();
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x069e, code lost:
        if (2 == r0) goto L_0x06a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x06a0, code lost:
        r11 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x06a1, code lost:
        if (1 != r0) goto L_0x06a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        r4 = 0;
        r3 = X.C90504aG.A0C(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x06a4, code lost:
        r11 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x06a5, code lost:
        r4 = X.C133056Wm.A00(r4, r10).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x06ac, code lost:
        if (r4 == -1) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x06ae, code lost:
        if (r11 == 65535) goto L_0x0652;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x06b0, code lost:
        if (r4 == 2) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x06b2, code lost:
        if (r11 == 2) goto L_0x06b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x06b5, code lost:
        r0 = X.C90514aH.A0h(r12).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06bc, code lost:
        r0 = X.C90514aH.A0h(r12).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (r4 >= r3) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06c2, code lost:
        r0.markerAnnotate(r5, r6, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x06c6, code lost:
        r0 = r11.A00;
        r7 = X.C36351kA.A06(r0, 0);
        r5 = X.C36351kA.A06(r0, 1);
        r4 = r15.A03;
        r0 = r4.A00;
        r6 = X.AnonymousClass61J.A00(r0, r5, r7);
        r5 = X.C122885va.A00(r0, r7);
        r4 = r4.A01;
        r0 = X.C122885va.A01(r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06e2, code lost:
        if (1 != r0) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06e4, code lost:
        r0 = X.C90514aH.A0h(r4).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06ea, code lost:
        r0.markerDrop(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06ed, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06ee, code lost:
        if (2 != r0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x06f0, code lost:
        r0 = X.C90514aH.A0h(r4).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06f7, code lost:
        r4 = X.AnonymousClass6MO.A02(r11, 0);
        r3 = A01(r0);
        r0 = ((X.AnonymousClass1EU) r15.A0T.get()).A05().BGg();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x070f, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r0 = (androidx.fragment.app.DialogFragment) r6.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0711, code lost:
        r1 = X.C36441kJ.A0H(r3, r0);
        r1.putExtra("extra_transaction_id", r4);
        r3.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x071d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x071e, code lost:
        r1 = X.C90504aG.A0K(r11.A00, 0);
        r5 = new X.C164207rR(r0, 0);
        r3 = A01(r0);
        r4 = new X.C143296qJ(r0, r1, r9);
        r15 = (X.AnonymousClass5ON) r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0736, code lost:
        if ((r3 instanceof X.C159787jv) == false) goto L_0x1bfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0738, code lost:
        r1 = (X.C159787jv) r3;
        r1.Bwn(r4);
        r1.Bwo(r5, r4, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0744, code lost:
        if ((r3 instanceof X.C162137o5) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0746, code lost:
        ((com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) ((X.C162137o5) r3)).A03.A08 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x074e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x074f, code lost:
        r0 = (android.app.Dialog) r0.A00.A02.A00().get(com.whatsapp.R.id.bloks_host_progress_dialog);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0760, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        if (r0 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0762, code lost:
        r0.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0765, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0766, code lost:
        r5 = X.AnonymousClass6MO.A01(r11, r0);
        X.AnonymousClass00C.A0E(r5, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r5 = (X.C1271967i) r5;
        r4 = X.AnonymousClass6MO.A00(r11, 1);
        java.util.Objects.requireNonNull(r4);
        X.AnonymousClass00C.A0E(r4, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
        r4 = (X.C140456lc) r4;
        r8 = X.C140456lc.A0E(r4);
        r4 = (java.lang.String) X.C140456lc.A0I(r4, 36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0789, code lost:
        if (r4 == null) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x078f, code lost:
        if (r4.isEmpty() != false) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0795, code lost:
        switch(r4.hashCode()) {
            case -1367751899: goto L_0x07ac;
            case -196315310: goto L_0x07b7;
            case -94789412: goto L_0x07cb;
            default: goto L_0x0798;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0798, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0799, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a0, code lost:
        ((com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0).A1h((java.lang.Runnable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x079b, code lost:
        r15.A04(A01(r0), new X.C143306qK(r5, r0, r8), new java.lang.String[]{r6});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x07ab, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07b2, code lost:
        if (r4.equals("camera") == false) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x07b4, code lost:
        r6 = "android.permission.CAMERA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x07bd, code lost:
        if (r4.equals("gallery") == false) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x07c3, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L_0x07c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x07c5, code lost:
        r6 = "android.permission.READ_MEDIA_IMAGES";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x07c8, code lost:
        r6 = "android.permission.WRITE_EXTERNAL_STORAGE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x07d1, code lost:
        if (r4.equals("read_contacts") == false) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x07d3, code lost:
        r6 = "android.permission.READ_CONTACTS";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x07d6, code lost:
        r0 = ((X.C123725wz) r15.A09.get()).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x07e1, code lost:
        r0 = ((X.C123725wz) r15.A09.get()).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x07eb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x07ed, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x07f0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07f1, code lost:
        r0 = r11.A00;
        r4 = X.C36351kA.A06(r0, 0);
        r7 = X.C36401kF.A0s(r0, 1);
        r6 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r4 < 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        r5 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0805, code lost:
        if (r5 == -1808118735) goto L_0x0824;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x080a, code lost:
        if (r5 == -672261858) goto L_0x081b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x080f, code lost:
        if (r5 != 1729365000) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0817, code lost:
        if (r7.equals("Boolean") == false) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0819, code lost:
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r0 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0821, code lost:
        if (r7.equals("Integer") == false) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x082a, code lost:
        if (r7.equals("String") == false) goto L_0x082f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x082c, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x082e, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x082f, code lost:
        if (r6 == 0) goto L_0x1c32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0831, code lost:
        if (r6 == 1) goto L_0x1c21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0833, code lost:
        if (r6 != 2) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        r6 = X.AnonymousClass001.A0I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0837, code lost:
        r3 = r11.A00;
        r4 = X.C36401kF.A0s(r3, 0);
        r3 = X.C36401kF.A0s(r3, 1);
        r1 = A01(r0).getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0849, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x084b, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0851, code lost:
        switch(r3.hashCode()) {
            case -891985903: goto L_0x0892;
            case 64711720: goto L_0x0881;
            case 97526364: goto L_0x086f;
            case 1958052158: goto L_0x085e;
            default: goto L_0x0854;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0854, code lost:
        X.C36321k7.A1P("WABLOKS: getIntentParameter type not supported: ", r3, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x085d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0864, code lost:
        if (r3.equals("integer") == false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b1, code lost:
        r0 = (androidx.fragment.app.DialogFragment) r6.get(X.C90504aG.A0C(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x086e, code lost:
        return java.lang.Integer.toString(r1.getIntExtra(r4, 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0875, code lost:
        if (r3.equals("float") == false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0880, code lost:
        return java.lang.Float.toString(r1.getFloatExtra(r4, 0.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0887, code lost:
        if (r3.equals("boolean") == false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x088d, code lost:
        if (r1.getBooleanExtra(r4, false) == false) goto L_0x1c46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x088f, code lost:
        return "1";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0898, code lost:
        if (r3.equals("string") == false) goto L_0x0854;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x089e, code lost:
        return r1.getStringExtra(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
        r4 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0);
        r3 = r0.A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        if (r4.A0A.size() == 1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r4.A04(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d3, code lost:
        r5 = A01(r0);
        r4 = new X.C116695l0(new X.C164927sb(r11, 2).B7w());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        r2 = 0;
        r11 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3 = ((X.AnonymousClass6MP) r15.A0B.get()).A00(r5);
        r5 = (X.AnonymousClass01I) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fb, code lost:
        if (X.C140456lc.A0I(r4.A00, 35) == null) goto L_0x1b05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fd, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("bottom_sheet_fragment_tag");
        X.C36351kA.A1K(java.util.UUID.randomUUID(), r1);
        r1 = r1.toString();
        X.C18740tg.A06(r4);
        r0 = com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A00(r4, (X.C131616Pt) r3.A00.get(), r1, false);
        r4 = new com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment();
        r4.A01 = X.C36441kJ.A0W(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        if (r4.A15() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0c78, code lost:
        if (r2 == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x0c7c, code lost:
        ((X.AnonymousClass17Y) r15.A0Q.get()).A0E(X.AnonymousClass6MO.A02(r11, 0), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0c8b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x0c8c, code lost:
        A01(r0).finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        r3 = r5.getSupportFragmentManager();
        r1 = X.C36421kH.A0f(r3);
        r1.append("bottom_sheet_container_tag");
        X.C36351kA.A1K(java.util.UUID.randomUUID(), r1);
        r4.A1f(r3, r1.toString());
        X.AnonymousClass6JY.A01.push(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x0c93, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x0c94, code lost:
        r0 = A01(r0);
        r5 = X.AnonymousClass6MO.A02(r11, 0);
        X.AnonymousClass00C.A0D(r0, 0);
        X.AnonymousClass00C.A0D(r5, 1);
        r3 = X.C132876Vp.A00;
        r1 = X.C129306Gj.A01(X.C129306Gj.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0cac, code lost:
        if (r1 == null) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0cb2, code lost:
        if (r1.isEmpty() != false) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0cb4, code lost:
        r0 = X.C132876Vp.A00(r3, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0cb8, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0cba, code lost:
        if (r0 != null) goto L_0x0cc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0cbc, code lost:
        X.AnonymousClass6RS.A01("CDSBloksBottomSheetController", "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0cc3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0153, code lost:
        ((X.AnonymousClass6MP) r15.A0B.get()).A00(A01(r0));
        r1 = X.AnonymousClass6JY.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0cc4, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0cc6, code lost:
        r1 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0).A0A;
        r0 = (X.C122045uD) r1.peekFirst();
        r6 = "CDSBloksBottomSheetDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0cd4, code lost:
        if (r0 == null) goto L_0x0d0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0cde, code lost:
        if (r5.equals(r0.A03.A03) != false) goto L_0x0d0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0ce0, code lost:
        r4 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0ce8, code lost:
        if (r4.hasNext() == false) goto L_0x0d0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0cea, code lost:
        r3 = (X.C122045uD) r4.next();
        r1 = r3.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0cf8, code lost:
        if (r5.equals(r1.A03) == false) goto L_0x0ce4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0168, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0cfc, code lost:
        if (r3.A00 == null) goto L_0x0d03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0cfe, code lost:
        r1.A02();
        r3.A00 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0d03, code lost:
        r1.A01();
        r4.remove();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0d09, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0d0a, code lost:
        r0 = "No screen found with target ID, so the screen was not removed.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0d0e, code lost:
        r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0d12, code lost:
        r4 = X.C90504aG.A0K(r11.A00, 0);
        r1 = A01(r0);
        r3 = X.C142316og.A05(r0, r11, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0d21, code lost:
        if (r4 == null) goto L_0x0d27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0d23, code lost:
        r2 = X.C140456lc.A0E(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x016a, code lost:
        ((X.AnonymousClass02E) r1.peek()).A0k().A0V();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0d27, code lost:
        X.AnonymousClass00C.A0D(r1, 0);
        r1 = X.C129306Gj.A01(X.C129306Gj.A00(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0d32, code lost:
        if (r1 == null) goto L_0x0d53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0d38, code lost:
        if (r1.isEmpty() != false) goto L_0x0d53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0d3a, code lost:
        r1 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0d3e, code lost:
        r1 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0d40, code lost:
        if (r1 == null) goto L_0x0d55;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0d42, code lost:
        if (r4 == null) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0d44, code lost:
        if (r2 == 0) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0d46, code lost:
        if (r3 == null) goto L_0x0d51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0177, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001f, code lost:
        switch(r12) {
            case 0: goto L_0x0ee6;
            case 1: goto L_0x0e21;
            case 2: goto L_0x1794;
            case 3: goto L_0x176d;
            case 4: goto L_0x172e;
            case 5: goto L_0x0d97;
            case 6: goto L_0x19d3;
            case 7: goto L_0x071e;
            case 8: goto L_0x06f7;
            case 9: goto L_0x06c6;
            case 10: goto L_0x0638;
            case 11: goto L_0x1aee;
            case 12: goto L_0x05f8;
            case 13: goto L_0x16f0;
            case 14: goto L_0x0d78;
            case 15: goto L_0x05d8;
            case 16: goto L_0x0028;
            case 17: goto L_0x168b;
            case 18: goto L_0x1669;
            case 19: goto L_0x1a4b;
            case 20: goto L_0x0d5c;
            case 21: goto L_0x07e1;
            case 22: goto L_0x058b;
            case 23: goto L_0x1658;
            case 24: goto L_0x0028;
            case 25: goto L_0x0d12;
            case 26: goto L_0x0178;
            case 27: goto L_0x0545;
            case 28: goto L_0x0c94;
            case 29: goto L_0x1648;
            case 30: goto L_0x04e5;
            case 31: goto L_0x1a25;
            case 32: goto L_0x0c8c;
            case 33: goto L_0x1953;
            case 34: goto L_0x04c4;
            case 35: goto L_0x04a6;
            case 36: goto L_0x0475;
            case 37: goto L_0x1a0c;
            case 38: goto L_0x15f4;
            case 39: goto L_0x1585;
            case 40: goto L_0x0028;
            case 41: goto L_0x153d;
            case 42: goto L_0x1648;
            case 43: goto L_0x07d6;
            case 44: goto L_0x0460;
            case 45: goto L_0x150f;
            case 46: goto L_0x043e;
            case 47: goto L_0x1473;
            case 48: goto L_0x03bb;
            case 49: goto L_0x144e;
            case 50: goto L_0x1423;
            case 51: goto L_0x140e;
            case 52: goto L_0x19ce;
            case 53: goto L_0x1399;
            case 54: goto L_0x1383;
            case 55: goto L_0x0028;
            case 56: goto L_0x0766;
            case X.8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER :int: goto L_0x133f;
            case 58: goto L_0x19c9;
            case 59: goto L_0x037c;
            case X.8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER :int: goto L_0x0344;
            case 61: goto L_0x030c;
            case 62: goto L_0x16f0;
            case 63: goto L_0x074f;
            case 64: goto L_0x19c6;
            case X.8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER :int: goto L_0x0c8c;
            case 66: goto L_0x0d12;
            case X.8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER :int: goto L_0x12d9;
            case 68: goto L_0x1473;
            case X.8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER :int: goto L_0x1270;
            case X.8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER :int: goto L_0x1ad5;
            case X.8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x0c7c;
            case 72: goto L_0x125e;
            case 73: goto L_0x0153;
            case X.8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER :int: goto L_0x0c8c;
            case X.8SX.EVENT_MESSAGE_FIELD_NUMBER :int: goto L_0x0837;
            case X.8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER :int: goto L_0x17ca;
            case X.8SX.COMMENT_MESSAGE_FIELD_NUMBER :int: goto L_0x02cc;
            case X.8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER :int: goto L_0x115b;
            case X.8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER :int: goto L_0x0229;
            case X.8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER :int: goto L_0x0028;
            case 81: goto L_0x1148;
            case X.8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER :int: goto L_0x19c1;
            case 83: goto L_0x01f2;
            case 84: goto L_0x19ef;
            case 85: goto L_0x0028;
            case 86: goto L_0x0028;
            case 87: goto L_0x0029;
            case 88: goto L_0x1104;
            case 89: goto L_0x00d3;
            case com.whatsapp.voipcalling.camera.VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION :int: goto L_0x0638;
            case 91: goto L_0x0041;
            case 92: goto L_0x108d;
            case 93: goto L_0x01a6;
            case 94: goto L_0x105a;
            case 95: goto L_0x1026;
            case 96: goto L_0x19d8;
            case 97: goto L_0x0028;
            case 98: goto L_0x100e;
            case 99: goto L_0x07f1;
            case 100: goto L_0x0fe2;
            default: goto L_0x0022;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0d48, code lost:
        r0 = new X.C1503374w(r3, r4, r2, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0d4d, code lost:
        r1.A1h(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0d50, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0d51, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0d53, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0d5b, code lost:
        throw X.AnonymousClass001.A09("Cannot dismiss without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0d5c, code lost:
        r0 = r11.A00;
        r7 = X.C36351kA.A06(r0, 0);
        r6 = X.C36351kA.A06(r0, 1);
        r5 = X.C36351kA.A06(r0, 2);
        new X.C164927sb(r0.get(3), 6);
        r15.A03(r7, r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0d77, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0d78, code lost:
        r6 = r11.A00;
        r5 = X.C36401kF.A0s(r6, 0);
        r4 = X.C36401kF.A0s(r6, 1);
        r3 = X.C90464aC.A0H(r6, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0178, code lost:
        r11.A04(1);
        r11.A04(2);
        r11.A04(3);
        r11.A04(4);
        r11.A04(5);
        r11.A04(6);
        r11.A04(7);
        r11.A04(8);
        r1 = r15.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0d87, code lost:
        if (r3 == null) goto L_0x0d8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0d89, code lost:
        r2 = X.C164197rQ.A00(r3, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0d8f, code lost:
        r15.A05(A01(r0), r2, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0d96, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0d97, code lost:
        r6 = r11.A00;
        r11 = X.C36401kF.A0s(r6, 0);
        r1 = X.C36401kF.A0s(r6, 1);
        r10 = X.C36401kF.A0s(r6, 2);
        r9 = X.C36401kF.A0s(r6, 3);
        r7 = X.C36401kF.A0s(r6, 4);
        r12 = X.C90464aC.A0H(r6, 5);
        r5 = X.C90464aC.A0H(r6, 6);
        r4 = X.C90464aC.A0H(r6, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0dbb, code lost:
        if (r12 == null) goto L_0x0e1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0dbd, code lost:
        r8 = new X.C594233w();
        r8.A00 = r0;
        r8.A01 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0dc6, code lost:
        if (r5 == null) goto L_0x0e1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0dc8, code lost:
        r3 = new X.C594233w();
        r3.A00 = r0;
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0dd1, code lost:
        if (r4 == null) goto L_0x0e1b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x019a, code lost:
        if (r1.A05() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0dd3, code lost:
        r6 = new X.C594233w();
        r6.A00 = r0;
        r6.A01 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0ddc, code lost:
        r5 = (X.AnonymousClass014) A01(r0);
        r4 = X.AnonymousClass3LW.A00(r5);
        r4.A0q(r11);
        r4.A0p(r1);
        r4.A0o(r5, new X.C165207t3(r8, 9), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0df6, code lost:
        if (r9 == null) goto L_0x0e02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0df8, code lost:
        r4.A0n(r5, new X.C165207t3(r3, 10), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0e02, code lost:
        if (r7 == null) goto L_0x0e17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0e04, code lost:
        r3 = new X.C165207t3(r6, 11);
        r1 = r4.A00;
        r0 = r4.A01;
        r1.A0R(r0, r7);
        r0.A01.A08(r5, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0e17, code lost:
        X.C36341k9.A11(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0e1a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0e1b, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0e1d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019c, code lost:
        r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0e1f, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0e21, code lost:
        r1 = r11.A00;
        r4 = X.C90504aG.A0K(r1, 0);
        r10 = X.C90504aG.A0K(r1, 0);
        r9 = A09(X.C90494aF.A0k(r1, 2));
        r8 = A07(r4);
        r7 = r4.A04;
        r1 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0e44, code lost:
        if (X.AnonymousClass000.A1S(r7, 13647) != false) goto L_0x0e4c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0e48, code lost:
        if (r7 != 13784) goto L_0x0edf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0e4a, code lost:
        r1 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0e4c, code lost:
        r12 = r4.A0a(r1, "0");
        r11 = new X.C142086oJ(r8);
        r10 = X.AnonymousClass6XK.A00(r0, r10);
        r1 = new X.C123615wn();
        r1.A01 = r8;
        r1.A02 = r9;
        r9 = new X.C139046j9(r1);
        r3 = A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0e6b, code lost:
        if (r3 == null) goto L_0x0e73;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0e6d, code lost:
        r2 = r3.A0X(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0e73, code lost:
        if (r2 == 0) goto L_0x0ecd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a5, code lost:
        throw X.AnonymousClass001.A0A("handleFetchPriceAndBuy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0e75, code lost:
        r13 = new X.C164627s7(r0, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0e7b, code lost:
        X.C109535Xy.A00(r4.A0a(36, com.whatsapp.voipcalling.CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID));
        r7 = r0.A00.A00;
        X.AnonymousClass00C.A0D(r7, 0);
        r1 = X.C129306Gj.A01(X.C129306Gj.A00(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0e94, code lost:
        if (r1 == null) goto L_0x0ecb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0e9a, code lost:
        if (r1.isEmpty() != false) goto L_0x0ecb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0e9c, code lost:
        r8 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0ea0, code lost:
        r8 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0ea2, code lost:
        if (r8 == null) goto L_0x0ed8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0ea4, code lost:
        r12 = X.C132876Vp.A01(r7, r8, r9, r10, r11, r12);
        r11 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r8);
        r10 = r8.A0a();
        r2 = (X.C122045uD) r11.A0A.peek();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0ebc, code lost:
        if (r2 != null) goto L_0x0ec4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a6, code lost:
        r3 = r11.A00;
        r6 = X.C36401kF.A0s(r3, 0);
        r5 = X.AnonymousClass000.A1X(r3.get(1));
        r4 = (android.app.ProgressDialog) r0.A00.A02.A00().get(com.whatsapp.R.id.bloks_host_progress_dialog);
        r3 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0ebe, code lost:
        r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0ec0, code lost:
        X.AnonymousClass6RS.A01("CDSBloksBottomSheetDelegate", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0ec3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0ec6, code lost:
        if (r11.A09 == false) goto L_0x0ecf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0ec8, code lost:
        r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0ecb, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0ecd, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0ecf, code lost:
        r2.A03.A03();
        X.C139036j8.A02(r10, r11, r12, r13, (java.lang.Integer) null, 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0ed7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01c9, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0ede, code lost:
        throw X.AnonymousClass001.A09("Cannot push a new Screen without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0ee5, code lost:
        throw X.AnonymousClass001.A08("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0ee6, code lost:
        r5 = r11.A00;
        r13 = X.C36401kF.A0s(r5, 0);
        r9 = X.C90494aF.A0k(r5, 1);
        r8 = X.C90504aG.A0K(r5, 2);
        r1 = (java.util.List) r5.get(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0efb, code lost:
        if (r1 == null) goto L_0x0f5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0efd, code lost:
        r4 = r1.iterator();
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0f06, code lost:
        if (r4.hasNext() == false) goto L_0x0f5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0f08, code lost:
        r3 = X.C90514aH.A0Y(r4);
        r1 = 35;
        r2 = (java.lang.String) X.C140456lc.A0I(r3, 35);
        r7 = (java.lang.String) X.C140456lc.A0I(r3, 36);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0f1a, code lost:
        if (r2 == null) goto L_0x0f02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0f1c, code lost:
        r5 = r8.A0X(36);
        r4 = r8.A0X(r1);
        r14 = X.C90504aG.A0l("params", A08(r9));
        r6 = X.C164197rQ.A00(r5, 21);
        r3 = X.C164197rQ.A00(r4, 17);
        r5 = (X.C121925tw) r15.A08.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0f46, code lost:
        if (android.text.TextUtils.isEmpty(r13) == false) goto L_0x0f63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0f48, code lost:
        X.C18740tg.A0D(false, "null app id");
        r5.A00.Bp3(new X.C1501874h(r0, r3.A00, 5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0f5b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0f5c, code lost:
        r1 = 35;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0f5f, code lost:
        r1 = 35;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0f63, code lost:
        r4 = r5.A02.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0f6d, code lost:
        if (r4.hasNext() == false) goto L_0x0fbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01cf, code lost:
        if (r4.isShowing() == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0f6f, code lost:
        r8 = (X.C121175si) r4.next();
        X.AnonymousClass00C.A0D(r0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0f7f, code lost:
        if ("secure_v0".equals(r2) == false) goto L_0x0f69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0f81, code lost:
        r1 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0f83, code lost:
        if (r1 == null) goto L_0x0fb8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0f85, code lost:
        r5 = (X.AnonymousClass5PD) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0f8b, code lost:
        if (r13 == null) goto L_0x0fb3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0f8d, code lost:
        r4 = new X.C1494271e(r8, r6, r3, r0);
        r0 = r5.A00.A00.A00;
        r5.A01(r4, new X.AnonymousClass5PL(X.C36391kE.A0V(r0), X.C36351kA.A0V(r0), X.C36361kB.A0c(r0), r7), X.C36441kJ.A0W(r13, r14), 45);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0fb2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0fb7, code lost:
        throw X.C36381kD.A0l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01d1, code lost:
        r4.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0fbe, code lost:
        throw X.C36331k8.A0d("bloksPayloadIqHelperLazy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0fbf, code lost:
        r1 = (X.C120305rI) r5.A01.get();
        r1.A00.A04((X.C134906bn) null, new X.C163787ql(r0, r3, r1, r6, 1), (java.lang.Boolean) null, r13, r14, (java.lang.String) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0fe1, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0fe2, code lost:
        r3 = r11.A00;
        r6 = X.C36351kA.A06(r3, 0);
        r1 = X.C90494aF.A0k(r3, 1);
        r5 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0ff0, code lost:
        if (r1 == null) goto L_0x100c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0ff2, code lost:
        r4 = A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:597:0x0ff6, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0ff7, code lost:
        if (r6 == 0) goto L_0x0ffa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0ff9, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01d4, code lost:
        r4.setMessage(r6);
        r4.setIndeterminate(true);
        r4.setCanceledOnTouchOutside(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0ffa, code lost:
        r1 = r5.getIntent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0ffe, code lost:
        if (r4 == null) goto L_0x1005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x1000, code lost:
        r1.putExtra("finish_activity_result", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x1005, code lost:
        r5.setResult(r3, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x100b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x100c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x100e, code lost:
        r0 = r11.A00;
        r15.A06(new X.C164927sb(r0.get(2), 5), X.C36351kA.A06(r0, 0), X.C36351kA.A06(r0, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:607:0x1025, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x1026, code lost:
        r6 = r11.A00;
        r7 = X.C36401kF.A0s(r6, 0);
        r10 = X.C36351kA.A06(r6, 1);
        r1 = X.C36351kA.A06(r6, 2);
        ((X.C21010yW) r15.A0c.get()).Blv(X.C110075a5.A00(r7, (java.util.ArrayList) r6.get(5), A08(X.C90494aF.A0k(r6, 3)), r10, X.C90494aF.A06(r1), X.C36351kA.A06(r6, 4)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x1059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01dd, code lost:
        if (r5 == false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x105a, code lost:
        r1 = X.C90504aG.A0K(r11.A00, 0);
        r5 = (java.lang.String) X.C140456lc.A0I(r1, 36);
        r1 = r1.A0W(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x106c, code lost:
        if (r1 == null) goto L_0x108a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x106e, code lost:
        r4 = (java.lang.String) X.C140456lc.A0I(r1, 36);
        r3 = r1.A0X(35);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x1078, code lost:
        if (r3 == null) goto L_0x1088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x107a, code lost:
        r1 = X.C164197rQ.A00(r3, 18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x1080, code lost:
        r15.A05(A01(r0), r1, r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x1087, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x1088, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x108a, code lost:
        r3 = null;
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x108d, code lost:
        r5 = r11.A00;
        r6 = X.AnonymousClass6JJ.A01(r5, 0);
        r4 = X.AnonymousClass6JJ.A01(r5, 1);
        r5 = X.AnonymousClass6JJ.A01(r5, 2);
        r3 = new X.C594233w();
        r3.A01 = r6;
        r3.A00 = r0;
        r1 = new X.C594233w();
        r1.A01 = r4;
        r1.A00 = r0;
        r4 = new X.C594233w();
        r4.A01 = r5;
        r4.A00 = r0;
        r7 = A01(r0);
        r6 = (com.whatsapp.smartcapture.picker.OpenMediaPickerManagerImpl) r15.A0S.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01df, code lost:
        r4.setCancelable(true);
        r4.setOnCancelListener(new X.C163277pw(r3, r15, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x10c2, code lost:
        if (r6 == null) goto L_0x10f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x10c6, code lost:
        if ((r7 instanceof X.AnonymousClass01G) == false) goto L_0x10f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x10c8, code lost:
        r5 = new X.C1509677m(r3, r1, r4);
        r7 = (X.AnonymousClass01G) r7;
        X.AnonymousClass00C.A0D(r7, 0);
        r7.A06.A04(r6);
        r1 = r7.A04.A02(new X.C165437tQ(r6, r7, r5, 1), new X.AnonymousClass0FG(), "mediapicker_rq#101");
        r6.A00 = r1;
        r1.A01((X.AnonymousClass0YW) null, "image/*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x10f2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x10f3, code lost:
        r3 = X.AnonymousClass001.A0I();
        r3.add("Unexpected parameters while opening media picker");
        A0A(r4.A01, r4.A00, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x1103, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x1104, code lost:
        r4 = r11.A00;
        r3 = X.C36401kF.A0s(r4, 0);
        r16 = X.C36401kF.A0s(r4, 1);
        r13 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:628:0x1114, code lost:
        if ((r13 instanceof X.C225014r) != false) goto L_0x111a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x1116, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity doesn't implement DialogInterface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ea, code lost:
        r4.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x111c, code lost:
        if ((r13 instanceof X.AnonymousClass01L) != false) goto L_0x1122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x111e, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity is not instance of AppCompatActivity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x1122, code lost:
        r14 = X.C36421kH.A0N(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x1126, code lost:
        if (r14 != null) goto L_0x112c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x1128, code lost:
        r0 = "[Bloks][bk.action.wa.extension.ReportItem] failed to parse chat jid from string";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x112c, code lost:
        r3 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment();
        r3.A00 = new X.C163047pZ(r13, r14, r15, r16, 1);
        X.C65443Sb.A03(r3, ((X.AnonymousClass01I) r13).getSupportFragmentManager(), X.AnonymousClass000.A0k(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x1147, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x1148, code lost:
        r1 = X.C90494aF.A0k(r11.A00, 0);
        r0 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x1152, code lost:
        if (r1 == null) goto L_0x1157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ed, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x1154, code lost:
        A08(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x1157, code lost:
        r0.onBackPressed();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x115a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x115b, code lost:
        r3 = X.AnonymousClass6MO.A02(r11, 0);
        r6 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:?, code lost:
        r4 = X.AnonymousClass6VK.A00(r15, r3);
        r3 = X.AnonymousClass3U8.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x116b, code lost:
        if (r3 == null) goto L_0x122d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x116d, code lost:
        r13 = ((X.AnonymousClass16D) r15.A0K.get()).A08(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x1179, code lost:
        if (r13 == null) goto L_0x119f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01ee, code lost:
        r4.setCancelable(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x1187, code lost:
        if (((X.C19730wQ) r15.A0R.get()).A0M(r4) == false) goto L_0x119f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x1189, code lost:
        r15.A05.get();
        r4 = X.C36431kI.A0D();
        r4.setClassName(r6.getPackageName(), "com.whatsapp.profile.ProfileInfoActivity");
        r6.startActivity(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x119e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x119f, code lost:
        r8 = r3.replaceAll("\\D", "");
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x11ad, code lost:
        if (r8.length() >= 5) goto L_0x11b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x11af, code lost:
        com.whatsapp.util.Log.w("bkextentionsimpl/converttointlformat/too-short-no-cc");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x11b5, code lost:
        r3 = java.util.regex.Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x11c3, code lost:
        if (r3.find() == false) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x11c5, code lost:
        r9 = r3.group(1);
        X.C18740tg.A06(r9);
        r8 = r8.substring(r9.length());
        r3 = (X.AnonymousClass1N4) r15.A0M.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x11e0, code lost:
        if (X.AnonymousClass3U2.A01(r3, r9, r8) != 1) goto L_0x120a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f2, code lost:
        r3 = X.AnonymousClass6JJ.A01(r11.A00, 0);
        r1 = A01(r0);
        r3 = X.C164197rQ.A00(r3, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x11e2, code lost:
        r10 = java.lang.Integer.parseInt(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:?, code lost:
        r8 = r3.A03(r10, r8.replaceAll("\\D", ""));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x11ef, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:?, code lost:
        com.whatsapp.util.Log.w(X.AnonymousClass000.A0r("bkextentionsimpl/converttointlformat/trim/error ", X.AnonymousClass000.A0u(), r10), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0204, code lost:
        if ((r1 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x123c, code lost:
        throw new X.C19740wR(X.AnonymousClass000.A0l(r4, "invalid jid ", X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x123d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x123e, code lost:
        ((X.C19700wN) r15.A0N.get()).A0E("bloks/openContactInfo - ", r3.getMessage(), true);
        ((X.AnonymousClass17Y) r15.A0Q.get()).A06(com.whatsapp.R.string.f12nameremoved, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x125d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x125e, code lost:
        r4 = r11.A00;
        X.C90484aE.A13(A01(r0), X.C36401kF.A0s(r4, 0), X.C36401kF.A0s(r4, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x126f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0206, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x1270, code lost:
        r5 = r11.A00;
        r4 = X.C36401kF.A0s(r5, 0);
        r6 = r5.get(1);
        r5 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:?, code lost:
        r4 = X.AnonymousClass6VK.A00(r15, r4);
        r0 = X.AnonymousClass3U8.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x1286, code lost:
        if (r0 == null) goto L_0x12a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x1288, code lost:
        r0 = X.C36431kI.A1Z(r0, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x128e, code lost:
        if (r6 != null) goto L_0x1292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x1290, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x1292, code lost:
        r0[1] = r6;
        ((X.C24791Du) r15.A06.get()).Bp7(r5, android.net.Uri.parse(java.lang.String.format("http://api.whatsapp.com/send?phone=%s&text=%s", r0)), (X.AnonymousClass3T1) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x12a7, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0209, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x12b7, code lost:
        throw new X.C19740wR(X.AnonymousClass000.A0l(r4, "invalid jid ", X.AnonymousClass000.A0u()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x12b8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x12b9, code lost:
        ((X.C19700wN) r15.A0N.get()).A0E("bloks/openchat", r3.getMessage(), true);
        ((X.AnonymousClass17Y) r15.A0Q.get()).A06(com.whatsapp.R.string.f12nameremoved, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x12d8, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x12d9, code lost:
        r6 = X.AnonymousClass6MO.A02(r11, 0);
        r5 = A01(r0);
        r4 = (X.C89034Uz) r15.A0V.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x12eb, code lost:
        if ((r5 instanceof com.whatsapp.wabloks.ui.WaBloksActivity) == false) goto L_0x133b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x12ed, code lost:
        r4 = (X.C69313dK) r4;
        r3 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x12f7, code lost:
        if (r3.A0E(832) != false) goto L_0x133b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x12ff, code lost:
        if (r3.A0E(1062) == false) goto L_0x133b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x020a, code lost:
        ((X.AnonymousClass6MP) r15.A0B.get()).A00(r1);
        r1 = X.AnonymousClass6JY.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r11.A04(0);
        A01(r0);
        r1 = r15.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x1307, code lost:
        if (r4.A0A.A01(r6) == false) goto L_0x133b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x1309, code lost:
        r5 = (com.whatsapp.wabloks.ui.WaBloksActivity) r5;
        r5.A3Z(new X.C68953cj(r15, r5, r6));
        r4 = X.C36441kJ.A16();
        X.AnonymousClass000.A1F(r4, 55);
        r3 = new X.AnonymousClass3OM(r5);
        r3.A0G = true;
        r3.A0L = true;
        r3.A0a = X.C36441kJ.A15(r4);
        r3.A0X = r6;
        r5.startActivityForResult(X.AnonymousClass3OM.A02(r3, "com.whatsapp.contact.picker.ContactPicker"), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x133a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x133b, code lost:
        X.AnonymousClass6VK.A02(r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x133e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x133f, code lost:
        r4 = r11.A00;
        r5 = X.C36401kF.A0s(r4, 0);
        r1 = X.AnonymousClass6JJ.A01(r4, 1);
        r4 = X.AnonymousClass6JJ.A01(r4, 2);
        r3 = new X.C594233w();
        r3.A01 = r1;
        r3.A00 = r0;
        r1 = new X.C594233w();
        r1.A01 = r4;
        r1.A00 = r0;
        r6 = new java.io.File(java.net.URI.create(r5));
        r5 = new X.C165047sn(r3, r1, 2);
        r4 = (X.C20190xA) r15.A0A.get();
        X.C36381kD.A1R(r4.A05, new com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1(r4, r6, (X.C023509x) null, r5), r4.A06);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x1382, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x1383, code lost:
        A02(X.C142316og.A05(r0, r11, 2), r0, X.C90504aG.A0K(r11.A00, 0)).create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x1398, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021b, code lost:
        if (r1.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x1399, code lost:
        r4 = X.AnonymousClass000.A1X(X.AnonymousClass6MO.A00(r11, 1));
        r3 = A01(r0);
        r5 = new X.C116695l0(new X.C164927sb(r11, 1).B7w());
        r3 = ((X.AnonymousClass6MP) r15.A0B.get()).A00(r3);
        r1 = X.AnonymousClass000.A0u();
        r1.append("bottom_sheet_fragment_tag");
        X.C36351kA.A1K(java.util.UUID.randomUUID(), r1);
        r8 = r1.toString();
        r7 = com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A00(r5, (X.C131616Pt) r3.A00.get(), r8, r4);
        r6 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) X.AnonymousClass6JY.A01.peek();
        r5 = X.C36411kG.A0S(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x13ec, code lost:
        if (r4 == false) goto L_0x13f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x13ee, code lost:
        r5.A0J(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x13f1, code lost:
        r5.A06(com.whatsapp.R.anim.f1nameremoved, com.whatsapp.R.anim.f1nameremoved, com.whatsapp.R.anim.f1nameremoved, com.whatsapp.R.anim.f1nameremoved);
        r5.A0F(r7, r8, r6.A00.getId());
        r5.A00(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x140d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x140e, code lost:
        r6 = r11.A00;
        r5 = X.C36351kA.A06(r6, 0);
        r1 = X.C36351kA.A06(r6, 1);
        r0 = X.C36351kA.A06(r6, 2);
        r6.get(3);
        r15.A03(r5, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x1422, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x1423, code lost:
        r3 = r11.A00;
        r6 = X.C36401kF.A0s(r3, 0);
        r5 = X.C36401kF.A0s(r3, 1);
        r4 = A01(r0);
        r1 = X.AnonymousClass190.A0Q(r4.getApplicationContext(), ((X.C225314u) r4).A2j(), (android.os.Parcelable) null, false);
        r1.putExtra("extra_custom_bloks_use_case", r6);
        r1.putExtra("extra_custom_bloks_param", r5);
        r4.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x144d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x144e, code lost:
        r5 = r11.A00;
        r4 = X.C36401kF.A0s(r5, 0);
        r1 = X.C90494aF.A0k(r5, 1);
        r5.get(2);
        r3 = A01(r0);
        r3.startActivity(X.C90494aF.A0D(r3, (android.os.Parcelable) null, com.whatsapp.wabloks.ui.WaBloksActivity.class, r4, X.C90504aG.A0l("params", A08(r1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x021d, code lost:
        r0 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r1.peek();
        r0.A02 = r3;
        r0.A1b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x1472, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x1473, code lost:
        r5 = r11.A00;
        r4 = X.C90504aG.A0K(r5, 0);
        r9 = X.C90504aG.A0K(r5, 1);
        r7 = A09(X.C90494aF.A0k(r5, 2));
        r6 = A07(r4);
        r5 = r4.A04;
        r1 = 40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x1495, code lost:
        if (X.AnonymousClass000.A1S(r5, 13647) != false) goto L_0x149d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x1499, code lost:
        if (r5 != 13784) goto L_0x1508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x149b, code lost:
        r1 = 45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x149d, code lost:
        r14 = r4.A0a(r1, "0");
        r12 = new X.C142086oJ(r6);
        r8 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A05(X.C133016Wg.A01((X.C1271967i) null, r0, r9), r6);
        r8.A00 = r0.A00.A02;
        r3 = new X.C123615wn();
        r3.A01 = r6;
        r3.A02 = r7;
        r3.A00 = 812974081;
        r10 = new X.C139046j9(r3);
        r3 = A04(r4);
        r15 = A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x14cf, code lost:
        if (r3 == null) goto L_0x14ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x14d1, code lost:
        r3 = r3.A0X(40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x14d7, code lost:
        if (r3 == null) goto L_0x14fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0228, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x14d9, code lost:
        r13 = new X.C164627s7(r0, r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x14df, code lost:
        r9 = (X.AnonymousClass01I) A01(r0);
        r1 = 43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x14e9, code lost:
        if (r5 == 13647) goto L_0x14f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:734:0x14ed, code lost:
        if (r5 != 13784) goto L_0x1501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x14ef, code lost:
        r1 = 38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x14f1, code lost:
        X.C132876Vp.A02(r8, r9, r10, X.AnonymousClass6XK.A00(r0, r4.A0W(r1)), r12, r13, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x14fc, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x14fd, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x14ff, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0229, code lost:
        r6 = java.util.Collections.unmodifiableList(r11.A00);
        r5 = X.C90524aI.A0i("[Bloks logging] ");
        r4 = X.C36401kF.A0s(r6, 0);
        r5.append(X.C36401kF.A0s(r6, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x1507, code lost:
        throw X.AnonymousClass001.A08("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x150e, code lost:
        throw X.AnonymousClass001.A08("screen should be an instance of BloksScreenData or BloksScreenV2Data");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x150f, code lost:
        r3 = r11.A00;
        r4 = X.C36401kF.A0s(r3, 0);
        r1 = X.C90494aF.A0k(r3, 1);
        r3 = A01(r0);
        r0 = X.C90504aG.A0l("params", A08(r1));
        r3 = ((X.AnonymousClass01I) r3).getSupportFragmentManager();
        r1 = new com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1((X.AnonymousClass5ON) r15, r4, r0);
        r1.A1b();
        r1.A1f(r3, "bloks-dialog");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:745:0x153c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x153d, code lost:
        r4 = r11.A00;
        r7 = X.C36401kF.A0s(r4, 0);
        r8 = X.C36401kF.A0s(r4, 1);
        r6 = X.AnonymousClass001.A0I();
        r5 = ((java.util.List) r4.get(2)).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x1559, code lost:
        if (r5.hasNext() == false) goto L_0x1569;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x155b, code lost:
        r6.add(new X.C164927sb(r5.next(), 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0244, code lost:
        if (r6.get(2) == null) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x1569, code lost:
        com.whatsapp.wabloks.ui.BkActionBottomSheet.A03((X.C131616Pt) r15.A0C.get(), r7, r8, r6).A1f(((X.AnonymousClass01I) A01(r0)).getSupportFragmentManager(), "bloks_action_sheet_tag");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x1584, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x1585, code lost:
        r5 = X.C140456lc.A0J(X.C90504aG.A0K(r11.A00, 0));
        r0 = A01(r0);
        X.AnonymousClass00C.A0D(r0, 0);
        r1 = X.C129306Gj.A01(X.C129306Gj.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x159e, code lost:
        if (r1 == null) goto L_0x15d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x15a4, code lost:
        if (r1.isEmpty() != false) goto L_0x15d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x15a6, code lost:
        r0 = A06(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x15aa, code lost:
        r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x15ac, code lost:
        if (r0 == null) goto L_0x15ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x15ae, code lost:
        r4 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0);
        r3 = r0.A0a();
        r1 = r4.A0A;
        r0 = r1.isEmpty();
        r6 = "CDSBloksBottomSheetDelegate";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0246, code lost:
        r3 = X.AnonymousClass000.A0y(X.C90494aF.A0k(r6, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x15be, code lost:
        if (r5 != null) goto L_0x15d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x15c0, code lost:
        if (r0 != false) goto L_0x15e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x15c4, code lost:
        if (r4.A01 == null) goto L_0x15e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x15cb, code lost:
        if (r1.size() == 1) goto L_0x15e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x15cd, code lost:
        X.C139036j8.A01(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x15d0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:768:0x15d1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:769:0x15d3, code lost:
        if (r0 != false) goto L_0x15e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x15d7, code lost:
        if (r4.A01 == null) goto L_0x15e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:773:0x15de, code lost:
        if (r1.size() == 1) goto L_0x15e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:774:0x15e0, code lost:
        r4.A04(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:775:0x15e3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x15e4, code lost:
        r0 = "Cannot pop from an empty bottom sheet.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x15e7, code lost:
        r0 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:778:0x15e9, code lost:
        X.AnonymousClass6RS.A01(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:779:0x15ec, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0252, code lost:
        if (r3.hasNext() == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x15f3, code lost:
        throw X.AnonymousClass001.A09("Cannot pop without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:782:0x15f4, code lost:
        r3 = r11.A00;
        r6 = X.C36401kF.A0s(r3, 0);
        r1 = X.C90494aF.A0k(r3, 1);
        r5 = A01(r0);
        r4 = X.C90504aG.A0l("params", A08(r1));
        r3 = X.C90474aD.A0q(r15.A0a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x1616, code lost:
        if (r3.hasNext() == false) goto L_0x1640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x1618, code lost:
        r3.next();
        X.AnonymousClass00C.A0D(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:786:0x1624, code lost:
        if (X.AnonymousClass098.A07(r6, "com.bloks.www.csf", false) == false) goto L_0x1612;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x1626, code lost:
        X.AnonymousClass00C.A0D(r5, 0);
        r1 = X.C36431kI.A0D();
        r1.setClassName(r5, "com.whatsapp.inappsupport.ui.SupportBloksActivity");
        r1.putExtra("screen_name", r6);
        r1.putExtra("screen_params", r4);
        r5.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:788:0x163f, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:789:0x1640, code lost:
        r5.startActivity(com.whatsapp.wabloks.ui.WaBloksActivity.A07(r5, r6, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0254, code lost:
        r1 = X.AnonymousClass000.A11(r3);
        X.C36421kH.A1N(r5);
        r5.append(X.C90494aF.A0f(r1));
        r5.append(" : ");
        r1 = r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x1647, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:791:0x1648, code lost:
        A01(r0).startActivity(X.C36331k8.A04(X.AnonymousClass6MO.A02(r11, 0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x1657, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:793:0x1658, code lost:
        r5 = r11.A00;
        r4 = X.C36351kA.A06(r5, 0);
        r0 = X.C36351kA.A06(r5, 1);
        r5.get(2);
        r15.A06((X.C158057fj) null, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x1668, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:795:0x1669, code lost:
        r6 = r11.A00;
        r7 = X.C36401kF.A0s(r6, 0);
        r10 = X.C36351kA.A06(r6, 1);
        r1 = X.C36351kA.A06(r6, 2);
        r0 = X.C90494aF.A0k(r6, 3);
        r12 = X.C36351kA.A06(r6, 4);
        r8 = (java.util.ArrayList) r6.get(5);
        r9 = A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x168b, code lost:
        r9 = r11.A00;
        r5 = X.C36401kF.A0s(r9, 0);
        r13 = X.C36401kF.A0s(r9, 1);
        r3 = X.C36401kF.A0s(r9, 2);
        r4 = java.lang.Boolean.TRUE.equals(r9.get(3));
        r1 = X.C36401kF.A0s(r9, 4);
        r6 = A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x16ad, code lost:
        if ((r6 instanceof X.C225014r) != false) goto L_0x16b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x16af, code lost:
        r0 = "[Bloks][bk.action.wa.spam.ReportSpam] activity doesn't implement DialogInterface";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:799:0x16b1, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x026d, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0035, code lost:
        if (r1.A05() == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x16b4, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x16b5, code lost:
        r7 = X.C36421kH.A0N(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:802:0x16b9, code lost:
        if (r7 != null) goto L_0x16be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x16bb, code lost:
        r0 = "[Bloks][bk.action.wa.spam.ReportSpam] failed to parse chat jid from string";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x16be, code lost:
        r0 = com.whatsapp.jid.UserJid.Companion;
        r8 = r0.A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:805:0x16c4, code lost:
        if (r8 != null) goto L_0x16ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:806:0x16c6, code lost:
        r8 = r0.A02(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:808:0x16ce, code lost:
        if (android.text.TextUtils.isEmpty(r3) == false) goto L_0x16ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:809:0x16d0, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x026f, code lost:
        if (r1 != null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x16d1, code lost:
        X.C36331k8.A1F(new X.C49762je((X.C225014r) r6, r7, r8, r9, r15.A04, r15.A0O, r15.A0J, r13), (X.C19770wU) r15.A0b.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:811:0x16e9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:812:0x16ea, code lost:
        r9 = new X.C64933Qa(r7, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:813:0x16f0, code lost:
        r5 = r11.A00;
        r7 = X.C36401kF.A0s(r5, 0);
        r10 = X.C36351kA.A06(r5, 1);
        r1 = r5.get(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:814:0x1700, code lost:
        if ((r1 instanceof java.lang.Boolean) == false) goto L_0x1729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:815:0x1702, code lost:
        r1 = X.AnonymousClass000.A1X(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:816:0x1706, code lost:
        r0 = X.C90494aF.A0k(r5, 3);
        r8 = (java.util.ArrayList) r5.get(4);
        r9 = A08(r0);
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:817:0x1715, code lost:
        ((X.C21010yW) r15.A0c.get()).Bly(X.C110075a5.A00(r7, r8, r9, r10, X.C90494aF.A06(r1), r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:818:0x1728, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:819:0x1729, code lost:
        r1 = X.AnonymousClass000.A0I(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0271, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:820:0x172e, code lost:
        r3 = r11.A00;
        r11 = A07(X.C90504aG.A0K(r3, 0));
        r0 = X.C90494aF.A0k(r3, 1);
        r4 = X.C36351kA.A06(r3, 3);
        r3 = A08(r0);
        r6 = (X.C120315rJ) r15.A0Z.get();
        r6.A00.A03(new X.C134906bn(X.C36371kC.A07(r4), "PRELOAD", false), new X.AnonymousClass71I(r6, r11), true, r11, X.C90504aG.A0l("params", r3), (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:821:0x176c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:822:0x176d, code lost:
        r1 = r11.A00;
        r4 = (X.AnonymousClass6XK) r1.get(0);
        r3 = (X.C1271967i) r1.get(2);
        X.C133266Xn.A01(r3).A06(r4, (java.util.Map) null);
        A02(r3, r0, X.AnonymousClass5Z6.A00(r3, r0, r4.A01)).create().show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:0x1793, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:824:0x1794, code lost:
        r3 = r11.A00;
        r4 = A07(X.C90504aG.A0K(r3, 0));
        r0 = X.C90504aG.A0l("params", A08(X.C90494aF.A0k(r3, 1)));
        X.AnonymousClass00C.A0D(r4, 0);
        ((X.C131616Pt) r15.A0C.get()).A03(new X.AnonymousClass5OH((X.AnonymousClass6MZ) r15.A0D.get(), r4, r0), "PRELOAD");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x17c9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x17ca, code lost:
        r9 = X.AnonymousClass6MO.A01(r11, r0);
        X.AnonymousClass00C.A0E(r9, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r9 = (X.C1271967i) r9;
        r13 = X.AnonymousClass6MO.A03(r11, 1);
        r3 = X.AnonymousClass6MO.A00(r11, 2);
        java.util.Objects.requireNonNull(r3);
        r3 = X.C90484aE.A0C(r3, "null cannot be cast to non-null type kotlin.Number");
        r4 = X.AnonymousClass6MO.A00(r11, 3);
        java.util.Objects.requireNonNull(r4);
        r12 = X.C90484aE.A0C(r4, "null cannot be cast to non-null type kotlin.Number");
        r4 = r11.A00;
        r6 = X.C90464aC.A0H(r4, 4);
        r4 = X.C90464aC.A0H(r4, 5);
        r14 = r9.A00;
        r10 = new X.AnonymousClass67I(r9, r0, r6, r4);
        r11 = new X.C116705l1(r15);
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:827:0x1808, code lost:
        if (r12 <= 0) goto L_0x1941;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:828:0x180a, code lost:
        if (r3 <= 0) goto L_0x1941;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0272, code lost:
        r5.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:830:?, code lost:
        r0 = X.C133036Wk.A01(r13);
        r4 = r0.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:0x1814, code lost:
        if (r4 != null) goto L_0x181c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:832:0x1816, code lost:
        r10.A01(X.C023109s.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:833:0x181b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x181c, code lost:
        r17 = X.C90524aI.A0S(r4);
        r4 = X.C203859oz.A0P;
        r5 = new X.C203859oz(r17.getCanonicalPath()).A0Y(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x1832, code lost:
        if (r5 == 6) goto L_0x1838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:837:0x1836, code lost:
        if (r5 != 8) goto L_0x183a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:838:0x1838, code lost:
        r9 = r3;
        r3 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:839:0x183a, code lost:
        r6 = r14.getContentResolver().openInputStream(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0276, code lost:
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:840:0x1842, code lost:
        if (r6 != null) goto L_0x184a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:841:0x1844, code lost:
        r10.A01(X.C023109s.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:842:0x1849, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:844:?, code lost:
        r4 = new android.graphics.BitmapFactory.Options();
        r4.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(r6, (android.graphics.Rect) null, r4);
        r12 = new android.graphics.Rect(0, 0, r4.outWidth, r4.outHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:?, code lost:
        r6.close();
        r5 = r12.width();
        r4 = r12.height();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x1868, code lost:
        if (r5 <= 0) goto L_0x1931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:848:0x186a, code lost:
        if (r4 <= 0) goto L_0x1931;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:849:0x186c, code lost:
        if (r5 > r3) goto L_0x1874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x027b, code lost:
        r3 = r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:850:0x186e, code lost:
        if (r4 > r9) goto L_0x1874;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x1870, code lost:
        r10.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1873, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:853:0x1874, code lost:
        r8 = new android.graphics.Rect(0, 0, r3, r9);
        r8 = java.lang.Math.max((((double) r12.width()) * 1.0d) / ((double) r8.width()), (((double) r12.height()) * 1.0d) / ((double) r8.height()));
        r8 = new android.graphics.Rect(0, 0, (int) (((double) r12.width()) / r8), (int) (((double) r12.height()) / r8));
        r6 = r14.getContentResolver().openInputStream(r0);
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:854:0x18b3, code lost:
        if (r6 == null) goto L_0x192b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:856:?, code lost:
        r4 = android.graphics.BitmapFactory.decodeStream(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:857:0x18b9, code lost:
        if (r4 == null) goto L_0x18c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:858:0x18bb, code lost:
        r5 = android.graphics.Bitmap.createScaledBitmap(r4, r8.width(), r8.height(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0283, code lost:
        switch(r4.hashCode()) {
            case 97: goto L_0x0293;
            case 100: goto L_0x029f;
            case 101: goto L_0x02a2;
            case 105: goto L_0x02ab;
            case 118: goto L_0x02b7;
            case 119: goto L_0x02c0;
            default: goto L_0x0286;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:860:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:861:0x18ca, code lost:
        if (r5 == null) goto L_0x192b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:862:0x18cc, code lost:
        r3 = r11.A00;
        r1 = X.AnonymousClass000.A0u();
        X.C36351kA.A1K(java.util.UUID.randomUUID(), r1);
        r4 = ((X.C20690y0) r3.A0P.get()).A0X(X.AnonymousClass000.A0q(".jpg", r1));
        r3 = X.C90524aI.A0W(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:864:?, code lost:
        r5.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, r3);
        r3.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:866:?, code lost:
        r3.close();
        r3 = new X.C203859oz(r4.getCanonicalPath());
        r0 = new X.C203859oz(r17.getCanonicalPath()).A0Y(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:867:0x1912, code lost:
        if (r0 == 0) goto L_0x191e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x1914, code lost:
        r3.A0b("Orientation", java.lang.String.valueOf(r0));
        r3.A0a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:869:0x191e, code lost:
        r10.A00(android.net.Uri.fromFile(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0286, code lost:
        X.C36321k7.A1P("[Bloks logging] incorrect level: ", r4, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:870:0x1925, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:871:0x1926, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:873:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:875:?, code lost:
        r10.A01(X.C023109s.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:876:0x1930, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:877:0x1931, code lost:
        r10.A01(X.C023109s.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:878:0x1936, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x1937, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x028f, code lost:
        com.whatsapp.util.Log.e(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:881:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x193c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:884:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:885:0x1940, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x1941, code lost:
        r10.A01(X.C023109s.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x1946, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x1947, code lost:
        r0 = X.C023109s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0292, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x194a, code lost:
        r0 = X.C023109s.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:892:0x194d, code lost:
        r0 = X.C023109s.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:894:0x194f, code lost:
        r10.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:895:0x1952, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:896:0x1953, code lost:
        r7 = X.AnonymousClass6MO.A01(r11, r0);
        X.AnonymousClass00C.A0E(r7, "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext");
        r8 = X.AnonymousClass6MO.A00(r11, 1);
        java.util.Objects.requireNonNull(r8);
        X.C90494aF.A10(r8);
        r1 = r11.A00;
        r6 = new X.AnonymousClass63O((X.C1271967i) r7, r0, X.C90464aC.A0H(r1, 2), X.C90464aC.A0H(r1, 3));
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:897:0x1979, code lost:
        if (r1 == null) goto L_0x19a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:0x197b, code lost:
        r5 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:899:0x197d, code lost:
        if (r5 == null) goto L_0x19a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        r1.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:900:0x197f, code lost:
        r7 = r5.getPackageManager();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:901:0x1983, code lost:
        if (r7 == null) goto L_0x19a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:902:0x1985, code lost:
        r4 = "front".equals(r8);
        r3 = r7.hasSystemFeature("android.hardware.camera.front");
        r1 = r7.hasSystemFeature("android.hardware.camera");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:903:0x1997, code lost:
        if (r4 == false) goto L_0x19a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:904:0x1999, code lost:
        if (r3 != false) goto L_0x19a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:905:0x199b, code lost:
        r0 = X.C023109s.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:906:0x199d, code lost:
        r6.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:907:0x19a0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:908:0x19a1, code lost:
        if (r1 != false) goto L_0x19a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:909:0x19a4, code lost:
        r0 = X.C023109s.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0299, code lost:
        if (r4.equals("a") == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:910:0x19a7, code lost:
        r4 = A01(r0);
        X.AnonymousClass00C.A08(r4);
        r15.A04(r4, new X.C143316qL(r4, r5, r6, r15), new java.lang.String[]{"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:911:0x19c0, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:913:0x19c5, code lost:
        return com.bloks.actions.cds.bkactioncdsupdatebackbuttonoverride.BKBloksActionCdsUpdateBackButtonOverrideImpl.evaluate(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:914:0x19c6, code lost:
        return "CONSUMER";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:916:0x19cd, code lost:
        return A05(r0, r11, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:918:0x19d2, code lost:
        return X.C36411kG.A0t();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x029b, code lost:
        com.whatsapp.util.Log.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:920:0x19d7, code lost:
        return A05(r0, r11, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:921:0x19d8, code lost:
        r0 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:922:0x19ee, code lost:
        return java.lang.Boolean.valueOf(X.C36361kB.A1Z(X.C36401kF.A0s(r0, 0), java.util.regex.Pattern.compile(X.C36401kF.A0s(r0, 1))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:923:0x19ef, code lost:
        r5 = r11.A00;
        r4 = X.C36401kF.A0s(r5, 0);
        r3 = X.C36421kH.A06(r5, 1);
        r2 = new java.lang.String[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:924:0x19fb, code lost:
        if (r7 >= r3) goto L_0x1a07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:0x19fd, code lost:
        r1 = r7 + 1;
        r2[r7] = r5.get(r1);
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:927:0x1a0b, code lost:
        return java.text.MessageFormat.format(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:928:0x1a0c, code lost:
        r3 = X.AnonymousClass6MO.A02(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x029e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:930:?, code lost:
        java.lang.Integer.parseInt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:931:0x1a14, code lost:
        X.C36321k7.A1P("NumberUtil/Invalid long value:", r3, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:935:0x1a25, code lost:
        r0 = r11.A00;
        r3 = X.C36401kF.A0s(r0, 0);
        r2 = (java.util.AbstractList) r0.get(1);
        r1 = new java.lang.String[r2.size()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:937:0x1a3b, code lost:
        if (r7 >= r2.size()) goto L_0x1a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:938:0x1a3d, code lost:
        r1[r7] = r2.get(r7);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029f, code lost:
        r0 = "d";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:940:0x1a4a, code lost:
        return java.text.MessageFormat.format(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:941:0x1a4b, code lost:
        r8 = r11.A00;
        r3 = X.C36401kF.A0s(r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:943:?, code lost:
        r4 = java.lang.Long.parseLong(r3) * 1000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:944:0x1a5b, code lost:
        X.C36321k7.A1P("NumberUtil/Invalid long value:", r3, X.AnonymousClass000.A0u());
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02a8, code lost:
        if (r4.equals("e") != false) goto L_0x028f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:961:0x1ac0, code lost:
        r4 = java.lang.Double.valueOf(java.lang.Math.ceil(r2 / r0)).longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:965:0x1aed, code lost:
        return ((X.C1258161j) r15.A0G.get()).A00(X.C36371kC.A0e((X.C19730wQ) r15.A0R.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:967:0x1afc, code lost:
        return ((X.C29071Vf) r15.A0U.get()).BFs().A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:969:0x1b03, code lost:
        throw X.AnonymousClass001.A09("Cannot unwind without an existing bottom sheet.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:970:0x1b04, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:973:0x1b0a, code lost:
        throw new X.C108705Uo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:974:0x1b0b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:975:0x1b0c, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:976:0x1b12, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:977:0x1b13, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:978:0x1b16, code lost:
        r0 = r0.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:979:0x1b18, code lost:
        r0.markerEnd(r7, r9, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b1, code lost:
        if (r4.equals("i") == false) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:980:0x1b1b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:981:0x1b1c, code lost:
        r1 = r15.A03;
        r0 = r1.A00;
        r4 = X.AnonymousClass61J.A00(r0, r8, r5);
        r5 = X.C122885va.A00(r0, r5);
        r3 = X.C90514aH.A0h(r1.A01);
        r4 = new X.C98074qp(r3.A00, r3, java.lang.Integer.valueOf(r4), r5);
        r4.pointEditor(r6);
        r5 = X.C36371kC.A10(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:983:0x1b44, code lost:
        if (r5.hasNext() == false) goto L_0x1bde;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:984:0x1b46, code lost:
        r0 = X.AnonymousClass000.A11(r5);
        r3 = X.C90494aF.A0f(r0);
        r1 = r0.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:985:0x1b54, code lost:
        if ((r1 instanceof java.lang.String) == false) goto L_0x1b5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:986:0x1b56, code lost:
        r1 = (java.lang.String) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:987:0x1b58, code lost:
        r4.addPointData(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:989:0x1b5e, code lost:
        if ((r1 instanceof java.lang.Integer) == false) goto L_0x1b68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02b3, code lost:
        com.whatsapp.util.Log.i(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:990:0x1b60, code lost:
        r4.addPointData(r3, X.AnonymousClass000.A0I(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:992:0x1b6a, code lost:
        if ((r1 instanceof java.lang.Long) == false) goto L_0x1b74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:993:0x1b6c, code lost:
        r4.addPointData(r3, X.C36431kI.A09(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:995:0x1b76, code lost:
        if ((r1 instanceof java.lang.Double) == false) goto L_0x1b80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:996:0x1b78, code lost:
        r4.addPointData(r3, X.C90504aG.A01(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:998:0x1b82, code lost:
        if ((r1 instanceof java.lang.Float) == false) goto L_0x1b8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:999:0x1b84, code lost:
        r4.addPointData(r3, X.C36441kJ.A03(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02b6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        throw X.AnonymousClass001.A0A("routeToNativeScreen");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B6u(X.AnonymousClass6MO r24, X.C115215iW r25, X.C124125xd r26) {
        /*
            r23 = this;
            r0 = r26
            X.4vP r0 = (X.C100674vP) r0
            r9 = r23
            X.6VK r15 = r9.A01
            r10 = r25
            java.lang.String r11 = r10.A00
            int r2 = r11.hashCode()
            r5 = 5
            r6 = 36
            r8 = 4
            r4 = 3
            r3 = 2
            r1 = 1
            r7 = 0
            switch(r2) {
                case -2140546951: goto L_0x0c71;
                case -2140338357: goto L_0x0c69;
                case -2068088578: goto L_0x0c61;
                case -2067649951: goto L_0x0c59;
                case -1838906086: goto L_0x0c51;
                case -1787809934: goto L_0x0c49;
                case -1655856867: goto L_0x0c41;
                case -1604504565: goto L_0x0c39;
                case -1578886175: goto L_0x0c30;
                case -1556410467: goto L_0x0c27;
                case -1507852311: goto L_0x0c1e;
                case -1481223638: goto L_0x0c15;
                case -1330718402: goto L_0x0c0c;
                case -1242219886: goto L_0x0c03;
                case -1221103914: goto L_0x0bfa;
                case -1182895194: goto L_0x0bf1;
                case -1174424168: goto L_0x0be7;
                case -1158334287: goto L_0x0bdd;
                case -1086615993: goto L_0x0bd3;
                case -1030847255: goto L_0x0bc9;
                case -1003291191: goto L_0x0bbf;
                case -996698686: goto L_0x0bb5;
                case -993097054: goto L_0x0bab;
                case -990185100: goto L_0x0ba1;
                case -979462773: goto L_0x0b97;
                case -962969547: goto L_0x0b8d;
                case -942664798: goto L_0x0b83;
                case -921635786: goto L_0x0b79;
                case -884670392: goto L_0x0b6f;
                case -809454050: goto L_0x0b65;
                case -782725013: goto L_0x0b5b;
                case -780036552: goto L_0x0b51;
                case -773489556: goto L_0x0b47;
                case -760967806: goto L_0x0b3d;
                case -746705348: goto L_0x0b33;
                case -703852509: goto L_0x0b29;
                case -647944134: goto L_0x0b1f;
                case -629460340: goto L_0x0b15;
                case -606722934: goto L_0x0b0b;
                case -563655164: goto L_0x0b01;
                case -541608891: goto L_0x0af7;
                case -534326238: goto L_0x0aed;
                case -531827055: goto L_0x0ae3;
                case -424766062: goto L_0x0ad9;
                case -363552265: goto L_0x0acf;
                case -347836657: goto L_0x0ac5;
                case -331653351: goto L_0x0abb;
                case -306959749: goto L_0x0ab1;
                case -300488230: goto L_0x0aa7;
                case -269742372: goto L_0x0a9d;
                case -224564602: goto L_0x0a93;
                case -188753299: goto L_0x0a89;
                case -161320099: goto L_0x0a7f;
                case -149567034: goto L_0x0a75;
                case -136229627: goto L_0x0a6b;
                case -78052800: goto L_0x0a61;
                case -58496533: goto L_0x0a57;
                case -26836955: goto L_0x0a4d;
                case 3413278: goto L_0x0a43;
                case 5923458: goto L_0x0a39;
                case 136195447: goto L_0x0a2f;
                case 156743102: goto L_0x0a25;
                case 227600558: goto L_0x0a1b;
                case 243158640: goto L_0x0a11;
                case 313766265: goto L_0x0a07;
                case 361006941: goto L_0x09fd;
                case 458561021: goto L_0x09f3;
                case 538167952: goto L_0x09e9;
                case 573843845: goto L_0x09df;
                case 598814056: goto L_0x09d5;
                case 610178701: goto L_0x09cb;
                case 683144274: goto L_0x09c1;
                case 710140428: goto L_0x09b7;
                case 840594967: goto L_0x09ad;
                case 878253942: goto L_0x09a3;
                case 889592555: goto L_0x0999;
                case 941474804: goto L_0x098f;
                case 959076350: goto L_0x0985;
                case 1002037470: goto L_0x097b;
                case 1073657643: goto L_0x0971;
                case 1093292105: goto L_0x0967;
                case 1172555497: goto L_0x095d;
                case 1179677309: goto L_0x0953;
                case 1246727742: goto L_0x0949;
                case 1281868444: goto L_0x093f;
                case 1293733961: goto L_0x0935;
                case 1323560766: goto L_0x092b;
                case 1351005683: goto L_0x0921;
                case 1418508999: goto L_0x0917;
                case 1457845398: goto L_0x090d;
                case 1559677690: goto L_0x0903;
                case 1593718455: goto L_0x08f9;
                case 1613528829: goto L_0x08ef;
                case 1643041589: goto L_0x08e5;
                case 1703102103: goto L_0x08db;
                case 1727518169: goto L_0x08d1;
                case 1856118462: goto L_0x08c7;
                case 1866424912: goto L_0x08bd;
                case 1914861328: goto L_0x08b3;
                case 2085194283: goto L_0x08a9;
                case 2094846105: goto L_0x089f;
                default: goto L_0x001b;
            }
        L_0x001b:
            r12 = -1
        L_0x001c:
            r2 = 0
            r11 = r24
            switch(r12) {
                case 0: goto L_0x0ee6;
                case 1: goto L_0x0e21;
                case 2: goto L_0x1794;
                case 3: goto L_0x176d;
                case 4: goto L_0x172e;
                case 5: goto L_0x0d97;
                case 6: goto L_0x19d3;
                case 7: goto L_0x071e;
                case 8: goto L_0x06f7;
                case 9: goto L_0x06c6;
                case 10: goto L_0x0638;
                case 11: goto L_0x1aee;
                case 12: goto L_0x05f8;
                case 13: goto L_0x16f0;
                case 14: goto L_0x0d78;
                case 15: goto L_0x05d8;
                case 16: goto L_0x0028;
                case 17: goto L_0x168b;
                case 18: goto L_0x1669;
                case 19: goto L_0x1a4b;
                case 20: goto L_0x0d5c;
                case 21: goto L_0x07e1;
                case 22: goto L_0x058b;
                case 23: goto L_0x1658;
                case 24: goto L_0x0028;
                case 25: goto L_0x0d12;
                case 26: goto L_0x0178;
                case 27: goto L_0x0545;
                case 28: goto L_0x0c94;
                case 29: goto L_0x1648;
                case 30: goto L_0x04e5;
                case 31: goto L_0x1a25;
                case 32: goto L_0x0c8c;
                case 33: goto L_0x1953;
                case 34: goto L_0x04c4;
                case 35: goto L_0x04a6;
                case 36: goto L_0x0475;
                case 37: goto L_0x1a0c;
                case 38: goto L_0x15f4;
                case 39: goto L_0x1585;
                case 40: goto L_0x0028;
                case 41: goto L_0x153d;
                case 42: goto L_0x1648;
                case 43: goto L_0x07d6;
                case 44: goto L_0x0460;
                case 45: goto L_0x150f;
                case 46: goto L_0x043e;
                case 47: goto L_0x1473;
                case 48: goto L_0x03bb;
                case 49: goto L_0x144e;
                case 50: goto L_0x1423;
                case 51: goto L_0x140e;
                case 52: goto L_0x19ce;
                case 53: goto L_0x1399;
                case 54: goto L_0x1383;
                case 55: goto L_0x0028;
                case 56: goto L_0x0766;
                case 57: goto L_0x133f;
                case 58: goto L_0x19c9;
                case 59: goto L_0x037c;
                case 60: goto L_0x0344;
                case 61: goto L_0x030c;
                case 62: goto L_0x16f0;
                case 63: goto L_0x074f;
                case 64: goto L_0x19c6;
                case 65: goto L_0x0c8c;
                case 66: goto L_0x0d12;
                case 67: goto L_0x12d9;
                case 68: goto L_0x1473;
                case 69: goto L_0x1270;
                case 70: goto L_0x1ad5;
                case 71: goto L_0x0c7c;
                case 72: goto L_0x125e;
                case 73: goto L_0x0153;
                case 74: goto L_0x0c8c;
                case 75: goto L_0x0837;
                case 76: goto L_0x17ca;
                case 77: goto L_0x02cc;
                case 78: goto L_0x115b;
                case 79: goto L_0x0229;
                case 80: goto L_0x0028;
                case 81: goto L_0x1148;
                case 82: goto L_0x19c1;
                case 83: goto L_0x01f2;
                case 84: goto L_0x19ef;
                case 85: goto L_0x0028;
                case 86: goto L_0x0028;
                case 87: goto L_0x0029;
                case 88: goto L_0x1104;
                case 89: goto L_0x00d3;
                case 90: goto L_0x0638;
                case 91: goto L_0x0041;
                case 92: goto L_0x108d;
                case 93: goto L_0x01a6;
                case 94: goto L_0x105a;
                case 95: goto L_0x1026;
                case 96: goto L_0x19d8;
                case 97: goto L_0x0028;
                case 98: goto L_0x100e;
                case 99: goto L_0x07f1;
                case 100: goto L_0x0fe2;
                default: goto L_0x0022;
            }
        L_0x0022:
            X.7fJ r1 = r9.A00
            java.lang.Object r2 = r1.B6u(r11, r10, r0)
        L_0x0028:
            return r2
        L_0x0029:
            r11.A04(r7)
            A01(r0)
            X.0v5 r1 = r15.A01
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0028
            r1.A02()
            java.lang.String r0 = "routeToNativeScreen"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0041:
            X.67i r3 = r0.A00
            java.util.List r0 = r11.A00
            java.lang.String r5 = X.C36401kF.A0s(r0, r7)
            r0.get(r1)
            android.content.Context r0 = r3.A00
            X.AnonymousClass00C.A0D(r0, r7)
            X.AnonymousClass00C.A0D(r5, r1)
            android.app.Activity r0 = X.C129306Gj.A00(r0)
            java.util.List r7 = X.C129306Gj.A01(r0)
            if (r7 == 0) goto L_0x00ac
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00ac
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            int r0 = X.C36431kI.A07(r7)
            if (r0 < 0) goto L_0x00ac
        L_0x006e:
            int r4 = r0 + -1
            java.lang.Object r3 = r7.get(r0)
            X.02E r3 = (X.AnonymousClass02E) r3
            boolean r0 = r3 instanceof com.whatsapp.bloks.components.BkCdsBottomSheetFragment
            if (r0 == 0) goto L_0x00a8
            boolean r0 = r3 instanceof androidx.fragment.app.DialogFragment
            if (r0 == 0) goto L_0x00a8
            androidx.fragment.app.DialogFragment r3 = (androidx.fragment.app.DialogFragment) r3
            r6.add(r3)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r3 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r3
            boolean r0 = r3.A1i(r5)
            if (r0 == 0) goto L_0x00a8
        L_0x008b:
            boolean r0 = X.C36411kG.A1a(r6)
            if (r0 == 0) goto L_0x1afd
            r4 = 0
            int r3 = X.C90504aG.A0C(r6)
        L_0x0096:
            if (r4 >= r3) goto L_0x00b1
            java.lang.Object r0 = r6.get(r4)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x00a5
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            r0.A1h(r2)
        L_0x00a5:
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00a8:
            if (r4 < 0) goto L_0x00ac
            r0 = r4
            goto L_0x006e
        L_0x00ac:
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            goto L_0x008b
        L_0x00b1:
            int r0 = X.C90504aG.A0C(r6)
            java.lang.Object r0 = r6.get(r0)
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            if (r0 == 0) goto L_0x0028
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            X.6j8 r4 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0)
            android.content.Context r3 = r0.A0a()
            java.util.Deque r0 = r4.A0A
            int r0 = r0.size()
            if (r0 == r1) goto L_0x0028
            r4.A04(r3, r5)
            return r2
        L_0x00d3:
            android.app.Activity r5 = A01(r0)
            X.7sb r0 = new X.7sb
            r0.<init>(r11, r3)
            X.6lc r0 = r0.B7w()
            X.5l0 r4 = new X.5l0
            r4.<init>(r0)
            X.005 r0 = r15.A0B     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.Object r0 = r0.get()     // Catch:{ 5Uo -> 0x1b0b }
            X.6MP r0 = (X.AnonymousClass6MP) r0     // Catch:{ 5Uo -> 0x1b0b }
            X.6JY r3 = r0.A00(r5)     // Catch:{ 5Uo -> 0x1b0b }
            X.01I r5 = (X.AnonymousClass01I) r5     // Catch:{ 5Uo -> 0x1b0b }
            X.6lc r1 = r4.A00     // Catch:{ 5Uo -> 0x1b0b }
            r0 = 35
            java.lang.Object r0 = X.C140456lc.A0I(r1, r0)     // Catch:{ 5Uo -> 0x1b0b }
            if (r0 == 0) goto L_0x1b05
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.String r0 = "bottom_sheet_fragment_tag"
            r1.append(r0)     // Catch:{ 5Uo -> 0x1b0b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ 5Uo -> 0x1b0b }
            X.C36351kA.A1K(r0, r1)     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.String r1 = r1.toString()     // Catch:{ 5Uo -> 0x1b0b }
            X.005 r0 = r3.A00     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.Object r0 = r0.get()     // Catch:{ 5Uo -> 0x1b0b }
            X.6Pt r0 = (X.C131616Pt) r0     // Catch:{ 5Uo -> 0x1b0b }
            X.C18740tg.A06(r4)     // Catch:{ 5Uo -> 0x1b0b }
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r0 = com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A00(r4, r0, r1, r7)     // Catch:{ 5Uo -> 0x1b0b }
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment r4 = new com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment     // Catch:{ 5Uo -> 0x1b0b }
            r4.<init>()     // Catch:{ 5Uo -> 0x1b0b }
            X.00I r0 = X.C36441kJ.A0W(r0, r1)     // Catch:{ 5Uo -> 0x1b0b }
            r4.A01 = r0     // Catch:{ 5Uo -> 0x1b0b }
            boolean r0 = r4.A15()     // Catch:{ 5Uo -> 0x1b0b }
            if (r0 != 0) goto L_0x0028
            X.01z r3 = r5.getSupportFragmentManager()     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.StringBuilder r1 = X.C36421kH.A0f(r3)     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.String r0 = "bottom_sheet_container_tag"
            r1.append(r0)     // Catch:{ 5Uo -> 0x1b0b }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ 5Uo -> 0x1b0b }
            X.C36351kA.A1K(r0, r1)     // Catch:{ 5Uo -> 0x1b0b }
            java.lang.String r0 = r1.toString()     // Catch:{ 5Uo -> 0x1b0b }
            r4.A1f(r3, r0)     // Catch:{ 5Uo -> 0x1b0b }
            java.util.Stack r0 = X.AnonymousClass6JY.A01     // Catch:{ 5Uo -> 0x1b0b }
            r0.push(r4)     // Catch:{ 5Uo -> 0x1b0b }
            goto L_0x1b04
        L_0x0153:
            android.app.Activity r1 = A01(r0)
            X.005 r0 = r15.A0B
            java.lang.Object r0 = r0.get()
            X.6MP r0 = (X.AnonymousClass6MP) r0
            r0.A00(r1)
            java.util.Stack r1 = X.AnonymousClass6JY.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0028
            java.lang.Object r0 = r1.peek()
            X.02E r0 = (X.AnonymousClass02E) r0
            X.01z r0 = r0.A0k()
            r0.A0V()
            return r2
        L_0x0178:
            r11.A04(r1)
            r11.A04(r3)
            r11.A04(r4)
            r11.A04(r8)
            r11.A04(r5)
            r0 = 6
            r11.A04(r0)
            r0 = 7
            r11.A04(r0)
            r0 = 8
            r11.A04(r0)
            X.0v5 r1 = r15.A02
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0028
            r1.A02()
            java.lang.String r0 = "handleFetchPriceAndBuy"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x01a6:
            java.util.List r3 = r11.A00
            java.lang.String r6 = X.C36401kF.A0s(r3, r7)
            java.lang.Object r3 = r3.get(r1)
            boolean r5 = X.AnonymousClass000.A1X(r3)
            X.67i r3 = r0.A00
            X.65A r3 = r3.A02
            android.util.SparseArray r4 = r3.A00()
            r3 = 2131428086(0x7f0b02f6, float:1.8477807E38)
            java.lang.Object r4 = r4.get(r3)
            android.app.ProgressDialog r4 = (android.app.ProgressDialog) r4
            android.app.Activity r3 = A01(r0)
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.isShowing()
            if (r0 == 0) goto L_0x01d4
            r4.dismiss()
        L_0x01d4:
            r4.setMessage(r6)
            r4.setIndeterminate(r1)
            r4.setCanceledOnTouchOutside(r7)
            if (r5 == 0) goto L_0x01ee
            r4.setCancelable(r1)
            X.7pw r0 = new X.7pw
            r0.<init>(r3, r15, r1)
            r4.setOnCancelListener(r0)
        L_0x01ea:
            r4.show()
            return r2
        L_0x01ee:
            r4.setCancelable(r7)
            goto L_0x01ea
        L_0x01f2:
            java.util.List r1 = r11.A00
            X.7ku r3 = X.AnonymousClass6JJ.A01(r1, r7)
            android.app.Activity r1 = A01(r0)
            r0 = 20
            X.7rQ r3 = X.C164197rQ.A00(r3, r0)
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.WaBloksBottomSheetActivity
            if (r0 == 0) goto L_0x020a
            r1.finish()
            return r2
        L_0x020a:
            X.005 r0 = r15.A0B
            java.lang.Object r0 = r0.get()
            X.6MP r0 = (X.AnonymousClass6MP) r0
            r0.A00(r1)
            java.util.Stack r1 = X.AnonymousClass6JY.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0028
            java.lang.Object r0 = r1.peek()
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment r0 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r0
            r0.A02 = r3
            r0.A1b()
            return r2
        L_0x0229:
            java.util.List r0 = r11.A00
            java.util.List r6 = java.util.Collections.unmodifiableList(r0)
            java.lang.String r0 = "[Bloks logging] "
            java.lang.StringBuilder r5 = X.C90524aI.A0i(r0)
            java.lang.String r4 = X.C36401kF.A0s(r6, r7)
            java.lang.String r0 = X.C36401kF.A0s(r6, r1)
            r5.append(r0)
            java.lang.Object r0 = r6.get(r3)
            if (r0 == 0) goto L_0x027b
            java.util.Map r0 = X.C90494aF.A0k(r6, r3)
            java.util.Iterator r3 = X.AnonymousClass000.A0y(r0)
        L_0x024e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x027b
            java.util.Map$Entry r1 = X.AnonymousClass000.A11(r3)
            X.C36421kH.A1N(r5)
            java.lang.String r0 = X.C90494aF.A0f(r1)
            r5.append(r0)
            java.lang.String r0 = " : "
            r5.append(r0)
            java.lang.Object r1 = r1.getValue()
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x0276
            if (r1 != 0) goto L_0x0276
            r0 = 0
        L_0x0272:
            r5.append(r0)
            goto L_0x024e
        L_0x0276:
            java.lang.String r0 = r1.toString()
            goto L_0x0272
        L_0x027b:
            java.lang.String r3 = r5.toString()
            int r0 = r4.hashCode()
            switch(r0) {
                case 97: goto L_0x0293;
                case 100: goto L_0x029f;
                case 101: goto L_0x02a2;
                case 105: goto L_0x02ab;
                case 118: goto L_0x02b7;
                case 119: goto L_0x02c0;
                default: goto L_0x0286;
            }
        L_0x0286:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[Bloks logging] incorrect level: "
            X.C36321k7.A1P(r0, r4, r1)
        L_0x028f:
            com.whatsapp.util.Log.e((java.lang.String) r3)
            return r2
        L_0x0293:
            java.lang.String r0 = "a"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0286
            com.whatsapp.util.Log.a((java.lang.String) r3)
            return r2
        L_0x029f:
            java.lang.String r0 = "d"
            goto L_0x02b9
        L_0x02a2:
            java.lang.String r0 = "e"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x028f
            goto L_0x0286
        L_0x02ab:
            java.lang.String r0 = "i"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0286
            com.whatsapp.util.Log.i((java.lang.String) r3)
            return r2
        L_0x02b7:
            java.lang.String r0 = "v"
        L_0x02b9:
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0028
            goto L_0x0286
        L_0x02c0:
            java.lang.String r0 = "w"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0286
            com.whatsapp.util.Log.w((java.lang.String) r3)
            return r2
        L_0x02cc:
            java.util.List r0 = r11.A00
            int r11 = X.C36351kA.A06(r0, r7)
            int r5 = X.C36351kA.A06(r0, r1)
            java.lang.String r10 = X.C36401kF.A0s(r0, r3)
            X.5rP r4 = r15.A03
            X.005 r0 = r4.A00
            int r9 = X.AnonymousClass61J.A00(r0, r5, r11)
            int r7 = X.C122885va.A00(r0, r11)
            X.005 r6 = r4.A01
            r6.get()
            long r4 = X.C90474aD.A0A(r9, r7)
            int r0 = X.C122885va.A01(r6, r11)
            if (r1 != r0) goto L_0x0301
            X.6yf r0 = X.C90514aH.A0h(r6)
            if (r10 == 0) goto L_0x1b16
            X.1UP r0 = r0.A05
        L_0x02fd:
            r0.flowEndCancel(r4, r10)
            return r2
        L_0x0301:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r6)
            if (r10 == 0) goto L_0x1b13
            X.5JT r0 = r0.A04
            goto L_0x02fd
        L_0x030c:
            java.util.List r0 = r11.A00
            int r5 = X.C36351kA.A06(r0, r7)
            int r8 = X.C36351kA.A06(r0, r1)
            java.lang.String r6 = X.C36401kF.A0s(r0, r3)
            java.util.Map r0 = X.C90494aF.A0k(r0, r4)
            if (r6 == 0) goto L_0x0028
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            if (r0 == 0) goto L_0x1b1c
            java.util.Iterator r4 = X.AnonymousClass000.A0y(r0)
        L_0x032a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x1b1c
            java.util.Map$Entry r3 = X.AnonymousClass000.A11(r4)
            java.lang.Object r0 = r3.getKey()
            java.lang.String r1 = r0.toString()
            java.lang.Object r0 = r3.getValue()
            r7.put(r1, r0)
            goto L_0x032a
        L_0x0344:
            java.util.List r0 = r11.A00
            int r7 = X.C36351kA.A06(r0, r7)
            int r4 = X.C36351kA.A06(r0, r1)
            X.5rP r5 = r15.A03
            X.005 r0 = r5.A00
            int r4 = X.AnonymousClass61J.A00(r0, r4, r7)
            int r0 = X.C122885va.A00(r0, r7)
            X.005 r6 = r5.A01
            r6.get()
            long r4 = X.C90474aD.A0A(r4, r0)
            int r0 = X.C122885va.A01(r6, r7)
            if (r1 != r0) goto L_0x0373
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.1UP r0 = r0.A05
        L_0x036f:
            r0.flowEndSuccess(r4)
            return r2
        L_0x0373:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.5JT r0 = r0.A04
            goto L_0x036f
        L_0x037c:
            java.lang.String r4 = X.AnonymousClass6MO.A02(r11, r7)
            android.app.Activity r5 = A01(r0)
            X.005 r0 = r15.A0T
            java.lang.Object r0 = r0.get()
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BA6()
            if (r0 == 0) goto L_0x0028
            android.content.Intent r3 = X.C36441kJ.A0H(r5, r0)
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03b2
            java.lang.String r1 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r0 = "payments:transaction"
            r3.putExtra(r1, r0)
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.paymentFBTxnId"
            r3.putExtra(r0, r4)
        L_0x03b2:
            java.lang.String r0 = "extra_transaction_id"
            r3.putExtra(r0, r4)
            r5.startActivity(r3)
            return r2
        L_0x03bb:
            java.util.List r4 = r11.A00
            X.6lc r5 = X.C90504aG.A0K(r4, r7)
            java.lang.Object r13 = r4.get(r1)
            X.6XK r13 = (X.AnonymousClass6XK) r13
            X.6lc r10 = X.C90504aG.A0K(r4, r3)
            if (r5 == 0) goto L_0x0028
            if (r13 == 0) goto L_0x0028
            if (r10 == 0) goto L_0x0028
            r3 = 43
            java.lang.Object r9 = X.C140456lc.A0I(r5, r3)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0028
            java.lang.String r16 = X.C140456lc.A0L(r5)
            if (r16 == 0) goto L_0x0028
            r4 = 40
            r3 = -1
            int r8 = r5.A0T(r4, r3)
            X.7ku r6 = X.C140456lc.A0E(r5)
            if (r6 == 0) goto L_0x043c
            X.68b r4 = X.C1273868b.A00()
            X.67i r3 = r0.A00
            X.6MO r3 = X.C1273868b.A05(r4, r3, r7)
            java.lang.Object r6 = X.AnonymousClass6JI.A00(r0, r3, r6)
            java.util.Map r6 = (java.util.Map) r6
        L_0x03fe:
            X.67i r4 = r0.A00
            X.6WB r3 = X.C133016Wg.A01(r4, r2, r10)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r10 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A05(r3, r9)
            X.65A r3 = r4.A02
            r10.A00 = r3
            X.5wn r3 = new X.5wn
            r3.<init>()
            r3.A01 = r9
            r3.A00 = r8
            r3.A04 = r6
            r3.A05 = r1
            X.6j9 r12 = new X.6j9
            r12.<init>(r3)
            X.5sw r3 = new X.5sw
            r3.<init>()
            r3.A01 = r13
            r3.A00 = r0
            X.6oJ r1 = new X.6oJ
            r1.<init>((X.C121315sw) r3)
            int r17 = A00(r5)
            android.app.Activity r11 = A01(r0)
            X.01I r11 = (X.AnonymousClass01I) r11
            r14 = r1
            r15 = r2
            X.C132876Vp.A02(r10, r11, r12, r13, r14, r15, r16, r17)
            return r2
        L_0x043c:
            r6 = r2
            goto L_0x03fe
        L_0x043e:
            java.util.List r0 = r11.A00
            java.util.Map r0 = X.C90494aF.A0k(r0, r7)
            java.util.HashMap r0 = A08(r0)
            java.lang.String r1 = X.AnonymousClass6VK.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0028
            X.005 r0 = r15.A0E
            java.lang.Object r0 = r0.get()
            X.5pE r0 = (X.C119095pE) r0
            java.util.HashMap r0 = r0.A01
            r0.remove(r1)
            return r2
        L_0x0460:
            java.util.List r0 = r11.A00
            java.util.Map r3 = X.C90494aF.A0k(r0, r7)
            java.lang.Object r1 = r0.get(r1)
            if (r3 == 0) goto L_0x0028
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0028
            java.lang.String r0 = "properties"
            goto L_0x04d8
        L_0x0475:
            java.util.List r4 = r11.A00
            java.util.Map r3 = X.C90494aF.A0k(r4, r7)
            X.33w r1 = X.AnonymousClass6JJ.A02(r0, r4, r1)
            java.util.HashMap r0 = A08(r3)
            java.lang.String r6 = X.AnonymousClass6VK.A01(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0028
            X.005 r0 = r15.A0E
            java.lang.Object r5 = r0.get()
            X.5pE r5 = (X.C119095pE) r5
            X.4vP r4 = r1.A00
            X.61h r3 = r5.A00
            X.7ku r0 = r1.A01
            X.6C8 r1 = new X.6C8
            r1.<init>(r4, r0, r3)
            java.util.HashMap r0 = r5.A01
            r0.put(r6, r1)
            return r2
        L_0x04a6:
            java.util.List r4 = r11.A00
            r4.get(r7)
            r4.get(r1)
            r4.get(r3)
            android.app.Activity r3 = A01(r0)
            X.005 r1 = r15.A0F
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0028
            r1.get()
            r3.getApplicationContext()
            return r2
        L_0x04c4:
            java.util.List r0 = r11.A00
            java.util.Map r3 = X.C90494aF.A0k(r0, r7)
            java.lang.Object r1 = r0.get(r1)
            if (r3 == 0) goto L_0x0028
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0028
            java.lang.String r0 = "children"
        L_0x04d8:
            java.util.Map r0 = X.C90514aH.A15(r0, r3)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0028
            return r0
        L_0x04e5:
            java.util.List r0 = r11.A00
            int r9 = X.C36351kA.A06(r0, r7)
            int r10 = X.C36351kA.A06(r0, r1)
            java.lang.Object r4 = r0.get(r3)
            X.7sb r0 = new X.7sb
            r0.<init>(r4, r7)
            r11 = -1
            java.lang.Object r5 = r0.A00
            X.6lc r5 = (X.C140456lc) r5
            java.lang.String r4 = X.C140456lc.A0J(r5)
            java.lang.String r0 = "cancel"
            boolean r7 = r0.equals(r4)
            java.lang.Object r8 = X.C140456lc.A0I(r5, r6)
            java.lang.String r8 = (java.lang.String) r8
            r0 = 38
            r5.A0T(r0, r11)
            X.5rP r5 = r15.A03
            X.005 r0 = r5.A00
            int r4 = X.AnonymousClass61J.A00(r0, r10, r9)
            int r0 = X.C122885va.A00(r0, r9)
            X.005 r6 = r5.A01
            r6.get()
            long r4 = X.C90474aD.A0A(r4, r0)
            int r0 = X.C122885va.A01(r6, r9)
            if (r1 != r0) goto L_0x053c
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.1UP r1 = r0.A05
        L_0x0533:
            X.66V r0 = new X.66V
            r0.<init>(r8, r7)
            r1.B7S(r0, r4)
            return r2
        L_0x053c:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.5JT r1 = r0.A04
            goto L_0x0533
        L_0x0545:
            java.util.List r0 = r11.A00
            int r6 = X.C36351kA.A06(r0, r7)
            int r5 = X.C36351kA.A06(r0, r1)
            java.lang.String r10 = X.C36401kF.A0s(r0, r3)
            java.lang.String r11 = X.C36401kF.A0s(r0, r4)
            X.5rP r4 = r15.A03
            X.005 r0 = r4.A00
            int r9 = X.AnonymousClass61J.A00(r0, r5, r6)
            int r8 = X.C122885va.A00(r0, r6)
            X.005 r7 = r4.A01
            r7.get()
            long r4 = X.C90474aD.A0A(r9, r8)
            int r0 = X.C122885va.A01(r7, r6)
            r6 = 87
            if (r1 != r0) goto L_0x0580
            X.6yf r0 = X.C90514aH.A0h(r7)
            if (r10 == 0) goto L_0x1be5
            X.1UP r0 = r0.A05
        L_0x057c:
            r0.flowMarkError(r4, r10, r11)
            return r2
        L_0x0580:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r7)
            if (r10 == 0) goto L_0x1be2
            X.5JT r0 = r0.A04
            goto L_0x057c
        L_0x058b:
            java.util.List r0 = r11.A00
            int r9 = X.C36351kA.A06(r0, r7)
            int r6 = X.C36351kA.A06(r0, r1)
            java.lang.String r8 = X.C36401kF.A0s(r0, r3)
            java.lang.Object r5 = r0.get(r4)
            r4 = 4
            X.7sb r0 = new X.7sb
            r0.<init>(r5, r4)
            if (r8 == 0) goto L_0x0028
            java.lang.Object r0 = r0.A00
            X.6lc r0 = (X.C140456lc) r0
            if (r0 == 0) goto L_0x05d6
            java.lang.String r7 = X.C140456lc.A0J(r0)
        L_0x05af:
            X.5rP r4 = r15.A03
            X.005 r0 = r4.A00
            int r6 = X.AnonymousClass61J.A00(r0, r6, r9)
            int r5 = X.C122885va.A00(r0, r9)
            X.005 r4 = r4.A01
            int r0 = X.C122885va.A01(r4, r9)
            if (r1 != r0) goto L_0x05cd
            X.6yf r0 = X.C90514aH.A0h(r4)
            X.0zE r0 = r0.A03
        L_0x05c9:
            r0.markerPoint((int) r5, (int) r6, (java.lang.String) r8, (java.lang.String) r7)
            return r2
        L_0x05cd:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r4)
            X.0zE r0 = r0.A02
            goto L_0x05c9
        L_0x05d6:
            r7 = 0
            goto L_0x05af
        L_0x05d8:
            java.lang.String r3 = X.AnonymousClass6MO.A02(r11, r7)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x05e8
            java.lang.String r0 = "WaExtensions/evaluate/bk.action.io.clipboard.SetString: text cannot be null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x05e8:
            X.005 r0 = r15.A0W
            java.lang.Object r0 = r0.get()
            X.0yb r0 = (X.C21060yb) r0
            android.content.ClipboardManager r1 = r0.A09()
            if (r1 == 0) goto L_0x0028
            goto L_0x1beb
        L_0x05f8:
            java.util.List r0 = r11.A00
            int r9 = X.C36351kA.A06(r0, r7)
            int r6 = X.C36351kA.A06(r0, r1)
            java.lang.String r7 = X.C36401kF.A0s(r0, r3)
            java.lang.String r8 = X.C36401kF.A0s(r0, r4)
            X.5rP r5 = r15.A03
            X.005 r0 = r5.A00
            int r4 = X.AnonymousClass61J.A00(r0, r6, r9)
            int r0 = X.C122885va.A00(r0, r9)
            X.005 r6 = r5.A01
            r6.get()
            long r4 = X.C90474aD.A0A(r4, r0)
            int r0 = X.C122885va.A01(r6, r9)
            if (r1 != r0) goto L_0x062f
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.1UP r0 = r0.A05
        L_0x062b:
            r0.flowEndFail(r4, r7, r8)
            return r2
        L_0x062f:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r6)
            X.5JT r0 = r0.A04
            goto L_0x062b
        L_0x0638:
            java.util.List r0 = r11.A00
            int r10 = X.C36351kA.A06(r0, r7)
            int r9 = X.C36351kA.A06(r0, r1)
            java.util.Map r4 = X.C90494aF.A0k(r0, r3)
            if (r4 == 0) goto L_0x0028
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0028
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r4)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
        L_0x0652:
            boolean r0 = r13.hasNext()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r4 = X.AnonymousClass000.A11(r13)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            java.lang.Object r0 = r4.getKey()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            if (r0 != 0) goto L_0x0664
            r8 = 0
            goto L_0x0668
        L_0x0664:
            java.lang.String r8 = r0.toString()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
        L_0x0668:
            java.lang.Object r0 = r4.getValue()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            if (r0 != 0) goto L_0x066f
            goto L_0x0674
        L_0x066f:
            java.lang.String r7 = r0.toString()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            goto L_0x0675
        L_0x0674:
            r7 = 0
        L_0x0675:
            if (r8 == 0) goto L_0x0652
            if (r7 == 0) goto L_0x0652
            X.5rP r4 = r15.A03     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.005 r0 = r4.A00     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            int r6 = X.AnonymousClass61J.A00(r0, r9, r10)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            int r5 = X.C122885va.A00(r0, r10)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.005 r12 = r4.A01     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.6yf r0 = X.C90514aH.A0h(r12)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.6Wm r4 = r0.A06     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.5va r0 = X.C133056Wm.A00(r4, r10)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            java.util.Map r0 = r0.A03     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            java.lang.Number r0 = X.C90524aI.A0b(r8, r0)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            if (r0 == 0) goto L_0x06a4
            int r0 = r0.intValue()     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            r11 = 2
            if (r3 == r0) goto L_0x06a5
            r11 = 1
            if (r1 != r0) goto L_0x06a4
            goto L_0x06a5
        L_0x06a4:
            r11 = -1
        L_0x06a5:
            X.5va r0 = X.C133056Wm.A00(r4, r10)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            int r4 = r0.A00     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            r0 = -1
            if (r4 == r0) goto L_0x0652
            if (r11 == r0) goto L_0x0652
            if (r4 == r3) goto L_0x06b5
            if (r11 == r3) goto L_0x06b5
            goto L_0x06bc
        L_0x06b5:
            X.6yf r0 = X.C90514aH.A0h(r12)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.0zE r0 = r0.A02     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            goto L_0x06c2
        L_0x06bc:
            X.6yf r0 = X.C90514aH.A0h(r12)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            X.0zE r0 = r0.A03     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
        L_0x06c2:
            r0.markerAnnotate((int) r5, (int) r6, (java.lang.String) r8, (java.lang.String) r7)     // Catch:{ ConcurrentModificationException -> 0x1bf9 }
            goto L_0x0652
        L_0x06c6:
            java.util.List r0 = r11.A00
            int r7 = X.C36351kA.A06(r0, r7)
            int r5 = X.C36351kA.A06(r0, r1)
            X.5rP r4 = r15.A03
            X.005 r0 = r4.A00
            int r6 = X.AnonymousClass61J.A00(r0, r5, r7)
            int r5 = X.C122885va.A00(r0, r7)
            X.005 r4 = r4.A01
            int r0 = X.C122885va.A01(r4, r7)
            if (r1 != r0) goto L_0x06ee
            X.6yf r0 = X.C90514aH.A0h(r4)
            X.0zE r0 = r0.A03
        L_0x06ea:
            r0.markerDrop(r5, r6)
            return r2
        L_0x06ee:
            if (r3 != r0) goto L_0x0028
            X.6yf r0 = X.C90514aH.A0h(r4)
            X.0zE r0 = r0.A02
            goto L_0x06ea
        L_0x06f7:
            java.lang.String r4 = X.AnonymousClass6MO.A02(r11, r7)
            android.app.Activity r3 = A01(r0)
            X.005 r0 = r15.A0T
            java.lang.Object r0 = r0.get()
            X.1EU r0 = (X.AnonymousClass1EU) r0
            X.B66 r0 = r0.A05()
            java.lang.Class r0 = r0.BGg()
            if (r0 == 0) goto L_0x0028
            android.content.Intent r1 = X.C36441kJ.A0H(r3, r0)
            java.lang.String r0 = "extra_transaction_id"
            r1.putExtra(r0, r4)
            r3.startActivity(r1)
            return r2
        L_0x071e:
            java.util.List r1 = r11.A00
            X.6lc r1 = X.C90504aG.A0K(r1, r7)
            X.7rR r5 = new X.7rR
            r5.<init>(r0, r7)
            android.app.Activity r3 = A01(r0)
            X.6qJ r4 = new X.6qJ
            r4.<init>(r0, r1, r9)
            X.5ON r15 = (X.AnonymousClass5ON) r15
            boolean r0 = r3 instanceof X.C159787jv
            if (r0 == 0) goto L_0x1bfd
            r1 = r3
            X.7jv r1 = (X.C159787jv) r1
            r1.Bwn(r4)
            r0 = 1
            r1.Bwo(r5, r4, r0)
            boolean r0 = r3 instanceof X.C162137o5
            if (r0 == 0) goto L_0x0028
            X.7o5 r3 = (X.C162137o5) r3
            com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity r3 = (com.whatsapp.wabloks.ui.WaFcsBottomSheetModalActivity) r3
            com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer r0 = r3.A03
            r0.A08 = r5
            return r2
        L_0x074f:
            X.67i r0 = r0.A00
            X.65A r0 = r0.A02
            android.util.SparseArray r1 = r0.A00()
            r0 = 2131428086(0x7f0b02f6, float:1.8477807E38)
            java.lang.Object r0 = r1.get(r0)
            android.app.Dialog r0 = (android.app.Dialog) r0
            if (r0 == 0) goto L_0x0028
            r0.dismiss()
            return r2
        L_0x0766:
            java.lang.Object r5 = X.AnonymousClass6MO.A01(r11, r0)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.AnonymousClass00C.A0E(r5, r3)
            X.67i r5 = (X.C1271967i) r5
            java.lang.Object r4 = X.AnonymousClass6MO.A00(r11, r1)
            java.util.Objects.requireNonNull(r4)
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.AnonymousClass00C.A0E(r4, r3)
            X.6lc r4 = (X.C140456lc) r4
            X.7ku r8 = X.C140456lc.A0E(r4)
            java.lang.Object r4 = X.C140456lc.A0I(r4, r6)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0798
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0798
            int r3 = r4.hashCode()
            switch(r3) {
                case -1367751899: goto L_0x07ac;
                case -196315310: goto L_0x07b7;
                case -94789412: goto L_0x07cb;
                default: goto L_0x0798;
            }
        L_0x0798:
            r6 = r2
        L_0x0799:
            if (r6 == 0) goto L_0x0028
            android.app.Activity r4 = A01(r0)
            java.lang.String[] r3 = new java.lang.String[r1]
            r3[r7] = r6
            X.6qK r1 = new X.6qK
            r1.<init>(r5, r0, r8)
            r15.A04(r4, r1, r3)
            return r2
        L_0x07ac:
            java.lang.String r3 = "camera"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0798
            java.lang.String r6 = "android.permission.CAMERA"
            goto L_0x0799
        L_0x07b7:
            java.lang.String r3 = "gallery"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0798
            int r4 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r4 < r3) goto L_0x07c8
            java.lang.String r6 = "android.permission.READ_MEDIA_IMAGES"
            goto L_0x0799
        L_0x07c8:
            java.lang.String r6 = "android.permission.WRITE_EXTERNAL_STORAGE"
            goto L_0x0799
        L_0x07cb:
            java.lang.String r3 = "read_contacts"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0798
            java.lang.String r6 = "android.permission.READ_CONTACTS"
            goto L_0x0799
        L_0x07d6:
            X.005 r0 = r15.A09
            java.lang.Object r0 = r0.get()
            X.5wz r0 = (X.C123725wz) r0
            X.00S r0 = r0.A02
            goto L_0x07eb
        L_0x07e1:
            X.005 r0 = r15.A09
            java.lang.Object r0 = r0.get()
            X.5wz r0 = (X.C123725wz) r0
            X.00S r0 = r0.A03
        L_0x07eb:
            if (r0 == 0) goto L_0x0028
            r0.invoke()
            return r2
        L_0x07f1:
            java.util.List r0 = r11.A00
            int r4 = X.C36351kA.A06(r0, r7)
            java.lang.String r7 = X.C36401kF.A0s(r0, r1)
            java.lang.String r2 = "null"
            r6 = -1
            int r5 = r7.hashCode()     // Catch:{ IllegalArgumentException -> 0x1c3f }
            r0 = -1808118735(0xffffffff943a4c31, float:-9.405626E-27)
            if (r5 == r0) goto L_0x0824
            r0 = -672261858(0xffffffffd7ee191e, float:-5.2358329E14)
            if (r5 == r0) goto L_0x081b
            r0 = 1729365000(0x67140408, float:6.989846E23)
            if (r5 != r0) goto L_0x082f
            java.lang.String r0 = "Boolean"
            boolean r0 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            if (r0 == 0) goto L_0x082f
            r6 = 2
            goto L_0x082f
        L_0x081b:
            java.lang.String r0 = "Integer"
            boolean r0 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            if (r0 == 0) goto L_0x082f
            goto L_0x082e
        L_0x0824:
            java.lang.String r0 = "String"
            boolean r0 = r7.equals(r0)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            if (r0 == 0) goto L_0x082f
            r6 = 0
            goto L_0x082f
        L_0x082e:
            r6 = 1
        L_0x082f:
            if (r6 == 0) goto L_0x1c32
            if (r6 == r1) goto L_0x1c21
            if (r6 != r3) goto L_0x0028
            goto L_0x1c10
        L_0x0837:
            java.util.List r3 = r11.A00
            java.lang.String r4 = X.C36401kF.A0s(r3, r7)
            java.lang.String r3 = X.C36401kF.A0s(r3, r1)
            android.app.Activity r0 = A01(r0)
            android.content.Intent r1 = r0.getIntent()
            if (r4 == 0) goto L_0x0028
            if (r3 == 0) goto L_0x0028
            int r0 = r3.hashCode()
            switch(r0) {
                case -891985903: goto L_0x0892;
                case 64711720: goto L_0x0881;
                case 97526364: goto L_0x086f;
                case 1958052158: goto L_0x085e;
                default: goto L_0x0854;
            }
        L_0x0854:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "WABLOKS: getIntentParameter type not supported: "
            X.C36321k7.A1P(r0, r3, r1)
            return r2
        L_0x085e:
            java.lang.String r0 = "integer"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0854
            int r0 = r1.getIntExtra(r4, r7)
            java.lang.String r2 = java.lang.Integer.toString(r0)
            return r2
        L_0x086f:
            java.lang.String r0 = "float"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0854
            r0 = 0
            float r0 = r1.getFloatExtra(r4, r0)
            java.lang.String r2 = java.lang.Float.toString(r0)
            return r2
        L_0x0881:
            java.lang.String r0 = "boolean"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0854
            boolean r0 = r1.getBooleanExtra(r4, r7)
            if (r0 == 0) goto L_0x1c46
            java.lang.String r2 = "1"
            return r2
        L_0x0892:
            java.lang.String r0 = "string"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0854
            java.lang.String r2 = r1.getStringExtra(r4)
            return r2
        L_0x089f:
            java.lang.String r2 = "wa.action.FinishActivityWithResult"
            boolean r2 = r11.equals(r2)
            r12 = 100
            goto L_0x0c78
        L_0x08a9:
            java.lang.String r2 = "wa.action.GetAbPropValue"
            boolean r2 = r11.equals(r2)
            r12 = 99
            goto L_0x0c78
        L_0x08b3:
            java.lang.String r2 = "bk.action.qpl.MarkerStartV2"
            boolean r2 = r11.equals(r2)
            r12 = 98
            goto L_0x0c78
        L_0x08bd:
            java.lang.String r2 = "wa.action.bloks.LaunchDialog"
            boolean r2 = r11.equals(r2)
            r12 = 97
            goto L_0x0c78
        L_0x08c7:
            java.lang.String r2 = "bk.action.string.MatchesRegex"
            boolean r2 = r11.equals(r2)
            r12 = 96
            goto L_0x0c78
        L_0x08d1:
            java.lang.String r2 = "bk.action.wa.wam.SendFieldstatWithSkipServerSampling"
            boolean r2 = r11.equals(r2)
            r12 = 95
            goto L_0x0c78
        L_0x08db:
            java.lang.String r2 = "bk.action.io.ShowSnackbar"
            boolean r2 = r11.equals(r2)
            r12 = 94
            goto L_0x0c78
        L_0x08e5:
            java.lang.String r2 = "wa.action.ShowProgressBar"
            boolean r2 = r11.equals(r2)
            r12 = 93
            goto L_0x0c78
        L_0x08ef:
            java.lang.String r2 = "bk.fx.action.media.OpenMediaPicker"
            boolean r2 = r11.equals(r2)
            r12 = 92
            goto L_0x0c78
        L_0x08f9:
            java.lang.String r2 = "bk.action.cds.UnwindToScreen"
            boolean r2 = r11.equals(r2)
            r12 = 91
            goto L_0x0c78
        L_0x0903:
            java.lang.String r2 = "bk.action.qpl.MarkerAnnotate"
            boolean r2 = r11.equals(r2)
            r12 = 90
            goto L_0x0c78
        L_0x090d:
            java.lang.String r2 = "bk.action.bloks.OpenBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 89
            goto L_0x0c78
        L_0x0917:
            java.lang.String r2 = "bk.action.wa.extension.ReportItem"
            boolean r2 = r11.equals(r2)
            r12 = 88
            goto L_0x0c78
        L_0x0921:
            java.lang.String r2 = "wa.action.RouteToNativeScreen"
            boolean r2 = r11.equals(r2)
            r12 = 87
            goto L_0x0c78
        L_0x092b:
            java.lang.String r2 = "wa.action.DismissDialog"
            boolean r2 = r11.equals(r2)
            r12 = 86
            goto L_0x0c78
        L_0x0935:
            java.lang.String r2 = "bk.action.io.DebugToast"
            boolean r2 = r11.equals(r2)
            r12 = 85
            goto L_0x0c78
        L_0x093f:
            java.lang.String r2 = "wa.action.FormatString"
            boolean r2 = r11.equals(r2)
            r12 = 84
            goto L_0x0c78
        L_0x0949:
            java.lang.String r2 = "bk.action.bloks.DismissBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 83
            goto L_0x0c78
        L_0x0953:
            java.lang.String r2 = "bk.action.cds.UpdateBackButtonOverride"
            boolean r2 = r11.equals(r2)
            r12 = 82
            goto L_0x0c78
        L_0x095d:
            java.lang.String r2 = "wa.action.PopScreen"
            boolean r2 = r11.equals(r2)
            r12 = 81
            goto L_0x0c78
        L_0x0967:
            java.lang.String r2 = "wa.action.GetFieldStatEventId"
            boolean r2 = r11.equals(r2)
            r12 = 80
            goto L_0x0c78
        L_0x0971:
            java.lang.String r2 = "wa.action.Logging"
            boolean r2 = r11.equals(r2)
            r12 = 79
            goto L_0x0c78
        L_0x097b:
            java.lang.String r2 = "wa.action.navigation.OpenContactInfo"
            boolean r2 = r11.equals(r2)
            r12 = 78
            goto L_0x0c78
        L_0x0985:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowCancelV2"
            boolean r2 = r11.equals(r2)
            r12 = 77
            goto L_0x0c78
        L_0x098f:
            java.lang.String r2 = "bk.action.foa.media.ResizeImage"
            boolean r2 = r11.equals(r2)
            r12 = 76
            goto L_0x0c78
        L_0x0999:
            java.lang.String r2 = "wa.action.GetIntentParameter"
            boolean r2 = r11.equals(r2)
            r12 = 75
            goto L_0x0c78
        L_0x09a3:
            java.lang.String r2 = "wa.action.FinishActivity"
            boolean r2 = r11.equals(r2)
            r12 = 74
            goto L_0x0c78
        L_0x09ad:
            java.lang.String r2 = "bk.action.bloks.PopBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 73
            goto L_0x0c78
        L_0x09b7:
            java.lang.String r2 = "bk.action.DeeplinkToOtherAppOrDirectToAppStore"
            boolean r2 = r11.equals(r2)
            r12 = 72
            goto L_0x0c78
        L_0x09c1:
            java.lang.String r2 = "bk.action.io.Toast"
            boolean r2 = r11.equals(r2)
            r12 = 71
            goto L_0x0c78
        L_0x09cb:
            java.lang.String r2 = "bk.action.session_store.Get"
            boolean r2 = r11.equals(r2)
            r12 = 70
            goto L_0x0c78
        L_0x09d5:
            java.lang.String r2 = "wa.action.navigation.OpenChat"
            boolean r2 = r11.equals(r2)
            r12 = 69
            goto L_0x0c78
        L_0x09df:
            java.lang.String r2 = "bk.action.cds.OpenScreen"
            boolean r2 = r11.equals(r2)
            r12 = 68
            goto L_0x0c78
        L_0x09e9:
            java.lang.String r2 = "wa.action.share.Text"
            boolean r2 = r11.equals(r2)
            r12 = 67
            goto L_0x0c78
        L_0x09f3:
            java.lang.String r2 = "bk.action.cds.DismissCdsBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 66
            goto L_0x0c78
        L_0x09fd:
            java.lang.String r2 = "bk.action.navigation.CloseScreen"
            boolean r2 = r11.equals(r2)
            r12 = 65
            goto L_0x0c78
        L_0x0a07:
            java.lang.String r2 = "wa.action.GetAppType"
            boolean r2 = r11.equals(r2)
            r12 = 64
            goto L_0x0c78
        L_0x0a11:
            java.lang.String r2 = "wa.action.DismissProgressBar"
            boolean r2 = r11.equals(r2)
            r12 = 63
            goto L_0x0c78
        L_0x0a1b:
            java.lang.String r2 = "wa.action.SendFieldStatV2"
            boolean r2 = r11.equals(r2)
            r12 = 62
            goto L_0x0c78
        L_0x0a25:
            java.lang.String r2 = "bk.action.qpl.userflow.MarkPointV2"
            boolean r2 = r11.equals(r2)
            r12 = 61
            goto L_0x0c78
        L_0x0a2f:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowSuccessV2"
            boolean r2 = r11.equals(r2)
            r12 = 60
            goto L_0x0c78
        L_0x0a39:
            java.lang.String r2 = "wa.action.care.OpenContactSupport"
            boolean r2 = r11.equals(r2)
            r12 = 59
            goto L_0x0c78
        L_0x0a43:
            java.lang.String r2 = "bk.action.bloks.AsyncAction"
            boolean r2 = r11.equals(r2)
            r12 = 58
            goto L_0x0c78
        L_0x0a4d:
            java.lang.String r2 = "wa.action.media.UploadMedia"
            boolean r2 = r11.equals(r2)
            r12 = 57
            goto L_0x0c78
        L_0x0a57:
            java.lang.String r2 = "bk.action.RequestPermission"
            boolean r2 = r11.equals(r2)
            r12 = 56
            goto L_0x0c78
        L_0x0a61:
            java.lang.String r2 = "wa.action.ResetFieldStats"
            boolean r2 = r11.equals(r2)
            r12 = 55
            goto L_0x0c78
        L_0x0a6b:
            java.lang.String r2 = "bk.action.dialog.OpenDialog"
            boolean r2 = r11.equals(r2)
            r12 = 54
            goto L_0x0c78
        L_0x0a75:
            java.lang.String r2 = "bk.action.bloks.PushBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 53
            goto L_0x0c78
        L_0x0a7f:
            java.lang.String r2 = "wa.action.GetFieldStatElapsedTime"
            boolean r2 = r11.equals(r2)
            r12 = 52
            goto L_0x0c78
        L_0x0a89:
            java.lang.String r2 = "bk.action.qpl.MarkerEnd"
            boolean r2 = r11.equals(r2)
            r12 = 51
            goto L_0x0c78
        L_0x0a93:
            java.lang.String r2 = "bk.wa.ReportABug"
            boolean r2 = r11.equals(r2)
            r12 = 50
            goto L_0x0c78
        L_0x0a9d:
            java.lang.String r2 = "wa.action.navigation.OpenScreenWithOptions"
            boolean r2 = r11.equals(r2)
            r12 = 49
            goto L_0x0c78
        L_0x0aa7:
            java.lang.String r2 = "bk.action.fx.OpenSyncScreen"
            boolean r2 = r11.equals(r2)
            r12 = 48
            goto L_0x0c78
        L_0x0ab1:
            java.lang.String r2 = "bk.action.cds.OpenCdsBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 47
            goto L_0x0c78
        L_0x0abb:
            java.lang.String r2 = "wa.action.DeregDeeplinkListener"
            boolean r2 = r11.equals(r2)
            r12 = 46
            goto L_0x0c78
        L_0x0ac5:
            java.lang.String r2 = "bk.action.bloks.LaunchDialog"
            boolean r2 = r11.equals(r2)
            r12 = 45
            goto L_0x0c78
        L_0x0acf:
            java.lang.String r2 = "wa.action.GetAttributeValue"
            boolean r2 = r11.equals(r2)
            r12 = 44
            goto L_0x0c78
        L_0x0ad9:
            java.lang.String r2 = "bk.action.avatar.PauseAutogenCamera"
            boolean r2 = r11.equals(r2)
            r12 = 43
            goto L_0x0c78
        L_0x0ae3:
            java.lang.String r2 = "wa.action.OpenUrl"
            boolean r2 = r11.equals(r2)
            r12 = 42
            goto L_0x0c78
        L_0x0aed:
            java.lang.String r2 = "wa.action.navigation.OpenNativeActionSheet"
            boolean r2 = r11.equals(r2)
            r12 = 41
            goto L_0x0c78
        L_0x0af7:
            java.lang.String r2 = "wa.action.StartFieldStatTimer"
            boolean r2 = r11.equals(r2)
            r12 = 40
            goto L_0x0c78
        L_0x0b01:
            java.lang.String r2 = "bk.action.cds.PopCdsBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 39
            goto L_0x0c78
        L_0x0b0b:
            java.lang.String r2 = "bk.action.bloks.OpenScreen"
            boolean r2 = r11.equals(r2)
            r12 = 38
            goto L_0x0c78
        L_0x0b15:
            java.lang.String r2 = "wa.action.HandleError"
            boolean r2 = r11.equals(r2)
            r12 = 37
            goto L_0x0c78
        L_0x0b1f:
            java.lang.String r2 = "wa.action.RegDeeplinkListener"
            boolean r2 = r11.equals(r2)
            r12 = 36
            goto L_0x0c78
        L_0x0b29:
            java.lang.String r2 = "bk.action.flipper.SendData"
            boolean r2 = r11.equals(r2)
            r12 = 35
            goto L_0x0c78
        L_0x0b33:
            java.lang.String r2 = "wa.action.GetChildNode"
            boolean r2 = r11.equals(r2)
            r12 = 34
            goto L_0x0c78
        L_0x0b3d:
            java.lang.String r2 = "bk.action.foa.media.OpenCamera"
            boolean r2 = r11.equals(r2)
            r12 = 33
            goto L_0x0c78
        L_0x0b47:
            java.lang.String r2 = "bk.action.bloks.CloseScreenV2"
            boolean r2 = r11.equals(r2)
            r12 = 32
            goto L_0x0c78
        L_0x0b51:
            java.lang.String r2 = "wa.action.FormatStringV2"
            boolean r2 = r11.equals(r2)
            r12 = 31
            goto L_0x0c78
        L_0x0b5b:
            java.lang.String r2 = "bk.action.qpl.userflow.StartFlowV2"
            boolean r2 = r11.equals(r2)
            r12 = 30
            goto L_0x0c78
        L_0x0b65:
            java.lang.String r2 = "bk.action.navigation.OpenUrl"
            boolean r2 = r11.equals(r2)
            r12 = 29
            goto L_0x0c78
        L_0x0b6f:
            java.lang.String r2 = "bk.action.cds.internal.RemoveCdsBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 28
            goto L_0x0c78
        L_0x0b79:
            java.lang.String r2 = "bk.action.qpl.userflow.MarkErrorV2"
            boolean r2 = r11.equals(r2)
            r12 = 27
            goto L_0x0c78
        L_0x0b83:
            java.lang.String r2 = "bk.action.inapppurchase.FetchPriceAndBuy"
            boolean r2 = r11.equals(r2)
            r12 = 26
            goto L_0x0c78
        L_0x0b8d:
            java.lang.String r2 = "bk.action.cds.CloseScreen"
            boolean r2 = r11.equals(r2)
            r12 = 25
            goto L_0x0c78
        L_0x0b97:
            java.lang.String r2 = "bk.action.debug.internal.DeviceLog"
            boolean r2 = r11.equals(r2)
            r12 = 24
            goto L_0x0c78
        L_0x0ba1:
            java.lang.String r2 = "bk.action.qpl.MarkerStart"
            boolean r2 = r11.equals(r2)
            r12 = 23
            goto L_0x0c78
        L_0x0bab:
            java.lang.String r2 = "bk.action.qpl.MarkerPoint"
            boolean r2 = r11.equals(r2)
            r12 = 22
            goto L_0x0c78
        L_0x0bb5:
            java.lang.String r2 = "bk.action.avatar.CaptureAutogenCamera"
            boolean r2 = r11.equals(r2)
            r12 = 21
            goto L_0x0c78
        L_0x0bbf:
            java.lang.String r2 = "bk.action.qpl.MarkerEndV2"
            boolean r2 = r11.equals(r2)
            r12 = 20
            goto L_0x0c78
        L_0x0bc9:
            java.lang.String r2 = "wa.action.TimeInFuture"
            boolean r2 = r11.equals(r2)
            r12 = 19
            goto L_0x0c78
        L_0x0bd3:
            java.lang.String r2 = "bk.action.wa.wam.SendFieldstatV3"
            boolean r2 = r11.equals(r2)
            r12 = 18
            goto L_0x0c78
        L_0x0bdd:
            java.lang.String r2 = "bk.action.wa.spam.ReportSpam"
            boolean r2 = r11.equals(r2)
            r12 = 17
            goto L_0x0c78
        L_0x0be7:
            java.lang.String r2 = "bk.action.logging.LogEvent"
            boolean r2 = r11.equals(r2)
            r12 = 16
            goto L_0x0c78
        L_0x0bf1:
            java.lang.String r2 = "bk.action.io.clipboard.SetString"
            boolean r2 = r11.equals(r2)
            r12 = 15
            goto L_0x0c78
        L_0x0bfa:
            java.lang.String r2 = "wa.action.ShowSnackbar"
            boolean r2 = r11.equals(r2)
            r12 = 14
            goto L_0x0c78
        L_0x0c03:
            java.lang.String r2 = "wa.action.SendFieldStat"
            boolean r2 = r11.equals(r2)
            r12 = 13
            goto L_0x0c78
        L_0x0c0c:
            java.lang.String r2 = "bk.action.qpl.userflow.EndFlowFailureV2"
            boolean r2 = r11.equals(r2)
            r12 = 12
            goto L_0x0c78
        L_0x0c15:
            java.lang.String r2 = "bk.fx.action.GetFamilyDeviceId"
            boolean r2 = r11.equals(r2)
            r12 = 11
            goto L_0x0c78
        L_0x0c1e:
            java.lang.String r2 = "bk.action.qpl.userflow.AnnotateV2"
            boolean r2 = r11.equals(r2)
            r12 = 10
            goto L_0x0c78
        L_0x0c27:
            java.lang.String r2 = "bk.action.qpl.MarkerDrop"
            boolean r2 = r11.equals(r2)
            r12 = 9
            goto L_0x0c78
        L_0x0c30:
            java.lang.String r2 = "wa.action.care.OpenReportThisPayment"
            boolean r2 = r11.equals(r2)
            r12 = 8
            goto L_0x0c78
        L_0x0c39:
            java.lang.String r2 = "bk.action.navigation.SetNavBar"
            boolean r2 = r11.equals(r2)
            r12 = 7
            goto L_0x0c78
        L_0x0c41:
            java.lang.String r2 = "bk.action.bloks.AsyncActionWithDataManifest"
            boolean r2 = r11.equals(r2)
            r12 = 6
            goto L_0x0c78
        L_0x0c49:
            java.lang.String r2 = "wa.action.dialog.ShowDialogWithClientData"
            boolean r2 = r11.equals(r2)
            r12 = 5
            goto L_0x0c78
        L_0x0c51:
            java.lang.String r2 = "bk.action.preload.RequestPreloadScreenV2"
            boolean r2 = r11.equals(r2)
            r12 = 4
            goto L_0x0c78
        L_0x0c59:
            java.lang.String r2 = "bk.action.dialog.OpenDialogV2"
            boolean r2 = r11.equals(r2)
            r12 = 3
            goto L_0x0c78
        L_0x0c61:
            java.lang.String r2 = "bk.action.preload.InvalidatePreloadScreenV2"
            boolean r2 = r11.equals(r2)
            r12 = 2
            goto L_0x0c78
        L_0x0c69:
            java.lang.String r2 = "bk.action.cds.PushCdsBottomSheet"
            boolean r2 = r11.equals(r2)
            r12 = 1
            goto L_0x0c78
        L_0x0c71:
            java.lang.String r2 = "bk.action.bloks.AsyncActionWithDataManifestV2"
            boolean r2 = r11.equals(r2)
            r12 = 0
        L_0x0c78:
            if (r2 != 0) goto L_0x001c
            goto L_0x001b
        L_0x0c7c:
            java.lang.String r1 = X.AnonymousClass6MO.A02(r11, r7)
            X.005 r0 = r15.A0Q
            java.lang.Object r0 = r0.get()
            X.17Y r0 = (X.AnonymousClass17Y) r0
            r0.A0E(r1, r7)
            return r2
        L_0x0c8c:
            android.app.Activity r0 = A01(r0)
            r0.finish()
            return r2
        L_0x0c94:
            android.app.Activity r0 = A01(r0)
            java.lang.String r5 = X.AnonymousClass6MO.A02(r11, r7)
            X.AnonymousClass00C.A0D(r0, r7)
            X.AnonymousClass00C.A0D(r5, r1)
            X.6Vp r3 = X.C132876Vp.A00
            android.app.Activity r0 = X.C129306Gj.A00(r0)
            java.util.List r1 = X.C129306Gj.A01(r0)
            if (r1 == 0) goto L_0x0cc4
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0cc4
            androidx.fragment.app.DialogFragment r0 = X.C132876Vp.A00(r3, r5, r1)
        L_0x0cb8:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            if (r0 != 0) goto L_0x0cc6
            java.lang.String r1 = "CDSBloksBottomSheetController"
            java.lang.String r0 = "Cannot remove without an existing bottom sheet - no bottom sheet contains the screen ID"
            X.AnonymousClass6RS.A01(r1, r0)
            return r2
        L_0x0cc4:
            r0 = 0
            goto L_0x0cb8
        L_0x0cc6:
            X.6j8 r0 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0)
            java.util.Deque r1 = r0.A0A
            java.lang.Object r0 = r1.peekFirst()
            X.5uD r0 = (X.C122045uD) r0
            java.lang.String r6 = "CDSBloksBottomSheetDelegate"
            if (r0 == 0) goto L_0x0d0e
            X.6Ed r0 = r0.A03
            java.lang.String r0 = r0.A03
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0d0e
            java.util.Iterator r4 = r1.iterator()
        L_0x0ce4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0d0a
            java.lang.Object r3 = r4.next()
            X.5uD r3 = (X.C122045uD) r3
            X.6Ed r1 = r3.A03
            java.lang.String r0 = r1.A03
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0ce4
            android.view.View r0 = r3.A00
            if (r0 == 0) goto L_0x0d03
            r1.A02()
            r3.A00 = r2
        L_0x0d03:
            r1.A01()
            r4.remove()
            return r2
        L_0x0d0a:
            java.lang.String r0 = "No screen found with target ID, so the screen was not removed."
            goto L_0x15e9
        L_0x0d0e:
            java.lang.String r0 = "Attempting to remove the current or only screen in the CDS bottom sheet, so the screen was not removed. Please use pop or dismiss instead."
            goto L_0x15e9
        L_0x0d12:
            r6 = r2
            java.util.List r1 = r11.A00
            X.6lc r4 = X.C90504aG.A0K(r1, r7)
            android.app.Activity r1 = A01(r0)
            X.67i r3 = X.C142316og.A05(r0, r11, r3)
            if (r4 == 0) goto L_0x0d27
            X.7ku r2 = X.C140456lc.A0E(r4)
        L_0x0d27:
            X.AnonymousClass00C.A0D(r1, r7)
            android.app.Activity r0 = X.C129306Gj.A00(r1)
            java.util.List r1 = X.C129306Gj.A01(r0)
            if (r1 == 0) goto L_0x0d53
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0d53
            java.lang.Object r1 = A06(r1)
        L_0x0d3e:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r1 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r1
            if (r1 == 0) goto L_0x0d55
            if (r4 == 0) goto L_0x0d51
            if (r2 == 0) goto L_0x0d51
            if (r3 == 0) goto L_0x0d51
            X.74w r0 = new X.74w
            r0.<init>(r3, r4, r2, r5)
        L_0x0d4d:
            r1.A1h(r0)
            return r6
        L_0x0d51:
            r0 = r6
            goto L_0x0d4d
        L_0x0d53:
            r1 = 0
            goto L_0x0d3e
        L_0x0d55:
            java.lang.String r0 = "Cannot dismiss without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0d5c:
            java.util.List r0 = r11.A00
            int r7 = X.C36351kA.A06(r0, r7)
            int r6 = X.C36351kA.A06(r0, r1)
            int r5 = X.C36351kA.A06(r0, r3)
            java.lang.Object r3 = r0.get(r4)
            r1 = 6
            X.7sb r0 = new X.7sb
            r0.<init>(r3, r1)
            r15.A03(r7, r6, r5)
            return r2
        L_0x0d78:
            r8 = r2
            java.util.List r6 = r11.A00
            java.lang.String r5 = X.C36401kF.A0s(r6, r7)
            java.lang.String r4 = X.C36401kF.A0s(r6, r1)
            X.7ku r3 = X.C90464aC.A0H(r6, r3)
            if (r3 == 0) goto L_0x0d8f
            r1 = 19
            X.7rQ r2 = X.C164197rQ.A00(r3, r1)
        L_0x0d8f:
            android.app.Activity r0 = A01(r0)
            r15.A05(r0, r2, r5, r4)
            return r8
        L_0x0d97:
            java.util.List r6 = r11.A00
            java.lang.String r11 = X.C36401kF.A0s(r6, r7)
            java.lang.String r1 = X.C36401kF.A0s(r6, r1)
            java.lang.String r10 = X.C36401kF.A0s(r6, r3)
            java.lang.String r9 = X.C36401kF.A0s(r6, r4)
            java.lang.String r7 = X.C36401kF.A0s(r6, r8)
            X.7ku r12 = X.C90464aC.A0H(r6, r5)
            r3 = 6
            X.7ku r5 = X.C90464aC.A0H(r6, r3)
            r3 = 7
            X.7ku r4 = X.C90464aC.A0H(r6, r3)
            if (r12 == 0) goto L_0x0e1f
            X.33w r8 = new X.33w
            r8.<init>()
            r8.A00 = r0
            r8.A01 = r12
        L_0x0dc6:
            if (r5 == 0) goto L_0x0e1d
            X.33w r3 = new X.33w
            r3.<init>()
            r3.A00 = r0
            r3.A01 = r5
        L_0x0dd1:
            if (r4 == 0) goto L_0x0e1b
            X.33w r6 = new X.33w
            r6.<init>()
            r6.A00 = r0
            r6.A01 = r4
        L_0x0ddc:
            android.app.Activity r5 = A01(r0)
            X.014 r5 = (X.AnonymousClass014) r5
            X.1qm r4 = X.AnonymousClass3LW.A00(r5)
            r4.A0q(r11)
            r4.A0p(r1)
            r1 = 9
            X.7t3 r0 = new X.7t3
            r0.<init>(r8, r1)
            r4.A0o(r5, r0, r10)
            if (r9 == 0) goto L_0x0e02
            r1 = 10
            X.7t3 r0 = new X.7t3
            r0.<init>(r3, r1)
            r4.A0n(r5, r0, r9)
        L_0x0e02:
            if (r7 == 0) goto L_0x0e17
            r0 = 11
            X.7t3 r3 = new X.7t3
            r3.<init>(r6, r0)
            androidx.appcompat.app.AlertDialog$Builder r1 = r4.A00
            X.3V7 r0 = r4.A01
            r1.A0R(r0, r7)
            X.00s r0 = r0.A01
            r0.A08(r5, r3)
        L_0x0e17:
            X.C36341k9.A11(r4)
            return r2
        L_0x0e1b:
            r6 = r2
            goto L_0x0ddc
        L_0x0e1d:
            r3 = r2
            goto L_0x0dd1
        L_0x0e1f:
            r8 = r2
            goto L_0x0dc6
        L_0x0e21:
            r14 = r2
            java.util.List r1 = r11.A00
            X.6lc r4 = X.C90504aG.A0K(r1, r7)
            X.6lc r10 = X.C90504aG.A0K(r1, r7)
            java.util.Map r1 = X.C90494aF.A0k(r1, r3)
            java.util.HashMap r9 = A09(r1)
            java.lang.String r8 = A07(r4)
            int r7 = r4.A04
            r1 = 13647(0x354f, float:1.9124E-41)
            boolean r5 = X.AnonymousClass000.A1S(r7, r1)
            java.lang.String r3 = "0"
            r1 = 40
            if (r5 != 0) goto L_0x0e4c
            r1 = 13784(0x35d8, float:1.9315E-41)
            if (r7 != r1) goto L_0x0edf
            r1 = 45
        L_0x0e4c:
            java.lang.String r12 = r4.A0a(r1, r3)
            X.6oJ r11 = new X.6oJ
            r11.<init>((java.lang.String) r8)
            X.6XK r10 = X.AnonymousClass6XK.A00(r0, r10)
            X.5wn r1 = new X.5wn
            r1.<init>()
            r1.A01 = r8
            r1.A02 = r9
            X.6j9 r9 = new X.6j9
            r9.<init>(r1)
            X.6lc r3 = A04(r4)
            if (r3 == 0) goto L_0x0e73
            r1 = 40
            X.7ku r2 = r3.A0X(r1)
        L_0x0e73:
            if (r2 == 0) goto L_0x0ecd
            r1 = 1
            X.7s7 r13 = new X.7s7
            r13.<init>(r0, r2, r1)
        L_0x0e7b:
            java.lang.String r1 = "default"
            java.lang.String r1 = r4.A0a(r6, r1)
            X.C109535Xy.A00(r1)
            X.67i r0 = r0.A00
            android.content.Context r7 = r0.A00
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            android.app.Activity r0 = X.C129306Gj.A00(r7)
            java.util.List r1 = X.C129306Gj.A01(r0)
            if (r1 == 0) goto L_0x0ecb
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0ecb
            java.lang.Object r8 = A06(r1)
        L_0x0ea0:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r8 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r8
            if (r8 == 0) goto L_0x0ed8
            X.6Ed r12 = X.C132876Vp.A01(r7, r8, r9, r10, r11, r12)
            X.6j8 r11 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r8)
            android.content.Context r10 = r8.A0a()
            r15 = 32
            java.util.Deque r0 = r11.A0A
            java.lang.Object r2 = r0.peek()
            X.5uD r2 = (X.C122045uD) r2
            java.lang.String r1 = "CDSBloksBottomSheetDelegate"
            if (r2 != 0) goto L_0x0ec4
            java.lang.String r0 = "Cannot push to an empty bottom sheet. Please call open() to show new Screen content in the bottom sheet."
        L_0x0ec0:
            X.AnonymousClass6RS.A01(r1, r0)
            return r14
        L_0x0ec4:
            boolean r0 = r11.A09
            if (r0 == 0) goto L_0x0ecf
            java.lang.String r0 = "Attempting to push to a dismissing sheet. The content will not be displayed properly"
            goto L_0x0ec0
        L_0x0ecb:
            r8 = 0
            goto L_0x0ea0
        L_0x0ecd:
            r13 = r14
            goto L_0x0e7b
        L_0x0ecf:
            X.6Ed r0 = r2.A03
            r0.A03()
            X.C139036j8.A02(r10, r11, r12, r13, r14, r15)
            return r14
        L_0x0ed8:
            java.lang.String r0 = "Cannot push a new Screen without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x0edf:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x0ee6:
            r10 = r2
            java.util.List r5 = r11.A00
            java.lang.String r13 = X.C36401kF.A0s(r5, r7)
            java.util.Map r9 = X.C90494aF.A0k(r5, r1)
            X.6lc r8 = X.C90504aG.A0K(r5, r3)
            java.lang.Object r1 = r5.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0f5f
            java.util.Iterator r4 = r1.iterator()
            r7 = r2
        L_0x0f02:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0f5c
            X.6lc r3 = X.C90514aH.A0Y(r4)
            r1 = 35
            java.lang.Object r2 = X.C140456lc.A0I(r3, r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r7 = X.C140456lc.A0I(r3, r6)
            java.lang.String r7 = (java.lang.String) r7
            if (r2 == 0) goto L_0x0f02
        L_0x0f1c:
            X.7ku r5 = r8.A0X(r6)
            X.7ku r4 = r8.A0X(r1)
            java.util.HashMap r3 = A08(r9)
            java.lang.String r1 = "params"
            java.lang.String r14 = X.C90504aG.A0l(r1, r3)
            r1 = 21
            X.7rQ r6 = X.C164197rQ.A00(r5, r1)
            r1 = 17
            X.7rQ r3 = X.C164197rQ.A00(r4, r1)
            X.005 r1 = r15.A08
            java.lang.Object r5 = r1.get()
            X.5tw r5 = (X.C121925tw) r5
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L_0x0f63
            java.lang.String r2 = "null app id"
            r1 = 0
            X.C18740tg.A0D(r1, r2)
            X.0wI r4 = r5.A00
            java.lang.Object r3 = r3.A00
            r2 = 5
            X.74h r1 = new X.74h
            r1.<init>(r0, r3, r2)
            r4.Bp3(r1)
            return r10
        L_0x0f5c:
            r1 = 35
            goto L_0x0f1c
        L_0x0f5f:
            r1 = 35
            r7 = r2
            goto L_0x0f1c
        L_0x0f63:
            java.util.Set r1 = r5.A02
            java.util.Iterator r4 = r1.iterator()
        L_0x0f69:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0fbf
            java.lang.Object r8 = r4.next()
            X.5si r8 = (X.C121175si) r8
            r1 = 0
            X.AnonymousClass00C.A0D(r0, r1)
            java.lang.String r1 = "secure_v0"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0f69
            X.005 r1 = r8.A02
            if (r1 == 0) goto L_0x0fb8
            java.lang.Object r5 = r1.get()
            X.5PD r5 = (X.AnonymousClass5PD) r5
            if (r13 == 0) goto L_0x0fb3
            X.71e r4 = new X.71e
            r4.<init>(r8, r6, r3, r0)
            X.5jz r0 = r5.A00
            X.0w4 r0 = r0.A00
            X.0tq r0 = r0.A00
            X.0wo r3 = X.C36351kA.A0V(r0)
            X.0wN r1 = X.C36391kE.A0V(r0)
            X.19A r0 = X.C36361kB.A0c(r0)
            X.5PL r2 = new X.5PL
            r2.<init>(r1, r3, r0, r7)
            X.00I r1 = X.C36441kJ.A0W(r13, r14)
            r0 = 45
            r5.A01(r4, r2, r1, r0)
            return r10
        L_0x0fb3:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x0fb8:
            java.lang.String r0 = "bloksPayloadIqHelperLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0fbf:
            X.005 r1 = r5.A01
            java.lang.Object r1 = r1.get()
            X.5rI r1 = (X.C120305rI) r1
            X.6Pn r9 = r1.A00
            r16 = 1
            X.7ql r11 = new X.7ql
            r22 = 1
            r17 = r11
            r18 = r0
            r19 = r3
            r20 = r1
            r21 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r15 = r10
            r12 = r10
            r9.A04(r10, r11, r12, r13, r14, r15, r16)
            return r10
        L_0x0fe2:
            java.util.List r3 = r11.A00
            int r6 = X.C36351kA.A06(r3, r7)
            java.util.Map r1 = X.C90494aF.A0k(r3, r1)
            android.app.Activity r5 = A01(r0)
            if (r1 == 0) goto L_0x100c
            java.util.HashMap r4 = A08(r1)
        L_0x0ff6:
            r3 = 0
            if (r6 == 0) goto L_0x0ffa
            r3 = -1
        L_0x0ffa:
            android.content.Intent r1 = r5.getIntent()
            if (r4 == 0) goto L_0x1005
            java.lang.String r0 = "finish_activity_result"
            r1.putExtra(r0, r4)
        L_0x1005:
            r5.setResult(r3, r1)
            r5.finish()
            return r2
        L_0x100c:
            r4 = r2
            goto L_0x0ff6
        L_0x100e:
            java.util.List r0 = r11.A00
            int r5 = X.C36351kA.A06(r0, r7)
            int r4 = X.C36351kA.A06(r0, r1)
            java.lang.Object r3 = r0.get(r3)
            r1 = 5
            X.7sb r0 = new X.7sb
            r0.<init>(r3, r1)
            r15.A06(r0, r5, r4)
            return r2
        L_0x1026:
            java.util.List r6 = r11.A00
            java.lang.String r7 = X.C36401kF.A0s(r6, r7)
            int r10 = X.C36351kA.A06(r6, r1)
            int r1 = X.C36351kA.A06(r6, r3)
            java.util.Map r0 = X.C90494aF.A0k(r6, r4)
            int r12 = X.C36351kA.A06(r6, r8)
            java.lang.Object r8 = r6.get(r5)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.HashMap r9 = A08(r0)
            int r11 = X.C90494aF.A06(r1)
            X.57l r1 = X.C110075a5.A00(r7, r8, r9, r10, r11, r12)
            X.005 r0 = r15.A0c
            java.lang.Object r0 = r0.get()
            X.0yW r0 = (X.C21010yW) r0
            r0.Blv(r1)
            return r2
        L_0x105a:
            java.util.List r1 = r11.A00
            X.6lc r1 = X.C90504aG.A0K(r1, r7)
            java.lang.Object r5 = X.C140456lc.A0I(r1, r6)
            java.lang.String r5 = (java.lang.String) r5
            r3 = 35
            X.6lc r1 = r1.A0W(r3)
            if (r1 == 0) goto L_0x108a
            java.lang.Object r4 = X.C140456lc.A0I(r1, r6)
            java.lang.String r4 = (java.lang.String) r4
            X.7ku r3 = r1.A0X(r3)
        L_0x1078:
            if (r3 == 0) goto L_0x1088
            r1 = 18
            X.7rQ r1 = X.C164197rQ.A00(r3, r1)
        L_0x1080:
            android.app.Activity r0 = A01(r0)
            r15.A05(r0, r1, r5, r4)
            return r2
        L_0x1088:
            r1 = r2
            goto L_0x1080
        L_0x108a:
            r3 = r2
            r4 = r2
            goto L_0x1078
        L_0x108d:
            java.util.List r5 = r11.A00
            X.7ku r6 = X.AnonymousClass6JJ.A01(r5, r7)
            X.7ku r4 = X.AnonymousClass6JJ.A01(r5, r1)
            X.7ku r5 = X.AnonymousClass6JJ.A01(r5, r3)
            X.33w r3 = new X.33w
            r3.<init>()
            r3.A01 = r6
            r3.A00 = r0
            X.33w r1 = new X.33w
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r0
            X.33w r4 = new X.33w
            r4.<init>()
            r4.A01 = r5
            r4.A00 = r0
            android.app.Activity r7 = A01(r0)
            X.005 r0 = r15.A0S
            java.lang.Object r6 = r0.get()
            com.whatsapp.smartcapture.picker.OpenMediaPickerManagerImpl r6 = (com.whatsapp.smartcapture.picker.OpenMediaPickerManagerImpl) r6
            if (r6 == 0) goto L_0x10f3
            boolean r0 = r7 instanceof X.AnonymousClass01G
            if (r0 == 0) goto L_0x10f3
            X.77m r5 = new X.77m
            r5.<init>(r3, r1, r4)
            X.01G r7 = (X.AnonymousClass01G) r7
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.01N r0 = r7.A06
            r0.A04(r6)
            X.01X r4 = r7.A04
            X.0FG r3 = new X.0FG
            r3.<init>()
            r0 = 1
            X.7tQ r1 = new X.7tQ
            r1.<init>(r6, r7, r5, r0)
            java.lang.String r0 = "mediapicker_rq#101"
            X.0sc r1 = r4.A02(r1, r3, r0)
            r6.A00 = r1
            java.lang.String r0 = "image/*"
            r1.A01(r2, r0)
            return r2
        L_0x10f3:
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            java.lang.String r0 = "Unexpected parameters while opening media picker"
            r3.add(r0)
            X.4vP r1 = r4.A00
            X.7ku r0 = r4.A01
            X.AnonymousClass6JI.A00(A03(r1), new X.AnonymousClass6MO(r3), r0)
            return r2
        L_0x1104:
            java.util.List r4 = r11.A00
            java.lang.String r3 = X.C36401kF.A0s(r4, r7)
            java.lang.String r16 = X.C36401kF.A0s(r4, r1)
            android.app.Activity r13 = A01(r0)
            boolean r0 = r13 instanceof X.C225014r
            if (r0 != 0) goto L_0x111a
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity doesn't implement DialogInterface"
            goto L_0x16b1
        L_0x111a:
            boolean r0 = r13 instanceof X.AnonymousClass01L
            if (r0 != 0) goto L_0x1122
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] activity is not instance of AppCompatActivity"
            goto L_0x16b1
        L_0x1122:
            X.11F r14 = X.C36421kH.A0N(r3)
            if (r14 != 0) goto L_0x112c
            java.lang.String r0 = "[Bloks][bk.action.wa.extension.ReportItem] failed to parse chat jid from string"
            goto L_0x16b1
        L_0x112c:
            com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment r3 = new com.whatsapp.biz.product.view.fragment.ReportProductDialogFragment
            r3.<init>()
            r17 = 1
            X.7pZ r12 = new X.7pZ
            r12.<init>(r13, r14, r15, r16, r17)
            r3.A00 = r12
            X.01I r13 = (X.AnonymousClass01I) r13
            X.01z r1 = r13.getSupportFragmentManager()
            java.lang.String r0 = X.AnonymousClass000.A0k(r3)
            X.C65443Sb.A03(r3, r1, r0)
            return r2
        L_0x1148:
            java.util.List r1 = r11.A00
            java.util.Map r1 = X.C90494aF.A0k(r1, r7)
            android.app.Activity r0 = A01(r0)
            if (r1 == 0) goto L_0x1157
            A08(r1)
        L_0x1157:
            r0.onBackPressed()
            return r2
        L_0x115b:
            java.lang.String r3 = X.AnonymousClass6MO.A02(r11, r7)
            android.app.Activity r6 = A01(r0)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass6VK.A00(r15, r3)     // Catch:{ 0wR -> 0x123d }
            java.lang.String r3 = X.AnonymousClass3U8.A06(r4)     // Catch:{ 0wR -> 0x123d }
            if (r3 == 0) goto L_0x122d
            X.005 r0 = r15.A0K     // Catch:{ 0wR -> 0x123d }
            java.lang.Object r0 = r0.get()     // Catch:{ 0wR -> 0x123d }
            X.16D r0 = (X.AnonymousClass16D) r0     // Catch:{ 0wR -> 0x123d }
            X.141 r13 = r0.A08(r4)     // Catch:{ 0wR -> 0x123d }
            if (r13 == 0) goto L_0x119f
            X.005 r0 = r15.A0R     // Catch:{ 0wR -> 0x123d }
            java.lang.Object r0 = r0.get()     // Catch:{ 0wR -> 0x123d }
            X.0wQ r0 = (X.C19730wQ) r0     // Catch:{ 0wR -> 0x123d }
            boolean r0 = r0.A0M(r4)     // Catch:{ 0wR -> 0x123d }
            if (r0 == 0) goto L_0x119f
            X.005 r0 = r15.A05     // Catch:{ 0wR -> 0x123d }
            r0.get()     // Catch:{ 0wR -> 0x123d }
            android.content.Intent r4 = X.C36431kI.A0D()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r3 = r6.getPackageName()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r0 = "com.whatsapp.profile.ProfileInfoActivity"
            r4.setClassName(r3, r0)     // Catch:{ 0wR -> 0x123d }
            r6.startActivity(r4)     // Catch:{ 0wR -> 0x123d }
            return r2
        L_0x119f:
            java.lang.String r12 = "\\D"
            java.lang.String r11 = ""
            java.lang.String r8 = r3.replaceAll(r12, r11)     // Catch:{ 0wR -> 0x123d }
            int r0 = r8.length()     // Catch:{ 0wR -> 0x123d }
            r18 = 0
            if (r0 >= r5) goto L_0x11b5
            java.lang.String r0 = "bkextentionsimpl/converttointlformat/too-short-no-cc"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ 0wR -> 0x123d }
            goto L_0x120a
        L_0x11b5:
            java.lang.String r0 = "^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch:{ 0wR -> 0x123d }
            java.util.regex.Matcher r3 = r0.matcher(r8)     // Catch:{ 0wR -> 0x123d }
            boolean r0 = r3.find()     // Catch:{ 0wR -> 0x123d }
            if (r0 == 0) goto L_0x120a
            java.lang.String r9 = r3.group(r1)     // Catch:{ 0wR -> 0x123d }
            X.C18740tg.A06(r9)     // Catch:{ 0wR -> 0x123d }
            int r0 = r9.length()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r8 = r8.substring(r0)     // Catch:{ 0wR -> 0x123d }
            X.005 r0 = r15.A0M     // Catch:{ 0wR -> 0x123d }
            java.lang.Object r3 = r0.get()     // Catch:{ 0wR -> 0x123d }
            X.1N4 r3 = (X.AnonymousClass1N4) r3     // Catch:{ 0wR -> 0x123d }
            int r0 = X.AnonymousClass3U2.A01(r3, r9, r8)     // Catch:{ 0wR -> 0x123d }
            if (r0 != r1) goto L_0x120a
            int r10 = java.lang.Integer.parseInt(r9)     // Catch:{ 0wR -> 0x123d }
            java.lang.String r0 = r8.replaceAll(r12, r11)     // Catch:{ Exception -> 0x11ef }
            java.lang.String r8 = r3.A03(r10, r0)     // Catch:{ Exception -> 0x11ef }
            goto L_0x11fd
        L_0x11ef:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r0 = "bkextentionsimpl/converttointlformat/trim/error "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r3, r10)     // Catch:{ 0wR -> 0x123d }
            com.whatsapp.util.Log.w(r0, r5)     // Catch:{ 0wR -> 0x123d }
        L_0x11fd:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r0 = "+"
            X.AnonymousClass000.A1D(r0, r9, r8, r3)     // Catch:{ 0wR -> 0x123d }
            java.lang.String r18 = r3.toString()     // Catch:{ 0wR -> 0x123d }
        L_0x120a:
            if (r13 != 0) goto L_0x1225
            if (r18 == 0) goto L_0x1225
            X.005 r0 = r15.A0b     // Catch:{ 0wR -> 0x123d }
            java.lang.Object r0 = r0.get()     // Catch:{ 0wR -> 0x123d }
            X.0wU r0 = (X.C19770wU) r0     // Catch:{ 0wR -> 0x123d }
            r19 = 26
            X.74y r14 = new X.74y     // Catch:{ 0wR -> 0x123d }
            r17 = r4
            r16 = r6
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ 0wR -> 0x123d }
            r0.Boy(r14)     // Catch:{ 0wR -> 0x123d }
            return r2
        L_0x1225:
            android.content.Intent r0 = X.AnonymousClass190.A0w(r6, r4, r2, r1, r1)     // Catch:{ 0wR -> 0x123d }
            r6.startActivity(r0)     // Catch:{ 0wR -> 0x123d }
            return r2
        L_0x122d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0wR -> 0x123d }
            java.lang.String r0 = "invalid jid "
            java.lang.String r3 = X.AnonymousClass000.A0l(r4, r0, r3)     // Catch:{ 0wR -> 0x123d }
            X.0wR r0 = new X.0wR     // Catch:{ 0wR -> 0x123d }
            r0.<init>((java.lang.String) r3)     // Catch:{ 0wR -> 0x123d }
            throw r0     // Catch:{ 0wR -> 0x123d }
        L_0x123d:
            r3 = move-exception
            X.005 r0 = r15.A0N
            java.lang.Object r4 = r0.get()
            X.0wN r4 = (X.C19700wN) r4
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "bloks/openContactInfo - "
            r4.A0E(r0, r3, r1)
            r1 = 2131891607(0x7f121597, float:1.9417939E38)
            X.005 r0 = r15.A0Q
            java.lang.Object r0 = r0.get()
            X.17Y r0 = (X.AnonymousClass17Y) r0
            r0.A06(r1, r7)
            return r2
        L_0x125e:
            java.util.List r4 = r11.A00
            java.lang.String r3 = X.C36401kF.A0s(r4, r7)
            java.lang.String r1 = X.C36401kF.A0s(r4, r1)
            android.app.Activity r0 = A01(r0)
            X.C90484aE.A13(r0, r3, r1)
            return r2
        L_0x1270:
            java.util.List r5 = r11.A00
            java.lang.String r4 = X.C36401kF.A0s(r5, r7)
            java.lang.Object r6 = r5.get(r1)
            android.app.Activity r5 = A01(r0)
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass6VK.A00(r15, r4)     // Catch:{ 0wR -> 0x12b8 }
            java.lang.String r0 = X.AnonymousClass3U8.A06(r4)     // Catch:{ 0wR -> 0x12b8 }
            if (r0 == 0) goto L_0x12a8
            java.lang.String r4 = "http://api.whatsapp.com/send?phone=%s&text=%s"
            java.lang.Object[] r0 = X.C36431kI.A1Z(r0, r3)     // Catch:{ 0wR -> 0x12b8 }
            if (r6 != 0) goto L_0x1292
            java.lang.String r6 = ""
        L_0x1292:
            r0[r1] = r6     // Catch:{ 0wR -> 0x12b8 }
            java.lang.String r4 = java.lang.String.format(r4, r0)     // Catch:{ 0wR -> 0x12b8 }
            X.005 r0 = r15.A06     // Catch:{ 0wR -> 0x12b8 }
            java.lang.Object r3 = r0.get()     // Catch:{ 0wR -> 0x12b8 }
            X.1Du r3 = (X.C24791Du) r3     // Catch:{ 0wR -> 0x12b8 }
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ 0wR -> 0x12b8 }
            r3.Bp7(r5, r0, r2)     // Catch:{ 0wR -> 0x12b8 }
            return r2
        L_0x12a8:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()     // Catch:{ 0wR -> 0x12b8 }
            java.lang.String r0 = "invalid jid "
            java.lang.String r3 = X.AnonymousClass000.A0l(r4, r0, r3)     // Catch:{ 0wR -> 0x12b8 }
            X.0wR r0 = new X.0wR     // Catch:{ 0wR -> 0x12b8 }
            r0.<init>((java.lang.String) r3)     // Catch:{ 0wR -> 0x12b8 }
            throw r0     // Catch:{ 0wR -> 0x12b8 }
        L_0x12b8:
            r3 = move-exception
            X.005 r0 = r15.A0N
            java.lang.Object r4 = r0.get()
            X.0wN r4 = (X.C19700wN) r4
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "bloks/openchat"
            r4.A0E(r0, r3, r1)
            r3 = 2131891607(0x7f121597, float:1.9417939E38)
            X.005 r0 = r15.A0Q
            java.lang.Object r1 = r0.get()
            X.17Y r1 = (X.AnonymousClass17Y) r1
            r1.A06(r3, r7)
            return r2
        L_0x12d9:
            java.lang.String r6 = X.AnonymousClass6MO.A02(r11, r7)
            android.app.Activity r5 = A01(r0)
            X.005 r0 = r15.A0V
            java.lang.Object r4 = r0.get()
            X.4Uz r4 = (X.C89034Uz) r4
            boolean r0 = r5 instanceof com.whatsapp.wabloks.ui.WaBloksActivity
            if (r0 == 0) goto L_0x133b
            X.3dK r4 = (X.C69313dK) r4
            X.0yC r3 = r4.A07
            r0 = 832(0x340, float:1.166E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 != 0) goto L_0x133b
            r0 = 1062(0x426, float:1.488E-42)
            boolean r0 = r3.A0E(r0)
            if (r0 == 0) goto L_0x133b
            X.3Ob r0 = r4.A0A
            boolean r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x133b
            com.whatsapp.wabloks.ui.WaBloksActivity r5 = (com.whatsapp.wabloks.ui.WaBloksActivity) r5
            X.3cj r0 = new X.3cj
            r0.<init>(r15, r5, r6)
            r5.A3Z(r0)
            java.util.HashSet r4 = X.C36441kJ.A16()
            r0 = 55
            X.AnonymousClass000.A1F(r4, r0)
            X.3OM r3 = new X.3OM
            r3.<init>(r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r3.A0G = r0
            r3.A0L = r0
            java.util.ArrayList r0 = X.C36441kJ.A15(r4)
            r3.A0a = r0
            r3.A0X = r6
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            android.content.Intent r0 = X.AnonymousClass3OM.A02(r3, r0)
            r5.startActivityForResult(r0, r1)
            return r2
        L_0x133b:
            X.AnonymousClass6VK.A02(r5, r6)
            return r2
        L_0x133f:
            java.util.List r4 = r11.A00
            java.lang.String r5 = X.C36401kF.A0s(r4, r7)
            X.7ku r1 = X.AnonymousClass6JJ.A01(r4, r1)
            X.7ku r4 = X.AnonymousClass6JJ.A01(r4, r3)
            X.33w r3 = new X.33w
            r3.<init>()
            r3.A01 = r1
            r3.A00 = r0
            X.33w r1 = new X.33w
            r1.<init>()
            r1.A01 = r4
            r1.A00 = r0
            java.net.URI r0 = java.net.URI.create(r5)
            java.io.File r6 = new java.io.File
            r6.<init>(r0)
            r0 = 2
            X.7sn r5 = new X.7sn
            r5.<init>(r3, r1, r0)
            X.005 r0 = r15.A0A
            java.lang.Object r4 = r0.get()
            X.0xA r4 = (X.C20190xA) r4
            X.040 r3 = r4.A06
            X.02l r1 = r4.A05
            com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1 r0 = new com.whatsapp.avatar.autogen.AvatarAutogenMediaUploadManagerImpl$uploadAutogenMedia$1
            r0.<init>(r4, r6, r2, r5)
            X.C36381kD.A1R(r1, r0, r3)
            return r2
        L_0x1383:
            java.util.List r1 = r11.A00
            X.6lc r4 = X.C90504aG.A0K(r1, r7)
            X.67i r1 = X.C142316og.A05(r0, r11, r3)
            android.app.AlertDialog$Builder r0 = r9.A02(r1, r0, r4)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return r2
        L_0x1399:
            java.lang.Object r1 = X.AnonymousClass6MO.A00(r11, r1)
            boolean r4 = X.AnonymousClass000.A1X(r1)
            android.app.Activity r3 = A01(r0)
            r1 = 1
            X.7sb r0 = new X.7sb
            r0.<init>(r11, r1)
            X.6lc r0 = r0.B7w()
            X.5l0 r5 = new X.5l0
            r5.<init>(r0)
            X.005 r0 = r15.A0B
            java.lang.Object r0 = r0.get()
            X.6MP r0 = (X.AnonymousClass6MP) r0
            X.6JY r3 = r0.A00(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "bottom_sheet_fragment_tag"
            r1.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            X.C36351kA.A1K(r0, r1)
            java.lang.String r8 = r1.toString()
            X.005 r0 = r3.A00
            java.lang.Object r0 = r0.get()
            X.6Pt r0 = (X.C131616Pt) r0
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r7 = com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment.A00(r5, r0, r8, r4)
            java.util.Stack r0 = X.AnonymousClass6JY.A01
            java.lang.Object r6 = r0.peek()
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment r6 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment) r6
            X.09Y r5 = X.C36411kG.A0S(r6)
            if (r4 == 0) goto L_0x13f1
            r5.A0J(r8)
        L_0x13f1:
            r4 = 2130772008(0x7f010028, float:1.7147122E38)
            r3 = 2130772009(0x7f010029, float:1.7147124E38)
            r1 = 2130772007(0x7f010027, float:1.714712E38)
            r0 = 2130772010(0x7f01002a, float:1.7147126E38)
            r5.A06(r4, r3, r1, r0)
            android.widget.LinearLayout r0 = r6.A00
            int r0 = r0.getId()
            r5.A0F(r7, r8, r0)
            r0 = 0
            r5.A00(r0)
            return r2
        L_0x140e:
            java.util.List r6 = r11.A00
            int r5 = X.C36351kA.A06(r6, r7)
            int r1 = X.C36351kA.A06(r6, r1)
            int r0 = X.C36351kA.A06(r6, r3)
            r6.get(r4)
            r15.A03(r5, r1, r0)
            return r2
        L_0x1423:
            java.util.List r3 = r11.A00
            java.lang.String r6 = X.C36401kF.A0s(r3, r7)
            java.lang.String r5 = X.C36401kF.A0s(r3, r1)
            android.app.Activity r4 = A01(r0)
            r0 = r4
            X.14u r0 = (X.C225314u) r0
            android.net.Uri r3 = r0.A2j()
            android.content.Context r1 = r4.getApplicationContext()
            android.content.Intent r1 = X.AnonymousClass190.A0Q(r1, r3, r2, r7)
            java.lang.String r0 = "extra_custom_bloks_use_case"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "extra_custom_bloks_param"
            r1.putExtra(r0, r5)
            r4.startActivity(r1)
            return r2
        L_0x144e:
            java.util.List r5 = r11.A00
            java.lang.String r4 = X.C36401kF.A0s(r5, r7)
            java.util.Map r1 = X.C90494aF.A0k(r5, r1)
            r5.get(r3)
            android.app.Activity r3 = A01(r0)
            java.util.HashMap r1 = A08(r1)
            java.lang.String r0 = "params"
            java.lang.String r1 = X.C90504aG.A0l(r0, r1)
            java.lang.Class<com.whatsapp.wabloks.ui.WaBloksActivity> r0 = com.whatsapp.wabloks.ui.WaBloksActivity.class
            android.content.Intent r0 = X.C90494aF.A0D(r3, r2, r0, r4, r1)
            r3.startActivity(r0)
            return r2
        L_0x1473:
            java.util.List r5 = r11.A00
            X.6lc r4 = X.C90504aG.A0K(r5, r7)
            X.6lc r9 = X.C90504aG.A0K(r5, r1)
            java.util.Map r1 = X.C90494aF.A0k(r5, r3)
            java.util.HashMap r7 = A09(r1)
            java.lang.String r6 = A07(r4)
            int r5 = r4.A04
            r1 = 13647(0x354f, float:1.9124E-41)
            boolean r8 = X.AnonymousClass000.A1S(r5, r1)
            java.lang.String r3 = "0"
            r1 = 40
            if (r8 != 0) goto L_0x149d
            r1 = 13784(0x35d8, float:1.9315E-41)
            if (r5 != r1) goto L_0x1508
            r1 = 45
        L_0x149d:
            java.lang.String r14 = r4.A0a(r1, r3)
            X.6oJ r12 = new X.6oJ
            r12.<init>((java.lang.String) r6)
            X.6WB r1 = X.C133016Wg.A01(r2, r0, r9)
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r8 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A05(r1, r6)
            X.67i r1 = r0.A00
            X.65A r1 = r1.A02
            r8.A00 = r1
            X.5wn r3 = new X.5wn
            r3.<init>()
            r3.A01 = r6
            r3.A02 = r7
            r1 = 812974081(0x30750001, float:8.9130486E-10)
            r3.A00 = r1
            X.6j9 r10 = new X.6j9
            r10.<init>(r3)
            X.6lc r3 = A04(r4)
            int r15 = A00(r3)
            if (r3 == 0) goto L_0x14ff
            r1 = 40
            X.7ku r3 = r3.A0X(r1)
        L_0x14d7:
            if (r3 == 0) goto L_0x14fd
            r1 = 0
            X.7s7 r13 = new X.7s7
            r13.<init>(r0, r3, r1)
        L_0x14df:
            android.app.Activity r9 = A01(r0)
            X.01I r9 = (X.AnonymousClass01I) r9
            r3 = 13647(0x354f, float:1.9124E-41)
            r1 = 43
            if (r5 == r3) goto L_0x14f1
            r1 = 13784(0x35d8, float:1.9315E-41)
            if (r5 != r1) goto L_0x1501
            r1 = 38
        L_0x14f1:
            X.6lc r1 = r4.A0W(r1)
            X.6XK r11 = X.AnonymousClass6XK.A00(r0, r1)
            X.C132876Vp.A02(r8, r9, r10, r11, r12, r13, r14, r15)
            return r2
        L_0x14fd:
            r13 = r2
            goto L_0x14df
        L_0x14ff:
            r3 = r2
            goto L_0x14d7
        L_0x1501:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x1508:
            java.lang.String r0 = "screen should be an instance of BloksScreenData or BloksScreenV2Data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x150f:
            java.util.List r3 = r11.A00
            java.lang.String r4 = X.C36401kF.A0s(r3, r7)
            java.util.Map r1 = X.C90494aF.A0k(r3, r1)
            android.app.Activity r3 = A01(r0)
            java.util.HashMap r1 = A08(r1)
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C90504aG.A0l(r0, r1)
            X.5ON r15 = (X.AnonymousClass5ON) r15
            X.01I r3 = (X.AnonymousClass01I) r3
            X.01z r3 = r3.getSupportFragmentManager()
            com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 r1 = new com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1
            r1.<init>(r15, r4, r0)
            r1.A1b()
            java.lang.String r0 = "bloks-dialog"
            r1.A1f(r3, r0)
            return r2
        L_0x153d:
            java.util.List r4 = r11.A00
            java.lang.String r7 = X.C36401kF.A0s(r4, r7)
            java.lang.String r8 = X.C36401kF.A0s(r4, r1)
            java.lang.Object r1 = r4.get(r3)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r1.iterator()
        L_0x1555:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x1569
            java.lang.Object r4 = r5.next()
            r3 = 3
            X.7sb r1 = new X.7sb
            r1.<init>(r4, r3)
            r6.add(r1)
            goto L_0x1555
        L_0x1569:
            android.app.Activity r1 = A01(r0)
            X.005 r0 = r15.A0C
            java.lang.Object r0 = r0.get()
            X.6Pt r0 = (X.C131616Pt) r0
            com.whatsapp.wabloks.ui.BkActionBottomSheet r3 = com.whatsapp.wabloks.ui.BkActionBottomSheet.A03(r0, r7, r8, r6)
            X.01I r1 = (X.AnonymousClass01I) r1
            X.01z r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "bloks_action_sheet_tag"
            r3.A1f(r1, r0)
            return r2
        L_0x1585:
            java.util.List r1 = r11.A00
            X.6lc r1 = X.C90504aG.A0K(r1, r7)
            java.lang.String r5 = X.C140456lc.A0J(r1)
            android.app.Activity r0 = A01(r0)
            X.AnonymousClass00C.A0D(r0, r7)
            android.app.Activity r0 = X.C129306Gj.A00(r0)
            java.util.List r1 = X.C129306Gj.A01(r0)
            if (r1 == 0) goto L_0x15d1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x15d1
            java.lang.Object r0 = A06(r1)
        L_0x15aa:
            com.whatsapp.bloks.components.BkCdsBottomSheetFragment r0 = (com.whatsapp.bloks.components.BkCdsBottomSheetFragment) r0
            if (r0 == 0) goto L_0x15ed
            X.6j8 r4 = com.whatsapp.bloks.components.BkCdsBottomSheetFragment.A03(r0)
            android.content.Context r3 = r0.A0a()
            java.util.Deque r1 = r4.A0A
            boolean r0 = r1.isEmpty()
            java.lang.String r6 = "CDSBloksBottomSheetDelegate"
            if (r5 != 0) goto L_0x15d3
            if (r0 != 0) goto L_0x15e4
            X.4eW r0 = r4.A01
            if (r0 == 0) goto L_0x15e4
            int r1 = r1.size()
            r0 = 1
            if (r1 == r0) goto L_0x15e7
            X.C139036j8.A01(r3, r4)
            return r2
        L_0x15d1:
            r0 = 0
            goto L_0x15aa
        L_0x15d3:
            if (r0 != 0) goto L_0x15e4
            X.4eW r0 = r4.A01
            if (r0 == 0) goto L_0x15e4
            int r1 = r1.size()
            r0 = 1
            if (r1 == r0) goto L_0x15e7
            r4.A04(r3, r5)
            return r2
        L_0x15e4:
            java.lang.String r0 = "Cannot pop from an empty bottom sheet."
            goto L_0x15e9
        L_0x15e7:
            java.lang.String r0 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op."
        L_0x15e9:
            X.AnonymousClass6RS.A01(r6, r0)
            return r2
        L_0x15ed:
            java.lang.String r0 = "Cannot pop without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x15f4:
            java.util.List r3 = r11.A00
            java.lang.String r6 = X.C36401kF.A0s(r3, r7)
            java.util.Map r1 = X.C90494aF.A0k(r3, r1)
            android.app.Activity r5 = A01(r0)
            java.util.HashMap r1 = A08(r1)
            java.lang.String r0 = "params"
            java.lang.String r4 = X.C90504aG.A0l(r0, r1)
            X.005 r0 = r15.A0a
            java.util.Iterator r3 = X.C90474aD.A0q(r0)
        L_0x1612:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x1640
            r3.next()
            X.AnonymousClass00C.A0D(r6, r7)
            java.lang.String r0 = "com.bloks.www.csf"
            boolean r0 = X.AnonymousClass098.A07(r6, r0, r7)
            if (r0 == 0) goto L_0x1612
            X.AnonymousClass00C.A0D(r5, r7)
            android.content.Intent r1 = X.C36431kI.A0D()
            java.lang.String r0 = "com.whatsapp.inappsupport.ui.SupportBloksActivity"
            r1.setClassName(r5, r0)
            java.lang.String r0 = "screen_name"
            r1.putExtra(r0, r6)
            java.lang.String r0 = "screen_params"
            r1.putExtra(r0, r4)
            r5.startActivity(r1)
            return r2
        L_0x1640:
            android.content.Intent r0 = com.whatsapp.wabloks.ui.WaBloksActivity.A07(r5, r6, r4)
            r5.startActivity(r0)
            return r2
        L_0x1648:
            java.lang.String r3 = X.AnonymousClass6MO.A02(r11, r7)
            android.app.Activity r1 = A01(r0)
            android.content.Intent r0 = X.C36331k8.A04(r3)
            r1.startActivity(r0)
            return r2
        L_0x1658:
            java.util.List r5 = r11.A00
            int r4 = X.C36351kA.A06(r5, r7)
            int r0 = X.C36351kA.A06(r5, r1)
            r5.get(r3)
            r15.A06(r2, r4, r0)
            return r2
        L_0x1669:
            java.util.List r6 = r11.A00
            java.lang.String r7 = X.C36401kF.A0s(r6, r7)
            int r10 = X.C36351kA.A06(r6, r1)
            int r1 = X.C36351kA.A06(r6, r3)
            java.util.Map r0 = X.C90494aF.A0k(r6, r4)
            int r12 = X.C36351kA.A06(r6, r8)
            java.lang.Object r8 = r6.get(r5)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.HashMap r9 = A08(r0)
            goto L_0x1715
        L_0x168b:
            java.util.List r9 = r11.A00
            java.lang.String r5 = X.C36401kF.A0s(r9, r7)
            java.lang.String r13 = X.C36401kF.A0s(r9, r1)
            java.lang.String r3 = X.C36401kF.A0s(r9, r3)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            java.lang.Object r1 = r9.get(r4)
            boolean r4 = r6.equals(r1)
            java.lang.String r1 = X.C36401kF.A0s(r9, r8)
            android.app.Activity r6 = A01(r0)
            boolean r0 = r6 instanceof X.C225014r
            if (r0 != 0) goto L_0x16b5
            java.lang.String r0 = "[Bloks][bk.action.wa.spam.ReportSpam] activity doesn't implement DialogInterface"
        L_0x16b1:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x16b5:
            X.11F r7 = X.C36421kH.A0N(r5)
            if (r7 != 0) goto L_0x16be
            java.lang.String r0 = "[Bloks][bk.action.wa.spam.ReportSpam] failed to parse chat jid from string"
            goto L_0x16b1
        L_0x16be:
            X.13r r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r8 = r0.A02(r1)
            if (r8 != 0) goto L_0x16ca
            com.whatsapp.jid.UserJid r8 = r0.A02(r5)
        L_0x16ca:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x16ea
            r9 = 0
        L_0x16d1:
            X.005 r0 = r15.A0b
            java.lang.Object r0 = r0.get()
            X.0wU r0 = (X.C19770wU) r0
            X.005 r10 = r15.A04
            X.14r r6 = (X.C225014r) r6
            X.005 r11 = r15.A0O
            X.005 r12 = r15.A0J
            X.2je r5 = new X.2je
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            X.C36331k8.A1F(r5, r0)
            return r2
        L_0x16ea:
            X.3Qa r9 = new X.3Qa
            r9.<init>(r7, r3, r4)
            goto L_0x16d1
        L_0x16f0:
            java.util.List r5 = r11.A00
            java.lang.String r7 = X.C36401kF.A0s(r5, r7)
            int r10 = X.C36351kA.A06(r5, r1)
            java.lang.Object r1 = r5.get(r3)
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x1729
            boolean r1 = X.AnonymousClass000.A1X(r1)
        L_0x1706:
            java.util.Map r0 = X.C90494aF.A0k(r5, r4)
            java.lang.Object r8 = r5.get(r8)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.HashMap r9 = A08(r0)
            r12 = -1
        L_0x1715:
            int r11 = X.C90494aF.A06(r1)
            X.57l r1 = X.C110075a5.A00(r7, r8, r9, r10, r11, r12)
            X.005 r0 = r15.A0c
            java.lang.Object r0 = r0.get()
            X.0yW r0 = (X.C21010yW) r0
            r0.Bly(r1)
            return r2
        L_0x1729:
            int r1 = X.AnonymousClass000.A0I(r1)
            goto L_0x1706
        L_0x172e:
            java.util.List r3 = r11.A00
            X.6lc r0 = X.C90504aG.A0K(r3, r7)
            java.lang.String r11 = A07(r0)
            java.util.Map r0 = X.C90494aF.A0k(r3, r1)
            int r4 = X.C36351kA.A06(r3, r4)
            java.util.HashMap r3 = A08(r0)
            X.005 r0 = r15.A0Z
            java.lang.Object r6 = r0.get()
            X.5rJ r6 = (X.C120315rJ) r6
            java.lang.String r0 = "params"
            java.lang.String r12 = X.C90504aG.A0l(r0, r3)
            long r3 = X.C36371kC.A07(r4)
            java.lang.String r5 = "PRELOAD"
            X.6bn r8 = new X.6bn
            r8.<init>(r3, r5, r7)
            X.6Pn r7 = r6.A00
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            X.71I r9 = new X.71I
            r9.<init>(r6, r11)
            r13 = r2
            r7.A03(r8, r9, r10, r11, r12, r13)
            return r2
        L_0x176d:
            java.util.List r1 = r11.A00
            java.lang.Object r4 = r1.get(r7)
            X.6XK r4 = (X.AnonymousClass6XK) r4
            java.lang.Object r3 = r1.get(r3)
            X.67i r3 = (X.C1271967i) r3
            X.6WZ r1 = X.C133266Xn.A01(r3)
            r1.A06(r4, r2)
            X.6lc r1 = r4.A01
            X.6lc r1 = X.AnonymousClass5Z6.A00(r3, r0, r1)
            android.app.AlertDialog$Builder r0 = r9.A02(r3, r0, r1)
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return r2
        L_0x1794:
            java.util.List r3 = r11.A00
            X.6lc r0 = X.C90504aG.A0K(r3, r7)
            java.lang.String r4 = A07(r0)
            java.util.Map r0 = X.C90494aF.A0k(r3, r1)
            java.util.HashMap r3 = A08(r0)
            X.005 r0 = r15.A0D
            java.lang.Object r1 = r0.get()
            X.6MZ r1 = (X.AnonymousClass6MZ) r1
            java.lang.String r0 = "params"
            java.lang.String r0 = X.C90504aG.A0l(r0, r3)
            X.AnonymousClass00C.A0D(r4, r7)
            X.5OH r3 = new X.5OH
            r3.<init>(r1, r4, r0)
            X.005 r0 = r15.A0C
            java.lang.Object r1 = r0.get()
            X.6Pt r1 = (X.C131616Pt) r1
            java.lang.String r0 = "PRELOAD"
            r1.A03(r3, r0)
            return r2
        L_0x17ca:
            java.lang.Object r9 = X.AnonymousClass6MO.A01(r11, r0)
            java.lang.String r6 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.AnonymousClass00C.A0E(r9, r6)
            X.67i r9 = (X.C1271967i) r9
            java.lang.String r13 = X.AnonymousClass6MO.A03(r11, r1)
            java.lang.Object r3 = X.AnonymousClass6MO.A00(r11, r3)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Number"
            int r3 = X.C90484aE.A0C(r3, r6)
            java.lang.Object r4 = X.AnonymousClass6MO.A00(r11, r4)
            java.util.Objects.requireNonNull(r4)
            int r12 = X.C90484aE.A0C(r4, r6)
            java.util.List r4 = r11.A00
            X.7ku r6 = X.C90464aC.A0H(r4, r8)
            X.7ku r4 = X.C90464aC.A0H(r4, r5)
            android.content.Context r14 = r9.A00
            X.67I r10 = new X.67I
            r10.<init>(r9, r0, r6, r4)
            X.5l1 r11 = new X.5l1
            r11.<init>(r15)
            r9 = r12
            if (r12 <= 0) goto L_0x1941
            if (r3 <= 0) goto L_0x1941
            android.net.Uri r0 = X.C133036Wk.A01(r13)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r4 = r0.getPath()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            if (r4 != 0) goto L_0x181c
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A01(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x181c:
            java.io.File r17 = X.C90524aI.A0S(r4)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            boolean r4 = X.C203859oz.A0P     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r5 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.9oz r4 = new X.9oz     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r4.<init>((java.lang.String) r5)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r13 = "Orientation"
            int r5 = r4.A0Y(r7)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r4 = 6
            if (r5 == r4) goto L_0x1838
            r4 = 8
            if (r5 != r4) goto L_0x183a
        L_0x1838:
            r9 = r3
            r3 = r12
        L_0x183a:
            android.content.ContentResolver r4 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.io.InputStream r6 = r4.openInputStream(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            if (r6 != 0) goto L_0x184a
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A01(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x184a:
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x1937 }
            r4.<init>()     // Catch:{ all -> 0x1937 }
            r4.inJustDecodeBounds = r1     // Catch:{ all -> 0x1937 }
            android.graphics.BitmapFactory.decodeStream(r6, r2, r4)     // Catch:{ all -> 0x1937 }
            int r5 = r4.outWidth     // Catch:{ all -> 0x1937 }
            int r4 = r4.outHeight     // Catch:{ all -> 0x1937 }
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch:{ all -> 0x1937 }
            r12.<init>(r7, r7, r5, r4)     // Catch:{ all -> 0x1937 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r5 = r12.width()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r4 = r12.height()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            if (r5 <= 0) goto L_0x1931
            if (r4 <= 0) goto L_0x1931
            if (r5 > r3) goto L_0x1874
            if (r4 > r9) goto L_0x1874
            r10.A00(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x1874:
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r8.<init>(r7, r7, r3, r9)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r3 = r12.width()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r5 = (double) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r5 = r5 * r15
            int r3 = r8.width()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = (double) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r5 = r5 / r3
            int r3 = r12.height()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = (double) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = r3 * r15
            int r8 = r8.height()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r8 = (double) r8     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = r3 / r8
            double r8 = java.lang.Math.max(r5, r3)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r3 = r12.width()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = (double) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = r3 / r8
            int r6 = (int) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r3 = r12.height()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = (double) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            double r3 = r3 / r8
            int r5 = (int) r3     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            android.graphics.Rect r8 = new android.graphics.Rect     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r8.<init>(r7, r7, r6, r5)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            android.content.ContentResolver r3 = r14.getContentResolver()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.io.InputStream r6 = r3.openInputStream(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r5 = 0
            if (r6 == 0) goto L_0x192b
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r6)     // Catch:{ all -> 0x1937 }
            if (r4 == 0) goto L_0x18c7
            int r3 = r8.width()     // Catch:{ all -> 0x1937 }
            int r0 = r8.height()     // Catch:{ all -> 0x1937 }
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r4, r3, r0, r1)     // Catch:{ all -> 0x1937 }
        L_0x18c7:
            r6.close()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            if (r5 == 0) goto L_0x192b
            X.6VK r3 = r11.A00     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.C36351kA.A1K(r0, r1)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r0 = ".jpg"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.005 r0 = r3.A0P     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.Object r0 = r0.get()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.0y0 r0 = (X.C20690y0) r0     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.io.File r4 = r0.A0X(r1)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.io.FileOutputStream r3 = X.C90524aI.A0W(r4)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x1926 }
            r0 = 100
            r5.compress(r1, r0, r3)     // Catch:{ all -> 0x1926 }
            r3.flush()     // Catch:{ all -> 0x1926 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r0 = r4.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.9oz r3 = new X.9oz     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r3.<init>((java.lang.String) r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            java.lang.String r1 = r17.getCanonicalPath()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            X.9oz r0 = new X.9oz     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r0.<init>((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            int r0 = r0.A0Y(r7)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            if (r0 == 0) goto L_0x191e
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r3.A0b(r13, r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r3.A0a()     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
        L_0x191e:
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A00(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x1926:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x193c }
            goto L_0x1940
        L_0x192b:
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A01(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x1931:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A01(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x1937:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x193c }
            goto L_0x1940
        L_0x193c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
        L_0x1940:
            throw r1     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
        L_0x1941:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            r10.A01(r0)     // Catch:{ FileNotFoundException -> 0x194a, IOException -> 0x194d, SecurityException -> 0x1947 }
            return r2
        L_0x1947:
            java.lang.Integer r0 = X.C023109s.A01
            goto L_0x194f
        L_0x194a:
            java.lang.Integer r0 = X.C023109s.A00
            goto L_0x194f
        L_0x194d:
            java.lang.Integer r0 = X.C023109s.A0C
        L_0x194f:
            r10.A01(r0)
            return r2
        L_0x1953:
            java.lang.Object r7 = X.AnonymousClass6MO.A01(r11, r0)
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.bloks.BloksContext"
            X.AnonymousClass00C.A0E(r7, r5)
            X.67i r7 = (X.C1271967i) r7
            java.lang.Object r8 = X.AnonymousClass6MO.A00(r11, r1)
            java.util.Objects.requireNonNull(r8)
            X.C90494aF.A10(r8)
            java.util.List r1 = r11.A00
            X.7ku r3 = X.C90464aC.A0H(r1, r3)
            X.7ku r1 = X.C90464aC.A0H(r1, r4)
            X.63O r6 = new X.63O
            r6.<init>(r7, r0, r3, r1)
            X.67i r1 = r0.A00
            if (r1 == 0) goto L_0x19a4
            android.content.Context r5 = r1.A00
            if (r5 == 0) goto L_0x19a4
            android.content.pm.PackageManager r7 = r5.getPackageManager()
            if (r7 == 0) goto L_0x19a4
            java.lang.String r1 = "front"
            boolean r4 = r1.equals(r8)
            java.lang.String r1 = "android.hardware.camera.front"
            boolean r3 = r7.hasSystemFeature(r1)
            java.lang.String r1 = "android.hardware.camera"
            boolean r1 = r7.hasSystemFeature(r1)
            if (r4 == 0) goto L_0x19a1
            if (r3 != 0) goto L_0x19a7
        L_0x199b:
            java.lang.Integer r0 = X.C023109s.A00
        L_0x199d:
            r6.A00(r0)
            return r2
        L_0x19a1:
            if (r1 != 0) goto L_0x19a7
            goto L_0x199b
        L_0x19a4:
            java.lang.Integer r0 = X.C023109s.A0G
            goto L_0x199d
        L_0x19a7:
            android.app.Activity r4 = A01(r0)
            X.AnonymousClass00C.A08(r4)
            java.lang.String r3 = "android.permission.CAMERA"
            java.lang.String r1 = "android.permission.READ_EXTERNAL_STORAGE"
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String[] r1 = new java.lang.String[]{r3, r1, r0}
            X.6qL r0 = new X.6qL
            r0.<init>(r4, r5, r6, r15)
            r15.A04(r4, r0, r1)
            return r2
        L_0x19c1:
            java.lang.Object r2 = com.bloks.actions.cds.bkactioncdsupdatebackbuttonoverride.BKBloksActionCdsUpdateBackButtonOverrideImpl.evaluate(r11, r0)
            return r2
        L_0x19c6:
            java.lang.String r2 = "CONSUMER"
            return r2
        L_0x19c9:
            java.lang.Object r2 = r9.A05(r0, r11, r7)
            return r2
        L_0x19ce:
            java.lang.Long r2 = X.C36411kG.A0t()
            return r2
        L_0x19d3:
            java.lang.Object r2 = r9.A05(r0, r11, r1)
            return r2
        L_0x19d8:
            java.util.List r0 = r11.A00
            java.lang.String r2 = X.C36401kF.A0s(r0, r7)
            java.lang.String r0 = X.C36401kF.A0s(r0, r1)
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            boolean r0 = X.C36361kB.A1Z(r2, r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x19ef:
            java.util.List r5 = r11.A00
            java.lang.String r4 = X.C36401kF.A0s(r5, r7)
            int r3 = X.C36421kH.A06(r5, r1)
            java.lang.String[] r2 = new java.lang.String[r3]
        L_0x19fb:
            if (r7 >= r3) goto L_0x1a07
            int r1 = r7 + 1
            java.lang.Object r0 = r5.get(r1)
            r2[r7] = r0
            r7 = r1
            goto L_0x19fb
        L_0x1a07:
            java.lang.String r2 = java.text.MessageFormat.format(r4, r2)
            return r2
        L_0x1a0c:
            java.lang.String r3 = X.AnonymousClass6MO.A02(r11, r7)
            java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x1a14 }
            goto L_0x1a1d
        L_0x1a14:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "NumberUtil/Invalid long value:"
            X.C36321k7.A1P(r1, r3, r2)
        L_0x1a1d:
            A01(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
            return r2
        L_0x1a25:
            java.util.List r0 = r11.A00
            java.lang.String r3 = X.C36401kF.A0s(r0, r7)
            java.lang.Object r2 = r0.get(r1)
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            int r0 = r2.size()
            java.lang.String[] r1 = new java.lang.String[r0]
        L_0x1a37:
            int r0 = r2.size()
            if (r7 >= r0) goto L_0x1a46
            java.lang.Object r0 = r2.get(r7)
            r1[r7] = r0
            int r7 = r7 + 1
            goto L_0x1a37
        L_0x1a46:
            java.lang.String r2 = java.text.MessageFormat.format(r3, r1)
            return r2
        L_0x1a4b:
            java.util.List r8 = r11.A00
            java.lang.String r3 = X.C36401kF.A0s(r8, r7)
            r6 = 0
            long r4 = java.lang.Long.parseLong(r3)     // Catch:{ NumberFormatException -> 0x1a5b }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r2
            goto L_0x1a66
        L_0x1a5b:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "NumberUtil/Invalid long value:"
            X.C36321k7.A1P(r0, r3, r2)
            r4 = 0
        L_0x1a66:
            java.lang.String r2 = X.C36401kF.A0s(r8, r1)
            X.005 r0 = r15.A0X
            java.lang.Object r0 = r0.get()
            X.0wo r0 = (X.C19970wo) r0
            long r0 = X.C19970wo.A00(r0)
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x1ace
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            int r0 = r2.hashCode()
            switch(r0) {
                case -1074026988: goto L_0x1aaf;
                case -906279820: goto L_0x1a9d;
                case 3208676: goto L_0x1a8b;
                default: goto L_0x1a86;
            }
        L_0x1a86:
            java.lang.String r2 = java.lang.String.valueOf(r4)
            return r2
        L_0x1a8b:
            java.lang.String r0 = "hour"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1a86
            double r2 = r1.doubleValue()
            r0 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            goto L_0x1ac0
        L_0x1a9d:
            java.lang.String r0 = "second"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1a86
            double r2 = r1.doubleValue()
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x1ac0
        L_0x1aaf:
            java.lang.String r0 = "minute"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x1a86
            double r2 = r1.doubleValue()
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
        L_0x1ac0:
            double r2 = r2 / r0
            double r0 = java.lang.Math.ceil(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            long r4 = r0.longValue()
            goto L_0x1a86
        L_0x1ace:
            r0 = -1
            java.lang.String r2 = java.lang.String.valueOf(r0)
            return r2
        L_0x1ad5:
            X.005 r0 = r15.A0R
            java.lang.Object r0 = r0.get()
            X.0wQ r0 = (X.C19730wQ) r0
            com.whatsapp.jid.PhoneUserJid r1 = X.C36371kC.A0e(r0)
            X.005 r0 = r15.A0G
            java.lang.Object r0 = r0.get()
            X.61j r0 = (X.C1258161j) r0
            java.util.Map r2 = r0.A00(r1)
            return r2
        L_0x1aee:
            X.005 r0 = r15.A0U
            java.lang.Object r0 = r0.get()
            X.1Vf r0 = (X.C29071Vf) r0
            X.61Z r0 = r0.BFs()
            java.lang.String r2 = r0.A01
            return r2
        L_0x1afd:
            java.lang.String r0 = "Cannot unwind without an existing bottom sheet."
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        L_0x1b04:
            return r2
        L_0x1b05:
            X.5Uo r0 = new X.5Uo     // Catch:{ 5Uo -> 0x1b0b }
            r0.<init>()     // Catch:{ 5Uo -> 0x1b0b }
            throw r0     // Catch:{ 5Uo -> 0x1b0b }
        L_0x1b0b:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r0.getMessage()
            return r2
        L_0x1b13:
            X.0zE r0 = r0.A02
            goto L_0x1b18
        L_0x1b16:
            X.0zE r0 = r0.A03
        L_0x1b18:
            r0.markerEnd(r7, r9, r8)
            return r2
        L_0x1b1c:
            X.5rP r1 = r15.A03
            X.005 r0 = r1.A00
            int r4 = X.AnonymousClass61J.A00(r0, r8, r5)
            int r5 = X.C122885va.A00(r0, r5)
            X.005 r0 = r1.A01
            X.6yf r3 = X.C90514aH.A0h(r0)
            X.0zI r1 = r3.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.4qp r4 = new X.4qp
            r4.<init>(r1, r3, r0, r5)
            r4.pointEditor(r6)
            java.util.Iterator r5 = X.C36371kC.A10(r7)
        L_0x1b40:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x1bde
            java.util.Map$Entry r0 = X.AnonymousClass000.A11(r5)
            java.lang.String r3 = X.C90494aF.A0f(r0)
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x1b5c
            java.lang.String r1 = (java.lang.String) r1
        L_0x1b58:
            r4.addPointData((java.lang.String) r3, (java.lang.String) r1)
            goto L_0x1b40
        L_0x1b5c:
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x1b68
            int r0 = X.AnonymousClass000.A0I(r1)
            r4.addPointData((java.lang.String) r3, (int) r0)
            goto L_0x1b40
        L_0x1b68:
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 == 0) goto L_0x1b74
            long r0 = X.C36431kI.A09(r1)
            r4.addPointData((java.lang.String) r3, (long) r0)
            goto L_0x1b40
        L_0x1b74:
            boolean r0 = r1 instanceof java.lang.Double
            if (r0 == 0) goto L_0x1b80
            double r0 = X.C90504aG.A01(r1)
            r4.addPointData((java.lang.String) r3, (double) r0)
            goto L_0x1b40
        L_0x1b80:
            boolean r0 = r1 instanceof java.lang.Float
            if (r0 == 0) goto L_0x1b8c
            float r0 = X.C36441kJ.A03(r1)
            r4.addPointData((java.lang.String) r3, (float) r0)
            goto L_0x1b40
        L_0x1b8c:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L_0x1b98
            boolean r0 = X.AnonymousClass000.A1X(r1)
            r4.addPointData((java.lang.String) r3, (boolean) r0)
            goto L_0x1b40
        L_0x1b98:
            boolean r0 = r1 instanceof int[]
            if (r0 == 0) goto L_0x1ba2
            int[] r1 = (int[]) r1
            r4.addPointData((java.lang.String) r3, (int[]) r1)
            goto L_0x1b40
        L_0x1ba2:
            boolean r0 = r1 instanceof long[]
            if (r0 == 0) goto L_0x1bac
            long[] r1 = (long[]) r1
            r4.addPointData((java.lang.String) r3, (long[]) r1)
            goto L_0x1b40
        L_0x1bac:
            boolean r0 = r1 instanceof java.lang.String[]
            if (r0 == 0) goto L_0x1bb6
            java.lang.String[] r1 = (java.lang.String[]) r1
            r4.addPointData((java.lang.String) r3, (java.lang.String[]) r1)
            goto L_0x1b40
        L_0x1bb6:
            boolean r0 = r1 instanceof double[]
            if (r0 == 0) goto L_0x1bc0
            double[] r1 = (double[]) r1
            r4.addPointData((java.lang.String) r3, (double[]) r1)
            goto L_0x1b40
        L_0x1bc0:
            boolean r0 = r1 instanceof float[]
            if (r0 == 0) goto L_0x1bcb
            float[] r1 = (float[]) r1
            r4.addPointData((java.lang.String) r3, (float[]) r1)
            goto L_0x1b40
        L_0x1bcb:
            boolean r0 = r1 instanceof boolean[]
            if (r0 == 0) goto L_0x1bd6
            boolean[] r1 = (boolean[]) r1
            r4.addPointData((java.lang.String) r3, (boolean[]) r1)
            goto L_0x1b40
        L_0x1bd6:
            if (r1 == 0) goto L_0x1b40
            java.lang.String r1 = r1.toString()
            goto L_0x1b58
        L_0x1bde:
            r4.pointEditingCompleted()
            return r2
        L_0x1be2:
            X.0zE r0 = r0.A02
            goto L_0x1be7
        L_0x1be5:
            X.0zE r0 = r0.A03
        L_0x1be7:
            r0.markerEnd(r8, r9, r6)
            return r2
        L_0x1beb:
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r3, r3)     // Catch:{ NullPointerException | SecurityException -> 0x1bf3 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x1bf3 }
            return r2
        L_0x1bf3:
            java.lang.String r0 = "bkinterpreter/clipboard/"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x1bf9:
            r1 = move-exception
            java.lang.String r0 = "Error during annotations map parse"
            goto L_0x1c42
        L_0x1bfd:
            X.6Ou r0 = r15.A00
            X.6EW r3 = r0.A01(r3)
            java.lang.String r1 = r4.A00()
            X.702 r0 = new X.702
            r0.<init>(r1)
            r3.A02(r0)
            return r2
        L_0x1c10:
            X.005 r0 = r15.A04     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x1c3f }
            X.0yB r0 = (X.C20800yB) r0     // Catch:{ IllegalArgumentException -> 0x1c3f }
            boolean r0 = r0.A0E(r4)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.String r2 = java.lang.Boolean.toString(r0)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            return r2
        L_0x1c21:
            X.005 r0 = r15.A04     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x1c3f }
            X.0yB r0 = (X.C20800yB) r0     // Catch:{ IllegalArgumentException -> 0x1c3f }
            int r0 = r0.A07(r4)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.String r2 = java.lang.Integer.toString(r0)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            return r2
        L_0x1c32:
            X.005 r0 = r15.A04     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x1c3f }
            X.0yB r0 = (X.C20800yB) r0     // Catch:{ IllegalArgumentException -> 0x1c3f }
            java.lang.String r2 = r0.A09(r4)     // Catch:{ IllegalArgumentException -> 0x1c3f }
            return r2
        L_0x1c3f:
            r1 = move-exception
            java.lang.String r0 = "Bloks: WaBkGlobalInterpreterExtImpl/getAbPropValue/exception"
        L_0x1c42:
            com.whatsapp.util.Log.e(r0, r1)
            return r2
        L_0x1c46:
            java.lang.String r2 = "0"
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C142326oh.B6u(X.6MO, X.5iW, X.5xd):java.lang.Object");
    }
}
