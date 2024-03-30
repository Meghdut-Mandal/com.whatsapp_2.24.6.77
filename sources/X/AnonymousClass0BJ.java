package X;

import android.view.ViewGroup;

/* renamed from: X.0BJ  reason: invalid class name */
public class AnonymousClass0BJ extends ViewGroup.MarginLayoutParams {
    public int A00 = 1;
    public boolean A01 = false;
    public float A02 = 0.0f;
    public float A03 = -1.0f;
    public float A04 = 0.5f;
    public float A05 = -1.0f;
    public float A06 = 1.0f;
    public float A07 = 1.0f;
    public float A08;
    public float A09 = 0.5f;
    public float A0A = 0.5f;
    public float A0B = -1.0f;
    public int A0C = -1;
    public int A0D = -1;
    public int A0E = -1;
    public int A0F = -1;
    public int A0G = 0;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J = -1;
    public int A0K = -1;
    public int A0L = -1;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O = -1;
    public int A0P = -1;
    public int A0Q = -1;
    public int A0R = -1;
    public int A0S = -1;
    public int A0T = 0;
    public int A0U = -1;
    public int A0V = -1;
    public int A0W = 0;
    public int A0X = 0;
    public int A0Y = 0;
    public int A0Z = 0;
    public int A0a = 0;
    public int A0b = 0;
    public int A0c = -1;
    public int A0d = -1;
    public int A0e = -1;
    public int A0f;
    public int A0g;
    public int A0h = -1;
    public int A0i = -1;
    public int A0j = -1;
    public int A0k = -1;
    public int A0l = -1;
    public int A0m = -1;
    public int A0n = -1;
    public int A0o = -1;
    public int A0p = -1;
    public int A0q = -1;
    public int A0r = 0;
    public C02500Aq A0s = new C02500Aq();
    public String A0t = null;
    public String A0u = null;
    public boolean A0v = false;
    public boolean A0w = false;
    public boolean A0x = true;
    public boolean A0y = false;
    public boolean A0z = false;
    public boolean A10 = true;

