package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.6zj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C148976zj implements C158597hl {
    public final /* synthetic */ AnonymousClass6C8 A00;
    public final /* synthetic */ C179158jJ A01;

    public /* synthetic */ C148976zj(AnonymousClass6C8 r1, C179158jJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BX5(Object obj) {
        Object obj2;
        Object obj3;
        AnonymousClass6C8 r4 = this.A00;
        AnonymousClass709 r6 = (AnonymousClass709) obj;
        Map map = r6.A02;
        if (map != null && map.containsKey("error") && "onLoadingFailure".equals(r6.A00) && (obj2 = map.get("error")) != null && (obj3 = ((AbstractMap) obj2).get("code")) != null) {
            C179158jJ.A0j(r4, (Map) null, AnonymousClass000.A0I(obj3));
        }
    }
}
