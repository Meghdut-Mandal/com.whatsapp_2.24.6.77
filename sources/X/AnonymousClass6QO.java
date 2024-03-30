package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.6QO  reason: invalid class name */
public class AnonymousClass6QO {
    public int A00;
    public int A01;
    public long A02;
    public Point A03;
    public Point A04;
    public Rect A05;
    public RectF A06;
    public C1273567y A07;
    public File A08;
    public File A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public File A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public final Uri A0J;

    public AnonymousClass6QO(Uri uri) {
        AnonymousClass00C.A0D(uri, 1);
        this.A0J = uri;
    }

    public final synchronized int A01() {
        return this.A00;
    }

    public final synchronized int A02() {
        return this.A01;
    }

    public final synchronized Point A03() {
        return this.A04;
    }

    public final synchronized Rect A04() {
        return this.A05;
    }

    public final synchronized C1273567y A05() {
        return this.A07;
    }

    public final synchronized File A06() {
        return this.A08;
    }

    public final synchronized File A07() {
        File file;
        file = this.A08;
        if (file == null) {
            file = this.A0F;
        }
        return file;
    }

    public final synchronized File A08() {
        return this.A0F;
    }

    public final synchronized Integer A09() {
        return this.A0G;
    }

    public final synchronized String A0A() {
        return this.A0H;
    }

    public final synchronized String A0B() {
        return this.A0A;
    }

    public final synchronized String A0C() {
        return this.A0I;
    }

    public final synchronized String A0D() {
        StringBuilder A0u;
        Object[] objArr;
        A0u = AnonymousClass000.A0u();
        A0u.append("MPI-");
        objArr = new Object[18];
        objArr[0] = this.A0J;
        objArr[1] = this.A0G;
        objArr[2] = this.A0F;
        objArr[3] = this.A0H;
        objArr[4] = this.A0I;
        objArr[5] = this.A06;
        objArr[6] = this.A0A;
        objArr[7] = this.A0B;
        objArr[8] = this.A08;
        objArr[9] = this.A05;
        objArr[10] = this.A03;
        objArr[11] = this.A04;
        objArr[12] = this.A07;
        AnonymousClass000.A1L(objArr, this.A01, 13);
        AnonymousClass000.A1N(objArr, 14, this.A0E);
        AnonymousClass000.A1N(objArr, 15, this.A0D);
        AnonymousClass000.A1L(objArr, this.A00, 16);
        AnonymousClass000.A1N(objArr, 17, this.A0C);
        return C36381kD.A10(A0u, Arrays.hashCode(objArr));
    }

    public final synchronized void A0E(int i) {
        this.A00 = i;
    }

    public final synchronized void A0F(File file) {
        this.A0F = file;
    }

    public final synchronized void A0G(Integer num) {
        this.A0G = num;
    }

    public final synchronized void A0H(String str) {
        this.A0H = str;
    }

    public final synchronized void A0I(String str) {
        this.A0A = str;
    }

    public final synchronized void A0J(String str) {
        this.A0I = str;
    }

    public final synchronized boolean A0K() {
        return this.A0E;
    }

    public static int A00(AnonymousClass6QO r2, C25491Gn r3) {
        int A012 = r3.A01(r2);
        r2.A0G(Integer.valueOf(A012));
        return A012;
    }

    public AnonymousClass6QO(Uri uri, AnonymousClass6QO r3) {
        AnonymousClass00C.A0D(uri, 1);
        this.A0J = uri;
        this.A0G = r3.A0G;
        this.A0F = r3.A0F;
        this.A0H = r3.A0H;
        this.A0I = r3.A0I;
        this.A06 = r3.A06;
        this.A0A = r3.A0A;
        this.A0B = r3.A0B;
        this.A08 = r3.A08;
        this.A05 = r3.A05;
        this.A03 = r3.A03;
        this.A04 = r3.A04;
        this.A07 = r3.A07;
        this.A01 = r3.A01;
        this.A0E = r3.A0E;
        this.A0D = r3.A0D;
        this.A00 = r3.A00;
        this.A0C = r3.A0C;
    }
}
