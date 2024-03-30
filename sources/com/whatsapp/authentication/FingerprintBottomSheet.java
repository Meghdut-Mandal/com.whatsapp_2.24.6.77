package com.whatsapp.authentication;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass28q;
import X.AnonymousClass3ON;
import X.AnonymousClass4VR;
import X.C02680Bk;
import X.C160387kv;
import X.C18820ts;
import X.C19970wo;
import X.C21060yb;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C430728r;
import X.C63863Ls;
import X.C65123Qv;
import X.C66923Xv;
import X.C89194Vp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.util.Log;

public final class FingerprintBottomSheet extends Hilt_FingerprintBottomSheet implements C160387kv {
    public static final AnonymousClass3ON A0A = new AnonymousClass3ON();
    public TextView A00;
    public TextView A01;
    public C430728r A02;
    public FingerprintView A03;
    public C19970wo A04;
    public C18820ts A05;
    public boolean A06;
    public long A07;
    public CountDownTimer A08;
    public C02680Bk A09;

    public static /* synthetic */ void A06(DialogInterface dialogInterface, Bundle bundle, FingerprintBottomSheet fingerprintBottomSheet) {
        AnonymousClass00C.A0D(dialogInterface, 2);
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior A022 = BottomSheetBehavior.A02(findViewById);
            AnonymousClass00C.A08(A022);
            if (bundle.getBoolean("full_screen")) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                layoutParams.height = C36411kG.A00() - C65123Qv.A02(fingerprintBottomSheet.A0a(), C21060yb.A01(fingerprintBottomSheet.A0a()));
                findViewById.setLayoutParams(layoutParams);
            }
            A022.A0W(3);
            A022.A0Z(new C89194Vp(fingerprintBottomSheet, 0));
            return;
        }
        throw C36381kD.A0l();
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        AnonymousClass00C.A0D(layoutInflater, 0);
        Bundle A0b = A0b();
        int i = A0b.getInt("custom_layout_id");
        if (i == 0) {
            i = R.layout.f9nameremoved;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        int i2 = A0b.getInt("header_layout_id");
        if (i2 != 0) {
            ViewGroup A0P = C36411kG.A0P(inflate, R.id.header_container);
            layoutInflater.inflate(i2, A0P);
            A0P.setVisibility(0);
        }
        C36391kE.A0P(inflate, R.id.fingerprint_bottomsheet_title).setText(A0b.getInt("title", R.string.f12nameremoved));
        if (A0b.getInt("positive_button_text") != 0) {
            TextView A0P2 = C36391kE.A0P(inflate, R.id.fingerprint_bottomsheet_positive_button);
            this.A01 = A0P2;
            if (A0P2 != null) {
                A0P2.setText(A0b.getInt("positive_button_text"));
            }
            TextView textView = this.A01;
            if (textView != null) {
                C66923Xv.A01(textView, this, 38);
            }
        }
        if (A0b.getInt("negative_button_text") != 0) {
            TextView A0P3 = C36391kE.A0P(inflate, R.id.fingerprint_bottomsheet_negative_button);
            this.A00 = A0P3;
            if (A0P3 != null) {
                C33521fV.A02(A0P3);
            }
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(A0b.getInt("negative_button_text"));
            }
            TextView textView3 = this.A00;
            if (textView3 != null) {
                C66923Xv.A01(textView3, this, 39);
            }
        }
        ViewGroup A0P4 = C36411kG.A0P(inflate, R.id.fingerprint_view_wrapper);
        if (A0P4 != null) {
            FingerprintView fingerprintView = new FingerprintView(C36371kC.A0B(inflate), (AttributeSet) null, 0, A0b.getInt("fingerprint_view_style_id"));
            this.A03 = fingerprintView;
            A0P4.addView(fingerprintView);
        } else {
            this.A03 = (FingerprintView) inflate.findViewById(R.id.fingerprint_view);
        }
        FingerprintView fingerprintView2 = this.A03;
        if (fingerprintView2 != null) {
            fingerprintView2.A00 = this.A02;
        }
        Dialog dialog = this.A02;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            throw C36381kD.A0l();
        }
        window.setAttributes(C36381kD.A0M(window));
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            dialog2.setOnShowListener(new C63863Ls(this, A0b, 0));
        }
        return inflate;
    }

    public final void A1k(long j) {
        CountDownTimer countDownTimer = this.A08;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.A08 = null;
        A1h();
        long j2 = j;
        if (j > C19970wo.A00(A1h())) {
            this.A07 = j;
            A05();
            this.A08 = new AnonymousClass4VR(this, 0, j2, j - C19970wo.A00(A1h())).start();
        }
    }

    public void BRY(int i, CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 1);
        C430728r r1 = this.A02;
        if (r1 != null && (r1 instanceof AnonymousClass28q)) {
            Log.i("AppAuthSettingsActivity/fingerprint-error");
            AppAuthSettingsActivity.A0I(((AnonymousClass28q) r1).A00);
        }
        if (i == 7) {
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, 30, 0);
            charSequence = A0o(R.string.f12nameremoved, objArr);
            AnonymousClass00C.A08(charSequence);
        }
        FingerprintView fingerprintView = this.A03;
        if (fingerprintView != null) {
            fingerprintView.A02(charSequence);
        }
        A05();
    }

    public void BRb(int i, CharSequence charSequence) {
        AnonymousClass00C.A0D(charSequence, 1);
        FingerprintView fingerprintView = this.A03;
        if (fingerprintView != null) {
            fingerprintView.A03(charSequence.toString());
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        A05();
        super.onCancel(dialogInterface);
    }

    private final void A05() {
        C02680Bk r0 = this.A09;
        if (r0 != null) {
            r0.A03();
        }
        this.A09 = null;
    }

    public static final /* synthetic */ void A0A(FingerprintBottomSheet fingerprintBottomSheet) {
        if (!fingerprintBottomSheet.A06) {
            FingerprintView fingerprintView = fingerprintBottomSheet.A03;
            if (fingerprintView != null) {
                FingerprintView.A00(fingerprintView.A05, fingerprintView);
            }
            fingerprintBottomSheet.A1j();
        }
    }

    public final C19970wo A1h() {
        C19970wo r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("time");
    }

    public final C18820ts A1i() {
        C18820ts r0 = this.A05;
        if (r0 != null) {
            return r0;
        }
        throw C36321k7.A09();
    }

    public final void A1j() {
        C02680Bk r1 = new C02680Bk();
        this.A09 = r1;
        C430728r r0 = this.A02;
        if (r0 != null) {
            r0.A02(r1, this);
        }
    }

    public void BRZ() {
        FingerprintView fingerprintView = this.A03;
        if (fingerprintView != null) {
            fingerprintView.A03(C36361kB.A0m(fingerprintView.getContext(), R.string.f12nameremoved));
        }
    }

    public void BRc(byte[] bArr) {
        C430728r r0 = this.A02;
        if (r0 != null) {
            r0.A03(bArr);
        }
        FingerprintView fingerprintView = this.A03;
        if (fingerprintView != null) {
            fingerprintView.A01();
        }
    }

    public static /* synthetic */ void A07(FingerprintBottomSheet fingerprintBottomSheet) {
        fingerprintBottomSheet.A1c();
        C430728r r0 = fingerprintBottomSheet.A02;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A19() {
        super.A19();
        this.A02 = null;
    }

    public void A1J() {
        super.A1J();
        FingerprintView fingerprintView = this.A03;
        if (fingerprintView != null) {
            fingerprintView.A00 = null;
        }
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
    }

    public void A1K() {
        super.A1K();
        A05();
    }

    public void A1L() {
        super.A1L();
        if (this.A07 <= C19970wo.A00(A1h()) && !this.A06) {
            FingerprintView fingerprintView = this.A03;
            if (fingerprintView != null) {
                FingerprintView.A00(fingerprintView.A05, fingerprintView);
            }
            A1j();
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        A1d(0, R.style.f13nameremoved);
    }

    public void A1b() {
        A05();
        super.A1b();
    }
}
