package com.whatsapp.conversation.ui;

import X.AnonymousClass00C;
import X.AnonymousClass15M;
import X.C35641j1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.whatsapp.HomeActivity;
import com.whatsapp.util.Log;

public final class ConversationsContainer extends LinearLayout {
    public AnonymousClass15M A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AnonymousClass15M r3;
        if (!(motionEvent == null || motionEvent.getAction() != 0 || (r3 = this.A00) == null)) {
            HomeActivity homeActivity = (HomeActivity) r3;
            homeActivity.A04.Boy(new C35641j1(homeActivity, 20));
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public final void setTouchCallback(AnonymousClass15M r2) {
        AnonymousClass00C.A0D(r2, 0);
        this.A00 = r2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationsContainer(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
    }
}
