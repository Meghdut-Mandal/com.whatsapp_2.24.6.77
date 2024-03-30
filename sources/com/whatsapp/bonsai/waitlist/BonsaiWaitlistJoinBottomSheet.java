package com.whatsapp.bonsai.waitlist;

import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass17Y;
import X.AnonymousClass1KA;
import X.C21010yW;
import X.C36331k8;
import X.C45162Qh;
import X.C71483gq;
import android.os.Bundle;
import android.view.View;

public abstract class BonsaiWaitlistJoinBottomSheet extends Hilt_BonsaiWaitlistJoinBottomSheet {
    public AnonymousClass17Y A00;
    public C71483gq A01;
    public AnonymousClass1KA A02;
    public Integer A03;
    public AnonymousClass00S A04;

    public void A1S(Bundle bundle, View view) {
        Integer num;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            num = Integer.valueOf(bundle2.getInt("bonsaiWaitlistDialogEntryPoint", -1));
        } else {
            num = null;
        }
        this.A03 = num;
        if (num != null && num.intValue() == -1) {
            this.A03 = null;
            num = null;
        }
        C71483gq r0 = this.A01;
        if (r0 != null) {
            C21010yW r2 = r0.A00;
            C45162Qh r1 = new C45162Qh();
            r1.A00 = 43;
            r1.A01 = num;
            r2.Bly(r1);
            return;
        }
        throw C36331k8.A0d("bonsaiWaitlistLogger");
    }

    public BonsaiWaitlistJoinBottomSheet(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
    }
}
