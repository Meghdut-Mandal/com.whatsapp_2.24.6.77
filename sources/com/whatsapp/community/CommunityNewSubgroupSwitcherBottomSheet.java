package com.whatsapp.community;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass11F;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1LV;
import X.AnonymousClass1N6;
import X.AnonymousClass1RY;
import X.AnonymousClass49K;
import X.AnonymousClass4FL;
import X.AnonymousClass4J2;
import X.AnonymousClass4J3;
import X.AnonymousClass4J4;
import X.AnonymousClass4YE;
import X.C000800j;
import X.C001400p;
import X.C010804n;
import X.C02800By;
import X.C16550pQ;
import X.C220412q;
import X.C220712t;
import X.C233117z;
import X.C24361Cd;
import X.C24381Cf;
import X.C24521Ct;
import X.C26421Kc;
import X.C26801Lo;
import X.C27731Pn;
import X.C28431Sq;
import X.C33511fU;
import X.C34361gu;
import X.C34381gw;
import X.C34401gz;
import X.C34421h1;
import X.C34471h6;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36431kI;
import X.C40051uf;
import X.C53102qm;
import X.C53822rw;
import X.C55422ub;
import X.C56992xU;
import X.C66933Xw;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class CommunityNewSubgroupSwitcherBottomSheet extends Hilt_CommunityNewSubgroupSwitcherBottomSheet implements C16550pQ {
    public C56992xU A00;
    public C34361gu A01;
    public C34381gw A02;
    public C26421Kc A03;
    public C24361Cd A04;
    public AnonymousClass1LV A05;
    public C28431Sq A06;
    public C34421h1 A07;
    public AnonymousClass16D A08;
    public AnonymousClass16I A09;
    public AnonymousClass171 A0A;
    public AnonymousClass1RY A0B;
    public C27731Pn A0C;
    public C34471h6 A0D;
    public C220712t A0E;
    public C220412q A0F;
    public C24381Cf A0G;
    public AnonymousClass17X A0H;
    public C233117z A0I;
    public C26801Lo A0J;
    public AnonymousClass1N6 A0K;
    public final AnonymousClass00T A0L = C36431kI.A1I(new AnonymousClass49K(this));
    public final AnonymousClass00T A0M = C001400p.A00(C000800j.NONE, new AnonymousClass4FL(this));
    public final C24521Ct A0N = new AnonymousClass4YE(this, 4);

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
    }

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        C27731Pn r2 = this.A0C;
        if (r2 != null) {
            this.A0B = r2.A05(A0a(), "community-new-subgroup-switcher");
            C24381Cf r1 = this.A0G;
            if (r1 != null) {
                r1.registerObserver(this.A0N);
                TextEmojiLabel A0O = C36351kA.A0O(view, R.id.community_name);
                C33511fU.A03(A0O);
                C66933Xw.A00(C36361kB.A0G(view, R.id.subgroup_switcher_close_button), this, 38);
                RecyclerView recyclerView = (RecyclerView) C36361kB.A0G(view, R.id.subgroup_switcher_recycler_view);
                A0a();
                C36321k7.A0Q(recyclerView);
                recyclerView.setItemAnimator((C02800By) null);
                C34381gw r12 = this.A02;
                if (r12 != null) {
                    C34401gz A002 = r12.A00(A0a());
                    C34361gu r22 = this.A01;
                    if (r22 != null) {
                        AnonymousClass1RY r13 = this.A0B;
                        if (r13 == null) {
                            throw C36331k8.A0d("contactPhotoLoader");
                        }
                        C34421h1 A003 = r22.A00(r13, A002, 5);
                        this.A07 = A003;
                        recyclerView.setAdapter(A003);
                        C34421h1 r8 = this.A07;
                        if (r8 == null) {
                            throw C36331k8.A0d("subgroupAdapter");
                        }
                        AnonymousClass16I r9 = this.A09;
                        if (r9 != null) {
                            C24361Cd r7 = this.A04;
                            if (r7 != null) {
                                C24381Cf r10 = this.A0G;
                                if (r10 != null) {
                                    C26421Kc r6 = this.A03;
                                    if (r6 != null) {
                                        C233117z r11 = this.A0I;
                                        if (r11 != null) {
                                            C34471h6 r5 = new C34471h6(r6, r7, r8, r9, r10, r11);
                                            this.A0D = r5;
                                            r5.A00();
                                            WDSButton wDSButton = (WDSButton) C36361kB.A0G(view, R.id.add_group_button);
                                            wDSButton.setIcon((Drawable) C010804n.A00(A0i().getTheme(), C36341k9.A0G(this), R.drawable.vec_plus_group));
                                            C66933Xw.A00(wDSButton, this, 37);
                                            AnonymousClass00T r52 = this.A0L;
                                            C53822rw.A01(this, ((C40051uf) r52.getValue()).A0n, new AnonymousClass4J4(wDSButton), 1);
                                            ((C40051uf) r52.getValue()).A0E.A08(this, new C55422ub(new AnonymousClass4J2(A0O), 49));
                                            C53822rw.A01(this, ((C40051uf) r52.getValue()).A0s, new AnonymousClass4J3(this), 0);
                                            C53822rw.A01(this, ((C40051uf) r52.getValue()).A0v, C53102qm.A02(this, 8), 2);
                                            return;
                                        }
                                        throw C36331k8.A0d("groupParticipantsObservers");
                                    }
                                    throw C36331k8.A0d("businessProfileObservers");
                                }
                                throw C36331k8.A0d("conversationObservers");
                            }
                            throw C36331k8.A0d("chatStateObservers");
                        }
                        throw C36331k8.A0d("contactObservers");
                    }
                    throw C36331k8.A0d("subgroupAdapterFactory");
                }
                throw C36331k8.A0d("conversationsListInterfaceImplFactory");
            }
            throw C36331k8.A0d("conversationObservers");
        }
        throw C36331k8.A0d("contactPhotos");
    }

    public void A1B() {
        super.A1B();
        AnonymousClass1RY r0 = this.A0B;
        if (r0 == null) {
            throw C36331k8.A0d("contactPhotoLoader");
        }
        r0.A02();
        C24381Cf r1 = this.A0G;
        if (r1 != null) {
            r1.unregisterObserver(this.A0N);
            C34471h6 r02 = this.A0D;
            if (r02 == null) {
                throw C36331k8.A0d("conversationListUpdateObservers");
            }
            r02.A01();
            return;
        }
        throw C36331k8.A0d("conversationObservers");
    }

    public void A1M() {
        super.A1M();
        AnonymousClass1N6 r3 = this.A0K;
        if (r3 != null) {
            AnonymousClass00T r0 = AnonymousClass1N6.A0A;
            r3.A02((AnonymousClass11F) null, 10);
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }
}
