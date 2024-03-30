package X;

import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.Matrix;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: X.5zB  reason: invalid class name and case insensitive filesystem */
public class C125015zB {
    public int A00 = 0;
    public int A01 = -12345;
    public SurfaceTexture A02;
    public AnonymousClass6TK A03;
    public AnonymousClass67V A04;
    public AnonymousClass65N A05;
    public AnonymousClass6OY A06;
    public AnonymousClass65W A07;
    public boolean A08;
    public final EGLDisplay A09;
    public final EGLSurface A0A;
    public final C120865sD A0B;
    public final C131296Om A0C;
    public final AnonymousClass6NG A0D = new AnonymousClass6NG();
    public final List A0E;
    public final float[] A0F;
    public final float[] A0G;
    public final float[] A0H;
    public final float[] A0I;
    public final EGLContext A0J;

    public C125015zB(EGLContext eGLContext, EGLDisplay eGLDisplay, EGLSurface eGLSurface, C131296Om r18, AnonymousClass65N r19, AnonymousClass6OY r20, AnonymousClass65W r21) {
        int i;
        int i2;
        AnonymousClass62W r3 = new AnonymousClass62W();
        r3.A00 = 5;
        r3.A00(new C118575oM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}), "aPosition");
        this.A0B = C118575oM.A00(r3, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        float[] fArr = new float[16];
        this.A0H = fArr;
        float[] fArr2 = new float[16];
        this.A0F = fArr2;
        float[] fArr3 = new float[16];
        this.A0I = fArr3;
        float[] fArr4 = new float[16];
        this.A0G = fArr4;
        C131296Om r0 = r18;
        Objects.requireNonNull(r0);
        this.A0C = r0;
        AnonymousClass6OY r32 = r20;
        this.A06 = r32;
        this.A0J = eGLContext;
        this.A09 = eGLDisplay;
        this.A0A = eGLSurface;
        boolean z = r32.A0H;
        this.A08 = z;
        if (z) {
            List list = r32.A0F;
            if (list == null) {
                list = AnonymousClass001.A0I();
                r32.A0F = list;
            }
            if (list.isEmpty()) {
                r32.A0F.add(new C141116mh(false));
            }
        }
        List list2 = this.A06.A0F;
        this.A0E = list2 == null ? Collections.emptyList() : list2;
        this.A07 = r21;
        this.A05 = r19;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr3, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr4, 0);
        RectF rectF = r32.A0B;
        Matrix.translateM(fArr2, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr2, 0, r32.A0B.width(), r32.A0B.height(), 1.0f);
        if (r32.A0I) {
            if (r32.A05 % 180 != 0) {
                i = r32.A04;
                i2 = r32.A06;
            } else {
                i = r32.A06;
                i2 = r32.A04;
            }
            float width = (((float) i) * r32.A0B.width()) / (((float) i2) * r32.A0B.height());
            Matrix.scaleM(fArr4, 0, 1.0f, (((float) r32.A09) / (r32.A08 % 180 != 0 ? 1.0f / width : width)) / ((float) r32.A07), 1.0f);
        }
        Matrix.translateM(fArr2, 0, 0.5f, 0.5f, 0.0f);
        if (r32.A0D == C023109s.A01) {
            Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr2, 0, (float) r32.A08, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr2, 0, -0.5f, -0.5f, 0.0f);
    }
}
