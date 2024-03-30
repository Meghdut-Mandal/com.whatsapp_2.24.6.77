package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.util.List;

/* renamed from: X.88o  reason: invalid class name and case insensitive filesystem */
public class C1693088o extends C191299Ck {
    public C1692488i A00;
    public C202049kx A01;

    public void A02() {
        A04(this.A00.A00());
    }

    public void A03() {
        C1692488i r1 = this.A00;
        Rect rect = C202799mg.A00;
        List A03 = C198429dX.A03(C198429dX.A0q, r1);
        int i = 4;
        if (!C165607th.A1X(A03, 4)) {
            i = 1;
            if (!C165607th.A1X(A03, 1)) {
                i = 6;
                if (!C165607th.A1X(A03, 6)) {
                    return;
                }
            }
        }
        this.A00.A01(C201049ih.A0C, Integer.valueOf(i));
    }

    public void A04(AnonymousClass9T3 r8) {
        C1692788l r5;
        boolean z;
        String str;
        this.A00 = new C195519Up();
        C202049kx r4 = this.A01;
        try {
            r5 = (C1692788l) r4.A02.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("ParametersModificationApplier", "Could not clone the camera settings", e);
            r5 = null;
        }
        if (r8.A0x) {
            z = r4.A02(C201049ih.A0C, Integer.valueOf(r8.A0C));
        } else {
            z = false;
        }
        if (r8.A0a) {
            z = A00(r4, C201049ih.A00, r8.A06, z);
        }
        if (r8.A0o) {
            z = A00(r4, C201049ih.A06, r8.A08, z);
        }
        if (r8.A0v) {
            z = A00(r4, C201049ih.A0A, r8.A0B, z);
        }
        if (r8.A0r) {
            z = A00(r4, C201049ih.A08, r8.A0A, z);
        }
        if (r8.A0w) {
            z = A01(r4, C201049ih.A0B, r8.A0Y, z);
        }
        if (r8.A1C) {
            z = A00(r4, C201049ih.A0Z, r8.A0E, z);
        }
        if (r8.A1D) {
            z = A00(r4, C201049ih.A0a, r8.A0F, z);
        }
        if (r8.A1E) {
            z = A01(r4, C201049ih.A0b, r8.A0R, z);
        }
        if (r8.A1G) {
            z = A01(r4, C201049ih.A0e, r8.A0Z, z);
        }
        if (r8.A1K) {
            z = A00(r4, C201049ih.A0h, r8.A0H, z);
        }
        if (r8.A1L) {
            z = A01(r4, C201049ih.A0j, r8.A0S, z);
        }
        if (r8.A1M) {
            z = A00(r4, C201049ih.A0l, r8.A0I, z);
        }
        if (r8.A1O) {
            z = A00(r4, C201049ih.A0n, r8.A0J, z);
        }
        if (r8.A1N) {
            z = A01(r4, C201049ih.A0m, r8.A1g, z);
        }
        if (r8.A1P) {
            z = A01(r4, C201049ih.A0p, r8.A0T, z);
        }
        if (r8.A1U) {
            z = A00(r4, C201049ih.A0r, r8.A0K, z);
        }
        if (r8.A1a) {
            z = A01(r4, C201049ih.A0Y, Boolean.valueOf(r8.A1Z), z);
        }
        if (r8.A1Y) {
            z = A01(r4, C201049ih.A0w, r8.A0U, z);
        }
        if (r8.A1b) {
            z = A00(r4, C201049ih.A0x, r8.A0M, z);
        }
        if (r8.A1d) {
            z = A00(r4, C201049ih.A0z, r8.A0N, z);
        }
        if (r8.A18) {
            z = A01(r4, C201049ih.A0V, Boolean.valueOf(r8.A17), z);
        }
        if (r8.A1T) {
            z = A01(r4, C201049ih.A0q, Boolean.valueOf(r8.A1S), z);
        }
        if (r8.A10) {
            z = A01(r4, C201049ih.A0D, Double.valueOf(r8.A00), z);
        }
        if (r8.A11) {
            z = A01(r4, C201049ih.A0E, Double.valueOf(r8.A01), z);
        }
        if (r8.A12) {
            z = A01(r4, C201049ih.A0F, Double.valueOf(r8.A02), z);
        }
        if (r8.A13) {
            z = A01(r4, C201049ih.A0G, r8.A0W, z);
        }
        if (r8.A14) {
            z = A01(r4, C201049ih.A0H, Long.valueOf(r8.A0P), z);
        }
        if (r8.A1J) {
            z = A00(r4, C201049ih.A0f, r8.A0G, z);
        }
        if (r8.A1X) {
            z = A00(r4, C201049ih.A0v, r8.A0L, z);
        }
        if (r8.A1B) {
            z = A00(r4, C201049ih.A0K, r8.A0D, z);
        }
        if (r8.A0q) {
            z = A01(r4, C201049ih.A0k, (Object) null, z);
        }
        if (r8.A1A) {
            z = A01(r4, C201049ih.A0U, Boolean.valueOf(r8.A19), z);
        }
        if (r8.A0g) {
            z = A01(r4, C201049ih.A0M, Boolean.valueOf(r8.A0f), z);
        }
        if (z) {
            C202049kx.A05.incrementAndGet();
            try {
                C202389lj.A00();
                if (C200349hC.A02(C197019az.A00)) {
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("applyModifications: [modification] ");
                    Log.i("ParametersModificationApplier", AnonymousClass000.A0q(r8.A00(), A0u));
                }
                r4.A01.setParameters(r4.A00);
                C202389lj.A00();
            } catch (RuntimeException e2) {
                C202389lj.A00();
                Object[] objArr = new Object[4];
                if (r5 != null) {
                    str = r5.A09();
                } else {
                    str = "null";
                }
                objArr[0] = str;
                objArr[1] = r4.A02.A09();
                objArr[2] = r4.A00.flatten();
                objArr[3] = r8.A00();
                throw C90524aI.A0e(String.format("Failed to apply parameters. previous settings: (%s), new settings: (%s), parameters: (%s), modifications: (%s)", objArr), e2);
            }
        }
    }

    public C1693088o(Camera.Parameters parameters, Camera camera, C1692488i r9, C1692788l r10, int i) {
        this.A00 = r9;
        this.A01 = new C202049kx(parameters, camera, r9, r10, i);
    }

    public static boolean A00(C202049kx r1, C191289Cj r2, int i, boolean z) {
        return z | r1.A02(r2, Integer.valueOf(i));
    }

    public static boolean A01(C202049kx r0, C191289Cj r1, Object obj, boolean z) {
        return z | r0.A02(r1, obj);
    }
}
