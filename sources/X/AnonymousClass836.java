package X;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* renamed from: X.836  reason: invalid class name */
public final class AnonymousClass836 extends C1688382f {
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*");
    public final StringBuilder A00 = AnonymousClass000.A0u();
    public final ArrayList A01 = AnonymousClass001.A0I();

    public AnonymousClass836() {
        super("SubripDecoder");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0108, code lost:
        switch(r14) {
            case -685620710: goto L_0x013a;
            case -685620679: goto L_0x013f;
            case -685620648: goto L_0x0135;
            case -685620524: goto L_0x0149;
            case -685620493: goto L_0x014e;
            case -685620462: goto L_0x0130;
            default: goto L_0x010b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010b, code lost:
        r19 = 1;
        r16 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010f, code lost:
        if (r1 == 0) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        r17 = 0.5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0114, code lost:
        if (r1 == 1) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        r17 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0119, code lost:
        r14 = new X.AnonymousClass6TI(r15, r16, r17, 0, r19, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        r17 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0130, code lost:
        r0 = r13.equals("{\\an9}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0135, code lost:
        r0 = r13.equals("{\\an3}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        r0 = r13.equals("{\\an1}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x013f, code lost:
        r0 = r13.equals("{\\an2}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0143, code lost:
        r19 = 2;
        r16 = 0.92f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0149, code lost:
        r0 = r13.equals("{\\an7}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        r0 = r13.equals("{\\an8}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0152, code lost:
        r19 = 0;
        r16 = 0.08f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0157, code lost:
        if (r0 != false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0172, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0178, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0179, code lost:
        if (r0 != false) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.B2l A06(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            java.lang.String r6 = "SubripDecoder"
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r4 = 0
            r0 = 32
            long[] r3 = new long[r0]
            X.9lW r2 = new X.9lW
            r1 = r22
            r0 = r23
            r2.<init>(r1, r0)
        L_0x0014:
            java.lang.String r7 = r2.A0C()
            if (r7 == 0) goto L_0x003d
            int r0 = r7.length()
            if (r0 == 0) goto L_0x0014
            java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0024 }
            goto L_0x0032
        L_0x0024:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skipping invalid index: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)
            android.util.Log.w(r6, r0)
            goto L_0x0014
        L_0x0032:
            java.lang.String r7 = r2.A0C()
            if (r7 != 0) goto L_0x0050
            java.lang.String r0 = "Unexpected end"
            android.util.Log.w(r6, r0)
        L_0x003d:
            int r0 = r5.size()
            X.6TI[] r2 = new X.AnonymousClass6TI[r0]
            r5.toArray(r2)
            long[] r1 = java.util.Arrays.copyOf(r3, r4)
            X.A07 r0 = new X.A07
            r0.<init>(r1, r2)
            return r0
        L_0x0050:
            java.util.regex.Pattern r0 = A03
            java.util.regex.Matcher r9 = r0.matcher(r7)
            boolean r0 = r9.matches()
            if (r0 == 0) goto L_0x0186
            r0 = 1
            long r7 = X.C1688382f.A00(r9, r0)
            int r0 = r3.length
            if (r4 != r0) goto L_0x006a
            int r0 = r4 * 2
            long[] r3 = java.util.Arrays.copyOf(r3, r0)
        L_0x006a:
            int r1 = r4 + 1
            r3[r4] = r7
            r0 = 6
            long r7 = X.C1688382f.A00(r9, r0)
            int r0 = r3.length
            if (r1 != r0) goto L_0x007c
            int r0 = r1 * 2
            long[] r3 = java.util.Arrays.copyOf(r3, r0)
        L_0x007c:
            int r4 = r1 + 1
            r3[r1] = r7
            r0 = r21
            java.lang.StringBuilder r13 = r0.A00
            r9 = 0
            r13.setLength(r9)
            java.util.ArrayList r8 = r0.A01
            r8.clear()
        L_0x008d:
            java.lang.String r1 = r2.A0C()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00d4
            int r0 = r13.length()
            if (r0 <= 0) goto L_0x00a2
            java.lang.String r0 = "<br>"
            r13.append(r0)
        L_0x00a2:
            java.lang.String r1 = r1.trim()
            java.lang.StringBuilder r12 = X.C90524aI.A0i(r1)
            java.util.regex.Pattern r0 = A02
            java.util.regex.Matcher r14 = r0.matcher(r1)
            r11 = 0
        L_0x00b1:
            boolean r0 = r14.find()
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r14.group()
            r8.add(r0)
            int r10 = r14.start()
            int r10 = r10 - r11
            int r7 = r0.length()
            int r1 = r10 + r7
            java.lang.String r0 = ""
            r12.replace(r10, r1, r0)
            int r11 = r11 + r7
            goto L_0x00b1
        L_0x00d0:
            X.C36351kA.A1K(r12, r13)
            goto L_0x008d
        L_0x00d4:
            java.lang.String r0 = r13.toString()
            android.text.Spanned r15 = android.text.Html.fromHtml(r0)
        L_0x00dc:
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x0180
            java.lang.Object r13 = r8.get(r9)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r0 = "\\{\\\\an[1-9]\\}"
            boolean r0 = r13.matches(r0)
            if (r0 == 0) goto L_0x017c
            int r14 = r13.hashCode()
            java.lang.String r12 = "{\\an9}"
            java.lang.String r11 = "{\\an8}"
            java.lang.String r10 = "{\\an7}"
            java.lang.String r1 = "{\\an6}"
            java.lang.String r0 = "{\\an4}"
            java.lang.String r9 = "{\\an3}"
            java.lang.String r8 = "{\\an2}"
            java.lang.String r7 = "{\\an1}"
            switch(r14) {
                case -685620710: goto L_0x0164;
                case -685620648: goto L_0x0169;
                case -685620617: goto L_0x016e;
                case -685620555: goto L_0x0174;
                case -685620524: goto L_0x015f;
                case -685620462: goto L_0x015a;
                default: goto L_0x0107;
            }
        L_0x0107:
            r1 = 1
        L_0x0108:
            switch(r14) {
                case -685620710: goto L_0x013a;
                case -685620679: goto L_0x013f;
                case -685620648: goto L_0x0135;
                case -685620524: goto L_0x0149;
                case -685620493: goto L_0x014e;
                case -685620462: goto L_0x0130;
                default: goto L_0x010b;
            }
        L_0x010b:
            r19 = 1
            r16 = 1056964608(0x3f000000, float:0.5)
        L_0x010f:
            if (r1 == 0) goto L_0x012c
            r0 = 1
            r17 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x0119
            r17 = 1064011039(0x3f6b851f, float:0.92)
        L_0x0119:
            r18 = 0
            X.6TI r14 = new X.6TI
            r20 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x0122:
            r5.add(r14)
            X.6TI r0 = X.AnonymousClass6TI.A07
            r5.add(r0)
            goto L_0x0014
        L_0x012c:
            r17 = 1034147594(0x3da3d70a, float:0.08)
            goto L_0x0119
        L_0x0130:
            boolean r0 = r13.equals(r12)
            goto L_0x0152
        L_0x0135:
            boolean r0 = r13.equals(r9)
            goto L_0x0143
        L_0x013a:
            boolean r0 = r13.equals(r7)
            goto L_0x0143
        L_0x013f:
            boolean r0 = r13.equals(r8)
        L_0x0143:
            r19 = 2
            r16 = 1064011039(0x3f6b851f, float:0.92)
            goto L_0x0157
        L_0x0149:
            boolean r0 = r13.equals(r10)
            goto L_0x0152
        L_0x014e:
            boolean r0 = r13.equals(r11)
        L_0x0152:
            r19 = 0
            r16 = 1034147594(0x3da3d70a, float:0.08)
        L_0x0157:
            if (r0 != 0) goto L_0x010f
            goto L_0x010b
        L_0x015a:
            boolean r0 = r13.equals(r12)
            goto L_0x0178
        L_0x015f:
            boolean r0 = r13.equals(r10)
            goto L_0x0172
        L_0x0164:
            boolean r0 = r13.equals(r7)
            goto L_0x0172
        L_0x0169:
            boolean r0 = r13.equals(r9)
            goto L_0x0178
        L_0x016e:
            boolean r0 = r13.equals(r0)
        L_0x0172:
            r1 = 0
            goto L_0x0179
        L_0x0174:
            boolean r0 = r13.equals(r1)
        L_0x0178:
            r1 = 2
        L_0x0179:
            if (r0 != 0) goto L_0x0108
            goto L_0x0107
        L_0x017c:
            int r9 = r9 + 1
            goto L_0x00dc
        L_0x0180:
            X.6TI r14 = new X.6TI
            r14.<init>(r15)
            goto L_0x0122
        L_0x0186:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Skipping invalid timing: "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r7, r1)
            android.util.Log.w(r6, r0)
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass836.A06(byte[], int, boolean):X.B2l");
    }
}
