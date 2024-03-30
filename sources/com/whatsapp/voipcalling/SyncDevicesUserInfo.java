package com.whatsapp.voipcalling;

import X.C18740tg;
import com.whatsapp.jid.UserJid;

public class SyncDevicesUserInfo {
    public final UserJid jid;
    public final String phash;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SyncDevicesUserInfo {jid=");
        sb.append(this.jid);
        sb.append(", phash=");
        sb.append(this.phash);
        sb.append('}');
        return sb.toString();
    }

    public SyncDevicesUserInfo(String str, String str2) {
        UserJid A02 = UserJid.Companion.A02(str);
        C18740tg.A06(A02);
        this.jid = A02;
        this.phash = str2;
    }
}
