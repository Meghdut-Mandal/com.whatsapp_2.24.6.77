package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0sl  reason: invalid class name and case insensitive filesystem */
public class C18190sl extends AnonymousClass059 {
    public final int A00;

    public C18190sl(int i) {
        this.A00 = i;
    }

    public float BCA(View view, ViewGroup viewGroup) {
        int i = this.A00;
        float translationX = view.getTranslationX();
        float width = (float) viewGroup.getWidth();
        if (i != 0) {
            return translationX + width;
        }
        return translationX - width;
    }
}
