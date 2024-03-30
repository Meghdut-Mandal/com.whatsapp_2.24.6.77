package com.whatsapp.businessapisearch.view.activity;

import X.AnonymousClass001;
import X.AnonymousClass01z;
import X.AnonymousClass021;
import X.AnonymousClass02E;
import X.AnonymousClass07B;
import X.AnonymousClass09Y;
import X.AnonymousClass1NC;
import X.AnonymousClass3LE;
import X.AnonymousClass6NC;
import X.AnonymousClass6OF;
import X.AnonymousClass6UC;
import X.C100994wR;
import X.C1040758e;
import X.C1255760k;
import X.C165147sx;
import X.C18740tg;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C90484aE;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import com.whatsapp.businessapisearch.view.fragment.BusinessApiHomeFragment;
import com.whatsapp.businessapisearch.viewmodel.BusinessApiSearchActivityViewModel;

public class BusinessApiSearchActivity extends C100994wR {
    public Menu A00;
    public AnonymousClass1NC A01;
    public C1255760k A02;
    public BusinessApiHomeFragment A03;
    public AnonymousClass6NC A04;
    public BusinessApiSearchActivityViewModel A05;
    public AnonymousClass6OF A06;
    public AnonymousClass3LE A07;
    public String A08;
    public boolean A09;
    public boolean A0A;

