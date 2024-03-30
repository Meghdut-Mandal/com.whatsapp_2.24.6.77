package com.whatsapp.calling.bcall.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C36421kH;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class AudienceInfo {
    public final int publisherCount;
    public final ArrayList publishers = AnonymousClass001.A0I();
    public final String sessionId;
    public final int viewerCount;
    public final ArrayList viewers = AnonymousClass001.A0I();

    public AudienceInfo(String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 1);
        this.sessionId = str;
        this.viewerCount = i;
        this.publisherCount = i2;
    }

    public static /* synthetic */ AudienceInfo copy$default(AudienceInfo audienceInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = audienceInfo.sessionId;
        }
        if ((i3 & 2) != 0) {
            i = audienceInfo.viewerCount;
        }
        if ((i3 & 4) != 0) {
            i2 = audienceInfo.publisherCount;
        }
        return audienceInfo.copy(str, i, i2);
    }

    public final void addPublisherInfo(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        this.publishers.add(new ViewerInfo(userJid));
    }

    public final void addViewerInfo(UserJid userJid) {
        AnonymousClass00C.A0D(userJid, 0);
        this.viewers.add(new ViewerInfo(userJid));
    }

    public final String component1() {
        return this.sessionId;
    }

    public final int component2() {
        return this.viewerCount;
    }

    public final int component3() {
        return this.publisherCount;
    }

    public final AudienceInfo copy(String str, int i, int i2) {
        AnonymousClass00C.A0D(str, 0);
        return new AudienceInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceInfo) {
                AudienceInfo audienceInfo = (AudienceInfo) obj;
                if (!(AnonymousClass00C.A0J(this.sessionId, audienceInfo.sessionId) && this.viewerCount == audienceInfo.viewerCount && this.publisherCount == audienceInfo.publisherCount)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.sessionId) + this.viewerCount) * 31) + this.publisherCount;
    }

    public final int getPublisherCount() {
        return this.publisherCount;
    }

    public final ArrayList getPublishers() {
        return this.publishers;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getViewerCount() {
        return this.viewerCount;
    }

    public final ArrayList getViewers() {
        return this.viewers;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AudienceInfo(sessionId='");
        A0u.append(this.sessionId);
        A0u.append("', viewerCount=");
        A0u.append(this.viewerCount);
        A0u.append(", viewers=");
        A0u.append(this.viewers);
        A0u.append(" broadcasterCount=");
        A0u.append(this.publisherCount);
        A0u.append(", broadcasters=");
        return AnonymousClass000.A0m(this.publishers, A0u);
    }
}
