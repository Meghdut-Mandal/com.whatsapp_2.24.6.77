package com.whatsapp.businessdirectory.view.activity;

import X.AnonymousClass07B;
import X.AnonymousClass155;
import X.AnonymousClass5DS;
import X.AnonymousClass67X;
import X.AnonymousClass6V2;
import X.C03570Gk;
import X.C130036Jl;
import X.C163027pX;
import X.C165157sy;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36381kD;
import X.C36431kI;
import X.C36441kJ;
import X.C90464aC;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryFrequentContactedViewModel;
import java.util.Map;

public class BusinessDirectoryFrequentContactedActivity extends AnonymousClass155 {
    public BusinessDirectoryFrequentContactedViewModel A00;
    public AnonymousClass6V2 A01;
    public AnonymousClass67X A02;
    public AnonymousClass5DS A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A03 = C27111My.A2e(A0L);
            this.A02 = C27111My.A0b(A0L);
            this.A01 = C27111My.A0Z(A0L);
        }
    }

    public BusinessDirectoryFrequentContactedActivity(int i) {
        this.A04 = false;
        C163027pX.A00(this, 20);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, (Toolbar) C03570Gk.A0B(this, R.id.toolbar));
        C18740tg.A06(A0Q);
        A0Q.A0I(R.string.f12nameremoved);
        A0Q.A0U(true);
        this.A00 = (BusinessDirectoryFrequentContactedViewModel) C36441kJ.A0b(this).A00(BusinessDirectoryFrequentContactedViewModel.class);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        C36351kA.A1F(recyclerView, 1);
        AnonymousClass5DS r1 = this.A03;
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A00;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        r1.A00 = businessDirectoryFrequentContactedViewModel;
        recyclerView.setAdapter(r1);
        this.A00.A00.A08(this, new C165157sy(this, 9));
        this.A00.A03.A08(this, new C165157sy(this, 8));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        BusinessDirectoryFrequentContactedViewModel businessDirectoryFrequentContactedViewModel = this.A00;
        businessDirectoryFrequentContactedViewModel.A01.A08((Integer) null, C36381kD.A0m(), (Map) null, 12, 83, 1);
        businessDirectoryFrequentContactedViewModel.A03.A0C(new C130036Jl());
        return true;
    }

    public BusinessDirectoryFrequentContactedActivity() {
        this(0);
    }
}