    public void onCreate(Bundle bundle) {
        String str;
        AnonymousClass02E r0;
        super.onCreate(bundle);
        if (C36421kH.A1T(getIntent(), "directory_source")) {
            str = "DIRECTORY";
        } else {
            str = "BUSINESSAPISEARCH";
        }
        this.A08 = str;
        if (bundle != null) {
            this.A0A = bundle.getBoolean("arg_show_search_view", true);
        } else {
            A3i();
        }
        Toolbar A0O = C36361kB.A0O(this, R.layout.f9nameremoved);
        AnonymousClass07B A0Q = C36431kI.A0Q(this, A0O);
        C18740tg.A06(A0Q);
        A0Q.A0V(true);
        A0Q.A0U(true);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(R.string.f12nameremoved);
            AnonymousClass3LE r1 = this.A07;
            if (r1 != null) {
                r1.A05(true);
            }
            A3j();
        } else if (bundle != null) {
            AnonymousClass021 r2 = getSupportFragmentManager().A0T;
            if (r2.A04().isEmpty()) {
                r0 = null;
            } else {
                r0 = (AnonymousClass02E) r2.A04().get(C36431kI.A07(r2.A04()));
            }
            if (r0 instanceof BusinessApiHomeFragment) {
                setTitle(R.string.f12nameremoved);
            }
        }
        this.A07 = new AnonymousClass3LE(this, findViewById(R.id.search_holder), new AnonymousClass6UC(this, 0), A0O, this.A00);
        if (this.A0A && bundle != null) {
            A3k(false);
        }
        BusinessApiSearchActivityViewModel businessApiSearchActivityViewModel = (BusinessApiSearchActivityViewModel) C36441kJ.A0b(this).A00(BusinessApiSearchActivityViewModel.class);
        this.A05 = businessApiSearchActivityViewModel;
        C165147sx.A01(this, businessApiSearchActivityViewModel.A01, 48);
    }

    public static void A01(BusinessApiSearchActivity businessApiSearchActivity) {
        AnonymousClass3LE r1 = businessApiSearchActivity.A07;
        if (r1 != null) {
            r1.A05(true);
        }
        businessApiSearchActivity.A3j();
        AnonymousClass01z.A0H(businessApiSearchActivity.getSupportFragmentManager(), (String) null);
    }

    public void A3i() {
        String str = this.A08;
        int A002 = C36391kE.A00("BUSINESSAPISEARCH".equals(str) ? 1 : 0);
        BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
        Bundle A072 = AnonymousClass001.A07();
        A072.putInt("arg_home_view_state", A002);
        A072.putString("entrypoint_type", str);
        businessApiHomeFragment.A17(A072);
        String A0k = C90484aE.A0k(businessApiHomeFragment);
        AnonymousClass09Y A0O = C36341k9.A0O(this);
        A0O.A0F(businessApiHomeFragment, A0k, R.id.business_search_container_view);
        A0O.A00(false);
        if ("DIRECTORY".equals(this.A08)) {
            setTitle(R.string.f12nameremoved);
            A3j();
            return;
        }
        setTitle(R.string.f12nameremoved);
    }

    public void A3j() {
        Menu menu = this.A00;
        if (menu != null && menu.findItem(1) == null) {
            this.A00.add(0, 1, 0, getString(R.string.f12nameremoved)).setIcon(R.drawable.ic_action_search).setShowAsAction(2);
        }
        this.A09 = true;
    }

    public void A3k(boolean z) {
        AnonymousClass3LE r1 = this.A07;
        if (r1 != null) {
            r1.A06(false);
            AnonymousClass3LE r2 = this.A07;
            String string = getString(R.string.f12nameremoved);
            SearchView searchView = r2.A00;
            if (searchView != null) {
                searchView.setQueryHint(string);
            }
            this.A07.A00.requestFocus();
            if (this.A02.A00(this.A08)) {
                AnonymousClass6OF r22 = this.A06;
                C1040758e r12 = new C1040758e();
                r12.A01 = C36361kB.A0j();
                r12.A03 = Integer.valueOf(z ? 1 : 0);
                r12.A00 = Boolean.valueOf(z);
                AnonymousClass6OF.A00(r12, r22);
            }
            C36361kB.A18(this.A07.A04.findViewById(R.id.search_back), this, 23);
        }
    }

    public void onBackPressed() {
        AnonymousClass3LE r0 = this.A07;
        if (r0 != null && r0.A07()) {
            BusinessApiHomeFragment businessApiHomeFragment = this.A03;
            if (businessApiHomeFragment != null) {
                businessApiHomeFragment.A1Z();
            }
            this.A07.A05(true);
        }
        this.A05.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        this.A00 = menu;
        if (this.A09) {
            A3j();
        }
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        AnonymousClass02E r0;
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            String str = this.A08;
            if ("DIRECTORY".equals(str)) {
                Intent A002 = AnonymousClass1NC.A00(getApplicationContext());
                A002.putExtra("from_api_biz_search", true);
                startActivity(A002);
                return true;
            }
            BusinessApiHomeFragment businessApiHomeFragment = new BusinessApiHomeFragment();
            Bundle A072 = AnonymousClass001.A07();
            A072.putInt("arg_home_view_state", 2);
            A072.putString("entrypoint_type", str);
            businessApiHomeFragment.A17(A072);
            String A0k = C90484aE.A0k(businessApiHomeFragment);
            AnonymousClass09Y A0O = C36341k9.A0O(this);
            A0O.A0F(businessApiHomeFragment, A0k, R.id.business_search_container_view);
            A0O.A0J(A0k);
            A0O.A00(false);
            A3k(true);
            return true;
        } else if (itemId != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BusinessApiHomeFragment businessApiHomeFragment2 = this.A03;
            if (businessApiHomeFragment2 != null) {
                businessApiHomeFragment2.A1Z();
                return true;
            }
            AnonymousClass021 r2 = getSupportFragmentManager().A0T;
            if (r2.A04().isEmpty()) {
                r0 = null;
            } else {
                r0 = (AnonymousClass02E) r2.A04().get(C36431kI.A07(r2.A04()));
            }
            if (r0 instanceof BusinessApiHomeFragment) {
                onBackPressed();
                return true;
            }
            A3i();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onSaveInstanceState(r4)
            android.view.Menu r1 = r3.A00
            r2 = 0
            r0 = 1
            if (r1 == 0) goto L_0x0010
            android.view.MenuItem r0 = r1.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            java.lang.String r0 = "arg_show_search_menu"
            r4.putBoolean(r0, r1)
            X.3LE r0 = r3.A07
            if (r0 == 0) goto L_0x0021
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x0021
            r2 = 1
        L_0x0021:
            java.lang.String r0 = "arg_show_search_view"
            r4.putBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessapisearch.view.activity.BusinessApiSearchActivity.onSaveInstanceState(android.os.Bundle):void");
    }
}
