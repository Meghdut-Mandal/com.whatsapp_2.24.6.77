package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Queue;

/* renamed from: X.7TI  reason: invalid class name */
public final class AnonymousClass7TI extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C26511Kl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7TI(C26511Kl r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        AnonymousClass00C.A0D(map, 0);
        C26511Kl r4 = this.this$0;
        synchronized (r4) {
            Iterator A0y = AnonymousClass000.A0y(map);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                r4.A00.put(C90494aF.A0f(A11), (byte[]) A11.getValue());
            }
            Queue<Object> queue = r4.A03;
            for (Object A1O : queue) {
                C36411kG.A1O(A1O);
            }
            queue.clear();
            r4.A06 = true;
        }
        return AnonymousClass0AJ.A00;
    }
}
