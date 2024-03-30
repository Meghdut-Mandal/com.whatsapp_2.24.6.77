package X;

import android.net.wifi.SoftApConfiguration;
import android.net.wifi.WifiManager;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.7uJ  reason: invalid class name and case insensitive filesystem */
public final class C165887uJ extends WifiManager.LocalOnlyHotspotCallback {
    public final /* synthetic */ WifiManager A00;
    public final /* synthetic */ C203279ni A01;
    public final /* synthetic */ CompletableFuture A02;

    public C165887uJ(WifiManager wifiManager, C203279ni r2, CompletableFuture completableFuture) {
        this.A01 = r2;
        this.A02 = completableFuture;
        this.A00 = wifiManager;
    }

    public void onFailed(int i) {
        this.A02.complete((Object) null);
    }

    public void onStarted(WifiManager.LocalOnlyHotspotReservation localOnlyHotspotReservation) {
        SoftApConfiguration softApConfiguration;
        if (!(localOnlyHotspotReservation == null || (softApConfiguration = localOnlyHotspotReservation.getSoftApConfiguration()) == null)) {
            softApConfiguration.getWifiSsid();
        }
        C203279ni r4 = this.A01;
        r4.A00 = localOnlyHotspotReservation;
        if (localOnlyHotspotReservation != null) {
            CompletableFuture completableFuture = this.A02;
            WifiManager wifiManager = this.A00;
            completableFuture.complete(C203279ni.A00(localOnlyHotspotReservation));
            wifiManager.registerScanResultsCallback(new C19930wk(r4.A03, false), r4.A0A);
        }
    }
}
