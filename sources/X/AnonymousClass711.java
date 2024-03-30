package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.GlVideoRenderer;
import com.whatsapp.voipcalling.VideoPort;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.711  reason: invalid class name */
public class AnonymousClass711 implements B3F {
    public int A00 = 0;
    public CallGridViewModel A01;
    public final C19730wQ A02;
    public final AnonymousClass53T A03;
    public final C20810yC A04;
    public final VoipCameraManager A05;
    public final AnonymousClass005 A06;
    public final Map A07 = C90524aI.A0s();
    public final AtomicInteger A08 = new AtomicInteger(0);
    public final C30531aM A09;
    public final C121465tB A0A;
    public final C119445pp A0B = new C119445pp(this);
    public final C20830yE A0C;
    public final AnonymousClass13J A0D;

    public C1493370u A03(UserJid userJid) {
        Map map = this.A07;
        UserJid userJid2 = userJid;
        if (map.containsKey(userJid)) {
            return (C1493370u) C90514aH.A0p(userJid, map);
        }
        C36321k7.A1K(userJid, "voip/VideoPortManager/getVideoPort creating port for ", AnonymousClass000.A0u());
        C121465tB r1 = this.A0A;
        C20810yC r6 = r1.A01;
        C1493370u r3 = new C1493370u(new C110375aZ(), this, r6, userJid2, this.A0D, new GlVideoRenderer(), !r1.A00.A0M(userJid));
        map.put(userJid, r3);
        return r3;
    }

    public void BRK(int i) {
    }

    public void BSv(VoipPhysicalCamera voipPhysicalCamera, int i) {
    }

    public void BTr(VoipPhysicalCamera voipPhysicalCamera) {
    }

    public static void A00(C1493370u r5, AnonymousClass711 r6) {
        if (r6.A00 >= 10) {
            Log.e("voip/VideoPortManager/setVideoPort failed to setup self port");
            C1501574e r4 = new C1501574e(r6, 44);
            if (r6.A04.A0E(7585)) {
                Voip.setAsyncCaptureFailed();
                C119445pp r3 = r6.A0B;
                synchronized (r3) {
                    Handler handler = r3.A00;
                    if (handler != null) {
                        handler.postDelayed(r4, 0);
                    }
                }
                return;
            }
            r4.run();
            return;
        }
        Log.i("voip/VideoPortManager/setVideoPort failed for self, retrying");
        C119445pp r42 = r6.A0B;
        C1501974i r32 = new C1501974i(r6, r5, 23);
        synchronized (r42) {
            Handler handler2 = r42.A00;
            if (handler2 != null) {
                handler2.postDelayed(r32, 500);
            }
        }
    }

    public static void A01(C1493370u r5, AnonymousClass711 r6) {
        UserJid userJid = r5.A0D;
        if (r6.A02.A0M(userJid)) {
            if (AnonymousClass3UD.A08(r6.A0C, r6.A0D, true)) {
                Log.w("voip/VideoPortManager/ camera permissions not granted, unable to set video preview port");
                return;
            }
            C119445pp r4 = r6.A0B;
            synchronized (r4) {
                if (r4.A00 == null) {
                    r4.A00 = new Handler(Looper.getMainLooper(), new C163797qm(r4.A01, 8));
                }
            }
            int videoPreviewPort = Voip.setVideoPreviewPort(r5);
            r6.A08.set(videoPreviewPort);
            r6.A00++;
            if (!r6.A04.A0E(7585)) {
                if (videoPreviewPort == 0) {
                    r6.A05.addCameraErrorListener(r6);
                    r6.A00 = 0;
                    return;
                }
            } else if (videoPreviewPort == 0) {
                return;
            }
            A00(r5, r6);
            return;
        }
        C1502474n r2 = new C1502474n(r6, userJid, r5, 32);
        if (r6.A04.A0E(7807)) {
            ((C19930wk) r6.A06.get()).execute(r2);
        } else {
            r2.run();
        }
    }

    public static void A02(AnonymousClass711 r3, UserJid userJid) {
        if (r3.A07.get(userJid) == null) {
            return;
        }
        if (r3.A02.A0M(userJid)) {
            Voip.setVideoPreviewPort((VideoPort) null);
            Voip.setVideoPreviewSize(0, 0);
            r3.A05.removeCameraErrorListener(r3);
            C119445pp r2 = r3.A0B;
            synchronized (r2) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.removeCallbacksAndMessages((Object) null);
                    r2.A00 = null;
                }
            }
            return;
        }
        C1501974i r22 = new C1501974i(r3, userJid, 24);
        if (r3.A04.A0E(7807)) {
            ((C19930wk) r3.A06.get()).execute(r22);
        } else {
            r22.run();
        }
    }

    public void A05() {
        C119445pp r2 = this.A0B;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.sendEmptyMessage(2);
            }
        }
    }

    public void A06() {
        C1493370u r3 = (C1493370u) this.A07.get(this.A03.A0S());
        if (r3 == null) {
            Log.w("voip/VideoPortManager/startCameraPreview no self video port");
            return;
        }
        if (AnonymousClass000.A1X(C110365aY.A00(r3.A0A, C36381kD.A0j(), new C163727qf(r3, 12))) || r3.A05 != null) {
            A01(r3, this);
        } else {
            r3.A09 = false;
        }
    }

    public void A07(UserJid userJid) {
        Map map = this.A07;
        if (map.containsKey(userJid)) {
            C36321k7.A1K(userJid, "voip/VideoPortManager/releaseVideoPort releasing port for ", AnonymousClass000.A0u());
            ((C1493370u) C90514aH.A0p(userJid, map)).release();
            map.remove(userJid);
        }
    }

    public void BX6(VoipPhysicalCamera voipPhysicalCamera) {
        C119445pp r2 = this.A0B;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.sendEmptyMessage(1);
            }
        }
    }

    public AnonymousClass711(C19730wQ r3, C30531aM r4, AnonymousClass53T r5, C121465tB r6, C20830yE r7, C20810yC r8, AnonymousClass13J r9, C19770wU r10, VoipCameraManager voipCameraManager) {
        this.A04 = r8;
        this.A02 = r3;
        this.A09 = r4;
        this.A0D = r9;
        this.A03 = r5;
        this.A0A = r6;
        this.A05 = voipCameraManager;
        this.A0C = r7;
        this.A06 = C165307tD.A00(r10, 1);
    }

    public void A04() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/VideoPortManager/releaseAllVideoPorts releasing ");
        Map map = this.A07;
        C90504aG.A1N(A0u, map);
        C36321k7.A1a(A0u, " remaining ports");
        Iterator A0y = AnonymousClass000.A0y(map);
        while (A0y.hasNext()) {
            ((C1493370u) C36351kA.A0u(A0y)).release();
        }
        map.clear();
        C119445pp r2 = this.A0B;
        synchronized (r2) {
            Handler handler = r2.A00;
            if (handler != null) {
                handler.removeCallbacksAndMessages((Object) null);
                r2.A00 = null;
            }
        }
        this.A00 = 0;
        this.A08.set(0);
    }

    public void BgK(VoipPhysicalCamera voipPhysicalCamera) {
        A05();
    }

    public void Bjq(VoipPhysicalCamera voipPhysicalCamera) {
        A05();
    }
}
