package com.whatsapp.newsletter.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass012;
import X.AnonymousClass01P;
import X.AnonymousClass098;
import X.AnonymousClass15K;
import X.AnonymousClass16J;
import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass1A5;
import X.AnonymousClass22c;
import X.AnonymousClass23r;
import X.AnonymousClass23s;
import X.AnonymousClass23t;
import X.AnonymousClass3OM;
import X.AnonymousClass3ZU;
import X.AnonymousClass60O;
import X.AnonymousClass9v5;
import X.C000800j;
import X.C001400p;
import X.C161947nj;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C21060yb;
import X.C220412q;
import X.C27111My;
import X.C28981Uw;
import X.C32241dD;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C44072La;
import X.C52512pY;
import X.C61413Bt;
import X.C65073Qp;
import X.C84204Ci;
import X.C89344We;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class ShareNewsletterInviteLinkActivity extends AnonymousClass22c implements AnonymousClass15K, C161947nj {
    public AnonymousClass60O A00;
    public C61413Bt A01;
    public AnonymousClass171 A02;
    public C220412q A03;
    public AnonymousClass1A5 A04;
    public AnonymousClass16J A05;
    public AnonymousClass190 A06;
    public C28981Uw A07;
    public C52512pY A08;
    public C32241dD A09;
    public AnonymousClass005 A0A;
    public AnonymousClass23r A0B;
    public AnonymousClass23t A0C;
    public AnonymousClass23s A0D;
    public AnonymousClass23s A0E;
    public C44072La A0F;
    public boolean A0G;
    public final AnonymousClass00T A0H;

    public void A3n(AnonymousClass23t r6) {
        AnonymousClass00C.A0D(r6, 0);
        C32241dD r4 = this.A09;
        if (r4 != null) {
            C28981Uw r3 = this.A07;
            if (r3 == null) {
                throw C36331k8.A0d("jid");
            }
            r4.A08(r3, this.A08, 3, 4);
            super.A3n(r6);
            return;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public void A3o(AnonymousClass23s r7) {
        AnonymousClass00C.A0D(r7, 0);
        Log.i("sharenewsletterinvitelinkactivity/shareviawhatsapp/");
        C32241dD r5 = this.A09;
        if (r5 != null) {
            C28981Uw r2 = this.A07;
            if (r2 == null) {
                throw C36331k8.A0d("jid");
            }
            r5.A08(r2, this.A08, 1, 4);
            if (this.A0D.A0E(6445)) {
                String str = r7.A00;
                if (str == null) {
                    return;
                }
                if (this.A06 != null) {
                    AnonymousClass3OM r1 = new AnonymousClass3OM(this);
                    r1.A0Y = "text/plain";
                    r1.A0X = str;
                    C28981Uw r0 = this.A07;
                    if (r0 == null) {
                        throw C36331k8.A0d("jid");
                    }
                    r1.A02 = r0;
                    r1.A06 = true;
                    startActivityForResult(AnonymousClass3OM.A00(r1), 1);
                    return;
                }
                throw C36331k8.A0X();
            }
            super.A3o(r7);
            return;
        }
        throw C36331k8.A0d("newsletterLogging");
    }

    public String BCV() {
        return "newsletter_link_activity";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        View view = this.A00;
        ArrayList A13 = C36411kG.A13(view);
        C21060yb r3 = this.A08;
        AnonymousClass00C.A07(r3);
        return new AnonymousClass3ZU(view, (AnonymousClass012) this, r3, (List) A13, i, i2, z);
    }

    public void Bal(ArrayList arrayList) {
    }

    private final void A01() {
        C44072La r0 = this.A0F;
        if (r0 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        String str = r0.A0J;
        if (str == null || AnonymousClass098.A06(str)) {
            A07(false);
            this.A01.setText(" \n ");
            return;
        }
        String A0p = AnonymousClass000.A0p("https://whatsapp.com/channel/", str, AnonymousClass000.A0u());
        this.A01.setText(A0p);
        C36321k7.A0M(this, this.A01, R.attr.f4nameremoved, R.color.f6nameremoved);
        Object[] A0M = AnonymousClass001.A0M();
        C44072La r02 = this.A0F;
        if (r02 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        A0M[0] = r02.A0K;
        String A0x = C36351kA.A0x(this, str, A0M, 1, R.string.f12nameremoved);
        AnonymousClass23t r3 = this.A0C;
        if (r3 == null) {
            throw C36331k8.A0d("shareBtn");
        }
        r3.A02 = A0x;
        Object[] objArr = new Object[1];
        C44072La r03 = this.A0F;
        if (r03 == null) {
            throw C36331k8.A0d("newsletterInfo");
        }
        r3.A01 = C36391kE.A0v(this, r03.A0K, objArr, 0, R.string.f12nameremoved);
        r3.A00 = getString(R.string.f12nameremoved);
        AnonymousClass23s r04 = this.A0D;
        if (r04 == null) {
            throw C36331k8.A0d("sendViaWhatsAppBtn");
        }
        r04.A00 = A0x;
        AnonymousClass23s r05 = this.A0E;
        if (r05 == null) {
            throw C36331k8.A0d("shareToStatusBtn");
        }
        r05.A00 = A0x;
        AnonymousClass23r r06 = this.A0B;
        if (r06 == null) {
            throw C36331k8.A0d("copyBtn");
        }
        r06.A00 = A0p;
    }

    private final void A07(boolean z) {
        this.A01.setEnabled(z);
        AnonymousClass23r r0 = this.A0B;
        if (r0 == null) {
            throw C36331k8.A0d("copyBtn");
        }
        r0.A00.setEnabled(z);
        AnonymousClass23t r02 = this.A0C;
        if (r02 == null) {
            throw C36331k8.A0d("shareBtn");
        }
        r02.A00.setEnabled(z);
        AnonymousClass23s r03 = this.A0D;
        if (r03 == null) {
            throw C36331k8.A0d("sendViaWhatsAppBtn");
        }
        r03.A00.setEnabled(z);
    }

    public void A2F() {
        if (!this.A0G) {
            this.A0G = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A06 = C36351kA.A0h(r2);
            this.A03 = C36351kA.A0a(r2);
            this.A02 = C36341k9.A0S(r2);
            this.A05 = C36361kB.A0Z(r2);
            this.A09 = C36431kI.A0n(r2);
            this.A04 = C36371kC.A0X(r2);
            this.A0A = C18840tu.A00(r1.AAG);
            this.A00 = (AnonymousClass60O) A0L.A3J.get();
            this.A01 = (C61413Bt) A0L.A0V.get();
        }
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A06.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public void onDestroy() {
        AnonymousClass16J r1 = this.A05;
        if (r1 != null) {
            C36411kG.A1I(r1, this.A0H);
            super.onDestroy();
            return;
        }
        throw C36331k8.A0d("messageObservers");
    }

    public ShareNewsletterInviteLinkActivity(int i) {
        this.A0G = false;
        C89344We.A00(this, 20);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1 && intent != null) {
            Bvu(C36341k9.A0k(intent));
        }
    }

    public void onCreate(Bundle bundle) {
        C52512pY r1;
        super.onCreate(bundle);
        C28981Uw A012 = C28981Uw.A03.A01(getIntent().getStringExtra("jid"));
        if (A012 == null) {
            finish();
            return;
        }
        this.A07 = A012;
        setTitle(R.string.f12nameremoved);
        A3m();
        int intExtra = getIntent().getIntExtra("entry_point", 0);
        C52512pY[] values = C52512pY.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                r1 = null;
                break;
            }
            r1 = values[i];
            if (r1.value == intExtra) {
                break;
            }
            i++;
        }
        this.A08 = r1;
        C220412q r12 = this.A03;
        if (r12 != null) {
            C28981Uw r0 = this.A07;
            if (r0 == null) {
                throw C36331k8.A0d("jid");
            }
            C65073Qp A092 = r12.A09(r0, false);
            AnonymousClass00C.A0E(A092, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            this.A0F = (C44072La) A092;
            this.A0D = A3l();
            AnonymousClass23s r4 = new AnonymousClass23s();
            r4.A00 = A3i();
            r4.A00(new AnonymousClass9v5((Object) this, (Object) r4, 7), getString(R.string.f12nameremoved), R.drawable.ic_add_to_status);
            this.A0E = r4;
            this.A0B = A3j();
            this.A0C = A3k();
            ((TextView) C36361kB.A0H(this, R.id.share_link_description)).setText(R.string.f12nameremoved);
            A07(true);
            A2C(false);
            A01();
            AnonymousClass16J r13 = this.A05;
            if (r13 != null) {
                r13.registerObserver(this.A0H.getValue());
                return;
            }
            throw C36331k8.A0d("messageObservers");
        }
        throw C36331k8.A0d("chatsCache");
    }

    public void onResume() {
        super.onResume();
        A01();
    }

    public ShareNewsletterInviteLinkActivity() {
        this(0);
        this.A0H = C001400p.A00(C000800j.NONE, new C84204Ci(this));
    }
}
