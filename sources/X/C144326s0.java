package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchKeyboardContainer;
import com.whatsapp.gifsearch.GifSearchContainer;
import com.whatsapp.mentions.MentionableEntry;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.6s0  reason: invalid class name and case insensitive filesystem */
public class C144326s0 implements C88704Ts {
    public View.OnFocusChangeListener A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageButton A04;
    public ImageButton A05;
    public LinearLayout A06;
    public LinearLayout A07;
    public EmojiSearchContainer A08;
    public EmojiSearchKeyboardContainer A09;
    public GifSearchContainer A0A;
    public MentionableEntry A0B;
    public C144316rz A0C;
    public C135066c4 A0D;
    public StickerView A0E;
    public Integer A0F;
    public boolean A0G;
    public final Context A0H;
    public final C21060yb A0I;
    public final AnonymousClass1N0 A0J;
    public final AnonymousClass1H2 A0K;
    public final C20810yC A0L;
    public final C19890wg A0M;
    public final TextWatcher A0N = new C162917pM(this, 3);
    public final C18820ts A0O;
    public final AnonymousClass1HA A0P;

    public void A00(C135066c4 r12, Integer num) {
        this.A07.setVisibility(0);
        AnonymousClass1HA r3 = this.A0P;
        StickerView stickerView = this.A0E;
        Context context = this.A0H;
        r3.A09(stickerView, r12, new C148546z2(this, r12, num), context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), true, false);
    }

    public /* bridge */ /* synthetic */ void B1n(Object obj) {
        this.A0B.setText((String) obj);
    }

    public int BDU() {
        C20810yC r1 = this.A0L;
        if (!r1.A0E(3792) || !r1.A0E(5372)) {
            return R.layout.f9nameremoved;
        }
        return R.layout.f9nameremoved;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0048, code lost:
        if (r2.A0E(5372) == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BkP(android.view.View r15) {
        /*
            r14 = this;
            X.0yC r2 = r14.A0L
            boolean r0 = X.C55752v8.A00(r2)
            r14.A0G = r0
            r0 = 2131430929(0x7f0b0e11, float:1.8483573E38)
            android.widget.LinearLayout r0 = X.C90514aH.A0U(r15, r0)
            r14.A06 = r0
            r0 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r15, r0)
            r14.A05 = r0
            r0 = 2131433875(0x7f0b1993, float:1.8489548E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            com.whatsapp.mentions.MentionableEntry r0 = (com.whatsapp.mentions.MentionableEntry) r0
            r14.A0B = r0
            r0 = 2131434609(0x7f0b1c71, float:1.8491037E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            r14.A03 = r0
            r0 = 2131430521(0x7f0b0c79, float:1.8482745E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            com.whatsapp.gifsearch.GifSearchContainer r0 = (com.whatsapp.gifsearch.GifSearchContainer) r0
            r14.A0A = r0
            r0 = 3792(0xed0, float:5.314E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5372(0x14fc, float:7.528E-42)
            boolean r0 = r2.A0E(r0)
            r1 = 1
            if (r0 != 0) goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            r0 = 2131429849(0x7f0b09d9, float:1.8481382E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            if (r1 == 0) goto L_0x0107
            com.whatsapp.emoji.search.EmojiSearchKeyboardContainer r0 = (com.whatsapp.emoji.search.EmojiSearchKeyboardContainer) r0
            r14.A09 = r0
        L_0x0058:
            r0 = 2131430365(0x7f0b0bdd, float:1.8482429E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            r14.A01 = r0
            r0 = 811(0x32b, float:1.136E-42)
            boolean r0 = r2.A0E(r0)
            if (r0 == 0) goto L_0x0088
            r0 = 2131434350(0x7f0b1b6e, float:1.8490511E38)
            android.widget.LinearLayout r1 = X.C90514aH.A0U(r15, r0)
            r14.A07 = r1
            r0 = 2131434348(0x7f0b1b6c, float:1.8490507E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            r14.A0E = r0
            android.widget.LinearLayout r1 = r14.A07
            r0 = 2131434353(0x7f0b1b71, float:1.8490518E38)
            android.widget.ImageButton r0 = X.C90514aH.A0T(r1, r0)
            r14.A04 = r0
        L_0x0088:
            r0 = 2131432437(0x7f0b13f5, float:1.8486631E38)
            android.view.View r1 = r15.findViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            if (r1 == 0) goto L_0x00fa
            X.6rz r0 = r14.A0C
            X.C53692rj.A00(r1, r0)
        L_0x0098:
            r0 = 2131432436(0x7f0b13f4, float:1.848663E38)
            android.view.View r0 = X.C012005e.A02(r15, r0)
            r14.A02 = r0
            com.whatsapp.mentions.MentionableEntry r1 = r14.A0B
            android.text.TextWatcher r0 = r14.A0N
            r1.addTextChangedListener(r0)
            com.whatsapp.mentions.MentionableEntry r2 = r14.A0B
            android.content.Context r1 = r15.getContext()
            r0 = 2131896963(0x7f122a83, float:1.9428802E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setHint(r0)
            com.whatsapp.mentions.MentionableEntry r4 = r14.A0B
            r0 = 1
            android.text.InputFilter[] r3 = new android.text.InputFilter[r0]
            r2 = 0
            r1 = 1024(0x400, float:1.435E-42)
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r3[r2] = r0
            r4.setFilters(r3)
            com.whatsapp.mentions.MentionableEntry r2 = r14.A0B
            r1 = 6
            X.7q3 r0 = new X.7q3
            r0.<init>(r14, r1)
            r2.setOnFocusChangeListener(r0)
            X.1H2 r7 = r14.A0K
            X.0yb r4 = r14.A0I
            X.0ts r5 = r14.A0O
            X.0wg r8 = r14.A0M
            X.1N0 r6 = r14.A0J
            com.whatsapp.mentions.MentionableEntry r2 = r14.A0B
            r0 = 2131429284(0x7f0b07a4, float:1.8480236E38)
            android.widget.TextView r3 = X.C36391kE.A0O(r15, r0)
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 30
            r11 = 1
            r12 = 0
            X.2gA r1 = new X.2gA
            r13 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.whatsapp.mentions.MentionableEntry r0 = r14.A0B
            r0.addTextChangedListener(r1)
            return
        L_0x00fa:
            r0 = 2131432436(0x7f0b13f4, float:1.848663E38)
            android.view.View r1 = X.C012005e.A02(r15, r0)
            X.6rz r0 = r14.A0C
            r0.BkP(r1)
            goto L_0x0098
        L_0x0107:
            com.whatsapp.emoji.search.EmojiSearchContainer r0 = (com.whatsapp.emoji.search.EmojiSearchContainer) r0
            r14.A08 = r0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144326s0.BkP(android.view.View):void");
    }

    public C144326s0(Context context, C21060yb r4, C18820ts r5, AnonymousClass1N0 r6, AnonymousClass1H2 r7, C20810yC r8, C144316rz r9, C19890wg r10, AnonymousClass1HA r11) {
        this.A0H = context;
        this.A0L = r8;
        this.A0K = r7;
        this.A0I = r4;
        this.A0O = r5;
        this.A0P = r11;
        this.A0M = r10;
        this.A0C = r9;
        this.A0J = r6;
    }
}
