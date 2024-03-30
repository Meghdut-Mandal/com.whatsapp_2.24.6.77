package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9nt  reason: invalid class name and case insensitive filesystem */
public class C203389nt {
    public C187728yR A00;
    public Integer A01;
    public boolean A02;

    public static int A00(AnonymousClass825 r4, List list, int i) {
        int i2 = 0;
        if (i >= 0) {
            Object obj = list.get(i);
            B0V b0v = r4.A00;
            if (obj == b0v) {
                for (Object obj2 : b0v.B9f()) {
                    if (obj2 != r4) {
                        i2++;
                    }
                }
            }
            return -1;
        }
        return i2;
    }

    public static boolean A05(C1890892a r9, AnonymousClass9QC r10, List list, int i, int i2) {
        AnonymousClass9QC r6 = r10;
        int i3 = i2;
        AnonymousClass9UK r1 = (AnonymousClass9UK) r6.A01.get(i);
        List list2 = list;
        AnonymousClass825 r4 = (AnonymousClass825) list.get(i2);
        C1890892a r5 = r9;
        if (A06(r9, r1, r4)) {
            Integer num = r1.A00;
            if (num == C023109s.A00) {
                if (i == 0) {
                    return true;
                }
                while (i3 > 0) {
                    i3--;
                    if (A05(r9, r6, list, i - 1, i3)) {
                        return true;
                    }
                }
            } else if (num == C023109s.A01) {
                return A05(r9, r6, list, i - 1, i2 - 1);
            } else {
                int A002 = A00(r4, list, i2);
                if (A002 > 0) {
                    return A04(r5, r6, (AnonymousClass825) r4.A00.B9f().get(A002 - 1), list2, i - 1, i3);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02a1, code lost:
        r11.A02 = true;
        r3.A01(A01(r10, r11));
        r11.A02 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0131, code lost:
        if (r7.toString() != null) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0157, code lost:
        if (r10.A0G(")") == false) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01e5 A[Catch:{ 91R -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0291 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass9V9 A01(X.AnonymousClass82B r10, X.C203389nt r11) {
        /*
            X.9V9 r3 = new X.9V9
            r3.<init>()
        L_0x0005:
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = "<!--"
            boolean r0 = r10.A0G(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0005
            java.lang.String r0 = "-->"
            boolean r0 = r10.A0G(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0005
            r0 = 64
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x01ba
            java.lang.String r4 = r10.A0I()     // Catch:{ 91R -> 0x02c9 }
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            if (r4 == 0) goto L_0x01b1
            boolean r0 = r11.A02     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r2 = "Invalid @media rule: expected '}' at end of rule set"
            r6 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "media"
            boolean r0 = r4.equals(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0075
            java.util.ArrayList r1 = A02(r10)     // Catch:{ 91R -> 0x02c9 }
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x006c
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            X.8yR r5 = r11.A00     // Catch:{ 91R -> 0x02c9 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ 91R -> 0x02c9 }
        L_0x0055:
            boolean r0 = r4.hasNext()     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0067
            java.lang.Object r1 = r4.next()     // Catch:{ 91R -> 0x02c9 }
            X.8yR r0 = X.C187728yR.all     // Catch:{ 91R -> 0x02c9 }
            if (r1 == r0) goto L_0x02a1
            if (r1 != r5) goto L_0x0055
            goto L_0x02a1
        L_0x0067:
            A01(r10, r11)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02ac
        L_0x006c:
            java.lang.String r0 = "Invalid @media rule: missing rule set"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0075:
            java.lang.String r0 = "import"
            boolean r0 = r4.equals(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0178
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0135
            int r8 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r0 = "url("
            boolean r0 = r10.A0G(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0135
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r0 = r10.A0H()     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0144
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ 91R -> 0x02c9 }
        L_0x009e:
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            java.lang.String r9 = r10.A03     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            char r4 = r9.charAt(r0)     // Catch:{ 91R -> 0x02c9 }
            r0 = 39
            if (r4 == r0) goto L_0x0127
            r0 = 34
            if (r4 == r0) goto L_0x0127
            r0 = 40
            if (r4 == r0) goto L_0x0127
            r0 = 41
            if (r4 == r0) goto L_0x0127
            boolean r0 = X.C200249gy.A02(r4)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            boolean r0 = java.lang.Character.isISOControl(r4)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0127
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r1 = r0 + 1
            r10.A01 = r1     // Catch:{ 91R -> 0x02c9 }
            r0 = 92
            if (r4 != r0) goto L_0x0121
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x009e
            int r0 = r1 + 1
            r10.A01 = r0     // Catch:{ 91R -> 0x02c9 }
            char r4 = r9.charAt(r1)     // Catch:{ 91R -> 0x02c9 }
            r0 = 10
            if (r4 == r0) goto L_0x009e
            r0 = 13
            if (r4 == r0) goto L_0x009e
            r0 = 12
            if (r4 == r0) goto L_0x009e
            int r1 = X.AnonymousClass82B.A00(r4)     // Catch:{ 91R -> 0x02c9 }
            r6 = -1
            if (r1 == r6) goto L_0x0121
            r5 = 1
        L_0x00fa:
            int r4 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r4, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x011f
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            char r0 = r9.charAt(r0)     // Catch:{ 91R -> 0x02c9 }
            int r4 = X.AnonymousClass82B.A00(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r4 == r6) goto L_0x011f
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r0 + 1
            r10.A01 = r0     // Catch:{ 91R -> 0x02c9 }
            int r1 = r1 * 16
            int r1 = r1 + r4
            int r5 = r5 + 1
            r0 = 5
            if (r5 > r0) goto L_0x011f
            goto L_0x00fa
        L_0x011f:
            char r0 = (char) r1     // Catch:{ 91R -> 0x02c9 }
            goto L_0x0122
        L_0x0121:
            char r0 = (char) r4     // Catch:{ 91R -> 0x02c9 }
        L_0x0122:
            r7.append(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x009e
        L_0x0127:
            int r0 = r7.length()     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0133
            java.lang.String r0 = r7.toString()     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0144
        L_0x0133:
            r10.A01 = r8     // Catch:{ 91R -> 0x02c9 }
        L_0x0135:
            java.lang.String r0 = r10.A0H()     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = "Invalid @import rule: expected string or url()"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0144:
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0159
            java.lang.String r0 = ")"
            boolean r0 = r10.A0G(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0133
        L_0x0159:
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            A02(r10)     // Catch:{ 91R -> 0x02c9 }
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            r0 = 59
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r2)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0178:
            java.lang.Object[] r1 = new java.lang.Object[r7]     // Catch:{ 91R -> 0x02c9 }
            r1[r6] = r4     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r0 = "Ignoring @%s rule"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r0 = "CSSParser"
            android.util.Log.w(r0, r1)     // Catch:{ 91R -> 0x02c9 }
            r2 = 0
        L_0x0188:
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            java.lang.Integer r0 = r10.A09()     // Catch:{ 91R -> 0x02c9 }
            int r1 = r0.intValue()     // Catch:{ 91R -> 0x02c9 }
            r0 = 59
            if (r1 == r0) goto L_0x01ad
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 != r0) goto L_0x01a5
            int r2 = r2 + 1
            goto L_0x0188
        L_0x01a5:
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 != r0) goto L_0x0188
            if (r2 <= 0) goto L_0x0188
            int r2 = r2 + -1
        L_0x01ad:
            if (r2 != 0) goto L_0x0188
            goto L_0x02c4
        L_0x01b1:
            java.lang.String r0 = "Invalid '@' rule"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x01ba:
            java.util.ArrayList r8 = X.AnonymousClass82B.A01(r10)     // Catch:{ 91R -> 0x02c9 }
            if (r8 == 0) goto L_0x02d9
            boolean r0 = r8.isEmpty()     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02d9
            r0 = 123(0x7b, float:1.72E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0299
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            X.AUW r5 = new X.AUW     // Catch:{ 91R -> 0x02c9 }
            r5.<init>()     // Catch:{ 91R -> 0x02c9 }
        L_0x01d6:
            java.lang.String r2 = r10.A0I()     // Catch:{ 91R -> 0x02c9 }
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            r0 = 58
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0291
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0289
            int r4 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            r6 = r4
            java.lang.String r1 = r10.A03     // Catch:{ 91R -> 0x02c9 }
            char r7 = r1.charAt(r4)     // Catch:{ 91R -> 0x02c9 }
        L_0x01fb:
            r0 = -1
            if (r7 == r0) goto L_0x0221
            r0 = 59
            if (r7 == r0) goto L_0x0221
            r0 = 125(0x7d, float:1.75E-43)
            if (r7 == r0) goto L_0x0221
            r0 = 33
            if (r7 == r0) goto L_0x0221
            r0 = 10
            if (r7 == r0) goto L_0x0221
            r0 = 13
            if (r7 == r0) goto L_0x0221
            boolean r0 = X.C200249gy.A02(r7)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x021c
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r6 = r0 + 1
        L_0x021c:
            int r7 = r10.A06()     // Catch:{ 91R -> 0x02c9 }
            goto L_0x01fb
        L_0x0221:
            int r0 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            if (r0 <= r4) goto L_0x0287
            java.lang.String r1 = r1.substring(r4, r6)     // Catch:{ 91R -> 0x02c9 }
            if (r1 == 0) goto L_0x0289
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            r0 = 33
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0244
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            java.lang.String r0 = "important"
            boolean r0 = r10.A0G(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x027f
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
        L_0x0244:
            r0 = 59
            r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            X.C203809ou.A0K(r5, r2, r1)     // Catch:{ 91R -> 0x02c9 }
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x0261
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x01d6
        L_0x0261:
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            java.util.Iterator r4 = r8.iterator()     // Catch:{ 91R -> 0x02c9 }
        L_0x0268:
            boolean r0 = r4.hasNext()     // Catch:{ 91R -> 0x02c9 }
            if (r0 == 0) goto L_0x0005
            java.lang.Object r2 = r4.next()     // Catch:{ 91R -> 0x02c9 }
            X.9QC r2 = (X.AnonymousClass9QC) r2     // Catch:{ 91R -> 0x02c9 }
            java.lang.Integer r1 = r11.A01     // Catch:{ 91R -> 0x02c9 }
            X.9RD r0 = new X.9RD     // Catch:{ 91R -> 0x02c9 }
            r0.<init>(r2, r5, r1)     // Catch:{ 91R -> 0x02c9 }
            r3.A00(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x0268
        L_0x027f:
            java.lang.String r0 = "Malformed rule set: found unexpected '!'"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0287:
            r10.A01 = r4     // Catch:{ 91R -> 0x02c9 }
        L_0x0289:
            java.lang.String r0 = "Expected property value"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0291:
            java.lang.String r0 = "Expected ':'"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x0299:
            java.lang.String r0 = "Malformed rule block: expected '{'"
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r0)     // Catch:{ 91R -> 0x02c9 }
            goto L_0x02c3
        L_0x02a1:
            r11.A02 = r7     // Catch:{ 91R -> 0x02c9 }
            X.9V9 r0 = A01(r10, r11)     // Catch:{ 91R -> 0x02c9 }
            r3.A01(r0)     // Catch:{ 91R -> 0x02c9 }
            r11.A02 = r6     // Catch:{ 91R -> 0x02c9 }
        L_0x02ac:
            int r1 = r10.A01     // Catch:{ 91R -> 0x02c9 }
            int r0 = r10.A00     // Catch:{ 91R -> 0x02c9 }
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            r0 = 125(0x7d, float:1.75E-43)
            boolean r0 = r10.A0F(r0)     // Catch:{ 91R -> 0x02c9 }
            if (r0 != 0) goto L_0x02c4
            X.91R r1 = new X.91R     // Catch:{ 91R -> 0x02c9 }
            r1.<init>(r2)     // Catch:{ 91R -> 0x02c9 }
        L_0x02c3:
            throw r1     // Catch:{ 91R -> 0x02c9 }
        L_0x02c4:
            r10.A0D()     // Catch:{ 91R -> 0x02c9 }
            goto L_0x0005
        L_0x02c9:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "CSS parser terminated early due to error: "
            java.lang.String r1 = X.C36331k8.A0i(r0, r1, r2)
            java.lang.String r0 = "CSSParser"
            android.util.Log.e(r0, r1)
        L_0x02d9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203389nt.A01(X.82B, X.9nt):X.9V9");
    }

    public static boolean A04(C1890892a r4, AnonymousClass9QC r5, AnonymousClass825 r6, List list, int i, int i2) {
        AnonymousClass9UK r1 = (AnonymousClass9UK) r5.A01.get(i);
        if (A06(r4, r1, r6)) {
            Integer num = r1.A00;
            if (num == C023109s.A00) {
                if (i != 0) {
                    while (i2 >= 0) {
                        if (!A05(r4, r5, list, i - 1, i2)) {
                            i2--;
                        }
                    }
                }
                return true;
            } else if (num == C023109s.A01) {
                return A05(r4, r5, list, i - 1, i2);
            } else {
                int A002 = A00(r6, list, i2);
                if (A002 > 0) {
                    return A04(r4, r5, (AnonymousClass825) r6.A00.B9f().get(A002 - 1), list, i - 1, i2);
                }
            }
        }
        return false;
    }

    public static boolean A06(C1890892a r5, AnonymousClass9UK r6, AnonymousClass825 r7) {
        boolean equals;
        List list;
        String str = r6.A02;
        if (str == null || str.equals(C90514aH.A0y(r7.A00()))) {
            List<C192849Iu> list2 = r6.A01;
            if (list2 != null) {
                for (C192849Iu r2 : list2) {
                    String str2 = r2.A01;
                    if (str2.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        equals = r2.A02.equals(r7.A00);
                        continue;
                    } else if (str2.equals("class") && (list = r7.A01) != null) {
                        equals = list.contains(r2.A02);
                        continue;
                    }
                    if (!equals) {
                        return false;
                    }
                }
            }
            List<C22856Ax7> list3 = r6.A03;
            if (list3 == null) {
                return true;
            }
            for (C22856Ax7 BPR : list3) {
                if (!BPR.BPR(r5, r7)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public C203389nt(C187728yR r2, Integer num) {
        this.A02 = false;
        this.A00 = r2;
        this.A01 = num;
    }

    public static ArrayList A02(AnonymousClass82B r9) {
        ArrayList A0I = AnonymousClass001.A0I();
        while (!AnonymousClass000.A1S(r9.A01, r9.A00)) {
            String str = null;
            int i = r9.A01;
            String str2 = r9.A03;
            char charAt = str2.charAt(i);
            if (charAt < 'A' || (charAt > 'Z' && (charAt < 'a' || charAt > 'z'))) {
                r9.A01 = i;
            } else {
                while (true) {
                    int A06 = r9.A06();
                    if (A06 < 65 || (A06 > 90 && (A06 < 97 || A06 > 122))) {
                        str = str2.substring(i, r9.A01);
                    }
                }
                str = str2.substring(i, r9.A01);
            }
            if (str == null) {
                break;
            }
            try {
                A0I.add(C187728yR.valueOf(str));
            } catch (IllegalArgumentException unused) {
            }
            if (!r9.A0E()) {
                break;
            }
        }
        return A0I;
    }

    public static boolean A03(C1890892a r9, AnonymousClass9QC r10, AnonymousClass825 r11) {
        int size;
        ArrayList A0I = AnonymousClass001.A0I();
        AnonymousClass825 r5 = r11;
        for (B0V b0v = r11.A00; b0v != null; b0v = ((AnonymousClass9QD) b0v).A00) {
            A0I.add(0, b0v);
        }
        int size2 = A0I.size() - 1;
        AnonymousClass9QC r4 = r10;
        List list = r10.A01;
        C1890892a r3 = r9;
        if (list != null && list.size() == 1) {
            return A06(r9, (AnonymousClass9UK) r10.A01.get(0), r11);
        }
        List list2 = r10.A01;
        if (list2 == null) {
            size = 0;
        } else {
            size = list2.size();
        }
        return A04(r3, r4, r5, A0I, size - 1, size2);
    }

    public C203389nt() {
        this(C187728yR.screen, C023109s.A00);
    }
}
