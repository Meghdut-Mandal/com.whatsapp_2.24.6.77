package X;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

public class B8T implements Callable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public B8T(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        this.A05 = i3;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i;
        this.A04 = obj3;
        this.A00 = i2;
    }

    public final Object call() {
        C1692888m r0;
        if (this.A05 != 0) {
            C202389lj.A00();
            A28 a28 = (A28) this.A02;
            if (!(a28.A0k == null || a28.A0k == ((AnonymousClass9U6) this.A03).A02)) {
                a28.A0k.BnV((SurfaceTexture) null);
            }
            AnonymousClass9U6 r1 = (AnonymousClass9U6) this.A03;
            a28.A0k = r1.A02;
            a28.A0D = null;
            a28.A0D = B43.A00;
            a28.A09 = r1;
            B4X b4x = (B4X) this.A04;
            a28.A0E = b4x;
            Map map = (Map) b4x.B84(B4X.A01);
            if (!map.isEmpty()) {
                C202949mz r12 = a28.A0O;
                if (!map.isEmpty()) {
                    r12.A00 = map;
                    if (r12.A01.A09()) {
                        C202949mz.A03(r12);
                    }
                }
            }
            a28.A02 = this.A00;
            a28.A0I = C165567td.A1a(B4X.A0N, b4x);
            C202949mz r2 = a28.A0O;
            int i = this.A01;
            if (r2.A01.A09()) {
                C202949mz.A02(r2);
                int i2 = 1;
                if (i == 1) {
                    i2 = 0;
                }
                if (!r2.A07(i2)) {
                    if (r2.A05 == null) {
                        throw C90514aH.A0s("Logical cameras not initialised!");
                    } else if (r2.A05.length == 0) {
                        throw new C1691888c();
                    } else if (i != 0 || !r2.A07(0)) {
                        if (i != 1 || !r2.A07(1)) {
                            StringBuilder A0i = C90524aI.A0i("Camera 2 API - Could not get CameraInfo for CameraFacing id: ");
                            A0i.append(i);
                            A0i.append(" Number Of Cameras: ");
                            A0i.append(C202949mz.A06);
                            A0i.append(" BACK: ");
                            boolean z = C202949mz.A07;
                            A0i.append(z);
                            A0i.append(" FRONT: ");
                            A0i.append(z);
                            AnonymousClass9JL[] r22 = r2.A05;
                            if (r22 != null) {
                                A0i.append(" Camera Info size: ");
                                A0i.append(r1);
                                A0i.append(" Camera lenses: ");
                                for (AnonymousClass9JL r02 : r22) {
                                    A0i.append(r02.A01);
                                    C36421kH.A1N(A0i);
                                }
                            } else {
                                A0i.append(" Camera Info NULL");
                            }
                            throw C90514aH.A0s(A0i.toString());
                        }
                        C202389lj.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                        i = 0;
                    } else {
                        C202389lj.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                        i = 1;
                    }
                }
                a28.A0A = new C202639mL();
                String A06 = r2.A06(i);
                try {
                    A28.A04(a28, A06);
                    A28.A05(a28, A06);
                    A28.A01(a28);
                    A28.A03(a28, (Float) null, A06);
                    int i3 = a28.A01;
                    C198429dX B9Q = a28.B9Q();
                    if (!a28.isConnected() || (r0 = a28.A0B) == null) {
                        throw new C21815Aar("Cannot get camera settings");
                    }
                    AnonymousClass9JP r03 = new AnonymousClass9JP(new AnonymousClass9JO(B9Q, r0, i3));
                    C202389lj.A00();
                    return r03;
                } catch (Exception e) {
                    C202389lj.A00();
                    a28.B5Z((AnonymousClass9T8) null);
                    throw e;
                }
            } else {
                throw C90514aH.A0s("Cannot resolve camera facing, not on the Optic thread");
            }
        } else {
            A29 a29 = (A29) this.A02;
            AnonymousClass9U6 r6 = (AnonymousClass9U6) this.A03;
            int i4 = this.A01;
            B4X b4x2 = (B4X) this.A04;
            int i5 = this.A00;
            try {
                C202389lj.A00();
                if (!(a29.A0b == null || a29.A0b == r6.A02)) {
                    a29.A0b.BnV((SurfaceTexture) null);
                    a29.A0b = null;
                }
                C202659mN r8 = a29.A0I;
                C200199gr r7 = r8.A00;
                if (r7.A09()) {
                    if (C202659mN.A00(r8, i4) == -1) {
                        int i6 = C202659mN.A03;
                        if (i6 == -1) {
                            if (C202659mN.A03(r8)) {
                                i6 = C202659mN.A03;
                            } else {
                                r7.A06("Number of cameras must be loaded on background thread.");
                                i6 = Camera.getNumberOfCameras();
                                C202659mN.A03 = i6;
                            }
                        }
                        if (i6 > 0) {
                            if (i4 == 0) {
                                if (r8.A06(1)) {
                                    C202389lj.A03("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    i4 = 1;
                                }
                            } else if (r8.A06(0)) {
                                C202389lj.A03("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                i4 = 0;
                            }
                            StringBuilder A0u = AnonymousClass000.A0u();
                            A0u.append("found ");
                            A0u.append(C202659mN.A03);
                            throw C90464aC.A0U(" cameras with bad facing constants", A0u);
                        }
                        throw new C1691888c();
                    }
                    A29.A08(a29, i4);
                    AnonymousClass9JP A012 = A29.A01(r6, a29, b4x2, i5);
                    C202389lj.A00();
                    return A012;
                }
                throw C90514aH.A0s("Cannot resolve camera facing, not on the Optic thread");
            } catch (Exception e2) {
                C202389lj.A00();
                AnonymousClass9PE r13 = a29.A0M;
                AtomicReference atomicReference = r13.A00;
                C165587tf.A1R(atomicReference);
                C165587tf.A1R(atomicReference);
                r13.A00(0);
                C194859Rn r14 = a29.A0K;
                r14.A01.A00();
                r14.A02.A00();
                a29.Bqw((C157797eh) null);
                a29.A0N.A06.A00();
                a29.A0Q.A00();
                A29.A04(a29);
                throw e2;
            }
        }
    }
}
