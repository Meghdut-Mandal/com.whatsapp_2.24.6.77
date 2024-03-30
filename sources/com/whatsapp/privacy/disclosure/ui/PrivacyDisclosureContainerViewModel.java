package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass17Y;
import X.AnonymousClass1Z5;
import X.AnonymousClass3NX;
import X.AnonymousClass6AW;
import X.AnonymousClass6M9;
import X.AnonymousClass730;
import X.C001600r;
import X.C001700s;
import X.C128136Ba;
import X.C131156Ny;
import X.C160877lj;
import X.C19770wU;
import X.C24681Dj;
import X.C36321k7;
import X.C36431kI;
import X.C51792oO;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

public final class PrivacyDisclosureContainerViewModel extends AnonymousClass04R {
    public int A00;
    public AnonymousClass3NX A01 = AnonymousClass3NX.A06;
    public final C001600r A02;
    public final C001700s A03;
    public final C24681Dj A04;
    public final C131156Ny A05;
    public final C19770wU A06;
    public final AnonymousClass17Y A07;
    public final AnonymousClass1Z5 A08;

    public final void A0S(int i) {
        AnonymousClass6AW r0;
        C160877lj r1;
        C51792oO r02;
        C128136Ba r03 = (C128136Ba) this.A03.A04();
        if (r03 == null || (r0 = (AnonymousClass6AW) r03.A01) == null) {
            Log.e("PrivacyDisclosureContainerViewModel: saveStage: disclosure not loaded yet");
            return;
        }
        int i2 = r0.A00;
        C24681Dj r2 = this.A04;
        r2.A09.Boy(new AnonymousClass730(r2, i2, i));
        AnonymousClass1Z5 r4 = this.A08;
        AnonymousClass3NX r3 = this.A01;
        AnonymousClass00C.A0D(r3, 3);
        int i3 = 1;
        if (i != 1) {
            i3 = 175;
            if (i != 5) {
                i3 = 100;
                if (i != 100) {
                    i3 = 105;
                    if (i != 105) {
                        i3 = 145;
                        if (i != 145) {
                            i3 = 155;
                            if (i != 155) {
                                i3 = 165;
                                if (i != 165) {
                                    switch (i) {
                                        case 111:
                                            i3 = 111;
                                            break;
                                        case 112:
                                            i3 = 112;
                                            break;
                                        case 113:
                                            i3 = 113;
                                            break;
                                        case 114:
                                            i3 = 114;
                                            break;
                                        case 115:
                                            i3 = 115;
                                            break;
                                        case 116:
                                            i3 = 116;
                                            break;
                                        case 117:
                                            i3 = 117;
                                            break;
                                        case 118:
                                            i3 = 118;
                                            break;
                                        case 119:
                                            i3 = 119;
                                            break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf != null) {
            AnonymousClass1Z5.A00(r3, r4, i2, valueOf.intValue());
        }
        WeakReference weakReference = AnonymousClass6M9.A00;
        if (!(weakReference == null || (r1 = (C160877lj) weakReference.get()) == null)) {
            if (i == 5) {
                r1.Bk3();
            } else if (i == 145) {
                r1.Bk6();
            } else if (i == 155) {
                r1.Bk2();
            } else if (i == 160) {
                r1.Bk7();
            } else if (i == 162) {
                r1.Bk8();
            } else if (i != 165) {
                if (i == 400) {
                    r02 = C51792oO.ERROR_FAIL_TO_DOWNLOAD;
                } else if (i == 420) {
                    r02 = C51792oO.ERROR_MISMATCHED_TEMPLATE;
                } else if (i == 499) {
                    r02 = C51792oO.ERROR_UNKNOWN;
                } else {
                    return;
                }
                r1.Bei(r02);
            } else {
                r1.Bk4();
            }
        }
        AnonymousClass6M9.A00 = null;
    }

    public PrivacyDisclosureContainerViewModel(AnonymousClass17Y r2, C24681Dj r3, C131156Ny r4, AnonymousClass1Z5 r5, C19770wU r6) {
        C36321k7.A1B(r2, r6, r3, r5, r4);
        this.A07 = r2;
        this.A06 = r6;
        this.A04 = r3;
        this.A08 = r5;
        this.A05 = r4;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A02 = A0S;
    }
}
