package X;

import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.2uw  reason: invalid class name and case insensitive filesystem */
public class C55632uw implements AnonymousClass4QX {
    public Object A00;
    public final int A01;

    public C55632uw(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BWP(AnonymousClass1XQ r5, int i) {
        AnonymousClass4QW r0;
        switch (this.A01) {
            case 0:
                r0 = ((C70803fk) this.A00).A2l;
                break;
            case 1:
                EmojiSearchContainer emojiSearchContainer = (EmojiSearchContainer) this.A00;
                emojiSearchContainer.A06.A09(r5.A00);
                emojiSearchContainer.A0A.BWP(r5, i);
                return;
            case 2:
                r0 = ((AnonymousClass3J6) this.A00).A00;
                break;
            case 3:
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer = (EmojiSearchKeyboardContainer) this.A00;
                AnonymousClass00C.A0D(r5, 1);
                AnonymousClass1XN r1 = emojiSearchKeyboardContainer.A07;
                if (r1 != null) {
                    r1.A09(r5.A00);
                }
                AnonymousClass4QX r02 = emojiSearchKeyboardContainer.A0B;
                if (r02 != null) {
                    r02.BWP(r5, i);
                }
                emojiSearchKeyboardContainer.getExpressionUserJourneyLogger().A02(C36431kI.A13(), 1, 11);
                return;
            case 4:
                AnonymousClass3UT r03 = (AnonymousClass3UT) this.A00;
                if (r5 != null) {
                    int[] iArr = r5.A00;
                    C88314Sf r04 = r03.A07;
                    if (r04 != null) {
                        r04.BWN(iArr);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((C74263lK) ((C54632tG) this.A00).A00).A01.BWN(r5.A00);
                return;
        }
        if (r0 != null) {
            r0.BWO(r5);
        }
    }
}
