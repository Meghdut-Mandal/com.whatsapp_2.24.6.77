package com.whatsapp.businesscollection.view.activity;

import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass1KP;
import X.AnonymousClass1N6;
import X.AnonymousClass4PE;
import X.AnonymousClass6VE;
import X.AnonymousClass9RM;
import X.AnonymousClass9ZJ;
import X.AnonymousClass9ZO;
import X.B7Y;
import X.B93;
import X.C157967fa;
import X.C165567td;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C174338Wd;
import X.C178358fo;
import X.C18800tq;
import X.C18830tt;
import X.C196089Xp;
import X.C198849eI;
import X.C22909AyL;
import X.C27111My;
import X.C29461Ws;
import X.C31771cM;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C90504aG;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewStub;
import com.whatsapp.R;
import com.whatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

public class CollectionProductListActivity extends C174338Wd implements C157967fa {
    public AnonymousClass9RM A00;
    public AnonymousClass1KP A01;
    public AnonymousClass9ZO A02;
    public AnonymousClass1N6 A03;
    public boolean A04;

    public boolean A2g() {
        return true;
    }

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r1 = A0L.A5g;
            C165567td.A11(r1, this);
            C18830tt r3 = r1.A00;
            C165567td.A0v(r1, r3, this, C36321k7.A05(r1, r3, this));
            this.A08 = C27111My.A0E(A0L);
            this.A0O = C165597tg.A0U(r1);
            this.A06 = (AnonymousClass6VE) r1.A1Q.get();
            this.A05 = (C178358fo) r1.ADJ.get();
            this.A0N = C165607th.A0V(r3);
            this.A0F = C165607th.A0Q(r1);
            this.A0J = C36341k9.A0R(r1);
            this.A0L = C36341k9.A0S(r1);
            this.A0C = (C29461Ws) r1.A1S.get();
            this.A0K = C36371kC.A0U(r1);
            this.A0E = C165607th.A0P(r1);
            this.A09 = (AnonymousClass4PE) A0L.A1N.get();
            this.A0G = (C196089Xp) A0L.A0L.get();
            this.A0B = (C31771cM) r1.A6p.get();
            this.A0D = (C198849eI) r3.A0x.get();
            this.A04 = C165587tf.A0L(r1);
            this.A07 = new AnonymousClass9ZJ();
            this.A03 = (C22909AyL) A0L.A1Z.get();
            this.A00 = C27111My.A0G(A0L);
            this.A02 = new AnonymousClass9ZO();
            this.A01 = C18800tq.A2v(r1);
            this.A03 = C90504aG.A0V(r1);
        }
    }

    public void A2X() {
        if (this.A0D.A0E(6715)) {
            this.A03.A03(this.A0M, 60);
        }
        super.A2X();
    }

    public void BTC() {
        this.A0H.A02.A00();
    }

    public CollectionProductListActivity(int i) {
        this.A04 = false;
        B7Y.A00(this, 10);
    }

    public void onBackPressed() {
        AnonymousClass02E A0N = getSupportFragmentManager().A0N("CatalogSearchFragmentTag");
        if (A0N == null || !(A0N instanceof CatalogSearchFragment) || !((CatalogSearchFragment) A0N).A1a()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewStub) findViewById(R.id.stub_toolbar_search)).inflate();
        C36341k9.A12(this);
        String str = this.A0T;
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            if (str != null) {
                supportActionBar.A0Q(str);
            }
        }
        this.A00.A00(new B93(this, 2), this.A0M);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public CollectionProductListActivity() {
        this(0);
    }
}
