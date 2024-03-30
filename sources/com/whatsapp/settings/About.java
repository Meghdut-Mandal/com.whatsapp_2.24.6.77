package com.whatsapp.settings;

import X.AnonymousClass155;
import X.AnonymousClass1RC;
import X.C18800tq;
import X.C18830tt;
import X.C19550w8;
import X.C224514j;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36391kE;
import X.C36441kJ;
import X.C48762i0;
import X.C89364Wg;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.Objects;

public class About extends AnonymousClass155 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public About(int i) {
        this.A00 = false;
        C89364Wg.A00(this, 16);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        int A002 = C224514j.A00(this, R.attr.f4nameremoved, R.color.f6nameremoved);
        boolean z = !AnonymousClass1RC.A0A(this);
        if (C19550w8.A01()) {
            AnonymousClass1RC.A04(this, A002);
            AnonymousClass1RC.A09(getWindow(), z);
        } else {
            AnonymousClass1RC.A04(this, R.color.f6nameremoved);
        }
        if (C19550w8.A04()) {
            AnonymousClass1RC.A06(this, A002, C36371kC.A00(z ? 1 : 0));
        }
        TextView A0Q = C36391kE.A0Q(this, R.id.version);
        Objects.requireNonNull("2.24.6.77");
        C36341k9.A0s(this, A0Q, new Object[]{"2.24.6.77"}, R.string.f12nameremoved);
        TextView A0Q2 = C36391kE.A0Q(this, R.id.about_licenses);
        SpannableString A0O = C36441kJ.A0O(getString(R.string.f12nameremoved));
        A0O.setSpan(new UnderlineSpan(), 0, A0O.length(), 0);
        A0Q2.setText(A0O);
        C48762i0.A00(A0Q2, this, 27);
    }

    public About() {
        this(0);
    }
}
