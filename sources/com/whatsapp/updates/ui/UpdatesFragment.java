package com.whatsapp.updates.ui;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00E;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass012;
import X.AnonymousClass01I;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass03T;
import X.AnonymousClass040;
import X.AnonymousClass04H;
import X.AnonymousClass098;
import X.AnonymousClass099;
import X.AnonymousClass0A2;
import X.AnonymousClass0CP;
import X.AnonymousClass0CZ;
import X.AnonymousClass0UE;
import X.AnonymousClass11F;
import X.AnonymousClass13J;
import X.AnonymousClass15J;
import X.AnonymousClass15K;
import X.AnonymousClass15M;
import X.AnonymousClass16E;
import X.AnonymousClass17Y;
import X.AnonymousClass18S;
import X.AnonymousClass190;
import X.AnonymousClass1CR;
import X.AnonymousClass1GQ;
import X.AnonymousClass1HT;
import X.AnonymousClass1JL;
import X.AnonymousClass1N6;
import X.AnonymousClass1NA;
import X.AnonymousClass1Q1;
import X.AnonymousClass1RK;
import X.AnonymousClass2bU;
import X.AnonymousClass301;
import X.AnonymousClass302;
import X.AnonymousClass303;
import X.AnonymousClass304;
import X.AnonymousClass305;
import X.AnonymousClass306;
import X.AnonymousClass307;
import X.AnonymousClass308;
import X.AnonymousClass309;
import X.AnonymousClass30C;
import X.AnonymousClass3CD;
import X.AnonymousClass3EL;
import X.AnonymousClass3K9;
import X.AnonymousClass3KF;
import X.AnonymousClass3L1;
import X.AnonymousClass3LQ;
import X.AnonymousClass3P0;
import X.AnonymousClass3T1;
import X.AnonymousClass3UC;
import X.AnonymousClass3UF;
import X.AnonymousClass3ZU;
import X.AnonymousClass4LR;
import X.AnonymousClass4LS;
import X.AnonymousClass4LT;
import X.AnonymousClass4MN;
import X.C000400e;
import X.C001700s;
import X.C006302t;
import X.C008903u;
import X.C012005e;
import X.C022509m;
import X.C022609n;
import X.C022709o;
import X.C022809p;
import X.C023109s;
import X.C023409w;
import X.C023509x;
import X.C02800By;
import X.C109325Xd;
import X.C18800tq;
import X.C18830tt;
import X.C18840tu;
import X.C19420v0;
import X.C19460v5;
import X.C19630wG;
import X.C19730wQ;
import X.C19760wT;
import X.C19770wU;
import X.C19970wo;
import X.C20800yB;
import X.C20810yC;
import X.C20830yE;
import X.C21000yV;
import X.C21060yb;
import X.C21690ze;
import X.C222013h;
import X.C224514j;
import X.C225314u;
import X.C226015b;
import X.C226515g;
import X.C226715i;
import X.C27731Pn;
import X.C28331Sf;
import X.C28711Ts;
import X.C28781Ua;
import X.C28981Uw;
import X.C30131Zi;
import X.C31921ce;
import X.C31941cg;
import X.C32171d6;
import X.C32221dB;
import X.C32241dD;
import X.C32251dE;
import X.C32261dF;
import X.C32291dI;
import X.C32321dL;
import X.C32341dO;
import X.C32371dR;
import X.C32381dS;
import X.C33311f5;
import X.C34341gs;
import X.C34891ho;
import X.C34901hp;
import X.C35011i0;
import X.C35751jC;
import X.C36201jv;
import X.C36291k4;
import X.C36481kN;
import X.C44072La;
import X.C45512Rq;
import X.C48052gc;
import X.C48162go;
import X.C51582o3;
import X.C51902oZ;
import X.C54732tQ;
import X.C55392uY;
import X.C55402uZ;
import X.C55892vM;
import X.C58472zv;
import X.C596934x;
import X.C60973Ab;
import X.C61103Ao;
import X.C63623Kt;
import X.C65663Sz;
import X.C68073bI;
import X.C68123bN;
import X.C80003ud;
import X.C86794Mh;
import X.C87364Om;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.collections.ObservableRecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.newsletter.NewsletterLinkLauncher;
import com.whatsapp.status.StatusExpirationLifecycleOwner;
import com.whatsapp.status.advertise.UpdatesAdvertiseViewModel;
import com.whatsapp.status.crossposting.CrossPostingUpdatesViewModel;
import com.whatsapp.status.viewmodels.StatusesViewModel;
import com.whatsapp.updates.ui.adapter.UpdatesAdapter;
import com.whatsapp.updates.viewmodels.SearchUsecase;
import com.whatsapp.updates.viewmodels.SearchUsecase$launchRemoteSearch$1;
import com.whatsapp.updates.viewmodels.UpdatesViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Timer;

