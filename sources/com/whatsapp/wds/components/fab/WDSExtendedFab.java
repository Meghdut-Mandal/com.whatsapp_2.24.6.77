package com.whatsapp.wds.components.fab;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C27991Qq;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.whatsapp.R;

public final class WDSExtendedFab extends MaterialButton {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context) {
        this(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 1073741824));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSExtendedFab(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.f4nameremoved);
        AnonymousClass00C.A0D(context, 1);
        if (attributeSet != null) {
            int[] iArr = C27991Qq.A07;
            AnonymousClass00C.A09(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(4, 0);
            if (resourceId != 0) {
                setContentDescription(context.getString(resourceId));
            }
            int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId2 != 0) {
                setHint(resourceId2);
            }
            int resourceId3 = obtainStyledAttributes.getResourceId(3, 0);
            if (resourceId3 != 0) {
                setImeActionLabel(context.getString(resourceId3), getImeActionId());
            }
            int resourceId4 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId4 != 0) {
                setText(resourceId4);
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WDSExtendedFab(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
