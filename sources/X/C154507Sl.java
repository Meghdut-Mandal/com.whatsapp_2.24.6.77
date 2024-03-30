package X;

import android.widget.FrameLayout;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7Sl  reason: invalid class name and case insensitive filesystem */
public final class C154507Sl extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154507Sl(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SearchFunStickersBottomSheet searchFunStickersBottomSheet;
        FrameLayout frameLayout;
        int i;
        if (AnonymousClass00C.A0J(obj, C1036156d.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            SearchFunStickersBottomSheet.A08(searchFunStickersBottomSheet);
            AnonymousClass1RJ r1 = searchFunStickersBottomSheet.A0P;
            if (r1 != null) {
                r1.A03(8);
            }
            C36361kB.A14(searchFunStickersBottomSheet.A00);
            SearchFunStickersBottomSheet.A09(searchFunStickersBottomSheet);
            WaTextView waTextView = searchFunStickersBottomSheet.A0H;
            if (waTextView != null) {
                waTextView.setText(R.string.f12nameremoved);
            }
            WaImageView waImageView = searchFunStickersBottomSheet.A0B;
            if (waImageView != null) {
                waImageView.setImageDrawable(C013105r.A01(searchFunStickersBottomSheet.A0a(), R.drawable.ic_close));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 42;
            }
            return AnonymousClass0AJ.A00;
        } else if (AnonymousClass00C.A0J(obj, C1035956b.A00)) {
            searchFunStickersBottomSheet = this.this$0;
            C95824mL r0 = searchFunStickersBottomSheet.A0K;
            if (r0 != null) {
                r0.A02 = false;
            }
            WaEditText waEditText = searchFunStickersBottomSheet.A09;
            if (waEditText != null) {
                waEditText.A0B();
            }
            SearchFunStickersBottomSheet.A08(searchFunStickersBottomSheet);
            C36331k8.A0y(searchFunStickersBottomSheet.A00);
            AnonymousClass1RJ r02 = searchFunStickersBottomSheet.A0P;
            if (r02 != null) {
                r02.A03(0);
            }
            SearchFunStickersBottomSheet.A09(searchFunStickersBottomSheet);
            WaTextView waTextView2 = searchFunStickersBottomSheet.A0H;
            if (waTextView2 != null) {
                waTextView2.setText(R.string.f12nameremoved);
            }
            WaImageView waImageView2 = searchFunStickersBottomSheet.A0B;
            if (waImageView2 != null) {
                waImageView2.setImageDrawable(C013105r.A01(searchFunStickersBottomSheet.A0a(), R.drawable.ic_back_gray));
            }
            frameLayout = searchFunStickersBottomSheet.A01;
            if (frameLayout != null) {
                i = 45;
            }
            return AnonymousClass0AJ.A00;
        } else {
            if (AnonymousClass00C.A0J(obj, C1036056c.A00)) {
                searchFunStickersBottomSheet = this.this$0;
                C95824mL r12 = searchFunStickersBottomSheet.A0K;
                if (r12 != null) {
                    r12.A02 = true;
                }
                SearchFunStickersBottomSheet.A0A(searchFunStickersBottomSheet);
                AnonymousClass1RJ r13 = searchFunStickersBottomSheet.A0P;
                if (r13 != null) {
                    r13.A03(8);
                }
                C36361kB.A14(searchFunStickersBottomSheet.A00);
                SearchFunStickersBottomSheet.A0B(searchFunStickersBottomSheet);
                WaTextView waTextView3 = searchFunStickersBottomSheet.A0H;
                if (waTextView3 != null) {
                    waTextView3.setText(R.string.f12nameremoved);
                }
                WaImageView waImageView3 = searchFunStickersBottomSheet.A0B;
                if (waImageView3 != null) {
                    waImageView3.setImageDrawable(C013105r.A01(searchFunStickersBottomSheet.A0a(), R.drawable.ic_close));
                }
                frameLayout = searchFunStickersBottomSheet.A01;
                if (frameLayout != null) {
                    i = 39;
                }
            }
            return AnonymousClass0AJ.A00;
        }
        AnonymousClass3Y1.A00(frameLayout, searchFunStickersBottomSheet, i);
        return AnonymousClass0AJ.A00;
    }
}
