package X;

import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$1;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onEmojiLongTapped$2;

/* renamed from: X.7Y7  reason: invalid class name */
public final class AnonymousClass7Y7 extends AnonymousClass00R implements C009003v {
    public final /* synthetic */ EmojiExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7Y7(EmojiExpressionsFragment emojiExpressionsFragment) {
        super(2);
        this.this$0 = emojiExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass040 A00;
        C009003v emojiExpressionsViewModel$onEmojiLongTapped$2;
        int A0I = AnonymousClass000.A0I(obj);
        int[] iArr = (int[]) obj2;
        AnonymousClass00C.A0D(iArr, 1);
        EmojiExpressionsViewModel A0c = C90514aH.A0c(this.this$0);
        if (AnonymousClass3UO.A02(iArr)) {
            A0c.A01.A1F(1);
            A00 = C109325Xd.A00(A0c);
            emojiExpressionsViewModel$onEmojiLongTapped$2 = new EmojiExpressionsViewModel$onEmojiLongTapped$1(A0c, (C023509x) null, iArr, A0I);
        } else {
            if (AnonymousClass3UO.A03(iArr)) {
                A0c.A01.A1F(1);
                A00 = C109325Xd.A00(A0c);
                emojiExpressionsViewModel$onEmojiLongTapped$2 = new EmojiExpressionsViewModel$onEmojiLongTapped$2(A0c, (C023509x) null, iArr, A0I);
            }
            return AnonymousClass0AJ.A00;
        }
        C36331k8.A1T(emojiExpressionsViewModel$onEmojiLongTapped$2, A00);
        return AnonymousClass0AJ.A00;
    }
}
