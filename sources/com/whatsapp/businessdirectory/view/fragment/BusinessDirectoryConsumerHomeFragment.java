package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass01N;
import X.AnonymousClass0UE;
import X.AnonymousClass1N2;
import X.AnonymousClass1QW;
import X.AnonymousClass5DV;
import X.AnonymousClass60Q;
import X.AnonymousClass60R;
import X.AnonymousClass66G;
import X.AnonymousClass67X;
import X.AnonymousClass6QG;
import X.AnonymousClass6V2;
import X.C001700s;
import X.C02380Ab;
import X.C121385t3;
import X.C142616pA;
import X.C142646pD;
import X.C143466qb;
import X.C143576qm;
import X.C1497172m;
import X.C160407kx;
import X.C160617lI;
import X.C162517oi;
import X.C165157sy;
import X.C24801Dv;
import X.C28201Rs;
import X.C33751fs;
import X.C33771fu;
import X.C36321k7;
import X.C36441kJ;
import X.C90504aG;
import X.C95434kv;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryConsumerHomeViewModel;
import java.util.Map;
import java.util.Objects;

public class BusinessDirectoryConsumerHomeFragment extends Hilt_BusinessDirectoryConsumerHomeFragment implements C160617lI, C160407kx {
    public C24801Dv A00;
    public AnonymousClass60Q A01;
    public AnonymousClass60R A02;
    public C33771fu A03;
    public C142646pD A04;
    public AnonymousClass66G A05;
    public AnonymousClass6V2 A06;
    public AnonymousClass67X A07;
    public LocationUpdateListener A08;
    public AnonymousClass5DV A09;
    public C143576qm A0A;
    public BusinessDirectoryConsumerHomeViewModel A0B;
    public C33751fs A0C;
    public AnonymousClass1QW A0D;
    public AnonymousClass1N2 A0E;
    public boolean A0F = true;
    public DirectoryGPSLocationManager A0G;
    public final AnonymousClass0UE A0H = new C162517oi(this, 6);

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        this.A0A.A00();
    }

    public void A1N(int i, int i2, Intent intent) {
        C142616pA r1;
        int i3;
        if (i == 34) {
            C143576qm r12 = this.A0A;
            if (i2 == -1) {
                r12.A07.BaD();
                r1 = r12.A02;
                i3 = 5;
            } else {
                r1 = r12.A02;
                i3 = 6;
            }
            r1.A02(i3, 0);
        }
        super.A1N(i, i2, intent);
    }

    public void B7F() {
        this.A0B.A0A.A00.A0F();
    }

    public void BWz() {
        this.A0B.A0A.A04();
    }

    public void BaD() {
        C143466qb r2 = this.A0B.A0A;
        r2.A05.A02(true);
        r2.A00.A0F();
    }

    public void BaH() {
        this.A0B.A0A.A05();
    }

    public void BaI() {
        this.A0B.BaJ();
    }

    public void BaK(C121385t3 r2) {
        this.A0B.A0A.A07(r2);
    }

    public void Bcg(AnonymousClass6QG r3) {
        this.A0B.BTX(0);
    }

    public void BfT() {
        this.A0B.A0A.A00.A0F();
    }

    public void Bwx() {
        C95434kv r2 = this.A0B.A0A.A00;
        C1497172m.A00(r2.A08, r2, 26);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectoryConsumerHomeFragment businessDirectoryConsumerHomeFragment) {
        if (businessDirectoryConsumerHomeFragment.A0i() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectoryConsumerHomeFragment.A0i();
        }
        throw AnonymousClass001.A09("BusinessDirectorySearchQueryFragment should be attached to BusinessDirectoryActivity");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C001700s r3;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        RecyclerView A0J = C90504aG.A0J(inflate, R.id.search_list);
        A1D();
        C36321k7.A0Q(A0J);
        A0J.setAdapter(this.A09);
        A0J.A0v(this.A0H);
        boolean A032 = this.A0D.A03();
        AnonymousClass01N r1 = this.A0P;
        if (A032) {
            r1.A04(this.A0G);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A0G;
            directoryGPSLocationManager.A02 = 0;
            r3 = directoryGPSLocationManager.A04;
        } else {
            r1.A04(this.A08);
            r3 = this.A08.A00;
        }
        C02380Ab A0m = A0m();
        C143576qm r12 = this.A0A;
        Objects.requireNonNull(r12);
        C165157sy.A00(A0m, r3, r12, 22);
        C165157sy.A00(A0m(), this.A0B.A04, this, 21);
        C165157sy.A00(A0m(), this.A0B.A0E, this, 20);
        C28201Rs r32 = this.A0B.A0C;
        C02380Ab A0m2 = A0m();
        C143576qm r13 = this.A0A;
        Objects.requireNonNull(r13);
        C165157sy.A00(A0m2, r32, r13, 23);
        C165157sy.A00(A0m(), this.A0B.A0D, this, 19);
        return inflate;
    }

    public void A1H() {
        super.A1H();
        this.A05.A01(this.A0A);
    }

    public void A1L() {
        AnonymousClass6QG r1;
        super.A1L();
        BusinessDirectoryConsumerHomeViewModel businessDirectoryConsumerHomeViewModel = this.A0B;
        if (this.A0F) {
            businessDirectoryConsumerHomeViewModel.A06.A08(businessDirectoryConsumerHomeViewModel.A08.A03(), (Integer) null, (Map) null, 0, 0, 0);
        }
        C143466qb r2 = businessDirectoryConsumerHomeViewModel.A0A;
        if (r2.A09() && (r1 = r2.A00.A01) != null && !r1.equals(BusinessDirectoryConsumerHomeViewModel.A01(businessDirectoryConsumerHomeViewModel))) {
            C95434kv r22 = r2.A00;
            C1497172m.A00(r22.A08, r22, 26);
        }
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0G = this.A01.A00(this.A04);
        this.A0B = (BusinessDirectoryConsumerHomeViewModel) C36441kJ.A0b(this).A00(BusinessDirectoryConsumerHomeViewModel.class);
        C143576qm A002 = this.A02.A00(this, this.A0G, this.A08, this);
        this.A0A = A002;
        this.A05.A00(A002);
    }
}
