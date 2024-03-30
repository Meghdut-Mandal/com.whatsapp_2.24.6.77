package X;

import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;

/* renamed from: X.1zV  reason: invalid class name and case insensitive filesystem */
public class C42801zV extends AnonymousClass07S {
    public final AnonymousClass07S A00;

    public float A06(int i) {
        return this.A00.A06(i);
    }

    public int A07(Object obj) {
        return this.A00.A07(obj);
    }

    public Parcelable A08() {
        return this.A00.A08();
    }

    public void A09() {
        this.A00.A09();
    }

    public void A0A(DataSetObserver dataSetObserver) {
        this.A00.A0A(dataSetObserver);
    }

    public void A0B(DataSetObserver dataSetObserver) {
        this.A00.A0B(dataSetObserver);
    }

    public void A0C(Parcelable parcelable, ClassLoader classLoader) {
        this.A00.A0C(parcelable, classLoader);
    }

    public void A0D(ViewGroup viewGroup) {
        this.A00.A0D(viewGroup);
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        this.A00.A0E(viewGroup, obj, i);
    }

    public CharSequence A0F(int i) {
        AnonymousClass07S r1 = this.A00;
        if (r1.A0H() > 0) {
            return r1.A0F(i % r1.A0H());
        }
        Log.i("infinitepageadapter/getpagetitle/count is zero");
        return null;
    }

    public void A0G(ViewGroup viewGroup) {
        this.A00.A0G(viewGroup);
    }

    public int A0H() {
        AnonymousClass07S r0 = this.A00;
        int A0H = r0.A0H();
        int A0H2 = r0.A0H();
        if (A0H < 214748364) {
            return A0H2 * 10;
        }
        return A0H2;
    }

    public Object A0I(ViewGroup viewGroup, int i) {
        AnonymousClass07S r1 = this.A00;
        if (r1.A0H() > 0) {
            return r1.A0I(viewGroup, i % r1.A0H());
        }
        Log.i("infinitepageadapter/instantiateitem/count is zero");
        return null;
    }

    public void A0J(ViewGroup viewGroup, Object obj, int i) {
        AnonymousClass07S r1 = this.A00;
        if (r1.A0H() <= 0) {
            Log.i("infinitepageadapter/destroyitem/count is zero");
        } else {
            r1.A0J(viewGroup, obj, i % r1.A0H());
        }
    }

    public boolean A0K(View view, Object obj) {
        return this.A00.A0K(view, obj);
    }

    public C42801zV(AnonymousClass07S r1) {
        this.A00 = r1;
    }
}
