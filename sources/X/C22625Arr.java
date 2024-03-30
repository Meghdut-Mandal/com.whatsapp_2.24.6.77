package X;

import java.util.Enumeration;

/* renamed from: X.Arr  reason: case insensitive filesystem */
public class C22625Arr extends AnonymousClass120 {
    public static final C22632Ary A04 = new C22632Ary(C22590ArI.A00, C219311y.A1E);
    public final C22654AsK A00;
    public final C22654AsK A01;
    public final C22659AsP A02;
    public final C22632Ary A03;

    public C22625Arr(C22656AsM asM) {
        Enumeration A0I = asM.A0I();
        this.A02 = (C22659AsP) A0I.nextElement();
        this.A00 = (C22654AsK) A0I.nextElement();
        if (A0I.hasMoreElements()) {
            Object nextElement = A0I.nextElement();
            if (nextElement instanceof C22654AsK) {
                this.A01 = C22654AsK.A01(nextElement);
                nextElement = A0I.hasMoreElements() ? A0I.nextElement() : nextElement;
            } else {
                this.A01 = null;
            }
            if (nextElement != null) {
                this.A03 = C22632Ary.A00(nextElement);
                return;
            }
        } else {
            this.A01 = null;
        }
        this.A03 = null;
    }

    public C22625Arr(byte[] bArr, int i) {
        this.A02 = new C22644AsA(AnonymousClass124.A02(bArr));
        this.A00 = new C22654AsK((long) i);
        this.A01 = null;
        this.A03 = null;
    }

    public AnonymousClass121 Bve() {
        C202169lB r2 = new C202169lB(4);
        r2.A06(this.A02);
        r2.A06(this.A00);
        C22654AsK asK = this.A01;
        if (asK != null) {
            r2.A06(asK);
        }
        C22632Ary ary = this.A03;
        if (ary != null && !ary.equals(A04)) {
            r2.A06(ary);
        }
        return new C22675Asf(r2);
    }
}
