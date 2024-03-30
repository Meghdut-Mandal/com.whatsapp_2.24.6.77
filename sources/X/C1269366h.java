package X;

/* renamed from: X.66h  reason: invalid class name and case insensitive filesystem */
public class C1269366h {
    public AnonymousClass6F3 A00;
    public String A01;
    public boolean A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C1269366h) obj).A01);
    }

    public C1269366h(AnonymousClass6F3 r1, String str) {
        this.A01 = str;
        this.A00 = r1;
    }

    public int hashCode() {
        return AnonymousClass000.A0K(this.A01, AnonymousClass001.A0L());
    }
}
