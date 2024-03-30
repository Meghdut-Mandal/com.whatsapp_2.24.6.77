package X;

import java.io.Serializable;

/* renamed from: X.3un  reason: invalid class name and case insensitive filesystem */
public class C80103un implements Serializable {
    public static final long serialVersionUID = 1;
    public final int disappearingMessagesInitiator;
    public final long ephemeralSettingTimestamp;
    public final int expiration;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C80103un r7 = (C80103un) obj;
            return this.expiration == r7.expiration && this.disappearingMessagesInitiator == r7.disappearingMessagesInitiator && this.ephemeralSettingTimestamp == r7.ephemeralSettingTimestamp;
        }
        return false;
    }

    public int hashCode() {
        return C36321k7.A00(this.ephemeralSettingTimestamp, this.expiration * 31) + this.disappearingMessagesInitiator;
    }

    public C80103un(int i, long j, int i2) {
        this.expiration = i;
        this.ephemeralSettingTimestamp = j;
        this.disappearingMessagesInitiator = i2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("EphemeralInfo{expiration=");
        A0u.append(this.expiration);
        A0u.append(", ephemeralSettingTimestamp=");
        A0u.append(this.ephemeralSettingTimestamp);
        A0u.append(", disappearingMessagesInitiator=");
        A0u.append(this.disappearingMessagesInitiator);
        return AnonymousClass000.A0s(A0u);
    }
}
