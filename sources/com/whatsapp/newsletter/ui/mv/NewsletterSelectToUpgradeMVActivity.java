package com.whatsapp.newsletter.ui.mv;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass190;
import X.AnonymousClass4OR;
import X.C02800By;
import X.C18800tq;
import X.C18830tt;
import X.C220412q;
import X.C27111My;
import X.C27121Mz;
import X.C27731Pn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import X.C39841tv;
import X.C40651vt;
import X.C44072La;
import X.C46542Yg;
import X.C52162oz;
import X.C52182p1;
import X.C52282pB;
import X.C52382pL;
import X.C52452pS;
import X.C57762ym;
import X.C57772yn;
import X.C65073Qp;
import X.C89344We;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.List;

public final class NewsletterSelectToUpgradeMVActivity extends AnonymousClass155 implements AnonymousClass4OR {
    public RecyclerView A00;
    public C57762ym A01;
    public AnonymousClass190 A02;
    public C40651vt A03;
    public C39841tv A04;
    public WDSButton A05;
    public boolean A06;

    public void A2F() {
        if (!this.A06) {
            this.A06 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C36321k7.A0c(r3, this);
            C18830tt r1 = r3.A00;
            C36321k7.A0X(r3, r1, this, C36321k7.A05(r3, r1, this));
            this.A01 = (C57762ym) A0L.A3B.get();
            this.A04 = new C39841tv((AnonymousClass16D) r3.A2A.get(), (C220412q) r3.A1l.get());
            this.A02 = C36351kA.A0h(r3);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C57762ym r2 = this.A01;
        if (r2 != null) {
            C27731Pn A0T = C36351kA.A0T(r2.A00.A01);
            C27121Mz r22 = r2.A00;
            this.A03 = new C40651vt((C57772yn) r22.A00.A3C.get(), A0T, C36351kA.A0W(r22.A01), this);
            RecyclerView recyclerView = (RecyclerView) C36361kB.A0D(this, R.id.newsletter_list);
            this.A00 = recyclerView;
            if (recyclerView == null) {
                throw C36331k8.A0d("newsletterRecyclerView");
            }
            C40651vt r1 = this.A03;
            if (r1 == null) {
                throw C36331k8.A0d("newsletterSelectToUpdateMVAdapter");
            }
            recyclerView.setAdapter(r1);
            recyclerView.setItemAnimator((C02800By) null);
            recyclerView.getContext();
            C36351kA.A1F(recyclerView, 1);
            C40651vt r3 = this.A03;
            if (r3 == null) {
                throw C36331k8.A0d("newsletterSelectToUpdateMVAdapter");
            }
            C39841tv r23 = this.A04;
            if (r23 != null) {
                List A012 = C39841tv.A01(r23);
                ArrayList<C44072La> A0I = AnonymousClass001.A0I();
                for (Object next : A012) {
                    C36391kE.A1V(next, A0I, ((C44072La) next).A0P() ? 1 : 0);
                }
                ArrayList A0J = C36321k7.A0J(A0I);
                for (C44072La r11 : A0I) {
                    C44072La A002 = C44072La.A00((C65073Qp) null, (C52382pL) null, r11, (C52452pS) null, (C52162oz) null, (C52282pB) null, (C52182p1) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 536870911, 0, 0, 0, 0, 0, 0, false);
                    AnonymousClass141 A0D = r23.A00.A0D(r11.A06());
                    AnonymousClass141 A042 = A0D.A04();
                    if (A042 != null) {
                        A0D = A042;
                    }
                    A0J.add(new C46542Yg(A002, A0D));
                }
                r3.A00 = C36441kJ.A15(A0J);
                r3.A06();
                this.A05 = (WDSButton) C36361kB.A0H(this, R.id.newsletter_mv_create_button);
                if (this.A02 != null) {
                    Intent A0D2 = C36431kI.A0D();
                    A0D2.setClassName(getPackageName(), "com.whatsapp.newsletter.ui.mv.NewsletterCreateMVActivity");
                    WDSButton wDSButton = this.A05;
                    if (wDSButton == null) {
                        throw C36331k8.A0d("createButton");
                    }
                    C36371kC.A1F(wDSButton, this, A0D2, 14);
                    C36341k9.A12(this);
                    AnonymousClass07B supportActionBar = getSupportActionBar();
                    if (supportActionBar != null) {
                        supportActionBar.A0X(true);
                        supportActionBar.A0U(true);
                        supportActionBar.A0I(R.string.f12nameremoved);
                        return;
                    }
                    return;
                }
                throw C36331k8.A0X();
            }
            throw C36331k8.A0a();
        }
        throw C36331k8.A0d("factory");
    }

    public NewsletterSelectToUpgradeMVActivity(int i) {
        this.A06 = false;
        C89344We.A00(this, 28);
    }

    public NewsletterSelectToUpgradeMVActivity() {
        this(0);
    }
}
