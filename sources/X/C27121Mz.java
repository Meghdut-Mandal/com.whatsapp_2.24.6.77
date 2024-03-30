package X;

import android.app.Activity;
import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.data.repository.MetaAISearchRepository;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.NewMediaPickerFragment;
import com.whatsapp.gallerypicker.MediaPickerFragment;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.1Mz  reason: invalid class name and case insensitive filesystem */
public final class C27121Mz implements AnonymousClass004 {
    public final C27111My A00;
    public final C18800tq A01;
    public final int A02;
    public final C27071Mp A03;

    public C27121Mz(C27111My r1, C27071Mp r2, C18800tq r3, int i) {
        this.A01 = r3;
        this.A03 = r2;
        this.A00 = r1;
        this.A02 = i;
    }

    public static AnonymousClass01I A01(Activity activity) {
        try {
            AnonymousClass01I r0 = (AnonymousClass01I) activity;
            C19620wF.A00(r0);
            return r0;
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected activity to be a FragmentActivity: ");
            sb.append(activity);
            throw new IllegalStateException(sb.toString(), e);
        }
    }

    public static C63463Kd A09(C19420v0 r1, C20810yC r2) {
        AnonymousClass00C.A0D(r2, 0);
        AnonymousClass00C.A0D(r1, 1);
        C63463Kd r0 = new C63463Kd();
        C19620wF.A00(r0);
        return r0;
    }

