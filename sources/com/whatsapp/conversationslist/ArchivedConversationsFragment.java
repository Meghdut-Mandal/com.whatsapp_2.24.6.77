package com.whatsapp.conversationslist;

import X.AnonymousClass01I;
import X.C106475Jv;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import X.C66963Xz;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArchivedConversationsFragment extends Hilt_ArchivedConversationsFragment {
    public View A00;

    public int A1a() {
        return 2;
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        if (!this.A1h.A2F() || this.A0f.A0L()) {
            super.A1U(menu, menuInflater);
        } else {
            menu.add(1, R.id.menuitem_archive_chat_notifications, 0, R.string.f12nameremoved);
        }
    }

    public List A1d() {
        ArrayList A05 = this.A1F.A05();
        ArrayList A0v = C36401kF.A0v(A05);
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            A0v.add(new C106475Jv(C36401kF.A0a(it), 2));
        }
        return A0v;
    }

    public void A1l() {
        this.A3P.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r1.A2G() != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A1w() {
        /*
            r2 = this;
            X.0v0 r1 = r2.A1h
            boolean r0 = r1.A2F()
            if (r0 == 0) goto L_0x000f
            boolean r1 = r1.A2G()
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.ArchivedConversationsFragment.A1w():boolean");
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_archive_chat_notifications) {
            return super.A1X(menuItem);
        }
        AnonymousClass01I A0h = A0h();
        if (A0h == null) {
            return true;
        }
        A1C(C36431kI.A0D().setClassName(A0h.getPackageName(), "com.whatsapp.conversationslist.ArchiveNotificationSettingActivity"));
        return true;
    }

    public void A1e() {
        super.A1e();
        if (this.A1F.A01() == 0) {
            C36341k9.A15(this);
        }
    }

    public void A1h() {
        super.A1h();
        C36341k9.A0y(this.A00);
        if (this.A1h.A2F() && !this.A0f.A0L()) {
            if (this.A00 == null) {
                View A22 = A22(R.layout.f9nameremoved);
                this.A00 = A22;
                C66963Xz.A00(A22, this, 39);
            }
            TextView A0E = C36351kA.A0E(this.A00);
            boolean A2G = this.A1h.A2G();
            int i = R.string.f12nameremoved;
            if (A2G) {
                i = R.string.f12nameremoved;
            }
            A0E.setText(i);
            this.A00.setVisibility(0);
        }
    }
}
