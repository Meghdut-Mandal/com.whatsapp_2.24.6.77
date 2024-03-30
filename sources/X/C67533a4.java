package X;

import com.whatsapp.group.ExitGroupsDialogFragment;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.3a4  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67533a4 implements AnonymousClass08V {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C65053Qn A01;
    public final /* synthetic */ AnonymousClass147 A02;

    public /* synthetic */ C67533a4(C65053Qn r1, AnonymousClass147 r2, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = i;
    }

    public final Object apply(Object obj) {
        C65053Qn r4 = this.A01;
        AnonymousClass147 r3 = this.A02;
        int i = this.A00;
        C595934n r12 = (C595934n) obj;
        C225014r r1 = r4.A03;
        r1.Bnv();
        Set singleton = Collections.singleton(r3);
        boolean A1S = AnonymousClass000.A1S(i, 1);
        String str = "group_spam_banner_exit";
        if (r4.A01) {
            str = "triggered_block";
        }
        r1.Btm(ExitGroupsDialogFragment.A03(r12.A01, str, singleton, 0, 2, A1S, r4.A05.A0O(r3)));
        return null;
    }
}
