package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3dL  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C69323dL implements C22914AyQ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C225314u A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C69323dL(C225314u r1, List list, int i) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = i;
    }

    public final void BRO(C21097A8i a8i) {
        C225314u r7 = this.A01;
        List list = this.A02;
        int i = this.A00;
        Resources resources = r7.getResources();
        int size = list.size();
        Object[] A0M = AnonymousClass001.A0M();
        AnonymousClass000.A1J(A0M, i + 1);
        AnonymousClass000.A1L(A0M, list.size(), 1);
        String quantityString = resources.getQuantityString(R.plurals.f10nameremoved, size, A0M);
        if (AnonymousClass15V.A02) {
            r7.Bwu(quantityString);
        } else {
            r7.A3G(quantityString);
        }
        Log.i("product-details/send-product/async load begin");
    }
}
