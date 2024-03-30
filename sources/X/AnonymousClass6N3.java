package X;

import android.text.Layout;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6N3  reason: invalid class name */
public final class AnonymousClass6N3 {
    public char[] A00;
    public final Layout A01;
    public final List A02;
    public final List A03;
    public final boolean[] A04;

    private final int A00(int i, int i2) {
        while (i > i2) {
            char charAt = this.A01.getText().charAt(i - 1);
            if (!(charAt == ' ' || charAt == 10 || charAt == 5760)) {
                if (AnonymousClass00C.A00(charAt, DefaultCrypto.BUFFER_SIZE) < 0 || AnonymousClass00C.A00(charAt, 8202) > 0) {
                    if (!(charAt == 8287 || charAt == 12288)) {
                        break;
                    }
                } else if (charAt == 8199) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01d2, code lost:
        if (r4 == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d9, code lost:
        if (r4 == false) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r9 == X.C36351kA.A06(r12, r5)) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        if (r18.getRunCount() == 1) goto L_0x0109;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float A01(int r26, boolean r27, boolean r28) {
        /*
            r25 = this;
            r9 = r26
            r8 = r25
            if (r28 == 0) goto L_0x0017
            android.text.Layout r10 = r8.A01
            if (r26 > 0) goto L_0x012a
            r7 = 0
        L_0x000b:
            int r6 = r10.getLineStart(r7)
            int r2 = r10.getLineEnd(r7)
            if (r9 == r6) goto L_0x002b
            if (r9 == r2) goto L_0x002b
        L_0x0017:
            android.text.Layout r1 = r8.A01
            int r0 = r1.getLineForOffset(r9)
            int r0 = r1.getLineEnd(r0)
            if (r9 <= r0) goto L_0x0024
            r9 = r0
        L_0x0024:
            if (r27 == 0) goto L_0x0154
            float r0 = r1.getPrimaryHorizontal(r9)
            return r0
        L_0x002b:
            if (r26 == 0) goto L_0x0017
            java.lang.CharSequence r0 = r10.getText()
            int r0 = r0.length()
            if (r9 == r0) goto L_0x0017
            java.util.List r12 = r8.A03
            int r0 = X.C90514aH.A0I(r12, r9)
            int r1 = r0 + 1
            if (r0 >= 0) goto L_0x0042
            int r1 = -r1
        L_0x0042:
            if (r1 <= 0) goto L_0x0127
            int r5 = r1 + -1
            int r0 = X.C36351kA.A06(r12, r5)
            if (r9 != r0) goto L_0x0127
        L_0x004c:
            r0 = 0
            if (r5 == 0) goto L_0x0055
            int r0 = r5 + -1
            int r0 = X.C36351kA.A06(r12, r0)
        L_0x0055:
            int r0 = r10.getLineForOffset(r0)
            int r1 = r10.getParagraphDirection(r0)
            r0 = -1
            boolean r4 = X.AnonymousClass000.A1S(r1, r0)
            int r15 = r8.A00(r2, r6)
            r0 = 0
            if (r5 == 0) goto L_0x006f
            int r0 = r5 + -1
            int r0 = X.C36351kA.A06(r12, r0)
        L_0x006f:
            int r17 = r6 - r0
            int r16 = r15 - r0
            boolean[] r11 = r8.A04
            boolean r0 = r11[r5]
            if (r0 == 0) goto L_0x00bb
            java.util.List r0 = r8.A02
            java.lang.Object r3 = r0.get(r5)
            java.text.Bidi r3 = (java.text.Bidi) r3
        L_0x0081:
            if (r3 == 0) goto L_0x016c
            r1 = r17
            r0 = r16
            java.text.Bidi r14 = r3.createLineBidi(r1, r0)
            r13 = 1
            if (r14 == 0) goto L_0x016c
            int r0 = r14.getRunCount()
            if (r0 == r13) goto L_0x016c
            int r12 = r14.getRunCount()
            X.6As[] r11 = new X.C128066As[r12]
            r5 = 0
        L_0x009b:
            if (r5 >= r12) goto L_0x0159
            int r3 = r14.getRunStart(r5)
            int r3 = r3 + r6
            int r2 = r14.getRunLimit(r5)
            int r2 = r2 + r6
            int r0 = r14.getRunLevel(r5)
            int r0 = r0 % 2
            boolean r1 = X.AnonymousClass000.A1S(r0, r13)
            X.6As r0 = new X.6As
            r0.<init>(r3, r2, r1)
            r11[r5] = r0
            int r5 = r5 + 1
            goto L_0x009b
        L_0x00bb:
            r14 = 0
            if (r5 != 0) goto L_0x0120
            r13 = 0
        L_0x00bf:
            int r3 = X.C36351kA.A06(r12, r5)
            int r2 = r3 - r13
            char[] r1 = r8.A00
            if (r1 == 0) goto L_0x00cc
            int r0 = r1.length
            if (r0 >= r2) goto L_0x00ce
        L_0x00cc:
            char[] r1 = new char[r2]
        L_0x00ce:
            java.lang.CharSequence r0 = r10.getText()
            android.text.TextUtils.getChars(r0, r13, r3, r1, r14)
            boolean r3 = java.text.Bidi.requiresBidi(r1, r14, r2)
            r21 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0109
            r3 = 0
            if (r5 == 0) goto L_0x00e7
            int r3 = r5 + -1
            int r3 = X.C36351kA.A06(r12, r3)
        L_0x00e7:
            int r3 = r10.getLineForOffset(r3)
            int r12 = r10.getParagraphDirection(r3)
            r3 = -1
            boolean r24 = X.AnonymousClass000.A1S(r12, r3)
            java.text.Bidi r3 = new java.text.Bidi
            r20 = 0
            r22 = 0
            r19 = r1
            r23 = r2
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24)
            int r2 = r3.getRunCount()
            if (r2 != r0) goto L_0x010b
        L_0x0109:
            r3 = r21
        L_0x010b:
            java.util.List r2 = r8.A02
            r2.set(r5, r3)
            r11[r5] = r0
            if (r3 == 0) goto L_0x011c
            char[] r2 = r8.A00
            r0 = r1
            r1 = r2
            if (r0 != r2) goto L_0x011c
            r1 = r21
        L_0x011c:
            r8.A00 = r1
            goto L_0x0081
        L_0x0120:
            int r0 = r5 + -1
            int r13 = X.C36351kA.A06(r12, r0)
            goto L_0x00bf
        L_0x0127:
            r5 = r1
            goto L_0x004c
        L_0x012a:
            java.lang.CharSequence r0 = r10.getText()
            int r0 = r0.length()
            if (r9 < r0) goto L_0x013c
            int r0 = r10.getLineCount()
            int r7 = r0 + -1
            goto L_0x000b
        L_0x013c:
            int r7 = r10.getLineForOffset(r9)
            int r1 = r10.getLineStart(r7)
            int r0 = r10.getLineEnd(r7)
            if (r1 == r9) goto L_0x014e
            if (r0 == r9) goto L_0x014e
            goto L_0x000b
        L_0x014e:
            if (r1 != r9) goto L_0x000b
            int r7 = r7 + -1
            goto L_0x000b
        L_0x0154:
            float r0 = r1.getSecondaryHorizontal(r9)
            return r0
        L_0x0159:
            int r2 = r14.getRunCount()
            byte[] r3 = new byte[r2]
            r1 = 0
        L_0x0160:
            if (r1 >= r2) goto L_0x0181
            int r0 = r14.getRunLevel(r1)
            byte r0 = (byte) r0
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0160
        L_0x016c:
            boolean r0 = r10.isRtlCharAt(r6)
            if (r27 != 0) goto L_0x0174
            if (r4 != r0) goto L_0x0179
        L_0x0174:
            r0 = r4
            r4 = 0
            if (r0 != 0) goto L_0x0179
            r4 = 1
        L_0x0179:
            if (r9 != r6) goto L_0x017e
            if (r4 == 0) goto L_0x01db
            goto L_0x01a8
        L_0x017e:
            if (r4 != 0) goto L_0x01db
            goto L_0x01a8
        L_0x0181:
            r2 = 0
            java.text.Bidi.reorderVisually(r3, r2, r11, r2, r12)
            r1 = -1
            if (r9 == r6) goto L_0x01b0
            if (r9 <= r15) goto L_0x018e
            int r9 = r8.A00(r9, r6)
        L_0x018e:
            if (r2 >= r12) goto L_0x0197
            r0 = r11[r2]
            int r0 = r0.A00
            if (r0 != r9) goto L_0x01ad
            r1 = r2
        L_0x0197:
            r0 = r11[r1]
            if (r27 != 0) goto L_0x01a4
            boolean r0 = r0.A02
            if (r4 == r0) goto L_0x01a4
            r0 = r4
            r4 = 0
            if (r0 != 0) goto L_0x01a4
            r4 = 1
        L_0x01a4:
            if (r1 != 0) goto L_0x01d5
            if (r4 == 0) goto L_0x01d5
        L_0x01a8:
            float r0 = r10.getLineLeft(r7)
            return r0
        L_0x01ad:
            int r2 = r2 + 1
            goto L_0x018e
        L_0x01b0:
            if (r2 >= r12) goto L_0x01b9
            r0 = r11[r2]
            int r0 = r0.A01
            if (r0 != r9) goto L_0x01cb
            r1 = r2
        L_0x01b9:
            r0 = r11[r1]
            if (r27 != 0) goto L_0x01c1
            boolean r0 = r0.A02
            if (r4 != r0) goto L_0x01c6
        L_0x01c1:
            r0 = r4
            r4 = 0
            if (r0 != 0) goto L_0x01c6
            r4 = 1
        L_0x01c6:
            if (r1 != 0) goto L_0x01ce
            if (r4 == 0) goto L_0x01ce
            goto L_0x01a8
        L_0x01cb:
            int r2 = r2 + 1
            goto L_0x01b0
        L_0x01ce:
            int r0 = r12 + -1
            if (r1 != r0) goto L_0x01eb
            if (r4 != 0) goto L_0x01f8
            goto L_0x01db
        L_0x01d5:
            int r0 = r12 + -1
            if (r1 != r0) goto L_0x01e0
            if (r4 != 0) goto L_0x01e9
        L_0x01db:
            float r0 = r10.getLineRight(r7)
            return r0
        L_0x01e0:
            if (r4 != 0) goto L_0x01e9
            int r1 = r1 + 1
        L_0x01e4:
            r0 = r11[r1]
            int r0 = r0.A00
            goto L_0x01f3
        L_0x01e9:
            int r1 = r1 - r13
            goto L_0x01e4
        L_0x01eb:
            if (r4 != 0) goto L_0x01f8
            int r1 = r1 + 1
        L_0x01ef:
            r0 = r11[r1]
            int r0 = r0.A01
        L_0x01f3:
            float r0 = r10.getPrimaryHorizontal(r0)
            return r0
        L_0x01f8:
            int r1 = r1 - r13
            goto L_0x01ef
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6N3.A01(int, boolean, boolean):float");
    }

    public AnonymousClass6N3(Layout layout) {
        this.A01 = layout;
        ArrayList A0I = AnonymousClass001.A0I();
        int i = 0;
        do {
            int A09 = AnonymousClass099.A09(this.A01.getText(), 10, i, false);
            if (A09 < 0) {
                i = this.A01.getText().length();
            } else {
                i = A09 + 1;
            }
            AnonymousClass000.A1F(A0I, i);
        } while (i < this.A01.getText().length());
        this.A03 = A0I;
        int size = A0I.size();
        ArrayList A14 = C36441kJ.A14(size);
        for (int i2 = 0; i2 < size; i2++) {
            A14.add((Object) null);
        }
        this.A02 = A14;
        this.A04 = new boolean[A0I.size()];
        A0I.size();
    }
}
