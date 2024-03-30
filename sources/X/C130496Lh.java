package X;

import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.Map;

/* renamed from: X.6Lh  reason: invalid class name and case insensitive filesystem */
public final class C130496Lh {
    public final AnonymousClass1XN A00;
    public final AnonymousClass1H2 A01;
    public final EmojiSearchProvider A02;
    public final C1270066o A03;
    public final C20810yC A04;
    public final C19890wg A05;
    public final Map A06;
    public final C005502l A07;

    public C130496Lh(AnonymousClass1XN r11, AnonymousClass1H2 r12, EmojiSearchProvider emojiSearchProvider, C1270066o r14, C20810yC r15, C19890wg r16, C005502l r17) {
        int A042 = C36361kB.A04(r15, r12, 1);
        AnonymousClass00C.A0D(r11, 3);
        AnonymousClass00C.A0D(emojiSearchProvider, 4);
        C19890wg r4 = r16;
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r14, 6);
        C005502l r0 = r17;
        AnonymousClass00C.A0D(r0, 7);
        this.A04 = r15;
        this.A01 = r12;
        this.A00 = r11;
        this.A02 = emojiSearchProvider;
        this.A05 = r4;
        this.A03 = r14;
        this.A07 = r0;
        AnonymousClass011[] r42 = new AnonymousClass011[8];
        C90464aC.A1E(Integer.valueOf(R.id.emoji_people_btn), Integer.valueOf(R.drawable.selector_emoji_people), r42);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_activity_btn), Integer.valueOf(R.drawable.selector_emoji_activity), r42, 1);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_flags_btn), Integer.valueOf(R.drawable.selector_emoji_flags), r42, A042);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_food_btn), Integer.valueOf(R.drawable.selector_emoji_food), r42, 3);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_nature_btn), Integer.valueOf(R.drawable.selector_emoji_nature), r42, 4);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_objects_btn), Integer.valueOf(R.drawable.selector_emoji_objects), r42, 5);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_symbols_btn), Integer.valueOf(R.drawable.selector_emoji_symbols), r42, 6);
        C36341k9.A1J(Integer.valueOf(R.id.emoji_travel_btn), Integer.valueOf(R.drawable.selector_emoji_travel), r42, 7);
        this.A06 = C000400e.A07(r42);
    }
}
