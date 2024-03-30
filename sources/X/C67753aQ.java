package X;

import android.os.Bundle;

/* renamed from: X.3aQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67753aQ implements AnonymousClass05T {
    public final /* synthetic */ AnonymousClass01L A00;
    public final /* synthetic */ AnonymousClass4Q1 A01;

    public /* synthetic */ C67753aQ(AnonymousClass01L r1, AnonymousClass4Q1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BYP(String str, Bundle bundle) {
        AnonymousClass4Q1 r4 = this.A01;
        AnonymousClass01L r3 = this.A00;
        AnonymousClass00C.A0D(str, 2);
        if (str.hashCode() == -860456940 && str.equals("request_bottom_sheet_fragment") && r4 != null) {
            r4.BQn();
        }
        r3.getSupportFragmentManager().A0m("request_bottom_sheet_fragment");
    }
}
