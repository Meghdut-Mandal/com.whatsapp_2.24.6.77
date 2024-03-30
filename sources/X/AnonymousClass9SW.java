package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.9SW  reason: invalid class name */
public final class AnonymousClass9SW {
    public final AnonymousClass9JF A00;
    public final C199939gI A01;
    public final C27601Ox A02;
    public final long A03;
    public final B6H A04;
    public final AI0 A05;
    public final C27621Oz A06;
    public final AnonymousClass19A A07;

    public AnonymousClass9SW(AnonymousClass9JF r4, B6H b6h, C27611Oy r6, C27621Oz r7, C27601Ox r8, AnonymousClass19A r9, long j) {
        C36421kH.A1J(r6, 3, r7);
        this.A00 = r4;
        this.A04 = b6h;
        this.A02 = r8;
        this.A06 = r7;
        this.A07 = r9;
        this.A03 = j;
        this.A01 = new C199939gI(r4, r9.A09(), this.A02.A00(this.A00.A02));
        this.A05 = new AI0(this, b6h, r6);
    }

    public void A00() {
        B6H b6h = this.A04;
        if (b6h instanceof BaseMexCallback) {
            BaseMexCallback baseMexCallback = (BaseMexCallback) b6h;
            C199939gI r0 = this.A01;
            C27621Oz r6 = this.A06;
            baseMexCallback.A00 = r0;
            baseMexCallback.A01 = r6;
            AnonymousClass1P0 r7 = r6.A03;
            String str = r0.A02;
            C21690ze r5 = r7.A00;
            if (!r5.BMN(239471030)) {
                r5.markerStart(239471030);
                if (str != null) {
                    r5.markerAnnotate(239471030, "FLOW_ID", str);
                }
                String A0b = ((C19420v0) r7.A01.get()).A0b();
                if (C165607th.A08(A0b) != 0) {
                    r5.markerAnnotate(239471030, "encrypted_rid", A0b);
                }
            }
            baseMexCallback.A02 = Long.valueOf(C19970wo.A00(r6.A00));
        }
        String str2 = this.A00.A02;
        C199939gI r1 = this.A01;
        if (r1.A05 == null) {
            b6h.BXQ(new C177288dY(AnonymousClass000.A0p("Unable to find persisted ID for operation named ", str2, AnonymousClass000.A0u())));
            return;
        }
        AnonymousClass19A r02 = this.A07;
        String str3 = r1.A03;
        r02.A0K(this.A05, r1.A00, str3, 341, this.A03);
    }
}
