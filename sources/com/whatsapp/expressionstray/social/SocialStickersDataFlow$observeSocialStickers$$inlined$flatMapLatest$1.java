package com.whatsapp.expressionstray.social;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass11F;
import X.C019408g;
import X.C023509x;
import X.C06820Vf;
import X.C124215xm;
import X.C15330nA;
import X.C18500tG;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.social.SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1", f = "SocialStickersDataFlow.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ String $ownFbId$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ C124215xm this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(C124215xm r2, String str, C023509x r4) {
        super(3, r4);
        this.this$0 = r2;
        this.$ownFbId$inlined = str;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1 = new SocialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1(this.this$0, this.$ownFbId$inlined, (C023509x) obj3);
        socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.L$0 = obj;
        socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.L$1 = obj2;
        return socialStickersDataFlow$observeSocialStickers$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05H r1;
        AnonymousClass0AO r7 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r5 = (AnonymousClass05G) this.L$0;
            AnonymousClass11F r4 = (AnonymousClass11F) this.L$1;
            if (!(r4 instanceof UserJid) || r4 == null) {
                r1 = new C18500tG((Object) null, 0);
            } else {
                r1 = new C15330nA(new SocialStickersDataFlow$observeSocialStickers$chatFbIdFlow$1$1(this.this$0, r4, this.$ownFbId$inlined, (C023509x) null));
            }
            this.label = 1;
            if (C06820Vf.A00(this, r1, r5) == r7) {
                return r7;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
