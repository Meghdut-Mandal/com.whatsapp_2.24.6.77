package com.whatsapp.gallery;

import X.AnonymousClass13J;
import X.AnonymousClass17Y;
import X.AnonymousClass1TA;
import X.AnonymousClass1X7;
import X.AnonymousClass2TX;
import X.AnonymousClass3D9;
import X.AnonymousClass3QW;
import X.AnonymousClass4TA;
import X.C19700wN;
import X.C24801Dv;
import X.C36391kE;
import X.C77553qg;
import android.os.Bundle;
import com.whatsapp.R;

public class DocumentsGalleryFragment extends Hilt_DocumentsGalleryFragment implements AnonymousClass4TA {
    public C24801Dv A00;
    public C19700wN A01;
    public AnonymousClass17Y A02;
    public AnonymousClass3D9 A03;
    public C77553qg A04;
    public AnonymousClass3QW A05;
    public AnonymousClass1TA A06;
    public AnonymousClass1X7 A07;
    public AnonymousClass13J A08;

    public void A1P(Bundle bundle) {
        this.A0Y = true;
        AnonymousClass2TX r1 = new AnonymousClass2TX(this);
        this.A0A = r1;
        this.A02.setAdapter(r1);
        C36391kE.A0P(A0d(), R.id.empty_text).setText(R.string.f12nameremoved);
    }
}
