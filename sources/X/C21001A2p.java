package X;

/* renamed from: X.A2p  reason: case insensitive filesystem */
public class C21001A2p implements C22884Axf {
    public Integer A00;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((C21001A2p) obj).A00;
        }
        return true;
    }

    public int hashCode() {
        String str;
        int intValue = this.A00.intValue();
        if (intValue != 0) {
            str = "BACK";
        } else {
            str = "FRONT";
        }
        return str.hashCode() + intValue;
    }

    public C21001A2p(Integer num) {
        this.A00 = num;
    }

    public AnonymousClass905 BIb() {
        return AnonymousClass905.INPUT_FACING;
    }
}
