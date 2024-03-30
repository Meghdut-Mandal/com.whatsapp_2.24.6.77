package com.whatsapp.biz;

import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16A;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass1A5;
import X.AnonymousClass1KK;
import X.AnonymousClass1KL;
import X.AnonymousClass1QW;
import X.AnonymousClass2XH;
import X.AnonymousClass3TW;
import X.B78;
import X.B79;
import X.B7E;
import X.B7Y;
import X.BAG;
import X.BAP;
import X.C165567td;
import X.C165587tf;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19730wQ;
import X.C201549jr;
import X.C206949uI;
import X.C226815j;
import X.C233117z;
import X.C24361Cd;
import X.C24511Cs;
import X.C24801Dv;
import X.C26421Kc;
import X.C32001cn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36431kI;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class BusinessProfileExtraFieldsActivity extends AnonymousClass155 {
    public AnonymousClass3TW A00;
    public AnonymousClass1KK A01;
    public C26421Kc A02;
    public AnonymousClass1KL A03;
    public C201549jr A04;
    public C24361Cd A05;
    public AnonymousClass16I A06;
    public AnonymousClass171 A07;
    public C18820ts A08;
    public AnonymousClass1A5 A09;
    public C233117z A0A;
    public UserJid A0B;
    public AnonymousClass2XH A0C;
    public AnonymousClass1QW A0D;
    public AnonymousClass141 A0E;
    public Integer A0F;
    public boolean A0G;
    public final AnonymousClass16A A0H;
    public final C32001cn A0I;
    public final C226815j A0J;
    public final C24511Cs A0K;

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C165567td.A11(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C165567td.A0v(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0C = (AnonymousClass2XH) A0B2.A4W.get();
            this.A07 = C36341k9.A0S(A0B2);
            this.A08 = C36341k9.A0T(A0B2);
            this.A06 = C165587tf.A0M(A0B2);
            this.A05 = (C24361Cd) A0B2.A1j.get();
            this.A03 = (AnonymousClass1KL) A0B2.A1B.get();
            this.A01 = C165587tf.A0L(A0B2);
            this.A0D = (AnonymousClass1QW) r1.A0Z.get();
            this.A02 = (C26421Kc) A0B2.A1A.get();
            this.A09 = (AnonymousClass1A5) A0B2.A2K.get();
            this.A0A = (C233117z) A0B2.A3w.get();
            this.A04 = (C201549jr) r1.A0e.get();
        }
    }

    public void A3i() {
        AnonymousClass141 A012 = this.A09.A01(this.A0B);
        this.A0E = A012;
        setTitle(this.A07.A0H(A012));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A0l = C36431kI.A0l(C36341k9.A0d(this));
        C18740tg.A06(A0l);
        this.A0B = A0l;
        int intExtra = getIntent().getIntExtra("profile_entry_point", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        this.A0F = valueOf;
        if (intExtra == -1) {
            valueOf = null;
        }
        this.A0F = valueOf;
        A3i();
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        C19730wQ r4 = this.A02;
        C24801Dv r2 = this.A01;
        AnonymousClass2XH r11 = this.A0C;
        AnonymousClass171 r8 = this.A07;
        C18820ts r9 = this.A08;
        AnonymousClass1KL r5 = this.A03;
        AnonymousClass1QW r12 = this.A0D;
        this.A00 = new AnonymousClass3TW(this.A00, r2, this, r4, r5, this.A04, (C206949uI) null, r8, r9, this.A0E, r11, r12, this.A0F, true, false);
        BAG.A00(this.A01, this.A0B, this, 0);
        this.A06.registerObserver(this.A0J);
        this.A05.registerObserver(this.A0I);
        this.A02.registerObserver(this.A0H);
        this.A0A.registerObserver(this.A0K);
    }

    public BusinessProfileExtraFieldsActivity(int i) {
        this.A0G = false;
        B7Y.A00(this, 2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A06.unregisterObserver(this.A0J);
        this.A05.unregisterObserver(this.A0I);
        this.A02.unregisterObserver(this.A0H);
        this.A0A.unregisterObserver(this.A0K);
    }

    public BusinessProfileExtraFieldsActivity() {
        this(0);
        this.A0J = new B79(this, 0);
        this.A0I = new B78(this, 1);
        this.A0K = new B7E(this, 1);
        this.A0H = new BAP(this, 0);
    }
}
