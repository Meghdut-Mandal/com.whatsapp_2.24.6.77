package com.whatsapp.status.privacy;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass01I;
import X.AnonymousClass16E;
import X.AnonymousClass1UM;
import X.AnonymousClass1US;
import X.AnonymousClass1UZ;
import X.AnonymousClass3G8;
import X.AnonymousClass3LW;
import X.AnonymousClass3OM;
import X.AnonymousClass3XT;
import X.AnonymousClass3YC;
import X.AnonymousClass4XQ;
import X.AnonymousClass4XY;
import X.C009504a;
import X.C009904e;
import X.C16550pQ;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C20810yC;
import X.C28781Ua;
import X.C29561Xc;
import X.C29731Xt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C38961qd;
import X.C39001qm;
import X.C48772i1;
import X.C64883Pu;
import X.C65443Sb;
import X.C65673Ta;
import X.C88184Rs;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import com.whatsapp.R;
import com.whatsapp.bridge.wfal.WfalManager;
import java.lang.ref.WeakReference;

public final class StatusPrivacyBottomSheetDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment implements C16550pQ {
    public static final AnonymousClass1US A0J = AnonymousClass1US.STATUS_PRIVACY_BOTTOM_SHEET_DIALOG_FRAGMENT;
    public WfalManager A00;
    public C19420v0 A01;
    public C18820ts A02;
    public AnonymousClass3XT A03;
    public AnonymousClass16E A04;
    public C20810yC A05;
    public C64883Pu A06;
    public C29561Xc A07;
    public C29731Xt A08;
    public AnonymousClass3G8 A09;
    public C88184Rs A0A;
    public C38961qd A0B;
    public AnonymousClass1UM A0C;
    public C28781Ua A0D;
    public AnonymousClass005 A0E;
    public boolean A0F;
    public boolean A0G;
    public final C009904e A0H = BnD(new C65673Ta(this, 11), new C009504a());
    public final C009904e A0I = BnD(new C65673Ta(this, 10), new C009504a());

    public void A1O(Context context) {
        AnonymousClass00C.A0D(context, 0);
        super.A1O(context);
        if (context instanceof C88184Rs) {
            this.A0A = (C88184Rs) context;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Activity must implement ");
        throw AnonymousClass000.A0g(C88184Rs.class.getSimpleName(), A0u);
    }

    public final class DiscardChangesConfirmationDialogFragment extends Hilt_StatusPrivacyBottomSheetDialogFragment_DiscardChangesConfirmationDialogFragment {
        public boolean A00;
        public final AnonymousClass3XT A01;
        public final AnonymousClass1UM A02;
        public final AnonymousClass1UZ A03;
        public final WeakReference A04;
        public final boolean A05;

        public DiscardChangesConfirmationDialogFragment(AnonymousClass3XT r2, C88184Rs r3, AnonymousClass1UM r4, AnonymousClass1UZ r5, boolean z) {
            AnonymousClass00C.A0D(r5, 3);
            this.A01 = r2;
            this.A03 = r5;
            this.A05 = z;
            this.A02 = r4;
            this.A04 = AnonymousClass001.A0F(r3);
        }

        public void A1J() {
            super.A1J();
            if (this.A05 && !this.A00) {
                boolean z = this.A01.A03;
                AnonymousClass1UZ r2 = this.A03;
                Boolean A0x = C36441kJ.A0x(z);
                r2.A02(A0x, "initial_auto_setting");
                r2.A02(A0x, "final_auto_setting");
                r2.A03("TAP_OUTSIDE_DIALOG");
            }
        }

        public Dialog A1a(Bundle bundle) {
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                C39001qm A002 = AnonymousClass3LW.A00(A0h);
                A002.A0c(R.string.f12nameremoved);
                A002.A0h(new AnonymousClass4XQ(this, 0), R.string.f12nameremoved);
                A002.A0f(new AnonymousClass4XQ(this, 1), R.string.f12nameremoved);
                return C36371kC.A0O(A002);
            }
            throw C36381kD.A0k();
        }
    }

    public static final void A03(StatusPrivacyBottomSheetDialogFragment statusPrivacyBottomSheetDialogFragment, boolean z) {
        Intent intent;
        C64883Pu r1;
        AnonymousClass3XT r0;
        C19420v0 r12 = statusPrivacyBottomSheetDialogFragment.A01;
        if (r12 != null) {
            boolean A2S = r12.A2S("audience_selection_2");
            Context A0a = statusPrivacyBottomSheetDialogFragment.A0a();
            if (A2S) {
                intent = AnonymousClass3OM.A01(new AnonymousClass3OM(A0a), C36371kC.A00(z ? 1 : 0));
                r1 = statusPrivacyBottomSheetDialogFragment.A06;
                if (r1 != null) {
                    r0 = statusPrivacyBottomSheetDialogFragment.A03;
                    if (r0 == null) {
                        throw C36331k8.A0d("statusDistributionInfo");
                    }
                } else {
                    throw C36331k8.A0d("statusAudienceRepository");
                }
            } else {
                intent = C36431kI.A0D();
                intent.setClassName(A0a.getPackageName(), "com.whatsapp.status.audienceselector.StatusTemporalRecipientsActivity");
                intent.putExtra("is_black_list", z);
                r1 = statusPrivacyBottomSheetDialogFragment.A06;
                if (r1 != null) {
                    r0 = statusPrivacyBottomSheetDialogFragment.A03;
                    if (r0 == null) {
                        throw C36331k8.A0d("statusDistributionInfo");
                    }
                } else {
                    throw C36331k8.A0d("statusAudienceRepository");
                }
            }
            r1.A02(intent, r0);
            statusPrivacyBottomSheetDialogFragment.A0H.A02(intent);
            return;
        }
        throw C36331k8.A0d("sharedPreferences");
    }

