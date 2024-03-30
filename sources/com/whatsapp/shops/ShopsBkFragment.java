package com.whatsapp.shops;

import X.C165197t2;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.wabloks.base.BkFragment;

public abstract class ShopsBkFragment extends BkFragment {
    public void A1J() {
        super.A1J();
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A07;
        shopsBkLayoutViewModel.A0S();
        shopsBkLayoutViewModel.A01.A07(A0m());
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A07;
        shopsBkLayoutViewModel.A0S();
        C165197t2.A01(A0m(), shopsBkLayoutViewModel.A01, this, 18);
    }
}
