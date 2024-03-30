package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.6Dm  reason: invalid class name and case insensitive filesystem */
public final class C128756Dm {
    public final C160377ku A00;
    public final C160377ku A01;
    public final C160377ku A02;
    public final C160377ku A03;
    public final String A04;
    public final Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128756Dm) {
                C128756Dm r5 = (C128756Dm) obj;
                if (!AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A07 != r5.A07 || this.A08 != r5.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((C36351kA.A05(this.A00, C36421kH.A04(this.A04)) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + AnonymousClass000.A0H(this.A06)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + C36411kG.A09(this.A01)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A08 ? 1 : 0);
    }

    public C128756Dm(C160377ku r1, C160377ku r2, C160377ku r3, C160377ku r4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = r4;
        this.A07 = z;
        this.A08 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ScopedBloksComponentQueryDefinition(id=");
        A0u.append(this.A04);
        A0u.append(", appIdExpression=");
        A0u.append(this.A00);
        A0u.append(", paramsExpression=");
        A0u.append(this.A03);
        A0u.append(", clientParamsExpression=");
        A0u.append(this.A02);
        A0u.append(", dependencies=");
        A0u.append(this.A06);
        A0u.append(", targets=");
        A0u.append(this.A05);
        A0u.append(", cacheTTLExpression=");
        A0u.append(this.A01);
        A0u.append(", isDiskCacheEnabled=");
        A0u.append(this.A07);
        A0u.append(", isScoped=");
        return C36321k7.A0H(A0u, this.A08);
    }
}
