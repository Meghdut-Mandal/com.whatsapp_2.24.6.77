package com.whatsapp.payments.ui.widget;

import X.AnonymousClass001;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C22831Awg;
import X.C23165B7z;
import X.C36441kJ;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiExclusionChipGroup extends ChipGroup implements C18700tb {
    public C22831Awg A00;
    public AnonymousClass1QZ A01;
    public Map A02;
    public Set A03;
    public boolean A04;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C36441kJ.A16();
        this.A02 = AnonymousClass001.A0J();
    }

    public void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A02.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.A00 = new C23165B7z(multiExclusionChip, this, 1);
        }
    }

    public void setOnSelectionChangedListener(C22831Awg awg) {
        this.A00 = awg;
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C36441kJ.A16();
        this.A02 = AnonymousClass001.A0J();
    }

    public MultiExclusionChipGroup(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C36441kJ.A16();
        this.A02 = AnonymousClass001.A0J();
    }
}
