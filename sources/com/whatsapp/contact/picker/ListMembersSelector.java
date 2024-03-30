package com.whatsapp.contact.picker;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass1A6;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.C012005e;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C235618y;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36401kF;
import X.C62463Gg;
import X.C65913Ty;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class ListMembersSelector extends AnonymousClass27v {
    public C19460v5 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public C235618y A03;
    public AnonymousClass1A6 A04;
    public C65913Ty A05;
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
            C19470v6 r12 = C19470v6.A00;
            this.A02 = r12;
            this.A03 = C36401kF.A0U(r2);
            this.A05 = (C65913Ty) r2.ACf.get();
            this.A04 = C36401kF.A0V(r2);
            this.A01 = r12;
            this.A00 = r12;
        }
    }

    public void A3w(C62463Gg r4, AnonymousClass141 r5) {
        if (this.A03.A00(C36351kA.A0l(r5))) {
            if (r5.A0x) {
                super.B2c(r5);
            }
            TextEmojiLabel textEmojiLabel = r4.A02;
            textEmojiLabel.setSingleLine(false);
            textEmojiLabel.setMaxLines(2);
            r4.A00("You can't add this business to a Broadcast list.", false);
            return;
        }
        super.A3w(r4, r5);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 150) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    public ListMembersSelector(int i) {
        this.A06 = false;
        C89324Wc.A00(this, 34);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        supportActionBar.A0U(true);
        supportActionBar.A0I(R.string.f12nameremoved);
        if (bundle == null && !C36401kF.A1Y(this.A0D) && !this.A08.A00()) {
            RequestPermissionActivity.A01(this, R.string.f12nameremoved, R.string.f12nameremoved);
        }
        C19460v5 r1 = this.A00;
        if (r1.A05()) {
            r1.A02();
            C012005e.A02(this.A00, R.id.banner_container);
            throw AnonymousClass001.A0A("update");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C19460v5 r1 = this.A01;
        if (r1.A05()) {
            r1.A02();
            this.A0c.size();
            throw AnonymousClass001.A0A("logCreationCancelAction");
        }
    }

    public ListMembersSelector() {
        this(0);
    }
}
