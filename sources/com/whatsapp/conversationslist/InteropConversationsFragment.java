package com.whatsapp.conversationslist;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass01I;
import X.AnonymousClass16D;
import X.AnonymousClass16K;
import X.AnonymousClass171;
import X.AnonymousClass1NG;
import X.AnonymousClass1RY;
import X.AnonymousClass2LG;
import X.AnonymousClass4I7;
import X.C106475Jv;
import X.C18820ts;
import X.C19770wU;
import X.C21010yW;
import X.C32881eL;
import X.C32931eR;
import X.C36321k7;
import X.C36341k9;
import X.C36401kF;
import X.C36431kI;
import X.C48742hy;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class InteropConversationsFragment extends Hilt_InteropConversationsFragment {
    public final AnonymousClass00T A00 = C36431kI.A1I(AnonymousClass4I7.A00);

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        C48742hy A002 = C48742hy.A00(this, 26);
        C19770wU r13 = this.A2u;
        AnonymousClass00C.A07(r13);
        C21010yW r9 = this.A23;
        AnonymousClass00C.A07(r9);
        AnonymousClass16D r3 = this.A15;
        AnonymousClass00C.A07(r3);
        AnonymousClass171 r4 = this.A17;
        AnonymousClass00C.A07(r4);
        C18820ts r8 = this.A1i;
        AnonymousClass00C.A07(r8);
        AnonymousClass16K r5 = this.A19;
        AnonymousClass00C.A07(r5);
        AnonymousClass1NG r2 = this.A0t;
        AnonymousClass00C.A07(r2);
        AnonymousClass1RY r6 = this.A3Q;
        AnonymousClass00C.A07(r6);
        C32931eR r10 = this.A2H;
        AnonymousClass00C.A07(r10);
        C32881eL r11 = this.A2J;
        AnonymousClass00C.A07(r11);
        this.A2b.A02.A05();
        AnonymousClass2LG r1 = new AnonymousClass2LG(r2, r3, r4, r5, r6, this, r8, r9, r10, r11, A002, r13);
        this.A1W = r1;
        r1.A01 = false;
    }

    public int A1a() {
        return 11;
    }

    public boolean A1t() {
        return false;
    }

    public boolean A1u() {
        return false;
    }

    public boolean A1v() {
        return false;
    }

    public boolean A1x() {
        return false;
    }

    public boolean A20() {
        return false;
    }

    public boolean A21(Set set) {
        return false;
    }

    public List A1d() {
        ArrayList A07 = this.A1F.A07();
        ArrayList A0J = C36321k7.A0J(A07);
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            A0J.add(new C106475Jv(C36401kF.A0a(it), 2));
        }
        return A0J;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 != 0) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1j() {
        /*
            r6 = this;
            X.1gf r0 = r6.A1Q
            X.C18740tg.A06(r0)
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            int r1 = r0.getCount()
            r0 = 1
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            X.C18740tg.A0C(r0)
            r6.A1l()
            android.view.View r1 = r6.A0F
            if (r1 == 0) goto L_0x0096
            r0 = 2131429255(0x7f0b0787, float:1.8480178E38)
            android.view.View r5 = X.C36361kB.A0G(r1, r0)
            r0 = 2131429257(0x7f0b0789, float:1.8480182E38)
            android.view.View r2 = r1.findViewById(r0)
            r0 = 2131429256(0x7f0b0788, float:1.848018E38)
            android.view.ViewGroup r0 = X.C36411kG.A0O(r1, r0)
            r6.A3O = r0
            r0 = 2131433647(0x7f0b18af, float:1.8489086E38)
            android.view.View r0 = X.C012005e.A02(r1, r0)
            r6.A3N = r0
            android.view.ViewGroup r0 = r6.A08
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r6.A3N
            if (r0 == 0) goto L_0x0049
            r0.setVisibility(r1)
        L_0x0049:
            r5.setVisibility(r1)
            r2.setVisibility(r1)
            android.view.ViewGroup r0 = r6.A3O
            if (r0 == 0) goto L_0x0056
            r0.setVisibility(r1)
        L_0x0056:
            android.widget.ListView r1 = r6.A0A
            if (r1 == 0) goto L_0x005f
            android.view.ViewGroup r0 = r6.A3O
            r1.setEmptyView(r0)
        L_0x005f:
            android.view.ViewGroup r0 = r6.A3O
            if (r0 == 0) goto L_0x008a
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L_0x008a
            r2 = 2131624891(0x7f0e03bb, float:1.8876975E38)
            android.view.LayoutInflater r1 = X.C36381kD.A0J(r6)
            android.view.ViewGroup r0 = r6.A3O
            r1.inflate(r2, r0, r4)
            X.1fA r2 = r6.A1W
            if (r2 == 0) goto L_0x008a
            android.view.ViewGroup r1 = r6.A3O
            if (r1 == 0) goto L_0x008a
            android.view.ViewGroup r0 = r6.A08
            if (r0 == 0) goto L_0x0097
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L_0x0097
        L_0x0087:
            r2.A06(r1, r4)
        L_0x008a:
            android.view.ViewGroup r0 = r6.A3O
            if (r0 == 0) goto L_0x0091
            r0.setVisibility(r3)
        L_0x0091:
            X.1fA r0 = r6.A1W
            r0.A03()
        L_0x0096:
            return
        L_0x0097:
            r4 = 0
            goto L_0x0087
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversationslist.InteropConversationsFragment.A1j():void");
    }

    public void A1U(Menu menu, MenuInflater menuInflater) {
        C36321k7.A0w(menu, menuInflater);
        menuInflater.inflate(R.menu.f11nameremoved, menu);
    }

    public boolean A1X(MenuItem menuItem) {
        Intent A0D;
        String packageName;
        String str;
        int A06 = C36341k9.A06(menuItem);
        if (A06 == R.id.third_party_settings_menu_item) {
            AnonymousClass01I A0h = A0h();
            if (A0h != null) {
                A0D = C36431kI.A0D();
                packageName = A0h.getPackageName();
                str = "com.whatsapp.interopui.setting.InteropSettingsActivity";
            }
            return true;
        } else if (A06 != R.id.third_party_manage_block_users_menu_item) {
            return super.A1X(menuItem);
        } else {
            AnonymousClass01I A0h2 = A0h();
            if (A0h2 != null) {
                A0D = C36431kI.A0D();
                packageName = A0h2.getPackageName();
                str = "com.whatsapp.blocklist.BlockList";
            }
            return true;
        }
        A0D.setClassName(packageName, str);
        A1C(A0D);
        return true;
    }

    public int A1b() {
        return R.layout.f9nameremoved;
    }
}
