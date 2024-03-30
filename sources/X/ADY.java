package X;

public final class ADY implements B1A {
    public final /* synthetic */ C195009Sc A00;
    public final /* synthetic */ C023509x A01;

    public ADY(C195009Sc r1, C023509x r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void BiD(String str) {
        this.A01.resumeWith(str);
    }

    public void onFailure(Exception exc) {
        this.A00.A04.A01(C188648zz.A06, (String) null, exc);
        this.A01.resumeWith((Object) null);
    }
}
