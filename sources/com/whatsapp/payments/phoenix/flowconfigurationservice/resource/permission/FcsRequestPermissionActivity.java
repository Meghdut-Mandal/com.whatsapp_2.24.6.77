package com.whatsapp.payments.phoenix.flowconfigurationservice.resource.permission;

import X.AnonymousClass155;
import X.AnonymousClass3US;
import X.AnonymousClass61B;
import X.AnonymousClass9DT;
import X.AnonymousClass9Pr;
import X.B7Y;
import X.C162097o1;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C187758yU;
import X.C18800tq;
import X.C18830tt;
import X.C203619oP;
import X.C203639oR;
import X.C20830yE;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36431kI;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.RequestPermissionActivity;
import java.util.Map;

public final class FcsRequestPermissionActivity extends AnonymousClass155 {
    public AnonymousClass9DT A00;
    public C20830yE A01;
    public AnonymousClass61B A02;
    public AnonymousClass9Pr A03;
    public String A04;
    public boolean A05;
    public final Map A06;

    private final void A01() {
        C203619oP r1;
        C162097o1 r12;
        AnonymousClass61B r13 = this.A02;
        if (r13 != null) {
            String str = this.A04;
            if (str == null) {
                throw C36331k8.A0d("fdsManagerId");
            }
            C203639oR A002 = r13.A00(str);
            if (!(A002 == null || (r1 = A002.A00) == null || (r12 = (C162097o1) r1.A0A("request_permission")) == null)) {
                r12.B7N(this.A06);
            }
            finish();
            return;
        }
        throw C36331k8.A0d("fdsManagerRegistry");
    }

    public void A2F() {
        if (!this.A05) {
            this.A05 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = C165587tf.A0N(r2);
            this.A02 = C165587tf.A0Y(r2);
            this.A00 = (AnonymousClass9DT) A0L.A1d.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i == 153 || i == 155) {
            Map map = this.A06;
            if (i2 == -1) {
                str = "GRANTED";
            } else {
                str = "NOT_GRANTED";
            }
            map.put("permission_result", str);
            A01();
        }
        super.onActivityResult(i, i2, intent);
    }

    public FcsRequestPermissionActivity(int i) {
        this.A05 = false;
        B7Y.A00(this, 30);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.A00 != null) {
            AnonymousClass9Pr r0 = new AnonymousClass9Pr(this);
            this.A03 = r0;
            if (!r0.A00(bundle)) {
                C36321k7.A1Z(C165567td.A0b(this), ": Activity cannot be launch because it is no longer save to create this activity");
                finish();
                return;
            }
            String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
            if (stringExtra != null) {
                this.A04 = stringExtra;
                String stringExtra2 = getIntent().getStringExtra("extra_permission");
                if (stringExtra2 == null) {
                    this.A06.put("permission_result", "null_permission");
                    A01();
                    return;
                }
                int ordinal = C187758yU.valueOf(stringExtra2).ordinal();
                if (ordinal == 0) {
                    RequestPermissionActivity.A0B.A0C(this);
                } else if (ordinal == 1) {
                    AnonymousClass3US r1 = RequestPermissionActivity.A0B;
                    C20830yE r02 = this.A01;
                    if (r02 != null) {
                        r1.A0E(this, r02);
                        return;
                    }
                    throw C36331k8.A0d("waPermissionsHelper");
                }
            } else {
                throw C165577te.A0c("/onCreate: FDS Manager ID is null", C165567td.A0b(this));
            }
        } else {
            throw C36331k8.A0d("fcsActivityLifecycleManagerFactory");
        }
    }

    public FcsRequestPermissionActivity() {
        this(0);
        this.A06 = C36431kI.A1G();
    }
}
