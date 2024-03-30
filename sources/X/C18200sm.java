package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0sm  reason: invalid class name and case insensitive filesystem */
public class C18200sm extends AnonymousClass05A {
    public final int A00;

    public C18200sm(int i) {
        this.A00 = i;
    }

    public float BCB(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationY = view.getTranslationY();
        float height = (float) viewGroup.getHeight();
        if (i != 0) {
            return translationY + height;
        }
        return translationY - height;
    }
}