    private Object A0C() {
        switch (this.A02) {
            case 0:
                return new C196089Xp((C195119So) this.A01.A00.A0y.get(), (AnonymousClass9R1) this.A01.A00.A0z.get());
            case 1:
                return new C61413Bt(this);
            case 2:
                return new AnonymousClass3C1(this);
            case 3:
                return new AnonymousClass3C3(this);
            case 4:
                return new AnonymousClass1Q2(this);
            case 5:
                return new C28111Rj((C20810yC) this.A01.A02.get(), (C21010yW) this.A01.A79.get(), C18840tu.A00(this.A01.A00.A0f));
            case 6:
                return new C28121Rk(this);
            case 7:
                return new AnonymousClass1S1(this);
            case 8:
                return new AnonymousClass1Q5(this);
            case 9:
                return new C28131Rl(this);
            case 10:
                return new C28141Rm(this);
            case 11:
                return C20760y7.copyOf((Collection) A0G());
            case 12:
                return new C28151Rn(this);
            case 13:
                return new C28161Ro(this);
            case 14:
                return new C28171Rp(this);
            case 15:
                return new C28181Rq(this);
            case 16:
                return new MetaAISearchRepository((C115255ia) this.A00.A3s.get(), (AnonymousClass5AO) this.A00.A5S.get(), this.A00.A1y(), (AnonymousClass5LZ) this.A01.A00.ACu.get());
            case 17:
                return new C115255ia(this);
            case 18:
                return new C46012Ul();
            case 19:
                return new C115265ib(this);
            case 20:
                C20050ww r4 = (C20050ww) this.A01.A7v.get();
                C19420v0 r5 = (C19420v0) this.A01.A9G.get();
                AnonymousClass005 A002 = C18840tu.A00(this.A01.A96);
                C18820ts r6 = (C18820ts) this.A01.A9X.get();
                AnonymousClass004 A74 = this.A00.A3P;
                return new AnonymousClass5AO((C115265ib) this.A00.A0l.get(), r4, r5, r6, (C20810yC) this.A01.A02.get(), (AnonymousClass1WF) this.A01.A3W.get(), A002, A74);
            case 21:
                return new AnonymousClass1Q3(this);
            case 22:
                AnonymousClass1Pp r7 = (AnonymousClass1Pp) this.A01.A28.get();
                C18820ts r11 = (C18820ts) this.A01.A9X.get();
                AnonymousClass1RU r52 = (AnonymousClass1RU) this.A01.A08.get();
                C19650wI r12 = (C19650wI) this.A01.A4f.get();
                C19420v0 r10 = (C19420v0) this.A01.A9G.get();
                return new C129036Er((AnonymousClass17Y) this.A01.A3e.get(), (C19730wQ) this.A01.A4g.get(), r52, (AnonymousClass6TO) this.A01.AAB.get(), r7, (C27761Ps) this.A01.A2D.get(), (C19630wG) this.A01.A91.get(), r10, r11, r12, (C19770wU) this.A01.A9Y.get());
            case 23:
                C21010yW r62 = (C21010yW) this.A01.A79.get();
                AnonymousClass16D r42 = (AnonymousClass16D) this.A01.A2A.get();
                C27361Nx r72 = (C27361Nx) this.A01.A6d.get();
                return new C607739h((AnonymousClass17Y) this.A01.A3e.get(), r42, (C20810yC) this.A01.A02.get(), r62, r72, (C19770wU) this.A01.A9Y.get());
            case 24:
                AnonymousClass1NA A2N = C27111My.A2M(this.A00);
                return new C33081eg((C19970wo) this.A01.A8b.get(), (C19420v0) this.A01.A9G.get(), (C20810yC) this.A01.A02.get(), A2N);
            case 25:
                C24601Db r3 = (C24601Db) this.A01.A6D.get();
                AnonymousClass1EV r2 = (AnonymousClass1EV) this.A01.A6K.get();
                return new C33181er((C24881Ed) this.A01.A6H.get(), r3, r2, (C19770wU) this.A01.A9Y.get());
            case 26:
                return new AnonymousClass1Q8();
            case 27:
                C20310xM r63 = (C20310xM) this.A01.A2S.get();
                return new AnonymousClass9Nc((C19970wo) this.A01.A8b.get(), (C19420v0) this.A01.A9G.get(), (C220412q) this.A01.A1l.get(), r63, (AnonymousClass19A) this.A01.A4x.get(), (C238019x) this.A01.A8U.get());
            case 28:
                return new C57392yA(this);
            case 29:
                return new C57492yK(this);
            case 30:
                return new AnonymousClass60P(this);
            case 31:
                C19730wQ r32 = (C19730wQ) this.A01.A4g.get();
                AnonymousClass5l6 r43 = (AnonymousClass5l6) this.A01.ABu.get();
                AnonymousClass004 AiM = this.A01.A0V;
                return new AnonymousClass6WF(r32, r43, (C19970wo) this.A01.A8b.get(), C18840tu.A00(this.A01.AAc), C18840tu.A00(this.A01.AAw), AiM, this.A01.AAy, this.A01.A0Q);
            case 32:
                return new B9I(this, 0);
            case 33:
                return new C164327rd(this, 0);
            case 34:
                return new AnonymousClass9DS(this);
            case 35:
                return new C191469Db(this);
            case 36:
                return new C191479Dc(this);
            case 37:
                return new C191489Dd(this);
            case 38:
                return new C191499De(this);
            case 39:
                return new AnonymousClass3C0(this);
            case 40:
                return new AnonymousClass6W7((C19730wQ) this.A01.A4g.get(), (AnonymousClass17Z) this.A01.A95.get(), (AnonymousClass12O) this.A01.A98.get());
            case 41:
                return new C191509Df(this);
            case 42:
                return new C191519Dg(this);
            case 43:
                return new C191529Dh(this);
            case 44:
                return new AnonymousClass3C2(this);
            case 45:
                return new C57972z7(this);
            case 46:
                return new C115465iv(this);
            case 47:
                return new AnonymousClass2UX();
            case 48:
                return new AnonymousClass2Uj();
            case 49:
                return new C115475iw(this);
            case 50:
                return new C115485ix(this);
            case 51:
                return new C115495iy(this);
            case 52:
                return new C115505iz(this);
            case 53:
                return new C115515j0(this);
            case 54:
                return new C115525j1(this);
            case 55:
                return new C115535j2(this);
            case 56:
                return new C115545j3(this);
            case AnonymousClass8SU.IS_GROUP_HISTORY_MESSAGE_FIELD_NUMBER /*57*/:
                return new C115555j4(this);
            case 58:
                return new C115565j5(this);
            case 59:
                return new C115575j6(this);
            case AnonymousClass8SX.POLL_CREATION_MESSAGE_V2_FIELD_NUMBER /*60*/:
                return new C115585j7(this);
            case 61:
                return new C115595j8(this);
            case 62:
                return new C115605j9(this);
            case 63:
                return new C115615jA(this);
            case 64:
                return new C115625jB(this);
            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER /*65*/:
                return new C191539Di(this);
            case 66:
                return new C115635jC(this);
            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER /*67*/:
                return new C57982z8(this);
            case 68:
                return new C115645jD(this);
            case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER /*69*/:
                return new C115655jE(this);
            case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER /*70*/:
                return new C115665jF(this);
            case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER /*71*/:
                return new C115675jG(this);
            case 72:
                return new C115685jH(this);
            case 73:
                return new C115695jI(this);
            case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER /*74*/:
                return new C115705jJ(this);
            case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER /*75*/:
                return new C115715jK(this);
            case AnonymousClass8SX.ENC_EVENT_RESPONSE_MESSAGE_FIELD_NUMBER /*76*/:
                return new C115725jL(this);
            case AnonymousClass8SX.COMMENT_MESSAGE_FIELD_NUMBER /*77*/:
                return new C115735jM(this);
            case AnonymousClass8SX.NEWSLETTER_ADMIN_INVITE_MESSAGE_FIELD_NUMBER /*78*/:
                return new C164337re(this, 0);
            case AnonymousClass8SX.EXTENDED_TEXT_MESSAGE_WITH_PARENT_KEY_FIELD_NUMBER /*79*/:
                return new C164347rf(this, 0);
            case AnonymousClass8SX.PLACEHOLDER_MESSAGE_FIELD_NUMBER /*80*/:
                return new C164357rg(this, 0);
            case 81:
                return new C164367rh(this, 0);
            case AnonymousClass8SX.SECRET_ENCRYPTED_MESSAGE_FIELD_NUMBER /*82*/:
                return new C164377ri(this, 0);
            case 83:
                return new C164387rj(this, 0);
            case 84:
                return new C164397rk(this, 0);
            case 85:
                return new C164317rc(this, 0);
            case 86:
                return new C164407rl(this, 0);
            case 87:
                return new C164417rm(this, 0);
            case 88:
                return new C164427rn(this, 0);
            case 89:
                return new C164437ro(this, 0);
            case VoipLiteCamera.DEFAULT_SUPERNOVA_ORIENTATION /*90*/:
                return new C164447rp(this, 0);
            case 91:
                return new C33211eu(this);
            case 92:
                return new C57992z9(this);
            case 93:
                return new C58002zA(this);
            case 94:
                return new C115745jN(this);
            case 95:
                C19630wG r18 = (C19630wG) this.A01.A91.get();
                C19970wo r17 = (C19970wo) this.A01.A8b.get();
                AnonymousClass16L r16 = (AnonymousClass16L) this.A01.A0q.get();
                C25841Hw A8u = C18800tq.A8t(this.A01);
                AnonymousClass6N7 A2E = C27111My.A2D(this.A00);
                C125075zH r1 = r19;
                C19420v0 r33 = (C19420v0) this.A01.A9G.get();
                AnonymousClass16L r23 = r16;
                AnonymousClass1MK r24 = (AnonymousClass1MK) this.A01.A75.get();
                AnonymousClass1Q4 r25 = (AnonymousClass1Q4) this.A01.A00.A0w.get();
                C132726Uz r27 = (C132726Uz) this.A01.A00.A5w.get();
                C20690y0 r20 = (C20690y0) this.A01.A6r.get();
                AnonymousClass17Y r21 = (AnonymousClass17Y) this.A01.A3e.get();
                C106835Ln r22 = (C106835Ln) this.A01.A00.A3s.get();
                C125075zH r19 = new C125075zH(r20, r21, r22, r23, r24, r25, this.A00.A19(), r27, (C133106Wu) this.A01.A00.A5y.get(), (C64953Qc) this.A01.A00.A6G.get(), (C21060yb) this.A01.A8W.get(), r17, r18, r33, (C18820ts) this.A01.A9X.get(), A8u, (C20810yC) this.A01.A02.get(), A2E, (C19890wg) this.A01.A7i.get(), (C1270866x) this.A01.A00.A9g.get(), (C19770wU) this.A01.A9Y.get(), (C27721Pm) this.A01.A00.A0t.get());
                return r19;
            case 96:
                C27111My.A7X();
                C27111My.A7Y();
                GalleryTabHostFragment A0A = A0A();
                A0H(A0A);
                return A0A;
            case 97:
                return new C69843eB(this);
            case 98:
                return new C69833eA(this);
            case 99:
                return new C69853eC(this);
            default:
                throw new AssertionError(this.A02);
        }
    }

