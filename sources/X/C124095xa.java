package X;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.view.Surface;

/* renamed from: X.5xa  reason: invalid class name and case insensitive filesystem */
public class C124095xa {
    public EGLContext A00 = EGL14.EGL_NO_CONTEXT;
    public EGLDisplay A01 = EGL14.EGL_NO_DISPLAY;
    public EGLSurface A02 = EGL14.EGL_NO_SURFACE;
    public final Surface A03;
    public final C131296Om A04;
    public final AnonymousClass65W A05;
    public final /* synthetic */ C114985i9 A06;

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x024a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C124095xa(android.content.Context r25, android.view.Surface r26, X.AnonymousClass65N r27, X.AnonymousClass6OY r28, X.C114985i9 r29, X.AnonymousClass65W r30) {
        /*
            r24 = this;
            r10 = 0
            r9 = r24
            r11 = r29
            r9.A06 = r11
            r9.<init>()
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            r9.A01 = r0
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            r9.A00 = r0
            android.opengl.EGLSurface r0 = android.opengl.EGL14.EGL_NO_SURFACE
            r9.A02 = r0
            r14 = r30
            r9.A05 = r14
            android.content.res.Resources r1 = r25.getResources()
            X.6Om r0 = new X.6Om
            r0.<init>(r1)
            r9.A04 = r0
            r0 = r26
            r9.A03 = r0
            X.5zB r0 = r11.A00
            if (r0 != 0) goto L_0x0244
            r8 = 0
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r8)
            r9.A01 = r1
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r1 == r0) goto L_0x021e
            r13 = 2
            int[] r0 = new int[r13]
            r7 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r1, r0, r8, r0, r7)
            if (r0 == 0) goto L_0x0215
            android.view.Surface r6 = r9.A03
            r23 = 4
            r22 = 4
            if (r6 != 0) goto L_0x004c
            r22 = 1
        L_0x004c:
            r21 = 9
            r20 = 12321(0x3021, float:1.7265E-41)
            r19 = 12322(0x3022, float:1.7267E-41)
            r5 = 6
            r18 = 12323(0x3023, float:1.7268E-41)
            r17 = 12324(0x3024, float:1.727E-41)
            r16 = 12352(0x3040, float:1.7309E-41)
            r2 = 17
            r4 = 5
            r3 = 3
            r12 = 7
            r15 = 12344(0x3038, float:1.7298E-41)
            r1 = 10
            r0 = 8
            int[] r2 = new int[r2]
            r2[r8] = r16
            r2[r7] = r23
            r2[r13] = r17
            r2[r3] = r0
            r2[r23] = r18
            r2[r4] = r0
            r2[r5] = r19
            r2[r12] = r0
            r2[r0] = r20
            r2[r21] = r0
            r0 = 12325(0x3025, float:1.7271E-41)
            r2[r1] = r0
            r0 = 11
            r2[r0] = r8
            r1 = 12327(0x3027, float:1.7274E-41)
            r0 = 12
            r2[r0] = r1
            r0 = 13
            r2[r0] = r15
            r1 = 14
            r0 = 12339(0x3033, float:1.729E-41)
            r2[r1] = r0
            r0 = 15
            r2[r0] = r22
            r0 = 16
            r2[r0] = r15
            android.opengl.EGLConfig[] r1 = new android.opengl.EGLConfig[r7]
            int[] r13 = new int[r7]
            android.opengl.EGLDisplay r12 = r9.A01
            r0 = 0
            r18 = 0
            r20 = 0
            r21 = 1
            r23 = 0
            r16 = r12
            r17 = r2
            r19 = r1
            r22 = r13
            boolean r2 = android.opengl.EGL14.eglChooseConfig(r16, r17, r18, r19, r20, r21, r22, r23)
            if (r2 == 0) goto L_0x020e
            int[] r13 = new int[r3]
            r13 = {12440, 2, 12344} // fill-array
            android.opengl.EGLDisplay r12 = r9.A01
            r3 = r1[r8]
            android.opengl.EGLContext r2 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r2 = android.opengl.EGL14.eglCreateContext(r12, r3, r2, r13, r8)
            r9.A00 = r2
            java.lang.String r2 = "eglCreateContext"
            X.C200339hB.A01(r2)
            android.opengl.EGLContext r2 = r9.A00
            if (r2 == 0) goto L_0x0207
            int[] r3 = new int[r7]
            r3[r8] = r15
            if (r6 == 0) goto L_0x00fd
            android.opengl.EGLDisplay r2 = r9.A01
            r1 = r1[r8]
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreateWindowSurface(r2, r1, r6, r3, r8)
        L_0x00df:
            r9.A02 = r1
            java.lang.String r1 = "eglCreateWindowSurface"
            X.C200339hB.A01(r1)
            android.opengl.EGLSurface r3 = r9.A02
            if (r3 == 0) goto L_0x0200
            android.opengl.EGLContext r2 = r9.A00
            if (r2 == 0) goto L_0x010b
            android.opengl.EGLDisplay r1 = r9.A01
            boolean r1 = android.opengl.EGL14.eglMakeCurrent(r1, r3, r3, r2)
            if (r1 != 0) goto L_0x010b
            java.lang.String r0 = "eglMakeCurrent failed"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x00fd:
            int[] r3 = new int[r4]
            r3 = {12375, 8, 12374, 8, 12344} // fill-array
            android.opengl.EGLDisplay r2 = r9.A01
            r1 = r1[r8]
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreatePbufferSurface(r2, r1, r3, r8)
            goto L_0x00df
        L_0x010b:
            X.5i9 r8 = r9.A06
            X.6Om r6 = r9.A04
            android.opengl.EGLContext r4 = r9.A00
            java.util.Objects.requireNonNull(r4)
            android.opengl.EGLDisplay r2 = r9.A01
            java.util.Objects.requireNonNull(r2)
            android.opengl.EGLSurface r1 = r9.A02
            java.util.Objects.requireNonNull(r1)
            X.5zB r3 = new X.5zB
            r20 = r27
            r21 = r28
            r15 = r3
            r16 = r4
            r17 = r2
            r18 = r1
            r19 = r6
            r22 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r8.A00 = r3
            r2 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.GLES20.glClearColor(r2, r2, r2, r1)
            X.65N r1 = r3.A05
            if (r1 == 0) goto L_0x014d
            int r2 = r1.A02
            if (r2 == r5) goto L_0x0145
            r1 = 7
            if (r2 != r1) goto L_0x014d
        L_0x0145:
            X.65W r1 = r3.A07
            boolean r1 = r1 instanceof X.C98644rl
            if (r1 == 0) goto L_0x014d
            r3.A00 = r2
        L_0x014d:
            int r2 = r3.A00
            if (r2 != r5) goto L_0x015e
            X.6Om r8 = r3.A0C     // Catch:{ Exception -> 0x017f }
            r2 = 2132017210(0x7f14003a, float:1.9672692E38)
            r1 = 2132017207(0x7f140037, float:1.9672686E38)
            X.6TK r1 = X.C131296Om.A00(r8, r2, r1)     // Catch:{ Exception -> 0x017f }
            goto L_0x016d
        L_0x015e:
            r1 = 7
            if (r2 != r1) goto L_0x0170
            X.6Om r8 = r3.A0C     // Catch:{ Exception -> 0x017f }
            r2 = 2132017210(0x7f14003a, float:1.9672692E38)
            r1 = 2132017205(0x7f140035, float:1.9672682E38)
            X.6TK r1 = X.C131296Om.A00(r8, r2, r1)     // Catch:{ Exception -> 0x017f }
        L_0x016d:
            r3.A03 = r1     // Catch:{ Exception -> 0x017f }
            goto L_0x018d
        L_0x0170:
            X.6Om r8 = r3.A0C
            r2 = 2132017209(0x7f140039, float:1.967269E38)
            r1 = 2132017206(0x7f140036, float:1.9672684E38)
            X.6TK r1 = X.C131296Om.A00(r8, r2, r1)
            r3.A03 = r1
            goto L_0x018d
        L_0x017f:
            X.6Om r8 = r3.A0C
            r2 = 2132017209(0x7f140039, float:1.967269E38)
            r1 = 2132017206(0x7f140036, float:1.9672684E38)
            X.6TK r1 = X.C131296Om.A00(r8, r2, r1)
            r3.A03 = r1
        L_0x018d:
            java.util.List r5 = r3.A0E
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L_0x01db
            java.lang.String r1 = "SimpleFrameRenderer"
            X.5xZ r4 = new X.5xZ
            r4.<init>(r1)
            android.util.SparseIntArray r1 = r4.A06
            X.C90464aC.A0u(r1)
            boolean r2 = r3.A08
            r1 = 36197(0x8d65, float:5.0723E-41)
            if (r2 == 0) goto L_0x01aa
            r1 = 3553(0xde1, float:4.979E-42)
        L_0x01aa:
            r4.A01 = r1
            X.67V r1 = new X.67V
            r1.<init>(r4)
            r3.A04 = r1
            java.util.Iterator r6 = r5.iterator()
        L_0x01b7:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0225
            java.lang.Object r4 = r6.next()
            X.7lR r4 = (X.C160697lR) r4
            boolean r1 = r4 instanceof X.C141116mh
            if (r1 == 0) goto L_0x01ce
            r2 = r4
            X.6mh r2 = (X.C141116mh) r2
            int r1 = r3.A00
            r2.A00 = r1
        L_0x01ce:
            r4.Bik(r8)
            X.6OY r1 = r3.A06
            int r2 = r1.A09
            int r1 = r1.A07
            r4.Bij(r2, r1)
            goto L_0x01b7
        L_0x01db:
            int[] r1 = new int[r7]
            android.opengl.GLES20.glGenTextures(r7, r1, r0)
            r1 = r1[r0]
            r3.A01 = r1
            r4 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r4, r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.String r1 = "glBindTexture mTextureID"
            X.C200339hB.A02(r1, r2)
            r2 = 10241(0x2801, float:1.435E-41)
            r1 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r4, r2, r1)
            X.C90514aH.A1D()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "glTexParameter"
            goto L_0x0229
        L_0x0200:
            java.lang.String r0 = "surface was null"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0207:
            java.lang.String r0 = "null context"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x020e:
            java.lang.String r0 = "unable to find RGB888+recordable ES2 EGL config"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0215:
            r9.A01 = r10
            java.lang.String r0 = "unable to initialize EGL14"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x021e:
            java.lang.String r0 = "unable to get EGL14 display"
            java.lang.RuntimeException r0 = X.C90514aH.A0s(r0)
            throw r0
        L_0x0225:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = "video texture"
        L_0x0229:
            X.C200339hB.A02(r0, r1)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x024a
            X.67V r1 = r3.A04
            boolean r0 = X.AnonymousClass000.A1V(r1)
            X.C131736Qi.A02(r0, r10)
            int r1 = r1.A00
        L_0x023d:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r3.A02 = r0
        L_0x0244:
            X.5zB r0 = r11.A00
            java.util.Objects.requireNonNull(r0)
            return
        L_0x024a:
            int r1 = r3.A01
            goto L_0x023d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124095xa.<init>(android.content.Context, android.view.Surface, X.65N, X.6OY, X.5i9, X.65W):void");
    }
}
