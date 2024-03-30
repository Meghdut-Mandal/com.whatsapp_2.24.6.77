package com.whatsapp.newsletter.ui.reactions;

import X.A4R;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass09Y;
import X.AnonymousClass0A2;
import X.AnonymousClass171;
import X.AnonymousClass1GQ;
import X.AnonymousClass1SV;
import X.AnonymousClass28g;
import X.AnonymousClass3AO;
import X.AnonymousClass3ET;
import X.AnonymousClass3NG;
import X.AnonymousClass3T1;
import X.AnonymousClass7TB;
import X.AnonymousClass7TC;
import X.AnonymousClass80S;
import X.AnonymousClass9X9;
import X.BA8;
import X.C007103b;
import X.C023109s;
import X.C023409w;
import X.C023509x;
import X.C07710Yz;
import X.C123915xI;
import X.C167707yf;
import X.C18800tq;
import X.C18820ts;
import X.C191619Dr;
import X.C191629Ds;
import X.C195639Vj;
import X.C19970wo;
import X.C22428AmT;
import X.C22429AmU;
import X.C23178B8m;
import X.C24801Dv;
import X.C27731Pn;
import X.C32591ds;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36411kG;
import X.C36431kI;
import X.C50772lY;
import X.C64933Qa;
import X.C65753Ti;
import X.C68973cl;
import X.C88944Uq;
import X.C90464aC;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.whatsapp.R;
import com.whatsapp.WaViewPager;
import com.whatsapp.newsletter.ui.reactions.viewmodel.GetReactionSendersUseCase$invoke$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class NewsletterReactionsSheet extends Hilt_NewsletterReactionsSheet {
    public MaterialButton A00;
    public MaterialButton A01;
    public MaterialButtonToggleGroup A02;
    public C24801Dv A03;
    public C191619Dr A04;
    public WaViewPager A05;
    public AnonymousClass171 A06;
    public C27731Pn A07;
    public C18820ts A08;
    public AnonymousClass1GQ A09;
    public AnonymousClass3ET A0A;
    public C167707yf A0B;
    public List A0C = C023409w.A00;

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass00C.A0D(layoutInflater, 0);
        if (!this.A0C.isEmpty()) {
            return C36411kG.A0J(layoutInflater, viewGroup, R.layout.f9nameremoved);
        }
        AnonymousClass09Y r0 = new AnonymousClass09Y(A0l());
        r0.A08(this);
        r0.A01();
        A0l().A0V();
        return null;
    }

    public void A1S(Bundle bundle, View view) {
        C68973cl r3;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        view2.getLayoutParams().height = C36341k9.A0G(this).getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A02 = (MaterialButtonToggleGroup) view2.findViewById(R.id.reactions_tab_buttons);
        this.A00 = (MaterialButton) view2.findViewById(R.id.reactions_button_all);
        this.A01 = (MaterialButton) view2.findViewById(R.id.reactions_button_contacts);
        this.A05 = (WaViewPager) view2.findViewById(R.id.reactions_content);
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A02;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A06.add(new A4R(this));
        }
        C191619Dr r1 = this.A04;
        if (r1 != null) {
            List list = this.A0C;
            boolean z4 = true;
            if (list.size() <= 1) {
                z4 = false;
            }
            C32591ds r12 = r1.A00;
            C18800tq r13 = r12.A02;
            C19970wo A0V = C36351kA.A0V(r13);
            AnonymousClass1GQ r10 = (AnonymousClass1GQ) r13.A5a.get();
            this.A0B = new C167707yf((C191629Ds) r12.A01.A0t.get(), C36361kB.A0T(r13), A0V, C36351kA.A0a(r13), r10, (AnonymousClass1SV) r13.A5I.get(), list, z4);
            WaViewPager waViewPager = this.A05;
            if (waViewPager != null) {
                waViewPager.A0K(new AnonymousClass80S(waViewPager, this));
            }
            C167707yf r7 = this.A0B;
            if (r7 == null) {
                throw C36331k8.A0a();
            }
            BA8.A01(A0m(), r7.A04, new C22428AmT(this), 31);
            BA8.A01(A0m(), r7.A01, new AnonymousClass7TB(this), 29);
            BA8.A01(A0m(), r7.A03, new AnonymousClass7TC(this), 30);
            ArrayList A0I = AnonymousClass001.A0I();
            LinkedHashMap A1G = C36431kI.A1G();
            LinkedHashMap A1G2 = C36431kI.A1G();
            List list2 = r7.A0A;
            Iterator it = list2.iterator();
            long j = 0;
            String str = null;
            String str2 = null;
            loop0:
            while (true) {
                if (it.hasNext()) {
                    AnonymousClass3T1 A0l = C36391kE.A0l(it);
                    C88944Uq r32 = A0l.A0J;
                    if ((r32 instanceof C68973cl) && (r3 = (C68973cl) r32) != null) {
                        Iterator B8O = r3.B8O();
                        while (B8O.hasNext()) {
                            AnonymousClass28g r9 = (AnonymousClass28g) B8O.next();
                            String str3 = r9.A02;
                            String A032 = C65753Ti.A03(str3);
                            if (A032 == null) {
                                break loop0;
                            }
                            String A022 = C65753Ti.A02(A032);
                            if (r7.A0C) {
                                z = false;
                                StringBuilder A0v = AnonymousClass000.A0v(A022);
                                C64933Qa r102 = A0l.A1J;
                                String A0o = AnonymousClass000.A0o(r102, A0v);
                                if (r9.A01) {
                                    String A0y = C36381kD.A0y(r102);
                                    boolean z5 = r9.A01;
                                    StringBuilder A0v2 = AnonymousClass000.A0v(A0y);
                                    A0v2.append('_');
                                    A0v2.append(z5);
                                    LinkedHashMap linkedHashMap = A1G;
                                    linkedHashMap.put(A0o, new AnonymousClass9X9(A0l, C90464aC.A0f(A022, A0v2, '_'), str3, (List) null, 1, true));
                                }
                            } else {
                                z = r9.A01;
                                if (z) {
                                    str2 = str3;
                                    str = A022;
                                }
                            }
                            AnonymousClass9X9 r2 = (AnonymousClass9X9) A1G2.get(A022);
                            if (r2 != null) {
                                i = r2.A00;
                            } else {
                                i = 0;
                            }
                            int i2 = (int) r9.A00;
                            AnonymousClass9X9 r22 = (AnonymousClass9X9) A1G2.get(A022);
                            if (r22 != null) {
                                z2 = r22.A05;
                            } else {
                                z2 = false;
                            }
                            j += (long) i2;
                            boolean z6 = r9.A01;
                            StringBuilder A0v3 = AnonymousClass000.A0v("aggregate");
                            A0v3.append('_');
                            A0v3.append(z6);
                            String A0f = C90464aC.A0f(str3, A0v3, '_');
                            int i3 = i + i2;
                            if (!z2) {
                                z3 = false;
                                if (!z) {
                                    A1G2.put(A022, new AnonymousClass9X9(A0l, A0f, A022, (List) null, i3, z3));
                                }
                            }
                            z3 = true;
                            A1G2.put(A022, new AnonymousClass9X9(A0l, A0f, A022, (List) null, i3, z3));
                        }
                        continue;
                    }
                } else {
                    if (str2 != null && !AnonymousClass00C.A0J(str, str2)) {
                        AnonymousClass9X9 r23 = (AnonymousClass9X9) A1G2.get(str);
                        if (r23 != null) {
                            String str4 = r23.A02;
                            int i4 = r23.A00;
                            boolean z7 = r23.A05;
                            A1G2.put(str2, new AnonymousClass9X9(r23.A01, str4, str2, r23.A04, i4, z7));
                        }
                        C07710Yz.A02(A1G2).remove(str);
                    }
                    A0I.addAll(A1G.values());
                    Collection values = A1G2.values();
                    ArrayList A0I2 = AnonymousClass001.A0I();
                    for (Object next : values) {
                        if (((AnonymousClass9X9) next).A05) {
                            A0I2.add(next);
                        }
                    }
                    A0I.addAll(C007103b.A0c(A0I2, new C23178B8m(2)));
                    Collection values2 = A1G2.values();
                    ArrayList A0I3 = AnonymousClass001.A0I();
                    for (Object next2 : values2) {
                        if (!((AnonymousClass9X9) next2).A05) {
                            A0I3.add(next2);
                        }
                    }
                    A0I.addAll(C007103b.A0c(A0I3, new C23178B8m(3)));
                    r7.A00.A0D(new C195639Vj(A0I, j));
                }
            }
            C123915xI r6 = r7.A08;
            C22429AmU amU = new C22429AmU(r7);
            AnonymousClass040 r4 = r6.A05;
            AnonymousClass0A2.A02(C023109s.A00, r6.A04, new GetReactionSendersUseCase$invoke$1(r6, list2, (C023509x) null, amU), r4);
            return;
        }
        throw C36331k8.A0d("viewModelFactory");
    }

    public void A1k(AnonymousClass3NG r3) {
        AnonymousClass00C.A0D(r3, 0);
        C50772lY r0 = C50772lY.A00;
        AnonymousClass3AO r1 = r3.A00;
        r1.A04 = r0;
        r1.A06 = true;
    }

    public void A1H() {
        super.A1H();
    }

    public void A1J() {
        super.A1J();
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
    }
}
