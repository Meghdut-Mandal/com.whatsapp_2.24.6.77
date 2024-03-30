package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass14B;
import X.AnonymousClass24a;
import X.AnonymousClass2a0;
import X.AnonymousClass4XY;
import X.C03570Gk;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C89344We;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrazilPaymentDPOActivity extends AnonymousClass24a {
    public AnonymousClass2a0 A00;
    public List A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = (AnonymousClass2a0) A0L.A0C.get();
        }
    }

    public BrazilPaymentDPOActivity(int i) {
        this.A02 = false;
        C89344We.A00(this, 41);
    }

    public void A3i() {
        super.A3i();
        C03570Gk.A0B(this, R.id.warning).setVisibility(8);
        this.A06.setVisibility(8);
        C03570Gk.A0B(this, R.id.conditions_container).setVisibility(0);
        TextView A0H = C36401kF.A0H(this, R.id.condition_relocated_checkbox);
        A0H.setText(R.string.f12nameremoved);
        TextView A0H2 = C36401kF.A0H(this, R.id.condition_travelled_checkbox);
        A0H2.setText(R.string.f12nameremoved);
        TextView A0H3 = C36401kF.A0H(this, R.id.condition_foreign_method_checkbox);
        A0H3.setText(R.string.f12nameremoved);
        Object[] objArr = new CheckBox[3];
        objArr[0] = A0H;
        C36411kG.A1Q(A0H2, A0H3, objArr, 1);
        List<TextView> asList = Arrays.asList(objArr);
        this.A01 = asList;
        AnonymousClass2a0 r2 = this.A00;
        ArrayList A0I = AnonymousClass001.A0I();
        for (TextView A0u : asList) {
            A0I.add(C36371kC.A0u(A0u));
        }
        r2.A06.A03("list_of_conditions", AnonymousClass14B.A08("|", (CharSequence[]) A0I.toArray(new String[0])));
        for (CompoundButton A002 : this.A01) {
            AnonymousClass4XY.A00(A002, this, 16);
        }
        C36391kE.A1I(this.A01, this, 16);
    }

    public BrazilPaymentDPOActivity() {
        this(0);
    }
}
