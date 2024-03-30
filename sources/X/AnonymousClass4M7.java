package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Map;

/* renamed from: X.4M7  reason: invalid class name */
public final class AnonymousClass4M7 extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C006302t $callback;
    public final /* synthetic */ C29581Xe this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4M7(C29581Xe r2, C006302t r3) {
        super(1);
        this.this$0 = r2;
        this.$callback = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C006302t r1;
        boolean z;
        C52292pC r2;
        AnonymousClass2bT r5 = (AnonymousClass2bT) obj;
        AnonymousClass00C.A0D(r5, 0);
        Map A1Y = r5.A1Y();
        boolean z2 = false;
        if (A1Y != null) {
            PhoneUserJid A0n = C36441kJ.A0n(this.this$0.A00);
            AnonymousClass00C.A0E(A0n, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            C46762bd r0 = (C46762bd) A1Y.get(A0n);
            if (r0 != null) {
                r2 = r0.A01;
            } else {
                r2 = null;
            }
            r1 = this.$callback;
            if (r2 == C52292pC.GOING) {
                z2 = true;
            }
            z = Boolean.valueOf(z2);
        } else {
            r1 = this.$callback;
            z = false;
        }
        r1.invoke(z);
        return AnonymousClass0AJ.A00;
    }
}
