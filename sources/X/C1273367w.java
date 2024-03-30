package X;

/* renamed from: X.67w  reason: invalid class name and case insensitive filesystem */
public class C1273367w {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.A05;
        String str2 = ((C1273367w) obj).A05;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A05, AnonymousClass001.A0L());
    }
}
