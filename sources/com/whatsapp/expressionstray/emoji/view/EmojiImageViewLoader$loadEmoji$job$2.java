package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass6AB;
import X.C009003v;
import X.C023509x;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmoji$job$2", f = "EmojiImageViewLoader.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmoji$job$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ AnonymousClass6AB $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmoji$job$2(AnonymousClass6AB r2, EmojiImageViewLoader emojiImageViewLoader, C023509x r4) {
        super(2, r4);
        this.this$0 = emojiImageViewLoader;
        this.$task = r2;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiImageViewLoader$loadEmoji$job$2(this.$task, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass0AO r3 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            EmojiImageViewLoader emojiImageViewLoader = this.this$0;
            AnonymousClass6AB r0 = this.$task;
            this.label = 1;
            if (EmojiImageViewLoader.A00(r0, emojiImageViewLoader, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            AnonymousClass0AN.A00(obj);
        } else {
            throw AnonymousClass000.A0e();
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmoji$job$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
