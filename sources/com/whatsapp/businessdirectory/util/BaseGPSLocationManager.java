package com.whatsapp.businessdirectory.util;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass17Y;
import X.AnonymousClass64E;
import X.AnonymousClass6JN;
import X.AnonymousClass73A;
import X.AnonymousClass7fS;
import X.C001700s;
import X.C003101g;
import X.C1497172m;
import X.C164517rw;
import X.C18820ts;
import X.C19630wG;
import X.C19770wU;
import X.C20810yC;
import X.C20830yE;
import X.C21060yb;
import X.C36331k8;
import X.C36431kI;
import X.C98744rx;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.location.LocationRequest;
import java.util.HashMap;

public class BaseGPSLocationManager implements C003101g, LocationListener {
    public LocationManager A00;
    public C98744rx A01;
    public Integer A02;
    public final Handler A03 = new Handler();
    public final C001700s A04 = C36431kI.A0S();
    public final AnonymousClass17Y A05;
    public final AnonymousClass6JN A06 = new AnonymousClass6JN(this);
    public final C21060yb A07;
    public final C19630wG A08;
    public final C20830yE A09;
    public final Runnable A0A = new C1497172m(this, 19);
    public final String A0B;
    public final Handler A0C = new Handler();
    public final AnonymousClass7fS A0D;
    public final AnonymousClass64E A0E;
    public final C18820ts A0F;
    public final C20810yC A0G;
    public final C19770wU A0H;
    public final Runnable A0I = new C1497172m(this, 20);

    public void BVQ(AnonymousClass012 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A04();
    }

    public void BcJ(AnonymousClass012 r2) {
        AnonymousClass00C.A0D(r2, 0);
        A04();
    }

    public /* synthetic */ void BhA(AnonymousClass012 r1) {
    }

    public /* synthetic */ void Bhq(AnonymousClass012 r1) {
    }

    public void onLocationChanged(Location location) {
        AnonymousClass00C.A0D(location, 0);
        this.A0C.removeCallbacks(this.A0I);
        A01(location, this);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static final LocationRequest A00() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.A08 = true;
        locationRequest.A04 = 1000;
        if (!locationRequest.A07) {
            locationRequest.A05 = (long) (((double) 1000) / 6.0d);
        }
        locationRequest.A07 = true;
        locationRequest.A05 = 1000;
        locationRequest.A03 = 100;
        return locationRequest;
    }

    public static final void A01(Location location, BaseGPSLocationManager baseGPSLocationManager) {
        AnonymousClass64E r5 = baseGPSLocationManager.A0E;
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        C164517rw r4 = new C164517rw(location, baseGPSLocationManager, 0);
        r5.A00 = AnonymousClass001.A0F(r4);
        r5.A01.postDelayed(r5.A05, 5000);
        r5.A04.Boy(new AnonymousClass73A(r4, r5, latitude, longitude));
    }

    public static final void A02(BaseGPSLocationManager baseGPSLocationManager) {
        Handler handler = baseGPSLocationManager.A0C;
        Runnable runnable = baseGPSLocationManager.A0I;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 10000);
        try {
            if (baseGPSLocationManager.A00 == null || baseGPSLocationManager.A09.A02("android.permission.ACCESS_FINE_LOCATION") != 0) {
                A03(baseGPSLocationManager, "Fine location permission not granted");
            } else {
                LocationManager locationManager = baseGPSLocationManager.A00;
                if (locationManager != null) {
                    locationManager.requestLocationUpdates("gps", 1000, 0.0f, baseGPSLocationManager);
                }
            }
            if (baseGPSLocationManager.A00 == null || baseGPSLocationManager.A09.A02("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                A03(baseGPSLocationManager, "Coarse location permission not granted");
                return;
            }
            LocationManager locationManager2 = baseGPSLocationManager.A00;
            if (locationManager2 != null) {
                locationManager2.requestLocationUpdates("network", 1000, 0.0f, baseGPSLocationManager);
            }
        } catch (RuntimeException e) {
            A03(baseGPSLocationManager, C36331k8.A0i("Updates from location services failed : ", AnonymousClass000.A0u(), e));
        }
    }

