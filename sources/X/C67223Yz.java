package X;

import android.view.View;
import com.whatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.3Yz  reason: invalid class name and case insensitive filesystem */
public class C67223Yz implements View.OnLayoutChangeListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextStatusComposerActivity A01;

    public C67223Yz(TextStatusComposerActivity textStatusComposerActivity, int i) {
        this.A01 = textStatusComposerActivity;
        this.A00 = i;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        TextStatusComposerActivity.A0l(this.A01, this.A00);
    }
}
