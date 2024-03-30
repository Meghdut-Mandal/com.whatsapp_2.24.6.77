package com.whatsapp.contextualhelp;

import X.AnonymousClass00C;
import X.AnonymousClass24Z;
import X.AnonymousClass3UF;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C89324Wc;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.webview.ui.WaInAppBrowsingActivity;

public final class ContextualHelpActivity extends WaInAppBrowsingActivity {
    public boolean A00;

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        getMenuInflater().inflate(R.menu.f11nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.menu_more);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            Drawable A06 = AnonymousClass3UF.A06(getResources(), icon, R.color.f6nameremoved);
            AnonymousClass00C.A08(A06);
            findItem.setIcon(A06);
            return true;
        }
        throw C36381kD.A0l();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        if (menuItem.getItemId() != R.id.menuitem_open_in_browser) {
            return false;
        }
        startActivity(C36331k8.A04(getIntent().getStringExtra("webview_url")));
        return true;
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass24Z.A01(A0B, r1, this);
        }
    }

    public ContextualHelpActivity(int i) {
        this.A00 = false;
        C89324Wc.A00(this, 40);
    }

    public ContextualHelpActivity() {
        this(0);
    }
}
