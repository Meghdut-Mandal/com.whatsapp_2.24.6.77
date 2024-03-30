package com.whatsapp;

import X.AnonymousClass000;
import X.AnonymousClass22V;
import X.C012005e;
import X.C36331k8;
import X.C36391kE;
import X.C36411kG;
import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class ListItemWithLeftIcon extends AnonymousClass22V {
    public View A00;
    public View A01;

    public ListItemWithLeftIcon(Context context) {
        super(context, (AttributeSet) null);
    }

    public void setDescriptionVisibility(int i) {
        int i2;
        if (this.A00.getVisibility() != i) {
            this.A00.setVisibility(i);
            boolean A1Q = AnonymousClass000.A1Q(i);
            Resources resources = getResources();
            int i3 = R.dimen.f7nameremoved;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.f7nameremoved);
            Resources resources2 = getResources();
            if (A1Q) {
                i3 = R.dimen.f7nameremoved;
            }
            int dimensionPixelSize2 = resources2.getDimensionPixelSize(i3);
            this.A00.setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A01.getLayoutParams();
            int i4 = 3;
            if (A1Q) {
                i4 = 51;
            }
            layoutParams.gravity = i4;
            this.A01.setLayoutParams(layoutParams);
            WaImageView waImageView = this.A01;
            if (A1Q) {
                i2 = C36391kE.A07(this);
            } else {
                i2 = 0;
            }
            waImageView.setPadding(0, i2, 0, 0);
        }
    }

    public void setTitleTextColor(int i) {
        this.A06.setTextColor(i);
    }

    public void A05(AttributeSet attributeSet) {
        super.A05(attributeSet);
        this.A00 = C012005e.A02(this, R.id.list_item_with_left_icon);
        this.A01 = C012005e.A02(this, R.id.list_item_text_container);
        if (TextUtils.isEmpty(this.A00.getText())) {
            this.A00.setVisibility(8);
        }
    }

    public void A06(Spanned spanned, boolean z) {
        if (TextUtils.isEmpty(spanned)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        this.A00.setText(spanned);
        if (z) {
            C36331k8.A10(this.A00, this.A04);
            C36331k8.A16(this.A00, this.A02);
        }
    }

    public void A07(View view) {
        C36411kG.A0O(this, R.id.right_view_container).addView(view);
    }

    public int getRootLayoutID() {
        return R.layout.f9nameremoved;
    }

    public void setDescription(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            setDescriptionVisibility(8);
            return;
        }
        setDescriptionVisibility(0);
        super.setDescription(charSequence);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ListItemWithLeftIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
