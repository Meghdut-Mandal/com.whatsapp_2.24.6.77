package X;

import java.security.cert.X509Certificate;

/* renamed from: X.0yd  reason: invalid class name and case insensitive filesystem */
public class C21080yd {
    public C183228qQ A00;
    public C183248qS A01;
    public C21918Aco A02;
    public C21918Aco A03;
    public C183238qR A04;
    public final C21100yf A05;
    public final C19630wG A06;
    public final C20810yC A07;
    public final C21260yv A08;
    public final C21270yw A09;
    public final C21290yy A0A;
    public final C21210yq A0B;
    public final C21200yp A0C;
    public final C21310z0 A0D;
    public final C21280yx A0E;
    public final C21230ys A0F;
    public final C21320z1 A0G;

    public synchronized C183248qS A00() {
        C183248qS r2;
        r2 = this.A01;
        if (r2 == null) {
            X509Certificate[] x509CertificateArr = C183248qS.A01;
            r2 = new C183248qS(this.A06.A00, this.A08);
            this.A01 = r2;
        }
        return r2;
    }

    public synchronized C21918Aco A01(boolean z) {
        C21918Aco aco;
        if (z) {
            aco = this.A03;
            if (aco == null) {
                C20810yC r2 = this.A07;
                C21100yf r1 = this.A05;
                C21210yq r5 = this.A0B;
                C21230ys r9 = this.A0F;
                C21200yp r6 = this.A0C;
                aco = new C183268qU(r1, r2, this.A09, this.A0A, r5, r6, this.A0D, this.A0E, r9, this.A0G);
                this.A03 = aco;
            }
        } else {
            aco = this.A02;
            if (aco == null) {
                C20810yC r22 = this.A07;
                C21100yf r12 = this.A05;
                C21210yq r52 = this.A0B;
                C21230ys r92 = this.A0F;
                C21200yp r62 = this.A0C;
                aco = new C183258qT(r12, r22, this.A09, this.A0A, r52, r62, this.A0D, this.A0E, r92, this.A0G);
                this.A02 = aco;
            }
        }
        return aco;
    }

    public synchronized C183238qR A02() {
        C183238qR r2;
        r2 = this.A04;
        if (r2 == null) {
            X509Certificate[] x509CertificateArr = C183238qR.A01;
            r2 = new C183238qR(this.A06.A00, this.A08);
            this.A04 = r2;
        }
        return r2;
    }

    public C21080yd(C21100yf r1, C19630wG r2, C20810yC r3, C21260yv r4, C21270yw r5, C21290yy r6, C21210yq r7, C21200yp r8, C21310z0 r9, C21280yx r10, C21230ys r11, C21320z1 r12) {
        this.A07 = r3;
        this.A06 = r2;
        this.A05 = r1;
        this.A0B = r7;
        this.A0F = r11;
        this.A08 = r4;
        this.A0C = r8;
        this.A09 = r5;
        this.A0E = r10;
        this.A0A = r6;
        this.A0D = r9;
        this.A0G = r12;
    }
}
