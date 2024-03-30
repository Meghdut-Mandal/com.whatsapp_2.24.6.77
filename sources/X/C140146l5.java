package X;

import android.app.ActivityManager;
import android.location.Location;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import com.facebook.common.stringformat.StringFormatUtil;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.List;
import java.util.Objects;

/* renamed from: X.6l5  reason: invalid class name and case insensitive filesystem */
public class C140146l5 implements C157777ef {
    public static final String[] A06 = {"gps", "network"};
    public C1267665l A00;
    public final LocationManager A01;
    public final C130136Jw A02;
    public final AnonymousClass7c9 A03;
    public final AnonymousClass61Y A04;
    public final AnonymousClass8HW A05;

    public C1267665l BDS(String str) {
        Integer num;
        long now;
        Float f;
        boolean A1T = C36371kC.A1T(Build.VERSION.SDK_INT, 29);
        int i = 0;
        C130136Jw r8 = this.A02;
        String[] strArr = C130136Jw.A02;
        Integer num2 = null;
        int i2 = 0;
        do {
            String str2 = strArr[i2];
            try {
                Objects.requireNonNull(str2);
                try {
                    LocationManager locationManager = r8.A01;
                    LocationProvider provider = locationManager.getProvider(str2);
                    if (provider != null) {
                        provider.getPowerRequirement();
                        provider.hasMonetaryCost();
                        if (!locationManager.isProviderEnabled(str2)) {
                            num = C023109s.A0C;
                        } else {
                            try {
                                if (r8.A00.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                    num = C023109s.A0G;
                                }
                            } catch (Throwable unused) {
                            }
                            num = C023109s.A00;
                        }
                        if (num2 == null || num2.compareTo(num) < 0) {
                            num2 = num;
                        }
                        i2++;
                    }
                } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
                    Class<C130136Jw> cls = C130136Jw.class;
                    Object[] A0L = AnonymousClass001.A0L();
                    A0L[0] = str2;
                    if (AnonymousClass6YR.A01.BMH(3)) {
                        String simpleName = cls.getSimpleName();
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Error when getting provider %s", A0L);
                        if (AnonymousClass6YR.A01.BMH(3)) {
                            AnonymousClass6YR.A01.B53(simpleName, formatStrLocaleSafe, e);
                        }
                    }
                }
                num = C023109s.A01;
            } catch (SecurityException unused2) {
                num = C023109s.A00;
            }
            num2 = num;
            i2++;
        } while (i2 < 2);
        List list = C113985gS.A00;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean A1S = AnonymousClass000.A1S(runningAppProcessInfo.importance, 100);
        Location location = null;
        if (num2 != C023109s.A0G) {
            return null;
        }
        C1267665l r3 = this.A00;
        if (A1T && !A1S) {
            return r3;
        }
        if (r3 != null && this.A04.A00(r3) <= Long.MAX_VALUE) {
            Location location2 = r3.A00;
            if (location2.hasAccuracy() && Float.valueOf(location2.getAccuracy()) != null) {
                if (location2.hasAccuracy()) {
                    f = Float.valueOf(location2.getAccuracy());
                } else {
                    f = null;
                }
                if (f.floatValue() <= Float.MAX_VALUE) {
                    location = new Location(location2);
                }
            }
        }
        String[] strArr2 = A06;
        do {
            try {
                Location lastKnownLocation = this.A01.getLastKnownLocation(strArr2[i]);
                if (!(lastKnownLocation == null || lastKnownLocation.getTime() == 0 || ((lastKnownLocation.getLatitude() == 0.0d && lastKnownLocation.getLongitude() == 0.0d) || !lastKnownLocation.hasAccuracy()))) {
                    AnonymousClass61Y r32 = this.A04;
                    long elapsedRealtimeNanos = lastKnownLocation.getElapsedRealtimeNanos();
                    if (elapsedRealtimeNanos == 0 || Long.valueOf(elapsedRealtimeNanos) == null) {
                        now = r32.A00.now() - lastKnownLocation.getTime();
                    } else {
                        now = (((r32.A01.now() * SearchActionVerificationClientService.MS_TO_NS) - elapsedRealtimeNanos) + 500000) / SearchActionVerificationClientService.MS_TO_NS;
                    }
                    if (now <= Long.MAX_VALUE && lastKnownLocation.getAccuracy() <= Float.MAX_VALUE && (location == null || location.getTime() < lastKnownLocation.getTime())) {
                        location = lastKnownLocation;
                    }
                }
            } catch (IllegalArgumentException | SecurityException unused3) {
            }
            i++;
        } while (i < 2);
        if (location == null) {
            return null;
        }
        Objects.requireNonNull(location);
        C1267665l r5 = new C1267665l(new Location(location));
        C1267665l r1 = this.A00;
        if (r1 == null || r1.A00() == null || (r5.A00() != null && r5.A00().longValue() > r1.A00().longValue())) {
            this.A00 = r5;
        }
        this.A04.A00(r5);
        return r5;
    }

    public C140146l5(LocationManager locationManager, C130136Jw r3, AnonymousClass7c9 r4, AnonymousClass61Y r5) {
        this.A02 = r3;
        this.A01 = locationManager;
        this.A04 = r5;
        this.A03 = r4;
        if (r4 != null) {
            throw AnonymousClass001.A0A("getNmeaDataCollectionCacheQueueSize");
        }
        this.A05 = AnonymousClass8HW.create(10);
    }
}
