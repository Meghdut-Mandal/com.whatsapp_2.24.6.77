package X;

/* renamed from: X.A3x  reason: case insensitive filesystem */
public final class C21034A3x implements C23018B0j {
    public C23018B0j[] A00;

    public final boolean ByH(Class cls) {
        C23018B0j[] b0jArr = this.A00;
        int i = 0;
        while (!b0jArr[i].ByH(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }

    public final C22807AwI ByT(Class cls) {
        C23018B0j[] b0jArr = this.A00;
        int i = 0;
        do {
            C23018B0j b0j = b0jArr[i];
            if (b0j.ByH(cls)) {
                return b0j.ByT(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass001.A0E(C90464aC.A0c("No factory is available for message type: ", cls.getName()));
    }

    public C21034A3x(C23018B0j... b0jArr) {
        this.A00 = b0jArr;
    }
}
