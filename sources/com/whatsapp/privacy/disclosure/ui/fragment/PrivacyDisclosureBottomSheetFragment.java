package com.whatsapp.privacy.disclosure.ui.fragment;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass01z;
import X.AnonymousClass5SO;
import X.C111265c0;
import X.C128146Bb;
import X.C21060yb;
import X.C36331k8;
import X.C36411kG;
import X.C52002oj;
import X.C55062u0;
import X.C65123Qv;
import X.C93094ff;
import X.C99204sp;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.util.Log;

public final class PrivacyDisclosureBottomSheetFragment extends RoundedBottomSheetDialogFragment {
    public C128146Bb A00;
    public C93094ff A01;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C128146Bb r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("args");
        }
        C93094ff r3 = this.A01;
        if (r3 != null) {
            r3.A00(r0.A02, r0.A00, r0.A01);
        }
    }

    public void A1n(View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1n(view);
        C128146Bb r0 = this.A00;
        if (r0 == null) {
            throw C36331k8.A0d("args");
        }
        boolean z = false;
        if (r0.A02.A04 == AnonymousClass5SO.LARGE) {
            z = true;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = C36411kG.A00() - C65123Qv.A02(view.getContext(), C21060yb.A01(A0a()));
            view.setLayoutParams(layoutParams);
        }
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(view);
        A02.A0d(true);
        A02.A0a(new C99204sp(A02, this, z));
        A02.A0W(3);
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

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C128146Bb A002 = C111265c0.A00(this);
        if (A002 != null) {
            this.A00 = A002;
            return;
        }
        Log.e("PrivacyDisclosureBottomSheetFragment: parseAndValidateArguments(): invalid disclosure arguments");
        C55062u0.A00(A0l(), C52002oj.RESULT_ERROR);
        A1c();
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            AnonymousClass01z supportFragmentManager = A0h.getSupportFragmentManager();
            AnonymousClass00C.A08(supportFragmentManager);
            C55062u0.A00(supportFragmentManager, C52002oj.RESULT_BACK);
        }
    }
}
