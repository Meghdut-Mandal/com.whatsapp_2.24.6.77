package com.facebook.native_bridge;

import X.AnonymousClass61Y;
import X.AnonymousClass7c9;
import X.C1267665l;
import X.C130136Jw;
import X.C139616kB;
import X.C140146l5;
import X.C157777ef;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class NativeLocationManager {
    public static final double[] EMPTY = {0.0d, 0.0d};
    public static final String LOCATION_CALLER_CONTEXT = "NativeLocationManager";
    public C157777ef mFbLocationCache;
    public final HybridData mHybridData = initHybrid();
    public final LocationManager mLocationManager;

    private synchronized C157777ef getFbLocationCache(C130136Jw r2, LocationManager locationManager, AnonymousClass61Y r4, AnonymousClass7c9 r5) {
        C157777ef r0;
        r0 = this.mFbLocationCache;
        if (r0 == null) {
            r0 = new C140146l5(locationManager, r2, r5, r4);
            this.mFbLocationCache = r0;
        }
        return r0;
    }

    public static boolean hasPermission(Context context, String str) {
        try {
            return context.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    private native HybridData initHybrid();

    public enum LocationDataIndices {
        LONGITUDE(0),
        LATITUDE(1);
        
        public final int index;

        /* access modifiers changed from: public */
        LocationDataIndices(int i) {
            this.index = i;
        }
    }

    static {
        SoLoader.A06("native_bridge");
    }

    public double[] getCurrentPosition() {
        C1267665l BDS;
        C157777ef r1 = this.mFbLocationCache;
        if (r1 == null || (BDS = r1.BDS(LOCATION_CALLER_CONTEXT)) == null) {
            return EMPTY;
        }
        return convertToDoubleArray(BDS.A00);
    }

    public NativeLocationManager(Context context) {
        LocationManager locationManager;
        if (hasPermission(context, "android.permission.ACCESS_COARSE_LOCATION") || hasPermission(context, "android.permission.ACCESS_FINE_LOCATION")) {
            locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        } else {
            locationManager = null;
        }
        this.mLocationManager = locationManager;
        this.mFbLocationCache = null;
        if (locationManager != null) {
            this.mFbLocationCache = getFbLocationCache(new C130136Jw(context, locationManager), locationManager, new AnonymousClass61Y(C139616kB.A00, RealtimeSinceBootClock.A00), (AnonymousClass7c9) null);
        }
    }

    private double[] convertToDoubleArray(Location location) {
        double[] dArr = new double[LocationDataIndices.values().length];
        dArr[LocationDataIndices.LONGITUDE.index] = location.getLongitude();
        dArr[LocationDataIndices.LATITUDE.index] = location.getLatitude();
        return dArr;
    }
}
