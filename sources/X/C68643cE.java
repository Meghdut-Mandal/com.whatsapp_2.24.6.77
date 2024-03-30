package X;

import android.content.Intent;

/* renamed from: X.3cE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C68643cE implements C22908AyK {
    public final /* synthetic */ C225314u A00;
    public final /* synthetic */ C24671Di A01;

    public /* synthetic */ C68643cE(C225314u r1, C24671Di r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void BTc() {
        C24671Di r0 = this.A01;
        C225314u r2 = this.A00;
        Intent A0C = C36431kI.A0C();
        A0C.setData(((C33771fu) r0.A01.get()).A00());
        r2.startActivity(A0C);
    }
}
