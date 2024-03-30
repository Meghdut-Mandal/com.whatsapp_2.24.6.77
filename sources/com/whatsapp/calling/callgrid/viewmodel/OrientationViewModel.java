package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass004;
import X.AnonymousClass04R;
import X.C001700s;
import X.C1901797e;
import X.C19630wG;
import X.C27631Pa;
import X.C36321k7;
import X.C36431kI;
import X.C92114d9;
import android.hardware.display.DisplayManager;

public class OrientationViewModel extends AnonymousClass04R {
    public DisplayManager.DisplayListener A00;
    public C92114d9 A01;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final C001700s A05 = C36431kI.A0S();
    public final C19630wG A06;
    public final AnonymousClass004 A07;
    public final AnonymousClass004 A08;

    public static void A01(OrientationViewModel orientationViewModel, int i) {
        C001700s r3 = orientationViewModel.A05;
        Object A042 = r3.A04();
        Integer valueOf = Integer.valueOf(i);
        if (!C1901797e.A00(A042, valueOf)) {
            C36321k7.A1T("voip/OrientationViewModel/setOrientation ", AnonymousClass000.A0u(), i);
            r3.A0D(valueOf);
        }
    }

    public OrientationViewModel(C27631Pa r5, C19630wG r6, AnonymousClass004 r7, AnonymousClass004 r8) {
        this.A06 = r6;
        this.A07 = r7;
        this.A08 = r8;
        int i = C27631Pa.A00(r5).getInt("portrait_mode_threshold", 30);
        this.A04 = i;
        int i2 = C27631Pa.A00(r5).getInt("landscape_mode_threshold", 30);
        this.A03 = i2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OrientationViewModel/ctor portraitModeThreshold = ");
        A0u.append(i);
        C36321k7.A1T(" landscapeModeThreshold = ", A0u, i2);
        A01(this, (4 - ((DisplayManager) this.A06.A00.getSystemService("display")).getDisplay(0).getRotation()) % 4);
    }
}
