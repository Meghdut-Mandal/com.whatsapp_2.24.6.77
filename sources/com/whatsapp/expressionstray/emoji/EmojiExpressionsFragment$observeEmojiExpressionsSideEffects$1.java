package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass000;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.C009003v;
import X.C023509x;
import X.C06810Ve;
import X.C15390nG;
import X.C164237rU;
import X.C90464aC;
import X.C90514aH;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1", f = "EmojiExpressionsFragment.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1 extends AnonymousClass0A1 implements C009003v {
    public int label;
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1(EmojiExpressionsFragment emojiExpressionsFragment, C023509x r3) {
        super(2, r3);
        this.this$0 = emojiExpressionsFragment;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EmojiExpressionsFragment$observeEmojiExpressionsSideEffects$1(this.this$0, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            C15390nG A0p = C90464aC.A0p(this.this$0, C06810Ve.A01(C90514aH.A0c(this.this$0).A00));
            C164237rU r0 = new C164237rU(this.this$0, 15);
            this.label = 1;
            if (A0p.B36(this, r0) == r5) {
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
