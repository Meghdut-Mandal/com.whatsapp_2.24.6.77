package com.whatsapp.datasharingdisclosure.ui;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass3Y0;
import X.AnonymousClass4BJ;
import X.AnonymousClass4QN;
import X.C24801Dv;
import X.C30921az;
import X.C30961b3;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C51332ne;
import X.C51612o6;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;

public class ConsumerMarketingDisclosureFragment extends Hilt_ConsumerMarketingDisclosureFragment implements AnonymousClass4QN {
    public C24801Dv A00;
    public C30961b3 A01;
    public boolean A02;
    public final AnonymousClass11F A03;
    public final C30921az A04;
    public final AnonymousClass00T A05 = C36431kI.A1I(new AnonymousClass4BJ(this));

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C51612o6 A1m = A1m();
        C51612o6 r2 = C51612o6.INFO;
        if (A1m != r2) {
            this.A04.A05.A00(C51332ne.MARKETING_MESSAGE);
        }
        if (A1m() == C51612o6.NON_BLOCKING_DISCLOSURE && !this.A02) {
            this.A04.A02(this.A03);
            this.A02 = true;
        }
        if (A1m() == r2) {
            TextView A0P = C36391kE.A0P(view, R.id.action);
            C36381kD.A18(view, R.id.cancel);
            A0P.setVisibility(0);
            AnonymousClass3Y0.A01(A0P, this, 7);
            A0P.setText(R.string.f12nameremoved);
        }
        int ordinal = A1m().ordinal();
        int i = 2;
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal == 1) {
            i = 0;
        } else if (ordinal != 2) {
            throw C36441kJ.A18();
        }
        C30961b3 r4 = this.A01;
        if (r4 != null) {
            AnonymousClass11F r3 = this.A03;
            AnonymousClass00C.A0D(r3, 0);
            C30961b3.A00(r3, r4, (Integer) null, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, 3);
            return;
        }
        throw C36331k8.A0d("disclosureLoggingUtil");
    }

    public void A1J() {
        C30961b3 r2 = this.A01;
        if (r2 != null) {
            AnonymousClass11F r1 = this.A03;
            AnonymousClass00C.A0D(r1, 0);
            C30961b3.A00(r1, r2, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 4);
            super.A1J();
            return;
        }
        throw C36331k8.A0d("disclosureLoggingUtil");
    }

    public ConsumerMarketingDisclosureFragment(AnonymousClass11F r2, C30921az r3) {
        this.A03 = r2;
        this.A04 = r3;
    }
}
