package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55S;
import X.C009003v;
import X.C023509x;
import X.C18010sR;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$1", f = "EmojiExpressionsViewModel.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsViewModel$onEmojiLongTapped$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int[] $emoji;
    public final /* synthetic */ int $position;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$onEmojiLongTapped$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C023509x r3, int[] iArr, int i) {
        super(2, r3);
        this.this$0 = emojiExpressionsViewModel;
        this.$emoji = iArr;
        this.$position = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EmojiExpressionsViewModel$onEmojiLongTapped$1(this.this$0, r6, this.$emoji, this.$position);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C18010sR r3 = this.this$0.A00;
            AnonymousClass55S r0 = new AnonymousClass55S(this.$emoji, this.$position);
            this.label = 1;
            if (r3.Bpf(r0, this) == r5) {
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
        return ((EmojiExpressionsViewModel$onEmojiLongTapped$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}