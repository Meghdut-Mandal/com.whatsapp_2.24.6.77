package X;

/* renamed from: X.3KG  reason: invalid class name */
public final class AnonymousClass3KG {
    public C87374On A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final C55592us A04;
    public final C87374On A05;
    public final C87374On A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KG) {
                AnonymousClass3KG r8 = (AnonymousClass3KG) obj;
                if (this.A03 != r8.A03 || this.A02 != r8.A02 || this.A01 != r8.A01 || !AnonymousClass00C.A0J(this.A04, r8.A04) || !AnonymousClass00C.A0J(this.A00, r8.A00) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A06, r8.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A08 = AnonymousClass000.A08(this.A03) * 31;
        return ((((C36351kA.A05(this.A04, ((C36321k7.A00(this.A02, A08) * 31) + this.A01) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + C36411kG.A09(this.A06);
    }

    public AnonymousClass3KG(C55592us r1, C87374On r2, C87374On r3, C87374On r4, int i, long j, long j2) {
        this.A03 = j;
        this.A02 = j2;
        this.A01 = i;
        this.A04 = r1;
        this.A00 = r2;
        this.A05 = r3;
        this.A06 = r4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AsyncBannerData(businessProfile=");
        A0u.append((Object) null);
        A0u.append(", merchantAccountInfoData=");
        A0u.append((Object) null);
        A0u.append(", totalExternalStorageSize=");
        A0u.append(this.A03);
        A0u.append(", availableExternalStorageSize=");
        A0u.append(this.A02);
        A0u.append(", linkedDeviceNumberInSmbApp=");
        A0u.append(0);
        A0u.append(", maxAllowedLinkedDevices=");
        A0u.append(this.A01);
        A0u.append(", subscriptionBannerData=");
        A0u.append(this.A04);
        A0u.append(", bannerQp=");
        A0u.append(this.A00);
        A0u.append(", groupsPrivacyTipQP=");
        A0u.append(this.A05);
        A0u.append(", profilePrivacyTipQP=");
        return AnonymousClass000.A0m(this.A06, A0u);
    }
}
