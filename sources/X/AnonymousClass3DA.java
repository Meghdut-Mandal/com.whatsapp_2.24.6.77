package X;

/* renamed from: X.3DA  reason: invalid class name */
public class AnonymousClass3DA {
    public final /* synthetic */ AnonymousClass4V8 A00;
    public final /* synthetic */ C65503Si A01;

    public AnonymousClass3DA(AnonymousClass4V8 r1, C65503Si r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(AnonymousClass11F r5, int i, int i2) {
        C19420v0 r3 = this.A01.A01;
        C36341k9.A0x(C19420v0.A00(r3), "storage_usage_deletion_jid", r5.getRawString());
        C36341k9.A0v(C19420v0.A00(r3).putInt("storage_usage_deletion_current_msg_cnt", i), "storage_usage_deletion_all_msg_cnt", i2);
        this.A00.Bdh(i, i2);
    }
}
