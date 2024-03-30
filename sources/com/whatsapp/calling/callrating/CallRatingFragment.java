package com.whatsapp.calling.callrating;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass5TF;
import X.AnonymousClass7KY;
import X.AnonymousClass7ST;
import X.C142426or;
import X.C165167sz;
import X.C36341k9;
import X.C36391kE;
import X.C36431kI;
import X.C90514aH;
import X.C90524aI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.StarRatingBar;
import com.whatsapp.base.WaFragment;

public final class CallRatingFragment extends WaFragment {
    public TextView A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass7KY(this));

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        View A0Q = C90514aH.A0Q(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A00 = C36391kE.A0P(A0Q, R.id.rating_description);
        ((StarRatingBar) A0Q.findViewById(R.id.rating_bar)).A01 = new C142426or(this);
        AnonymousClass00T r2 = this.A01;
        C36341k9.A16(C90524aI.A0L(r2).A09, AnonymousClass5TF.CALL_RATINGS.titleRes);
        C165167sz.A00(A0m(), C90524aI.A0L(r2).A0C, new AnonymousClass7ST(this), 48);
        return A0Q;
    }

    public void A1J() {
        super.A1J();
        this.A00 = null;
    }
}
