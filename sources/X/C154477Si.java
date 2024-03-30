package X;

import android.text.Editable;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;

/* renamed from: X.7Si  reason: invalid class name and case insensitive filesystem */
public final class C154477Si extends AnonymousClass00R implements C006302t {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154477Si(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        String str;
        C95824mL r1;
        C165647tl r0;
        Editable text;
        C110745bA r7 = (C110745bA) obj;
        if (r7 instanceof C1035856a) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet = this.this$0;
            searchFunStickersBottomSheet.A0S = null;
            int A04 = C36411kG.A04(searchFunStickersBottomSheet.A04);
            WaTextView waTextView = searchFunStickersBottomSheet.A0F;
            if (waTextView != null) {
                waTextView.setVisibility(A04);
            }
            SearchFunStickersBottomSheet searchFunStickersBottomSheet2 = this.this$0;
            SearchFunStickersBottomSheet.A07(searchFunStickersBottomSheet2);
            SearchFunStickersBottomSheet.A08(searchFunStickersBottomSheet2);
            WaTextView waTextView2 = searchFunStickersBottomSheet2.A0D;
            if (waTextView2 != null) {
                waTextView2.setAlpha(0.0f);
            }
            WaTextView waTextView3 = searchFunStickersBottomSheet2.A0G;
            int i2 = 8;
            if (waTextView3 != null) {
                waTextView3.setAlpha(1.0f);
                waTextView3.setVisibility(C36351kA.A00(C90484aE.A0X(searchFunStickersBottomSheet2).A0U() ^ true ? 1 : 0));
            }
            FrameLayout frameLayout = searchFunStickersBottomSheet2.A03;
            if (frameLayout != null) {
                frameLayout.setVisibility(C36351kA.A00(C90484aE.A0X(searchFunStickersBottomSheet2).A0U() ^ true ? 1 : 0));
            }
            RecyclerView recyclerView = searchFunStickersBottomSheet2.A06;
            if (recyclerView != null) {
                if (SearchFunStickersBottomSheet.A0E(searchFunStickersBottomSheet2) && C90484aE.A0X(searchFunStickersBottomSheet2).A0U()) {
                    i2 = 0;
                }
                recyclerView.setVisibility(i2);
            }
            SearchFunStickersBottomSheet.A09(this.this$0);
            SearchFunStickersViewModel A0X = C90484aE.A0X(this.this$0);
            C36331k8.A1T(new SearchFunStickersViewModel$stopRollingPrompt$1(A0X, (C023509x) null), C109325Xd.A00(A0X));
            SearchFunStickersViewModel A0X2 = C90484aE.A0X(this.this$0);
            C36331k8.A1T(new SearchFunStickersViewModel$stopRollingPrompt$1(A0X2, (C023509x) null), C109325Xd.A00(A0X2));
            A0X2.A08 = C36391kE.A12(new SearchFunStickersViewModel$rollingPrompt$1(A0X2, (C023509x) null), C109325Xd.A00(A0X2));
        } else if (r7 instanceof AnonymousClass56X) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet3 = this.this$0;
            WaEditText waEditText = searchFunStickersBottomSheet3.A09;
            if (waEditText == null || (text = waEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            searchFunStickersBottomSheet3.A0S = str;
            SearchFunStickersBottomSheet.A08(this.this$0);
            SearchFunStickersBottomSheet searchFunStickersBottomSheet4 = this.this$0;
            LottieAnimationView lottieAnimationView = searchFunStickersBottomSheet4.A07;
            if (lottieAnimationView == null || (r0 = lottieAnimationView.A09.A0b) == null || !r0.A07) {
                int A042 = C36411kG.A04(searchFunStickersBottomSheet4.A0G);
                FrameLayout frameLayout2 = searchFunStickersBottomSheet4.A03;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(A042);
                }
                LottieAnimationView lottieAnimationView2 = searchFunStickersBottomSheet4.A07;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRepeatCount(-1);
                    lottieAnimationView2.A04();
                }
                int A043 = C36411kG.A04(searchFunStickersBottomSheet4.A04);
                WaTextView waTextView4 = searchFunStickersBottomSheet4.A0F;
                if (waTextView4 != null) {
                    waTextView4.setVisibility(A043);
                }
                if (!SearchFunStickersBottomSheet.A0E(searchFunStickersBottomSheet4) && (r1 = searchFunStickersBottomSheet4.A0K) != null) {
                    r1.A0M(C007103b.A0Y(r1.A08));
                }
                C36361kB.A14(searchFunStickersBottomSheet4.A06);
            }
            SearchFunStickersBottomSheet searchFunStickersBottomSheet5 = this.this$0;
            int A044 = C36411kG.A04(searchFunStickersBottomSheet5.A04);
            WaTextView waTextView5 = searchFunStickersBottomSheet5.A0F;
            if (waTextView5 != null) {
                waTextView5.setVisibility(A044);
            }
            SearchFunStickersBottomSheet.A09(this.this$0);
            AnonymousClass01I A0i = this.this$0.A0i();
            SearchFunStickersBottomSheet searchFunStickersBottomSheet6 = this.this$0;
            C21060yb r12 = searchFunStickersBottomSheet6.A0I;
            if (r12 != null) {
                C33521fV.A00(A0i, r12, searchFunStickersBottomSheet6.A0n(R.string.f12nameremoved));
            } else {
                throw C36331k8.A0W();
            }
        } else if (r7 instanceof AnonymousClass56Y) {
            SearchFunStickersBottomSheet searchFunStickersBottomSheet7 = this.this$0;
            WaTextView waTextView6 = searchFunStickersBottomSheet7.A0D;
            if (waTextView6 != null) {
                waTextView6.setAlpha(0.0f);
            }
            int A045 = C36411kG.A04(searchFunStickersBottomSheet7.A0G);
            FrameLayout frameLayout3 = searchFunStickersBottomSheet7.A03;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(A045);
            }
            SearchFunStickersBottomSheet searchFunStickersBottomSheet8 = this.this$0;
            AnonymousClass00C.A0B(r7);
            AnonymousClass56Y r72 = (AnonymousClass56Y) r7;
            RecyclerView recyclerView2 = searchFunStickersBottomSheet8.A06;
            int i3 = 8;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(C36351kA.A00(SearchFunStickersBottomSheet.A0E(searchFunStickersBottomSheet8) ? 1 : 0));
            }
            WaTextView waTextView7 = searchFunStickersBottomSheet8.A0E;
            if (waTextView7 != null) {
                Exception exc = r72.A00;
                if (exc instanceof C108575Ub) {
                    i = R.string.f12nameremoved;
                } else if (exc instanceof C108585Uc) {
                    i = R.string.f12nameremoved;
                } else {
                    boolean z = exc instanceof AnonymousClass5Uv;
                    i = R.string.f12nameremoved;
                    if (z) {
                        i = R.string.f12nameremoved;
                    }
                }
                waTextView7.setText(i);
            }
            ConstraintLayout constraintLayout = searchFunStickersBottomSheet8.A04;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
            }
            WaTextView waTextView8 = searchFunStickersBottomSheet8.A0F;
            if (waTextView8 != null) {
                if (r72.A00 instanceof C108575Ub) {
                    i3 = 0;
                }
                waTextView8.setVisibility(i3);
            }
            SearchFunStickersBottomSheet.A07(searchFunStickersBottomSheet8);
            SearchFunStickersBottomSheet.A09(this.this$0);
            SearchFunStickersBottomSheet.A06(this.this$0);
        } else if (r7 instanceof AnonymousClass56Z) {
            if (!SearchFunStickersBottomSheet.A0E(this.this$0)) {
                SearchFunStickersBottomSheet.A0C(this.this$0, ((AnonymousClass56Z) r7).A01);
            }
            SearchFunStickersBottomSheet.A0B(this.this$0);
            AnonymousClass01I A0i2 = this.this$0.A0i();
            SearchFunStickersBottomSheet searchFunStickersBottomSheet9 = this.this$0;
            C21060yb r13 = searchFunStickersBottomSheet9.A0I;
            if (r13 != null) {
                C33521fV.A00(A0i2, r13, searchFunStickersBottomSheet9.A0n(R.string.f12nameremoved));
                AnonymousClass56Z r73 = (AnonymousClass56Z) r7;
                if (r73.A02) {
                    SearchFunStickersBottomSheet searchFunStickersBottomSheet10 = this.this$0;
                    String str2 = r73.A00;
                    searchFunStickersBottomSheet10.A0S = str2;
                    WaEditText waEditText2 = searchFunStickersBottomSheet10.A09;
                    if (waEditText2 != null) {
                        waEditText2.removeTextChangedListener(searchFunStickersBottomSheet10.A0V);
                    }
                    WaEditText waEditText3 = searchFunStickersBottomSheet10.A09;
                    if (waEditText3 != null) {
                        waEditText3.setText(str2);
                    }
                    WaEditText waEditText4 = searchFunStickersBottomSheet10.A09;
                    if (waEditText4 != null) {
                        waEditText4.selectAll();
                    }
                    WaEditText waEditText5 = searchFunStickersBottomSheet10.A09;
                    if (waEditText5 != null) {
                        waEditText5.addTextChangedListener(searchFunStickersBottomSheet10.A0V);
                    }
                }
            } else {
                throw C36331k8.A0W();
            }
        }
        return AnonymousClass0AJ.A00;
    }
}
