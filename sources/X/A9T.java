package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class A9T implements C22921AyX {
    public final WaTextView A00;

    public A9T(View view) {
        WaTextView A0Q = C36351kA.A0Q(view, R.id.title);
        this.A00 = A0Q;
        C33521fV.A07(view, true);
        C33511fU.A03(A0Q);
    }

    public void BSD(C22922AyY ayY) {
        int i;
        int i2 = ((A9X) ayY).A00;
        if (i2 == 0) {
            i = R.string.f12nameremoved;
        } else if (i2 != 1) {
            i = R.string.f12nameremoved;
            if (i2 != 2) {
                i = R.string.f12nameremoved;
            }
        } else {
            i = R.string.f12nameremoved;
        }
        this.A00.setText(i);
    }
}
