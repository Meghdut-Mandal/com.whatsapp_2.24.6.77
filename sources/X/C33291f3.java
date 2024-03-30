package X;

import java.util.HashSet;

/* renamed from: X.1f3  reason: invalid class name and case insensitive filesystem */
public class C33291f3 implements C33281f2 {
    public int A00;
    public int A01;
    public Runnable A02;
    public boolean A03;
    public boolean A04;
    public final HashSet A05 = new HashSet();

    public boolean isValid() {
        if (this.A03) {
            int i = this.A00;
            while (i <= this.A01) {
                if (this.A05.contains(Integer.valueOf(i))) {
                    i++;
                }
            }
            this.A04 = true;
            return true;
        }
        return false;
    }
}
