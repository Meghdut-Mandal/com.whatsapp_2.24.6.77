package com.whatsapp.payments.care.csat;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass1RC;
import X.C100974wL;
import X.C119955qj;
import X.C1266064r;
import X.C134906bn;
import X.C163027pX;
import X.C163087pd;
import X.C163827qp;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19730wQ;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C36441kJ;
import X.C90464aC;
import X.C90514aH;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wabloks.ui.WaBloksActivity;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class CsatSurveyBloksActivity extends WaBloksActivity {
    public C119955qj A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C90464aC.A11(r3, this);
            C18830tt r1 = r3.A00;
            C90464aC.A0y(r3, r1, this, C36321k7.A05(r3, r1, this));
            C100974wL.A01(A0L, r3, r1, this);
            this.A00 = new C119955qj((C19730wQ) r3.A4g.get(), C18840tu.A00(r3.AAc));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36331k8.A11(this, R.id.wabloks_screen);
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Y.add(new C163087pd(this, 0));
        C119955qj r3 = this.A00;
        if (r3 != null) {
            String stringExtra = getIntent().getStringExtra("survey_id");
            if (stringExtra != null) {
                String stringExtra2 = getIntent().getStringExtra("entry_point");
                String stringExtra3 = getIntent().getStringExtra("session_id");
                C1266064r r9 = (C1266064r) r3.A01.get();
                WeakReference A0F = AnonymousClass001.A0F(this);
                boolean A0A = AnonymousClass1RC.A0A(this);
                String A0v = C90514aH.A0v(r3.A00);
                JSONObject A1B = C36441kJ.A1B();
                A1B.put("survey_id", stringExtra);
                if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
                    A1B.put("entry_point", stringExtra2);
                }
                if (!(stringExtra3 == null || stringExtra3.length() == 0)) {
                    A1B.put("session_id", stringExtra3);
                }
                r9.A00(new C163827qp(1), (C134906bn) null, "com.bloks.www.novi.care.start_survey_action", A0v, C36381kD.A0y(C36441kJ.A1B().put("params", C36441kJ.A1B().put("server_params", A1B))), A0F, A0A);
                return;
            }
            throw C36381kD.A0k();
        }
        throw C36331k8.A0d("csatSurveyLauncherProxy");
    }

    public CsatSurveyBloksActivity(int i) {
        this.A01 = false;
        C163027pX.A00(this, 42);
    }

    public CsatSurveyBloksActivity() {
        this(0);
    }
}
