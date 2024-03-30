package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass00E;
import X.AnonymousClass0XL;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass16I;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass1LI;
import X.AnonymousClass1RY;
import X.AnonymousClass21F;
import X.AnonymousClass3UF;
import X.AnonymousClass3Y2;
import X.AnonymousClass3YG;
import X.AnonymousClass4W0;
import X.AnonymousClass4W3;
import X.AnonymousClass4WB;
import X.AnonymousClass6PM;
import X.AnonymousClass6X6;
import X.C011504z;
import X.C02460Ak;
import X.C18740tg;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19730wQ;
import X.C202859mm;
import X.C226815j;
import X.C233117z;
import X.C24361Cd;
import X.C24511Cs;
import X.C27541Op;
import X.C27731Pn;
import X.C27781Pu;
import X.C32001cn;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C36931lX;
import X.C40581vm;
import X.C48742hy;
import X.C49512jF;
import X.C53842ry;
import X.C53912s6;
import X.C65533Sl;
import X.C87854Qk;
import X.C89334Wd;
import X.C89584Xc;
import X.C90104Zc;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.List;

public class GroupAdminPickerActivity extends AnonymousClass155 {
    public ColorDrawable A00;
    public View A01;
    public View A02;
    public BottomSheetBehavior A03;
    public AnonymousClass1LI A04;
    public C24361Cd A05;
    public AnonymousClass16D A06;
    public AnonymousClass16I A07;
    public AnonymousClass171 A08;
    public AnonymousClass1RY A09;
    public C27731Pn A0A;
    public C18820ts A0B;
    public AnonymousClass17X A0C;
    public C27781Pu A0D;
    public C40581vm A0E;
    public C27541Op A0F;
    public C233117z A0G;
    public AnonymousClass147 A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public List A0M;
    public View A0N;
    public View A0O;
    public SearchView A0P;
    public C49512jF A0Q;
    public boolean A0R;
    public final View.OnClickListener A0S;
    public final C32001cn A0T;
    public final C226815j A0U;
    public final C87854Qk A0V;
    public final C24511Cs A0W;

    public static void A0G(GroupAdminPickerActivity groupAdminPickerActivity, String str) {
        GroupAdminPickerActivity groupAdminPickerActivity2 = groupAdminPickerActivity;
        groupAdminPickerActivity2.A0I = str;
        C36331k8.A1E(groupAdminPickerActivity2.A0Q);
        C49512jF r1 = new C49512jF(groupAdminPickerActivity2.A08, groupAdminPickerActivity2.A0B, groupAdminPickerActivity2, str, groupAdminPickerActivity2.A0M);
        groupAdminPickerActivity2.A0Q = r1;
        C36331k8.A1F(r1, groupAdminPickerActivity2.A04);
    }

