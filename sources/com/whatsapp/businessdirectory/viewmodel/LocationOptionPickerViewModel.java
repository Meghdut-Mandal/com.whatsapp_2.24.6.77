package com.whatsapp.businessdirectory.viewmodel;

import X.AnonymousClass08X;
import X.AnonymousClass1QW;
import X.AnonymousClass5DR;
import X.C001700s;
import X.C129006Eo;
import X.C142616pA;
import X.C159337jC;
import X.C19630wG;
import X.C20830yE;
import X.C28201Rs;
import X.C36341k9;
import X.C36431kI;
import X.C36441kJ;

public class LocationOptionPickerViewModel extends AnonymousClass08X implements C159337jC {
    public final C001700s A00 = C36431kI.A0S();
    public final C142616pA A01;
    public final AnonymousClass5DR A02;
    public final C129006Eo A03;
    public final C19630wG A04;
    public final C20830yE A05;
    public final AnonymousClass1QW A06;
    public final C28201Rs A07 = C36441kJ.A0t();

    public void BaF() {
        this.A01.A02(3, 1);
        this.A02.A02(true);
        A01(this);
    }

    public void BaG() {
        this.A01.A02(4, 1);
    }

    public static void A01(LocationOptionPickerViewModel locationOptionPickerViewModel) {
        if (locationOptionPickerViewModel.A05.A05()) {
            if (!locationOptionPickerViewModel.A06.A04()) {
                locationOptionPickerViewModel.A02.A00();
            }
            C36341k9.A16(locationOptionPickerViewModel.A07, 5);
            return;
        }
        C36341k9.A17(locationOptionPickerViewModel.A07, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004b, code lost:
        if (((android.location.LocationManager) r4.A04.A00.getSystemService("location")).isProviderEnabled("gps") == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationOptionPickerViewModel(android.app.Application r5, X.C142616pA r6, X.AnonymousClass5DR r7, X.C129006Eo r8, X.C19630wG r9, X.C20830yE r10, X.AnonymousClass1QW r11) {
        /*
            r4 = this;
            r4.<init>(r5)
            X.1Rs r0 = X.C36441kJ.A0t()
            r4.A07 = r0
            X.00s r0 = X.C36431kI.A0S()
            r4.A00 = r0
            r4.A04 = r9
            r4.A01 = r6
            r4.A05 = r10
            r4.A06 = r11
            r4.A03 = r8
            r4.A02 = r7
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            X.51V r3 = new X.51V
            r3.<init>(r4)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x004d
            boolean r0 = r10.A05()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x004d
            X.0wG r0 = r4.A04
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            r3.A00 = r1
            r2.add(r3)
            X.51U r0 = new X.51U
            r0.<init>(r4)
            r2.add(r0)
            X.00s r0 = r4.A00
            r0.A0C(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.<init>(android.app.Application, X.6pA, X.5DR, X.6Eo, X.0wG, X.0yE, X.1QW):void");
    }
}
