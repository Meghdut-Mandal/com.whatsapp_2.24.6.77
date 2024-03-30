package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0mm  reason: invalid class name and case insensitive filesystem */
public final class C15150mm extends AnonymousClass0A5 implements C18010sR, C18000sQ {
    public final C18010sR A00;

    public C15150mm(C005102h r2, C18010sR r3, boolean z, boolean z2) {
        super(r2, true);
        this.A00 = r3;
    }

    public boolean B33(Throwable th) {
        return this.A00.B33(th);
    }

    public AnonymousClass0T6 BEf() {
        return this.A00.BEf();
    }

    public AnonymousClass0T6 BEg() {
        return this.A00.BEg();
    }

    public void BL3(C006302t r2) {
        this.A00.BL3(r2);
    }

    public boolean BLP() {
        return this.A00.BLP();
    }

    public C12950iv BNo() {
        return this.A00.BNo();
    }

    public Object Bmx(C023509x r2) {
        return this.A00.Bmx(r2);
    }

    public Object Bmy(C023509x r2) {
        return this.A00.Bmy(r2);
    }

    public Object Bpf(Object obj, C023509x r3) {
        return this.A00.Bpf(obj, r3);
    }

    public Object BwC() {
        return this.A00.BwC();
    }

    public Object BwE(Object obj) {
        return this.A00.BwE(obj);
    }

    public void A0j(Throwable th) {
        CancellationException A0D = A0e((String) null, th);
        this.A00.B2S(A0D);
        A0l(A0D);
    }

    public void A10(Throwable th, boolean z) {
        if (!A11().B33(th) && !z) {
            C05720Qu.A00(getContext(), th);
        }
    }

    public void A12() {
        A11().B33((Throwable) null);
    }

    public final void B2S(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C13420jq(A0b(), (Throwable) null, this);
            }
            A0j(cancellationException);
        }
    }

    public /* bridge */ /* synthetic */ void A0z(Object obj) {
        A12();
    }

    public final C18010sR A11() {
        return this.A00;
    }

    public C15150mm(C005102h r2, C18010sR r3) {
        this(r2, r3, true, true);
    }
}
