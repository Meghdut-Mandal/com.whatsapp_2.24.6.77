package com.whatsapp.chatlock;

import X.AnonymousClass155;
import X.AnonymousClass190;
import X.AnonymousClass3L5;
import X.C18800tq;
import X.C18830tt;
import X.C235718z;
import X.C25731Hl;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C63603Kr;
import X.C66933Xw;
import X.C89324Wc;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.R;
import com.whatsapp.WaTextView;

public final class ChatLockSettingsActivity extends AnonymousClass155 {
    public LinearLayout A00;
    public SwitchCompat A01;
    public C235718z A02;
    public C25731Hl A03;
    public AnonymousClass3L5 A04;
    public C63603Kr A05;
    public AnonymousClass190 A06;
    public WaTextView A07;
    public boolean A08;

    private final void A01() {
        WaTextView waTextView = this.A07;
        if (waTextView == null) {
            throw C36331k8.A0d("secretCodeState");
        }
        C63603Kr r0 = this.A05;
        if (r0 != null) {
            boolean A032 = r0.A03();
            int i = R.string.f12nameremoved;
            if (A032) {
                i = R.string.f12nameremoved;
            }
            waTextView.setText(i);
            return;
        }
        throw C36331k8.A0d("passcodeManager");
    }

    public void A2F() {
        if (!this.A08) {
            this.A08 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A06 = C36351kA.A0h(A0B);
            this.A04 = C36391kE.A0a(A0B);
            this.A02 = C36391kE.A0Z(A0B);
            this.A05 = (C63603Kr) A0B.A1a.get();
            this.A03 = (C25731Hl) A0B.ADY.get();
        }
    }

    public final C235718z A3i() {
        C235718z r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("chatLockManager");
    }

    public ChatLockSettingsActivity(int i) {
        this.A08 = false;
        C89324Wc.A00(this, 2);
    }

    public static final void A07(ChatLockSettingsActivity chatLockSettingsActivity, boolean z) {
        if (z != C36401kF.A1W(chatLockSettingsActivity.A3i())) {
            AnonymousClass3L5 r1 = chatLockSettingsActivity.A04;
            if (r1 != null) {
                r1.A00(C36391kE.A00(z ? 1 : 0));
            } else {
                throw C36331k8.A0d("chatLockLogger");
            }
        }
        chatLockSettingsActivity.A3i().A0H(z);
        SwitchCompat switchCompat = chatLockSettingsActivity.A01;
        if (switchCompat == null) {
            throw C36331k8.A0d("hideLockedChatsSwitch");
        }
        switchCompat.setChecked(C36401kF.A1W(chatLockSettingsActivity.A3i()));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        View view;
        Resources A0I;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i != 0) {
            if (i == 2) {
                if (i2 == 3) {
                    A3i();
                    view = this.A00;
                    A0I = C36391kE.A0I(this, view);
                    i3 = R.string.f12nameremoved;
                } else if (i2 == 4) {
                    A3i();
                    view = this.A00;
                    A0I = C36391kE.A0I(this, view);
                    i3 = R.string.f12nameremoved;
                }
                C235718z.A01(A0I, view, i3);
                A07(this, true);
            }
        } else if (i2 == -1) {
            A3i();
            View view2 = this.A00;
            C235718z.A01(C36391kE.A0I(this, view2), view2, R.string.f12nameremoved);
        } else if (i2 == 2) {
            A3i();
            View view3 = this.A00;
            C235718z.A01(C36391kE.A0I(this, view3), view3, R.string.f12nameremoved);
            A07(this, false);
        }
        A01();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C36391kE.A15(this, R.string.f12nameremoved);
        C36321k7.A0P(this);
        setContentView((int) R.layout.f9nameremoved);
        C66933Xw.A00(findViewById(R.id.secret_code_setting), this, 23);
        this.A00 = (LinearLayout) C36361kB.A0H(this, R.id.hide_locked_chats_setting);
        this.A01 = (SwitchCompat) C36361kB.A0H(this, R.id.hide_locked_chats_switch);
        if (A3i().A0L()) {
            SwitchCompat switchCompat = this.A01;
            if (switchCompat == null) {
                throw C36331k8.A0d("hideLockedChatsSwitch");
            }
            switchCompat.setChecked(C36401kF.A1W(A3i()));
            LinearLayout linearLayout = this.A00;
            if (linearLayout == null) {
                throw C36331k8.A0d("hideLockedChatsSettingView");
            }
            C66933Xw.A00(linearLayout, this, 22);
        } else {
            LinearLayout linearLayout2 = this.A00;
            if (linearLayout2 == null) {
                throw C36331k8.A0d("hideLockedChatsSettingView");
            }
            linearLayout2.setVisibility(8);
        }
        this.A07 = (WaTextView) C36361kB.A0H(this, R.id.secret_code_state);
        A01();
    }

    public ChatLockSettingsActivity() {
        this(0);
    }
}
