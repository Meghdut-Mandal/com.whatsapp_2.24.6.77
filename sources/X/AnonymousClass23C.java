package X;

/* renamed from: X.23C  reason: invalid class name */
public class AnonymousClass23C extends C64503Og implements Runnable, AnonymousClass4RS {
    public int A00 = 60;
    public C177538dx A01;
    public final C24381Cf A02;

    public AnonymousClass23C(C24381Cf r2, C177538dx r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public void run() {
        this.A01.cancel();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BroadcastListResponseHandler/request success/");
        C36321k7.A1Y(A0u, this.A00);
    }

    public void Bou(int i) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BroadcastListResponseHandler/request failed : ");
        A0u.append(i);
        A0u.append(" | ");
        C177538dx r2 = this.A01;
        A0u.append(r2);
        A0u.append(" | ");
        C36351kA.A1R(A0u, this.A00);
        this.A01.cancel();
        this.A02.A04(r2, false);
    }
}
