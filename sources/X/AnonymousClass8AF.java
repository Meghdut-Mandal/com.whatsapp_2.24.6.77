package X;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.8AF  reason: invalid class name */
public final class AnonymousClass8AF extends AnonymousClass84C {
    public CompletableFuture A00;
    public final AnonymousClass84B A01;
    public final AtomicBoolean A02 = new AtomicBoolean(false);
    public final AtomicInteger A03 = new AtomicInteger(0);

    public static final void A01(C187298xc r3, AnonymousClass8AF r4) {
        CompletableFuture completableFuture = r4.A00;
        if (completableFuture != null) {
            completableFuture.complete(C36381kD.A0j());
        }
        AnonymousClass9AO.A01.A05("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER]: snAppManager error opening channel", r3);
        r4.A01.A08(new C1695289r("SNAM_CONNECTION_FAIL"), r3, true);
    }

    public static final void A02(AnonymousClass8AF r3) {
        CompletableFuture completableFuture = r3.A00;
        if (completableFuture != null) {
            completableFuture.complete(C36371kC.A0m());
        }
        AnonymousClass9AO.A01.A01("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER]: Mediastream services started on device.");
        AnonymousClass84B r32 = r3.A01;
        C23090B4a b4a = r32.A0H;
        if (b4a != null) {
            b4a.BPK("sn_app_manager_started");
        }
        AnonymousClass81Q.A01(r32.A0B, r32, AnonymousClass84B.A0S, 3);
    }

    public void A07() {
        this.A01.A0C(new C22066AgD(this));
    }

    public void A08() {
        this.A01.A0C(new C22067AgE(this));
    }

    public AnonymousClass8AF(AnonymousClass84B r3) {
        super(r3);
        this.A01 = r3;
    }
}
