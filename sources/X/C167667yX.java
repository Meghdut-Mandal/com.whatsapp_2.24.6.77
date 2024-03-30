package X;

import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.7yX  reason: invalid class name and case insensitive filesystem */
public abstract class C167667yX extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final C001700s A01 = C36431kI.A0S();
    public final C001700s A02 = C36431kI.A0S();
    public final C001700s A03 = C36431kI.A0S();
    public final C200049gU A04;
    public final C19970wo A05;
    public final AnonymousClass6VG A06;
    public final C200959iX A07;
    public final C196039Xk A08;

    public void A0S(AnonymousClass155 r13, FingerprintBottomSheet fingerprintBottomSheet, AnonymousClass9SL r15, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        C19970wo r8 = this.A05;
        C196039Xk r11 = this.A08;
        AnonymousClass155 r6 = r13;
        FingerprintBottomSheet fingerprintBottomSheet2 = fingerprintBottomSheet;
        fingerprintBottomSheet.A02 = new AnonymousClass8UY(r6, fingerprintBottomSheet2, r8, r15, new AGH(r13, fingerprintBottomSheet, pinBottomSheetDialogFragment, this, str, str2, str3), r11);
        r13.Btm(fingerprintBottomSheet);
    }

    public void A0T(AnonymousClass155 r18, FingerprintBottomSheet fingerprintBottomSheet, AnonymousClass9SL r20, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str, String str2, String str3) {
        AnonymousClass155 r3 = r18;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment2 = pinBottomSheetDialogFragment;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (Build.VERSION.SDK_INT >= 23) {
            AnonymousClass6VG r1 = this.A06;
            if (r1.A05() && r1.A02() == 1) {
                A0S(r3, fingerprintBottomSheet, r20, pinBottomSheetDialogFragment2, str4, str5, str6);
                return;
            }
        }
        pinBottomSheetDialogFragment2.A09 = new AGK(r3, pinBottomSheetDialogFragment2, this, str5, str6, str4);
        r3.Btm(pinBottomSheetDialogFragment2);
    }

    public boolean A0U(C202059ky r8, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, String str) {
        int i = r8.A00;
        if (i != 1440 && i != 444 && i != 478 && i != 1441 && i != 445 && i != 1448 && i != 10718) {
            return false;
        }
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1p();
        }
        int i2 = r8.A00;
        if (i2 != 1440) {
            if (i2 != 1441) {
                if (i2 == 1448) {
                    this.A04.A02(r8, str, "PIN");
                } else if (i2 == 478 || i2 == 444) {
                    this.A04.A01.A02(str, "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1c();
                }
                this.A03.A0C(r8);
                return true;
            }
            C196039Xk r2 = this.A08;
            long j = r8.A02;
            r2.A02(j);
            if (pinBottomSheetDialogFragment == null) {
                return true;
            }
            C165607th.A1F(pinBottomSheetDialogFragment, j);
            return true;
        } else if (pinBottomSheetDialogFragment == null) {
            return true;
        } else {
            pinBottomSheetDialogFragment.A1r(r8.A01, R.plurals.f10nameremoved);
            return true;
        }
    }

    public C167667yX(C19970wo r2, C200049gU r3, AnonymousClass6VG r4, C200959iX r5, C196039Xk r6) {
        this.A05 = r2;
        this.A07 = r5;
        this.A08 = r6;
        this.A06 = r4;
        this.A04 = r3;
    }
}