    private Object A0D() {
        switch (this.A02) {
            case 100:
                return new AnonymousClass3C4(this);
            case 101:
                return new AnonymousClass3C5(this);
            case 102:
                return new AnonymousClass3D6((AnonymousClass1NG) this.A01.A0v.get(), (C26371Jx) this.A01.A2n.get());
            case 103:
                return new C58012zB(this);
            case 104:
                return new AnonymousClass3C6(this);
            case 105:
                return new C58022zC(this);
            case 106:
                return new C58032zD(this);
            case 107:
                return new C58042zE(this);
            case C65953Uc.A03 /*108*/:
                C238019x r10 = (C238019x) this.A01.A8U.get();
                C20310xM r7 = (C20310xM) this.A01.A2S.get();
                AnonymousClass1I4 r6 = (AnonymousClass1I4) this.A01.Acv.get();
                AnonymousClass1I7 r5 = (AnonymousClass1I7) this.A01.AFI.get();
                AnonymousClass005 A002 = C18840tu.A00(this.A01.A25);
                C30951b2 r9 = (C30951b2) this.A01.AEN.get();
                AnonymousClass1I5 AIV = this.A01.AIU();
                return new C64733Pf((C19970wo) this.A01.A8b.get(), C18800tq.A7W(this.A01), (AnonymousClass1I6) this.A01.AFH.get(), r5, r6, r7, AIV, r9, r10, (C19770wU) this.A01.A9Y.get(), A002);
            case 109:
                return new AnonymousClass3C7(this);
            case 110:
                return new C58052zF(this);
            case 111:
                return new C58062zG(this);
            case 112:
                return new C58072zH(this);
            case 113:
                return new C58082zI(this);
            case 114:
                return new AnonymousClass3C8(this);
            case 115:
                return new C596434s((C220412q) this.A01.A1l.get(), this.A01.AzZ());
            case 116:
                return new C58092zJ(this);
            case 117:
                return new C69863eD(this);
            case 118:
                return new C58102zK(this);
            case 119:
                return new C58112zL(this);
            case 120:
                return new C56972xS(this);
            case 121:
                return new C56982xT(this);
            case 122:
                return new C69993eQ(this);
            case 123:
                return new C56992xU(this);
            case 124:
                return new C57002xV(this);
            case 125:
                return new C57012xW(this);
            case 126:
                return new C75103mg(this);
            case 127:
                return new C57022xX(this);
            case 128:
                return new C69963eN(this);
            case 129:
                return new C69973eO(this);
            case 130:
                return new C75053mb(this);
            case 131:
                return new C69983eP(this);
            case 132:
                return new C34361gu(this);
            case 133:
                return new C34431h2(this);
            case 134:
                return new C34441h3(this);
            case 135:
                return new C33261ez(this);
            case 136:
                return new AnonymousClass9DN(this);
            case 137:
                return new AnonymousClass9DO(this);
            case 138:
                return new AnonymousClass9DP(this);
            case 139:
                return new AnonymousClass9DQ(this);
            case 140:
                return new C34381gw(this);
            case 141:
                return new C33231ew(this);
            case 142:
                return new AnonymousClass2xY(this);
            case 143:
                return new C57032xZ(this);
            case MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT /*144*/:
                return new C61293Bh(this);
            case 145:
                return new C57042xa(this);
            case 146:
                return new C57052xb(this);
            case 147:
                return new C61303Bi(this);
            case 148:
                return new C61313Bj(this);
            case 149:
                return new C61323Bk(this);
            case 150:
                return new C57062xc(this);
            case 151:
                return new C57072xd(this);
            case 152:
                return new AnonymousClass2xe(this);
            case 153:
                return new C57082xf(this);
            case 154:
                return new AnonymousClass353((C27591Ow) this.A01.A5M.get(), (C19770wU) this.A01.A9Y.get());
            case 155:
                return new C61333Bl(this);
            case 156:
                C19420v0 r3 = (C19420v0) this.A01.A9G.get();
                C236419g r4 = (C236419g) this.A01.A1v.get();
                return new C62643Gy((C33201et) this.A00.A2K.get(), r3, r4, (C20810yC) this.A01.A02.get(), (C21010yW) this.A01.A79.get(), (AnonymousClass1C6) this.A01.A7s.get());
            case 157:
                AnonymousClass336 A3P = this.A00.A3O();
                A0I(A3P);
                return A3P;
            case 158:
                return new C61343Bm(this);
            case 159:
                return new C57092xg(this);
            case 160:
                return new AnonymousClass3OV(this);
            case 161:
                return new C57102xh(this);
            case 162:
                return new AnonymousClass3OW(this);
            case 163:
                return new AnonymousClass3OX(this);
            case 164:
                return new C57112xi(this);
            case 165:
                return new C57122xj(this);
            case 166:
                return new C61353Bn(this);
            case 167:
                return new C57132xk(this);
            case 168:
                return new C57142xl(this);
            case 169:
                return new C57152xm(this);
            case 170:
                return new C61363Bo(this);
            case 171:
                return new C57162xn(this);
            case 172:
                return new C61373Bp(this);
            case 173:
                return new C57172xo(this);
            case 174:
                return new C57182xp(this);
            case 175:
                return new C57192xq(this);
            case MediaCodecVideoEncoder.MIN_ENCODER_WIDTH /*176*/:
                return new C57202xr(this);
            case 177:
                return new AnonymousClass3OY(this);
            case 178:
                return new C57212xs(this);
            case 179:
                return new C61383Bq(this);
            case 180:
                return new C57222xt(this);
            case 181:
                return new C57232xu(this);
            case 182:
                return new C57242xv(this);
            case 183:
                return new C70673fX(this);
            case 184:
                return new C57252xw(this);
            case 185:
                return new C57262xx(this);
            case 186:
                return new C57272xy(this);
            case 187:
                AnonymousClass17T r62 = (AnonymousClass17T) this.A01.A7S.get();
                AnonymousClass1X4 A0x = C18800tq.A0w(this.A01);
                AnonymousClass16J r52 = (AnonymousClass16J) this.A01.A57.get();
                AnonymousClass1KK r42 = (AnonymousClass1KK) this.A01.A19.get();
                return new C39931uI((AnonymousClass17Y) this.A01.A3e.get(), A0x, r42, r52, r62, (C19770wU) this.A01.A9Y.get(), C18840tu.A00(this.A01.A14));
            case 188:
                AnonymousClass17Y r2 = (AnonymousClass17Y) this.A01.A3e.get();
                C87604Pl A3a = this.A01.A00.A3Z();
                AnonymousClass16D r32 = (AnonymousClass16D) this.A01.A2A.get();
                AnonymousClass1A5 r72 = (AnonymousClass1A5) this.A01.A2K.get();
                return new C62083Es(r2, r32, A3a, (C64403Nv) this.A01.A00.A6I.get(), (C19630wG) this.A01.A91.get(), r72, (C20810yC) this.A01.A02.get());
            case 189:
                return new C57282xz(this);
            case 190:
                return new C57292y0(this);
            case 191:
                return new C57302y1(this);
            case 192:
                return new C61393Br(this);
            case 193:
                return new C57312y2(this);
            case 194:
                return new C57322y3(this);
            case 195:
                return new C57332y4(this);
            case 196:
                return new C57342y5(this);
            case 197:
                return new AnonymousClass3OZ(this);
            case 198:
                return new C61403Bs(this);
            case 199:
                return new C79783uH(this);
            default:
                throw new AssertionError(this.A02);
        }
    }

