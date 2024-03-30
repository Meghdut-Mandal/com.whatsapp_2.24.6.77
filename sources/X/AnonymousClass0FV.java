package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0FV  reason: invalid class name */
public class AnonymousClass0FV extends AnonymousClass0V9 implements AnonymousClass02T {
    public C016307a A00;
    public Context A01;
    public C021809f A02;
    public ActionBarContextView A03;
    public WeakReference A04;
    public boolean A05;

    public View A00() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return AnonymousClass000.A0Y(weakReference);
        }
        return null;
    }

    public AnonymousClass0EG A01() {
        return new AnonymousClass0EG(this.A03.getContext());
    }

    public CharSequence A03() {
        return this.A03.A04;
    }

    public CharSequence A04() {
        return this.A03.A05;
    }

    public void A05() {
        if (!this.A05) {
            this.A05 = true;
            this.A03.sendAccessibilityEvent(32);
            this.A02.BVS(this);
        }
    }

    public void A06() {
        this.A02.BdJ(this.A00, this);
    }

    public void A07(int i) {
        A0A(this.A01.getString(i));
    }

    public void A08(int i) {
        A0B(this.A01.getString(i));
    }

    public void A09(View view) {
        WeakReference weakReference;
        this.A03.setCustomView(view);
        if (view != null) {
            weakReference = AnonymousClass001.A0F(view);
        } else {
            weakReference = null;
        }
        this.A04 = weakReference;
    }

    public void A0A(CharSequence charSequence) {
        this.A03.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A03.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A03.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A03.A06;
    }

    public boolean Baq(MenuItem menuItem, C016307a r3) {
        return this.A02.BQg(menuItem, this);
    }

    public AnonymousClass0FV(Context context, C021809f r4, ActionBarContextView actionBarContextView) {
        this.A01 = context;
        this.A03 = actionBarContextView;
        this.A02 = r4;
        C016307a r1 = new C016307a(actionBarContextView.getContext());
        r1.A00 = 1;
        this.A00 = r1;
        r1.A0C(this);
    }

    public void Bar(C016307a r2) {
        A06();
        C09460cP r0 = this.A03.A02;
        if (r0 != null) {
            r0.A03();
        }
    }

    public C016307a A02() {
        return this.A00;
    }
}
