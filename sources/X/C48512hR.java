package X;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.updates.ui.UpdatesFragment;

/* renamed from: X.2hR  reason: invalid class name and case insensitive filesystem */
public final class C48512hR extends C42581z3 implements C16620po {
    public final C32141d2 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48512hR(View view, C18820ts r13, C20810yC r14, AnonymousClass1GQ r15, C32141d2 r16) {
        super(view);
        C36321k7.A16(r14, r13, r15, 1);
        this.A00 = r16;
        TextView A0P = C36391kE.A0P(view, R.id.update_title);
        A0P.setText(R.string.f12nameremoved);
        C33511fU.A03(A0P);
        C36361kB.A0F(view, R.id.divider).setVisibility(0);
        C36361kB.A0F(view, R.id.more_button).setVisibility(8);
        View view2 = this.A0H;
        View findViewById = view2.findViewById(R.id.add_update_button);
        if (r15.A04() || r15.A06()) {
            AnonymousClass00C.A0B(findViewById);
            C07200Ws r5 = new C07200Ws(C36431kI.A0A(findViewById, view2, 0), findViewById, C36421kH.A01(C36351kA.A1Y(r13) ? 1 : 0), 0, C55822vF.A00(r14));
            AnonymousClass0EG r4 = new AnonymousClass0EG(r5.A02);
            C016307a r3 = r5.A03;
            r4.inflate(R.menu.f11nameremoved, r3);
            AnonymousClass3Y9.A00(findViewById, r5, 30);
            C36331k8.A0q(view2.getContext(), findViewById, R.string.f12nameremoved);
            r5.A01 = this;
            r3.findItem(R.id.menu_item_discover_newsletters).setVisible(r15.A06());
            r3.findItem(R.id.menu_item_add_newsletter).setVisible(r15.A04());
        } else {
            AnonymousClass00C.A0B(findViewById);
            findViewById.setVisibility(8);
        }
        C33521fV.A07(view, true);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem == null) {
            return true;
        }
        int itemId = menuItem.getItemId();
        if (Integer.valueOf(itemId) == null) {
            return true;
        }
        if (itemId == R.id.menu_item_discover_newsletters) {
            this.A00.Bbb(2);
            return true;
        } else if (itemId != R.id.menu_item_add_newsletter) {
            return true;
        } else {
            UpdatesFragment updatesFragment = (UpdatesFragment) this.A00;
            updatesFragment.A1b().A0H(true);
            AnonymousClass3UC r4 = (AnonymousClass3UC) C36411kG.A0v(updatesFragment.A1e());
            C225314u A0L = C36401kF.A0L(updatesFragment.A0h());
            C20810yC r1 = r4.A02;
            r4.A07(A0L, C36341k9.A08(r1, 3834), C36341k9.A08(r1, 3835), false);
            return true;
        }
    }
}
