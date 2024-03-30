package com.whatsapp.chatlock;

import X.AnonymousClass24b;
import X.AnonymousClass3L5;
import X.C18800tq;
import X.C18830tt;
import X.C235718z;
import X.C25731Hl;
import X.C36321k7;
import X.C36331k8;
import X.C36391kE;
import X.C63603Kr;
import X.C89314Wb;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockCreateSecretCodeActivity extends AnonymousClass24b {
    public int A00;
    public C235718z A01;
    public C25731Hl A02;
    public AnonymousClass3L5 A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A02 = (C63603Kr) A0B.A1a.get();
            this.A03 = C36391kE.A0a(A0B);
            this.A02 = (C25731Hl) A0B.ADY.get();
            this.A01 = C36391kE.A0Z(A0B);
        }
    }

    public ChatLockCreateSecretCodeActivity(int i) {
        this.A04 = false;
        C89314Wb.A00(this, 49);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2 = 0;
        this.A00 = getIntent().getIntExtra("entrypoint", 0);
        super.onCreate(bundle);
        if (A3j().A03()) {
            setTitle(R.string.f12nameremoved);
            i = 3;
            if (this.A00 == 2) {
                A3i().requestFocus();
            }
        } else {
            setTitle(R.string.f12nameremoved);
            A3i().requestFocus();
            i = 0;
        }
        if (this.A00 != 2) {
            i2 = 1;
        }
        AnonymousClass3L5 r2 = this.A03;
        if (r2 != null) {
            r2.A05(Integer.valueOf(i), Integer.valueOf(i2));
            A3i().setHelperText(getString(R.string.f12nameremoved));
            return;
        }
        throw C36331k8.A0d("chatLockLogger");
    }

    public ChatLockCreateSecretCodeActivity() {
        this(0);
    }
}
