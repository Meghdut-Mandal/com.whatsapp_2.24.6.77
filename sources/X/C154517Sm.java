package X;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.R;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7Sm  reason: invalid class name and case insensitive filesystem */
public final class C154517Sm extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154517Sm(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
        CoordinatorLayout coordinatorLayout = searchFunStickersBottomSheet.A05;
        if (coordinatorLayout != null) {
            C99304t3 A00 = C99304t3.A00(coordinatorLayout, R.string.f12nameremoved, 0);
            AnonymousClass0Eq r4 = A00.A0J;
            ViewGroup.MarginLayoutParams A0K = C36371kC.A0K(r4);
            int dimensionPixelSize = C36341k9.A0G(searchFunStickersBottomSheet).getDimensionPixelSize(R.dimen.f7nameremoved);
            A0K.setMargins(dimensionPixelSize, A0K.topMargin, dimensionPixelSize, C36341k9.A0G(searchFunStickersBottomSheet).getDimensionPixelSize(R.dimen.f7nameremoved));
            r4.setLayoutParams(A0K);
            A00.A0P();
        }
        return AnonymousClass0AJ.A00;
    }
}
