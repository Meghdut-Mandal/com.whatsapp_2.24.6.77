package X;

import com.whatsapp.R;
import com.whatsapp.events.EventCreateOrEditViewModel$createCallLink$3;
import com.whatsapp.events.EventCreateOrEditViewModel$sendMessageSendingResult$1;
import com.whatsapp.events.EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1;
import com.whatsapp.location.PlaceInfo;
import java.util.Set;

/* renamed from: X.1us  reason: invalid class name and case insensitive filesystem */
public final class C40071us extends AnonymousClass04R implements C88444Ss {
    public final long A00;
    public final AnonymousClass1X4 A01;
    public final AnonymousClass36B A02;
    public final C19970wo A03;
    public final AnonymousClass31V A04;
    public final AnonymousClass31V A05;
    public final AnonymousClass1DW A06;
    public final C29541Xa A07;
    public final C51242nV A08;
    public final AnonymousClass11F A09;
    public final C64933Qa A0A;
    public final AnonymousClass1A1 A0B;
    public final C005502l A0C;
    public final AnonymousClass05L A0D;
    public final AnonymousClass05L A0E;
    public final AnonymousClass05K A0F;
    public final AnonymousClass05K A0G;
    public final C19600wD A0H;
    public final AnonymousClass191 A0I;
    public final AnonymousClass16J A0J;
    public final C005502l A0K;

    public void BZh(String str, boolean z) {
        Object value;
        C51852oU r3;
        String A052;
        C51232nU r1;
        AnonymousClass00C.A0D(str, 0);
        AnonymousClass05L r5 = this.A0D;
        do {
            value = r5.getValue();
            r3 = C51852oU.SUCCESS;
            A052 = AnonymousClass3UD.A05(str, z);
            if (z) {
                r1 = C51232nU.WA_VIDEO_CALL;
            } else {
                r1 = C51232nU.WA_VOICE_CALL;
            }
        } while (!r5.B3B(value, new AnonymousClass3Q2(r3, r1, A052)));
    }

    public C40071us(AnonymousClass1X4 r7, AnonymousClass36B r8, C19600wD r9, C19970wo r10, AnonymousClass16J r11, AnonymousClass1DW r12, C29541Xa r13, AnonymousClass11F r14, C64933Qa r15, AnonymousClass1A1 r16, C005502l r17, C005502l r18, long j) {
        C51242nV r0;
        AnonymousClass1A1 r2 = r16;
        C36321k7.A1B(r10, r7, r12, r2, r11);
        AnonymousClass00C.A0D(r13, 6);
        C005502l r1 = r17;
        C005502l r02 = r18;
        C36321k7.A14(r9, r1, r02);
        this.A03 = r10;
        this.A01 = r7;
        this.A06 = r12;
        this.A0B = r2;
        this.A0J = r11;
        this.A07 = r13;
        this.A02 = r8;
        this.A0H = r9;
        this.A0K = r1;
        this.A0C = r02;
        this.A09 = r14;
        this.A00 = j;
        this.A0A = r15;
        AnonymousClass05N r03 = new AnonymousClass05N(new AnonymousClass3QB((AnonymousClass2bT) null, (AnonymousClass2bT) null, C51542nz.ORIGINAL, (PlaceInfo) null));
        this.A0E = r03;
        this.A0G = r03;
        AnonymousClass05N r04 = new AnonymousClass05N(new AnonymousClass3Q2(C51852oU.NONE, C51232nU.WA_VIDEO_CALL, (String) null));
        this.A0D = r04;
        this.A0F = r04;
        Integer num = C023109s.A00;
        AnonymousClass31V r05 = new AnonymousClass31V(C05750Qx.A00(num, 0));
        this.A04 = r05;
        this.A05 = r05;
        C90394a5 A002 = C90394a5.A00(this, 19);
        this.A0I = A002;
        r8.A02.add(this);
        if (r15 != null) {
            AnonymousClass0A2.A02(num, this.A0C, new EventCreateOrEditViewModel$updateFieldsUsingExistingEvent$1(this, (C023509x) null), C109325Xd.A00(this));
            r0 = C51242nV.EDIT;
        } else {
            r0 = C51242nV.CREATE;
        }
        this.A08 = r0;
        r11.registerObserver(A002);
    }

    public static final AnonymousClass2bT A01(C40071us r3) {
        AnonymousClass05K r32 = r3.A0G;
        C51542nz r2 = ((AnonymousClass3QB) r32.getValue()).A02;
        C51542nz r1 = C51542nz.EDITED;
        AnonymousClass3QB r0 = (AnonymousClass3QB) r32.getValue();
        if (r2 == r1) {
            return r0.A00;
        }
        return r0.A01;
    }

    public static final void A02(AnonymousClass2bT r2, C40071us r3) {
        C51252nW r22;
        int i;
        if (r2.A06) {
            r22 = C51252nW.ERROR;
            i = R.string.f12nameremoved;
        } else if (((AnonymousClass3QB) r3.A0G.getValue()).A02 == C51542nz.DELETED) {
            r22 = C51252nW.ERROR;
            i = R.string.f12nameremoved;
        } else {
            return;
        }
        A03(new AnonymousClass3IN(r22, Integer.valueOf(i)), r3);
    }

    public void A0R() {
        AnonymousClass36B r1 = this.A02;
        Set set = r1.A02;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.unregisterObserver(r1);
        }
        this.A0J.unregisterObserver(this.A0I);
    }

    public final void A0S(C51232nU r6) {
        Object value;
        Object value2;
        Object value3;
        AnonymousClass05K r1 = this.A0F;
        String str = ((AnonymousClass3Q2) r1.getValue()).A02;
        if (str != null && str.length() != 0 && r6 == ((AnonymousClass3Q2) r1.getValue()).A01) {
            AnonymousClass05L r3 = this.A0D;
            do {
                value3 = r3.getValue();
            } while (!AnonymousClass3Q2.A00(C51852oU.SUCCESS, (AnonymousClass3Q2) value3, value3, r3));
        } else if (this.A0H.A09()) {
            AnonymousClass05L r4 = this.A0D;
            do {
                value2 = r4.getValue();
            } while (!AnonymousClass3Q2.A00(C51852oU.LOADING, (AnonymousClass3Q2) value2, value2, r4));
            C36381kD.A1R(this.A0C, new EventCreateOrEditViewModel$createCallLink$3(r6, this, (C023509x) null), C109325Xd.A00(this));
        } else {
            AnonymousClass05L r32 = this.A0D;
            do {
                value = r32.getValue();
            } while (!AnonymousClass3Q2.A00(C51852oU.NO_INTERNET, (AnonymousClass3Q2) value, value, r32));
        }
    }

    public final void A0T(PlaceInfo placeInfo) {
        Object value;
        AnonymousClass3QB r0;
        AnonymousClass05L r5 = this.A0E;
        do {
            value = r5.getValue();
            r0 = (AnonymousClass3QB) value;
        } while (!r5.B3B(value, new AnonymousClass3QB(r0.A01, r0.A00, r0.A02, placeInfo)));
    }

    public void BSc() {
        Object value;
        AnonymousClass05L r3 = this.A0D;
        do {
            value = r3.getValue();
        } while (!AnonymousClass3Q2.A00(C51852oU.ERROR, (AnonymousClass3Q2) value, value, r3));
    }

    public static final void A03(AnonymousClass3IN r4, C40071us r5) {
        C36381kD.A1R(r5.A0K, new EventCreateOrEditViewModel$sendMessageSendingResult$1(r4, r5, (C023509x) null), C109325Xd.A00(r5));
    }
}
