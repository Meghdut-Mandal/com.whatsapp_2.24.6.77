package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass07S;
import X.AnonymousClass1RE;
import X.AnonymousClass28R;
import X.C18820ts;
import X.C36351kA;
import X.C42781zT;
import X.C42821zX;
import android.content.Context;
import android.util.AttributeSet;

public class WaViewPager extends C42821zX {
    public C18820ts A00;

    public void A0P(int i) {
        super.A0J(A0O(i), true);
    }

    public static int A00(C18820ts r1, int i, int i2) {
        if (i < 0 || i >= i2) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Item index ");
            A0u.append(i);
            A0u.append(" is out of range [0, ");
            A0u.append(i2);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0q(")", A0u));
        } else if (!C36351kA.A1Y(r1)) {
            return (i2 - i) - 1;
        } else {
            return i;
        }
    }

    private int getItemCount() {
        AnonymousClass07S r0 = this.A0A;
        if (r0 == null) {
            return 0;
        }
        return r0.A0H();
    }

    public int A0O(int i) {
        return A00(this.A00, i, getItemCount());
    }

    public AnonymousClass07S getRealAdapter() {
        AnonymousClass07S r1 = this.A0A;
        if (r1 instanceof C42781zT) {
            return ((C42781zT) r1).A00;
        }
        return null;
    }

    public void setAdapter(AnonymousClass07S r4) {
        AnonymousClass07S r2;
        if (r4 == null) {
            r2 = null;
        } else {
            boolean z = r4 instanceof AnonymousClass1RE;
            C18820ts r1 = this.A00;
            if (z) {
                r2 = new AnonymousClass28R(r4, (AnonymousClass1RE) r4, r1);
            } else {
                r2 = new C42781zT(r4, r1);
            }
        }
        super.setAdapter(r2);
        if (r4 != null && r4.A0H() > 0) {
            setCurrentLogicalItem(0);
        }
    }

    public AnonymousClass07S getAdapter() {
        return this.A0A;
    }

    @Deprecated
    public int getCurrentItem() {
        return this.A02;
    }

    public int getCurrentLogicalItem() {
        if (getItemCount() == 0) {
            return -1;
        }
        return A0O(this.A02);
    }

    public void setCurrentLogicalItem(int i) {
        super.setCurrentItem(A0O(i));
    }

    public WaViewPager(Context context) {
        super(context);
    }

    @Deprecated
    public void setCurrentItem(int i) {
        super.setCurrentItem(i);
    }

    public WaViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
