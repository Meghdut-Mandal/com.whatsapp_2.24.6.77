package androidx.constraintlayout.helper.widget;

import X.AnonymousClass0GI;
import X.AnonymousClass0GS;
import X.C02500Aq;
import X.C33961gD;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Flow extends AnonymousClass0GS {
    public AnonymousClass0GI A00;

    public void A07(C02500Aq r4, boolean z) {
        AnonymousClass0GI r2 = this.A00;
        int i = r2.A05;
        if (i <= 0 && r2.A04 <= 0) {
            return;
        }
        if (z) {
            r2.A07 = r2.A04;
            r2.A08 = i;
            return;
        }
        r2.A07 = i;
        r2.A08 = r2.A04;
    }

    public void onMeasure(int i, int i2) {
        A0A(this.A00, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.A00.A00 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.A00.A01 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.A00.A08 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.A00.A09 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.A00.A02 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.A00.A0A = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.A00.A0B = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.A00.A0E = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.A00.A0F = i;
        requestLayout();
    }

    public void setPadding(int i) {
        AnonymousClass0GI r0 = this.A00;
        r0.A06 = i;
        r0.A03 = i;
        r0.A05 = i;
        r0.A04 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.A00.A03 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.A00.A07 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.A00.A08 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.A00.A06 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.A00.A0G = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.A00.A05 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.A00.A0H = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.A00.A0I = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.A00.A0J = i;
        requestLayout();
    }

    public void A06(AttributeSet attributeSet) {
        AnonymousClass0GI r1;
        int dimensionPixelSize;
        AnonymousClass0GI r12;
        int dimensionPixelSize2;
        super.A06(attributeSet);
        this.A00 = new AnonymousClass0GI();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C33961gD.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.A00.A0F = obtainStyledAttributes.getInt(index, 0);
                } else {
                    if (index == 1) {
                        r12 = this.A00;
                        dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        r12.A06 = dimensionPixelSize2;
                        r12.A03 = dimensionPixelSize2;
                        r12.A05 = dimensionPixelSize2;
                    } else {
                        if (index == 11) {
                            r1 = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                            r1.A05 = dimensionPixelSize;
                            r1.A07 = dimensionPixelSize;
                        } else if (index == 12) {
                            r12 = this.A00;
                            dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 2) {
                            this.A00.A07 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 3) {
                            this.A00.A06 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 4) {
                            r1 = this.A00;
                            dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 5) {
                            this.A00.A03 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 37) {
                            this.A00.A0J = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 27) {
                            this.A00.A0B = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 36) {
                            this.A00.A0I = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 21) {
                            this.A00.A07 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 29) {
                            this.A00.A0C = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 23) {
                            this.A00.A08 = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 31) {
                            this.A00.A0D = obtainStyledAttributes.getInt(index, 0);
                        } else if (index == 25) {
                            this.A00.A02 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 20) {
                            this.A00.A00 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 28) {
                            this.A00.A03 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 22) {
                            this.A00.A01 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 30) {
                            this.A00.A04 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 34) {
                            this.A00.A05 = obtainStyledAttributes.getFloat(index, 0.5f);
                        } else if (index == 24) {
                            this.A00.A09 = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 33) {
                            this.A00.A0G = obtainStyledAttributes.getInt(index, 2);
                        } else if (index == 26) {
                            this.A00.A0A = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 35) {
                            this.A00.A0H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        } else if (index == 32) {
                            this.A00.A0E = obtainStyledAttributes.getInt(index, -1);
                        }
                        r1.A08 = dimensionPixelSize;
                    }
                    r12.A04 = dimensionPixelSize2;
                }
            }
        }
        this.A01 = this.A00;
        A04();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2, types: [int] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: type inference failed for: r6v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0285, code lost:
        if (r0 == r8) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 == r4) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04ff, code lost:
        if (r3 == 0) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x050a, code lost:
        if (r3 == 0) goto L_0x050c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0531  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0561 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x056a  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x05a7  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05b3 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x052e A[EDGE_INSN: B:369:0x052e->B:273:0x052e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A(X.AnonymousClass0GJ r50, int r51, int r52) {
        /*
            r49 = this;
            int r20 = android.view.View.MeasureSpec.getMode(r51)
            int r19 = android.view.View.MeasureSpec.getSize(r51)
            int r18 = android.view.View.MeasureSpec.getMode(r52)
            int r17 = android.view.View.MeasureSpec.getSize(r52)
            r48 = r49
            r16 = r50
            if (r50 == 0) goto L_0x05c4
            r7 = r16
            X.0GI r7 = (X.AnonymousClass0GI) r7
            int r9 = r7.A00
            r6 = 0
            if (r9 <= 0) goto L_0x0088
            X.0Aq r0 = r7.A0Z
            if (r0 == 0) goto L_0x0082
            X.0As r0 = (X.C02520As) r0
            X.0BH r2 = r0.A05
            if (r2 == 0) goto L_0x0082
            r1 = 0
        L_0x002a:
            int r9 = r7.A00
            r8 = 1
            if (r1 >= r9) goto L_0x0088
            X.0Aq[] r0 = r7.A01
            r3 = r0[r1]
            if (r3 == 0) goto L_0x004d
            boolean r0 = r3 instanceof X.AnonymousClass0GG
            if (r0 != 0) goto L_0x004d
            java.lang.Integer[] r4 = r3.A0q
            r0 = r4[r6]
            r5 = r4[r8]
            java.lang.Integer r4 = X.C023109s.A0C
            if (r0 != r4) goto L_0x0050
            int r0 = r3.A0D
            if (r0 == r8) goto L_0x0052
            if (r5 != r4) goto L_0x0052
            int r0 = r3.A0C
            if (r0 == r8) goto L_0x0052
        L_0x004d:
            int r1 = r1 + 1
            goto L_0x002a
        L_0x0050:
            if (r0 != r4) goto L_0x0054
        L_0x0052:
            java.lang.Integer r0 = X.C023109s.A01
        L_0x0054:
            if (r5 != r4) goto L_0x0058
            java.lang.Integer r5 = X.C023109s.A01
        L_0x0058:
            X.0B1 r4 = r7.A09
            r4.A05 = r0
            r4.A06 = r5
            int r0 = r3.A03()
            r4.A00 = r0
            int r0 = r3.A02()
            r4.A04 = r0
            r2.BPg(r3, r4)
            int r0 = r4.A03
            r3.A09(r0)
            int r0 = r4.A02
            r3.A08(r0)
            int r0 = r4.A01
            r3.A07 = r0
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r3.A0h = r0
            goto L_0x004d
        L_0x0082:
            r7.A02 = r6
            r7.A01 = r6
            goto L_0x011d
        L_0x0088:
            int r0 = r7.A07
            r22 = r0
            int r0 = r7.A08
            r23 = r0
            int r0 = r7.A06
            r21 = r0
            int r0 = r7.A03
            r24 = r0
            r0 = 2
            int[] r5 = new int[r0]
            int r4 = r19 - r22
            int r4 = r4 - r23
            int r3 = r7.A0F
            r0 = 1
            if (r3 != r0) goto L_0x00a8
            int r4 = r17 - r21
            int r4 = r4 - r24
        L_0x00a8:
            r1 = -1
            int r0 = r7.A0B
            if (r0 != r1) goto L_0x00af
            r7.A0B = r6
        L_0x00af:
            int r0 = r7.A0I
            if (r0 != r1) goto L_0x00b5
            r7.A0I = r6
        L_0x00b5:
            X.0Aq[] r10 = r7.A01
            r11 = r10
            r2 = 0
        L_0x00b9:
            if (r2 >= r9) goto L_0x00c8
            r0 = r10[r2]
            int r1 = r0.A0N
            r0 = 8
            if (r1 != r0) goto L_0x00c5
            int r6 = r6 + 1
        L_0x00c5:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00c8:
            r8 = r9
            if (r6 <= 0) goto L_0x00e2
            int r0 = r9 - r6
            X.0Aq[] r10 = new X.C02500Aq[r0]
            r6 = 0
            r8 = 0
        L_0x00d1:
            if (r6 >= r9) goto L_0x00e2
            r2 = r11[r6]
            int r1 = r2.A0N
            r0 = 8
            if (r1 == r0) goto L_0x00df
            r10[r8] = r2
            int r8 = r8 + 1
        L_0x00df:
            int r6 = r6 + 1
            goto L_0x00d1
        L_0x00e2:
            r7.A0O = r10
            r7.A06 = r8
            int r0 = r7.A0J
            if (r0 == 0) goto L_0x0462
            r2 = 1
            if (r0 == r2) goto L_0x0187
            r11 = 2
            if (r0 == r11) goto L_0x0145
            r0 = 0
            r6 = 1
        L_0x00f2:
            r2 = r5[r0]
            int r2 = r2 + r22
            int r2 = r2 + r23
            r1 = r5[r6]
            int r1 = r1 + r21
            int r1 = r1 + r24
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r0 = r20
            if (r0 != r3) goto L_0x0138
            r2 = r19
        L_0x0108:
            r0 = r18
            if (r0 != r3) goto L_0x012b
            r1 = r17
        L_0x010e:
            r7.A02 = r2
            r7.A01 = r1
            r7.A09(r2)
            r7.A08(r1)
            int r0 = r7.A00
            if (r0 > 0) goto L_0x011d
            r6 = 0
        L_0x011d:
            r7.A0A = r6
            r0 = r16
            int r2 = r0.A02
            int r1 = r0.A01
            r0 = r48
            r0.setMeasuredDimension(r2, r1)
            return
        L_0x012b:
            if (r0 != r4) goto L_0x0134
            r0 = r17
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x010e
        L_0x0134:
            if (r18 == 0) goto L_0x010e
            r1 = 0
            goto L_0x010e
        L_0x0138:
            if (r0 != r4) goto L_0x0141
            r0 = r19
            int r2 = java.lang.Math.min(r2, r0)
            goto L_0x0108
        L_0x0141:
            if (r20 == 0) goto L_0x0108
            r2 = 0
            goto L_0x0108
        L_0x0145:
            r6 = 1
            r12 = 0
            int r2 = r7.A0E
            if (r3 != 0) goto L_0x016b
            if (r2 > 0) goto L_0x0167
            r2 = 0
            r1 = 0
            r9 = 0
        L_0x0150:
            if (r1 >= r8) goto L_0x0167
            if (r1 <= 0) goto L_0x0157
            int r0 = r7.A0A
            int r9 = r9 + r0
        L_0x0157:
            r0 = r10[r1]
            if (r0 == 0) goto L_0x0164
            int r0 = X.AnonymousClass0GI.A01(r0, r7, r4)
            int r9 = r9 + r0
            if (r9 > r4) goto L_0x0167
            int r2 = r2 + 1
        L_0x0164:
            int r1 = r1 + 1
            goto L_0x0150
        L_0x0167:
            r9 = r2
            r2 = 0
            goto L_0x04f1
        L_0x016b:
            if (r2 > 0) goto L_0x04f0
            r2 = 0
            r9 = 0
            r1 = 0
        L_0x0170:
            if (r9 >= r8) goto L_0x04f0
            if (r9 <= 0) goto L_0x0177
            int r0 = r7.A0H
            int r1 = r1 + r0
        L_0x0177:
            r0 = r10[r9]
            if (r0 == 0) goto L_0x0184
            int r0 = X.AnonymousClass0GI.A00(r0, r7, r4)
            int r1 = r1 + r0
            if (r1 > r4) goto L_0x04f0
            int r2 = r2 + 1
        L_0x0184:
            int r9 = r9 + 1
            goto L_0x0170
        L_0x0187:
            r6 = 1
            if (r8 == 0) goto L_0x0507
            java.util.ArrayList r9 = r7.A0K
            r9.clear()
            X.0Az r0 = r7.A0W
            r47 = r0
            X.0Az r0 = r7.A0Y
            r46 = r0
            X.0Az r0 = r7.A0X
            r45 = r0
            X.0Az r0 = r7.A0S
            r44 = r0
            X.0UZ r13 = new X.0UZ
            r25 = r13
            r26 = r47
            r27 = r46
            r28 = r45
            r29 = r0
            r30 = r7
            r31 = r3
            r32 = r4
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r9.add(r13)
            r1 = 0
            r31 = 0
            r14 = 0
            r12 = 0
            if (r3 != 0) goto L_0x0210
        L_0x01be:
            if (r12 >= r8) goto L_0x0262
            r11 = r10[r12]
            int r25 = X.AnonymousClass0GI.A01(r11, r7, r4)
            java.lang.Integer[] r0 = r11.A0q
            r15 = r0[r1]
            java.lang.Integer r0 = X.C023109s.A0C
            if (r15 != r0) goto L_0x01d0
            int r31 = r31 + 1
        L_0x01d0:
            if (r14 == r4) goto L_0x01d9
            int r0 = r7.A0A
            int r0 = r0 + r14
            int r0 = r0 + r25
            if (r0 <= r4) goto L_0x01ff
        L_0x01d9:
            X.0Aq r0 = r13.A0G
            if (r0 == 0) goto L_0x01ff
        L_0x01dd:
            X.0UZ r13 = new X.0UZ
            r38 = 0
            r32 = r13
            r33 = r47
            r34 = r46
            r35 = r45
            r36 = r44
            r37 = r7
            r39 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r13.A0A = r12
            r9.add(r13)
        L_0x01f7:
            r14 = r25
        L_0x01f9:
            r13.A01(r11)
            int r12 = r12 + 1
            goto L_0x01be
        L_0x01ff:
            if (r12 <= 0) goto L_0x01f7
            int r0 = r7.A0E
            if (r0 <= 0) goto L_0x020a
            int r0 = r12 % r0
            if (r0 != 0) goto L_0x020a
            goto L_0x01dd
        L_0x020a:
            int r0 = r7.A0A
            int r0 = r0 + r25
            int r14 = r14 + r0
            goto L_0x01f9
        L_0x0210:
            if (r12 >= r8) goto L_0x0262
            r11 = r10[r12]
            int r25 = X.AnonymousClass0GI.A00(r11, r7, r4)
            java.lang.Integer[] r0 = r11.A0q
            r15 = r0[r2]
            java.lang.Integer r0 = X.C023109s.A0C
            if (r15 != r0) goto L_0x0222
            int r31 = r31 + 1
        L_0x0222:
            if (r14 == r4) goto L_0x022b
            int r0 = r7.A0H
            int r0 = r0 + r14
            int r0 = r0 + r25
            if (r0 <= r4) goto L_0x0251
        L_0x022b:
            X.0Aq r0 = r13.A0G
            if (r0 == 0) goto L_0x0251
        L_0x022f:
            X.0UZ r13 = new X.0UZ
            r32 = r13
            r33 = r47
            r34 = r46
            r35 = r45
            r36 = r44
            r37 = r7
            r38 = r3
            r39 = r4
            r32.<init>(r33, r34, r35, r36, r37, r38, r39)
            r13.A0A = r12
            r9.add(r13)
        L_0x0249:
            r14 = r25
        L_0x024b:
            r13.A01(r11)
            int r12 = r12 + 1
            goto L_0x0210
        L_0x0251:
            if (r12 <= 0) goto L_0x0249
            int r0 = r7.A0E
            if (r0 <= 0) goto L_0x025c
            int r0 = r12 % r0
            if (r0 != 0) goto L_0x025c
            goto L_0x022f
        L_0x025c:
            int r0 = r7.A0H
            int r0 = r0 + r25
            int r14 = r14 + r0
            goto L_0x024b
        L_0x0262:
            int r30 = r9.size()
            r43 = r45
            r42 = r44
            int r0 = r7.A07
            r29 = r0
            int r0 = r7.A06
            r28 = r0
            int r0 = r7.A08
            r27 = r0
            int r0 = r7.A03
            r26 = r0
            java.lang.Integer[] r10 = r7.A0q
            r0 = r10[r1]
            java.lang.Integer r8 = X.C023109s.A01
            if (r0 == r8) goto L_0x0287
            r0 = r10[r2]
            r10 = 0
            if (r0 != r8) goto L_0x0288
        L_0x0287:
            r10 = 1
        L_0x0288:
            if (r31 <= 0) goto L_0x028d
            r11 = 0
            if (r10 != 0) goto L_0x0353
        L_0x028d:
            r12 = 0
            r11 = 0
            r10 = 0
        L_0x0290:
            r0 = r30
            if (r10 >= r0) goto L_0x045c
            java.lang.Object r8 = r9.get(r10)
            X.0UZ r8 = (X.AnonymousClass0UZ) r8
            int r0 = r30 + -1
            if (r3 != 0) goto L_0x02f8
            if (r10 >= r0) goto L_0x02f1
            int r0 = r10 + 1
            java.lang.Object r0 = r9.get(r0)
            X.0UZ r0 = (X.AnonymousClass0UZ) r0
            X.0Aq r0 = r0.A0G
            X.0Az r0 = r0.A0Y
            r42 = r0
            r26 = 0
        L_0x02b0:
            X.0Aq r0 = r8.A0G
            X.0Az r13 = r0.A0S
            r8.A05 = r1
            r0 = r47
            r8.A0D = r0
            r0 = r46
            r8.A0F = r0
            r0 = r43
            r8.A0E = r0
            r0 = r42
            r8.A0C = r0
            r0 = r29
            r8.A07 = r0
            r0 = r28
            r8.A09 = r0
            r0 = r27
            r8.A08 = r0
            r0 = r26
            r8.A06 = r0
            r8.A03 = r4
            int r14 = r8.A0B
            X.0GI r0 = r8.A0H
            int r0 = r0.A0A
            int r11 = X.AnonymousClass001.A02(r14, r0, r11)
            int r0 = r8.A02
            int r12 = r12 + r0
            if (r10 <= 0) goto L_0x02ea
            int r0 = r7.A0H
            int r12 = r12 + r0
        L_0x02ea:
            r46 = r13
            r28 = 0
        L_0x02ee:
            int r10 = r10 + 1
            goto L_0x0290
        L_0x02f1:
            r42 = r44
            int r0 = r7.A03
            r26 = r0
            goto L_0x02b0
        L_0x02f8:
            if (r10 >= r0) goto L_0x034c
            int r0 = r10 + 1
            java.lang.Object r0 = r9.get(r0)
            X.0UZ r0 = (X.AnonymousClass0UZ) r0
            X.0Aq r0 = r0.A0G
            X.0Az r0 = r0.A0W
            r43 = r0
            r27 = 0
        L_0x030a:
            X.0Aq r0 = r8.A0G
            X.0Az r13 = r0.A0X
            r8.A05 = r3
            r0 = r47
            r8.A0D = r0
            r0 = r46
            r8.A0F = r0
            r0 = r43
            r8.A0E = r0
            r0 = r42
            r8.A0C = r0
            r0 = r29
            r8.A07 = r0
            r0 = r28
            r8.A09 = r0
            r0 = r27
            r8.A08 = r0
            r0 = r26
            r8.A06 = r0
            r8.A03 = r4
            int r0 = r8.A0B
            int r11 = r11 + r0
            int r14 = r8.A02
            if (r3 != r2) goto L_0x033e
            X.0GI r0 = r8.A0H
            int r0 = r0.A0H
            int r14 = r14 - r0
        L_0x033e:
            int r12 = java.lang.Math.max(r12, r14)
            if (r10 <= 0) goto L_0x0347
            int r0 = r7.A0A
            int r11 = r11 + r0
        L_0x0347:
            r47 = r13
            r29 = 0
            goto L_0x02ee
        L_0x034c:
            int r0 = r7.A08
            r27 = r0
            r43 = r45
            goto L_0x030a
        L_0x0353:
            r0 = r30
            if (r11 >= r0) goto L_0x028d
            java.lang.Object r8 = r9.get(r11)
            X.0UZ r8 = (X.AnonymousClass0UZ) r8
            int r0 = r8.A05
            if (r3 != 0) goto L_0x0452
            int r10 = r8.A0B
            if (r0 != 0) goto L_0x036a
            X.0GI r0 = r8.A0H
            int r0 = r0.A0A
        L_0x0369:
            int r10 = r10 - r0
        L_0x036a:
            int r35 = r4 - r10
            int r10 = r8.A04
            if (r10 == 0) goto L_0x044e
            int r0 = r8.A01
            r15 = r0
            int r35 = r35 / r10
            r10 = 0
        L_0x0376:
            if (r10 >= r15) goto L_0x03cf
            int r13 = r8.A0A
            int r14 = r13 + r10
            X.0GI r12 = r8.A0H
            int r0 = r12.A06
            if (r14 >= r0) goto L_0x03cf
            X.0Aq[] r0 = r12.A0O
            int r13 = r13 + r10
            r0 = r0[r13]
            int r13 = r8.A05
            if (r13 != 0) goto L_0x03ad
            if (r0 == 0) goto L_0x03aa
            java.lang.Integer[] r13 = r0.A0q
            r14 = r13[r1]
            java.lang.Integer r13 = X.C023109s.A0C
            if (r14 != r13) goto L_0x03aa
            int r13 = r0.A0D
            if (r13 != 0) goto L_0x03aa
            java.lang.Integer r33 = X.C023109s.A00
            java.lang.Integer[] r13 = r0.A0q
            r34 = r13[r2]
            int r36 = r0.A02()
            r32 = r0
            r31 = r12
            r31.A0K(r32, r33, r34, r35, r36)
        L_0x03aa:
            int r10 = r10 + 1
            goto L_0x0376
        L_0x03ad:
            if (r0 == 0) goto L_0x03aa
            java.lang.Integer[] r13 = r0.A0q
            r14 = r13[r2]
            java.lang.Integer r13 = X.C023109s.A0C
            if (r14 != r13) goto L_0x03aa
            int r13 = r0.A0C
            if (r13 != 0) goto L_0x03aa
            java.lang.Integer[] r13 = r0.A0q
            r38 = r13[r1]
            int r40 = r0.A03()
            java.lang.Integer r39 = X.C023109s.A00
            r36 = r12
            r37 = r0
            r41 = r35
            r36.A0K(r37, r38, r39, r40, r41)
            goto L_0x03aa
        L_0x03cf:
            r8.A0B = r1
            r8.A02 = r1
            r0 = 0
            r8.A0G = r0
            r8.A00 = r1
            int r0 = r8.A01
            r31 = r0
            r14 = 0
        L_0x03dd:
            r0 = r31
            if (r14 >= r0) goto L_0x044e
            int r13 = r8.A0A
            int r10 = r13 + r14
            X.0GI r12 = r8.A0H
            int r0 = r12.A06
            if (r10 >= r0) goto L_0x044e
            X.0Aq[] r0 = r12.A0O
            int r13 = r13 + r14
            r13 = r0[r13]
            int r0 = r8.A05
            if (r0 != 0) goto L_0x0421
            int r25 = r13.A03()
            int r15 = r12.A0A
            int r0 = r13.A0N
            r10 = r0
            r0 = 8
            if (r10 != r0) goto L_0x0402
            r15 = 0
        L_0x0402:
            int r0 = r8.A0B
            int r25 = r25 + r15
            int r0 = r0 + r25
            r8.A0B = r0
            int r0 = r8.A03
            int r10 = X.AnonymousClass0GI.A00(r13, r12, r0)
            X.0Aq r0 = r8.A0G
            if (r0 == 0) goto L_0x0418
            int r0 = r8.A00
            if (r0 >= r10) goto L_0x041e
        L_0x0418:
            r8.A0G = r13
            r8.A00 = r10
            r8.A02 = r10
        L_0x041e:
            int r14 = r14 + 1
            goto L_0x03dd
        L_0x0421:
            int r0 = r8.A03
            int r15 = X.AnonymousClass0GI.A01(r13, r12, r0)
            int r0 = r8.A03
            int r25 = X.AnonymousClass0GI.A00(r13, r12, r0)
            int r12 = r12.A0H
            int r0 = r13.A0N
            r10 = r0
            r0 = 8
            if (r10 != r0) goto L_0x0437
            r12 = 0
        L_0x0437:
            int r0 = r8.A02
            int r25 = r25 + r12
            int r0 = r0 + r25
            r8.A02 = r0
            X.0Aq r0 = r8.A0G
            if (r0 == 0) goto L_0x0447
            int r0 = r8.A00
            if (r0 >= r15) goto L_0x041e
        L_0x0447:
            r8.A0G = r13
            r8.A00 = r15
            r8.A0B = r15
            goto L_0x041e
        L_0x044e:
            int r11 = r11 + 1
            goto L_0x0353
        L_0x0452:
            int r10 = r8.A02
            if (r0 != r2) goto L_0x036a
            X.0GI r0 = r8.A0H
            int r0 = r0.A0H
            goto L_0x0369
        L_0x045c:
            r5[r1] = r11
            r5[r2] = r12
            goto L_0x0507
        L_0x0462:
            r6 = 1
            if (r8 == 0) goto L_0x0507
            java.util.ArrayList r11 = r7.A0K
            int r0 = r11.size()
            r15 = 0
            if (r0 != 0) goto L_0x0499
            X.0Az r9 = r7.A0W
            X.0Az r2 = r7.A0Y
            X.0Az r1 = r7.A0X
            X.0Az r0 = r7.A0S
            X.0UZ r14 = new X.0UZ
            r28 = r1
            r29 = r0
            r30 = r7
            r31 = r3
            r32 = r4
            r25 = r14
            r26 = r9
            r27 = r2
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r11.add(r14)
        L_0x048e:
            r1 = 0
        L_0x048f:
            if (r1 >= r8) goto L_0x04d7
            r0 = r10[r1]
            r14.A01(r0)
            int r1 = r1 + 1
            goto L_0x048f
        L_0x0499:
            java.lang.Object r14 = r11.get(r15)
            X.0UZ r14 = (X.AnonymousClass0UZ) r14
            r14.A00 = r15
            r0 = 0
            r14.A0G = r0
            r14.A0B = r15
            r14.A02 = r15
            r14.A0A = r15
            r14.A01 = r15
            r14.A04 = r15
            X.0Az r0 = r7.A0W
            r25 = r0
            X.0Az r13 = r7.A0Y
            X.0Az r12 = r7.A0X
            X.0Az r11 = r7.A0S
            int r9 = r7.A07
            int r2 = r7.A06
            int r1 = r7.A08
            int r0 = r7.A03
            r14.A05 = r3
            r3 = r25
            r14.A0D = r3
            r14.A0F = r13
            r14.A0E = r12
            r14.A0C = r11
            r14.A07 = r9
            r14.A09 = r2
            r14.A08 = r1
            r14.A06 = r0
            r14.A03 = r4
            goto L_0x048e
        L_0x04d7:
            int r2 = r14.A05
            int r1 = r14.A0B
            if (r2 != 0) goto L_0x04e2
            X.0GI r0 = r14.A0H
            int r0 = r0.A0A
            int r1 = r1 - r0
        L_0x04e2:
            r5[r15] = r1
            int r1 = r14.A02
            if (r2 != r6) goto L_0x04ed
            X.0GI r0 = r14.A0H
            int r0 = r0.A0H
            int r1 = r1 - r0
        L_0x04ed:
            r5[r6] = r1
            goto L_0x0507
        L_0x04f0:
            r9 = 0
        L_0x04f1:
            int[] r0 = r7.A0L
            if (r0 != 0) goto L_0x04f9
            int[] r0 = new int[r11]
            r7.A0L = r0
        L_0x04f9:
            if (r2 != 0) goto L_0x04fd
            if (r3 == r6) goto L_0x0501
        L_0x04fd:
            if (r9 != 0) goto L_0x050a
            if (r3 != 0) goto L_0x05b9
        L_0x0501:
            int[] r0 = r7.A0L
            r0[r12] = r9
            r0[r6] = r2
        L_0x0507:
            r0 = 0
            goto L_0x00f2
        L_0x050a:
            if (r3 != 0) goto L_0x05b9
        L_0x050c:
            float r1 = (float) r8
            float r0 = (float) r9
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r2 = (int) r0
        L_0x0515:
            X.0Aq[] r1 = r7.A0M
            r11 = 0
            if (r1 == 0) goto L_0x05ad
            int r0 = r1.length
            if (r0 < r9) goto L_0x05ad
            java.util.Arrays.fill(r1, r11)
        L_0x0520:
            X.0Aq[] r1 = r7.A0N
            if (r1 == 0) goto L_0x05a7
            int r0 = r1.length
            if (r0 < r2) goto L_0x05a7
            java.util.Arrays.fill(r1, r11)
        L_0x052a:
            r15 = 0
        L_0x052b:
            r14 = 0
            if (r15 < r9) goto L_0x0568
            r11 = 0
        L_0x052f:
            if (r11 >= r9) goto L_0x0544
            X.0Aq[] r0 = r7.A0M
            r1 = r0[r11]
            if (r1 == 0) goto L_0x0541
            if (r11 <= 0) goto L_0x053c
            int r0 = r7.A0A
            int r14 = r14 + r0
        L_0x053c:
            int r0 = X.AnonymousClass0GI.A01(r1, r7, r4)
            int r14 = r14 + r0
        L_0x0541:
            int r11 = r11 + 1
            goto L_0x052f
        L_0x0544:
            r13 = 0
            r11 = 0
        L_0x0546:
            if (r13 >= r2) goto L_0x055b
            X.0Aq[] r0 = r7.A0N
            r1 = r0[r13]
            if (r1 == 0) goto L_0x0558
            if (r13 <= 0) goto L_0x0553
            int r0 = r7.A0H
            int r11 = r11 + r0
        L_0x0553:
            int r0 = X.AnonymousClass0GI.A00(r1, r7, r4)
            int r11 = r11 + r0
        L_0x0558:
            int r13 = r13 + 1
            goto L_0x0546
        L_0x055b:
            r5[r12] = r14
            r5[r6] = r11
            if (r3 != 0) goto L_0x05b3
            if (r14 <= r4) goto L_0x0501
            if (r9 <= r6) goto L_0x0501
            int r9 = r9 + -1
            goto L_0x050c
        L_0x0568:
            if (r14 >= r2) goto L_0x05a4
            int r1 = r14 * r9
            int r1 = r1 + r15
            if (r3 != r6) goto L_0x0572
            int r1 = r15 * r2
            int r1 = r1 + r14
        L_0x0572:
            int r0 = r10.length
            if (r1 >= r0) goto L_0x05a1
            r13 = r10[r1]
            if (r13 == 0) goto L_0x05a1
            int r11 = X.AnonymousClass0GI.A01(r13, r7, r4)
            X.0Aq[] r1 = r7.A0M
            r0 = r1[r15]
            if (r0 == 0) goto L_0x058b
            r0 = r1[r15]
            int r0 = r0.A03()
            if (r0 >= r11) goto L_0x058d
        L_0x058b:
            r1[r15] = r13
        L_0x058d:
            int r11 = X.AnonymousClass0GI.A00(r13, r7, r4)
            X.0Aq[] r1 = r7.A0N
            r0 = r1[r14]
            if (r0 == 0) goto L_0x059f
            r0 = r1[r14]
            int r0 = r0.A02()
            if (r0 >= r11) goto L_0x05a1
        L_0x059f:
            r1[r14] = r13
        L_0x05a1:
            int r14 = r14 + 1
            goto L_0x0568
        L_0x05a4:
            int r15 = r15 + 1
            goto L_0x052b
        L_0x05a7:
            X.0Aq[] r0 = new X.C02500Aq[r2]
            r7.A0N = r0
            goto L_0x052a
        L_0x05ad:
            X.0Aq[] r0 = new X.C02500Aq[r9]
            r7.A0M = r0
            goto L_0x0520
        L_0x05b3:
            if (r11 <= r4) goto L_0x0501
            if (r2 <= r6) goto L_0x0501
            int r2 = r2 + -1
        L_0x05b9:
            float r1 = (float) r8
            float r0 = (float) r2
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r9 = (int) r0
            goto L_0x0515
        L_0x05c4:
            r1 = 0
            r0 = r48
            r0.setMeasuredDimension(r1, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.A0A(X.0GJ, int, int):void");
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public Flow(Context context) {
        super(context);
    }
}
