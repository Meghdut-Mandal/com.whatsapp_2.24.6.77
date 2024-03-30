package com.whatsapp.voipcalling;

import X.AnonymousClass00C;
import X.AnonymousClass114;
import X.AnonymousClass116;
import android.os.Parcel;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;

public final class CallParticipant implements Parcelable, AnonymousClass114 {
    public static final Parcelable.Creator CREATOR = new AnonymousClass116();
    public final UserJid jid;
    public final String state;

    public CallParticipant(UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 1);
        this.jid = userJid;
        this.state = str;
    }

    public final UserJid component1() {
        return this.jid;
    }

    public final String component2() {
        return this.state;
    }

    public final CallParticipant copy(UserJid userJid, String str) {
        AnonymousClass00C.A0D(userJid, 0);
        return new CallParticipant(userJid, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CallParticipant) {
                CallParticipant callParticipant = (CallParticipant) obj;
                if (!AnonymousClass00C.A0J(this.jid, callParticipant.jid) || !AnonymousClass00C.A0J(this.state, callParticipant.state)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.jid.hashCode() * 31;
        String str = this.state;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallParticipant(jid=");
        sb.append(this.jid);
        sb.append(", state=");
        sb.append(this.state);
        sb.append(')');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeParcelable(this.jid, i);
        parcel.writeString(this.state);
    }

    public static /* synthetic */ CallParticipant copy$default(CallParticipant callParticipant, UserJid userJid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            userJid = callParticipant.jid;
        }
        if ((i & 2) != 0) {
            str = callParticipant.state;
        }
        AnonymousClass00C.A0D(userJid, 0);
        return new CallParticipant(userJid, str);
    }

    public boolean isCallConnected() {
        return "connected".equals(this.state);
    }

    public UserJid getCallUserJid() {
        return this.jid;
    }
}
