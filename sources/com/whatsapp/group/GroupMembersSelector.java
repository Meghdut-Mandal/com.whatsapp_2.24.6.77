package com.whatsapp.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass09Y;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass143;
import X.AnonymousClass147;
import X.AnonymousClass17X;
import X.AnonymousClass190;
import X.AnonymousClass1N6;
import X.AnonymousClass1NZ;
import X.AnonymousClass22g;
import X.AnonymousClass27v;
import X.AnonymousClass34G;
import X.AnonymousClass3OQ;
import X.AnonymousClass3UJ;
import X.C004702c;
import X.C023509x;
import X.C110515an;
import X.C18740tg;
import X.C18800tq;
import X.C18830tt;
import X.C19460v5;
import X.C19470v6;
import X.C220412q;
import X.C232317r;
import X.C27111My;
import X.C28391Sm;
import X.C28401Sn;
import X.C33311f5;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36371kC;
import X.C36401kF;
import X.C36431kI;
import X.C36441kJ;
import X.C43302Gi;
import X.C49042iT;
import X.C50952mu;
import X.C52022ol;
import X.C62463Gg;
import X.C65533Sl;
import X.C81563xD;
import X.C89334Wd;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.whatsapp.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$1;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

public class GroupMembersSelector extends AnonymousClass27v {
    public C19460v5 A00;
    public C28391Sm A01;
    public C220412q A02;
    public AnonymousClass17X A03;
    public C232317r A04;
    public AnonymousClass1NZ A05;
    public C49042iT A06;
    public AnonymousClass147 A07;
    public AnonymousClass1N6 A08;
    public List A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public int A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;

    public static void A0x(GroupMembersSelector groupMembersSelector, boolean z) {
        ArrayList A052;
        String rawString;
        groupMembersSelector.A06 = null;
        boolean z2 = z;
        if (groupMembersSelector.A0G) {
            Intent A0D2 = C36431kI.A0D();
            Intent putExtra = A0D2.putExtra("duplicate_ug_exists", z).putExtra("selected", AnonymousClass143.A07(groupMembersSelector.A0B)).putExtra("entry_point", groupMembersSelector.getIntent().getIntExtra("entry_point", -1));
            AnonymousClass147 r0 = groupMembersSelector.A07;
            if (r0 == null) {
                rawString = null;
            } else {
                rawString = r0.getRawString();
            }
            putExtra.putExtra("parent_group_jid_to_link", rawString);
            groupMembersSelector.setResult(-1, A0D2);
            groupMembersSelector.finish();
            return;
        }
        AnonymousClass09Y A0O = C36341k9.A0O(groupMembersSelector);
        AnonymousClass3OQ r4 = NewGroupRouter.A0A;
        ArrayList A3o = groupMembersSelector.A3o();
        int i = groupMembersSelector.A0D;
        AnonymousClass147 r5 = groupMembersSelector.A07;
        Bundle bundleExtra = groupMembersSelector.getIntent().getBundleExtra("fMessageKeyBundle");
        if (bundleExtra == null) {
            A052 = null;
        } else {
            A052 = AnonymousClass3UJ.A05(bundleExtra);
        }
        A0O.A0D(r4.A01(r5, C36371kC.A0H(groupMembersSelector).getString("appended_message"), A3o, A052, i, z2, C36371kC.A0H(groupMembersSelector).getBoolean("include_captions")), (String) null);
        A0O.A04();
    }

    public boolean A2g() {
        return true;
    }

