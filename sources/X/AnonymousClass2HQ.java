package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.2HQ  reason: invalid class name */
public final class AnonymousClass2HQ extends C41001wS {
    public C51212nS A00 = C51212nS.LINK_PREVIEW;
    public List A01;
    public final Context A02;
    public final C89004Uw A03;
    public final C20810yC A04;
    public final AnonymousClass3S3 A05;

    public /* bridge */ /* synthetic */ AnonymousClass0D3 BUw(ViewGroup viewGroup, int i) {
        AnonymousClass00C.A0D(viewGroup, 0);
        if (i == 0) {
            C43532Ij r5 = new C43532Ij(this.A02, this.A03);
            int dimensionPixelSize = C36341k9.A0F(r5).getDimensionPixelSize(R.dimen.f7nameremoved);
            CardView A002 = C41001wS.A00(r5, viewGroup);
            A002.setCardElevation(0.0f);
            A002.setElevation(0.0f);
            A002.setBackground(C013105r.A01(A002.getContext(), R.drawable.conversation_reel_carousel_item_background));
            ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(r5);
            A0K.width = C36341k9.A0F(r5).getDimensionPixelSize(R.dimen.f7nameremoved);
            A0K.height = C36341k9.A0F(r5).getDimensionPixelSize(R.dimen.f7nameremoved);
            A0K.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            r5.setLayoutParams(A0K);
            return new AnonymousClass2HT(A002);
        }
        int i2 = R.drawable.conversation_link_carousel_item_background;
        if (!this.A04.A0E(7268)) {
            i2 = R.drawable.conversation_link_carousel_legacy_item_background;
        }
        CardView A003 = C41001wS.A00(new C43522Ii(this.A02, this.A03), viewGroup);
        A003.setCardElevation(0.0f);
        A003.setElevation(0.0f);
        A003.setBackground(C013105r.A01(A003.getContext(), i2));
        return new AnonymousClass2HS(A003);
    }

    public int A0J() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void BSE(AnonymousClass0D3 r4, int i) {
        C42591z4 r42 = (C42591z4) r4;
        AnonymousClass00C.A0D(r42, 0);
        r42.A0B(new AnonymousClass3I9((AnonymousClass2bV) this.A01.get(i), this.A01.size()));
    }

    public int getItemViewType(int i) {
        return this.A00.ordinal();
    }

    public AnonymousClass2HQ(Context context, C89004Uw r3, AnonymousClass3S3 r4, C20810yC r5, List list) {
        this.A04 = r5;
        this.A02 = context;
        this.A05 = r4;
        this.A01 = list;
        this.A03 = r3;
    }
}
