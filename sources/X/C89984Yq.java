package X;

import android.view.View;
import com.whatsapp.expressionstray.conversation.ExpressionsBottomSheetView;

/* renamed from: X.4Yq  reason: invalid class name and case insensitive filesystem */
public class C89984Yq implements AnonymousClass7gY {
    public Object A00;
    public final int A01;

    public C89984Yq(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BXD() {
        View view;
        Runnable r3;
        long A002;
        int i;
        if (this.A01 != 0) {
            AnonymousClass3UT r2 = (AnonymousClass3UT) this.A00;
            ExpressionsBottomSheetView expressionsBottomSheetView = r2.A0E;
            if (expressionsBottomSheetView != null) {
                if (r2 instanceof C44152Mc) {
                    i = 4;
                } else if (r2 instanceof AnonymousClass2Mb) {
                    i = 3;
                } else {
                    i = 7;
                }
                expressionsBottomSheetView.A0F((Integer) null, (Integer) null, (Integer) null, (Integer) null, i);
            }
            view = r2.A09;
            if (view != null) {
                r3 = C80243v5.A00(r2, 9);
                A002 = (long) (((float) 50) * AnonymousClass3UT.A00(r2));
            } else {
                return;
            }
        } else {
            C54632tG r1 = (C54632tG) this.A00;
            C70803fk r22 = (C70803fk) r1.A00;
            ExpressionsBottomSheetView expressionsBottomSheetView2 = r22.A3l;
            if (expressionsBottomSheetView2 != null) {
                expressionsBottomSheetView2.A0F((Integer) null, (Integer) null, (Integer) null, (Integer) null, C70803fk.A02(r22));
            }
            view = r22.A4B;
            r3 = new C81103wT((Object) r1, 37);
            A002 = (long) ((int) (C70803fk.A00(r22) * 50.0f));
        }
        view.postDelayed(r3, A002);
    }
}
