package com.whatsapp.conversation.conversationrow.message;

import X.AnonymousClass000;
import X.AnonymousClass191;
import X.AnonymousClass1NO;
import X.AnonymousClass2JE;
import X.AnonymousClass3LW;
import X.AnonymousClass4V4;
import X.AnonymousClass4XM;
import X.C235718z;
import X.C36391kE;
import X.C36411kG;
import X.C39001qm;
import X.C44562Nz;
import X.C57222xt;
import X.C62503Gk;
import X.C69943eL;
import X.C77583qj;
import X.C89014Ux;
import X.C90394a5;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.R;

public class StarredMessagesActivity extends AnonymousClass2JE {
    public MenuItem A00;
    public C57222xt A01;
    public C235718z A02;
    public C77583qj A03;
    public AnonymousClass1NO A04;
    public final AnonymousClass191 A05 = C90394a5.A00(this, 13);

    public class UnstarAllDialogFragment extends Hilt_StarredMessagesActivity_UnstarAllDialogFragment {
        public Dialog A1a(Bundle bundle) {
            C39001qm A03 = AnonymousClass3LW.A03(this);
            A03.A0c(R.string.f12nameremoved);
            C39001qm.A03(new AnonymousClass4XM(this, 34), A03, R.string.f12nameremoved);
            return A03.create();
        }
    }

    public AnonymousClass4V4 A3j() {
        if (!this.A02.A0O() || !C36411kG.A1a(this.A02.A06.A01) || this.A0F != null) {
            return super.A3j();
        }
        C57222xt r0 = this.A01;
        return new C69943eL(C36391kE.A0Z(r0.A00.A01), super.A3j());
    }

    public C89014Ux getConversationRowCustomizer() {
        return this.A00.A0P.A07;
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        this.A00.A0Z.registerObserver(this.A05);
        C44562Nz r1 = new C44562Nz();
        if (AnonymousClass000.A1W(this.A0F)) {
            i = 1;
        } else {
            i = 0;
        }
        r1.A00 = i;
        this.A00.A0d.Bly(r1);
        setContentView((int) R.layout.f9nameremoved);
        ListView listView = getListView();
        listView.setFastScrollEnabled(false);
        listView.setScrollbarFadingEnabled(true);
        listView.setOnScrollListener(this.A0J);
        A3i(this.A05);
        A3m();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        ListAdapter listAdapter;
        MenuItem add = menu.add(0, R.id.menuitem_unstar_all, 0, R.string.f12nameremoved);
        this.A00 = add;
        add.setShowAsAction(0);
        MenuItem menuItem = this.A00;
        C62503Gk r1 = this.A00;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        menuItem.setVisible(!listAdapter.isEmpty());
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A00.A0Z.unregisterObserver(this.A05);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_unstar_all) {
            return super.onOptionsItemSelected(menuItem);
        }
        new UnstarAllDialogFragment().A1f(getSupportFragmentManager(), "UnstarAllDialogFragment");
        return true;
    }
}
