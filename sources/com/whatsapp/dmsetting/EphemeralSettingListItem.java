package com.whatsapp.dmsetting;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaTextView;

public final class EphemeralSettingListItem extends ListItemWithLeftIcon {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        WaTextView waTextView = this.A06;
        waTextView.setMaxLines(2);
        waTextView.setSingleLine(false);
    }

    public /* synthetic */ EphemeralSettingListItem(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EphemeralSettingListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
