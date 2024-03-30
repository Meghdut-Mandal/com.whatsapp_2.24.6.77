package com.whatsapp.emoji.search;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0AR;
import X.C009003v;
import X.C023509x;
import X.C111275c1;
import X.C154397Sa;
import X.C36371kC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider$searchAwait$2", f = "EmojiSearchProvider.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiSearchProvider$searchAwait$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $query;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiSearchProvider$searchAwait$2(EmojiSearchProvider emojiSearchProvider, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = emojiSearchProvider;
        this.$query = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiSearchProvider$searchAwait$2(this.this$0, this.$query, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            EmojiSearchProvider emojiSearchProvider = this.this$0;
            String str = this.$query;
            this.L$0 = emojiSearchProvider;
            this.L$1 = str;
            this.label = 1;
            AnonymousClass0AR A12 = C36371kC.A12(this);
            emojiSearchProvider.A02(str).A00(new C111275c1(A12, 0));
            A12.BL1(new C154397Sa(A12));
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
        return ((EmojiSearchProvider$searchAwait$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
