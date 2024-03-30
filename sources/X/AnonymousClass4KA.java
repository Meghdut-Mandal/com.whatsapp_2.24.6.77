package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.4KA  reason: invalid class name */
public final class AnonymousClass4KA extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ AnonymousClass1PS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4KA(AnonymousClass1PS r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass141 A08;
        GroupJid groupJid = (GroupJid) obj;
        AnonymousClass00C.A0D(groupJid, 0);
        boolean z = true;
        if (this.this$0.A02.A05(groupJid) != 6 || (A08 = this.this$0.A00.A08(groupJid)) == null || A08.A0e || !this.this$0.A03.A0D(groupJid)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
