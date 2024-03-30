package com.whatsapp.wds.components.list.listitem.debug;

import X.AnonymousClass00C;
import X.AnonymousClass7dN;
import X.AnonymousClass7dO;
import X.AnonymousClass7dP;
import X.C05250Oz;
import X.C36331k8;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;

public final class WDSListItemDebugPanel extends RelativeLayout {
    public AnonymousClass7dN A00;
    public final Context A01;
    public final AttributeSet A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        this.A01 = context;
        this.A02 = attributeSet;
        View.inflate(getContext(), R.layout.f9nameremoved, this);
    }

    public void setAttributesCallback(AnonymousClass7dO r2) {
        AnonymousClass00C.A0D(r2, 0);
        throw C36331k8.A0d("wdsListItemDebugPanelAttributesAdapter");
    }

    public void setValuesCallback(AnonymousClass7dP r2) {
        AnonymousClass00C.A0D(r2, 0);
        throw C36331k8.A0d("wdsListItemDebugPanelValuesAdapter");
    }

    public final AnonymousClass7dN getCallback() {
        return null;
    }

    public final void setCallback(AnonymousClass7dN r1) {
        this.A00 = r1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ WDSListItemDebugPanel(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSListItemDebugPanel(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
