package X;

import android.app.Activity;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.gifsearch.GifSearchContainer;

/* renamed from: X.2MC  reason: invalid class name */
public final class AnonymousClass2MC extends AnonymousClass3J6 {
    public C87784Qd A00;
    public final C21010yW A01;
    public final GifSearchContainer A02;
    public final AnonymousClass3L7 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2MC(Activity activity, EmojiSearchContainer emojiSearchContainer, C21010yW r5, AnonymousClass2M8 r6, GifSearchContainer gifSearchContainer, AnonymousClass3L7 r8) {
        super(activity, r6, emojiSearchContainer);
        C36321k7.A1B(r5, r8, gifSearchContainer, emojiSearchContainer, r6);
        AnonymousClass00C.A0D(activity, 6);
        this.A01 = r5;
        this.A03 = r8;
        this.A02 = gifSearchContainer;
        C601636s r1 = new C601636s(activity, r6, this);
        C74983mU r0 = r6.A0C;
        if (r0 != null) {
            r0.A02 = r1;
        }
    }
}
