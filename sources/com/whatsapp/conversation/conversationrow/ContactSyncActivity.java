package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass155;
import X.AnonymousClass19A;
import X.AnonymousClass3L4;
import X.AnonymousClass3M9;
import X.AnonymousClass3QX;
import X.C107115Mp;
import X.C131626Pu;
import X.C160027kL;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C21159AAt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C88774Tz;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public class ContactSyncActivity extends AnonymousClass155 implements C160027kL, C88774Tz {
    public AnonymousClass3QX A00;
    public C21159AAt A01;
    public AnonymousClass19A A02;
    public C107115Mp A03;
    public UserJid A04;
    public boolean A05;

    public void BVh(int i) {
    }

    public void BVi(int i) {
    }

    public void BVj(int i) {
        if (i == 1 || i == 2) {
            finish();
        }
    }

    public void Be0() {
        this.A03 = null;
        Bnv();
    }

    public void Bio(C131626Pu r6) {
        int i;
        String str;
        this.A03 = null;
        Bnv();
        if (r6 != null) {
            if (r6.A00()) {
                finish();
                AnonymousClass3QX r0 = this.A00;
                Intent A1W = C36441kJ.A0j().A1W(this, r0.A02.A0D(this.A04));
                AnonymousClass3M9.A01(A1W, "ShareContactUtil");
                startActivity(A1W);
                return;
            } else if (r6.A00 == 0) {
                i = 1;
                str = getString(R.string.f12nameremoved);
                AnonymousClass3L4 r3 = new AnonymousClass3L4(i);
                Bundle bundle = r3.A00;
                bundle.putCharSequence("message", str);
                r3.A02(false);
                bundle.putString("positive_button", getString(R.string.f12nameremoved));
                C36381kD.A1F(r3.A00(), getSupportFragmentManager(), (String) null);
            }
        }
        i = 2;
        str = getString(R.string.f12nameremoved);
        AnonymousClass3L4 r32 = new AnonymousClass3L4(i);
        Bundle bundle2 = r32.A00;
        bundle2.putCharSequence("message", str);
        r32.A02(false);
        bundle2.putString("positive_button", getString(R.string.f12nameremoved));
        C36381kD.A1F(r32.A00(), getSupportFragmentManager(), (String) null);
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = C36361kB.A0c(A0B);
            this.A01 = C36411kG.A0b(A0B);
            this.A00 = (AnonymousClass3QX) r1.ACH.get();
        }
    }

    public ContactSyncActivity(int i) {
        this.A05 = false;
        C89324Wc.A00(this, 43);
    }

    public void Bip() {
        A3G(getString(R.string.f12nameremoved));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserJid A0l = C36431kI.A0l(getIntent().getStringExtra("user_jid"));
        C18740tg.A06(A0l);
        this.A04 = A0l;
        if (!C36431kI.A1R(this)) {
            AnonymousClass3L4 r3 = new AnonymousClass3L4(1);
            String string = getString(R.string.f12nameremoved);
            Bundle bundle2 = r3.A00;
            bundle2.putCharSequence("message", string);
            r3.A02(false);
            bundle2.putString("positive_button", getString(R.string.f12nameremoved));
            C36331k8.A12(r3.A00(), this);
            return;
        }
        C107115Mp r0 = this.A03;
        if (r0 != null) {
            r0.A0D(true);
        }
        C107115Mp r1 = new C107115Mp(this.A01, this, this.A04, this.A02);
        this.A03 = r1;
        C36391kE.A1Q(r1, this.A04);
    }

    public void onDestroy() {
        super.onDestroy();
        C107115Mp r1 = this.A03;
        if (r1 != null) {
            r1.A0D(true);
            this.A03 = null;
        }
    }

    public ContactSyncActivity() {
        this(0);
    }
}
