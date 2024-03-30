package com.whatsapp.mediacomposer.bottombar;

import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C20810yC;
import X.C27851Qb;
import X.C27861Qc;
import X.C28331Sf;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;

public final class BottomBarView extends RelativeLayout implements C18700tb {
    public C20810yC A00;
    public C28331Sf A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final WaImageButton A04;

    public final void setAbProps(C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    public final void setAddStandaloneButtonClick(View.OnClickListener onClickListener) {
        AnonymousClass00C.A0D(onClickListener, 0);
        this.A04.setOnClickListener(onClickListener);
    }

    public final void setStatusConfig(C28331Sf r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A01 = r2;
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
        C20810yC r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A07();
    }

    public final C28331Sf getStatusConfig() {
        C28331Sf r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("statusConfig");
    }

    public final void setAddStandaloneButtonVisibility(int i) {
        this.A04.setVisibility(i);
    }

    public BottomBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            C27861Qc.A0n((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
    }

    public BottomBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            C27861Qc.A0n((C27861Qc) ((C27851Qb) generatedComponent()), this);
        }
        View.inflate(context, getStatusConfig().A00() ? R.layout.f9nameremoved : R.layout.f9nameremoved, this);
        this.A04 = (WaImageButton) C36361kB.A0G(this, R.id.add_button_standalone);
    }
}
