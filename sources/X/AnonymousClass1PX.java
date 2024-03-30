package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.calling.audio.VoipSystemAudioManager;
import com.whatsapp.calling.screenshare.ScreenShareResourceManager;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.JNIUtils;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: X.1PX  reason: invalid class name */
public class AnonymousClass1PX extends Handler {
    public AnonymousClass6YM A00;
    public boolean A01;
    public boolean A02;
    public final HashSet A03 = new HashSet();
    public final /* synthetic */ AnonymousClass1PW A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1PX(Looper looper, AnonymousClass1PW r3) {
        super(looper);
        this.A04 = r3;
    }

    private void A00() {
        C18830tt r3 = ((C18800tq) C19570wA.A00(C18800tq.class, this.A04.A01.A00)).AfI.A00;
        C18800tq r2 = r3.ADO;
        C19970wo r71 = (C19970wo) r2.A8b.get();
        C20810yC r72 = (C20810yC) r2.A02.get();
        AnonymousClass17Y r73 = (AnonymousClass17Y) r2.A3e.get();
        C18800tq r0 = r3.ADO;
        C18800tq r1 = r0;
        JNIUtils jNIUtils = new JNIUtils((C20810yC) r0.A02.get(), (C19730wQ) r1.A4g.get(), (C19630wG) r1.A91.get(), (C19770wU) r1.A9Y.get(), (C20690y0) r1.A6r.get(), C18800tq.A4U(r1), (C21100yf) r1.A7f.get(), C18800tq.A8t(r1), (C21060yb) r1.A8W.get(), (AnonymousClass13J) r1.A6z.get(), (C144796sp) r3.A0o.get(), (C236919l) r1.A5Q.get(), (VoipCameraManager) r1.A8x.get(), (VoipSystemAudioManager) r3.A4I.get(), (C20830yE) r1.A9E.get(), (C19420v0) r1.A9G.get(), (C27631Pa) r1.A8z.get(), (C19890wg) r1.A7i.get(), (AnonymousClass17Z) r1.A95.get(), r3.A3Q, r3.A3R);
        C236519h r85 = (C236519h) r2.A0G.get();
        C19700wN r86 = (C19700wN) r2.A2U.get();
        C19730wQ r87 = (C19730wQ) r2.A4g.get();
        C19630wG r88 = (C19630wG) r2.A91.get();
        C19770wU r89 = (C19770wU) r2.A9Y.get();
        C20690y0 r90 = (C20690y0) r2.A6r.get();
        C20050ww r84 = (C20050ww) r2.A7v.get();
        C30541aN A4U = C18800tq.A4U(r2);
        C25841Hw A8t = C18800tq.A8t(r2);
        AnonymousClass1C4 r83 = (AnonymousClass1C4) r2.A7e.get();
        AnonymousClass1C6 r82 = (AnonymousClass1C6) r2.A7s.get();
        AnonymousClass1ND r81 = (AnonymousClass1ND) r2.A1N.get();
        C19470v6 r92 = C19470v6.A00;
        AnonymousClass13I r80 = (AnonymousClass13I) r2.A4a.get();
        AnonymousClass1HM r79 = (AnonymousClass1HM) r2.A1F.get();
        C27721Pm r78 = (C27721Pm) r3.A0t.get();
        AnonymousClass1WQ r77 = (AnonymousClass1WQ) r2.A2g.get();
        AnonymousClass1MK r76 = (AnonymousClass1MK) r2.A75.get();
        AnonymousClass1NF r75 = (AnonymousClass1NF) r2.A8y.get();
        C105545Fb r74 = (C105545Fb) r3.A0q.get();
        AnonymousClass16D r70 = (AnonymousClass16D) r2.A2A.get();
        AnonymousClass187 r69 = (AnonymousClass187) r2.A7n.get();
        AnonymousClass13J r68 = (AnonymousClass13J) r2.A6z.get();
        C21060yb r67 = (C21060yb) r2.A8W.get();
        AnonymousClass171 r66 = (AnonymousClass171) r2.A90.get();
        C18820ts r65 = (C18820ts) r2.A9X.get();
        C27691Pi r64 = (C27691Pi) r2.A1J.get();
        AnonymousClass1YU r63 = (AnonymousClass1YU) r2.A3b.get();
        C27361Nx r62 = (C27361Nx) r2.A6d.get();
        AnonymousClass6WJ r61 = (AnonymousClass6WJ) r3.A0p.get();
        C20350xQ r60 = (C20350xQ) r2.A3k.get();
        AnonymousClass12O r59 = (AnonymousClass12O) r2.A98.get();
        AnonymousClass19J r58 = (AnonymousClass19J) r2.A9p.get();
        C144796sp r57 = (C144796sp) r3.A0o.get();
        AnonymousClass2ZG r56 = (AnonymousClass2ZG) r3.A0r.get();
        AnonymousClass1HJ r55 = (AnonymousClass1HJ) r2.A1O.get();
        AnonymousClass1PY r54 = (AnonymousClass1PY) r2.A1I.get();
        AnonymousClass1NM r53 = (AnonymousClass1NM) r2.A1c.get();
        AnonymousClass1CR r52 = (AnonymousClass1CR) r2.A1i.get();
        C27301Nr r51 = (C27301Nr) r2.A2m.get();
        C20600xp r50 = (C20600xp) r2.A5q.get();
        AnonymousClass189 r49 = (AnonymousClass189) r2.A7m.get();
        C106835Ln r48 = (C106835Ln) r3.A3s.get();
        C231417i r47 = (C231417i) r2.A8k.get();
        VoipCameraManager voipCameraManager = (VoipCameraManager) r2.A8x.get();
        C130046Jm r45 = (C130046Jm) r3.A2D.get();
        C79793uI r44 = (C79793uI) r3.A1H.get();
        C123765x3 r43 = (C123765x3) r3.A2U.get();
        AnonymousClass19L r42 = (AnonymousClass19L) r2.A4Y.get();
        AnonymousClass1DM r41 = (AnonymousClass1DM) r2.A6m.get();
        C26211Jh r40 = (C26211Jh) r2.A7X.get();
        AnonymousClass1PW r39 = (AnonymousClass1PW) r2.A74.get();
        C20830yE r38 = (C20830yE) r2.A9E.get();
        C19420v0 r37 = (C19420v0) r2.A9G.get();
        C227815t r36 = (C227815t) r2.A0h.get();
        C61693Db A2W = C18830tt.A2W(r3);
        AnonymousClass5k5 r35 = (AnonymousClass5k5) r3.A1a.get();
        C1260862m r34 = (C1260862m) r3.A1W.get();
        AnonymousClass1HO r33 = (AnonymousClass1HO) r2.A4M.get();
        AnonymousClass6XP r32 = (AnonymousClass6XP) r3.A4J.get();
        C130806Mm A2o = C18830tt.A2o(r3);
        AnonymousClass1GE r31 = (AnonymousClass1GE) r2.A3Y.get();
        C31031bA r30 = (C31031bA) r2.A7W.get();
        C27631Pa r29 = (C27631Pa) r2.A8z.get();
        C25271Fq r28 = (C25271Fq) r2.A9D.get();
        C117145lm r27 = (C117145lm) r3.A0u.get();
        C21380z9 r26 = (C21380z9) r2.A4b.get();
        C90964bE r25 = (C90964bE) r3.A0P.get();
        AnonymousClass3U0 r24 = (AnonymousClass3U0) r3.A0s.get();
        C20310xM r23 = (C20310xM) r2.A2S.get();
        AnonymousClass5k6 r22 = (AnonymousClass5k6) r3.A1b.get();
        AnonymousClass1HQ r21 = (AnonymousClass1HQ) r2.A5t.get();
        C30911ay r20 = (C30911ay) r2.A6n.get();
        AnonymousClass1G4 r19 = (AnonymousClass1G4) r2.A7Z.get();
        C27641Pb A4S = C18800tq.A4S(r2);
        AnonymousClass005 A002 = C18840tu.A00(r2.A1K);
        AnonymousClass005 A003 = C18840tu.A00(r2.A7V);
        C131176Oa r18 = (C131176Oa) r3.A3h.get();
        ScreenShareResourceManager screenShareResourceManager = (ScreenShareResourceManager) r3.A3i.get();
        Object obj = r2.A4C.get();
        Objects.requireNonNull(obj);
        AnonymousClass1GC r02 = new AnonymousClass1GC(obj);
        AnonymousClass005 A004 = C18840tu.A00(r2.A2i);
        AnonymousClass005 A005 = C18840tu.A00(r2.A1M);
        AnonymousClass6YM r91 = new AnonymousClass6YM(r92, r02, (C21390zA) r2.A0J.get(), r86, r35, r22, (AnonymousClass5k7) r3.A1c.get(), r90, r73, r87, r84, r58, r77, r48, r36, A4U, r29, A2W, r61, r74, r79, r56, r81, (C110345aW) r3.A0v.get(), r34, r54, r43, r24, r75, r18, screenShareResourceManager, r64, r45, r39, (C27671Pf) r2.A7a.get(), A2o, r21, (AnonymousClass798) r3.A37.get(), (C27701Pj) r2.A8w.get(), r32, r57, A4S, (C34631hO) r3.A2S.get(), r76, (C27651Pc) r2.A1w.get(), (C19600wD) r2.A24.get(), r70, r41, r66, r51, r53, (AnonymousClass1G5) r2.A2O.get(), r85, (C19980wp) r2.A1x.get(), r67, r71, r88, (AnonymousClass17Z) r2.A95.get(), r28, r38, r37, r65, r49, r69, r44, r27, r55, r23, r33, r40, r59, r47, A8t, r72, (C25781Hq) r2.A3V.get(), r60, r31, r83, r42, r50, r62, r20, r63, (WhatsAppDynamicPytorchLoader) r3.A4N.get(), r80, r30, r19, r52, r82, r25, (AnonymousClass3P4) r3.A48.get(), r68, r89, r26, r78, jNIUtils, voipCameraManager, A002, A003, A004, A005);
        this.A00 = r91;
        r91.A0M();
    }

