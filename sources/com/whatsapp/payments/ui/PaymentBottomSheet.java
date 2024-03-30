package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass01z;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass3NG;
import X.AnonymousClass6ZA;
import X.C24611Dc;
import X.C36391kE;
import X.C36411kG;
import android.animation.LayoutTransition;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public class PaymentBottomSheet extends Hilt_PaymentBottomSheet {
    public DialogInterface.OnCancelListener A00;
    public DialogInterface.OnDismissListener A01;
    public AnonymousClass02E A02;
    public AnonymousClass6ZA A03 = new AnonymousClass6ZA();
    public C24611Dc A04 = C24611Dc.A00("PaymentBottomSheet", "payment", "COMMON");

    public void A1k(AnonymousClass3NG r3) {
        r3.A00.A06 = false;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Log.i("onCreateView()");
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        ViewGroup A0P = C36411kG.A0P(inflate, R.id.fragment_container);
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setAnimateParentHierarchy(false);
        A0P.setLayoutTransition(layoutTransition);
        return inflate;
    }

    public Dialog A1a(Bundle bundle) {
        Log.i("onCreateDialog()");
        Dialog A1a = super.A1a(bundle);
        A1a.getWindow().addFlags(DefaultCrypto.BUFFER_SIZE);
        return A1a;
    }

    public void A1n(AnonymousClass02E r4) {
        C24611Dc r2 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("navigate-to fragment=");
        r2.A04(AnonymousClass000.A0q(AnonymousClass000.A0k(r4), A0u));
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A06(17432576, 17432577, 17432576, 17432577);
        A0S.A08((AnonymousClass02E) C36391kE.A0t(A0k().A0T.A04()));
        A0S.A0B(r4, R.id.fragment_container);
        A0S.A0J((String) null);
        A0S.A00(false);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        Log.i("onViewCreated()");
        if (this.A02 == null) {
            A1b();
            return;
        }
        AnonymousClass09Y A0S = C36411kG.A0S(this);
        A0S.A0A(this.A02, R.id.fragment_container);
        A0S.A0J((String) null);
        A0S.A00(false);
    }

    public void A1m() {
        AnonymousClass01z A0k = A0k();
        int A0I = A0k.A0I();
        A0k.A0V();
        if (A0I <= 1) {
            A1b();
            DialogInterface.OnCancelListener onCancelListener = this.A00;
            if (onCancelListener != null) {
                onCancelListener.onCancel((DialogInterface) null);
            }
            this.A03.onDismiss((DialogInterface) null);
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.A00;
        if (onCancelListener != null) {
            onCancelListener.onCancel((DialogInterface) null);
        }
        AnonymousClass6ZA r0 = this.A03;
        if (r0 != null) {
            r0.onDismiss(dialogInterface);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Log.i("onDismiss(dialog)");
        DialogInterface.OnDismissListener onDismissListener = this.A01;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }
}
