package com.whatsapp.chatinfo;

import X.AnonymousClass01I;
import X.AnonymousClass04S;
import X.AnonymousClass11F;
import X.AnonymousClass1CR;
import X.AnonymousClass3LW;
import X.AnonymousClass4XL;
import X.C39001qm;
import X.C55422ub;
import X.C586230k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;

public class ChatMediaVisibilityDialog extends Hilt_ChatMediaVisibilityDialog {
    public int A00;
    public int A01;
    public C586230k A02;
    public AnonymousClass11F A03;
    public AnonymousClass1CR A04;
    public boolean A05;

    public Dialog A1a(Bundle bundle) {
        CharSequence[] charSequenceArr = new CharSequence[3];
        boolean z = this.A05;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        int i2 = 0;
        charSequenceArr[0] = A0n(i);
        charSequenceArr[1] = A0n(R.string.f12nameremoved);
        charSequenceArr[2] = A0n(R.string.f12nameremoved);
        int i3 = this.A00;
        if (i3 == 1) {
            i2 = 2;
        } else if (i3 == 2) {
            i2 = 1;
        }
        AnonymousClass01I A0i = A0i();
        TextView textView = (TextView) A0i.getLayoutInflater().inflate(R.layout.f9nameremoved, (ViewGroup) null);
        textView.setText(R.string.f12nameremoved);
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        AlertDialog$Builder alertDialog$Builder = A002.A00;
        alertDialog$Builder.A0Y(textView);
        alertDialog$Builder.A0Y(textView);
        alertDialog$Builder.A0U(AnonymousClass4XL.A00(this, 32), charSequenceArr, i2);
        A002.A0m(this, new C55422ub(this, 7), R.string.f12nameremoved);
        A002.A0l(this, (AnonymousClass04S) null, R.string.f12nameremoved);
        return A002.create();
    }

    public ChatMediaVisibilityDialog(C586230k r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (r2 == 2) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1Q(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A1Q(r4)
            android.os.Bundle r1 = r3.A0b()
            java.lang.String r0 = "chatJid"
            X.11F r2 = X.C36351kA.A0i(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Chat jid must be passed to "
            r1.append(r0)
            java.lang.String r0 = "ChatMediaVisibilityDialog"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            X.C18740tg.A07(r2, r0)
            r3.A03 = r2
            X.1CR r0 = r3.A04
            X.3LI r0 = r0.A0R()
            int r2 = r0.A03
            if (r2 == 0) goto L_0x002f
            r0 = 2
            r1 = 0
            if (r2 != r0) goto L_0x0030
        L_0x002f:
            r1 = 1
        L_0x0030:
            r3.A05 = r1
            X.1CR r1 = r3.A04
            X.11F r0 = r3.A03
            X.3LI r0 = X.C36361kB.A0d(r0, r1)
            int r0 = r0.A03
            r3.A00 = r0
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.chatinfo.ChatMediaVisibilityDialog.A1Q(android.os.Bundle):void");
    }

    public ChatMediaVisibilityDialog() {
    }
}
