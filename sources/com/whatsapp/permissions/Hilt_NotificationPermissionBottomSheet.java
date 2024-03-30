package com.whatsapp.permissions;

import X.AnonymousClass00C;
import X.AnonymousClass5ZR;
import X.C120485ra;
import X.C18800tq;
import X.C18830tt;
import X.C19970wo;
import X.C21010yW;
import X.C32541dn;
import X.C32581dr;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_NotificationPermissionBottomSheet extends RequestPermissionsBottomSheet {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            NotificationPermissionBottomSheet notificationPermissionBottomSheet = (NotificationPermissionBottomSheet) this;
            C18800tq r2 = ((C32581dr) C36391kE.A0U(this)).A1K;
            C18830tt r1 = r2.A00;
            C36361kB.A1E(r1, notificationPermissionBottomSheet);
            AnonymousClass5ZR.A00(notificationPermissionBottomSheet, (C120485ra) r1.A7n.get());
            notificationPermissionBottomSheet.A05 = C36341k9.A0V(r2);
            notificationPermissionBottomSheet.A01 = C36351kA.A0M(r2);
            notificationPermissionBottomSheet.A06 = C36431kI.A0u(r1);
            notificationPermissionBottomSheet.A00 = C36351kA.A0J(r2);
            notificationPermissionBottomSheet.A02 = C36391kE.A0X(r2);
            notificationPermissionBottomSheet.A03 = C36351kA.A0U(r2);
            notificationPermissionBottomSheet.A04 = C36351kA.A0Y(r2);
            C19970wo A0V = C36351kA.A0V(r2);
            AnonymousClass00C.A0D(A0V, 0);
            notificationPermissionBottomSheet.A00 = A0V;
            C21010yW A0g = C36351kA.A0g(r2);
            AnonymousClass00C.A0D(A0g, 0);
            notificationPermissionBottomSheet.A01 = A0g;
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A05();
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
            r2.A05()
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.permissions.Hilt_NotificationPermissionBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A05();
        A1h();
    }
}
