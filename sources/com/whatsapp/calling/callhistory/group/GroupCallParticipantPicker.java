package com.whatsapp.calling.callhistory.group;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass040;
import X.AnonymousClass07B;
import X.AnonymousClass0A2;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass19R;
import X.AnonymousClass1ND;
import X.AnonymousClass22g;
import X.AnonymousClass2A6;
import X.AnonymousClass2GG;
import X.AnonymousClass4UZ;
import X.AnonymousClass6O7;
import X.AnonymousClass6W1;
import X.AnonymousClass755;
import X.C023109s;
import X.C023509x;
import X.C109325Xd;
import X.C20810yC;
import X.C229516p;
import X.C33521fV;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import X.C43302Gi;
import X.C50952mu;
import X.C53422rI;
import X.C80213v2;
import X.C80223v3;
import X.C81283wl;
import X.C81563xD;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GroupCallParticipantPicker extends AnonymousClass2GG implements AnonymousClass4UZ {
    public GroupCallParticipantSuggestionsViewModel A00 = null;
    public AnonymousClass1ND A01;
    public AnonymousClass005 A02;
    public AnonymousClass005 A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;
    public AnonymousClass005 A06;
    public AnonymousClass005 A07;
    public ArrayList A08;
    public boolean A09 = true;
    public boolean A0A = false;
    public final List A0B = AnonymousClass001.A0I();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r3.A0c.isEmpty() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A10() {
        /*
            r3 = this;
            java.lang.String r0 = r3.A0N
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = r3.A0c
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0013
        L_0x0011:
            r2 = 8
        L_0x0013:
            java.util.List r0 = r3.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x0019:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = X.C36431kI.A0K(r1)
            r0.setVisibility(r2)
            goto L_0x0019
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker.A10():void");
    }

    public static void A11(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.A00 != null) {
            boolean A1a = C36421kH.A1a(groupCallParticipantPicker.A0N);
            Iterator it = groupCallParticipantPicker.A3o().iterator();
            while (it.hasNext()) {
                Object next = it.next();
                AnonymousClass6W1 A012 = AnonymousClass22g.A01(groupCallParticipantPicker);
                AnonymousClass6O7 r5 = groupCallParticipantPicker.A00.A01;
                AnonymousClass00C.A0D(next, 0);
                A012.A03.execute(new AnonymousClass755(A012, next, r5, 10, A1a));
            }
        }
    }

    public void A3s(int i) {
        if (i > 0 || getSupportActionBar() == null || A14(this)) {
            super.A3s(i);
            return;
        }
        boolean A13 = A13(this);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (A13) {
            Resources resources = getResources();
            int size = this.A0P.size();
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, this.A0P.size(), 0);
            supportActionBar.A0P(resources.getQuantityString(R.plurals.f10nameremoved, size, A0L));
            return;
        }
        supportActionBar.A0H(R.string.f12nameremoved);
    }

    public void A42(ArrayList arrayList) {
        ArrayList A0u = C36401kF.A0u(getIntent(), UserJid.class, "jids");
        ArrayList arrayList2 = arrayList;
        if (A0u.isEmpty()) {
            C229516p.A0G(this.A09.A05, arrayList2, 2, false, false, false);
            if (this.A08 == null && this.A0D.A07(6742) == 1) {
                ArrayList A0I = AnonymousClass001.A0I();
                this.A08 = A0I;
                C229516p.A0G(this.A09.A05, A0I, 2, true, false, false);
                Collections.sort(this.A08, new C81563xD(this.A0B, this.A0I));
                arrayList.addAll(this.A08);
                return;
            }
            return;
        }
        A12(this, arrayList, A0u);
    }

    public boolean A49() {
        if (!(this instanceof GroupCallParticipantPickerSheet)) {
            C20810yC r1 = this.A0D;
            if (r1.A07(5370) <= 0 || !r1.A0E(5757)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public boolean A4A() {
        if (this instanceof GroupCallParticipantPickerSheet) {
            return false;
        }
        return AnonymousClass000.A1R(this.A0D.A07(5370));
    }

    public void onCreate(Bundle bundle) {
        WDSSearchBar wDSSearchBar;
        if (bundle == null) {
            this.A0A = true;
        }
        super.onCreate(bundle);
        if (A4A() && (wDSSearchBar = this.A0M) != null) {
            wDSSearchBar.A07.setTrailingButtonIcon(C50952mu.A00);
            this.A0M.A07.setHint((int) R.string.f12nameremoved);
        }
    }

    public static void A12(GroupCallParticipantPicker groupCallParticipantPicker, ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36381kD.A1H(groupCallParticipantPicker.A09, C36401kF.A0a(it), arrayList);
        }
    }

    public static boolean A13(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.getIntent().getIntExtra("call_from_ui", 0) != 44 || !groupCallParticipantPicker.A4A()) {
            return false;
        }
        return true;
    }

    public static boolean A14(GroupCallParticipantPicker groupCallParticipantPicker) {
        if (groupCallParticipantPicker.getIntent().getIntExtra("call_from_ui", 0) != 16 || !groupCallParticipantPicker.A4A()) {
            return false;
        }
        return true;
    }

    public void A3i(ListAdapter listAdapter) {
        int intExtra = getIntent().getIntExtra("hidden_jids", 0);
        if (intExtra > 0) {
            ListView listView = getListView();
            View inflate = getLayoutInflater().inflate(R.layout.f9nameremoved, listView, false);
            listView.addFooterView(inflate, (Object) null, false);
            TextView A0P = C36391kE.A0P(inflate, R.id.group_members_not_shown);
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1L(A0L, intExtra, 0);
            A0P.setText(this.A0I.A0L(A0L, R.plurals.f10nameremoved, (long) intExtra));
            C33521fV.A01(inflate);
        }
        super.A3i(listAdapter);
    }

    public void A3q() {
        if (A49()) {
            if (this.A00 == null) {
                this.A00 = (GroupCallParticipantSuggestionsViewModel) C36441kJ.A0b(this).A00(GroupCallParticipantSuggestionsViewModel.class);
                AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
                A012.A03.execute(C80213v2.A00(A012, 49));
            }
            GroupCallParticipantSuggestionsViewModel groupCallParticipantSuggestionsViewModel = this.A00;
            List list = this.A0c;
            AnonymousClass00C.A0D(list, 0);
            if (groupCallParticipantSuggestionsViewModel.A03 == null && groupCallParticipantSuggestionsViewModel.A01 == null) {
                AnonymousClass040 A002 = C109325Xd.A00(groupCallParticipantSuggestionsViewModel);
                groupCallParticipantSuggestionsViewModel.A03 = AnonymousClass0A2.A02(C023109s.A00, AnonymousClass19R.A01, new GroupCallParticipantSuggestionsViewModel$loadSuggestions$1(groupCallParticipantSuggestionsViewModel, list, (C023509x) null), A002);
            }
        }
        super.A3q();
    }

    public void A3z(AnonymousClass141 r8) {
        super.A3z(r8);
        Jid A0h = C36431kI.A0h(r8);
        if (A0h != null && this.A00 != null) {
            AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
            boolean A1a = C36421kH.A1a(this.A0N);
            A012.A03.execute(new AnonymousClass755(A0h, A012, this.A00.A01, 9, A1a));
        }
    }

    public void A40(AnonymousClass141 r8, int i) {
        super.A40(r8, i);
        AnonymousClass11F r3 = r8.A0H;
        if (r3 != null && this.A00 != null) {
            AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
            boolean A1a = C36421kH.A1a(this.A0N);
            A012.A03.execute(new AnonymousClass755(A012, r3, this.A00.A01, 11, A1a));
        }
    }

    public void A41(String str) {
        int i;
        super.A41(str);
        A10();
        if (A49()) {
            AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            A012.A03.execute(new C81283wl((Object) A012, i, 23));
        }
    }

    public void A46(List list) {
        WDSSearchBar wDSSearchBar;
        int i;
        if (list.size() > 0 && A4A()) {
            if (C36421kH.A1a(this.A0N)) {
                i = R.string.f12nameremoved;
            } else if (!A49() || this.A09) {
                i = R.string.f12nameremoved;
            }
            list.add(0, new C43302Gi(getString(i)));
        }
        super.A46(list);
        if (this.A0A) {
            this.A0A = false;
            if ((A14(this) || (A13(this) && this.A0D.A07(5370) != 1)) && (wDSSearchBar = this.A0M) != null) {
                C53422rI.A00(wDSSearchBar.A07, new AnonymousClass2A6(this, 1));
            }
        }
    }

    public void B2c(AnonymousClass141 r1) {
        super.B2c(r1);
        A10();
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.A00 != null) {
            AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
            A012.A03.execute(C80213v2.A00(A012, 48));
        }
    }

    public boolean onSearchRequested() {
        boolean onSearchRequested = super.onSearchRequested();
        if (A49()) {
            AnonymousClass6W1 A012 = AnonymousClass22g.A01(this);
            C80223v3.A01(A012.A03, A012, 1);
        }
        return onSearchRequested;
    }
}
