package com.whatsapp.community;

import X.AnonymousClass07B;
import X.AnonymousClass141;
import X.AnonymousClass147;
import X.AnonymousClass155;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17X;
import X.AnonymousClass19A;
import X.AnonymousClass1EM;
import X.AnonymousClass1LI;
import X.AnonymousClass1LV;
import X.AnonymousClass1Pp;
import X.AnonymousClass1RY;
import X.AnonymousClass3QV;
import X.AnonymousClass4ZD;
import X.AnonymousClass755;
import X.C03570Gk;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19730wQ;
import X.C20810yC;
import X.C220412q;
import X.C232317r;
import X.C27111My;
import X.C27731Pn;
import X.C27751Pr;
import X.C28081Rg;
import X.C28431Sq;
import X.C32681e1;
import X.C33521fV;
import X.C33751fs;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C40051uf;
import X.C40711vz;
import X.C48912iG;
import X.C53822rw;
import X.C56992xU;
import X.C57032xZ;
import X.C586930r;
import X.C61293Bh;
import X.C65533Sl;
import X.C81093wS;
import X.C89324Wc;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Spinner;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import java.util.ArrayList;

public class ManageGroupsInCommunityActivity extends AnonymousClass155 {
    public int A00;
    public long A01;
    public Spinner A02;
    public AnonymousClass07B A03;
    public RecyclerView A04;
    public C56992xU A05;
    public C57032xZ A06;
    public C61293Bh A07;
    public AnonymousClass1LI A08;
    public AnonymousClass1LV A09;
    public C28431Sq A0A;
    public C40051uf A0B;
    public C40711vz A0C;
    public AnonymousClass1Pp A0D;
    public AnonymousClass16D A0E;
    public AnonymousClass171 A0F;
    public C27731Pn A0G;
    public C33751fs A0H;
    public C220412q A0I;
    public AnonymousClass17X A0J;
    public C232317r A0K;
    public C27751Pr A0L;
    public AnonymousClass147 A0M;
    public AnonymousClass19A A0N;
    public C28081Rg A0O;
    public AnonymousClass1EM A0P;
    public C32681e1 A0Q;
    public boolean A0R;
    public boolean A0S;
    public final C586930r A0T;

    public static void A01(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity) {
        C32681e1 r4;
        int i;
        String string;
        int A052;
        C81093wS r6;
        String str;
        int i2;
        if (manageGroupsInCommunityActivity.A0D.A0E(3829)) {
            WaTextView waTextView = (WaTextView) C03570Gk.A0B(manageGroupsInCommunityActivity, R.id.members_can_add_subgroup_disclaimer_text);
            boolean z = manageGroupsInCommunityActivity.A0R;
            Context context = waTextView.getContext();
            if (z) {
                boolean A0E2 = manageGroupsInCommunityActivity.A0D.A0E(5077);
                r4 = manageGroupsInCommunityActivity.A0Q;
                boolean z2 = ((AnonymousClass141) manageGroupsInCommunityActivity.A0B.A0G.A04()).A0c;
                if (A0E2) {
                    int i3 = R.string.f12nameremoved;
                    if (z2) {
                        i3 = R.string.f12nameremoved;
                    }
                    string = manageGroupsInCommunityActivity.getString(i3);
                    A052 = C36381kD.A01(manageGroupsInCommunityActivity);
                    i2 = 16;
                } else {
                    int i4 = R.string.f12nameremoved;
                    if (z2) {
                        i4 = R.string.f12nameremoved;
                    }
                    string = manageGroupsInCommunityActivity.getString(i4);
                    A052 = C36381kD.A01(manageGroupsInCommunityActivity);
                    i2 = 17;
                }
                r6 = new C81093wS((Object) manageGroupsInCommunityActivity, i2);
                str = "community_settings_link";
            } else {
                boolean z3 = ((AnonymousClass141) manageGroupsInCommunityActivity.A0B.A0G.A04()).A0c;
                r4 = manageGroupsInCommunityActivity.A0Q;
                if (z3) {
                    i = R.string.f12nameremoved;
                } else {
                    i = R.string.f12nameremoved;
                }
                string = manageGroupsInCommunityActivity.getString(i);
                A052 = C36341k9.A05(manageGroupsInCommunityActivity);
                r6 = new C81093wS((Object) manageGroupsInCommunityActivity, 18);
                str = "learn-more";
            }
            waTextView.setText(r4.A03(context, r6, string, str, A052));
            C33521fV.A08(waTextView, manageGroupsInCommunityActivity.A08, manageGroupsInCommunityActivity.A0D);
            waTextView.setVisibility(0);
        }
    }

    public static boolean A07(ManageGroupsInCommunityActivity manageGroupsInCommunityActivity) {
        if (C36341k9.A07(manageGroupsInCommunityActivity.A0B.A0o) < manageGroupsInCommunityActivity.A09.A06.A07(1238) + 1) {
            return false;
        }
        String format = manageGroupsInCommunityActivity.A00.A0M().format(C36441kJ.A0B(manageGroupsInCommunityActivity.A09.A06, 1238));
        Toast.makeText(manageGroupsInCommunityActivity, manageGroupsInCommunityActivity.A00.A0I(format, new Object[]{format}, R.plurals.f10nameremoved), 0).show();
        return true;
    }

