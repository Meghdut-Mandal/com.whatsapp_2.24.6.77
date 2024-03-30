package X;

import com.whatsapp.LegacyMessageDialogFragment;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.pnh.RequestPhoneNumberViewModel;

/* renamed from: X.3Kp  reason: invalid class name and case insensitive filesystem */
public final class C63583Kp {
    public C63383Jv A00;
    public final AnonymousClass155 A01;
    public final AnonymousClass1NG A02;
    public final AnonymousClass16D A03;
    public final AnonymousClass171 A04;
    public final RequestPhoneNumberViewModel A05;
    public final AnonymousClass005 A06;

    public final void A01(C223313w r5) {
        AnonymousClass00C.A0D(r5, 0);
        RequestPhoneNumberViewModel requestPhoneNumberViewModel = this.A05;
        C001700s r3 = requestPhoneNumberViewModel.A01;
        C36391kE.A1S(requestPhoneNumberViewModel.A06, requestPhoneNumberViewModel, r5, 32);
        C65993Ug.A00(this.A01, r3, C53102qm.A02(this, 36), 35);
    }

    public final void A02(C223313w r5, int i) {
        AnonymousClass00C.A0D(r5, 0);
        AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
        A032.A05 = R.string.f12nameremoved;
        A032.A0B = new Object[0];
        C66403Vv r1 = C66403Vv.A00;
        A032.A04 = R.string.f12nameremoved;
        A032.A07 = r1;
        AnonymousClass4X6 r12 = new AnonymousClass4X6(r5, i, 3, this);
        A032.A03 = R.string.f12nameremoved;
        A032.A06 = r12;
        C36331k8.A12(A032.A02(), this.A01);
        this.A05.A05.A00(r5, 2, i, true);
    }

    public final void A00(int i) {
        C63383Jv r2 = (C63383Jv) this.A05.A01.A04();
        if (r2 == null) {
            return;
        }
        if (!r2.A02) {
            ((C20780y9) this.A06.get()).A01(C20110x2.class);
            C223313w r1 = r2.A01;
            AnonymousClass00C.A0D(r1, 0);
            this.A01.Btl(C53492rP.A00(r1, i), "SharePhoneNumberBottomSheet");
        } else if (r2.A04) {
            AnonymousClass3P9 A032 = LegacyMessageDialogFragment.A03(new Object[0], R.string.f12nameremoved);
            A032.A05 = R.string.f12nameremoved;
            A032.A0B = new Object[0];
            C36331k8.A12(A032.A02(), this.A01);
        } else {
            A02(r2.A01, i);
        }
    }

    public final boolean A03(Jid jid) {
        C63383Jv r1;
        if (!(jid instanceof C223313w) || (r1 = this.A00) == null || (r1.A03 && r1.A02)) {
            return true;
        }
        return false;
    }

    public C63583Kp(AnonymousClass155 r2, AnonymousClass1NG r3, AnonymousClass16D r4, AnonymousClass171 r5, RequestPhoneNumberViewModel requestPhoneNumberViewModel, AnonymousClass005 r7) {
        C36321k7.A1B(r2, r4, r5, r3, r7);
        AnonymousClass00C.A0D(requestPhoneNumberViewModel, 6);
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = r7;
        this.A05 = requestPhoneNumberViewModel;
    }
}
