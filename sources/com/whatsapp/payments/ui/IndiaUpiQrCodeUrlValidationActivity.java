package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass11F;
import X.AnonymousClass3DI;
import X.AnonymousClass3LW;
import X.AnonymousClass3SJ;
import X.AnonymousClass9OF;
import X.AnonymousClass9c5;
import X.B6s;
import X.B7Z;
import X.B84;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165617ti;
import X.C167757yl;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C197639c2;
import X.C202939my;
import X.C23186B8u;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C39001qm;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.whatsapp.R;

public class IndiaUpiQrCodeUrlValidationActivity extends C179128jE {
    public C18820ts A00;
    public AnonymousClass11F A01;
    public AnonymousClass3DI A02;
    public C202939my A03;
    public AnonymousClass9OF A04;
    public C197639c2 A05;
    public C167757yl A06;
    public AnonymousClass9c5 A07;
    public String A08;
    public boolean A09;

    public void A2F() {
        if (!this.A09) {
            this.A09 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A05 = (C197639c2) r1.A9F.get();
            this.A00 = C36341k9.A0T(r2);
            this.A07 = (AnonymousClass9c5) r1.A7P.get();
            this.A04 = (AnonymousClass9OF) r1.A93.get();
            this.A03 = r1.A7n();
            this.A02 = C27111My.A2n(A0L);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 100) {
            AnonymousClass3SJ.A01(this, 25);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public Dialog onCreateDialog(int i) {
        C39001qm r3;
        int i2;
        int i3;
        if (i == 21) {
            r3 = AnonymousClass3LW.A00(this);
            r3.A0p(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
            i2 = R.string.f12nameremoved;
            i3 = 23;
        } else if (i == 22) {
            r3 = AnonymousClass3LW.A00(this);
            r3.A0p(C36341k9.A0e(this, new Object[1], R.string.f12nameremoved, 0, R.string.f12nameremoved));
            i2 = R.string.f12nameremoved;
            i3 = 24;
        } else if (i == 40) {
            r3 = AnonymousClass3LW.A00(this);
            C165587tf.A0t(this, r3, new Object[]{this.A08}, R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
            i3 = 21;
        } else if (i != 41) {
            switch (i) {
                case 24:
                    r3 = AnonymousClass3LW.A00(this);
                    r3.A0d(R.string.f12nameremoved);
                    r3.A0c(R.string.f12nameremoved);
                    B84.A00(r3, this, 25, R.string.f12nameremoved);
                    B84.A01(r3, this, 26, R.string.f12nameremoved);
                    r3.A0r(true);
                    break;
                case 25:
                    Uri parse = Uri.parse(this.A06.A0S().A0F);
                    String string = getString(R.string.f12nameremoved);
                    String obj = parse.toString();
                    int length = obj.length();
                    if (length > 96) {
                        StringBuilder A0u = AnonymousClass000.A0u();
                        C165577te.A1O(obj, A0u, 0, 64);
                        A0u.append("…");
                        obj = AnonymousClass000.A0q(obj.substring(length - 32), A0u);
                    }
                    SpannableString spannableString = new SpannableString(obj);
                    Linkify.addLinks(spannableString, 1);
                    r3 = AnonymousClass3LW.A01(this, R.style.f13nameremoved);
                    r3.A0q(string);
                    r3.A0p(spannableString);
                    r3.setNegativeButton(R.string.f12nameremoved, new B84(this, 27));
                    r3.setPositiveButton(R.string.f12nameremoved, new B84(this, 28));
                    r3.A0a(true);
                    r3.A0V(new C23186B8u(this, 16));
                    break;
                case 26:
                    r3 = AnonymousClass3LW.A00(this);
                    C165587tf.A0t(this, r3, new Object[]{this.A08}, R.string.f12nameremoved);
                    i2 = R.string.f12nameremoved;
                    i3 = 29;
                    break;
                default:
                    return super.onCreateDialog(i);
            }
        } else {
            r3 = AnonymousClass3LW.A00(this);
            C165587tf.A0t(this, r3, new Object[]{this.A08}, R.string.f12nameremoved);
            i2 = R.string.f12nameremoved;
            i3 = 22;
        }
        B84.A00(r3, this, i3, i2);
        r3.A0r(false);
        return r3.create();
    }

    public IndiaUpiQrCodeUrlValidationActivity(int i) {
        this.A09 = false;
        B7Z.A00(this, 38);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = C36401kF.A0Z(getIntent(), "ARG_JID");
        this.A06 = (C167757yl) C165617ti.A0A(new B6s(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"), 1), this).A00(C167757yl.class);
    }

    public IndiaUpiQrCodeUrlValidationActivity() {
        this(0);
    }
}
