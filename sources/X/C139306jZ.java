package X;

import android.location.Location;
import android.location.LocationListener;
import java.util.List;

/* renamed from: X.6jZ  reason: invalid class name and case insensitive filesystem */
public class C139306jZ implements C160307kn, LocationListener {
    public AnonymousClass6NI A00 = null;
    public final C237019m A01;

    public void BnF(AnonymousClass6NI r10, String str) {
        this.A00 = r10;
        this.A01.A06(this, str, 0.0f, 3, 5000, 1000);
    }

    public void onFlushComplete(int i) {
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public C160307kn B3h() {
        return new C139306jZ(this.A01);
    }

    public Location BAd() {
        return this.A01.A02("FbMaps");
    }

    public void BwM() {
        this.A01.A05(this);
    }

    public void onLocationChanged(List list) {
        if (this.A00 != null && list.size() > 1) {
            AnonymousClass6NI r2 = this.A00;
            Location location = (Location) C36391kE.A0t(list);
            if (AnonymousClass6NI.A00(location, r2.A00)) {
                r2.A00 = location;
                C114605hW r0 = r2.A01;
                if (r0 != null) {
                    r0.A00.A0Q.invalidate();
                }
            }
        }
    }

    public C139306jZ(C237019m r2) {
        this.A01 = r2;
    }

    public void onLocationChanged(Location location) {
        AnonymousClass6NI r1 = this.A00;
        if (r1 != null && AnonymousClass6NI.A00(location, r1.A00)) {
            r1.A00 = location;
            C114605hW r0 = r1.A01;
            if (r0 != null) {
                r0.A00.A0Q.invalidate();
            }
        }
    }
}
