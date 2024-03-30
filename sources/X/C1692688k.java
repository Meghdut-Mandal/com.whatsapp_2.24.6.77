package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.88k  reason: invalid class name and case insensitive filesystem */
public final class C1692688k extends C198429dX {
    public int A00 = -1;
    public final CameraExtensionCharacteristics A01;
    public final C198429dX A02;
    public final List A03;
    public final Map A04 = AnonymousClass001.A0J();
    public final Map A05 = AnonymousClass001.A0J();
    public final Map A06 = AnonymousClass001.A0J();
    public final Map A07 = AnonymousClass001.A0J();
    public final Map A08 = AnonymousClass001.A0J();

    public C1692688k(CameraExtensionCharacteristics cameraExtensionCharacteristics, C198429dX r4) {
        ArrayList A0I = AnonymousClass001.A0I();
        this.A03 = A0I;
        this.A02 = r4;
        this.A01 = cameraExtensionCharacteristics;
        AnonymousClass000.A1F(A0I, -1);
        this.A00 = -1;
    }

    private ArrayList A00(CameraExtensionCharacteristics cameraExtensionCharacteristics, C191279Ci r10, int i, int i2, int i3) {
        List extensionSupportedSizes;
        List list;
        HashSet A0k;
        if (i == 1) {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2);
        } else {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
        }
        if (extensionSupportedSizes == null || extensionSupportedSizes.isEmpty()) {
            list = Collections.emptyList();
        } else {
            int size = extensionSupportedSizes.size();
            ArrayList A14 = C36441kJ.A14(size);
            for (int i4 = 0; i4 < size; i4++) {
                A14.add(new AnonymousClass9W3(((Size) extensionSupportedSizes.get(i4)).getWidth(), ((Size) extensionSupportedSizes.get(i4)).getHeight()));
            }
            list = Collections.unmodifiableList(A14);
        }
        List A032 = C198429dX.A03(r10, this.A02);
        if (A032.size() < list.size()) {
            A0k = C90524aI.A0k(A032);
            A032 = list;
        } else {
            A0k = C90524aI.A0k(list);
        }
        int size2 = A032.size();
        int size3 = A0k.size();
        ArrayList A142 = C36441kJ.A14(size3);
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj = A032.get(i5);
            if (A0k.contains(obj)) {
                A142.add(obj);
                if (A142.size() == size3) {
                    break;
                }
            }
        }
        return A142;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0.contains(r1) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a0, code lost:
        if (X.C198429dX.A04(X.C198429dX.A0X, r10.A02) == false) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A06(X.C191279Ci r11) {
        /*
            r10 = this;
            r4 = r10
            int r2 = r10.A00
            r0 = -1
            if (r0 == r2) goto L_0x002b
            int r1 = r11.A00
            r0 = 41
            if (r1 == r0) goto L_0x00e6
            r0 = 52
            if (r1 == r0) goto L_0x00ad
            r0 = 71
            if (r1 == r0) goto L_0x0060
            r0 = 84
            if (r1 == r0) goto L_0x005d
            r0 = 89
            if (r1 == r0) goto L_0x005a
            r0 = 92
            if (r1 == r0) goto L_0x005a
            r0 = 49
            if (r1 == r0) goto L_0x00c3
            r0 = 50
            if (r1 == r0) goto L_0x0045
            switch(r1) {
                case 79: goto L_0x0032;
                case 80: goto L_0x0032;
                case 81: goto L_0x0032;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.9dX r0 = r10.A02
            java.lang.Object r0 = r0.A06(r11)
            return r0
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.util.Map r0 = r10.A04
            java.lang.Object r0 = X.C36371kC.A0r(r0, r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x005a
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005a
            goto L_0x002b
        L_0x0045:
            java.util.Map r1 = r10.A08
            boolean r0 = X.C90484aE.A1Y(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 0
            X.9Ci r6 = X.C198429dX.A10
            r8 = 0
            goto L_0x00d8
        L_0x005a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x005d:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0060:
            java.util.Map r1 = r10.A05
            boolean r0 = X.C90484aE.A1Y(r1, r2)
            if (r0 != 0) goto L_0x00df
            java.util.Map r3 = r10.A07
            int r0 = r10.A00
            boolean r0 = X.C90484aE.A1Y(r3, r0)
            if (r0 != 0) goto L_0x0086
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.9Ci r6 = X.C198429dX.A0l
            r7 = 1
            r8 = 35
            java.util.ArrayList r0 = r4.A00(r5, r6, r7, r8, r9)
            r3.put(r2, r0)
        L_0x0086:
            int r0 = r10.A00
            java.lang.Object r0 = X.C36371kC.A0r(r3, r0)
            java.util.List r0 = (java.util.List) r0
            java.util.Objects.requireNonNull(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a2
            X.9dX r2 = r10.A02
            X.9Ci r0 = X.C198429dX.A0X
            boolean r2 = X.C198429dX.A04(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x00a3
        L_0x00a2:
            r0 = 0
        L_0x00a3:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r10.A00
            X.C90504aG.A1K(r2, r1, r0)
            goto L_0x00df
        L_0x00ad:
            java.util.Map r1 = r10.A07
            boolean r0 = X.C90484aE.A1Y(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.9Ci r6 = X.C198429dX.A0l
            r7 = 1
            r8 = 35
            goto L_0x00d8
        L_0x00c3:
            java.util.Map r1 = r10.A06
            boolean r0 = X.C90484aE.A1Y(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r7 = 1
            r8 = 256(0x100, float:3.59E-43)
            X.9Ci r6 = X.C198429dX.A0w
        L_0x00d8:
            java.util.ArrayList r0 = r4.A00(r5, r6, r7, r8, r9)
            r1.put(r2, r0)
        L_0x00df:
            int r0 = r10.A00
            java.lang.Object r0 = X.C36371kC.A0r(r1, r0)
            return r0
        L_0x00e6:
            java.util.List r0 = r10.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692688k.A06(X.9Ci):java.lang.Object");
    }

    public void A07(int i) {
        this.A00 = i;
        if (i != -1) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
            }
        }
    }
}
