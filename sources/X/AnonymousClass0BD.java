package X;

/* renamed from: X.0BD  reason: invalid class name */
public class AnonymousClass0BD implements Comparable {
    public AnonymousClass0BA A00;
    public AnonymousClass0B4 A01;
    public final /* synthetic */ AnonymousClass0BA A02;

    public AnonymousClass0BD(AnonymousClass0BA r1, AnonymousClass0BA r2) {
        this.A02 = r1;
        this.A00 = r2;
    }

    public int compareTo(Object obj) {
        return this.A01.A04 - ((AnonymousClass0B4) obj).A04;
    }

    public String toString() {
        String str = "[ ";
        if (this.A01 != null) {
            int i = 0;
            do {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(this.A01.A0A[i]);
                sb.append(" ");
                str = sb.toString();
                i++;
            } while (i < 9);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("] ");
        sb2.append(this.A01);
        return sb2.toString();
    }
}
