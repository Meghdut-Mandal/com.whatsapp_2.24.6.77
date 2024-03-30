package com.whatsapp.avatar.editor;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass6WF;
import X.C36331k8;
import X.C36371kC;
import X.C430024d;
import X.C67733aO;
import android.os.Build;
import android.os.Bundle;

public final class AvatarEditorLauncherActivity extends C430024d {
    public AnonymousClass6WF A00;

    public static final void A01(AvatarEditorLauncherActivity avatarEditorLauncherActivity) {
        avatarEditorLauncherActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            avatarEditorLauncherActivity.overrideActivityTransition(0, 0, 0);
        } else {
            avatarEditorLauncherActivity.overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle A0H = C36371kC.A0H(this);
        if (A0H == null || (string = A0H.getString("origin")) == null) {
            A01(this);
            return;
        }
        AnonymousClass01z supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Y.add(new C67733aO(this));
        AnonymousClass6WF r1 = this.A00;
        if (r1 != null) {
            r1.A04(string, AnonymousClass001.A0F(this));
            return;
        }
        throw C36331k8.A0d("avatarEditorLauncher");
    }
}
