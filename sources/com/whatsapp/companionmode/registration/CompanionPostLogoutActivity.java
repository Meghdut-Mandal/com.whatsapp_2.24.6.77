package com.whatsapp.companionmode.registration;

import X.AnonymousClass155;
import X.AnonymousClass1Pd;
import X.AnonymousClass1RU;
import X.AnonymousClass3YD;
import X.C18800tq;
import X.C18830tt;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C62603Gu;
import X.C80213v2;
import X.C89324Wc;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class CompanionPostLogoutActivity extends AnonymousClass155 {
    public AnonymousClass1RU A00;
    public AnonymousClass1Pd A01;
    public C62603Gu A02;
    public C32681e1 A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A03 = C36351kA.A0p(r1);
            this.A00 = C36351kA.A0R(A0B);
            this.A02 = (C62603Gu) r1.A8A.get();
            this.A01 = (AnonymousClass1Pd) A0B.AEE.get();
        }
    }

    public CompanionPostLogoutActivity(int i) {
        this.A04 = false;
        C89324Wc.A00(this, 23);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        boolean A0A = this.A00.A0A();
        if (A0A) {
            if (!TextUtils.isEmpty(this.A09.A0d())) {
                C36341k9.A0s(this, C36391kE.A0Q(this, R.id.post_logout_title), new Object[]{this.A00.A0H(this.A09.A0d())}, R.string.f12nameremoved);
            } else {
                Log.e("CompanionPostLogoutActivity/init/LoggedOutPhoneNumber is null or empty");
            }
        }
        TextView A0Q = C36391kE.A0Q(this, R.id.post_logout_text_2);
        A0Q.setText(this.A03.A02(A0Q.getContext(), C80213v2.A00(this, 15), C36391kE.A0v(this, "contact-help", new Object[1], 0, R.string.f12nameremoved), "contact-help"));
        C36331k8.A10(A0Q, this.A0D);
        AnonymousClass3YD.A00(findViewById(R.id.continue_button), this, 2, A0A);
    }

    public CompanionPostLogoutActivity() {
        this(0);
    }
}
