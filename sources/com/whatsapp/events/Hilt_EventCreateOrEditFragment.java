package com.whatsapp.events;

import X.AnonymousClass1N0;
import X.C18800tq;
import X.C18830tt;
import X.C24291Bw;
import X.C29581Xe;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C58222zW;
import X.C61763Di;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.base.WaFragment;

public abstract class Hilt_EventCreateOrEditFragment extends WaFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Y() {
        if (!this.A02) {
            this.A02 = true;
            EventCreateOrEditFragment eventCreateOrEditFragment = (EventCreateOrEditFragment) this;
            C32581dr r3 = (C32581dr) C36401kF.A0K(this);
            C18800tq r4 = r3.A1K;
            C18830tt r2 = r4.A00;
            eventCreateOrEditFragment.A0K = C36331k8.A0D(r4, r2, eventCreateOrEditFragment);
            eventCreateOrEditFragment.A02 = C36351kA.A0M(r4);
            eventCreateOrEditFragment.A0N = C36401kF.A0f(r4);
            eventCreateOrEditFragment.A0C = C36351kA.A0a(r4);
            eventCreateOrEditFragment.A0J = (C29581Xe) r4.A36.get();
            eventCreateOrEditFragment.A0F = C36351kA.A0e(r4);
            eventCreateOrEditFragment.A0L = C36411kG.A0m(r4);
            eventCreateOrEditFragment.A0D = C36431kI.A0b(r4);
            eventCreateOrEditFragment.A0A = C36351kA.A0U(r4);
            eventCreateOrEditFragment.A0B = C36341k9.A0T(r4);
            eventCreateOrEditFragment.A0G = C36421kH.A0M(r4);
            eventCreateOrEditFragment.A0M = C36351kA.A0m(r4);
            eventCreateOrEditFragment.A0V = C24291Bw.A00();
            eventCreateOrEditFragment.A01 = (C58222zW) r3.A0c.get();
            eventCreateOrEditFragment.A0E = (AnonymousClass1N0) r2.A3P.get();
            eventCreateOrEditFragment.A0I = (C61763Di) r2.A7E.get();
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A00();
        return this.A00;
    }

    public LayoutInflater A1E(Bundle bundle) {
        return C36331k8.A08(super.A1E(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1F(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1F(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C32551do.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C36331k8.A1U(r0)
            r2.A00()
            r2.A1Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.events.Hilt_EventCreateOrEditFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Y();
    }
}
