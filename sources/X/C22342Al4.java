package X;

import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothServerSocket;
import android.content.Context;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Al4  reason: case insensitive filesystem */
public final class C22342Al4 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C203689oX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22342Al4(C203689oX r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass887 r9 = (AnonymousClass887) obj;
        AnonymousClass6YR.A06("lam:LinkedAppManager", AnonymousClass000.A0l(r9, "handleSecurity: linkSecurity=", AnonymousClass000.A0u()));
        if (r9 != null) {
            C203689oX r4 = this.this$0;
            Context context = r4.A08;
            BluetoothManager bluetoothManager = r4.A07;
            ExecutorService executorService = B45.A00;
            AnonymousClass00C.A08(executorService);
            AnonymousClass9OE r6 = new AnonymousClass9OE(bluetoothManager, context, r9, executorService, AnonymousClass97B.A00(r4, 11), AnonymousClass97B.A00(r4, 12), new C1898895z(r4, 3));
            AnonymousClass9U8 r5 = r6.A03;
            C22513Anv anv = C22513Anv.A00;
            BluetoothServerSocket bluetoothServerSocket = r5.A00;
            if (bluetoothServerSocket != null) {
                r5.A00 = null;
                AnonymousClass95J.A00(bluetoothServerSocket);
                anv.invoke(r5);
            }
            C22345Al7 al7 = new C22345Al7(r6);
            C22552Aod aod = C22552Aod.A00;
            AnonymousClass00C.A0D(aod, 1);
            r5.A02.execute(new AVc(r5, al7, aod));
            r4.A0A.add(new C22081AgS(r6));
        }
        return AnonymousClass0AJ.A00;
    }
}
