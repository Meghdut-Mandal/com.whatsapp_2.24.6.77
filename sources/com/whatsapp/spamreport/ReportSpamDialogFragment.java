package com.whatsapp.spamreport;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass02E;
import X.AnonymousClass0A2;
import X.AnonymousClass0BN;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass19R;
import X.AnonymousClass1A1;
import X.AnonymousClass1LV;
import X.AnonymousClass3Os;
import X.AnonymousClass3T1;
import X.AnonymousClass3YC;
import X.AnonymousClass3YY;
import X.AnonymousClass4LI;
import X.AnonymousClass4LJ;
import X.C023509x;
import X.C109325Xd;
import X.C177528dw;
import X.C19420v0;
import X.C19630wG;
import X.C19700wN;
import X.C21010yW;
import X.C21060yb;
import X.C220412q;
import X.C222813r;
import X.C26151Jb;
import X.C32091cx;
import X.C32681e1;
import X.C32881eL;
import X.C33751fs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36421kH;
import X.C36431kI;
import X.C44502Nt;
import X.C63633Ku;
import X.C64933Qa;
import X.C65963Ud;
import X.C74123l6;
import X.C81173wa;
import X.C84524Do;
import X.C84534Dp;
import X.C84544Dq;
import X.C84554Dr;
import X.C84564Ds;
import X.C84574Dt;
import X.C84584Du;
import X.C84594Dv;
import X.C84604Dw;
import X.C84614Dx;
import X.C84624Dy;
import X.C88114Rl;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reportinfra.repo.SpamReportRepo;
import java.lang.ref.WeakReference;

public final class ReportSpamDialogFragment extends Hilt_ReportSpamDialogFragment {
    public C19700wN A00;
    public AnonymousClass17Y A01;
    public AnonymousClass1LV A02;
    public C74123l6 A03;
    public AnonymousClass16D A04;
    public AnonymousClass171 A05;
    public C33751fs A06;
    public C63633Ku A07;
    public C21060yb A08;
    public C19630wG A09;
    public C19420v0 A0A;
    public C26151Jb A0B;
    public C220412q A0C;
    public AnonymousClass17X A0D;
    public C21010yW A0E;
    public AnonymousClass3Os A0F;
    public AnonymousClass190 A0G;
    public C32881eL A0H;
    public SpamReportRepo A0I;
    public C88114Rl A0J;
    public AnonymousClass1A1 A0K;
    public C32681e1 A0L;
    public WeakReference A0M;
    public WeakReference A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass00T A0Q = C36431kI.A1I(new C84524Do(this));
    public final AnonymousClass00T A0R = C36431kI.A1I(new C84534Dp(this));
    public final AnonymousClass00T A0S = C36431kI.A1I(new C84544Dq(this));
    public final AnonymousClass00T A0T = C36431kI.A1I(new C84554Dr(this));
    public final AnonymousClass00T A0U = C36431kI.A1I(new C84564Ds(this));
    public final AnonymousClass00T A0V = C36431kI.A1I(new C84574Dt(this));
    public final AnonymousClass00T A0W = C36431kI.A1I(new C84584Du(this));
    public final AnonymousClass00T A0X = C36431kI.A1I(new C84594Dv(this));
    public final AnonymousClass00T A0Y = C36431kI.A1I(new C84604Dw(this));
    public final AnonymousClass00T A0Z = C36431kI.A1I(new C84614Dx(this));
    public final AnonymousClass00T A0a = C36431kI.A1I(new C84624Dy(this));

