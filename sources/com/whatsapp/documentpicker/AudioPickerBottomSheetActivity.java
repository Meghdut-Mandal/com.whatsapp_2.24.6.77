package com.whatsapp.documentpicker;

import X.AnonymousClass1X7;
import X.AnonymousClass22g;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C89334Wd;
import com.whatsapp.audiopicker.AudioPickerActivity;

public final class AudioPickerBottomSheetActivity extends AudioPickerActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass22g.A0l(this);
            this.A04 = C36401kF.A0S(A0B);
            this.A0F = (AnonymousClass1X7) A0B.A4o.get();
            this.A08 = C36351kA.A0T(A0B);
            this.A05 = C36341k9.A0R(A0B);
            AnonymousClass22g.A0M(A0B, r1, this, C36341k9.A0S(A0B));
        }
    }

    public AudioPickerBottomSheetActivity(int i) {
        this.A00 = false;
        C89334Wd.A00(this, 16);
    }

    public AudioPickerBottomSheetActivity() {
        this(0);
    }
}
