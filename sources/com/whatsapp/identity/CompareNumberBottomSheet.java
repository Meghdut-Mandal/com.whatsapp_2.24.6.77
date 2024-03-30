package com.whatsapp.identity;

import X.AnonymousClass00C;
import X.AnonymousClass088;
import X.C36351kA;
import X.C36371kC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public final class CompareNumberBottomSheet extends Hilt_CompareNumberBottomSheet {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        TextView A0F = C36351kA.A0F(view, R.id.identity_verification_number);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            str = bundle2.getString("number");
        } else {
            str = null;
        }
        A0F.setText(str);
        AnonymousClass088.A03(A0F, 1);
        A0F.setTextDirection(3);
    }
}
