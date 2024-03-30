package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.Afz  reason: case insensitive filesystem */
public final class C22052Afz extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass8AC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22052Afz(AnonymousClass8AC r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C22052Afz.super.A07();
        AnonymousClass8AC r4 = this.this$0;
        AnonymousClass84B r1 = r4.A00;
        AnonymousClass9Y3 r3 = r1.A01;
        Context context = r3.A00;
        Object systemService = context.getSystemService("bluetooth");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        AnonymousClass00C.A08(newCachedThreadPool);
        C203689oX r5 = new C203689oX((BluetoothManager) systemService, context, r4.A01, new AnonymousClass888(C023109s.A00, true, r1.A0O), newCachedThreadPool);
        r3.A08 = r5;
        r5.A03 = new C22316Ake(r4);
        C23090B4a b4a = this.this$0.A00.A0H;
        if (b4a != null) {
            b4a.BPK("linked_app_manager_start_request");
        }
        AnonymousClass9AO.A01.A01("sup:LinkedAppManagerStateDelegate", "[LINKED_APP_MANAGER]: start");
        C203689oX r0 = this.this$0.A00.A01.A08;
        if (r0 != null) {
            r0.A0B();
        }
        return AnonymousClass0AJ.A00;
    }
}
