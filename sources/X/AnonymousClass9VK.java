package X;

/* renamed from: X.9VK  reason: invalid class name */
public class AnonymousClass9VK {
    public Object A00;
    public Object A01;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass00I)) {
            return false;
        }
        AnonymousClass00I r4 = (AnonymousClass00I) obj;
        Object obj2 = r4.A00;
        Object obj3 = this.A00;
        if (obj2 != obj3 && (obj2 == null || !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = r4.A01;
        Object obj5 = this.A01;
        if (obj4 == obj5 || (obj4 != null && obj4.equals(obj5))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0H(this.A00) ^ C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Pair{");
        A0u.append(this.A00);
        C36421kH.A1N(A0u);
        A0u.append(this.A01);
        return AnonymousClass000.A0q("}", A0u);
    }
}
