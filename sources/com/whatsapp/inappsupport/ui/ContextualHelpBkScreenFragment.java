package com.whatsapp.inappsupport.ui;

import X.AnonymousClass00C;
import X.AnonymousClass10B;
import X.AnonymousClass7T4;
import X.C012005e;
import X.C165177t0;
import X.C32691e2;
import X.C33751fs;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C63893Lv;
import X.C90494aF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public final class ContextualHelpBkScreenFragment extends Hilt_ContextualHelpBkScreenFragment {
    public FrameLayout A00;
    public ProgressBar A01;
    public C32691e2 A02;
    public C33751fs A03;

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
        C165177t0.A00(A0m(), ((SupportBkLayoutViewModel) this.A07).A02, new AnonymousClass7T4(this), 31);
        SupportBkLayoutViewModel supportBkLayoutViewModel = (SupportBkLayoutViewModel) this.A07;
        Bundle bundle2 = this.A0A;
        if (bundle2 == null || (str = bundle2.getString("screen_name")) == null) {
            str = "";
        }
        supportBkLayoutViewModel.A01 = str;
        ((SupportBkLayoutViewModel) this.A07).A00 = A00(this);
        super.A1S(bundle, view);
    }

    public static final String A00(ContextualHelpBkScreenFragment contextualHelpBkScreenFragment) {
        Serializable serializable;
        Bundle bundle = contextualHelpBkScreenFragment.A0A;
        if (!(bundle == null || bundle.getSerializable("screen_params") == null)) {
            Bundle bundle2 = contextualHelpBkScreenFragment.A0A;
            if (bundle2 != null) {
                serializable = bundle2.getSerializable("screen_params");
            } else {
                serializable = null;
            }
            C90494aF.A10(serializable);
            try {
                JSONObject A1C = C36441kJ.A1C((String) serializable);
                if (!A1C.has("params")) {
                    return null;
                }
                JSONObject jSONObject = A1C.getJSONObject("params");
                if (!jSONObject.has("server_params")) {
                    return null;
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("server_params");
                AnonymousClass00C.A0B(jSONObject2);
                AnonymousClass00C.A0D(jSONObject2, 0);
                return C63893Lv.A00("entrypointid", jSONObject2, false);
            } catch (JSONException e) {
                Log.e("ContextualHelpBkScreenFragment/getEntryPointId", e);
            }
        }
        return null;
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
            Log.e("ContextualHelpBkScreenFragment/so loader init failed", e);
        }
    }
}