public final class UpdatesFragment extends Hilt_UpdatesFragment implements C31921ce, AnonymousClass1RK, AnonymousClass15K, C31941cg, C022509m, C022609n, C022709o, C022809p {
    public C19460v5 A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public C19460v5 A03;
    public C19460v5 A04;
    public AnonymousClass18S A05;
    public C32261dF A06;
    public C58472zv A07;
    public AnonymousClass30C A08;
    public C32291dI A09;
    public AnonymousClass17Y A0A;
    public C19730wQ A0B;
    public WaTextView A0C;
    public WfalManager A0D;
    public ObservableRecyclerView A0E;
    public C21060yb A0F;
    public C19970wo A0G;
    public C19630wG A0H;
    public C20830yE A0I;
    public C19420v0 A0J;
    public C20810yC A0K;
    public AnonymousClass1NA A0L;
    public AnonymousClass1GQ A0M;
    public C30131Zi A0N;
    public C32241dD A0O;
    public AnonymousClass1CR A0P;
    public AnonymousClass3ZU A0Q;
    public C28331Sf A0R;
    public StatusExpirationLifecycleOwner A0S;
    public C34341gs A0T;
    public UpdatesAdvertiseViewModel A0U;
    public C32321dL A0V;
    public CrossPostingUpdatesViewModel A0W;
    public C32371dR A0X;
    public C32221dB A0Y;
    public C32251dE A0Z;
    public AnonymousClass1N6 A0a;
    public UpdatesAdapter A0b;
    public UpdatesViewModel A0c;
    public AnonymousClass13J A0d;
    public C19770wU A0e;
    public C32381dS A0f;
    public C28781Ua A0g;
    public AnonymousClass005 A0h;
    public AnonymousClass005 A0i;
    public AnonymousClass005 A0j;
    public AnonymousClass005 A0k;
    public AnonymousClass005 A0l;
    public AnonymousClass005 A0m;
    public AnonymousClass005 A0n;
    public AnonymousClass005 A0o;
    public AnonymousClass005 A0p;
    public AnonymousClass005 A0q;
    public AnonymousClass005 A0r;
    public AnonymousClass005 A0s;
    public AnonymousClass005 A0t;
    public AnonymousClass005 A0u;
    public AnonymousClass005 A0v;
    public AnonymousClass005 A0w;
    public Integer A0x;
    public List A0y;
    public boolean A0z;
    public boolean A10;
    public boolean A11;
    public int A12 = -1;
    public CharSequence A13;
    public boolean A14;
    public boolean A15;
    public boolean A16;
    public final List A17 = new ArrayList();
    public final AnonymousClass00T A18 = new AnonymousClass00U(new C32171d6(this));
    public final C226515g A19 = new C36291k4(this, 1);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        C32221dB A1d = A1d();
        A1d.A01.A09("StatusesFragment_onCreateView");
        A1d.A02.A09.markerPoint(453128091, 1, "CREATE_VIEW_START");
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View findViewById = A0i().findViewById(R.id.fab_second);
        View findViewById2 = A0i().findViewById(R.id.fab);
        AnonymousClass00C.A08(findViewById2);
        AnonymousClass00C.A0B(findViewById);
        this.A0y = AnonymousClass03T.A03(findViewById2, findViewById);
        if (findViewById instanceof ImageView) {
            C20810yC r5 = this.A0K;
            if (r5 == null) {
                AnonymousClass00C.A0G("abProps");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (C20800yB.A01(C21000yV.A01, r5, 1874)) {
                AnonymousClass30C r1 = this.A08;
                if (r1 != null) {
                    C18800tq r12 = r1.A00.A00;
                    this.A0T = new C34341gs((ImageView) findViewById, (AnonymousClass17Y) r1.A00.A00.A3e.get(), (C19760wT) r12.A70.get(), (C19420v0) r12.A9G.get(), (C19770wU) r12.A9Y.get());
                } else {
                    AnonymousClass00C.A0G("textToVoiceAnimationFactory");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            }
        }
        C32221dB A1d2 = A1d();
        A1d2.A01.A08("StatusesFragment_onCreateView");
        A1d2.A02.A09.markerPoint(453128091, 1, "CREATE_VIEW_END");
        return inflate;
    }

    public void A1R(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        bundle.putBoolean("is_tab_selected", this.A11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, A1c().A00, 6799) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1U(android.view.Menu r6, android.view.MenuInflater r7) {
        /*
            r5 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r6, r0)
            r3 = 1
            X.AnonymousClass00C.A0D(r7, r3)
            r0 = 2131431607(0x7f0b10b7, float:1.8484948E38)
            android.view.MenuItem r4 = r6.findItem(r0)
            if (r4 == 0) goto L_0x002a
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x0026
            X.1Sf r0 = r5.A1c()
            X.0yC r2 = r0.A00
            r1 = 6799(0x1a8f, float:9.527E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r1 = X.C20800yB.A01(r0, r2, r1)
            r0 = 0
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            r4.setVisible(r0)
        L_0x002a:
            boolean r0 = r5.A10
            r4 = 2
            if (r0 == 0) goto L_0x007b
            X.1Sf r0 = r5.A1c()
            X.0yC r2 = r0.A00
            r1 = 6798(0x1a8e, float:9.526E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x007b
            r1 = 2131431682(0x7f0b1102, float:1.84851E38)
            r0 = 2131893924(0x7f121ea4, float:1.9422638E38)
            android.view.MenuItem r1 = r6.add(r4, r1, r3, r0)
            r0 = 2131234317(0x7f080e0d, float:1.8084796E38)
            android.graphics.drawable.Drawable r0 = X.C54512t4.A00(r5, r0)
            r1.setIcon(r0)
            X.01I r1 = r5.A0i()
            r0 = 2131434772(0x7f0b1d14, float:1.8491367E38)
            android.view.View r0 = r1.findViewById(r0)
            int r2 = r0.getHeight()
            android.content.Context r0 = r5.A0a()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168379(0x7f070c7b, float:1.7951058E38)
            int r0 = r1.getDimensionPixelOffset(r0)
            int r2 = r2 - r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A0x = r0
            A06(r5)
        L_0x007b:
            X.1Sf r0 = r5.A1c()
            X.0yC r2 = r0.A00
            r1 = 6850(0x1ac2, float:9.599E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x009f
            r1 = 2131431700(0x7f0b1114, float:1.8485137E38)
            r0 = 2131897038(0x7f122ace, float:1.9428954E38)
            android.view.MenuItem r1 = r6.add(r4, r1, r3, r0)
            r0 = 2131234229(0x7f080db5, float:1.8084618E38)
            android.graphics.drawable.Drawable r0 = X.C54512t4.A00(r5, r0)
            r1.setIcon(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A1U(android.view.Menu, android.view.MenuInflater):void");
    }

    public boolean A1X(MenuItem menuItem) {
        AnonymousClass00C.A0D(menuItem, 0);
        C19460v5 r0 = this.A01;
        if (r0 == null) {
            AnonymousClass00C.A0G("smbActivities");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (r0.A05()) {
            menuItem.getItemId();
            C19460v5 r02 = this.A03;
            if (r02 != null) {
                r02.A02();
                throw new NullPointerException("getMenuItemBusinessToolsId");
            }
            AnonymousClass00C.A0G("smbMenus");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (menuItem.getItemId() == R.id.menuitem_status_privacy) {
            A1C(AnonymousClass190.A0E(A0a()));
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_see_all_statuses) {
            return false;
        } else {
            Bg3();
            return true;
        }
    }

    public /* synthetic */ void B0Y(C226715i r2) {
        AnonymousClass00C.A0D(r2, 1);
        r2.BQx();
    }

    public boolean B0r() {
        return true;
    }

    public boolean B7g() {
        return true;
    }

    public String BCV() {
        return "status_fragment";
    }

    public AnonymousClass3ZU BHi(int i, int i2, boolean z) {
        AnonymousClass15M r1;
        AnonymousClass3ZU r3 = this.A0Q;
        if (r3 == null) {
            View findViewById = A0i().findViewById(R.id.pager_holder);
            AnonymousClass00C.A08(findViewById);
            List list = this.A0y;
            if (list == null) {
                AnonymousClass00C.A0G("fabsList");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            ArrayList arrayList = new ArrayList(list);
            C21060yb r6 = this.A0F;
            if (r6 != null) {
                r3 = new AnonymousClass3ZU(findViewById, (AnonymousClass012) this, r6, (List) arrayList, i, i2, z);
            } else {
                AnonymousClass00C.A0G("systemServices");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        AnonymousClass01I A0h2 = A0h();
        if ((A0h2 instanceof AnonymousClass15M) && (r1 = (AnonymousClass15M) A0h2) != null) {
            AnonymousClass15J r12 = (AnonymousClass15J) r1;
            r12.A03.A05(r12.A3o(), false);
        }
        this.A0Q = r3;
        r3.A05(new C35751jC(this, 3));
        return r3;
    }

    public int BIA() {
        return 300;
    }

    public void BVg(DialogFragment dialogFragment, boolean z) {
    }

    public void Bba(C44072La r13) {
        C28981Uw r5;
        if (r13.A0N()) {
            String str = r13.A0J;
            if (str != null) {
                AnonymousClass005 r0 = this.A0o;
                if (r0 != null) {
                    Object obj = r0.get();
                    AnonymousClass00C.A08(obj);
                    Context A0a2 = A0a();
                    C28711Ts r6 = C28711Ts.RECOMMENDED_NEWSLETTERS;
                    StringBuilder sb = new StringBuilder();
                    sb.append("whatsapp://channel/");
                    sb.append(str);
                    ((NewsletterLinkLauncher) obj).A01(A0a2, Uri.parse(sb.toString()), (C28981Uw) null, r6, (Long) null, str, 0, -1);
                    return;
                }
                AnonymousClass00C.A0G("newsletterLinkLauncherLazy");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            return;
        }
        UpdatesViewModel updatesViewModel = this.A0c;
        if (updatesViewModel != null) {
            updatesViewModel.A01 = r13.A06();
        }
        AnonymousClass11F A062 = r13.A06();
        if ((A062 instanceof C28981Uw) && (r5 = (C28981Uw) A062) != null) {
            A1b();
            if (this.A16) {
                C32241dD A1b = A1b();
                if (C20800yB.A01(C21000yV.A02, A1b.A02, 5909)) {
                    C45512Rq r1 = new C45512Rq();
                    r1.A00 = 3;
                    A1b.A03.Bly(r1);
                }
            }
            Object obj2 = A1e().get();
            AnonymousClass00C.A08(obj2);
            AnonymousClass01I A0h2 = A0h();
            AnonymousClass00C.A0E(A0h2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
            ((AnonymousClass3UC) obj2).A09((C225314u) A0h2, r5, (String) null, (C006302t) null, 3);
        }
    }

    public void BgV() {
        this.A0z = true;
        C32341dO r3 = (C32341dO) A1f().get();
        C32371dR r0 = this.A0X;
        if (r0 != null) {
            r3.A03(A0i(), this, "status_fragment", r0.A02());
            return;
        }
        AnonymousClass00C.A0G("recentStatusManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void BgW() {
        this.A0z = false;
        C32371dR r0 = this.A0X;
        if (r0 != null) {
            A08(this, r0.A02());
        } else {
            AnonymousClass00C.A0G("recentStatusManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public void BhV(UserJid userJid, boolean z) {
        DialogFragment A002;
        String str = null;
        UpdatesViewModel updatesViewModel = this.A0c;
        UserJid userJid2 = userJid;
        if (z) {
            if (updatesViewModel != null) {
                str = StatusesViewModel.A01(updatesViewModel.A0f);
            }
            A002 = C55402uZ.A00(userJid2, (Long) null, (String) null, (String) null, str, true);
        } else {
            if (updatesViewModel != null) {
                str = StatusesViewModel.A01(updatesViewModel.A0f);
            }
            A002 = C55392uY.A00(userJid2, (Long) null, (String) null, (String) null, str, true);
        }
        AnonymousClass3LQ.A01(A002, this);
    }

    public static final void A00(UpdatesFragment updatesFragment) {
        LinearLayoutManager linearLayoutManager;
        UpdatesAdapter updatesAdapter;
        C48162go r1;
        AnonymousClass3L1 r0;
        AnonymousClass1GQ r12 = updatesFragment.A0M;
        if (r12 == null) {
            AnonymousClass00C.A0G("newsletterConfig");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (AnonymousClass1GQ.A00(r12, 2)) {
            ObservableRecyclerView observableRecyclerView = updatesFragment.A0E;
            AnonymousClass0CP r13 = null;
            if (observableRecyclerView != null) {
                r13 = observableRecyclerView.getLayoutManager();
            }
            if ((r13 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r13) != null) {
                int A1T = linearLayoutManager.A1T();
                int A1V = linearLayoutManager.A1V();
                if (A1T != -1 && A1V != -1 && (updatesAdapter = updatesFragment.A0b) != null) {
                    AnonymousClass005 r02 = updatesFragment.A0q;
                    if (r02 != null) {
                        AnonymousClass3K9 r4 = (AnonymousClass3K9) r02.get();
                        HashSet hashSet = new HashSet();
                        HashSet hashSet2 = new HashSet();
                        int size = updatesAdapter.A04.size() - 1;
                        if (A1V > size) {
                            A1V = size;
                        }
                        if (A1T <= A1V) {
                            while (true) {
                                Object obj = updatesAdapter.A04.get(A1T);
                                if ((obj instanceof C48162go) && (r1 = (C48162go) obj) != null) {
                                    AnonymousClass3T1 r14 = r1.A05;
                                    if ((r14 instanceof AnonymousClass2bU) && C54732tQ.A00((AnonymousClass2bU) r14)) {
                                        hashSet.add(r14);
                                    } else if (!(r14 == null || (r0 = r14.A0a) == null || r0.A09)) {
                                        hashSet2.add(r14);
                                    }
                                }
                                if (A1T == A1V) {
                                    break;
                                }
                                A1T++;
                            }
                        }
                        r4.A01(new C596934x(hashSet, hashSet2));
                        return;
                    }
                    AnonymousClass00C.A0G("newsletterMediaDownloadManagerLazy");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            }
        }
    }

    public static final void A05(UpdatesFragment updatesFragment) {
        UpdatesFragment updatesFragment2 = updatesFragment;
        if (!updatesFragment2.A15) {
            updatesFragment2.A15 = true;
            C32291dI r1 = updatesFragment2.A09;
            if (r1 != null) {
                C18800tq r3 = r1.A00.A00;
                updatesFragment2.A0S = new StatusExpirationLifecycleOwner(updatesFragment2, (AnonymousClass17Y) r1.A00.A00.A3e.get(), (AnonymousClass1HT) r3.A7x.get(), (AnonymousClass16E) r3.A80.get(), (C19770wU) r3.A9Y.get());
                C32251dE r12 = updatesFragment2.A0Z;
                if (r12 != null) {
                    StatusesViewModel statusesViewModel = (StatusesViewModel) new AnonymousClass04H(new C68073bI(r12, true), updatesFragment2).A00(StatusesViewModel.class);
                    updatesFragment2.A0U = (UpdatesAdvertiseViewModel) new AnonymousClass04H(updatesFragment2).A00(UpdatesAdvertiseViewModel.class);
                    CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = (CrossPostingUpdatesViewModel) new AnonymousClass04H(updatesFragment2).A00(CrossPostingUpdatesViewModel.class);
                    updatesFragment2.A0W = crossPostingUpdatesViewModel;
                    C32261dF r2 = updatesFragment2.A06;
                    if (r2 != null) {
                        UpdatesAdvertiseViewModel updatesAdvertiseViewModel = updatesFragment2.A0U;
                        if (updatesAdvertiseViewModel == null) {
                            AnonymousClass00C.A0G("advertiseViewModel");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        } else if (crossPostingUpdatesViewModel == null) {
                            AnonymousClass00C.A0G("crosspostingUpdatesViewModel");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        } else {
                            AnonymousClass00C.A0D(statusesViewModel, 1);
                            UpdatesViewModel updatesViewModel = (UpdatesViewModel) new AnonymousClass04H(new C68123bN(r2, updatesAdvertiseViewModel, crossPostingUpdatesViewModel, statusesViewModel), updatesFragment2).A00(UpdatesViewModel.class);
                            AnonymousClass01N r13 = updatesFragment2.A0P;
                            r13.A04(statusesViewModel);
                            r13.A04(updatesViewModel);
                            CrossPostingUpdatesViewModel crossPostingUpdatesViewModel2 = updatesFragment2.A0W;
                            if (crossPostingUpdatesViewModel2 == null) {
                                AnonymousClass00C.A0G("crosspostingUpdatesViewModel");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                            r13.A04(crossPostingUpdatesViewModel2);
                            updatesFragment2.A0c = updatesViewModel;
                            AnonymousClass005 r0 = updatesFragment2.A0i;
                            if (r0 != null) {
                                r0.get();
                                View view = updatesFragment2.A0F;
                                View view2 = view;
                                if (view == null) {
                                    Log.e("Cannot setup updates list since the fragmentView is null");
                                    return;
                                }
                                C58472zv r14 = updatesFragment2.A07;
                                if (r14 != null) {
                                    C19770wU r20 = (C19770wU) r14.A00.A00.A9Y.get();
                                    C18800tq r15 = r14.A00.A00;
                                    C27731Pn r19 = (C27731Pn) r15.A2E.get();
                                    C19630wG r18 = (C19630wG) r15.A91.get();
                                    C18830tt r02 = r15.A00;
                                    C87364Om r17 = (C87364Om) r02.A3u.get();
                                    AnonymousClass301 r16 = (AnonymousClass301) r02.A3y.get();
                                    AnonymousClass005 A002 = C18840tu.A00(r02.A4D);
                                    AnonymousClass005 A003 = C18840tu.A00(r02.A07);
                                    AnonymousClass305 r27 = (AnonymousClass305) r02.A2q.get();
                                    AnonymousClass306 r28 = (AnonymousClass306) r02.A3e.get();
                                    AnonymousClass307 r29 = (AnonymousClass307) r02.A2m.get();
                                    AnonymousClass3CD r30 = (AnonymousClass3CD) r02.A14.get();
                                    AnonymousClass308 r31 = (AnonymousClass308) r02.A06.get();
                                    AnonymousClass309 r32 = (AnonymousClass309) r02.A3a.get();
                                    AnonymousClass301 r23 = r16;
                                    AnonymousClass302 r24 = (AnonymousClass302) r02.A2r.get();
                                    AnonymousClass303 r25 = (AnonymousClass303) r02.A3z.get();
                                    AnonymousClass304 r26 = (AnonymousClass304) r02.A2x.get();
                                    UpdatesAdapter updatesAdapter = new UpdatesAdapter(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, updatesFragment2, r19, r18, (C20810yC) r15.A02.get(), (AnonymousClass1GQ) r15.A5a.get(), (C28331Sf) r15.A7w.get(), updatesFragment2, updatesFragment2, updatesFragment2, r17, r20, A002, A003, C18840tu.A00(r02.A1x));
                                    updatesFragment2.A0P.A04(updatesAdapter);
                                    updatesFragment2.A0b = updatesAdapter;
                                    ObservableRecyclerView observableRecyclerView = (ObservableRecyclerView) C012005e.A02(view2, R.id.updates_list);
                                    observableRecyclerView.setAdapter(updatesFragment2.A0b);
                                    updatesFragment2.A0a();
                                    observableRecyclerView.setLayoutManager(new LinearLayoutManager());
                                    observableRecyclerView.setItemAnimator((C02800By) null);
                                    AnonymousClass1NA r03 = updatesFragment2.A0L;
                                    if (r03 != null) {
                                        boolean z = !r03.A01;
                                        int dimensionPixelSize = updatesFragment2.A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                                        if (z) {
                                            dimensionPixelSize += updatesFragment2.A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                                        }
                                        observableRecyclerView.setPadding(observableRecyclerView.getPaddingLeft(), dimensionPixelSize, observableRecyclerView.getPaddingRight(), observableRecyclerView.getPaddingBottom());
                                        observableRecyclerView.A0v((AnonymousClass0UE) updatesFragment2.A18.getValue());
                                        updatesFragment2.A0E = observableRecyclerView;
                                        UpdatesAdapter updatesAdapter2 = updatesFragment2.A0b;
                                        if (updatesAdapter2 != null) {
                                            updatesAdapter2.A01 = updatesFragment2;
                                        }
                                        UpdatesViewModel updatesViewModel2 = updatesFragment2.A0c;
                                        if (updatesViewModel2 != null) {
                                            updatesViewModel2.A0N.A08(updatesFragment2.A0m(), new C55892vM(new AnonymousClass4LR(updatesFragment2), 7));
                                            updatesViewModel2.A0T.A08(updatesFragment2.A0m(), new C36201jv(new AnonymousClass4MN(updatesFragment2, updatesViewModel2), 39));
                                            AnonymousClass005 r04 = updatesFragment2.A0i;
                                            if (r04 != null) {
                                                r04.get();
                                                updatesViewModel2.A0M.A08(updatesFragment2.A0m(), new C55892vM(new AnonymousClass4LS(updatesFragment2), 8));
                                                updatesViewModel2.A0f.A05.A08(updatesFragment2.A0m(), new C55892vM(new AnonymousClass4LT(updatesFragment2), 9));
                                                UpdatesViewModel.A03(updatesViewModel2);
                                                updatesViewModel2.A0E = true;
                                            } else {
                                                AnonymousClass00C.A0G("advertiseGatingLazy");
                                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                            }
                                        }
                                        LifecycleCoroutineScopeImpl A004 = C33311f5.A00(updatesFragment2);
                                        AnonymousClass0A2.A02(C023109s.A00, C008903u.A00, new UpdatesFragment$observeSideEffects$1(updatesFragment2, (C023509x) null), A004);
                                        return;
                                    }
                                    AnonymousClass00C.A0G("bottomNavHelper");
                                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                }
                                AnonymousClass00C.A0G("updatesAdapterFactory");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                            AnonymousClass00C.A0G("advertiseGatingLazy");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    } else {
                        AnonymousClass00C.A0G("statusUpdatesViewModelFactory");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                } else {
                    AnonymousClass00C.A0G("statusesViewModelFactory");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                AnonymousClass00C.A0G("statusExpirationLifecycleOwnerFactory");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
    }

    public static final void A06(UpdatesFragment updatesFragment) {
        ViewGroup.LayoutParams layoutParams;
        Integer num = updatesFragment.A0x;
        if (num != null) {
            int intValue = num.intValue();
            if (A09(updatesFragment)) {
                if (updatesFragment.A0C == null) {
                    View inflate = ((ViewStub) updatesFragment.A0d().findViewById(R.id.view_stub_see_all_tooltip)).inflate();
                    AnonymousClass00C.A0E(inflate, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                    WaTextView waTextView = (WaTextView) inflate;
                    updatesFragment.A0C = waTextView;
                    if (waTextView != null) {
                        waTextView.setBackground(AnonymousClass00E.A00(updatesFragment.A0a(), R.drawable.tooltip_ptt_reversed));
                    }
                }
                WaTextView waTextView2 = updatesFragment.A0C;
                if (waTextView2 != null) {
                    layoutParams = waTextView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                AnonymousClass00C.A0E(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = intValue;
                updatesFragment.A1Z().A0I(new C35751jC(updatesFragment, 5), 200);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r1 = (X.AnonymousClass15J) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r1 = (X.AnonymousClass15J) r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(com.whatsapp.updates.ui.UpdatesFragment r3) {
        /*
            boolean r0 = r3.A11
            if (r0 == 0) goto L_0x0045
            boolean r0 = r3.A10
            if (r0 == 0) goto L_0x0026
            X.1Sf r0 = r3.A1c()
            X.0yC r1 = r0.A00
            r0 = 6795(0x1a8b, float:9.522E-42)
            X.0yV r2 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r2, r1, r0)
            if (r0 != 0) goto L_0x0058
            X.1Sf r0 = r3.A1c()
            X.0yC r1 = r0.A00
            r0 = 6799(0x1a8f, float:9.527E-42)
            boolean r0 = X.C20800yB.A01(r2, r1, r0)
            if (r0 != 0) goto L_0x0058
        L_0x0026:
            r2 = 1
        L_0x0027:
            X.01I r1 = r3.A0h()
            boolean r0 = r1 instanceof X.AnonymousClass15M
            if (r2 == 0) goto L_0x0046
            if (r0 == 0) goto L_0x0045
            X.15M r1 = (X.AnonymousClass15M) r1
            if (r1 == 0) goto L_0x0045
            X.15J r1 = (X.AnonymousClass15J) r1
            X.1RK r2 = r1.A3o()
            if (r2 == 0) goto L_0x0045
            X.1R8 r1 = r1.A03
            r0 = 0
        L_0x0040:
            r1.A03 = r0
            X.AnonymousClass1R8.A02(r2, r1)
        L_0x0045:
            return
        L_0x0046:
            if (r0 == 0) goto L_0x0045
            X.15M r1 = (X.AnonymousClass15M) r1
            if (r1 == 0) goto L_0x0045
            X.15J r1 = (X.AnonymousClass15J) r1
            X.1RK r2 = r1.A3o()
            if (r2 == 0) goto L_0x0045
            X.1R8 r1 = r1.A03
            r0 = 1
            goto L_0x0040
        L_0x0058:
            r2 = 0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.A07(com.whatsapp.updates.ui.UpdatesFragment):void");
    }

    public static final boolean A09(UpdatesFragment updatesFragment) {
        if (updatesFragment.A11 && updatesFragment.A10 && !((SharedPreferences) updatesFragment.A1a().A00.get()).getBoolean("updates_tab_see_all_status_tooltip_shown", false)) {
            if (!C20800yB.A01(C21000yV.A02, updatesFragment.A1c().A00, 7188)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void A1B() {
        Log.i("UpdatesFragment/onStop");
        super.A1B();
        AnonymousClass005 r0 = this.A0v;
        if (r0 != null) {
            ((AnonymousClass1Q1) r0.get()).A02(this);
            C28781Ua r02 = this.A0g;
            if (r02 != null) {
                if (r02.A02()) {
                    AnonymousClass005 r03 = this.A0w;
                    if (r03 != null) {
                        ((C60973Ab) ((C35011i0) r03.get()).A08.get()).A01 = null;
                    } else {
                        AnonymousClass00C.A0G("xFamilyCrosspostManagerLazy");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                }
                if (this.A0D == null) {
                    AnonymousClass00C.A0G("wfalManager");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                return;
            }
            AnonymousClass00C.A0G("xFamilyGating");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass00C.A0G("waSnackbarRegistryLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A1H() {
        Log.i("UpdatesFragment/onDestroy");
        AnonymousClass005 r0 = this.A0k;
        if (r0 != null) {
            AnimatorSet animatorSet = ((C36481kN) r0.get()).A00;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.A0E = null;
            AnonymousClass005 r02 = this.A0q;
            if (r02 != null) {
                ((AnonymousClass3K9) r02.get()).A00();
                super.A1H();
                return;
            }
            AnonymousClass00C.A0G("newsletterMediaDownloadManagerLazy");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass00C.A0G("collapseSublistAnimatorLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A1K() {
        Log.i("UpdatesFragment/onPause");
        ((C32341dO) A1f().get()).A05.A07(this);
        AnonymousClass3ZU r0 = this.A0Q;
        if (r0 != null) {
            r0.A01();
        }
        ((C34901hp) A1g().get()).A04();
        C34341gs r02 = this.A0T;
        if (r02 != null) {
            r02.A00.cancel();
        }
        super.A1K();
    }

    public void A1M() {
        Log.i("UpdatesFragment/onStart");
        super.A1M();
        AnonymousClass005 r0 = this.A0v;
        if (r0 != null) {
            ((AnonymousClass1Q1) r0.get()).A01(this);
            C28781Ua r02 = this.A0g;
            if (r02 != null) {
                if (r02.A02()) {
                    AnonymousClass005 r03 = this.A0w;
                    if (r03 != null) {
                        ((C60973Ab) ((C35011i0) r03.get()).A08.get()).A01 = new C80003ud(this);
                    } else {
                        AnonymousClass00C.A0G("xFamilyCrosspostManagerLazy");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                }
                if (this.A0D == null) {
                    AnonymousClass00C.A0G("wfalManager");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                return;
            }
            AnonymousClass00C.A0G("xFamilyGating");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass00C.A0G("waSnackbarRegistryLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A1N(int i, int i2, Intent intent) {
        if (i != 33) {
            if (i != 35) {
                if (i != 151 || i2 != -1) {
                    return;
                }
                if (this.A0z) {
                    BgV();
                } else {
                    BgW();
                }
            } else if (this.A0z) {
                CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A0W;
                if (crossPostingUpdatesViewModel == null) {
                    AnonymousClass00C.A0G("crosspostingUpdatesViewModel");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                crossPostingUpdatesViewModel.A03.A03();
                CrossPostingUpdatesViewModel.A01(crossPostingUpdatesViewModel, false, true);
                ((C32341dO) A1f().get()).A01(intent);
            }
        } else if (i2 == -1) {
            int i3 = this.A12;
            if (i3 <= 0) {
                i3 = 9;
            }
            Bd1(11, i3);
        }
    }

    public void A1P(Bundle bundle) {
        Log.i("UpdatesFragment/onActivityCreated");
        A1d().A02.A09.markerPoint(453128091, 1, "CREATE_ACTIVITY_START");
        this.A0Y = true;
        A10(true);
        C21690ze r1 = A1d().A02.A09;
        r1.markerPoint(453128091, 1, "CREATE_ACTIVITY_END");
        r1.markerEnd(453128091, 1, 2);
    }

    public void A1Q(Bundle bundle) {
        Log.i("UpdatesFragment/onCreate");
        A1d().A00();
        super.A1Q(bundle);
        if (bundle != null) {
            this.A11 = bundle.getBoolean("is_tab_selected");
        }
    }

    public final AnonymousClass17Y A1Z() {
        AnonymousClass17Y r0 = this.A0A;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("globalUI");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C19420v0 A1a() {
        C19420v0 r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("waSharedPreferences");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C32241dD A1b() {
        C32241dD r0 = this.A0O;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("newsletterLogging");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C28331Sf A1c() {
        C28331Sf r0 = this.A0R;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("statusConfig");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final C32221dB A1d() {
        C32221dB r0 = this.A0Y;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("statusUpdatesTracker");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A1e() {
        AnonymousClass005 r0 = this.A0n;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("newsletterLauncherLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A1f() {
        AnonymousClass005 r0 = this.A0s;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("statusSharingManagerLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass005 A1g() {
        AnonymousClass005 r0 = this.A0t;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("statusUndoHandlerLazy");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void B1H(C226015b r8) {
        Object obj;
        CharSequence charSequence;
        C51902oZ r0;
        String str = r8.A02;
        this.A13 = str;
        UpdatesViewModel updatesViewModel = this.A0c;
        if (updatesViewModel != null) {
            String A032 = updatesViewModel.A0S().A03();
            if (str == null || (obj = AnonymousClass099.A0D(str)) == null) {
                obj = "";
            }
            if (!AnonymousClass00C.A0J(A032, obj)) {
                SearchUsecase A0S2 = updatesViewModel.A0S();
                AnonymousClass040 A002 = C109325Xd.A00(updatesViewModel);
                AnonymousClass00C.A0D(A002, 1);
                if (str != null) {
                    charSequence = AnonymousClass099.A0D(str);
                } else {
                    charSequence = null;
                }
                A0S2.A03 = charSequence;
                A0S2.A05.A0D(C023409w.A00);
                AnonymousClass00T r1 = A0S2.A0B;
                if (((Boolean) r1.getValue()).booleanValue()) {
                    r0 = C51902oZ.LOADING;
                } else {
                    r0 = C51902oZ.DONE;
                }
                SearchUsecase.A02(r0, A0S2, true);
                if ((!AnonymousClass098.A06(A0S2.A03())) && ((Boolean) r1.getValue()).booleanValue()) {
                    AnonymousClass0A2.A02(C023109s.A00, A0S2.A0C, new SearchUsecase$launchRemoteSearch$1(A0S2, (C023509x) null), A002);
                }
                updatesViewModel.A09 = updatesViewModel.A0S().A05();
                if (AnonymousClass098.A06(updatesViewModel.A0S().A03())) {
                    UpdatesViewModel.A05(updatesViewModel);
                }
            }
        }
    }

    public AnonymousClass01P BAc() {
        AnonymousClass01P r0 = this.A0P.A02;
        AnonymousClass00C.A08(r0);
        return r0;
    }

    public Drawable BH6() {
        if (this.A0d != null) {
            Context A0a2 = A0a();
            boolean z = C222013h.A07;
            int i = R.drawable.ic_text_status_compose;
            if (z) {
                i = R.drawable.ic_text_status_compose_filled_wds;
            }
            return AnonymousClass3UF.A02(A0a2, i, C224514j.A00(A0a(), R.attr.f4nameremoved, R.color.f6nameremoved));
        }
        AnonymousClass00C.A0G("systemFeatures");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0084, code lost:
        if (r6 == r0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQv(X.C51362nh r6) {
        /*
            r5 = this;
            X.0v5 r0 = r5.A02
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r0.A02()
            X.005 r0 = (X.AnonymousClass005) r0
            r0.get()
            r5.A0a()
            com.whatsapp.status.advertise.UpdatesAdvertiseViewModel r4 = r5.A0U
            if (r4 != 0) goto L_0x0021
            java.lang.String r0 = "advertiseViewModel"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x0021:
            X.0v5 r1 = r4.A01
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x0034
            r1.A02()
            java.lang.String r0 = "logStatusEntryPointClicked"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x0034:
            X.2nh r0 = X.C51362nh.Banner
            if (r6 != r0) goto L_0x0082
            X.0v0 r0 = r4.A02
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "pref_advertise_banner_status_main_shown"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r3)
            r0.apply()
            X.08M r2 = r4.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.lang.String r0 = "KEY_STATUS_MAIN_HAS_SHOWN_ADVERTISE_BANNER"
            r2.A03(r0, r1)
            X.3Rz r2 = r4.A03
            X.2o9 r0 = X.C51642o9.ADVERTISE
            java.lang.String r1 = X.C65423Rz.A00(r0)
            X.0v0 r0 = r2.A00
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r1, r3)
            r0.apply()
        L_0x0068:
            r3 = 44
        L_0x006a:
            X.2nh r0 = X.C51362nh.Button
            if (r6 != r0) goto L_0x007f
            X.2pZ r2 = X.C52522pZ.A0l
        L_0x0070:
            java.lang.String r1 = "-1"
            X.8UQ r0 = new X.8UQ
            r0.<init>(r2, r1, r3)
            java.lang.String r0 = "launchAdsCreationExperience"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            throw r1
        L_0x007f:
            X.2pZ r2 = X.C52522pZ.A0k
            goto L_0x0070
        L_0x0082:
            r3 = 43
            if (r6 != r0) goto L_0x006a
            goto L_0x0068
        L_0x0087:
            java.lang.String r0 = "smbAdsCreationActivityRouter"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.BQv(X.2nh):void");
    }

    public void BaQ(int i, int i2) {
        AnonymousClass13J r0 = this.A0d;
        if (r0 == null) {
            AnonymousClass00C.A0G("systemFeatures");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (r0.BJo()) {
            Bd1(i, i2);
        } else {
            Bd6();
        }
    }

    public void BbJ() {
        AnonymousClass3EL r0;
        C65663Sz r02;
        UpdatesViewModel updatesViewModel = this.A0c;
        if (updatesViewModel == null || (r0 = (AnonymousClass3EL) updatesViewModel.A0M.A04()) == null || (r02 = r0.A00) == null || r02.A02() <= 0) {
            BaQ(11, 58);
            return;
        }
        Context A0a2 = A0a();
        Intent intent = new Intent();
        intent.setClassName(A0a2.getPackageName(), "com.whatsapp.status.playback.MyStatusesActivity");
        A1C(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r2, 4905) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bd1(int r6, int r7) {
        /*
            r5 = this;
            X.0wQ r0 = r5.A0B
            if (r0 == 0) goto L_0x00cf
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0052
            X.005 r0 = r5.A0l
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r0.get()
            X.0wp r0 = (X.C19980wp) r0
            android.content.SharedPreferences r2 = X.C19980wp.A00(r0)
            java.lang.String r1 = "post_status_in_companion"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x002f
            X.0yC r2 = r5.A0K
            if (r2 == 0) goto L_0x0038
            r1 = 4905(0x1329, float:6.873E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0052
        L_0x002f:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.AnonymousClass3LQ.A01(r0, r5)
            return
        L_0x0038:
            java.lang.String r0 = "abProps"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.String r0 = "companionModeSharedPreferencesLazy"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0052:
            X.3US r2 = com.whatsapp.RequestPermissionActivity.A0B
            X.0yE r1 = r5.A0I
            if (r1 == 0) goto L_0x00c2
            r4 = 33
            android.content.Context r0 = r5.A0a()
            android.content.Intent r0 = r2.A0B(r0, r1, r4)
            if (r0 != 0) goto L_0x00bc
            X.005 r0 = r5.A0j
            if (r0 == 0) goto L_0x00af
            java.lang.Object r3 = r0.get()
            X.1Q4 r3 = (X.AnonymousClass1Q4) r3
            X.01I r2 = r5.A0i()
            X.01I r1 = r5.A0h()
            boolean r0 = r1 instanceof X.C225014r
            if (r0 == 0) goto L_0x00a7
            X.14r r1 = (X.C225014r) r1
            if (r1 == 0) goto L_0x00a7
            X.15g r0 = r5.A19
            boolean r0 = r3.A00(r2, r1, r0, r4)
            if (r0 == 0) goto L_0x00bf
            r0 = -1
            r5.A12 = r0
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r5.A0c
            if (r0 == 0) goto L_0x0094
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r0.A0f
            X.1Xt r0 = r0.A0C
            r0.A03()
        L_0x0094:
            android.content.Context r2 = r5.A0a()
            X.8dw r0 = X.C177528dw.A00
            java.lang.String r1 = r0.getRawString()
            r0 = 4
            android.content.Intent r0 = X.AnonymousClass190.A18(r2, r1, r0, r6, r7)
            r5.A1C(r0)
            return
        L_0x00a7:
            java.lang.String r1 = "Activity should extend DialogInterface"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00af:
            java.lang.String r0 = "cameraPermissionsHelperLazy"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            r5.startActivityForResult(r0, r4)
        L_0x00bf:
            r5.A12 = r7
            return
        L_0x00c2:
            java.lang.String r0 = "waPermissionsHelper"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            java.lang.String r0 = "meManager"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.Bd1(int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, r2, 4905) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bd6() {
        /*
            r3 = this;
            X.0wQ r0 = r3.A0B
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x0052
            X.005 r0 = r3.A0l
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r0.get()
            X.0wp r0 = (X.C19980wp) r0
            android.content.SharedPreferences r2 = X.C19980wp.A00(r0)
            java.lang.String r1 = "post_status_in_companion"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x002f
            X.0yC r2 = r3.A0K
            if (r2 == 0) goto L_0x0038
            r1 = 4905(0x1329, float:6.873E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0052
        L_0x002f:
            com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment r0 = new com.whatsapp.status.StatusCompanionModeUnavailableDialogFragment
            r0.<init>()
            X.AnonymousClass3LQ.A01(r0, r3)
            return
        L_0x0038:
            java.lang.String r0 = "abProps"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0045:
            java.lang.String r0 = "companionModeSharedPreferencesLazy"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x0052:
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r3.A0c
            if (r0 == 0) goto L_0x005d
            com.whatsapp.status.viewmodels.StatusesViewModel r0 = r0.A0f
            X.1Xt r0 = r0.A0C
            r0.A04()
        L_0x005d:
            android.content.Context r1 = r3.A0a()
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Intent r0 = X.AnonymousClass190.A10(r1, r0)
            r3.A1C(r0)
            return
        L_0x006e:
            java.lang.String r0 = "meManager"
            X.AnonymousClass00C.A0G(r0)
            java.lang.String r1 = "Redex: Unreachable code after no-return invoke"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.Bd6():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (X.C20800yB.A01(X.C21000yV.A02, A1c().A00, 56) == false) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BhQ(com.whatsapp.jid.UserJid r6) {
        /*
            r5 = this;
            boolean r0 = r5.A10
            if (r0 == 0) goto L_0x0014
            X.1Sf r0 = r5.A1c()
            X.0yC r2 = r0.A00
            r1 = 56
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0022
        L_0x0014:
            boolean r0 = r5.A10
            if (r0 != 0) goto L_0x0061
            X.1Sf r0 = r5.A1c()
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0061
        L_0x0022:
            r3 = 1
        L_0x0023:
            android.content.Context r2 = r5.A0a()
            r1 = 0
            boolean r0 = r5.A10
            android.content.Intent r0 = X.AnonymousClass190.A0b(r2, r6, r1, r0, r3)
            r5.A1C(r0)
            com.whatsapp.updates.viewmodels.UpdatesViewModel r0 = r5.A0c
            if (r0 == 0) goto L_0x003b
            com.whatsapp.status.viewmodels.StatusesViewModel r1 = r0.A0f
            r0 = 0
            r1.A0U(r6, r0, r0)
        L_0x003b:
            boolean r0 = r5.A16
            if (r0 == 0) goto L_0x0060
            X.1dD r4 = r5.A1b()
            r3 = 2
            X.0yC r2 = r4.A02
            r1 = 5909(0x1715, float:8.28E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0060
            X.2Rq r1 = new X.2Rq
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A00 = r0
            X.0yW r0 = r4.A03
            r0.Bly(r1)
        L_0x0060:
            return
        L_0x0061:
            r3 = 0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.updates.ui.UpdatesFragment.BhQ(com.whatsapp.jid.UserJid):void");
    }

    public void Bs8(boolean z) {
        UpdatesViewModel updatesViewModel;
        Long l;
        int i;
        ObservableRecyclerView observableRecyclerView;
        this.A16 = z;
        UpdatesAdapter updatesAdapter = this.A0b;
        if (updatesAdapter != null) {
            updatesAdapter.A0R.getValue();
        }
        Context A1D = A1D();
        if (!(A1D == null || (observableRecyclerView = this.A0E) == null)) {
            int dimensionPixelSize = A1D.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (z) {
                dimensionPixelSize = 0;
            }
            AnonymousClass1NA r0 = this.A0L;
            if (r0 != null) {
                boolean z2 = !r0.A01;
                int dimensionPixelSize2 = A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                if (z2 && !z) {
                    dimensionPixelSize2 += A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
                }
                observableRecyclerView.setPadding(observableRecyclerView.getPaddingLeft(), dimensionPixelSize2, observableRecyclerView.getPaddingRight(), dimensionPixelSize);
            } else {
                AnonymousClass00C.A0G("bottomNavHelper");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
        if (z && (updatesViewModel = this.A0c) != null) {
            AnonymousClass3P0 r7 = (AnonymousClass3P0) updatesViewModel.A0f.A05.A04();
            if (r7 == null) {
                C023409w r9 = C023409w.A00;
                r7 = new AnonymousClass3P0((C65663Sz) null, r9, r9, r9, C000400e.A0D(), C000400e.A0D());
            }
            List<C65663Sz> list = r7.A03;
            long size = (long) list.size();
            int i2 = 0;
            int i3 = 0;
            for (C65663Sz r1 : list) {
                i3 += r1.A02() - r1.A03();
            }
            long j = (long) i3;
            List<C65663Sz> list2 = r7.A02;
            int i4 = 0;
            for (C65663Sz r12 : list2) {
                i4 += r12.A02() - r12.A03();
            }
            long j2 = j + ((long) i4);
            long size2 = (long) list2.size();
            int i5 = 0;
            for (C65663Sz A032 : list2) {
                i5 += A032.A03();
            }
            long j3 = (long) i5;
            int i6 = 0;
            for (C65663Sz A033 : list) {
                i6 += A033.A03();
            }
            long j4 = j3 + ((long) i6);
            SearchUsecase A0S2 = updatesViewModel.A0S();
            C001700s r14 = updatesViewModel.A0T;
            List<C48162go> list3 = (List) r14.A04();
            Long l2 = null;
            if (list3 != null) {
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    i = 0;
                    for (C48162go r02 : list3) {
                        if (r02.A04.A0M() && (i = i + 1) < 0) {
                            AnonymousClass03T.A04();
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    }
                } else {
                    i = 0;
                }
                l = Long.valueOf((long) i);
            } else {
                l = null;
            }
            List<C48162go> list4 = (List) r14.A04();
            if (list4 != null) {
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    for (C48162go r03 : list4) {
                        if (r03.A04.A0L() && (i2 = i2 + 1) < 0) {
                            AnonymousClass03T.A04();
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    }
                }
                l2 = Long.valueOf((long) i2);
            }
            C32241dD r92 = A0S2.A09;
            Long valueOf = Long.valueOf(size);
            Long valueOf2 = Long.valueOf(j2);
            Long valueOf3 = Long.valueOf(size2);
            Long valueOf4 = Long.valueOf(j4);
            if (C20800yB.A01(C21000yV.A02, r92.A02, 5909)) {
                C45512Rq r13 = new C45512Rq();
                r13.A00 = 1;
                r13.A06 = valueOf;
                r13.A05 = valueOf2;
                r13.A04 = valueOf3;
                r13.A03 = valueOf4;
                r13.A02 = l;
                r13.A01 = l2;
                r92.A03.Bly(r13);
            }
        }
    }

    public void Bs9(boolean z) {
        ObservableRecyclerView observableRecyclerView;
        UpdatesViewModel updatesViewModel = this.A0c;
        if (updatesViewModel != null) {
            this.A11 = z;
            if (z) {
                C19420v0 A1a = A1a();
                C19970wo r0 = this.A0G;
                if (r0 != null) {
                    C19420v0.A00(A1a).putLong("status_tab_last_opened_time", C19970wo.A00(r0)).apply();
                    AnonymousClass1N6 r3 = this.A0a;
                    if (r3 != null) {
                        AnonymousClass00T r02 = AnonymousClass1N6.A0A;
                        r3.A02((AnonymousClass11F) null, 25);
                        A07(this);
                        C34341gs r03 = this.A0T;
                        if (r03 != null) {
                            r03.A00();
                        }
                        AnonymousClass1GQ r1 = this.A0M;
                        if (r1 != null) {
                            if (AnonymousClass1GQ.A00(r1, 2) && (observableRecyclerView = this.A0E) != null) {
                                observableRecyclerView.post(new C35751jC(this, 8));
                            }
                            if (this.A0N != null) {
                                A06(this);
                            } else {
                                AnonymousClass00C.A0G("newsletterManager");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                        } else {
                            AnonymousClass00C.A0G("newsletterConfig");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                    } else {
                        AnonymousClass00C.A0G("navigationTimeSpentManager");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                } else {
                    AnonymousClass00C.A0G("time");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                C34341gs r04 = this.A0T;
                if (r04 != null) {
                    r04.A00.cancel();
                }
                CrossPostingUpdatesViewModel crossPostingUpdatesViewModel = this.A0W;
                if (crossPostingUpdatesViewModel == null) {
                    AnonymousClass00C.A0G("crosspostingUpdatesViewModel");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                AnonymousClass3KF r05 = crossPostingUpdatesViewModel.A00;
                if (r05 == null) {
                    AnonymousClass00C.A0G("crossPostingViewModelState");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                } else if (r05.A03) {
                    if (crossPostingUpdatesViewModel.A07.A00()) {
                        C63623Kt r32 = crossPostingUpdatesViewModel.A06;
                        r32.A08.A03("EXIT_STATUS_VIEW");
                        r32.A09.A03("EXIT_STATUS_VIEW");
                        r32.A06.A01();
                    } else {
                        C61103Ao r06 = crossPostingUpdatesViewModel.A04.A00;
                        if (r06 != null) {
                            r06.A00 = 1;
                        }
                        crossPostingUpdatesViewModel.A03.A03();
                        CrossPostingUpdatesViewModel.A01(crossPostingUpdatesViewModel, false, false);
                    }
                }
            }
            boolean z2 = updatesViewModel.A0C;
            updatesViewModel.A0C = z;
            if (!z) {
                updatesViewModel.A0e.A02();
                Timer timer = updatesViewModel.A08;
                if (timer != null) {
                    timer.cancel();
                }
                updatesViewModel.A07 = null;
                updatesViewModel.A0f.A0C.A05();
                return;
            }
            updatesViewModel.A0G = true;
            updatesViewModel.A0g.A00 = true;
            UpdatesViewModel.A06(updatesViewModel);
            UpdatesViewModel.A05(updatesViewModel);
            C48052gc r12 = (C48052gc) updatesViewModel.A0P.A04();
            if (r12 != null) {
                updatesViewModel.A0c.A0S(r12);
            }
            updatesViewModel.A0J = false;
            if (!z2) {
                UpdatesViewModel.A09(updatesViewModel);
            }
        }
    }

    public boolean BvL() {
        AnonymousClass1GQ r0 = this.A0M;
        if (r0 != null) {
            return C20800yB.A01(C21000yV.A02, r0.A00, 5769);
        }
        AnonymousClass00C.A0G("newsletterConfig");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public static final void A03(UpdatesFragment updatesFragment) {
        AnonymousClass01I A0h2 = updatesFragment.A0h();
        if (A0h2 != null && !A0h2.isFinishing() && updatesFragment.A12()) {
            WaTextView waTextView = updatesFragment.A0C;
            if (waTextView == null || waTextView.getVisibility() == 0) {
                WaTextView waTextView2 = updatesFragment.A0C;
                if (waTextView2 != null) {
                    waTextView2.setVisibility(8);
                }
                WaTextView waTextView3 = updatesFragment.A0C;
                if (waTextView3 != null) {
                    waTextView3.startAnimation(AnimationUtils.loadAnimation(updatesFragment.A0a(), R.anim.f1nameremoved));
                }
            }
        }
    }

    public static final void A08(UpdatesFragment updatesFragment, List list) {
        ((C32341dO) updatesFragment.A1f().get()).A04(updatesFragment.A0i(), updatesFragment, "status_fragment", list);
    }

    public void A1J() {
        super.A1J();
        ObservableRecyclerView observableRecyclerView = this.A0E;
        if (observableRecyclerView != null) {
            observableRecyclerView.setAdapter((AnonymousClass0CZ) null);
        }
        this.A0b = null;
        this.A0C = null;
        this.A0x = null;
        List list = this.A0y;
        if (list == null) {
            AnonymousClass00C.A0G("fabsList");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            list.clear();
        }
    }

    public void A1L() {
        A1d().A01.A09("StatusesFragment_onResume");
        Log.i("UpdatesFragment/onResume");
        super.A1L();
        ((C32341dO) A1f().get()).A05.A08(this, new C55892vM(new C34891ho(this), 10));
        A1d().A01.A08("StatusesFragment_onResume");
        A1Z().A0I(new C35751jC(this, 6), 500);
        ((C34901hp) A1g().get()).A03();
    }

    public /* synthetic */ String BDl() {
        return A0a().getString(R.string.f12nameremoved);
    }

    public /* synthetic */ Drawable BDm() {
        Context A0a2 = A0a();
        boolean z = C222013h.A07;
        int i = R.drawable.ic_camera;
        if (z) {
            i = R.drawable.ic_camera_filled_wds;
        }
        return AnonymousClass3UF.A02(A0a2, i, R.color.f6nameremoved);
    }

    public /* synthetic */ String BDn() {
        return null;
    }

    public /* synthetic */ String BH5() {
        return A0a().getString(R.string.f12nameremoved);
    }

    public /* synthetic */ String BIO() {
        return null;
    }

    public void BYN() {
        A05(this);
        C19770wU r2 = this.A0e;
        if (r2 != null) {
            r2.Boy(new C35751jC(this, 7));
            this.A14 = true;
            AnonymousClass005 r0 = this.A0r;
            if (r0 != null) {
                ((AnonymousClass1JL) r0.get()).A02(300, false);
            } else {
                AnonymousClass00C.A0G("splitWindowManagerLazy");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        } else {
            AnonymousClass00C.A0G("waWorkers");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public boolean BYO() {
        return this.A14;
    }

    public void BZJ(C44072La r5, AnonymousClass00S r6) {
        Object obj = A1e().get();
        AnonymousClass00C.A08(obj);
        AnonymousClass01I A0h2 = A0h();
        AnonymousClass00C.A0E(A0h2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        ((AnonymousClass3UC) obj).A0A((C225314u) A0h2, C51582o3.CONSUMER, new C86794Mh(r5, this, r6));
    }

    public void BbI() {
        Context A1D;
        Intent intent;
        C20810yC r1 = A1c().A00;
        C21000yV r2 = C21000yV.A02;
        if (C20800yB.A01(r2, r1, 6796) || C20800yB.A01(r2, A1c().A00, 6798) || C20800yB.A01(r2, A1c().A00, 6513)) {
            A1D = A1D();
            if (A1D != null) {
                intent = new Intent();
                intent.setClassName(A1D.getPackageName(), "com.whatsapp.status.seeall.StatusSeeAllActivity");
                intent.putExtra("status_see_all_activity_filter_mode.", 3);
            } else {
                return;
            }
        } else {
            A1D = A1D();
            if (A1D != null) {
                intent = new Intent();
                intent.setClassName(A1D.getPackageName(), "com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity");
            } else {
                return;
            }
        }
        A1D.startActivity(intent);
    }

    public void Bbb(int i) {
        A1b().A06(i);
        Object obj = A1e().get();
        AnonymousClass00C.A08(obj);
        AnonymousClass01I A0h2 = A0h();
        AnonymousClass00C.A0E(A0h2, "null cannot be cast to non-null type com.whatsapp.DialogActivity");
        ((AnonymousClass3UC) obj).A0B((C225314u) A0h2, true);
    }

    public void Bg1() {
        Bd6();
    }

    public void Bg3() {
        Context A1D = A1D();
        if (A1D != null) {
            Intent intent = new Intent();
            intent.setClassName(A1D.getPackageName(), "com.whatsapp.status.seeall.StatusSeeAllActivity");
            A1D.startActivity(intent);
        }
    }

    public /* synthetic */ boolean isEmpty() {
        return false;
    }
}
