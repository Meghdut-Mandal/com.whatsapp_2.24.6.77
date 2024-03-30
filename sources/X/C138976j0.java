package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.factory.bloks.BloksCameraFactory;

/* renamed from: X.6j0  reason: invalid class name and case insensitive filesystem */
public final class C138976j0 implements AnonymousClass7eD {
    public C23114B5t B4g(Context context) {
        if (context != null) {
            C23114B5t createLiteCameraController = BloksCameraFactory.createLiteCameraController(context);
            createLiteCameraController.Brj(921600);
            createLiteCameraController.BrY(false);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        throw C36381kD.A0l();
    }
}
