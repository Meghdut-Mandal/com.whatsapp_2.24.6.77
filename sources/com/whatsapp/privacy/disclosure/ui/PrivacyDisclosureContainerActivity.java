package com.whatsapp.privacy.disclosure.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass09Y;
import X.AnonymousClass1N0;
import X.AnonymousClass3NX;
import X.AnonymousClass5M8;
import X.AnonymousClass5VW;
import X.AnonymousClass6AW;
import X.AnonymousClass7TL;
import X.C128136Ba;
import X.C134566bF;
import X.C134856bi;
import X.C152907Mh;
import X.C163037pY;
import X.C165187t1;
import X.C18800tq;
import X.C225314u;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureBottomSheetFragment;
import com.whatsapp.privacy.disclosure.ui.fragment.PrivacyDisclosureFullscreenFragment;
import java.util.List;

public final class PrivacyDisclosureContainerActivity extends C225314u {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass00T A02;

    public static final boolean A0F(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        AnonymousClass6AW r0;
        C134856bi r4;
        AnonymousClass6AW r02;
        AnonymousClass02E privacyDisclosureBottomSheetFragment;
        int i;
        AnonymousClass00T r6 = privacyDisclosureContainerActivity.A02;
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) r6.getValue();
        C128136Ba r03 = (C128136Ba) privacyDisclosureContainerViewModel.A03.A04();
        if (r03 == null || (r0 = (AnonymousClass6AW) r03.A01) == null) {
            return false;
        }
        List list = r0.A01;
        int i2 = privacyDisclosureContainerViewModel.A00;
        if (i2 < 0 || i2 >= list.size() || (r4 = (C134856bi) list.get(privacyDisclosureContainerViewModel.A00)) == null) {
            return false;
        }
        C128136Ba r04 = (C128136Ba) ((PrivacyDisclosureContainerViewModel) r6.getValue()).A02.A04();
        if (r04 == null || (r02 = (AnonymousClass6AW) r04.A01) == null) {
            throw AnonymousClass001.A0A("No data from view model");
        }
        int i3 = r02.A00;
        if (privacyDisclosureContainerActivity.getSupportFragmentManager().A0N(privacyDisclosureContainerActivity.A01()) == null) {
            int i4 = ((PrivacyDisclosureContainerViewModel) r6.getValue()).A00;
            int ordinal = r4.A04.ordinal();
            if (ordinal == 2 || ordinal == 0 || ordinal == 1) {
                C134566bF r05 = r4.A03;
                if (r05 != null) {
                    r05.A00 = false;
                }
                privacyDisclosureBottomSheetFragment = new PrivacyDisclosureBottomSheetFragment();
            } else if (ordinal == 3) {
                privacyDisclosureBottomSheetFragment = new PrivacyDisclosureFullscreenFragment();
            } else {
                throw C36441kJ.A18();
            }
            Bundle A07 = AnonymousClass001.A07();
            A07.putInt("argDisclosureId", i3);
            A07.putInt("argPromptIndex", i4);
            A07.putParcelable("argPrompt", r4);
            privacyDisclosureBottomSheetFragment.A17(A07);
            if (privacyDisclosureBottomSheetFragment instanceof DialogFragment) {
                privacyDisclosureContainerActivity.Btl((DialogFragment) privacyDisclosureBottomSheetFragment, privacyDisclosureContainerActivity.A01());
            } else {
                AnonymousClass09Y A0O = C36341k9.A0O(privacyDisclosureContainerActivity);
                A0O.A06(R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved, R.anim.f1nameremoved);
                A0O.A0F(privacyDisclosureBottomSheetFragment, privacyDisclosureContainerActivity.A01(), R.id.fragment_container);
                A0O.A00(true);
            }
            switch (((PrivacyDisclosureContainerViewModel) r6.getValue()).A00) {
                case 0:
                    i = 105;
                    break;
                case 1:
                    i = 111;
                    break;
                case 2:
                    i = 112;
                    break;
                case 3:
                    i = 113;
                    break;
                case 4:
                    i = 114;
                    break;
                case 5:
                    i = 115;
                    break;
                case 6:
                    i = 116;
                    break;
                case 7:
                    i = 117;
                    break;
                case 8:
                    i = 118;
                    break;
                case 9:
                    i = 119;
                    break;
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null) {
                ((PrivacyDisclosureContainerViewModel) r6.getValue()).A0S(valueOf.intValue());
                return true;
            }
        }
        return true;
    }

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            this.A0B = (AnonymousClass1N0) A0B.A00.A3P.get();
        }
    }

    public PrivacyDisclosureContainerActivity(int i) {
        this.A01 = false;
        C163037pY.A00(this, 1);
    }

    private final String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("pdf_");
        return C36381kD.A10(A0u, ((PrivacyDisclosureContainerViewModel) this.A02.getValue()).A00);
    }

    public static final void A07(PrivacyDisclosureContainerActivity privacyDisclosureContainerActivity) {
        AnonymousClass3NX r1;
        int intExtra = privacyDisclosureContainerActivity.getIntent().getIntExtra("disclosure_id", -1);
        Integer valueOf = Integer.valueOf(intExtra);
        if (intExtra == -1) {
            valueOf = null;
        }
        String stringExtra = privacyDisclosureContainerActivity.getIntent().getStringExtra("surface");
        Intent intent = privacyDisclosureContainerActivity.getIntent();
        AnonymousClass00C.A08(intent);
        int intExtra2 = intent.getIntExtra("trigger", -1);
        if (intExtra2 == 0) {
            r1 = AnonymousClass3NX.A02;
        } else if (intExtra2 == 1) {
            r1 = AnonymousClass3NX.A03;
        } else if (intExtra2 == 2) {
            r1 = AnonymousClass3NX.A04;
        } else if (intExtra2 != 3) {
            r1 = AnonymousClass3NX.A06;
        } else {
            r1 = AnonymousClass3NX.A05;
        }
        PrivacyDisclosureContainerViewModel privacyDisclosureContainerViewModel = (PrivacyDisclosureContainerViewModel) privacyDisclosureContainerActivity.A02.getValue();
        AnonymousClass00C.A0D(r1, 2);
        privacyDisclosureContainerViewModel.A01 = r1;
        C36331k8.A1F(new AnonymousClass5M8(privacyDisclosureContainerViewModel, valueOf, stringExtra), privacyDisclosureContainerViewModel.A06);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C165187t1.A01(this, ((PrivacyDisclosureContainerViewModel) this.A02.getValue()).A02, new AnonymousClass7TL(this), 37);
        getSupportFragmentManager().A0l(new AnonymousClass5VW(this, 2), this, "fragResultRequestKey");
        A07(this);
    }

    public PrivacyDisclosureContainerActivity() {
        this(0);
        this.A02 = C36431kI.A1I(new C152907Mh(this));
    }
}
