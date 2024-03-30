package X;

/* renamed from: X.61P  reason: invalid class name */
public final class AnonymousClass61P {
    public final C137126fd A00;
    public final Integer A01;

    public AnonymousClass61P(C137126fd r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        String str;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AnimationResult(endReason=");
        if (this.A01.intValue() != 0) {
            str = "Finished";
        } else {
            str = "BoundReached";
        }
        A0u.append(str);
        A0u.append(", endState=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