    private Object A0E() {
        switch (this.A02) {
            case 200:
                return new C115275ic(this);
            case 201:
                return new C57352y6(this);
            case 202:
                return new C57362y7(this);
            case 203:
                return new C57372y8(this);
            case 204:
                return new C57382y9(this);
            case 205:
                return new C57402yB(this);
            case 206:
                return new C57412yC(this);
            case 207:
                return new C57422yD(this);
            case 208:
                return new C57432yE(this);
            case 209:
                return new C57442yF(this);
            case 210:
                return new C57452yG(this);
            case 211:
                return new C57462yH(this);
            case 212:
                return new C57472yI(this);
            case 213:
                return new C69783e5(this);
            case 214:
                return new C57482yJ(this);
            case 215:
                return new C57502yL(this);
            case 216:
                C125375zo r0 = new C125375zo();
                C21645ATl.A00(r0);
                return r0;
            case 217:
                return new AnonymousClass60O(this);
            case 218:
                return new C57512yM(this);
            case 219:
                return new C57522yN(this);
            case 220:
                return new C57532yO(this);
            case 221:
                return new C57542yP(this);
            case 222:
                return new C57552yQ(this);
            case 223:
                return new C130686Ma((C63563Kn) this.A00.A2l.get(), (C130236Kg) this.A01.A00.A8S.get());
            case 224:
                C19730wQ r2 = (C19730wQ) this.A01.A4g.get();
                C18820ts r4 = (C18820ts) this.A01.A9X.get();
                AnonymousClass3H7 A2R = C27111My.A2Q(this.A00);
                return new C63563Kn(r2, (C19420v0) this.A01.A9G.get(), r4, (AnonymousClass1A5) this.A01.A2K.get(), (C20810yC) this.A01.A02.get(), A2R);
            case 225:
                C27111My r1 = this.A00;
                AnonymousClass36U A07 = A07();
                r1.AAx(A07);
                return A07;
            case 226:
                C27111My r12 = this.A00;
                AnonymousClass3BF A06 = A06();
                r12.AAl(A06);
                return A06;
            case 227:
                return new C57562yR(this);
            case 228:
                return new C57572yS(this);
            case 229:
                return new C57582yT(this);
            case 230:
                return new C57592yU(this);
            case 231:
                return new C57602yV(this);
            case 232:
                return new C57612yW(this);
            case 233:
                C27111My r13 = this.A00;
                AnonymousClass3B6 A05 = A05();
                r13.AAc(A05);
                return A05;
            case 234:
                return new C57622yX(this);
            case 235:
                C228216c A8g = this.A01.A00.A8f();
                AnonymousClass005 A002 = C18840tu.A00(this.A01.A9X);
                AnonymousClass005 A003 = C18840tu.A00(this.A01.A43);
                C005602m A004 = AnonymousClass19Q.A00();
                return new C193919Nk((AnonymousClass17Y) this.A01.A3e.get(), (C20810yC) this.A01.A02.get(), A8g, A002, A003, A004);
            case 236:
                C27111My r14 = this.A00;
                AnonymousClass31O A08 = A08();
                r14.AB0(A08);
                return A08;
            case 237:
                return A09((C19420v0) this.A01.A9G.get(), (C20810yC) this.A01.A02.get());
            case 238:
                return new AnonymousClass2yY(this);
            case 239:
                return new C46052Uq();
            case 240:
                return new AnonymousClass2UY();
            case 241:
                return new C57632yZ(this);
            case 242:
                return new C57642ya(this);
            case 243:
                C27111My.A7X();
                C27111My.A7Y();
                return A00(C19460v5.A01(A0B()));
            case 244:
                return new AnonymousClass4ZF(this, 0);
            case 245:
                return new C75193mp(this);
            case 246:
                return new C117365m9((C20810yC) this.A01.A02.get());
            case 247:
                return new AnonymousClass3Bu(this);
            case 248:
                return new C57652yb(this);
            case 249:
                return new C61423Bv(this);
            case 250:
                return new C57662yc(this);
            case 251:
                return new C57672yd(this);
            case 252:
                return new C61433Bw(this);
            case 253:
                return new AnonymousClass9DR(this);
            case 254:
                return new C61443Bx(this);
            case 255:
                return new C61453By(this);
            case 256:
                return new C57682ye(this);
            case 257:
                return new C57692yf(this);
            case 258:
                return new C57702yg(this);
            case 259:
                return new C57712yh(this);
            case 260:
                return new C57722yi(this);
            case 261:
                return new C57732yj(this);
            case 262:
                return new C57742yk(this);
            case 263:
                return new C57752yl(this);
            case 264:
                return new C57762ym(this);
            case 265:
                return new C57772yn(this);
            case 266:
                return new B98(this, 0);
            case 267:
                return new AnonymousClass4ZZ(this, 0);
            case 268:
                return new AnonymousClass9DT(this);
            case 269:
                return new AnonymousClass9DU(this);
            case 270:
                return new AnonymousClass9DV(this);
            case 271:
                return new AnonymousClass2a2((C21100yf) this.A01.A7f.get(), (C19970wo) this.A01.A8b.get(), (C20310xM) this.A01.A2S.get(), (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), this.A01.AIv());
            case 272:
                return new AnonymousClass2Zz((C21100yf) this.A01.A7f.get(), (C19970wo) this.A01.A8b.get(), (C20310xM) this.A01.A2S.get(), (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), this.A01.AIv());
            case 273:
                return new AnonymousClass2a3((C21100yf) this.A01.A7f.get(), (C19970wo) this.A01.A8b.get(), (C20310xM) this.A01.A2S.get(), (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), this.A01.AIv());
            case 274:
                return new AnonymousClass2a0((C21100yf) this.A01.A7f.get(), (C19970wo) this.A01.A8b.get(), (C20310xM) this.A01.A2S.get(), (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), this.A01.AIv());
            case 275:
                return new AnonymousClass2a1((C21100yf) this.A01.A7f.get(), (C19970wo) this.A01.A8b.get(), (C20310xM) this.A01.A2S.get(), (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), this.A01.AIv());
            case 276:
                C21100yf r22 = (C21100yf) this.A01.A7f.get();
                C19970wo r42 = (C19970wo) this.A01.A8b.get();
                C20310xM r6 = (C20310xM) this.A01.A2S.get();
                C29551Xb AIw = this.A01.AIv();
                C24881Ed r7 = (C24881Ed) this.A01.A6H.get();
                return new AnonymousClass2a4(r22, (AnonymousClass16D) this.A01.A2A.get(), r42, (C18820ts) this.A01.A9X.get(), r6, r7, (C20810yC) this.A01.A02.get(), (C23075B3f) this.A01.A00.A0R.get(), (AnonymousClass1FR) this.A01.A6O.get(), AIw);
            case 277:
                return new AnonymousClass9DW(this);
            case 278:
                return new AnonymousClass9DX(this);
            case 279:
                return new AnonymousClass9DY(this);
            case 280:
                return new AnonymousClass9DZ(this);
            case 281:
                return new C191459Da(this);
            case 282:
                return new C115285id(this);
            case 283:
                return new C115295ie(this);
            case 284:
                return new C115305if(this);
            case 285:
                return new C115315ig(this);
            case 286:
                return new C115325ih(this);
            case 287:
                return new C115335ii(this);
            case 288:
                return new C115345ij(this);
            case 289:
                C19630wG r3 = (C19630wG) this.A01.A91.get();
                return new AnonymousClass5HJ((AnonymousClass16D) this.A01.A2A.get(), (AnonymousClass171) this.A01.A90.get(), r3, (AnonymousClass17X) this.A01.A3v.get());
            case 290:
                AnonymousClass19A r5 = (AnonymousClass19A) this.A01.A4x.get();
                C19630wG r43 = (C19630wG) this.A01.A91.get();
                return new AnonymousClass5HK((AnonymousClass16D) this.A01.A2A.get(), (AnonymousClass171) this.A01.A90.get(), r43, r5, (C197779cM) this.A00.A5N.get(), (C19770wU) this.A01.A9Y.get());
            case 291:
                return new C197779cM((C197999cj) this.A01.A00.AAE.get(), (C30131Zi) this.A01.A5h.get(), (C19770wU) this.A01.A9Y.get());
            case 292:
                return new C57782yo(this);
            case 293:
                return new C76273ob(this);
            case 294:
                return new C76283oc(this);
            case 295:
                return new C144706sg((C19730wQ) this.A01.A4g.get(), (C19600wD) this.A01.A24.get(), (C25781Hq) this.A01.A3V.get(), (C21010yW) this.A01.A79.get(), C18840tu.A00(this.A00.A5T));
            case 296:
                C227315o builderWithExpectedSize = C20760y7.builderWithExpectedSize(20);
                C18800tq.Aua();
                builderWithExpectedSize.addAll(C21644ATk.A00());
                builderWithExpectedSize.add((Object) this.A01.A00.A92());
                builderWithExpectedSize.add((Object) this.A01.A00.A0t());
                builderWithExpectedSize.add((Object) this.A01.A00.A4a());
                builderWithExpectedSize.add((Object) this.A01.A00.A2B());
                builderWithExpectedSize.add((Object) this.A01.A00.A2u());
                builderWithExpectedSize.add((Object) this.A01.A00.A7t());
                builderWithExpectedSize.add((Object) this.A01.A00.A4c());
                builderWithExpectedSize.add((Object) this.A01.A00.A4e());
                builderWithExpectedSize.add((Object) this.A01.A00.A5F());
                builderWithExpectedSize.add((Object) this.A01.A00.A1d());
                builderWithExpectedSize.add((Object) this.A01.A00.A4i());
                builderWithExpectedSize.add((Object) (AnonymousClass7gT) this.A01.A00.AD1.get());
                builderWithExpectedSize.add((Object) this.A01.A00.A6x());
                builderWithExpectedSize.add((Object) this.A01.A00.A6m());
                builderWithExpectedSize.add((Object) this.A01.A00.A0f());
                builderWithExpectedSize.add((Object) this.A01.A00.A7U());
                builderWithExpectedSize.add((Object) this.A01.A00.A8s());
                builderWithExpectedSize.add((Object) this.A01.A00.A4g());
                builderWithExpectedSize.add((Object) this.A01.A00.ACp());
                return builderWithExpectedSize.build();
            case 297:
                return new C590832o((C20780y9) this.A01.A2i.get());
            case 298:
                return new C57792yp(this);
            case 299:
                return new C57802yq(this);
            default:
                throw new AssertionError(this.A02);
        }
    }

