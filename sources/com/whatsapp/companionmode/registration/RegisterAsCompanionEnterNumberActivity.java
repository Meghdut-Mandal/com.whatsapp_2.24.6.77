package com.whatsapp.companionmode.registration;

import X.AnonymousClass00F;
import X.AnonymousClass155;
import X.AnonymousClass1M4;
import X.AnonymousClass1N4;
import X.AnonymousClass1RJ;
import X.AnonymousClass2FX;
import X.AnonymousClass3AK;
import X.AnonymousClass3MT;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C18800tq;
import X.C18830tt;
import X.C19630wG;
import X.C20380xT;
import X.C25951Ih;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C48812i6;
import X.C48912iG;
import X.C65673Ta;
import X.C89324Wc;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.components.PhoneNumberEntry;

public final class RegisterAsCompanionEnterNumberActivity extends AnonymousClass155 {
    public AnonymousClass1N4 A00;
    public C25951Ih A01;
    public C19630wG A02;
    public AnonymousClass3AK A03;
    public C20380xT A04;
    public AnonymousClass1M4 A05;
    public boolean A06;
    public final C009904e A07;
    public final C009904e A08;

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = C36351kA.A0W(A0B);
            this.A05 = C36361kB.A0f(A0B);
            this.A04 = C36331k8.A0I(A0B);
            this.A00 = C36351kA.A0K(A0B);
            this.A01 = (C25951Ih) A0B.A1z.get();
        }
    }

    public RegisterAsCompanionEnterNumberActivity(int i) {
        this.A06 = false;
        C89324Wc.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        PhoneNumberEntry phoneNumberEntry = (PhoneNumberEntry) findViewById(R.id.phone_number_entry);
        AnonymousClass3AK r1 = new AnonymousClass3AK();
        this.A03 = r1;
        r1.A05 = phoneNumberEntry;
        r1.A02 = phoneNumberEntry.A01;
        r1.A03 = phoneNumberEntry.A02;
        r1.A04 = C36391kE.A0Q(this, R.id.registration_country);
        AnonymousClass3AK r0 = this.A03;
        if (r0 == null) {
            throw C36331k8.A0d("phoneNumberEntryViewHolder");
        }
        r0.A03.setTextDirection(3);
        AnonymousClass1RJ A0r = C36351kA.A0r(this, R.id.phone_number_entry_error);
        phoneNumberEntry.A03 = new AnonymousClass2FX(this, A0r);
        AnonymousClass3AK r12 = this.A03;
        if (r12 == null) {
            throw C36331k8.A0d("phoneNumberEntryViewHolder");
        }
        r12.A01 = AnonymousClass3MT.A00(r12.A03);
        AnonymousClass3AK r13 = this.A03;
        if (r13 == null) {
            throw C36331k8.A0d("phoneNumberEntryViewHolder");
        }
        r13.A00 = AnonymousClass3MT.A00(r13.A02);
        AnonymousClass3AK r02 = this.A03;
        if (r02 == null) {
            throw C36331k8.A0d("phoneNumberEntryViewHolder");
        }
        C48912iG.A00(r02.A04, this, 12);
        AnonymousClass3AK r03 = this.A03;
        if (r03 == null) {
            throw C36331k8.A0d("phoneNumberEntryViewHolder");
        }
        C012005e.A0F(AnonymousClass00F.A04(this, C36381kD.A02(this)), r03.A04);
        phoneNumberEntry.A01.setGravity(3);
        phoneNumberEntry.A02.setHint(R.string.f12nameremoved);
        C48812i6.A00(findViewById(R.id.next_btn), this, A0r, 36);
        C48912iG.A00(findViewById(R.id.help_btn), this, 13);
    }

    public void onDestroy() {
        super.onDestroy();
        C25951Ih r0 = this.A01;
        if (r0 != null) {
            C25951Ih.A00(r0).A05();
            return;
        }
        throw C36331k8.A0d("companionRegistrationManager");
    }

    public RegisterAsCompanionEnterNumberActivity() {
        this(0);
        this.A07 = BnD(new C65673Ta(this, 0), new C009504a());
        this.A08 = BnD(new C65673Ta(this, 1), new C009504a());
    }
}
