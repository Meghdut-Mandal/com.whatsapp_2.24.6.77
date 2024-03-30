package X;

import android.graphics.RectF;
import com.whatsapp.InteractiveAnnotation;
import java.io.File;

/* renamed from: X.3Qj  reason: invalid class name and case insensitive filesystem */
public class C65013Qj {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public RectF A0H;
    public File A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public byte[] A0W;
    public byte[] A0X;
    public byte[] A0Y;
    public byte[] A0Z;
    public byte[] A0a;
    public InteractiveAnnotation[] A0b;
    public transient boolean A0c;
    public transient boolean A0d;
    public transient boolean A0e;
    public transient boolean A0f;

    public C65013Qj A00() {
        C65013Qj r2 = new C65013Qj(this);
        r2.A0Q = this.A0Q;
        r2.A0E = this.A0E;
        r2.A0e = this.A0e;
        r2.A0U = this.A0U;
        r2.A0F = this.A0F;
        r2.A0G = this.A0G;
        r2.A0R = this.A0R;
        r2.A0T = this.A0T;
        r2.A0S = this.A0S;
        return r2;
    }

    public boolean A03() {
        File file = this.A0I;
        if (file != null) {
            return file.exists();
        }
        return false;
    }

    public C65013Qj(C65013Qj r3) {
        this.A0W = r3.A0W;
        this.A0J = r3.A0J;
        this.A08 = r3.A08;
        this.A07 = r3.A07;
        this.A0H = r3.A0H;
        this.A0K = r3.A0K;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A0I = r3.A0I;
        this.A0C = r3.A0C;
        this.A04 = r3.A04;
        this.A0X = r3.A0X;
        this.A0R = r3.A0R;
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A0Y = r3.A0Y;
        this.A0b = r3.A0b;
        this.A0Z = r3.A0Z;
        this.A0L = r3.A0L;
        this.A0a = r3.A0a;
        this.A0D = r3.A0D;
        this.A09 = r3.A09;
        this.A00 = r3.A00;
        this.A0V = r3.A0V;
        this.A0A = r3.A0A;
        this.A0O = r3.A0O;
        this.A0N = r3.A0N;
        this.A0M = r3.A0M;
        this.A01 = r3.A01;
    }

    public File A01() {
        return this.A0I;
    }

    public boolean equals(Object obj) {
        return C36361kB.A1a(this, obj);
    }

    public void A02(File file) {
        this.A0I = file;
    }

    public C65013Qj() {
    }
}
