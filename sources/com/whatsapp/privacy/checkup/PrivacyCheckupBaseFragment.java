package com.whatsapp.privacy.checkup;

import X.AnonymousClass00C;
import X.AnonymousClass1NC;
import X.AnonymousClass2QP;
import X.AnonymousClass3PJ;
import X.C20810yC;
import X.C21010yW;
import X.C222013h;
import X.C33541fX;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C39151rK;
import X.C44642Oh;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;

public abstract class PrivacyCheckupBaseFragment extends Hilt_PrivacyCheckupBaseFragment {
    public AnonymousClass1NC A00;
    public C20810yC A01;
    public C21010yW A02;
    public AnonymousClass3PJ A03;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        int i2;
        int i3;
        int i4;
        Resources resources;
        AnonymousClass00C.A0D(view, 0);
        ImageView A0L = C36341k9.A0L(view, R.id.header_image);
        boolean z = this instanceof PrivacyCheckupMoreSecurityFragment;
        if (z) {
            i = R.drawable.vec_privacy_checkup_more_security_logo;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i = R.drawable.vec_privacy_chekcup_more_privacy_logo;
        } else if (this instanceof PrivacyCheckupHomeFragment) {
            boolean z2 = C222013h.A05;
            i = R.drawable.vec_privacy_checkup_home_logo;
            if (z2) {
                i = 0;
            }
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i = R.drawable.vec_privacy_checkup_contact_logo;
        } else {
            i = R.drawable.vec_privacy_checkup_audience_logo;
        }
        A0L.setImageResource(i);
        Context A1D = A1D();
        if (!(A1D == null || (resources = A1D.getResources()) == null || !C222013h.A07)) {
            C36361kB.A10(resources, A0L, R.dimen.f7nameremoved);
        }
        ViewGroup.LayoutParams layoutParams = A0L.getLayoutParams();
        Resources A0G = C36341k9.A0G(this);
        boolean z3 = this instanceof PrivacyCheckupHomeFragment;
        if (z3) {
            i2 = R.dimen.f7nameremoved;
        } else {
            i2 = R.dimen.f7nameremoved;
        }
        layoutParams.height = A0G.getDimensionPixelSize(i2);
        TextView A0M = C36341k9.A0M(view, R.id.title);
        if (z) {
            i3 = R.string.f12nameremoved;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i3 = R.string.f12nameremoved;
        } else if (z3) {
            i3 = R.string.f12nameremoved;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i3 = R.string.f12nameremoved;
        } else {
            i3 = R.string.f12nameremoved;
        }
        A0M.setText(i3);
        TextView A0M2 = C36341k9.A0M(view, R.id.description);
        if (z) {
            i4 = R.string.f12nameremoved;
        } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
            i4 = R.string.f12nameremoved;
        } else if (z3) {
            i4 = R.string.f12nameremoved;
        } else if (this instanceof PrivacyCheckupContactFragment) {
            i4 = R.string.f12nameremoved;
        } else {
            i4 = R.string.f12nameremoved;
        }
        A0M2.setText(i4);
        TextView A0M3 = C36341k9.A0M(view, R.id.footer);
        C36361kB.A1P(A0n(R.string.f12nameremoved), A0M3);
        if (z || (this instanceof PrivacyCheckupMorePrivacyFragment) || !z3) {
            A0M3.setVisibility(8);
        } else {
            A0M3.setVisibility(0);
        }
    }

    public final void A1b(View view, C33541fX r10, int i, int i2, int i3) {
        ((ViewGroup) C36361kB.A0G(view, R.id.setting_options)).addView(new C39151rK(A0a(), r10, i, i2, i3), 0);
    }

    public final void A1Z(int i, int i2) {
        C44642Oh r1 = new C44642Oh();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = Integer.valueOf(i);
        C21010yW r0 = this.A02;
        if (r0 != null) {
            r0.Blv(r1);
            return;
        }
        throw C36331k8.A0d("wamRuntime");
    }

    public final void A1a(int i, Integer num) {
        int i2;
        AnonymousClass3PJ r2 = this.A03;
        if (r2 != null) {
            if (this instanceof PrivacyCheckupMoreSecurityFragment) {
                i2 = 4;
            } else if (this instanceof PrivacyCheckupMorePrivacyFragment) {
                i2 = 3;
            } else if (this instanceof PrivacyCheckupHomeFragment) {
                i2 = 0;
            } else if (this instanceof PrivacyCheckupContactFragment) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            AnonymousClass2QP A002 = AnonymousClass3PJ.A00(Integer.valueOf(i2), num, i);
            A002.A00 = C36361kB.A0i();
            r2.A00.Blv(A002);
            return;
        }
        throw C36331k8.A0d("privacyCheckupWamEventHelper");
    }
}
