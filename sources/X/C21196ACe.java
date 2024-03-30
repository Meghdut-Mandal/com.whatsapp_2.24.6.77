package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.ACe  reason: case insensitive filesystem */
public final class C21196ACe implements B6C {
    public final C30681ab A00;
    public final AnonymousClass005 A01;

    public C21196ACe(C30681ab r2, AnonymousClass005 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void B22(AnonymousClass6CO r11, AnonymousClass8NK r12, AnonymousClass3T1 r13) {
        AnonymousClass2bI r132;
        C180898mb r4;
        C36331k8.A1I(r13, r12);
        if (!(r13 instanceof AnonymousClass2bI) || (r132 = (AnonymousClass2bI) r13) == null) {
            throw C165567td.A0K(0);
        }
        AnonymousClass8SW r0 = ((AnonymousClass8SU) r12.A00).key_;
        if (r0 == null) {
            r0 = AnonymousClass8SW.DEFAULT_INSTANCE;
        }
        AnonymousClass8NG A0Q = C170918Hz.A0Q(r0);
        A0Q.A0U();
        r12.A0W((AnonymousClass8SW) A0Q.A0R());
        r12.A0U();
        C20710y2 r02 = (C20710y2) this.A01.get();
        switch (r132.A00) {
            case 1:
                r4 = new C186438w4(r02.A00, (C181478nX) r132);
                break;
            case 4:
            case 12:
                r4 = new C186758we(r02.A00, r02.A0B, r132);
                break;
            case 5:
            case 13:
                r4 = new C186418w2(r02.A00, r132);
                break;
            case 6:
                r4 = new C186378vy(r02.A00, (C181238n9) r132);
                break;
            case 7:
            case 14:
                r4 = new C186428w3(r02.A00, r132);
                break;
            case 9:
                r4 = new C186778wg(r02.A00, (UserJid) null, (C181758nz) r132);
                break;
            case 10:
                r4 = new C186788wh(r02.A00, r02.A0H, (C181248nA) r132);
                break;
            case 11:
            case 167:
                int A05 = r02.A0E.A05(C65533Sl.A01(r132.A1J.A00));
                C19700wN r2 = r02.A00;
                if (A05 != 3) {
                    r4 = new C186358vw(r2, r132);
                    break;
                } else {
                    r4 = new C186718wa(r2, r02.A0G, (C181758nz) r132);
                    break;
                }
            case 15:
                r4 = new AnonymousClass8w6(r02.A00, (C181758nz) r132);
                break;
            case 16:
                r4 = new AnonymousClass8w5(r02.A00, (C181758nz) r132);
                break;
            case 17:
                r4 = new C186368vx(r02.A00, r132);
                break;
            case 18:
                r4 = new C186448w7(r02.A00, r132);
                break;
            case 20:
                r4 = new C177088dB(r02.A00, r02.A0B, (C181758nz) r132);
                break;
            case 21:
                r4 = new C186388vz(r02.A00, r132);
                break;
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 34:
            case 35:
            case 36:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 55:
                r4 = new C186488wB(r02.A00, (AnonymousClass2cG) r132);
                break;
            case 27:
                r4 = new C186898ws(r02.A00, (C181758nz) r132);
                break;
            case 28:
                r4 = new C186748wd(r02.A00, r02.A0H, (C181248nA) r132);
                break;
            case 29:
            case 30:
            case 142:
                r4 = new C186588wN(r02.A00, r132);
                break;
            case 31:
            case 32:
                r4 = new AnonymousClass8x3(r02.A00, r132);
                break;
            case 33:
                r4 = new C186318vs(r02.A00);
                break;
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 44:
                r4 = new C186828wl(r02.A00, r02.A0K, r132);
                break;
            case 51:
                r4 = new C186398w0(r02.A00, (C181758nz) r132);
                break;
            case 52:
                r4 = new C186408w1(r02.A00, (C181758nz) r132);
                break;
            case 53:
            case 54:
                r4 = new C186578wM(r02.A00, r132);
                break;
            case 56:
            case 59:
                r4 = new C186518wE(r02.A00, r132);
                break;
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER:
                r4 = new AnonymousClass8wI(r02.A00, (AnonymousClass2cJ) r132);
                break;
            case 58:
                r4 = new C186458w8(r02.A00, (AnonymousClass2cL) r132);
                break;
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER:
                r4 = new C186568wL(r02.A00, r132);
                break;
            case 61:
                r4 = new C186498wC(r02.A00, (AnonymousClass2cI) r132);
                break;
            case 62:
            case 63:
                r4 = new C186478wA(r02.A00, r132);
                break;
            case 64:
            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
            case 66:
                r4 = new C186668wV(r02.A00, r132);
                break;
            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                r4 = new C186818wk(r02.A00, r02.A0J, (AnonymousClass2cH) r132);
                break;
            case 68:
                r4 = new C186798wi(r02.A00, r02.A0B, r132);
                break;
            case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                r4 = new C186508wD(r02.A00, (AnonymousClass2cI) r132);
                break;
            case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                r4 = new C186628wR(r02.A00, r132);
                break;
            case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                r4 = new AnonymousClass8wJ(r02.A00, (C181088mu) r132);
                break;
            case 73:
            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                r4 = new C186768wf(r02.A00, C36441kJ.A0l(r132.A1J.A00), r132);
                break;
            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER:
                r4 = new C186858wo(r02.A00, r02.A0C, r02.A0D, (C181758nz) r132, r02.A0L);
                break;
            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER:
                C18800tq r1 = r02.A03.A00.A00;
                r4 = new C174528Xl(C36391kE.A0V(r1), C36351kA.A0a(r1), (C230817c) r1.A8G.get(), (AnonymousClass2cS) r132, (C238019x) r1.A8U.get());
                break;
            case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER:
                C18800tq r14 = r02.A09.A00.A00;
                r4 = new C174538Xm(C36391kE.A0V(r14), C36351kA.A0a(r14), (C230817c) r14.A8G.get(), (AnonymousClass2cS) r132, (C238019x) r14.A8U.get());
                break;
            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER:
                r4 = new C177078dA(r02.A00, r02.A0B, (C181758nz) r132);
                break;
            case AnonymousClass8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER:
                r4 = new C186558wK(r02.A00, r132);
                break;
            case 81:
                r4 = new C186548wH(r02.A00, (C181758nz) r132);
                break;
            case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER:
                r4 = new C186538wG(r02.A00, (C181758nz) r132);
                break;
            case 83:
                r4 = new C186618wQ(r02.A00, r132);
                break;
            case 84:
            case 85:
                r4 = new C186608wP(r02.A00, r132);
                break;
            case 87:
                r4 = new C186728wb(r02.A00, (C181758nz) r132, r02.A0L);
                break;
            case 88:
                C18800tq r15 = r02.A05.A00.A00;
                r4 = new C174548Xn(C36391kE.A0V(r15), C36351kA.A0a(r15), (C230817c) r15.A8G.get(), (AnonymousClass2cS) r132, (C238019x) r15.A8U.get());
                break;
            case 89:
                C18800tq r16 = r02.A0A.A00.A00;
                r4 = new C174558Xo(C36391kE.A0V(r16), C36351kA.A0a(r16), (C230817c) r16.A8G.get(), (AnonymousClass2cS) r132, (C238019x) r16.A8U.get());
                break;
            case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
            case 106:
                r4 = new C177108dD(r02.A00, r02.A0B, r02.A0E, r02.A0G, (C181758nz) r132);
                break;
            case 91:
            case 92:
                r4 = new C186598wO(r02.A00, r132);
                break;
            case 95:
                r4 = new C186878wq(r02.A00, r02.A0C, r02.A0D, (C181408nQ) r132, r02.A0L);
                break;
            case 96:
                r4 = new C186328vt(r02.A00);
                break;
            case 97:
                r4 = new C186528wF(r02.A00, (C181228n8) r132);
                break;
            case 98:
            case 105:
                r4 = new C186848wn(r02.A00, r02.A0E, r02.A0I, (C181758nz) r132);
                break;
            case 99:
                r4 = new C186338vu(r02.A00);
                break;
            case 100:
                r4 = new C186738wc(r02.A00, (C181758nz) r132, r02.A0L);
                break;
            case 101:
                if (r132.A0e() != null && r132.A0e().size() == 1) {
                    C19730wQ r6 = r02.A0B;
                    if (r6.A0M((AnonymousClass11F) r132.A0e().get(0))) {
                        r4 = new C177118dE(r02.A00, r6, r02.A0E, r02.A0G, (C181758nz) r132);
                        break;
                    }
                }
                r4 = new C177098dC(r02.A00, r02.A0B, (C181758nz) r132);
                break;
            case 102:
            case 103:
            case 104:
                r4 = new C186808wj(r02.A00, (C181678nr) r132);
                break;
            case 107:
                r4 = new C186348vv(r02.A00, (C181758nz) r132);
                break;
            case C65953Uc.A03:
                r4 = r02.A01.A00((C181588ni) r132);
                break;
            case 109:
                r4 = r02.A06.A00((C181598nj) r132);
                break;
            case 110:
                r4 = r02.A07.A00((C181608nk) r132);
                break;
            case 111:
                r4 = r02.A08.A00((C181618nl) r132);
                break;
            case 112:
            case 113:
            case 114:
                r4 = r02.A02.A00((C181728nw) r132);
                break;
            case 116:
                r4 = r02.A04.A00((C181548ne) r132);
                break;
            case 117:
                r4 = new C186698wY(r02.A00, (AnonymousClass2cN) r132);
                break;
            case 118:
                r4 = new C186678wW(r02.A00, r132);
                break;
            case 120:
                r4 = new C186638wS(r02.A00, r132);
                break;
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT:
                r4 = new C186838wm(r02.A00, r02.A0E, (C181738nx) r132, r02.A0L);
                break;
            case 131:
                r4 = new C186888wr(r02.A00, (C181758nz) r132);
                break;
            case 135:
                r4 = new C186648wT(r02.A00, r132);
                break;
            case 136:
                r4 = new C186658wU(r02.A00, r132);
                break;
            case 137:
            case 138:
                r4 = new AnonymousClass8x4(r02.A00, r132);
                break;
            case 140:
            case 141:
                r4 = new C186968wz(r02.A00, r02.A0F, r132);
                break;
            case 143:
                r4 = new C186868wp(r02.A00, r02.A0E, r02.A0F, (C181358nL) r132, r02.A0L);
                break;
            case 145:
                r4 = new C186958wy(r02.A00, r132, r02.A0L);
                break;
            case 147:
            case 155:
                r4 = new C186468w9(r02.A00, r132);
                break;
            case 148:
            case 149:
                r4 = new C186978x0(r02.A00, r02.A0E, r132, r02.A0L);
                break;
            case 150:
            case 151:
                r4 = new C187008x5(r02.A00, r132);
                break;
            case 152:
                r4 = new C186988x1(r02.A00, r02.A0E, r132, r02.A0L);
                break;
            case 156:
                r4 = new C186948wx(r02.A00, r132);
                break;
            case 162:
                r4 = new C186688wX(r02.A00, (AnonymousClass5JE) r132);
                break;
            case 165:
                r4 = new C186708wZ(r02.A00, (AnonymousClass5JD) r132);
                break;
            case 168:
                r4 = new C186998x2(r02.A00, r02.A0E, r132, r02.A0L);
                break;
            default:
                throw new C25311Fu(69, (String) null);
        }
        C64933Qa r22 = r132.A1J;
        r4.A09 = r22.A01;
        r4.A04 = r132.A0I;
        r4.A05 = r22.A00;
        r4.A0C = r22.A02;
        AnonymousClass8NK r3 = (AnonymousClass8NK) AnonymousClass8SU.DEFAULT_INSTANCE.A0p();
        AnonymousClass8NG A0i = AnonymousClass8SW.A0i();
        A0i.A0V(r4.A09);
        A0i.A0Y(r4.A0C);
        r3.A0V(C36391kE.A0B(r4.A04));
        r4.A0D(A0i, r3);
        r3.A0W((AnonymousClass8SW) A0i.A0R());
        r12.A0T(r3.A0R());
    }

    public C188108z3 BCR() {
        return C188108z3.CUSTOM_MESSAGE;
    }
}
