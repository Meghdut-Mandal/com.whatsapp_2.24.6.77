package X;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.19m  reason: invalid class name and case insensitive filesystem */
public class C237019m {
    public AnonymousClass0XK A00;
    public Map A01;
    public LocationManager A02;
    public final C20830yE A03;
    public final C21390zA A04;
    public final C19700wN A05;
    public final C21060yb A06;
    public final C19630wG A07;
    public volatile boolean A08;

    public synchronized void A04() {
        AnonymousClass0JO r0;
        if (this.A02 == null) {
            Context context = this.A07.A00;
            if (C34201gc.A00(context) == 0) {
                A3D a3d = new A3D(this);
                this.A01 = new HashMap();
                AnonymousClass0UY r1 = new AnonymousClass0UY(context);
                r1.A01(AnonymousClass9B2.A01);
                r1.A05.add(a3d);
                r1.A06.add(a3d);
                r0 = r1.A00();
            } else {
                r0 = null;
                this.A01 = null;
            }
            this.A00 = r0;
            this.A02 = this.A06.A0C();
        }
    }

    public static LocationRequest A00(A46 a46) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        int i = a46.A01;
        int i2 = 100;
        if ((i & 1) == 0) {
            i2 = 105;
            if ((i & 2) != 0) {
                i2 = 102;
            }
        }
        locationRequest.A03 = i2;
        long j = a46.A03;
        if (j >= 0) {
            locationRequest.A04 = j;
            if (!locationRequest.A07) {
                locationRequest.A05 = (long) (((double) j) / 6.0d);
            }
            long j2 = a46.A02;
            if (j2 >= 0) {
                locationRequest.A07 = true;
                locationRequest.A05 = j2;
                float f = a46.A00;
                if (f >= 0.0f) {
                    locationRequest.A02 = f;
                    return locationRequest;
                }
                StringBuilder sb = new StringBuilder(37);
                sb.append("invalid displacement: ");
                sb.append(f);
                throw new IllegalArgumentException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("invalid interval: ");
            sb2.append(j2);
            throw new IllegalArgumentException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(38);
        sb3.append("invalid interval: ");
        sb3.append(j);
        throw new IllegalArgumentException(sb3.toString());
    }

    private void A01(String str) {
        if (Build.VERSION.SDK_INT == 29 && !this.A04.A00 && !this.A08 && !"group-chat-live-location-ui-oncreate".equals(str)) {
            this.A05.A0E("FusedLocationManager/logIfLocationAccessedInBackground", "background-location", true);
        }
    }

    public Location A03(String str, int i) {
        LocationManager locationManager;
        String str2;
        C20830yE r3 = this.A03;
        if (r3.A05()) {
            StringBuilder sb = new StringBuilder();
            sb.append("FusedLocationManager/getLocation:");
            sb.append(str);
            Log.i(sb.toString());
            A04();
            A01(str);
            AnonymousClass0XK r0 = this.A00;
            if (r0 != null && r0.A0A()) {
                return AnonymousClass9B2.A02.BDR(this.A00);
            }
            if (this.A02 != null) {
                if (i == 1) {
                    if (r3.A02("android.permission.ACCESS_FINE_LOCATION") == 0) {
                        locationManager = this.A02;
                        str2 = "gps";
                    }
                } else if (r3.A02("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    locationManager = this.A02;
                    str2 = "network";
                }
                return locationManager.getLastKnownLocation(str2);
            }
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FusedLocationManager/getLastKnownLocation/do not have location permissions context:");
        sb2.append(str);
        Log.w(sb2.toString());
        return null;
    }

    public void A06(LocationListener locationListener, String str, float f, int i, long j, long j2) {
        C20830yE r3 = this.A03;
        if (r3.A05()) {
            A04();
            A01(str);
            LocationListener locationListener2 = locationListener;
            float f2 = f;
            int i2 = i;
            long j3 = j;
            if (this.A00 != null) {
                if (this.A01.isEmpty()) {
                    this.A00.A08();
                }
                A46 a46 = new A46(locationListener2, f2, i2, j3, j2);
                this.A01.put(locationListener2, a46);
                if (this.A00.A0A()) {
                    LocationRequest A002 = A00(a46);
                    AnonymousClass0XK r2 = this.A00;
                    AnonymousClass006.A02(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
                    r2.A06(new C170398Dg(r2, a46, A002));
                    return;
                }
                return;
            }
            if ((i & 1) != 0) {
                try {
                    if (this.A02 == null || r3.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have fine location permission");
                    } else {
                        this.A02.requestLocationUpdates("gps", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e);
                }
            }
            if ((i & 2) != 0) {
                try {
                    if (this.A02 == null || r3.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        Log.w("FusedLocationManager/requestLocationUpdates/do not have coarse location permission");
                    } else {
                        this.A02.requestLocationUpdates("network", j3, f2, locationListener2);
                    }
                } catch (RuntimeException e2) {
                    Log.e("FusedLocationManager/requestLocationUpdates", e2);
                }
            }
        }
    }

    public C237019m(C21390zA r1, C19700wN r2, C21060yb r3, C19630wG r4, C20830yE r5) {
        this.A07 = r4;
        this.A05 = r2;
        this.A03 = r5;
        this.A06 = r3;
        this.A04 = r1;
    }

    public Location A02(String str) {
        A04();
        Location A032 = A03(str, 1);
        Location A033 = A03(str, 2);
        if (A032 == null || (A033 != null && A032.getTime() <= A033.getTime() - 20000)) {
            A032 = A033;
            if (A033 == null) {
                return A032;
            }
        }
        if (A032.getTime() + 7200000 < System.currentTimeMillis()) {
            return null;
        }
        return A032;
    }

    public void A05(LocationListener locationListener) {
        A04();
        if (this.A00 != null) {
            A46 a46 = (A46) this.A01.remove(locationListener);
            if (a46 != null) {
                if (this.A00.A0A()) {
                    AnonymousClass0XK r1 = this.A00;
                    r1.A06(new C170388Df(r1, a46));
                }
                if (this.A01.isEmpty()) {
                    this.A00.A09();
                }
            }
        } else if (this.A02 != null && this.A03.A05()) {
            this.A02.removeUpdates(locationListener);
        }
    }

    public boolean A07() {
        A04();
        LocationManager locationManager = this.A02;
        if (locationManager == null) {
            return false;
        }
        if (locationManager.isProviderEnabled("gps") || this.A02.isProviderEnabled("network")) {
            return true;
        }
        return false;
    }
}
