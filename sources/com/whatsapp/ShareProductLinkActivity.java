package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass1N6;
import X.AnonymousClass22c;
import X.AnonymousClass23r;
import X.AnonymousClass23s;
import X.AnonymousClass23t;
import X.AnonymousClass3U8;
import X.AnonymousClass9Y1;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C89314Wb;
import X.C90214Zn;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.biz.catalog.viewmodel.ShareProductViewModel;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

public final class ShareProductLinkActivity extends AnonymousClass22c {
    public AnonymousClass9Y1 A00;
    public ShareProductViewModel A01;
    public AnonymousClass1N6 A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass9Y1) A0B.A1R.get();
            this.A02 = C36361kB.A0e(A0B);
        }
    }

    public void A2X() {
        AnonymousClass1N6 r3 = this.A02;
        if (r3 != null) {
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r3.A03((AnonymousClass11F) null, 42);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public boolean A2g() {
        return this.A0D.A0E(6547);
    }

    public final AnonymousClass9Y1 A3p() {
        AnonymousClass9Y1 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("catalogAnalyticManager");
    }

    public ShareProductLinkActivity(int i) {
        this.A03 = false;
        C89314Wb.A00(this, 7);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        A3m();
        UserJid A022 = UserJid.Companion.A02(C36341k9.A0d(this));
        C18740tg.A06(A022);
        if (!(A022 instanceof PhoneUserJid)) {
            Log.e("share-product-link-activity/invalid-jid");
            finish();
            return;
        }
        this.A01 = (ShareProductViewModel) C36441kJ.A0b(this).A00(ShareProductViewModel.class);
        String stringExtra = getIntent().getStringExtra("product_id");
        C18740tg.A06(stringExtra);
        String format = String.format("%s/p/%s/%s", Arrays.copyOf(new Object[]{"https://wa.me", stringExtra, AnonymousClass3U8.A06(A022)}, 3));
        AnonymousClass00C.A08(format);
        setTitle(R.string.f12nameremoved);
        TextView textView = this.A01;
        if (textView != null) {
            textView.setText(format);
        }
        C36391kE.A0Q(this, R.id.share_link_description).setText(R.string.f12nameremoved);
        if (C36431kI.A1V(this, A022)) {
            str = C36351kA.A0w(this, format, 1, R.string.f12nameremoved);
        } else {
            str = format;
        }
        AnonymousClass00C.A0B(str);
        AnonymousClass23s A3l = A3l();
        A3l.A00 = str;
        A3l.A01 = new C90214Zn(this, A022, stringExtra, 1);
        AnonymousClass23r A3j = A3j();
        A3j.A00 = format;
        A3j.A01 = new C90214Zn(this, A022, stringExtra, 0);
        AnonymousClass23t A3k = A3k();
        A3k.A02 = str;
        A3k.A00 = getString(R.string.f12nameremoved);
        A3k.A01 = getString(R.string.f12nameremoved);
        A3k.A01 = new C90214Zn(this, A022, stringExtra, 2);
    }

    public ShareProductLinkActivity() {
        this(0);
    }
}
