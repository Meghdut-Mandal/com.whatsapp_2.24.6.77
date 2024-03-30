package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9mN  reason: invalid class name and case insensitive filesystem */
public class C202659mN {
    public static int A03 = -1;
    public static volatile boolean A04;
    public static volatile boolean A05;
    public static volatile Camera.CameraInfo[] A06;
    public static volatile boolean A07;
    public final C200199gr A00;
    public final PackageManager A01;
    public final C201439jb A02;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0040, code lost:
        if (r3 == -1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r3 == -1) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(X.C202659mN r7, int r8) {
        /*
            android.hardware.Camera$CameraInfo[] r0 = A06
            r4 = -1
            if (r0 == 0) goto L_0x0028
            android.hardware.Camera$CameraInfo[] r2 = A06
            if (r2 == 0) goto L_0x0026
            boolean r1 = X.AnonymousClass000.A1O(r8)
            r3 = 0
        L_0x000e:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x0026
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x0023
            if (r3 != r4) goto L_0x001f
        L_0x0019:
            if (r8 == 0) goto L_0x0020
            boolean r0 = A05
        L_0x001d:
            if (r0 != 0) goto L_0x0028
        L_0x001f:
            return r3
        L_0x0020:
            boolean r0 = A04
            goto L_0x001d
        L_0x0023:
            int r3 = r3 + 1
            goto L_0x000e
        L_0x0026:
            r3 = -1
            goto L_0x0019
        L_0x0028:
            r6 = 0
            A06 = r6
            r7.A01()
            android.hardware.Camera$CameraInfo[] r2 = A06
            if (r2 == 0) goto L_0x00c1
            boolean r1 = X.AnonymousClass000.A1O(r8)
            r3 = 0
        L_0x0037:
            int r0 = r2.length
            if (r3 >= r0) goto L_0x00c1
            r0 = r2[r3]
            int r0 = r0.facing
            if (r0 != r1) goto L_0x00bd
            if (r3 != r4) goto L_0x001f
        L_0x0042:
            if (r8 == 0) goto L_0x00ba
            boolean r0 = A05
        L_0x0046:
            if (r0 == 0) goto L_0x001f
            android.content.pm.PackageManager r3 = r7.A01
            if (r3 == 0) goto L_0x00b7
            java.lang.String r0 = "android.hardware.camera.any"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "android.hardware.camera.front"
            boolean r0 = r3.hasSystemFeature(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x006a:
            java.lang.String r0 = "Camera 1 API - Could not get CameraInfo for CameraFacing id: "
            java.lang.StringBuilder r5 = X.C90524aI.A0i(r0)
            r5.append(r8)
            java.lang.String r0 = " Number Of Cameras: "
            r5.append(r0)
            int r0 = A03
            r5.append(r0)
            java.lang.String r0 = " ANY: "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " BACK: "
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = " FRONT: "
            r5.append(r0)
            r5.append(r6)
            android.hardware.Camera$CameraInfo[] r3 = A06
            if (r3 == 0) goto L_0x00c3
            java.lang.String r0 = " Camera Info size: "
            r5.append(r0)
            int r2 = r3.length
            r5.append(r2)
            java.lang.String r0 = " Camera ids: "
            r5.append(r0)
            r1 = 0
        L_0x00a8:
            if (r1 >= r2) goto L_0x00c8
            r0 = r3[r1]
            int r0 = r0.facing
            r5.append(r0)
            X.C36421kH.A1N(r5)
            int r1 = r1 + 1
            goto L_0x00a8
        L_0x00b7:
            r2 = r6
            r1 = r6
            goto L_0x006a
        L_0x00ba:
            boolean r0 = A04
            goto L_0x0046
        L_0x00bd:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x00c1:
            r3 = -1
            goto L_0x0042
        L_0x00c3:
            java.lang.String r0 = " Camera Info NULL"
            r5.append(r0)
        L_0x00c8:
            java.lang.String r1 = "CameraInventory"
            java.lang.String r0 = r5.toString()
            X.C202389lj.A02(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202659mN.A00(X.9mN, int):int");
    }

    private void A01() {
        if (A06 == null) {
            C200199gr r2 = this.A00;
            if (r2.A09()) {
                A02();
                return;
            }
            try {
                r2.A01(new C1691988d(), new B8U((Object) this, 4)).get();
            } catch (InterruptedException | ExecutionException e) {
                C202389lj.A02("CameraInventory", C36331k8.A0i("failed to load camera infos: ", AnonymousClass000.A0u(), e));
            }
        }
    }

    public static void A02() {
        if (A06 == null) {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo[] cameraInfoArr = new Camera.CameraInfo[numberOfCameras];
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                cameraInfoArr[i] = cameraInfo;
                int i2 = cameraInfo.facing;
                if (i2 == 0) {
                    z2 = true;
                } else if (i2 == 1) {
                    z = true;
                }
            }
            A06 = cameraInfoArr;
            A05 = z;
            A04 = z2;
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
    }

    public static boolean A03(C202659mN r3) {
        if (!A07) {
            PackageManager packageManager = r3.A01;
            if (packageManager == null) {
                C202389lj.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A04 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A05 = true;
            }
            A03 = 0;
            if (A04) {
                A03++;
            }
            if (A05) {
                A03++;
            }
            A07 = true;
        }
        return true;
    }

    public int A05(int i, int i2) {
        int i3;
        if (A06 == null) {
            if (!C202399lk.A02()) {
                C202389lj.A02("CameraInventory", "Loading camera info on the UI thread");
            }
            A01();
        }
        if (i2 != -1) {
            int A002 = A00(this, i);
            Camera.CameraInfo[] cameraInfoArr = A06;
            Objects.requireNonNull(cameraInfoArr);
            if (A002 >= cameraInfoArr.length) {
                C202389lj.A02("CameraInventory", AnonymousClass000.A0r("No CameraInfo found for camera id: ", AnonymousClass000.A0u(), A002));
            } else {
                Camera.CameraInfo cameraInfo = A06[A002];
                int i4 = ((i2 + 45) / 90) * 90;
                int i5 = cameraInfo.facing;
                int i6 = cameraInfo.orientation;
                if (i5 == 1) {
                    i3 = (i6 - i4) + 360;
                } else {
                    i3 = i6 + i4;
                }
                return i3 % 360;
            }
        }
        return 0;
    }

    public C202659mN(PackageManager packageManager, C201439jb r2, C200199gr r3) {
        this.A00 = r3;
        this.A02 = r2;
        this.A01 = packageManager;
    }

    public int A04(int i) {
        int A002 = A00(this, i);
        if (A002 != -1) {
            Camera.CameraInfo[] cameraInfoArr = A06;
            Objects.requireNonNull(cameraInfoArr);
            Camera.CameraInfo cameraInfo = cameraInfoArr[A002];
            if (cameraInfo != null) {
                return cameraInfo.orientation;
            }
            return 0;
        }
        throw C165567td.A0U("Could not load CameraInfo for CameraFacing: ", AnonymousClass000.A0u(), i);
    }

    public boolean A06(int i) {
        if (!A03(this)) {
            return C36381kD.A1U(A00(this, i), -1);
        }
        if (i != 0) {
            return A05;
        }
        return A04;
    }
}
