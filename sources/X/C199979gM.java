package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9gM  reason: invalid class name and case insensitive filesystem */
public final class C199979gM {
    public final AnonymousClass6V8 A00;
    public final AnonymousClass6V8 A01;
    public final AnonymousClass6V8 A02;
    public final AnonymousClass6V8 A03;
    public final AnonymousClass6V8 A04;
    public final AnonymousClass6V8 A05;
    public final AnonymousClass6V8 A06;
    public final AnonymousClass6V8 A07;
    public final AnonymousClass6V8 A08;
    public final AnonymousClass6V8 A09;
    public final AnonymousClass6V8 A0A;
    public final AnonymousClass6V8 A0B;
    public final AnonymousClass6V8 A0C;
    public final AnonymousClass6V8 A0D;
    public final AnonymousClass6V8 A0E;

    public C199979gM() {
        this((AnonymousClass6V8) null, (AnonymousClass6V8) null, 32767);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C199979gM) {
                C199979gM r5 = (C199979gM) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A07, r5.A07) || !AnonymousClass00C.A0J(this.A08, r5.A08) || !AnonymousClass00C.A0J(this.A0C, r5.A0C) || !AnonymousClass00C.A0J(this.A0D, r5.A0D) || !AnonymousClass00C.A0J(this.A0E, r5.A0E) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A09, r5.A09) || !AnonymousClass00C.A0J(this.A0A, r5.A0A) || !AnonymousClass00C.A0J(this.A0B, r5.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C199979gM(AnonymousClass6V8 r17, AnonymousClass6V8 r18, int i) {
        AnonymousClass6V8 r12;
        AnonymousClass6V8 r11;
        AnonymousClass6V8 r10;
        AnonymousClass6V8 r9;
        AnonymousClass6V8 r8;
        AnonymousClass6V8 r7;
        AnonymousClass6V8 r6;
        AnonymousClass6V8 r5;
        AnonymousClass6V8 r4;
        AnonymousClass6V8 r3;
        AnonymousClass6V8 r2;
        AnonymousClass6V8 r1;
        AnonymousClass6V8 r15 = r17;
        AnonymousClass6V8 r14 = r18;
        AnonymousClass6V8 r13 = null;
        int i2 = i;
        if ((i & 1) != 0) {
            r12 = AnonymousClass9BK.A03;
        } else {
            r12 = null;
        }
        if ((i & 2) != 0) {
            r11 = AnonymousClass9BK.A04;
        } else {
            r11 = null;
        }
        if ((i & 4) != 0) {
            r10 = AnonymousClass9BK.A05;
        } else {
            r10 = null;
        }
        if ((i & 8) != 0) {
            r9 = AnonymousClass9BK.A06;
        } else {
            r9 = null;
        }
        if ((i & 16) != 0) {
            r8 = AnonymousClass9BK.A07;
        } else {
            r8 = null;
        }
        if ((i & 32) != 0) {
            r7 = AnonymousClass9BK.A08;
        } else {
            r7 = null;
        }
        r15 = (i & 64) != 0 ? AnonymousClass9BK.A0C : r15;
        if ((i2 & 128) != 0) {
            r6 = AnonymousClass9BK.A0D;
        } else {
            r6 = null;
        }
        if ((i2 & 256) != 0) {
            r5 = AnonymousClass9BK.A0E;
        } else {
            r5 = null;
        }
        r14 = (i2 & 512) != 0 ? AnonymousClass9BK.A00 : r14;
        if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
            r4 = AnonymousClass9BK.A01;
        } else {
            r4 = null;
        }
        if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            r3 = AnonymousClass9BK.A02;
        } else {
            r3 = null;
        }
        if ((i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
            r2 = AnonymousClass9BK.A09;
        } else {
            r2 = null;
        }
        if ((i2 & DefaultCrypto.BUFFER_SIZE) != 0) {
            r1 = AnonymousClass9BK.A0A;
        } else {
            r1 = null;
        }
        r13 = (i2 & 16384) != 0 ? AnonymousClass9BK.A0B : r13;
        C36321k7.A1B(r12, r11, r10, r9, r8);
        C36321k7.A1C(r7, r15, r6, r5, r14);
        C36321k7.A15(r4, r3, r2);
        C36361kB.A1L(r1, r13);
        this.A03 = r12;
        this.A04 = r11;
        this.A05 = r10;
        this.A06 = r9;
        this.A07 = r8;
        this.A08 = r7;
        this.A0C = r15;
        this.A0D = r6;
        this.A0E = r5;
        this.A00 = r14;
        this.A01 = r4;
        this.A02 = r3;
        this.A09 = r2;
        this.A0A = r1;
        this.A0B = r13;
    }

    public int hashCode() {
        return C36401kF.A02(this.A0B, C36351kA.A05(this.A0A, C36351kA.A05(this.A09, C36351kA.A05(this.A02, C36351kA.A05(this.A01, C36351kA.A05(this.A00, C36351kA.A05(this.A0E, C36351kA.A05(this.A0D, C36351kA.A05(this.A0C, C36351kA.A05(this.A08, C36351kA.A05(this.A07, C36351kA.A05(this.A06, C36351kA.A05(this.A05, C36351kA.A05(this.A04, C36391kE.A0A(this.A03)))))))))))))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Typography(displayLarge=");
        A0u.append(this.A03);
        A0u.append(", displayMedium=");
        A0u.append(this.A04);
        A0u.append(",displaySmall=");
        A0u.append(this.A05);
        A0u.append(", headlineLarge=");
        A0u.append(this.A06);
        A0u.append(", headlineMedium=");
        A0u.append(this.A07);
        A0u.append(", headlineSmall=");
        A0u.append(this.A08);
        A0u.append(", titleLarge=");
        A0u.append(this.A0C);
        A0u.append(", titleMedium=");
        A0u.append(this.A0D);
        A0u.append(", titleSmall=");
        A0u.append(this.A0E);
        A0u.append(", bodyLarge=");
        A0u.append(this.A00);
        A0u.append(", bodyMedium=");
        A0u.append(this.A01);
        A0u.append(", bodySmall=");
        A0u.append(this.A02);
        A0u.append(", labelLarge=");
        A0u.append(this.A09);
        A0u.append(", labelMedium=");
        A0u.append(this.A0A);
        A0u.append(", labelSmall=");
        return AnonymousClass000.A0m(this.A0B, A0u);
    }
}
