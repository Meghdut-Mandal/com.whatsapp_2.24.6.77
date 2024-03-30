package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class A32 implements C23016B0h {
    public C203689oX A00;
    public final Context A01;
    public final AnonymousClass84B A02;
    public final AnonymousClass9DB A03;
    public final boolean A04 = true;

    public A32(Context context, AnonymousClass84B r3) {
        this.A02 = r3;
        Context applicationContext = context.getApplicationContext();
        AnonymousClass00C.A08(applicationContext);
        this.A01 = applicationContext;
        this.A03 = AnonymousClass9DB.A00(applicationContext);
    }

    public void BuL(C006302t r9) {
        Context context = this.A01;
        Object systemService = context.getSystemService("bluetooth");
        AnonymousClass00C.A0E(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        AnonymousClass00C.A08(newCachedThreadPool);
        C203689oX r2 = new C203689oX((BluetoothManager) systemService, context, this.A03, new AnonymousClass888(C023109s.A00, false, true), newCachedThreadPool);
        this.A00 = r2;
        r2.A03 = C22509Anr.A00;
        r2.A05 = new C22460Amz(this, r9);
        r2.A06 = AnonymousClass97B.A00(this, 5);
        AnonymousClass9AO.A01.A01("sup:LAMDeviceDiscoveryManager", "Starting linked app manager for device discovery");
        C203689oX r0 = this.A00;
        if (r0 != null) {
            r0.A0B();
        }
    }

    public void stop() {
        AnonymousClass9AO.A01.A01("sup:LAMDeviceDiscoveryManager", "Stopping linked app manager for device discovery");
        C203689oX r0 = this.A00;
        if (r0 != null) {
            r0.A0C();
        }
    }
}
