package com.whatsapp.businessdirectory.view.fragment;

import X.AnonymousClass001;
import X.AnonymousClass01I;
import X.AnonymousClass01N;
import X.AnonymousClass023;
import X.AnonymousClass02E;
import X.AnonymousClass04H;
import X.AnonymousClass04V;
import X.AnonymousClass08M;
import X.AnonymousClass0CZ;
import X.AnonymousClass1QW;
import X.AnonymousClass5DR;
import X.AnonymousClass5DV;
import X.AnonymousClass60Q;
import X.AnonymousClass60R;
import X.AnonymousClass66G;
import X.AnonymousClass6QG;
import X.AnonymousClass6QK;
import X.C001700s;
import X.C009504a;
import X.C009904e;
import X.C012005e;
import X.C02380Ab;
import X.C115855jY;
import X.C121385t3;
import X.C134986bw;
import X.C142646pD;
import X.C143466qb;
import X.C143576qm;
import X.C1497172m;
import X.C160407kx;
import X.C160617lI;
import X.C162437oa;
import X.C162877pI;
import X.C165157sy;
import X.C165397tM;
import X.C18820ts;
import X.C20830yE;
import X.C28201Rs;
import X.C33751fs;
import X.C33771fu;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C88434Sr;
import X.C90504aG;
import X.C95334kb;
import X.C95394km;
import X.C95434kv;
import X.C96464nN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import com.whatsapp.businessdirectory.util.DirectoryGPSLocationManager;
import com.whatsapp.businessdirectory.util.LocationUpdateListener;
import com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import com.whatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import com.whatsapp.jid.Jid;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class BusinessDirectorySearchFragment extends Hilt_BusinessDirectorySearchFragment implements C160617lI, C160407kx, C88434Sr {
    public Chip A00;
    public AnonymousClass60Q A01;
    public AnonymousClass60R A02;
    public C115855jY A03;
    public C33771fu A04;
    public C142646pD A05;
    public AnonymousClass5DR A06;
    public AnonymousClass66G A07;
    public LocationUpdateListener A08;
    public AnonymousClass5DV A09;
    public C143576qm A0A;
    public C95394km A0B;
    public C33751fs A0C;
    public C20830yE A0D;
    public C18820ts A0E;
    public AnonymousClass1QW A0F;
    public C96464nN A0G;
    public RecyclerView A0H;
    public DirectoryGPSLocationManager A0I;
    public final AnonymousClass023 A0J = new C162437oa(this, 1);
    public final C009904e A0K = BnD(new C165397tM(this, 1), new C009504a());

    public static BusinessDirectorySearchFragment A03() {
        BusinessDirectorySearchFragment businessDirectorySearchFragment = new BusinessDirectorySearchFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putBoolean("FORCE_ROOT_CATEGORIES", true);
        businessDirectorySearchFragment.A17(A072);
        return businessDirectorySearchFragment;
    }

    public void A1A(Bundle bundle) {
        this.A0Y = true;
        AnonymousClass02E A0N = A0k().A0N("filter-bottom-sheet");
        if (A0N != null) {
            ((FilterBottomSheetDialogFragment) A0N).A02 = this;
        }
        this.A0A.A00();
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0I = this.A01.A00(this.A05);
        boolean z = A00(this).A0C;
        boolean z2 = A0b().getBoolean("FORCE_ROOT_CATEGORIES");
        String string = A0b().getString("argument_business_list_search_state");
        this.A0B = (C95394km) new AnonymousClass04H(new C95334kb(bundle, this, this.A03, (C134986bw) A0b().getParcelable("INITIAL_CATEGORY"), (Jid) A0b().getParcelable("directory_biz_chaining_jid"), string, z2, z), this).A00(C95394km.class);
        C143576qm A002 = this.A02.A00(this, this.A0I, this.A08, this);
        this.A0A = A002;
        this.A07.A00(A002);
    }

    public void A1R(Bundle bundle) {
        C95394km r3 = this.A0B;
        AnonymousClass08M r2 = r3.A0C;
        r2.A03("saved_search_state_stack", C36441kJ.A15(r3.A05));
        r2.A03("saved_second_level_category", r3.A0T.A04());
        r2.A03("saved_parent_category", r3.A0S.A04());
        r2.A03("saved_search_state", Integer.valueOf(r3.A02));
        r2.A03("saved_force_root_category", Boolean.valueOf(r3.A06));
        r2.A03("saved_consumer_home_type", Integer.valueOf(r3.A01));
        r3.A0K.A0A(r2);
    }

    public void B7F() {
        this.A0B.A0N.A00.A0F();
    }

    public void BSI() {
        this.A0B.A0V(62);
    }

    public void BWz() {
        this.A0B.A0N.A04();
    }

    public void BaD() {
        C143466qb r2 = this.A0B.A0N;
        r2.A05.A02(true);
        r2.A00.A0F();
    }

    public void BaH() {
        this.A0B.A0N.A05();
    }

    public void BaI() {
        this.A0B.BaJ();
    }

    public void BaK(C121385t3 r2) {
        this.A0B.A0N.A07(r2);
    }

    public void BbF(Set set) {
        C95394km r5 = this.A0B;
        AnonymousClass6QK r0 = r5.A0K;
        r0.A01 = set;
        r5.A0E.A02((Boolean) null, C95394km.A02(r5), r0.A06(), 46);
        C95394km.A0C(r5);
        this.A0B.A0V(64);
    }

    public void Bcg(AnonymousClass6QG r3) {
        this.A0B.BTX(0);
    }

    public void BfT() {
        this.A0B.A0N.A00.A0F();
    }

    public void Bwx() {
        C95434kv r2 = this.A0B.A0N.A00;
        C1497172m.A00(r2.A08, r2, 26);
    }

    public static BusinessDirectoryActivity A00(BusinessDirectorySearchFragment businessDirectorySearchFragment) {
        if (businessDirectorySearchFragment.A0i() instanceof BusinessDirectoryActivity) {
            return (BusinessDirectoryActivity) businessDirectorySearchFragment.A0i();
        }
        throw AnonymousClass001.A09("BusinessDirectorySearchFragment should be attached to BusinessDirectoryActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        r1.setTitle(r5.A0n(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r5.A0i().setTitle(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment r5, java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r4 = 1
            r3 = 0
            switch(r0) {
                case -1126816384: goto L_0x0055;
                case 23561082: goto L_0x0045;
                case 1014375387: goto L_0x0032;
                case 2044323616: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.01I r0 = r5.A0i()
            r0.setTitle(r6)
        L_0x0010:
            return
        L_0x0011:
            java.lang.String r0 = "business_chaining"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.os.Bundle r1 = r5.A0b()
            java.lang.String r0 = "directory_biz_chaining_name"
            java.lang.String r2 = r1.getString(r0)
            if (r2 == 0) goto L_0x0010
            r1 = 2131886798(0x7f1202ce, float:1.9408185E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r0 = X.C36401kF.A0q(r5, r2, r0, r3, r1)
            A05(r5, r0)
            return
        L_0x0032:
            java.lang.String r0 = "product_name"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryActivity r1 = A00(r5)
            r0 = 2131886815(0x7f1202df, float:1.940822E38)
            r1.setTitle(r0)
            return
        L_0x0045:
            java.lang.String r0 = "all_categories"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.01I r1 = r5.A0i()
            r0 = 2131886742(0x7f120296, float:1.9408071E38)
            goto L_0x0064
        L_0x0055:
            java.lang.String r0 = "nearby_business"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.01I r1 = r5.A0i()
            r0 = 2131886772(0x7f1202b4, float:1.9408132E38)
        L_0x0064:
            java.lang.String r0 = r5.A0n(r0)
            r1.setTitle(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment.A05(com.whatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment, java.lang.String):void");
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C001700s r4;
        View A0E2 = C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
        this.A0H = C90504aG.A0J(A0E2, R.id.search_list);
        this.A00 = (Chip) C012005e.A02(A0E2, R.id.update_results_chip);
        A1D();
        LinearLayoutManager A0T = C36431kI.A0T();
        this.A0G = new C162877pI(this, 1);
        this.A0H.setLayoutManager(A0T);
        this.A0H.A0v(this.A0G);
        this.A0H.setAdapter(this.A09);
        boolean A032 = this.A0F.A03();
        AnonymousClass01N r1 = this.A0P;
        if (A032) {
            r1.A04(this.A0I);
            DirectoryGPSLocationManager directoryGPSLocationManager = this.A0I;
            directoryGPSLocationManager.A02 = C36371kC.A0n();
            r4 = directoryGPSLocationManager.A04;
        } else {
            r1.A04(this.A08);
            r4 = this.A08.A00;
        }
        C02380Ab A0m = A0m();
        C143576qm r12 = this.A0A;
        Objects.requireNonNull(r12);
        C165157sy.A00(A0m, r4, r12, 22);
        C165157sy.A00(A0m(), this.A0B.A0V, this, 35);
        C28201Rs r42 = this.A0B.A0Q;
        C02380Ab A0m2 = A0m();
        C143576qm r13 = this.A0A;
        Objects.requireNonNull(r13);
        C165157sy.A00(A0m2, r42, r13, 23);
        C165157sy.A00(A0m(), this.A0B.A0B, this, 37);
        C165157sy.A00(A0m(), this.A0B.A0R, this, 34);
        C165157sy.A00(A0m(), this.A0B.A08, this, 33);
        C165157sy.A00(A0m(), this.A0B.A0U, this, 32);
        C165157sy.A00(A0m(), this.A0B.A0A, this, 36);
        A0i().A05.A01(this.A0J, A0m());
        C36361kB.A18(this.A00, this, 48);
        C95394km r2 = this.A0B;
        if (r2.A0N.A00.A00 != 4) {
            C36341k9.A17(r2.A0V, 0);
        }
        return A0E2;
    }

    public void A1H() {
        super.A1H();
        this.A07.A01(this.A0A);
        Iterator it = this.A0J.A00.iterator();
        while (it.hasNext()) {
            ((AnonymousClass04V) it.next()).cancel();
        }
        AnonymousClass01I A0h = A0h();
        if (A0h == null || A0h.isFinishing()) {
            this.A0B.A0H.A00();
        }
    }

    public void A1J() {
        super.A1J();
        RecyclerView recyclerView = this.A0H;
        if (recyclerView != null) {
            recyclerView.A0w(this.A0G);
            this.A0H.setAdapter((AnonymousClass0CZ) null);
            this.A0H = null;
        }
    }

    public void A1L() {
        AnonymousClass6QG r0;
        super.A1L();
        C95394km r2 = this.A0B;
        C95394km.A0B(r2);
        Iterator it = r2.A0W.iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass001.A0A("isVisibilityChanged");
        }
        C143466qb r1 = r2.A0N;
        if (r1.A09() && (r0 = r1.A00.A01) != null && !r0.equals(r0)) {
            C95434kv r22 = r1.A00;
            C1497172m.A00(r22.A08, r22, 26);
        }
    }
}
