package com.whatsapp.expressionstray.emoji.data;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass03N;
import X.AnonymousClass09z;
import X.AnonymousClass0A1;
import X.AnonymousClass0AJ;
import X.AnonymousClass0AK;
import X.AnonymousClass0AN;
import X.AnonymousClass0AO;
import X.AnonymousClass1XQ;
import X.AnonymousClass3TY;
import X.AnonymousClass3UO;
import X.AnonymousClass6CK;
import X.C007103b;
import X.C009003v;
import X.C023509x;
import X.C1033655b;
import X.C1033855d;
import X.C1034355i;
import X.C130496Lh;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.emoji.data.EmojiExpressionsDataSource$getEmojiSearchItems$2", f = "EmojiExpressionsDataSource.kt", i = {0, 0}, l = {158}, m = "invokeSuspend", n = {"searchSection", "emojiGridItems"}, s = {"L$0", "L$1"})
public final class EmojiExpressionsDataSource$getEmojiSearchItems$2 extends AnonymousClass0A1 implements C009003v {
    public final /* synthetic */ String $searchQuery;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ C130496Lh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsDataSource$getEmojiSearchItems$2(C130496Lh r2, String str, C023509x r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$searchQuery = str;
    }

    public final C023509x create(Object obj, C023509x r5) {
        return new EmojiExpressionsDataSource$getEmojiSearchItems$2(this.this$0, this.$searchQuery, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass6CK r6;
        List A0I;
        Object A03;
        AnonymousClass0AO r4 = AnonymousClass0AO.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AnonymousClass0AN.A00(obj);
            if (!this.this$0.A02.A02) {
                return C1033855d.A00;
            }
            r6 = new AnonymousClass6CK(R.drawable.selector_emoji_recent, R.string.f12nameremoved, "search", true);
            A0I = AnonymousClass001.A0I();
            EmojiSearchProvider emojiSearchProvider = this.this$0.A02;
            String str = this.$searchQuery;
            this.L$0 = r6;
            this.L$1 = A0I;
            this.label = 1;
            A03 = emojiSearchProvider.A03(str, this);
            if (A03 == r4) {
                return r4;
            }
        } else if (i == 1) {
            A0I = (List) this.L$1;
            r6 = (AnonymousClass6CK) this.L$0;
            AnonymousClass0AN.A00(obj);
            A03 = ((AnonymousClass0AK) obj).value;
        } else {
            throw AnonymousClass000.A0e();
        }
        if (A03 instanceof AnonymousClass03N) {
            A03 = null;
        }
        Iterable iterable = (Iterable) A03;
        if (iterable != null) {
            List<AnonymousClass1XQ> A0V = C007103b.A0V(iterable);
            C130496Lh r3 = this.this$0;
            for (AnonymousClass1XQ r0 : A0V) {
                int[] iArr = r0.A00;
                int[] iArr2 = iArr;
                if (AnonymousClass3UO.A02(iArr)) {
                    iArr2 = AnonymousClass3TY.A04(r3.A05, iArr);
                } else if (AnonymousClass3UO.A03(iArr)) {
                    iArr2 = AnonymousClass3TY.A05(r3.A05, iArr);
                } else {
                    A0I.add(new C1034355i(r3.A01, r6, (Integer) null, iArr, iArr2));
                }
                AnonymousClass00C.A08(iArr2);
                A0I.add(new C1034355i(r3.A01, r6, (Integer) null, iArr, iArr2));
            }
        }
        return new C1033655b(A0I);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsDataSource$getEmojiSearchItems$2) AnonymousClass09z.A00(obj2, obj, this)).invokeSuspend(AnonymousClass0AJ.A00);
    }
}
