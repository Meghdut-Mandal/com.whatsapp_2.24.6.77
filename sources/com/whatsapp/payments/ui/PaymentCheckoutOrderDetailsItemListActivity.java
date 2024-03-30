package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass6VE;
import X.AnonymousClass9R1;
import X.AnonymousClass9Y1;
import X.AnonymousClass9ZJ;
import X.B7Z;
import X.BAD;
import X.C012005e;
import X.C165567td;
import X.C165607th;
import X.C165617ti;
import X.C167487y7;
import X.C168037zb;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C191489Dd;
import X.C195119So;
import X.C195399Ud;
import X.C196089Xp;
import X.C206509tW;
import X.C206579td;
import X.C206669tm;
import X.C206819u1;
import X.C206959uJ;
import X.C207199ui;
import X.C207909xJ;
import X.C22909AyL;
import X.C27111My;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36401kF;
import X.C36431kI;
import X.C41171wm;
import X.C61223Ba;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaymentCheckoutOrderDetailsItemListActivity extends AnonymousClass155 {
    public C191489Dd A00;
    public C22909AyL A01;
    public AnonymousClass6VE A02;
    public AnonymousClass9ZJ A03;
    public AnonymousClass9Y1 A04;
    public C195399Ud A05;
    public C195119So A06;
    public C18820ts A07;
    public C61223Ba A08;
    public AnonymousClass9R1 A09;
    public RecyclerView A0A;
    public C167487y7 A0B;
    public boolean A0C;

    public void A2F() {
        if (!this.A0C) {
            this.A0C = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r3 = A0L.A5g;
            C165567td.A11(r3, this);
            C18830tt r2 = r3.A00;
            C165567td.A0v(r3, r2, this, C36321k7.A05(r3, r2, this));
            this.A02 = (AnonymousClass6VE) r3.A1Q.get();
            this.A08 = C165607th.A0V(r2);
            this.A07 = C36341k9.A0T(r3);
            this.A06 = (C195119So) r2.A0y.get();
            this.A05 = (C195399Ud) r3.A6o.get();
            this.A04 = C165607th.A0P(r3);
            this.A09 = (AnonymousClass9R1) r2.A0z.get();
            this.A03 = new AnonymousClass9ZJ();
            this.A00 = (C191489Dd) A0L.A24.get();
            this.A01 = (C22909AyL) A0L.A1Z.get();
        }
    }

    public PaymentCheckoutOrderDetailsItemListActivity(int i) {
        this.A0C = false;
        B7Z.A00(this, 49);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("message_title");
        C207199ui r5 = (C207199ui) getIntent().getParcelableExtra("message_content");
        UserJid A0l = C36431kI.A0l(getIntent().getStringExtra("business_owner_jid"));
        C18740tg.A06(r5);
        List<C206959uJ> list = r5.A09.A09;
        C18740tg.A0B(C36401kF.A1a(list));
        C18740tg.A06(A0l);
        ArrayList A0I = AnonymousClass001.A0I();
        for (C206959uJ A002 : list) {
            String A003 = A002.A00();
            if (!TextUtils.isEmpty(A003)) {
                A0I.add(new C206509tW(A003));
            }
        }
        C206579td r4 = new C206579td((String) null, A0I);
        String A004 = ((C206959uJ) list.get(0)).A00();
        if (A004 == null) {
            A004 = "";
        }
        C206819u1 r10 = new C206819u1(A0l, new C206669tm(r5.A0N, A004, false), Collections.singletonList(r4));
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0U(true);
            supportActionBar.A0Q(stringExtra);
        }
        this.A0A = (RecyclerView) C012005e.A02(this.A00, R.id.item_list);
        C168037zb r3 = new C168037zb(new C196089Xp(this.A06, this.A09), this.A07, r5);
        this.A0A.A0t(new C41171wm());
        this.A0A.setAdapter(r3);
        C167487y7 r0 = (C167487y7) C165617ti.A0A(new C207909xJ(this.A00, this.A01.B3r(A0l), A0l, this.A08, r10), this).A00(C167487y7.class);
        this.A0B = r0;
        r0.A00.A08(this, new BAD(r3, this, 5));
    }

    public void onResume() {
        super.onResume();
        this.A0B.A0S();
    }

    public PaymentCheckoutOrderDetailsItemListActivity() {
        this(0);
    }
}
