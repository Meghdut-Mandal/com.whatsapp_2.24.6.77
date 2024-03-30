package X;

import android.graphics.drawable.Drawable;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;
import java.util.Iterator;

/* renamed from: X.65u  reason: invalid class name */
public final class AnonymousClass65u {
    public final /* synthetic */ C90694aZ A00;

    public AnonymousClass65u(C90694aZ r1) {
        this.A00 = r1;
    }

    public void A00(int i) {
        PenModeView penModeView = this.A00.A09;
        if (penModeView == null) {
            throw C36331k8.A0d("penModeView");
        }
        Iterator it = penModeView.A01.iterator();
        while (it.hasNext()) {
            C36431kI.A0K(it).setBackground((Drawable) null);
        }
        int i2 = R.id.pen_mode_thin;
        if (i != 1) {
            i2 = R.id.pen_mode_medium;
            if (i != 2) {
                i2 = R.id.pen_mode_thick;
                if (i != 3) {
                    if (i == 4) {
                        i2 = R.id.pen_mode_blur;
                    } else {
                        return;
                    }
                }
            }
        }
        C012005e.A02(penModeView, i2).setBackgroundResource(R.drawable.pen_mode_selected_background);
    }

    public void A01(int i) {
        C91184bb r0 = this.A00.A08;
        if (r0 == null) {
            throw C36331k8.A0d("penButtonBackground");
        }
        r0.A00(i);
    }
}
