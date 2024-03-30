package X;

import android.os.Build;
import com.whatsapp.suggestions.SuggestionsEngine;

/* renamed from: X.1ds  reason: invalid class name and case insensitive filesystem */
public final class C32591ds implements AnonymousClass004 {
    public final C27111My A00;
    public final C32581dr A01;
    public final C18800tq A02;
    public final int A03;
    public final C27071Mp A04;

    public static AnonymousClass6PU A03() {
        return new AnonymousClass6PU();
    }

    public static AnonymousClass4QB A04() {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C71073gB();
        }
        return new C71083gC();
    }

    public Object get() {
        switch (this.A03) {
            case 0:
                C32581dr r1 = this.A01;
                AnonymousClass6PU A032 = A03();
                r1.A1f(A032);
                return A032;
            case 1:
                return new AnonymousClass3DK((C20810yC) this.A02.A02.get(), (C20670xw) this.A02.AXI.get());
            case 2:
                return new C191569Dm(this);
            case 3:
                return new C191579Dn(this);
            case 4:
                return new C191589Do(this);
            case 5:
                return new AnonymousClass60S(this);
            case 6:
                return new C115895jc(this);
            case 7:
                return new C115935jg(this);
            case 8:
                return new C115945jh(this);
            case 9:
                return new C115955ji(this);
            case 10:
                return new C115965jj(this);
            case 11:
                return new C115755jO(this);
            case 12:
                return new AnonymousClass9Dj(this);
            case 13:
                return new C191549Dk(this);
            case 14:
                return new C191559Dl(this);
            case 15:
                return new C115765jP(this);
            case 16:
                return new C115775jQ(this);
            case 17:
                return new C115785jR(this);
            case 18:
                return new C115795jS(this);
            case 19:
                return new C115805jT(this);
            case 20:
                return new C115815jU(this);
            case 21:
                return new C115825jV(this);
            case 22:
                return new C115835jW(this);
            case 23:
                return new C115845jX(this);
            case 24:
                return new C58122zM(this);
            case 25:
                return new AnonymousClass60Q(this);
            case 26:
                return new AnonymousClass60R(this);
            case 27:
                return new C115855jY(this);
            case 28:
                return new C164457rq(this, 0);
            case 29:
                return new C115865jZ(this);
            case 30:
                return new C58132zN(this);
            case 31:
                return new C34481h7(this);
            case 32:
                return new C34491h8(this);
            case 33:
                return new C34501h9(this);
            case 34:
                return new C34511hA(this);
            case 35:
                return new C34521hB(this);
            case 36:
                return new C34531hC(this);
            case 37:
                return new C34541hD(this);
            case 38:
                return new C34551hE(this);
            case 39:
                return new C34561hF(this);
            case 40:
                return new C34571hG(this);
            case 41:
                return new C34581hH(this);
            case 42:
                return new C58142zO(this);
            case 43:
                return new C115875ja(this);
            case 44:
                return new C191599Dp(this);
            case 45:
                return new C58152zP(this);
            case 46:
                return new C34371gv(this);
            case 47:
                return new C58162zQ(this);
            case 48:
                return new C58172zR(this);
            case 49:
                return new C58182zS(this);
            case 50:
                return new C58192zT(this);
            case 51:
                return new C58202zU(this);
            case 52:
                return new C58212zV(this);
            case 53:
                AnonymousClass1NI A5n = this.A02.A5m();
                AnonymousClass16D r4 = (AnonymousClass16D) this.A02.A2A.get();
                return new SuggestionsEngine((AnonymousClass1NG) this.A02.A0v.get(), A5n, r4, (C20810yC) this.A02.A02.get(), (C27591Ow) this.A02.A5M.get());
            case 54:
                return new C58222zW(this);
            case 55:
                return new C58232zX(this);
            case 56:
                return new C115885jb(this);
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                return new C58242zY(this);
            case 58:
                return A05();
            case 59:
                return new C145646uI(C19610wE.A00(this.A02.AfJ), (C18820ts) this.A02.A9X.get());
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                return new C58252zZ(this);
            case 61:
                return new C191609Dq(this);
            case 62:
                return new C58262za(this);
            case 63:
                return new C58272zb(this);
            case 64:
                return new C58282zc(this);
            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                return new C58292zd(this);
            case 66:
                C32931eR r12 = (C32931eR) this.A02.A4K.get();
                return new AnonymousClass3E7((AnonymousClass190) this.A02.A97.get(), r12, (C24771Ds) this.A02.A6h.get(), (C24681Dj) this.A02.A6f.get());
            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                AnonymousClass2Md A0P = this.A01.A0O();
                A06(A0P);
                return A0P;
            case 68:
                return new C123875xE((C18820ts) this.A02.A9X.get(), (AnonymousClass1H2) this.A02.A2x.get(), (C104655Aq) this.A02.A00.ABd.get(), (AnonymousClass1HA) this.A02.A84.get(), C24291Bw.A00(), AnonymousClass1BE.A00());
            case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                return new C58302ze(this);
            case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                return new C191619Dr(this);
            case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                return new C191629Ds(this);
            case 72:
                return new C58312zf(this);
            case 73:
                return new C58322zg(this);
            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                return new C115905jd(this);
            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                return new C115915je(this);
            case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                return new C115925jf(this);
            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return new C191639Dt(this);
            case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return new C58332zh(this);
            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                return new C58342zi(this);
            default:
                throw new AssertionError(this.A03);
        }
    }

    public C32591ds(C27111My r1, C27071Mp r2, C32581dr r3, C18800tq r4, int i) {
        this.A02 = r4;
        this.A04 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = i;
    }

    public static AnonymousClass4QB A05() {
        AnonymousClass4QB A042 = A04();
        C19620wF.A00(A042);
        return A042;
    }

    public static void A06(AnonymousClass2Md r0) {
        C19620wF.A00(r0);
    }
}
