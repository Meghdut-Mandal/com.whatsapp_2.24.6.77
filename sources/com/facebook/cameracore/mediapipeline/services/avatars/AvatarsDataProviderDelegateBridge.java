package com.facebook.cameracore.mediapipeline.services.avatars;

import X.AnonymousClass00C;
import X.AnonymousClass527;
import X.AnonymousClass7d4;
import X.C117845mv;
import X.C148466yu;

public class AvatarsDataProviderDelegateBridge {
    public final C117845mv mDelegate;

    public void onLoadFailure(String str) {
        C117845mv r2 = this.mDelegate;
        AnonymousClass7d4 r0 = r2.A00;
        if (r0 != null) {
            ((C148466yu) r0).A04.resumeWith(AnonymousClass00C.A02(AnonymousClass527.A00));
        }
        r2.A00 = null;
    }

    public void onLoadSuccess(String str) {
        C117845mv r2 = this.mDelegate;
        AnonymousClass7d4 r1 = r2.A00;
        if (r1 != null) {
            ((C148466yu) r1).A01 = true;
        }
        r2.A00 = null;
    }

    public AvatarsDataProviderDelegateBridge(C117845mv r1) {
        this.mDelegate = r1;
    }

    public String getPersonalAvatarUriOverride() {
        return null;
    }

    public void onInitialAvatarColorizationApplied() {
    }

    public byte[] consumeAvatarFrame(String str) {
        return null;
    }

    public String getDefaultAvatarResourcePath(String str) {
        return null;
    }

    public void sendAvatarFrame(String str, byte[] bArr) {
    }

    public void sendAvatarMemoryCreationSuccess(String str) {
    }

    public void sendAvatarRampUpdateEvent(String str, String str2) {
    }

    public void sendAvatarMemoryLoadResult(String str, String str2, boolean z, String str3) {
    }
}
