package X;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import com.whatsapp.R;
import com.whatsapp.biz.product.view.fragment.ProductBottomSheet;

/* renamed from: X.BAk  reason: case insensitive filesystem */
public class C23228BAk implements C157997fd {
    public Object A00;
    public final int A01;

    public C23228BAk(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BZd(long j) {
        View view;
        C18820ts r2;
        int i;
        Object[] A0L;
        Window window;
        if (this.A01 != 0) {
            ProductBottomSheet productBottomSheet = (ProductBottomSheet) this.A00;
            Dialog dialog = productBottomSheet.A02;
            if (dialog != null && (window = dialog.getWindow()) != null && (view = window.getDecorView()) != null) {
                r2 = productBottomSheet.A09;
                if (r2 != null) {
                    i = R.plurals.f10nameremoved;
                    A0L = AnonymousClass001.A0L();
                    AnonymousClass000.A1M(A0L, 0, j);
                } else {
                    throw C36321k7.A09();
                }
            } else {
                return;
            }
        } else {
            AnonymousClass8WH r0 = (AnonymousClass8WH) this.A00;
            view = r0.A0u;
            r2 = r0.A00;
            i = R.plurals.f10nameremoved;
            A0L = AnonymousClass001.A0L();
            C90474aD.A1S(A0L, j);
        }
        C99304t3.A01(view, r2.A0L(A0L, i, j), -1).A0P();
    }
}