    public void A00() {
        this.A0y = false;
        this.A0x = true;
        this.A10 = true;
        int i = this.width;
        if (i == -2 && this.A0w) {
            this.A0x = false;
            if (this.A0X == 0) {
                this.A0X = 1;
            }
        }
        int i2 = this.height;
        if (i2 == -2 && this.A0v) {
            this.A10 = false;
            if (this.A0W == 0) {
                this.A0W = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.A0x = false;
            if (i == 0 && this.A0X == 1) {
                this.width = -2;
                this.A0w = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.A10 = false;
            if (i2 == 0 && this.A0W == 1) {
                this.height = -2;
                this.A0v = true;
            }
        }
        if (this.A03 != -1.0f || this.A0R != -1 || this.A0S != -1) {
            this.A0y = true;
            this.A0x = true;
            this.A10 = true;
            C02500Aq r1 = this.A0s;
            if (!(r1 instanceof AnonymousClass0GG)) {
                r1 = new AnonymousClass0GG();
                this.A0s = r1;
            }
            ((AnonymousClass0GG) r1).A0K(this.A0c);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveLayoutDirection(int r15) {
        /*
            r14 = this;
            int r2 = r14.leftMargin
            int r4 = r14.rightMargin
            r13 = 0
            r1 = 1
            super.resolveLayoutDirection(r15)
            int r0 = r14.getLayoutDirection()
            r5 = 0
            if (r1 != r0) goto L_0x0011
            r5 = 1
        L_0x0011:
            r3 = -1
            r14.A0j = r3
            r14.A0k = r3
            r14.A0h = r3
            r14.A0i = r3
            int r0 = r14.A0N
            r14.A0d = r0
            int r0 = r14.A0O
            r14.A0e = r0
            float r12 = r14.A04
            r14.A09 = r12
            int r11 = r14.A0R
            r14.A0f = r11
            int r10 = r14.A0S
            r14.A0g = r10
            float r9 = r14.A03
            r14.A08 = r9
            int r7 = r14.A0n
            if (r5 == 0) goto L_0x00bf
            if (r7 == r3) goto L_0x00b7
            r14.A0j = r7
        L_0x003a:
            r13 = 1
        L_0x003b:
            int r8 = r14.A0K
            if (r8 == r3) goto L_0x0042
            r14.A0i = r8
            r13 = 1
        L_0x0042:
            int r6 = r14.A0J
            if (r6 == r3) goto L_0x0049
            r14.A0h = r6
            r13 = 1
        L_0x0049:
            int r0 = r14.A0P
            if (r0 == r3) goto L_0x004f
            r14.A0e = r0
        L_0x004f:
            int r0 = r14.A0M
            if (r0 == r3) goto L_0x0055
            r14.A0d = r0
        L_0x0055:
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x005d
            float r0 = r5 - r12
            r14.A09 = r0
        L_0x005d:
            boolean r0 = r14.A0y
            if (r0 == 0) goto L_0x0072
            int r0 = r14.A0c
            if (r0 != r1) goto L_0x0072
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            float r5 = r5 - r9
            r14.A08 = r5
            r14.A0f = r3
            r14.A0g = r3
        L_0x0072:
            if (r8 != r3) goto L_0x0098
            if (r6 != r3) goto L_0x0098
            int r0 = r14.A0o
            if (r0 != r3) goto L_0x0098
            if (r7 != r3) goto L_0x0098
            int r0 = r14.A0l
            if (r0 == r3) goto L_0x00a0
            r14.A0j = r0
        L_0x0082:
            int r0 = r14.rightMargin
            if (r0 > 0) goto L_0x008a
            if (r4 <= 0) goto L_0x008a
            r14.rightMargin = r4
        L_0x008a:
            int r0 = r14.A0U
            if (r0 == r3) goto L_0x0099
            r14.A0h = r0
        L_0x0090:
            int r0 = r14.leftMargin
            if (r0 > 0) goto L_0x0098
            if (r2 <= 0) goto L_0x0098
            r14.leftMargin = r2
        L_0x0098:
            return
        L_0x0099:
            int r0 = r14.A0V
            if (r0 == r3) goto L_0x0098
            r14.A0i = r0
            goto L_0x0090
        L_0x00a0:
            int r0 = r14.A0m
            if (r0 == r3) goto L_0x008a
            r14.A0k = r0
            goto L_0x0082
        L_0x00a7:
            if (r11 == r3) goto L_0x00b0
            r14.A0g = r11
            r14.A0f = r3
        L_0x00ad:
            r14.A08 = r1
            goto L_0x0072
        L_0x00b0:
            if (r10 == r3) goto L_0x0072
            r14.A0f = r10
            r14.A0g = r3
            goto L_0x00ad
        L_0x00b7:
            int r0 = r14.A0o
            if (r0 == r3) goto L_0x003b
            r14.A0k = r0
            goto L_0x003a
        L_0x00bf:
            if (r7 == r3) goto L_0x00c3
            r14.A0i = r7
        L_0x00c3:
            int r0 = r14.A0o
            if (r0 == r3) goto L_0x00c9
            r14.A0h = r0
        L_0x00c9:
            int r8 = r14.A0K
            if (r8 == r3) goto L_0x00cf
            r14.A0j = r8
        L_0x00cf:
            int r6 = r14.A0J
            if (r6 == r3) goto L_0x00d5
            r14.A0k = r6
        L_0x00d5:
            int r0 = r14.A0P
            if (r0 == r3) goto L_0x00db
            r14.A0d = r0
        L_0x00db:
            int r0 = r14.A0M
            if (r0 == r3) goto L_0x0072
            r14.A0e = r0
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BJ.resolveLayoutDirection(int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x018e, code lost:
        android.util.Log.e("ConstraintLayout", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0BJ(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r12.<init>(r13, r14)
            r6 = -1
            r12.A0R = r6
            r12.A0S = r6
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r12.A03 = r0
            r12.A0U = r6
            r12.A0V = r6
            r12.A0l = r6
            r12.A0m = r6
            r12.A0q = r6
            r12.A0p = r6
            r12.A0E = r6
            r12.A0D = r6
            r12.A0C = r6
            r12.A0F = r6
            r5 = 0
            r12.A0G = r5
            r4 = 0
            r12.A02 = r4
            r12.A0n = r6
            r12.A0o = r6
            r12.A0K = r6
            r12.A0J = r6
            r12.A0N = r6
            r12.A0Q = r6
            r12.A0O = r6
            r12.A0L = r6
            r12.A0P = r6
            r12.A0M = r6
            r2 = 1056964608(0x3f000000, float:0.5)
            r12.A04 = r2
            r12.A0A = r2
            r1 = 0
            r12.A0u = r1
            r3 = 1
            r12.A00 = r3
            r12.A05 = r0
            r12.A0B = r0
            r12.A0T = r5
            r12.A0r = r5
            r12.A0X = r5
            r12.A0W = r5
            r12.A0b = r5
            r12.A0a = r5
            r12.A0Z = r5
            r12.A0Y = r5
            r0 = 1065353216(0x3f800000, float:1.0)
            r12.A07 = r0
            r12.A06 = r0
            r12.A0H = r6
            r12.A0I = r6
            r12.A0c = r6
            r12.A0w = r5
            r12.A0v = r5
            r12.A0t = r1
            r12.A0x = r3
            r12.A10 = r3
            r12.A0z = r5
            r12.A0y = r5
            r12.A01 = r5
            r12.A0h = r6
            r12.A0i = r6
            r12.A0j = r6
            r12.A0k = r6
            r12.A0d = r6
            r12.A0e = r6
            r12.A09 = r2
            X.0Aq r0 = new X.0Aq
            r0.<init>()
            r12.A0s = r0
            int[] r0 = X.C33961gD.A01
            android.content.res.TypedArray r8 = r13.obtainStyledAttributes(r14, r0)
            int r7 = r8.getIndexCount()
            r2 = 0
        L_0x0096:
            if (r2 >= r7) goto L_0x0393
            int r9 = r8.getIndex(r2)
            android.util.SparseIntArray r0 = X.AnonymousClass0BK.A00
            int r0 = r0.get(r9)
            java.lang.String r11 = "ConstraintLayout"
            r10 = 2
            r1 = -2
            switch(r0) {
                case 1: goto L_0x0331;
                case 2: goto L_0x031f;
                case 3: goto L_0x0315;
                case 4: goto L_0x02ff;
                case 5: goto L_0x02f5;
                case 6: goto L_0x02eb;
                case 7: goto L_0x02e1;
                case 8: goto L_0x02cf;
                case 9: goto L_0x02bd;
                case 10: goto L_0x02ab;
                case 11: goto L_0x0299;
                case 12: goto L_0x0287;
                case 13: goto L_0x0275;
                case 14: goto L_0x0263;
                case 15: goto L_0x0251;
                case 16: goto L_0x023f;
                case 17: goto L_0x022d;
                case 18: goto L_0x021b;
                case 19: goto L_0x0209;
                case 20: goto L_0x01f7;
                case 21: goto L_0x01ed;
                case 22: goto L_0x01e3;
                case 23: goto L_0x01d9;
                case 24: goto L_0x01cf;
                case 25: goto L_0x01c5;
                case 26: goto L_0x01bb;
                case 27: goto L_0x01b1;
                case 28: goto L_0x01a7;
                case 29: goto L_0x019d;
                case 30: goto L_0x0193;
                case 31: goto L_0x0184;
                case 32: goto L_0x0179;
                case 33: goto L_0x037d;
                case 34: goto L_0x0367;
                case 35: goto L_0x0169;
                case 36: goto L_0x0351;
                case 37: goto L_0x033b;
                case 38: goto L_0x0159;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            switch(r0) {
                case 44: goto L_0x00e8;
                case 45: goto L_0x00df;
                case 46: goto L_0x00d6;
                case 47: goto L_0x00cf;
                case 48: goto L_0x00c8;
                case 49: goto L_0x00bf;
                case 50: goto L_0x00b6;
                case 51: goto L_0x00af;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            int r2 = r2 + 1
            goto L_0x0096
        L_0x00af:
            java.lang.String r0 = r8.getString(r9)
            r12.A0t = r0
            goto L_0x00ac
        L_0x00b6:
            int r0 = r12.A0I
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0I = r0
            goto L_0x00ac
        L_0x00bf:
            int r0 = r12.A0H
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0H = r0
            goto L_0x00ac
        L_0x00c8:
            int r0 = r8.getInt(r9, r5)
            r12.A0r = r0
            goto L_0x00ac
        L_0x00cf:
            int r0 = r8.getInt(r9, r5)
            r12.A0T = r0
            goto L_0x00ac
        L_0x00d6:
            float r0 = r12.A0B
            float r0 = r8.getFloat(r9, r0)
            r12.A0B = r0
            goto L_0x00ac
        L_0x00df:
            float r0 = r12.A05
            float r0 = r8.getFloat(r9, r0)
            r12.A05 = r0
            goto L_0x00ac
        L_0x00e8:
            java.lang.String r1 = r8.getString(r9)
            r12.A0u = r1
            r12.A00 = r6
            if (r1 == 0) goto L_0x00ac
            int r11 = r1.length()
            r0 = 44
            int r9 = r1.indexOf(r0)
            if (r9 <= 0) goto L_0x0144
            int r0 = r11 + -1
            if (r9 >= r0) goto L_0x0144
            java.lang.String r1 = r1.substring(r5, r9)
            java.lang.String r0 = "W"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0139
            r12.A00 = r5
        L_0x0110:
            int r9 = r9 + 1
        L_0x0112:
            java.lang.String r1 = r12.A0u
            r0 = 58
            int r10 = r1.indexOf(r0)
            if (r10 < 0) goto L_0x0146
            int r0 = r11 + -1
            if (r10 >= r0) goto L_0x0146
            java.lang.String r9 = r1.substring(r9, r10)
            java.lang.String r1 = r12.A0u
            int r0 = r10 + 1
            java.lang.String r1 = r1.substring(r0)
            int r0 = r9.length()
            if (r0 <= 0) goto L_0x00ac
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00ac
            goto L_0x0151
        L_0x0139:
            java.lang.String r0 = "H"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0110
            r12.A00 = r3
            goto L_0x0110
        L_0x0144:
            r9 = 0
            goto L_0x0112
        L_0x0146:
            java.lang.String r1 = r1.substring(r9)
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00ac
            goto L_0x0154
        L_0x0151:
            java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x00ac }
        L_0x0154:
            java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00ac }
            goto L_0x00ac
        L_0x0159:
            float r0 = r12.A06
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r12.A06 = r0
            r12.A0W = r10
            goto L_0x00ac
        L_0x0169:
            float r0 = r12.A07
            float r0 = r8.getFloat(r9, r0)
            float r0 = java.lang.Math.max(r4, r0)
            r12.A07 = r0
            r12.A0X = r10
            goto L_0x00ac
        L_0x0179:
            int r0 = r8.getInt(r9, r5)
            r12.A0W = r0
            if (r0 != r3) goto L_0x00ac
            java.lang.String r0 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
            goto L_0x018e
        L_0x0184:
            int r0 = r8.getInt(r9, r5)
            r12.A0X = r0
            if (r0 != r3) goto L_0x00ac
            java.lang.String r0 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
        L_0x018e:
            android.util.Log.e(r11, r0)
            goto L_0x00ac
        L_0x0193:
            float r0 = r12.A0A
            float r0 = r8.getFloat(r9, r0)
            r12.A0A = r0
            goto L_0x00ac
        L_0x019d:
            float r0 = r12.A04
            float r0 = r8.getFloat(r9, r0)
            r12.A04 = r0
            goto L_0x00ac
        L_0x01a7:
            boolean r0 = r12.A0v
            boolean r0 = r8.getBoolean(r9, r0)
            r12.A0v = r0
            goto L_0x00ac
        L_0x01b1:
            boolean r0 = r12.A0w
            boolean r0 = r8.getBoolean(r9, r0)
            r12.A0w = r0
            goto L_0x00ac
        L_0x01bb:
            int r0 = r12.A0M
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0M = r0
            goto L_0x00ac
        L_0x01c5:
            int r0 = r12.A0P
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0P = r0
            goto L_0x00ac
        L_0x01cf:
            int r0 = r12.A0L
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0L = r0
            goto L_0x00ac
        L_0x01d9:
            int r0 = r12.A0O
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0O = r0
            goto L_0x00ac
        L_0x01e3:
            int r0 = r12.A0Q
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0Q = r0
            goto L_0x00ac
        L_0x01ed:
            int r0 = r12.A0N
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0N = r0
            goto L_0x00ac
        L_0x01f7:
            int r0 = r12.A0J
            int r0 = r8.getResourceId(r9, r0)
            r12.A0J = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0J = r0
            goto L_0x00ac
        L_0x0209:
            int r0 = r12.A0K
            int r0 = r8.getResourceId(r9, r0)
            r12.A0K = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0K = r0
            goto L_0x00ac
        L_0x021b:
            int r0 = r12.A0o
            int r0 = r8.getResourceId(r9, r0)
            r12.A0o = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0o = r0
            goto L_0x00ac
        L_0x022d:
            int r0 = r12.A0n
            int r0 = r8.getResourceId(r9, r0)
            r12.A0n = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0n = r0
            goto L_0x00ac
        L_0x023f:
            int r0 = r12.A0C
            int r0 = r8.getResourceId(r9, r0)
            r12.A0C = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0C = r0
            goto L_0x00ac
        L_0x0251:
            int r0 = r12.A0D
            int r0 = r8.getResourceId(r9, r0)
            r12.A0D = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0D = r0
            goto L_0x00ac
        L_0x0263:
            int r0 = r12.A0E
            int r0 = r8.getResourceId(r9, r0)
            r12.A0E = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0E = r0
            goto L_0x00ac
        L_0x0275:
            int r0 = r12.A0p
            int r0 = r8.getResourceId(r9, r0)
            r12.A0p = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0p = r0
            goto L_0x00ac
        L_0x0287:
            int r0 = r12.A0q
            int r0 = r8.getResourceId(r9, r0)
            r12.A0q = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0q = r0
            goto L_0x00ac
        L_0x0299:
            int r0 = r12.A0m
            int r0 = r8.getResourceId(r9, r0)
            r12.A0m = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0m = r0
            goto L_0x00ac
        L_0x02ab:
            int r0 = r12.A0l
            int r0 = r8.getResourceId(r9, r0)
            r12.A0l = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0l = r0
            goto L_0x00ac
        L_0x02bd:
            int r0 = r12.A0V
            int r0 = r8.getResourceId(r9, r0)
            r12.A0V = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0V = r0
            goto L_0x00ac
        L_0x02cf:
            int r0 = r12.A0U
            int r0 = r8.getResourceId(r9, r0)
            r12.A0U = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0U = r0
            goto L_0x00ac
        L_0x02e1:
            float r0 = r12.A03
            float r0 = r8.getFloat(r9, r0)
            r12.A03 = r0
            goto L_0x00ac
        L_0x02eb:
            int r0 = r12.A0S
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0S = r0
            goto L_0x00ac
        L_0x02f5:
            int r0 = r12.A0R
            int r0 = r8.getDimensionPixelOffset(r9, r0)
            r12.A0R = r0
            goto L_0x00ac
        L_0x02ff:
            float r0 = r12.A02
            float r9 = r8.getFloat(r9, r0)
            r1 = 1135869952(0x43b40000, float:360.0)
            float r9 = r9 % r1
            r12.A02 = r9
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ac
            float r0 = r1 - r9
            float r0 = r0 % r1
            r12.A02 = r0
            goto L_0x00ac
        L_0x0315:
            int r0 = r12.A0G
            int r0 = r8.getDimensionPixelSize(r9, r0)
            r12.A0G = r0
            goto L_0x00ac
        L_0x031f:
            int r0 = r12.A0F
            int r0 = r8.getResourceId(r9, r0)
            r12.A0F = r0
            if (r0 != r6) goto L_0x00ac
            int r0 = r8.getInt(r9, r6)
            r12.A0F = r0
            goto L_0x00ac
        L_0x0331:
            int r0 = r12.A0c
            int r0 = r8.getInt(r9, r0)
            r12.A0c = r0
            goto L_0x00ac
        L_0x033b:
            int r0 = r12.A0Y     // Catch:{ Exception -> 0x0345 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0345 }
            r12.A0Y = r0     // Catch:{ Exception -> 0x0345 }
            goto L_0x00ac
        L_0x0345:
            int r0 = r12.A0Y
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x00ac
            r12.A0Y = r1
            goto L_0x00ac
        L_0x0351:
            int r0 = r12.A0a     // Catch:{ Exception -> 0x035b }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x035b }
            r12.A0a = r0     // Catch:{ Exception -> 0x035b }
            goto L_0x00ac
        L_0x035b:
            int r0 = r12.A0a
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x00ac
            r12.A0a = r1
            goto L_0x00ac
        L_0x0367:
            int r0 = r12.A0Z     // Catch:{ Exception -> 0x0371 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0371 }
            r12.A0Z = r0     // Catch:{ Exception -> 0x0371 }
            goto L_0x00ac
        L_0x0371:
            int r0 = r12.A0Z
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x00ac
            r12.A0Z = r1
            goto L_0x00ac
        L_0x037d:
            int r0 = r12.A0b     // Catch:{ Exception -> 0x0387 }
            int r0 = r8.getDimensionPixelSize(r9, r0)     // Catch:{ Exception -> 0x0387 }
            r12.A0b = r0     // Catch:{ Exception -> 0x0387 }
            goto L_0x00ac
        L_0x0387:
            int r0 = r12.A0b
            int r0 = r8.getInt(r9, r0)
            if (r0 != r1) goto L_0x00ac
            r12.A0b = r1
            goto L_0x00ac
        L_0x0393:
            r8.recycle()
            r12.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BJ.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public AnonymousClass0BJ(int i, int i2) {
        super(i, i2);
    }

    public AnonymousClass0BJ(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
