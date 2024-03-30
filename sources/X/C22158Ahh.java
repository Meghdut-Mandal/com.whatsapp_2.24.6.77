package X;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Ahh  reason: case insensitive filesystem */
public final class C22158Ahh extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass9MY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22158Ahh(AnonymousClass9MY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A1G = C36431kI.A1G();
        Iterator it = this.this$0.A01.iterator();
        while (it.hasNext()) {
            AnonymousClass011 r2 = (AnonymousClass011) it.next();
            C36341k9.A1K(r2.second, A1G, AnonymousClass000.A0I(r2.first));
        }
        return A1G;
    }
}
