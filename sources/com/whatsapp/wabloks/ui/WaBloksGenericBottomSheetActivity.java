package com.whatsapp.wabloks.ui;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass1RC;
import X.C100974wL;
import X.C1266064r;
import X.C134906bn;
import X.C163037pY;
import X.C163087pd;
import X.C163827qp;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C90464aC;
import android.os.Bundle;
import com.whatsapp.R;
import java.lang.ref.WeakReference;

public final class WaBloksGenericBottomSheetActivity extends WaBloksActivity {
    public C1266064r A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            C100974wL.A01(A0L, r2, r1, this);
            this.A00 = (C1266064r) r2.AAc.get();
        }
    }

    public WaBloksGenericBottomSheetActivity(int i) {
        this.A01 = false;
        C163037pY.A00(this, 9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A11(this, R.id.wabloks_screen);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Y.add(new C163087pd(this, 2));
        WeakReference A0F = AnonymousClass001.A0F(this);
        C1266064r r3 = this.A00;
        if (r3 != null) {
            String stringExtra = getIntent().getStringExtra("extra_app_id");
            C18740tg.A06(stringExtra);
            AnonymousClass00C.A08(stringExtra);
            boolean A0A = AnonymousClass1RC.A0A(this);
            r3.A00(new C163827qp(2), (C134906bn) null, stringExtra, C36371kC.A0e(this.A02).getRawString(), (String) null, A0F, A0A);
            return;
        }
        throw C36331k8.A0d("asyncActionLauncher");
    }

    public WaBloksGenericBottomSheetActivity() {
        this(0);
    }
}
