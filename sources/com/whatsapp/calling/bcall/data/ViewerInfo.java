package com.whatsapp.calling.bcall.data;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import com.whatsapp.jid.UserJid;

public final class ViewerInfo {
    public final UserJid userJid;

    public ViewerInfo(UserJid userJid2) {
        AnonymousClass00C.A0D(userJid2, 1);
        this.userJid = userJid2;
    }

    public final UserJid component1() {
        return this.userJid;
    }

    public final ViewerInfo copy(UserJid userJid2) {
        AnonymousClass00C.A0D(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ViewerInfo) && AnonymousClass00C.A0J(this.userJid, ((ViewerInfo) obj).userJid));
    }

    public int hashCode() {
        return this.userJid.hashCode();
    }

    public static /* synthetic */ ViewerInfo copy$default(ViewerInfo viewerInfo, UserJid userJid2, int i, Object obj) {
        if ((i & 1) != 0) {
            userJid2 = viewerInfo.userJid;
        }
        AnonymousClass00C.A0D(userJid2, 0);
        return new ViewerInfo(userJid2);
    }

    public final UserJid getUserJid() {
        return this.userJid;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ViewerInfo(userJid=");
        return AnonymousClass000.A0m(this.userJid, A0u);
    }
}
