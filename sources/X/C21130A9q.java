package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.A9q  reason: case insensitive filesystem */
public abstract class C21130A9q implements C88704Ts {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public PaymentInviteFragment A04;
    public Button A05;
    public GridView A06;
    public ImageButton A07;
    public TextView A08;
    public TextView A09;
    public AnonymousClass185 A0A;
    public Button A0B;
    public final AnonymousClass171 A0C;
    public final boolean A0D;
    public final AnonymousClass16D A0E;
    public final C27731Pn A0F;
    public final String A0G;

    public /* bridge */ /* synthetic */ void B1n(Object obj) {
        AnonymousClass9HZ r5 = (AnonymousClass9HZ) obj;
        Context context = this.A00.getContext();
        C18740tg.A06(r5);
        if (1 == r5.A00) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(8);
            return;
        }
        this.A03.setVisibility(8);
        Object obj2 = r5.A01;
        C18740tg.A06(obj2);
        A00(context, (List) obj2);
    }

    public void BkP(View view) {
        this.A00 = view;
        this.A05 = (Button) C012005e.A02(view, R.id.invite_button);
        this.A0B = (Button) C012005e.A02(view, R.id.secondary_button);
        this.A06 = (GridView) C012005e.A02(view, R.id.selected_items);
        this.A02 = C36411kG.A0O(view, R.id.invite_ui_content);
        this.A03 = C36411kG.A0O(view, R.id.invite_ui_loader);
        this.A07 = (ImageButton) C012005e.A02(view, R.id.back);
        this.A08 = C36391kE.A0O(view, R.id.payment_invite_bottom_sheet_body);
        this.A09 = C36391kE.A0O(view, R.id.payment_invite_bottom_sheet_title);
        this.A01 = C36411kG.A0O(view, R.id.incentive_info_container);
    }

    public C21130A9q(AnonymousClass16D r1, AnonymousClass185 r2, AnonymousClass171 r3, C27731Pn r4, String str, boolean z) {
        this.A0D = z;
        this.A0F = r4;
        this.A0E = r1;
        this.A0C = r3;
        this.A0G = str;
        this.A0A = r2;
    }

    public void A00(Context context, List list) {
        View view;
        Context context2 = context;
        if (list.size() == 1) {
            UserJid userJid = (UserJid) list.get(0);
            String A0M = this.A0C.A0M(this.A0E.A0D(userJid));
            AnonymousClass3L0 A012 = this.A0A.A01(userJid);
            if (A012 == null || !A012.A02()) {
                this.A05.setText(R.string.f12nameremoved);
                C36341k9.A0s(context, this.A08, new Object[]{A0M}, R.string.f12nameremoved);
                C36341k9.A0s(context, this.A09, new Object[]{A0M}, R.string.f12nameremoved);
                if (this.A0D) {
                    C36341k9.A0s(context, C36391kE.A0O(this.A00, R.id.incentive_info_text), new Object[]{A0M}, R.string.f12nameremoved);
                    view = this.A01;
                    view.setVisibility(0);
                }
            } else {
                this.A04.A1b(true);
            }
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0I.add(this.A0E.A0D((AnonymousClass11F) it.next()));
            }
            this.A06.setAdapter(new C37841nI(context2, context, this.A0F.A05(context, "payment-invite-view-component"), this, A0I, A0I));
            view = this.A06;
            view.setVisibility(0);
        }
        C36421kH.A12(this.A05, this, 9);
        C36371kC.A1F(this.A07, this, list, 43);
        C36421kH.A12(this.A0B, this, 10);
        this.A02.setVisibility(0);
    }

    public int BDU() {
        return R.layout.f9nameremoved;
    }
}
