package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Ana  reason: case insensitive filesystem */
public final class C22497Ana extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ boolean $isAllItemsCollectionRequest;
    public final /* synthetic */ UserJid $jid;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbSize;
    public final /* synthetic */ C202279lS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22497Ana(C202279lS r2, UserJid userJid, int i, int i2, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$jid = userJid;
        this.$isAllItemsCollectionRequest = z;
        this.$requestPageSize = i;
        this.$thumbSize = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass9VS r0;
        String str;
        AnonymousClass9W6 r11 = (AnonymousClass9W6) obj;
        C29461Ws r2 = this.this$0.A0B;
        UserJid userJid = this.$jid;
        AnonymousClass00C.A0D(userJid, 0);
        synchronized (r2) {
            C198089ct r02 = (C198089ct) r2.A01.get(userJid);
            if (r02 != null) {
                r0 = r02.A01;
            } else {
                r0 = null;
            }
        }
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        if (this.this$0.A0B(this.$jid)) {
            C202279lS r22 = this.this$0;
            r22.A02 = true;
            if (this.$isAllItemsCollectionRequest) {
                C36341k9.A18(r22.A05, true);
            }
            UserJid userJid2 = this.$jid;
            int i = this.$requestPageSize;
            int i2 = this.$thumbSize;
            C202279lS r23 = this.this$0;
            C200939iV r3 = new C200939iV(userJid2, str, r23.A0C.A02, i, i2, i2);
            r3.A01 = r11;
            r23.A05(new A91(r23, userJid2, str, this.$isAllItemsCollectionRequest), r3);
        }
        return AnonymousClass0AJ.A00;
    }
}
