package X;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* renamed from: X.0sr  reason: invalid class name and case insensitive filesystem */
public class C18250sr extends C06570Uc {
    public Object A00;
    public final int A01;

    public C18250sr(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A03(View view, int i) {
        if (this.A01 != 0) {
            BottomSheetDragHandleView.A01((BottomSheetDragHandleView) this.A00, i);
        } else if (i == 5) {
            ((Dialog) this.A00).cancel();
        }
    }

    public void A02(View view, float f) {
    }
}
