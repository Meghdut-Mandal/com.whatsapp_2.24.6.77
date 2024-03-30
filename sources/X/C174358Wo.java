package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Wo  reason: invalid class name and case insensitive filesystem */
public abstract class C174358Wo extends C173838Ti {
    public C22909AyL A00;
    public C178358fo A01;
    public AnonymousClass6VE A02;
    public AnonymousClass4PE A03;
    public AnonymousClass9Y1 A04;
    public UserJid A05;
    public C61223Ba A06;
    public String A07;
    public final AnonymousClass00T A08 = C36431kI.A1I(new C22124Ah9(this));
    public final AnonymousClass00T A09 = C36431kI.A1I(new C22125AhA(this));

    public boolean onCreateOptionsMenu(Menu menu) {
        AnonymousClass00C.A0D(menu, 0);
        MenuItem findItem = menu.findItem(R.id.menu_cart);
        findItem.setVisible(false);
        View A0R = C36441kJ.A0R(findItem, R.layout.f9nameremoved);
        AnonymousClass00C.A0B(A0R);
        C33521fV.A02(A0R);
        View actionView = findItem.getActionView();
        AnonymousClass00C.A0B(actionView);
        C135456cj.A01(actionView, this, 39);
        View actionView2 = findItem.getActionView();
        AnonymousClass00C.A0B(actionView2);
        TextView A0P = C36391kE.A0P(actionView2, R.id.cart_total_quantity);
        if (this.A07 != null) {
            AnonymousClass00C.A0B(A0P);
            A0P.setText(this.A07);
        }
        AnonymousClass00T r3 = this.A08;
        BA7.A01(this, ((C167497y9) r3.getValue()).A00, new C22467An6(findItem, this), 32);
        ((C167497y9) r3.getValue()).A0T();
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        AnonymousClass00C.A0D(bundle, 0);
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("business_owner_jid", A3i());
    }

    public final UserJid A3i() {
        UserJid userJid = this.A05;
        if (userJid != null) {
            return userJid;
        }
        throw C36331k8.A0d("bizJid");
    }

    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        if (bundle == null) {
            parcelable = getIntent().getParcelableExtra("business_owner_jid");
        } else {
            parcelable = bundle.getParcelable("business_owner_jid");
        }
        C18740tg.A06(parcelable);
        AnonymousClass00C.A0B(parcelable);
        UserJid userJid = (UserJid) parcelable;
        AnonymousClass00C.A0D(userJid, 0);
        this.A05 = userJid;
        AnonymousClass00T r3 = this.A09;
        BA7.A01(this, ((C167607yM) r3.getValue()).A00, new C22360AlN(this), 33);
        BA7.A01(this, ((C167607yM) r3.getValue()).A01, new C22361AlO(this), 31);
    }

    public void onResume() {
        super.onResume();
        ((C167607yM) this.A09.getValue()).A02.A00();
    }
}
