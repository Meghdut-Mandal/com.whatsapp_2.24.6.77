package X;

import android.content.pm.PackageManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* renamed from: X.9mz  reason: invalid class name and case insensitive filesystem */
public class C202949mz {
    public static int A06;
    public static boolean A07;
    public static boolean A08;
    public static volatile boolean A09;
    public Map A00 = Collections.emptyMap();
    public final C200199gr A01;
    public final PackageManager A02;
    public final CameraManager A03;
    public final C201439jb A04;
    public volatile AnonymousClass9JL[] A05 = null;

    private int A00(int i) {
        if (this.A05 == null) {
            A02(this);
        }
        if (!(this.A05 == null || this.A05.length == 0)) {
            for (int i2 = 0; i2 < this.A05.length; i2++) {
                if (this.A05[i2].A00 == i) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public static AnonymousClass9JL A01(C202949mz r2, int i) {
        if (r2.A05 == null) {
            A02(r2);
        }
        int A002 = r2.A00(i);
        if (A002 != -1) {
            AnonymousClass9JL[] r0 = r2.A05;
            Objects.requireNonNull(r0);
            return r0[A002];
        }
        throw AnonymousClass001.A08("Camera facing did not resolve to a camera info instance");
    }

    public static void A02(C202949mz r3) {
        if (r3.A05 == null) {
            C200199gr r2 = r3.A01;
            if (r2.A09()) {
                A03(r3);
                return;
            }
            try {
                r2.A01(new C1691988d(), new B8U((Object) r3, 11)).get();
            } catch (InterruptedException | ExecutionException e) {
                C202389lj.A02("CameraInventory", C36331k8.A0i("failed to load camera infos: ", AnonymousClass000.A0u(), e));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.9JL[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C202949mz r14) {
        /*
            android.hardware.camera2.CameraManager r10 = r14.A03
            java.util.Objects.requireNonNull(r10)
            java.lang.String[] r9 = r10.getCameraIdList()
            int r8 = r9.length
            java.util.HashMap r7 = X.AnonymousClass001.A0J()
            r13 = 0
            r6 = 0
            r12 = 0
            r11 = 0
        L_0x0012:
            r4 = 1
            if (r6 >= r8) goto L_0x0056
            r5 = r9[r6]
            android.hardware.camera2.CameraCharacteristics r1 = r10.getCameraCharacteristics(r5)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            java.util.Objects.requireNonNull(r0)
            int r3 = r0.intValue()
            boolean r2 = X.C36381kD.A1U(r3, r4)
            java.util.Map r0 = r14.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0040
            boolean r0 = r7.containsKey(r1)
            if (r0 != 0) goto L_0x0051
        L_0x0040:
            java.util.Map r0 = r14.A00
            java.lang.String r0 = X.C36431kI.A1A(r1, r0)
            if (r0 == 0) goto L_0x0049
            r5 = r0
        L_0x0049:
            X.9JL r0 = new X.9JL
            r0.<init>(r2, r5, r3)
            r7.put(r1, r0)
        L_0x0051:
            if (r2 == 0) goto L_0x0070
            r11 = 1
            if (r12 == 0) goto L_0x0074
        L_0x0056:
            int r0 = r7.size()
            X.9JL[] r3 = new X.AnonymousClass9JL[r0]
            java.util.Iterator r2 = X.C36371kC.A10(r7)
        L_0x0060:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r1 = X.C36351kA.A0u(r2)
            int r0 = r13 + 1
            r3[r13] = r1
            r13 = r0
            goto L_0x0060
        L_0x0070:
            r12 = 1
            if (r11 == 0) goto L_0x0074
            goto L_0x0056
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0012
        L_0x0077:
            A08 = r11
            A07 = r12
            if (r11 == 0) goto L_0x007f
            int r12 = r12 + 1
        L_0x007f:
            A06 = r12
            r14.A05 = r3
            A09 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202949mz.A03(X.9mz):void");
    }

    public static boolean A04(C202949mz r3) {
        if (!A09) {
            PackageManager packageManager = r3.A02;
            if (packageManager == null) {
                C202389lj.A02("CameraInventory", "failed to load camera feature. PackageManager is null");
                return false;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                A07 = true;
            }
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                A08 = true;
            }
            int i = A07;
            if (A08) {
                i++;
            }
            A06 = i;
            A09 = true;
        }
        return true;
    }

    public int A05(String str) {
        if (this.A05 == null) {
            A02(this);
        }
        AnonymousClass9JL[] r0 = this.A05;
        Objects.requireNonNull(r0);
        int length = r0.length;
        for (int i = 0; i < length; i++) {
            AnonymousClass9JL r1 = this.A05[i];
            if (r1.A02.equals(str)) {
                return r1.A00;
            }
        }
        C202389lj.A02("CameraInventory", AnonymousClass000.A0p("Failed to find camera facing for id: ", str, AnonymousClass000.A0u()));
        return 0;
    }

    public C202949mz(PackageManager packageManager, CameraManager cameraManager, C201439jb r4, C200199gr r5) {
        this.A03 = cameraManager;
        this.A01 = r5;
        this.A04 = r4;
        this.A02 = packageManager;
    }

    public String A06(int i) {
        try {
            return A01(this, i).A02;
        } catch (CameraAccessException e) {
            throw C90524aI.A0e("Failed to get camera info", e);
        }
    }

    public boolean A07(int i) {
        if (!A04(this)) {
            if (this.A05 == null) {
                A02(this);
            }
            if (this.A05 == null) {
                C202389lj.A02("CameraInventory", "Failed to detect camera, cameraInfos was null");
                return false;
            } else if (A00(C36381kD.A1U(i, 1) ? 1 : 0) == -1) {
                return false;
            } else {
                return true;
            }
        } else if (i != 1) {
            return A08;
        } else {
            return A07;
        }
    }
}
