package X;

import com.facebook.wearable.datax.LocalChannel;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AgD  reason: case insensitive filesystem */
public final class C22066AgD extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22066AgD(AnonymousClass8AF r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LocalChannel localChannel;
        Object obj;
        C199069ee r0;
        AnonymousClass9DE r02;
        C22066AgD.super.A07();
        AnonymousClass8AF r4 = this.this$0;
        AnonymousClass9Y3 r6 = r4.A01.A01;
        r4.A02.set(false);
        r4.A00 = new CompletableFuture();
        AnonymousClass88I r03 = r6.A07;
        if (r03 == null || (r0 = r03.A00) == null || (r02 = r0.A06) == null) {
            localChannel = null;
        } else {
            localChannel = new LocalChannel(r02.A00.A04, 28);
            localChannel.onReceived = new C22337Akz(r4);
            localChannel.onClosed = new C22069AgG(r4);
            localChannel.onError = new C22338Al0(r4);
            C200159gk r7 = AnonymousClass9AO.A01;
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("[SN_APP_MANAGER]: snAppManagerChannel.send, start LS request [");
            A0u.append(r4.A03.get() + 1);
            r7.A01("sup:LiveStreamAppStateDelegate", AnonymousClass000.A0t(A0u, ']'));
            AnonymousClass84B r9 = r4.A01;
            C23090B4a b4a = r9.A0H;
            if (b4a != null) {
                b4a.BPK("sn_app_manager_start_request");
            }
            try {
                AnonymousClass8NN A0p = C172618On.DEFAULT_INSTANCE.A0p();
                ((C172618On) C90524aI.A0H(A0p)).appID_ = AnonymousClass91H.A00(r9.A03).BEY();
                AnonymousClass8NN.A0L(localChannel, A0p, 2000);
            } catch (C187298xc e) {
                if (e.error.A00 == 49156) {
                    r7.A05("sup:LiveStreamAppStateDelegate", "[SN_APP_MANAGER] Internal Error, LocalChannel could not find receiver", e);
                } else {
                    throw e;
                }
            }
        }
        try {
            CompletableFuture A00 = r4.A00;
            if (A00 != null) {
                obj = (Boolean) A00.get(1000, TimeUnit.MILLISECONDS);
            } else {
                obj = null;
            }
        } catch (Throwable th) {
            obj = C90524aI.A0t(th);
        }
        if (!(obj instanceof AnonymousClass03N)) {
            r6.A02 = localChannel;
        }
        if (AnonymousClass0AK.A00(obj) != null) {
            r4.A0B(new C22065AgC(r4));
        }
        return AnonymousClass0AJ.A00;
    }
}
