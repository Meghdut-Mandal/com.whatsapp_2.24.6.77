package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Aoo  reason: case insensitive filesystem */
public final class C22559Aoo extends AnonymousClass00R implements C019708j {
    public final /* synthetic */ AnonymousClass9XK $params;
    public final /* synthetic */ C201449jc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22559Aoo(AnonymousClass9XK r2, C201449jc r3) {
        super(6);
        this.this$0 = r3;
        this.$params = r2;
    }

    public /* bridge */ /* synthetic */ Object BKv(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        C64933Qa r1 = (C64933Qa) obj3;
        byte[] bArr3 = (byte[]) obj4;
        UserJid userJid = (UserJid) obj5;
        UserJid userJid2 = (UserJid) obj6;
        AnonymousClass00C.A0D(bArr, 0);
        C36321k7.A1B(bArr2, r1, bArr3, userJid, userJid2);
        C22941Ayr A00 = C201449jc.A00(userJid2, r1, this.$params.A06);
        byte[] B88 = A00.B88();
        C000100b r6 = this.this$0.A03;
        String str = r1.A01;
        AnonymousClass00C.A07(str);
        Object A01 = AnonymousClass9Zd.A01(userJid, userJid2, r6, str, this.$params.A06, bArr, bArr2, B88, bArr3);
        if (A01 == null) {
            UserJid A0B = this.this$0.A00.A0B(userJid);
            if (A0B != null) {
                A01 = AnonymousClass9Zd.A01(A0B, userJid2, this.this$0.A03, str, this.$params.A06, bArr, bArr2, A00.B88(), bArr3);
                if (A01 == null) {
                    A01 = AnonymousClass00C.A02(new C28541Tb(51));
                }
            } else {
                throw new C28541Tb(51);
            }
        }
        return new AnonymousClass0AK(A01);
    }
}
