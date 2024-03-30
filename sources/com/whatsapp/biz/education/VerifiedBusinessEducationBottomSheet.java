package com.whatsapp.biz.education;

import X.AnonymousClass00C;
import X.C197659c4;
import X.C20380xT;
import X.C20810yC;
import X.C24801Dv;
import X.C36331k8;
import X.C36381kD;
import X.C36411kG;
import X.C36421kH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class VerifiedBusinessEducationBottomSheet extends Hilt_VerifiedBusinessEducationBottomSheet {
    public C24801Dv A00;
    public C20810yC A01;
    public C197659c4 A02;
    public C20380xT A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0J = C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
        WaTextView A0Z = C36411kG.A0Z(A0J, R.id.description);
        boolean A0E = A0Z.getAbProps().A0E(6127);
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        A0Z.setText(i);
        C36421kH.A10(A0J.findViewById(R.id.learn_more_button), this, 49);
        return A0J;
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C197659c4 r3 = this.A02;
        if (r3 != null) {
            String string = A0b().getString("biz_owner_jid");
            if (string != null) {
                C197659c4.A00(r3, 2, string, 2, 2);
                return;
            }
            throw C36381kD.A0k();
        }
        throw C36331k8.A0d("metaVerifiedInteractionLogger");
    }
}
