package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00C;
import X.AnonymousClass10B;
import X.AnonymousClass1CF;
import X.AnonymousClass3DY;
import X.AnonymousClass3UV;
import X.AnonymousClass7T5;
import X.C012005e;
import X.C130996Nh;
import X.C165177t0;
import X.C19600wD;
import X.C19770wU;
import X.C20830yE;
import X.C21060yb;
import X.C32691e2;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;

public final class SupportBkScreenFragment extends Hilt_SupportBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C32691e2 A02;
    public AnonymousClass3DY A03;
    public C130996Nh A04;
    public C19600wD A05;
    public C21060yb A06;
    public C20830yE A07;
    public AnonymousClass1CF A08;
    public AnonymousClass3UV A09;
    public C19770wU A0A;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        AnonymousClass00C.A0D(view, 0);
        this.A01 = (ProgressBar) C012005e.A02(view, R.id.bloks_dialogfragment_progressbar);
        FrameLayout A0T = C36441kJ.A0T(view, R.id.bloks_dialogfragment);
        this.A00 = A0T;
        C36331k8.A0y(A0T);
        C36361kB.A14(this.A01);
        C165177t0.A00(A0m(), ((SupportBkLayoutViewModel) this.A07).A02, new AnonymousClass7T5(this), 32);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A07;
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
        super.A1S(bundle, view);
    }

    public void A1a() {
        C36331k8.A0y(this.A01);
        C36361kB.A14(this.A00);
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
        ((SupportBkLayoutViewModel) this.A07).A02.A07(A0m());
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        try {
            AnonymousClass10B.A00(A0i().getApplicationContext());
        } catch (IOException e) {
            Log.e("SupportBkScreenFragment/so loader init failed", e);
        }
    }
}
