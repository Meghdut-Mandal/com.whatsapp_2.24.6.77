package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2;

/* renamed from: X.2Kw  reason: invalid class name and case insensitive filesystem */
public class C44032Kw implements AnonymousClass00P, AnonymousClass00S {
    public Object A00;
    public final int A01;

    public C44032Kw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object invoke() {
        switch (this.A01) {
            case 0:
                C33741fr.A01((C33741fr) this.A00);
                break;
            case 1:
                C33821fz r3 = (C33821fz) this.A00;
                C36331k8.A0w(C19420v0.A00(r3.A04), "storage_usage_banner_dismissed", true);
                r3.A00.setVisibility(8);
                break;
            case 2:
                return Integer.valueOf(CallsHistoryFragmentV2.A00((CallsHistoryFragmentV2) this.A00, true));
            default:
                AnonymousClass02E r4 = (AnonymousClass02E) this.A00;
                Context A1D = r4.A1D();
                Intent A0D = C36431kI.A0D();
                A0D.setClassName(A1D.getPackageName(), "com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity");
                A0D.putExtra("com.whatsapp.calling.favorite.calllist.FavoriteCallListActivity.edit", false);
                r4.A1C(A0D);
                return 0;
        }
        return AnonymousClass0AJ.A00;
    }
}
