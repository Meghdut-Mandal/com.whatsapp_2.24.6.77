package com.whatsapp.expressionstray.avatars;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass040;
import X.AnonymousClass0A2;
import X.AnonymousClass0CP;
import X.AnonymousClass11F;
import X.AnonymousClass1C2;
import X.AnonymousClass1HA;
import X.AnonymousClass3DC;
import X.AnonymousClass55K;
import X.AnonymousClass55M;
import X.AnonymousClass565;
import X.AnonymousClass5IC;
import X.AnonymousClass5IE;
import X.AnonymousClass63V;
import X.AnonymousClass6O1;
import X.AnonymousClass7LC;
import X.AnonymousClass7LD;
import X.AnonymousClass7LE;
import X.AnonymousClass7LF;
import X.AnonymousClass7LG;
import X.AnonymousClass7LH;
import X.AnonymousClass7LI;
import X.AnonymousClass7LJ;
import X.AnonymousClass7Y5;
import X.AnonymousClass7gZ;
import X.C000800j;
import X.C001400p;
import X.C005502l;
import X.C006302t;
import X.C008903u;
import X.C009003v;
import X.C012005e;
import X.C019308f;
import X.C023109s;
import X.C023509x;
import X.C02800By;
import X.C02810Bz;
import X.C1035555x;
import X.C109325Xd;
import X.C123795x6;
import X.C125385zp;
import X.C125415zs;
import X.C12560iI;
import X.C1266865b;
import X.C134626bL;
import X.C135066c4;
import X.C154407Sb;
import X.C158227ga;
import X.C158237gb;
import X.C162477oe;
import X.C162757p6;
import X.C18740tg;
import X.C19630wG;
import X.C20810yC;
import X.C24041Av;
import X.C33311f5;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36371kC;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C48742hy;
import X.C85024Fm;
import X.C85034Fn;
import X.C85044Fo;
import X.C85054Fp;
import X.C88234Rx;
import X.C90494aF;
import X.C90504aG;
import X.C95834mM;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel;
import com.whatsapp.expressionstray.ExpressionsSearchViewModel$onStickerSelected$1;
import com.whatsapp.util.Log;

