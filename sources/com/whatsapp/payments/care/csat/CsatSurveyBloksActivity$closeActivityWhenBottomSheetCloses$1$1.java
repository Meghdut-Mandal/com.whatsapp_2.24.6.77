package com.whatsapp.payments.care.csat;

import X.AnonymousClass00N;
import X.AnonymousClass02E;
import X.AnonymousClass05R;
import androidx.lifecycle.OnLifecycleEvent;

public final class CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1 implements AnonymousClass00N {
    public final /* synthetic */ AnonymousClass02E A00;
    public final /* synthetic */ CsatSurveyBloksActivity A01;

    public CsatSurveyBloksActivity$closeActivityWhenBottomSheetCloses$1$1(AnonymousClass02E r1, CsatSurveyBloksActivity csatSurveyBloksActivity) {
        this.A00 = r1;
        this.A01 = csatSurveyBloksActivity;
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    public final void onFragmentDestroyed() {
        this.A00.A0P.A05(this);
        this.A01.finish();
    }
}
