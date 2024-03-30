package X;

import java.util.Map;

/* renamed from: X.73m  reason: invalid class name and case insensitive filesystem */
public class C1499773m implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final int A06;

    public C1499773m(Object obj, Object obj2, String str, String str2, String str3, String str4, int i) {
        this.A06 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = obj2;
    }

    public final void run() {
        if (this.A06 != 0) {
            ((AnonymousClass5G3) this.A00).A07.A03(this.A02, this.A03, this.A04, this.A05, (Map) this.A01);
            return;
        }
        String str = this.A02;
        String str2 = this.A03;
        String str3 = this.A04;
        String str4 = this.A05;
        Map map = (Map) this.A01;
        AnonymousClass00C.A0D(map, 5);
        ((AnonymousClass5OL) this.A00).A00.A03(str, str2, str3, str4, map);
    }
}
