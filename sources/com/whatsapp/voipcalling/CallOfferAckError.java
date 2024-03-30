package com.whatsapp.voipcalling;

import X.C18740tg;
import com.whatsapp.jid.UserJid;

public class CallOfferAckError {
    public final int errorCode;
    public final UserJid errorJid;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CallOfferAckError {errorJid=");
        sb.append(this.errorJid);
        sb.append(", errorCode=");
        sb.append(this.errorCode);
        sb.append('}');
        return sb.toString();
    }

    public CallOfferAckError(String str, int i) {
        UserJid A02 = UserJid.Companion.A02(str);
        C18740tg.A06(A02);
        this.errorJid = A02;
        this.errorCode = i;
    }
}
