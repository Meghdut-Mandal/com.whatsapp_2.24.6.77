package X;

import com.whatsapp.xfamily.crossposting.ui.AutoShareNuxDialogFragment;
import java.util.List;

/* renamed from: X.3ub  reason: invalid class name and case insensitive filesystem */
public final class C79983ub implements C159817jy {
    public final /* synthetic */ AnonymousClass01L A00;
    public final /* synthetic */ C88674Tp A01;
    public final /* synthetic */ C64663Oy A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;

    public C79983ub(AnonymousClass01L r1, C88674Tp r2, C64663Oy r3, Integer num, String str, List list) {
        this.A02 = r3;
        this.A03 = num;
        this.A00 = r1;
        this.A05 = list;
        this.A04 = str;
        this.A01 = r2;
    }

    public void onSuccess() {
        AnonymousClass00C.A0D("CrosspostAccountValidationManager/validateAccountLink link successful", 0);
        C64663Oy r6 = this.A02;
        AnonymousClass005 r5 = r6.A04;
        ((AnonymousClass1UZ) r5.get()).A06(AnonymousClass6Y4.A03(this.A03), "INIT_CROSSPOST", 927599499);
        AnonymousClass01L r4 = this.A00;
        List list = this.A05;
        C65443Sb.A00(new AutoShareNuxDialogFragment(new C606638w(this.A01, r6, this.A04, list)), r4);
        ((AnonymousClass1UZ) r5.get()).A04("SEE_CONTEXTUAL_UPSELL");
        ((C51072nB) r6.A03.get()).A04();
    }

    public void BXT(AnonymousClass5VM r3, Integer num, Integer num2) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostAccountValidationManager/validateAccountLink Failed to link account. Error code: ");
        A0u.append(num);
        AnonymousClass00C.A0D(AnonymousClass000.A0l(num2, ", subcode: ", A0u), 0);
        this.A01.BXT(r3, num, num2);
    }
}
