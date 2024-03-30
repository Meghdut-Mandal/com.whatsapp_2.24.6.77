package com.whatsapp.catalogcategory.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.B7Y;
import X.C165567td;
import X.C173838Ti;
import X.C174358Wo;
import X.C18740tg;
import X.C187808yZ;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import android.os.Bundle;
import android.view.Menu;
import com.whatsapp.R;
import com.whatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

public final class CatalogAllCategoryActivity extends C174358Wo {
    public boolean A00;

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173838Ti.A01(A0L, r2, r1, this);
        }
    }

    public CatalogAllCategoryActivity(int i) {
        this.A00 = false;
        B7Y.A00(this, 12);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0Q(getString(R.string.f12nameremoved));
        }
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("category_parent_id");
            C18740tg.A06(stringExtra);
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            AnonymousClass00C.A0B(stringExtra);
            UserJid A3i = A3i();
            C187808yZ r1 = C187808yZ.CATALOG_CATEGORY_FLOW;
            C36321k7.A0w(stringExtra, A3i);
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("parent_category_id", stringExtra);
            A07.putParcelable("category_biz_id", A3i);
            A07.putString("category_display_context", "CATALOG_CATEGORY_FLOW");
            CatalogAllCategoryFragment catalogAllCategoryFragment = new CatalogAllCategoryFragment();
            catalogAllCategoryFragment.A17(A07);
            A0O.A0B(catalogAllCategoryFragment, R.id.container);
            A0O.A01();
        }
    }

    public CatalogAllCategoryActivity() {
        this(0);
    }
}
