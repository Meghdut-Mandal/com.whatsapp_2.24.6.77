package X;

import android.hardware.Camera;
import java.util.Objects;

/* renamed from: X.6ZQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZQ implements Camera.AutoFocusCallback {
    public final /* synthetic */ C1030553k A00;

    public /* synthetic */ AnonymousClass6ZQ(C1030553k r1) {
        this.A00 = r1;
    }

    public final void onAutoFocus(boolean z, Camera camera) {
        C160747lW r0 = this.A00.A0E;
        Objects.requireNonNull(r0);
        r0.BRe(z);
    }
}
