package X;

import android.os.Handler;
import java.util.Objects;

/* renamed from: X.9pq  reason: invalid class name and case insensitive filesystem */
public class C204339pq implements Handler.Callback {
    public static void A00(C199989gN r9) {
        if (r9 != null) {
            int intValue = r9.A00(C199989gN.A0H).intValue();
            int intValue2 = r9.A00(C199989gN.A0G).intValue();
            String str = (String) r9.A01(C199989gN.A0K);
            String str2 = (String) r9.A01(C199989gN.A0M);
            int intValue3 = r9.A00(C199989gN.A0I).intValue();
            int intValue4 = r9.A00(C199989gN.A0F).intValue();
            int i = 0;
            if (intValue4 != 0) {
                i = 1;
                if (1 != intValue4) {
                    throw C165567td.A0U("Could not convert camera facing from optic: ", AnonymousClass000.A0u(), intValue4);
                }
            }
            Object A01 = r9.A01(C199989gN.A0L);
            Objects.requireNonNull(A01);
            if (AnonymousClass000.A1X(A01)) {
                Object A012 = r9.A01(C199989gN.A0J);
                Objects.requireNonNull(A012);
                ((Number) A012).intValue();
            }
            Object A013 = r9.A01(C199989gN.A0R);
            Objects.requireNonNull(A013);
            ((Number) A013).intValue();
            new AnonymousClass9UX(str, str2, intValue, intValue2, intValue3, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00de, code lost:
        r1.BSu(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r13) {
        /*
            r12 = this;
            int r0 = r13.what
            r7 = 2
            r5 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0009;
                case 2: goto L_0x0020;
                case 3: goto L_0x0040;
                case 4: goto L_0x005f;
                case 5: goto L_0x0168;
                case 6: goto L_0x0172;
                case 7: goto L_0x0082;
                case 8: goto L_0x0096;
                case 9: goto L_0x00af;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00e2;
                case 12: goto L_0x00fe;
                case 13: goto L_0x0116;
                case 14: goto L_0x0116;
                case 15: goto L_0x012a;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r2
        L_0x0009:
            java.lang.Object r3 = r13.obj
            java.util.List r3 = (java.util.List) r3
            r1 = 0
        L_0x000e:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r3.get(r1)
            X.B2m r0 = (X.C23063B2m) r0
            r0.BSw()
            int r1 = r1 + 1
            goto L_0x000e
        L_0x0020:
            java.lang.Object r3 = r13.obj
            java.util.List r3 = (java.util.List) r3
            r1 = 0
        L_0x0025:
            int r0 = r3.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r3.get(r1)
            X.B2m r0 = (X.C23063B2m) r0
            r0.BSz()
            java.lang.Object r0 = r3.get(r1)
            X.B2m r0 = (X.C23063B2m) r0
            r0.BSw()
            int r1 = r1 + 1
            goto L_0x0025
        L_0x0040:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0[r2]
            java.util.List r4 = (java.util.List) r4
            r3 = r0[r5]
            java.lang.Exception r3 = (java.lang.Exception) r3
            r1 = 0
        L_0x004d:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r4.get(r1)
            X.B2m r0 = (X.C23063B2m) r0
            r0.BSt(r3)
            int r1 = r1 + 1
            goto L_0x004d
        L_0x005f:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6 = r0[r2]
            java.util.List r6 = (java.util.List) r6
            r4 = r0[r5]
            java.lang.String r4 = (java.lang.String) r4
            r3 = r0[r7]
            java.lang.String r3 = (java.lang.String) r3
            r1 = 0
        L_0x0070:
            int r0 = r6.size()
            if (r1 >= r0) goto L_0x0008
            java.lang.Object r0 = r6.get(r1)
            X.B2m r0 = (X.C23063B2m) r0
            r0.BSx(r4, r3)
            int r1 = r1 + 1
            goto L_0x0070
        L_0x0082:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.9HW r0 = (X.AnonymousClass9HW) r0
            r3 = r1[r5]
            java.lang.Exception r3 = (java.lang.Exception) r3
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r0.A01
            X.7lW r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 3
            goto L_0x00de
        L_0x0096:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r2]
            X.9EN r1 = (X.AnonymousClass9EN) r1
            r0 = r0[r5]
            X.9gN r0 = (X.C199989gN) r0
            A00(r0)
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r1.A00
            X.7lW r0 = r0.A00
            if (r0 == 0) goto L_0x0008
            r0.BkF()
            return r2
        L_0x00af:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r2]
            X.9EN r1 = (X.AnonymousClass9EN) r1
            r0 = r0[r5]
            X.9gN r0 = (X.C199989gN) r0
            A00(r0)
            com.whatsapp.camera.litecamera.LiteCameraView r1 = r1.A00
            java.lang.Runnable r0 = r1.A04
            if (r0 == 0) goto L_0x0008
            r0.run()
            r0 = 0
            r1.A04 = r0
            return r2
        L_0x00cb:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.9EN r0 = (X.AnonymousClass9EN) r0
            r3 = r1[r5]
            java.lang.Exception r3 = (java.lang.Exception) r3
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            X.7lW r1 = r0.A00
            if (r1 == 0) goto L_0x0008
            r0 = 4
        L_0x00de:
            r1.BSu(r3, r0)
            return r2
        L_0x00e2:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r2]
            X.9EO r0 = (X.AnonymousClass9EO) r0
            r4 = r1[r5]
            android.graphics.Point r4 = (android.graphics.Point) r4
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r0.A00
            X.7lW r3 = r0.A00
            if (r3 == 0) goto L_0x0008
            int r0 = r4.x
            float r1 = (float) r0
            int r0 = r4.y
            float r0 = (float) r0
            r3.BRd(r1, r0)
            return r2
        L_0x00fe:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r0 = r0[r2]
            X.9EO r0 = (X.AnonymousClass9EO) r0
            com.whatsapp.camera.litecamera.LiteCameraView r3 = r0.A00
            X.B5t r1 = r3.A0D
            r0 = 0
            r1.Bqx(r0)
            X.7lW r0 = r3.A00
            if (r0 == 0) goto L_0x0008
            r0.BRe(r5)
            return r2
        L_0x0116:
            java.lang.Object r0 = r13.obj
            X.9EO r0 = (X.AnonymousClass9EO) r0
            com.whatsapp.camera.litecamera.LiteCameraView r3 = r0.A00
            X.B5t r1 = r3.A0D
            r0 = 0
            r1.Bqx(r0)
            X.7lW r0 = r3.A00
            if (r0 == 0) goto L_0x0008
            r0.BRe(r2)
            return r2
        L_0x012a:
            java.lang.Object r1 = r13.obj
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r4 = r1[r2]
            X.A0j r4 = (X.C20952A0j) r4
            r3 = r1[r5]
            X.9JP r3 = (X.AnonymousClass9JP) r3
            r0 = r1[r7]
            int r7 = X.AnonymousClass000.A0I(r0)
            r0 = 3
            r0 = r1[r0]
            int r8 = X.AnonymousClass000.A0I(r0)
            if (r7 <= 0) goto L_0x0008
            if (r8 <= 0) goto L_0x0008
            X.9ih r1 = r3.A02
            X.9Cj r0 = X.C201049ih.A0p
            java.lang.Object r0 = r1.A08(r0)
            X.9W3 r0 = (X.AnonymousClass9W3) r0
            if (r0 == 0) goto L_0x0008
            android.graphics.Matrix r6 = X.C90524aI.A0B()
            X.B3p r5 = r4.A0L
            int r9 = r0.A02
            int r10 = r0.A01
            boolean r11 = r4.A0F
            r5.Bss(r6, r7, r8, r9, r10, r11)
            int r0 = r3.A00
            r5.BKd(r6, r7, r8, r0)
            return r2
        L_0x0168:
            java.lang.Object r0 = r13.obj
            X.9HW r0 = (X.AnonymousClass9HW) r0
            X.65s r0 = r0.A00
            r0.A00()
            return r2
        L_0x0172:
            java.lang.Object r0 = r13.obj
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6 = r0[r2]
            X.9HW r6 = (X.AnonymousClass9HW) r6
            r4 = r0[r5]
            byte[] r4 = (byte[]) r4
            r1 = r0[r7]
            X.9fb r1 = (X.C199609fb) r1
            if (r1 == 0) goto L_0x01bd
            X.9Cn r0 = X.C199609fb.A0K
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = X.AnonymousClass000.A0I(r0)
            if (r3 == 0) goto L_0x019f
            if (r5 == r3) goto L_0x019f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Could not convert camera facing from optic: "
            java.lang.RuntimeException r0 = X.C165567td.A0U(r0, r1, r3)
            throw r0
        L_0x019f:
            X.9Co r0 = X.C199609fb.A0T
            r1.A00(r0)
            X.9Co r0 = X.C199609fb.A0Z
            r1.A00(r0)
            X.9Co r0 = X.C199609fb.A0O
            r1.A00(r0)
            X.9Co r0 = X.C199609fb.A0V
            r1.A00(r0)
            X.9Co r0 = X.C199609fb.A0P
            r1.A00(r0)
            X.9Co r0 = X.C199609fb.A0R
            r1.A00(r0)
        L_0x01bd:
            X.65s r1 = r6.A00
            com.whatsapp.camera.litecamera.LiteCameraView r0 = r6.A01
            boolean r0 = r0.BLt()
            r1.A01(r4, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204339pq.handleMessage(android.os.Message):boolean");
    }
}
