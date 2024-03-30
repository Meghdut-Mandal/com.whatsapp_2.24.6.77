package com.whatsapp.migration.export.ui;

import X.AnonymousClass000;
import X.AnonymousClass04R;
import X.AnonymousClass5FY;
import X.C001700s;
import X.C108405Tj;
import X.C124805yp;
import X.C146916wN;
import X.C1901797e;
import X.C20810yC;
import X.C36321k7;
import X.C36431kI;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class ExportMigrationViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C124805yp A03 = new C124805yp();
    public final AnonymousClass5FY A04;
    public final C146916wN A05;

    public void A0R() {
        this.A04.unregisterObserver(this.A05);
    }

    public ExportMigrationViewModel(C20810yC r2, AnonymousClass5FY r3) {
        int i;
        this.A04 = r3;
        C146916wN r0 = new C146916wN(this);
        this.A05 = r0;
        r3.registerObserver(r0);
        if (r2.A0E(881)) {
            Log.e("ExportMigrationViewModel/disabled: app version for platform migration is not supported");
            i = 4;
        } else {
            i = 0;
        }
        A0S(i);
    }

    public void A0S(int i) {
        C108405Tj r0;
        C36321k7.A1T("ExportMigrationViewModel/setScreen: ", AnonymousClass000.A0u(), i);
        Integer valueOf = Integer.valueOf(i);
        C001700s r2 = this.A02;
        if (!C1901797e.A00(valueOf, r2.A04())) {
            C124805yp r1 = this.A03;
            r1.A0A = 8;
            r1.A00 = 8;
            r1.A03 = 8;
            r1.A06 = 8;
            r1.A04 = 8;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        r1.A08 = R.string.f12nameremoved;
                        r1.A07 = R.string.f12nameremoved;
                        r1.A02 = R.string.f12nameremoved;
                        r1.A03 = 0;
                    } else if (i == 4) {
                        r1.A08 = R.string.f12nameremoved;
                        r1.A07 = R.string.f12nameremoved;
                        r1.A02 = R.string.f12nameremoved;
                        r1.A03 = 0;
                        r1.A05 = R.string.f12nameremoved;
                        r1.A06 = 0;
                        r1.A0A = 8;
                        r1.A01 = R.drawable.vec_android_to_ios_error;
                        r0 = C108405Tj.ANDROID_TO_IOS_ERROR;
                    } else if (i == 5) {
                        r1.A08 = R.string.f12nameremoved;
                        r1.A07 = R.string.f12nameremoved;
                        r1.A06 = 8;
                        r1.A04 = 8;
                    } else {
                        return;
                    }
                    r1.A0A = 8;
                } else {
                    r1.A08 = R.string.f12nameremoved;
                    r1.A07 = R.string.f12nameremoved;
                    r1.A0A = 8;
                    r1.A06 = 0;
                    r1.A05 = R.string.f12nameremoved;
                    r1.A04 = 0;
                }
                r1.A01 = R.drawable.vec_android_to_ios_in_progress;
                r0 = C108405Tj.ANDROID_TO_IOS_IN_PROGRESS;
            } else {
                r1.A08 = R.string.f12nameremoved;
                r1.A07 = R.string.f12nameremoved;
                r1.A00 = 0;
                r1.A02 = R.string.f12nameremoved;
                r1.A03 = 0;
                r1.A09 = R.string.f12nameremoved;
                r1.A0A = 0;
                r1.A01 = R.drawable.vec_android_to_ios_start;
                r0 = C108405Tj.ANDROID_TO_IOS_START;
            }
            r1.A0B = r0;
            C36321k7.A1T("ExportMigrationViewModel/setScreen/post=", AnonymousClass000.A0u(), i);
            r2.A0C(valueOf);
        }
    }
}
