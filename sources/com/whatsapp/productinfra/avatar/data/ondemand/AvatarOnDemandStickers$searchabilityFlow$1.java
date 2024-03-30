package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C05770Qz;
import X.C104645Ao;
import X.C138176hQ;
import X.C14540ln;
import X.C18000sQ;
import X.C90524aI;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$searchabilityFlow$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {369}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$searchabilityFlow$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $qplInstanceKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$searchabilityFlow$1(AvatarOnDemandStickers avatarOnDemandStickers, C023509x r3, int i) {
        super(2, r3);
        this.this$0 = avatarOnDemandStickers;
        this.$qplInstanceKey = i;
    }

    public final C023509x create(Object obj, C023509x r5) {
        AvatarOnDemandStickers$searchabilityFlow$1 avatarOnDemandStickers$searchabilityFlow$1 = new AvatarOnDemandStickers$searchabilityFlow$1(this.this$0, r5, this.$qplInstanceKey);
        avatarOnDemandStickers$searchabilityFlow$1.L$0 = obj;
        return avatarOnDemandStickers$searchabilityFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18000sQ r3 = (C18000sQ) this.L$0;
            C104645Ao r2 = this.this$0.A02;
            r2.A00 = new C138176hQ(r3, 2);
            r2.A01(C90524aI.A0a(this.$qplInstanceKey));
            this.label = 1;
            if (C05770Qz.A00(this, C14540ln.A00, r3) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarOnDemandStickers$searchabilityFlow$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
