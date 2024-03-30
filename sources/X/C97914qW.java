package X;

import android.opengl.EGL14;
import java.util.Objects;

/* renamed from: X.4qW  reason: invalid class name and case insensitive filesystem */
public class C97914qW extends C1263663q {
    public C97914qW(C133216Xg r6) {
        super(r6);
        C133216Xg r0 = this.A01;
        this.A00 = EGL14.eglCreatePbufferSurface(r0.A04, r0.A02, new int[]{12375, 8, 12374, 8, 12344}, 0);
        C200339hB.A01("eglCreatePbufferSurface");
        Objects.requireNonNull(this.A00);
    }
}