    private Object A0F() {
        switch (this.A02) {
            case 300:
                return new AnonymousClass35H((C20810yC) this.A01.A02.get(), (AnonymousClass1BF) this.A01.A0Q.get());
            case 301:
                return new C57812yr(this);
            case 302:
                return new C130906Mx((C20050ww) this.A01.A7v.get(), (C19600wD) this.A01.A24.get(), (C117295m1) this.A01.A00.A7Q.get(), (AnonymousClass13E) this.A01.A96.get());
            case 303:
                AnonymousClass6SF A3T = this.A00.A3S();
                C21646ATm.A00(A3T);
                return A3T;
            case 304:
                return new C57822ys(this);
            case 305:
                return new C57832yt(this);
            case 306:
                return new C57842yu(this);
            case 307:
                return new C57852yv(this);
            case 308:
                return new C57862yw(this);
            case 309:
                return new C57872yx(this);
            case 310:
                return new C57882yy(this);
            case 311:
                return new C57892yz(this);
            case 312:
                return new C57902z0(this);
            case 313:
                return new C57912z1(this);
            case 314:
                return new C57922z2(this);
            case 315:
                return new C57932z3(this);
            case 316:
                return new C61463Bz(this);
            case 317:
                return new C115355ik(this);
            case 318:
                return new C57942z4(this);
            case 319:
                return new C57952z5(this);
            case 320:
                return new C57962z6(this);
            case 321:
                C201419jW r2 = new C201419jW();
                return new C69773e4(this.A00.A5d, C27111My.A22(this.A00), r2);
            case 322:
                C201419jW r7 = new C201419jW();
                C207739wu A23 = C27111My.A22(this.A00);
                return new C21122A9i((AnonymousClass01I) this.A00.A5P.get(), this.A00.A0z(), C18800tq.A8t(this.A01), A23, r7, (C21010yW) this.A01.A79.get());
            case 323:
                return A01(this.A00.A5d);
            case 324:
                return new C124795yo((C27631Pa) this.A01.A8z.get(), this.A00.A0v(), this.A00.A16(), AnonymousClass1BE.A00());
            case 325:
                AnonymousClass711 r72 = (AnonymousClass711) this.A01.A8v.get();
                AnonymousClass1PW r5 = (AnonymousClass1PW) this.A01.A74.get();
                C20830yE r8 = (C20830yE) this.A01.A9E.get();
                C19420v0 r9 = (C19420v0) this.A01.A9G.get();
                return new C144196rn(this.A00.A0v(), this.A00.A0x(), r5, (C122415uo) this.A01.A1K.get(), r72, r8, r9, (AnonymousClass13J) this.A01.A6z.get(), AnonymousClass1BE.A00());
            case 326:
                return new C124175xi((C24801Dv) this.A01.A0D.get(), this.A00.A0v(), this.A00.A14(), (AnonymousClass190) this.A01.A97.get(), AnonymousClass1BE.A00());
            case 327:
                return new C115365il(this);
            case 328:
                return new AnonymousClass5u5(C18840tu.A00(this.A01.A3S), C18840tu.A00(this.A00.A5U), C18840tu.A00(this.A00.A5L));
            case 329:
                return new C130116Ju((C115375im) this.A00.A4S.get(), this.A01.ANJ());
            case 330:
                return new C115375im(this);
            case 331:
                return new AnonymousClass5A4();
            case 332:
                return new C115385in(this);
            case 333:
                return new AnonymousClass5A5();
            case 334:
                C21060yb r3 = (C21060yb) this.A01.A8W.get();
                AnonymousClass1H2 r1 = (AnonymousClass1H2) this.A01.A2x.get();
                return A04(r3, (C18820ts) this.A01.A9X.get(), (AnonymousClass1N0) this.A01.A00.A3P.get(), r1, (C19890wg) this.A01.A7i.get());
            case 335:
                C19970wo r44 = (C19970wo) this.A01.A8b.get();
                C20810yC r43 = (C20810yC) this.A01.A02.get();
                AnonymousClass1X7 r42 = (AnonymousClass1X7) this.A01.A4o.get();
                AnonymousClass17Y r41 = (AnonymousClass17Y) this.A01.A3e.get();
                C19730wQ r40 = (C19730wQ) this.A01.A4g.get();
                AnonymousClass1XY r39 = (AnonymousClass1XY) this.A01.A7c.get();
                C19770wU r38 = (C19770wU) this.A01.A9Y.get();
                AnonymousClass16E r37 = (AnonymousClass16E) this.A01.A80.get();
                AnonymousClass1X4 r36 = (AnonymousClass1X4) this.A01.A8h.get();
                C32691e2 r35 = (C32691e2) this.A01.A4R.get();
                C24801Dv r34 = (C24801Dv) this.A01.A0D.get();
                C27731Pn r33 = (C27731Pn) this.A01.A2E.get();
                AnonymousClass2XH r32 = (AnonymousClass2XH) this.A01.A4W.get();
                C28781Ua r31 = (C28781Ua) this.A01.A9d.get();
                AnonymousClass1DW r30 = (AnonymousClass1DW) this.A01.A2f.get();
                AnonymousClass16D r29 = (AnonymousClass16D) this.A01.A2A.get();
                AnonymousClass1QO r28 = (AnonymousClass1QO) this.A01.A7E.get();
                AnonymousClass171 r27 = (AnonymousClass171) this.A01.A90.get();
                C18820ts r26 = (C18820ts) this.A01.A9X.get();
                AnonymousClass1SU r25 = (AnonymousClass1SU) this.A01.AQu.get();
                C32731e6 r24 = (C32731e6) this.A01.A6S.get();
                AnonymousClass16I r23 = (AnonymousClass16I) this.A01.A2B.get();
                C20310xM r22 = (C20310xM) this.A01.A2S.get();
                AnonymousClass1A1 r21 = (AnonymousClass1A1) this.A01.A3H.get();
                AnonymousClass16J r20 = (AnonymousClass16J) this.A01.A57.get();
                AnonymousClass1GQ r19 = (AnonymousClass1GQ) this.A01.A5a.get();
                AnonymousClass1CR r18 = (AnonymousClass1CR) this.A01.A1i.get();
                WfalManager wfalManager = (WfalManager) this.A01.A9U.get();
                C24361Cd r16 = (C24361Cd) this.A01.A1j.get();
                return new AnonymousClass3BT(C19460v5.A00(), C19460v5.A00(), C19460v5.A00(), r34, r41, r35, r40, r39, r36, wfalManager, r16, r29, r23, r27, r33, (AnonymousClass3NN) this.A01.A00.A9l.get(), (C19980wp) this.A01.A1x.get(), (C21060yb) this.A01.A8W.get(), r44, (C19420v0) this.A01.A9G.get(), r26, r22, r20, r24, r28, r37, r30, r43, (C25361Fz) this.A01.ASg.get(), (C233117z) this.A01.A3w.get(), r32, (AnonymousClass1Y4) this.A01.AZK.get(), r25, r19, (AnonymousClass1AW) this.A01.A4H.get(), (AnonymousClass1EO) this.A01.A4I.get(), r18, (AnonymousClass37S) this.A01.A00.A07.get(), (C29731Xt) this.A01.A81.get(), (C65553Sn) this.A01.A00.A3w.get(), (AnonymousClass3BQ) this.A01.A00.ACW.get(), r21, r42, r38, (C65813To) this.A01.A00.A70.get(), this.A01.A00.ADa(), (AnonymousClass33O) this.A01.A00.A6Z.get(), (C35011i0) this.A01.A00.A4Q.get(), r31);
            case 336:
                return new C96104mn((C115395io) this.A00.A4U.get(), (C115405ip) this.A00.A4V.get(), (C115415iq) this.A00.A4W.get(), (C115425ir) this.A00.A4X.get(), (C115435is) this.A00.A4Y.get(), (C115445it) this.A00.A4Z.get(), (C115455iu) this.A00.A4a.get(), (C145156tR) this.A01.A00.ABD.get(), (C20810yC) this.A01.A02.get(), (AnonymousClass13J) this.A01.A6z.get());
            case 337:
                return new C115395io(this);
            case 338:
                return new C115405ip(this);
            case 339:
                return new C115415iq(this);
            case 340:
                return new C115425ir(this);
            case 341:
                return new C115435is(this);
            case 342:
                return new C115445it(this);
            case 343:
                return new C115455iu(this);
            case 344:
                return new C195449Ui(this.A00.A5d, this.A00.A0O(), (C20810yC) this.A01.A02.get());
            case 345:
                return new C143446qZ(this.A00.A5d);
            case 346:
                return new C21121A9g(this.A00.A5d, (C20810yC) this.A01.A02.get(), (C19770wU) this.A01.A9Y.get());
            case 347:
                return new C174328Wb(this.A00.A5d, this.A00.A0O(), (C20810yC) this.A01.A02.get());
            default:
                throw new AssertionError(this.A02);
        }
    }

