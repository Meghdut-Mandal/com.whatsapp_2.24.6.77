package com.whatsapp.report;

import X.AnonymousClass08X;
import X.AnonymousClass17Y;
import X.C001700s;
import X.C19420v0;
import X.C19770wU;
import X.C31881cX;
import X.C31891cY;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C591132r;
import X.C591232s;
import X.C591332t;
import X.C591432u;
import X.C76793pS;
import X.C76803pT;
import X.C76813pU;
import android.app.Application;

public class BusinessActivityReportViewModel extends AnonymousClass08X {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36441kJ.A0Z(C36381kD.A0m());
    public final C001700s A02 = C36431kI.A0S();
    public final AnonymousClass17Y A03;
    public final C19420v0 A04;
    public final C31881cX A05;
    public final C31891cY A06;
    public final C591132r A07;
    public final C591232s A08;
    public final C591332t A09;
    public final C591432u A0A;
    public final C76793pS A0B;
    public final C76803pT A0C;
    public final C76813pU A0D;
    public final C19770wU A0E;

    public static void A01(BusinessActivityReportViewModel businessActivityReportViewModel) {
        C36341k9.A17(businessActivityReportViewModel.A02, 0);
        businessActivityReportViewModel.A05.A02();
    }

    public void A0R() {
        this.A0C.A00 = null;
        this.A0B.A00 = null;
        this.A0D.A00 = null;
        this.A06.A00 = null;
    }

    public BusinessActivityReportViewModel(Application application, AnonymousClass17Y r6, C19420v0 r7, C31881cX r8, C31891cY r9, C76793pS r10, C76803pT r11, C76813pU r12, C19770wU r13) {
        super(application);
        C591132r r3 = new C591132r(this);
        this.A07 = r3;
        C591232s r2 = new C591232s(this);
        this.A08 = r2;
        C591332t r1 = new C591332t(this);
        this.A09 = r1;
        C591432u r0 = new C591432u(this);
        this.A0A = r0;
        this.A03 = r6;
        this.A0E = r13;
        this.A04 = r7;
        this.A05 = r8;
        this.A0C = r11;
        this.A06 = r9;
        this.A0B = r10;
        this.A0D = r12;
        r12.A00 = r3;
        r10.A00 = r1;
        r11.A00 = r2;
        r9.A00 = r0;
    }
}
