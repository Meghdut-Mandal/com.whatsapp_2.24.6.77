package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.0nH  reason: invalid class name and case insensitive filesystem */
public final class C15400nH extends C13130jD {
    public static final AtomicIntegerFieldUpdater A02 = AtomicIntegerFieldUpdater.newUpdater(C15400nH.class, "consumed");
    public final boolean A00;
    public final C17330r7 A01;
    public volatile int consumed = 0;

    public Object A00(C023509x r4, C18000sQ r5) {
        Object A002 = C06810Ve.A00(r4, this.A01, new C13030j3(r5), this.A00);
        if (A002 != AnonymousClass0AO.COROUTINE_SUSPENDED) {
            return AnonymousClass0AJ.A00;
        }
        return A002;
    }

    public C17330r7 A02(AnonymousClass040 r3) {
        if (this.A00 && A02.getAndSet(this, 1) != 0) {
            throw AnonymousClass001.A09("ReceiveChannel.consumeAsFlow can be collected just once");
        } else if (this.A00 == -3) {
            return this.A01;
        } else {
            return super.A02(r3);
        }
    }

    public AnonymousClass05H A03() {
        C17330r7 r3 = this.A01;
        boolean z = this.A00;
        return new C15400nH(C023109s.A00, C008903u.A00, r3, -3, z);
    }

    public C13130jD A04(Integer num, C005102h r8, int i) {
        return new C15400nH(num, r8, this.A01, i, this.A00);
    }

    public Object B36(C023509x r4, AnonymousClass05G r5) {
        Object obj;
        if (this.A00 == -3) {
            boolean z = this.A00;
            if (!z || A02.getAndSet(this, 1) == 0) {
                obj = C06810Ve.A00(r4, this.A01, r5, z);
            } else {
                throw AnonymousClass001.A09("ReceiveChannel.consumeAsFlow can be collected just once");
            }
        } else {
            obj = super.B36(r4, r5);
        }
        return AnonymousClass0AO.A00(obj);
    }

    public C15400nH(Integer num, C005102h r3, C17330r7 r4, int i, boolean z) {
        super(num, r3, i);
        this.A01 = r4;
        this.A00 = z;
    }

    public String A01() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("channel=");
        return AnonymousClass000.A0o(this.A01, A0u);
    }
}
