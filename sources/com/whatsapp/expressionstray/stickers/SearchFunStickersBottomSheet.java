package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0CP;
import X.AnonymousClass17Y;
import X.AnonymousClass1AP;
import X.AnonymousClass1Ax;
import X.AnonymousClass1BB;
import X.AnonymousClass1HA;
import X.AnonymousClass1RJ;
import X.AnonymousClass21S;
import X.AnonymousClass3R6;
import X.AnonymousClass3TE;
import X.AnonymousClass3XM;
import X.AnonymousClass3Y1;
import X.AnonymousClass4G0;
import X.AnonymousClass56U;
import X.AnonymousClass56X;
import X.AnonymousClass56Y;
import X.AnonymousClass56Z;
import X.AnonymousClass5WU;
import X.AnonymousClass5X0;
import X.AnonymousClass5YM;
import X.AnonymousClass6BT;
import X.C000800j;
import X.C001400p;
import X.C007103b;
import X.C007403e;
import X.C011504z;
import X.C012005e;
import X.C019308f;
import X.C023509x;
import X.C1035956b;
import X.C109175Wo;
import X.C109325Xd;
import X.C115885jb;
import X.C12560iI;
import X.C1262763g;
import X.C135776dF;
import X.C152677Lk;
import X.C152687Ll;
import X.C152697Lm;
import X.C154477Si;
import X.C154487Sj;
import X.C154497Sk;
import X.C154507Sl;
import X.C154517Sm;
import X.C154527Sn;
import X.C162477oe;
import X.C162607or;
import X.C162917pM;
import X.C163057pa;
import X.C163297py;
import X.C165177t0;
import X.C165647tl;
import X.C16620po;
import X.C18800tq;
import X.C19770wU;
import X.C19970wo;
import X.C20810yC;
import X.C21060yb;
import X.C32591ds;
import X.C33521fV;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import X.C53562rW;
import X.C63563Kn;
import X.C85144Fy;
import X.C85154Fz;
import X.C90484aE;
import X.C90504aG;
import X.C90524aI;
import X.C95824mL;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$logRetryClicked$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onDismiss$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$startSearch$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopLoadingStickers$1$1;
import com.whatsapp.expressionstray.stickers.funstickers.viewmodels.SearchFunStickersViewModel$stopRollingPrompt$1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class SearchFunStickersBottomSheet extends Hilt_SearchFunStickersBottomSheet implements C16620po {
    public ViewGroup A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public FrameLayout A03;
    public ConstraintLayout A04;
    public CoordinatorLayout A05;
    public RecyclerView A06;
    public LottieAnimationView A07;
    public C115885jb A08;
    public WaEditText A09;
    public WaImageButton A0A;
    public WaImageView A0B;
    public WaImageView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public WaTextView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public C21060yb A0I;
    public C19970wo A0J;
    public C95824mL A0K;
    public C20810yC A0L;
    public C63563Kn A0M;
    public AnonymousClass3XM A0N;
    public AnonymousClass1BB A0O;
    public AnonymousClass1RJ A0P;
    public AnonymousClass1RJ A0Q;
    public Integer A0R;
    public String A0S;
    public final int A0T;
    public final C162607or A0U;
    public final C162917pM A0V;
    public final Map A0W = C36431kI.A1G();
    public final AnonymousClass00T A0X;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r1 = X.AnonymousClass098.A05(X.C36371kC.A0y(r5), "\"", "", false).length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0F(java.lang.String r5) {
        /*
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0022
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = X.C36371kC.A0y(r5)
            java.lang.String r1 = "\""
            java.lang.String r0 = ""
            java.lang.String r0 = X.AnonymousClass098.A05(r2, r1, r0, r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0020
            r0 = 3
            if (r1 < r0) goto L_0x0020
            return r4
        L_0x0020:
            r4 = 0
            return r4
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.stickers.SearchFunStickersBottomSheet.A0F(java.lang.String):boolean");
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        float f;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        this.A0N = (AnonymousClass3XM) C001400p.A00(C000800j.NONE, new C85144Fy(this)).getValue();
        this.A0R = (Integer) AnonymousClass3TE.A02(this, "stickerOrigin", 10).getValue();
        AnonymousClass00T r5 = this.A0X;
        SearchFunStickersViewModel searchFunStickersViewModel = (SearchFunStickersViewModel) r5.getValue();
        AnonymousClass3XM r1 = this.A0N;
        if (r1 != null) {
            str = r1.A01;
        } else {
            str = null;
        }
        searchFunStickersViewModel.A03 = str;
        FrameLayout A0T2 = C36441kJ.A0T(view2, R.id.overflow_menu);
        A0T2.setEnabled(false);
        A0T2.setVisibility(8);
        C33521fV.A02(A0T2);
        this.A02 = A0T2;
        this.A05 = (CoordinatorLayout) C012005e.A02(view2, R.id.fun_stickers_coordinator);
        this.A0C = C36431kI.A0X(view2, R.id.more_button);
        WaEditText waEditText = (WaEditText) C012005e.A02(view2, R.id.search_entry);
        waEditText.setImeOptions(2);
        waEditText.setRawInputType(1);
        waEditText.requestFocus();
        waEditText.A0C(false);
        this.A09 = waEditText;
        this.A07 = (LottieAnimationView) C012005e.A02(view2, R.id.fun_sticker_loading_indicator);
        WaTextView A0Q2 = C36401kF.A0Q(view2, R.id.sample_search_text_view);
        C33521fV.A02(A0Q2);
        this.A0G = A0Q2;
        this.A0B = C36431kI.A0X(view2, R.id.close_image_button);
        this.A01 = C36441kJ.A0T(view2, R.id.close_image_frame);
        this.A06 = C90504aG.A0J(view2, R.id.fun_stickers_recycler_view);
        this.A0E = C36401kF.A0Q(view2, R.id.error_text);
        ConstraintLayout constraintLayout = (ConstraintLayout) C012005e.A02(view2, R.id.error_container);
        AnonymousClass00C.A0B(constraintLayout);
        constraintLayout.setVisibility(8);
        this.A04 = constraintLayout;
        WaTextView A0Q3 = C36401kF.A0Q(view2, R.id.title);
        C33521fV.A07(A0Q3, true);
        this.A0H = A0Q3;
        this.A0Q = C36341k9.A0X(view2, R.id.sub_title);
        this.A00 = C36411kG.A0O(view2, R.id.search_input_layout);
        this.A0P = C36341k9.A0X(view2, R.id.report_description);
        WaTextView A0Q4 = C36401kF.A0Q(view2, R.id.retry_button);
        AnonymousClass00C.A0B(A0Q4);
        A0Q4.setVisibility(8);
        this.A0F = A0Q4;
        WaImageButton waImageButton = (WaImageButton) C012005e.A02(view2, R.id.clear_text_button);
        C33521fV.A02(waImageButton);
        AnonymousClass00C.A0B(waImageButton);
        waImageButton.setVisibility(8);
        AnonymousClass3Y1.A00(waImageButton, this, 40);
        this.A0A = waImageButton;
        this.A03 = C36441kJ.A0T(view2, R.id.sticker_prompt_container);
        this.A0D = C36401kF.A0Q(view2, R.id.cross_fade_head_text);
        int i = 0;
        for (Object next : ((SearchFunStickersViewModel) r5.getValue()).A0P) {
            int i2 = i + 1;
            if (i < 0) {
                throw C36351kA.A0v();
            }
            AnonymousClass6BT r3 = (AnonymousClass6BT) next;
            View inflate = LayoutInflater.from(A0a()).inflate(R.layout.f9nameremoved, this.A03, false);
            AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.WaNetworkResourceImageView");
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) inflate;
            waNetworkResourceImageView.setImageResource(r3.A00);
            C63563Kn r2 = this.A0M;
            if (r2 != null) {
                if (r2.A00() && r2.A04.A0E(3005)) {
                    String str2 = r3.A02;
                    waNetworkResourceImageView.measure(0, 0);
                    C1262763g r9 = waNetworkResourceImageView.A01;
                    if (r9 != null) {
                        r9.A00(waNetworkResourceImageView, str2, waNetworkResourceImageView.getMeasuredWidth(), waNetworkResourceImageView.getMeasuredHeight(), false);
                    }
                }
                if (i == 0) {
                    A05(this.A0G, this, r3.A01);
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                waNetworkResourceImageView.setAlpha(f);
                FrameLayout frameLayout = this.A03;
                if (frameLayout != null) {
                    frameLayout.addView(waNetworkResourceImageView);
                }
                this.A0W.put(Integer.valueOf(i), waNetworkResourceImageView);
                i = i2;
            } else {
                throw C36331k8.A0d("manager");
            }
        }
        WaEditText waEditText2 = this.A09;
        if (waEditText2 != null) {
            waEditText2.addTextChangedListener(this.A0V);
            waEditText2.setOnEditorActionListener(new C163057pa(this, 1));
            waEditText2.setOnTouchListener(C135776dF.A00);
        }
        FrameLayout frameLayout2 = this.A03;
        if (frameLayout2 != null) {
            AnonymousClass3Y1.A00(frameLayout2, this, 38);
        }
        WaTextView waTextView = this.A0F;
        if (waTextView != null) {
            AnonymousClass3Y1.A00(waTextView, this, 44);
        }
        WaTextView waTextView2 = this.A0G;
        if (waTextView2 != null) {
            AnonymousClass3Y1.A00(waTextView2, this, 41);
        }
        FrameLayout frameLayout3 = this.A01;
        if (frameLayout3 != null) {
            AnonymousClass3Y1.A00(frameLayout3, this, 37);
        }
        FrameLayout frameLayout4 = this.A02;
        if (frameLayout4 != null) {
            AnonymousClass3Y1.A00(frameLayout4, this, 43);
        }
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A0A, new C154477Si(this), 22);
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A09, new C154487Sj(this), 21);
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A0O, new C154497Sk(this), 19);
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A0D, new C154507Sl(this), 18);
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A0C, new C154517Sm(this), 20);
        C165177t0.A00(A0m(), ((SearchFunStickersViewModel) r5.getValue()).A0B, new C154527Sn(this), 17);
        ((SearchFunStickersViewModel) r5.getValue()).A0T(true);
        ((SearchFunStickersViewModel) r5.getValue()).A02 = this.A0R;
        C115885jb r6 = this.A08;
        if (r6 != null) {
            AnonymousClass3XM r10 = this.A0N;
            AnonymousClass5X0 A022 = AnonymousClass5X0.A02(this, 29);
            AnonymousClass5WU r22 = new AnonymousClass5WU(this, 2);
            C109175Wo r12 = new C109175Wo(this, 1);
            AnonymousClass5X0 A023 = AnonymousClass5X0.A02(this, 30);
            AnonymousClass5X0 A024 = AnonymousClass5X0.A02(this, 31);
            C32591ds r52 = r6.A00;
            C18800tq r62 = r52.A02;
            C20810yC A0V2 = C36341k9.A0V(r62);
            AnonymousClass17Y A0M2 = C36351kA.A0M(r62);
            C19770wU A0Z = C36341k9.A0Z(r62);
            C95824mL r63 = new C95824mL(A0M2, A0V2, (C63563Kn) r52.A00.A2l.get(), r10, (AnonymousClass1HA) r62.A84.get(), (AnonymousClass1AP) r62.A89.get(), A0Z, A022, A023, A024, r12, r22);
            r63.A02 = true;
            this.A0K = r63;
            RecyclerView recyclerView = this.A06;
            if (recyclerView != null) {
                recyclerView.setAdapter(r63);
                A0a();
                int i3 = 2;
                if (C36341k9.A04(A0a()) == 2) {
                    i3 = 4;
                }
                recyclerView.setLayoutManager(new GridLayoutManager(i3, 1));
                AnonymousClass0CP layoutManager = recyclerView.getLayoutManager();
                AnonymousClass00C.A0E(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                ((GridLayoutManager) layoutManager).A02 = new C162477oe(recyclerView, this, 3);
                return;
            }
            return;
        }
        throw C36331k8.A0d("searchFunStickersAdapterFactory");
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass0CP layoutManager;
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null && recyclerView.A0G != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            int i = 2;
            if (C36341k9.A04(A0a()) == 2) {
                i = 4;
            }
            gridLayoutManager.A1o(i);
            RecyclerView recyclerView2 = this.A06;
            if (recyclerView2 != null) {
                recyclerView2.requestLayout();
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        AnonymousClass00C.A0D(dialogInterface, 0);
        WaEditText waEditText = this.A09;
        if (waEditText != null) {
            waEditText.A0B();
            waEditText.clearFocus();
        }
        SearchFunStickersViewModel A0X2 = C90484aE.A0X(this);
        C36331k8.A1T(new SearchFunStickersViewModel$onDismiss$1(A0X2, (C023509x) null), C109325Xd.A00(A0X2));
        super.onDismiss(dialogInterface);
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        Integer num = null;
        if (menuItem != null) {
            num = Integer.valueOf(menuItem.getItemId());
        }
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == R.id.fun_stickers_try_again) {
                SearchFunStickersViewModel A0X2 = C90484aE.A0X(this);
                C36331k8.A1T(new SearchFunStickersViewModel$logRetryClicked$1(A0X2, (C023509x) null), C109325Xd.A00(A0X2));
                A0D(this, false);
            } else if (intValue == R.id.fun_stickers_report) {
                C90484aE.A0X(this).A0D.A0D(C1035956b.A00);
                return true;
            } else if (intValue == R.id.fun_stickers_clear_all) {
                AnonymousClass21S r3 = new AnonymousClass21S(A0a(), R.style.f13nameremoved);
                r3.A0e(R.string.f12nameremoved);
                r3.A0d(R.string.f12nameremoved);
                r3.A0g(new C163297py(this, 26), R.string.f12nameremoved);
                r3.A0f((DialogInterface.OnClickListener) null, R.string.f12nameremoved);
                C36341k9.A11(r3);
                return true;
            }
        }
        return true;
    }

    public static final void A06(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        RecyclerView recyclerView;
        View A0L2;
        C21060yb r0 = searchFunStickersBottomSheet.A0I;
        if (r0 == null) {
            throw C36331k8.A0W();
        } else if (C90504aG.A1V(r0)) {
            Object A042 = C90484aE.A0X(searchFunStickersBottomSheet).A0A.A04();
            if (A042 instanceof AnonymousClass56Y) {
                A0L2 = searchFunStickersBottomSheet.A0E;
                if (A0L2 == null) {
                    return;
                }
            } else if (((A042 instanceof AnonymousClass56Z) || (A042 instanceof AnonymousClass56X)) && (recyclerView = searchFunStickersBottomSheet.A06) != null && recyclerView.getChildCount() > 0) {
                A0L2 = C36411kG.A0L(recyclerView);
            } else {
                return;
            }
            A0L2.requestFocus();
            C011504z.A0B(A0L2, 64, (Bundle) null);
        }
    }

    public static final void A07(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        C165647tl r0;
        LottieAnimationView lottieAnimationView = searchFunStickersBottomSheet.A07;
        if (lottieAnimationView != null && (r0 = lottieAnimationView.A09.A0b) != null && r0.A07) {
            lottieAnimationView.setRepeatCount(0);
        }
    }

    public static final void A08(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        WaImageView waImageView = searchFunStickersBottomSheet.A0C;
        if (waImageView != null) {
            waImageView.setEnabled(false);
        }
        WaImageView waImageView2 = searchFunStickersBottomSheet.A0C;
        if (waImageView2 != null) {
            waImageView2.setAlpha(0.5f);
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(false);
        }
    }

    public static final void A09(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        AnonymousClass1RJ r1 = searchFunStickersBottomSheet.A0Q;
        if (r1 != null) {
            r1.A03(8);
        }
    }

    public static final void A0A(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        WaImageView waImageView = searchFunStickersBottomSheet.A0C;
        if (waImageView != null) {
            waImageView.setEnabled(true);
        }
        WaImageView waImageView2 = searchFunStickersBottomSheet.A0C;
        if (waImageView2 != null) {
            waImageView2.setAlpha(1.0f);
        }
        FrameLayout frameLayout = searchFunStickersBottomSheet.A02;
        if (frameLayout != null) {
            frameLayout.setEnabled(true);
        }
        C36361kB.A14(searchFunStickersBottomSheet.A02);
    }

    public static final void A0B(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        AnonymousClass1RJ r0;
        TextView textView;
        AnonymousClass1RJ r1 = searchFunStickersBottomSheet.A0Q;
        if (r1 != null) {
            r1.A03(0);
        }
        AnonymousClass3XM r5 = searchFunStickersBottomSheet.A0N;
        if (r5 != null && (r0 = searchFunStickersBottomSheet.A0Q) != null && (textView = (TextView) r0.A01()) != null) {
            String A0r = C36381kD.A0r(searchFunStickersBottomSheet.A0a(), r5.A02, AnonymousClass001.A0L(), R.string.f12nameremoved);
            AnonymousClass00C.A08(A0r);
            textView.setText(A0r);
        }
    }

    public static final void A0D(SearchFunStickersBottomSheet searchFunStickersBottomSheet, boolean z) {
        Editable text;
        String obj;
        String A0y;
        WaEditText waEditText = searchFunStickersBottomSheet.A09;
        if (waEditText != null && (text = waEditText.getText()) != null && (obj = text.toString()) != null && (A0y = C36371kC.A0y(obj)) != null) {
            SearchFunStickersViewModel A0X2 = C90484aE.A0X(searchFunStickersBottomSheet);
            C36331k8.A1T(new SearchFunStickersViewModel$stopRollingPrompt$1(A0X2, (C023509x) null), C109325Xd.A00(A0X2));
            C007403e r2 = A0X2.A07;
            if (r2 != null) {
                C36331k8.A1T(new SearchFunStickersViewModel$stopLoadingStickers$1$1(A0X2, (C023509x) null, r2, true), C109325Xd.A00(A0X2));
            }
            A0X2.A07 = null;
            List list = A0X2.A05;
            ArrayList A0I2 = AnonymousClass001.A0I();
            for (Object next : list) {
                if (next instanceof AnonymousClass56U) {
                    A0I2.add(next);
                }
            }
            if (A0I2.size() >= 10) {
                Object A002 = AnonymousClass3R6.A00(A0I2);
                AnonymousClass00C.A0E(A002, "null cannot be cast to non-null type com.whatsapp.expressionstray.stickers.funstickers.adapters.viewstate.FunSticker.Header");
                SearchFunStickersViewModel.A09(A0X2, ((AnonymousClass56U) A002).A00, false);
            }
            A0X2.A07 = C36391kE.A12(new SearchFunStickersViewModel$startSearch$1(A0X2, A0y, (C023509x) null, z), C109325Xd.A00(A0X2));
        }
    }

    public static final boolean A0E(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        C20810yC r1 = searchFunStickersBottomSheet.A0L;
        if (r1 != null) {
            return AnonymousClass1Ax.A03(r1, 7190);
        }
        throw C36321k7.A07();
    }

    public SearchFunStickersBottomSheet() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152687Ll(new C152677Lk(this)));
        C019308f A1A = C36441kJ.A1A(SearchFunStickersViewModel.class);
        this.A0X = new C12560iI(new C152697Lm(A002), new AnonymousClass4G0(this, A002), new C85154Fz(A002), A1A);
        this.A0U = new C162607or(this, 1);
        this.A0V = new C162917pM(this, 2);
        this.A0T = R.layout.f9nameremoved;
    }

    public static final ValueAnimator A03(View view, float f, float f2) {
        float[] A0v = C90524aI.A0v();
        C90484aE.A1O(A0v, f, f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
        ofFloat.setDuration(600);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new C53562rW(view, 7));
        return ofFloat;
    }

    public static final void A05(WaTextView waTextView, SearchFunStickersBottomSheet searchFunStickersBottomSheet, int i) {
        String A0n = searchFunStickersBottomSheet.A0n(i);
        AnonymousClass00C.A08(A0n);
        String A0o = searchFunStickersBottomSheet.A0o(R.string.f12nameremoved, AnonymousClass000.A1b(A0n));
        AnonymousClass00C.A08(A0o);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("\"");
        spannableStringBuilder.append(A0n);
        spannableStringBuilder.append("\"");
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        if (waTextView != null) {
            waTextView.setText(spannedString);
            waTextView.setContentDescription(A0o);
        }
    }

    public static final void A0C(SearchFunStickersBottomSheet searchFunStickersBottomSheet, List list) {
        if (C36401kF.A1a(list)) {
            WaTextView waTextView = searchFunStickersBottomSheet.A0D;
            if (waTextView != null) {
                waTextView.setAlpha(0.0f);
            }
            int A042 = C36411kG.A04(searchFunStickersBottomSheet.A0G);
            FrameLayout frameLayout = searchFunStickersBottomSheet.A03;
            if (frameLayout != null) {
                frameLayout.setVisibility(A042);
            }
            A0A(searchFunStickersBottomSheet);
        }
        A07(searchFunStickersBottomSheet);
        C36361kB.A14(searchFunStickersBottomSheet.A06);
        C95824mL r1 = searchFunStickersBottomSheet.A0K;
        if (r1 != null) {
            r1.A0M(C007103b.A0W(list));
        }
    }

    public Dialog A1a(Bundle bundle) {
        Dialog A1a = super.A1a(bundle);
        A1a.setOnShowListener(new AnonymousClass5YM(this, 1));
        return A1a;
    }
}
