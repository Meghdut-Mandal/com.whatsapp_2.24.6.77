package com.whatsapp.expressionstray.conversation;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AN;
import X.AnonymousClass1XN;
import X.AnonymousClass1XQ;
import X.AnonymousClass2M9;
import X.AnonymousClass38I;
import X.AnonymousClass6JA;
import X.C009003v;
import X.C023509x;
import X.C122495uw;
import X.C1898996a;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.conversation.ExpressionsKeyboardViewModel$preRenderRecentEmojis$1", f = "ExpressionsKeyboardViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionsKeyboardViewModel$preRenderRecentEmojis$1 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ C122495uw $emojiPrerenderCache;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(C122495uw r2, C023509x r3) {
        super(2, r3);
        this.$emojiPrerenderCache = r2;
    }

    public final C023509x create(Object obj, C023509x r4) {
        return new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(this.$emojiPrerenderCache, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ExpressionsKeyboardViewModel$preRenderRecentEmojis$1(this.$emojiPrerenderCache, (C023509x) obj2).invokeSuspend(AnonymousClass0AJ.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            AnonymousClass0AN.A00(obj);
            C122495uw r8 = this.$emojiPrerenderCache;
            if (r8 != null) {
                AnonymousClass1XN r7 = r8.A01;
                if (r7.A02() > 0) {
                    int A02 = r7.A02();
                    for (int i = 0; i < A02; i++) {
                        int[] iArr = (int[]) r7.A03(i);
                        AnonymousClass00C.A0B(iArr);
                        AnonymousClass2M9 r4 = new AnonymousClass2M9(iArr);
                        r8.A02.A05(r8.A00, r4, C1898996a.A00(r4, false));
                    }
                } else {
                    AnonymousClass38I[] A00 = AnonymousClass6JA.A00(r8.A03);
                    AnonymousClass00C.A08(A00);
                    List list = (List) A00[0].A03.get();
                    AnonymousClass00C.A08(list);
                    int min = Math.min(list.size(), 50);
                    for (int i2 = 0; i2 < min; i2++) {
                        AnonymousClass2M9 r42 = new AnonymousClass2M9(((AnonymousClass1XQ) list.get(i2)).A00);
                        r8.A02.A05(r8.A00, r42, C1898996a.A00(r42, false));
                    }
                }
            }
            return AnonymousClass0AJ.A00;
        }
        throw AnonymousClass000.A0e();
    }
}
