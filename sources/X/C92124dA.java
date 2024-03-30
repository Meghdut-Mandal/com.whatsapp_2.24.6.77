package X;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: X.4dA  reason: invalid class name and case insensitive filesystem */
public class C92124dA extends OrientationEventListener {
    public int A00;
    public final /* synthetic */ C1030553k A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92124dA(Context context, C1030553k r3) {
        super(context);
        this.A01 = r3;
        this.A00 = r3.A0U.getRotation();
    }

    public void onOrientationChanged(int i) {
        int i2;
        C1030553k r3 = this.A01;
        int rotation = r3.A0U.getRotation();
        if (!(rotation == -1 || rotation == (i2 = this.A00) || AnonymousClass000.A05(i2, rotation) % 2 != 0)) {
            r3.surfaceChanged(r3.A0V, 0, 0, 0);
        }
        this.A00 = rotation;
    }

    public void enable() {
        super.enable();
        this.A00 = this.A01.A0U.getRotation();
    }
}