    public void handleMessage(Message message) {
        boolean z;
        String obj;
        int i = message.what;
        if (i != 1) {
            if (i == 2) {
                Log.i("voice-service-wrapper/handler WHAT_STOP_SERVICE");
                this.A02 = false;
                z = this.A01;
            } else if (i == 4) {
                Log.i("voice-service-wrapper/handler WHAT_SERVICE_ON_BIND");
                if (this.A00 == null) {
                    A00();
                }
                this.A01 = true;
                AnonymousClass7gG r1 = (AnonymousClass7gG) message.obj;
                this.A03.add(r1);
                r1.BgL(this.A00);
                return;
            } else if (i == 5) {
                if (!this.A01) {
                    obj = "voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called while isBound is false";
                } else {
                    HashSet hashSet = this.A03;
                    if (!hashSet.contains(message.obj)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND is called with mismatch voiceServiceBinderComponent, actual ");
                        sb.append(hashSet);
                        sb.append(", given ");
                        sb.append(message.obj);
                        obj = sb.toString();
                    } else {
                        hashSet.remove(message.obj);
                        boolean z2 = !hashSet.isEmpty();
                        this.A01 = z2;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("voice-service-wrapper/handler WHAT_SERVICE_ON_UNBIND -- isBound ? ");
                        sb2.append(z2);
                        Log.i(sb2.toString());
                        z = this.A02;
                    }
                }
                Log.w(obj);
                return;
            } else {
                return;
            }
            if (!z) {
                Log.i("voice-service-wrapper destroyVoiceService");
                AnonymousClass6YM r0 = this.A00;
                if (r0 != null) {
                    r0.A0N();
                    this.A00 = null;
                    return;
                }
                return;
            }
            return;
        }
        if (this.A00 == null) {
            A00();
            this.A02 = true;
        }
        Object obj2 = message.obj;
        C18740tg.A06(obj2);
        AnonymousClass6YM r02 = this.A00;
        C18740tg.A06(r02);
        r02.A0U((C132636Up) obj2);
    }
}
