package X;

import android.hardware.camera2.CameraAccessException;
import java.util.concurrent.Callable;

/* renamed from: X.AYa  reason: case insensitive filesystem */
public class C21723AYa implements Callable {
    public final /* synthetic */ C202989n4 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public C21723AYa(C202989n4 r1, boolean z, boolean z2) {
        this.A00 = r1;
        this.A01 = z;
        this.A02 = z2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        try {
            this.A00.A0B(this.A01, this.A02);
            return null;
        } catch (CameraAccessException | IllegalArgumentException unused) {
            return null;
        } catch (Exception e) {
            throw new C21829Ab6(C36331k8.A0i("Could not start preview: ", AnonymousClass000.A0u(), e));
        }
    }
}
