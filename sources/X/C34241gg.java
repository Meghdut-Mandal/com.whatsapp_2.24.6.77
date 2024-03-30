package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.Filter;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1gg  reason: invalid class name and case insensitive filesystem */
public class C34241gg extends Filter {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C34231gf A02;

    public C34241gg(C34231gf r1) {
        this.A02 = r1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        r10.add(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r13) {
        /*
            r12 = this;
            java.lang.String r0 = "conversations/filter/performFiltering"
            X.14g r3 = new X.14g
            r3.<init>((java.lang.String) r0)
            r5 = 1
            r12.A00 = r5
            X.1gf r9 = r12.A02
            X.15b r2 = r9.A01
            X.15c r1 = r2.A01
            X.15c r0 = X.C226115c.ALL
            r4 = 0
            if (r1 == r0) goto L_0x0016
            r5 = 0
        L_0x0016:
            r12.A01 = r5
            boolean r0 = r2.A01()
            if (r0 != 0) goto L_0x0040
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0040
            com.whatsapp.conversationslist.ConversationsFragment r0 = r9.A08
            java.util.List r5 = r0.A1d()
        L_0x002a:
            android.widget.Filter$FilterResults r1 = new android.widget.Filter$FilterResults
            r1.<init>()
            r1.values = r5
            if (r5 != 0) goto L_0x0039
            r1.count = r4
        L_0x0035:
            r3.A01()
            return r1
        L_0x0039:
            int r0 = r5.size()
            r1.count = r0
            goto L_0x0035
        L_0x0040:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.whatsapp.conversationslist.ConversationsFragment r7 = r9.A08
            X.1Ri r0 = r7.A2A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00c1
            X.15b r0 = r9.A01
            java.util.List r0 = r0.A04
            if (r0 == 0) goto L_0x00c1
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00c1
            r12.A01 = r4
            X.15b r0 = r9.A01
            java.util.List r0 = r0.A04
            if (r0 != 0) goto L_0x006a
            X.09w r0 = X.C023409w.A00
        L_0x006a:
            java.util.Iterator r11 = r0.iterator()
        L_0x006e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r11.next()
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r1.hashCode()
            switch(r0) {
                case -1730152220: goto L_0x0082;
                case 72525144: goto L_0x009c;
                case 1827283464: goto L_0x00aa;
                default: goto L_0x0081;
            }
        L_0x0081:
            goto L_0x006e
        L_0x0082:
            java.lang.String r0 = "CONTACTS_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006e
            X.1A5 r8 = r7.A1m
            X.0yC r2 = r7.A21
            r1 = 5868(0x16ec, float:8.223E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            X.3fz r6 = new X.3fz
            r6.<init>(r8, r0)
            goto L_0x00bd
        L_0x009c:
            java.lang.String r0 = "GROUP_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006e
            X.3fs r6 = new X.3fs
            r6.<init>()
            goto L_0x00bd
        L_0x00aa:
            java.lang.String r0 = "UNREAD_FILTER"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006e
            X.0yC r2 = r7.A21
            X.12q r1 = r7.A1l
            X.1LU r0 = r7.A1z
            X.3g0 r6 = new X.3g0
            r6.<init>(r1, r0, r2)
        L_0x00bd:
            r10.add(r6)
            goto L_0x006e
        L_0x00c1:
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x0199
            X.1CR r0 = r9.A05
            java.util.Set r2 = r0.A0X()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.1A6 r0 = r7.A1F
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r11 = r0.iterator()
        L_0x00dc:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0138
            java.lang.Object r1 = r11.next()
            X.11F r1 = (X.AnonymousClass11F) r1
            boolean r0 = X.AnonymousClass1A5.A00(r1, r10)
            if (r0 == 0) goto L_0x00dc
            r6.add(r1)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L_0x0101
            r8 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r1, r8)
            r5.add(r4, r0)
            goto L_0x00dc
        L_0x0101:
            X.1Ri r0 = r7.A2A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0119
            X.12q r0 = r7.A1l
            boolean r0 = r0.A0N(r1)
            if (r0 != 0) goto L_0x00dc
            X.12q r0 = r7.A1l
            boolean r0 = r0.A0Q(r1)
            if (r0 != 0) goto L_0x00dc
        L_0x0119:
            boolean r0 = r12.A01
            if (r0 == 0) goto L_0x012e
            r0 = 2131893873(0x7f121e71, float:1.9422535E38)
            java.lang.String r8 = r7.A0n(r0)
            X.3g7 r0 = new X.3g7
            r0.<init>(r8)
            r5.add(r0)
            r12.A01 = r4
        L_0x012e:
            r8 = 2
            X.5Jv r0 = new X.5Jv
            r0.<init>(r1, r8)
            r5.add(r0)
            goto L_0x00dc
        L_0x0138:
            r3.A00()
            X.1Ri r0 = r7.A2A
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0196
            X.1A5 r0 = r7.A1m
            java.util.List r0 = r0.A03()
            java.util.Iterator r8 = r0.iterator()
        L_0x014d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0196
            java.lang.Object r2 = r8.next()
            X.141 r2 = (X.AnonymousClass141) r2
            X.3IL r0 = r2.A0F
            if (r0 == 0) goto L_0x014d
            java.lang.Class<X.11F> r1 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r2.A06(r1)
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x014d
            com.whatsapp.jid.Jid r0 = r2.A06(r1)
            X.C18740tg.A06(r0)
            X.11F r0 = (X.AnonymousClass11F) r0
            boolean r0 = X.AnonymousClass1A5.A00(r0, r10)
            if (r0 == 0) goto L_0x014d
            boolean r0 = r12.A00
            if (r0 == 0) goto L_0x018d
            r0 = 2131893874(0x7f121e72, float:1.9422537E38)
            java.lang.String r1 = r7.A0n(r0)
            X.3g7 r0 = new X.3g7
            r0.<init>(r1)
            r5.add(r0)
            r12.A00 = r4
        L_0x018d:
            X.5Jt r0 = new X.5Jt
            r0.<init>(r2)
            r5.add(r0)
            goto L_0x014d
        L_0x0196:
            r3.A00()
        L_0x0199:
            r1 = r13
            java.lang.String r1 = (java.lang.String) r1
            X.0ts r0 = r9.A04
            java.util.ArrayList r8 = X.C202859mm.A03(r0, r1)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01c5
            X.16v r6 = r7.A2s
            X.1A5 r2 = r7.A1m
            X.171 r1 = r7.A17
            X.3g2 r0 = new X.3g2
            r0.<init>(r1, r2, r6, r8)
            r10.add(r0)
            X.1S3 r1 = r7.A3e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r10)
            r1.A09 = r0
            r1.A04(r13)
            r1.A05(r8)
        L_0x01c5:
            X.1S3 r6 = r7.A3e
            X.15b r1 = r9.A01
            java.util.List r0 = r1.A03
            if (r0 != 0) goto L_0x01cf
            X.09w r0 = X.C023409w.A00
        L_0x01cf:
            r6.A0C = r0
            r6.A00 = r4
            r0 = 100
            r6.A01 = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.15c r1 = r1.A01
            X.15c r0 = X.C226115c.CHATS
            if (r1 == r0) goto L_0x01f0
            X.0xu r1 = r7.A1p
            r0 = 0
            android.util.Pair r0 = r1.A0A(r0, r6, r0)
            java.lang.Object r0 = r0.second
            java.util.Collection r0 = (java.util.Collection) r0
            r2.addAll(r0)
        L_0x01f0:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x01fe:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0216
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            boolean r0 = r1.A15
            if (r0 == 0) goto L_0x0212
            r8.add(r1)
            goto L_0x01fe
        L_0x0212:
            r6.add(r1)
            goto L_0x01fe
        L_0x0216:
            int r0 = r8.size()
            if (r0 <= 0) goto L_0x0244
            r0 = 2131893879(0x7f121e77, float:1.9422547E38)
            java.lang.String r1 = r7.A0n(r0)
            X.3g7 r0 = new X.3g7
            r0.<init>(r1)
            r5.add(r0)
            java.util.Iterator r2 = r8.iterator()
        L_0x022f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0244
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.5Js r0 = new X.5Js
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x022f
        L_0x0244:
            int r0 = r6.size()
            if (r0 <= 0) goto L_0x0272
            r0 = 2131893876(0x7f121e74, float:1.942254E38)
            java.lang.String r1 = r7.A0n(r0)
            X.3g7 r0 = new X.3g7
            r0.<init>(r1)
            r5.add(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x025d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0272
            java.lang.Object r1 = r2.next()
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            X.5Js r0 = new X.5Js
            r0.<init>(r1)
            r5.add(r0)
            goto L_0x025d
        L_0x0272:
            r3.A00()
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34241gg.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        int i;
        boolean z;
        List list;
        Object r1;
        C34231gf r6 = this.A02;
        ConversationsFragment conversationsFragment = r6.A08;
        View view = conversationsFragment.A0F;
        if (view != null) {
            if (filterResults.count != 0) {
                i = R.id.search_no_matches;
                view.findViewById(i).setVisibility(8);
            } else if (r6.A01.A01() || !TextUtils.isEmpty(charSequence)) {
                View findViewById = view.findViewById(R.id.search_no_matches);
                findViewById.setVisibility(0);
                if (conversationsFragment.A0A != null && !conversationsFragment.A2A.A00()) {
                    conversationsFragment.A0A.setEmptyView(findViewById);
                }
                view.findViewById(R.id.conversations_empty_no_contacts).setVisibility(8);
                view.findViewById(R.id.conversations_empty_permission_denied).setVisibility(8);
                i = R.id.conversations_empty_nux;
                view.findViewById(i).setVisibility(8);
            } else {
                view.findViewById(R.id.search_no_matches).setVisibility(8);
                ConversationsFragment.A0I(conversationsFragment);
            }
            List list2 = (List) filterResults.values;
            conversationsFragment.A36 = list2;
            if (list2 == null) {
                conversationsFragment.A36 = conversationsFragment.A1d();
            }
            String str = (String) charSequence;
            r6.A01.A02 = str;
            r6.A00 = C202859mm.A03(r6.A04, str);
            boolean z2 = true;
            if ((!TextUtils.isEmpty(r6.A01.A02) || r6.A01.A01()) && (!conversationsFragment.A2A.A00() || conversationsFragment.A36.isEmpty())) {
                z = false;
            } else {
                z = true;
            }
            List list3 = conversationsFragment.A36;
            if (list3 != null && !list3.isEmpty()) {
                z2 = false;
            }
            if (!z && z2) {
                C226015b r8 = r6.A01;
                View view2 = conversationsFragment.A0F;
                if (view2 == null) {
                    Log.i("conversations/view/null");
                } else {
                    conversationsFragment.A08.setVisibility(8);
                    conversationsFragment.A1r(false);
                    if (!TextUtils.isEmpty(r8.A02)) {
                        ((TextView) view2.findViewById(R.id.search_no_matches)).setText(conversationsFragment.A0o(R.string.f12nameremoved, r8.A02));
                    } else {
                        ((TextView) view2.findViewById(R.id.search_no_matches)).setText(R.string.f12nameremoved);
                    }
                }
            }
            if (conversationsFragment.A2A.A00() && ConversationsFragment.A0X(conversationsFragment) && conversationsFragment.A36.isEmpty()) {
                List list4 = r6.A01.A04;
                if (list4 == null || list4.isEmpty()) {
                    List list5 = r6.A01.A03;
                    if (list5 != null && !list5.isEmpty()) {
                        C226015b r3 = r6.A01;
                        if (r3.A01 == C226115c.CHATS) {
                            list = conversationsFragment.A36;
                            List list6 = r3.A03;
                            if (list6 == null) {
                                list6 = C023409w.A00;
                            }
                            r1 = new C71013g5((String) list6.get(0));
                        }
                    }
                } else {
                    list = conversationsFragment.A36;
                    List list7 = r6.A01.A04;
                    if (list7 == null) {
                        list7 = C023409w.A00;
                    }
                    r1 = new C71023g6((String) list7.get(0));
                }
                list.add(r1);
            }
            r6.notifyDataSetChanged();
            conversationsFragment.A1l();
            ListView listView = conversationsFragment.A0A;
            if (listView != null && listView.getCount() > 0 && !ConversationsFragment.A0X(conversationsFragment)) {
                conversationsFragment.A0A.setSelection(0);
            }
            long j = conversationsFragment.A04;
            if (j > 0) {
                conversationsFragment.A2l.A00(5, SystemClock.uptimeMillis() - j);
                conversationsFragment.A04 = 0;
            }
        }
    }
}
