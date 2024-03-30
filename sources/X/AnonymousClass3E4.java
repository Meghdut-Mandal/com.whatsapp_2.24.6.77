package X;

import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.InterceptingEditText;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import java.util.Objects;

/* renamed from: X.3E4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3E4 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass22t A01;
    public final /* synthetic */ EmojiSearchContainer A02;
    public final /* synthetic */ AnonymousClass3J6 A03;

    public /* synthetic */ AnonymousClass3E4(Activity activity, AnonymousClass22t r2, EmojiSearchContainer emojiSearchContainer, AnonymousClass3J6 r4) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = emojiSearchContainer;
        this.A00 = activity;
    }

    public final void A00(EmojiSearchProvider emojiSearchProvider) {
        AnonymousClass3J6 r3 = this.A03;
        AnonymousClass22t r2 = this.A01;
        EmojiSearchContainer emojiSearchContainer = this.A02;
        Activity activity = this.A00;
        r2.A0B(r2.A0L);
        r2.A0C = r3;
        C55632uw r0 = new C55632uw(r3, 2);
        emojiSearchContainer.A00 = activity;
        emojiSearchContainer.A09 = emojiSearchProvider;
        emojiSearchContainer.A0A = r0;
        if (!emojiSearchContainer.A0E) {
            emojiSearchContainer.A0E = true;
            activity.getLayoutInflater().inflate(R.layout.f9nameremoved, emojiSearchContainer, true);
            emojiSearchContainer.A02 = emojiSearchContainer.findViewById(R.id.no_results);
            emojiSearchContainer.A03 = C36441kJ.A0c(emojiSearchContainer, R.id.search_result);
            emojiSearchContainer.A03.A0t(new C89134Vj(emojiSearchContainer, C36391kE.A07(emojiSearchContainer), 2));
            LinearLayoutManager A0T = C36431kI.A0T();
            A0T.A1f(0);
            emojiSearchContainer.A03.setLayoutManager(A0T);
            emojiSearchContainer.A01 = emojiSearchContainer.findViewById(R.id.progress_container);
            InterceptingEditText interceptingEditText = (InterceptingEditText) emojiSearchContainer.findViewById(R.id.search_bar);
            emojiSearchContainer.A04 = interceptingEditText;
            interceptingEditText.setHint(R.string.f12nameremoved);
            View findViewById = emojiSearchContainer.findViewById(R.id.clear_search_btn);
            C48742hy.A01(findViewById, emojiSearchContainer, 32);
            emojiSearchContainer.setOnTouchListener(AnonymousClass3ZD.A00);
            InterceptingEditText interceptingEditText2 = emojiSearchContainer.A04;
            Objects.requireNonNull(r3);
            interceptingEditText2.A00 = new C89534Wx(r3, 0);
            emojiSearchContainer.A04.addTextChangedListener(new AnonymousClass4WL(findViewById, emojiSearchContainer));
            C48902iF.A00(emojiSearchContainer.findViewById(R.id.back), emojiSearchContainer, r3, 3);
            C36321k7.A0L(emojiSearchContainer.getContext(), C36391kE.A0N(emojiSearchContainer, R.id.back), emojiSearchContainer.A05, R.drawable.ic_emoji_search_back);
        }
        emojiSearchContainer.setVisibility(0);
        emojiSearchContainer.A02.setVisibility(0);
        emojiSearchContainer.A01.setVisibility(8);
        AnonymousClass4W9 r1 = new AnonymousClass4W9(emojiSearchContainer.A00, emojiSearchContainer.A05, emojiSearchContainer.A07, new C55632uw(emojiSearchContainer, 1), emojiSearchContainer.A0B, emojiSearchContainer, emojiSearchContainer.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0);
        emojiSearchContainer.A08 = r1;
        emojiSearchContainer.A03.setAdapter(r1);
        emojiSearchContainer.A0D = "";
        EmojiSearchContainer.A00(emojiSearchContainer, "");
        emojiSearchContainer.A04.setText("");
        emojiSearchContainer.A04.requestFocus();
        emojiSearchContainer.A04.A0C(false);
        C36421kH.A0r(emojiSearchContainer.A04);
    }
}
