package X;

import com.facebook.android.exoplayer2.util.Util;
import java.util.ArrayDeque;

/* renamed from: X.9zY  reason: invalid class name and case insensitive filesystem */
public final class C209159zY implements B29, B2h {
    public static final B4V A0K = C209109zT.A00;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public C209379zu A09;
    public C202309lW A0A;
    public boolean A0B;
    public boolean A0C;
    public AnonymousClass9LB[] A0D;
    public long[][] A0E;
    public final C202309lW A0F;
    public final C202309lW A0G;
    public final C202309lW A0H;
    public final C202309lW A0I;
    public final ArrayDeque A0J;

    public boolean BN9() {
        return true;
    }

    public boolean BuG(C201519jm r2) {
        return C196449Zr.A00(r2, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v207, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: X.9uR} */
    /* JADX WARNING: type inference failed for: r39v1, types: [X.B2A] */
    /* JADX WARNING: type inference failed for: r0v339, types: [X.9zc] */
    /* JADX WARNING: type inference failed for: r0v340, types: [X.9zb] */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0898, code lost:
        if (r13 == 1) goto L_0x089a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0936  */
    /* JADX WARNING: Removed duplicated region for block: B:529:0x0099 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x0408 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(long r53) {
        /*
            r52 = this;
        L_0x0000:
            r51 = r52
            r0 = r51
            java.util.ArrayDeque r0 = r0.A0J
            r50 = r0
            boolean r0 = r50.isEmpty()
            if (r0 != 0) goto L_0x0bd9
            java.lang.Object r0 = r50.peek()
            X.82h r0 = (X.C1688582h) r0
            long r1 = r0.A00
            int r0 = (r1 > r53 ? 1 : (r1 == r53 ? 0 : -1))
            if (r0 != 0) goto L_0x0bd9
            java.lang.Object r21 = r50.pop()
            r0 = r21
            X.82h r0 = (X.C1688582h) r0
            r21 = r0
            int r1 = r0.A00
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r0) goto L_0x0bb6
            java.util.ArrayList r24 = X.AnonymousClass001.A0I()
            r20 = 0
            r23 = -1
            r22 = -1
            r1 = 1969517665(0x75647461, float:2.8960062E32)
            r0 = r21
            X.82g r1 = r0.A01(r1)
            r16 = 0
            if (r1 == 0) goto L_0x039e
            byte[] r0 = X.C201799kP.A00
            X.9lW r13 = r1.A00
            r12 = 8
            r13.A0I(r12)
            r6 = 0
            r11 = r6
        L_0x004d:
            int r0 = r13.A00
            int r10 = r13.A01
            int r0 = r0 - r10
            if (r0 < r12) goto L_0x03a1
            int r17 = r13.A03()
            int r1 = r13.A03()
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r1 != r0) goto L_0x0332
            r13.A0I(r10)
            int r2 = r10 + r17
            r13.A0J(r12)
            int r3 = r13.A01
            r0 = 4
            r13.A0J(r0)
            int r1 = r13.A03()
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r1 == r0) goto L_0x007a
            int r3 = r3 + 4
        L_0x007a:
            r13.A0I(r3)
        L_0x007d:
            int r9 = r13.A01
            if (r9 >= r2) goto L_0x039c
            int r3 = r13.A03()
            int r1 = r13.A03()
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r1 != r0) goto L_0x032c
            r13.A0I(r9)
            int r9 = r9 + r3
            r13.A0J(r12)
            java.util.ArrayList r8 = X.AnonymousClass001.A0I()
        L_0x0099:
            int r7 = r13.A01
            if (r7 >= r9) goto L_0x0381
            int r0 = r13.A03()
            int r7 = r7 + r0
            int r3 = r13.A03()
            int r0 = r3 >> 24
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 169(0xa9, float:2.37E-43)
            if (r1 == r0) goto L_0x0250
            r0 = 253(0xfd, float:3.55E-43)
            if (r1 == r0) goto L_0x0250
            r0 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r3 != r0) goto L_0x00ef
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0bcb }
            int r1 = r13.A03()     // Catch:{ all -> 0x0bcb }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x00df
            int r1 = X.C202309lW.A01(r13, r12)     // Catch:{ all -> 0x0bcb }
            if (r1 <= 0) goto L_0x00e6
            java.lang.String[] r2 = X.C201809kQ.A00     // Catch:{ all -> 0x0bcb }
            r0 = 148(0x94, float:2.07E-43)
            if (r1 > r0) goto L_0x00e6
            int r0 = r1 + -1
            r1 = r2[r0]     // Catch:{ all -> 0x0bcb }
            if (r1 == 0) goto L_0x00e6
            java.lang.String r0 = "TCON"
            X.82n r6 = new X.82n     // Catch:{ all -> 0x0bcb }
            r6.<init>(r0, r1)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x00df:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse uint8 attribute value"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0bcb }
        L_0x00e6:
            java.lang.String r1 = "MetadataUtil"
            java.lang.String r0 = "Failed to parse standard genre code"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0320
        L_0x00ef:
            r0 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r3 != r0) goto L_0x00fc
            java.lang.String r0 = "TPOS"
            X.82n r6 = X.C201809kQ.A01(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x00fc:
            r0 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r3 != r0) goto L_0x0109
            java.lang.String r0 = "TRCK"
            X.82n r6 = X.C201809kQ.A01(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0109:
            r0 = 1953329263(0x746d706f, float:7.5247484E31)
            r2 = 0
            r1 = 1
            if (r3 != r0) goto L_0x0118
            java.lang.String r0 = "TBPM"
            X.9zl r6 = X.C201809kQ.A00(r13, r0, r3, r1, r2)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0118:
            r0 = 1668311404(0x6370696c, float:4.434815E21)
            if (r3 != r0) goto L_0x0125
            java.lang.String r0 = "TCMP"
            X.9zl r6 = X.C201809kQ.A00(r13, r0, r3, r1, r1)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0125:
            r0 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r3 != r0) goto L_0x0174
            int r4 = r13.A03()     // Catch:{ all -> 0x0bcb }
            int r1 = r13.A03()     // Catch:{ all -> 0x0bcb }
            java.lang.String r3 = "MetadataUtil"
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0160
            int r1 = r13.A03()     // Catch:{ all -> 0x0bcb }
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r0
            r0 = 13
            if (r1 != r0) goto L_0x0159
            java.lang.String r1 = "image/jpeg"
        L_0x0147:
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0bcb }
            int r3 = r4 + -16
            byte[] r0 = new byte[r3]     // Catch:{ all -> 0x0bcb }
            r13.A0K(r0, r2, r3)     // Catch:{ all -> 0x0bcb }
            X.82q r6 = new X.82q     // Catch:{ all -> 0x0bcb }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0159:
            r0 = 14
            if (r1 != r0) goto L_0x0163
            java.lang.String r1 = "image/png"
            goto L_0x0147
        L_0x0160:
            java.lang.String r0 = "Failed to parse cover art attribute"
            goto L_0x016d
        L_0x0163:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = "Unrecognized cover art flags: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r2, r1)     // Catch:{ all -> 0x0bcb }
        L_0x016d:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0bcb }
            r6 = r20
            goto L_0x0322
        L_0x0174:
            r0 = 1631670868(0x61415254, float:2.2288462E20)
            if (r3 != r0) goto L_0x0181
            java.lang.String r0 = "TPE2"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0181:
            r0 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r3 != r0) goto L_0x018e
            java.lang.String r0 = "TSOT"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x018e:
            r0 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r3 != r0) goto L_0x019b
            java.lang.String r0 = "TSO2"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x019b:
            r0 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r3 != r0) goto L_0x01a8
            java.lang.String r0 = "TSOA"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01a8:
            r0 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r3 != r0) goto L_0x01b5
            java.lang.String r0 = "TSOP"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01b5:
            r0 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r3 != r0) goto L_0x01c2
            java.lang.String r0 = "TSOC"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01c2:
            r0 = 1920233063(0x72746e67, float:4.84146E30)
            if (r3 != r0) goto L_0x01cf
            java.lang.String r0 = "ITUNESADVISORY"
            X.9zl r6 = X.C201809kQ.A00(r13, r0, r3, r2, r2)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01cf:
            r0 = 1885823344(0x70676170, float:2.8643533E29)
            if (r3 != r0) goto L_0x01dc
            java.lang.String r0 = "ITUNESGAPLESS"
            X.9zl r6 = X.C201809kQ.A00(r13, r0, r3, r2, r1)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01dc:
            r0 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r3 != r0) goto L_0x01e9
            java.lang.String r0 = "TVSHOWSORT"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01e9:
            r0 = 1953919848(0x74767368, float:7.810338E31)
            if (r3 != r0) goto L_0x01f6
            java.lang.String r0 = "TVSHOW"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x01f6:
            r0 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r3 != r0) goto L_0x02f7
            r6 = 0
            r5 = r6
            r4 = r6
            r3 = -1
            r2 = -1
        L_0x0200:
            int r14 = r13.A01     // Catch:{ all -> 0x0bcb }
            if (r14 >= r7) goto L_0x0235
            int r15 = r13.A03()     // Catch:{ all -> 0x0bcb }
            int r1 = r13.A03()     // Catch:{ all -> 0x0bcb }
            r0 = 4
            r13.A0J(r0)     // Catch:{ all -> 0x0bcb }
            r0 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r1 != r0) goto L_0x021c
            int r0 = r15 + -12
            java.lang.String r5 = r13.A0D(r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0200
        L_0x021c:
            r0 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r1 != r0) goto L_0x0228
            int r0 = r15 + -12
            java.lang.String r4 = r13.A0D(r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0200
        L_0x0228:
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x022f
            r3 = r14
            r2 = r15
        L_0x022f:
            int r0 = r15 + -12
            r13.A0J(r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0200
        L_0x0235:
            if (r5 == 0) goto L_0x0322
            if (r4 == 0) goto L_0x0322
            r0 = -1
            if (r3 == r0) goto L_0x0322
            r13.A0I(r3)     // Catch:{ all -> 0x0bcb }
            r0 = 16
            r13.A0J(r0)     // Catch:{ all -> 0x0bcb }
            int r2 = r2 - r0
            java.lang.String r0 = r13.A0D(r2)     // Catch:{ all -> 0x0bcb }
            X.82p r6 = new X.82p     // Catch:{ all -> 0x0bcb }
            r6.<init>(r5, r4, r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0250:
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r3
            r0 = 6516084(0x636d74, float:9.130979E-39)
            if (r1 != r0) goto L_0x028f
            int r2 = r13.A03()     // Catch:{ all -> 0x0bcb }
            int r1 = r13.A03()     // Catch:{ all -> 0x0bcb }
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x0276
            r13.A0J(r12)     // Catch:{ all -> 0x0bcb }
            int r0 = r2 + -16
            java.lang.String r0 = r13.A0D(r0)     // Catch:{ all -> 0x0bcb }
            X.82o r6 = new X.82o     // Catch:{ all -> 0x0bcb }
            r6.<init>(r0, r0)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0276:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = "Failed to parse comment attribute: "
            r1.append(r0)     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = X.C201069ij.A00(r3)     // Catch:{ all -> 0x0bcb }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = "MetadataUtil"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0bcb }
            r6 = 0
            goto L_0x0322
        L_0x028f:
            r0 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r1 == r0) goto L_0x0319
            r0 = 7631467(0x74726b, float:1.0693963E-38)
            if (r1 == r0) goto L_0x0319
            r0 = 6516589(0x636f6d, float:9.131686E-39)
            if (r1 == r0) goto L_0x0312
            r0 = 7828084(0x777274, float:1.0969482E-38)
            if (r1 == r0) goto L_0x0312
            r0 = 6578553(0x646179, float:9.218516E-39)
            if (r1 != r0) goto L_0x02af
            java.lang.String r0 = "TDRC"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02af:
            r0 = 4280916(0x415254, float:5.998841E-39)
            if (r1 != r0) goto L_0x02bb
            java.lang.String r0 = "TPE1"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02bb:
            r0 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r1 != r0) goto L_0x02c7
            java.lang.String r0 = "TSSE"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02c7:
            r0 = 6384738(0x616c62, float:8.946924E-39)
            if (r1 != r0) goto L_0x02d3
            java.lang.String r0 = "TALB"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02d3:
            r0 = 7108978(0x6c7972, float:9.9618E-39)
            if (r1 != r0) goto L_0x02df
            java.lang.String r0 = "USLT"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02df:
            r0 = 6776174(0x67656e, float:9.495442E-39)
            if (r1 != r0) goto L_0x02eb
            java.lang.String r0 = "TCON"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02eb:
            r0 = 6779504(0x677270, float:9.500109E-39)
            if (r1 != r0) goto L_0x02f7
            java.lang.String r0 = "TIT1"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x02f7:
            java.lang.String r2 = "MetadataUtil"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = "Skipped unknown metadata entry: "
            r1.append(r0)     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = X.C201069ij.A00(r3)     // Catch:{ all -> 0x0bcb }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x0bcb }
            android.util.Log.d(r2, r0)     // Catch:{ all -> 0x0bcb }
            r13.A0I(r7)
            goto L_0x0099
        L_0x0312:
            java.lang.String r0 = "TCOM"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0319:
            java.lang.String r0 = "TIT2"
            X.82n r6 = X.C201809kQ.A02(r13, r0, r3)     // Catch:{ all -> 0x0bcb }
            goto L_0x0322
        L_0x0320:
            r6 = r20
        L_0x0322:
            r13.A0I(r7)
            if (r6 == 0) goto L_0x0099
            r8.add(r6)
            goto L_0x0099
        L_0x032c:
            int r9 = r9 + r3
            r13.A0I(r9)
            goto L_0x007d
        L_0x0332:
            r0 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r1 != r0) goto L_0x0395
            r13.A0I(r10)
            int r5 = r10 + r17
            r4 = 12
            r13.A0J(r4)
        L_0x0341:
            int r3 = r13.A01
            r11 = 0
            if (r3 >= r5) goto L_0x0395
            int r2 = r13.A03()
            int r1 = r13.A03()
            r0 = 1935766900(0x73617574, float:1.7862687E31)
            if (r1 != r0) goto L_0x037c
            r0 = 14
            if (r2 < r0) goto L_0x0395
            r0 = 5
            int r1 = X.C202309lW.A01(r13, r0)
            if (r1 == r4) goto L_0x0379
            r0 = 13
            if (r1 != r0) goto L_0x0395
            r3 = 1123024896(0x42f00000, float:120.0)
        L_0x0364:
            r0 = 1
            int r2 = X.C202309lW.A01(r13, r0)
            X.B5K[] r1 = new X.B5K[r0]
            r4 = 0
            X.9zm r0 = new X.9zm
            r0.<init>(r2, r3)
            r1[r4] = r0
            X.9uR r11 = new X.9uR
            r11.<init>((X.B5K[]) r1)
            goto L_0x0395
        L_0x0379:
            r3 = 1131413504(0x43700000, float:240.0)
            goto L_0x0364
        L_0x037c:
            int r3 = r3 + r2
            r13.A0I(r3)
            goto L_0x0341
        L_0x0381:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x039c
            r0 = 0
            X.B5K[] r0 = new X.B5K[r0]
            java.lang.Object[] r0 = r8.toArray(r0)
            X.B5K[] r0 = (X.B5K[]) r0
            X.9uR r6 = new X.9uR
            r6.<init>((X.B5K[]) r0)
        L_0x0395:
            int r10 = r10 + r17
            r13.A0I(r10)
            goto L_0x004d
        L_0x039c:
            r6 = 0
            goto L_0x0395
        L_0x039e:
            r17 = r20
            goto L_0x03b2
        L_0x03a1:
            android.util.Pair r0 = android.util.Pair.create(r6, r11)
            java.lang.Object r0 = r0.first
            r17 = r0
            r0 = r17
            X.9uR r0 = (X.C207029uR) r0
            r17 = r0
            r1 = 0
            if (r0 != 0) goto L_0x040a
        L_0x03b2:
            r1 = 1835365473(0x6d657461, float:4.4382975E27)
            r0 = r21
            X.82h r3 = r0.A00(r1)
            if (r3 == 0) goto L_0x04e9
            byte[] r0 = X.C201799kP.A00
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            X.82g r1 = r3.A01(r0)
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            X.82g r2 = r3.A01(r0)
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            X.82g r4 = r3.A01(r0)
            if (r1 == 0) goto L_0x04e9
            if (r2 == 0) goto L_0x04e9
            if (r4 == 0) goto L_0x04e9
            X.9lW r1 = r1.A00
            r0 = 16
            int r1 = X.C202309lW.A02(r1, r0)
            r0 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r1 != r0) goto L_0x04e9
            X.9lW r3 = r2.A00
            r0 = 12
            int r11 = X.C202309lW.A02(r3, r0)
            java.lang.String[] r10 = new java.lang.String[r11]
            r2 = 0
        L_0x03f2:
            r9 = 8
            if (r2 >= r11) goto L_0x046e
            int r1 = r3.A03()
            r0 = 4
            r3.A0J(r0)
            int r1 = r1 - r9
            java.lang.String r0 = r3.A0E(r1)
            r10[r2] = r0
            int r2 = r2 + 1
            goto L_0x03f2
        L_0x0408:
            int r1 = r1 + 1
        L_0x040a:
            r0 = r17
            X.B5K[] r0 = r0.A01
            int r0 = r0.length
            if (r1 >= r0) goto L_0x03b2
            r0 = r17
            X.B5K[] r0 = r0.A01
            r3 = r0[r1]
            boolean r0 = r3 instanceof X.C1689282o
            java.lang.String r4 = "iTunSMPB"
            if (r0 == 0) goto L_0x0453
            X.82o r3 = (X.C1689282o) r3
            java.lang.String r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0408
            java.lang.String r2 = r3.A02
        L_0x0429:
            java.util.regex.Pattern r0 = X.C1903798d.A00
            java.util.regex.Matcher r4 = r0.matcher(r2)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0408
            r0 = 1
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x0408 }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r0, r3)     // Catch:{ NumberFormatException -> 0x0408 }
            r0 = 2
            java.lang.String r0 = r4.group(r0)     // Catch:{ NumberFormatException -> 0x0408 }
            int r0 = java.lang.Integer.parseInt(r0, r3)     // Catch:{ NumberFormatException -> 0x0408 }
            if (r2 > 0) goto L_0x044d
            if (r0 <= 0) goto L_0x0408
        L_0x044d:
            r23 = r2
            r22 = r0
            goto L_0x03b2
        L_0x0453:
            boolean r0 = r3 instanceof X.C1689382p
            if (r0 == 0) goto L_0x0408
            X.82p r3 = (X.C1689382p) r3
            java.lang.String r2 = r3.A01
            java.lang.String r0 = "com.apple.iTunes"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0408
            java.lang.String r0 = r3.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0408
            java.lang.String r2 = r3.A02
            goto L_0x0429
        L_0x046e:
            X.9lW r8 = r4.A00
            r8.A0I(r9)
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
        L_0x0477:
            int r0 = r8.A00
            int r6 = r8.A01
            int r0 = r0 - r6
            if (r0 <= r9) goto L_0x04d3
            int r13 = r8.A03()
            int r0 = r8.A03()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x04c3
            if (r2 >= r11) goto L_0x04c3
            r5 = r10[r2]
            int r3 = r6 + r13
        L_0x0490:
            int r2 = r8.A01
            if (r2 >= r3) goto L_0x04b9
            int r12 = r8.A03()
            int r1 = r8.A03()
            r0 = 1684108385(0x64617461, float:1.6635614E22)
            if (r1 != r0) goto L_0x04be
            int r4 = r8.A03()
            int r3 = r8.A03()
            int r2 = r12 + -16
            byte[] r1 = new byte[r2]
            r0 = 0
            r8.A0K(r1, r0, r2)
            X.9zn r0 = new X.9zn
            r0.<init>(r1, r3, r4, r5)
            r7.add(r0)
        L_0x04b9:
            int r6 = r6 + r13
            r8.A0I(r6)
            goto L_0x0477
        L_0x04be:
            int r2 = r2 + r12
            r8.A0I(r2)
            goto L_0x0490
        L_0x04c3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skipped metadata with unknown key index: "
            java.lang.String r1 = X.AnonymousClass000.A0r(r0, r1, r2)
            java.lang.String r0 = "AtomParsers"
            android.util.Log.w(r0, r1)
            goto L_0x04b9
        L_0x04d3:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x04e9
            r0 = 0
            X.B5K[] r0 = new X.B5K[r0]
            java.lang.Object[] r1 = r7.toArray(r0)
            X.B5K[] r1 = (X.B5K[]) r1
            X.9uR r16 = new X.9uR
            r0 = r16
            r0.<init>((X.B5K[]) r1)
        L_0x04e9:
            r19 = 0
            java.util.ArrayList r18 = X.AnonymousClass001.A0I()
            r25 = 0
        L_0x04f1:
            r0 = r21
            java.util.List r2 = r0.A01
            int r1 = r2.size()
            r0 = r25
            if (r0 >= r1) goto L_0x09f6
            java.lang.Object r1 = r2.get(r0)
            X.82h r1 = (X.C1688582h) r1
            int r2 = r1.A00
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 != r0) goto L_0x0576
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            r0 = r21
            X.82g r9 = r0.A01(r2)
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r51
            boolean r0 = r0.A0C
            r6 = 0
            r7 = r20
            r8 = r1
            r12 = r0
            X.9OI r31 = X.C201799kP.A03(r7, r8, r9, r10, r12)
            if (r31 == 0) goto L_0x0576
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            X.82h r1 = r1.A00(r0)
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            X.82h r1 = r1.A00(r0)
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            X.82h r4 = r1.A00(r0)
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            X.82g r1 = r4.A01(r0)
            if (r1 == 0) goto L_0x09e4
            r0 = r31
            X.9uY r2 = r0.A07
            X.9zb r39 = new X.9zb
            r0 = r39
            r0.<init>(r2, r1)
        L_0x0550:
            int r30 = r39.BGw()
            if (r30 != 0) goto L_0x057a
            long[] r4 = new long[r6]
            int[] r3 = new int[r6]
            long[] r2 = new long[r6]
            int[] r1 = new int[r6]
            r12 = 0
            X.9SS r0 = new X.9SS
            r11 = 0
            r5 = r0
            r6 = r31
            r7 = r3
            r8 = r1
            r9 = r4
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x056d:
            int r1 = r0.A01
            if (r1 == 0) goto L_0x0576
            r1 = r18
            r1.add(r0)
        L_0x0576:
            int r25 = r25 + 1
            goto L_0x04f1
        L_0x057a:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            X.82g r0 = r4.A01(r0)
            r5 = 1
            if (r0 != 0) goto L_0x064e
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            X.82g r0 = r4.A01(r0)
            java.util.Objects.requireNonNull(r0)
            r2 = 1
        L_0x058f:
            X.9lW r1 = r0.A00
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            X.82g r0 = r4.A01(r0)
            java.util.Objects.requireNonNull(r0)
            X.9lW r0 = r0.A00
            r3 = 1937011827(0x73747473, float:1.9367711E31)
            X.82g r3 = r4.A01(r3)
            java.util.Objects.requireNonNull(r3)
            X.9lW r3 = r3.A00
            r40 = r3
            r3 = 1937011571(0x73747373, float:1.9367401E31)
            X.82g r3 = r4.A01(r3)
            if (r3 == 0) goto L_0x064a
            X.9lW r3 = r3.A00
            r38 = r3
        L_0x05b8:
            r3 = 1668576371(0x63747473, float:4.5093966E21)
            X.82g r3 = r4.A01(r3)
            if (r3 == 0) goto L_0x0647
            X.9lW r15 = r3.A00
        L_0x05c3:
            X.9Sa r9 = new X.9Sa
            r9.<init>(r0, r1, r2)
            r2 = 12
            r0 = r40
            r0.A0I(r2)
            int r8 = r40.A05()
            int r8 = r8 - r5
            int r13 = r40.A05()
            int r33 = r40.A05()
            if (r15 == 0) goto L_0x0644
            r15.A0I(r2)
            int r29 = r15.A05()
        L_0x05e5:
            r1 = -1
            if (r38 == 0) goto L_0x0641
            r0 = r38
            r0.A0I(r2)
            int r7 = r38.A05()
            if (r7 <= 0) goto L_0x063e
            int r0 = r38.A05()
            int r14 = r0 + -1
        L_0x05f9:
            int r32 = r39.BBw()
            r0 = r31
            X.9uY r0 = r0.A07
            r46 = r0
            java.lang.String r2 = r0.A0S
            r0 = r32
            if (r0 == r1) goto L_0x069e
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0621
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0621
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x069e
        L_0x0621:
            if (r8 != 0) goto L_0x069e
            if (r29 != 0) goto L_0x069e
            if (r7 != 0) goto L_0x069e
            int r11 = r9.A05
            long[] r12 = new long[r11]
            int[] r10 = new int[r11]
        L_0x062d:
            boolean r0 = r9.A00()
            if (r0 == 0) goto L_0x0651
            int r2 = r9.A00
            long r0 = r9.A04
            r12[r2] = r0
            int r0 = r9.A02
            r10[r2] = r0
            goto L_0x062d
        L_0x063e:
            r38 = 0
            goto L_0x0642
        L_0x0641:
            r7 = 0
        L_0x0642:
            r14 = -1
            goto L_0x05f9
        L_0x0644:
            r29 = 0
            goto L_0x05e5
        L_0x0647:
            r15 = 0
            goto L_0x05c3
        L_0x064a:
            r38 = 0
            goto L_0x05b8
        L_0x064e:
            r2 = 0
            goto L_0x058f
        L_0x0651:
            r0 = r33
            long r3 = (long) r0
            r9 = 8192(0x2000, float:1.14794E-41)
            int r9 = r9 / r32
            r8 = 0
            r1 = 0
            r0 = 0
        L_0x065b:
            if (r1 >= r11) goto L_0x0667
            r2 = r10[r1]
            int r2 = r2 + r9
            int r2 = r2 + -1
            int r2 = r2 / r9
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L_0x065b
        L_0x0667:
            long[] r15 = new long[r0]
            int[] r7 = new int[r0]
            long[] r14 = new long[r0]
            int[] r13 = new int[r0]
            r29 = 0
            r5 = 0
        L_0x0672:
            if (r8 >= r11) goto L_0x07b4
            r2 = r10[r8]
            r27 = r12[r8]
        L_0x0678:
            if (r2 <= 0) goto L_0x069b
            int r26 = java.lang.Math.min(r9, r2)
            r15[r29] = r27
            int r0 = r32 * r26
            r7[r29] = r0
            int r5 = java.lang.Math.max(r5, r0)
            long r0 = (long) r6
            long r0 = r0 * r3
            r14[r29] = r0
            r0 = 1
            r13[r29] = r0
            r0 = r7[r29]
            long r0 = (long) r0
            long r27 = r27 + r0
            int r6 = r6 + r26
            int r2 = r2 - r26
            int r29 = r29 + 1
            goto L_0x0678
        L_0x069b:
            int r8 = r8 + 1
            goto L_0x0672
        L_0x069e:
            r0 = r30
            long[] r0 = new long[r0]
            r37 = r0
            r0 = r30
            int[] r0 = new int[r0]
            r36 = r0
            r0 = r30
            long[] r10 = new long[r0]
            int[] r0 = new int[r0]
            r35 = r0
            r34 = 0
            r28 = 0
            r12 = 0
            r11 = 0
            r0 = 0
            r4 = 0
        L_0x06bc:
            java.lang.String r26 = "AtomParsers"
            r2 = r30
            if (r6 >= r2) goto L_0x0749
        L_0x06c2:
            if (r12 != 0) goto L_0x06cf
            boolean r2 = r9.A00()
            if (r2 == 0) goto L_0x072a
            long r4 = r9.A04
            int r12 = r9.A02
            goto L_0x06c2
        L_0x06cf:
            if (r15 == 0) goto L_0x06e2
        L_0x06d1:
            if (r11 != 0) goto L_0x06e0
            if (r29 <= 0) goto L_0x06e0
            int r11 = r15.A05()
            int r28 = r15.A03()
            int r29 = r29 + -1
            goto L_0x06d1
        L_0x06e0:
            int r11 = r11 + -1
        L_0x06e2:
            r37[r6] = r4
            int r3 = r39.Bmv()
            r36[r6] = r3
            r2 = r34
            if (r3 <= r2) goto L_0x06f0
            r34 = r36[r6]
        L_0x06f0:
            r2 = r28
            long r2 = (long) r2
            long r2 = r2 + r0
            r10[r6] = r2
            boolean r2 = X.AnonymousClass000.A1W(r38)
            r35[r6] = r2
            if (r6 != r14) goto L_0x070d
            r2 = 1
            r35[r6] = r2
            int r7 = r7 + -1
            if (r7 <= 0) goto L_0x070d
            java.util.Objects.requireNonNull(r38)
            int r14 = r38.A05()
            int r14 = r14 - r2
        L_0x070d:
            r2 = r33
            long r2 = (long) r2
            long r0 = r0 + r2
            int r13 = r13 + -1
            if (r13 != 0) goto L_0x0721
            if (r8 <= 0) goto L_0x0721
            int r13 = r40.A05()
            int r33 = r40.A03()
            int r8 = r8 + -1
        L_0x0721:
            r2 = r36[r6]
            long r2 = (long) r2
            long r4 = r4 + r2
            int r12 = r12 + -1
            int r6 = r6 + 1
            goto L_0x06bc
        L_0x072a:
            java.lang.String r3 = "Unexpected end of chunk data"
            r2 = r26
            android.util.Log.w(r2, r3)
            r2 = r37
            long[] r37 = java.util.Arrays.copyOf(r2, r6)
            r2 = r36
            int[] r36 = java.util.Arrays.copyOf(r2, r6)
            long[] r10 = java.util.Arrays.copyOf(r10, r6)
            r2 = r35
            int[] r35 = java.util.Arrays.copyOf(r2, r6)
            r30 = r6
        L_0x0749:
            r2 = r28
            long r2 = (long) r2
            long r0 = r0 + r2
            if (r15 == 0) goto L_0x07b2
        L_0x074f:
            if (r29 <= 0) goto L_0x07b2
            int r2 = r15.A05()
            if (r2 == 0) goto L_0x07ac
            r4 = 0
        L_0x0758:
            if (r7 != 0) goto L_0x0764
            if (r13 != 0) goto L_0x0764
            if (r12 != 0) goto L_0x0764
            if (r8 != 0) goto L_0x0764
            if (r11 != 0) goto L_0x0764
            if (r4 != 0) goto L_0x07d5
        L_0x0764:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Inconsistent stbl box for track "
            r3.append(r2)
            r2 = r31
            int r2 = r2.A00
            r3.append(r2)
            java.lang.String r2 = ": remainingSynchronizationSamples "
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = ", remainingSamplesAtTimestampDelta "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = ", remainingSamplesInChunk "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r2 = ", remainingTimestampDeltaChanges "
            r3.append(r2)
            r3.append(r8)
            java.lang.String r2 = ", remainingSamplesAtTimestampOffset "
            r3.append(r2)
            r3.append(r11)
            if (r4 != 0) goto L_0x07a9
            java.lang.String r2 = ", ctts invalid"
        L_0x07a0:
            r3.append(r2)
            r2 = r26
            X.AnonymousClass000.A1A(r3, r2)
            goto L_0x07d5
        L_0x07a9:
            java.lang.String r2 = ""
            goto L_0x07a0
        L_0x07ac:
            r15.A03()
            int r29 = r29 + -1
            goto L_0x074f
        L_0x07b2:
            r4 = 1
            goto L_0x0758
        L_0x07b4:
            long r0 = (long) r6
            long r3 = r3 * r0
            X.9Mw r0 = new X.9Mw
            r6 = r0
            r8 = r13
            r9 = r15
            r10 = r14
            r11 = r5
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            long[] r1 = r0.A04
            r37 = r1
            int[] r1 = r0.A03
            r36 = r1
            int r1 = r0.A00
            r34 = r1
            long[] r10 = r0.A05
            int[] r1 = r0.A02
            r35 = r1
            long r0 = r0.A01
        L_0x07d5:
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r2 = r31
            long r4 = r2.A06
            r38 = r0
            r42 = r4
            long r7 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            long[] r9 = r2.A08
            if (r9 != 0) goto L_0x07fc
            com.facebook.android.exoplayer2.util.Util.A0B(r10, r4)
            X.9SS r0 = new X.9SS
            r1 = r2
            r2 = r36
            r3 = r35
            r4 = r37
            r5 = r10
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x056d
        L_0x07fc:
            int r13 = r9.length
            r3 = 1
            if (r13 != r3) goto L_0x0898
            int r2 = r2.A03
            if (r2 != r3) goto L_0x089a
            int r6 = r10.length
            r2 = 2
            if (r6 < r2) goto L_0x089a
            r2 = r31
            long[] r2 = r2.A09
            java.util.Objects.requireNonNull(r2)
            r44 = r2[r19]
            r38 = r9[r19]
            r2 = r31
            long r11 = r2.A05
            r40 = r4
            r42 = r11
            long r2 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            long r26 = r44 + r2
            r2 = 1
            int r7 = r6 - r2
            r3 = 4
            r2 = 0
            int r8 = X.C165607th.A03(r3, r7, r2)
            int r6 = r6 - r3
            int r3 = X.C165607th.A03(r6, r7, r2)
            r14 = r10[r19]
            int r2 = (r14 > r44 ? 1 : (r14 == r44 ? 0 : -1))
            if (r2 > 0) goto L_0x089a
            r6 = r10[r8]
            int r2 = (r44 > r6 ? 1 : (r44 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x089a
            r6 = r10[r3]
            int r2 = (r6 > r26 ? 1 : (r6 == r26 ? 0 : -1))
            if (r2 >= 0) goto L_0x089a
            int r2 = (r26 > r0 ? 1 : (r26 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x089a
            long r38 = r0 - r26
            long r44 = r44 - r14
            r2 = r46
            int r2 = r2.A0F
            long r6 = (long) r2
            r46 = r6
            r48 = r4
            long r2 = com.facebook.android.exoplayer2.util.Util.A07(r44, r46, r48)
            r40 = r6
            r42 = r4
            long r6 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            r14 = 0
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x0868
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x089a
        L_0x0868:
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x089a
            int r8 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r8 > 0) goto L_0x089a
            int r0 = (int) r2
            r23 = r0
            int r0 = (int) r6
            r22 = r0
            r2 = 1000000(0xf4240, double:4.940656E-318)
            com.facebook.android.exoplayer2.util.Util.A0B(r10, r4)
            r0 = r9[r19]
            r4 = r11
            long r7 = com.facebook.android.exoplayer2.util.Util.A07(r0, r2, r4)
            X.9SS r0 = new X.9SS
            r1 = r31
            r2 = r36
            r3 = r35
            r4 = r37
            r5 = r10
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x056d
        L_0x0898:
            if (r13 != r3) goto L_0x08d2
        L_0x089a:
            r11 = r9[r19]
            r6 = 0
            int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x08d2
            r2 = r31
            long[] r2 = r2.A09
            java.util.Objects.requireNonNull(r2)
            r7 = r2[r19]
            r6 = 0
        L_0x08ac:
            int r2 = r10.length
            if (r6 >= r2) goto L_0x08bb
            r2 = r10[r6]
            long r2 = r2 - r7
            long r2 = com.facebook.android.exoplayer2.util.Util.A06(r2, r4)
            r10[r6] = r2
            int r6 = r6 + 1
            goto L_0x08ac
        L_0x08bb:
            long r0 = r0 - r7
            long r7 = com.facebook.android.exoplayer2.util.Util.A06(r0, r4)
            X.9SS r0 = new X.9SS
            r1 = r31
            r2 = r36
            r3 = r35
            r4 = r37
            r5 = r10
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x056d
        L_0x08d2:
            r0 = r31
            int r1 = r0.A03
            r0 = 1
            boolean r26 = X.AnonymousClass000.A1S(r1, r0)
            int[] r3 = new int[r13]
            int[] r2 = new int[r13]
            r0 = r31
            long[] r0 = r0.A09
            r33 = r0
            java.util.Objects.requireNonNull(r33)
            r8 = 0
            r32 = 0
            r11 = 0
            r7 = 0
        L_0x08ed:
            if (r8 >= r13) goto L_0x094a
            r0 = r33[r8]
            r14 = -1
            int r6 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0947
            r38 = r9[r8]
            r6 = r31
            long r14 = r6.A05
            r40 = r4
            r42 = r14
            long r14 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            r6 = 1
            int r6 = com.facebook.android.exoplayer2.util.Util.A03(r10, r0, r6)
            r3[r8] = r6
            long r0 = r0 + r14
            int r12 = java.util.Arrays.binarySearch(r10, r0)
            if (r12 >= 0) goto L_0x0928
            int r12 = ~r12
        L_0x0914:
            r2[r8] = r12
        L_0x0916:
            r1 = r3[r8]
            r0 = r2[r8]
            if (r1 >= r0) goto L_0x0939
            r0 = r3[r8]
            r0 = r35[r0]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0939
            X.C165587tf.A1V(r3, r8)
            goto L_0x0916
        L_0x0928:
            int r12 = r12 + 1
            int r6 = r10.length
            if (r12 >= r6) goto L_0x0934
            r14 = r10[r12]
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0934
            goto L_0x0928
        L_0x0934:
            if (r26 == 0) goto L_0x0914
            int r12 = r12 + -1
            goto L_0x0914
        L_0x0939:
            r1 = r2[r8]
            r0 = r3[r8]
            int r1 = r1 - r0
            int r11 = r11 + r1
            boolean r0 = X.C36381kD.A1U(r7, r0)
            r32 = r32 | r0
            r7 = r2[r8]
        L_0x0947:
            int r8 = r8 + 1
            goto L_0x08ed
        L_0x094a:
            r8 = 0
            r1 = 1
            r0 = r30
            if (r11 != r0) goto L_0x0951
            r1 = 0
        L_0x0951:
            r32 = r32 | r1
            if (r32 == 0) goto L_0x09be
            long[] r0 = new long[r11]
            r45 = r0
            int[] r15 = new int[r11]
            r34 = 0
            int[] r0 = new int[r11]
            r44 = r0
        L_0x0961:
            long[] r0 = new long[r11]
            r30 = r0
            r38 = 0
            r7 = 0
        L_0x0968:
            if (r8 >= r13) goto L_0x09c5
            r28 = r33[r8]
            r6 = r3[r8]
            r14 = r2[r8]
            if (r32 == 0) goto L_0x0987
            int r11 = r14 - r6
            r1 = r37
            r0 = r45
            java.lang.System.arraycopy(r1, r6, r0, r7, r11)
            r0 = r36
            java.lang.System.arraycopy(r0, r6, r15, r7, r11)
            r1 = r35
            r0 = r44
            java.lang.System.arraycopy(r1, r6, r0, r7, r11)
        L_0x0987:
            if (r6 >= r14) goto L_0x09b7
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r31
            long r0 = r0.A05
            r42 = r0
            long r26 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            r0 = r10[r6]
            long r0 = r0 - r28
            r11 = 0
            long r0 = java.lang.Math.max(r11, r0)
            long r0 = com.facebook.android.exoplayer2.util.Util.A06(r0, r4)
            long r26 = r26 + r0
            r30[r7] = r26
            if (r32 == 0) goto L_0x09b2
            r1 = r15[r7]
            r0 = r34
            if (r1 <= r0) goto L_0x09b2
            r34 = r36[r6]
        L_0x09b2:
            int r7 = r7 + 1
            int r6 = r6 + 1
            goto L_0x0987
        L_0x09b7:
            r0 = r9[r8]
            long r38 = r38 + r0
            int r8 = r8 + 1
            goto L_0x0968
        L_0x09be:
            r45 = r37
            r15 = r36
            r44 = r35
            goto L_0x0961
        L_0x09c5:
            r40 = 1000000(0xf4240, double:4.940656E-318)
            r0 = r31
            long r0 = r0.A05
            r42 = r0
            long r7 = com.facebook.android.exoplayer2.util.Util.A07(r38, r40, r42)
            X.9SS r0 = new X.9SS
            r1 = r31
            r2 = r15
            r3 = r44
            r4 = r45
            r5 = r30
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x056d
        L_0x09e4:
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            X.82g r1 = r4.A01(r0)
            if (r1 == 0) goto L_0x0bd0
            X.9zc r39 = new X.9zc
            r0 = r39
            r0.<init>(r1)
            goto L_0x0550
        L_0x09f6:
            int r9 = r18.size()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
            r7 = -1
        L_0x0a06:
            if (r8 >= r9) goto L_0x0b15
            r0 = r18
            java.lang.Object r12 = r0.get(r8)
            X.9SS r12 = (X.AnonymousClass9SS) r12
            X.9OI r11 = r12.A03
            long r3 = r11.A04
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0b11
            long r5 = r11.A04
        L_0x0a1a:
            long r1 = java.lang.Math.max(r1, r5)
            r0 = r51
            X.9zu r0 = r0.A09
            int r3 = r11.A03
            X.B2i r0 = r0.A05(r8)
            X.9LB r10 = new X.9LB
            r10.<init>(r0, r11, r12)
            int r0 = r12.A00
            int r13 = r0 + 30
            X.9uY r4 = r11.A07
            X.9en r0 = new X.9en
            r0.<init>(r4)
            r0.A09 = r13
            X.9uY r4 = new X.9uY
            r4.<init>(r0)
            r0 = 2
            if (r3 != r0) goto L_0x0a62
            r13 = 0
            int r0 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a62
            int r3 = r12.A01
            r0 = 1
            if (r3 <= r0) goto L_0x0a62
            int r0 = r12.A01
            float r3 = (float) r0
            float r0 = (float) r5
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r0 = r0 / r5
            float r3 = r3 / r0
            X.9en r0 = new X.9en
            r0.<init>(r4)
            r0.A00 = r3
            X.9uY r4 = new X.9uY
            r4.<init>(r0)
        L_0x0a62:
            int r6 = r11.A03
            r11 = 1
            if (r6 != r11) goto L_0x0aaf
            r3 = -1
            r0 = r23
            if (r0 == r3) goto L_0x0a82
            r0 = r22
            if (r0 == r3) goto L_0x0a82
            X.9en r0 = new X.9en
            r0.<init>(r4)
            r3 = r23
            r0.A06 = r3
            r3 = r22
            r0.A07 = r3
            X.9uY r4 = new X.9uY
            r4.<init>(r0)
        L_0x0a82:
            if (r17 == 0) goto L_0x0a92
            X.9en r0 = new X.9en
            r0.<init>(r4)
            r3 = r17
            r0.A0L = r3
            X.9uY r4 = new X.9uY
            r4.<init>(r0)
        L_0x0a92:
            X.B2i r0 = r10.A01
            r0.B7a(r4)
            r0 = 2
            if (r6 != r0) goto L_0x0aa1
            r0 = -1
            if (r7 != r0) goto L_0x0aa1
            int r7 = r24.size()
        L_0x0aa1:
            r0 = r24
            r0.add(r10)
            int r8 = r8 + 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0a06
        L_0x0aaf:
            r0 = 2
            if (r6 != r0) goto L_0x0a92
            if (r16 == 0) goto L_0x0a92
            r5 = 0
        L_0x0ab5:
            r0 = r16
            X.B5K[] r3 = r0.A01
            int r0 = r3.length
            if (r5 >= r0) goto L_0x0a92
            r12 = r3[r5]
            boolean r0 = r12 instanceof X.C209309zn
            if (r0 == 0) goto L_0x0b0e
            X.9zn r12 = (X.C209309zn) r12
            java.lang.String r3 = r12.A02
            java.lang.String r0 = "com.android.capture.fps"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0b0e
            int r3 = r12.A01
            r0 = 23
            if (r3 != r0) goto L_0x0b0e
            byte[] r0 = r12.A03     // Catch:{ NumberFormatException -> 0x0b05 }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch:{ NumberFormatException -> 0x0b05 }
            java.nio.FloatBuffer r0 = r0.asFloatBuffer()     // Catch:{ NumberFormatException -> 0x0b05 }
            float r0 = r0.get()     // Catch:{ NumberFormatException -> 0x0b05 }
            X.9en r3 = new X.9en     // Catch:{ NumberFormatException -> 0x0b05 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0b05 }
            r3.A00 = r0     // Catch:{ NumberFormatException -> 0x0b05 }
            X.9uY r0 = new X.9uY     // Catch:{ NumberFormatException -> 0x0b05 }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x0b05 }
            r4 = r0
            X.B5K[] r3 = new X.B5K[r11]     // Catch:{ NumberFormatException -> 0x0b05 }
            r3[r19] = r12     // Catch:{ NumberFormatException -> 0x0b05 }
            X.9uR r0 = new X.9uR     // Catch:{ NumberFormatException -> 0x0b05 }
            r0.<init>((X.B5K[]) r3)     // Catch:{ NumberFormatException -> 0x0b05 }
            X.9en r3 = new X.9en     // Catch:{ NumberFormatException -> 0x0b05 }
            r3.<init>(r4)     // Catch:{ NumberFormatException -> 0x0b05 }
            r3.A0L = r0     // Catch:{ NumberFormatException -> 0x0b05 }
            X.9uY r0 = new X.9uY     // Catch:{ NumberFormatException -> 0x0b05 }
            r0.<init>(r3)     // Catch:{ NumberFormatException -> 0x0b05 }
            goto L_0x0b0d
        L_0x0b05:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r0 = "Ignoring invalid framerate"
            android.util.Log.w(r3, r0)
            goto L_0x0b0e
        L_0x0b0d:
            r4 = r0
        L_0x0b0e:
            int r5 = r5 + 1
            goto L_0x0ab5
        L_0x0b11:
            long r5 = r12.A02
            goto L_0x0a1a
        L_0x0b15:
            r0 = r51
            r0.A02 = r7
            r0.A08 = r1
            r0 = 0
            X.9LB[] r1 = new X.AnonymousClass9LB[r0]
            r0 = r24
            java.lang.Object[] r7 = r0.toArray(r1)
            X.9LB[] r7 = (X.AnonymousClass9LB[]) r7
            r0 = r51
            r0.A0D = r7
            int r8 = r7.length
            long[][] r6 = new long[r8][]
            int[] r5 = new int[r8]
            long[] r4 = new long[r8]
            boolean[] r3 = new boolean[r8]
            r2 = 0
            r9 = 0
        L_0x0b35:
            if (r9 >= r8) goto L_0x0b4e
            r0 = r7[r9]
            X.9SS r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r9] = r0
            r0 = r7[r9]
            X.9SS r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r19]
            r4[r9] = r0
            int r9 = r9 + 1
            goto L_0x0b35
        L_0x0b4e:
            r14 = 0
        L_0x0b50:
            if (r2 >= r8) goto L_0x0b8f
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r13 = -1
            r1 = 0
        L_0x0b59:
            if (r1 >= r8) goto L_0x0b6b
            boolean r0 = r3[r1]
            if (r0 != 0) goto L_0x0b68
            r9 = r4[r1]
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0b68
            r11 = r4[r1]
            r13 = r1
        L_0x0b68:
            int r1 = r1 + 1
            goto L_0x0b59
        L_0x0b6b:
            r12 = r5[r13]
            r11 = r6[r13]
            r11[r12] = r14
            r0 = r7[r13]
            X.9SS r10 = r0.A03
            int[] r0 = r10.A05
            r0 = r0[r12]
            long r0 = (long) r0
            long r14 = r14 + r0
            r9 = 1
            int r1 = r12 + 1
            r5[r13] = r1
            int r0 = r11.length
            if (r1 >= r0) goto L_0x0b8a
            long[] r0 = r10.A07
            r0 = r0[r1]
            r4[r13] = r0
            goto L_0x0b50
        L_0x0b8a:
            r3[r13] = r9
            int r2 = r2 + 1
            goto L_0x0b50
        L_0x0b8f:
            r0 = r51
            r0.A0E = r6
            X.9zu r2 = r0.A09
            r0 = 1
            r2.A0G = r0
            android.os.Handler r1 = r2.A0P
            java.lang.Runnable r0 = r2.A0V
            r1.post(r0)
            r0 = r51
            X.9zu r2 = r0.A09
            r2.A07 = r0
            android.os.Handler r1 = r2.A0P
            java.lang.Runnable r0 = r2.A0V
            r1.post(r0)
            r50.clear()
            r1 = 2
            r0 = r51
            r0.A03 = r1
            goto L_0x0000
        L_0x0bb6:
            boolean r0 = r50.isEmpty()
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r50.peek()
            X.82h r0 = (X.C1688582h) r0
            java.util.List r1 = r0.A01
            r0 = r21
            r1.add(r0)
            goto L_0x0000
        L_0x0bcb:
            r0 = move-exception
            r13.A0I(r7)
            throw r0
        L_0x0bd0:
            java.lang.String r3 = "Track has no sample table size information"
            r2 = 1
            X.8xn r1 = new X.8xn
            r1.<init>(r3, r7, r2)
            throw r1
        L_0x0bd9:
            r0 = r51
            int r1 = r0.A03
            r0 = 2
            if (r1 == r0) goto L_0x0be7
            r1 = 0
            r0 = r51
            r0.A03 = r1
            r0.A00 = r1
        L_0x0be7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209159zY.A00(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        if (r3 == -1) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (r7 == -1) goto L_0x0092;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass9VL BH7(long r13) {
        /*
            r12 = this;
            X.9LB[] r1 = r12.A0D
            int r0 = r1.length
            if (r0 == 0) goto L_0x002d
            int r0 = r12.A02
            r8 = -1
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == r8) goto L_0x005d
            r0 = r1[r0]
            X.9SS r9 = r0.A03
            long[] r1 = r9.A07
            r0 = 0
            int r3 = com.facebook.android.exoplayer2.util.Util.A03(r1, r13, r0)
        L_0x001a:
            if (r3 < 0) goto L_0x0027
            int[] r0 = r9.A04
            r0 = r0[r3]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0035
            int r3 = r3 + -1
            goto L_0x001a
        L_0x0027:
            int r3 = r9.A00(r13)
            if (r3 != r8) goto L_0x0035
        L_0x002d:
            X.9fu r1 = X.C199759fu.A02
            X.9VL r0 = new X.9VL
            r0.<init>(r1, r1)
            return r0
        L_0x0035:
            long[] r2 = r9.A07
            r6 = r2[r3]
            long[] r1 = r9.A06
            r4 = r1[r3]
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            int r0 = r9.A01
            int r0 = r0 + -1
            if (r3 >= r0) goto L_0x0055
            int r0 = r9.A00(r13)
            if (r0 == r8) goto L_0x0055
            if (r0 == r3) goto L_0x0055
            r2 = r2[r0]
            r0 = r1[r0]
        L_0x0053:
            r13 = r6
            goto L_0x0069
        L_0x0055:
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0053
        L_0x005d:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0 = -1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0069:
            r8 = 0
        L_0x006a:
            X.9LB[] r7 = r12.A0D
            int r6 = r7.length
            if (r8 >= r6) goto L_0x00c6
            int r6 = r12.A02
            if (r8 == r6) goto L_0x00ba
            r6 = r7[r8]
            X.9SS r9 = r6.A03
            long[] r7 = r9.A07
            r6 = 0
            int r7 = com.facebook.android.exoplayer2.util.Util.A03(r7, r13, r6)
        L_0x007e:
            if (r7 < 0) goto L_0x008b
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00aa
            int r7 = r7 + -1
            goto L_0x007e
        L_0x008b:
            int r7 = r9.A00(r13)
            r6 = -1
            if (r7 != r6) goto L_0x00aa
        L_0x0092:
            int r6 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00ba
            long[] r7 = r9.A07
            r6 = 0
            int r7 = com.facebook.android.exoplayer2.util.Util.A03(r7, r2, r6)
        L_0x009d:
            if (r7 < 0) goto L_0x00b3
            int[] r6 = r9.A04
            r6 = r6[r7]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x00bd
            int r7 = r7 + -1
            goto L_0x009d
        L_0x00aa:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r4 = java.lang.Math.min(r6, r4)
            goto L_0x0092
        L_0x00b3:
            int r7 = r9.A00(r2)
            r6 = -1
            if (r7 != r6) goto L_0x00bd
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x006a
        L_0x00bd:
            long[] r6 = r9.A06
            r6 = r6[r7]
            long r0 = java.lang.Math.min(r6, r0)
            goto L_0x00ba
        L_0x00c6:
            X.9fu r6 = new X.9fu
            r6.<init>(r13, r4)
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x00d5
            X.9VL r0 = new X.9VL
            r0.<init>(r6, r6)
            return r0
        L_0x00d5:
            X.9fu r4 = new X.9fu
            r4.<init>(r2, r0)
            X.9VL r0 = new X.9VL
            r0.<init>(r6, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209159zY.BH7(long):X.9VL");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if (r3 == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        if (r17 < r19) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        r3 = r1;
        r19 = r17;
        r25 = r4;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        if (r15 >= r23) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r11 = r1;
        r2 = r4;
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (true == r3) goto L_0x0056;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x036f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int Bmm(X.C201519jm r27, X.C191039Bi r28) {
        /*
            r26 = this;
        L_0x0000:
            r10 = r26
            int r0 = r10.A03
            r13 = r27
            if (r0 == 0) goto L_0x00e7
            r12 = 1
            r14 = r28
            if (r0 == r12) goto L_0x0070
            long r7 = r13.A02
            int r2 = r10.A06
            r9 = -1
            if (r2 != r9) goto L_0x0278
            r2 = -1
            r25 = -1
            r4 = 0
            r23 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 1
            r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0029:
            X.9LB[] r5 = r10.A0D
            int r0 = r5.length
            if (r4 >= r0) goto L_0x024e
            r5 = r5[r4]
            int r1 = r5.A00
            X.9SS r0 = r5.A03
            int r0 = r0.A01
            if (r1 == r0) goto L_0x0069
            X.9SS r0 = r5.A03
            long[] r0 = r0.A06
            r17 = r0[r1]
            long[][] r0 = r10.A0E
            r0 = r0[r4]
            r15 = r0[r1]
            long r17 = r17 - r7
            r5 = 0
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x006c
            r5 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006c
            r1 = 0
            if (r3 != 0) goto L_0x005a
        L_0x0056:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 >= 0) goto L_0x0061
        L_0x005a:
            r3 = r1
            r19 = r17
            r25 = r4
            r21 = r15
        L_0x0061:
            int r0 = (r15 > r23 ? 1 : (r15 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0069
            r11 = r1
            r2 = r4
            r23 = r15
        L_0x0069:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x006c:
            r1 = 1
            if (r12 != r3) goto L_0x0061
            goto L_0x0056
        L_0x0070:
            long r2 = r10.A07
            int r6 = r10.A00
            long r0 = (long) r6
            long r2 = r2 - r0
            long r0 = r13.A02
            long r0 = r0 + r2
            X.9lW r4 = r10.A0A
            if (r4 == 0) goto L_0x00d7
            byte[] r5 = r4.A02
            int r4 = (int) r2
            r2 = 0
            r13.A05(r5, r6, r4, r2)
            int r3 = r10.A01
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r3 != r2) goto L_0x00ba
            X.9lW r5 = r10.A0A
            r2 = 8
            int r2 = X.C202309lW.A02(r5, r2)
            r4 = 1903435808(0x71742020, float:1.2088509E30)
            if (r2 == r4) goto L_0x00a9
            r2 = 4
            r5.A0J(r2)
        L_0x009c:
            int r3 = r5.A00
            int r2 = r5.A01
            int r3 = r3 - r2
            if (r3 <= 0) goto L_0x00b8
            int r2 = r5.A03()
            if (r2 != r4) goto L_0x009c
        L_0x00a9:
            r2 = 1
        L_0x00aa:
            r10.A0C = r2
        L_0x00ac:
            r2 = 0
        L_0x00ad:
            r10.A00(r0)
            if (r2 == 0) goto L_0x0000
            int r1 = r10.A03
            r0 = 2
            if (r1 == r0) goto L_0x0000
            return r12
        L_0x00b8:
            r2 = 0
            goto L_0x00aa
        L_0x00ba:
            java.util.ArrayDeque r3 = r10.A0J
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x00ac
            java.lang.Object r5 = r3.peek()
            X.82h r5 = (X.C1688582h) r5
            int r4 = r10.A01
            X.9lW r2 = r10.A0A
            X.82g r3 = new X.82g
            r3.<init>(r2, r4)
            java.util.List r2 = r5.A02
            r2.add(r3)
            goto L_0x00ac
        L_0x00d7:
            r5 = 262144(0x40000, double:1.295163E-318)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e3
            int r4 = (int) r2
            r13.A02(r4)
            goto L_0x00ac
        L_0x00e3:
            r14.A00 = r0
            r2 = 1
            goto L_0x00ad
        L_0x00e7:
            int r0 = r10.A00
            r8 = 1
            r7 = 8
            r6 = 0
            if (r0 != 0) goto L_0x010a
            X.9lW r2 = r10.A0F
            byte[] r0 = r2.A02
            boolean r0 = r13.A05(r0, r6, r7, r8)
            if (r0 == 0) goto L_0x0376
            r10.A00 = r7
            r2.A0I(r6)
            long r0 = r2.A09()
            r10.A07 = r0
            int r0 = r2.A03()
            r10.A01 = r0
        L_0x010a:
            long r0 = r10.A07
            r3 = 1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x01d9
            X.9lW r1 = r10.A0F
            byte[] r0 = r1.A02
            r13.A05(r0, r7, r7, r6)
            int r0 = r10.A00
            int r0 = r0 + 8
            r10.A00 = r0
            long r2 = r1.A0A()
        L_0x0123:
            r10.A07 = r2
        L_0x0125:
            long r4 = r10.A07
            int r1 = r10.A00
            long r2 = (long) r1
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x036f
            int r9 = r10.A01
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r0) goto L_0x0204
            r0 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r0) goto L_0x0204
            r0 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r0) goto L_0x0204
            r0 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 == r0) goto L_0x0204
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r0) goto L_0x01b4
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r0) goto L_0x01b4
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r0) goto L_0x01b4
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r0) goto L_0x01b4
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r0) goto L_0x01b4
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r9 == r0) goto L_0x01b4
            r0 = 1969517665(0x75647461, float:2.8960062E32)
            if (r9 == r0) goto L_0x01b4
            r0 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r9 == r0) goto L_0x01b4
            r0 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r9 == r0) goto L_0x01b4
            r0 = 0
            r10.A0A = r0
        L_0x01b0:
            r10.A03 = r8
            goto L_0x0000
        L_0x01b4:
            boolean r0 = X.AnonymousClass000.A1S(r1, r7)
            X.C200319h9.A02(r0)
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            boolean r0 = X.C90484aE.A1Q(r0)
            X.C200319h9.A02(r0)
            int r0 = (int) r4
            X.9lW r2 = new X.9lW
            r2.<init>((int) r0)
            r10.A0A = r2
            X.9lW r0 = r10.A0F
            byte[] r1 = r0.A02
            byte[] r0 = r2.A02
            java.lang.System.arraycopy(r1, r6, r0, r6, r7)
            goto L_0x01b0
        L_0x01d9:
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0125
            long r2 = r13.A04
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01f7
            java.util.ArrayDeque r1 = r10.A0J
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01f7
            java.lang.Object r0 = r1.peek()
            X.82h r0 = (X.C1688582h) r0
            long r2 = r0.A00
        L_0x01f7:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0125
            long r0 = r13.A02
            long r2 = r2 - r0
            int r0 = r10.A00
            long r0 = (long) r0
            long r2 = r2 + r0
            goto L_0x0123
        L_0x0204:
            long r0 = r13.A02
            long r0 = r0 + r4
            long r0 = r0 - r2
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x022a
            r2 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r9 != r2) goto L_0x022a
            X.9lW r3 = r10.A0I
            r3.A0G(r7)
            byte[] r2 = r3.A02
            r13.A03(r2, r6, r7)
            r4 = 4
            r3.A0J(r4)
            int r3 = r3.A03()
            r2 = 1751411826(0x68646c72, float:4.3148E24)
            if (r3 != r2) goto L_0x0244
            r13.A01 = r6
        L_0x022a:
            java.util.ArrayDeque r4 = r10.A0J
            int r3 = r10.A01
            X.82h r2 = new X.82h
            r2.<init>(r3, r0)
            r4.push(r2)
            long r7 = r10.A07
            int r2 = r10.A00
            long r3 = (long) r2
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0248
            r10.A00(r0)
            goto L_0x0000
        L_0x0244:
            r13.A02(r4)
            goto L_0x022a
        L_0x0248:
            r10.A03 = r6
            r10.A00 = r6
            goto L_0x0000
        L_0x024e:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0262
            if (r11 == 0) goto L_0x0262
            r0 = 10485760(0xa00000, double:5.180654E-317)
            long r23 = r23 + r0
            int r0 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x0264
        L_0x0262:
            r2 = r25
        L_0x0264:
            r10.A06 = r2
            if (r2 == r9) goto L_0x0376
            r0 = r5[r2]
            X.9OI r0 = r0.A02
            X.9uY r0 = r0.A07
            java.lang.String r1 = r0.A0S
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            r10.A0B = r0
        L_0x0278:
            X.9LB[] r0 = r10.A0D
            r6 = r0[r2]
            X.B2i r5 = r6.A01
            int r11 = r6.A00
            X.9SS r1 = r6.A03
            long[] r0 = r1.A06
            r3 = r0[r11]
            int[] r0 = r1.A05
            r2 = r0[r11]
            long r0 = r3 - r7
            int r7 = r10.A04
            long r7 = (long) r7
            long r0 = r0 + r7
            r15 = 0
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x036b
            r15 = 262144(0x40000, double:1.295163E-318)
            int r7 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x036b
            X.9OI r3 = r6.A02
            int r3 = r3.A02
            if (r3 != r12) goto L_0x02a8
            r3 = 8
            long r0 = r0 + r3
            int r2 = r2 + -8
        L_0x02a8:
            int r3 = (int) r0
            r13.A02(r3)
            X.9OI r0 = r6.A02
            int r14 = r0.A01
            r1 = 0
            if (r14 == 0) goto L_0x02fa
            X.9lW r8 = r10.A0G
            byte[] r7 = r8.A02
            r7[r1] = r1
            r7[r12] = r1
            r0 = 2
            r7[r0] = r1
            r12 = 4
            int r4 = 4 - r14
        L_0x02c1:
            int r0 = r10.A04
            if (r0 >= r2) goto L_0x034c
            int r0 = r10.A05
            if (r0 != 0) goto L_0x02e4
            r13.A05(r7, r4, r14, r1)
            int r0 = X.C202309lW.A02(r8, r1)
            if (r0 < 0) goto L_0x02f3
            r10.A05 = r0
            X.9lW r0 = r10.A0H
            r0.A0I(r1)
            r5.BpC(r0, r12)
            int r0 = r10.A04
            int r0 = r0 + 4
            r10.A04 = r0
            int r2 = r2 + r4
            goto L_0x02c1
        L_0x02e4:
            int r3 = r5.BpB(r13, r0, r1)
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            int r0 = r10.A05
            int r0 = r0 - r3
            r10.A05 = r0
            goto L_0x02c1
        L_0x02f3:
            java.lang.String r0 = "Invalid NAL length"
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x02fa:
            boolean r0 = r10.A0B
            if (r0 == 0) goto L_0x0337
            X.9lW r4 = r10.A0I
            r0 = 7
            r4.A0G(r0)
            byte[] r7 = r4.A02
            r0 = -84
            r7[r1] = r0
            r0 = 64
            r7[r12] = r0
            r0 = 2
            r7[r0] = r9
            r0 = 3
            r7[r0] = r9
            int r0 = r2 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 4
            r7[r0] = r3
            int r0 = r2 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 5
            r7[r0] = r3
            r0 = r2 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r0
            r0 = 6
            r7[r0] = r3
            int r3 = r4.A00
            r5.BpC(r4, r3)
            int r2 = r2 + r3
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            r10.A0B = r1
        L_0x0337:
            int r0 = r10.A04
            if (r0 >= r2) goto L_0x034c
            int r0 = r2 - r0
            int r3 = r5.BpB(r13, r0, r1)
            int r0 = r10.A04
            int r0 = r0 + r3
            r10.A04 = r0
            int r0 = r10.A05
            int r0 = r0 - r3
            r10.A05 = r0
            goto L_0x0337
        L_0x034c:
            X.9SS r3 = r6.A03
            long[] r0 = r3.A07
            r16 = r0[r11]
            int[] r0 = r3.A04
            r13 = r0[r11]
            r12 = 0
            r15 = 0
            r14 = r2
            r11 = r5
            r11.BpD(r12, r13, r14, r15, r16)
            int r0 = r6.A00
            int r0 = r0 + 1
            r6.A00 = r0
            r10.A06 = r9
            r10.A04 = r1
            r10.A05 = r1
            r0 = 0
            return r0
        L_0x036b:
            r14.A00 = r3
            r0 = 1
            return r0
        L_0x036f:
            java.lang.String r0 = "Atom size less than header length (unsupported)."
            X.8xn r0 = X.C187398xn.A00(r0)
            throw r0
        L_0x0376:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C209159zY.Bmm(X.9jm, X.9Bi):int");
    }

    public void BpY(long j, long j2) {
        this.A0J.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        this.A0B = false;
        if (j == 0) {
            this.A03 = 0;
            this.A00 = 0;
            return;
        }
        AnonymousClass9LB[] r6 = this.A0D;
        if (r6 != null) {
            for (AnonymousClass9LB r3 : r6) {
                AnonymousClass9SS r2 = r3.A03;
                int A032 = Util.A03(r2.A07, j2, false);
                while (true) {
                    if (A032 >= 0) {
                        if ((r2.A04[A032] & 1) != 0) {
                            break;
                        }
                        A032--;
                    } else {
                        A032 = r2.A00(j2);
                        break;
                    }
                }
                r3.A00 = A032;
            }
        }
    }

    public C209159zY(int i) {
        this.A0F = new C202309lW(16);
        this.A0J = new ArrayDeque();
        this.A0H = new C202309lW(C190949Ay.A02);
        this.A0G = new C202309lW(4);
        this.A0I = new C202309lW();
        this.A06 = -1;
    }

    public long BBK() {
        return this.A08;
    }

    public void BKL(C209379zu r1) {
        this.A09 = r1;
    }

    public C209159zY() {
        this(0);
    }
}
