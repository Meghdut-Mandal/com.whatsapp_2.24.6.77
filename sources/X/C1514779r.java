package X;

import com.whatsapp.emoji.search.EmojiSearchProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.emoji.search.EmojiSearchProvider", f = "EmojiSearchProvider.kt", i = {}, l = {33}, m = "searchAwait-gIAlu-s", n = {}, s = {})
/* renamed from: X.79r  reason: invalid class name and case insensitive filesystem */
public final class C1514779r extends AnonymousClass0A0 {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ EmojiSearchProvider this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1514779r(EmojiSearchProvider emojiSearchProvider, C023509x r2) {
        super(r2);
        this.this$0 = emojiSearchProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object A03 = this.this$0.A03((String) null, this);
        if (A03 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return new AnonymousClass0AK(A03);
        }
        return A03;
    }
}
