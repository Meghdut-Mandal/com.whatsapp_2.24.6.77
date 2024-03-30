package com.whatsapp.avatar.privacy;

import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36411kG;
import X.C430626v;
import X.C89314Wb;

public final class AvatarStickerPrivacySettings extends C430626v {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A05 = C36411kG.A0X(A0B);
        }
    }

    public AvatarStickerPrivacySettings(int i) {
        this.A00 = false;
        C89314Wb.A00(this, 19);
    }

    public AvatarStickerPrivacySettings() {
        this(0);
    }
}
