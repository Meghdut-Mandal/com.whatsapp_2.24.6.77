package com.whatsapp.wds.components.actiontile;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass4XX;
import X.C05250Oz;
import X.C18700tb;
import X.C20810yC;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class WDSActionTileGroup extends LinearLayout implements C18700tb {
    public int A00;
    public C20810yC A01;
    public AnonymousClass1QZ A02;
    public boolean A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSActionTileGroup(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public static final void A00(WDSActionTile wDSActionTile, float f, int i) {
        LinearLayout.LayoutParams layoutParams;
        if (wDSActionTile != null) {
            ViewGroup.LayoutParams layoutParams2 = wDSActionTile.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                if (layoutParams != null) {
                    layoutParams.width = i;
                    layoutParams.weight = f;
                }
            } else {
                layoutParams = null;
            }
            wDSActionTile.setLayoutParams(layoutParams);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final C20810yC getAbProps() {
        return this.A01;
    }

    public final int getVisibleCount() {
        return this.A00;
    }

    public final void setAbProps(C20810yC r1) {
        this.A01 = r1;
    }

    public final void setVisibleCount(int i) {
        this.A00 = i;
    }

    public WDSActionTileGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
    }

    public /* synthetic */ WDSActionTileGroup(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSActionTileGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = C36341k9.A0V(C36391kE.A0W(generatedComponent()));
        }
        addOnLayoutChangeListener(new AnonymousClass4XX((Object) this, 3));
    }
}
