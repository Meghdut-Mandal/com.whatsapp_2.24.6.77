package X;

import java.util.ArrayList;

/* renamed from: X.3KQ  reason: invalid class name */
public final class AnonymousClass3KQ {
    public final C52212p4 A00;
    public final C52222p5 A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final ArrayList A07 = AnonymousClass001.A0I();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KQ) {
                AnonymousClass3KQ r5 = (AnonymousClass3KQ) obj;
                if (this.A01 != r5.A01 || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A06, r5.A06) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((AnonymousClass000.A0H(this.A01) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36341k9.A09(this.A06)) * 31) + C36341k9.A09(this.A03)) * 31) + C36341k9.A09(this.A04)) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36421kH.A05(this.A05);
    }

    public AnonymousClass3KQ(C52212p4 r2, C52222p5 r3, Integer num, String str, String str2, String str3, String str4) {
        this.A01 = r3;
        this.A00 = r2;
        this.A06 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A02 = num;
        this.A05 = str4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BotPluginMetadata(provider=");
        A0u.append(this.A01);
        A0u.append(", pluginType=");
        A0u.append(this.A00);
        A0u.append(", thumbnailCdnUrl=");
        A0u.append(this.A06);
        A0u.append(", profilePhotoCdnUrl=");
        A0u.append(this.A03);
        A0u.append(", searchProviderUrl=");
        A0u.append(this.A04);
        A0u.append(", referenceIndex=");
        A0u.append(this.A02);
        A0u.append(", searchQuery=");
        return C36321k7.A0E(this.A05, A0u);
    }
}
