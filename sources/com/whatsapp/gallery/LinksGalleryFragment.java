package com.whatsapp.gallery;

import X.AnonymousClass1DU;
import X.AnonymousClass1H2;
import X.AnonymousClass1SV;
import X.AnonymousClass2TW;
import X.AnonymousClass3QW;
import X.AnonymousClass4TA;
import X.C20650xu;
import X.C24801Dv;
import X.C32731e6;
import X.C33301f4;
import X.C36391kE;
import X.C36411kG;
import X.C77563qh;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.R;

public class LinksGalleryFragment extends Hilt_LinksGalleryFragment implements AnonymousClass4TA {
    public C24801Dv A00;
    public C33301f4 A01;
    public C20650xu A02;
    public AnonymousClass3QW A03;
    public C32731e6 A04;
    public AnonymousClass1H2 A05;
    public AnonymousClass1DU A06;
    public C77563qh A07;
    public AnonymousClass1SV A08;

    public void A1P(Bundle bundle) {
        this.A0Y = true;
        AnonymousClass2TW r1 = new AnonymousClass2TW(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C36391kE.A0P(A0d(), R.id.empty_text).setText(R.string.f12nameremoved);
    }

    public void A1O(Context context) {
        super.A1O(context);
        this.A01 = new C33301f4(C36411kG.A0r(this.A0G));
    }
}
