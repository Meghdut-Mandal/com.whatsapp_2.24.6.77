package com.whatsapp.calling.wds;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.C34301gn;
import X.C36381kD;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public class CallingMediaWDSButton extends WDSButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CallingMediaWDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        setAction(C34301gn.MEDIA);
    }

    public static final ColorStateList A01(int[] iArr) {
        return new ColorStateList(new int[][]{new int[]{16842913}, new int[]{16842919}, new int[]{-16842910}, new int[0]}, iArr);
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        AnonymousClass00C.A0D(colorStateList, 0);
        ColorStateList backgroundColorStateList = getBackgroundColorStateList();
        if (backgroundColorStateList != null) {
            colorStateList = backgroundColorStateList;
        }
        super.setupBackgroundStyle(colorStateList);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        AnonymousClass00C.A0D(colorStateList, 0);
        ColorStateList contentColorStateList = getContentColorStateList();
        if (contentColorStateList != null) {
            colorStateList = contentColorStateList;
        }
        super.setupContentStyle(colorStateList);
    }

    private final ColorStateList getBackgroundColorStateList() {
        int[] iArr;
        int i;
        Context context;
        int ordinal = this.A06.ordinal();
        if (ordinal == 1) {
            iArr = new int[4];
            iArr[0] = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            iArr[1] = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            context = getContext();
            i = R.color.f6nameremoved;
        } else if (ordinal != 3) {
            return null;
        } else {
            iArr = new int[4];
            iArr[0] = AnonymousClass00F.A00(getContext(), R.color.f6nameremoved);
            Context context2 = getContext();
            i = R.color.f6nameremoved;
            iArr[1] = AnonymousClass00F.A00(context2, R.color.f6nameremoved);
            context = getContext();
        }
        iArr[2] = AnonymousClass00F.A00(context, i);
        iArr[3] = C36381kD.A05(this, i);
        return A01(iArr);
    }

    public ColorStateList getContentColorStateList() {
        int ordinal = this.A06.ordinal();
        if (ordinal != 1 && ordinal != 3) {
            return null;
        }
        return A01(new int[]{AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), AnonymousClass00F.A00(getContext(), R.color.f6nameremoved), C36381kD.A05(this, R.color.f6nameremoved)});
    }
}
