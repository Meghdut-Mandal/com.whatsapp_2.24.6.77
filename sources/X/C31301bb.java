package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
public final class C31301bb extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C31281bZ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31301bb(C31281bZ r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        HashMap A01 = C131866Qy.A01(((C20800yB) this.this$0.A01.getValue()).A09(7647));
        ArrayList arrayList = new ArrayList(A01.size());
        for (Map.Entry entry : A01.entrySet()) {
            arrayList.add(new AnonymousClass011(entry.getKey(), entry.getValue().toString()));
        }
        return C000400e.A09(arrayList);
    }
}
