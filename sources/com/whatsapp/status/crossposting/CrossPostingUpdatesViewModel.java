package com.whatsapp.status.crossposting;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass330;
import X.AnonymousClass3KF;
import X.C28781Ua;
import X.C29731Xt;
import X.C32371dR;
import X.C32381dS;
import X.C36331k8;
import X.C36431kI;
import X.C61653Cx;
import X.C63023Il;
import X.C63623Kt;
import X.C80013ue;
import X.C90304Zw;
import com.whatsapp.bridge.wfal.WfalManager;

public final class CrossPostingUpdatesViewModel extends AnonymousClass04R implements AnonymousClass01Y {
    public AnonymousClass3KF A00;
    public C61653Cx A01;
    public final WfalManager A02;
    public final C32371dR A03;
    public final C29731Xt A04;
    public final C32381dS A05;
    public final C63623Kt A06;
    public final C28781Ua A07;
    public final C90304Zw A08;
    public final AnonymousClass330 A09 = new AnonymousClass330(this);
    public final C80013ue A0A = new C80013ue(this);

    public void A0R() {
        this.A01 = null;
        if (!this.A07.A00()) {
            C32371dR r2 = this.A03;
            C90304Zw r1 = this.A08;
            AnonymousClass00C.A0D(r1, 0);
            r2.A01.unregisterObserver(r1);
        }
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        int A062 = C36431kI.A06(r4, 1);
        if (A062 != 0) {
            if (A062 != 1) {
                if (A062 == 5 && this.A07.A00()) {
                    C63623Kt r2 = this.A06;
                    r2.A00 = null;
                    r2.A03 = false;
                    r2.A07.unregisterObserver(r2.A05);
                }
            } else if (this.A07.A00()) {
                C63623Kt r22 = this.A06;
                C80013ue r1 = this.A0A;
                AnonymousClass00C.A0D(r1, 0);
                r22.A00 = r1;
                r22.A01();
            }
        } else if (this.A07.A00()) {
            C63623Kt r23 = this.A06;
            C80013ue r0 = this.A0A;
            AnonymousClass00C.A0D(r0, 0);
            r23.A00 = r0;
            if (r23.A01 == null) {
                r23.A01 = new C63023Il(false, false);
            }
            if (r23.A02 == null) {
                r23.A02 = new C63023Il(false, false);
            }
        }
    }

    public static final void A01(CrossPostingUpdatesViewModel crossPostingUpdatesViewModel, boolean z, boolean z2) {
        AnonymousClass3KF r1 = crossPostingUpdatesViewModel.A00;
        if (r1 == null) {
            throw C36331k8.A0d("crossPostingViewModelState");
        } else if (r1.A03 != z || r1.A02 != z2) {
            r1.A03 = z;
            r1.A02 = z2;
            C61653Cx r0 = crossPostingUpdatesViewModel.A01;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    public final AnonymousClass3KF A0S() {
        AnonymousClass3KF r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("crossPostingViewModelState");
        }
        return new AnonymousClass3KF(r0.A00, r0.A01, r0.A03, r0.A02, r0.A05, r0.A04);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003b, code lost:
        if (r11.A02().isEmpty() != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CrossPostingUpdatesViewModel(com.whatsapp.bridge.wfal.WfalManager r10, X.C32371dR r11, X.C29731Xt r12, X.C32381dS r13, X.C63623Kt r14, X.C28781Ua r15) {
        /*
            r9 = this;
            X.C36321k7.A1B(r15, r12, r10, r14, r13)
            r0 = 6
            X.AnonymousClass00C.A0D(r11, r0)
            r9.<init>()
            r9.A07 = r15
            r9.A04 = r12
            r9.A02 = r10
            r9.A06 = r14
            r9.A05 = r13
            r9.A03 = r11
            r7 = 0
            X.4Zw r1 = new X.4Zw
            r1.<init>(r9, r7)
            r9.A08 = r1
            X.3ue r0 = new X.3ue
            r0.<init>(r9)
            r9.A0A = r0
            X.330 r0 = new X.330
            r0.<init>(r9)
            r9.A09 = r0
            boolean r0 = r15.A00()
            if (r0 != 0) goto L_0x003d
            X.1Ak r0 = r11.A02()
            boolean r0 = r0.isEmpty()
            r5 = 1
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            X.2pr r3 = X.C52602pr.HIDE
            X.3KF r2 = new X.3KF
            r8 = 0
            r4 = r3
            r6 = r5
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.A00 = r2
            boolean r0 = r15.A00()
            if (r0 != 0) goto L_0x0055
            X.1dN r0 = r11.A01
            r0.registerObserver(r1)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel.<init>(com.whatsapp.bridge.wfal.WfalManager, X.1dR, X.1Xt, X.1dS, X.3Kt, X.1Ua):void");
    }
}
