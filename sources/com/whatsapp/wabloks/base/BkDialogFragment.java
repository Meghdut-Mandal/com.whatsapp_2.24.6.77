package com.whatsapp.wabloks.base;

import X.AnonymousClass01z;
import X.AnonymousClass09Y;
import X.C18740tg;
import X.C36361kB;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.wabloks.ext.WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1;
import java.io.Serializable;

public abstract class BkDialogFragment extends Hilt_BkDialogFragment {
    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0E = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        View findViewById = A0E.findViewById(R.id.wa_bloks_dialog_fragment_container);
        AnonymousClass01z A0k = A0k();
        if (A0k.A0N("FRAGMENT_CONTENT") == null) {
            AnonymousClass09Y r7 = new AnonymousClass09Y(A0k);
            int id = findViewById.getId();
            WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1 = (WaBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1) this;
            String str = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A02;
            String str2 = waBkGlobalInterpreterExtImpl$WaBkWaBloksActivityGlobalInterpreterExt$1.A01;
            BkScreenFragment bkScreenFragment = new BkScreenFragment();
            bkScreenFragment.A1c(str);
            BkFragment.A05(bkScreenFragment);
            bkScreenFragment.A0b().putSerializable("screen_params", str2);
            BkFragment.A05(bkScreenFragment);
            bkScreenFragment.A0b().putParcelable("screen_cache_config", (Parcelable) null);
            BkFragment.A05(bkScreenFragment);
            bkScreenFragment.A0b().putSerializable("qpl_params", (Serializable) null);
            bkScreenFragment.A05 = false;
            r7.A0E(bkScreenFragment, "FRAGMENT_CONTENT", id);
            r7.A00(false);
        }
        return A0E;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        if (i == 2) {
            C18740tg.A06(this);
            C18740tg.A06(this.A02.getWindow());
            this.A02.getWindow().setLayout((int) (((double) A0i().getWindowManager().getDefaultDisplay().getWidth()) * 0.8d), -2);
        } else if (i == 1) {
            Dialog dialog = this.A02;
            C18740tg.A06(dialog);
            C18740tg.A06(dialog.getWindow());
            this.A02.getWindow().setLayout(-2, (int) (((double) A0i().getWindowManager().getDefaultDisplay().getHeight()) * 0.85d));
        }
    }
}
