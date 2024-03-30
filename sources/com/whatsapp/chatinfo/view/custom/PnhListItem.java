package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C33511fU;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;

public final class PnhListItem extends ListItemWithLeftIcon {
    public boolean A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context) {
        this(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        WaTextView waTextView = this.A06;
        waTextView.setTextSize(0, (float) C36371kC.A03(this, R.dimen.f7nameremoved));
        C33511fU.A03(waTextView);
        waTextView.setLineHeight(C36371kC.A03(this, R.dimen.f7nameremoved));
        waTextView.setMaxLines(2);
        waTextView.setSingleLine(false);
        TextEmojiLabel textEmojiLabel = this.A00;
        textEmojiLabel.setTextSize(0, (float) C36371kC.A03(this, R.dimen.f7nameremoved));
        textEmojiLabel.setLineHeight(C36371kC.A03(this, R.dimen.f7nameremoved));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A00.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    public /* synthetic */ PnhListItem(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A03();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PnhListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
