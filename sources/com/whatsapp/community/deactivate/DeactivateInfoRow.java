package com.whatsapp.community.deactivate;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.C013105r;
import X.C18740tg;
import X.C36331k8;
import X.C36341k9;
import X.C56172vr;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;

public final class DeactivateInfoRow extends LinearLayout {
    public ImageView A00;
    public TextView A01;
    public TextView A02;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    private final void A00(Context context, AttributeSet attributeSet) {
        RuntimeException A0d;
        LayoutInflater.from(context).inflate(R.layout.f9nameremoved, this);
        this.A00 = C36341k9.A0L(this, R.id.cdir_icon);
        this.A02 = C36341k9.A0M(this, R.id.cdir_row_title);
        this.A01 = C36341k9.A0M(this, R.id.cdir_description);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56172vr.A00);
        AnonymousClass00C.A08(obtainStyledAttributes);
        try {
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId != 0) {
                TextView textView = this.A02;
                if (textView == null) {
                    A0d = C36331k8.A0d("rowTitleView");
                    throw A0d;
                }
                String string = context.getString(resourceId);
                C18740tg.A06(string);
                textView.setText(string);
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId2 != 0) {
                TextView textView2 = this.A01;
                if (textView2 == null) {
                    A0d = C36331k8.A0d("rowDescriptionView");
                    throw A0d;
                }
                String string2 = context.getString(resourceId2);
                C18740tg.A06(string2);
                textView2.setText(string2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(1, -1);
            if (resourceId3 != -1) {
                ImageView imageView = this.A00;
                if (imageView == null) {
                    A0d = C36331k8.A0d("rowIconView");
                    throw A0d;
                }
                imageView.setImageDrawable(C013105r.A01(context, resourceId3));
            }
            if (obtainStyledAttributes.hasValue(2)) {
                int resourceId4 = obtainStyledAttributes.getResourceId(2, -1);
                ImageView imageView2 = this.A00;
                if (imageView2 == null) {
                    A0d = C36331k8.A0d("rowIconView");
                    throw A0d;
                }
                imageView2.setColorFilter(AnonymousClass00F.A00(context, resourceId4), PorterDuff.Mode.SRC_ATOP);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A00(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateInfoRow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A00(context, attributeSet);
    }
}
