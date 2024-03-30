package com.whatsapp.expressionstray.stickers;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass0A2;
import X.AnonymousClass0CP;
import X.AnonymousClass11F;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass1HA;
import X.AnonymousClass2R7;
import X.AnonymousClass3DC;
import X.AnonymousClass3S2;
import X.AnonymousClass3Y1;
import X.AnonymousClass4G3;
import X.AnonymousClass4G4;
import X.AnonymousClass4G5;
import X.AnonymousClass4G6;
import X.AnonymousClass55P;
import X.AnonymousClass567;
import X.AnonymousClass63V;
import X.AnonymousClass63W;
import X.AnonymousClass6O1;
import X.AnonymousClass7Y8;
import X.AnonymousClass7gZ;
import X.C000800j;
import X.C001400p;
import X.C008903u;
import X.C009003v;
import X.C012005e;
import X.C019308f;
import X.C023109s;
import X.C023509x;
import X.C02800By;
import X.C02810Bz;
import X.C07710Yz;
import X.C1035555x;
import X.C109325Xd;
import X.C120215r9;
import X.C121575tM;
import X.C123795x6;
import X.C125385zp;
import X.C12560iI;
import X.C130686Ma;
import X.C134626bL;
import X.C135066c4;
import X.C152707Ln;
import X.C152717Lo;
import X.C152727Lp;
import X.C152737Lq;
import X.C152747Lr;
import X.C152757Ls;
import X.C152767Lt;
import X.C152777Lu;
import X.C152787Lv;
import X.C152797Lw;
import X.C152807Lx;
import X.C152817Ly;
import X.C154537So;
import X.C154547Sp;
import X.C154557Sq;
import X.C158237gb;
import X.C162477oe;
import X.C162757p6;
import X.C18740tg;
import X.C20690y0;
import X.C20810yC;
import X.C20890yK;
import X.C24041Av;
import X.C33311f5;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C53082qk;
import X.C63563Kn;
import X.C64473Oc;
import X.C64813Pn;
import X.C88234Rx;
import X.C90494aF;
import X.C90504aG;
import X.C95794mI;
import X.C95834mM;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.AutoFitGridRecyclerView;
import com.whatsapp.R;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.util.Log;
import java.util.HashMap;

