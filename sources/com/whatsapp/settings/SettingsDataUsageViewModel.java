package com.whatsapp.settings;

import X.AnonymousClass04R;
import X.AnonymousClass179;
import X.AnonymousClass17Y;
import X.C001700s;
import X.C19770wU;
import X.C20810yC;
import X.C30531aM;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C68903ce;
import android.os.Build;
import android.os.Environment;
import java.io.File;

public class SettingsDataUsageViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36441kJ.A0Z(C36381kD.A0j());
    public final C001700s A01 = C36431kI.A0S();
    public final AnonymousClass17Y A02;
    public final C20810yC A03;
    public final C68903ce A04;
    public final C19770wU A05;
    public final C30531aM A06;
    public final AnonymousClass179 A07;

    public void A0R() {
        C68903ce r1 = this.A04;
        r1.A03.A01();
        r1.A04.A01();
    }

    public /* synthetic */ void A0S() {
        C001700s r1;
        boolean z;
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageLegacy() || !this.A03.A0E(1235)) {
            r1 = this.A00;
            z = false;
        } else {
            File A0w = C36441kJ.A0w(Environment.getExternalStorageDirectory(), "WhatsApp");
            r1 = this.A00;
            z = A0w.exists();
        }
        C36341k9.A19(r1, z);
    }

    public SettingsDataUsageViewModel(AnonymousClass17Y r2, C30531aM r3, AnonymousClass179 r4, C20810yC r5, C68903ce r6, C19770wU r7) {
        this.A03 = r5;
        this.A02 = r2;
        this.A05 = r7;
        this.A06 = r3;
        this.A07 = r4;
        this.A04 = r6;
    }
}
