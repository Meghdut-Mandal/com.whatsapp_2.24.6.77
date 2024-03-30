package X;

import android.graphics.Paint;
import android.text.Layout;
import java.util.List;

/* renamed from: X.6FW  reason: invalid class name */
public final class AnonymousClass6FW {
    public final float A00;
    public final float A01;
    public final long A02;
    public final AnonymousClass6NL A03;
    public final C128796Dq A04;
    public final List A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6FW) {
                AnonymousClass6FW r8 = (AnonymousClass6FW) obj;
                if (!AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A03, r8.A03) || this.A02 != r8.A02 || this.A00 != r8.A00 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A05, r8.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00(int i) {
        AnonymousClass6NL r0 = this.A03;
        AnonymousClass6NL.A00(r0, i);
        List list = r0.A04;
        AnonymousClass6DO r2 = (AnonymousClass6DO) list.get(AnonymousClass6GC.A01(list, i));
        C160567lD r1 = r2.A06;
        return ((C138016h8) r1).A01.A03(i - r2.A03) + r2.A01;
    }

    public final int A01(float f) {
        int i;
        AnonymousClass6NL r7 = this.A03;
        if (f > 0.0f) {
            int i2 = (f > r7.A00 ? 1 : (f == r7.A00 ? 0 : -1));
            List list = r7.A04;
            if (i2 < 0) {
                int size = list.size() - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > size) {
                        i = -(i3 + 1);
                        break;
                    }
                    i = (i3 + size) >>> 1;
                    AnonymousClass6DO r1 = (AnonymousClass6DO) list.get(i);
                    if (r1.A01 <= f) {
                        if (r1.A00 > f) {
                            break;
                        }
                        i3 = i + 1;
                    } else {
                        size = i - 1;
                    }
                }
            } else {
                AnonymousClass00C.A0D(list, 0);
                i = C36431kI.A07(list);
            }
        } else {
            i = 0;
        }
        AnonymousClass6DO r3 = (AnonymousClass6DO) r7.A04.get(i);
        if (r3.A04 - r3.A05 == 0) {
            return r3.A03;
        }
        C160567lD r12 = r3.A06;
        float f2 = f - r3.A01;
        AnonymousClass6WP r0 = ((C138016h8) r12).A01;
        return r0.A08.getLineForVertical(((int) f2) - r0.A05) + r3.A03;
    }

    public final int A02(int i) {
        int A002;
        AnonymousClass6NL r2 = this.A03;
        if (i >= r2.A03.A00.length()) {
            List list = r2.A04;
            AnonymousClass00C.A0D(list, 0);
            A002 = C36431kI.A07(list);
        } else if (i < 0) {
            A002 = 0;
        } else {
            A002 = AnonymousClass6GC.A00(r2.A04, i);
        }
        AnonymousClass6DO r4 = (AnonymousClass6DO) r2.A04.get(A002);
        C160567lD r3 = r4.A06;
        int i2 = r4.A05;
        return ((C138016h8) r3).A01.A08.getLineForOffset(C15040mb.A02(i, i2, r4.A04) - i2) + r4.A03;
    }

    public final int A03(int i) {
        AnonymousClass6NL r0 = this.A03;
        AnonymousClass6NL.A00(r0, i);
        List list = r0.A04;
        AnonymousClass6DO r2 = (AnonymousClass6DO) list.get(AnonymousClass6GC.A01(list, i));
        C160567lD r1 = r2.A06;
        return ((C138016h8) r1).A01.A08.getLineStart(i - r2.A03) + r2.A05;
    }

    public final Integer A04(int i) {
        int A002;
        AnonymousClass6NL r2 = this.A03;
        if (i >= 0) {
            AnonymousClass72L r1 = r2.A03.A00;
            if (i <= r1.A00.length()) {
                int length = r1.length();
                List list = r2.A04;
                if (i == length) {
                    AnonymousClass00C.A0D(list, 0);
                    A002 = C36431kI.A07(list);
                } else {
                    A002 = AnonymousClass6GC.A00(list, i);
                }
                AnonymousClass6DO r0 = (AnonymousClass6DO) list.get(A002);
                C160567lD r3 = r0.A06;
                int i2 = r0.A05;
                int A022 = C15040mb.A02(i, i2, r0.A04) - i2;
                Layout layout = ((C138016h8) r3).A01.A08;
                if (layout.getParagraphDirection(layout.getLineForOffset(A022)) == 1) {
                    return C023109s.A00;
                }
                return C023109s.A01;
            }
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("offset(");
        A0u.append(i);
        A0u.append(") is out of bounds [0, ");
        A0u.append(r2.A03.A00.length());
        A0u.append(']');
        throw AnonymousClass000.A0b(A0u);
    }

    public int hashCode() {
        return C36401kF.A02(this.A05, C90474aD.A02(C90474aD.A02(C36321k7.A00(this.A02, C36351kA.A05(this.A03, C36391kE.A0A(this.A04))), this.A00), this.A01));
    }

    public AnonymousClass6FW(AnonymousClass6NL r6, C128796Dq r7, long j) {
        float lineBaseline;
        float f;
        Paint.FontMetricsInt fontMetricsInt;
        this.A04 = r7;
        this.A03 = r6;
        this.A02 = j;
        List list = r6.A04;
        this.A00 = !list.isEmpty() ? ((AnonymousClass6DO) C36391kE.A0t(list)).A06.BBs() : 0.0f;
        if (list.isEmpty()) {
            f = 0.0f;
        } else {
            AnonymousClass6DO r4 = (AnonymousClass6DO) C007103b.A0N(list);
            AnonymousClass6WP r3 = ((C138016h8) r4.A06).A01;
            int i = r3.A04 - 1;
            float f2 = (float) r3.A05;
            if (i != i || (fontMetricsInt = r3.A06) == null) {
                lineBaseline = (float) r3.A08.getLineBaseline(i);
            } else {
                lineBaseline = r3.A03(i) - ((float) fontMetricsInt.ascent);
            }
            f = f2 + lineBaseline + r4.A01;
        }
        this.A01 = f;
        this.A05 = r6.A05;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextLayoutResult(layoutInput=");
        A0u.append(this.A04);
        A0u.append(", multiParagraph=");
        A0u.append(this.A03);
        A0u.append(", size=");
        long j = this.A02;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append(C90494aF.A08(j));
        A0u2.append(" x ");
        A0u.append(C36381kD.A10(A0u2, C90474aD.A03(j)));
        A0u.append(", firstBaseline=");
        A0u.append(this.A00);
        A0u.append(", lastBaseline=");
        A0u.append(this.A01);
        A0u.append(", placeholderRects=");
        return AnonymousClass000.A0m(this.A05, A0u);
    }
}
