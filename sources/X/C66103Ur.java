package X;

import android.animation.ValueAnimator;
import android.widget.ListView;
import com.whatsapp.contact.picker.SelectedListContactPickerFragment;

/* renamed from: X.3Ur  reason: invalid class name and case insensitive filesystem */
public final class C66103Ur implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SelectedListContactPickerFragment A00;

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass00C.A0D(valueAnimator, 0);
        SelectedListContactPickerFragment selectedListContactPickerFragment = this.A00;
        ListView listView = selectedListContactPickerFragment.A0D;
        if (listView != null) {
            SelectedListContactPickerFragment.A03(listView, selectedListContactPickerFragment, C36341k9.A03(valueAnimator));
        }
    }

    public C66103Ur(SelectedListContactPickerFragment selectedListContactPickerFragment) {
        this.A00 = selectedListContactPickerFragment;
    }
}
