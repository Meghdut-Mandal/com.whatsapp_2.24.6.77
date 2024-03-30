package X;

import android.view.View;

/* renamed from: X.3aM  reason: invalid class name and case insensitive filesystem */
public abstract class C67713aM implements C17190qs {
    public void BR6(View view) {
        if (this instanceof AnonymousClass2GY) {
            AnonymousClass2GY r2 = (AnonymousClass2GY) this;
            if (r2.A03 != 0) {
                view.setTranslationX(0.0f);
            }
            if (r2.A04 != 0) {
                view.setTranslationY(0.0f);
            }
        } else if ((this instanceof AnonymousClass4W5) && 1 - ((AnonymousClass4W5) this).A03 == 0) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }
}
