package X;

import android.content.Context;

/* renamed from: X.7rO  reason: invalid class name and case insensitive filesystem */
public class C164177rO implements C157577dl {
    public Object A00;
    public Object A01;
    public final int A02;

    public C164177rO(Object obj, Object obj2, int i) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public void dispose() {
        switch (this.A02) {
            case 0:
                ((AnonymousClass63C) this.A00).A03.A0F(this.A01);
                return;
            case 1:
                ((C137196fk) this.A01).A02.add(this.A00);
                return;
            default:
                ((Context) this.A01).getApplicationContext().unregisterComponentCallbacks((C133476Yq) this.A00);
                return;
        }
    }
}
