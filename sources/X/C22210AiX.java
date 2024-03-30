package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.AiX  reason: case insensitive filesystem */
public final class C22210AiX extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C203279ni this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22210AiX(C203279ni r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C197839cS r0;
        Context context = this.this$0.A02.A00;
        AnonymousClass006.A02(context, "Context must not be null");
        AnonymousClass8BK r4 = new AnonymousClass8BK(context);
        synchronized (C197839cS.class) {
            AnonymousClass9TS r2 = new AnonymousClass9TS(r4);
            Map map = C197839cS.A03;
            if (!map.containsKey(r2)) {
                map.put(r2, new C197839cS());
            }
            r0 = (C197839cS) map.get(r2);
        }
        r4.A00 = r0;
        return r4;
    }
}
