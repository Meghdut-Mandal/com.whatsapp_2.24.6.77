package X;

import android.view.View;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C32051cs implements C32061ct {
    public final /* synthetic */ AnonymousClass155 A00;
    public final /* synthetic */ ConversationsFragment A01;

    public /* synthetic */ C32051cs(AnonymousClass155 r1, ConversationsFragment conversationsFragment) {
        this.A01 = conversationsFragment;
        this.A00 = r1;
    }

    public final void Bf7(C63093Is r7) {
        ConversationsFragment conversationsFragment = this.A01;
        AnonymousClass155 r3 = this.A00;
        C51832oS r1 = r7.A02;
        if (r1 == C51832oS.SUCCESS) {
            C38161nw r4 = conversationsFragment.A1J;
            r4.setOnClickListener((View.OnClickListener) null);
            ((AnonymousClass3L5) conversationsFragment.A31.get()).A01(0, 1);
            r4.A00(new C81993xy(r3, r4, conversationsFragment));
        } else if (r1 == C51832oS.ERROR_AUTH_NOT_SETUP) {
            ((C235718z) conversationsFragment.A32.get()).A07((C53502rQ) null).B2U();
            AnonymousClass00C.A0D(r3, 0);
            ((C235718z) conversationsFragment.A32.get()).A0D(r3, r7, (C88484Sw) null, (AnonymousClass11F) null);
        }
    }
}
