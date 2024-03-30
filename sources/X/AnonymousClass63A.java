package X;

/* renamed from: X.63A  reason: invalid class name */
public class AnonymousClass63A {
    public String A00;
    public String A01;
    public String A02;

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("OtpSms{, sms='");
        char A002 = C90484aE.A00(this.A00, A0u);
        A0u.append(", otp='");
        A0u.append(this.A01);
        A0u.append(A002);
        A0u.append(", id='");
        A0u.append(this.A02);
        A0u.append(A002);
        return AnonymousClass000.A0s(A0u);
    }
}
