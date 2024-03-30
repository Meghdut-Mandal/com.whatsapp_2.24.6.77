package com.whatsapp.payments.ui;

import X.AnonymousClass0BJ;
import X.AnonymousClass97C;
import X.B7Z;
import X.C013105r;
import X.C165567td;
import X.C165577te;
import X.C173858Tk;
import X.C178818he;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C207359uy;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36391kE;
import X.C36411kG;
import X.C36441kJ;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.whatsapp.R;

public class IndiaUpiPaymentsValuePropsActivity extends C178818he {
    public TextSwitcher A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A01 = C173858Tk.A0G(r1);
            this.A00 = C19460v5.A01(new AnonymousClass97C());
        }
    }

    public IndiaUpiPaymentsValuePropsActivity(int i) {
        this.A01 = false;
        B7Z.A00(this, 30);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass0BJ r2 = (AnonymousClass0BJ) this.A00.getLayoutParams();
        r2.A0Z = C36441kJ.A05(getResources(), R.dimen.f7nameremoved);
        this.A00.setLayoutParams(r2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        A3z(R.string.f12nameremoved, R.id.payments_value_props_title_and_description_section);
        TextView A0Q = C36391kE.A0Q(this, R.id.payments_value_props_title);
        C36411kG.A0Q(this, R.id.payments_value_props_image_section).setImageDrawable(C013105r.A01(this, R.drawable.vec_ic_payments_vector_value_props));
        boolean A0E = this.A0D.A0E(1568);
        int i = R.string.f12nameremoved;
        if (A0E) {
            i = R.string.f12nameremoved;
        }
        A0Q.setText(i);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.payments_value_props_desc);
        this.A00 = textSwitcher;
        A4A(textSwitcher);
        C207359uy.A00(findViewById(R.id.payments_value_props_continue), this, 48);
        this.A0P.A09();
    }

    public IndiaUpiPaymentsValuePropsActivity() {
        this(0);
    }
}
