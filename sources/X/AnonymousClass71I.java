package X;

import android.util.Log;

/* renamed from: X.71I  reason: invalid class name */
public class AnonymousClass71I implements C160217ke {
    public final /* synthetic */ C120315rJ A00;
    public final /* synthetic */ String A01;

    public void BfG(String str) {
    }

    public AnonymousClass71I(C120315rJ r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void BfE(C122855vX r6) {
        int i = r6.A00;
        StringBuilder A0u = AnonymousClass000.A0u();
        if (i == 5) {
            A0u.append("BLOKS: Prefetch successful (");
            A0u.append(this.A01);
        } else {
            A0u.append("BLOKS: Prefetch failed (");
            A0u.append(this.A01);
            A0u.append(", status=");
            A0u.append(i);
        }
        Log.v("WaBkPreloadHelper", AnonymousClass000.A0q(")", A0u));
    }

    public void Bf6(C121065sX r3) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Should not prefetch async actions: ");
        Log.e("WaBkPreloadHelper", AnonymousClass000.A0q(this.A01, A0u));
    }
}
