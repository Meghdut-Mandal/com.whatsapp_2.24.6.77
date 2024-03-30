package com.whatsapp.status.audienceselector.sharesheet;

import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass0FL;
import X.AnonymousClass3XT;
import X.AnonymousClass4UW;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C18740tg;
import X.C36331k8;
import X.C36341k9;
import X.C36401kF;
import X.C58342zi;
import X.C64493Of;
import X.C64883Pu;
import X.C65673Ta;
import X.C67103Yn;
import X.C89194Vp;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import com.whatsapp.R;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import java.lang.ref.WeakReference;
import java.util.List;

public final class StatusAudienceSelectorShareSheetFragment extends Hilt_StatusAudienceSelectorShareSheetFragment {
    public RadioButton A00;
    public RadioButton A01;
    public C58342zi A02;
    public WaImageButton A03;
    public WaTextView A04;
    public WaTextView A05;
    public AnonymousClass3XT A06;
    public C64883Pu A07;
    public C64493Of A08;
    public final C009904e A09;
    public final WeakReference A0A;
    public final int A0B = R.layout.f9nameremoved;

    public static final void A05(StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment, int i) {
        if (i != 1) {
            RadioButton radioButton = statusAudienceSelectorShareSheetFragment.A00;
            if (i != 2) {
                if (radioButton != null) {
                    radioButton.setChecked(false);
                }
            } else if (radioButton != null) {
                radioButton.setChecked(true);
            }
            RadioButton radioButton2 = statusAudienceSelectorShareSheetFragment.A01;
            if (radioButton2 != null) {
                radioButton2.setChecked(false);
                return;
            }
            return;
        }
        RadioButton radioButton3 = statusAudienceSelectorShareSheetFragment.A00;
        if (radioButton3 != null) {
            radioButton3.setChecked(false);
        }
        RadioButton radioButton4 = statusAudienceSelectorShareSheetFragment.A01;
        if (radioButton4 != null) {
            radioButton4.setChecked(true);
        }
    }

    public void A1S(Bundle bundle, View view) {
        String A002;
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C58342zi r0 = this.A02;
        if (r0 != null) {
            this.A08 = new C64493Of(A0a(), C36341k9.A0R(r0.A00.A02));
            this.A00 = (RadioButton) C012005e.A02(view, R.id.share_sheet_my_contacts_except_button);
            this.A01 = (RadioButton) C012005e.A02(view, R.id.share_sheet_selected_users_button);
            this.A03 = (WaImageButton) C012005e.A02(view, R.id.status_send_button);
            this.A04 = C36401kF.A0Q(view, R.id.share_sheet_my_contacts_except_details_text);
            WaTextView A0Q = C36401kF.A0Q(view, R.id.share_sheet_selected_users_details_text);
            this.A05 = A0Q;
            if (A0Q != null) {
                C64493Of r3 = this.A08;
                if (r3 == null) {
                    throw C36331k8.A0d("shareSheetUtil");
                }
                Context A0a = A0a();
                AnonymousClass3XT r02 = this.A06;
                if (r02 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                List list = r02.A01;
                if (list.isEmpty()) {
                    A002 = A0a.getResources().getString(R.string.f12nameremoved);
                    AnonymousClass00C.A0B(A002);
                } else {
                    A002 = C64493Of.A00(r3, list);
                }
                A0Q.setText(A002);
            }
            WaTextView waTextView = this.A04;
            if (waTextView != null) {
                C64493Of r2 = this.A08;
                if (r2 == null) {
                    throw C36331k8.A0d("shareSheetUtil");
                }
                Context A0a2 = A0a();
                AnonymousClass3XT r03 = this.A06;
                if (r03 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                waTextView.setText(r2.A01(A0a2, r03.A02));
            }
            WaImageButton waImageButton = this.A03;
            if (waImageButton != null) {
                C67103Yn.A00(waImageButton, this, 10);
            }
            RadioButton radioButton = this.A00;
            if (radioButton != null) {
                C67103Yn.A00(radioButton, this, 9);
            }
            WaTextView waTextView2 = this.A04;
            if (waTextView2 != null) {
                C67103Yn.A00(waTextView2, this, 11);
            }
            WaTextView waTextView3 = this.A05;
            if (waTextView3 != null) {
                C67103Yn.A00(waTextView3, this, 12);
            }
            RadioButton radioButton2 = this.A01;
            if (radioButton2 != null) {
                C67103Yn.A00(radioButton2, this, 8);
            }
            AnonymousClass3XT r04 = this.A06;
            if (r04 == null) {
                throw C36331k8.A0d("statusDistributionInfo");
            }
            A05(this, r04.A00);
            return;
        }
        throw C36331k8.A0d("shareSheetUtilFactory");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass4UW r1 = (AnonymousClass4UW) this.A0A.get();
        if (r1 != null) {
            AnonymousClass3XT r0 = this.A06;
            if (r0 == null) {
                throw C36331k8.A0d("statusDistributionInfo");
            }
            r1.BhR(r0);
        }
    }

    public static final AnonymousClass3XT A03(StatusAudienceSelectorShareSheetFragment statusAudienceSelectorShareSheetFragment, int i) {
        AnonymousClass3XT r1 = statusAudienceSelectorShareSheetFragment.A06;
        if (r1 == null) {
            throw C36331k8.A0d("statusDistributionInfo");
        }
        return new AnonymousClass3XT(r1.A01, r1.A02, i, r1.A03, r1.A04);
    }

    public StatusAudienceSelectorShareSheetFragment(AnonymousClass4UW r4) {
        this.A0A = AnonymousClass001.A0F(r4);
        this.A09 = BnD(new C65673Ta(this, 9), new C009504a());
    }

    public void A1H() {
        super.A1H();
        RadioButton radioButton = this.A00;
        if (radioButton != null) {
            radioButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        RadioButton radioButton2 = this.A01;
        if (radioButton2 != null) {
            radioButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        WaTextView waTextView = this.A04;
        if (waTextView != null) {
            waTextView.setOnClickListener((View.OnClickListener) null);
        }
        this.A04 = null;
        WaTextView waTextView2 = this.A05;
        if (waTextView2 != null) {
            waTextView2.setOnClickListener((View.OnClickListener) null);
        }
        this.A05 = null;
        WaImageButton waImageButton = this.A03;
        if (waImageButton != null) {
            waImageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.A03 = null;
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C64883Pu r1 = this.A07;
        if (r1 != null) {
            AnonymousClass3XT A012 = r1.A01(A0b());
            C18740tg.A06(A012);
            AnonymousClass00C.A08(A012);
            this.A06 = A012;
            return;
        }
        throw C36331k8.A0d("statusAudienceRepository");
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        AnonymousClass00C.A0E(A1a, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        AnonymousClass0FL r3 = (AnonymousClass0FL) A1a;
        r3.getContext().setTheme(R.style.f13nameremoved);
        if (r3.A01 == null) {
            AnonymousClass0FL.A01(r3);
        }
        r3.A01.A0Z(new C89194Vp(this, 10));
        return r3;
    }

    public int A1i() {
        return this.A0B;
    }
}
