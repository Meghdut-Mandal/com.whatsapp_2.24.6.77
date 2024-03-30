package com.whatsapp.voipcalling;

import X.AnonymousClass6EE;
import X.C110255aN;
import com.whatsapp.jid.UserJid;

public class CallLinkInfo {
    public static final String DEFAULT_CALL_LINK_CALL_ID = "default";
    public final UserJid creatorJid;
    public final int linkState;
    public AnonymousClass6EE self;
    public final String token;
    public final boolean videoEnabled;

    private void setSelfParticipantInfo(UserJid userJid, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, int i3, int i4, int i5, boolean z5, boolean z6) {
        this.self = new AnonymousClass6EE(userJid, i, true, false, false, false, false, i2, z, z2, z3, z4, i3, i4, i5, z5, z6, false, false, false, false, 0, 1, false, 0, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("token: ");
        sb.append(this.token);
        sb.append(", videoEnabled: ");
        sb.append(this.videoEnabled);
        sb.append(", linkState: ");
        sb.append(C110255aN.A00(this.linkState));
        return sb.toString();
    }

    public CallLinkInfo(int i, UserJid userJid, String str, boolean z) {
        this.linkState = i;
        this.creatorJid = userJid;
        this.token = str;
        this.videoEnabled = z;
    }

    public UserJid getCreatorJid() {
        return this.creatorJid;
    }

    public int getLinkState() {
        return this.linkState;
    }

    public AnonymousClass6EE getSelfInfo() {
        return this.self;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isVideoEnabled() {
        return this.videoEnabled;
    }
}
