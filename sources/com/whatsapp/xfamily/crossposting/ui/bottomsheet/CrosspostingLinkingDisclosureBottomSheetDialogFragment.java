package com.whatsapp.xfamily.crossposting.ui.bottomsheet;

import X.AnonymousClass00C;
import X.AnonymousClass1UM;
import X.AnonymousClass1US;
import X.AnonymousClass1UZ;
import X.C124325xy;
import X.C159817jy;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C48772i1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class CrosspostingLinkingDisclosureBottomSheetDialogFragment extends Hilt_CrosspostingLinkingDisclosureBottomSheetDialogFragment {
    public static final AnonymousClass1US A07 = AnonymousClass1US.CROSSPOST_DISCLOSURE_BOTTOM_SHEET;
    public WDSButton A00;
    public WDSButton A01;
    public C159817jy A02;
    public C124325xy A03;
    public AnonymousClass1UM A04;
    public AnonymousClass1UZ A05;
    public boolean A06;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, true);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        this.A01 = C36431kI.A0y(view, R.id.not_now_btn);
        this.A00 = C36431kI.A0y(view, R.id.continue_to_setup_btn);
        WDSButton wDSButton = this.A01;
        if (wDSButton != null) {
            C48772i1.A00(wDSButton, this, 37);
        }
        WDSButton wDSButton2 = this.A00;
        if (wDSButton2 != null) {
            C48772i1.A00(wDSButton2, this, 38);
        }
        C36361kB.A0F(view, R.id.drag_handle).setVisibility(C36351kA.A00(A1o() ^ true ? 1 : 0));
        AnonymousClass00C.A0D("CrosspostingLinkingDisclosureBottomSheetDialogFragment Opening Linking disclosure fragment", 0);
    }

    public void A1J() {
        super.A1J();
        if (!this.A06) {
            AnonymousClass1UZ r2 = this.A05;
            if (r2 != null) {
                AnonymousClass1UM r1 = this.A04;
                if (r1 != null) {
                    r2.A02(Boolean.valueOf(r1.A06(AnonymousClass1US.CROSSPOST_DISCLOSURE_BOTTOM_SHEET)), "is_account_linked");
                    r2.A03("EXIT_LINKING_NUX");
                    return;
                }
                throw C36331k8.A0d("fbAccountManager");
            }
            throw C36331k8.A0d("xFamilyUserFlowLogger");
        }
    }
}
