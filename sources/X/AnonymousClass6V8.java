package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.6V8  reason: invalid class name */
public final class AnonymousClass6V8 {
    public static final AnonymousClass6V8 A03;
    public final C129026Eq A00;
    public final AnonymousClass69J A01;
    public final AnonymousClass6FJ A02;

    static {
        long j = C133336Xx.A05;
        long j2 = AnonymousClass6WI.A01;
        A03 = new AnonymousClass6V8(new C129026Eq((C131236Og) null, (AnonymousClass6P5) null, (AnonymousClass6P7) null, Integer.MIN_VALUE, Integer.MIN_VALUE, 0, Integer.MIN_VALUE, j2), (AnonymousClass69J) null, new AnonymousClass6FJ((AnonymousClass6PD) null, (C109085Wf) null, (C129796Im) null, (AnonymousClass68R) null, (AnonymousClass68S) null, (AnonymousClass72W) null, (AnonymousClass75Q) null, (AnonymousClass68U) null, (C131366Ot) null, AnonymousClass6RG.A00(j), (AnonymousClass6TV) null, (String) null, j2, j2, j));
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6V8) {
                AnonymousClass6V8 r5 = (AnonymousClass6V8) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AnonymousClass6V8 A00(AnonymousClass69J r28, AnonymousClass6V8 r29, C129796Im r30, AnonymousClass72W r31, int i, long j, long j2, long j3) {
        long j4;
        AnonymousClass68R r37;
        AnonymousClass68S r36;
        String str;
        AnonymousClass68U r23;
        AnonymousClass6TV r26;
        AnonymousClass75Q r22;
        long j5;
        C131366Ot r24;
        AnonymousClass6PD r35;
        C131266Oj r12;
        C131276Ok r13;
        AnonymousClass6P5 r34;
        C131256Oi r0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = i;
        AnonymousClass69J r10 = r28;
        long j6 = j3;
        long j7 = j2;
        C129796Im r38 = r30;
        AnonymousClass72W r25 = r31;
        long j8 = j;
        C131246Oh r7 = null;
        AnonymousClass6V8 r9 = r29;
        if ((i & 1) != 0) {
            j4 = r9.A02.A0C.B9t();
        } else {
            j4 = 0;
        }
        if ((i & 2) != 0) {
            j8 = r9.A02.A01;
        }
        if ((i & 4) != 0) {
            r25 = r9.A02.A08;
        }
        if ((i & 8) != 0) {
            r37 = r9.A02.A06;
        } else {
            r37 = null;
        }
        if ((i & 16) != 0) {
            r36 = r9.A02.A07;
        } else {
            r36 = null;
        }
        if ((i & 32) != 0) {
            r38 = r9.A02.A05;
        }
        if ((i & 64) != 0) {
            str = r9.A02.A0E;
        } else {
            str = null;
        }
        if ((i6 & 128) != 0) {
            j7 = r9.A02.A02;
        }
        if ((i6 & 256) != 0) {
            r23 = r9.A02.A0A;
        } else {
            r23 = null;
        }
        if ((i6 & 512) != 0) {
            r26 = r9.A02.A0D;
        } else {
            r26 = null;
        }
        if ((i6 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r22 = r9.A02.A09;
        } else {
            r22 = null;
        }
        if ((i6 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            j5 = r9.A02.A00;
        } else {
            j5 = 0;
        }
        if ((i6 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            r24 = r9.A02.A0B;
        } else {
            r24 = null;
        }
        if ((i6 & DefaultCrypto.BUFFER_SIZE) != 0) {
            r35 = r9.A02.A03;
        } else {
            r35 = null;
        }
        if ((i6 & 16384) != 0) {
            r12 = new C131266Oj(r9.A00.A02);
        } else {
            r12 = null;
        }
        if ((i & 32768) != 0) {
            r13 = new C131276Ok(r9.A00.A03);
        } else {
            r13 = null;
        }
        if ((i & 65536) != 0) {
            j6 = r9.A00.A04;
        }
        if ((i & C132986Wc.A0F) != 0) {
            r34 = r9.A00.A06;
        } else {
            r34 = null;
        }
        if ((i & 262144) != 0) {
            r10 = r9.A01;
        }
        if ((i & 1048576) != 0) {
            r0 = new C131256Oi(r9.A00.A01);
        } else {
            r0 = null;
        }
        if ((i & 2097152) != 0) {
            r7 = new C131246Oh(r9.A00.A00);
        }
        AnonymousClass6FJ r14 = r9.A02;
        C161277mU r15 = r14.A0C;
        long B9t = r15.B9t();
        long j9 = C133336Xx.A01;
        if (j4 != B9t) {
            r15 = AnonymousClass6RG.A00(j4);
        }
        C131236Og r11 = null;
        AnonymousClass6FJ r152 = new AnonymousClass6FJ(r35, r14.A04, r38, r37, r36, r25, r22, r23, r24, r15, r26, str, j8, j7, j5);
        if (r12 != null) {
            i2 = r12.A00;
        } else {
            i2 = Integer.MIN_VALUE;
        }
        if (r13 != null) {
            i3 = r13.A00;
        } else {
            i3 = Integer.MIN_VALUE;
        }
        if (r10 != null) {
            r11 = r10.A00;
        }
        if (r0 != null) {
            i4 = r0.A00;
        } else {
            i4 = 0;
        }
        if (r7 != null) {
            i5 = r7.A00;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        return new AnonymousClass6V8(new C129026Eq(r11, r34, r9.A00.A07, i2, i3, i4, i5, j6), r10, r152);
    }

    public final AnonymousClass6V8 A01(AnonymousClass6V8 r4) {
        if (r4.equals(A03)) {
            return this;
        }
        return new AnonymousClass6V8(this.A00.A02(r4.A00), this.A02.A01(r4.A02));
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A02)) + AnonymousClass000.A0J(this.A01);
    }

    public AnonymousClass6V8(C129026Eq r1, AnonymousClass69J r2, AnonymousClass6FJ r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextStyle(color=");
        AnonymousClass6FJ r4 = this.A02;
        C161277mU r3 = r4.A0C;
        C90484aE.A1J(A0u, r3.B9t());
        AnonymousClass6FJ.A00(r4, r3, A0u);
        C90484aE.A1J(A0u, r4.A00);
        A0u.append(", textDecoration=");
        A0u.append(r4.A0B);
        A0u.append(", shadow=");
        A0u.append(r4.A03);
        A0u.append(", drawStyle=");
        A0u.append(r4.A04);
        A0u.append(", textAlign=");
        C129026Eq r1 = this.A00;
        C129026Eq.A01(r1, A0u);
        A0u.append(this.A01);
        C90474aD.A1M(A0u, ", lineHeightStyle=");
        C129026Eq.A00(r1, A0u);
        return AnonymousClass000.A0m(r1.A07, A0u);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6V8(X.C129026Eq r3, X.AnonymousClass6FJ r4) {
        /*
            r2 = this;
            X.6Og r1 = r3.A05
            if (r1 != 0) goto L_0x0009
            r0 = 0
        L_0x0005:
            r2.<init>(r3, r0, r4)
            return
        L_0x0009:
            X.69J r0 = new X.69J
            r0.<init>(r1)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V8.<init>(X.6Eq, X.6FJ):void");
    }
}
