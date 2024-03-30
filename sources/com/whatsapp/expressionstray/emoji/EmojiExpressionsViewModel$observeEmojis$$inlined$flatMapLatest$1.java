package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass05H;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass0R1;
import X.C019408g;
import X.C023509x;
import X.C06820Vf;
import X.C1510277s;
import X.C15330nA;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {193}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 extends AnonymousClass0A1 implements C019408g {
    public final /* synthetic */ int $batch$inlined;
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C023509x r3, int i) {
        super(3, r3);
        this.this$0 = emojiExpressionsViewModel;
        this.$batch$inlined = i;
    }

    public /* bridge */ /* synthetic */ Object BKt(Object obj, Object obj2, Object obj3) {
        EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1 = new EmojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1(this.this$0, (C023509x) obj3, this.$batch$inlined);
        emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.L$0 = obj;
        emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.L$1 = obj2;
        return emojiExpressionsViewModel$observeEmojis$$inlined$flatMapLatest$1.invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05H r3;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            AnonymousClass05G r4 = (AnonymousClass05G) this.L$0;
            String str = (String) this.L$1;
            if (str == null || str.length() <= 0) {
                EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
                r3 = new C1510277s(this.this$0, AnonymousClass0R1.A00(emojiExpressionsViewModel.A0B, new C15330nA(new EmojiExpressionsViewModel$observeEmojiGrid$1(emojiExpressionsViewModel, (C023509x) null))), this.$batch$inlined);
            } else {
                r3 = new C15330nA(new EmojiExpressionsViewModel$observeEmojis$1$1(this.this$0, str, (C023509x) null, this.$batch$inlined));
            }
            this.label = 1;
            if (C06820Vf.A00(this, r3, r4) == r5) {
                return r5;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }
}
