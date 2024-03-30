package X;

import java.util.Map;

/* renamed from: X.9gS  reason: invalid class name and case insensitive filesystem */
public class C200029gS {
    public AnonymousClass9V9 A00 = new AnonymousClass9V9();
    public C1687281s A01 = null;
    public Map A02 = AnonymousClass001.A0J();

    /* JADX WARNING: type inference failed for: r1v1, types: [X.9QD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass825 A00(X.B0V r5, java.lang.String r6) {
        /*
            r4 = this;
            r3 = r5
            X.825 r3 = (X.AnonymousClass825) r3
            java.lang.String r0 = r3.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r5.B9f()
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003b
            java.lang.Object r1 = r2.next()
            X.9QD r1 = (X.AnonymousClass9QD) r1
            boolean r0 = r1 instanceof X.AnonymousClass825
            if (r0 == 0) goto L_0x0013
            r3 = r1
            X.825 r3 = (X.AnonymousClass825) r3
            java.lang.String r0 = r3.A00
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1 instanceof X.B0V
            if (r0 == 0) goto L_0x0013
            X.B0V r1 = (X.B0V) r1
            X.825 r3 = r4.A00(r1, r6)
            if (r3 == 0) goto L_0x0013
        L_0x003a:
            return r3
        L_0x003b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200029gS.A00(X.B0V, java.lang.String):X.825");
    }

    public AnonymousClass825 A04(String str) {
        String substring;
        String str2;
        String replace;
        if (str != null) {
            String str3 = "\"";
            if (!str.startsWith(str3) || !str.endsWith(str3)) {
                str3 = "'";
                if (str.startsWith(str3) && str.endsWith(str3)) {
                    substring = str.substring(1, str.length() - 1);
                    str2 = "\\'";
                }
                replace = str.replace("\\\n", "").replace("\\A", "\n");
                if (replace.length() > 1 && replace.startsWith("#")) {
                    return A03(replace.substring(1));
                }
            } else {
                substring = str.substring(1, str.length() - 1);
                str2 = "\\\"";
            }
            str = substring.replace(str2, str3);
            replace = str.replace("\\\n", "").replace("\\A", "\n");
            return A03(replace.substring(1));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if (r7 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A01(X.C198899eN r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x0025
            X.9eH r5 = r7.A02
            if (r5 == 0) goto L_0x0025
        L_0x0006:
            X.9eH r3 = r7.A03
            if (r3 == 0) goto L_0x002c
            float r1 = r3.A01
            float r0 = r3.A03
            float r1 = r1 + r0
            float r2 = r3.A02
            float r0 = r3.A00
            float r2 = r2 + r0
        L_0x0014:
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            double r0 = (double) r2
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            android.graphics.Picture r0 = r6.A02(r7, r3, r0)
            return r0
        L_0x0025:
            X.81s r0 = r6.A01
            X.9eH r5 = r0.A00
            if (r7 == 0) goto L_0x002c
            goto L_0x0006
        L_0x002c:
            X.81s r4 = r6.A01
            X.AUX r3 = r4.A01
            if (r3 == 0) goto L_0x0056
            java.lang.Integer r0 = r3.A00
            java.lang.Integer r1 = X.C023109s.A0X
            if (r0 == r1) goto L_0x0049
            X.AUX r2 = r4.A00
            if (r2 == 0) goto L_0x0049
            java.lang.Integer r0 = r2.A00
            if (r0 == r1) goto L_0x0049
            float r1 = r3.A00()
            float r2 = r2.A00()
            goto L_0x0014
        L_0x0049:
            if (r5 == 0) goto L_0x0056
            float r1 = r3.A00()
            float r2 = r5.A00
            float r2 = r2 * r1
            float r0 = r5.A03
            float r2 = r2 / r0
            goto L_0x0014
        L_0x0056:
            X.AUX r0 = r4.A00
            if (r0 == 0) goto L_0x0067
            if (r5 == 0) goto L_0x0067
            float r2 = r0.A00()
            float r1 = r5.A03
            float r1 = r1 * r2
            float r0 = r5.A00
            float r1 = r1 / r0
            goto L_0x0014
        L_0x0067:
            r0 = 512(0x200, float:7.175E-43)
            android.graphics.Picture r0 = r6.A02(r7, r0, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200029gS.A01(X.9eN):android.graphics.Picture");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Picture A02(X.C198899eN r11, int r12, int r13) {
        /*
            r10 = this;
            android.graphics.Picture r3 = new android.graphics.Picture
            r3.<init>()
            android.graphics.Canvas r5 = r3.beginRecording(r12, r13)
            if (r11 == 0) goto L_0x0125
            X.9eH r0 = r11.A03
            if (r0 != 0) goto L_0x001f
            X.9eN r0 = new X.9eN
            r0.<init>(r11)
            r11 = r0
        L_0x0015:
            float r4 = (float) r12
            float r2 = (float) r13
            r1 = 0
            X.9eH r0 = new X.9eH
            r0.<init>(r1, r1, r4, r2)
            r11.A03 = r0
        L_0x001f:
            X.9p5 r7 = new X.9p5
            r7.<init>(r5)
            java.lang.String r0 = "renderOptions shouldn't be null"
            java.util.Objects.requireNonNull(r11, r0)
            r7.A01 = r10
            X.81s r6 = r10.A01
            r8 = 0
            if (r6 != 0) goto L_0x0041
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.String r0 = "Nothing to render. Document is empty."
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "SVGAndroidRenderer"
            android.util.Log.w(r0, r1)
        L_0x003d:
            r3.endRecording()
            return r3
        L_0x0041:
            java.lang.String r9 = r11.A04
            if (r9 == 0) goto L_0x0069
            X.825 r4 = r10.A03(r9)
            r1 = 1
            java.lang.String r2 = "SVGAndroidRenderer"
            if (r4 == 0) goto L_0x0062
            boolean r0 = r4 instanceof X.C1687481u
            if (r0 == 0) goto L_0x0062
            X.81q r4 = (X.C1687081q) r4
            X.9eH r5 = r4.A00
            if (r5 != 0) goto L_0x0076
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" is missing a viewBox attribute."
        L_0x005e:
            X.C165597tg.A1H(r0, r2, r1)
            goto L_0x003d
        L_0x0062:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r8] = r9
            java.lang.String r0 = "View element with id \"%s\" not found."
            goto L_0x005e
        L_0x0069:
            X.9eH r5 = r11.A02
            if (r5 != 0) goto L_0x006f
            X.9eH r5 = r6.A00
        L_0x006f:
            X.9fC r4 = r11.A01
            if (r4 != 0) goto L_0x0078
            X.9fC r4 = r6.A00
            goto L_0x0078
        L_0x0076:
            X.9fC r4 = r4.A00
        L_0x0078:
            X.9V9 r0 = r11.A00
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x008d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x008d
            X.9V9 r1 = r11.A00
            X.9V9 r0 = r10.A00
            r0.A01(r1)
        L_0x008d:
            X.9d2 r0 = new X.9d2
            r0.<init>(r7)
            r7.A02 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A05 = r0
            X.9d2 r1 = r7.A02
            X.AUW r0 = X.AUW.A00()
            X.AnonymousClass9p5.A0V(r0, r1, r7)
            X.9d2 r2 = r7.A02
            r0 = 0
            r2.A03 = r0
            r2.A07 = r8
            java.util.Stack r1 = r7.A05
            X.9d2 r0 = new X.9d2
            r0.<init>(r2, r7)
            r1.push(r0)
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A03 = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r7.A04 = r0
            java.lang.Boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00cf
            X.9d2 r1 = r7.A02
            boolean r0 = r0.booleanValue()
            r1.A07 = r0
        L_0x00cf:
            X.AnonymousClass9p5.A0j(r7)
            X.9eH r0 = r11.A03
            X.9eH r2 = new X.9eH
            r2.<init>(r0)
            X.AUX r1 = r6.A01
            if (r1 == 0) goto L_0x00e5
            float r0 = r2.A03
            float r0 = r1.A04(r7, r0)
            r2.A03 = r0
        L_0x00e5:
            X.AUX r1 = r6.A00
            if (r1 == 0) goto L_0x00f1
            float r0 = r2.A00
            float r0 = r1.A04(r7, r0)
            r2.A00 = r0
        L_0x00f1:
            X.AnonymousClass9p5.A0L(r4, r2, r5, r6, r7)
            X.AnonymousClass9p5.A0i(r7)
            X.9V9 r0 = r11.A00
            if (r0 == 0) goto L_0x003d
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x003d
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x003d
            X.9V9 r0 = r10.A00
            java.lang.Integer r2 = X.C023109s.A01
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x003d
            java.util.Iterator r1 = r0.iterator()
        L_0x0111:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()
            X.9RD r0 = (X.AnonymousClass9RD) r0
            java.lang.Integer r0 = r0.A02
            if (r0 != r2) goto L_0x0111
            r1.remove()
            goto L_0x0111
        L_0x0125:
            X.9eN r11 = new X.9eN
            r11.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C200029gS.A02(X.9eN, int, int):android.graphics.Picture");
    }

    public AnonymousClass825 A03(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        C1687281s r1 = this.A01;
        if (str.equals(r1.A00)) {
            return r1;
        }
        Map map = this.A02;
        if (map.containsKey(str)) {
            return (AnonymousClass825) map.get(str);
        }
        AnonymousClass825 A002 = A00(this.A01, str);
        map.put(str, A002);
        return A002;
    }
}
