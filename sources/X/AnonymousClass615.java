package X;

import com.whatsapp.migration.transfer.service.WifiGroupScannerP2pTransferService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.Socket;

/* renamed from: X.615  reason: invalid class name */
public final /* synthetic */ class AnonymousClass615 {
    public final /* synthetic */ WifiGroupScannerP2pTransferService A00;

    public /* synthetic */ AnonymousClass615(WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService) {
        this.A00 = wifiGroupScannerP2pTransferService;
    }

    public final void A00(String str) {
        WifiGroupScannerP2pTransferService wifiGroupScannerP2pTransferService = this.A00;
        try {
            wifiGroupScannerP2pTransferService.A05.A00();
            Log.i("fpm/WifiGroupScannerP2pTransferService/Creating a socket");
            C115995jm r1 = wifiGroupScannerP2pTransferService.A01;
            Socket createSocket = new C183218qP(C36351kA.A0W(r1.A00.A00), wifiGroupScannerP2pTransferService.A06, (C21260yv) r1.A00.A00.A5u.get()).createSocket();
            C115985jl r12 = wifiGroupScannerP2pTransferService.A00;
            AnonymousClass5N4 r0 = new AnonymousClass5N4((C105535Fa) r12.A00.A00.A00.A36.get(), wifiGroupScannerP2pTransferService.A06.A04, str, createSocket);
            wifiGroupScannerP2pTransferService.A08 = r0;
            r0.start();
        } catch (IOException unused) {
            Log.e("fpm/WifiGroupScannerP2pTransferService/Failed to create ssl socket");
            wifiGroupScannerP2pTransferService.A05.A02(604);
        }
    }
}
