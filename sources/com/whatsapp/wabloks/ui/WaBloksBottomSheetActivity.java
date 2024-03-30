package com.whatsapp.wabloks.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01z;
import X.AnonymousClass1RC;
import X.AnonymousClass5OZ;
import X.AnonymousClass714;
import X.C1266064r;
import X.C134906bn;
import X.C163087pd;
import X.C18740tg;
import X.C33761ft;
import X.C36331k8;
import X.C36441kJ;
import X.C90474aD;
import X.C90514aH;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wabloks.base.BkScreenFragment;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public final class WaBloksBottomSheetActivity extends AnonymousClass5OZ {
    public C33761ft A00;
    public AnonymousClass005 A01;

    public void Bln(String str) {
        AnonymousClass00C.A0D(str, 0);
        if (str.equals("error_dialog")) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        C36331k8.A11(this, R.id.wabloks_screen);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Y.add(new C163087pd(this, 1));
        String stringExtra = getIntent().getStringExtra("screen_name");
        C18740tg.A06(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("screen_params");
        C134906bn r5 = (C134906bn) getIntent().getParcelableExtra("screen_cache_config");
        boolean booleanExtra = getIntent().getBooleanExtra("is_async_component", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("restore_saved_instance", false);
        if (booleanExtra) {
            AnonymousClass00C.A0B(stringExtra);
            Bu2(0, R.string.f12nameremoved);
            WeakReference A0F = AnonymousClass001.A0F(this);
            AnonymousClass005 r0 = this.A01;
            if (r0 != null) {
                WeakReference A0F2 = AnonymousClass001.A0F(this);
                boolean A0A = AnonymousClass1RC.A0A(this);
                ((C1266064r) r0.get()).A00(new AnonymousClass714(this, stringExtra, stringExtra2, A0F), r5, stringExtra, C90514aH.A0v(this.A02), stringExtra2, A0F2, A0A);
                return;
            }
            throw C36331k8.A0d("asyncActionLauncherLazy");
        }
        AnonymousClass00C.A0B(stringExtra);
        BkBottomSheetContainerFragment A03 = BkBottomSheetContainerFragment.A03(booleanExtra2);
        BkScreenFragment bkScreenFragment = new BkScreenFragment();
        bkScreenFragment.A1c(stringExtra);
        C90474aD.A14(bkScreenFragment, r5, (Serializable) null, stringExtra2);
        bkScreenFragment.A05 = true;
        A03.A01 = C36441kJ.A0W(bkScreenFragment, stringExtra);
        A03.A1f(getSupportFragmentManager(), "bloks_bottomsheet_container");
    }
}
