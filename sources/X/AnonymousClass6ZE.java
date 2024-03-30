package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;

/* renamed from: X.6ZE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZE implements DialogInterface.OnShowListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0FL A01;
    public final /* synthetic */ C115235iY A02;
    public final /* synthetic */ AnonymousClass00S A03;

    public /* synthetic */ AnonymousClass6ZE(Activity activity, AnonymousClass0FL r2, C115235iY r3, AnonymousClass00S r4) {
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = activity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        AnonymousClass0FL r1 = this.A01;
        AnonymousClass00S r7 = this.A03;
        C115235iY r6 = this.A02;
        Activity activity = this.A00;
        View findViewById = r1.findViewById(R.id.design_bottom_sheet);
        C10770fC r8 = new C10770fC();
        if (findViewById != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
            AnonymousClass00C.A08(A022);
            A022.A0h = false;
            A022.A0Y(-1, false);
            A022.A0d(true);
            C10790fE r9 = new C10790fE();
            r9.element = -1;
            A022.A0a(new C99224sr(activity, A022, r6, r7, r8, r9));
            A022.A0W(3);
        }
    }
}