    public void A04() {
        LocationManager locationManager;
        C98744rx r1 = this.A01;
        if (r1 != null) {
            r1.A04(this.A06);
        }
        if (this.A09.A05() && (locationManager = this.A00) != null) {
            locationManager.removeUpdates(this);
        }
        this.A03.removeCallbacks(this.A0A);
        this.A0C.removeCallbacks(this.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r1.isProviderEnabled("network") == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        A03(r4, "Location providers unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        if (r1 != null) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r20) {
        /*
            r19 = this;
            r4 = r19
            X.0yE r0 = r4.A09
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "Location access not granted"
            A03(r4, r0)
            return
        L_0x0010:
            X.5iG r2 = new X.5iG
            r2.<init>()
            X.0wG r0 = r4.A08
            android.content.Context r5 = r0.A00
            X.4rv r1 = new X.4rv
            r1.<init>(r5)
            java.util.ArrayList r0 = r2.A00
            com.google.android.gms.tasks.zzw r1 = X.C98784s1.A00(r1, r0)
            r2 = 1
            X.7rY r0 = new X.7rY
            r0.<init>(r4, r2)
            r1.addOnFailureListener(r0)
            android.location.LocationManager r1 = r4.A00
            if (r1 != 0) goto L_0x003b
            X.0yb r0 = r4.A07
            android.location.LocationManager r1 = r0.A0C()
            r4.A00 = r1
            if (r1 == 0) goto L_0x0057
        L_0x003b:
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 == 0) goto L_0x0057
        L_0x004b:
            r0 = r20
            if (r20 == 0) goto L_0x005d
            if (r0 == r2) goto L_0x0139
            java.lang.Runnable r0 = r4.A0I
            r0.run()
            return
        L_0x0057:
            java.lang.String r0 = "Location providers unavailable"
            A03(r4, r0)
            goto L_0x004b
        L_0x005d:
            int r0 = X.C34201gc.A00(r5)
            if (r0 != 0) goto L_0x0139
            android.os.Handler r3 = r4.A03
            java.lang.Runnable r2 = r4.A0A
            r3.removeCallbacks(r2)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.postDelayed(r2, r0)
            X.4rx r3 = r4.A01
            if (r3 != 0) goto L_0x007a
            X.4rx r3 = new X.4rx
            r3.<init>(r5)
            r4.A01 = r3
        L_0x007a:
            com.google.android.gms.location.LocationRequest r7 = A00()
            X.6JN r2 = r4.A06
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r8 = 0
            java.util.List r11 = X.AnonymousClass8CL.A0B
            r14 = 0
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            X.8CL r6 = new X.8CL
            r10 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r18)
            if (r4 != 0) goto L_0x00ae
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r1 = X.AnonymousClass000.A1V(r0)
            java.lang.String r0 = "Can't create handler inside thread that has not called Looper.prepare()"
            X.AnonymousClass006.A08(r1, r0)
            android.os.Looper r4 = android.os.Looper.myLooper()
        L_0x00ae:
            java.lang.String r5 = "LocationCallback"
            java.lang.String r0 = "Listener must not be null"
            X.AnonymousClass006.A02(r2, r0)
            java.lang.String r0 = "Looper must not be null"
            X.AnonymousClass006.A02(r4, r0)
            X.0Sr r1 = new X.0Sr
            r1.<init>(r4, r2, r5)
            X.A3M r0 = new X.A3M
            r0.<init>(r1, r3)
            X.A3L r9 = new X.A3L
            r10 = r1
            r11 = r6
            r12 = r3
            r13 = r0
            r14 = r2
            r9.<init>(r10, r11, r12, r13, r14)
            X.0Wg r5 = new X.0Wg
            r5.<init>(r8)
            r5.A02 = r9
            r5.A03 = r0
            r5.A01 = r1
            r0 = 2436(0x984, float:3.414E-42)
            r5.A00 = r0
            X.0UL r2 = r1.A01
            java.lang.String r0 = "Key must not be null"
            X.AnonymousClass006.A02(r2, r0)
            X.0Sr r1 = r5.A01
            int r0 = r5.A00
            X.0Sv r4 = new X.0Sv
            r4.<init>(r1, r5, r0)
            X.0Se r1 = new X.0Se
            r1.<init>(r2, r5)
            java.lang.Runnable r0 = r5.A04
            X.0Ss r2 = new X.0Ss
            r2.<init>(r4, r1, r0)
            X.AnonymousClass006.A01(r2)
            X.0Sv r6 = r2.A00
            X.0Sr r0 = r6.A01
            X.0UL r0 = r0.A01
            java.lang.String r1 = "Listener has already been released."
            X.AnonymousClass006.A02(r0, r1)
            X.0Se r4 = r2.A01
            X.0UL r0 = r4.A00
            X.AnonymousClass006.A02(r0, r1)
            X.0Za r5 = r3.A07
            java.lang.Runnable r2 = r2.A02
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            int r0 = r6.A00
            X.C07720Za.A05(r3, r5, r1, r0)
            X.0Su r0 = new X.0Su
            r0.<init>(r6, r4, r2)
            X.0Jj r4 = new X.0Jj
            r4.<init>(r0, r1)
            android.os.Handler r2 = r5.A06
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0C
            int r0 = r0.get()
            X.0St r1 = new X.0St
            r1.<init>(r3, r4, r0)
            r0 = 8
            X.AnonymousClass000.A14(r2, r1, r0)
            return
        L_0x0139:
            A02(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.util.BaseGPSLocationManager.A05(int):void");
    }

    public /* synthetic */ void BfS(AnonymousClass012 r4) {
        if (this instanceof DirectoryGPSLocationManager) {
            AnonymousClass00C.A0D(r4, 0);
            if (this.A09.A05()) {
                A05(0);
            }
        } else if (this instanceof BusinessSearchGPSManager) {
            BusinessSearchGPSManager businessSearchGPSManager = (BusinessSearchGPSManager) this;
            AnonymousClass00C.A0D(r4, 0);
            if (AnonymousClass000.A1X(businessSearchGPSManager.A00.invoke()) && businessSearchGPSManager.A09.A05()) {
                businessSearchGPSManager.A05(0);
            }
        }
    }

    public BaseGPSLocationManager(AnonymousClass17Y r3, AnonymousClass7fS r4, AnonymousClass64E r5, C21060yb r6, C19630wG r7, C20830yE r8, C18820ts r9, C20810yC r10, C19770wU r11, String str) {
        this.A05 = r3;
        this.A0G = r10;
        this.A08 = r7;
        this.A0H = r11;
        this.A07 = r6;
        this.A0F = r9;
        this.A0E = r5;
        this.A09 = r8;
        this.A0D = r4;
        this.A0B = str;
    }

    public static final void A03(BaseGPSLocationManager baseGPSLocationManager, String str) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put("error_type", "location_error");
        A0J.put("error_description", str);
        Integer num = baseGPSLocationManager.A02;
        if (num != null) {
            baseGPSLocationManager.A0D.BOk(A0J, num.intValue(), 51);
        }
    }
}
