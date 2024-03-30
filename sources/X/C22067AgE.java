package X;

import com.facebook.wearable.datax.LocalChannel;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.AgE  reason: case insensitive filesystem */
public final class C22067AgE extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22067AgE(AnonymousClass8AF r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        AnonymousClass8AF r5 = this.this$0;
        AnonymousClass9Y3 r1 = r5.A01.A01;
        LocalChannel localChannel = r1.A02;
        if (localChannel != null) {
            r1.A03(new CompletableFuture());
            AnonymousClass84B r12 = r5.A01;
            CompletableFuture A01 = r12.A01.A01();
            if (A01 != null) {
                C200159gk r7 = AnonymousClass9AO.A01;
                r7.A01("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER] snAppManagerChannel.send, stop SNAM");
                AtomicBoolean atomicBoolean = r5.A02;
                if (atomicBoolean.compareAndSet(false, true)) {
                    try {
                        AnonymousClass8NN A0p = AnonymousClass8NU.DEFAULT_INSTANCE.A0p();
                        ((AnonymousClass8NU) C90524aI.A0H(A0p)).appID_ = AnonymousClass91H.A00(r12.A03).BEY();
                        AnonymousClass8NN.A0L(localChannel, A0p, 2002);
                    } catch (C187298xc e) {
                        if (e.error.A00 == 49156) {
                            r7.A05("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER] Internal Error, LocalChannel could not find receiver", e);
                        } else {
                            throw e;
                        }
                    }
                    try {
                        obj = (String) A01.get(2000, TimeUnit.MILLISECONDS);
                    } catch (Throwable th) {
                        obj = C90524aI.A0t(th);
                    }
                    if (!(obj instanceof AnonymousClass03N)) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        A0u.append("[SN_APP_MANAGER] SNAM shutdown with response ");
                        A0u.append((String) obj);
                        r7.A01("sup:LiveStreamAppStateDelegate", AnonymousClass000.A0q(".  Closing channel", A0u));
                    }
                    Throwable A00 = AnonymousClass0AK.A00(obj);
                    if (A00 != null) {
                        r5.A0B(new C22228Aip(r5, A00));
                    }
                    atomicBoolean.set(false);
                }
            }
        }
        C22067AgE.super.A08();
        return AnonymousClass0AJ.A00;
    }
}
