package X;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.7uK  reason: invalid class name and case insensitive filesystem */
public final class C165897uK extends WifiManager.ScanResultsCallback {
    public final /* synthetic */ C203279ni A00;

    public C165897uK(C203279ni r1) {
        this.A00 = r1;
    }

    public void onScanResultsAvailable() {
        List<ScanResult> scanResults;
        try {
            C203279ni r1 = this.A00;
            WifiManager A0F = r1.A01.A0F();
            if (A0F != null && (scanResults = A0F.getScanResults()) != null) {
                C203279ni.A04(r1, scanResults);
            }
        } catch (SecurityException e) {
            Log.w(C36331k8.A0i("ThunderstormManager/onScanResultsAvailable: SecurityException: ", AnonymousClass000.A0u(), e));
        }
    }
}
