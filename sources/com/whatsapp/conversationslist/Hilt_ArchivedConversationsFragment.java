package com.whatsapp.conversationslist;

import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19470v6;
import X.C24541Cv;
import X.C27111My;
import X.C32541dn;
import X.C32571dq;
import X.C32581dr;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C53292r5;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ArchivedConversationsFragment extends FolderConversationsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1Z() {
        if (!this.A02) {
            this.A02 = true;
            C32581dr r5 = (C32581dr) ((C32571dq) generatedComponent());
            C18800tq r4 = r5.A1K;
            C18830tt r3 = r4.A00;
            C53292r5.A00(this, C18830tt.A85(r3));
            C165567td.A12(r4, this);
            C165567td.A0x(r4, r3, this, r4.A79.get());
            this.A2W = C36431kI.A0p(r4);
            C19470v6 r2 = C19470v6.A00;
            C165567td.A0s(r2, r4, r3, this);
            C27111My r1 = r5.A1I;
            this.A29 = C27111My.A2M(r1);
            this.A0V = r2;
            this.A2U = C36381kD.A0f(r4);
            C165567td.A0w(r4, r3, this);
            this.A1t = (C24541Cv) r4.A4O.get();
            this.A2F = C36391kE.A0g(r4);
            C165567td.A0r(r2, r4, r3, this);
            C165567td.A0y(r4, r3, this, r4.A0F);
            C165577te.A12(r1, r4, r3, this);
            C165567td.A0q(r2, r5, r4, r3, this);
            C165567td.A0u(r1, r4, r3, this, C165587tf.A0O(r4, this));
            C165567td.A0t(r2, r4, r3, this);
            C165587tf.A14(r1, r3, this);
            C165567td.A0o(r2, r1, r5, r4, this);
            this.A33 = C18840tu.A00(r3.A35);
            C165567td.A0p(r2, r1, r4, r3, this);
        }
    }

    public Context A1D() {
        if (super.A1D() == null && !this.A01) {
            return null;
        }
        A03();
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
            r2.A03()
            r2.A1Z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.Hilt_ArchivedConversationsFragment.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1Z();
    }
}
