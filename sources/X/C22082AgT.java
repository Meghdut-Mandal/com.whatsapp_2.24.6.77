package X;

import android.os.Handler;
import java.util.UUID;

/* renamed from: X.AgT  reason: case insensitive filesystem */
public final class C22082AgT extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ C199069ee this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22082AgT(C199069ee r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C202559mB r6 = this.this$0.A00;
        if (r6 != null) {
            UUID randomUUID = UUID.randomUUID();
            AnonymousClass00C.A08(randomUUID);
            AnonymousClass90V r4 = AnonymousClass90V.MAIN;
            if (r6.A0E.get()) {
                r6.A0G.invoke(new AnonymousClass89K("Unable to set link, link setup has been detached"));
            } else {
                Handler handler = r6.A03;
                if (handler != null) {
                    handler.postDelayed(r6.A0D, 3000);
                }
                r6.A05.A03(new C22483AnM(r6, r4, randomUUID));
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
