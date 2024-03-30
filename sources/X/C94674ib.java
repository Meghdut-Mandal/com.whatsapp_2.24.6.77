package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.4ib  reason: invalid class name and case insensitive filesystem */
public final class C94674ib extends C109105Wh implements Iterable, AnonymousClass00W {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final String A07;
    public final List A08;
    public final List A09;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C94674ib)) {
                C94674ib r5 = (C94674ib) obj;
                if (!(AnonymousClass00C.A0J(this.A07, r5.A07) && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A05 == r5.A05 && this.A06 == r5.A06 && AnonymousClass00C.A0J(this.A09, r5.A09) && AnonymousClass00C.A0J(this.A08, r5.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A08, C36351kA.A05(this.A09, C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C90474aD.A02(C36421kH.A04(this.A07), this.A02), this.A00), this.A01), this.A03), this.A04), this.A05), this.A06)));
    }

    public Iterator iterator() {
        return new AnonymousClass76Q(this);
    }

    public C94674ib(String str, List list, List list2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A07 = str;
        this.A02 = f;
        this.A00 = f2;
        this.A01 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A09 = list;
        this.A08 = list2;
    }

    public C94674ib() {
        this("", C196389Zl.A00, C023409w.A00, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f);
    }
}