    public static void A0H(AnonymousClass02E r1) {
        AnonymousClass00C.A0D(r1, 0);
        C19620wF.A00(r1);
    }

    public Object get() {
        int i = this.A02 / 100;
        if (i == 0) {
            return A0C();
        }
        if (i == 1) {
            return A0D();
        }
        if (i == 2) {
            return A0E();
        }
        if (i == 3) {
            return A0F();
        }
        throw new AssertionError(this.A02);
    }

    public static AnonymousClass02E A00(C19460v5 r1) {
        Object A04 = r1.A04(new MediaPickerFragment());
        AnonymousClass00C.A08(A04);
        AnonymousClass02E r0 = (AnonymousClass02E) A04;
        C19620wF.A00(r0);
        return r0;
    }

    public static C123245wB A04(C21060yb r1, C18820ts r2, AnonymousClass1N0 r3, AnonymousClass1H2 r4, C19890wg r5) {
        C123245wB r0 = new C123245wB(r1, r2, r3, r4, r5);
        C19620wF.A00(r0);
        return r0;
    }

    public static AnonymousClass3B6 A05() {
        return new AnonymousClass3B6();
    }

    public static AnonymousClass3BF A06() {
        return new AnonymousClass3BF();
    }

    public static AnonymousClass36U A07() {
        return new AnonymousClass36U();
    }

    public static AnonymousClass31O A08() {
        return new AnonymousClass31O();
    }

    public static GalleryTabHostFragment A0A() {
        GalleryTabHostFragment galleryTabHostFragment = new GalleryTabHostFragment();
        C19620wF.A00(galleryTabHostFragment);
        return galleryTabHostFragment;
    }

    public static NewMediaPickerFragment A0B() {
        NewMediaPickerFragment newMediaPickerFragment = new NewMediaPickerFragment();
        C19620wF.A00(newMediaPickerFragment);
        return newMediaPickerFragment;
    }

    public static Set A0G() {
        HashSet hashSet = new HashSet();
        C19620wF.A00(hashSet);
        return hashSet;
    }

    public static void A0I(AnonymousClass336 r0) {
        C19620wF.A00(r0);
    }
}