    public static final void A05(AnonymousClass141 r8, AnonymousClass141 r9, AnonymousClass141 r10, AnonymousClass3T1 r11, ReportSpamDialogFragment reportSpamDialogFragment, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str, boolean z) {
        View A0Y2;
        View A0Y3;
        String A0q;
        ReportSpamDialogFragment reportSpamDialogFragment2 = reportSpamDialogFragment;
        boolean A092 = A09(reportSpamDialogFragment);
        WeakReference weakReference = reportSpamDialogFragment.A0M;
        Integer num = null;
        if (weakReference == null || (A0Y2 = AnonymousClass000.A0Y(weakReference)) == null) {
            throw C36381kD.A0k();
        }
        C36371kC.A1E(A0Y2, charSequence, R.id.report_spam_dialog_title);
        TextView A0P2 = C36391kE.A0P(A0Y2, R.id.report_spam_dialog_message);
        if (A092) {
            C36331k8.A10(A0P2, reportSpamDialogFragment.A02);
            Rect rect = AnonymousClass0BN.A0A;
            C21060yb r0 = reportSpamDialogFragment.A08;
            if (r0 != null) {
                C36371kC.A1I(A0P2, r0);
            } else {
                throw C36331k8.A0W();
            }
        }
        A0P2.setText(charSequence2);
        if (A092) {
            String str2 = str;
            if (str == null) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("ReportSpamDialogFragment/redesigned checkBoxTitle - null name, contact type is: ");
                AnonymousClass11F r02 = r8.A0H;
                if (r02 != null) {
                    num = Integer.valueOf(r02.getType());
                }
                C36331k8.A1P(num, A0u);
            } else {
                C222813r r03 = UserJid.Companion;
                UserJid A0k = C36411kG.A0k(r8);
                if (AnonymousClass143.A0H(A0k)) {
                    Object[] objArr = new Object[1];
                    if (reportSpamDialogFragment.A0H != null) {
                        AnonymousClass00C.A0E(A0k, "null cannot be cast to non-null type com.whatsapp.jid.InteropUserJid");
                        AnonymousClass00C.A0D(A0k, 0);
                        A0q = C36401kF.A0q(reportSpamDialogFragment, (Object) null, objArr, 0, R.string.f12nameremoved);
                    } else {
                        throw C36331k8.A0d("interopUiCache");
                    }
                } else {
                    A0q = C36401kF.A0q(reportSpamDialogFragment, str2, new Object[1], 0, R.string.f12nameremoved);
                }
                AnonymousClass00C.A0B(A0q);
                C36371kC.A1E(A0Y2, A0q, R.id.block_checkbox_title);
            }
        }
        C36371kC.A1E(A0Y2, charSequence3, R.id.block_checkbox_text);
        if (z) {
            WeakReference weakReference2 = reportSpamDialogFragment.A0M;
            if (weakReference2 == null || (A0Y3 = AnonymousClass000.A0Y(weakReference2)) == null) {
                throw C36381kD.A0k();
            }
            A0Y3.findViewById(R.id.block_container).setVisibility(8);
            ((CompoundButton) A0Y3.findViewById(R.id.block_checkbox)).setChecked(false);
        } else {
            ((CompoundButton) A0Y2.findViewById(R.id.block_checkbox)).setChecked(reportSpamDialogFragment.A0b().getBoolean("upsellCheckboxActionDefault"));
        }
        AnonymousClass3YC.A00(A0Y2.findViewById(R.id.report_spam_dialog_cancel), reportSpamDialogFragment, r8, 16);
        A0Y2.findViewById(R.id.report_spam_dialog_send).setOnClickListener(new AnonymousClass3YY(reportSpamDialogFragment2, r8, r9, r10, r11, 5));
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Window window;
        AnonymousClass00C.A0D(layoutInflater, 0);
        boolean A092 = A09(this);
        int i = R.layout.f9nameremoved;
        if (A092) {
            i = R.layout.f9nameremoved;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Dialog dialog = this.A02;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            C36341k9.A0r(A0a(), window, R.color.f6nameremoved);
        }
        AnonymousClass00C.A0B(inflate);
        return inflate;
    }

    public void A1S(Bundle bundle, View view) {
        C32091cx r1;
        AnonymousClass00C.A0D(view, 0);
        this.A0N = AnonymousClass001.A0F(view.findViewById(R.id.report_spam_dialog_loading));
        this.A0M = AnonymousClass001.A0F(view.findViewById(R.id.report_spam_dialog_content));
        if (C36331k8.A1b(this.A0T)) {
            AnonymousClass02E r12 = this.A0I;
            if ((r12 instanceof C32091cx) && (r1 = (C32091cx) r12) != null) {
                r1.BVg(this, true);
            }
        }
        AnonymousClass00T r3 = this.A0a;
        C65963Ud.A01(this, ((ReportSpamDialogViewModel) r3.getValue()).A01, new AnonymousClass4LI(this), 21);
        C65963Ud.A01(this, ((ReportSpamDialogViewModel) r3.getValue()).A02, new AnonymousClass4LJ(this), 20);
        ReportSpamDialogViewModel reportSpamDialogViewModel = (ReportSpamDialogViewModel) r3.getValue();
        AnonymousClass11F A0O2 = C36421kH.A0O(this.A0Q);
        boolean A1b = C36331k8.A1b(this.A0S);
        String A0x = C36371kC.A0x(this);
        int A022 = C36331k8.A02(this.A0Y);
        boolean A1b2 = C36331k8.A1b(this.A0W);
        AnonymousClass00C.A0D(A0O2, 0);
        C36331k8.A1T(new ReportSpamDialogViewModel$initializeSpamDialog$1(A0O2, (UserJid) this.A0V.getValue(), (C64933Qa) this.A0U.getValue(), reportSpamDialogViewModel, A0x, (C023509x) null, A022, A1b2, A1b), C109325Xd.A00(reportSpamDialogViewModel));
    }

    public void onCancel(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onCancel(dialogInterface);
        AnonymousClass3Os A1k = A1k();
        String A1E = C36431kI.A1E(this.A0R);
        AnonymousClass00C.A08(A1E);
        AnonymousClass11F A0O2 = C36421kH.A0O(this.A0Q);
        C36321k7.A0w(A1E, A0O2);
        AnonymousClass3Os.A00(A1k, A0O2, A1E, 2);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C32091cx r1;
        AnonymousClass00C.A0D(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        if (C36331k8.A1b(this.A0T)) {
            AnonymousClass02E r12 = this.A0I;
            if ((r12 instanceof C32091cx) && (r1 = (C32091cx) r12) != null) {
                r1.BVg(this, false);
            }
        }
        if (!this.A0P && AnonymousClass00C.A0J(this.A0R.getValue(), "status_post_report")) {
            C44502Nt r13 = new C44502Nt();
            r13.A00 = C36361kB.A0j();
            C21010yW r0 = this.A0E;
            if (r0 != null) {
                r0.Bly(r13);
                return;
            }
            throw C36331k8.A0d("wamRuntime");
        }
    }

    public static final void A07(ReportSpamDialogFragment reportSpamDialogFragment, boolean z) {
        View A0Y2;
        WeakReference weakReference = reportSpamDialogFragment.A0N;
        View view = null;
        if (weakReference != null) {
            view = AnonymousClass000.A0Y(weakReference);
        }
        int i = 0;
        if (view != null) {
            view.setVisibility(C36351kA.A00(z ? 1 : 0));
        }
        WeakReference weakReference2 = reportSpamDialogFragment.A0M;
        if (weakReference2 != null && (A0Y2 = AnonymousClass000.A0Y(weakReference2)) != null) {
            if (!(!z)) {
                i = 8;
            }
            A0Y2.setVisibility(i);
        }
    }

    public static final boolean A08(AnonymousClass141 r3, ReportSpamDialogFragment reportSpamDialogFragment) {
        C19420v0 r2 = reportSpamDialogFragment.A0A;
        if (r2 != null) {
            int A0O2 = r2.A0O("privacy_groupadd", 0);
            if (!r3.A0G() || A0O2 != 0 || reportSpamDialogFragment.A02.A0E(4314) || !reportSpamDialogFragment.A02.A0E(3995)) {
                return false;
            }
            return true;
        }
        throw C36331k8.A0d("waSharedPreferences");
    }

    public static final boolean A09(ReportSpamDialogFragment reportSpamDialogFragment) {
        if (!reportSpamDialogFragment.A02.A0E(6186)) {
            return false;
        }
        AnonymousClass00T r1 = reportSpamDialogFragment.A0Q;
        if ((r1.getValue() instanceof UserJid) || (r1.getValue() instanceof C177528dw)) {
            return true;
        }
        return false;
    }

    public final AnonymousClass3Os A1k() {
        AnonymousClass3Os r0 = this.A0F;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("reportFunnelLogger");
    }

    public static final Object A03(AnonymousClass141 r4, ReportSpamDialogFragment reportSpamDialogFragment, C023509x r6) {
        boolean z;
        AnonymousClass147 r3;
        if (!reportSpamDialogFragment.A0b().getBoolean("shouldDisplayUpsellCheckbox")) {
            z = true;
        } else {
            AnonymousClass11F r32 = r4.A0H;
            if ((r32 instanceof AnonymousClass147) && (r3 = (AnonymousClass147) r32) != null) {
                return AnonymousClass0A2.A00(r6, AnonymousClass19R.A01, new ReportSpamDialogFragment$shouldHideCheckBoxContainer$2(r4, r3, reportSpamDialogFragment, (C023509x) null));
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final void A06(ReportSpamDialogFragment reportSpamDialogFragment) {
        if (A09(reportSpamDialogFragment)) {
            AnonymousClass17Y r2 = reportSpamDialogFragment.A01;
            if (r2 != null) {
                r2.A07(R.string.f12nameremoved, 0);
                return;
            }
            throw C36321k7.A06();
        } else if (!reportSpamDialogFragment.A0O) {
            AnonymousClass17Y r22 = reportSpamDialogFragment.A01;
            if (r22 != null) {
                r22.A0H(new C81173wa((Object) reportSpamDialogFragment, 10));
                return;
            }
            throw C36321k7.A06();
        }
    }
}