public final class StickerExpressionsFragment extends Hilt_StickerExpressionsFragment implements C88234Rx, AnonymousClass7gZ, C158237gb {
    public View A00;
    public View A01;
    public View A02;
    public CoordinatorLayout A03;
    public GridLayoutManager A04;
    public RecyclerView A05;
    public AutoFitGridRecyclerView A06;
    public C20690y0 A07;
    public AnonymousClass17Y A08;
    public C24041Av A09;
    public AnonymousClass6O1 A0A;
    public C121575tM A0B;
    public ExpressionsSearchViewModel A0C;
    public C95834mM A0D;
    public C125385zp A0E;
    public AnonymousClass3DC A0F;
    public C130686Ma A0G;
    public C123795x6 A0H;
    public C95794mI A0I;
    public AnonymousClass63W A0J;
    public C63563Kn A0K;
    public AnonymousClass190 A0L;
    public C120215r9 A0M;
    public C64473Oc A0N;
    public AnonymousClass1HA A0O;
    public C64813Pn A0P;
    public final AnonymousClass00T A0Q = C36431kI.A1I(new C152707Ln(this));
    public final AnonymousClass00T A0R = C36431kI.A1I(new C152787Lv(this));
    public final C009003v A0S = new AnonymousClass7Y8(this);
    public final AnonymousClass00T A0T;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        C02810Bz r2;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        this.A06 = (AutoFitGridRecyclerView) C012005e.A02(view2, R.id.items);
        this.A05 = C90504aG.A0J(view2, R.id.packs);
        this.A00 = C012005e.A02(view2, R.id.stickers_search_no_results);
        this.A01 = C012005e.A02(view2, R.id.stickers_tab_empty);
        this.A02 = C012005e.A02(view2, R.id.get_stickers_btn);
        this.A03 = (CoordinatorLayout) C012005e.A02(view2, R.id.snack_bar_view);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("arg_search_opener");
        } else {
            i = 0;
        }
        StickerExpressionsViewModel A032 = A03(this);
        AnonymousClass00T r3 = this.A0Q;
        A032.A07 = C36331k8.A1b(r3);
        A03(this).A00 = i;
        if (C36331k8.A1b(r3)) {
            AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152717Lo(new C152737Lq(this)));
            C019308f A1A = C36441kJ.A1A(ExpressionsSearchViewModel.class);
            this.A0C = (ExpressionsSearchViewModel) new C12560iI(new C152727Lp(A002), new AnonymousClass4G4(this, A002), new AnonymousClass4G3(A002), A1A).getValue();
        }
        A03(this).A0S();
        C20810yC r17 = this.A02;
        C63563Kn r0 = this.A0K;
        if (r0 != null) {
            boolean A003 = r0.A00();
            AnonymousClass00T r32 = this.A0R;
            boolean A1b = C36331k8.A1b(r32);
            AnonymousClass1HA r15 = this.A0O;
            if (r15 != null) {
                C24041Av r14 = this.A09;
                if (r14 != null) {
                    int i2 = 6;
                    if (C36331k8.A1b(r3)) {
                        i2 = 1;
                    }
                    C009003v r16 = this.A0S;
                    C123795x6 r13 = this.A0H;
                    if (r13 != null) {
                        C53082qk r11 = new C53082qk(this, 12);
                        C121575tM r02 = this.A0B;
                        if (r02 != null) {
                            AnonymousClass00C.A0B(r17);
                            C154537So r9 = new C154537So(this);
                            C152747Lr r8 = new C152747Lr(this);
                            C152757Ls r5 = new C152757Ls(this);
                            C152767Lt r4 = new C152767Lt(this);
                            C152777Lu r33 = new C152777Lu(this);
                            C154547Sp r22 = new C154547Sp(this);
                            C009003v r28 = r16;
                            AnonymousClass1HA r18 = r15;
                            C134626bL r152 = (C134626bL) r02.A02.getValue();
                            C123795x6 r162 = r13;
                            C95834mM r132 = new C95834mM(r14, r152, r162, r17, r18, this, r8, r5, r4, r11, r33, r9, r22, new C154557Sq(this), r28, i2, A003, A1b);
                            this.A0D = r132;
                            AutoFitGridRecyclerView autoFitGridRecyclerView = this.A06;
                            if (autoFitGridRecyclerView != null) {
                                C02800By r23 = autoFitGridRecyclerView.A0H;
                                if ((r23 instanceof C02810Bz) && (r2 = (C02810Bz) r23) != null) {
                                    r2.A00 = false;
                                }
                                autoFitGridRecyclerView.setAdapter(r132);
                            }
                            C95794mI r1 = new C95794mI(this);
                            this.A0I = r1;
                            RecyclerView recyclerView = this.A05;
                            if (recyclerView != null) {
                                recyclerView.setAdapter(r1);
                                recyclerView.setNestedScrollingEnabled(false);
                                recyclerView.setItemAnimator((C02800By) null);
                                recyclerView.getContext();
                                C36351kA.A1F(recyclerView, 0);
                            }
                            AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A06;
                            if (autoFitGridRecyclerView2 != null) {
                                C20810yC r03 = this.A02;
                                autoFitGridRecyclerView2.A0v(new C162757p6(C36341k9.A0G(this), autoFitGridRecyclerView2.getLayoutManager(), this.A0D, this, r03, C36331k8.A1b(r32)));
                            }
                            View view3 = this.A02;
                            if (view3 != null) {
                                AnonymousClass3Y1.A00(view3, this, 46);
                            }
                            A05();
                            LifecycleCoroutineScopeImpl A004 = C33311f5.A00(this);
                            StickerExpressionsFragment$observeState$1 stickerExpressionsFragment$observeState$1 = new StickerExpressionsFragment$observeState$1(this, (C023509x) null);
                            C008903u r34 = C008903u.A00;
                            Integer num = C023109s.A00;
                            AnonymousClass0A2.A02(num, r34, stickerExpressionsFragment$observeState$1, A004);
                            AnonymousClass0A2.A02(num, r34, new StickerExpressionsFragment$observeStarredStickerSideEffects$1(this, (C023509x) null), C33311f5.A00(this));
                            AnonymousClass0A2.A02(num, r34, new StickerExpressionsFragment$observeExpressionsUiSideEffects$1(this, (C023509x) null), C33311f5.A00(this));
                            AnonymousClass0A2.A02(num, r34, new StickerExpressionsFragment$observeShapeStickersLayoutData$1(this, (C023509x) null), C33311f5.A00(this));
                            if (C90494aF.A1V(this)) {
                                A03(this).A0T();
                                Br5(true);
                                return;
                            }
                            Bundle bundle3 = this.A0A;
                            if (bundle3 != null && bundle3.getBoolean("isCollapsed")) {
                                BTx();
                                return;
                            }
                            return;
                        }
                        throw C36331k8.A0d("shapeStickerLayoutDataProvider");
                    }
                    throw C36331k8.A0d("shapeImageViewLoader");
                }
                throw C36331k8.A0d("referenceCountedFileManager");
            }
            throw C36331k8.A0d("stickerImageFileLoader");
        }
        throw C36331k8.A0d("funStickerManager");
    }

    public void Bhl(AnonymousClass11F r10, C135066c4 r11, Integer num, int i) {
        String str;
        String str2;
        int i2;
        C135066c4 r5 = r11;
        if (r11 == null) {
            C18740tg.A0D(false, "Sticker was null, should not happen.");
            Log.e("null sticker selected, can't send.");
            return;
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.A0C;
        Integer num2 = num;
        int i3 = i;
        if (expressionsSearchViewModel != null) {
            C36381kD.A1R(expressionsSearchViewModel.A0I, new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r5, num2, (C023509x) null, i3), C109325Xd.A00(expressionsSearchViewModel));
            StickerExpressionsViewModel A032 = A03(this);
            HashMap hashMap = A032.A0W;
            AnonymousClass2R7 r2 = (AnonymousClass2R7) hashMap.get(A032.A01);
            if (r2 != null) {
                AnonymousClass3S2 r0 = r11.A04;
                if (r0 != null) {
                    str = r0.A06;
                } else {
                    str = null;
                }
                if (AnonymousClass00C.A0J(str, "Giphy")) {
                    i2 = 0;
                } else {
                    AnonymousClass3S2 r02 = r11.A04;
                    if (r02 != null) {
                        str2 = r02.A06;
                    } else {
                        str2 = null;
                    }
                    if (AnonymousClass00C.A0J(str2, "Tenor")) {
                        i2 = 1;
                    } else {
                        i2 = 3;
                        if (r11.A0M) {
                            i2 = 2;
                        }
                    }
                }
                r2.A00 = Integer.valueOf(i2);
                A032.A0N.Bly(r2);
                C07710Yz.A02(hashMap).remove(A032.A01);
                return;
            }
            return;
        }
        StickerExpressionsViewModel A033 = A03(this);
        C36381kD.A1R(A033.A0d, new StickerExpressionsViewModel$onStickerSelected$1(A033, r5, num2, (C023509x) null, i3), C109325Xd.A00(A033));
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        A05();
    }

    public static final StickerExpressionsViewModel A03(StickerExpressionsFragment stickerExpressionsFragment) {
        return (StickerExpressionsViewModel) stickerExpressionsFragment.A0T.getValue();
    }

    private final void A05() {
        AutoFitGridRecyclerView autoFitGridRecyclerView = this.A06;
        AnonymousClass0CP r3 = null;
        if (autoFitGridRecyclerView != null && autoFitGridRecyclerView.getLayoutManager() == null) {
            autoFitGridRecyclerView.setLayoutManager(new GridLayoutManagerNonPredictiveAnimations(A0a(), -1));
        }
        AutoFitGridRecyclerView autoFitGridRecyclerView2 = this.A06;
        if (autoFitGridRecyclerView2 != null) {
            r3 = autoFitGridRecyclerView2.getLayoutManager();
        }
        AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r3;
        gridLayoutManager.A02 = new C162477oe(gridLayoutManager, this, 4);
        this.A04 = gridLayoutManager;
    }

    public final AnonymousClass6O1 A1k() {
        AnonymousClass6O1 r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        throw C36331k8.A0d("expressionUserJourneyLogger");
    }

    public void A1l(C125385zp r7, boolean z) {
        int i;
        C1035555x r1;
        AnonymousClass6O1 A1k;
        int i2;
        if (!AnonymousClass00C.A0J(this.A0E, r7)) {
            AnonymousClass63V r12 = A03(this).A0I;
            AnonymousClass55P r0 = AnonymousClass55P.A00;
            r12.A00(r0, r0, 5);
            this.A0E = r7;
        }
        if (z) {
            String A002 = r7.A00();
            if (AnonymousClass00C.A0J(A002, "recent")) {
                A1k = A1k();
                i2 = 27;
            } else {
                boolean A0J2 = AnonymousClass00C.A0J(A002, "starred");
                A1k = A1k();
                i2 = 25;
                if (A0J2) {
                    i2 = 21;
                }
            }
            AnonymousClass6O1.A01(A1k, i2, 1, 10);
        }
        if (!(r7 instanceof AnonymousClass567) || !z) {
            C95834mM r5 = this.A0D;
            if (r5 != null) {
                int A0J3 = r5.A0J();
                i = 0;
                while (true) {
                    if (i >= A0J3) {
                        break;
                    }
                    Object A0L2 = r5.A0L(i);
                    if ((A0L2 instanceof C1035555x) && (r1 = (C1035555x) A0L2) != null && AnonymousClass00C.A0J(r1.A00, r7)) {
                        break;
                    }
                    i++;
                }
            }
            i = 0;
            GridLayoutManager gridLayoutManager = this.A04;
            if (gridLayoutManager != null) {
                gridLayoutManager.A1g(i, 0);
            }
            A03(this).A0U(r7, false);
            return;
        }
        String A003 = r7.A00();
        if (this.A0L != null) {
            A1C(AnonymousClass190.A1D(A0i(), A003, "info_dialog"));
            return;
        }
        throw C36331k8.A0X();
    }

    public void Br5(boolean z) {
        GridLayoutManager gridLayoutManager;
        C95834mM r2 = this.A0D;
        if (r2 != null) {
            r2.A02 = z;
            r2.A00 = C36371kC.A00(z ? 1 : 0);
            if (z && (gridLayoutManager = this.A04) != null) {
                int A1S = gridLayoutManager.A1S();
                r2.A0A(A1S, gridLayoutManager.A1U() - A1S);
            }
        }
    }

    public StickerExpressionsFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new C152797Lw(new C152817Ly(this)));
        C019308f A1A = C36441kJ.A1A(StickerExpressionsViewModel.class);
        this.A0T = new C12560iI(new C152807Lx(A002), new AnonymousClass4G6(this, A002), new AnonymousClass4G5(A002), A1A);
    }

    public void A18(boolean z) {
        if (C90494aF.A1V(this)) {
            Br5(!z);
        }
    }

    public void A1J() {
        super.A1J();
        this.A06 = null;
        this.A0D = null;
        this.A05 = null;
        this.A0I = null;
        this.A04 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
        AnonymousClass1HA r0 = this.A0O;
        if (r0 != null) {
            r0.A06();
            this.A02 = null;
            if (this.A0C != null) {
                A03(this).A07 = false;
                A03(this).A0S();
                StickerExpressionsViewModel A032 = A03(this);
                HashMap hashMap = A032.A0W;
                C20890yK r1 = (C20890yK) hashMap.get(A032.A01);
                if (r1 != null) {
                    A032.A0N.Bly(r1);
                    C07710Yz.A02(hashMap).remove(A032.A01);
                    return;
                }
                return;
            }
            return;
        }
        throw C36331k8.A0d("stickerImageFileLoader");
    }

    public void BTx() {
        A03(this).A0T();
    }
}
