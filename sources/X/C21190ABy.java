package X;

/* renamed from: X.ABy  reason: case insensitive filesystem */
public class C21190ABy implements C22938Ayo, C22942Ays, C17740rx {
    public final C202029kv A00;
    public final C196049Xl A01;
    public final ABE A02;

    public static AnonymousClass8NH A00(C196159Xy r9, C21190ABy aBy, C181788o2 r11) {
        C1886690e r0;
        C196049Xl r2 = aBy.A01;
        AnonymousClass8NH A0O = C170918Hz.A0O(r9.A00);
        boolean A022 = r9.A02();
        AnonymousClass8NH A012 = r2.A01(A0O, r9.A02, r11, r9.A0B, A022, r9.A04, r9.A03);
        C65013Qj r3 = r11.A01;
        boolean A04 = C64933Qa.A04(r11);
        if (r3 != null && ((A04 || A022 || r3.A0a != null) && A012 != null)) {
            AnonymousClass8SE A0C = AnonymousClass8NN.A0C(A012);
            A0C.bitField0_ |= 128;
            A0C.gifPlayback_ = true;
            int i = r3.A05;
            if (i == 1) {
                r0 = C1886690e.GIPHY;
            } else if (i != 2) {
                r0 = C1886690e.NONE;
            } else {
                r0 = C1886690e.TENOR;
            }
            A012.A0U(r0);
        }
        return A012;
    }

    public void B24(C196159Xy r4, AnonymousClass3T1 r5) {
        C165567td.A1B(r5, "FMessageGifProtobuf: message type is not supported ", AnonymousClass000.A0u(), r5 instanceof C181788o2);
        C181788o2 r52 = (C181788o2) r5;
        if (r52.A1T(C132986Wc.A0F)) {
            this.A02.A00(new C23149B7j(this, 2), r4, r52);
            return;
        }
        AnonymousClass8NH A002 = A00(r4, this, r52);
        C65013Qj r1 = r52.A01;
        boolean A04 = C64933Qa.A04(r52);
        if (r1 == null || ((!A04 && !r4.A02() && r1.A0a == null) || A002 == null)) {
            C165567td.A1A(r52, "FMessageGif/unable to send encrypted media message due to missing mediaKey; media_wa_type=", AnonymousClass000.A0u());
        } else {
            r4.A00.A0h(A002);
        }
    }

    public AnonymousClass3T1 BlH(AnonymousClass9YL r10) {
        AnonymousClass8SX r1 = r10.A0A;
        if ((r1.bitField0_ & 256) == 0) {
            return null;
        }
        AnonymousClass8SE r0 = r1.videoMessage_;
        AnonymousClass8SE r4 = r0;
        if (r0 == null) {
            r0 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        if (!r0.gifPlayback_) {
            return null;
        }
        if (r4 == null) {
            r4 = AnonymousClass8SE.DEFAULT_INSTANCE;
        }
        C64933Qa r2 = r10.A0C;
        C181788o2 r5 = new C181788o2(r2, r10.A04);
        boolean z = r2.A00 instanceof C28981Uw;
        this.A01.A04(r4, r5, r10.A01, r10.A03(), r10.A0O);
        int i = r10.A01;
        boolean z2 = r10.A0N;
        if (i != 1 || z2) {
            C65013Qj r12 = r5.A01;
            C18740tg.A06(r12);
            if ((r4.bitField0_ & 32) != 0) {
                r12.A05 = C203359nq.A05(r4);
            }
        }
        C65013Qj r13 = r5.A01;
        C18740tg.A06(r13);
        if (z || (r4.bitField0_ & 32) != 0) {
            r13.A05 = C203359nq.A05(r4);
        }
        return r5;
    }

    public C21190ABy(ABE abe, C202029kv r2, C196049Xl r3) {
        this.A02 = abe;
        this.A00 = r2;
        this.A01 = r3;
    }
}