    public void A3v(C62463Gg r10, AnonymousClass141 r11) {
        AnonymousClass141 r5 = r11;
        super.A3v(r10, r11);
        AnonymousClass34G A0C2 = this.A0B.A0C(r11, 7);
        C52022ol r0 = A0C2.A00;
        C52022ol r2 = C52022ol.PUSH_NAME;
        if (r0 == r2) {
            r10.A02.A0I(this.A0B.A0G(r2, r11, 7));
        }
        r10.A03.A04(A0C2, r5, this.A0O, 7, r11.A0O());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Intent A0D2;
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("groupmembersselector/permissions denied");
            } else {
                return;
            }
        } else if (i2 == -1) {
            if (intent != null) {
                AnonymousClass147 A002 = C65533Sl.A00(intent, "group_jid");
                C18740tg.A06(A002);
                Bundle bundleExtra = intent.getBundleExtra("new_group_result_bundle");
                C36321k7.A1K(A002, "groupmembersselector/group created ", AnonymousClass000.A0u());
                if (this.A02.A0M(A002) && !BLh()) {
                    C36321k7.A1K(A002, "groupmembersselector/opening conversation", AnonymousClass000.A0u());
                    if (this.A07 == null || this.A0D == 10) {
                        A0D2 = C36371kC.A0D(this, A002);
                    } else {
                        new AnonymousClass190();
                        A0D2 = C36361kB.A08(this, A002, 0);
                    }
                    if (bundleExtra != null) {
                        A0D2.putExtra("new_group_result_bundle", bundleExtra);
                    }
                    this.A01.A07(this, A0D2);
                }
            }
            startActivity(AnonymousClass190.A03(this));
        } else {
            return;
        }
        finish();
    }

    public static List A0w(GroupMembersSelector groupMembersSelector) {
        Collection collection;
        if (groupMembersSelector.A0E == null) {
            groupMembersSelector.A0E = AnonymousClass001.A0I();
            C28391Sm r4 = groupMembersSelector.A01;
            AnonymousClass147 r3 = groupMembersSelector.A07;
            LifecycleCoroutineScopeImpl A002 = C33311f5.A00(groupMembersSelector);
            C28401Sn r42 = (C28401Sn) r4;
            AnonymousClass00C.A0D(r3, 0);
            try {
                collection = (Collection) C110515an.A00(A002.A01, new CommunityMembersDirectory$getCommunityContacts$1(r42, r3, (C023509x) null));
            } catch (CancellationException e) {
                Log.e((Throwable) e);
                collection = C004702c.A00;
            }
            groupMembersSelector.A0E.addAll(collection);
        }
        return groupMembersSelector.A0E;
    }

    public void A2F() {
        if (!this.A0F) {
            this.A0F = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A02 = C36351kA.A0a(r2);
            this.A00 = C19470v6.A00;
            this.A01 = C18800tq.A4s(r2);
            this.A04 = (C232317r) r2.A61.get();
            this.A03 = C36351kA.A0b(r2);
            this.A08 = C36361kB.A0e(r2);
            this.A05 = (AnonymousClass1NZ) r2.AYh.get();
        }
    }

    public void A2X() {
        if (this.A0D.A0E(7492)) {
            this.A08.A03((AnonymousClass11F) null, 89);
        }
        super.A2X();
    }

    public void A3s(int i) {
        if (i <= 0) {
            getSupportActionBar().A0H(R.string.f12nameremoved);
        } else {
            super.A3s(i);
        }
    }

    public void A46(List list) {
        if (!TextUtils.isEmpty(this.A0N) && !list.isEmpty()) {
            list.add(new C43302Gi(getString(R.string.f12nameremoved)));
        }
        super.A46(list);
        A47(list);
    }

    public GroupMembersSelector(int i) {
        this.A0F = false;
        C89334Wd.A00(this, 37);
    }

    public void A42(ArrayList arrayList) {
        super.A42(arrayList);
        if (this.A0D.A0E(3689)) {
            Iterator it = this.A05.A00().iterator();
            while (it.hasNext()) {
                AnonymousClass141 A082 = this.A09.A08(C36401kF.A0a(it));
                if (A082 != null && A082.A0z && !arrayList.contains(A082)) {
                    arrayList.add(A082);
                }
            }
        }
        if (C36441kJ.A1L(this.A0D)) {
            if (this.A09 == null) {
                ArrayList A0I = AnonymousClass001.A0I();
                this.A09 = A0I;
                this.A09.A0o(A0I);
                Collections.sort(this.A09, new C81563xD(this.A0B, this.A0I));
            }
            arrayList.addAll(this.A09);
        }
        if (this.A02.A05(this.A07) == 1) {
            arrayList.addAll(A0w(this));
        }
    }

    public void A44(List list) {
        if (list.isEmpty() && !TextUtils.isEmpty(this.A0N)) {
            A43(list);
        }
        super.A44(list);
    }

    public void B2c(AnonymousClass141 r2) {
        super.B2c(r2);
        this.A0C = true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.A07 = C65533Sl.A00(getIntent(), "parent_group_jid_to_link");
            this.A0D = getIntent().getIntExtra("entry_point", 3);
            this.A0G = getIntent().getBooleanExtra("return_result", false);
        }
        if (bundle == null && !C36401kF.A1Y(this.A0D) && !this.A08.A00()) {
            RequestPermissionActivity.A01(this, R.string.f12nameremoved, R.string.f12nameremoved);
        }
        WDSSearchBar wDSSearchBar = this.A0M;
        if (wDSSearchBar != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C50952mu.A00);
            this.A0M.A07.setHint((int) R.string.f12nameremoved);
        }
    }

    public GroupMembersSelector() {
        this(0);
        this.A0C = false;
        this.A0G = false;
    }
}
