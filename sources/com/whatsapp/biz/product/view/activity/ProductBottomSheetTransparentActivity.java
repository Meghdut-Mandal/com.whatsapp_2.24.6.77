package com.whatsapp.biz.product.view.activity;

import X.AnonymousClass01z;
import X.AnonymousClass155;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36381kD;
import X.C36431kI;
import X.C89314Wb;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;
import com.whatsapp.jid.Jid;

public final class ProductBottomSheetTransparentActivity extends AnonymousClass155 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public ProductBottomSheetTransparentActivity(int i) {
        this.A00 = false;
        C89314Wb.A00(this, 25);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        getWindow().setStatusBarColor(0);
        int i = 1;
        if (Build.VERSION.SDK_INT == 26) {
            i = -1;
        }
        setRequestedOrientation(i);
        String stringExtra = getIntent().getStringExtra("extra_product_id");
        C18740tg.A06(stringExtra);
        C36361kB.A1I(stringExtra);
        Bundle A0I = C36431kI.A0I("extra_product_id", stringExtra);
        A0I.putString("extra_product_owner_jid", C36381kD.A0w((Jid) getIntent().getParcelableExtra("extra_product_owner_id")));
        ProductBottomSheet productBottomSheet = new ProductBottomSheet();
        productBottomSheet.A17(A0I);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        C18740tg.A06(supportFragmentManager);
        productBottomSheet.A1f(supportFragmentManager, "product_bottom_sheet_tag");
    }

    public ProductBottomSheetTransparentActivity() {
        this(0);
    }
}
