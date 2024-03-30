package com.whatsapp.biz.order.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass185;
import X.AnonymousClass19A;
import X.AnonymousClass1A1;
import X.AnonymousClass1FR;
import X.AnonymousClass1KK;
import X.AnonymousClass1NM;
import X.AnonymousClass1RJ;
import X.AnonymousClass3L6;
import X.AnonymousClass3UJ;
import X.AnonymousClass8VA;
import X.AnonymousClass9Dj;
import X.AnonymousClass9HK;
import X.AnonymousClass9HM;
import X.AnonymousClass9MR;
import X.AnonymousClass9OT;
import X.AnonymousClass9R1;
import X.AnonymousClass9UA;
import X.AnonymousClass9Y1;
import X.BA7;
import X.C001700s;
import X.C011004s;
import X.C012005e;
import X.C1502274l;
import X.C165587tf;
import X.C165617ti;
import X.C167577yJ;
import X.C168157zn;
import X.C18740tg;
import X.C18800tq;
import X.C191549Dk;
import X.C191559Dl;
import X.C19460v5;
import X.C195119So;
import X.C195209Sx;
import X.C196089Xp;
import X.C19730wQ;
import X.C19770wU;
import X.C199349fA;
import X.C19970wo;
import X.C199969gL;
import X.C202099l2;
import X.C20310xM;
import X.C207919xK;
import X.C20810yC;
import X.C24631De;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C48732hx;
import X.C48922iH;
import X.C64933Qa;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Hashtable;
import java.util.concurrent.Future;

public class OrderDetailFragment extends Hilt_OrderDetailFragment {
    public ProgressBar A00;
    public C19460v5 A01;
    public C19460v5 A02;
    public AnonymousClass9Dj A03;
    public C191549Dk A04;
    public C191559Dl A05;
    public C19730wQ A06;
    public WaTextView A07;
    public AnonymousClass9UA A08;
    public AnonymousClass9Y1 A09;
    public C195119So A0A;
    public C168157zn A0B;
    public C167577yJ A0C;
    public C202099l2 A0D;
    public AnonymousClass185 A0E;
    public AnonymousClass1NM A0F;
    public C19970wo A0G;
    public C20310xM A0H;
    public C20810yC A0I;
    public UserJid A0J;
    public UserJid A0K;
    public C24631De A0L;
    public AnonymousClass1FR A0M;
    public AnonymousClass3L6 A0N;
    public AnonymousClass9R1 A0O;
    public C64933Qa A0P;
    public C199969gL A0Q;
    public AnonymousClass1A1 A0R;
    public AnonymousClass1RJ A0S;
    public C19770wU A0T;
    public WDSButton A0U;
    public String A0V;
    public C196089Xp A0W;

    public static OrderDetailFragment A03(UserJid userJid, UserJid userJid2, C64933Qa r6, String str, String str2) {
        OrderDetailFragment orderDetailFragment = new OrderDetailFragment();
        Bundle A072 = AnonymousClass001.A07();
        AnonymousClass3UJ.A08(A072, r6);
        A072.putParcelable("extra_key_seller_jid", userJid);
        A072.putParcelable("extra_key_buyer_jid", userJid2);
        A072.putString("extra_key_order_id", str);
        A072.putString("extra_key_token", str2);
        A072.putBoolean("extra_key_enable_create_order", false);
        orderDetailFragment.A17(A072);
        return orderDetailFragment;
    }

