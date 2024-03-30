package X;

import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.businessdirectory.util.BaseGPSLocationManager;
import java.util.List;

/* renamed from: X.73A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass73A implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ C159317jA A02;
    public final /* synthetic */ AnonymousClass64E A03;

    public /* synthetic */ AnonymousClass73A(C159317jA r1, AnonymousClass64E r2, double d, double d2) {
        this.A03 = r2;
        this.A00 = d;
        this.A01 = d2;
        this.A02 = r1;
    }

    public final void run() {
        List<Address> list;
        String str;
        AnonymousClass64E r6 = this.A03;
        double d = this.A00;
        double d2 = this.A01;
        C159317jA r2 = this.A02;
        Address address = null;
        try {
            list = new Geocoder(r6.A02.A00, C36401kF.A0x(r6.A03)).getFromLocation(d, d2, 1);
        } catch (Exception e) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("DirectoryGeocoder/geocodeAddress Exception while trying to fetch address ");
            C36351kA.A1L(e.getClass(), A0u);
            list = null;
        }
        r6.A01.removeCallbacks(r6.A05);
        if (list != null && !list.isEmpty()) {
            Address address2 = list.get(0);
            AnonymousClass00C.A0B(address2);
            address = address2;
        }
        C164517rw r22 = (C164517rw) r2;
        if (r22.A02 != 0) {
            String str2 = null;
            if (address != null) {
                str2 = address.getCountryCode();
            }
            C132296Sz r4 = (C132296Sz) r22.A01;
            if (r4.A08.A00().contains(str2)) {
                AnonymousClass011 r0 = (AnonymousClass011) r22.A00;
                LatLng latLng = (LatLng) r0.first;
                double A012 = C90504aG.A01(r0.second);
                String A032 = r4.A0A.A03(r4.A07, C132296Sz.A01(r4));
                Double valueOf = Double.valueOf(A012);
                Double valueOf2 = Double.valueOf(latLng.A00);
                Double valueOf3 = Double.valueOf(latLng.A01);
                AnonymousClass6QG r7 = new AnonymousClass6QG(valueOf, valueOf2, valueOf3, valueOf2, valueOf3, (Double) null, A032, (String) null, "approx_default");
                AnonymousClass5DR r62 = r4.A03;
                long currentTimeMillis = System.currentTimeMillis();
                C194599Qj r5 = r62.A03;
                C36341k9.A0w(C90474aD.A0H(r5), "default_location_last_updated", currentTimeMillis);
                C36341k9.A0x(C90474aD.A0H(r5), "default_search_location", AnonymousClass6RZ.A01(r62.A00, r62.A02, r7.A03()));
                r4.A00 = r7;
                C132406Tm r1 = r4.A09;
                r1.A06("approx_default_geocoder_success");
                r1.A06("approx_default_location_end");
                r1.A04();
                return;
            }
            return;
        }
        BaseGPSLocationManager baseGPSLocationManager = (BaseGPSLocationManager) r22.A01;
        Location location = (Location) r22.A00;
        if (address != null) {
            String str3 = baseGPSLocationManager.A0B;
            if (TextUtils.isEmpty(str3) || !AnonymousClass00C.A0J(str3, "CO")) {
                str = C131846Qw.A00(baseGPSLocationManager.A08.A00, address, location.getAccuracy());
                baseGPSLocationManager.A05.A0H(new C1502274l(baseGPSLocationManager, location, str, 26));
            }
            float accuracy = location.getAccuracy();
            if (!TextUtils.isEmpty(address.getSubLocality())) {
                str = address.getSubLocality();
            } else {
                str = address.getThoroughfare();
                if (((double) accuracy) <= 200.0d && !TextUtils.isEmpty(str)) {
                    String subThoroughfare = address.getSubThoroughfare();
                    if (!TextUtils.isEmpty(subThoroughfare)) {
                        boolean startsWith = subThoroughfare.trim().startsWith("#");
                        StringBuilder A0v = AnonymousClass000.A0v(str);
                        if (startsWith) {
                            str = AnonymousClass000.A0p(" ", subThoroughfare, A0v);
                        } else {
                            AnonymousClass000.A1D(" ", "#", subThoroughfare, A0v);
                            str = A0v.toString();
                        }
                    }
                } else if (!TextUtils.isEmpty(address.getLocality())) {
                    str = address.getLocality();
                } else if (!TextUtils.isEmpty(address.getSubAdminArea())) {
                    str = address.getSubAdminArea();
                }
            }
            baseGPSLocationManager.A05.A0H(new C1502274l(baseGPSLocationManager, location, str, 26));
        }
        str = null;
        baseGPSLocationManager.A05.A0H(new C1502274l(baseGPSLocationManager, location, str, 26));
    }
}
