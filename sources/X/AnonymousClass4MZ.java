package X;

import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.4MZ  reason: invalid class name */
public final class AnonymousClass4MZ extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ C107265Nh $callLog;
    public final /* synthetic */ C106265Iz $fMessage;
    public final /* synthetic */ C174918Yy this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MZ(C106265Iz r2, C174918Yy r3, C107265Nh r4) {
        super(1);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 r4 = (AnonymousClass141) obj;
        AnonymousClass00C.A0D(r4, 0);
        C225314u r2 = (C225314u) C36361kB.A05(this.this$0);
        if (r2 == null) {
            return null;
        }
        C107265Nh r1 = this.$callLog;
        C106265Iz r0 = this.$fMessage;
        return Boolean.valueOf(CallConfirmationFragment.A08(r2, r4, Integer.valueOf(C174918Yy.A0B(r0)), r1.A0K));
    }
}
