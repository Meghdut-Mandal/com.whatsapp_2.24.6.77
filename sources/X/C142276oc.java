package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6oc  reason: invalid class name and case insensitive filesystem */
public class C142276oc implements AnonymousClass7fJ {
    public final AnonymousClass7fJ A00;

    public Object B6u(AnonymousClass6MO r9, C115215iW r10, C124125xd r11) {
        String str = r10.A00;
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    Object A002 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A002);
                    return C129316Gk.A00(Math.sqrt(C90504aG.A01(A002)));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return AnonymousClass6MO.A02(r9, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1606945202:
                if (str.equals("bk.action.array.Reduce")) {
                    List list = r9.A00;
                    List list2 = (List) list.get(0);
                    Object A003 = AnonymousClass6MO.A00(r9, 1);
                    Objects.requireNonNull(A003);
                    AnonymousClass6JJ r3 = (AnonymousClass6JJ) A003;
                    Object obj = list.get(2);
                    if (list2 != null) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            C1273868b A02 = C1273868b.A02(obj);
                            A02.A09(list2.get(i2), 1);
                            try {
                                obj = AnonymousClass5ZN.A00(C1273868b.A05(A02, Integer.valueOf(i2), 2), r3.A00, r11);
                                i2++;
                            } catch (AnonymousClass5VI e) {
                                throw AnonymousClass001.A0B(e);
                            }
                        }
                    }
                    return obj;
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    Object A004 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A004);
                    Object A005 = AnonymousClass6MO.A00(r9, 1);
                    Objects.requireNonNull(A005);
                    return Boolean.valueOf(((String) A004).contains((String) A005));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list3 = r9.A00;
                    String A0s = C36401kF.A0s(list3, 0);
                    list3.get(1);
                    List list4 = (List) list3.get(1);
                    if (A0s != null) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        while (i < list4.size()) {
                            String A0s2 = C36401kF.A0s(list4, i);
                            if (A0s2 != null) {
                                A0u.append(A0s2);
                                if (i < C36421kH.A06(list4, 1)) {
                                    A0u.append(A0s);
                                }
                                i++;
                            } else {
                                throw AnonymousClass001.A08("element must not be null");
                            }
                        }
                        return A0u.toString();
                    }
                    throw AnonymousClass001.A08("delimeter must not be null");
                }
                break;
            case -240276909:
                if (str.equals("bk.action.map.Merge")) {
                    HashMap A0J = AnonymousClass001.A0J();
                    while (true) {
                        List list5 = r9.A00;
                        if (i >= list5.size()) {
                            return A0J;
                        }
                        Map A0k = C90494aF.A0k(list5, i);
                        if (A0k != null) {
                            A0J.putAll(A0k);
                        }
                        i++;
                    }
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    Object A006 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A006);
                    Object A007 = AnonymousClass6MO.A00(r9, 1);
                    Objects.requireNonNull(A007);
                    AnonymousClass6JJ r7 = (AnonymousClass6JJ) A007;
                    HashMap A0J2 = AnonymousClass001.A0J();
                    Iterator A0y = AnonymousClass000.A0y((Map) A006);
                    while (A0y.hasNext()) {
                        Map.Entry A11 = AnonymousClass000.A11(A0y);
                        C1273868b A008 = C1273868b.A00();
                        A008.A0A(A11.getKey(), 0);
                        try {
                            if (C129316Gk.A01(AnonymousClass5ZN.A00(C1273868b.A04(A008, A11.getValue(), 1), r7.A00, r11))) {
                                C36411kG.A1T(A0J2, A11);
                            }
                        } catch (AnonymousClass5VI e2) {
                            throw AnonymousClass001.A0B(e2);
                        }
                    }
                    return A0J2;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    Object A009 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A009);
                    long A09 = C36431kI.A09(A009);
                    Object A0010 = AnonymousClass6MO.A00(r9, 1);
                    Objects.requireNonNull(A0010);
                    long A0I = (long) AnonymousClass000.A0I(A0010);
                    if (A0I >= 2 && A0I <= 36) {
                        return Long.toString(A09, (int) A0I);
                    }
                    throw AnonymousClass001.A08("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    Object A0011 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A0011);
                    return C36441kJ.A15(((Map) A0011).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    Object A0012 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A0012);
                    return C90494aF.A0g((Map) A0012);
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    Object A0013 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A0013);
                    return C129316Gk.A00(Math.log(C90504aG.A01(A0013)));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    Object A0014 = AnonymousClass6MO.A00(r9, 0);
                    Objects.requireNonNull(A0014);
                    double A01 = C90504aG.A01(A0014);
                    Object A0015 = AnonymousClass6MO.A00(r9, 1);
                    Objects.requireNonNull(A0015);
                    return C129316Gk.A00(Math.pow(A01, C90504aG.A01(A0015)));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = r9.A00;
                    return Boolean.valueOf(C36401kF.A0s(list6, 0).startsWith(C36401kF.A0s(list6, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return AnonymousClass6MO.A02(r9, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        AnonymousClass7fJ r0 = this.A00;
        if (r0 != null) {
            return r0.B6u(r9, r10, r11);
        }
        throw new AnonymousClass78V(AnonymousClass000.A0p("unknown function ", str, AnonymousClass000.A0u()));
    }

    public C142276oc(AnonymousClass7fJ r1) {
        this.A00 = r1;
    }
}
