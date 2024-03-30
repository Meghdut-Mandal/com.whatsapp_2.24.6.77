package com.whatsapp.expressionstray.emoji;

import X.AnonymousClass000;
import X.AnonymousClass05G;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0A2;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass55W;
import X.AnonymousClass55Y;
import X.AnonymousClass55Z;
import X.C009003v;
import X.C023509x;
import X.C1033655b;
import X.C110675b3;
import X.C130496Lh;
import com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiSearchItems$2;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$observeEmojis$1$1", f = "EmojiExpressionsViewModel.kt", i = {0}, l = {80, 84, 87, 91}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class EmojiExpressionsViewModel$observeEmojis$1$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ int $batch;
    public final /* synthetic */ String $searchQuery;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojis$1$1(EmojiExpressionsViewModel emojiExpressionsViewModel, String str, C023509x r4, int i) {
        super(2, r4);
        this.this$0 = emojiExpressionsViewModel;
        this.$searchQuery = str;
        this.$batch = i;
    }

    public final C023509x create(Object obj, C023509x r6) {
        EmojiExpressionsViewModel$observeEmojis$1$1 emojiExpressionsViewModel$observeEmojis$1$1 = new EmojiExpressionsViewModel$observeEmojis$1$1(this.this$0, this.$searchQuery, r6, this.$batch);
        emojiExpressionsViewModel$observeEmojis$1$1.L$0 = obj;
        return emojiExpressionsViewModel$observeEmojis$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass05G r4;
        Object obj2;
        AnonymousClass0AO r5 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            r4 = (AnonymousClass05G) this.L$0;
            C130496Lh r7 = this.this$0.A05;
            String str = this.$searchQuery;
            this.L$0 = r4;
            this.label = 1;
            obj = AnonymousClass0A2.A00(this, r7.A07, new EmojiExpressionsDataSource$getEmojiSearchItems$2(r7, str, (C023509x) null));
            if (obj == r5) {
                return r5;
            }
        } else if (i == 1) {
            r4 = (AnonymousClass05G) this.L$0;
            AnonymousClass0AN.A00(obj);
        } else if (i == 2 || i == 3 || i == 4) {
            AnonymousClass0AN.A00(obj);
            return AnonymousClass0AJ.A00;
        } else {
            throw AnonymousClass000.A0e();
        }
        C110675b3 r11 = (C110675b3) obj;
        if (r11 instanceof C1033655b) {
            List list = ((C1033655b) r11).A00;
            if (list.isEmpty()) {
                obj2 = AnonymousClass55Y.A00;
                this.L$0 = null;
                this.label = 2;
            } else {
                EmojiExpressionsViewModel emojiExpressionsViewModel = this.this$0;
                int i2 = this.$batch;
                if (i2 != 0) {
                    list = EmojiExpressionsViewModel.A01(emojiExpressionsViewModel, (Integer) null, list, i2);
                }
                obj2 = new AnonymousClass55W(list);
                this.L$0 = null;
                this.label = 3;
            }
        } else {
            obj2 = AnonymousClass55Z.A00;
            this.L$0 = null;
            this.label = 4;
        }
        if (r4.B6N(obj2, this) == r5) {
            return r5;
        }
        return AnonymousClass0AJ.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$observeEmojis$1$1) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
