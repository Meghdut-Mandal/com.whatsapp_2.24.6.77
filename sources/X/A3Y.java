package X;

public final class A3Y implements C23017B0i {
    public C23017B0i[] A00;

    public A3Y(C23017B0i... b0iArr) {
        this.A00 = b0iArr;
    }

    public final boolean ByH(Class cls) {
        C23017B0i[] b0iArr = this.A00;
        int i = 0;
        while (!b0iArr[i].ByH(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public final C22802AwD ByS(Class cls) {
        C23017B0i[] b0iArr = this.A00;
        int i = 0;
        do {
            C23017B0i b0i = b0iArr[i];
            if (b0i.ByH(cls)) {
                return b0i.ByS(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass001.A0E(C90464aC.A0c("No factory is available for message type: ", cls.getName()));
    }
}
