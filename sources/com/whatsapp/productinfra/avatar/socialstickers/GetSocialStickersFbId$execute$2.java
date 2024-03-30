package com.whatsapp.productinfra.avatar.socialstickers;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.AnonymousClass6Bd;
import X.AnonymousClass7TP;
import X.AnonymousClass7TQ;
import X.C009003v;
import X.C023509x;
import X.C120125r0;
import X.C165037sm;
import X.C186018vH;
import X.C203399nx;
import X.C36371kC;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.socialstickers.GetSocialStickersFbId$execute$2", f = "GetSocialStickersFbId.kt", i = {0, 0}, l = {94}, m = "invokeSuspend", n = {"iqId", "contactFbIdRequest"}, s = {"L$0", "L$1"})
public final class GetSocialStickersFbId$execute$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ UserJid $userJid;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ C120125r0 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetSocialStickersFbId$execute$2(UserJid userJid, C120125r0 r3, C023509x r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$userJid = userJid;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new GetSocialStickersFbId$execute$2(this.$userJid, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            String A09 = this.this$0.A00.A01.A09();
            C186018vH r3 = new C186018vH(this.$userJid, A09);
            C120125r0 r2 = this.this$0;
            this.L$0 = A09;
            this.L$1 = r3;
            this.L$2 = r2;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            C165037sm r6 = new C165037sm(A12, 0);
            AnonymousClass6Bd r5 = r2.A00;
            C203399nx r7 = r3.A00;
            AnonymousClass00C.A08(r7);
            r5.A02(r6, r7, A09, new AnonymousClass7TP(A12), new AnonymousClass7TQ(A12));
            obj = A12.A0G();
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetSocialStickersFbId$execute$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