    public void A2F() {
        if (!this.A0S) {
            this.A0S = true;
            C27111My A0L2 = C36351kA.A0L(this);
            C18800tq r2 = A0L2.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r3 = r2.A00;
            C36321k7.A0X(r2, r3, this, C36321k7.A05(r2, r3, this));
            this.A0Q = C36351kA.A0p(r3);
            this.A0I = C36351kA.A0a(r2);
            this.A0G = C36351kA.A0T(r2);
            this.A0N = C36361kB.A0c(r2);
            this.A0D = C36361kB.A0V(r2);
            this.A0E = C36341k9.A0R(r2);
            this.A0F = C36341k9.A0S(r2);
            this.A0P = C36371kC.A0l(r2);
            this.A0O = C18800tq.ALZ(r2);
            this.A0L = C36381kD.A0b(r2);
            this.A09 = C36361kB.A0U(r2);
            this.A0H = C36361kB.A0X(r3);
            this.A0J = C36351kA.A0b(r2);
            this.A0K = (C232317r) r2.A61.get();
            this.A05 = (C56992xU) A0L2.A0Y.get();
            this.A0A = C36391kE.A0b(r2);
            this.A06 = (C57032xZ) A0L2.A0k.get();
            this.A08 = C36361kB.A0S(r2);
            this.A07 = (C61293Bh) A0L2.A0m.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 10) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (i2 == -1) {
            if (intent != null && intent.getExtras() != null) {
                ArrayList<String> stringArrayList = intent.getExtras().getStringArrayList("selected_jids");
                boolean z = intent.getExtras().getBoolean("is_suggest_mode", false);
                if (stringArrayList != null && !stringArrayList.isEmpty()) {
                    if (!C36431kI.A1R(this)) {
                        this.A05.A03(C36421kH.A02(getApplicationContext()));
                        return;
                    }
                    this.A01 = SystemClock.uptimeMillis();
                    int i3 = R.string.f12nameremoved;
                    if (z) {
                        i3 = R.string.f12nameremoved;
                    }
                    Bu2(i3, R.string.f12nameremoved);
                    C40051uf r2 = this.A0B;
                    r2.A0t.execute(new AnonymousClass755(r2, this.A0M, stringArrayList, 7, z));
                    return;
                }
            } else {
                return;
            }
        } else if (i2 != -10) {
            return;
        }
        this.A05.A03(R.string.f12nameremoved);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass147 A002 = C65533Sl.A00(getIntent(), "parent_group_jid");
        C18740tg.A06(A002);
        this.A0M = A002;
        this.A0R = this.A0J.A0D(A002);
        this.A00 = getIntent().getIntExtra("group_create_entry_point", 3);
        setContentView((int) R.layout.f9nameremoved);
        C03570Gk.A0B(this, R.id.community_add_groups_done_button).setVisibility(8);
        setSupportActionBar(C36361kB.A0N(this));
        AnonymousClass07B A0O2 = C36381kD.A0O(this);
        this.A03 = A0O2;
        A0O2.A0X(true);
        this.A03.A0U(true);
        AnonymousClass07B r4 = this.A03;
        boolean z = this.A0R;
        int i = R.string.f12nameremoved;
        if (z) {
            i = R.string.f12nameremoved;
        }
        r4.A0I(i);
        C48912iG.A00(findViewById(R.id.add_groups_new_group), this, 5);
        C48912iG.A00(findViewById(R.id.add_groups_link_existing_groups), this, 6);
        AnonymousClass1RY A052 = this.A0G.A05(this, "add-groups-to-community");
        boolean z2 = true;
        this.A0B = (C40051uf) AnonymousClass4ZD.A00(this, this.A0M, this.A05, new AnonymousClass3QV(true, true, false, true, true), 0).A00(C40051uf.class);
        RecyclerView recyclerView = (RecyclerView) C03570Gk.A0B(this, R.id.added_groups);
        this.A04 = recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), this.A04.getPaddingTop(), this.A04.getPaddingRight(), getResources().getDimensionPixelSize(R.dimen.f7nameremoved));
        this.A02 = (Spinner) C03570Gk.A0B(this, R.id.add_groups_subgroup_spinner);
        C36351kA.A1F(this.A04, 1);
        C57032xZ r42 = this.A06;
        if (!this.A0P.A01() || !this.A0R) {
            z2 = false;
        }
        C586930r r7 = this.A0T;
        C18800tq r3 = r42.A00.A01;
        C20810yC A0V = C36341k9.A0V(r3);
        C19730wQ A0N2 = C36351kA.A0N(r3);
        C220412q A0a = C36351kA.A0a(r3);
        C40711vz r43 = new C40711vz(A0N2, C36361kB.A0S(r3), r7, C36361kB.A0V(r3), C36341k9.A0R(r3), C36341k9.A0S(r3), A052, A0a, C36351kA.A0b(r3), A0V, z2);
        this.A0C = r43;
        this.A04.setAdapter(r43);
        A01(this);
        this.A02.setVisibility(0);
        this.A04.setVisibility(8);
        C53822rw.A00(this, this.A0B.A0p, 28);
        C53822rw.A00(this, this.A0B.A0o, 27);
        C53822rw.A00(this, this.A0B.A0H, 25);
        C53822rw.A00(this, this.A0B.A0G, 23);
        C53822rw.A00(this, this.A0B.A0I, 26);
        C53822rw.A00(this, this.A0B.A0J, 24);
    }

    public ManageGroupsInCommunityActivity(int i) {
        this.A0S = false;
        C89324Wc.A00(this, 11);
    }

    public ManageGroupsInCommunityActivity() {
        this(0);
        this.A0T = new C586930r(this);
    }
}
