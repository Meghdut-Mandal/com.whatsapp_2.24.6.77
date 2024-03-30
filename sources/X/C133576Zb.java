package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.SparseIntArray;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;

/* renamed from: X.6Zb  reason: invalid class name and case insensitive filesystem */
public class C133576Zb implements LocationListener {
    public long A00;
    public Location A01;
    public PowerManager.WakeLock A02;
    public Location A03;
    public final SparseIntArray A04 = new SparseIntArray();
    public final C237019m A05;
    public final C227815t A06;
    public final AnonymousClass1BN A07;
    public final C21060yb A08;
    public final C19420v0 A09;
    public final C19970wo A0A;
    public final C157357cp A0B;

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static void A00(Location location, C133576Zb r9) {
        String str;
        r9.A01 = location;
        LocationSharingService locationSharingService = (LocationSharingService) r9.A0B;
        if (locationSharingService.A0G) {
            locationSharingService.A09.A0U(location);
        }
        long A002 = C19970wo.A00(locationSharingService.A06);
        long j = locationSharingService.A00;
        if (A002 > j) {
            str = C36381kD.A0z("LocationSharingService/onLocationUpdate/stop this service since passed maxEndTime; maxEndTime=", AnonymousClass000.A0u(), j);
        } else if (!locationSharingService.A09.A0d()) {
            str = "LocationSharingService/onLocationUpdate/stop this service, no longer sharing live location";
        } else if (locationSharingService.A0F) {
            locationSharingService.A09.A0U(location);
            if (!locationSharingService.A09.A0e()) {
                C1503074t.A00(locationSharingService.A0A, locationSharingService, 13);
                return;
            }
            return;
        } else {
            return;
        }
        Log.i(str);
        locationSharingService.A0F = false;
        LocationSharingService.A03(locationSharingService);
    }

    public static void A01(C133576Zb r9) {
        long j = r9.A00;
        if (j != 0) {
            int A0B2 = (int) C36391kE.A0B(j - (j % 3600000));
            SparseIntArray sparseIntArray = r9.A04;
            sparseIntArray.put(A0B2, sparseIntArray.get(A0B2, 0) + ((int) C36441kJ.A0A(j)));
            StringBuilder A0u = AnonymousClass000.A0u();
            for (int i = 0; i < sparseIntArray.size(); i++) {
                int keyAt = sparseIntArray.keyAt(i);
                int i2 = sparseIntArray.get(keyAt);
                if (i != 0) {
                    A0u.append(";");
                }
                A0u.append(keyAt);
                A0u.append(",");
                A0u.append(i2);
            }
            C19420v0 r0 = r9.A09;
            C36341k9.A0x(C19420v0.A00(r0), "location_shared_duration", A0u.toString());
            r9.A00 = 0;
        }
    }

    public void onLocationChanged(Location location) {
        Log.i("MyLocationUpdater/onLocationChanged");
        if (AnonymousClass1P6.A01(location, this.A01)) {
            A00(location, this);
            this.A03 = location;
            return;
        }
        if (location.getAccuracy() < 80.0f) {
            this.A03 = location;
        }
        if (this.A03 != null && this.A01.getTime() + 40000 < this.A03.getTime()) {
            A00(this.A03, this);
        }
    }

    public C133576Zb(C237019m r2, C227815t r3, AnonymousClass1BN r4, C21060yb r5, C19970wo r6, C19420v0 r7, C157357cp r8) {
        this.A0A = r6;
        this.A08 = r5;
        this.A09 = r7;
        this.A06 = r3;
        this.A05 = r2;
        this.A07 = r4;
        this.A0B = r8;
    }
}
