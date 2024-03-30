package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.3WE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3WE implements DialogInterface.OnShowListener {
    public static final /* synthetic */ AnonymousClass3WE A00 = new AnonymousClass3WE();

    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        C18740tg.A04(findViewById);
        BottomSheetBehavior A02 = BottomSheetBehavior.A02(findViewById);
        A02.A0W(3);
        A02.A0V(findViewById.getHeight());
    }
}
