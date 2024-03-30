package com.whatsapp.expressionstray.emoji.view;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.C009003v;
import X.C023509x;
import X.C1275368r;
import X.C128966Eh;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader$loadEmojiIntoView$3", f = "EmojiImageViewLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmojiImageViewLoader$loadEmojiIntoView$3 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ List $validTargetsAfterLoad;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiImageViewLoader$loadEmojiIntoView$3(List list, C023509x r3) {
        super(2, r3);
        this.$validTargetsAfterLoad = list;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new EmojiImageViewLoader$loadEmojiIntoView$3(this.$validTargetsAfterLoad, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new EmojiImageViewLoader$loadEmojiIntoView$3(this.$validTargetsAfterLoad, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EmojiImageView emojiImageView;
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            for (C128966Eh r3 : this.$validTargetsAfterLoad) {
                C1275368r r2 = r3.A03;
                WeakReference weakReference = r3.A04;
                View A0Y = AnonymousClass000.A0Y(weakReference);
                if (A0Y != null) {
                    obj2 = A0Y.getTag();
                } else {
                    obj2 = null;
                }
                if (AnonymousClass00C.A0J(r2, obj2) && (emojiImageView = (EmojiImageView) weakReference.get()) != null) {
                    emojiImageView.A00(r3.A02.A01(), r3.A00);
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
