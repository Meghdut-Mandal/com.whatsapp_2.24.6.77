package com.whatsapp.conversation.conversationrow.nativeflow.commerce.extensions;

import X.AnonymousClass00C;
import X.AnonymousClass00N;
import X.AnonymousClass012;
import X.AnonymousClass01G;
import X.AnonymousClass05R;
import X.C1259261w;
import androidx.lifecycle.OnLifecycleEvent;

public final class AndroidOreoOrientationIssueHandler$lifecycleObserver$1 implements AnonymousClass00N {
    public final /* synthetic */ C1259261w A00;

    @OnLifecycleEvent(AnonymousClass05R.ON_RESUME)
    public final void onResumed(AnonymousClass012 r2) {
        Integer num;
        AnonymousClass00C.A0D(r2, 0);
        if ((r2 instanceof AnonymousClass01G) && (num = this.A00.A00) != null) {
            AnonymousClass01G r22 = (AnonymousClass01G) r2;
            r22.setRequestedOrientation(num.intValue());
            r22.A06.A05(this);
        }
    }

    public AndroidOreoOrientationIssueHandler$lifecycleObserver$1(C1259261w r1) {
        this.A00 = r1;
    }
}
