package com.whatsapp.community;

import X.C18800tq;
import X.C220712t;
import X.C26421Kc;
import X.C27111My;
import X.C32541dn;
import X.C32581dr;
import X.C34361gu;
import X.C34381gw;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C56992xU;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.whatsapp.RoundedBottomSheetDialogFragment;

public abstract class Hilt_CommunityNewSubgroupSwitcherBottomSheet extends RoundedBottomSheetDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A03() {
        if (this.A00 == null) {
            this.A00 = C36431kI.A11(super.A1D(), this);
            this.A01 = C32541dn.A00(super.A1D());
        }
    }

    public void A1h() {
        if (!this.A02) {
            this.A02 = true;
            CommunityNewSubgroupSwitcherBottomSheet communityNewSubgroupSwitcherBottomSheet = (CommunityNewSubgroupSwitcherBottomSheet) this;
            C32581dr r1 = (C32581dr) C36391kE.A0U(this);
            C18800tq r3 = r1.A1K;
            C36321k7.A0l(r3.A00, communityNewSubgroupSwitcherBottomSheet);
            communityNewSubgroupSwitcherBottomSheet.A0F = C36351kA.A0a(r3);
            communityNewSubgroupSwitcherBottomSheet.A0C = C36351kA.A0T(r3);
            communityNewSubgroupSwitcherBottomSheet.A08 = C36341k9.A0R(r3);
            communityNewSubgroupSwitcherBottomSheet.A0A = C36341k9.A0S(r3);
            communityNewSubgroupSwitcherBottomSheet.A09 = C36351kA.A0S(r3);
            communityNewSubgroupSwitcherBottomSheet.A06 = C36391kE.A0b(r3);
            communityNewSubgroupSwitcherBottomSheet.A04 = C36371kC.A0T(r3);
            communityNewSubgroupSwitcherBottomSheet.A05 = C36361kB.A0U(r3);
            communityNewSubgroupSwitcherBottomSheet.A0J = C36431kI.A0f(r3);
            communityNewSubgroupSwitcherBottomSheet.A0G = C36371kC.A0Y(r3);
            C27111My r12 = r1.A1I;
            communityNewSubgroupSwitcherBottomSheet.A01 = (C34361gu) r12.A0g.get();
            communityNewSubgroupSwitcherBottomSheet.A03 = (C26421Kc) r3.A1A.get();
            communityNewSubgroupSwitcherBottomSheet.A0H = C36351kA.A0b(r3);
            communityNewSubgroupSwitcherBottomSheet.A0I = C36371kC.A0c(r3);
            communityNewSubgroupSwitcherBottomSheet.A00 = (C56992xU) r12.A0Y.get();
            communityNewSubgroupSwitcherBottomSheet.A02 = (C34381gw) r12.A0h.get();
            communityNewSubgroupSwitcherBottomSheet.A0K = C36361kB.A0e(r3);
            communityNewSubgroupSwitcherBottomSheet.A0E = (C220712t) r3.A1b.get();
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
            r2.A1h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.Hilt_CommunityNewSubgroupSwitcherBottomSheet.A1F(android.app.Activity):void");
    }

    public void A1O(Context context) {
        super.A1O(context);
        A03();
        A1h();
    }
}
