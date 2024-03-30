package com.whatsapp;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass155;
import X.AnonymousClass15L;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36431kI;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public final class CatalogMediaView extends AnonymousClass155 implements AnonymousClass15L {
    public boolean A00;

    public void BVx() {
    }

    public void Bao() {
    }

    public void Bim() {
    }

    public boolean Bta() {
        return true;
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public CatalogMediaView(int i) {
        this.A00 = false;
        C89314Wb.A00(this, 1);
    }

    public void Ban() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A03(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView((int) R.layout.f9nameremoved);
            AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
            AnonymousClass00C.A08(supportFragmentManager);
            AnonymousClass02E A0N = supportFragmentManager.A0N("catalog_media_view_fragment");
            if (A0N == null) {
                A0N = new CatalogMediaViewFragment();
            }
            Bundle A07 = AnonymousClass001.A07();
            A07.putParcelable("product", intent.getParcelableExtra("product"));
            A07.putInt("target_image_index", C36431kI.A02(intent, "target_image_index"));
            A07.putString("cached_jid", intent.getStringExtra("cached_jid"));
            A07.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A0N.A17(A07);
            AnonymousClass09Y r1 = new AnonymousClass09Y(supportFragmentManager);
            r1.A0F(A0N, "catalog_media_view_fragment", R.id.media_view_fragment_container);
            r1.A01();
        }
    }

    public void onStop() {
        super.onStop();
        C36361kB.A0C(this).setSystemUiVisibility(3840);
    }

    public CatalogMediaView() {
        this(0);
    }
}
