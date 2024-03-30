package X;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

public class A3D implements C17610rh, C17620ri {
    public final /* synthetic */ C237019m A00;

    public void onConnectionFailed(AnonymousClass0L0 r1) {
    }

    public void onConnectionSuspended(int i) {
    }

    public A3D(C237019m r1) {
        this.A00 = r1;
    }

    public void onConnected(Bundle bundle) {
        C237019m r6 = this.A00;
        if (r6.A03.A05()) {
            Map map = r6.A01;
            C18740tg.A06(map);
            Iterator A0z = AnonymousClass000.A0z(map);
            while (A0z.hasNext()) {
                A46 a46 = (A46) A0z.next();
                LocationRequest A002 = C237019m.A00(a46);
                try {
                    AnonymousClass0XK r2 = r6.A00;
                    AnonymousClass006.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A06(new C170398Dg(r2, a46, A002));
                } catch (SecurityException e) {
                    Log.w("FusedLocationManager/GmsConnectionCallbacks/onConnected/unable to request location updates", e);
                }
            }
            if (r6.A01.isEmpty()) {
                AnonymousClass0XK r0 = r6.A00;
                C18740tg.A06(r0);
                r0.A09();
            }
        }
    }
}
