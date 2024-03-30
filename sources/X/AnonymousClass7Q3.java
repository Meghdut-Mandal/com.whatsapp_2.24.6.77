package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.7Q3  reason: invalid class name */
public final class AnonymousClass7Q3 extends AnonymousClass00R implements AnonymousClass00S {
    public static final AnonymousClass7Q3 A00 = new AnonymousClass7Q3();

    public AnonymousClass7Q3() {
        super(0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AbstractCollection abstractCollection = (AbstractCollection) C36381kD.A0p(C114005gU.A03);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C36331k8.A01(abstractCollection));
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            AnonymousClass5oD r0 = (AnonymousClass5oD) it.next();
            C36341k9.A1K(r0.A01, linkedHashMap, r0.A00);
        }
        return C20070wy.copyOf((Map) linkedHashMap);
    }
}
