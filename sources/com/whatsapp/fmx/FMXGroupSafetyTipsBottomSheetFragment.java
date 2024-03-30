package com.whatsapp.fmx;

import X.AnonymousClass00C;
import X.AnonymousClass3Y2;
import X.C012005e;
import X.C20380xT;
import X.C24801Dv;
import X.C62643Gy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

public final class FMXGroupSafetyTipsBottomSheetFragment extends Hilt_FMXGroupSafetyTipsBottomSheetFragment {
    public C24801Dv A00;
    public C62643Gy A01;
    public C20380xT A02;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        AnonymousClass3Y2.A00(C012005e.A02(view, R.id.safety_tips_close_button), this, 5);
        AnonymousClass3Y2.A00(C012005e.A02(view, R.id.safety_tips_learn_more), this, 6);
    }
}
