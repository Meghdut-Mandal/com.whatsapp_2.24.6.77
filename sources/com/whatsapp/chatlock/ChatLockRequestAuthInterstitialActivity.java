package com.whatsapp.chatlock;

import X.AnonymousClass005;
import X.AnonymousClass00T;
import X.AnonymousClass155;
import X.AnonymousClass3MH;
import X.AnonymousClass49F;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C36321k7;
import X.C36331k8;
import X.C36411kG;
import X.C36431kI;
import X.C66933Xw;
import X.C89324Wc;
import android.os.Bundle;
import com.whatsapp.R;

public final class ChatLockRequestAuthInterstitialActivity extends AnonymousClass155 {
    public AnonymousClass005 A00;
    public boolean A01;
    public final AnonymousClass00T A02;
    public final AnonymousClass3MH A03;

    public static final void A07(ChatLockRequestAuthInterstitialActivity chatLockRequestAuthInterstitialActivity) {
        AnonymousClass005 r0 = chatLockRequestAuthInterstitialActivity.A00;
        if (r0 != null) {
            C36411kG.A0a(r0).A02 = true;
            chatLockRequestAuthInterstitialActivity.setResult(0);
            return;
        }
        throw C36331k8.A0d("chatLockManagerLazy");
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C18840tu.A00(A0B.A1Z);
        }
    }

    public void onDestroy() {
        AnonymousClass005 r0 = this.A00;
        if (r0 != null) {
            C36411kG.A0a(r0).A00 = false;
            super.onDestroy();
            return;
        }
        throw C36331k8.A0d("chatLockManagerLazy");
    }

    public ChatLockRequestAuthInterstitialActivity(int i) {
        this.A01 = false;
        C89324Wc.A00(this, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r7 != 9) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity r11) {
        /*
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "extra_open_chat_directly"
            boolean r1 = X.C36421kH.A1T(r1, r0)
            X.00T r0 = r11.A02
            X.11F r0 = X.C36421kH.A0O(r0)
            if (r0 == 0) goto L_0x0066
            X.2EO r10 = new X.2EO
            r10.<init>(r0, r1)
        L_0x0017:
            X.005 r0 = r11.A00
            if (r0 == 0) goto L_0x0069
            X.18z r9 = X.C36411kG.A0a(r0)
            X.3MH r8 = r11.A03
            android.content.Intent r0 = r11.getIntent()
            r1 = 1
            java.lang.String r2 = "extra_unlock_entry_point"
            if (r0 == 0) goto L_0x0052
            boolean r0 = r0.hasExtra(r2)
            if (r0 != r1) goto L_0x0052
            r1 = 8
            android.content.Intent r0 = r11.getIntent()
            int r7 = r0.getIntExtra(r2, r1)
            r6 = 9
            r5 = 7
            r4 = 5
            r3 = 4
            r2 = 3
            r1 = 2
            if (r7 == 0) goto L_0x0064
            r0 = 1
            if (r7 == r0) goto L_0x0062
            if (r7 == r1) goto L_0x0060
            if (r7 == r2) goto L_0x005e
            if (r7 == r3) goto L_0x005c
            if (r7 == r4) goto L_0x005a
            if (r7 == r5) goto L_0x0057
            if (r7 == r6) goto L_0x0053
        L_0x0052:
            r6 = 5
        L_0x0053:
            r9.A0A(r11, r10, r8, r6)
            return
        L_0x0057:
            r6 = 8
            goto L_0x0053
        L_0x005a:
            r6 = 3
            goto L_0x0053
        L_0x005c:
            r6 = 0
            goto L_0x0053
        L_0x005e:
            r6 = 7
            goto L_0x0053
        L_0x0060:
            r6 = 6
            goto L_0x0053
        L_0x0062:
            r6 = 2
            goto L_0x0053
        L_0x0064:
            r6 = 4
            goto L_0x0053
        L_0x0066:
            X.2EQ r10 = X.AnonymousClass2EQ.A00
            goto L_0x0017
        L_0x0069:
            java.lang.String r0 = "chatLockManagerLazy"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity.A01(com.whatsapp.chatlock.ChatLockRequestAuthInterstitialActivity):void");
    }

    public void onBackPressed() {
        A07(this);
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C66933Xw.A00(findViewById(R.id.back_btn), this, 19);
        C66933Xw.A00(findViewById(R.id.unlock_btn), this, 20);
        A01(this);
    }

    public ChatLockRequestAuthInterstitialActivity() {
        this(0);
        this.A02 = C36431kI.A1I(new AnonymousClass49F(this));
        this.A03 = new AnonymousClass3MH(this, 4);
    }
}
