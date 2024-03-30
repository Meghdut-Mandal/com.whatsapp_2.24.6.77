package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.5a5  reason: invalid class name and case insensitive filesystem */
public abstract class C110075a5 {
    public static C1038857l A00(String str, List list, Map map, int i, int i2, int i3) {
        boolean A1Q = AnonymousClass000.A1Q(list.size() % 4);
        StringBuilder A0u = AnonymousClass000.A0u();
        C36371kC.A1R("BloksFieldStatParser/parseFieldStat/invalid serialization/length=", A0u, list);
        C18740tg.A0E(A1Q, A0u.toString());
        int size = list.size() / 4;
        ArrayList A0I = AnonymousClass001.A0I();
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = i4 * 4;
            int A06 = C36351kA.A06(list, i5 + 2);
            Object obj = list.get(i5 + 3);
            Object A00 = C110085a6.A00(obj, A06, false);
            if (A00 != null) {
                int A062 = C36351kA.A06(list, i5);
                A0I.add(new C122295uc(A00, C110085a6.A00(obj, A06, true), C36401kF.A0s(list, i5 + 1), A062));
            }
        }
        return new C1038857l(new C18950u5(AnonymousClass6R8.A00(C36431kI.A1A("sample_rate_debug", map), 1), AnonymousClass6R8.A00(C36431kI.A1A("sample_rate_beta", map), 20), AnonymousClass6R8.A00(C36431kI.A1A("sample_rate_beta", map), 20), AnonymousClass6R8.A00(C36431kI.A1A("sample_rate_release", map), 20), "1".equals(map.get("log_all_for_debug"))), str, (C122295uc[]) A0I.toArray(new C122295uc[0]), i, i2, i3);
    }
}
