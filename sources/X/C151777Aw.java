package X;

import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader", f = "EmojiImageViewLoader.kt", i = {0, 0, 0, 0}, l = {146}, m = "loadEmojiIntoView", n = {"this", "task", "validTargetsAfterLoad", "allTargetsValidBeforeLoad"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* renamed from: X.7Aw  reason: invalid class name and case insensitive filesystem */
public final class C151777Aw extends AnonymousClass0A0 {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmojiImageViewLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151777Aw(EmojiImageViewLoader emojiImageViewLoader, C023509x r2) {
        super(r2);
        this.this$0 = emojiImageViewLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return EmojiImageViewLoader.A00((AnonymousClass6AB) null, this.this$0, this);
    }
}
