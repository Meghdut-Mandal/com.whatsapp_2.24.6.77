package com.whatsapp.wabloks.base;

import X.AnonymousClass000;
import X.AnonymousClass01L;
import X.AnonymousClass10B;
import X.AnonymousClass60P;
import X.AnonymousClass65A;
import X.AnonymousClass66C;
import X.C116645kv;
import X.C1265064h;
import X.C130996Nh;
import X.C159757js;
import X.C165207t3;
import X.C36341k9;
import X.C36361kB;
import X.C36441kJ;
import X.C90474aD;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragment extends Hilt_BkScreenFragment implements C159757js {
    public AnonymousClass60P A00;
    public AnonymousClass66C A01;
    public C130996Nh A02;
    public C1265064h A03;
    public Map A04;
    public boolean A05 = false;
    public FrameLayout A06;
    public FrameLayout A07;

    public void A1e() {
        C36341k9.A0y(this.A07);
        FrameLayout frameLayout = this.A06;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public void A1f() {
        C36341k9.A0y(this.A06);
        boolean equals = "com.bloks.www.whatsapp.galaxy.flow.v2".equals(A0b().getString("screen_name", (String) null));
        FrameLayout frameLayout = this.A07;
        if ((equals ^ true) && AnonymousClass000.A1V(frameLayout)) {
            if (!this.A05) {
                C90474aD.A0z(frameLayout);
            }
            this.A07.setVisibility(0);
        }
    }

    public AnonymousClass65A BJB() {
        return this.A00.A00((AnonymousClass01L) A0h(), A0l(), new C116645kv(this.A04));
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A07;
        genericBkLayoutViewModel.A0S();
        genericBkLayoutViewModel.A01.A07(A0m());
        this.A07 = null;
        this.A06 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        try {
            AnonymousClass10B.A00(A0i().getApplicationContext());
        } catch (IOException unused) {
        }
    }

    public void A1S(Bundle bundle, View view) {
        this.A07 = C36441kJ.A0T(view, R.id.bloks_dialogfragment_progressbar);
        this.A06 = C36441kJ.A0T(view, R.id.bloks_dialogfragment);
        A1f();
        GenericBkLayoutViewModel genericBkLayoutViewModel = (GenericBkLayoutViewModel) this.A07;
        genericBkLayoutViewModel.A0S();
        genericBkLayoutViewModel.A01.A08(A0m(), new C165207t3(this, 7));
        super.A1S(bundle, view);
    }

    public void A1a() {
        A1e();
        Bundle bundle = this.A0A;
        if (bundle != null) {
            this.A02.A01(bundle.getString("qpl_params"));
        }
    }

    public C1265064h B8t() {
        return this.A03;
    }
}
