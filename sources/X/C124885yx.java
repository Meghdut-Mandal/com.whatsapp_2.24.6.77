package X;

import android.util.Pair;

/* renamed from: X.5yx  reason: invalid class name and case insensitive filesystem */
public final class C124885yx {
    public final int A00;
    public final Pair A01;
    public final Pair A02;
    public final C88704Ts A03;
    public final C120005qo A04;
    public final C157457cz A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public C124885yx(Pair pair, Pair pair2, C88704Ts r6, C120005qo r7, C157457cz r8, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        Object obj;
        Object obj2;
        if (pair.first == null || (obj = pair.second) == null || ((int[]) obj).length != 4 || pair2.first == null || (obj2 = pair2.second) == null || ((int[]) obj2).length != 4) {
            throw AnonymousClass001.A08("Currency symbol style is not set properly");
        }
        this.A09 = true;
        this.A08 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A0C = z;
        this.A07 = str3;
        this.A0A = z2;
        this.A0B = z3;
        this.A04 = r7;
        this.A01 = pair;
        this.A02 = pair2;
        this.A03 = r6;
        this.A05 = r8;
    }
}
