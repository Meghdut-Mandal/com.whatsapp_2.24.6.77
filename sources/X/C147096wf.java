package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6wf  reason: invalid class name and case insensitive filesystem */
public final class C147096wf implements C159607jd {
    public final /* synthetic */ AnonymousClass5HK A00;

    public C147096wf(AnonymousClass5HK r1) {
        this.A00 = r1;
    }

    public void BiH(Map map) {
        Object obj;
        AnonymousClass5HK r3 = this.A00;
        if (map.size() <= 1 || !AnonymousClass00C.A0J(r3.A01, "all_options")) {
            if (r3.A01 != null) {
                Map.Entry entry = (Map.Entry) C007103b.A0I(map.entrySet());
                if (entry != null) {
                    obj = entry.getKey();
                } else {
                    obj = null;
                }
                if (!AnonymousClass00C.A0J(obj, r3.A01)) {
                    return;
                }
            } else {
                return;
            }
        }
        AnonymousClass736.A00(r3.A04, r3, (Object) null, map, 44);
    }

    public void onError(Throwable th) {
        C19770wU r2;
        Runnable runnable;
        int i = 9;
        if (th instanceof C178228fO) {
            i = 8;
        }
        C147436xD r5 = new C147436xD(i);
        AnonymousClass5HK r4 = this.A00;
        if (AnonymousClass00C.A0J(r4.A01, "all_options")) {
            List<AnonymousClass3PS> list = r4.A01().A05;
            AnonymousClass00C.A08(list);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(list));
            for (AnonymousClass3PS r0 : list) {
                String str = r0.A02;
                if (str == null) {
                    str = "";
                }
                linkedHashMap.put(str, C023409w.A00);
            }
            r2 = r4.A04;
            runnable = new AnonymousClass736(r4, r5, linkedHashMap, 44);
        } else {
            r2 = r4.A04;
            runnable = new C1498072v(r4, r5, 35);
        }
        r2.Boy(runnable);
    }
}
