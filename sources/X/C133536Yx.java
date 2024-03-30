package X;

import android.content.DialogInterface;
import android.net.wifi.WifiManager;
import com.whatsapp.messaging.CaptivePortalActivity;

/* renamed from: X.6Yx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133536Yx implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WifiManager A01;
    public final /* synthetic */ CaptivePortalActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C133536Yx(WifiManager wifiManager, CaptivePortalActivity captivePortalActivity, String str, int i) {
        this.A02 = captivePortalActivity;
        this.A01 = wifiManager;
        this.A00 = i;
        this.A03 = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            com.whatsapp.messaging.CaptivePortalActivity r6 = r7.A02
            android.net.wifi.WifiManager r5 = r7.A01
            int r4 = r7.A00
            java.lang.String r3 = r7.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "forgetting wifi network "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r2 = " named "
            X.C36321k7.A1Q(r2, r3, r1)
            boolean r0 = r5.removeNetwork(r4)
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "remove network failed for wifi network "
        L_0x0025:
            r1.append(r0)
            r1.append(r4)
            X.C36321k7.A1R(r2, r3, r1)
        L_0x002e:
            boolean r0 = r5.disconnect()
            if (r0 != 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "failed to disconnect from wifi network "
            r1.append(r0)
            r1.append(r4)
            X.C36321k7.A1R(r2, r3, r1)
        L_0x0043:
            r6.finish()
            return
        L_0x0047:
            boolean r0 = r5.saveConfiguration()
            if (r0 != 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "save configuration failed for wifi network "
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133536Yx.onClick(android.content.DialogInterface, int):void");
    }
}
