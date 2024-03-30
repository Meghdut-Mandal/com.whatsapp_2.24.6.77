package com.whatsapp.contact.picker;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C80213v2;
import X.C89324Wc;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public class ContactPickerHelp extends AnonymousClass155 {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
        }
    }

    public ContactPickerHelp(int i) {
        this.A00 = false;
        C89324Wc.A00(this, 31);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        C36321k7.A0O(this);
        setContentView((int) R.layout.f9nameremoved);
        findViewById(R.id.scroll_view).post(C80213v2.A00(this, 47));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public ContactPickerHelp() {
        this(0);
    }
}
