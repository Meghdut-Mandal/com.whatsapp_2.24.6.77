package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass17X;
import X.AnonymousClass1UN;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C89374Wh;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

public final class GroupMembersSelectorActivity extends AnonymousClass27v {
    public int A00;
    public AnonymousClass17X A01;
    public AnonymousClass1UN A02;
    public String A03;
    public List A04;
    public Map A05;
    public boolean A06;

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A05 = r1.A0A();
            this.A01 = C36351kA.A0b(r2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("GroupMembersSelectorActivity/contact access permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            Log.i("GroupMembersSelectorActivity/create new group result ok");
            setResult(-1, intent);
        }
        finish();
    }

    public GroupMembersSelectorActivity(int i) {
        this.A06 = false;
        C89374Wh.A00(this, 26);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Map map = this.A05;
        if (map != null) {
            Object A0r = C36371kC.A0r(map, 1004342578);
            if (A0r != null) {
                this.A02 = (AnonymousClass1UN) A0r;
                if (!this.A0D.A0E(3989)) {
                    setResult(-1, C36431kI.A0D().putExtra("is_success", false));
                    finish();
                }
                if (getIntent() != null) {
                    this.A00 = getIntent().getIntExtra("entry_point", 11);
                    this.A03 = getIntent().getStringExtra("event_name");
                }
                if (bundle == null && !this.A08.A00()) {
                    AnonymousClass22g.A0k(this, R.string.f12nameremoved, R.string.f12nameremoved);
                }
                AnonymousClass1UN r1 = this.A02;
                if (r1 == null) {
                    throw C36331k8.A0d("xFamilyUserFlowLogger");
                }
                r1.A04("SEE_ADD_PARTICIPANTS");
                return;
            }
            throw C36381kD.A0l();
        }
        throw C36331k8.A0d("xFamilyUserFlowLoggers");
    }

    public GroupMembersSelectorActivity() {
        this(0);
    }
}
