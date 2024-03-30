package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01L;
import X.AnonymousClass04H;
import X.AnonymousClass04S;
import X.AnonymousClass0BT;
import X.AnonymousClass11F;
import X.AnonymousClass16I;
import X.AnonymousClass17Y;
import X.AnonymousClass1JL;
import X.AnonymousClass1LV;
import X.AnonymousClass1N6;
import X.AnonymousClass1RK;
import X.AnonymousClass1RY;
import X.C012005e;
import X.C02740Bs;
import X.C02800By;
import X.C18740tg;
import X.C18820ts;
import X.C19420v0;
import X.C19970wo;
import X.C20800yB;
import X.C20810yC;
import X.C21000yV;
import X.C220712t;
import X.C226015b;
import X.C226715i;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24801Dv;
import X.C26421Kc;
import X.C27731Pn;
import X.C28431Sq;
import X.C31921ce;
import X.C34361gu;
import X.C34371gv;
import X.C34381gw;
import X.C34401gz;
import X.C34421h1;
import X.C34471h6;
import X.C34831hi;
import X.C35671j4;
import X.C35991ja;
import X.C36201jv;
import X.C40021ub;
import X.C55892vM;
import X.C608239m;
import X.C68033bE;
import X.C85864Is;
import X.C85874It;
import X.C89104Vg;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

