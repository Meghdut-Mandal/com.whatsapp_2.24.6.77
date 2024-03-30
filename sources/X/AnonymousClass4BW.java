package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.4BW  reason: invalid class name */
public final class AnonymousClass4BW extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass39C this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4BW(AnonymousClass39C r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass011 r1 = (AnonymousClass011) it.next();
            int A0I = AnonymousClass000.A0I(r1.first);
            Object obj = r1.second;
            Object obj2 = A1G.get(obj);
            if (obj2 == null) {
                obj2 = C36441kJ.A17();
                A1G.put(obj, obj2);
            }
            ((Set) obj2).add(Integer.valueOf(A0I));
        }
        return A1G;
    }
}
