package com.whatsapp.xfamily.crossposting.snackbar;

import X.AnonymousClass012;
import X.AnonymousClass15K;
import X.AnonymousClass3ZU;
import X.C003101g;
import X.C132686Uv;
import X.C33541fX;

public final class CrosspostSnackbarManager$displaySnackBar$1$1 implements C003101g {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass15K A02;
    public final /* synthetic */ C33541fX A03;
    public final /* synthetic */ C132686Uv A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ void BVQ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BcJ(AnonymousClass012 r1) {
    }

    public /* synthetic */ void BhA(AnonymousClass012 r1) {
    }

    public /* synthetic */ void Bhq(AnonymousClass012 r1) {
    }

    public CrosspostSnackbarManager$displaySnackBar$1$1(AnonymousClass15K r1, C33541fX r2, C132686Uv r3, String str, int i, int i2) {
        this.A04 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = str;
        this.A03 = r2;
        this.A02 = r1;
    }

    public void BfS(AnonymousClass012 r6) {
        C132686Uv r4 = this.A04;
        int i = this.A01;
        int i2 = this.A00;
        AnonymousClass3ZU A002 = C132686Uv.A00(this.A03, r4, this.A05, i, i2);
        if (A002 != null) {
            A002.A02();
        }
        this.A02.getLifecycle().A05(this);
    }
}
