package com.whatsapp.group;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.C05250Oz;
import X.C36381kD;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class CustomGroupMembershipApprovalRequestRejectWDSButton extends WDSButton {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context) {
        super(context, (AttributeSet) null);
        AnonymousClass00C.A0D(context, 1);
    }

    public void setupBackgroundStyle(ColorStateList colorStateList) {
        AnonymousClass00C.A0D(colorStateList, 0);
        ColorStateList A04 = AnonymousClass00F.A04(getContext(), R.color.f6nameremoved);
        if (A04 != null) {
            colorStateList = A04;
        }
        super.setupBackgroundStyle(colorStateList);
    }

    public void setupContentStyle(ColorStateList colorStateList) {
        AnonymousClass00C.A0D(colorStateList, 0);
        ColorStateList A04 = AnonymousClass00F.A04(getContext(), R.color.f6nameremoved);
        if (A04 != null) {
            colorStateList = A04;
        }
        super.setupContentStyle(colorStateList);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }

    public /* synthetic */ CustomGroupMembershipApprovalRequestRejectWDSButton(Context context, AttributeSet attributeSet, int i, C05250Oz r5) {
        this(context, C36381kD.A0I(attributeSet, i));
    }
}
