package com.whatsapp.dialogs;

import X.AnonymousClass01z;
import X.AnonymousClass09Y;
import X.AnonymousClass15V;
import X.C36581kX;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ProgressDialogFragment extends Hilt_ProgressDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public boolean A01 = false;

    public Dialog A1a(Bundle bundle) {
        if (bundle != null) {
            this.A01 = !AnonymousClass15V.A02;
        }
        A0b();
        int i = A0b().getInt("title_id");
        int i2 = this.A0A.getInt("message_id");
        String str = null;
        if (bundle != null) {
            str = bundle.getString("previous_message_text");
        }
        C36581kX r2 = new C36581kX(A0h());
        String string = this.A0A.getString("title");
        if (!(string == null && (i == 0 || (string = A0n(i)) == null))) {
            r2.setTitle(string);
        }
        if (!(str == null && (str = this.A0A.getString("message")) == null && (i2 == 0 || (str = A0n(i2)) == null))) {
            r2.setMessage(str);
        }
        r2.setIndeterminate(true);
        A1g(false);
        DialogInterface.OnKeyListener onKeyListener = this.A00;
        if (onKeyListener != null) {
            r2.setOnKeyListener(onKeyListener);
        }
        return r2;
    }

    public static ProgressDialogFragment A03(int i, int i2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        bundle.putInt("message_id", i2);
        progressDialogFragment.A17(bundle);
        return progressDialogFragment;
    }

    public void A1f(AnonymousClass01z r2, String str) {
        AnonymousClass09Y r0 = new AnonymousClass09Y(r2);
        r0.A0D(this, str);
        r0.A02();
    }

    public void A1k() {
        if (this.A08 >= 7) {
            A1b();
        } else {
            this.A01 = true;
        }
    }

    public void A1M() {
        super.A1M();
        if (this.A01) {
            A1b();
            this.A01 = false;
        }
    }

    public void A1R(Bundle bundle) {
        CharSequence charSequence;
        super.A1R(bundle);
        C36581kX r0 = (C36581kX) this.A02;
        if (r0 != null && (charSequence = r0.A00) != null) {
            bundle.putString("previous_message_text", charSequence.toString());
        }
    }
}
