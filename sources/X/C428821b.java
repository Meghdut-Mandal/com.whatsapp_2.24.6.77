package X;

import android.view.animation.Animation;
import android.widget.ListView;
import com.whatsapp.KeyboardPopupLayout;

/* renamed from: X.21b  reason: invalid class name and case insensitive filesystem */
public class C428821b extends C67243Zb {
    public final int A00;
    public final ListView A01;
    public final KeyboardPopupLayout A02;

    public void onAnimationEnd(Animation animation) {
        this.A02.setClipChildren(true);
        this.A01.setTranscriptMode(this.A00);
    }

    public C428821b(ListView listView, KeyboardPopupLayout keyboardPopupLayout, int i) {
        this.A02 = keyboardPopupLayout;
        this.A01 = listView;
        this.A00 = i;
    }
}
