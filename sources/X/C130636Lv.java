package X;

import android.graphics.RectF;
import java.io.File;
import java.util.HashSet;

/* renamed from: X.6Lv  reason: invalid class name and case insensitive filesystem */
public class C130636Lv {
    public long A00;
    public long A01;
    public long A02;
    public RectF A03;
    public AnonymousClass6OY A04;
    public AnonymousClass6QD A05;
    public C109695Yo A06;
    public AnonymousClass65W A07;
    public C118715oc A08;
    public C130246Kh A09;
    public File A0A;
    public String A0B;
    public HashSet A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static void A00(C130636Lv r3) {
        r3.A03 = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        r3.A02 = -1;
        r3.A00 = -1;
        r3.A0D = false;
        r3.A0E = false;
        r3.A01 = -1;
        r3.A0C = new HashSet();
    }

    public C130636Lv(C125085zI r3) {
        A00(this);
        try {
            new C109685Yn();
            this.A06 = new C109695Yo();
            this.A0A = r3.A0A;
            String str = r3.A0B;
            if (str != null) {
                this.A0B = str;
            }
            this.A05 = r3.A05;
            this.A03 = r3.A03;
            this.A02 = r3.A02;
            this.A00 = r3.A00;
            this.A0D = r3.A0D;
            this.A0E = r3.A0E;
            this.A09 = r3.A09;
            this.A04 = r3.A04;
            this.A08 = r3.A08;
            this.A0H = r3.A0H;
            this.A0G = r3.A0G;
            this.A0F = r3.A0F;
            this.A07 = r3.A07;
            this.A0L = r3.A0K;
            this.A0M = r3.A0L;
            this.A0I = r3.A0I;
            this.A01 = r3.A01;
            this.A06 = r3.A06;
            this.A0J = r3.A0J;
            this.A0K = r3.A0M;
            this.A0C = r3.A0C;
        } catch (AnonymousClass5VN e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public C130636Lv() {
        A00(this);
        try {
            new C109685Yn();
            this.A06 = new C109695Yo();
        } catch (AnonymousClass5VN e) {
            throw AnonymousClass001.A0B(e);
        }
    }
}
