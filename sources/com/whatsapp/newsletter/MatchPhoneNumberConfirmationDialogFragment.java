package com.whatsapp.newsletter;

import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass02E;
import X.AnonymousClass0FM;
import X.AnonymousClass3LW;
import X.AnonymousClass3U2;
import X.AnonymousClass3Y4;
import X.C000800j;
import X.C001400p;
import X.C1497272n;
import X.C36331k8;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C39001qm;
import X.C51572o2;
import X.C85514Hj;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.phonematching.CountryAndPhoneNumberFragment;
import com.whatsapp.phonematching.MatchPhoneNumberFragment;

public final class MatchPhoneNumberConfirmationDialogFragment extends Hilt_MatchPhoneNumberConfirmationDialogFragment {
    public final AnonymousClass00T A00 = C001400p.A00(C000800j.NONE, new C85514Hj(this, C51572o2.NONE));

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = r0.A0k();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDismiss(android.content.DialogInterface r4) {
        /*
            r3 = this;
            X.02E r0 = r3.A0I
            if (r0 == 0) goto L_0x001c
            X.01z r2 = r0.A0k()
            r0 = 2131432672(0x7f0b14e0, float:1.8487108E38)
            X.02E r1 = r2.A0L(r0)
            if (r1 == 0) goto L_0x001c
            X.09Y r0 = new X.09Y
            r0.<init>(r2)
            r0.A08(r1)
            r0.A01()
        L_0x001c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.MatchPhoneNumberConfirmationDialogFragment.onDismiss(android.content.DialogInterface):void");
    }

    public static final MatchPhoneNumberFragment A03(MatchPhoneNumberConfirmationDialogFragment matchPhoneNumberConfirmationDialogFragment) {
        AnonymousClass02E r1;
        AnonymousClass01I A0h = matchPhoneNumberConfirmationDialogFragment.A0h();
        if (A0h != null) {
            r1 = A0h.getSupportFragmentManager().A0L(R.id.phone_matching_container);
        } else {
            r1 = null;
        }
        if (r1 instanceof MatchPhoneNumberFragment) {
            return (MatchPhoneNumberFragment) r1;
        }
        return null;
    }

    public static final void A05(MatchPhoneNumberConfirmationDialogFragment matchPhoneNumberConfirmationDialogFragment) {
        String str;
        boolean z;
        View view;
        int i;
        MatchPhoneNumberFragment A03 = A03(matchPhoneNumberConfirmationDialogFragment);
        if (A03 != null) {
            int A002 = AnonymousClass3U2.A00(A03.A05, C36331k8.A0f(A03.A01), C36361kB.A0n(A03.A07));
            MatchPhoneNumberFragment A032 = A03(matchPhoneNumberConfirmationDialogFragment);
            if (A002 != 1) {
                if (A032 != null) {
                    str = A032.A1Z(A002);
                } else {
                    str = null;
                }
                boolean z2 = false;
                switch (A002) {
                    case 2:
                    case 3:
                        z = false;
                        break;
                    default:
                        z = true;
                        break;
                }
                if (A002 == 2) {
                    z2 = true;
                }
                MatchPhoneNumberFragment A033 = A03(matchPhoneNumberConfirmationDialogFragment);
                if (str == null) {
                    if (A033 != null) {
                        str = matchPhoneNumberConfirmationDialogFragment.A0n(R.string.f12nameremoved);
                    } else {
                        return;
                    }
                } else if (A033 == null) {
                    return;
                }
                if (z) {
                    TextView textView = A033.A04;
                    if (str != null) {
                        i = 0;
                    } else {
                        i = A033.A00;
                    }
                    textView.setVisibility(i);
                    TextView textView2 = A033.A04;
                    if (str == null) {
                        str = "";
                    }
                    textView2.setText(str);
                    view = A033.A07;
                } else {
                    if (z2) {
                        CountryAndPhoneNumberFragment.A03(A033, true);
                        A033.A02.setText(str);
                    }
                    view = A033.A01;
                }
                view.requestFocus();
            } else if (A032 != null) {
                A032.A1a();
            }
        }
    }

    public void A1M() {
        AnonymousClass0FM r1;
        super.A1M();
        Dialog dialog = this.A02;
        if ((dialog instanceof AnonymousClass0FM) && (r1 = (AnonymousClass0FM) dialog) != null) {
            Button button = r1.A00.A0H;
            C36331k8.A0r(r1.getContext(), button, R.color.f6nameremoved);
            AnonymousClass3Y4.A00(button, this, 2);
        }
        MatchPhoneNumberFragment A03 = A03(this);
        if (A03 != null) {
            A03.A00 = 4;
        }
        C36341k9.A0H().postDelayed(new C1497272n(this, 40), 100);
    }

    public Dialog A1a(Bundle bundle) {
        int i;
        int i2;
        AnonymousClass01I A0i = A0i();
        View A0K = C36381kD.A0K(LayoutInflater.from(A0i), R.layout.f9nameremoved);
        C39001qm A002 = AnonymousClass3LW.A00(A0i);
        AnonymousClass00T r4 = this.A00;
        int ordinal = ((C51572o2) r4.getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = R.string.f12nameremoved;
            }
            return C36371kC.A0O(A002);
        }
        i = R.string.f12nameremoved;
        A002.A0c(i);
        A002.A0j(A0K);
        A002.A0r(false);
        C39001qm.A0G(A002, this, 41, R.string.f12nameremoved);
        int ordinal2 = ((C51572o2) r4.getValue()).ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i2 = R.string.f12nameremoved;
            }
            return C36371kC.A0O(A002);
        }
        i2 = R.string.f12nameremoved;
        C39001qm.A0B(A002, this, 40, i2);
        return C36371kC.A0O(A002);
    }
}
