package X;

import android.location.Location;
import com.google.android.gms.location.LocationResult;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;

/* renamed from: X.6nB  reason: invalid class name and case insensitive filesystem */
public final class C141396nB implements C16800q7 {
    public final /* synthetic */ LocationResult A00;

    public C141396nB(LocationResult locationResult) {
        this.A00 = locationResult;
    }

    public final /* bridge */ /* synthetic */ void BQO(Object obj) {
        AnonymousClass6JN r4 = (AnonymousClass6JN) obj;
        LocationResult locationResult = this.A00;
        AnonymousClass00C.A0D(locationResult, 0);
        for (Location location : locationResult.A00) {
            if (location != null) {
                BaseGPSLocationManager baseGPSLocationManager = r4.A00;
                BaseGPSLocationManager.A01(location, baseGPSLocationManager);
                baseGPSLocationManager.A03.removeCallbacks(baseGPSLocationManager.A0A);
                return;
            }
        }
    }
}
