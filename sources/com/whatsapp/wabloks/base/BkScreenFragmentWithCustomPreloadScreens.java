package com.whatsapp.wabloks.base;

import X.AnonymousClass005;
import X.AnonymousClass01L;
import X.AnonymousClass10B;
import X.AnonymousClass5OB;
import X.AnonymousClass5OC;
import X.AnonymousClass60P;
import X.AnonymousClass65A;
import X.AnonymousClass66C;
import X.C116645kv;
import X.C1265064h;
import X.C130996Nh;
import X.C1494871k;
import X.C159757js;
import X.C165207t3;
import X.C36361kB;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.R;
import java.io.IOException;
import java.util.Map;

public class BkScreenFragmentWithCustomPreloadScreens extends Hilt_BkScreenFragmentWithCustomPreloadScreens implements C159757js {
    public FrameLayout A00;
    public FrameLayout A01;
    public AnonymousClass60P A02;
    public AnonymousClass66C A03;
    public C130996Nh A04;
    public C1265064h A05;
    public Map A06;
    public Map A07;
    public final AnonymousClass005 A08 = C1494871k.A00;

    public void A1a() {
        ((GenericBkLayoutViewModelWithReload) this.A07).A01.A0D(AnonymousClass5OC.A00);
        Bundle bundle = this.A0A;
        if (bundle != null) {
            this.A04.A01(bundle.getString("qpl_params"));
        }
    }

    public AnonymousClass65A BJB() {
        return this.A02.A00((AnonymousClass01L) A0h(), A0l(), new C116645kv(this.A06));
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        ((GenericBkLayoutViewModelWithReload) this.A07).A01.A07(A0m());
        this.A01 = null;
        this.A00 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        try {
            AnonymousClass10B.A00(A0i().getApplicationContext());
        } catch (IOException unused) {
        }
    }

    public void A1S(Bundle bundle, View view) {
        this.A01 = C36441kJ.A0T(view, R.id.pre_load_container);
        this.A00 = C36441kJ.A0T(view, R.id.bloks_dialogfragment);
        ((GenericBkLayoutViewModelWithReload) this.A07).A01.A0D(AnonymousClass5OB.A00);
        ((GenericBkLayoutViewModelWithReload) this.A07).A01.A08(A0m(), new C165207t3(this, 8));
        super.A1S(bundle, view);
    }

    public C1265064h B8t() {
        return this.A05;
    }
}
