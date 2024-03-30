package com.whatsapp.status.seeall.viewmodel;

import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass02R;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass08S;
import X.AnonymousClass1N6;
import X.AnonymousClass3P0;
import X.AnonymousClass4LL;
import X.C001600r;
import X.C005502l;
import X.C007403e;
import X.C023509x;
import X.C109325Xd;
import X.C36321k7;
import X.C36381kD;
import X.C36441kJ;
import X.C52342pH;
import X.C57852yv;
import X.C57862yw;
import X.C65963Ud;
import com.whatsapp.status.viewmodels.StatusesViewModel;

public final class StatusSeeAllViewModel extends AnonymousClass04R implements AnonymousClass01Y {
    public C001600r A00;
    public AnonymousClass08S A01;
    public C52342pH A02;
    public C007403e A03;
    public boolean A04;
    public final C57852yv A05;
    public final C57862yw A06;
    public final StatusesViewModel A07;
    public final AnonymousClass1N6 A08;
    public final C005502l A09;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033 A[LOOP:0: B:11:0x0031->B:12:0x0033, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C63423Jz A01(com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel r11, java.lang.String r12, java.util.List r13) {
        /*
            r6 = r12
            boolean r9 = r13.isEmpty()
            boolean r10 = r13.isEmpty()
            boolean r0 = r11.A04
            r4 = 0
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r8 = 2131893866(0x7f121e6a, float:1.942252E38)
        L_0x0012:
            r10 = 0
        L_0x0013:
            X.0k2 r5 = new X.0k2
            r5.<init>()
            X.2pH r1 = r11.A02
            X.2pH r0 = X.C52342pH.ALL
            if (r1 != r0) goto L_0x0024
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x006e
        L_0x0024:
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x006e
            X.2pH[] r3 = X.C52342pH.values()
            int r1 = r3.length
            java.util.ArrayList r2 = X.C36441kJ.A14(r1)
        L_0x0031:
            if (r4 >= r1) goto L_0x0060
            r0 = r3[r4]
            int r0 = r0.labelResource
            X.AnonymousClass000.A1F(r2, r0)
            int r4 = r4 + 1
            goto L_0x0031
        L_0x003d:
            X.2pH r0 = r11.A02
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x005b
            r0 = 1
            if (r1 == r0) goto L_0x0057
            r0 = 2
            if (r1 == r0) goto L_0x0053
            r0 = 3
            if (r1 != r0) goto L_0x007b
            r8 = 2131893917(0x7f121e9d, float:1.9422624E38)
        L_0x0051:
            r6 = r2
            goto L_0x0013
        L_0x0053:
            r8 = 2131893920(0x7f121ea0, float:1.942263E38)
            goto L_0x0051
        L_0x0057:
            r8 = 2131893918(0x7f121e9e, float:1.9422626E38)
            goto L_0x0051
        L_0x005b:
            r8 = 2131893919(0x7f121e9f, float:1.9422628E38)
            r6 = r2
            goto L_0x0012
        L_0x0060:
            X.2pH r0 = r11.A02
            int r1 = r0.ordinal()
            X.2gl r0 = new X.2gl
            r0.<init>(r2, r1)
            r5.add(r0)
        L_0x006e:
            r5.addAll(r13)
            X.0k2 r7 = X.AnonymousClass03S.A00(r5)
            X.3Jz r5 = new X.3Jz
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        L_0x007b:
            X.0jS r0 = X.C36441kJ.A18()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel.A01(com.whatsapp.status.seeall.viewmodel.StatusSeeAllViewModel, java.lang.String, java.util.List):X.3Jz");
    }

    public void BhM(AnonymousClass05R r1, AnonymousClass012 r2) {
    }

    public static final void A02(C52342pH r4, StatusSeeAllViewModel statusSeeAllViewModel) {
        statusSeeAllViewModel.A02 = r4;
        statusSeeAllViewModel.A04 = false;
        AnonymousClass3P0 r42 = (AnonymousClass3P0) statusSeeAllViewModel.A07.A05.A04();
        if (r42 != null) {
            C36381kD.A1R(statusSeeAllViewModel.A09, new StatusSeeAllViewModel$fetchAndPostStatusesUiData$1(r42, statusSeeAllViewModel, (C023509x) null), C109325Xd.A00(statusSeeAllViewModel));
        }
    }

    public StatusSeeAllViewModel(C57852yv r5, C57862yw r6, StatusesViewModel statusesViewModel, AnonymousClass1N6 r8, C005502l r9, int i) {
        C36321k7.A18(r5, r6, r8, r9);
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = statusesViewModel;
        AnonymousClass08S A0Y = C36441kJ.A0Y();
        this.A01 = A0Y;
        this.A00 = A0Y;
        C52342pH r0 = (C52342pH) AnonymousClass02R.A08(C52342pH.values(), i);
        this.A02 = r0 == null ? C52342pH.ALL : r0;
        C65963Ud.A02(statusesViewModel.A05, this.A01, new AnonymousClass4LL(this), 26);
    }
}
