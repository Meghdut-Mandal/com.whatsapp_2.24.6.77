package org.pjsip;

import X.AnonymousClass76I;
import X.C1278669y;
import X.C20760y7;
import X.C20810yC;
import X.C227315o;
import android.os.Build;
import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public final class PjCameraInfo {
    public static final Comparator CAMERA_SIZE_COMPARATOR = AnonymousClass76I.A00;
    public static final Pair PAIR_1280_720 = new Pair(Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH), Integer.valueOf(VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
    public static final C20760y7 ZOOMING_OPPO_MODELS;
    public static final C20760y7 ZOOMING_VIVO_MODELS;
    public final int deviceType;
    public final int facing;
    public final int orient;
    public final int[] supportedFormat;
    public final int[] supportedSize;

    public static PjCameraInfo createHammerheadCameraInfo() {
        return new PjCameraInfo(0, 90, 2, new int[]{VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT}, new int[]{1});
    }

    public static PjCameraInfo createScreenSharingInfo(int i) {
        return new PjCameraInfo(0, i, 1, new int[]{640, 480}, new int[]{1});
    }

    static {
        C227315o r1 = new C227315o();
        r1.add((Object) "CPH2023");
        r1.add((Object) "CPH2025");
        r1.add((Object) "CPH2363");
        ZOOMING_OPPO_MODELS = r1.build();
        C227315o r12 = new C227315o();
        r12.add((Object) "V2027");
        r12.add((Object) "V2029");
        r12.add((Object) "V2130");
        ZOOMING_VIVO_MODELS = r12.build();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: X.69y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: X.69y} */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ce, code lost:
        if (r12 >= 0) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d0, code lost:
        r5.addAll(r6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.pjsip.PjCameraInfo createFromRawInfo(X.C132226Ss r14, X.C20810yC r15, X.C27631Pa r16) {
        /*
            int[] r1 = r14.A06
            int r0 = r1.length
            int[] r9 = java.util.Arrays.copyOf(r1, r0)
            int[] r5 = getEncoderSupportedColorFormats(r16)
            r8 = 0
            r3 = 0
            r4 = 0
        L_0x000e:
            r2 = r5[r3]
            r1 = 0
        L_0x0011:
            int r0 = r9.length
            if (r1 >= r0) goto L_0x0044
            r0 = r9[r1]
            if (r0 != r2) goto L_0x004c
            r0 = r9[r8]
            r9[r1] = r0
            r9[r8] = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo preferred formats "
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r5)
            r1.append(r0)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " is available ."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 1
        L_0x0044:
            int r3 = r3 + 1
            r0 = 3
            if (r3 >= r0) goto L_0x004f
            if (r4 != 0) goto L_0x004f
            goto L_0x000e
        L_0x004c:
            int r1 = r1 + 1
            goto L_0x0011
        L_0x004f:
            boolean r7 = r14.A05
            java.util.List r0 = r14.A03
            if (r0 == 0) goto L_0x01d4
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01d4
            r5 = 640(0x280, float:8.97E-43)
            r13 = 480(0x1e0, float:6.73E-43)
            boolean r0 = X.C113155f5.A00
            if (r0 == 0) goto L_0x006c
            r5 = 320(0x140, float:4.48E-43)
            r13 = 240(0xf0, float:3.36E-43)
        L_0x006c:
            X.69y r10 = preferredCaptureSize(r15)
            if (r10 == 0) goto L_0x0151
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto L_0x0151
            int r3 = r10.A01
            int r11 = r10.A00
        L_0x007c:
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r16)
            java.lang.String r0 = "disable_device_specific_camera_size"
            boolean r0 = r1.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x0139
            r4 = 0
        L_0x0089:
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r16)
            if (r7 == 0) goto L_0x0115
            java.lang.String r2 = "video_call_front_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00a3
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r16)
            java.lang.String r0 = "video_call_front_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00b5
        L_0x00a3:
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r16)
            int r3 = r0.getInt(r2, r3)
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r16)
            java.lang.String r0 = "video_call_front_camera_height"
        L_0x00b1:
            int r11 = r1.getInt(r0, r11)
        L_0x00b5:
            X.69y r0 = new X.69y
            r0.<init>(r3, r11)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x0112
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "voip/video/PJCameraInfo camera does not support requested resolution: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "x"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ". Using default resolution instead."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e1:
            X.69y r11 = r14.A02
            if (r11 == 0) goto L_0x00f3
            int r1 = r11.A00
            int r0 = r11.A01
            int r1 = r1 * r0
            r0 = 307200(0x4b000, float:4.30479E-40)
            if (r1 > r0) goto L_0x00f3
            java.lang.Object r11 = r6.get(r8)
        L_0x00f3:
            java.util.Comparator r0 = CAMERA_SIZE_COMPARATOR
            java.util.Collections.sort(r6, r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x00fc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r2.next()
            X.69y r0 = (X.C1278669y) r0
            int r1 = r0.A01
            r0 = 720(0x2d0, float:1.009E-42)
            if (r1 != r0) goto L_0x00fc
            r2.remove()
            goto L_0x00fc
        L_0x0112:
            r5 = r3
            r13 = r11
            goto L_0x00e1
        L_0x0115:
            java.lang.String r2 = "video_call_back_camera_width"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0129
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r16)
            java.lang.String r0 = "video_call_back_camera_height"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00b5
        L_0x0129:
            android.content.SharedPreferences r0 = X.C27631Pa.A00(r16)
            int r3 = r0.getInt(r2, r3)
            android.content.SharedPreferences r1 = X.C27631Pa.A00(r16)
            java.lang.String r0 = "video_call_back_camera_height"
            goto L_0x00b1
        L_0x0139:
            android.util.Pair r4 = deviceSpecificSize(r7)
            if (r4 == 0) goto L_0x0089
            java.lang.Object r0 = r4.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Object r0 = r4.second
            java.lang.Number r0 = (java.lang.Number) r0
            int r11 = r0.intValue()
            goto L_0x0089
        L_0x0151:
            r3 = r5
            r11 = r13
            goto L_0x007c
        L_0x0155:
            r3 = -1
            r12 = -1
            r2 = 0
        L_0x0158:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x018b
            java.lang.Object r1 = r6.get(r2)
            X.69y r1 = (X.C1278669y) r1
            boolean r0 = r1.equals(r11)
            if (r0 == 0) goto L_0x016b
            r12 = r2
        L_0x016b:
            int r0 = r1.A01
            if (r0 != r5) goto L_0x0188
            if (r3 < 0) goto L_0x0187
            int r0 = r1.A00
            int r0 = r0 - r13
            int r1 = java.lang.Math.abs(r0)
            java.lang.Object r0 = r6.get(r3)
            X.69y r0 = (X.C1278669y) r0
            int r0 = r0.A00
            int r0 = r0 - r13
            int r0 = java.lang.Math.abs(r0)
            if (r1 >= r0) goto L_0x0188
        L_0x0187:
            r3 = r2
        L_0x0188:
            int r2 = r2 + 1
            goto L_0x0158
        L_0x018b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r3 < 0) goto L_0x01ce
            java.lang.Object r11 = r6.get(r3)
        L_0x0196:
            r5.add(r11)
        L_0x0199:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01e0
            if (r4 != 0) goto L_0x01e0
            if (r10 != 0) goto L_0x01e0
            r4 = 0
        L_0x01a4:
            int r0 = r6.size()
            if (r4 >= r0) goto L_0x01e0
            java.lang.Object r3 = r6.get(r4)
            X.69y r3 = (X.C1278669y) r3
            int r2 = r3.A01
            java.lang.Object r0 = r5.get(r8)
            X.69y r0 = (X.C1278669y) r0
            int r0 = r0.A00
            int r2 = r2 * r0
            int r1 = r3.A00
            java.lang.Object r0 = r5.get(r8)
            X.69y r0 = (X.C1278669y) r0
            int r0 = r0.A01
            int r1 = r1 * r0
            if (r2 != r1) goto L_0x01cb
            r5.add(r3)
        L_0x01cb:
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01ce:
            if (r12 >= 0) goto L_0x0196
            r5.addAll(r6)
            goto L_0x0199
        L_0x01d4:
            java.lang.String r0 = "voip/video/PJCameraInfo previewSizes is null, use 640x480 by default."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {640, 480} // fill-array
            goto L_0x01e4
        L_0x01e0:
            int[] r2 = SizeListToIntArray(r5)
        L_0x01e4:
            int r1 = r14.A01
            org.pjsip.PjCameraInfo r0 = new org.pjsip.PjCameraInfo
            r0.<init>(r7, r1, r2, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.createFromRawInfo(X.6Ss, X.0yC, X.1Pa):org.pjsip.PjCameraInfo");
    }

    public static Pair deviceSpecificSize(boolean z) {
        String str = Build.MANUFACTURER;
        if (!"samsung".equalsIgnoreCase(str)) {
            if (!z) {
                return null;
            }
            if (!isHighEndPixelModel() && !isMotorolaRazrModel() && ((!"OPPO".equals(str) || !ZOOMING_OPPO_MODELS.contains(Build.MODEL)) && (!"vivo".equals(Build.MANUFACTURER) || !ZOOMING_VIVO_MODELS.contains(Build.MODEL)))) {
                return null;
            }
        }
        return PAIR_1280_720;
    }

    public static Integer getNumeralFrom(String str) {
        try {
            return Integer.valueOf(Integer.parseInt(str.replaceAll("[^0-9]", "")));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean isHighEndPixelModel() {
        String str = Build.MODEL;
        if (!str.contains("Pixel")) {
            return false;
        }
        String str2 = Build.MODEL;
        Integer numeralFrom = getNumeralFrom(str);
        if (numeralFrom == null || numeralFrom.intValue() < 6) {
            return false;
        }
        return true;
    }

    public static boolean isMotorolaRazrModel() {
        return Build.MODEL.contains("motorola razr");
    }

    public static /* synthetic */ int lambda$static$0(C1278669y r2, C1278669y r3) {
        int i = r2.A01;
        int i2 = r3.A01;
        if (i > i2) {
            return -1;
        }
        if (i == i2) {
            return Integer.compare(r3.A00, r2.A00);
        }
        return 1;
    }

    public static C1278669y preferredCaptureSize(C20810yC r4) {
        String A09 = r4.A09(3266);
        if (!A09.isEmpty()) {
            String[] split = A09.split(",[ ]*");
            if (split.length == 2) {
                try {
                    return new C1278669y(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } catch (NumberFormatException e) {
                    Log.e("voip/video/PJCameraInfo/preferredCaptureSize invalid capture size", e);
                }
            }
        }
        return null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("facing ");
        if (this.facing == 0) {
            str = "back";
        } else {
            str = "front";
        }
        sb.append(str);
        sb.append(", orientation: ");
        sb.append(this.orient);
        sb.append(", returned preview formats: ");
        sb.append(Arrays.toString(this.supportedFormat));
        sb.append(", returned preview size: ");
        sb.append(Arrays.toString(this.supportedSize));
        return sb.toString();
    }

    public PjCameraInfo(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        this.facing = i;
        this.orient = i2;
        this.supportedSize = iArr;
        this.supportedFormat = iArr2;
        this.deviceType = i3;
    }

    public static int[] SizeListToIntArray(List list) {
        int[] iArr = new int[(list.size() * 2)];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C1278669y r2 = (C1278669y) it.next();
            int i2 = i + 1;
            iArr[i] = r2.A01;
            i = i2 + 1;
            iArr[i2] = r2.A00;
        }
        return iArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (r1.startsWith("hwG") != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r1.equalsIgnoreCase("ks01lte") == false) goto L_0x0043;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int[] getEncoderSupportedColorFormats(X.C27631Pa r3) {
        /*
            android.content.SharedPreferences r2 = X.C27631Pa.A00(r3)
            java.lang.String r1 = "video_encoder_frame_convertor_color_id"
            r0 = -1
            int r3 = r2.getInt(r1, r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0043
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "MSM8960"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "universal7580"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "xcover3lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "ks01lte"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0043
        L_0x0039:
            r2 = 1
        L_0x003a:
            r1 = 3
            if (r2 == 0) goto L_0x0061
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        L_0x0043:
            java.lang.String r1 = android.os.Build.BOARD
            java.lang.String r0 = "7x27"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r0 = "hwY"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "hwG"
            boolean r0 = r1.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L_0x003a
            goto L_0x0039
        L_0x0061:
            r0 = 1
            if (r3 != r0) goto L_0x006a
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x006a:
            r0 = 2
            if (r3 != r0) goto L_0x0073
            int[] r0 = new int[r1]
            r0 = {842094169, 35, 17} // fill-array
            return r0
        L_0x0073:
            if (r3 == r1) goto L_0x007e
            r0 = 4
            if (r3 == r0) goto L_0x007e
            int[] r0 = new int[r1]
            r0 = {35, 842094169, 17} // fill-array
            return r0
        L_0x007e:
            int[] r0 = new int[r1]
            r0 = {17, 35, 842094169} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pjsip.PjCameraInfo.getEncoderSupportedColorFormats(X.1Pa):int[]");
    }

    public PjCameraInfo(int i, int i2, int[] iArr, int[] iArr2) {
        this(i, i2, 0, iArr, iArr2);
    }
}
