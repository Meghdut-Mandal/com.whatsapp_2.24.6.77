package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Anc  reason: case insensitive filesystem */
public final class C22499Anc extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ String $endCursor;
    public final /* synthetic */ boolean $isCategory;
    public final /* synthetic */ int $requestPageSize;
    public final /* synthetic */ int $thumbnailSize;
    public final /* synthetic */ UserJid $userJid;
    public final /* synthetic */ C202279lS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22499Anc(C202279lS r2, UserJid userJid, String str, String str2, int i, int i2, boolean z) {
        super(1);
        this.this$0 = r2;
        this.$collectionId = str;
        this.$userJid = userJid;
        this.$requestPageSize = i;
        this.$thumbnailSize = i2;
        this.$endCursor = str2;
        this.$isCategory = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C202279lS r0 = this.this$0;
        String str = this.$collectionId;
        UserJid userJid = this.$userJid;
        int i = this.$requestPageSize;
        int i2 = this.$thumbnailSize;
        AnonymousClass9XP r6 = new AnonymousClass9XP((AnonymousClass9W6) obj, userJid, str, r0.A0C.A02, this.$endCursor, i, i2, i2, this.$isCategory, false);
        A9L a9l = new A9L(new C193339Lb(this.this$0, this.$userJid, this.$endCursor, this.$collectionId));
        C200119ge r3 = r0.A0D;
        if (r3.A00.A0M(r6.A04) || !r0.A0I.A0E(1327)) {
            AnonymousClass3L6 r12 = r0.A0L;
            AnonymousClass19A r11 = r0.A0K;
            C19600wD r9 = r0.A0H;
            new AnonymousClass8V8(r0.A09, r6, r0.A0E, a9l, r9, r0.A0J, r11, r12, r0.A0M).A03();
        } else {
            r3.A03(r6, a9l);
        }
        return AnonymousClass0AJ.A00;
    }
}
