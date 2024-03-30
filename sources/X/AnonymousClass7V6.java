package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7V6  reason: invalid class name */
public final class AnonymousClass7V6 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass7cT $onFetchCallback = null;
    public final /* synthetic */ Map $params;
    public final /* synthetic */ boolean $shouldPrefetchSubqueries;
    public final /* synthetic */ C130466Le this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7V6(C130466Le r2, Map map, boolean z) {
        super(1);
        this.$shouldPrefetchSubqueries = z;
        this.this$0 = r2;
        this.$params = map;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass72B r1;
        AnonymousClass66B r5 = (AnonymousClass66B) obj;
        AnonymousClass00C.A0D(r5, 0);
        if (r5 instanceof C100524vA) {
            if (this.$shouldPrefetchSubqueries && (r1 = ((C100524vA) r5).A00) != null) {
                C130466Le r7 = this.this$0;
                Map map = this.$params;
                List list = r1.asyncComponentQueries;
                if (list != null && C36401kF.A1a(list)) {
                    List<AnonymousClass72E> list2 = r1.asyncComponentQueries;
                    AnonymousClass00C.A07(list2);
                    for (AnonymousClass72E r4 : list2) {
                        LinkedHashMap A1G = C36431kI.A1G();
                        Map map2 = r4.consumedParams;
                        if (map2 != null) {
                            Iterator A0y = AnonymousClass000.A0y(map2);
                            while (A0y.hasNext()) {
                                Map.Entry A11 = AnonymousClass000.A11(A0y);
                                Object key = A11.getKey();
                                AnonymousClass00C.A08(key);
                                A1G.put(key, map.get(A11.getValue()));
                            }
                        }
                        String str2 = r4.appId;
                        AnonymousClass00C.A07(str2);
                        Set set = r4.cacheKeys;
                        Long l = r4.cacheTtl;
                        AnonymousClass00C.A07(l);
                        long longValue = l.longValue();
                        r7.A06.execute(new AnonymousClass742(r7, C023109s.A00, str2, A1G, set, longValue, true, false));
                    }
                }
            }
        } else if ((r5 instanceof C100514v9) || (r5 instanceof C100544vC)) {
            C130466Le r0 = this.this$0;
            ArrayList A0I = AnonymousClass001.A0I();
            synchronized (r0.A04) {
                Iterator it = r0.A05.iterator();
                while (it.hasNext()) {
                    C121105sb r02 = (C121105sb) it.next();
                    C006302t r2 = r02.A01;
                    String str3 = r02.A00;
                    if (r5 instanceof C100534vB) {
                        str = ((C100534vB) r5).A01;
                    } else {
                        str = r5.A01;
                    }
                    if (AnonymousClass00C.A0J(str3, str)) {
                        A0I.add(r2);
                        it.remove();
                    }
                }
            }
            Iterator it2 = A0I.iterator();
            while (it2.hasNext()) {
                ((C006302t) it2.next()).invoke(r5);
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
