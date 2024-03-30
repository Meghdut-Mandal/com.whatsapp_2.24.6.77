package X;

import android.os.SystemClock;
import android.text.TextUtils;

/* renamed from: X.6Wa  reason: invalid class name and case insensitive filesystem */
public class C132976Wa {
    public int A00 = 0;
    public int A01 = 1;
    public int A02 = 0;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public C132466Tv A06;
    public C125105zK A07;
    public Boolean A08;
    public Integer A09;
    public Integer A0A = null;
    public Integer A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F = false;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final long A0J;
    public final C124935z2 A0K;
    public final AnonymousClass1DE A0L;
    public final boolean A0M;
    public final C19970wo A0N;
    public final C19770wU A0O;

    public synchronized int A03() {
        return this.A02;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0220 A[Catch:{ URISyntaxException -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024a A[Catch:{ URISyntaxException -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x029b A[Catch:{ URISyntaxException -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bc A[Catch:{ URISyntaxException -> 0x01e4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d3 A[Catch:{ URISyntaxException -> 0x01e4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.AnonymousClass590 A04(X.C20810yC r14, int r15, int r16) {
        /*
            r13 = this;
            monitor-enter(r13)
            X.590 r5 = new X.590     // Catch:{ all -> 0x030b }
            r5.<init>()     // Catch:{ all -> 0x030b }
            java.lang.Integer r4 = A00(r13, r15)     // Catch:{ all -> 0x030b }
            java.lang.Integer r8 = r13.A05(r15)     // Catch:{ all -> 0x030b }
            r6 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x030b }
            r5.A02 = r0     // Catch:{ all -> 0x030b }
            int r0 = r13.A00     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x030b }
            r5.A0N = r0     // Catch:{ all -> 0x030b }
            long r2 = r13.A03     // Catch:{ all -> 0x030b }
            long r0 = r13.A0J     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.C90504aG.A0h(r2, r0)     // Catch:{ all -> 0x030b }
            boolean r2 = r13.A0G     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r2)     // Catch:{ all -> 0x030b }
            r5.A0c = r0     // Catch:{ all -> 0x030b }
            X.5z2 r7 = r13.A0K     // Catch:{ all -> 0x030b }
            long r0 = r7.A07     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r2)     // Catch:{ all -> 0x030b }
            r5.A0X = r0     // Catch:{ all -> 0x030b }
            int r0 = r7.A03     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.C36441kJ.A0y(r0)     // Catch:{ all -> 0x030b }
            r5.A0V = r0     // Catch:{ all -> 0x030b }
            int r2 = r13.A02     // Catch:{ all -> 0x030b }
            int r1 = r7.A0B     // Catch:{ all -> 0x030b }
            r0 = 2
            if (r1 != r0) goto L_0x004c
            r1 = 7
            goto L_0x005b
        L_0x004c:
            if (r2 == 0) goto L_0x005a
            if (r2 == r0) goto L_0x005a
            r0 = 3
            r1 = 5
            if (r2 == r0) goto L_0x005b
            r0 = 4
            if (r2 != r0) goto L_0x0084
            r1 = 8
            goto L_0x005b
        L_0x005a:
            r1 = 1
        L_0x005b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x030b }
            r5.A0H = r0     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = r13.A09     // Catch:{ all -> 0x030b }
            r5.A0F = r0     // Catch:{ all -> 0x030b }
            boolean r0 = r13.A0M     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A04 = r0     // Catch:{ all -> 0x030b }
            int r1 = r7.A00     // Catch:{ all -> 0x030b }
            if (r1 == 0) goto L_0x008b
            r0 = 1
            if (r1 == r6) goto L_0x0092
            r0 = 2
            if (r1 == r0) goto L_0x0092
            r0 = 3
            if (r1 == r0) goto L_0x0092
            r0 = 4
            if (r1 == r0) goto L_0x0092
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x030b }
            goto L_0x008a
        L_0x0084:
            java.lang.String r0 = "Unreachable code"
            java.lang.AssertionError r0 = X.C90524aI.A0Y(r0)     // Catch:{ all -> 0x030b }
        L_0x008a:
            throw r0     // Catch:{ all -> 0x030b }
        L_0x008b:
            java.lang.String r0 = "mediajobeventbuilder/key reuse type not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x030b }
            r0 = 0
            goto L_0x0096
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x030b }
        L_0x0096:
            r5.A0E = r0     // Catch:{ all -> 0x030b }
            r5.A0G = r8     // Catch:{ all -> 0x030b }
            boolean r0 = r13.A0E     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A03 = r0     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x030b }
            r5.A0I = r0     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = r13.A08     // Catch:{ all -> 0x030b }
            r5.A01 = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r13.A0C     // Catch:{ all -> 0x030b }
            r5.A0p = r0     // Catch:{ all -> 0x030b }
            int r0 = r13.A01     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0L = r0     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = r13.A0A     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x00be
            r5.A0K = r0     // Catch:{ all -> 0x030b }
        L_0x00be:
            if (r14 == 0) goto L_0x00d4
            r0 = 4468(0x1174, float:6.261E-42)
            boolean r0 = r14.A0E(r0)     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x00d4
            boolean r1 = r13.A0F     // Catch:{ all -> 0x030b }
            r0 = 0
            if (r1 == 0) goto L_0x00ce
            r0 = 3
        L_0x00ce:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0M = r0     // Catch:{ all -> 0x030b }
        L_0x00d4:
            long r0 = r13.A04     // Catch:{ all -> 0x030b }
            r9 = -1
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L_0x00f8
            long r0 = r7.A08     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            boolean r9 = r13.A0G     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r9)     // Catch:{ all -> 0x030b }
            r5.A0Y = r0     // Catch:{ all -> 0x030b }
            long r2 = r13.A03     // Catch:{ all -> 0x030b }
            long r0 = r13.A04     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.C90504aG.A0h(r2, r0)     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r9)     // Catch:{ all -> 0x030b }
            r5.A0e = r0     // Catch:{ all -> 0x030b }
        L_0x00f8:
            X.6Tv r2 = r13.A06     // Catch:{ all -> 0x030b }
            if (r2 == 0) goto L_0x0133
            X.58x r0 = r2.A02     // Catch:{ all -> 0x030b }
            java.lang.Long r1 = r0.A0b     // Catch:{ all -> 0x030b }
            boolean r0 = r13.A0G     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r1, r0)     // Catch:{ all -> 0x030b }
            r5.A0d = r0     // Catch:{ all -> 0x030b }
            X.58x r1 = r2.A02     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r1.A0U     // Catch:{ all -> 0x030b }
            r5.A0U = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r2 = r1.A0I     // Catch:{ all -> 0x030b }
            java.lang.Long r1 = r1.A0K     // Catch:{ all -> 0x030b }
            android.util.Pair r0 = new android.util.Pair     // Catch:{ all -> 0x030b }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x030b }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r1)     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x0133
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r1)     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x030b }
            r5.A0O = r0     // Catch:{ all -> 0x030b }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r1)     // Catch:{ all -> 0x030b }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x030b }
            r5.A0P = r0     // Catch:{ all -> 0x030b }
        L_0x0133:
            X.5zK r10 = r13.A07     // Catch:{ all -> 0x030b }
            if (r10 == 0) goto L_0x02b1
            java.lang.Boolean r0 = r10.A04     // Catch:{ all -> 0x030b }
            r9 = 0
            if (r0 == 0) goto L_0x0148
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x0145
            r0 = 4
            goto L_0x014a
        L_0x0145:
            r0 = 3
            goto L_0x014a
        L_0x0148:
            r0 = r9
            goto L_0x014e
        L_0x014a:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
        L_0x014e:
            r5.A0Z = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r10.A0C     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x01d8
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x030b }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x030b }
        L_0x015c:
            r5.A09 = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r5.A0O     // Catch:{ all -> 0x030b }
            if (r0 != 0) goto L_0x016a
            java.lang.Long r0 = r10.A0B     // Catch:{ all -> 0x030b }
            r5.A0O = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r10.A0D     // Catch:{ all -> 0x030b }
            r5.A0P = r0     // Catch:{ all -> 0x030b }
        L_0x016a:
            java.lang.Long r0 = r10.A0G     // Catch:{ all -> 0x030b }
            r5.A0b = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r3 = r10.A09     // Catch:{ all -> 0x030b }
            if (r3 == 0) goto L_0x01d6
            long r11 = r3.longValue()     // Catch:{ all -> 0x030b }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01d6
        L_0x017c:
            boolean r12 = r13.A0G     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r3, r12)     // Catch:{ all -> 0x030b }
            r5.A0i = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r1 = r10.A0F     // Catch:{ all -> 0x030b }
            if (r1 == 0) goto L_0x01d4
            java.lang.Long r0 = r10.A0E     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x01d4
            long r2 = r0.longValue()     // Catch:{ all -> 0x030b }
            long r0 = r1.longValue()     // Catch:{ all -> 0x030b }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x01d4
            java.lang.Long r0 = X.C90504aG.A0h(r2, r0)     // Catch:{ all -> 0x030b }
        L_0x019c:
            java.lang.Long r0 = X.AnonymousClass6UH.A03(r0, r12)     // Catch:{ all -> 0x030b }
            r5.A0k = r0     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = r10.A02     // Catch:{ all -> 0x030b }
            r5.A06 = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r10.A0A     // Catch:{ all -> 0x030b }
            r5.A0j = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = A01(r0)     // Catch:{ all -> 0x030b }
            r5.A0C = r0     // Catch:{ all -> 0x030b }
            X.5zK r2 = r13.A07     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x030b }
            r5.A07 = r0     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r2.A08     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x01c4
            double r0 = r0.doubleValue()     // Catch:{ all -> 0x030b }
            java.lang.Double r9 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x030b }
        L_0x01c4:
            r5.A0A = r9     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r2.A0M     // Catch:{ all -> 0x030b }
            r5.A0n = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r2.A0K     // Catch:{ all -> 0x030b }
            r5.A0m = r0     // Catch:{ all -> 0x030b }
            java.lang.String r1 = r2.A0N     // Catch:{ all -> 0x030b }
            r2 = 0
            if (r1 == 0) goto L_0x01ea
            goto L_0x01da
        L_0x01d4:
            r0 = 0
            goto L_0x019c
        L_0x01d6:
            r3 = 0
            goto L_0x017c
        L_0x01d8:
            r0 = r9
            goto L_0x015c
        L_0x01da:
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x01e4 }
            r0.<init>(r1)     // Catch:{ URISyntaxException -> 0x01e4 }
            java.lang.String r2 = r0.getHost()     // Catch:{ URISyntaxException -> 0x01e4 }
            goto L_0x01ea
        L_0x01e4:
            r1 = move-exception
            java.lang.String r0 = "MediaJobEventBuilder/getDomainName syntax exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x030b }
        L_0x01ea:
            r5.A0r = r2     // Catch:{ all -> 0x030b }
            X.5zK r3 = r13.A07     // Catch:{ all -> 0x030b }
            java.lang.Long r11 = r3.A0H     // Catch:{ all -> 0x030b }
            if (r11 == 0) goto L_0x020b
            long r9 = r11.longValue()     // Catch:{ all -> 0x030b }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x020b
        L_0x01fc:
            r5.A0W = r11     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = r3.A07     // Catch:{ all -> 0x030b }
            r5.A0D = r0     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = r3.A06     // Catch:{ all -> 0x030b }
            r5.A0B = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r3.A0J     // Catch:{ all -> 0x030b }
            r5.A0q = r0     // Catch:{ all -> 0x030b }
            goto L_0x020d
        L_0x020b:
            r11 = 0
            goto L_0x01fc
        L_0x020d:
            r2 = 3
            if (r4 == 0) goto L_0x0218
            int r0 = r4.intValue()     // Catch:{ all -> 0x030b }
            if (r0 == r6) goto L_0x021c
            if (r0 == r2) goto L_0x021c
        L_0x0218:
            java.lang.String r0 = r3.A0N     // Catch:{ all -> 0x030b }
            r5.A0o = r0     // Catch:{ all -> 0x030b }
        L_0x021c:
            X.5wM r3 = r3.A00     // Catch:{ all -> 0x030b }
            if (r3 == 0) goto L_0x0244
            long r0 = r3.A00     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0Q = r0     // Catch:{ all -> 0x030b }
            long r0 = r3.A02     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0S = r0     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = r3.A03     // Catch:{ all -> 0x030b }
            r5.A00 = r0     // Catch:{ all -> 0x030b }
            long r0 = r3.A01     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0R = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = A01(r0)     // Catch:{ all -> 0x030b }
            r5.A0C = r0     // Catch:{ all -> 0x030b }
        L_0x0244:
            X.5zK r0 = r13.A07     // Catch:{ all -> 0x030b }
            X.5ta r1 = r0.A01     // Catch:{ all -> 0x030b }
            if (r1 == 0) goto L_0x0295
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x030b }
            r5.A0l = r0     // Catch:{ all -> 0x030b }
            if (r4 == 0) goto L_0x026d
            int r0 = r4.intValue()     // Catch:{ all -> 0x030b }
            if (r0 != r6) goto L_0x026d
            java.lang.Integer r0 = r1.A01     // Catch:{ all -> 0x030b }
            if (r0 != 0) goto L_0x0263
            java.lang.String r0 = "ResumeCheckStat result is not set"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = X.C36361kB.A0j()     // Catch:{ all -> 0x030b }
        L_0x0263:
            int r0 = r0.intValue()     // Catch:{ all -> 0x030b }
            if (r0 != r2) goto L_0x026d
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x030b }
        L_0x026d:
            X.5wM r2 = r1.A00     // Catch:{ all -> 0x030b }
            if (r2 == 0) goto L_0x0295
            long r0 = r2.A00     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0f = r0     // Catch:{ all -> 0x030b }
            long r0 = r2.A02     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0h = r0     // Catch:{ all -> 0x030b }
            java.lang.Boolean r0 = r2.A03     // Catch:{ all -> 0x030b }
            r5.A05 = r0     // Catch:{ all -> 0x030b }
            long r0 = r2.A01     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0g = r0     // Catch:{ all -> 0x030b }
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x030b }
            java.lang.Integer r0 = A01(r0)     // Catch:{ all -> 0x030b }
            r5.A0C = r0     // Catch:{ all -> 0x030b }
        L_0x0295:
            X.5zK r0 = r13.A07     // Catch:{ all -> 0x030b }
            java.lang.Float r1 = r0.A05     // Catch:{ all -> 0x030b }
            if (r1 == 0) goto L_0x02b1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.floatValue()     // Catch:{ all -> 0x030b }
            float r1 = X.C90494aF.A01(r0, r2)     // Catch:{ all -> 0x030b }
            r0 = 1
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02b1
            double r0 = (double) r2     // Catch:{ all -> 0x030b }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A08 = r0     // Catch:{ all -> 0x030b }
        L_0x02b1:
            java.lang.String r0 = r7.A0D     // Catch:{ all -> 0x030b }
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x030b }
            long r2 = r0.getMostSignificantBits()     // Catch:{ all -> 0x030b }
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r2 = r2 & r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x030b }
            r5.A0T = r0     // Catch:{ all -> 0x030b }
            X.6Tv r0 = r13.A06     // Catch:{ all -> 0x030b }
            r2 = 0
            if (r0 == 0) goto L_0x02df
            X.58x r0 = r0.A02     // Catch:{ all -> 0x030b }
            java.lang.Long r0 = r0.A0P     // Catch:{ all -> 0x030b }
            if (r0 == 0) goto L_0x02df
            long r0 = r0.longValue()     // Catch:{ all -> 0x030b }
        L_0x02d7:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030b }
            r5.A0a = r0     // Catch:{ all -> 0x030b }
            goto L_0x02e2
        L_0x02df:
            r0 = 0
            goto L_0x02d7
        L_0x02e2:
            if (r4 == 0) goto L_0x02fa
            int r1 = r4.intValue()     // Catch:{ all -> 0x030b }
            r0 = 12
            if (r1 != r0) goto L_0x02fa
            if (r8 == 0) goto L_0x02fa
            int r0 = r8.intValue()     // Catch:{ all -> 0x030b }
            if (r0 != r6) goto L_0x02fa
            r0 = 30
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x030b }
        L_0x02fa:
            r5.A0J = r4     // Catch:{ all -> 0x030b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x030b }
            java.lang.String r0 = "MediaJobEventBuilder/postWamMediaUpload2Event "
            java.lang.String r0 = X.C90494aF.A0c(r5, r0, r1)     // Catch:{ all -> 0x030b }
            X.C36321k7.A1a(r1, r0)     // Catch:{ all -> 0x030b }
            monitor-exit(r13)
            return r5
        L_0x030b:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132976Wa.A04(X.0yC, int, int):X.590");
    }

    public synchronized void A06() {
        if (!this.A0I) {
            this.A0B = C36381kD.A0m();
        } else {
            this.A0B = C36361kB.A0i();
        }
    }

    public synchronized void A07() {
        this.A04 = SystemClock.uptimeMillis();
        this.A05 = C19970wo.A00(this.A0N);
    }

    public synchronized void A08(int i) {
        this.A02 = i;
    }

    public synchronized void A09(int i, int i2, boolean z) {
        synchronized (this) {
            this.A09 = Integer.valueOf(AnonymousClass6UH.A01(i, i2, z));
            this.A0G = z;
        }
    }

    public synchronized void A0A(C132466Tv r2) {
        this.A06 = r2;
    }

    public synchronized void A0B(C125105zK r2) {
        this.A07 = r2;
    }

    public static Integer A00(C132976Wa r0, int i) {
        int i2;
        if (r0.A07 == null && i == 0) {
            return null;
        }
        switch (i) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 12;
                break;
            case 2:
                i2 = 10;
                break;
            case 3:
                i2 = 7;
                break;
            case 4:
                i2 = 6;
                break;
            case 5:
                i2 = 9;
                break;
            case 6:
                i2 = 8;
                break;
            case 7:
                i2 = 11;
                break;
            case 8:
                i2 = 13;
                break;
            case 9:
                i2 = 4;
                break;
            case 10:
                i2 = 14;
                break;
            case 11:
                i2 = 15;
                break;
            case 12:
                i2 = 16;
                break;
            case 13:
                i2 = 17;
                break;
            case 14:
            case 32:
                i2 = 30;
                break;
            case 15:
                i2 = 19;
                break;
            case 16:
                i2 = 38;
                break;
            case 17:
                i2 = 5;
                break;
            case 18:
                i2 = 20;
                break;
            case 19:
                i2 = 41;
                break;
            case 20:
                i2 = 29;
                break;
            case 21:
                i2 = 35;
                break;
            case 22:
                i2 = 18;
                break;
            case 23:
                i2 = 40;
                break;
            case 24:
                i2 = 32;
                break;
            case 25:
                i2 = 21;
                break;
            case 26:
                i2 = 39;
                break;
            case 27:
                i2 = 26;
                break;
            case 28:
                i2 = 27;
                break;
            case 29:
                i2 = 28;
                break;
            case 33:
                i2 = 31;
                break;
            case 34:
                i2 = 33;
                break;
            case 35:
                i2 = 34;
                break;
            case 36:
                i2 = 36;
                break;
            case 37:
                i2 = 37;
                break;
            default:
                i2 = 2;
                break;
        }
        return Integer.valueOf(i2);
    }

    public static void A02(C132976Wa r8) {
        C124935z2 r7 = r8.A0K;
        long j = r8.A03;
        r7.A07 += j - r8.A0J;
        long j2 = r8.A04;
        if (j2 != -1) {
            r7.A08 += j - j2;
        }
        C1503074t.A00(r8.A0O, r8, 24);
    }

    public C132976Wa(C19970wo r3, C124935z2 r4, AnonymousClass1DE r5, C19770wU r6, boolean z) {
        this.A0N = r3;
        this.A0O = r6;
        this.A0L = r5;
        this.A0K = r4;
        this.A0M = z;
        this.A0J = SystemClock.uptimeMillis();
    }

    public static Integer A01(String str) {
        int i;
        if (!TextUtils.isEmpty(str)) {
            if ("h3".equalsIgnoreCase(str)) {
                i = 2;
            } else if ("h2".equalsIgnoreCase(str)) {
                i = 1;
            } else if ("http/1.1".equalsIgnoreCase(str)) {
                i = 0;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public Integer A05(int i) {
        Integer valueOf = Integer.valueOf(i);
        C18740tg.A06(valueOf);
        if (valueOf.intValue() == 14) {
            return C36371kC.A0o();
        }
        if (!this.A0D) {
            return 0;
        }
        if (C1901797e.A00(this.A0B, 0)) {
            return 0;
        }
        return this.A0B;
    }
}
