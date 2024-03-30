package com.whatsapp.wabloks.base;

import X.AnonymousClass00C;
import X.C19600wD;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class DefaultBkPreloadFragment$BkCustomReloadFragment extends Hilt_DefaultBkPreloadFragment_BkCustomReloadFragment {
    public C19600wD A00;
    public GenericBkLayoutViewModelWithReload A01;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return C36371kC.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        int i2;
        AnonymousClass00C.A0D(view, 0);
        GenericBkLayoutViewModelWithReload genericBkLayoutViewModelWithReload = (GenericBkLayoutViewModelWithReload) C36441kJ.A0b(A0f()).A00(GenericBkLayoutViewModelWithReload.class);
        AnonymousClass00C.A0D(genericBkLayoutViewModelWithReload, 0);
        this.A01 = genericBkLayoutViewModelWithReload;
        TextView A0P = C36391kE.A0P(view, R.id.error_message);
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (i2 = bundle2.getInt("layout_error_status")) == 1 || i2 == 3 || i2 == 4 || i2 == 6 || i2 == 7) {
            C19600wD r0 = this.A00;
            if (r0 != null) {
                boolean A09 = r0.A09();
                i = R.string.f12nameremoved;
                if (A09) {
                    i = R.string.f12nameremoved;
                }
            } else {
                throw C36331k8.A0d("connectivityStateProvider");
            }
        } else {
            i = R.string.f12nameremoved;
        }
        A0P.setText(i);
        C36351kA.A1E(view.findViewById(R.id.retry_button), this, 25);
    }
}
