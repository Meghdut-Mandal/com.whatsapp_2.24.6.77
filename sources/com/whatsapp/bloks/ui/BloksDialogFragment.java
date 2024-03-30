package com.whatsapp.bloks.ui;

import X.AnonymousClass001;
import X.AnonymousClass01L;
import X.AnonymousClass1N2;
import X.AnonymousClass30X;
import X.AnonymousClass60P;
import X.AnonymousClass65A;
import X.AnonymousClass6PY;
import X.C116645kv;
import X.C116735l4;
import X.C116745l5;
import X.C36361kB;
import X.C36431kI;
import X.C92084d6;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.Map;

public class BloksDialogFragment extends Hilt_BloksDialogFragment {
    public AnonymousClass60P A00;
    public AnonymousClass65A A01;
    public AnonymousClass30X A02;
    public C116745l5 A03;
    public C92084d6 A04;
    public AnonymousClass1N2 A05;
    public Boolean A06;
    public Map A07;
    public View A08;
    public FrameLayout A09;
    public C116735l4 A0A;

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A01 = this.A00.A00((AnonymousClass01L) A0i(), A0l(), new C116645kv(this.A07));
        C92084d6 r2 = this.A04;
        AnonymousClass01L r4 = (AnonymousClass01L) A0h();
        A1D();
        r2.A01(A0b(), r4, this, this.A01, this, this.A02, C36431kI.A17(A0b(), "screen_name"), (HashMap) A0b().getSerializable("screen_params"));
    }

    public static BloksDialogFragment A03(String str, HashMap hashMap) {
        BloksDialogFragment bloksDialogFragment = new BloksDialogFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("screen_name", str);
        A072.putSerializable("screen_params", hashMap);
        A072.putBoolean("hot_reload", false);
        bloksDialogFragment.A17(A072);
        return bloksDialogFragment;
    }

    public void A1S(Bundle bundle, View view) {
        C116735l4 r0 = new C116735l4(view);
        this.A0A = r0;
        this.A04.A01 = (RootHostView) r0.A00.findViewById(R.id.bloks_container);
        this.A08 = view.findViewById(R.id.bloks_dialogfragment_progressbar);
        this.A09 = (FrameLayout) view.findViewById(R.id.bloks_dialogfragment);
        this.A04.A00();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1J() {
        super.A1J();
        C92084d6 r2 = this.A04;
        r2.A01 = null;
        AnonymousClass6PY r0 = r2.A02;
        if (r0 != null) {
            r0.A02();
            r2.A02 = null;
        }
        this.A09 = null;
        this.A0A = null;
        this.A08 = null;
    }

    public void A1K() {
        super.A1K();
        View currentFocus = A0i().getCurrentFocus();
        if (currentFocus != null) {
            this.A05.A01(currentFocus);
        }
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        A1a.setCanceledOnTouchOutside(false);
        Window window = A1a.getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        return A1a;
    }
}
