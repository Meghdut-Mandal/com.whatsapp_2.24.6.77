package X;

import android.text.Layout;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6NL  reason: invalid class name */
public final class AnonymousClass6NL {
    public final float A00;
    public final float A01;
    public final int A02;
    public final C138026h9 A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final int A07;

    public AnonymousClass6NL(C138026h9 r23, int i, long j, boolean z) {
        boolean z2;
        AnonymousClass6QC r0;
        float BCO;
        int i2;
        C138026h9 r4 = r23;
        this.A03 = r4;
        this.A07 = i;
        long j2 = j;
        if (Constraints.A03(j2) == 0 && Constraints.A02(j2) == 0) {
            ArrayList A0I = AnonymousClass001.A0I();
            List list = r4.A01;
            int size = list.size();
            int i3 = 0;
            int i4 = 0;
            float f = 0.0f;
            while (true) {
                if (i3 >= size) {
                    z2 = false;
                    break;
                }
                C128056Ar r10 = (C128056Ar) list.get(i3);
                C159897k6 r11 = r10.A02;
                int A012 = Constraints.A01(j2);
                boolean A1P = AnonymousClass000.A1P(Constraints.A04(j2, (int) (j & 3)));
                int A002 = Constraints.A00(j2);
                if (A1P && (A002 = A002 - C90514aH.A04(f)) < 0) {
                    A002 = 0;
                }
                long A003 = C132746Vb.A00(0, A012, 0, A002);
                AnonymousClass00C.A0E(r11, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
                C138016h8 r16 = new C138016h8((C138036hA) r11, this.A07 - i4, A003, z);
                BCO = f + r16.BCO();
                AnonymousClass6WP r112 = r16.A01;
                i2 = i4 + r112.A04;
                A0I.add(new AnonymousClass6DO(r16, f, BCO, r10.A01, r10.A00, i4, i2));
                if (r112.A0A) {
                    break;
                }
                if (i2 == this.A07) {
                    List list2 = this.A03.A01;
                    AnonymousClass00C.A0D(list2, 0);
                    if (i3 != C36431kI.A07(list2)) {
                        break;
                    }
                }
                i3++;
                i4 = i2;
                f = BCO;
            }
            i4 = i2;
            f = BCO;
            z2 = true;
            this.A00 = f;
            this.A02 = i4;
            this.A06 = z2;
            this.A04 = A0I;
            this.A01 = (float) Constraints.A01(j2);
            ArrayList A0v = C36401kF.A0v(A0I);
            int size2 = A0I.size();
            for (int i5 = 0; i5 < size2; i5++) {
                AnonymousClass6DO r12 = (AnonymousClass6DO) A0I.get(i5);
                List list3 = ((C138016h8) r12.A06).A04;
                ArrayList A0r = C36361kB.A0r(list3);
                int size3 = list3.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    AnonymousClass6QC r15 = (AnonymousClass6QC) list3.get(i6);
                    if (r15 != null) {
                        long A0B = C90464aC.A0B(0.0f, r12.A01);
                        long j3 = C133206Xf.A03;
                        r0 = r15.A02(A0B);
                    } else {
                        r0 = null;
                    }
                    A0r.add(r0);
                }
                AnonymousClass03Y.A0B(A0r, A0v);
            }
            if (A0v.size() < this.A03.A02.size()) {
                int size4 = this.A03.A02.size() - A0v.size();
                ArrayList A14 = C36441kJ.A14(size4);
                for (int i7 = 0; i7 < size4; i7++) {
                    A14.add((Object) null);
                }
                A0v = C007103b.A0S(A14, A0v);
            }
            this.A05 = A0v;
            return;
        }
        throw AnonymousClass001.A08("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
    }

    public static final void A00(AnonymousClass6NL r2, int i) {
        if (i < 0 || i >= r2.A02) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("lineIndex(");
            A0u.append(i);
            A0u.append(") is out of bounds [0, ");
            throw AnonymousClass001.A08(C36321k7.A0G(A0u, r2.A02));
        }
    }

    public final int A01(int i) {
        int length;
        A00(this, i);
        List list = this.A04;
        AnonymousClass6DO r2 = (AnonymousClass6DO) list.get(AnonymousClass6GC.A01(list, i));
        C160567lD r1 = r2.A06;
        int i2 = i - r2.A03;
        Layout layout = ((C138016h8) r1).A01.A08;
        if (layout.getEllipsisStart(i2) == 0) {
            length = layout.getLineEnd(i2);
        } else {
            length = layout.getText().length();
        }
        return length + r2.A05;
    }
}
