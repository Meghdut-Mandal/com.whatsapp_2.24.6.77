package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass5TR;
import X.C009003v;
import X.C023509x;
import X.C128566Ct;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$5", f = "EmojiImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmojiIntoView$5 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ Drawable $icon;
    public final /* synthetic */ C128566Ct $task;
    public int label;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmojiIntoView$5(Drawable drawable, C128566Ct r3, EmojiImageViewLoader emojiImageViewLoader, C023509x r5) {
        super(2, r5);
        this.$task = r3;
        this.$icon = drawable;
        this.this$0 = emojiImageViewLoader;
    }

    public final C023509x create(Object obj, C023509x r6) {
        return new EmojiImageViewLoader$loadEmojiIntoView$5(this.$icon, this.$task, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C128566Ct r3 = this.$task;
            EmojiImageView emojiImageView = (EmojiImageView) r3.A04.get();
            if (emojiImageView != null) {
                emojiImageView.A00(r3.A01.A01(), this.$icon);
                Integer num = this.$task.A03;
                if (num != null) {
                    this.this$0.A02.A00(num.intValue(), "emoji_image_loader_load_end", (String) null);
                    this.this$0.A02.A01(AnonymousClass5TR.SUCCESS, this.$task.A03.intValue());
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiImageViewLoader$loadEmojiIntoView$5) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
