package X;

import android.text.TextUtils;

public class ABZ implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;

    public void B24(C196159Xy r8, AnonymousClass3T1 r9) {
        if (r9 instanceof C46902br) {
            C46902br r92 = (C46902br) r9;
            C63683Kz A0V = r92.A0V();
            AnonymousClass8NL r5 = r8.A00;
            C173448Rs r0 = ((AnonymousClass8SX) r5.A00).liveLocationMessage_;
            if (r0 == null) {
                r0 = C173448Rs.DEFAULT_INSTANCE;
            }
            AnonymousClass8K6 r4 = (AnonymousClass8K6) r0.A0q();
            double d = r92.A00;
            C173448Rs r3 = (C173448Rs) C90524aI.A0H(r4);
            int i = C173448Rs.ACCURACY_IN_METERS_FIELD_NUMBER;
            r3.bitField0_ |= 1;
            r3.degreesLatitude_ = d;
            double d2 = r92.A01;
            C173448Rs r32 = (C173448Rs) C90524aI.A0H(r4);
            r32.bitField0_ |= 2;
            r32.degreesLongitude_ = d2;
            boolean z = r8.A04;
            if (!z && A0V.A02() != null) {
                AnonymousClass8I5 A0O = C90474aD.A0O(r4, A0V.A02());
                C173448Rs r1 = (C173448Rs) r4.A00;
                r1.bitField0_ |= 256;
                r1.jpegThumbnail_ = A0O;
            }
            C80103un r2 = r8.A02;
            byte[] bArr = r8.A0B;
            if (C202029kv.A02(r2, r92, bArr)) {
                AnonymousClass8SG A03 = this.A00.A03(r2, r92, bArr, z);
                C173448Rs r12 = (C173448Rs) C90524aI.A0H(r4);
                A03.getClass();
                r12.contextInfo_ = A03;
                r12.bitField0_ |= 512;
            }
            if (!TextUtils.isEmpty(r92.A03)) {
                String str = r92.A03;
                C173448Rs r13 = (C173448Rs) C90524aI.A0H(r4);
                str.getClass();
                r13.bitField0_ |= 32;
                r13.caption_ = str;
            }
            long j = r92.A01;
            C173448Rs r14 = (C173448Rs) C90524aI.A0H(r4);
            r14.bitField0_ |= 64;
            r14.sequenceNumber_ = j;
            r5.A0b(r4);
            return;
        }
        throw AnonymousClass001.A08("FMessageLiveLocationSerializer/not supported message");
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r6) {
        AnonymousClass8SX r2 = r6.A0A;
        if ((r2.bitField0_ & 65536) == 0) {
            return null;
        }
        C173448Rs r3 = r2.liveLocationMessage_;
        if (r3 == null) {
            r3 = C173448Rs.DEFAULT_INSTANCE;
        }
        C18740tg.A06(r3);
        C46902br r22 = new C46902br(r6.A0C, r6.A04);
        r22.A02 = 1;
        r22.A00 = r3.degreesLatitude_;
        r22.A01 = r3.degreesLongitude_;
        if ((r3.bitField0_ & 256) != 0) {
            r22.A1D(r3.jpegThumbnail_.A06(), r6.A0O);
        }
        if ((r3.bitField0_ & 32) != 0) {
            r22.A03 = r3.caption_;
        }
        r22.A01 = r3.sequenceNumber_;
        r22.A00 = r6.A00;
        return r22;
    }

    public ABZ(C202029kv r1) {
        this.A00 = r1;
    }
}
