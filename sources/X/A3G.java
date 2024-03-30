package X;

import android.location.Location;
import android.location.LocationListener;

public final class A3G implements C16800q7 {
    public final /* synthetic */ Location A00;

    public A3G(Location location) {
        this.A00 = location;
    }

    public final /* bridge */ /* synthetic */ void BQO(Object obj) {
        Location location = this.A00;
        LocationListener locationListener = (LocationListener) ((A46) ((C22810AwL) obj)).A04.get();
        if (locationListener != null) {
            locationListener.onLocationChanged(location);
        }
    }
}
