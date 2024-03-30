package X;

import android.graphics.Paint;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.expressionstray.emoji.view.EmojiImageView;
import com.whatsapp.expressionstray.emoji.view.EmojiImageViewLoader;

/* renamed from: X.55g  reason: invalid class name and case insensitive filesystem */
public final class C1034155g extends C96514nS {
    public final EmojiImageView A00;
    public final EmojiImageViewLoader A01;
    public final C009003v A02;
    public final C009003v A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1034155g(Paint paint, View view, EmojiImageViewLoader emojiImageViewLoader, C009003v r6, C009003v r7) {
        super(view);
        C36321k7.A1B(view, paint, emojiImageViewLoader, r6, r7);
        this.A01 = emojiImageViewLoader;
        this.A03 = r6;
        this.A02 = r7;
        View findViewById = view.findViewById(R.id.emoji);
        EmojiImageView emojiImageView = (EmojiImageView) findViewById;
        emojiImageView.A01 = paint;
        AnonymousClass00C.A08(findViewById);
        this.A00 = emojiImageView;
    }
}
