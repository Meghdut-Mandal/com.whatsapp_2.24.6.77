package com.whatsapp.biz;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C18800tq;
import X.C18820ts;
import X.C19970wo;
import X.C201549jr;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class BusinessHoursView extends LinearLayout implements C18700tb {
    public ImageView A00;
    public BusinessHoursContentView A01;
    public C201549jr A02;
    public C19970wo A03;
    public C18820ts A04;
    public AnonymousClass1QZ A05;
    public boolean A06;
    public boolean A07;

    public void A01() {
        if (!this.A07) {
            this.A07 = true;
            C18800tq A0W = C36391kE.A0W(generatedComponent());
            this.A03 = C36351kA.A0V(A0W);
            this.A04 = C36341k9.A0T(A0W);
            this.A02 = (C201549jr) A0W.A00.A0e.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A05;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A05 = r0;
        }
        return r0.generatedComponent();
    }

    public BusinessHoursView(Context context) {
        super(context);
        A01();
        this.A06 = false;
        A00();
    }

    private void A00() {
        View inflate = C36351kA.A0C(this).inflate(R.layout.f9nameremoved, this, true);
        setFocusable(true);
        this.A01 = (BusinessHoursContentView) inflate.findViewById(R.id.business_hours_content_view);
        this.A00 = C36391kE.A0N(inflate, R.id.business_hours_chevron_icon);
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A06 = false;
        A00();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A06 = false;
        A00();
    }

    public BusinessHoursView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A06 = false;
        A00();
    }
}
