package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2if  reason: invalid class name and case insensitive filesystem */
public final class C49162if extends C132446Tt {
    public final List A00;
    public final /* synthetic */ C27361Nx A01;

    public C49162if(C27361Nx r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Map map = (Map) obj;
        Iterator A10 = AnonymousClass000.A10(map);
        while (A10.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(A10);
            C27361Nx.A01(A0a, (AnonymousClass35G) map.get(A0a), this.A01);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        HashMap A0J = AnonymousClass001.A0J();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            A0J.put(A0a, C27361Nx.A00(A0a, this.A01));
        }
        return A0J;
    }
}
