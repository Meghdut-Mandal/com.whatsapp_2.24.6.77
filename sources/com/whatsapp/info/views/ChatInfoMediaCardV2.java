package com.whatsapp.info.views;

import X.AnonymousClass2FY;
import X.AnonymousClass3A6;
import X.C36401kF;
import X.C36421kH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.ui.media.MediaCard;

public class ChatInfoMediaCardV2 extends MediaCard {
    public boolean A00;

    public int getThumbnailIconGravity() {
        return C36421kH.A01(C36401kF.A1X(this.A02) ? 1 : 0);
    }

    public int getThumbnailTextGravity() {
        if (C36401kF.A1X(this.A02)) {
            return 3;
        }
        return 5;
    }

    public ChatInfoMediaCardV2(Context context) {
        super(context);
        A01();
    }

    public AnonymousClass2FY A02(ViewGroup.LayoutParams layoutParams, AnonymousClass3A6 r5, int i) {
        AnonymousClass2FY A02 = super.A02(layoutParams, r5, i);
        A02.A01 = getResources().getDimension(R.dimen.f7nameremoved);
        return A02;
    }

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = getThumbnailPixelSize();
        this.A00.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.A0C.getLayoutParams();
        layoutParams2.height = getThumbnailPixelSize();
        this.A0C.setLayoutParams(layoutParams2);
    }

    public int getThumbnailPixelSize() {
        return getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A01();
    }

    public ChatInfoMediaCardV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }
}
