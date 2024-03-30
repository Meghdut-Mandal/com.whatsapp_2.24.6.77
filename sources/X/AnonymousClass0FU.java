package X;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: X.0FU  reason: invalid class name */
public class AnonymousClass0FU extends AnonymousClass0V9 implements AnonymousClass02T {
    public C021809f A00;
    public WeakReference A01;
    public final C016307a A02;
    public final Context A03;
    public final /* synthetic */ AnonymousClass07D A04;

    public AnonymousClass0FU(Context context, AnonymousClass07D r4, C021809f r5) {
        this.A04 = r4;
        this.A03 = context;
        this.A00 = r5;
        C016307a r1 = new C016307a(context);
        r1.A00 = 1;
        this.A02 = r1;
        r1.A0C(this);
    }

    public View A00() {
        WeakReference weakReference = this.A01;
        if (weakReference != null) {
            return AnonymousClass000.A0Y(weakReference);
        }
        return null;
    }

    public AnonymousClass0EG A01() {
        return new AnonymousClass0EG(this.A03);
    }

    public CharSequence A03() {
        return this.A04.A02.A04;
    }

    public CharSequence A04() {
        return this.A04.A02.A05;
    }

    public void A05() {
        AnonymousClass07D r3 = this.A04;
        if (r3.A01 == this) {
            boolean z = r3.A03;
            boolean z2 = r3.A0D;
            if (z || z2) {
                r3.A07 = this;
                r3.A06 = this.A00;
            } else {
                this.A00.BVS(this);
            }
            this.A00 = null;
            r3.A0c(false);
            ActionBarContextView actionBarContextView = r3.A02;
            if (actionBarContextView.A01 == null) {
                actionBarContextView.A04();
            }
            ((AnonymousClass07J) r3.A0B).A09.sendAccessibilityEvent(32);
            r3.A0A.setHideOnContentScrollEnabled(r3.A0E);
            r3.A01 = null;
        }
    }

    public void A06() {
        if (this.A04.A01 == this) {
            C016307a r1 = this.A02;
            r1.A07();
            try {
                this.A00.BdJ(r1, this);
            } finally {
                r1.A06();
            }
        }
    }

    public void A07(int i) {
        A0A(this.A04.A00.getResources().getString(i));
    }

    public void A08(int i) {
        A0B(this.A04.A00.getResources().getString(i));
    }

    public void A09(View view) {
        this.A04.A02.setCustomView(view);
        this.A01 = AnonymousClass001.A0F(view);
    }

    public void A0A(CharSequence charSequence) {
        this.A04.A02.setSubtitle(charSequence);
    }

    public void A0B(CharSequence charSequence) {
        this.A04.A02.setTitle(charSequence);
    }

    public void A0C(boolean z) {
        this.A01 = z;
        this.A04.A02.setTitleOptional(z);
    }

    public boolean A0D() {
        return this.A04.A02.A06;
    }

    public boolean Baq(MenuItem menuItem, C016307a r3) {
        C021809f r0 = this.A00;
        if (r0 != null) {
            return r0.BQg(menuItem, this);
        }
        return false;
    }

    public void Bar(C016307a r2) {
        if (this.A00 != null) {
            A06();
            C09460cP r0 = this.A04.A02.A02;
            if (r0 != null) {
                r0.A03();
            }
        }
    }

    public C016307a A02() {
        return this.A02;
    }
}
