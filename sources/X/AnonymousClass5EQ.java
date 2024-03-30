package X;

/* renamed from: X.5EQ  reason: invalid class name */
public class AnonymousClass5EQ extends C111175br {
    public final int A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            return obj != null && getClass() == obj.getClass() && this.A00 == ((AnonymousClass5EQ) obj).A00;
        }
        return true;
    }

    public AnonymousClass5EQ(int i) {
        Integer num = C023109s.A00;
        this.A00 = i;
        this.A01 = num;
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass5EQ(Integer num) {
        this.A00 = 52;
        this.A01 = num;
    }
}
