package com.whatsapp.calling.schedulecall.upcomingcalls.view;

import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass17X;
import X.AnonymousClass1ND;
import X.AnonymousClass1RY;
import X.C012005e;
import X.C18800tq;
import X.C18830tt;
import X.C26211Jh;
import X.C27111My;
import X.C27731Pn;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36391kE;
import X.C36441kJ;
import X.C55492ui;
import X.C89314Wb;
import X.C95854mO;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.calling.schedulecall.upcomingcalls.viewmodel.UpcomingActivityViewModel;

public class UpcomingScheduledCallsActivity extends AnonymousClass155 {
    public AnonymousClass1ND A00;
    public C95854mO A01;
    public AnonymousClass16D A02;
    public C27731Pn A03;
    public AnonymousClass17X A04;
    public C26211Jh A05;
    public boolean A06;
    public RecyclerView A07;
    public UpcomingActivityViewModel A08;
    public AnonymousClass1RY A09;
    public boolean A0A;

    public boolean A2f() {
        return true;
    }

    public void A2F() {
        if (!this.A0A) {
            this.A0A = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A01 = C27111My.A18(A0L);
            this.A00 = C36391kE.A0Y(r2);
            this.A02 = C36341k9.A0R(r2);
            this.A03 = C36351kA.A0T(r2);
            this.A04 = C36351kA.A0b(r2);
            this.A05 = (C26211Jh) r2.A7X.get();
        }
    }

    public void A2W() {
        this.A08.A0S();
    }

    public UpcomingScheduledCallsActivity(int i) {
        this.A0A = false;
        C89314Wb.A00(this, 43);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36341k9.A0N(this).A0I(R.string.f12nameremoved);
        this.A09 = this.A03.A05(this, "upcoming-activity-single");
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(this.A00, R.id.upcoming_recyclyerView);
        this.A07 = recyclerView;
        C36321k7.A0Q(recyclerView);
        C95854mO r1 = this.A01;
        r1.A00 = this.A09;
        this.A07.setAdapter(r1);
        UpcomingActivityViewModel upcomingActivityViewModel = (UpcomingActivityViewModel) C36441kJ.A0b(this).A00(UpcomingActivityViewModel.class);
        this.A08 = upcomingActivityViewModel;
        C55492ui.A00(this, upcomingActivityViewModel.A03, 49);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass1RY r0 = this.A09;
        if (r0 != null) {
            r0.A02();
            this.A01.A00 = null;
        }
    }

    public UpcomingScheduledCallsActivity() {
        this(0);
        this.A06 = true;
    }
}
