package com.whatsapp.chatlock;

import X.AnonymousClass155;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C63603Kr;
import X.C66933Xw;
import X.C89324Wc;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;

public final class HideLockedChatsActivity extends AnonymousClass155 {
    public C63603Kr A00;
    public WDSButton A01;
    public WDSButton A02;
    public boolean A03;

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = (C63603Kr) A0B.A1a.get();
        }
    }

    public HideLockedChatsActivity(int i) {
        this.A03 = false;
        C89324Wc.A00(this, 3);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            if (i2 == -1) {
                i3 = 3;
            } else {
                return;
            }
        } else if (i == 1 && i2 == -1) {
            i3 = 4;
        } else {
            return;
        }
        setResult(i3);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36321k7.A0P(this);
        setTitle(R.string.f12nameremoved);
        this.A01 = (WDSButton) C36361kB.A0H(this, R.id.chat_lock_primary_button);
        this.A02 = (WDSButton) C36361kB.A0H(this, R.id.chat_lock_secondary_button);
        C63603Kr r0 = this.A00;
        if (r0 != null) {
            boolean A032 = r0.A03();
            WDSButton wDSButton = this.A01;
            if (A032) {
                if (wDSButton == null) {
                    throw C36331k8.A0d("primaryButton");
                }
                wDSButton.setText(R.string.f12nameremoved);
                WDSButton wDSButton2 = this.A01;
                if (wDSButton2 == null) {
                    throw C36331k8.A0d("primaryButton");
                }
                C66933Xw.A00(wDSButton2, this, 26);
                WDSButton wDSButton3 = this.A02;
                if (wDSButton3 == null) {
                    throw C36331k8.A0d("secondaryButton");
                }
                wDSButton3.setText(R.string.f12nameremoved);
                WDSButton wDSButton4 = this.A02;
                if (wDSButton4 == null) {
                    throw C36331k8.A0d("secondaryButton");
                }
                C66933Xw.A00(wDSButton4, this, 24);
            } else if (wDSButton == null) {
                throw C36331k8.A0d("primaryButton");
            } else {
                wDSButton.setText(R.string.f12nameremoved);
                WDSButton wDSButton5 = this.A01;
                if (wDSButton5 == null) {
                    throw C36331k8.A0d("primaryButton");
                }
                C66933Xw.A00(wDSButton5, this, 25);
                WDSButton wDSButton6 = this.A02;
                if (wDSButton6 == null) {
                    throw C36331k8.A0d("secondaryButton");
                }
                wDSButton6.setVisibility(8);
            }
        } else {
            throw C36331k8.A0d("passcodeManager");
        }
    }

    public HideLockedChatsActivity() {
        this(0);
    }
}
