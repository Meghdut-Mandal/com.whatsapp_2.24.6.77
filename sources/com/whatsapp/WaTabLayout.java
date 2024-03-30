package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass04F;
import X.AnonymousClass1QZ;
import X.AnonymousClass6DR;
import X.C012005e;
import X.C18700tb;
import X.C18820ts;
import X.C36341k9;
import X.C36351kA;
import X.C36441kJ;
import X.C39261rb;
import X.C89064Vc;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;

public class WaTabLayout extends TabLayout implements C18700tb {
    public C18820ts A00;
    public AnonymousClass1QZ A01;
    public boolean A02;

    public WaTabLayout(Context context) {
        super(context, (AttributeSet) null);
        A0M();
        AnonymousClass04F.A05(this, 0);
    }

    public void A0F(ViewPager viewPager, boolean z) {
        if (viewPager == null || (viewPager instanceof WaViewPager)) {
            super.A0F(viewPager, true);
            return;
        }
        throw AnonymousClass001.A08("WaTabLayout should only be setup with WaViewPager");
    }

    public void A0N(int i) {
        super.A0D(A00(this, i, false));
    }

    public void setTabsClickable(boolean z) {
        for (int i = 0; i < this.A0h.size(); i++) {
            AnonymousClass6DR A09 = A09(i);
            if (A09 != null) {
                A09.A02.setClickable(z);
            }
        }
    }

    public void setupTabsForAccessibility(View view) {
        View view2;
        C012005e.A0V(this, new C89064Vc(this, 0));
        ArrayList arrayList = this.A0h;
        int size = arrayList.size() + 1;
        View[] viewArr = new View[size];
        viewArr[arrayList.size()] = view;
        for (int i = 0; i < arrayList.size(); i++) {
            AnonymousClass6DR A0L = A0L(i);
            if (A0L != null) {
                viewArr[i] = A0L.A02;
            }
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == 0) {
                view2 = null;
            } else {
                view2 = viewArr[i2 - 1];
            }
            C012005e.A0V(viewArr[i2], new C39261rb(view2, this, i2));
        }
    }

    public static int A00(WaTabLayout waTabLayout, int i, boolean z) {
        int size = (z ? 1 : 0) + waTabLayout.A0h.size();
        if (i < 0 || i >= size) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Tab index ");
            A0u.append(i);
            A0u.append(" is out of range [0, ");
            A0u.append(size);
            throw new IndexOutOfBoundsException(AnonymousClass000.A0q(")", A0u));
        } else if (!C36351kA.A1Y(waTabLayout.A00)) {
            return (size - i) - 1;
        } else {
            return i;
        }
    }

    public AnonymousClass6DR A0L(int i) {
        if (i < 0 || i >= this.A0h.size()) {
            return null;
        }
        return super.A09(A00(this, i, false));
    }

    public void A0M() {
        if (!this.A02) {
            this.A02 = true;
            this.A00 = C36341k9.A0U(generatedComponent());
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setupWithViewPager(ViewPager viewPager) {
        if (viewPager == null || (viewPager instanceof WaViewPager)) {
            super.setupWithViewPager(viewPager);
            return;
        }
        throw AnonymousClass001.A08("WaTabLayout should only be setup with WaViewPager");
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0M();
        AnonymousClass04F.A05(this, 0);
    }

    public WaTabLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A0M();
    }

    public WaTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0M();
        AnonymousClass04F.A05(this, 0);
    }
}
