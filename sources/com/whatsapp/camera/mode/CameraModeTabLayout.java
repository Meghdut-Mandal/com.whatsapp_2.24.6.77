package com.whatsapp.camera.mode;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass04F;
import X.AnonymousClass1QZ;
import X.AnonymousClass6DR;
import X.C1270866x;
import X.C141686ne;
import X.C157287ci;
import X.C18700tb;
import X.C18820ts;
import X.C21060yb;
import X.C27851Qb;
import X.C27861Qc;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import X.C90504aG;
import X.C93024fQ;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.whatsapp.R;

public final class CameraModeTabLayout extends TabLayout implements C18700tb {
    public AnonymousClass6DR A00;
    public C157287ci A01;
    public C21060yb A02;
    public C18820ts A03;
    public C1270866x A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public boolean A07;
    public final AnonymousClass6DR A08;
    public final AnonymousClass6DR A09;

    public final void setMediaSharingUserJourneyLogger(C1270866x r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A04 = r2;
    }

    public final void setPreviouslySelectedTab(AnonymousClass6DR r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setSystemServices(C21060yb r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A02 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A03 = r2;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public final C1270866x getMediaSharingUserJourneyLogger() {
        C1270866x r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("mediaSharingUserJourneyLogger");
    }

    public final C21060yb getSystemServices() {
        C21060yb r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0W();
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public CameraModeTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A07) {
            this.A07 = true;
            C27861Qc.A0g((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public final C157287ci getCameraModeTabLayoutListener() {
        return this.A01;
    }

    public final boolean getDidFling() {
        return this.A06;
    }

    public final AnonymousClass6DR getPreviouslySelectedTab() {
        return this.A00;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C93024fQ r2;
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass6DR A092 = A09(0);
        C93024fQ r4 = null;
        if (A092 != null) {
            r2 = A092.A02;
        } else {
            r2 = null;
        }
        AnonymousClass6DR A093 = A09(C90504aG.A0C(this.A0h));
        if (A093 != null) {
            r4 = A093.A02;
        }
        int width = getWidth();
        if (r2 != null) {
            i5 = r2.getWidth();
        } else {
            i5 = 0;
        }
        int i8 = (width - i5) / 2;
        int width2 = getWidth();
        if (r4 != null) {
            i6 = r4.getWidth();
        } else {
            i6 = 0;
        }
        AnonymousClass04F.A06(getChildAt(0), i8, 0, (width2 - i6) / 2, 0);
        AnonymousClass6DR r22 = this.A09;
        TabLayout tabLayout = r22.A03;
        if (tabLayout != null) {
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == (i7 = r22.A00)) {
                A0C(0.0f, i7, false, true);
                return;
            }
            return;
        }
        throw AnonymousClass001.A08("Tab not attached to a TabLayout");
    }

    public final void setCameraModeTabLayoutListener(C157287ci r1) {
        this.A01 = r1;
    }

    public final void setDidFling(boolean z) {
        this.A06 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraModeTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A07) {
            this.A07 = true;
            C27861Qc.A0g((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        AnonymousClass6DR A082 = A08();
        A082.A01(R.string.f12nameremoved);
        A082.A06 = C36361kB.A0j();
        this.A08 = A082;
        AnonymousClass6DR A083 = A08();
        A083.A01(R.string.f12nameremoved);
        A083.A06 = 1;
        this.A09 = A083;
        A0H(A082);
        A0I(A083, this.A0h.size(), true);
        this.A00 = A083;
        A0G(new C141686ne(this));
    }
}
