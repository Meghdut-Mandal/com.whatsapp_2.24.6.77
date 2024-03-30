package com.whatsapp.group;

import X.AnonymousClass2aS;
import X.AnonymousClass4TH;
import X.B7Y;
import X.BA8;
import X.C165567td;
import X.C173788Ta;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import android.os.Bundle;
import com.whatsapp.R;

public class GroupAddBlacklistPickerActivity extends C173788Ta implements AnonymousClass4TH {
    public AnonymousClass2aS A00;
    public boolean A01;
    public boolean A02;

    public void B2Z() {
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            C173788Ta.A0x(this, A0B);
            this.A00 = (AnonymousClass2aS) r1.A8n.get();
        }
    }

    public void B3Z() {
        this.A05.A05(0, R.string.f12nameremoved);
        BA8.A00(this, this.A00.A02(this.A0S), 0);
    }

    public GroupAddBlacklistPickerActivity(int i) {
        this.A02 = false;
        B7Y.A00(this, 15);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = getIntent().getBooleanExtra("was_nobody", false);
    }

    public GroupAddBlacklistPickerActivity() {
        this(0);
    }
}
