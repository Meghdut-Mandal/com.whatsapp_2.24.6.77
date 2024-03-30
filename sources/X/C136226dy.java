package X;

import android.view.MenuItem;
import com.whatsapp.IntentChooserBottomSheetDialogFragment;

/* renamed from: X.6dy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C136226dy implements AnonymousClass07G {
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A00;

    public /* synthetic */ C136226dy(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment) {
        this.A00 = intentChooserBottomSheetDialogFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = this.A00;
        if (intentChooserBottomSheetDialogFragment.A0P.A02.compareTo(AnonymousClass01P.STARTED) < 0) {
            return false;
        }
        Integer num = intentChooserBottomSheetDialogFragment.A06;
        if (num == null) {
            intentChooserBottomSheetDialogFragment.A0i().startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
        } else {
            AnonymousClass02E A0L = intentChooserBottomSheetDialogFragment.A0l().A0L(num.intValue());
            C18740tg.A06(A0L);
            A0L.startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
        }
        intentChooserBottomSheetDialogFragment.A1b();
        return true;
    }
}
