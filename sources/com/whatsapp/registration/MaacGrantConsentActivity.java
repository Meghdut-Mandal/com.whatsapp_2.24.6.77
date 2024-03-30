package com.whatsapp.registration;

import X.AnonymousClass000;
import X.AnonymousClass155;
import X.AnonymousClass17Y;
import X.AnonymousClass1VG;
import X.AnonymousClass3Y6;
import X.AnonymousClass3YH;
import X.AnonymousClass5N9;
import X.AnonymousClass6YV;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C20810yC;
import X.C21060yb;
import X.C24801Dv;
import X.C27591Ow;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import X.C75463nH;
import X.C88534Tb;
import X.C89354Wf;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class MaacGrantConsentActivity extends AnonymousClass155 implements C88534Tb {
    public C19630wG A00;
    public C27591Ow A01;
    public boolean A02;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19630wG r1 = this.A00;
        if (r1 != null) {
            AnonymousClass1VG r2 = new AnonymousClass1VG(r1, new AnonymousClass5N9());
            if (Binder.getCallingUid() != Process.myUid()) {
                r2.A00().A00();
            }
            if (C36401kF.A0M(this) == null || !this.A0A.A03()) {
                Log.e("MaacGrantConsentActivity/not logged in");
                A01(this, false);
            }
            setContentView((int) R.layout.f9nameremoved);
            C36331k8.A0n(this);
            C20810yC r9 = this.A0D;
            AnonymousClass17Y r6 = this.A05;
            C24801Dv r5 = this.A01;
            C21060yb r8 = this.A08;
            AnonymousClass6YV.A0E(this, this.A04.A00("https://faq.whatsapp.com"), r5, r6, C36401kF.A0O(this.A00, R.id.description_with_learn_more), r8, r9, getString(R.string.f12nameremoved), "learn-more");
            C27591Ow r0 = this.A01;
            if (r0 != null) {
                AnonymousClass3YH.A00(findViewById(R.id.give_consent_button), this, new C75463nH(r0), 27);
                AnonymousClass3Y6.A00(findViewById(R.id.do_not_give_consent_button), this, 20);
                AnonymousClass3Y6.A00(findViewById(R.id.close_button), this, 21);
                return;
            }
            throw C36331k8.A0d("mexGraphQlClient");
        }
        throw C36331k8.A0d("waContext");
    }

    public void A2F() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0W(A0B);
            this.A01 = C36391kE.A0g(A0B);
        }
    }

    public void Bju() {
        Log.i("MaacGrantConsentActivity/onUpdateConsentFailure/");
        A01(this, false);
    }

    public void Bjv() {
        Log.i("MaacGrantConsentActivity/onUpdateConsentSuccess/");
        A01(this, true);
    }

    public MaacGrantConsentActivity(int i) {
        this.A02 = false;
        C89354Wf.A00(this, 43);
    }

    public static final void A01(MaacGrantConsentActivity maacGrantConsentActivity, boolean z) {
        C36321k7.A1X("MaacGrantConsentActivity/returnResult/", AnonymousClass000.A0u(), z);
        C36331k8.A0o(maacGrantConsentActivity, C36431kI.A0D().putExtra("result", z));
    }

    public MaacGrantConsentActivity() {
        this(0);
    }
}
