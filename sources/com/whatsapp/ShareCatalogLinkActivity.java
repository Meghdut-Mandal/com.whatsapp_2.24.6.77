package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass1N6;
import X.AnonymousClass22c;
import X.AnonymousClass23r;
import X.AnonymousClass23s;
import X.AnonymousClass23t;
import X.AnonymousClass9Y1;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C19970wo;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C89314Wb;
import X.C90084Za;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public final class ShareCatalogLinkActivity extends AnonymousClass22c {
    public C19460v5 A00;
    public AnonymousClass9Y1 A01;
    public AnonymousClass1N6 A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A01 = (AnonymousClass9Y1) A0B.A1R.get();
            this.A02 = C36361kB.A0e(A0B);
            this.A00 = C19470v6.A00;
        }
    }

    public void A2X() {
        AnonymousClass1N6 r3 = this.A02;
        if (r3 != null) {
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r3.A03((AnonymousClass11F) null, 41);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public boolean A2g() {
        return this.A0D.A0E(6547);
    }

    public final AnonymousClass9Y1 A3p() {
        AnonymousClass9Y1 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("catalogAnalyticManager");
    }

    public ShareCatalogLinkActivity(int i) {
        this.A03 = false;
        C89314Wb.A00(this, 5);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A3m();
        C19460v5 r1 = this.A00;
        if (r1 == null) {
            throw C36331k8.A0d("smbEducationBannerHelper");
        } else if (r1.A05()) {
            r1.A02();
            C19970wo.A00(this.A07);
            throw AnonymousClass001.A0A("markRetired");
        } else {
            UserJid A022 = UserJid.Companion.A02(C36341k9.A0d(this));
            C18740tg.A06(A022);
            String format = String.format("%s/c/%s", Arrays.copyOf(new Object[]{"https://wa.me", A022.user}, 2));
            AnonymousClass00C.A08(format);
            setTitle(R.string.f12nameremoved);
            TextView textView = this.A01;
            if (textView != null) {
                textView.setText(format);
            }
            View findViewById = findViewById(R.id.share_link_description);
            AnonymousClass00C.A0E(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) findViewById).setText(R.string.f12nameremoved);
            if (C36431kI.A1V(this, A022)) {
                str = C36351kA.A0w(this, format, 1, R.string.f12nameremoved);
            } else {
                str = format;
            }
            AnonymousClass00C.A0B(str);
            AnonymousClass23s A3l = A3l();
            A3l.A00 = str;
            A3l.A01 = new C90084Za(this, A022, 0);
            AnonymousClass23r A3j = A3j();
            A3j.A00 = format;
            A3j.A01 = new C90084Za(this, A022, 2);
            AnonymousClass23t A3k = A3k();
            A3k.A02 = str;
            A3k.A00 = getString(R.string.f12nameremoved);
            A3k.A01 = getString(R.string.f12nameremoved);
            A3k.A01 = new C90084Za(this, A022, 1);
        }
    }

    public ShareCatalogLinkActivity() {
        this(0);
    }
}
