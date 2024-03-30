package X;

import java.util.Arrays;

/* renamed from: X.6Sh  reason: invalid class name and case insensitive filesystem */
public class C132136Sh {
    public static final C108235Ss A02 = C108235Ss.STRETCH;
    public static final AnonymousClass5SZ A03 = AnonymousClass5SZ.STRETCH;
    public static final AnonymousClass5TO A04 = AnonymousClass5TO.ROW;
    public static final AnonymousClass5TW A05 = AnonymousClass5TW.FLEX_START;
    public static final AnonymousClass5TD A06 = AnonymousClass5TD.NO_WRAP;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(C132136Sh r3, int i) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d2, code lost:
        r3.append(r0);
        r3.append(r1);
        r3.append("\n");
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010b, code lost:
        r3.append("\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010e, code lost:
        r4 = r4 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            r4 = 0
        L_0x0005:
            int r0 = r7.A00
            if (r4 >= r0) goto L_0x0133
            r0 = 11
            java.lang.Integer[] r2 = X.C023109s.A00(r0)
            float[] r1 = r7.A01
            r0 = r1[r4]
            int r0 = (int) r0
            int r2 = X.C90524aI.A06(r2, r0)
            java.lang.String r0 = "  padding"
            java.lang.String r6 = ": "
            java.lang.String r5 = "\n"
            switch(r2) {
                case 0: goto L_0x0032;
                case 1: goto L_0x004b;
                case 2: goto L_0x0069;
                case 3: goto L_0x0093;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00b3;
                case 6: goto L_0x00c3;
                case 7: goto L_0x00df;
                case 8: goto L_0x00e3;
                case 9: goto L_0x00ec;
                case 10: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0005
        L_0x0022:
            int r0 = r4 + 1
            r1 = r1[r0]
            java.lang.String r0 = " pointScalingFactor: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            goto L_0x0005
        L_0x0032:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0048
            r0 = 1
            if (r2 == r0) goto L_0x0045
            r0 = 2
            if (r2 != r0) goto L_0x0112
            X.5TC r1 = X.AnonymousClass5TC.RTL
        L_0x0041:
            java.lang.String r0 = "  direction: "
            goto L_0x00d2
        L_0x0045:
            X.5TC r1 = X.AnonymousClass5TC.LTR
            goto L_0x0041
        L_0x0048:
            X.5TC r1 = X.AnonymousClass5TC.INHERIT
            goto L_0x0041
        L_0x004b:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0066
            r0 = 1
            if (r2 == r0) goto L_0x0063
            r0 = 2
            if (r2 == r0) goto L_0x0060
            r0 = 3
            if (r2 != r0) goto L_0x011d
            X.5TO r1 = X.AnonymousClass5TO.COLUMN_REVERSE
        L_0x005d:
            java.lang.String r0 = "  flexDirection: "
            goto L_0x00d2
        L_0x0060:
            X.5TO r1 = X.AnonymousClass5TO.COLUMN
            goto L_0x005d
        L_0x0063:
            X.5TO r1 = X.AnonymousClass5TO.ROW_REVERSE
            goto L_0x005d
        L_0x0066:
            X.5TO r1 = X.AnonymousClass5TO.ROW
            goto L_0x005d
        L_0x0069:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0090
            r0 = 1
            if (r2 == r0) goto L_0x008d
            r0 = 2
            if (r2 == r0) goto L_0x008a
            r0 = 3
            if (r2 == r0) goto L_0x0087
            r0 = 4
            if (r2 == r0) goto L_0x0084
            r0 = 5
            if (r2 != r0) goto L_0x0128
            X.5TW r1 = X.AnonymousClass5TW.SPACE_EVENLY
        L_0x0081:
            java.lang.String r0 = "  justifyContent: "
            goto L_0x00d2
        L_0x0084:
            X.5TW r1 = X.AnonymousClass5TW.SPACE_AROUND
            goto L_0x0081
        L_0x0087:
            X.5TW r1 = X.AnonymousClass5TW.SPACE_BETWEEN
            goto L_0x0081
        L_0x008a:
            X.5TW r1 = X.AnonymousClass5TW.FLEX_END
            goto L_0x0081
        L_0x008d:
            X.5TW r1 = X.AnonymousClass5TW.CENTER
            goto L_0x0081
        L_0x0090:
            X.5TW r1 = X.AnonymousClass5TW.FLEX_START
            goto L_0x0081
        L_0x0093:
            X.5Ss[] r2 = X.C108235Ss.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignContent: "
            goto L_0x00d2
        L_0x00a3:
            X.5SZ[] r2 = X.AnonymousClass5SZ.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignItems: "
            goto L_0x00d2
        L_0x00b3:
            X.5TD[] r2 = X.AnonymousClass5TD.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  flexWrap: "
            goto L_0x00d2
        L_0x00c3:
            X.5T5[] r2 = X.AnonymousClass5T5.values()
            float[] r1 = r7.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  overflow: "
        L_0x00d2:
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00df:
            X.C90464aC.A1O(r0, r3, r1, r4)
            goto L_0x010b
        L_0x00e3:
            X.C90464aC.A1O(r0, r3, r1, r4)
            java.lang.String r0 = "%\n"
            r3.append(r0)
            goto L_0x010e
        L_0x00ec:
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            java.lang.Integer r2 = X.AnonymousClass3LM.A00(r0)
            int r0 = r4 + 2
            r1 = r1[r0]
            java.lang.String r0 = "  border"
            r3.append(r0)
            java.lang.String r0 = X.AnonymousClass3LM.A01(r2)
            r3.append(r0)
            r3.append(r6)
            r3.append(r1)
        L_0x010b:
            r3.append(r5)
        L_0x010e:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x0112:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x011d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0128:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unknown enum value: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
            throw r0
        L_0x0133:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x014c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "{\n"
            r1.append(r0)
            X.C36351kA.A1K(r3, r1)
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            return r0
        L_0x014c:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132136Sh.toString():java.lang.String");
    }
}
