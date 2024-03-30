package X;

import com.whatsapp.voipcalling.CallInfo;
import java.util.UUID;

/* renamed from: X.6Dh  reason: invalid class name and case insensitive filesystem */
public final class C128706Dh {
    public boolean A00 = false;
    public boolean A01 = false;
    public boolean A02;
    public final int A03;
    public final int A04;
    public final CallInfo A05;
    public final String A06;
    public final UUID A07;

    public C128706Dh(CallInfo callInfo, String str, UUID uuid, int i, int i2, boolean z) {
        this.A07 = uuid;
        this.A06 = str;
        this.A05 = callInfo;
        this.A04 = i;
        this.A03 = i2;
        this.A02 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128706Dh) {
                C128706Dh r5 = (C128706Dh) obj;
                if (!(AnonymousClass00C.A0J(this.A07, r5.A07) && AnonymousClass00C.A0J(this.A06, r5.A06) && AnonymousClass00C.A0J(this.A05, r5.A05) && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((C36391kE.A0A(this.A07) + C36341k9.A09(this.A06)) * 31) + C36411kG.A09(this.A05)) * 31) + this.A04) * 31) + this.A03) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + C36341k9.A01(this.A00 ? 1 : 0)) * 31) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CurrentSessionInfo(sessionId=");
        A0u.append(this.A07);
        A0u.append(", callRandomId=");
        A0u.append(this.A06);
        A0u.append(", activeCallInfo=");
        A0u.append(this.A05);
        A0u.append(", uiSurface=");
        A0u.append(this.A04);
        A0u.append(", subSurface=");
        A0u.append(this.A03);
        A0u.append(", shouldLogUserJourney=");
        A0u.append(this.A02);
        A0u.append(", hasLoggedFilterEvent=");
        A0u.append(this.A00);
        A0u.append(", hasLoggedSearchTermChangedEvent=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
