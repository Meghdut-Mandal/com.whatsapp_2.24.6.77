package com.whatsapp.chatlock;

import X.AnonymousClass155;
import X.AnonymousClass3AR;
import X.AnonymousClass3L5;
import X.AnonymousClass3MH;
import X.AnonymousClass3YE;
import X.AnonymousClass4XL;
import X.C18800tq;
import X.C18830tt;
import X.C235718z;
import X.C27111My;
import X.C32711e4;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36421kH;
import X.C81323wp;
import X.C89324Wc;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.settings.SettingsRowIconText;

public final class ChatLockPrivacySettingsActivity extends AnonymousClass155 {
    public AnonymousClass3AR A00;
    public C235718z A01;
    public AnonymousClass3L5 A02;
    public C32711e4 A03;
    public boolean A04;
    public final AnonymousClass3MH A05;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A02 = C36391kE.A0a(r2);
            this.A01 = C36391kE.A0Z(r2);
            this.A03 = (C32711e4) r1.A2Z.get();
            this.A00 = C27111My.A1B(A0L);
        }
    }

    public ChatLockPrivacySettingsActivity(int i) {
        this.A04 = false;
        C89324Wc.A00(this, 0);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36391kE.A15(this, R.string.f12nameremoved);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass4XL A002 = AnonymousClass4XL.A00(this, 39);
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.unlock_and_clear_setting);
        settingsRowIconText.setIcon((Drawable) null);
        settingsRowIconText.A01((Drawable) null, false);
        AnonymousClass3YE.A00(settingsRowIconText, this, A002, 18);
        TextEmojiLabel A0I = C36421kH.A0I(this, R.id.chat_lock_description);
        if (this.A03 != null) {
            A0I.setText(C32711e4.A02(C36371kC.A0B(A0I), new C81323wp((Object) this, 23), C36361kB.A0m(this, R.string.f12nameremoved), "learn-more", R.color.f6nameremoved));
            C36331k8.A16(A0I, this.A08);
            C36331k8.A10(A0I, A0I.getAbProps());
            return;
        }
        throw C36331k8.A0d("linkifierUtils");
    }

    public ChatLockPrivacySettingsActivity() {
        this(0);
        this.A05 = new AnonymousClass3MH(this, 3);
    }
}
