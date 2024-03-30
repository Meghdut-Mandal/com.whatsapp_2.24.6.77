package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import java.util.Map;

/* renamed from: X.7Sn  reason: invalid class name and case insensitive filesystem */
public final class C154527Sn extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154527Sn(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6BN r11 = (AnonymousClass6BN) obj;
        if (AnonymousClass00C.A0J(C90484aE.A0X(this.this$0).A0A.A04(), C1035856a.A00)) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            AnonymousClass00C.A0B(r11);
            int i = r11.A01;
            int i2 = r11.A00;
            int i3 = r11.A02;
            SearchFunStickersBottomSheet.A05(searchFunStickersBottomSheet.A0D, searchFunStickersBottomSheet, i3);
            Map map = searchFunStickersBottomSheet.A0W;
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) C36371kC.A0r(map, i);
            WaNetworkResourceImageView waNetworkResourceImageView2 = (WaNetworkResourceImageView) C36371kC.A0r(map, i2);
            ValueAnimator A03 = SearchFunStickersBottomSheet.A03(waNetworkResourceImageView, 1.0f, 0.0f);
            ValueAnimator A032 = SearchFunStickersBottomSheet.A03(searchFunStickersBottomSheet.A0G, 1.0f, 0.0f);
            ValueAnimator A033 = SearchFunStickersBottomSheet.A03(waNetworkResourceImageView2, 0.0f, 1.0f);
            ValueAnimator A034 = SearchFunStickersBottomSheet.A03(searchFunStickersBottomSheet.A0D, 0.0f, 1.0f);
            AnimatorSet A0C = C36441kJ.A0C();
            Animator[] animatorArr = new Animator[4];
            C36321k7.A1F(A03, A032, A033, A034, animatorArr);
            A0C.playTogether(animatorArr);
            A0C.addListener(new C90584aO(waNetworkResourceImageView, waNetworkResourceImageView2, searchFunStickersBottomSheet, i3));
            A0C.start();
        }
        return AnonymousClass0AJ.A00;
    }
}
