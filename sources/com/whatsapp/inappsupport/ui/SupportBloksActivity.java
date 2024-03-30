package com.whatsapp.inappsupport.ui;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass1RC;
import X.C100974wL;
import X.C1266064r;
import X.C134906bn;
import X.C163027pX;
import X.C163827qp;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36441kJ;
import X.C90464aC;
import X.C90514aH;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;
import org.json.JSONException;

public final class SupportBloksActivity extends WaBloksActivity {
    public AnonymousClass005 A00;
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
            this.A00 = C18840tu.A00(r2.AAc);
        }
    }

    public SupportBloksActivity(int i) {
        this.A01 = false;
        C163027pX.A00(this, 29);
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        try {
            str = C36441kJ.A1B().put("params", C36441kJ.A1B().put("locale", this.A00.A09())).toString();
        } catch (JSONException unused) {
            Log.e("SupportBloksActivity - Could not create bloks parameter");
            str = null;
        }
        AnonymousClass005 r0 = this.A00;
        if (r0 != null) {
            WeakReference A0F = AnonymousClass001.A0F(this);
            boolean A0A = AnonymousClass1RC.A0A(this);
            ((C1266064r) r0.get()).A00(new C163827qp(0), (C134906bn) null, "com.bloks.www.csf.whatsapp.gethelp.locale.async", C90514aH.A0v(this.A02), str, A0F, A0A);
            AnonymousClass1RC.A06(this, R.color.f6nameremoved, 1);
            return;
        }
        throw C36331k8.A0d("asyncActionLauncherLazy");
    }

    public SupportBloksActivity() {
        this(0);
    }
}
