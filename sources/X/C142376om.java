package X;

import android.content.Intent;

/* renamed from: X.6om  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C142376om implements C22908AyK {
    public final /* synthetic */ C174338Wd A00;

    public /* synthetic */ C142376om(C174338Wd r1) {
        this.A00 = r1;
    }

    public final void BTc() {
        C174338Wd r3 = this.A00;
        r3.setResult(0);
        Intent A0D = C36431kI.A0D();
        A0D.putExtra("get_collection_error_code", 404);
        r3.setIntent(A0D);
        r3.finish();
    }
}
