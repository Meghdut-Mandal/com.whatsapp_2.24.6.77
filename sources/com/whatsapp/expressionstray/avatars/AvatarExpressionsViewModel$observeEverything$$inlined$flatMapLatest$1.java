package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55K;
import X.C007403e;
import X.C009003v;
import X.C019408g;
import X.C023509x;
import X.C06820Vf;
import X.C06830Vg;
import X.C13010j1;
import X.C18500tG;
import X.C18510tH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.avatars.AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C023509x r3) {
        super(3, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(this.this$0, (C023509x) obj3);
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05H r3;
        AnonymousClass0AO r6 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r5 = (AnonymousClass05G) this.L$0;
            if (!AnonymousClass000.A1X(this.L$1)) {
                r3 = new C18500tG(AnonymousClass55K.A00, 0);
            } else {
                AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                r3 = new C18510tH((C009003v) new AvatarExpressionsViewModel$observeAvatarStickers$2(avatarExpressionsViewModel, (C023509x) null), (AnonymousClass05H) C06830Vg.A00(new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(avatarExpressionsViewModel, (C023509x) null), new C13010j1((C007403e) null, avatarExpressionsViewModel.A05.A01)), 5);
            }
            this.label = 1;
            if (C06820Vf.A00(this, r3, r5) == r6) {
                return r6;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
