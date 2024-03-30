package com.whatsapp.contact.picker;

import X.AnonymousClass00C;
import X.AnonymousClass1N2;
import X.C18800tq;
import X.C18820ts;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C63813Ln;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.collections.observablelistview.ObservableListView;

public final class BidiContactListView extends ObservableListView {
    public C18820ts A00;
    public AnonymousClass1N2 A01;
    public boolean A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01();
        A00();
    }

    public final void setImeUtils(AnonymousClass1N2 r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
    }

    public final void setWhatsAppLocale(C18820ts r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A0A = C36351kA.A0q(A0W);
            this.A01 = C36401kF.A0f(A0W);
            this.A00 = C36341k9.A0T(A0W);
        }
    }

    public final AnonymousClass1N2 getImeUtils() {
        AnonymousClass1N2 r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("imeUtils");
    }

    public final C18820ts getWhatsAppLocale() {
        C18820ts r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    private final void A00() {
        int dimensionPixelSize;
        Resources resources;
        int i;
        if (C36401kF.A1X(getWhatsAppLocale())) {
            setVerticalScrollbarPosition(1);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i = R.dimen.f7nameremoved;
        } else {
            setVerticalScrollbarPosition(2);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            resources = getResources();
            i = R.dimen.f7nameremoved;
        }
        setPadding(dimensionPixelSize, 0, resources.getDimensionPixelSize(i), 0);
        setFastScrollAlwaysVisible(true);
        setScrollBarStyle(33554432);
        setFastScrollEnabled(true);
        setScrollbarFadingEnabled(true);
        this.A06 = new C63813Ln((Object) this, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C36321k7.A0x(context, attributeSet);
        A01();
        A00();
    }

    public BidiContactListView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BidiContactListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C36321k7.A0x(context, attributeSet);
        A01();
        A00();
    }
}
