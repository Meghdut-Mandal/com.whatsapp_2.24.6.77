package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.Aom  reason: case insensitive filesystem */
public final class C22557Aom extends AnonymousClass00R implements C019408g {
    public final /* synthetic */ C172968Pw $encCommentMessage;
    public final /* synthetic */ C195759Vv $parentKeyExtended;
    public final /* synthetic */ C193379Lf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22557Aom(C193379Lf r2, C172968Pw r3, C195759Vv r4) {
        super(3);
        this.$encCommentMessage = r3;
        this.this$0 = r2;
        this.$parentKeyExtended = r4;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        Object obj4;
        UserJid userJid = (UserJid) obj;
        UserJid userJid2 = (UserJid) obj2;
        byte[] bArr = (byte[]) obj3;
        AnonymousClass00C.A0D(userJid, 0);
        C36321k7.A0x(userJid2, bArr);
        byte[] A06 = this.$encCommentMessage.encPayload_.A06();
        byte[] A062 = this.$encCommentMessage.encIv_.A06();
        AnonymousClass00C.A0B(A062);
        AnonymousClass00C.A0B(A06);
        C000100b r5 = this.this$0.A03;
        String str = this.$parentKeyExtended.A01.A01;
        AnonymousClass00C.A07(str);
        byte[] A01 = AnonymousClass9Zd.A01(userJid, userJid2, r5, str, "Enc Comment", A062, A06, (byte[]) null, bArr);
        if (A01 == null || AnonymousClass000.A1Q(A01.length)) {
            C28541Tb A0J = C165567td.A0J(0);
            AnonymousClass00C.A0D(A0J, 0);
            obj4 = C90524aI.A0t(A0J);
        } else {
            try {
                obj4 = AnonymousClass8SX.A0i(A01);
            } catch (AnonymousClass186 e) {
                Log.e("CommentMessageEncryptionManager/Message was not decrypted successfully");
                throw new C28541Tb((Exception) e, (Integer) 51);
            }
        }
        return new AnonymousClass0AK(obj4);
    }
}
