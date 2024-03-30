package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.biz.catalog.view.activity.ProductListActivity;
import com.whatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;
import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContactInfoLinkedAccount;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

public class BAK implements AnonymousClass7fY {
    public Object A00;
    public Object A01;
    public final int A02;

    public BAK(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BSQ(C207109uZ r12) {
        C79593ty r1;
        Object obj;
        C134736bW r0;
        List<C134606bJ> list;
        String str;
        AnonymousClass3L6 r02;
        C134766bZ r13;
        C206549ta r03;
        C206549ta r04;
        switch (this.A02) {
            case 0:
                r1 = (C79593ty) this.A01;
                obj = Boolean.valueOf(((AnonymousClass9XI) ((BAN) this.A00).A00).A03.A03(r12));
                break;
            case 1:
                r1 = (C79593ty) this.A01;
                obj = ((AnonymousClass9XI) ((BAN) this.A00).A00).A03.A00(r12);
                break;
            case 2:
                AnonymousClass8W7 r5 = (AnonymousClass8W7) this.A00;
                AnonymousClass9EF r2 = (AnonymousClass9EF) this.A01;
                r5.A0H.A00 = r12;
                if (r2 instanceof AnonymousClass8W9) {
                    AnonymousClass8W9 r22 = (AnonymousClass8W9) r2;
                    if (C1901797e.A00(r22.A00, r5.A0L)) {
                        C193069Js r14 = r22.A00;
                        if (r14.A02 && !r14.A01) {
                            r5.A0I.A03 = true;
                        }
                        r5.A0Q = true;
                        r5.invalidateOptionsMenu();
                        AnonymousClass8VJ r23 = r5.A0H;
                        UserJid userJid = r5.A0L;
                        AnonymousClass00C.A0D(userJid, 0);
                        AnonymousClass8VJ.A01(r23, userJid);
                        C167507yA r15 = r5.A0I;
                        if (r15.A02 && r15.A03) {
                            r5.A0M.A05("catalog_collections_view_tag", true);
                            return;
                        }
                        return;
                    }
                    return;
                } else if ((r2 instanceof AnonymousClass8W8) && C1901797e.A00(r2.A00, r5.A0L)) {
                    C167507yA r05 = r5.A0I;
                    boolean z = true;
                    r05.A03 = true;
                    Integer num = r05.A01;
                    if (num != null) {
                        r5.A0H.A0S(num.intValue());
                        r02 = r5.A0M;
                        z = false;
                    } else if (!r5.A0E.A02) {
                        r5.A0Q = true;
                        r5.invalidateOptionsMenu();
                        AnonymousClass8VJ r24 = r5.A0H;
                        UserJid userJid2 = r5.A0L;
                        AnonymousClass00C.A0D(userJid2, 0);
                        AnonymousClass8VJ.A01(r24, userJid2);
                        r02 = r5.A0M;
                    } else {
                        return;
                    }
                    r02.A05("catalog_collections_view_tag", z);
                    return;
                } else {
                    return;
                }
            case 3:
                UserJid userJid3 = (UserJid) this.A01;
                AnonymousClass8W7 r3 = ((C21110A8v) this.A00).A00;
                r3.A0Q = true;
                r3.invalidateOptionsMenu();
                AnonymousClass8VJ r16 = r3.A0H;
                r16.A00 = r12;
                AnonymousClass00C.A0D(userJid3, 0);
                AnonymousClass8VJ.A01(r16, userJid3);
                C167507yA r17 = r3.A0I;
                if (r17.A02 && r17.A03) {
                    r3.A0M.A05("catalog_collections_view_tag", true);
                    return;
                }
                return;
            case 4:
                ProductListActivity productListActivity = (ProductListActivity) this.A00;
                List list2 = (List) this.A01;
                C168177zp r52 = productListActivity.A0F;
                r52.A01 = r12;
                AnonymousClass00C.A0D(list2, 0);
                List list3 = r52.A05;
                AnonymousClass0X4 A002 = C06880Vl.A00(new C167897zN(list3, list2));
                list3.clear();
                list3.addAll(list2);
                C138566iK r06 = r52.A00;
                if (r06 == null) {
                    throw C36331k8.A0d("productListUpdateCallback");
                }
                A002.A01(r06);
                if (list2.size() > 0) {
                    productListActivity.A00.setVisibility(8);
                }
                if (productListActivity.A0G.A01.A04() != null && AnonymousClass000.A0I(productListActivity.A0G.A01.A04()) == 2) {
                    productListActivity.A0L.A03("plm_details_view_tag", "ProductsCount", String.valueOf(list2.size()));
                    productListActivity.A0L.A05("plm_details_view_tag", true);
                    return;
                }
                return;
            case 5:
                AnonymousClass8VU r4 = (AnonymousClass8VU) this.A00;
                C206439tP r18 = (C206439tP) this.A01;
                if (!r4.A08.A02(r12) || (r0 = r18.A04) == null || (list = r0.A02) == null || list.isEmpty()) {
                    r4.A04.setVisibility(8);
                    r4.A05.setVisibility(8);
                    return;
                }
                TextEmojiLabel textEmojiLabel = r4.A04;
                textEmojiLabel.setVisibility(0);
                ArrayList A0I = AnonymousClass001.A0I();
                for (C134606bJ r9 : list) {
                    C18820ts r8 = r4.A09;
                    boolean A1Y = C36351kA.A1Y(r8);
                    Object[] A0M = AnonymousClass001.A0M();
                    if (A1Y) {
                        A0M[0] = r9.A00.toUpperCase(C36401kF.A0x(r8));
                        A0M[1] = r9.A01.toUpperCase(C36401kF.A0x(r8));
                        str = "%s: %s";
                    } else {
                        A0M[0] = r9.A01.toUpperCase(C36401kF.A0x(r8));
                        A0M[1] = r9.A00.toUpperCase(C36401kF.A0x(r8));
                        str = "%s :%s";
                    }
                    A0I.add(String.format(str, A0M));
                }
                if (A0I.size() > 0) {
                    textEmojiLabel.setVisibility(0);
                    C165607th.A1A(textEmojiLabel, A0I.get(0));
                }
                if (A0I.size() > 1) {
                    TextEmojiLabel textEmojiLabel2 = r4.A05;
                    textEmojiLabel2.setVisibility(0);
                    C165607th.A1A(textEmojiLabel2, A0I.get(1));
                    return;
                }
                return;
            case 6:
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                List<C207269up> list4 = (List) this.A01;
                businessProductListBaseFragment.A1Z().A00 = r12;
                AnonymousClass8VI A1Z = businessProductListBaseFragment.A1Z();
                if (A1Z instanceof BusinessProductListAdapter) {
                    List list5 = A1Z.A00;
                    if (list5.isEmpty()) {
                        A1Z.A0R((C195929Wv) null, list4);
                    } else {
                        for (C207269up r42 : list4) {
                            AnonymousClass00C.A0D(r42, 0);
                            if (r42.A01()) {
                                list5.add(C36431kI.A07(list5), new AnonymousClass8WQ(r42, A1Z.A0L(r42)));
                                A1Z.A08(C36431kI.A07(list5));
                            }
                        }
                    }
                }
                ((C167537yE) businessProductListBaseFragment.A0K.getValue()).A02.A00();
                RecyclerView recyclerView = businessProductListBaseFragment.A00;
                if (recyclerView != null) {
                    recyclerView.post(new C81323wp((Object) businessProductListBaseFragment, 11));
                    return;
                }
                return;
            default:
                AnonymousClass8Z7 r6 = (AnonymousClass8Z7) this.A00;
                C195809Wc r53 = (C195809Wc) this.A01;
                ConversationRowContactInfoLinkedAccount conversationRowContactInfoLinkedAccount = r6.A0C;
                C134766bZ r25 = null;
                if (r12 == null || (r04 = r12.A05) == null) {
                    r13 = null;
                } else {
                    r13 = r04.A00;
                }
                AnonymousClass8Z7.A0C(r13, r6, conversationRowContactInfoLinkedAccount, r53.A01);
                ConversationRowContactInfoLinkedAccount conversationRowContactInfoLinkedAccount2 = r6.A0D;
                if (!(r12 == null || (r03 = r12.A05) == null)) {
                    r25 = r03.A01;
                }
                AnonymousClass8Z7.A0C(r25, r6, conversationRowContactInfoLinkedAccount2, r53.A02);
                View view = r6.A09;
                int i = 0;
                if (!(conversationRowContactInfoLinkedAccount.getVisibility() == 0 && conversationRowContactInfoLinkedAccount2.getVisibility() == 0)) {
                    i = 8;
                }
                view.setVisibility(i);
                return;
        }
        r1.accept(obj);
    }
}
