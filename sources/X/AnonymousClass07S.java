package X;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.07S  reason: invalid class name */
public abstract class AnonymousClass07S {
    public DataSetObserver A00;
    public final DataSetObservable A01 = new DataSetObservable();

    public float A06(int i) {
        return 1.0f;
    }

    public int A07(Object obj) {
        return -1;
    }

    public Parcelable A08() {
        return null;
    }

    public void A09() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.A00;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.A01.notifyChanged();
    }

    public void A0C(Parcelable parcelable, ClassLoader classLoader) {
    }

    public CharSequence A0F(int i) {
        return null;
    }

    public abstract int A0H();

    public abstract Object A0I(ViewGroup viewGroup, int i);

    public abstract void A0J(ViewGroup viewGroup, Object obj, int i);

    public abstract boolean A0K(View view, Object obj);

    public void A0A(DataSetObserver dataSetObserver) {
        this.A01.registerObserver(dataSetObserver);
    }

    public void A0B(DataSetObserver dataSetObserver) {
        this.A01.unregisterObserver(dataSetObserver);
    }

    public void A0D(ViewGroup viewGroup) {
    }

    public void A0G(ViewGroup viewGroup) {
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
    }
}
