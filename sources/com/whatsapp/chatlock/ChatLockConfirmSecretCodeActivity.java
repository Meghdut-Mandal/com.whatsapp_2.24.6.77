package com.whatsapp.chatlock;

import X.AnonymousClass00F;
import X.AnonymousClass24b;
import X.AnonymousClass3L5;
import X.C18800tq;
import X.C18830tt;
import X.C25731Hl;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C36431kI;
import X.C63603Kr;
import X.C85834Ip;
import X.C89314Wb;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockConfirmSecretCodeActivity extends AnonymousClass24b {
    public int A00;
    public C25731Hl A01;
    public AnonymousClass3L5 A02;
    public String A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C63603Kr) A0B.A1a.get();
            this.A02 = C36391kE.A0a(A0B);
            this.A01 = (C25731Hl) A0B.ADY.get();
        }
    }

    public ChatLockConfirmSecretCodeActivity(int i) {
        this.A04 = false;
        C89314Wb.A00(this, 48);
    }

    public static final void A01(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        chatLockConfirmSecretCodeActivity.A3i().setEndIconMode(2);
        chatLockConfirmSecretCodeActivity.A3i().setEndIconTintList(C36431kI.A0G(chatLockConfirmSecretCodeActivity, R.color.f6nameremoved));
        chatLockConfirmSecretCodeActivity.A3i().setHelperText("");
        chatLockConfirmSecretCodeActivity.A3i().setHelperTextColor(AnonymousClass00F.A04(chatLockConfirmSecretCodeActivity, R.color.f6nameremoved));
    }

    public static final void A07(ChatLockConfirmSecretCodeActivity chatLockConfirmSecretCodeActivity) {
        chatLockConfirmSecretCodeActivity.A3i().setError((CharSequence) null);
        chatLockConfirmSecretCodeActivity.A3i().setEndIconMode(-1);
        chatLockConfirmSecretCodeActivity.A3i().setEndIconDrawable((int) R.drawable.vec_ic_check_circle_24dp);
        chatLockConfirmSecretCodeActivity.A3i().setEndIconContentDescription((int) R.string.f12nameremoved);
        chatLockConfirmSecretCodeActivity.A3i().setEndIconTintList(C36431kI.A0G(chatLockConfirmSecretCodeActivity, R.color.f6nameremoved));
        chatLockConfirmSecretCodeActivity.A3i().setHelperText(chatLockConfirmSecretCodeActivity.getResources().getString(R.string.f12nameremoved));
        chatLockConfirmSecretCodeActivity.A3i().setHelperTextColor(AnonymousClass00F.A04(chatLockConfirmSecretCodeActivity, R.color.f6nameremoved));
    }

    public void A3m() {
        super.A3m();
        String str = this.A03;
        if (str == null) {
            throw C36331k8.A0d("correctSecretCode");
        } else if (str.length() == 0) {
            A3j().A01(A3l(), new C85834Ip(this));
        } else if (A3o()) {
            A07(this);
        } else {
            A01(this);
        }
    }

    public void onCreate(Bundle bundle) {
        int i = 0;
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
        A3i().requestFocus();
        String stringExtra = getIntent().getStringExtra("extra_secret_code");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A03 = stringExtra;
        if (this.A00 != 2) {
            i = 1;
        }
        AnonymousClass3L5 r2 = this.A02;
        if (r2 != null) {
            r2.A05(1, Integer.valueOf(i));
            return;
        }
        throw C36331k8.A0d("chatLockLogger");
    }

    public ChatLockConfirmSecretCodeActivity() {
        this(0);
    }
}