    public void A1p() {
        AnonymousClass3XT r0 = this.A03;
        if (r0 == null) {
            throw C36331k8.A0d("statusDistributionInfo");
        }
        if (r0.A00 != 1) {
            this.A0G = true;
        }
        C19420v0 r1 = this.A01;
        if (r1 != null) {
            if (r1.A2S("audience_selection_2")) {
                A1q(1);
            }
            A03(this, false);
            return;
        }
        throw C36331k8.A0d("sharedPreferences");
    }

    public void A1q(int i) {
        AnonymousClass3XT r1 = this.A03;
        if (r1 == null) {
            throw C36331k8.A0d("statusDistributionInfo");
        }
        int i2 = i;
        if (i != r1.A00) {
            this.A0G = true;
        }
        this.A03 = new AnonymousClass3XT(r1.A01, r1.A02, i2, r1.A03, r1.A04);
    }

    public void onCancel(DialogInterface dialogInterface) {
        C88184Rs r3;
        if (this.A0A != null && this.A0G) {
            if (this.A0F) {
                AnonymousClass005 r0 = this.A0E;
                if (r0 != null) {
                    AnonymousClass1UZ r32 = (AnonymousClass1UZ) r0.get();
                    r32.A06((String) null, "TAP_AUDIENCE_SELECTOR_TOGGLE", 927605897);
                    r32.A04("SEE_CHANGES_DIALOG");
                } else {
                    throw C36331k8.A0d("xFamilyUserFlowLoggerLazy");
                }
            }
            if (A0h() != null && (r3 = this.A0A) != null) {
                AnonymousClass3XT r2 = this.A03;
                if (r2 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                AnonymousClass005 r02 = this.A0E;
                if (r02 != null) {
                    AnonymousClass1UZ r5 = (AnonymousClass1UZ) C36411kG.A0v(r02);
                    boolean z = this.A0F;
                    AnonymousClass1UM r4 = this.A0C;
                    if (r4 != null) {
                        DiscardChangesConfirmationDialogFragment discardChangesConfirmationDialogFragment = new DiscardChangesConfirmationDialogFragment(r2, r3, r4, r5, z);
                        AnonymousClass01I A0h = A0h();
                        if (A0h != null) {
                            C65443Sb.A01(discardChangesConfirmationDialogFragment, A0h.getSupportFragmentManager());
                            return;
                        }
                        return;
                    }
                    throw C36331k8.A0d("fbAccountManager");
                }
                throw C36331k8.A0d("xFamilyUserFlowLoggerLazy");
            }
        }
    }

    public void A19() {
        super.A19();
        this.A0A = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C38961qd r0;
        ViewStub viewStub;
        View inflate;
        Bundle A0b = A0b();
        C18740tg.A06(A0b);
        C64883Pu r02 = this.A06;
        if (r02 != null) {
            AnonymousClass00C.A0B(A0b);
            AnonymousClass3XT A012 = r02.A01(A0b);
            C18740tg.A06(A012);
            AnonymousClass00C.A08(A012);
            this.A03 = A012;
            boolean z = A0b().getBoolean("should_display_xo");
            C38961qd r2 = new C38961qd(A0a());
            C18820ts r1 = this.A02;
            if (r1 != null) {
                this.A09 = new AnonymousClass3G8(r1, r2);
                this.A0B = r2;
                if (z) {
                    if (this.A00 != null) {
                        C28781Ua r03 = this.A0D;
                        if (r03 == null) {
                            throw C36331k8.A0d("xFamilyGating");
                        } else if (r03.A00()) {
                            AnonymousClass1UM r12 = this.A0C;
                            if (r12 == null) {
                                throw C36331k8.A0d("fbAccountManager");
                            } else if (!(!r12.A06(A0J) || (r0 = this.A0B) == null || (viewStub = r0.A00) == null || (inflate = viewStub.inflate()) == null)) {
                                CompoundButton compoundButton = (CompoundButton) C36361kB.A0G(inflate, R.id.auto_crosspost_setting_switch);
                                AnonymousClass3XT r04 = this.A03;
                                if (r04 == null) {
                                    throw C36331k8.A0d("statusDistributionInfo");
                                }
                                compoundButton.setChecked(r04.A03);
                                AnonymousClass4XY.A00(compoundButton, this, 24);
                            }
                        }
                    } else {
                        throw C36331k8.A0d("wfalManager");
                    }
                }
                AnonymousClass3G8 r4 = this.A09;
                if (r4 == null) {
                    throw C36331k8.A0d("statusPrivacyBottomSheetController");
                }
                AnonymousClass3XT r05 = this.A03;
                if (r05 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                int i = r05.A00;
                int size = r05.A01.size();
                AnonymousClass3XT r06 = this.A03;
                if (r06 == null) {
                    throw C36331k8.A0d("statusDistributionInfo");
                }
                int size2 = r06.A02.size();
                r4.A00(i);
                r4.A01(size, size2);
                C38961qd r22 = r4.A00;
                AnonymousClass3YC.A00(r22.A04, r22, this, 20);
                AnonymousClass3YC.A00(r22.A03, r22, this, 18);
                AnonymousClass3YC.A00(r22.A02, r22, this, 19);
                C48772i1.A00(r22.A07, this, 21);
                C48772i1.A00(r22.A05, this, 22);
                C48772i1.A00(r22.A06, this, 23);
                return this.A0B;
            }
            throw C36321k7.A09();
        }
        throw C36331k8.A0d("statusAudienceRepository");
    }
}
