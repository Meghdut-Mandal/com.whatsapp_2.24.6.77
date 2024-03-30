package X;

import android.net.wifi.ScanResult;
import android.net.wifi.SoftApConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.WifiSsid;
import android.os.Build;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.9ni  reason: invalid class name and case insensitive filesystem */
public final class C203279ni {
    public static final AnonymousClass8CI A0G = AnonymousClass8CI.A04;
    public WifiManager.LocalOnlyHotspotReservation A00;
    public final C21060yb A01;
    public final C19630wG A02;
    public final C19770wU A03;
    public final C001700s A04 = C36431kI.A0S();
    public final C19730wQ A05;
    public final C199869g9 A06 = new C199869g9((C001700s) null, (HashMap) null, (HashMap) null, (HashMap) null, (C05250Oz) null, 0, 0, 127, 0);
    public final C199749ft A07 = new C199749ft((HashMap) null, (HashMap) null, (C05250Oz) null, 0, 0, 0, 127, 0, false);
    public final C197239bM A08 = new C197239bM(this);
    public final C197249bN A09 = new C197249bN(this);
    public final C165897uK A0A = new C165897uK(this);
    public final AnonymousClass9IY A0B;
    public final HashMap A0C = AnonymousClass001.A0J();
    public final HashMap A0D = AnonymousClass001.A0J();
    public final HashMap A0E = AnonymousClass001.A0J();
    public final AnonymousClass00T A0F = C36431kI.A1I(new C22210AiX(this));

    public static final AnonymousClass9S4 A00(WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation) {
        StringBuilder sb;
        String str;
        SoftApConfiguration softApConfiguration = localOnlyHotspotReservation.getSoftApConfiguration();
        if (softApConfiguration != null) {
            WifiSsid wifiSsid = softApConfiguration.getWifiSsid();
            String passphrase = softApConfiguration.getPassphrase();
            if (!(wifiSsid == null || passphrase == null)) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("WIFI:S:");
                A0u.append(wifiSsid);
                A0u.append(";T:");
                A0u.append("WPA");
                A0u.append(";P:");
                A0u.append(passphrase);
                try {
                    return C200649ht.A00(C023109s.A0C, AnonymousClass000.A0q(";;", A0u), AnonymousClass001.A0J());
                } catch (AnonymousClass92E e) {
                    e = e;
                    sb = AnonymousClass000.A0u();
                    str = "ThunderstormManager/generateQrCodeFromHotspotReservation: WriteException: ";
                    Log.w(C36331k8.A0i(str, sb, e));
                    return null;
                } catch (UnsupportedEncodingException e2) {
                    e = e2;
                    sb = AnonymousClass000.A0u();
                    str = "ThunderstormManager/generateQrCodeFromHotspotReservation: UnsupportedEncodingException: ";
                    Log.w(C36331k8.A0i(str, sb, e));
                    return null;
                }
            }
        }
        return null;
    }

    public C203279ni(C19730wQ r13, C21060yb r14, C19630wG r15, AnonymousClass9IY r16, C19770wU r17) {
        AnonymousClass9IY r2 = r16;
        C19770wU r1 = r17;
        C36321k7.A1B(r13, r15, r1, r14, r2);
        this.A05 = r13;
        this.A02 = r15;
        this.A03 = r1;
        this.A01 = r14;
        this.A0B = r2;
    }

    public static final String[] A05() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new String[]{"android.permission.NEARBY_WIFI_DEVICES", "android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_AUDIO"};
        }
        if (i >= 31) {
            return new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_ADVERTISE", "android.permission.BLUETOOTH_CONNECT", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        if (i >= 29) {
            return new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE"};
        }
        return new String[]{"android.permission.BLUETOOTH", "android.permission.BLUETOOTH_ADMIN", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.READ_EXTERNAL_STORAGE"};
    }

    public final CompletableFuture A06() {
        CompletableFuture completableFuture = new CompletableFuture();
        WifiManager A0F2 = this.A01.A0F();
        Handler A0H = C36341k9.A0H();
        if (A0F2 != null) {
            try {
                A0F2.startLocalOnlyHotspot(new C165887uJ(A0F2, this, completableFuture), A0H);
                return completableFuture;
            } catch (SecurityException e) {
                Log.w(C36331k8.A0i("ThunderstormManager/createLocalHotspotAndGetQrCode: SecurityException - ", AnonymousClass000.A0u(), e));
                completableFuture.complete((Object) null);
            }
        }
        return completableFuture;
    }

    public final void A07() {
        WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation = this.A00;
        if (localOnlyHotspotReservation != null) {
            localOnlyHotspotReservation.close();
            WifiManager A0F2 = this.A01.A0F();
            if (A0F2 != null) {
                A0F2.unregisterScanResultsCallback(this.A0A);
            }
        }
        this.A00 = null;
    }

    public static final void A04(C203279ni r4, List list) {
        SoftApConfiguration softApConfiguration;
        WifiSsid wifiSsid;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScanResult scanResult = (ScanResult) it.next();
            WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation = r4.A00;
            if (!(localOnlyHotspotReservation == null || (softApConfiguration = localOnlyHotspotReservation.getSoftApConfiguration()) == null || (wifiSsid = softApConfiguration.getWifiSsid()) == null)) {
                AnonymousClass00C.A0J(scanResult.getWifiSsid(), wifiSsid);
            }
        }
    }
}
