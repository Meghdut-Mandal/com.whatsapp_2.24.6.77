package X;

import java.util.Arrays;

/* renamed from: X.6Um  reason: invalid class name */
public class AnonymousClass6Um {
    public static final C108195So A02 = C108195So.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static float[] A02(AnonymousClass6Um r1) {
        A00(r1, 2);
        return r1.A01;
    }

    public static void A00(AnonymousClass6Um r3, int i) {
        int i2 = r3.A00 + i;
        float[] fArr = r3.A01;
        int length = fArr.length;
        if (i2 > length) {
            int i3 = length * 2;
            if (i3 < i2) {
                i3 += i2 - i3;
            }
            r3.A01 = Arrays.copyOf(fArr, i3);
        }
    }

    public static boolean A01(float f) {
        return AnonymousClass000.A1Q(Float.compare(f, Float.NaN));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r3.append(r11[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a2, code lost:
        r3.append(r11[r4 + 1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r3.append(r0);
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00bf, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e6, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ed, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f4, code lost:
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f7, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r4 = 0
        L_0x0005:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x010a
            r0 = 32
            java.lang.Integer[] r1 = X.C023109s.A00(r0)
            float[] r11 = r12.A01
            r0 = r11[r4]
            int r0 = (int) r0
            int r16 = X.C90524aI.A06(r1, r0)
            java.lang.String r15 = "  position"
            java.lang.String r14 = "  maxHeight: "
            java.lang.String r13 = "  minHeight: "
            java.lang.String r10 = "  height: "
            java.lang.String r9 = "  maxWidth: "
            java.lang.String r8 = "  minWidth: "
            java.lang.String r7 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r6 = "  margin"
            java.lang.String r2 = ": "
            java.lang.String r1 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x0036;
                case 1: goto L_0x0039;
                case 2: goto L_0x003c;
                case 3: goto L_0x009f;
                case 4: goto L_0x003f;
                case 5: goto L_0x0035;
                case 6: goto L_0x0043;
                case 7: goto L_0x0047;
                case 8: goto L_0x0035;
                case 9: goto L_0x004b;
                case 10: goto L_0x004f;
                case 11: goto L_0x0053;
                case 12: goto L_0x0057;
                case 13: goto L_0x005b;
                case 14: goto L_0x005f;
                case 15: goto L_0x0035;
                case 16: goto L_0x0063;
                case 17: goto L_0x0067;
                case 18: goto L_0x006b;
                case 19: goto L_0x006f;
                case 20: goto L_0x007d;
                case 21: goto L_0x008d;
                case 22: goto L_0x009d;
                case 23: goto L_0x00aa;
                case 24: goto L_0x00c3;
                case 25: goto L_0x00c7;
                case 26: goto L_0x00cb;
                case 27: goto L_0x00ea;
                case 28: goto L_0x00f1;
                case 29: goto L_0x00fb;
                case 30: goto L_0x00fe;
                case 31: goto L_0x0101;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0005
        L_0x0036:
            java.lang.String r0 = "  flex: "
            goto L_0x009f
        L_0x0039:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x009f
        L_0x003c:
            java.lang.String r0 = "  flexShrink: "
            goto L_0x009f
        L_0x003f:
            r3.append(r0)
            goto L_0x0072
        L_0x0043:
            r3.append(r7)
            goto L_0x00a2
        L_0x0047:
            r3.append(r7)
            goto L_0x0072
        L_0x004b:
            r3.append(r8)
            goto L_0x00a2
        L_0x004f:
            r3.append(r8)
            goto L_0x0072
        L_0x0053:
            r3.append(r9)
            goto L_0x00a2
        L_0x0057:
            r3.append(r9)
            goto L_0x0072
        L_0x005b:
            r3.append(r10)
            goto L_0x00a2
        L_0x005f:
            r3.append(r10)
            goto L_0x0072
        L_0x0063:
            r3.append(r13)
            goto L_0x00a2
        L_0x0067:
            r3.append(r13)
            goto L_0x0072
        L_0x006b:
            r3.append(r14)
            goto L_0x00a2
        L_0x006f:
            r3.append(r14)
        L_0x0072:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            r3.append(r1)
            goto L_0x00e6
        L_0x007d:
            X.5So[] r2 = X.C108195So.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            goto L_0x00b9
        L_0x008d:
            X.5T8[] r2 = X.AnonymousClass5T8.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
            goto L_0x00b9
        L_0x009d:
            java.lang.String r0 = "  aspectRatio: "
        L_0x009f:
            r3.append(r0)
        L_0x00a2:
            int r0 = r4 + 1
            r0 = r11[r0]
            r3.append(r0)
            goto L_0x00bf
        L_0x00aa:
            X.5T4[] r2 = X.AnonymousClass5T4.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
        L_0x00b9:
            r3.append(r0)
            r3.append(r1)
        L_0x00bf:
            r3.append(r5)
            goto L_0x00e6
        L_0x00c3:
            X.C90464aC.A1O(r6, r3, r11, r4)
            goto L_0x00ed
        L_0x00c7:
            X.C90464aC.A1O(r6, r3, r11, r4)
            goto L_0x00f4
        L_0x00cb:
            int r0 = r4 + 1
            r0 = r11[r0]
            int r0 = (int) r0
            java.lang.Integer r0 = X.AnonymousClass3LM.A00(r0)
            r3.append(r6)
            java.lang.String r0 = X.AnonymousClass3LM.A01(r0)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
        L_0x00e6:
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00ea:
            X.C90464aC.A1O(r15, r3, r11, r4)
        L_0x00ed:
            r3.append(r5)
            goto L_0x00f7
        L_0x00f1:
            X.C90464aC.A1O(r15, r3, r11, r4)
        L_0x00f4:
            r3.append(r1)
        L_0x00f7:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x00fb:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x0103
        L_0x00fe:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
            goto L_0x0103
        L_0x0101:
            java.lang.String r0 = "  enableTextRounding: true\n"
        L_0x0103:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0005
        L_0x010a:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0123
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "{\n"
            r1.append(r0)
            X.C36351kA.A1K(r3, r1)
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            return r0
        L_0x0123:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Um.toString():java.lang.String");
    }
}