public final class AvatarExpressionsFragment extends Hilt_AvatarExpressionsFragment implements C158227ga, C88234Rx, AnonymousClass7gZ, C158237gb {
    public View A00;
    public View A01;
    public ViewStub A02;
    public CoordinatorLayout A03;
    public GridLayoutManager A04;
    public RecyclerView A05;
    public RecyclerView A06;
    public C24041Av A07;
    public WaImageView A08;
    public C19630wG A09;
    public AnonymousClass6O1 A0A;
    public ExpressionsSearchViewModel A0B;
    public AvatarStickersCategoriesView A0C;
    public C95834mM A0D;
    public C125385zp A0E;
    public AnonymousClass3DC A0F;
    public C123795x6 A0G;
    public AnonymousClass1HA A0H;
    public AnonymousClass1C2 A0I;
    public boolean A0J;
    public boolean A0K;
    public View A0L;
    public View A0M;
    public final AnonymousClass00T A0N = C36431kI.A1I(new AnonymousClass7LC(this));
    public final AnonymousClass00T A0O = C36431kI.A1I(new AnonymousClass7LG(this));
    public final AnonymousClass00T A0P;
    public final C009003v A0Q = new AnonymousClass7Y5(this);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        int i;
        AnonymousClass0CP r6;
        AnonymousClass0CP r3;
        C02810Bz r4;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        this.A01 = C012005e.A02(view2, R.id.avatar_vscroll_view);
        this.A06 = C90504aG.A0J(view2, R.id.items);
        this.A0C = (AvatarStickersCategoriesView) C012005e.A02(view2, R.id.categories);
        this.A05 = C90504aG.A0J(view2, R.id.avatar_search_results);
        this.A00 = C012005e.A02(view2, R.id.avatar_tab_search_no_results);
        this.A08 = C36431kI.A0X(view2, R.id.no_results_image);
        this.A03 = (CoordinatorLayout) C012005e.A02(view2, R.id.snack_bar_view);
        ViewStub viewStub = (ViewStub) C012005e.A02(view2, R.id.no_avatar_available_stub);
        View inflate = viewStub.inflate();
        this.A0L = C012005e.A02(inflate, R.id.no_avatar_available_create_button);
        this.A0M = C012005e.A02(inflate, R.id.avatar_not_available_image_set);
        this.A02 = viewStub;
        AnonymousClass00T r32 = this.A0N;
        if (C36331k8.A1b(r32)) {
            AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass7LD(new AnonymousClass7LF(this)));
            C019308f A1A = C36441kJ.A1A(ExpressionsSearchViewModel.class);
            this.A0B = (ExpressionsSearchViewModel) new C12560iI(new AnonymousClass7LE(A002), new C85034Fn(this, A002), new C85024Fm(A002), A1A).getValue();
        }
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            i = bundle2.getInt("arg_search_opener");
        } else {
            i = 0;
        }
        AnonymousClass00T r2 = this.A0P;
        ((AvatarExpressionsViewModel) r2.getValue()).A00 = i;
        C20810yC r11 = this.A02;
        AnonymousClass00C.A07(r11);
        AnonymousClass00T r0 = this.A0O;
        boolean A1b = C36331k8.A1b(r0);
        AnonymousClass1HA r12 = this.A0H;
        if (r12 != null) {
            C24041Av r8 = this.A07;
            if (r8 != null) {
                int i2 = 6;
                if (C36331k8.A1b(r32)) {
                    i2 = 1;
                }
                C009003v r1 = this.A0Q;
                C123795x6 r10 = this.A0G;
                if (r10 != null) {
                    C009003v r22 = r1;
                    C95834mM r7 = new C95834mM(r8, (C134626bL) null, r10, r11, r12, this, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, new C154407Sb(this), (C006302t) null, (C006302t) null, r22, i2, false, A1b);
                    this.A0D = r7;
                    RecyclerView recyclerView = this.A06;
                    if (recyclerView != null) {
                        C02800By r42 = recyclerView.A0H;
                        if ((r42 instanceof C02810Bz) && (r4 = (C02810Bz) r42) != null) {
                            r4.A00 = false;
                        }
                        recyclerView.setAdapter(r7);
                    }
                    AvatarStickersCategoriesView avatarStickersCategoriesView = this.A0C;
                    if (avatarStickersCategoriesView != null) {
                        avatarStickersCategoriesView.A00 = this;
                    }
                    RecyclerView recyclerView2 = this.A06;
                    if (recyclerView2 != null) {
                        C20810yC r15 = this.A02;
                        recyclerView2.A0v(new C162757p6(C36341k9.A0G(this), recyclerView2.getLayoutManager(), this, this.A0D, r15, C36331k8.A1b(r0)));
                    }
                    RecyclerView recyclerView3 = this.A06;
                    if (recyclerView3 != null) {
                        r6 = recyclerView3.getLayoutManager();
                    } else {
                        r6 = null;
                    }
                    AnonymousClass00C.A0E(r6, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) r6;
                    gridLayoutManager.A02 = new C162477oe(gridLayoutManager, this, 1);
                    this.A04 = gridLayoutManager;
                    C95834mM r72 = this.A0D;
                    if (r72 == null) {
                        C20810yC r112 = this.A02;
                        boolean A1b2 = C36331k8.A1b(r0);
                        AnonymousClass1HA r122 = this.A0H;
                        if (r122 != null) {
                            C24041Av r82 = this.A07;
                            if (r82 != null) {
                                C123795x6 r102 = this.A0G;
                                if (r102 != null) {
                                    AnonymousClass00C.A0B(r112);
                                    r72 = new C95834mM(r82, (C134626bL) null, r102, r112, r122, this, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, (AnonymousClass00S) null, (C006302t) null, (C006302t) null, (C006302t) null, r22, 1, false, A1b2);
                                    this.A0D = r72;
                                } else {
                                    throw C36331k8.A0d("shapeImageViewLoader");
                                }
                            } else {
                                throw C36331k8.A0d("referenceCountedFileManager");
                            }
                        } else {
                            throw C36331k8.A0d("stickerImageFileLoader");
                        }
                    }
                    RecyclerView recyclerView4 = this.A05;
                    if (recyclerView4 != null) {
                        recyclerView4.setAdapter(r72);
                    }
                    RecyclerView recyclerView5 = this.A05;
                    if (recyclerView5 != null) {
                        r3 = recyclerView5.getLayoutManager();
                    } else {
                        r3 = null;
                    }
                    AnonymousClass00C.A0E(r3, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                    GridLayoutManager gridLayoutManager2 = (GridLayoutManager) r3;
                    gridLayoutManager2.A02 = new C162477oe(gridLayoutManager2, this, 2);
                    Configuration configuration = C36341k9.A0G(this).getConfiguration();
                    AnonymousClass00C.A08(configuration);
                    A03(configuration);
                    LifecycleCoroutineScopeImpl A003 = C33311f5.A00(this);
                    AvatarExpressionsFragment$observeState$1 avatarExpressionsFragment$observeState$1 = new AvatarExpressionsFragment$observeState$1(this, (C023509x) null);
                    C008903u r5 = C008903u.A00;
                    Integer num = C023109s.A00;
                    AnonymousClass0A2.A02(num, r5, avatarExpressionsFragment$observeState$1, A003);
                    AnonymousClass0A2.A02(num, r5, new AvatarExpressionsFragment$observeStarredStickerSideEffects$1(this, (C023509x) null), C33311f5.A00(this));
                    boolean z = false;
                    if (C90494aF.A1V(this)) {
                        ((AvatarExpressionsViewModel) r2.getValue()).A0S();
                        Br5(true);
                    } else {
                        Bundle bundle3 = this.A0A;
                        if (bundle3 != null && bundle3.getBoolean("isCollapsed")) {
                            BTx();
                        }
                    }
                    Bundle bundle4 = this.A0A;
                    if (bundle4 != null) {
                        z = bundle4.getBoolean("isSelected");
                    }
                    Br5(z);
                    return;
                }
                throw C36331k8.A0d("shapeImageViewLoader");
            }
            throw C36331k8.A0d("referenceCountedFileManager");
        }
        throw C36331k8.A0d("stickerImageFileLoader");
    }

    public void BTE(C125415zs r9) {
        int i;
        C125385zp A022;
        AnonymousClass6O1 r2;
        int i2;
        C1035555x r1;
        C95834mM r4 = this.A0D;
        if (r4 != null) {
            int A0J2 = r4.A0J();
            i = 0;
            while (true) {
                if (i >= A0J2) {
                    break;
                }
                Object A0L2 = r4.A0L(i);
                if ((A0L2 instanceof C1035555x) && (r1 = (C1035555x) A0L2) != null && (r1.A00 instanceof AnonymousClass565) && AnonymousClass00C.A0J(((AnonymousClass565) r1.A00).A00, r9)) {
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
        C95834mM r0 = this.A0D;
        if (r0 != null && (A022 = ((C1266865b) r0.A0L(i)).A02()) != null) {
            AnonymousClass00T r5 = this.A0P;
            AnonymousClass63V r12 = ((AvatarExpressionsViewModel) r5.getValue()).A04;
            AnonymousClass55M r02 = AnonymousClass55M.A00;
            r12.A00(r02, r02, 5);
            if (!this.A0J) {
                if (r9 instanceof AnonymousClass5IC) {
                    r2 = this.A0A;
                    if (r2 != null) {
                        i2 = 27;
                    } else {
                        throw C36331k8.A0d("expressionUserJourneyLogger");
                    }
                } else {
                    boolean A0J3 = AnonymousClass00C.A0J(r9, AnonymousClass5IE.A00);
                    r2 = this.A0A;
                    if (r2 != null) {
                        i2 = 4;
                        if (A0J3) {
                            i2 = 21;
                        }
                    } else {
                        throw C36331k8.A0d("expressionUserJourneyLogger");
                    }
                }
                AnonymousClass6O1.A01(r2, i2, 1, 3);
            }
            this.A0J = false;
            this.A0E = A022;
            ((AvatarExpressionsViewModel) r5.getValue()).A0T(A022);
        }
    }

    public void Bhl(AnonymousClass11F r9, C135066c4 r10, Integer num, int i) {
        AnonymousClass040 A002;
        C005502l r0;
        C009003v avatarExpressionsViewModel$onStickerSelected$1;
        C135066c4 r4 = r10;
        Integer num2 = num;
        int i2 = i;
        if (r10 == null) {
            C18740tg.A0D(false, "Sticker was null, should not happen.");
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("onStickerSelected(sticker=null, origin=");
            A0u.append(num);
            A0u.append(", position=");
            Log.e(C36321k7.A0G(A0u, i));
            return;
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = this.A0B;
        if (expressionsSearchViewModel != null) {
            A002 = C109325Xd.A00(expressionsSearchViewModel);
            r0 = expressionsSearchViewModel.A0I;
            avatarExpressionsViewModel$onStickerSelected$1 = new ExpressionsSearchViewModel$onStickerSelected$1(expressionsSearchViewModel, r4, num2, (C023509x) null, i2);
        } else {
            AvatarExpressionsViewModel avatarExpressionsViewModel = (AvatarExpressionsViewModel) this.A0P.getValue();
            A002 = C109325Xd.A00(avatarExpressionsViewModel);
            r0 = avatarExpressionsViewModel.A0F;
            avatarExpressionsViewModel$onStickerSelected$1 = new AvatarExpressionsViewModel$onStickerSelected$1(avatarExpressionsViewModel, r4, num2, (C023509x) null, i2);
        }
        C36381kD.A1R(r0, avatarExpressionsViewModel$onStickerSelected$1, A002);
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass0CP r2;
        AnonymousClass0CP r22;
        AnonymousClass00C.A0D(configuration, 0);
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.A06;
        if (recyclerView != null) {
            r2 = recyclerView.getLayoutManager();
        } else {
            r2 = null;
        }
        AnonymousClass00C.A0E(r2, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager = (GridLayoutManager) r2;
        gridLayoutManager.A02 = new C162477oe(gridLayoutManager, this, 1);
        this.A04 = gridLayoutManager;
        RecyclerView recyclerView2 = this.A05;
        if (recyclerView2 != null) {
            r22 = recyclerView2.getLayoutManager();
        } else {
            r22 = null;
        }
        AnonymousClass00C.A0E(r22, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        GridLayoutManager gridLayoutManager2 = (GridLayoutManager) r22;
        gridLayoutManager2.A02 = new C162477oe(gridLayoutManager2, this, 2);
        A03(configuration);
    }

    private final void A03(Configuration configuration) {
        int i;
        View view = this.A0L;
        if (view != null) {
            view.setOnClickListener(new C48742hy(this, 38));
        }
        int i2 = configuration.orientation;
        View view2 = this.A0M;
        if (i2 == 1) {
            if (view2 != null) {
                i = 0;
            } else {
                return;
            }
        } else if (view2 != null) {
            i = 8;
        } else {
            return;
        }
        view2.setVisibility(i);
    }

    public void BTx() {
        ((AvatarExpressionsViewModel) this.A0P.getValue()).A0S();
    }

    public void Br5(boolean z) {
        if (this.A0K == z && this.A02.A0E(4890)) {
            AvatarExpressionsViewModel avatarExpressionsViewModel = (AvatarExpressionsViewModel) this.A0P.getValue();
            if (avatarExpressionsViewModel.A0I.getValue() instanceof AnonymousClass55K) {
                avatarExpressionsViewModel.A07.A03((Boolean) null, 1);
            }
        }
        this.A0K = z;
        C95834mM r2 = this.A0D;
        if (r2 != null) {
            r2.A02 = z;
            r2.A00 = C36371kC.A00(z ? 1 : 0);
            GridLayoutManager gridLayoutManager = this.A04;
            if (gridLayoutManager != null) {
                int A1S = gridLayoutManager.A1S();
                r2.A0A(A1S, gridLayoutManager.A1U() - A1S);
            }
        }
    }

    public AvatarExpressionsFragment() {
        AnonymousClass00T A002 = C001400p.A00(C000800j.NONE, new AnonymousClass7LH(new AnonymousClass7LJ(this)));
        C019308f A1A = C36441kJ.A1A(AvatarExpressionsViewModel.class);
        this.A0P = new C12560iI(new AnonymousClass7LI(A002), new C85054Fp(this, A002), new C85044Fo(A002), A1A);
    }

    public void A18(boolean z) {
        if (C90494aF.A1V(this)) {
            Br5(!z);
        }
    }

    public void A1J() {
        super.A1J();
        this.A01 = null;
        this.A02 = null;
        this.A06 = null;
        this.A0D = null;
        this.A04 = null;
        this.A0C = null;
        this.A05 = null;
        this.A00 = null;
        this.A08 = null;
        this.A03 = null;
    }
}
