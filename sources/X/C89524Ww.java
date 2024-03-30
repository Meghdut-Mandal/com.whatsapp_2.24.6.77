package X;

import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;

/* renamed from: X.4Ww  reason: invalid class name and case insensitive filesystem */
public class C89524Ww implements AnonymousClass4QV {
    public Object A00;
    public final int A01;

    public C89524Ww(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BRn() {
        EmojiSearchKeyboardContainer emojiSearchKeyboardContainer;
        Runnable runnable;
        long j;
        switch (this.A01) {
            case 0:
                C70803fk r4 = (C70803fk) this.A00;
                if (r4.A3f.getVisibility() == 0) {
                    long j2 = 150;
                    if (C70803fk.A1e(r4) && r4.A3n.A0E(7616)) {
                        j2 = 50;
                    }
                    r4.A1V.A04 = true;
                    r4.A3f.A02();
                    emojiSearchKeyboardContainer = r4.A3f;
                    runnable = new C81103wT(r4, 17);
                    j = (long) ((int) (((float) j2) * C70803fk.A00(r4)));
                    break;
                } else {
                    return;
                }
            case 1:
                AnonymousClass3UT r2 = (AnonymousClass3UT) this.A00;
                EmojiSearchKeyboardContainer emojiSearchKeyboardContainer2 = r2.A0A;
                if (emojiSearchKeyboardContainer2 != null && emojiSearchKeyboardContainer2.getVisibility() == 0) {
                    EmojiSearchKeyboardContainer emojiSearchKeyboardContainer3 = r2.A0A;
                    if (emojiSearchKeyboardContainer3 != null) {
                        emojiSearchKeyboardContainer3.A02();
                    }
                    emojiSearchKeyboardContainer = r2.A0A;
                    if (emojiSearchKeyboardContainer != null) {
                        runnable = C80243v5.A00(r2, 11);
                        j = (long) (((float) 150) * AnonymousClass3UT.A00(r2));
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                C54632tG r1 = (C54632tG) this.A00;
                C74263lK r42 = (C74263lK) r1.A00;
                if (r42.A03.getVisibility() == 0) {
                    r42.A03.A02();
                    r42.A03.postDelayed(new C80253v6(r1, 7), 150);
                    r42.A00.A0d(false);
                    return;
                }
                return;
        }
        emojiSearchKeyboardContainer.postDelayed(runnable, j);
    }
}
