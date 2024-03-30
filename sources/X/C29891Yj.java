package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Yj  reason: invalid class name and case insensitive filesystem */
public final class C29891Yj extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C29871Yh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29891Yj(C29871Yh r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A0c = C007103b.A0c(C13620kA.A0F(((AnonymousClass9XG) this.this$0.A02.getValue()).A01()), new C89824Ya(2));
        ArrayList arrayList = new ArrayList();
        for (Object next : A0c) {
            if (!(((AnonymousClass011) next).second instanceof AB7)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
