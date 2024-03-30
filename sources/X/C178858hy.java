package X;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity;
import java.util.ArrayList;

/* renamed from: X.8hy  reason: invalid class name and case insensitive filesystem */
public abstract class C178858hy extends C179178jM {
    public AnonymousClass1EU A00;
    public C167737yi A01;

    public AnonymousClass0D3 A3i(ViewGroup viewGroup, int i) {
        if (i == 300) {
            return new AnonymousClass5Gt(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i == 301) {
            return new AnonymousClass5Gp(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i == 303) {
            return new C105785Gl(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
        }
        if (i != 305) {
            return super.A3i(viewGroup, i);
        }
        return new AnonymousClass5Gs(C36361kB.A0E(C36331k8.A09(viewGroup), viewGroup, R.layout.f9nameremoved));
    }

    public Dialog onCreateDialog(int i) {
        CharSequence charSequence;
        boolean z = false;
        if (i == 200) {
            charSequence = getString(R.string.f12nameremoved);
        } else if (i != 201) {
            return super.onCreateDialog(i);
        } else {
            AnonymousClass1EU r0 = this.A00;
            AnonymousClass1EU.A00(r0);
            z = true;
            int size = r0.A05.A0S(1).size();
            int i2 = R.string.f12nameremoved;
            if (size > 0) {
                i2 = R.string.f12nameremoved;
            }
            charSequence = AnonymousClass3UG.A05(this, this.A0C, getString(i2));
        }
        String string = getString(R.string.f12nameremoved);
        int i3 = 200;
        if (z) {
            i3 = 201;
        }
        C39001qm A002 = AnonymousClass3LW.A00(this);
        A002.A0p(charSequence);
        A002.A0r(true);
        A002.A0f(new B8L(this, i3, 2), R.string.f12nameremoved);
        A002.A0i(new C23162B7w(this, i3, 0, z), string);
        A002.A0e(new B81(this, i3, 2));
        return A002.create();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BrazilMerchantDetailsListActivity brazilMerchantDetailsListActivity = (BrazilMerchantDetailsListActivity) this;
        C167737yi r3 = (C167737yi) C165617ti.A0A(new B6r(brazilMerchantDetailsListActivity, brazilMerchantDetailsListActivity.A08, 0), brazilMerchantDetailsListActivity).A00(C167737yi.class);
        brazilMerchantDetailsListActivity.A07 = r3;
        r3.A03.A08(r3.A07, new BA8(brazilMerchantDetailsListActivity, 47));
        C167737yi r32 = brazilMerchantDetailsListActivity.A07;
        this.A01 = r32;
        r32.A00.A08(r32.A07, new BAA(this, 2));
        C167737yi r33 = this.A01;
        r33.A04.A08(r33.A07, new BAA(this, 1));
        C167737yi r2 = this.A01;
        C165597tg.A1E(r2.A0Q, r2, 7);
        this.A00.setLockIconVisibility(false);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, R.id.menuitem_remove_payment_method, 0, getString(R.string.f12nameremoved));
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_remove_payment_method) {
            return super.onOptionsItemSelected(menuItem);
        }
        C167737yi r5 = this.A01;
        ArrayList A09 = C165617ti.A0O(r5.A0M).A09();
        C24611Dc r2 = r5.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        C36341k9.A1N("Remove merchant account. #methods=", A0u, A09);
        C165607th.A1E(r2, A0u);
        int i = 1;
        if (A09.size() <= 1) {
            i = 0;
        }
        r5.A04.A0D(new AnonymousClass9FY(i));
        return true;
    }
}
