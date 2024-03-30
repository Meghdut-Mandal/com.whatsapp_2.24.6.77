package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.22h  reason: invalid class name */
public abstract class AnonymousClass22h extends C38571pK implements AnonymousClass4UM {
    public AnonymousClass02E A00;
    public C62503Gk A01;

    public void Bie() {
    }

    public void Bif() {
    }

    public abstract void setContentView(int i);

    public static void A00(AnonymousClass22h r3) {
        C62503Gk r0 = r3.A01;
        if (r0 == null) {
            AnonymousClass02E r2 = r3.A00;
            AnonymousClass00C.A0D(r2, 0);
            C19570wA.A00(C27101Mx.class, r2);
            r0 = new C62503Gk();
            r3.A01 = r0;
        }
        r0.A02 = r3;
    }

    public AnonymousClass02E getHost() {
        AnonymousClass02E r0 = this.A00;
        C18740tg.A06(r0);
        return r0;
    }

    public ListAdapter getListAdapter() {
        ListAdapter listAdapter;
        C62503Gk r1 = this.A01;
        synchronized (r1) {
            listAdapter = r1.A00;
        }
        return listAdapter;
    }

    public ListView getListView() {
        C62503Gk r2 = this.A01;
        if (r2.A01 == null) {
            r2.A02.setContentView(17367060);
        }
        ListView listView = r2.A01;
        C18740tg.A04(listView);
        return listView;
    }

    public AnonymousClass155 getWaBaseActivity() {
        AnonymousClass02E r0 = this.A00;
        if (r0 != null) {
            AnonymousClass01I A0h = r0.A0h();
            if (A0h instanceof AnonymousClass155) {
                return (AnonymousClass155) A0h;
            }
        }
        try {
            return (AnonymousClass155) C36391kE.A0E(this);
        } catch (IllegalStateException e) {
            Log.e("No activity available", e);
            return null;
        }
    }

    public void setListAdapter(ListAdapter listAdapter) {
        this.A01.A01(listAdapter);
    }

    public void setSelection(int i) {
        ListView listView = this.A01.A01;
        C18740tg.A04(listView);
        listView.setSelection(i);
    }

    public AnonymousClass22h(Context context) {
        super(context);
        A00(this);
    }

    public void BiV() {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        waBaseActivity.A3O();
    }

    public Dialog BiX(int i) {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A3K(i);
    }

    public boolean BiY(Menu menu) {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A3g(menu);
    }

    public boolean Bia(int i, KeyEvent keyEvent) {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A3f(i, keyEvent);
    }

    public boolean Bib(int i, KeyEvent keyEvent) {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return AnonymousClass155.A0R(keyEvent, waBaseActivity, i);
    }

    public boolean Bic(Menu menu) {
        AnonymousClass155 waBaseActivity = getWaBaseActivity();
        Objects.requireNonNull(waBaseActivity);
        return waBaseActivity.A3h(menu);
    }

    public void Big() {
        Objects.requireNonNull(getWaBaseActivity());
    }

    public void Bid(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    public void setHost(AnonymousClass02E r1) {
        this.A00 = r1;
    }
}
