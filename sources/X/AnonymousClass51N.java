package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.51N  reason: invalid class name */
public final class AnonymousClass51N extends AnonymousClass5EL {
    public final int A00;
    public final LatLng A01;
    public final C159367jF A02;
    public final AnonymousClass7gC A03;
    public final C144416s9 A04;
    public final boolean A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass51N(com.google.android.gms.maps.model.LatLng r12, X.C159367jF r13, X.AnonymousClass7gC r14, X.C144416s9 r15, int r16, boolean r17) {
        /*
            r11 = this;
            r10 = 1
            r5 = 0
            r0 = 7
            r4 = r14
            X.AnonymousClass00C.A0D(r14, r0)
            r7 = 74
            r1 = r11
            r2 = r12
            r3 = r13
            r6 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A00 = r8
            r11.A05 = r9
            r11.A01 = r12
            r11.A04 = r15
            r11.A02 = r13
            r11.A03 = r14
            r0 = 0
            r11.A03 = r0
            r11.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51N.<init>(com.google.android.gms.maps.model.LatLng, X.7jF, X.7gC, X.6s9, int, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51N) {
                AnonymousClass51N r5 = (AnonymousClass51N) obj;
                if (this.A00 != r5.A00 || this.A05 != r5.A05 || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        LatLng latLng = this.A01;
        return (C36351kA.A05(this.A03, C36351kA.A05(this.A02, C36351kA.A05(this.A04, (C36351kA.A05(latLng, ((this.A00 * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + 1231) * 31))) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MapViewBusinessProfileListItem(wamLocationType=");
        A0u.append(this.A00);
        A0u.append(", shouldShowDistance=");
        A0u.append(this.A05);
        A0u.append(", userLocation=");
        A0u.append(this.A01);
        C90484aE.A1K(A0u, ", shouldShowProductImages=");
        A0u.append(", businessProfile=");
        A0u.append(this.A04);
        A0u.append(", onClickProfileListener=");
        A0u.append(this.A02);
        A0u.append(", businessProfileSyncListener=");
        A0u.append(this.A03);
        C90474aD.A1M(A0u, ", rankingAnalyticsFieldProvider=");
        A0u.append(", isRecentSearchBusiness=");
        return C36321k7.A0H(A0u, false);
    }
}
