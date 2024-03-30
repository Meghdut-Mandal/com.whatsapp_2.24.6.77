package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.3WN  reason: invalid class name */
public class AnonymousClass3WN implements LocationListener {
    public final /* synthetic */ AnonymousClass3SB A00;
    public final /* synthetic */ C236419g A01;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AnonymousClass3WN(AnonymousClass3SB r1, C236419g r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("CompanionDevice/location/changed ");
            A0u.append(location.getTime());
            C36421kH.A1N(A0u);
            A0u.append(location.getAccuracy());
            C36411kG.A1P(A0u);
            C236419g r3 = this.A01;
            C80403vL.A01(r3.A0M, this, this.A00, location, 32);
            r3.A08.A05(this);
        }
    }
}
