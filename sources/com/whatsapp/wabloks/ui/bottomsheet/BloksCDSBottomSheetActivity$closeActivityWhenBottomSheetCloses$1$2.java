package com.whatsapp.wabloks.ui.bottomsheet;

import X.AnonymousClass012;
import X.AnonymousClass02E;
import X.C003101g;

public final class BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2 implements C003101g {
    public final /* synthetic */ AnonymousClass02E A00;
    public final /* synthetic */ BloksCDSBottomSheetActivity A01;

    public /* synthetic */ void BcJ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BfS(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BhA(AnonymousClass012 r1) {
    }

    public /* synthetic */ void Bhq(AnonymousClass012 r1) {
    }

    public BloksCDSBottomSheetActivity$closeActivityWhenBottomSheetCloses$1$2(AnonymousClass02E r1, BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity) {
        this.A00 = r1;
        this.A01 = bloksCDSBottomSheetActivity;
    }

    public void BVQ(AnonymousClass012 r3) {
        this.A00.A0P.A05(this);
        BloksCDSBottomSheetActivity bloksCDSBottomSheetActivity = this.A01;
        if (bloksCDSBottomSheetActivity.getSupportFragmentManager().A0I() == 0) {
            bloksCDSBottomSheetActivity.finish();
        }
    }
}
