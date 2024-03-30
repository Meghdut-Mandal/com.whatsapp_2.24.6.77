package com.whatsapp.ui.media;

import X.AnonymousClass00C;
import X.C012005e;
import X.C36331k8;
import X.C47932gP;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class MediaCard extends C47932gP {
    public LinearLayout A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context) {
        super(context, (AttributeSet) null, 0);
        AnonymousClass00C.A0D(context, 1);
    }

    public void A05(int i, int i2) {
        super.A05(i, i2);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            if (i < 0) {
                i = linearLayout.getPaddingLeft();
            }
            int paddingTop = linearLayout.getPaddingTop();
            if (i2 < 0) {
                i2 = linearLayout.getPaddingRight();
            }
            linearLayout.setPadding(i, paddingTop, i2, linearLayout.getPaddingBottom());
        }
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        this.A00 = (LinearLayout) C012005e.A02(this, R.id.media_card_thumbs);
    }

    public String getError() {
        return super.getError();
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public void setError(String str) {
        super.setError(str);
        C36331k8.A0y(this.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnonymousClass00C.A0D(context, 1);
    }
}
