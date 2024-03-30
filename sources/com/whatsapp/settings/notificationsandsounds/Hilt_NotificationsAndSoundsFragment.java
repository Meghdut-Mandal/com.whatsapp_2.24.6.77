package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass4PX;
import X.C18800tq;
import X.C191639Dt;
import X.C24381Cf;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C32641dx;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.WaPreferenceFragment;

public abstract class Hilt_NotificationsAndSoundsFragment extends WaPreferenceFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Z() {
        if (!this.A02) {
            this.A02 = true;
            NotificationsAndSoundsFragment notificationsAndSoundsFragment = (NotificationsAndSoundsFragment) this;
            C32581dr r1 = (C32581dr) ((C32571dq) generatedComponent());
            notificationsAndSoundsFragment.A01 = (AnonymousClass4PX) r1.A1I.A2f.get();
            notificationsAndSoundsFragment.A00 = (C191639Dt) r1.A0p.get();
            C18800tq r12 = r1.A1K;
            notificationsAndSoundsFragment.A02 = (C24381Cf) r12.A2M.get();
            notificationsAndSoundsFragment.A08 = C36371kC.A0j(r12);
            notificationsAndSoundsFragment.A09 = C36341k9.A0Z(r12);
            notificationsAndSoundsFragment.A05 = (C32641dx) r12.A00.A4F.get();
            notificationsAndSoundsFragment.A03 = C36351kA.A0h(r12);
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
            r2.A1Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.notificationsandsounds.Hilt_NotificationsAndSoundsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A00();
        A1Z();
    }
}
