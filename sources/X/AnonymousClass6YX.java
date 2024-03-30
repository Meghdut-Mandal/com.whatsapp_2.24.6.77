package X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.6YX  reason: invalid class name */
public class AnonymousClass6YX {
    public static final Object A08 = "false";
    public static final Object A09 = "length";
    public static final Object A0A = C129316Gk.A00(1.0d);
    public static final Object A0B = "true";
    public static final Object A0C = C129316Gk.A00(0.0d);
    public int A00;
    public int A01;
    public int A02;
    public C115225iX A03;
    public int[] A04 = new int[16];
    public Object[] A05 = new Object[16];
    public final Random A06 = new Random();
    public final Object A07 = AnonymousClass001.A0J();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        if (r4 > 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r4 < 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
        if (r9 != 1) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        r7 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0H(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            int r0 = r8.A01
            int r1 = r0 + -1
            java.lang.Object[] r0 = r8.A05
            r4 = r0[r1]
            r5 = 1
            int r1 = r1 - r5
            r2 = r0[r1]
            boolean r0 = r2 instanceof java.lang.Long
            r6 = 2
            if (r0 == 0) goto L_0x0037
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L_0x0037
            long r2 = X.C36431kI.A09(r2)
            long r0 = X.C36431kI.A09(r4)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0020:
            if (r9 == 0) goto L_0x006a
            if (r9 == r5) goto L_0x0065
        L_0x0024:
            if (r9 == r6) goto L_0x0034
            if (r4 > 0) goto L_0x0029
        L_0x0028:
            r7 = 1
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r8.A0E(r5, r0)
            A0K(r8)
            return
        L_0x0034:
            if (r4 >= 0) goto L_0x0029
            goto L_0x0028
        L_0x0037:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x0048
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L_0x0048
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r2.compareTo(r4)
            goto L_0x0020
        L_0x0048:
            java.lang.Number r1 = A07(r2)
            java.lang.Number r0 = A07(r4)
            if (r1 == 0) goto L_0x006d
            if (r0 == 0) goto L_0x006d
            double r2 = r1.doubleValue()
            double r0 = r0.doubleValue()
            if (r9 == 0) goto L_0x0068
            if (r9 == r5) goto L_0x0063
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x0024
        L_0x0063:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0065:
            if (r4 <= 0) goto L_0x0029
            goto L_0x0028
        L_0x0068:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x006a:
            if (r4 < 0) goto L_0x0029
            goto L_0x0028
        L_0x006d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Incompatible operand types of "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r10, r1)
            A0O(r2, r4, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YX.A0H(int, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v54, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v138, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v139, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v140, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v145, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v146, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v150, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v154, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v158, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v159, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v160, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v47, resolved type: X.5xd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v48, resolved type: X.4vP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v49, resolved type: X.4vP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v285, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v286, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v288, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v289, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v290, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v291, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v292, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v293, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v294, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: java.util.HashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v80, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v81, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v82, resolved type: java.lang.Number} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v54, resolved type: X.4vP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: X.4vP} */
    /* JADX WARNING: type inference failed for: r2v24, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x031e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0380, code lost:
        r11.A0Z(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0545, code lost:
        if (r0 != false) goto L_0x1206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x056e, code lost:
        if (r0 == false) goto L_0x1206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0579, code lost:
        r18.getShort();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0604, code lost:
        if (r1 == r2) goto L_0x0606;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060e, code lost:
        if (r2 != null) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0748, code lost:
        r11.A0E(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0767, code lost:
        r11.A0E(r1, r11.A0Y(A09(r11)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08a2, code lost:
        r11.A0Z(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0de9, code lost:
        if (r2 == null) goto L_0x0deb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x0e9b, code lost:
        X.C132516Ub.A01(r9, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0eb4, code lost:
        X.C132516Ub.A01(r9, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x0f7b, code lost:
        if (r1 == null) goto L_0x0f7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:776:0x0fb5, code lost:
        X.C132516Ub.A01(r9, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x1085, code lost:
        r18.position(r1 + r16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x024d, code lost:
        r11.A0E(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x12e3, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("Type assertion failed. Expected ");
        r1.append(r4);
        r1.append(", got ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:880:0x12f4, code lost:
        if (r3 != null) goto L_0x12f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:881:0x12f6, code lost:
        r0 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:882:0x12f9, code lost:
        r0 = X.AnonymousClass000.A0k(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:883:0x12fd, code lost:
        r1 = A0B(X.AnonymousClass000.A0q(r0, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x132b, code lost:
        r1 = A0C("ArrayCopy dst index out of range");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:889:0x1332, code lost:
        r1 = A0C("ArrayCopy src index out of range");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x1340, code lost:
        r1 = A0C("StringSearch offset out of range");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:893:0x134e, code lost:
        r1 = A0C("SubstringCompare offset out of range");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:895:0x135c, code lost:
        r1 = A0C("Substring offset out of range");
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05e1 A[Catch:{ 78S -> 0x13a1 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0J(X.AnonymousClass6YX r35) {
        /*
            r1 = 4
            r11 = r35
            int r0 = r11.A00
            int r0 = r0 - r1
            X.6oZ r17 = A03(r11, r0)
            r0 = r17
            X.63L r2 = r0.A00
            X.6TG r0 = r2.A03
            r35 = r0
            java.nio.ByteBuffer r0 = r0.A01
            java.nio.ByteBuffer r18 = r0.duplicate()
            java.nio.ByteOrder r1 = r0.order()
            r0 = r18
            r0.order(r1)
            int r1 = r2.A02
            r0.position(r1)
            int r0 = r2.A00
            int r1 = r1 + r0
            r0 = r18
            r0.limit(r1)
            int r1 = r18.position()
            byte r0 = r0.get(r1)
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = 2
            r3 = 1
            r1 = 0
            if (r0 != r10) goto L_0x13d3
            r16 = 0
            r19 = 0
        L_0x0041:
            int r16 = r18.position()     // Catch:{ 78S -> 0x13a1 }
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r5 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = "vector index out of range"
            java.lang.String r7 = "key not in map"
            r20 = 0
            java.lang.String r6 = "invalid get_by_val vector index"
            java.lang.String r4 = "modifying immutable container"
            r2 = 3
            switch(r5) {
                case 0: goto L_0x04da;
                case 1: goto L_0x0fe6;
                case 2: goto L_0x1183;
                case 3: goto L_0x0fbb;
                case 4: goto L_0x00d9;
                case 5: goto L_0x0912;
                case 6: goto L_0x08d2;
                case 7: goto L_0x04b9;
                case 8: goto L_0x08a7;
                case 9: goto L_0x0478;
                case 10: goto L_0x0826;
                case 11: goto L_0x120a;
                case 12: goto L_0x136f;
                case 13: goto L_0x117c;
                case 14: goto L_0x108e;
                case 15: goto L_0x0735;
                case 16: goto L_0x0459;
                case 17: goto L_0x0418;
                case 18: goto L_0x03e3;
                case 19: goto L_0x0388;
                case 20: goto L_0x0343;
                case 21: goto L_0x02ea;
                case 22: goto L_0x02ea;
                case 23: goto L_0x02bf;
                case 24: goto L_0x0290;
                case 25: goto L_0x0290;
                case 26: goto L_0x0268;
                case 27: goto L_0x0214;
                case 28: goto L_0x01df;
                case 29: goto L_0x01df;
                case 30: goto L_0x023a;
                case 31: goto L_0x0076;
                case 32: goto L_0x0076;
                case 33: goto L_0x081d;
                case 34: goto L_0x1079;
                case 35: goto L_0x07f4;
                case 36: goto L_0x07d9;
                case 37: goto L_0x07c7;
                case 38: goto L_0x07aa;
                case 39: goto L_0x090c;
                case 40: goto L_0x1175;
                case 41: goto L_0x116e;
                case 42: goto L_0x079d;
                case 43: goto L_0x0790;
                case 44: goto L_0x0782;
                case 45: goto L_0x0774;
                case 46: goto L_0x11ff;
                case 47: goto L_0x01cc;
                case 48: goto L_0x074d;
                case 49: goto L_0x0767;
                case 50: goto L_0x0723;
                case 51: goto L_0x0711;
                case 52: goto L_0x06ff;
                case 53: goto L_0x06e1;
                case 54: goto L_0x06d0;
                case 55: goto L_0x06b8;
                case 56: goto L_0x06a3;
                case 57: goto L_0x067f;
                case 58: goto L_0x0667;
                case 59: goto L_0x1167;
                case 60: goto L_0x1160;
                case 61: goto L_0x1159;
                case 62: goto L_0x1152;
                case 63: goto L_0x114a;
                case 64: goto L_0x019c;
                case 65: goto L_0x064c;
                case 66: goto L_0x1142;
                case 67: goto L_0x113a;
                case 68: goto L_0x1131;
                case 69: goto L_0x1128;
                case 70: goto L_0x111f;
                case 71: goto L_0x1116;
                case 72: goto L_0x0634;
                case 73: goto L_0x110d;
                case 74: goto L_0x1104;
                case 75: goto L_0x10fb;
                case 76: goto L_0x10f2;
                case 77: goto L_0x10e9;
                case 78: goto L_0x061c;
                case 79: goto L_0x10e0;
                case 80: goto L_0x10d7;
                case 81: goto L_0x10ce;
                case 82: goto L_0x10c5;
                case 83: goto L_0x10bc;
                case 84: goto L_0x10b3;
                case 85: goto L_0x057e;
                case 86: goto L_0x057e;
                case 87: goto L_0x10ac;
                case 88: goto L_0x10a5;
                case 89: goto L_0x109e;
                case 90: goto L_0x1097;
                case 91: goto L_0x0576;
                case 92: goto L_0x0572;
                case 93: goto L_0x055c;
                case 94: goto L_0x0549;
                case 95: goto L_0x0533;
                case 96: goto L_0x0520;
                case 97: goto L_0x0517;
                case 98: goto L_0x107e;
                default: goto L_0x0059;
            }
        L_0x0059:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "Unsupported opcode "
            r1.append(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String[] r0 = X.C113075ex.A00     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r5]     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            A0P(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x0076:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r8 = r0 + -1
            int r0 = r8 - r10
            java.lang.Object[] r1 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r6 = r1[r0]     // Catch:{ 78S -> 0x13a1 }
            r7 = r1[r8]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = "vector_resize 1st argument must be a vector"
            java.lang.RuntimeException r1 = A0A(r6, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x008e:
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            int r8 = r8 - r3
            r3 = r1[r8]     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            java.lang.String r1 = "invalid vector_resize_length"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r3 = r11.A0X(r3, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            int r1 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            if (r3 <= r1) goto L_0x00b4
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            if (r0 == 0) goto L_0x00ab
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            r0.ensureCapacity(r3)     // Catch:{ UnsupportedOperationException -> 0x00c8 }
        L_0x00ab:
            r6.add(r7)     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            int r1 = r1 + 1
            if (r3 > r1) goto L_0x00ab
            goto L_0x08a2
        L_0x00b4:
            if (r3 >= r1) goto L_0x08a2
        L_0x00b6:
            int r1 = r1 + -1
            r6.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            if (r3 < r1) goto L_0x00b6
            boolean r0 = r6 instanceof java.util.ArrayList     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            if (r0 == 0) goto L_0x08a2
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            r6.trimToSize()     // Catch:{ UnsupportedOperationException -> 0x00c8 }
            goto L_0x08a2
        L_0x00c8:
            r1 = move-exception
            r0 = 32
            if (r5 == r0) goto L_0x08a2
            A0T(r4, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x00d9:
            short r3 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r5 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            X.5ov r2 = r0.A01     // Catch:{ 78S -> 0x13a1 }
            r0 = r35
            java.lang.Object r4 = r0.A01(r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ 78S -> 0x13a1 }
            int r7 = r5 + -1
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r3 = r0 + -1
            int r3 = r3 - r7
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r3, r6, r1, r5)     // Catch:{ 78S -> 0x13a1 }
            int r7 = r11.A02     // Catch:{ 78S -> 0x13a1 }
            r0 = r16
            r11.A02 = r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 78S -> 0x13a1 }
            X.5iX r0 = r11.A03     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.util.List r8 = java.util.Arrays.asList(r6)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.5xd r6 = r0.A00     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r2 == 0) goto L_0x012d
            java.util.List r3 = r2.A01     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.7by r2 = r2.A00     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.4vP r6 = (X.C100674vP) r6     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r3 == 0) goto L_0x0127
            java.util.List r0 = r6.A06     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            boolean r0 = r3.equals(r0)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r0 != 0) goto L_0x0127
            boolean r0 = r3.isEmpty()     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r0 == 0) goto L_0x013e
        L_0x0127:
            if (r2 == 0) goto L_0x012d
            X.7by r0 = r6.A03     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r2 != r0) goto L_0x013e
        L_0x012d:
            X.7fJ r3 = r6.A02     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.5iW r2 = new X.5iW     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r2.<init>(r4)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.6MO r0 = new X.6MO     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r0.<init>(r8)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.Object r0 = r3.B6u(r0, r2, r6)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            goto L_0x0192
        L_0x013e:
            X.67i r0 = r6.A00     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r24 = r0
            X.7ku r0 = r6.A03     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r23 = r0
            if (r3 != 0) goto L_0x014a
            java.util.List r3 = r6.A06     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
        L_0x014a:
            java.util.Map r0 = r6.A08     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r22 = r0
            X.6Pl r0 = r6.A01     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r25 = r0
            java.util.Set r0 = r6.A09     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r21 = r0
            X.7fJ r0 = r6.A02     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r20 = r0
            X.6IK r15 = r6.A02     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.String r14 = r6.A06     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            if (r2 != 0) goto L_0x0162
            X.7by r2 = r6.A03     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
        L_0x0162:
            X.6IB r13 = r6.A01     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.String r12 = r6.A05     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.Integer r9 = r6.A04     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.ref.WeakReference r0 = r6.A07     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            java.lang.Object r0 = r0.get()     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.67i r0 = (X.C1271967i) r0     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            X.4vP r6 = new X.4vP     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            r27 = r23
            r28 = r20
            r29 = r9
            r30 = r14
            r31 = r12
            r32 = r3
            r33 = r22
            r34 = r21
            r20 = r6
            r21 = r2
            r22 = r13
            r23 = r24
            r24 = r0
            r26 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ 78W -> 0x1256, Exception -> 0x1232 }
            goto L_0x012d
        L_0x0192:
            r11.A02 = r7     // Catch:{ 78S -> 0x13a1 }
            r11.A0Z(r5)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x019c:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r4 = r0 + -1
            int r1 = r4 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r4]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x01c4
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 78S -> 0x13a1 }
            r0.append(r2)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1079
        L_0x01c4:
            r1 = 5
            java.lang.String r0 = "+"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x01cc:
            short r1 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            r0 = r35
            java.lang.Object r0 = r0.A01(r1)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x01df:
            short r6 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r0
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 - r3
            r1 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r0 = 28
            java.util.Map r1 = A0D(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            r0 = r35
            java.lang.Object r0 = r0.A01(r6)     // Catch:{ UnsupportedOperationException -> 0x0203 }
            r1.put(r0, r2)     // Catch:{ UnsupportedOperationException -> 0x0203 }
            goto L_0x0380
        L_0x0203:
            r1 = move-exception
            r0 = 29
            if (r5 == r0) goto L_0x0380
            A0T(r4, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x0214:
            short r4 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            r0 = 26
            java.util.Map r3 = A0D(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            r0 = r35
            java.lang.Object r2 = r0.A01(r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = r3.get(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x024d
            boolean r0 = r3.containsKey(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1259
            r0 = 0
            goto L_0x024d
        L_0x023a:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0252
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2.size()     // Catch:{ 78S -> 0x13a1 }
        L_0x0248:
            double r2 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
        L_0x024d:
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0252:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x025d
            java.util.List r2 = (java.util.List) r2     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2.size()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0248
        L_0x025d:
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x125f
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2.length()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0248
        L_0x0268:
            short r2 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Object r1 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            r0 = 26
            java.util.Map r1 = A0D(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
            r0 = r35
            java.lang.Object r0 = r0.A01(r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r1.containsKey(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0290:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r6 = r0 + -1
            int r1 = r6 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r6]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x02ae }
            if (r0 == 0) goto L_0x02a7
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ UnsupportedOperationException -> 0x02ae }
            r2.remove(r1)     // Catch:{ UnsupportedOperationException -> 0x02ae }
            goto L_0x0380
        L_0x02a7:
            java.lang.String r0 = "del_by_val 1st argument must be a map"
            java.lang.RuntimeException r0 = A0A(r2, r0)     // Catch:{ UnsupportedOperationException -> 0x02ae }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x02ae }
        L_0x02ae:
            r1 = move-exception
            r0 = 25
            if (r5 == r0) goto L_0x0380
            A0T(r4, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x02bf:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r5 = r0 + -1
            int r1 = r5 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r5]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x02dd }
            if (r0 == 0) goto L_0x02d6
            java.util.List r2 = (java.util.List) r2     // Catch:{ UnsupportedOperationException -> 0x02dd }
            r2.add(r1)     // Catch:{ UnsupportedOperationException -> 0x02dd }
            goto L_0x0380
        L_0x02d6:
            java.lang.String r0 = "vector_append 1st argument must be a vector"
            java.lang.RuntimeException r0 = A0A(r2, r0)     // Catch:{ UnsupportedOperationException -> 0x02dd }
            throw r0     // Catch:{ UnsupportedOperationException -> 0x02dd }
        L_0x02dd:
            r0 = move-exception
            A0T(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x02ea:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r8 = r0 + -1
            int r0 = r8 - r10
            java.lang.Object[] r1 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r6 = r1[r0]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r8 - r3
            r7 = r1[r0]     // Catch:{ 78S -> 0x13a1 }
            r3 = r1[r8]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r6 instanceof java.util.Map     // Catch:{ UnsupportedOperationException -> 0x0332 }
            if (r0 == 0) goto L_0x0305
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ UnsupportedOperationException -> 0x0332 }
            r6.put(r7, r3)     // Catch:{ UnsupportedOperationException -> 0x0332 }
            goto L_0x08a2
        L_0x0305:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ UnsupportedOperationException -> 0x0332 }
            if (r0 == 0) goto L_0x031f
            java.util.List r6 = (java.util.List) r6     // Catch:{ UnsupportedOperationException -> 0x0332 }
            java.lang.String r1 = "invalid put_by_val vector index"
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0X(r7, r1, r0)     // Catch:{ UnsupportedOperationException -> 0x0332 }
            int r0 = r6.size()     // Catch:{ UnsupportedOperationException -> 0x0332 }
            if (r1 <= r0) goto L_0x0326
            java.lang.RuntimeException r0 = A0C(r9)     // Catch:{ UnsupportedOperationException -> 0x0332 }
        L_0x031e:
            throw r0     // Catch:{ UnsupportedOperationException -> 0x0332 }
        L_0x031f:
            java.lang.String r0 = "put_by_val 1st argument must be a container"
            java.lang.RuntimeException r0 = A0A(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x0332 }
            goto L_0x031e
        L_0x0326:
            if (r1 != r0) goto L_0x032d
            r6.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0332 }
            goto L_0x08a2
        L_0x032d:
            r6.set(r1, r3)     // Catch:{ UnsupportedOperationException -> 0x0332 }
            goto L_0x08a2
        L_0x0332:
            r1 = move-exception
            r0 = 22
            if (r5 == r0) goto L_0x08a2
            A0T(r4, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x0343:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r7 = r0 + -1
            int r0 = r7 - r10
            java.lang.Object[] r2 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r4 = r2[r0]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r7 - r3
            r5 = r2[r0]     // Catch:{ 78S -> 0x13a1 }
            r2 = r2[r7]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0366
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x037d
            boolean r0 = r4.containsKey(r5)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0386
            goto L_0x0385
        L_0x0366:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1267
            java.util.List r4 = (java.util.List) r4     // Catch:{ 78S -> 0x13a1 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0X(r5, r6, r0)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r4.size()     // Catch:{ 78S -> 0x13a1 }
            if (r1 >= r0) goto L_0x0386
            java.lang.Object r0 = r4.get(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x037d:
            r11.A0E(r10, r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0380:
            r11.A0Z(r10)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0385:
            r2 = 0
        L_0x0386:
            r0 = r2
            goto L_0x037d
        L_0x0388:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r5 = r0 + -1
            int r2 = r5 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r4 = r0[r2]     // Catch:{ 78S -> 0x13a1 }
            r5 = r0[r5]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r4 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x03a8
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x03bf
            boolean r0 = r4.containsKey(r5)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1277
            r0 = 0
            goto L_0x03bf
        L_0x03a8:
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x03c4
            java.util.List r4 = (java.util.List) r4     // Catch:{ 78S -> 0x13a1 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0X(r5, r6, r0)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r4.size()     // Catch:{ 78S -> 0x13a1 }
            if (r1 >= r0) goto L_0x127d
            java.lang.Object r0 = r4.get(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x03bf:
            r11.A0E(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1079
        L_0x03c4:
            boolean r0 = r4 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x128b
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 78S -> 0x13a1 }
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.lang.String r0 = "invalid get_by_val string index"
            int r1 = r11.A0X(r5, r0, r1)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r4.length()     // Catch:{ 78S -> 0x13a1 }
            if (r1 >= r0) goto L_0x1283
            char r0 = r4.charAt(r1)     // Catch:{ 78S -> 0x13a1 }
            double r0 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x03bf
        L_0x03e3:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r4 = r0 + -1
            int r1 = r4 - r3
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r4]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0402
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x03f9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1079
        L_0x0402:
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x129b
            java.util.List r2 = (java.util.List) r2     // Catch:{ 78S -> 0x13a1 }
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            int r1 = r11.A0X(r1, r6, r0)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2.size()     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            goto L_0x03f9
        L_0x0418:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x042f
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ 78S -> 0x13a1 }
            java.util.ArrayList r0 = X.C36441kJ.A15(r2)     // Catch:{ 78S -> 0x13a1 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x042a:
            r11.A0E(r1, r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x042f:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x043f
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 78S -> 0x13a1 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r2)     // Catch:{ 78S -> 0x13a1 }
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x042a
        L_0x043f:
            if (r2 == 0) goto L_0x042a
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x042a
            boolean r0 = r2 instanceof java.lang.Number     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x042a
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x042a
            boolean r0 = r2 instanceof X.AnonymousClass6JJ     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x042a
            java.lang.String r0 = "argument of immutable_clone cannot be a host ref"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0459:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x046c
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ 78S -> 0x13a1 }
            java.util.ArrayList r0 = X.C36441kJ.A15(r2)     // Catch:{ 78S -> 0x13a1 }
        L_0x0467:
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x046c:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12a3
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 78S -> 0x13a1 }
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0467
        L_0x0478:
            r3 = 4
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 - r3
            X.6oZ r0 = A03(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r5 = r0.A02     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x04a7
            int r3 = r5.length     // Catch:{ 78S -> 0x13a1 }
        L_0x0485:
            int r4 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r4 = r4 - r2
            int[] r0 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r4]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r3 + r2
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x0495
            java.lang.System.arraycopy(r5, r1, r4, r1, r3)     // Catch:{ 78S -> 0x13a1 }
        L_0x0495:
            int r1 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r1, r4, r3, r2)     // Catch:{ 78S -> 0x13a1 }
            int r3 = r4.length     // Catch:{ 78S -> 0x13a1 }
            java.util.ArrayList r2 = X.C36441kJ.A14(r3)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x04a9
        L_0x04a7:
            r3 = 0
            goto L_0x0485
        L_0x04a9:
            r1 = 0
        L_0x04aa:
            if (r1 >= r3) goto L_0x04b4
            r0 = r4[r1]     // Catch:{ 78S -> 0x13a1 }
            r2.add(r0)     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 + 1
            goto L_0x04aa
        L_0x04b4:
            A0M(r11, r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x04b9:
            r1 = 4
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 - r1
            X.6oZ r0 = A03(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x04d8
            int r3 = r0.length     // Catch:{ 78S -> 0x13a1 }
        L_0x04c6:
            int r1 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 - r2
            int[] r0 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            int r3 = r3 + r0
            double r0 = (double) r3     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x04d8:
            r3 = 0
            goto L_0x04c6
        L_0x04da:
            short r5 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r0
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r6 = r0 & 255(0xff, float:3.57E-43)
            r0 = r17
            X.5ov r4 = r0.A01     // Catch:{ 78S -> 0x13a1 }
            if (r6 != 0) goto L_0x04f0
            r3 = 0
            goto L_0x0502
        L_0x04f0:
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ 78S -> 0x13a1 }
            int r1 = r6 + -1
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r2 = r0 + -1
            int r2 = r2 - r1
            r1 = 0
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r2, r3, r1, r6)     // Catch:{ 78S -> 0x13a1 }
            r11.A0Z(r6)     // Catch:{ 78S -> 0x13a1 }
        L_0x0502:
            r0 = r35
            X.63L r0 = r0.A00(r5)     // Catch:{ 78S -> 0x13a1 }
            X.6oZ r1 = new X.6oZ     // Catch:{ 78S -> 0x13a1 }
            r1.<init>(r0, r4, r3)     // Catch:{ 78S -> 0x13a1 }
            X.6JJ r0 = new X.6JJ     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0517:
            short r1 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1085
        L_0x0520:
            int r1 = r18.getInt()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0545
        L_0x0533:
            short r1 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
        L_0x0545:
            if (r0 != 0) goto L_0x1206
            goto L_0x1085
        L_0x0549:
            int r1 = r18.getInt()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x056e
        L_0x055c:
            short r1 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
        L_0x056e:
            if (r0 == 0) goto L_0x1206
            goto L_0x1085
        L_0x0572:
            r18.getInt()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0579
        L_0x0576:
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
        L_0x0579:
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x057e:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r1 = r0 + -1
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 - r3
            r1 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            if (r1 != 0) goto L_0x058d
            goto L_0x060d
        L_0x058d:
            boolean r0 = r1 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            r8 = 1
            if (r0 == 0) goto L_0x05a1
            boolean r4 = X.AnonymousClass000.A1X(r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05c9
            boolean r0 = X.AnonymousClass000.A1X(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r4 != r0) goto L_0x0610
            goto L_0x0606
        L_0x05a1:
            boolean r0 = A0U(r1)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05b6
            double r6 = X.C90504aG.A01(r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0U(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05c9
            double r1 = X.C90504aG.A01(r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x05dd
        L_0x05b6:
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05e2
            long r6 = X.C36431kI.A09(r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.lang.Long     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05c9
            long r1 = X.C36431kI.A09(r2)     // Catch:{ 78S -> 0x13a1 }
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            goto L_0x05df
        L_0x05c9:
            java.lang.Number r1 = A07(r1)     // Catch:{ 78S -> 0x13a1 }
            if (r1 == 0) goto L_0x0610
            java.lang.Number r0 = A07(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0610
            double r6 = r1.doubleValue()     // Catch:{ 78S -> 0x13a1 }
            double r1 = r0.doubleValue()     // Catch:{ 78S -> 0x13a1 }
        L_0x05dd:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
        L_0x05df:
            if (r0 != 0) goto L_0x0610
            goto L_0x0606
        L_0x05e2:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x05f3
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0610
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r1.equals(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0610
            goto L_0x0606
        L_0x05f3:
            boolean r0 = r1 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0604
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0604
            boolean r0 = r1 instanceof X.AnonymousClass6JJ     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0604
            boolean r8 = r1.equals(r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0606
        L_0x0604:
            if (r1 != r2) goto L_0x0610
        L_0x0606:
            r0 = 86
            boolean r0 = X.AnonymousClass000.A1S(r5, r0)
            goto L_0x0612
        L_0x060d:
            r8 = 1
            if (r2 == 0) goto L_0x0606
        L_0x0610:
            r8 = 0
            goto L_0x0606
        L_0x0612:
            r0 = r0 ^ r8
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1079
        L_0x061c:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r0 = A05(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12ab
            long r4 = r0.longValue()     // Catch:{ 78S -> 0x13a1 }
            long r2 = ~r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0634:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r0 = A05(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12b3
            long r4 = r0.longValue()     // Catch:{ 78S -> 0x13a1 }
            long r2 = -r4
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x064c:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A07(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12bb
            double r4 = r0.doubleValue()     // Catch:{ 78S -> 0x13a1 }
            long r2 = (long) r4     // Catch:{ 78S -> 0x13a1 }
            int r0 = (int) r2     // Catch:{ 78S -> 0x13a1 }
            int r0 = ~r0     // Catch:{ 78S -> 0x13a1 }
            double r2 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0667:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A07(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12c3
            double r4 = r0.doubleValue()     // Catch:{ 78S -> 0x13a1 }
            double r2 = -r4
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x067f:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A07(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12cb
            double r2 = r0.doubleValue()     // Catch:{ 78S -> 0x13a1 }
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x069e
            double r2 = java.lang.Math.floor(r2)     // Catch:{ 78S -> 0x13a1 }
        L_0x0695:
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x069e:
            double r2 = java.lang.Math.ceil(r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0695
        L_0x06a3:
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x06b8:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1206
            boolean r0 = X.AnonymousClass000.A1X(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x06cd
            java.lang.Object r0 = A0A     // Catch:{ 78S -> 0x13a1 }
        L_0x06c8:
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x06cd:
            java.lang.Object r0 = A0C     // Catch:{ 78S -> 0x13a1 }
            goto L_0x06c8
        L_0x06d0:
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x06e1:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A06(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12d3
            long r4 = r0.longValue()     // Catch:{ 78S -> 0x13a1 }
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            double r2 = (double) r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x06ff:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r3 = A06(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r3 != 0) goto L_0x0748
            java.lang.String r0 = "TO_INT32 operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0711:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r3 = A05(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r3 != 0) goto L_0x0748
            java.lang.String r0 = "TO_BIGINT operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0723:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r3 = A07(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r3 != 0) goto L_0x0748
            java.lang.String r0 = "TO_NUMBER operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0735:
            java.lang.Object r3 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r2 = "invalid vector capacity"
            r0 = 4194304(0x400000, float:5.877472E-39)
            int r0 = r11.A0X(r3, r2, r0)     // Catch:{ 78S -> 0x13a1 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()     // Catch:{ 78S -> 0x13a1 }
            r3.ensureCapacity(r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0748:
            r11.A0E(r1, r3)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x074d:
            java.lang.Object r2 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A06(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x12db
            int r2 = r0.intValue()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            char r0 = (char) r2     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0767:
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = r11.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0774:
            int r0 = r18.getInt()     // Catch:{ 78S -> 0x13a1 }
            double r0 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0782:
            short r0 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            double r0 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0790:
            double r0 = r18.getDouble()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x079d:
            long r0 = r18.getLong()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x07aa:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r4 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r3 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            int r1 = A02(r3)     // Catch:{ 78S -> 0x13a1 }
            r0 = 100
            if (r4 != r0) goto L_0x07c3
            r0 = 4
            if (r1 == r0) goto L_0x1206
            if (r1 == r2) goto L_0x1206
            goto L_0x12e3
        L_0x07c3:
            if (r1 == r4) goto L_0x1206
            goto L_0x12e3
        L_0x07c7:
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            int r0 = A02(r0)     // Catch:{ 78S -> 0x13a1 }
            double r2 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r2)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x07d9:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r3 = r0 & 255(0xff, float:3.57E-43)
            r0 = r19
            if (r3 >= r0) goto L_0x07e4
            r1 = 1
        L_0x07e4:
            java.lang.String r0 = "invalid local store index"
            if (r1 != 0) goto L_0x106a
            A0P(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x07f4:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r19
            if (r2 >= r0) goto L_0x07ff
            r1 = 1
        L_0x07ff:
            java.lang.String r0 = "invalid local load index"
            if (r1 != 0) goto L_0x080f
            A0P(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x080f:
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 + r2
            int r1 = r0 + 1
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x081d:
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0826:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r5 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r5 + 1
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r1 = r0 + -1
            int r1 = r1 - r12
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r4 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r0 = 10
            A04(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r7 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r7 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x084b
            java.util.List r7 = (java.util.List) r7     // Catch:{ 78S -> 0x13a1 }
            int r8 = r7.size()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x084f
        L_0x084b:
            if (r7 != 0) goto L_0x130e
            r7 = 0
            r8 = 0
        L_0x084f:
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = r0 - r5
            if (r0 >= r8) goto L_0x0857
            goto L_0x1307
        L_0x0857:
            int r3 = r5 + r8
            int r9 = r3 + 1
            A0L(r11, r9)     // Catch:{ 78S -> 0x13a1 }
            int r2 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r1 = r2 + -1
            int r1 = r1 - r5
            int r9 = r9 + r2
            r11.A01 = r9     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r6 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0 = 0
            java.util.Arrays.fill(r6, r2, r9, r0)     // Catch:{ 78S -> 0x13a1 }
            int r6 = r2 + 1
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0[r2] = r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r1, r0, r6, r5)     // Catch:{ 78S -> 0x13a1 }
            int r6 = r6 + r5
            if (r7 == 0) goto L_0x0889
            r5 = 0
        L_0x0879:
            if (r5 >= r8) goto L_0x0889
            int r2 = r6 + 1
            java.lang.Object r1 = r7.get(r5)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0[r6] = r1     // Catch:{ 78S -> 0x13a1 }
            int r5 = r5 + 1
            r6 = r2
            goto L_0x0879
        L_0x0889:
            r0 = 4
            int r1 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            r0 = r16
            A0N(r11, r4, r1, r3, r0)     // Catch:{ 78S -> 0x13a1 }
            A0J(r11)     // Catch:{ 78S -> 0x13a1 }
            int r2 = r12 + 1
            java.lang.Object r0 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r2, r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x08a2:
            r11.A0Z(r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x08a7:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r4 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 - r1
            X.6oZ r0 = A03(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r0 = r0.A02     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x08c3
            int r3 = r0.length     // Catch:{ 78S -> 0x13a1 }
        L_0x08ba:
            int r1 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 - r2
            int[] r0 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            int r3 = r3 + r0
            goto L_0x08c5
        L_0x08c3:
            r3 = 0
            goto L_0x08ba
        L_0x08c5:
            boolean r0 = X.AnonymousClass000.A1S(r3, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x08d2:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r6 = r0 & 255(0xff, float:3.57E-43)
            r1 = 4
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 - r1
            X.6oZ r0 = A03(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r5 = r0.A02     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x08f6
            int r4 = r5.length     // Catch:{ 78S -> 0x13a1 }
        L_0x08e5:
            int r3 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r1 = r3 - r2
            int[] r0 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r1 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            if (r6 >= r4) goto L_0x08f8
            r0 = r5[r6]     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x08f6:
            r4 = 0
            goto L_0x08e5
        L_0x08f8:
            int r0 = r4 + r1
            if (r6 >= r0) goto L_0x090c
            int r6 = r6 - r4
            int r1 = r1 - r6
            int r0 = r1 + -1
            int r0 = r0 + 5
            int r3 = r3 - r0
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r3]     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x090c:
            r0 = 0
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0912:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r4 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            X.6Ub r9 = new X.6Ub     // Catch:{ 78S -> 0x13a1 }
            r9.<init>(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            switch(r4) {
                case 0: goto L_0x0f83;
                case 1: goto L_0x0928;
                case 2: goto L_0x0f41;
                case 3: goto L_0x0efc;
                case 4: goto L_0x0eb9;
                case 5: goto L_0x0ea0;
                case 6: goto L_0x0e44;
                case 7: goto L_0x0df1;
                case 8: goto L_0x0d5a;
                case 9: goto L_0x0d23;
                case 10: goto L_0x0c9d;
                case 11: goto L_0x0bdb;
                case 12: goto L_0x0af5;
                case 13: goto L_0x0a12;
                case 14: goto L_0x09fa;
                case 15: goto L_0x09a4;
                case 16: goto L_0x0975;
                case 17: goto L_0x094b;
                case 18: goto L_0x0943;
                default: goto L_0x0926;
            }     // Catch:{ 78S -> 0x13a1 }
        L_0x0926:
            goto L_0x1315
        L_0x0928:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x092d
            r1 = 1
        L_0x092d:
            java.lang.String r0 = "RuntimeRandom expects 0 arguments"
            X.AnonymousClass5ZO.A00(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            X.6YX r0 = r9.A02     // Catch:{ 78S -> 0x13a1 }
            java.util.Random r0 = r0.A06     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0.nextDouble()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0943:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            if (r0 != r2) goto L_0x0e6c
            r1 = 1
            goto L_0x0e6c
        L_0x094b:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0959
            java.lang.String r0 = "MakeSmallMapKV requires an even number of arguments"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0959:
            int r0 = r1 / 2
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ 78S -> 0x13a1 }
            r4.<init>(r0)     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
        L_0x0961:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            if (r2 >= r0) goto L_0x0e9b
            java.lang.Object r1 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2 + 1
            java.lang.Object r0 = X.C132516Ub.A00(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            r4.put(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            int r2 = r2 + 2
            goto L_0x0961
        L_0x0975:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
            if (r0 != r10) goto L_0x097b
            r1 = 1
        L_0x097b:
            java.lang.String r0 = "MapHasValue expects 2 arguments"
            java.lang.Object r0 = A08(r9, r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x098d
            java.lang.String r0 = "MapHasValue 1st arg must be a map"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x098d:
            java.lang.Object r1 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r1.containsValue(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x09a4:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
            if (r0 != r10) goto L_0x09aa
            r1 = 1
        L_0x09aa:
            java.lang.String r0 = "MapKeysValues expects 2 arguments"
            java.lang.Object r0 = A08(r9, r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x09bc
            java.lang.String r0 = "MapKeysValues 1st arg must be a map"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x09bc:
            java.lang.Object r1 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x09d2
            java.lang.String r0 = "MapKeysValues 2nd arg must be a boolean"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x09d2:
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x09f1
            java.util.Set r0 = r1.keySet()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 78S -> 0x13a1 }
        L_0x09e4:
            java.util.ArrayList r0 = X.C36351kA.A10(r0)     // Catch:{ 78S -> 0x13a1 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x09f1:
            java.util.Collection r0 = r1.values()     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r0 = r0.toArray()     // Catch:{ 78S -> 0x13a1 }
            goto L_0x09e4
        L_0x09fa:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x09ff
            r1 = 1
        L_0x09ff:
            java.lang.String r0 = "CurrentTimeMillis expects no arguments"
            X.AnonymousClass5ZO.A00(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 78S -> 0x13a1 }
            double r0 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0a12:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            r0 = 5
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.String r0 = "ArrayCopy expects 5 arguments"
            java.lang.Object r0 = A08(r9, r0, r4, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0a2c
            java.lang.String r0 = "ArrayCopy 1st argument must be an array"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0a2c:
            java.lang.Object r8 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ 78S -> 0x13a1 }
            double r6 = A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.C132516Ub.A02(r6)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0a44
            java.lang.String r0 = "ArrayCopy 2nd argument must be an integer"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0a44:
            java.lang.Object r0 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0a54
            java.lang.String r0 = "ArrayCopy 3rd argument must be an array"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0a54:
            java.lang.Object r5 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            java.util.List r5 = (java.util.List) r5     // Catch:{ 78S -> 0x13a1 }
            double r0 = A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0a6c
            java.lang.String r0 = "ArrayCopy 4th argument must be an integer"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0a6c:
            r2 = 4
            double r3 = A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r3)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0a7f
            java.lang.String r0 = "ArrayCopy 5th argument must be an integer"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0a7f:
            int r2 = r8.size()     // Catch:{ 78S -> 0x13a1 }
            int r22 = r5.size()     // Catch:{ 78S -> 0x13a1 }
            int r12 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x0a8d
            double r12 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            double r6 = r6 + r12
        L_0x0a8d:
            int r12 = (r6 > r20 ? 1 : (r6 == r20 ? 0 : -1))
            if (r12 < 0) goto L_0x1332
            double r14 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x1332
            int r2 = (int) r6     // Catch:{ 78S -> 0x13a1 }
            int r6 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r6 >= 0) goto L_0x0a9f
            r6 = r22
            double r6 = (double) r6     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r6
        L_0x0a9f:
            int r6 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r6 < 0) goto L_0x132b
            r6 = r22
            double r12 = (double) r6     // Catch:{ 78S -> 0x13a1 }
            int r6 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x132b
            int r6 = (int) r0     // Catch:{ 78S -> 0x13a1 }
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1324
            double r0 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r3
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x1324
            double r0 = (double) r6     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r3
            int r7 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r7 > 0) goto L_0x1324
            int r0 = (int) r3     // Catch:{ 78S -> 0x13a1 }
            if (r8 != r5) goto L_0x0ad3
            if (r6 <= r2) goto L_0x0ad3
            int r2 = r2 + r0
            int r6 = r6 + r0
        L_0x0ac2:
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x0fb5
            int r6 = r6 + -1
            int r2 = r2 + -1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x0ae6 }
            r5.set(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x0ae6 }
            r0 = r1
            goto L_0x0ac2
        L_0x0ad3:
            int r4 = r0 + -1
            if (r0 == 0) goto L_0x0fb5
            int r3 = r6 + 1
            int r1 = r2 + 1
            java.lang.Object r0 = r8.get(r2)     // Catch:{ UnsupportedOperationException -> 0x0ae6 }
            r5.set(r6, r0)     // Catch:{ UnsupportedOperationException -> 0x0ae6 }
            r6 = r3
            r0 = r4
            r2 = r1
            goto L_0x0ad3
        L_0x0ae6:
            r1 = move-exception
            java.lang.String r0 = "ArrayCopy dst must be mutable"
            A0T(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11b5
        L_0x0af5:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            r0 = 5
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.String r0 = "StringSearch expects 5 arguments"
            java.lang.Object r0 = A08(r9, r0, r4, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0b0f
            java.lang.String r0 = "StringSearch 1st arg must be a string"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0b0f:
            java.lang.Object r8 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0b25
            java.lang.String r0 = "StringSearch 2nd arg must be a string"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0b25:
            java.lang.Object r7 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0b49
            double r0 = A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r5 = X.C132516Ub.A02(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r5 != 0) goto L_0x0b4b
            java.lang.String r0 = "StringSearch 3rd arg must be an integer or null"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0b49:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0b4b:
            java.lang.Object r5 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x0b63
            double r3 = A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r3)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0b63
            java.lang.String r0 = "StringSearch 4th arg must be an integer or null"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0b63:
            r5 = 4
            java.lang.Object r2 = X.C132516Ub.A00(r9, r5)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = r2 instanceof java.lang.Boolean     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0b74
            java.lang.String r0 = "StringSearch 5th arg must be a boolean"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0b74:
            java.lang.Object r2 = X.C132516Ub.A00(r9, r5)     // Catch:{ 78S -> 0x13a1 }
            boolean r14 = X.AnonymousClass000.A1X(r2)     // Catch:{ 78S -> 0x13a1 }
            int r2 = r8.length()     // Catch:{ 78S -> 0x13a1 }
            boolean r5 = java.lang.Double.isNaN(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x0b87
            goto L_0x0b92
        L_0x0b87:
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 >= 0) goto L_0x0b8d
            double r5 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r5
        L_0x0b8d:
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x1340
            goto L_0x0b94
        L_0x0b92:
            r0 = 0
        L_0x0b94:
            double r5 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x1340
            int r12 = (int) r0     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = java.lang.Double.isNaN(r3)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0bac
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1339
            double r0 = (double) r12     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r3
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x1339
            int r1 = (int) r3     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0bae
        L_0x0bac:
            int r1 = r2 - r12
        L_0x0bae:
            int r0 = r7.length()     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0fb5
            if (r0 > r1) goto L_0x0fb5
            if (r12 != 0) goto L_0x0bbd
            if (r1 != r2) goto L_0x0bbd
        L_0x0bba:
            if (r14 == 0) goto L_0x0bc8
            goto L_0x0bc3
        L_0x0bbd:
            int r1 = r1 + r12
            java.lang.String r8 = r8.substring(r12, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0bba
        L_0x0bc3:
            int r0 = r8.lastIndexOf(r7)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0bcc
        L_0x0bc8:
            int r0 = r8.indexOf(r7)     // Catch:{ 78S -> 0x13a1 }
        L_0x0bcc:
            if (r0 >= 0) goto L_0x0bd0
            r0 = 0
            goto L_0x0bd6
        L_0x0bd0:
            int r0 = r0 + r12
            double r0 = (double) r0     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0bd6:
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0bdb:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            r0 = 4
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.String r0 = "SubstringCompare expects 4 arguments"
            java.lang.Object r0 = A08(r9, r0, r4, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0bf5
            java.lang.String r0 = "SubstringCompare 1st arg must be a string"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0bf5:
            java.lang.Object r8 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0c0b
            java.lang.String r0 = "SubstringCompare 2nd arg must be a string"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0c0b:
            java.lang.Object r7 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r3 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            if (r0 != 0) goto L_0x0c2f
            double r0 = A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r5 = X.C132516Ub.A02(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r5 != 0) goto L_0x0c31
            java.lang.String r0 = "SubstringCompare 3rd arg must be an integer or null"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0c2f:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
        L_0x0c31:
            java.lang.Object r5 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            if (r5 == 0) goto L_0x0c49
            double r3 = A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r3)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0c49
            java.lang.String r0 = "SubstringCompare 4th arg must be an integer or null"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0c49:
            int r2 = r8.length()     // Catch:{ 78S -> 0x13a1 }
            boolean r5 = java.lang.Double.isNaN(r0)     // Catch:{ 78S -> 0x13a1 }
            r14 = 0
            if (r5 == 0) goto L_0x0c56
            goto L_0x0c61
        L_0x0c56:
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 >= 0) goto L_0x0c5c
            double r5 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r5
        L_0x0c5c:
            int r5 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r5 < 0) goto L_0x134e
            goto L_0x0c63
        L_0x0c61:
            r0 = 0
        L_0x0c63:
            double r5 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 > 0) goto L_0x134e
            int r12 = (int) r0     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = java.lang.Double.isNaN(r3)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0c7b
            int r0 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1347
            double r0 = (double) r12     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r3
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x1347
            int r0 = (int) r3     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0c7d
        L_0x0c7b:
            int r0 = r2 - r12
        L_0x0c7d:
            if (r12 != 0) goto L_0x0c82
            if (r0 != r2) goto L_0x0c82
            goto L_0x0c87
        L_0x0c82:
            int r0 = r0 + r12
            java.lang.String r8 = r8.substring(r12, r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0c87:
            int r0 = r8.compareTo(r7)     // Catch:{ 78S -> 0x13a1 }
            if (r0 >= 0) goto L_0x0c90
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            goto L_0x0c94
        L_0x0c90:
            if (r0 == 0) goto L_0x0c94
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0c94:
            java.lang.Number r0 = X.C129316Gk.A00(r14)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0c9d:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r6 = 0
            if (r0 != r2) goto L_0x0ca3
            r1 = 1
        L_0x0ca3:
            java.lang.String r0 = "Substring expects 3 arguments"
            java.lang.Object r0 = A08(r9, r0, r6, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0cb5
            java.lang.String r0 = "Substring 1st arg must be a string"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0cb5:
            java.lang.Object r8 = X.C132516Ub.A00(r9, r6)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 78S -> 0x13a1 }
            double r0 = A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0ccd
            java.lang.String r0 = "Substring 2nd arg must be an integer"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0ccd:
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            java.lang.Object r2 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            if (r2 == 0) goto L_0x0ce7
            double r4 = A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.C132516Ub.A02(r4)     // Catch:{ 78S -> 0x13a1 }
            if (r2 != 0) goto L_0x0ce7
            java.lang.String r0 = "Substring 3rd arg must be an integer or null"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0ce7:
            int r7 = r8.length()     // Catch:{ 78S -> 0x13a1 }
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x0cf1
            double r2 = (double) r7     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r2
        L_0x0cf1:
            int r2 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r2 < 0) goto L_0x135c
            double r2 = (double) r7     // Catch:{ 78S -> 0x13a1 }
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 > 0) goto L_0x135c
            int r12 = (int) r0     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = java.lang.Double.isNaN(r4)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0d0d
            int r0 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r0 < 0) goto L_0x1355
            double r0 = (double) r12     // Catch:{ 78S -> 0x13a1 }
            double r0 = r0 + r4
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 > 0) goto L_0x1355
            int r0 = (int) r4     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0d0f
        L_0x0d0d:
            int r0 = r7 - r12
        L_0x0d0f:
            if (r12 != 0) goto L_0x0d14
            if (r0 != r7) goto L_0x0d14
            goto L_0x0d1a
        L_0x0d14:
            int r0 = r0 + r12
            java.lang.String r0 = r8.substring(r12, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0d1e
        L_0x0d1a:
            java.lang.Object r0 = X.C132516Ub.A00(r9, r6)     // Catch:{ 78S -> 0x13a1 }
        L_0x0d1e:
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0d23:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
            boolean r1 = X.C90514aH.A1V(r0)
            java.lang.String r0 = "IsFinite expects 1 argument"
            java.lang.Object r0 = A08(r9, r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r0 = A07(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0d3e
            java.lang.String r0 = "IsFinite argument must be numeric"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0d3e:
            double r0 = r0.doubleValue()     // Catch:{ 78S -> 0x13a1 }
            double r3 = java.lang.Math.abs(r0)     // Catch:{ 78S -> 0x13a1 }
            r1 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.C90484aE.A1Q(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0d5a:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            boolean r2 = X.AnonymousClass000.A1S(r0, r10)
            java.lang.String r0 = "ParseInt64 requires 2 arguments"
            java.lang.Object r2 = A08(r9, r0, r1, r2)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r24 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0U(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0d7e
            double r2 = X.C90504aG.A01(r2)     // Catch:{ 78S -> 0x13a1 }
            long r0 = (long) r2     // Catch:{ 78S -> 0x13a1 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0de9
        L_0x0d7e:
            boolean r0 = r2 instanceof java.lang.Long     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0de9
            boolean r0 = r2 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0de5
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0W(r2)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0deb
            java.lang.String r7 = r2.trim()     // Catch:{ 78S -> 0x13a1 }
            int r6 = r7.length()     // Catch:{ NumberFormatException -> 0x0deb }
            if (r6 == 0) goto L_0x0deb
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            char r1 = r7.charAt(r1)     // Catch:{ NumberFormatException -> 0x0deb }
            r0 = 45
            r8 = 1
            if (r1 != r0) goto L_0x0dab
            r22 = -9223372036854775808
            r5 = 1
            goto L_0x0db1
        L_0x0dab:
            r0 = 43
            if (r1 != r0) goto L_0x0db0
            r5 = 1
        L_0x0db0:
            r8 = 0
        L_0x0db1:
            if (r5 == r6) goto L_0x0deb
            r20 = 10
            long r14 = r22 / r20
            r2 = 0
        L_0x0db9:
            if (r5 >= r6) goto L_0x0ddd
            char r0 = r7.charAt(r5)     // Catch:{ NumberFormatException -> 0x0deb }
            int r1 = r0 + -48
            if (r1 < 0) goto L_0x0deb
            r0 = 9
            if (r1 > r0) goto L_0x0deb
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x0dd8
            long r2 = r2 * r20
            long r0 = (long) r1     // Catch:{ NumberFormatException -> 0x0deb }
            long r12 = r22 + r0
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 < 0) goto L_0x0dd8
            long r2 = r2 - r0
        L_0x0dd5:
            int r5 = r5 + 1
            goto L_0x0db9
        L_0x0dd8:
            if (r24 == 0) goto L_0x0deb
            r2 = r22
            goto L_0x0dd5
        L_0x0ddd:
            if (r8 != 0) goto L_0x0de0
            long r2 = -r2
        L_0x0de0:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x0deb }
            goto L_0x0de9
        L_0x0de5:
            java.lang.Long r2 = A05(r2)     // Catch:{ 78S -> 0x13a1 }
        L_0x0de9:
            if (r2 != 0) goto L_0x0dec
        L_0x0deb:
            r2 = 0
        L_0x0dec:
            X.C132516Ub.A01(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0df1:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            if (r0 != r10) goto L_0x0df7
            r1 = 1
        L_0x0df7:
            java.lang.String r0 = "MakeMap expects 2 arguments"
            java.lang.Object r5 = A08(r9, r0, r4, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r6 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r5 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0e0d
            java.lang.String r0 = "MakeMap arg 0 must be a list"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0e0d:
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0e19
            java.lang.String r0 = "MakeMap arg 1 must be a list"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0e19:
            java.util.List r5 = (java.util.List) r5     // Catch:{ 78S -> 0x13a1 }
            java.util.List r6 = (java.util.List) r6     // Catch:{ 78S -> 0x13a1 }
            int r3 = r5.size()     // Catch:{ 78S -> 0x13a1 }
            int r0 = r6.size()     // Catch:{ 78S -> 0x13a1 }
            if (r3 == r0) goto L_0x0e2f
            java.lang.String r0 = "MakeMap different number keys/values"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0e2f:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ 78S -> 0x13a1 }
            r2.<init>(r3)     // Catch:{ 78S -> 0x13a1 }
        L_0x0e34:
            if (r4 >= r3) goto L_0x0eb4
            java.lang.Object r1 = r5.get(r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = r6.get(r4)     // Catch:{ 78S -> 0x13a1 }
            r2.put(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            int r4 = r4 + 1
            goto L_0x0e34
        L_0x0e44:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r1 % 2
            if (r0 == 0) goto L_0x0e52
            java.lang.String r0 = "MakeSmallMap requires an even number of arguments"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0e52:
            int r3 = r1 / 2
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ 78S -> 0x13a1 }
            r4.<init>(r3)     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
        L_0x0e5a:
            if (r2 >= r3) goto L_0x0e9b
            java.lang.Object r1 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r3 + r2
            java.lang.Object r0 = X.C132516Ub.A00(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            r4.put(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            int r2 = r2 + 1
            goto L_0x0e5a
        L_0x0e6c:
            java.lang.String r0 = "StringReplaceAll requires 3 arguments"
            X.AnonymousClass5ZO.A00(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            X.6YX r1 = r9.A02     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r4 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r2 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r1 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2.isEmpty()     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0e9b
            java.lang.String r4 = r4.replace(r2, r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x0e9b:
            X.C132516Ub.A01(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0ea0:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            java.util.ArrayList r2 = X.C36441kJ.A14(r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x0ea6:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            if (r1 >= r0) goto L_0x0eb4
            java.lang.Object r0 = X.C132516Ub.A00(r9, r1)     // Catch:{ 78S -> 0x13a1 }
            r2.add(r0)     // Catch:{ 78S -> 0x13a1 }
            int r1 = r1 + 1
            goto L_0x0ea6
        L_0x0eb4:
            X.C132516Ub.A01(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0eb9:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            if (r0 != r2) goto L_0x0ebf
            r1 = 1
        L_0x0ebf:
            java.lang.String r0 = "MapPutAll requires 3 arguments"
            java.lang.Object r2 = A08(r9, r0, r10, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r1 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r1 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0ed5
            java.lang.String r0 = "MapPutAll 2nd arg must be a Map"
            java.lang.RuntimeException r1 = A0A(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0ed5:
            boolean r0 = r2 instanceof java.util.Map     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0ee1
            java.lang.String r0 = "MapPutAll 3rd arg must be a Map"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0ee1:
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ 78S -> 0x13a1 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r2 == r1) goto L_0x0ef6
            r1.putAll(r2)     // Catch:{ UnsupportedOperationException -> 0x0ef3 }
            goto L_0x0ef6
        L_0x0ef3:
            r1 = move-exception
            if (r0 != 0) goto L_0x1388
        L_0x0ef6:
            r0 = 0
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0efc:
            int r1 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r4 = 0
            r0 = 4
            boolean r1 = X.AnonymousClass000.A1S(r1, r0)
            java.lang.String r0 = "StringReplace requires 4 arguments"
            X.AnonymousClass5ZO.A00(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            X.6YX r1 = r9.A02     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r4 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r3 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r10)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r1 = r1.A0Y(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r0 = X.C132516Ub.A00(r9, r2)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0V(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0f3c
            java.lang.String r0 = r4.replaceAll(r3, r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x0f37:
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0f3c:
            java.lang.String r0 = r4.replaceFirst(r3, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0f37
        L_0x0f41:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
            boolean r1 = X.C90514aH.A1V(r0)
            java.lang.String r0 = "ParseNumber requires one argument"
            java.lang.Object r1 = A08(r9, r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0U(r1)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0f7b
            boolean r0 = r1 instanceof java.lang.Long     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0f62
            long r2 = X.C36431kI.A09(r1)     // Catch:{ 78S -> 0x13a1 }
            double r0 = (double) r2     // Catch:{ 78S -> 0x13a1 }
            java.lang.Number r1 = X.C129316Gk.A00(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x0f7b
        L_0x0f62:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x0f77
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = A0W(r1)     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0f7d
            double r0 = java.lang.Double.parseDouble(r1)     // Catch:{ NumberFormatException -> 0x0f7d }
            java.lang.Number r1 = X.C129316Gk.A00(r0)     // Catch:{ NumberFormatException -> 0x0f7d }
            goto L_0x0f7b
        L_0x0f77:
            java.lang.Number r1 = A07(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x0f7b:
            if (r1 != 0) goto L_0x0f7e
        L_0x0f7d:
            r1 = 0
        L_0x0f7e:
            X.C132516Ub.A01(r9, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0f83:
            int r0 = r9.A00     // Catch:{ 78S -> 0x13a1 }
            r2 = 0
            if (r0 != r10) goto L_0x0f89
            r1 = 1
        L_0x0f89:
            java.lang.String r0 = "VectorRemove requires 2 arguments"
            java.lang.Object r4 = A08(r9, r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object r3 = X.C132516Ub.A00(r9, r3)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r4 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0f9f
            java.lang.String r0 = "VectorRemove 1st arg must be a vector"
            java.lang.RuntimeException r1 = A0A(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0f9f:
            java.util.List r4 = (java.util.List) r4     // Catch:{ 78S -> 0x13a1 }
            X.6YX r2 = r9.A02     // Catch:{ 78S -> 0x13a1 }
            r1 = 4194303(0x3fffff, float:5.87747E-39)
            java.lang.String r0 = "VectorRemove invalid vector index"
            int r1 = r2.A0X(r3, r0, r1)     // Catch:{ 78S -> 0x13a1 }
            int r0 = r4.size()     // Catch:{ 78S -> 0x13a1 }
            if (r1 >= r0) goto L_0x0fb5
            r4.remove(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x0fb5:
            r0 = 0
            X.C132516Ub.A01(r9, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0fbb:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r4 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 + -1
            int r0 = r0 - r4
            java.lang.Object[] r3 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r2 = r3[r0]     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r2 instanceof X.AnonymousClass6JJ     // Catch:{ 78S -> 0x13a1 }
            if (r0 != 0) goto L_0x0fd6
            java.lang.String r0 = "op_call target is not a closure"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x0fd6:
            r1 = 4
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 - r1
            r1 = r3[r0]     // Catch:{ 78S -> 0x13a1 }
            r0 = r16
            A0N(r11, r2, r1, r4, r0)     // Catch:{ 78S -> 0x13a1 }
            A0J(r11)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x0fe6:
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r4 = r2 + 1
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r5 = r0 + -1
            int r5 = r5 - r4
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r5]     // Catch:{ 78S -> 0x13a1 }
            X.6oZ r7 = A04(r0, r3)     // Catch:{ 78S -> 0x13a1 }
            r8 = 0
            java.lang.Object r6 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r6 instanceof java.util.List     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x101e
            java.util.List r6 = (java.util.List) r6     // Catch:{ 78S -> 0x13a1 }
            r3 = 32768(0x8000, float:4.5918E-41)
            int r3 = r3 - r2
            int r0 = r6.size()     // Catch:{ 78S -> 0x13a1 }
            if (r3 >= r0) goto L_0x1018
            java.lang.String r0 = "too many arguments to bind"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1018:
            int r3 = r6.size()     // Catch:{ 78S -> 0x13a1 }
            int r3 = r3 + r2
            goto L_0x1022
        L_0x101e:
            if (r6 != 0) goto L_0x1363
            r6 = 0
            r3 = r2
        L_0x1022:
            if (r3 == 0) goto L_0x1079
            java.lang.Object[] r0 = r7.A02     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1030
            int r5 = r0.length     // Catch:{ 78S -> 0x13a1 }
            int r3 = r3 + r5
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r1, r3, r1, r5)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1033
        L_0x1030:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ 78S -> 0x13a1 }
            r5 = 0
        L_0x1033:
            if (r2 == 0) goto L_0x1040
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r1 = r0 + -1
            int r1 = r1 - r2
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r0, r1, r3, r5, r2)     // Catch:{ 78S -> 0x13a1 }
            int r5 = r5 + r2
        L_0x1040:
            if (r6 == 0) goto L_0x1054
            int r2 = r6.size()     // Catch:{ 78S -> 0x13a1 }
        L_0x1046:
            if (r8 >= r2) goto L_0x1054
            int r1 = r5 + 1
            java.lang.Object r0 = r6.get(r8)     // Catch:{ 78S -> 0x13a1 }
            r3[r5] = r0     // Catch:{ 78S -> 0x13a1 }
            int r8 = r8 + 1
            r5 = r1
            goto L_0x1046
        L_0x1054:
            X.63L r2 = r7.A00     // Catch:{ 78S -> 0x13a1 }
            X.5ov r0 = r7.A01     // Catch:{ 78S -> 0x13a1 }
            X.6oZ r1 = new X.6oZ     // Catch:{ 78S -> 0x13a1 }
            r1.<init>(r2, r0, r3)     // Catch:{ 78S -> 0x13a1 }
            X.6JJ r0 = new X.6JJ     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
            r11.A0E(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            r11.A0Z(r4)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x106a:
            int r0 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 + -1
            java.lang.Object[] r2 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r1 = r2[r0]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r0 + r3
            int r0 = r0 + 1
            r2[r0] = r1     // Catch:{ 78S -> 0x13a1 }
        L_0x1079:
            A0K(r11)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x107e:
            int r1 = r18.getInt()     // Catch:{ 78S -> 0x13a1 }
            r18.getShort()     // Catch:{ 78S -> 0x13a1 }
        L_0x1085:
            int r1 = r1 + r16
            r0 = r18
            r0.position(r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x108e:
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1097:
            java.lang.String r0 = "<="
            r11.A0H(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x109e:
            java.lang.String r0 = "<"
            r11.A0H(r10, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10a5:
            java.lang.String r0 = ">"
            r11.A0H(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10ac:
            java.lang.String r0 = ">="
            r11.A0H(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10b3:
            java.lang.String r1 = "INT64_SHR"
            r0 = 22
            r11.A0G(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10bc:
            r1 = 21
            java.lang.String r0 = "INT64_ASR"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10c5:
            r1 = 20
            java.lang.String r0 = "INT64_SHL"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10ce:
            r1 = 19
            java.lang.String r0 = "INT64_XOR"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10d7:
            r1 = 18
            java.lang.String r0 = "INT64_OR"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10e0:
            r1 = 17
            java.lang.String r0 = "INT64_AND"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10e9:
            r1 = 16
            java.lang.String r0 = "INT64_ADD"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10f2:
            r1 = 15
            java.lang.String r0 = "INT64_SUB"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x10fb:
            r1 = 14
            java.lang.String r0 = "INT64_MOD"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1104:
            r1 = 13
            java.lang.String r0 = "INT64_DIV"
            r11.A0G(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x110d:
            java.lang.String r1 = "INT64_MUL"
            r0 = 12
            r11.A0G(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1116:
            r1 = 11
            java.lang.String r0 = ">>>"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x111f:
            r1 = 10
            java.lang.String r0 = ">>"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1128:
            r1 = 9
            java.lang.String r0 = "<<"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1131:
            r1 = 8
            java.lang.String r0 = "^"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x113a:
            r1 = 7
            java.lang.String r0 = "|"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1142:
            r1 = 6
            java.lang.String r0 = "&"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x114a:
            java.lang.String r1 = "-"
            r0 = 4
            r11.A0F(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1152:
            java.lang.String r0 = "%"
            r11.A0F(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1159:
            java.lang.String r0 = "/"
            r11.A0F(r10, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1160:
            java.lang.String r0 = "imul"
            r11.A0F(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1167:
            java.lang.String r0 = "*"
            r11.A0F(r1, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x116e:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1175:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x117c:
            java.lang.Object r0 = r11.A07     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x1183:
            boolean r3 = X.AnonymousClass000.A1Q(r19)
            java.lang.String r0 = "enter executed more than once"
            if (r3 == 0) goto L_0x136a
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r19 = r0
            byte r0 = r18.get()     // Catch:{ 78S -> 0x13a1 }
            r6 = r0 & 255(0xff, float:3.57E-43)
            short r4 = r18.getShort()     // Catch:{ 78S -> 0x13a1 }
            r0 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r0
            r0 = r19
            boolean r3 = X.C90504aG.A1U(r6, r0)
            java.lang.String r0 = "op_enter too many params to copy"
            if (r3 != 0) goto L_0x11b6
            A0P(r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ 78S -> 0x13a1 }
            r0.<init>(r1)     // Catch:{ 78S -> 0x13a1 }
        L_0x11b5:
            throw r0     // Catch:{ 78S -> 0x13a1 }
        L_0x11b6:
            int r4 = r4 + r19
            int r0 = r4 + 5
            A0L(r11, r0)     // Catch:{ 78S -> 0x13a1 }
            int r4 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r5 = r19 + r4
            r11.A01 = r5     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r3 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r0 = 0
            java.util.Arrays.fill(r3, r4, r5, r0)     // Catch:{ 78S -> 0x13a1 }
            int r3 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r2 = r3 - r2
            int[] r0 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r5 = r0[r2]     // Catch:{ 78S -> 0x13a1 }
            r0 = 4
            int r3 = r3 - r0
            X.6oZ r0 = A03(r11, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.Object[] r3 = r0.A02     // Catch:{ 78S -> 0x13a1 }
            if (r3 == 0) goto L_0x11e8
            int r0 = r3.length     // Catch:{ 78S -> 0x13a1 }
        L_0x11dc:
            int r2 = java.lang.Math.min(r0, r6)     // Catch:{ 78S -> 0x13a1 }
            if (r2 == 0) goto L_0x11eb
            java.lang.Object[] r0 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            java.lang.System.arraycopy(r3, r1, r0, r4, r2)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x11ea
        L_0x11e8:
            r0 = 0
            goto L_0x11dc
        L_0x11ea:
            int r4 = r4 + r2
        L_0x11eb:
            int r6 = r6 - r2
            int r3 = java.lang.Math.min(r5, r6)     // Catch:{ 78S -> 0x13a1 }
            if (r3 <= 0) goto L_0x1206
            java.lang.Object[] r2 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            int r1 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r5 + -1
            int r0 = r0 + 5
            int r1 = r1 - r0
            java.lang.System.arraycopy(r2, r1, r2, r4, r3)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1206
        L_0x11ff:
            java.lang.Number r0 = X.C129316Gk.A00(r20)     // Catch:{ 78S -> 0x13a1 }
            A0M(r11, r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x1206:
            r3 = 1
            r1 = 0
            goto L_0x0041
        L_0x120a:
            int r6 = r11.A01     // Catch:{ 78S -> 0x13a1 }
            int r0 = r6 + -1
            java.lang.Object[] r5 = r11.A05     // Catch:{ 78S -> 0x13a1 }
            r4 = r5[r0]     // Catch:{ 78S -> 0x13a1 }
            int r3 = r11.A00     // Catch:{ 78S -> 0x13a1 }
            int r0 = r3 - r2
            int[] r1 = r11.A04     // Catch:{ 78S -> 0x13a1 }
            r2 = r1[r0]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r2 + 1
            int r0 = r0 + -1
            int r0 = r0 + 5
            int r0 = r3 - r0
            r5[r0] = r4     // Catch:{ 78S -> 0x13a1 }
            r1 = r1[r3]     // Catch:{ 78S -> 0x13a1 }
            int r0 = r3 + 1
            int r0 = r0 + -5
            int r0 = r0 - r2
            int r6 = r6 - r0
            r11.A0Z(r6)     // Catch:{ 78S -> 0x13a1 }
            r11.A00 = r1     // Catch:{ 78S -> 0x13a1 }
            return
        L_0x1232:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "extension '"
            r1.append(r0)     // Catch:{ 78S -> 0x13a1 }
            r1.append(r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "' threw an exception: "
            java.lang.String r2 = X.C36331k8.A0i(r0, r1, r3)     // Catch:{ 78S -> 0x13a1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r2, r1)     // Catch:{ 78S -> 0x13a1 }
            X.78S r1 = new X.78S     // Catch:{ 78S -> 0x13a1 }
            r1.<init>(r0, r3)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1256:
            r1 = move-exception
            goto L_0x1388
        L_0x1259:
            java.lang.RuntimeException r1 = A0C(r7)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x125f:
            java.lang.String r0 = "get_element_count argument must be a container or string"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1267:
            java.lang.String r2 = "get_by_val_or 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ 78S -> 0x13a1 }
            r0[r1] = r5     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.RuntimeException r1 = A0A(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1277:
            java.lang.RuntimeException r1 = A0C(r7)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x127d:
            java.lang.RuntimeException r1 = A0C(r9)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1283:
            java.lang.String r0 = "string index out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x128b:
            java.lang.String r2 = "get_by_val 1st argument must be a container for key %s"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ 78S -> 0x13a1 }
            r0[r1] = r5     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = java.lang.String.format(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            java.lang.RuntimeException r1 = A0A(r4, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x129b:
            java.lang.String r0 = "in_by_val 2nd argument must be a container"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12a3:
            java.lang.String r0 = "argument of container_clone must be a container"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12ab:
            java.lang.String r0 = "INT64_NOT operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12b3:
            java.lang.String r0 = "INT64_NEG operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12bb:
            java.lang.String r0 = "BIN_NOT operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12c3:
            java.lang.String r0 = "NEG operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12cb:
            java.lang.String r0 = "TRUNC operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12d3:
            java.lang.String r0 = "TO_UINT32 operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12db:
            java.lang.String r0 = "CHR16 operand must be numeric"
            java.lang.RuntimeException r1 = A0A(r2, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x12e3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "Type assertion failed. Expected "
            r1.append(r0)     // Catch:{ 78S -> 0x13a1 }
            r1.append(r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = ", got "
            r1.append(r0)     // Catch:{ 78S -> 0x13a1 }
            if (r3 != 0) goto L_0x12f9
            java.lang.String r0 = "null"
            goto L_0x12fd
        L_0x12f9:
            java.lang.String r0 = X.AnonymousClass000.A0k(r3)     // Catch:{ 78S -> 0x13a1 }
        L_0x12fd:
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ 78S -> 0x13a1 }
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1307:
            java.lang.String r0 = "too many arguments to apply"
            java.lang.RuntimeException r1 = A0B(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x130e:
            java.lang.String r0 = "last apply() argument must be a vector or undefined"
            java.lang.RuntimeException r1 = A0A(r7, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1315:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "invalid runtime function index "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r4)     // Catch:{ 78S -> 0x13a1 }
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1324:
            java.lang.String r0 = "ArrayCopy length out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x132b:
            java.lang.String r0 = "ArrayCopy dst index out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1332:
            java.lang.String r0 = "ArrayCopy src index out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1339:
            java.lang.String r0 = "StringSearch length out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1340:
            java.lang.String r0 = "StringSearch offset out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1347:
            java.lang.String r0 = "SubstringCompare length out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x134e:
            java.lang.String r0 = "SubstringCompare offset out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1355:
            java.lang.String r0 = "Substring length out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x135c:
            java.lang.String r0 = "Substring offset out of range"
            java.lang.RuntimeException r1 = A0C(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x1363:
            java.lang.String r0 = "last bind() operand must be a vector or undefined"
            java.lang.RuntimeException r1 = A0A(r6, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x136a:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A09(r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x136f:
            java.lang.Object r3 = A09(r11)     // Catch:{ 78S -> 0x13a1 }
            boolean r0 = r3 instanceof java.lang.String     // Catch:{ 78S -> 0x13a1 }
            if (r0 == 0) goto L_0x1389
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 78S -> 0x13a1 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "UserError: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)     // Catch:{ 78S -> 0x13a1 }
            X.78S r1 = new X.78S     // Catch:{ 78S -> 0x13a1 }
            r1.<init>(r0)     // Catch:{ 78S -> 0x13a1 }
        L_0x1388:
            throw r1     // Catch:{ 78S -> 0x13a1 }
        L_0x1389:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = "Expected stack value of string type for opcode "
            r2.append(r0)     // Catch:{ 78S -> 0x13a1 }
            r1 = 12
            java.lang.String[] r0 = X.C113075ex.A00     // Catch:{ 78S -> 0x13a1 }
            r0 = r0[r1]     // Catch:{ 78S -> 0x13a1 }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r2)     // Catch:{ 78S -> 0x13a1 }
            java.lang.RuntimeException r1 = A0A(r3, r0)     // Catch:{ 78S -> 0x13a1 }
            goto L_0x1388
        L_0x13a1:
            r4 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            r0 = 0
            X.6Vg r1 = new X.6Vg
            r1.<init>(r11, r2, r0)
            r0 = r16
            r11.A0I(r1, r0)
            java.lang.String r3 = r2.toString()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "mins stack trace:\n"
            r2.append(r0)
            r0 = 1
            X.6Vg r1 = new X.6Vg
            r1.<init>(r11, r2, r0)
            r0 = r16
            r11.A0I(r1, r0)
            java.lang.String r1 = r2.toString()
            X.78W r0 = new X.78W
            r0.<init>(r3, r1, r4)
            throw r0
        L_0x13d3:
            r0 = 0
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YX.A0J(X.6YX):void");
    }

    public static boolean A0W(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 'x' || charAt < 9) {
                return true;
            }
            if (charAt > 13 && (charAt < ' ' || charAt > '~')) {
                return true;
            }
        }
        return false;
    }

    public static int A02(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof Boolean) {
            return 1;
        }
        if (obj instanceof Long) {
            return 3;
        }
        if (A0U(obj)) {
            return 4;
        }
        if (obj instanceof String) {
            return 2;
        }
        if (obj instanceof List) {
            return 6;
        }
        if (obj instanceof Map) {
            return 7;
        }
        if (obj instanceof AnonymousClass6JJ) {
            return 8;
        }
        return 5;
    }

    public static C142246oZ A03(AnonymousClass6YX r0, int i) {
        return ((AnonymousClass6JJ) r0.A05[i]).A00.BwQ();
    }

    public static C142246oZ A04(Object obj, int i) {
        if (obj instanceof AnonymousClass6JJ) {
            return ((AnonymousClass6JJ) obj).A00.BwQ();
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Expected stack value of closure type for opcode ");
        throw A0A(obj, AnonymousClass000.A0q(C113075ex.A00[i], A0u));
    }

    public static Long A05(Object obj) {
        long A012;
        Long l;
        if ((obj instanceof Long) && (l = (Long) obj) != null) {
            return l;
        }
        if (obj instanceof Boolean) {
            A012 = C90474aD.A09(AnonymousClass000.A1X(obj) ? 1 : 0);
        } else if (!A0U(obj)) {
            return null;
        } else {
            A012 = (long) C90504aG.A01(obj);
        }
        return Long.valueOf(A012);
    }

    public static Number A06(Object obj) {
        int A012;
        double d;
        Number number;
        if ((obj instanceof Long) && (number = (Number) obj) != null) {
            A012 = number.intValue();
        } else if (obj instanceof Boolean) {
            if (AnonymousClass000.A1X(obj)) {
                d = 1.0d;
            } else {
                d = 0.0d;
            }
            return C129316Gk.A00(d);
        } else if (!A0U(obj)) {
            return null;
        } else {
            A012 = (int) ((long) C90504aG.A01(obj));
        }
        d = (double) A012;
        return C129316Gk.A00(d);
    }

    public static Object A09(AnonymousClass6YX r2) {
        return r2.A05[r2.A01 - 1];
    }

    public static Map A0D(Object obj, int i) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Expected stack value of map type for opcode ");
        throw A0A(obj, AnonymousClass000.A0q(C113075ex.A00[i], A0u));
    }

    private void A0E(int i, Object obj) {
        this.A05[(this.A01 - i) - 1] = obj;
    }

    private void A0F(int i, String str) {
        double doubleValue;
        int i2;
        int i3 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i3];
        Object obj2 = objArr[i3 - 1];
        Number A072 = A07(obj2);
        Number A073 = A07(obj);
        if (A072 == null || A073 == null) {
            A0O(obj2, obj, AnonymousClass000.A0p("Incompatible operand types of ", str, AnonymousClass000.A0u()));
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        switch (i) {
            case 0:
                doubleValue = A072.doubleValue() * A073.doubleValue();
                break;
            case 1:
                doubleValue = (double) ((int) ((A072.longValue() & 4294967295L) * (A073.longValue() & 4294967295L)));
                break;
            case 2:
                doubleValue = A072.doubleValue() / A073.doubleValue();
                break;
            case 3:
                doubleValue = A072.doubleValue() % A073.doubleValue();
                break;
            case 4:
                doubleValue = A072.doubleValue() - A073.doubleValue();
                break;
            case 5:
                doubleValue = A072.doubleValue() + A073.doubleValue();
                break;
            case 6:
                i2 = ((int) ((long) A072.doubleValue())) & ((int) ((long) A073.doubleValue()));
                break;
            case 7:
                i2 = ((int) ((long) A072.doubleValue())) | ((int) ((long) A073.doubleValue()));
                break;
            case 8:
                i2 = ((int) ((long) A072.doubleValue())) ^ ((int) ((long) A073.doubleValue()));
                break;
            case 9:
                i2 = ((int) ((long) A072.doubleValue())) << (((int) ((long) A073.doubleValue())) & 31);
                break;
            case 10:
                i2 = ((int) ((long) A072.doubleValue())) >> (((int) ((long) A073.doubleValue())) & 31);
                break;
            default:
                doubleValue = (double) (((long) (((int) ((long) A072.doubleValue())) >>> (((int) ((long) A073.doubleValue())) & 31))) & 4294967295L);
                break;
        }
        doubleValue = (double) i2;
        A0E(1, C129316Gk.A00(doubleValue));
        A0K(this);
    }

    private void A0G(int i, String str) {
        long longValue;
        int i2 = this.A01 - 1;
        Object[] objArr = this.A05;
        Object obj = objArr[i2];
        Object obj2 = objArr[i2 - 1];
        Long A052 = A05(obj2);
        Long A053 = A05(obj);
        if (A052 == null || A053 == null) {
            A0O(obj2, obj, AnonymousClass000.A0p("Incompatible operand types of ", str, AnonymousClass000.A0u()));
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        switch (i) {
            case 12:
                longValue = A052.longValue() * A053.longValue();
                break;
            case 13:
                long longValue2 = A053.longValue();
                if (longValue2 != 0) {
                    longValue = A052.longValue() / longValue2;
                    break;
                } else {
                    throw A0B("INT64_DIV division by zero");
                }
            case 14:
                long longValue3 = A053.longValue();
                if (longValue3 != 0) {
                    longValue = A052.longValue() % longValue3;
                    break;
                } else {
                    throw A0B("INT64_MOD division by zero");
                }
            case 15:
                longValue = A052.longValue() - A053.longValue();
                break;
            case 16:
                longValue = A052.longValue() + A053.longValue();
                break;
            case 17:
                longValue = A052.longValue() & A053.longValue();
                break;
            case 18:
                longValue = A052.longValue() | A053.longValue();
                break;
            case 19:
                longValue = A052.longValue() ^ A053.longValue();
                break;
            case 20:
                longValue = A052.longValue() << ((int) (A053.longValue() & 63));
                break;
            case 21:
                longValue = A052.longValue() >> ((int) (A053.longValue() & 63));
                break;
            default:
                longValue = A052.longValue() >>> ((int) (A053.longValue() & 63));
                break;
        }
        A0E(1, Long.valueOf(longValue));
        A0K(this);
    }

    private void A0I(AnonymousClass7fK r5, int i) {
        int i2 = this.A00;
        r5.B7b(A03(this, i2 - 4), i, false);
        while (true) {
            int[] iArr = this.A04;
            int i3 = iArr[i2];
            if (i3 != 0) {
                r5.B7b(A03(this, i3 - 4), iArr[i2 - 1], true);
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public static void A0K(AnonymousClass6YX r3) {
        int i = r3.A01 - 1;
        r3.A01 = i;
        r3.A05[i] = null;
    }

    public static void A0L(AnonymousClass6YX r5, int i) {
        Object[] objArr = r5.A05;
        int length = objArr.length;
        int i2 = r5.A01;
        if (length - i2 < i) {
            int i3 = i2 + i;
            int i4 = 536870912;
            if (i3 > 536870912) {
                throw AnonymousClass001.A09("MinScript stack overflow");
            }
            do {
                length <<= 1;
            } while (length < i3);
            if (length <= 536870912) {
                i4 = length;
            }
            Object[] objArr2 = new Object[i4];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            r5.A05 = objArr2;
            int[] iArr = new int[i4];
            System.arraycopy(r5.A04, 0, iArr, 0, r5.A01);
            r5.A04 = iArr;
        }
    }

    public static void A0M(AnonymousClass6YX r2, Object obj) {
        Object[] objArr = r2.A05;
        int i = r2.A01;
        objArr[i] = obj;
        r2.A01 = i + 1;
    }

    public static boolean A0U(Object obj) {
        if (!(obj instanceof Number) || (obj instanceof Long)) {
            return false;
        }
        return true;
    }

    public static boolean A0V(Object obj) {
        if (obj instanceof Boolean) {
            return AnonymousClass000.A1X(obj);
        }
        if (!AnonymousClass000.A1W(obj)) {
            if (obj instanceof String) {
                return !((String) obj).isEmpty();
            }
            if (A0U(obj)) {
                double A012 = C90504aG.A01(obj);
                if (A012 == 0.0d || Double.isNaN(A012)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Long) || C36431kI.A09(obj) != 0) {
                return true;
            }
        }
        return false;
    }

    public int A0X(Object obj, String str, int i) {
        int i2;
        int i3;
        if (obj instanceof Long) {
            long A092 = C36431kI.A09(obj);
            i2 = (int) A092;
            i3 = (((long) i2) > A092 ? 1 : (((long) i2) == A092 ? 0 : -1));
        } else {
            if (A0U(obj)) {
                double A012 = C90504aG.A01(obj);
                i2 = (int) A012;
                i3 = (((double) i2) > A012 ? 1 : (((double) i2) == A012 ? 0 : -1));
            }
            throw A0B(str);
        }
        if (i3 == 0 && i2 >= 0 && i2 <= i) {
            return i2;
        }
        throw A0B(str);
    }

    public Object A0Y(Object obj) {
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1X(obj)) {
                return "true";
            }
            return "false";
        } else if (obj instanceof Long) {
            return Long.toString(C36431kI.A09(obj));
        } else {
            if (A0U(obj)) {
                double A012 = C90504aG.A01(obj);
                int i = (int) A012;
                if (((double) i) == A012) {
                    return Integer.toString(i);
                }
                String d = Double.toString(A012);
                int indexOf = d.indexOf(69);
                if (indexOf < 0) {
                    return d;
                }
                int length = d.length();
                int i2 = length + 1;
                char[] cArr = new char[i2];
                d.getChars(0, indexOf, cArr, 0);
                cArr[indexOf] = 'e';
                int i3 = indexOf + 1;
                if (d.charAt(i3) == '-') {
                    d.getChars(i3, length, cArr, i3);
                } else {
                    cArr[i3] = '+';
                    d.getChars(i3, length, cArr, indexOf + 2);
                    length = i2;
                }
                return new String(cArr, 0, length);
            } else if (obj instanceof String) {
                return obj;
            } else {
                throw A0A(obj, "Value cannot be converted to string");
            }
        }
    }

    public void A0Z(int i) {
        int i2 = this.A01 - i;
        this.A01 = i2;
        Arrays.fill(this.A05, i2, i + i2, (Object) null);
    }

    public static double A00(C132516Ub r0, int i) {
        return A01(C132516Ub.A00(r0, i));
    }

    public static double A01(Object obj) {
        Number number;
        if (A0U(obj) && (number = (Number) obj) != null) {
            return number.doubleValue();
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1X(obj)) {
                return 1.0d;
            }
            return 0.0d;
        } else if (obj instanceof Long) {
            return (double) C36431kI.A09(obj);
        } else {
            return Double.NaN;
        }
    }

    public static Number A07(Object obj) {
        Object obj2;
        Number number;
        if (A0U(obj) && (number = (Number) obj) != null) {
            return number;
        }
        if (obj instanceof Boolean) {
            if (AnonymousClass000.A1X(obj)) {
                obj2 = A0A;
            } else {
                obj2 = A0C;
            }
            if (A0U(obj2)) {
                return (Number) obj2;
            }
            return null;
        } else if (obj instanceof Long) {
            return C129316Gk.A00((double) C36431kI.A09(obj));
        } else {
            return null;
        }
    }

    public static Object A08(C132516Ub r0, Object obj, int i, boolean z) {
        AnonymousClass5ZO.A00(z, obj);
        return C132516Ub.A00(r0, i);
    }

    public static RuntimeException A0A(Object obj, String str) {
        A0S(str, obj);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0B(String str) {
        A0R(str);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static RuntimeException A0C(String str) {
        A0Q(str);
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static void A0N(AnonymousClass6YX r3, Object obj, Object obj2, int i, int i2) {
        A0M(r3, obj);
        int[] iArr = r3.A04;
        int i3 = r3.A01;
        iArr[i3] = i;
        r3.A01 = i3 + 1;
        A0M(r3, obj2);
        int i4 = r3.A01;
        iArr[i4] = i2;
        int i5 = i4 + 1;
        r3.A01 = i5;
        iArr[i5] = r3.A00;
        int i6 = i5 + 1;
        r3.A01 = i6;
        r3.A00 = i6 - 1;
    }

    public static void A0O(Object obj, Object obj2, String str) {
        String A0k;
        String A0k2;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TypeError: ");
        A0u.append(str);
        A0u.append(". Got ");
        if (obj == null) {
            A0k = "null";
        } else {
            A0k = AnonymousClass000.A0k(obj);
        }
        A0u.append(A0k);
        A0u.append(" and ");
        if (obj2 == null) {
            A0k2 = "null";
        } else {
            A0k2 = AnonymousClass000.A0k(obj2);
        }
        throw new AnonymousClass78S(AnonymousClass000.A0q(A0k2, A0u));
    }

    public static void A0P(String str) {
        throw new AnonymousClass78W(AnonymousClass000.A0p("InvalidBytecode: ", str, AnonymousClass000.A0u()));
    }

    public static void A0Q(String str) {
        throw new AnonymousClass78S(AnonymousClass000.A0p("RangeError: ", str, AnonymousClass000.A0u()));
    }

    public static void A0R(String str) {
        throw new AnonymousClass78S(AnonymousClass000.A0p("TypeError: ", str, AnonymousClass000.A0u()));
    }

    public static void A0S(String str, Object obj) {
        String A0k;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TypeError: ");
        A0u.append(str);
        A0u.append(". Got ");
        if (obj == null) {
            A0k = "null";
        } else {
            A0k = AnonymousClass000.A0k(obj);
        }
        throw new AnonymousClass78S(AnonymousClass000.A0q(A0k, A0u));
    }

    public static void A0T(String str, Throwable th) {
        throw new AnonymousClass78S(AnonymousClass000.A0p("TypeError: ", str, AnonymousClass000.A0u()), th);
    }
}
