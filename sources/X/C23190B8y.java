package X;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import java.util.UUID;
import org.pjsip.PjCamera;

/* renamed from: X.B8y  reason: case insensitive filesystem */
public class C23190B8y implements Camera.ErrorCallback {
    public Object A00;
    public final int A01;

    public C23190B8y(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i, Camera camera) {
        String str;
        if (this.A01 != 0) {
            ((PjCamera) this.A00).m81lambda$startOnCameraThread$0$orgpjsipPjCamera(i, camera);
            return;
        }
        A29 a29 = (A29) this.A00;
        boolean z = false;
        if (i != 1) {
            if (i == 2) {
                str = "Camera evicted. Camera service was likely given to another customer. Camera resources will be released.";
            } else if (i != 100) {
                str = AnonymousClass000.A0r("Unknown error code: ", AnonymousClass000.A0u(), i);
            } else {
                str = "Camera server died. Camera resources will be released.";
            }
            z = true;
        } else {
            str = "Unknown error";
        }
        List list = a29.A0P.A00;
        UUID uuid = a29.A0R.A03;
        AnonymousClass9PG r2 = a29.A0c;
        if (r2 != null && !r2.A00.isEmpty()) {
            C202399lk.A00(new AnonymousClass751(7, str, r2));
        }
        Log.e("Camera1Device", str);
        a29.A0S.A05(new C1502674p(a29, list, new AnonymousClass78P(i, str), uuid, 0, z), uuid);
    }
}
