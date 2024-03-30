package com.whatsapp.picker.search;

import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass2MC;
import X.AnonymousClass3L7;
import X.AnonymousClass3XU;
import X.AnonymousClass4O7;
import X.C36331k8;
import X.C36421kH;
import X.C78053rU;
import X.C87794Qe;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.gifsearch.GifSearchContainer;

public final class GifSearchDialogFragment extends Hilt_GifSearchDialogFragment implements C87794Qe, AnonymousClass4O7 {
    public AnonymousClass3L7 A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        super.A1G(bundle, layoutInflater, viewGroup);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.gifsearch.GifSearchContainer");
        GifSearchContainer gifSearchContainer = (GifSearchContainer) inflate;
        gifSearchContainer.A00 = 48;
        AnonymousClass01I A0i = A0i();
        AnonymousClass3L7 r1 = this.A00;
        if (r1 != null) {
            gifSearchContainer.A02(A0i, (AnonymousClass2MC) null, r1, this);
            gifSearchContainer.A0E = this;
            return gifSearchContainer;
        }
        throw C36331k8.A0d("gifSearchProvider");
    }

    public void BYd(AnonymousClass3XU r2) {
        WaEditText waEditText;
        AnonymousClass00C.A0D(r2, 0);
        GifSearchContainer gifSearchContainer = (GifSearchContainer) this.A0F;
        if (!(gifSearchContainer == null || (waEditText = gifSearchContainer.A06) == null)) {
            waEditText.A0B();
        }
        C78053rU r0 = this.A00;
        if (r0 != null) {
            r0.BYd(r2);
        }
    }

    public void A1M() {
        GifSearchContainer gifSearchContainer;
        super.A1M();
        View view = this.A0F;
        if ((view instanceof GifSearchContainer) && (gifSearchContainer = (GifSearchContainer) view) != null) {
            C36421kH.A1D(gifSearchContainer.A06);
        }
    }
}
