package com.whatsapp.biz.catalog;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass17Y;
import X.AnonymousClass9Y1;
import X.C012005e;
import X.C196089Xp;
import X.C207269up;
import X.C20810yC;
import X.C20830yE;
import X.C24801Dv;
import X.C36331k8;
import X.C36381kD;
import X.C75693ne;
import X.C89704Xo;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

public final class CatalogMediaViewFragment extends Hilt_CatalogMediaViewFragment {
    public int A00;
    public C24801Dv A01;
    public AnonymousClass17Y A02;
    public C207269up A03;
    public AnonymousClass9Y1 A04;
    public C196089Xp A05;
    public C20830yE A06;
    public C20810yC A07;
    public UserJid A08;
    public String A09;

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        if (bundle == null) {
            C207269up r0 = this.A03;
            if (r0 == null) {
                throw C36331k8.A0d("product");
            }
            String str = r0.A0F;
            this.A09 = AnonymousClass000.A0r("_", AnonymousClass000.A0v(str), this.A00);
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                this.A0D = true;
                this.A0A.A0D(bundle2, this);
            }
        }
        this.A01.setVisibility(8);
        C012005e.A02(view, R.id.title_holder).setClickable(false);
    }

    public void A1H() {
        C196089Xp r0 = this.A05;
        if (r0 != null) {
            r0.A00();
            super.A1H();
            return;
        }
        throw C36331k8.A0d("loadSession");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A08 = UserJid.Companion.A02(bundle2.getString("cached_jid"));
            Parcelable parcelable = bundle2.getParcelable("product");
            if (parcelable != null) {
                this.A03 = (C207269up) parcelable;
                this.A00 = bundle2.getInt("target_image_index", 0);
                A1m(new C75693ne(this));
                this.A08.A0J(this.A00, false);
                this.A08.A0K(new C89704Xo(this, 0));
                return;
            }
            throw C36381kD.A0k();
        }
    }
}
