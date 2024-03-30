package com.whatsapp.preference;

import X.AnonymousClass1RC;
import X.AnonymousClass3UF;
import X.AnonymousClass80G;
import X.C224514j;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ChatHistoryPreference extends WaPreference {
    public int A00;
    public int A01;

    public ChatHistoryPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void A0G(AnonymousClass80G r4) {
        super.A0G(r4);
        View view = r4.A0H;
        AnonymousClass3UF.A0E(C36391kE.A0N(view, 16908294), this.A00);
        C36391kE.A0P(view, 16908310).setTextColor(this.A01);
    }

    public ChatHistoryPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass1RC.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A01 = AnonymousClass1RC.A00(context, R.attr.f4nameremoved, C224514j.A00(context, R.attr.f4nameremoved, R.color.f6nameremoved));
    }

    public ChatHistoryPreference(Context context) {
        this(context, (AttributeSet) null);
    }
}
