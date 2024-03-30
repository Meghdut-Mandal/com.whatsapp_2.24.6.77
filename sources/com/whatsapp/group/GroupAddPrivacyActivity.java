package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass3TL;
import X.AnonymousClass4TH;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36411kG;
import X.C430626v;
import X.C89334Wd;
import android.os.Bundle;
import android.widget.RadioButton;

public class GroupAddPrivacyActivity extends C430626v implements AnonymousClass4TH {
    public int A00;
    public boolean A01;
    public boolean A02;

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36411kG.A0X(A0B);
        }
    }

    public void B3Z() {
        this.A05.A04("groupadd", AnonymousClass3TL.A02("groupadd", this.A00));
        this.A01 = false;
    }

    public GroupAddPrivacyActivity(int i) {
        this.A02 = false;
        C89334Wd.A00(this, 34);
    }

    public void B2Z() {
        A3j();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 0;
        this.A01 = AnonymousClass000.A1S(this.A05.A00("groupadd"), 2);
        this.A03.setEnabled(false);
        boolean z = this.A01;
        RadioButton radioButton = this.A03;
        if (!z) {
            i = 8;
        }
        radioButton.setVisibility(i);
    }

    public GroupAddPrivacyActivity() {
        this(0);
        this.A01 = false;
    }
}
