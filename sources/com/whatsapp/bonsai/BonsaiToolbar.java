package com.whatsapp.bonsai;

import X.AnonymousClass00C;
import X.AnonymousClass1RC;
import X.C100714vT;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import com.whatsapp.R;

public final class BonsaiToolbar extends C100714vT {
    public Activity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Activity activity = this.A00;
        if (activity != null) {
            AnonymousClass1RC.A05(activity, R.color.f6nameremoved);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BonsaiToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }
}
