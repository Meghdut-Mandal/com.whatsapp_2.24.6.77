package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;

/* renamed from: X.4aO  reason: invalid class name and case insensitive filesystem */
public final class C90584aO extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ WaNetworkResourceImageView A01;
    public final /* synthetic */ WaNetworkResourceImageView A02;
    public final /* synthetic */ SearchFunStickersBottomSheet A03;

    public void onAnimationEnd(Animator animator, boolean z) {
        AnonymousClass00C.A0D(animator, 0);
        super.onAnimationEnd(animator, z);
        WaNetworkResourceImageView waNetworkResourceImageView = this.A02;
        if (waNetworkResourceImageView != null) {
            waNetworkResourceImageView.setAlpha(0.0f);
        }
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.A03;
        WaTextView waTextView = searchFunStickersBottomSheet.A0D;
        if (waTextView != null) {
            waTextView.setAlpha(0.0f);
        }
        SearchFunStickersBottomSheet.A05(searchFunStickersBottomSheet.A0G, searchFunStickersBottomSheet, this.A00);
        WaNetworkResourceImageView waNetworkResourceImageView2 = this.A01;
        if (waNetworkResourceImageView2 != null) {
            waNetworkResourceImageView2.setAlpha(1.0f);
        }
        WaTextView waTextView2 = searchFunStickersBottomSheet.A0G;
        if (waTextView2 != null) {
            waTextView2.setAlpha(1.0f);
        }
        SearchFunStickersViewModel A0X = C90484aE.A0X(searchFunStickersBottomSheet);
        C36331k8.A1T(new SearchFunStickersViewModel$stopRollingPrompt$1(A0X, (C023509x) null), C109325Xd.A00(A0X));
        A0X.A08 = C36391kE.A12(new SearchFunStickersViewModel$rollingPrompt$1(A0X, (C023509x) null), C109325Xd.A00(A0X));
    }

    public C90584aO(WaNetworkResourceImageView waNetworkResourceImageView, WaNetworkResourceImageView waNetworkResourceImageView2, SearchFunStickersBottomSheet searchFunStickersBottomSheet, int i) {
        this.A02 = waNetworkResourceImageView;
        this.A03 = searchFunStickersBottomSheet;
        this.A00 = i;
        this.A01 = waNetworkResourceImageView2;
    }
}
