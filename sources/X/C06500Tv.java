package X;

import java.util.ArrayList;

/* renamed from: X.0Tv  reason: invalid class name and case insensitive filesystem */
public abstract class C06500Tv {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ C07560Yg A02;

    public C06500Tv(C07560Yg r2, Object obj) {
        this.A02 = r2;
        this.A00 = obj;
    }

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0M;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
