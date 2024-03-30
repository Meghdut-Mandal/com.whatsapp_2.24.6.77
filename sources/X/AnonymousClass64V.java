package X;

/* renamed from: X.64V  reason: invalid class name */
public class AnonymousClass64V {
    public final /* synthetic */ C139556k5 A00;
    public final /* synthetic */ C124595yT A01;
    public final /* synthetic */ C125235zX A02;
    public final /* synthetic */ C159007ic A03;
    public final /* synthetic */ AnonymousClass5YD A04;
    public final /* synthetic */ C135056c3 A05;
    public final /* synthetic */ AnonymousClass6SG A06;

    public AnonymousClass64V(C139556k5 r1, C124595yT r2, C125235zX r3, C159007ic r4, AnonymousClass5YD r5, C135056c3 r6, AnonymousClass6SG r7) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A04 = r5;
    }

    public void A00(AnonymousClass60A r9, Exception exc) {
        if (exc != null) {
            C139556k5.A01(this.A00, this.A03, this.A05, this.A06, exc);
            return;
        }
        C124595yT r2 = this.A01;
        r2.A00 = r9;
        r2.A05 = true;
        if (r2.A04 && r2.A06) {
            C139556k5 r1 = this.A00;
            C135056c3 r6 = this.A05;
            AnonymousClass5YD r5 = this.A04;
            C139556k5.A00(r1, r2, this.A02, this.A03, r5, r6, AnonymousClass000.A1V(r2.A02));
        }
    }
}
