package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.3J6  reason: invalid class name */
public class AnonymousClass3J6 {
    public AnonymousClass4QW A00;
    public final AnonymousClass22t A01;
    public final EmojiSearchContainer A02;

    public static void A00(AnonymousClass3J6 r1, Object obj, int i) {
        r1.A00 = new AnonymousClass4Z2(obj, i);
    }

    public void A01(boolean z) {
        if (this instanceof AnonymousClass2MC) {
            AnonymousClass2MC r2 = (AnonymousClass2MC) this;
            GifSearchContainer gifSearchContainer = r2.A02;
            if (gifSearchContainer.getVisibility() == 0) {
                gifSearchContainer.setVisibility(8);
                AnonymousClass3L7 r1 = gifSearchContainer.A0F;
                if (r1 != null) {
                    C54402st.A00(gifSearchContainer.getWamRuntime(), r1);
                }
                gifSearchContainer.A0F = null;
            } else {
                EmojiSearchContainer emojiSearchContainer = r2.A02;
                if (emojiSearchContainer.getVisibility() == 0) {
                    emojiSearchContainer.setVisibility(8);
                    emojiSearchContainer.A04.A0B();
                    emojiSearchContainer.A09 = null;
                }
            }
            AnonymousClass22t r12 = r2.A01;
            AnonymousClass00C.A0E(r12, "null cannot be cast to non-null type com.whatsapp.gifsearch.EmojiAndGifPopupWindow");
            r12.A0C = null;
            if (z) {
                C54402st.A00(r2.A01, r2.A03);
                return;
            }
            return;
        }
        EmojiSearchContainer emojiSearchContainer2 = this.A02;
        if (emojiSearchContainer2.getVisibility() == 0) {
            emojiSearchContainer2.setVisibility(8);
            emojiSearchContainer2.A04.A0B();
            emojiSearchContainer2.A09 = null;
        }
        this.A01.A0C = null;
    }

    public boolean A02() {
        if (!(this instanceof AnonymousClass2MC)) {
            return AnonymousClass000.A1Q(this.A02.getVisibility());
        }
        AnonymousClass2MC r2 = (AnonymousClass2MC) this;
        if (r2.A02.getVisibility() == 0) {
            return true;
        }
        EmojiSearchContainer emojiSearchContainer = r2.A02;
        AnonymousClass00C.A07(emojiSearchContainer);
        if (emojiSearchContainer.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass3J6(Activity activity, AnonymousClass22t r3, EmojiSearchContainer emojiSearchContainer) {
        this.A02 = emojiSearchContainer;
        emojiSearchContainer.setVisibility(8);
        this.A01 = r3;
        r3.A0B = new AnonymousClass3E4(activity, r3, emojiSearchContainer, this);
    }

    public boolean A03() {
        if (!A02()) {
            return false;
        }
        A01(true);
        this.A02.post(new C81113wU((Object) this, 49));
        return true;
    }
}
