package X;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: X.4eO  reason: invalid class name and case insensitive filesystem */
public final class C92694eO extends EdgeEffect {
    public float A00;
    public final float A01;

    public void onAbsorb(int i) {
        this.A00 = 0.0f;
        super.onAbsorb(i);
    }

    public void onPull(float f) {
        this.A00 = 0.0f;
        super.onPull(f);
    }

    public void onRelease() {
        this.A00 = 0.0f;
        super.onRelease();
    }

    public C92694eO(Context context) {
        super(context);
        this.A01 = ((float) 1) * AnonymousClass5XZ.A00(context).A00;
    }

    public void onPull(float f, float f2) {
        this.A00 = 0.0f;
        super.onPull(f, f2);
    }
}
