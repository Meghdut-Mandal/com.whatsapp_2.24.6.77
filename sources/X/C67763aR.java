package X;

import android.os.Bundle;

/* renamed from: X.3aR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67763aR implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass01I A00;
    public final /* synthetic */ C33431fJ A01;

    public /* synthetic */ C67763aR(AnonymousClass01I r1, C33431fJ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BYP(String str, Bundle bundle) {
        C33431fJ r3 = this.A01;
        AnonymousClass01I r2 = this.A00;
        if ("request_bottom_sheet_fragment".equals(str)) {
            r3.A00();
        }
        r2.getSupportFragmentManager().A0m("request_bottom_sheet_fragment");
    }
}
