package X;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.util.Log;

/* renamed from: X.7pe  reason: invalid class name and case insensitive filesystem */
public class C163097pe implements SurfaceTexture.OnFrameAvailableListener {
    public Object A00;
    public final int A01;

    public C163097pe(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C157787eg r0;
        switch (this.A01) {
            case 0:
                r0 = ((C140206lD) this.A00).A04;
                break;
            case 1:
                C140196lC r1 = (C140196lC) this.A00;
                if (surfaceTexture == r1.A02) {
                    r0 = r1.A03;
                    break;
                } else {
                    return;
                }
            default:
                C1030553k r6 = (C1030553k) this.A00;
                AnonymousClass677 r12 = r6.A0C;
                if (r12 != null && r6.A03 != null && r6.A0D != null && r6.A0B != null && r6.A0M) {
                    r12.A00();
                    r6.A03.updateTexImage();
                    SurfaceTexture surfaceTexture2 = r6.A03;
                    float[] fArr = r6.A0X;
                    surfaceTexture2.getTransformMatrix(fArr);
                    GLES20.glViewport(0, 0, r6.getWidth(), r6.getHeight());
                    r6.A0B.A00(r6.A02, fArr);
                    AnonymousClass677 r13 = r6.A0C;
                    C132706Ux r02 = r13.A01;
                    if (!EGL14.eglSwapBuffers(r02.A02, r13.A00)) {
                        Log.d("Grafika", "WARNING: swapBuffers() failed");
                    }
                    r6.A0D.A00();
                    AnonymousClass677 r03 = r6.A0D;
                    C132706Ux r4 = r03.A01;
                    int[] iArr = new int[1];
                    EGL14.eglQuerySurface(r4.A02, r03.A00, 12375, iArr, 0);
                    int i = iArr[0];
                    AnonymousClass677 r04 = r6.A0D;
                    C132706Ux r42 = r04.A01;
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(r42.A02, r04.A00, 12374, iArr2, 0);
                    GLES20.glViewport(0, 0, i, iArr2[0]);
                    r6.A0B.A00(r6.A02, C132866Vo.A00);
                    AnonymousClass677 r14 = r6.A0D;
                    C132706Ux r05 = r14.A01;
                    if (!EGL14.eglSwapBuffers(r05.A02, r14.A00)) {
                        Log.d("Grafika", "WARNING: swapBuffers() failed");
                        return;
                    }
                    return;
                }
                return;
        }
        if (r0 != null) {
            r0.BYQ();
        }
    }
}
