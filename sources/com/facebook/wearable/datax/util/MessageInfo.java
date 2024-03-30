package com.facebook.wearable.datax.util;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C36351kA;

public final class MessageInfo {
    public final int channelId;
    public final boolean complete;
    public final int errorId;
    public final boolean hasError;
    public final boolean hasExtension;
    public final boolean isClosed;
    public final int len;
    public final int messageType;
    public final int serviceId;
    public final boolean setService;
    public final boolean setType;
    public final boolean valid;

    public MessageInfo(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2, int i3, int i4, int i5) {
        this.valid = z;
        this.complete = z2;
        this.hasExtension = z3;
        this.setService = z4;
        this.setType = z5;
        this.hasError = z6;
        this.isClosed = z7;
        this.len = i;
        this.channelId = i2;
        this.serviceId = i3;
        this.messageType = i4;
        this.errorId = i5;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final boolean getHasError() {
        return this.hasError;
    }

    public final boolean getHasExtension() {
        return this.hasExtension;
    }

    public final int getLen() {
        return this.len;
    }

    public final int getMessageType() {
        return this.messageType;
    }

    public final int getServiceId() {
        return this.serviceId;
    }

    public final boolean getSetService() {
        return this.setService;
    }

    public final boolean getSetType() {
        return this.setType;
    }

    public final boolean getValid() {
        return this.valid;
    }

    public final boolean isClosed() {
        return this.isClosed;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(10);
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("\tValid: ");
        A0u2.append(this.valid);
        C36351kA.A1K(A0u2, A0u);
        A0u.append(10);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("\tComplete: ");
        A0u3.append(this.complete);
        C36351kA.A1K(A0u3, A0u);
        A0u.append(10);
        StringBuilder A0u4 = AnonymousClass000.A0u();
        A0u4.append("\tClosed: ");
        A0u4.append(this.isClosed);
        C36351kA.A1K(A0u4, A0u);
        A0u.append(10);
        StringBuilder A0u5 = AnonymousClass000.A0u();
        A0u5.append("\tChannel Id: ");
        A0u5.append(this.channelId);
        C36351kA.A1K(A0u5, A0u);
        A0u.append(10);
        StringBuilder A0u6 = AnonymousClass000.A0u();
        A0u6.append("\tService: ");
        A0u6.append(this.serviceId);
        C36351kA.A1K(A0u6, A0u);
        A0u.append(10);
        if (this.hasError) {
            StringBuilder A0u7 = AnonymousClass000.A0u();
            A0u7.append("\tError Id: ");
            A0u7.append(this.errorId);
            C36351kA.A1K(A0u7, A0u);
            A0u.append(10);
        }
        StringBuilder A0u8 = AnonymousClass000.A0u();
        A0u8.append("\tMessage Type: ");
        A0u8.append(this.messageType);
        C36351kA.A1K(A0u8, A0u);
        A0u.append(10);
        StringBuilder A0u9 = AnonymousClass000.A0u();
        A0u9.append("\tLength: ");
        A0u9.append(this.len);
        C36351kA.A1K(A0u9, A0u);
        String A0t = AnonymousClass000.A0t(A0u, 10);
        AnonymousClass00C.A08(A0t);
        return A0t;
    }
}