    public static boolean A0H(GroupAdminPickerActivity groupAdminPickerActivity, UserJid userJid) {
        if (userJid != null) {
            Iterator it = groupAdminPickerActivity.A0M.iterator();
            while (it.hasNext()) {
                if (userJid.equals(C36371kC.A0d(it))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void A07(GroupAdminPickerActivity groupAdminPickerActivity) {
        groupAdminPickerActivity.A01.setPadding(0, 0, 0, 0);
        ((C02460Ak) groupAdminPickerActivity.A01.getLayoutParams()).A00((AnonymousClass0XL) null);
        groupAdminPickerActivity.A00.setColor(C36351kA.A01(groupAdminPickerActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
        groupAdminPickerActivity.A0P.A0E();
        groupAdminPickerActivity.A0O.setVisibility(8);
        groupAdminPickerActivity.A02.setVisibility(0);
    }

    public static void A0F(GroupAdminPickerActivity groupAdminPickerActivity) {
        AnonymousClass6X6 A0C2;
        if (groupAdminPickerActivity.A0L == null || groupAdminPickerActivity.A0J == null) {
            AnonymousClass17X r0 = groupAdminPickerActivity.A0C;
            AnonymousClass147 r1 = groupAdminPickerActivity.A0H;
            C18740tg.A06(r1);
            A0C2 = r0.A07.A0C(r1);
        } else {
            C27781Pu r02 = groupAdminPickerActivity.A0D;
            A0C2 = (AnonymousClass6X6) r02.A00.get(groupAdminPickerActivity.A0H);
        }
        groupAdminPickerActivity.A0M = C36441kJ.A14(A0C2.A08.size());
        Iterator it = A0C2.A0F().iterator();
        while (it.hasNext()) {
            C19730wQ r03 = groupAdminPickerActivity.A02;
            UserJid userJid = ((AnonymousClass6PM) it.next()).A03;
            if (!r03.A0M(userJid)) {
                groupAdminPickerActivity.A0M.add(groupAdminPickerActivity.A06.A0D(userJid));
            }
        }
    }

    public void A2F() {
        if (!this.A0R) {
            this.A0R = true;
            C18800tq A0B2 = C36331k8.A0B(this);
            C36321k7.A0c(A0B2, this);
            C18830tt r1 = A0B2.A00;
            C36321k7.A0X(A0B2, r1, this, C36321k7.A05(A0B2, r1, this));
            this.A0A = C36351kA.A0T(A0B2);
            this.A06 = C36341k9.A0R(A0B2);
            this.A08 = C36341k9.A0S(A0B2);
            this.A0B = C36341k9.A0T(A0B2);
            this.A07 = C36351kA.A0S(A0B2);
            this.A05 = C36371kC.A0T(A0B2);
            this.A0D = (C27781Pu) A0B2.A8D.get();
            this.A0F = C36381kD.A0c(A0B2);
            this.A0C = C36351kA.A0b(A0B2);
            this.A0G = C36371kC.A0c(A0B2);
            this.A04 = C36361kB.A0S(A0B2);
        }
    }

    public void onBackPressed() {
        if (this.A02.getVisibility() == 0) {
            A01(this);
        } else {
            this.A03.A0W(4);
        }
    }

    public GroupAdminPickerActivity(int i) {
        this.A0R = false;
        C89334Wd.A00(this, 35);
    }

    public static void A01(GroupAdminPickerActivity groupAdminPickerActivity) {
        groupAdminPickerActivity.A01.setPadding(0, groupAdminPickerActivity.getResources().getDimensionPixelSize(R.dimen.f7nameremoved), 0, 0);
        ((C02460Ak) groupAdminPickerActivity.A01.getLayoutParams()).A00(groupAdminPickerActivity.A03);
        groupAdminPickerActivity.A00.setColor(2130706432);
        groupAdminPickerActivity.A0O.setVisibility(0);
        groupAdminPickerActivity.A02.setVisibility(8);
        A0G(groupAdminPickerActivity, (String) null);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f9nameremoved);
        C36331k8.A0l(this);
        View findViewById = findViewById(R.id.bottom_sheet);
        this.A01 = findViewById;
        this.A03 = BottomSheetBehavior.A02(findViewById);
        C90104Zc.A00(this.A01.getViewTreeObserver(), this, 22);
        this.A0N = findViewById(R.id.background);
        PointF pointF = new PointF();
        AnonymousClass3YG.A00(this.A0N, this, pointF, 26);
        C53912s6.A00(this.A0N, pointF, 6);
        ColorDrawable colorDrawable = new ColorDrawable(2130706432);
        this.A00 = colorDrawable;
        C011504z.A04(colorDrawable, this.A0N);
        AlphaAnimation A0D2 = C36351kA.A0D();
        C36421kH.A0p(getResources(), A0D2, 17694720);
        this.A0N.startAnimation(A0D2);
        this.A03.A0a(new AnonymousClass21F(this, C36391kE.A05(this)));
        this.A0O = findViewById(R.id.title_holder);
        View findViewById2 = findViewById(R.id.search_holder);
        this.A02 = findViewById2;
        findViewById2.setBackgroundResource(R.drawable.search_background);
        SearchView searchView = (SearchView) this.A02.findViewById(R.id.search_view);
        this.A0P = searchView;
        C36321k7.A0M(this, C36391kE.A0P(searchView, R.id.search_src_text), R.attr.f4nameremoved, R.color.f6nameremoved);
        this.A0P.setIconifiedByDefault(false);
        this.A0P.setQueryHint(getString(R.string.f12nameremoved));
        C36391kE.A0N(this.A0P, R.id.search_mag_icon).setImageDrawable(new C36931lX(AnonymousClass00E.A00(this, R.drawable.ic_back), this));
        this.A0P.A06 = new C53842ry(this, 6);
        ImageView A0N2 = C36391kE.A0N(this.A02, R.id.search_back);
        C36361kB.A13(AnonymousClass3UF.A02(this, R.drawable.ic_back, R.color.f6nameremoved), A0N2, this.A0B);
        C48742hy.A01(A0N2, this, 44);
        AnonymousClass3Y2.A00(findViewById(R.id.search_btn), this, 26);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        C36321k7.A0Q(recyclerView);
        this.A09 = this.A0A.A05(this, "group-admin-picker-activity");
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "gid");
        C18740tg.A06(A002);
        this.A0H = A002;
        this.A0L = getIntent().getStringExtra("subgroup_subject");
        this.A0K = getIntent().getStringExtra("subgroup_request_message");
        this.A0J = getIntent().getStringExtra("parent_group_jid");
        A0F(this);
        C40581vm r1 = new C40581vm(this);
        this.A0E = r1;
        r1.A01 = this.A0M;
        r1.A00 = C202859mm.A03(r1.A02.A0B, (String) null);
        r1.A06();
        recyclerView.setAdapter(this.A0E);
        this.A07.registerObserver(this.A0U);
        this.A05.registerObserver(this.A0T);
        this.A0F.A00(this.A0V);
        this.A0G.registerObserver(this.A0W);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A07.unregisterObserver(this.A0U);
        this.A05.unregisterObserver(this.A0T);
        this.A0F.A01(this.A0V);
        this.A0G.unregisterObserver(this.A0W);
        this.A09.A02();
        C27781Pu r0 = this.A0D;
        r0.A00.remove(this.A0H);
        C36331k8.A1E(this.A0Q);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle.getBoolean("search")) {
            A07(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("search", AnonymousClass000.A1Q(this.A02.getVisibility()));
    }

    public GroupAdminPickerActivity() {
        this(0);
        this.A0U = AnonymousClass4W3.A00(this, 22);
        this.A0T = new AnonymousClass4W0(this, 11);
        this.A0W = new AnonymousClass4WB(this, 17);
        this.A0V = new C89584Xc(this, 16);
        this.A0S = new AnonymousClass3Y2(this, 25);
    }
}
