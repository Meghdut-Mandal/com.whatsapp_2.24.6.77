package X;

/* renamed from: X.82B  reason: invalid class name */
public class AnonymousClass82B extends C200249gy {
    public static int A00(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        int i2 = 65;
        if (i < 65) {
            return -1;
        }
        if (i > 70) {
            i2 = 97;
            if (i < 97 || i > 102) {
                return -1;
            }
        }
        return (i - i2) + 10;
    }

    public AnonymousClass82B(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.9yo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: X.9bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v60, resolved type: X.9yl} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v101, resolved type: X.9yo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: X.9bp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: X.9yo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v107, resolved type: X.9yo} */
    /* JADX WARNING: type inference failed for: r3v21, types: [X.9yn] */
    /* JADX WARNING: type inference failed for: r3v24, types: [X.9yn] */
    /* JADX WARNING: type inference failed for: r3v25, types: [X.9yj] */
    /* JADX WARNING: type inference failed for: r3v26, types: [X.9yi] */
    /* JADX WARNING: type inference failed for: r3v52, types: [X.9yk] */
    /* JADX WARNING: type inference failed for: r3v71, types: [X.9ym] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0230, code lost:
        if (r4 == X.C188038yw.A05) goto L_0x0232;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x023c, code lost:
        if (r4 == X.C188038yw.A04) goto L_0x023e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02ae, code lost:
        if (r0.A0F('-') == false) goto L_0x02b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x035f, code lost:
        r2.A00 += 1000;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0365, code lost:
        r4 = r1.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0367, code lost:
        if (r4 != null) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0369, code lost:
        r4 = X.AnonymousClass001.A0I();
        r1.A03 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x036f, code lost:
        r4.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x03d0, code lost:
        throw new X.AnonymousClass91R("Invalid attribute simpleSelectors");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03d7, code lost:
        r0.A01 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03e4, code lost:
        throw new X.AnonymousClass91R(X.C36321k7.A0D("Invalid or missing parameter section for pseudo class: ", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03f1, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03f3, code lost:
        if (r0 == null) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x03f9, code lost:
        if (r0.isEmpty() != false) goto L_0x0400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03fb, code lost:
        r18.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0400, code lost:
        return r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        if (r0.A0F(')') != false) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0188, code lost:
        r3 = new X.C208749ym(r8);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x03ed A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A01(X.AnonymousClass82B r25) {
        /*
            r0 = r25
            int r2 = r0.A01
            int r1 = r0.A00
            boolean r2 = X.AnonymousClass000.A1S(r2, r1)
            r1 = 0
            if (r2 == 0) goto L_0x000e
            return r1
        L_0x000e:
            java.util.ArrayList r18 = X.C165607th.A10()
        L_0x0012:
            X.9QC r2 = new X.9QC
            r2.<init>()
        L_0x0017:
            int r3 = r0.A01
            int r1 = r0.A00
            boolean r1 = X.AnonymousClass000.A1S(r3, r1)
            if (r1 != 0) goto L_0x03f1
            int r1 = r0.A01
            r25 = r1
            java.util.List r1 = r2.A01
            if (r1 == 0) goto L_0x0030
            boolean r3 = r1.isEmpty()
            r1 = 0
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            r6 = 0
            if (r1 != 0) goto L_0x03b2
            r1 = 62
            boolean r1 = r0.A0F(r1)
            if (r1 == 0) goto L_0x03a6
            java.lang.Integer r5 = X.C023109s.A01
        L_0x003e:
            r0.A0D()
        L_0x0041:
            r1 = 42
            boolean r1 = r0.A0F(r1)
            if (r1 == 0) goto L_0x0390
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r6)
        L_0x004e:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1S(r4, r3)
            if (r3 != 0) goto L_0x0374
            r3 = 46
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x007b
            if (r1 != 0) goto L_0x0067
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r6)
        L_0x0067:
            java.lang.String r7 = r0.A0I()
            if (r7 == 0) goto L_0x03b5
            java.lang.Integer r4 = X.C023109s.A01
            java.lang.String r3 = "class"
            r1.A00(r4, r3, r7)
            int r3 = r2.A00
            int r3 = r3 + 1000
            r2.A00 = r3
            goto L_0x004e
        L_0x007b:
            r3 = 35
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x00a0
            if (r1 != 0) goto L_0x008a
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r6)
        L_0x008a:
            java.lang.String r7 = r0.A0I()
            if (r7 == 0) goto L_0x03bd
            java.lang.Integer r4 = X.C023109s.A01
            java.lang.String r3 = "id"
            r1.A00(r4, r3, r7)
            int r4 = r2.A00
            r3 = 1000000(0xf4240, float:1.401298E-39)
            int r4 = r4 + r3
            r2.A00 = r4
            goto L_0x004e
        L_0x00a0:
            r3 = 91
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x0113
            if (r1 != 0) goto L_0x00af
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r6)
        L_0x00af:
            r0.A0D()
            java.lang.String r8 = r0.A0I()
            java.lang.String r7 = "Invalid attribute simpleSelectors"
            if (r8 == 0) goto L_0x03d1
            r0.A0D()
            r3 = 61
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x00fa
            java.lang.Integer r9 = X.C023109s.A01
        L_0x00c7:
            r0.A0D()
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1S(r4, r3)
            if (r3 != 0) goto L_0x03cb
            java.lang.String r4 = r0.A0B()
            if (r4 != 0) goto L_0x00e0
            java.lang.String r4 = r0.A0I()
            if (r4 == 0) goto L_0x03cb
        L_0x00e0:
            r0.A0D()
        L_0x00e3:
            r3 = 93
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x03c5
            if (r9 != 0) goto L_0x00ef
            java.lang.Integer r9 = X.C023109s.A00
        L_0x00ef:
            r1.A00(r9, r8, r4)
            int r3 = r2.A00
            int r3 = r3 + 1000
            r2.A00 = r3
            goto L_0x004e
        L_0x00fa:
            java.lang.String r3 = "~="
            boolean r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x0105
            java.lang.Integer r9 = X.C023109s.A0C
            goto L_0x00c7
        L_0x0105:
            java.lang.String r3 = "|="
            boolean r3 = r0.A0G(r3)
            if (r3 == 0) goto L_0x0110
            java.lang.Integer r9 = X.C023109s.A0G
            goto L_0x00c7
        L_0x0110:
            r9 = r6
            r4 = r6
            goto L_0x00e3
        L_0x0113:
            r3 = 58
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x0374
            if (r1 != 0) goto L_0x0122
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r6)
        L_0x0122:
            java.lang.String r8 = r0.A0I()
            if (r8 == 0) goto L_0x03e5
            java.util.Map r3 = X.C188038yw.A00
            java.lang.Object r4 = r3.get(r8)
            X.8yw r4 = (X.C188038yw) r4
            if (r4 != 0) goto L_0x0134
            X.8yw r4 = X.C188038yw.UNSUPPORTED
        L_0x0134:
            X.93Y r3 = X.AnonymousClass93Y.$redex_init_class
            int r3 = r4.ordinal()
            java.lang.String r9 = "Invalid or missing parameter section for pseudo class: "
            r10 = 1
            r11 = 0
            switch(r3) {
                case 0: goto L_0x0221;
                case 1: goto L_0x031d;
                case 2: goto L_0x0228;
                case 3: goto L_0x0228;
                case 4: goto L_0x0228;
                case 5: goto L_0x0228;
                case 6: goto L_0x0355;
                case 7: goto L_0x034a;
                case 8: goto L_0x0337;
                case 9: goto L_0x032b;
                case 10: goto L_0x0343;
                case 11: goto L_0x0323;
                case 12: goto L_0x0317;
                case 13: goto L_0x0192;
                case 14: goto L_0x0151;
                case 15: goto L_0x0188;
                case 16: goto L_0x0188;
                case 17: goto L_0x0188;
                case 18: goto L_0x0188;
                case 19: goto L_0x0188;
                case 20: goto L_0x0188;
                case 21: goto L_0x0188;
                case 22: goto L_0x0188;
                case 23: goto L_0x0188;
                default: goto L_0x0141;
            }
        L_0x0141:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Unsupported pseudo class: "
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r8, r1)
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x0151:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1S(r4, r3)
            if (r3 != 0) goto L_0x0188
            int r4 = r0.A01
            r3 = 40
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x0188
            r0.A0D()
        L_0x0168:
            java.lang.String r3 = r0.A0I()
            if (r3 == 0) goto L_0x018f
            if (r11 != 0) goto L_0x0174
            java.util.ArrayList r11 = X.AnonymousClass001.A0I()
        L_0x0174:
            r11.add(r3)
            r0.A0D()
            boolean r3 = r0.A0E()
            if (r3 != 0) goto L_0x0168
            r3 = 41
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x018f
        L_0x0188:
            X.9ym r3 = new X.9ym
            r3.<init>(r8)
            goto L_0x035f
        L_0x018f:
            r0.A01 = r4
            goto L_0x0188
        L_0x0192:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1S(r4, r3)
            if (r3 != 0) goto L_0x01f1
            int r4 = r0.A01
            r3 = 40
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x01f1
            r0.A0D()
            java.util.ArrayList r7 = A01(r0)
            if (r7 == 0) goto L_0x01fb
            r3 = 41
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x01fb
            java.util.Iterator r11 = r7.iterator()
        L_0x01bb:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L_0x01fe
            java.lang.Object r3 = r11.next()
            X.9QC r3 = (X.AnonymousClass9QC) r3
            java.util.List r3 = r3.A01
            if (r3 == 0) goto L_0x01fe
            java.util.Iterator r10 = r3.iterator()
        L_0x01cf:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L_0x01bb
            java.lang.Object r3 = r10.next()
            X.9UK r3 = (X.AnonymousClass9UK) r3
            java.util.List r3 = r3.A03
            if (r3 == 0) goto L_0x01bb
            java.util.Iterator r4 = r3.iterator()
        L_0x01e3:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01cf
            java.lang.Object r3 = r4.next()
            boolean r3 = r3 instanceof X.C208739yl
            if (r3 == 0) goto L_0x01e3
        L_0x01f1:
            java.lang.String r1 = X.C36321k7.A0D(r9, r8)
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x01fb:
            r0.A01 = r4
            goto L_0x01f1
        L_0x01fe:
            X.9yl r3 = new X.9yl
            r3.<init>(r7)
            java.util.List r4 = r3.A00
            java.util.Iterator r8 = r4.iterator()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x020b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x021d
            java.lang.Object r4 = r8.next()
            X.9QC r4 = (X.AnonymousClass9QC) r4
            int r4 = r4.A00
            if (r4 <= r7) goto L_0x020b
            r7 = r4
            goto L_0x020b
        L_0x021d:
            r2.A00 = r7
            goto L_0x0365
        L_0x0221:
            X.9yk r3 = new X.9yk
            r3.<init>()
            goto L_0x035f
        L_0x0228:
            X.8yw r3 = X.C188038yw.nth_child
            if (r4 == r3) goto L_0x0232
            X.8yw r3 = X.C188038yw.nth_of_type
            r23 = 0
            if (r4 != r3) goto L_0x0234
        L_0x0232:
            r23 = 1
        L_0x0234:
            X.8yw r3 = X.C188038yw.nth_of_type
            if (r4 == r3) goto L_0x023e
            X.8yw r3 = X.C188038yw.nth_last_of_type
            r24 = 0
            if (r4 != r3) goto L_0x0240
        L_0x023e:
            r24 = 1
        L_0x0240:
            int r4 = r0.A01
            int r3 = r0.A00
            boolean r3 = X.AnonymousClass000.A1S(r4, r3)
            if (r3 != 0) goto L_0x03db
            int r3 = r0.A01
            r19 = r3
            r3 = 40
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x03db
            r0.A0D()
            java.lang.String r3 = "odd"
            boolean r3 = r0.A0G(r3)
            r7 = 2
            r17 = 1
            if (r3 == 0) goto L_0x028f
            X.9GA r4 = new X.9GA
            r4.<init>(r7, r10)
        L_0x0269:
            r0.A0D()
            r3 = 41
            boolean r3 = r0.A0F(r3)
            if (r3 == 0) goto L_0x03d7
            int r8 = r4.A00
            int r7 = r4.A01
            java.lang.String r4 = r1.A02
            X.9yo r3 = new X.9yo
            r20 = r4
            r21 = r8
            r22 = r7
            r19 = r3
            r19.<init>(r20, r21, r22, r23, r24)
            int r4 = r2.A00
            int r4 = r4 + 1000
            r2.A00 = r4
            goto L_0x0365
        L_0x028f:
            java.lang.String r3 = "even"
            boolean r3 = r0.A0G(r3)
            r10 = 0
            if (r3 == 0) goto L_0x029e
            X.9GA r4 = new X.9GA
            r4.<init>(r7, r10)
            goto L_0x0269
        L_0x029e:
            r3 = 43
            boolean r3 = r0.A0F(r3)
            r12 = 45
            if (r3 != 0) goto L_0x02b0
            boolean r3 = r0.A0F(r12)
            r16 = -1
            if (r3 != 0) goto L_0x02b2
        L_0x02b0:
            r16 = 1
        L_0x02b2:
            java.lang.String r7 = r0.A03
            int r3 = r0.A01
            int r4 = r0.A00
            X.9bp r3 = X.C197509bp.A00(r7, r3, r4)
            if (r3 == 0) goto L_0x02c2
            int r13 = r3.A00
            r0.A01 = r13
        L_0x02c2:
            r13 = 110(0x6e, float:1.54E-43)
            boolean r13 = r0.A0F(r13)
            if (r13 != 0) goto L_0x02e1
            r13 = 78
            boolean r13 = r0.A0F(r13)
            if (r13 != 0) goto L_0x02e1
            r11 = r3
            r7 = 0
        L_0x02d4:
            if (r11 == 0) goto L_0x02db
            long r3 = r11.A01
            int r10 = (int) r3
            int r10 = r16 * r10
        L_0x02db:
            X.9GA r4 = new X.9GA
            r4.<init>(r7, r10)
            goto L_0x0269
        L_0x02e1:
            if (r3 != 0) goto L_0x02ec
            int r15 = r0.A01
            r13 = 1
            X.9bp r3 = new X.9bp
            r3.<init>(r13, r15)
        L_0x02ec:
            r0.A0D()
            r13 = 43
            boolean r13 = r0.A0F(r13)
            if (r13 != 0) goto L_0x02ff
            boolean r12 = r0.A0F(r12)
            if (r12 == 0) goto L_0x030e
            r17 = -1
        L_0x02ff:
            r0.A0D()
            int r11 = r0.A01
            X.9bp r11 = X.C197509bp.A00(r7, r11, r4)
            if (r11 == 0) goto L_0x03d7
            int r4 = r11.A00
            r0.A01 = r4
        L_0x030e:
            r7 = r16
            r16 = r17
            long r3 = r3.A01
            int r12 = (int) r3
            int r7 = r7 * r12
            goto L_0x02d4
        L_0x0317:
            X.9yi r3 = new X.9yi
            r3.<init>()
            goto L_0x035f
        L_0x031d:
            X.9yj r3 = new X.9yj
            r3.<init>()
            goto L_0x035f
        L_0x0323:
            java.lang.String r4 = r1.A02
            X.9yn r3 = new X.9yn
            r3.<init>(r10, r4)
            goto L_0x035f
        L_0x032b:
            java.lang.String r8 = r1.A02
            X.9yo r3 = new X.9yo
            r9 = 0
            r11 = 0
            r12 = 1
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x035f
        L_0x0337:
            java.lang.String r8 = r1.A02
            X.9yo r3 = new X.9yo
            r9 = 0
            r11 = 1
            r12 = 1
            r7 = r3
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x035f
        L_0x0343:
            X.9yn r3 = new X.9yn
            r4 = 0
            r3.<init>(r4, r6)
            goto L_0x035f
        L_0x034a:
            X.9yo r3 = new X.9yo
            r9 = 0
            r11 = 0
            r12 = 0
            r7 = r3
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x035f
        L_0x0355:
            X.9yo r3 = new X.9yo
            r9 = 0
            r11 = 1
            r12 = 0
            r7 = r3
            r8 = r6
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x035f:
            int r4 = r2.A00
            int r4 = r4 + 1000
            r2.A00 = r4
        L_0x0365:
            java.util.List r4 = r1.A03
            if (r4 != 0) goto L_0x036f
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            r1.A03 = r4
        L_0x036f:
            r4.add(r3)
            goto L_0x004e
        L_0x0374:
            if (r1 == 0) goto L_0x03ed
            java.util.List r3 = r2.A01
            if (r3 != 0) goto L_0x0380
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            r2.A01 = r3
        L_0x0380:
            r3.add(r1)
            boolean r1 = r0.A0E()
            if (r1 == 0) goto L_0x0017
            r1 = r18
            r1.add(r2)
            goto L_0x0012
        L_0x0390:
            java.lang.String r3 = r0.A0I()
            if (r3 == 0) goto L_0x03a3
            X.9UK r1 = new X.9UK
            r1.<init>(r5, r3)
            int r3 = r2.A00
            int r3 = r3 + 1
            r2.A00 = r3
            goto L_0x004e
        L_0x03a3:
            r1 = r6
            goto L_0x004e
        L_0x03a6:
            r1 = 43
            boolean r1 = r0.A0F(r1)
            if (r1 == 0) goto L_0x03b2
            java.lang.Integer r5 = X.C023109s.A0C
            goto L_0x003e
        L_0x03b2:
            r5 = r6
            goto L_0x0041
        L_0x03b5:
            java.lang.String r1 = "Invalid \".class\" simpleSelectors"
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x03bd:
            java.lang.String r1 = "Invalid \"#id\" simpleSelectors"
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x03c5:
            X.91R r0 = new X.91R
            r0.<init>(r7)
            throw r0
        L_0x03cb:
            X.91R r0 = new X.91R
            r0.<init>(r7)
            throw r0
        L_0x03d1:
            X.91R r0 = new X.91R
            r0.<init>(r7)
            throw r0
        L_0x03d7:
            r1 = r19
            r0.A01 = r1
        L_0x03db:
            java.lang.String r1 = X.C36321k7.A0D(r9, r8)
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x03e5:
            java.lang.String r1 = "Invalid pseudo class"
            X.91R r0 = new X.91R
            r0.<init>(r1)
            throw r0
        L_0x03ed:
            r1 = r25
            r0.A01 = r1
        L_0x03f1:
            java.util.List r0 = r2.A01
            if (r0 == 0) goto L_0x0400
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0400
            r0 = r18
            r0.add(r2)
        L_0x0400:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass82B.A01(X.82B):java.util.ArrayList");
    }

    public String A0H() {
        char charAt;
        if (AnonymousClass000.A1S(this.A01, this.A00) || ((charAt = this.A03.charAt(this.A01)) != '\'' && charAt != '\"')) {
            return null;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        this.A01++;
        loop0:
        while (true) {
            int intValue = A09().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = A09().intValue();
                    if (intValue == -1) {
                        break loop0;
                    } else if (!(intValue == 10 || intValue == 13 || intValue == 12)) {
                        int A00 = A00(intValue);
                        if (A00 != -1) {
                            int i = 1;
                            do {
                                intValue = A09().intValue();
                                int A002 = A00(intValue);
                                if (A002 == -1) {
                                    break;
                                }
                                A00 = (A00 * 16) + A002;
                                i++;
                            } while (i <= 5);
                            A0u.append((char) A00);
                        }
                    }
                }
                A0u.append((char) intValue);
            }
        }
        return A0u.toString();
    }

    public String A0I() {
        boolean A1S = AnonymousClass000.A1S(this.A01, this.A00);
        int i = this.A01;
        int i2 = i;
        if (!A1S) {
            int charAt = this.A03.charAt(i);
            if (charAt == 45) {
                charAt = A06();
            }
            if (charAt >= 65 && (charAt <= 90 || (charAt < 97 ? charAt == 95 : charAt <= 122))) {
                while (true) {
                    int A06 = A06();
                    if (A06 >= 65) {
                        if (A06 > 90) {
                            if (A06 < 97) {
                                if (A06 != 95) {
                                    break;
                                }
                            } else if (A06 > 122) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (A06 >= 48) {
                        if (A06 > 57) {
                            break;
                        }
                    } else if (A06 != 45) {
                        break;
                    }
                }
                i2 = this.A01;
            }
            this.A01 = i;
        }
        if (i2 == i) {
            return null;
        }
        String substring = this.A03.substring(i, i2);
        this.A01 = i2;
        return substring;
    }
}
