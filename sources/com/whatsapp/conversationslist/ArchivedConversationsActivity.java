package com.whatsapp.conversationslist;

import X.AnonymousClass09Y;
import X.AnonymousClass0V9;
import X.AnonymousClass155;
import X.AnonymousClass17T;
import X.C18800tq;
import X.C18830tt;
import X.C18950u5;
import X.C19420v0;
import X.C19430v1;
import X.C19770wU;
import X.C35681j5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36391kE;
import X.C89334Wd;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;

public class ArchivedConversationsActivity extends AnonymousClass155 {
    public AnonymousClass17T A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (AnonymousClass17T) A0B.A7S.get();
        }
    }

    public ArchivedConversationsActivity(int i) {
        this.A01 = false;
        C89334Wd.A00(this, 7);
    }

    public C18950u5 BGv() {
        return C19430v1.A02;
    }

    public void Bih(AnonymousClass0V9 r1) {
        super.Bih(r1);
        C36391kE.A14(this);
    }

    public void Bii(AnonymousClass0V9 r1) {
        super.Bii(r1);
        C36341k9.A0n(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A2F = this.A09.A2F();
        int i = R.string.f12nameremoved;
        if (A2F) {
            i = R.string.f12nameremoved;
        }
        setTitle(i);
        getSupportActionBar().A0U(true);
        setContentView((int) R.layout.f9nameremoved);
        if (bundle == null) {
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0A(new ArchivedConversationsFragment(), R.id.container);
            A0O.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C19770wU r4 = this.A04;
        AnonymousClass17T r3 = this.A00;
        C19420v0 r2 = this.A09;
        if (r2.A2F() && !r2.A2G()) {
            r4.Boy(new C35681j5(r2, r3, 12));
        }
    }

    public ArchivedConversationsActivity() {
        this(0);
    }
}