public final class CommunityFragment extends Hilt_CommunityFragment implements C31921ce, AnonymousClass1RK {
    public C24801Dv A00;
    public C34361gu A01;
    public C34381gw A02;
    public C34371gv A03;
    public AnonymousClass17Y A04;
    public C26421Kc A05;
    public C24361Cd A06;
    public AnonymousClass1LV A07;
    public C28431Sq A08;
    public C34421h1 A09;
    public AnonymousClass16I A0A;
    public C27731Pn A0B;
    public C19970wo A0C;
    public C19420v0 A0D;
    public C18820ts A0E;
    public C220712t A0F;
    public C24381Cf A0G;
    public C20810yC A0H;
    public C233117z A0I;
    public AnonymousClass1JL A0J;
    public AnonymousClass1N6 A0K;
    public C02740Bs A0L;
    public C40021ub A0M;
    public C34471h6 A0N;
    public boolean A0O;
    public boolean A0P;
    public final AnonymousClass04S A0Q = new C36201jv(this, 6);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Resources.Theme theme;
        AnonymousClass00C.A0D(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        View A022 = C012005e.A02(inflate, R.id.community_recycler_view);
        RecyclerView recyclerView = (RecyclerView) A022;
        recyclerView.A0U = true;
        inflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        Resources.Theme theme2 = null;
        recyclerView.setItemAnimator((C02800By) null);
        AnonymousClass00C.A08(A022);
        C20810yC r2 = this.A0H;
        if (r2 != null) {
            boolean z = !C20800yB.A01(C21000yV.A01, r2, 3289);
            int dimensionPixelSize = A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            if (z) {
                dimensionPixelSize += A0a().getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
            }
            Bundle bundle2 = this.A0A;
            if (bundle2 != null) {
                dimensionPixelSize = bundle2.getInt("top_padding", dimensionPixelSize);
            }
            recyclerView.setPadding(recyclerView.getPaddingLeft(), dimensionPixelSize, recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
            C27731Pn r22 = this.A0B;
            if (r22 != null) {
                AnonymousClass1RY A032 = r22.A03(A0i(), this, "community-tab");
                C34381gw r1 = this.A02;
                if (r1 != null) {
                    C34401gz A002 = r1.A00(A0i());
                    C34361gu r12 = this.A01;
                    if (r12 != null) {
                        C34421h1 A003 = r12.A00(A032, A002, 4);
                        this.A09 = A003;
                        recyclerView.setAdapter(A003);
                        Resources resources = A0a().getResources();
                        Context A1D = A1D();
                        if (A1D != null) {
                            theme = A1D.getTheme();
                        } else {
                            theme = null;
                        }
                        Drawable A004 = AnonymousClass0BT.A00(theme, resources, R.drawable.community_divider_shadow);
                        if (A004 != null) {
                            recyclerView.A0t(new C35991ja(A004, 0));
                        }
                        Resources resources2 = A0a().getResources();
                        Context A1D2 = A1D();
                        if (A1D2 != null) {
                            theme2 = A1D2.getTheme();
                        }
                        Drawable A005 = AnonymousClass0BT.A00(theme2, resources2, R.drawable.subgroup_divider);
                        if (A005 != null) {
                            recyclerView.A0t(new C35991ja(A005, 1));
                        }
                        C34421h1 r7 = this.A09;
                        if (r7 == null) {
                            AnonymousClass00C.A0G("adapter");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                        AnonymousClass16I r8 = this.A0A;
                        if (r8 != null) {
                            C24361Cd r6 = this.A06;
                            if (r6 != null) {
                                C24381Cf r9 = this.A0G;
                                if (r9 != null) {
                                    C26421Kc r5 = this.A05;
                                    if (r5 != null) {
                                        C233117z r10 = this.A0I;
                                        if (r10 != null) {
                                            C34471h6 r4 = new C34471h6(r5, r6, r7, r8, r9, r10);
                                            this.A0N = r4;
                                            r4.A00();
                                            return inflate;
                                        }
                                        AnonymousClass00C.A0G("groupParticipantsObservers");
                                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                    }
                                    AnonymousClass00C.A0G("businessProfileObservers");
                                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                                }
                                AnonymousClass00C.A0G("conversationObservers");
                                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                            }
                            AnonymousClass00C.A0G("chatStateObservers");
                            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                        }
                        AnonymousClass00C.A0G("contactObservers");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    }
                    AnonymousClass00C.A0G("subgroupAdapterFactory");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                AnonymousClass00C.A0G("conversationsListInterfaceImplFactory");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            AnonymousClass00C.A0G("contactPhotos");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        AnonymousClass00C.A0G("abProps");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public void A1K() {
        A03(false);
        super.A1K();
    }

    public /* synthetic */ void B0Y(C226715i r2) {
        AnonymousClass00C.A0D(r2, 1);
        r2.BQx();
    }

    public /* synthetic */ void B1H(C226015b r1) {
    }

    public String BDl() {
        return null;
    }

    public Drawable BDm() {
        return null;
    }

    public String BDn() {
        return null;
    }

    public String BH5() {
        return null;
    }

    public Drawable BH6() {
        return null;
    }

    public int BIA() {
        return 600;
    }

    public String BIO() {
        return null;
    }

    public void Bg1() {
    }

    public /* synthetic */ void Bs8(boolean z) {
    }

    public void onConfigurationChanged(Configuration configuration) {
        AnonymousClass00C.A0D(configuration, 0);
        C34421h1 r0 = this.A09;
        if (r0 == null) {
            AnonymousClass00C.A0G("adapter");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        if (r0.A0J() == 1) {
            C34421h1 r02 = this.A09;
            if (r02 == null) {
                AnonymousClass00C.A0G("adapter");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r02.A07(0);
        }
        super.onConfigurationChanged(configuration);
    }

    private final void A00() {
        if (this.A0M == null) {
            C34371gv r1 = this.A03;
            if (r1 != null) {
                C40021ub r5 = (C40021ub) new AnonymousClass04H(new C68033bE(r1), this).A00(C40021ub.class);
                r5.A00.A08(A0m(), this.A0Q);
                r5.A0N.A08(A0m(), new C55892vM(new C85864Is(this), 2));
                r5.A0O.A08(A0m(), new C55892vM(new C85874It(this), 3));
                AnonymousClass01L r4 = (AnonymousClass01L) C24801Dv.A01(A1D(), AnonymousClass01L.class);
                C18820ts r3 = this.A0E;
                if (r3 != null) {
                    C24801Dv r2 = this.A00;
                    if (r2 != null) {
                        new C608239m(r4, r2, r3, r5.A04.A04);
                        this.A0M = r5;
                        return;
                    }
                    AnonymousClass00C.A0G("activityUtils");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                AnonymousClass00C.A0G("whatsAppLocale");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            AnonymousClass00C.A0G("communityTabViewModelFactory");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    private final void A03(boolean z) {
        C34831hi r1;
        C34831hi r12;
        boolean z2 = this.A0P;
        this.A0P = z;
        if (z2 != z) {
            if (this.A0M == null) {
                A00();
            }
            if (z) {
                C19420v0 r4 = this.A0D;
                if (r4 != null) {
                    C19420v0.A00(r4).putLong("previous_last_seen_community_activity", ((SharedPreferences) r4.A00.get()).getLong("last_seen_community_activity", 0)).apply();
                    C40021ub r0 = this.A0M;
                    if (!(r0 == null || (r12 = r0.A0L) == null)) {
                        r12.A0B(this.A0Q);
                    }
                } else {
                    AnonymousClass00C.A0G("waSharedPreferences");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                C40021ub r02 = this.A0M;
                if (!(r02 == null || (r1 = r02.A0L) == null)) {
                    r1.A08(this, this.A0Q);
                }
            }
            C19420v0 r42 = this.A0D;
            if (r42 != null) {
                C19970wo r03 = this.A0C;
                if (r03 != null) {
                    C19420v0.A00(r42).putLong("last_seen_community_activity", C19970wo.A00(r03) / 1000).apply();
                    C34421h1 r3 = this.A09;
                    if (r3 == null) {
                        AnonymousClass00C.A0G("adapter");
                        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                    } else {
                        r3.A01.A0H(new C35671j4(r3, 21));
                    }
                } else {
                    AnonymousClass00C.A0G("time");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
            } else {
                AnonymousClass00C.A0G("waSharedPreferences");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
        }
    }

    public void A1J() {
        if (this.A07 != null) {
            C34471h6 r0 = this.A0N;
            if (r0 == null) {
                AnonymousClass00C.A0G("conversationListUpdateObservers");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r0.A01();
            C02740Bs r1 = this.A0L;
            if (r1 != null) {
                C34421h1 r02 = this.A09;
                if (r02 == null) {
                    AnonymousClass00C.A0G("adapter");
                    throw new RuntimeException("Redex: Unreachable code after no-return invoke");
                }
                r02.A01.unregisterObserver(r1);
            }
            super.A1J();
            return;
        }
        AnonymousClass00C.A0G("communityChatManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public final AnonymousClass1JL A1Z() {
        AnonymousClass1JL r0 = this.A0J;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00C.A0G("splitWindowManager");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }

    public boolean isEmpty() {
        C18740tg.A0D(this.A0O, "isEmpty should be called after onFragmentAsyncInit for accuracy");
        C34421h1 r0 = this.A09;
        if (r0 == null) {
            AnonymousClass00C.A0G("adapter");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
        if (r0.A0J() > 0) {
            C34421h1 r02 = this.A09;
            if (r02 == null) {
                AnonymousClass00C.A0G("adapter");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            } else if (r02.getItemViewType(0) == 9) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ boolean B0r() {
        return false;
    }

    public boolean B7g() {
        return true;
    }

    public void BYN() {
        A00();
        this.A0O = true;
        if (A1Z().A0C()) {
            C89104Vg r1 = new C89104Vg(this, 1);
            this.A0L = r1;
            C34421h1 r0 = this.A09;
            if (r0 == null) {
                AnonymousClass00C.A0G("adapter");
                throw new RuntimeException("Redex: Unreachable code after no-return invoke");
            }
            r0.BnA(r1);
        }
        if (!isEmpty()) {
            A1Z().A02(600, false);
        }
    }

    public boolean BYO() {
        return this.A0O;
    }

    public void Bs9(boolean z) {
        A03(z);
        if (z) {
            AnonymousClass1N6 r3 = this.A0K;
            if (r3 != null) {
                AnonymousClass00T r0 = AnonymousClass1N6.A0A;
                r3.A02((AnonymousClass11F) null, 3);
                return;
            }
            AnonymousClass00C.A0G("navigationTimeSpentManager");
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        }
    }

    public /* synthetic */ boolean BvL() {
        return false;
    }

    public /* synthetic */ void BaQ(int i, int i2) {
    }
}
