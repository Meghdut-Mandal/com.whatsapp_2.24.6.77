package com.whatsapp.permissions;

import X.AnonymousClass00F;
import X.AnonymousClass27h;
import X.AnonymousClass3UF;
import X.C18800tq;
import X.C25271Fq;
import X.C36331k8;
import X.C36391kE;
import X.C36411kG;
import X.C89354Wf;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;

public final class RequestNotificationPermissionActivity extends RequestPermissionActivity {
    public C25271Fq A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            AnonymousClass27h.A0L(A0B, this);
            this.A00 = C36391kE.A0d(A0B);
        }
    }

    public RequestNotificationPermissionActivity(int i) {
        this.A01 = false;
        C89354Wf.A00(this, 10);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass3UF.A0E(C36411kG.A0Q(this, R.id.permission_image_1), AnonymousClass00F.A00(this, R.color.f6nameremoved));
    }

    public RequestNotificationPermissionActivity() {
        this(0);
    }
}