    public void A1Q(Bundle bundle) {
        this.A0N.A00(774769843, "order_view_tag", "OrderDetailFragment");
        super.A1Q(bundle);
        this.A0W = new C196089Xp(this.A0A, this.A0O);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object obj;
        View inflate = layoutInflater.inflate(R.layout.f9nameremoved, viewGroup, false);
        C36361kB.A18(inflate.findViewById(R.id.order_detail_close_btn), this, 2);
        this.A00 = (ProgressBar) C012005e.A02(inflate, R.id.order_detail_loading_spinner);
        this.A0S = C36341k9.A0Y(inflate, R.id.message_btn_layout);
        RecyclerView recyclerView = (RecyclerView) C012005e.A02(inflate, R.id.order_detail_recycler_view);
        recyclerView.A0U = true;
        Parcelable parcelable = A0b().getParcelable("extra_key_seller_jid");
        C18740tg.A06(parcelable);
        UserJid userJid = (UserJid) parcelable;
        this.A0K = userJid;
        C191559Dl r9 = this.A05;
        C196089Xp r1 = this.A0W;
        C18800tq r0 = r9.A00.A02;
        C196089Xp r11 = r1;
        C168157zn r92 = new C168157zn((C191549Dk) r9.A00.A01.A05.get(), r11, this, C36341k9.A0T(r0), C36341k9.A0V(r0), userJid);
        this.A0B = r92;
        recyclerView.setAdapter(r92);
        C011004s.A09(recyclerView, true);
        inflate.setMinimumHeight(A1m());
        Parcelable parcelable2 = A0b().getParcelable("extra_key_buyer_jid");
        C18740tg.A06(parcelable2);
        this.A0J = (UserJid) parcelable2;
        String string = A0b().getString("extra_key_order_id");
        C18740tg.A06(string);
        this.A0V = string;
        String string2 = A0b().getString("extra_key_token");
        C18740tg.A06(string2);
        C64933Qa A032 = AnonymousClass3UJ.A03(A0b(), "");
        this.A0P = A032;
        String str = this.A0V;
        C167577yJ r02 = (C167577yJ) C165617ti.A0A(new C207919xK(this.A03, this.A0K, A032, string2, str), this).A00(C167577yJ.class);
        this.A0C = r02;
        BA7.A01(A0m(), r02.A02, this, 4);
        BA7.A01(A0m(), this.A0C.A01, this, 3);
        this.A07 = C36401kF.A0Q(inflate, R.id.order_detail_title);
        C167577yJ r03 = this.A0C;
        if (r03.A06.A0M(r03.A0C)) {
            this.A07.setText(R.string.f12nameremoved);
        } else {
            BA7.A01(A0m(), this.A0C.A03, this, 5);
            C167577yJ r8 = this.A0C;
            UserJid userJid2 = this.A0K;
            AnonymousClass00C.A0D(userJid2, 0);
            C36391kE.A1R(r8.A0E, r8, userJid2, 44);
        }
        C167577yJ r04 = this.A0C;
        AnonymousClass9OT r12 = r04.A08;
        UserJid userJid3 = r04.A0C;
        String str2 = r04.A0F;
        String str3 = r04.A0G;
        Object obj2 = r12.A05.A00.get(str2);
        if (obj2 != null) {
            C001700s r05 = r12.A00;
            if (r05 != null) {
                r05.A0C(obj2);
            }
        } else {
            AnonymousClass9MR r20 = new AnonymousClass9MR(userJid3, str2, str3, r12.A03, r12.A02);
            AnonymousClass3L6 r15 = r12.A0B;
            AnonymousClass19A r10 = r12.A0A;
            AnonymousClass1KK r93 = r12.A04;
            AnonymousClass9HM r82 = r12.A08;
            C199349fA r2 = r12.A09;
            AnonymousClass8VA r17 = new AnonymousClass8VA(r93, r12.A07, r20, r82, r2, r10, r15);
            AnonymousClass9HK r22 = r12.A06;
            synchronized (r22) {
                Hashtable hashtable = r22.A00;
                obj = (Future) hashtable.get(str2);
                if (obj == null) {
                    String A092 = r17.A02.A09();
                    r17.A03.A02("order_view_tag");
                    r17.A01.A02(r17, AnonymousClass8VA.A00(r17, A092), A092, 248);
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("GetOrderProtocol/sendGetOrderRequest/jid=");
                    C36321k7.A1N(r17.A00.A02, A0u);
                    obj = r17.A04;
                    hashtable.put(str2, obj);
                    C1502274l.A00(r22.A01, r22, obj, str2, 19);
                }
            }
            C36391kE.A1R(r12.A0C, r12, obj, 43);
        }
        AnonymousClass9Y1 r23 = this.A09;
        C195209Sx A033 = C36321k7.A03(r23);
        C36321k7.A0p(A033, this.A09);
        C36401kF.A1F(A033, 35);
        C36411kG.A1G(A033, 45);
        A033.A00 = this.A0K;
        A033.A0F = this.A0V;
        r23.A03(A033);
        if (A0b().getBoolean("extra_key_enable_create_order")) {
            View A022 = C012005e.A02(inflate, R.id.button_container);
            A022.setVisibility(0);
            TextView A0O2 = C36391kE.A0O(A022, R.id.create_order);
            BA7.A01(A0m(), this.A0C.A00, A0O2, 2);
            A0O2.setOnClickListener(new C48922iH(1, string2, this));
            A0O2.setText(new int[]{R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved}[C165587tf.A05(this.A0I)]);
            View A023 = C012005e.A02(A022, R.id.decline_order);
            A023.setVisibility(0);
            C48732hx.A00(A023, this, 44);
        }
        this.A0F.A0D(this.A0K, 0);
        return inflate;
    }

    public void A1H() {
        super.A1H();
        this.A0W.A00();
        this.A0N.A05("order_view_tag", false);
    }
}
