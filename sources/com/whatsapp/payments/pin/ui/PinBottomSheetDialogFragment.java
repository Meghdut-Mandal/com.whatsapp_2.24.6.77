package com.whatsapp.payments.pin.ui;

import X.AnonymousClass000;
import X.AnonymousClass01I;
import X.AnonymousClass6ZA;
import X.AnonymousClass9TJ;
import X.B1Z;
import X.C166027uu;
import X.C170798Ev;
import X.C178728hA;
import X.C18820ts;
import X.C196039Xk;
import X.C19970wo;
import X.C23189B8x;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.CodeInputField;
import com.whatsapp.R;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.wds.components.button.WDSButton;

public class PinBottomSheetDialogFragment extends Hilt_PinBottomSheetDialogFragment {
    public long A00;
    public CountDownTimer A01;
    public View A02;
    public TextView A03;
    public CodeInputField A04;
    public C19970wo A05;
    public C18820ts A06;
    public C196039Xk A07;
    public AnonymousClass9TJ A08;
    public B1Z A09;
    public WDSButton A0A;
    public boolean A0B;
    public View A0C;
    public ProgressBar A0D;
    public final AnonymousClass6ZA A0E = new AnonymousClass6ZA();

    public void A1p() {
        A1g(true);
        this.A0C.setVisibility(0);
        this.A0D.setVisibility(8);
        this.A04.setEnabled(true);
    }

    public void A1q() {
        A1g(false);
        this.A0C.setVisibility(4);
        this.A03.setVisibility(4);
        this.A0D.setVisibility(0);
        this.A04.setEnabled(false);
    }

    public static void A03(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j, boolean z) {
        CountDownTimer countDownTimer = pinBottomSheetDialogFragment.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            pinBottomSheetDialogFragment.A01 = null;
        }
        pinBottomSheetDialogFragment.A00 = j;
        TextView textView = pinBottomSheetDialogFragment.A03;
        C36331k8.A0r(textView.getContext(), textView, R.color.f6nameremoved);
        pinBottomSheetDialogFragment.A03.setVisibility(0);
        pinBottomSheetDialogFragment.A04.setErrorState(true);
        pinBottomSheetDialogFragment.A04.setEnabled(false);
        if (z) {
            pinBottomSheetDialogFragment.A04.A0E();
        }
        pinBottomSheetDialogFragment.A01 = new C166027uu(pinBottomSheetDialogFragment, j - C19970wo.A00(pinBottomSheetDialogFragment.A05)).start();
    }

    public void A1r(int i, int i2) {
        CountDownTimer countDownTimer = this.A01;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.A01 = null;
        }
        this.A04.setErrorState(true);
        this.A04.A0E();
        TextView textView = this.A03;
        Object[] objArr = new Object[1];
        boolean A1b = C36361kB.A1b(objArr, i);
        textView.setText(this.A06.A0L(objArr, i2, (long) i));
        TextView textView2 = this.A03;
        C36331k8.A0r(textView2.getContext(), textView2, R.color.f6nameremoved);
        this.A03.setVisibility(A1b ? 1 : 0);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        int i;
        Window window;
        View A0E2 = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        Dialog dialog = this.A02;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(3);
        }
        View findViewById = A0E2.findViewById(R.id.subtitle);
        this.A02 = findViewById;
        AnonymousClass9TJ r0 = this.A08;
        if (r0 == null || !(r0 instanceof C178728hA)) {
            z = false;
        } else {
            z = true;
        }
        if (findViewById != null) {
            if (z) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(8);
            }
        }
        this.A0C = A0E2.findViewById(R.id.pin_text_container);
        this.A0D = (ProgressBar) A0E2.findViewById(R.id.progress_bar);
        this.A03 = C36391kE.A0P(A0E2, R.id.error_text);
        WDSButton A0y = C36431kI.A0y(A0E2, R.id.forgot_pin_button);
        this.A0A = A0y;
        String A0n = A0n(R.string.f12nameremoved);
        if (this.A08 != null) {
            String string = A0a().getString(R.string.f12nameremoved);
            if (!TextUtils.isEmpty(string)) {
                A0n = string;
            }
        }
        C36381kD.A1E(A0y, this, AnonymousClass000.A1b(A0n), R.string.f12nameremoved);
        C36391kE.A1I(this.A0A, this, 5);
        boolean z2 = this.A0B;
        this.A0B = z2;
        WDSButton wDSButton = this.A0A;
        if (wDSButton != null) {
            wDSButton.setVisibility(C36381kD.A00(z2 ? 1 : 0));
        }
        CodeInputField codeInputField = (CodeInputField) A0E2.findViewById(R.id.code);
        this.A04 = codeInputField;
        codeInputField.A0G(new C23189B8x(this, 0), 6, C36341k9.A0G(this).getColor(R.color.f6nameremoved));
        ((NumberEntryKeyboard) A0E2.findViewById(R.id.number_entry_keyboard)).A04 = this.A04;
        if (this.A08 != null) {
            layoutInflater.inflate(R.layout.f9nameremoved, C36411kG.A0P(A0E2, R.id.title_view), true);
            TextView A0P = C36391kE.A0P(A0E2, R.id.header_text);
            if (this.A08 instanceof C178728hA) {
                i = R.string.f12nameremoved;
            } else {
                i = R.string.f12nameremoved;
            }
            A0P.setText(i);
        }
        return A0E2;
    }

    public void A1K() {
        super.A1K();
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            A0h.setRequestedOrientation(10);
        }
    }

    public void A1L() {
        super.A1L();
        long A002 = this.A07.A00() * 1000;
        if (A002 > C19970wo.A00(this.A05) || this.A01 != null) {
            A03(this, A002, false);
        }
        AnonymousClass01I A0h = A0h();
        if (A0h != null) {
            A0h.setRequestedOrientation(1);
        }
    }

    public void A1n(View view) {
        super.A1n(view);
        BottomSheetBehavior A022 = BottomSheetBehavior.A02(view);
        A022.A0a(new C170798Ev(A022, this));
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.A0E.onDismiss(dialogInterface);
    }
}
