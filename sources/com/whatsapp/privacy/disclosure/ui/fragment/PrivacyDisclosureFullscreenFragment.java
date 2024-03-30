package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.C111265c0;
import X.C128146Bb;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C36411kG;
import X.C52002oj;
import X.C55062u0;
import X.C93094ff;
import X.C93134fw;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureFullscreenFragment extends AnonymousClass02E {
    public C128146Bb A00;
    public C93094ff A01;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        View view2 = this.A0F;
        if (view2 != null) {
            C36391kE.A1C(C36341k9.A0F(view2), view2, C36411kG.A01(view2.getContext()));
        }
        C128146Bb r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("args");
        }
        C93094ff r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
        A0i().A05.A01(new C93134fw(), A0m());
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass01I A0h = A0h();
        if (A0h == null) {
            return null;
        }
        AnonymousClass01z supportFragmentManager = A0h.getSupportFragmentManager();
        AnonymousClass00C.A08(supportFragmentManager);
        C93094ff r0 = new C93094ff(A0h, supportFragmentManager);
        this.A01 = r0;
        return r0;
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C128146Bb A002 = C111265c0.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureFullscreenFragment: parseAndValidateArguments(): invalid disclosure arguments");
        C55062u0.A00(A0l(), C52002oj.RESULT_ERROR);
    }
}
