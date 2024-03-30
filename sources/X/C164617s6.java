package X;

/* renamed from: X.7s6  reason: invalid class name and case insensitive filesystem */
public class C164617s6 implements C22998Azo {
    public Object A00;
    public final int A01;

    public C164617s6(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onError(int i) {
        if (this.A01 != 0) {
            ((C1272667p) this.A00).A01(new AnonymousClass5P1(i));
        } else {
            C36321k7.A1S("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass000.A0u(), i);
        }
    }
}
