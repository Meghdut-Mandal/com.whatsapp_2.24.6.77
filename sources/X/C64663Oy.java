package X;

import android.content.Context;
import com.whatsapp.xfamily.crossposting.ui.AudienceNuxDialogFragment;
import com.whatsapp.xfamily.crossposting.ui.bottomsheet.CrosspostingLinkingDisclosureBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.3Oy  reason: invalid class name and case insensitive filesystem */
public final class C64663Oy {
    public static final AnonymousClass1US A05 = AnonymousClass1US.CROSSPOST_ACCOUNT_VALIDATION_MANAGER;
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;
    public final AnonymousClass005 A04;

    public final void A00(Context context, C88674Tp r20, Integer num, String str, List list) {
        AnonymousClass01L r12 = (AnonymousClass01L) C24801Dv.A01(context, AnonymousClass01L.class);
        AnonymousClass00C.A0D("CrosspostAccountValidationManager/validateAccountLink validating", 0);
        AnonymousClass005 r10 = this.A01;
        AnonymousClass1UM A10 = C36431kI.A10(r10);
        AnonymousClass1US r9 = A05;
        C88674Tp r13 = r20;
        Integer num2 = num;
        List list2 = list;
        if (!A10.A06(r9)) {
            ((AnonymousClass1UZ) this.A04.get()).A06(AnonymousClass6Y4.A03(num2), "SEE_LINKING_NUX", 927604110);
            AnonymousClass00C.A0D("CrosspostAccountValidationManager/validateAccountLink account not linked, starting contextual linking", 0);
            C79983ub r11 = new C79983ub(r12, r13, this, num2, str, list2);
            CrosspostingLinkingDisclosureBottomSheetDialogFragment crosspostingLinkingDisclosureBottomSheetDialogFragment = new CrosspostingLinkingDisclosureBottomSheetDialogFragment();
            crosspostingLinkingDisclosureBottomSheetDialogFragment.A02 = r11;
            C65443Sb.A00(crosspostingLinkingDisclosureBottomSheetDialogFragment, r12);
            return;
        }
        AnonymousClass005 r4 = this.A03;
        C51072nB r3 = (C51072nB) r4.get();
        AnonymousClass005 r5 = r3.A01;
        AnonymousClass1UM A102 = C36431kI.A10(r5);
        AnonymousClass1US r1 = C51072nB.A03;
        boolean z = true;
        if (!A102.A06(r1) || C36371kC.A1X(C36431kI.A10(r5).A01(r1), true) || AnonymousClass3NV.A01(r3.A02).getInt("pref_xfamily_audience_nux_dialog", 0) >= 1) {
            z = false;
        }
        AnonymousClass005 r2 = this.A04;
        AnonymousClass1UZ r14 = (AnonymousClass1UZ) r2.get();
        r14.A06(AnonymousClass6Y4.A03(num2), "INIT_CROSSPOST", 927599499);
        Boolean valueOf = Boolean.valueOf(C36371kC.A1X(C36431kI.A10(r10).A01(r9), true));
        if (z) {
            r14.A02(valueOf, "is_auto_crosspost");
            C65443Sb.A00(new AudienceNuxDialogFragment(new C602737e(r13, this, list2)), r12);
            ((AnonymousClass1UZ) r2.get()).A04("SEE_AUDIENCE_UPSELL");
            ((C51072nB) r4.get()).A04();
            return;
        }
        r14.A02(valueOf, "is_auto_crosspost");
        r13.BeD(list2);
    }

    public C64663Oy(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4, AnonymousClass005 r5) {
        C36321k7.A1B(r1, r2, r3, r4, r5);
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = r5;
    }
}
