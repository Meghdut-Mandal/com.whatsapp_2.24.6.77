package com.whatsapp.voipcalling;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;

public class CallParticipantJid {
    public final DeviceJid[] deviceJids;
    public final PhoneUserJid phoneUserJid;
    public final byte[] privacyToken;
    public final UserJid userJid;

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CallParticipantJid userJid=");
        sb.append(this.userJid);
        sb.append(", deviceJids=(");
        sb.append(Arrays.toString(this.deviceJids));
        sb.append(')');
        sb.append(", privacyToken=");
        if (this.privacyToken == null) {
            str = "missing";
        } else {
            str = "present";
        }
        sb.append(str);
        sb.append(", phoneUserJid=");
        sb.append(this.phoneUserJid);
        sb.append(')');
        return sb.toString();
    }

    public CallParticipantJid(UserJid userJid2, DeviceJid[] deviceJidArr, byte[] bArr) {
        this.userJid = userJid2;
        this.phoneUserJid = null;
        this.deviceJids = deviceJidArr;
        this.privacyToken = bArr;
    }

    public DeviceJid[] getDeviceJids() {
        return this.deviceJids;
    }

    public PhoneUserJid getPhoneUserJid() {
        return this.phoneUserJid;
    }

    public byte[] getPrivacyToken() {
        return this.privacyToken;
    }

    public UserJid getUserJid() {
        return this.userJid;
    }

    public CallParticipantJid(UserJid userJid2, byte[] bArr, DeviceJid[] deviceJidArr, PhoneUserJid phoneUserJid2) {
        this.userJid = userJid2;
        this.deviceJids = deviceJidArr;
        this.privacyToken = bArr;
        this.phoneUserJid = phoneUserJid2;
    }
}
