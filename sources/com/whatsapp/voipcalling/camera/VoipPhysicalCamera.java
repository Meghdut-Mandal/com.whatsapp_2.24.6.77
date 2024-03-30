package com.whatsapp.voipcalling.camera;

import X.A22;
import X.AYX;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass6PE;
import X.AnonymousClass737;
import X.AnonymousClass7d4;
import X.AnonymousClass83Y;
import X.AnonymousClass83Z;
import X.AnonymousClass88M;
import X.AnonymousClass88N;
import X.AnonymousClass88V;
import X.AnonymousClass88W;
import X.AnonymousClass88X;
import X.AnonymousClass9LG;
import X.AnonymousClass9NK;
import X.AnonymousClass9P9;
import X.AnonymousClass9XT;
import X.B3F;
import X.B4H;
import X.B8U;
import X.B8V;
import X.B8X;
import X.B8Y;
import X.C111595cX;
import X.C114735hk;
import X.C121875tr;
import X.C124015xS;
import X.C1272467n;
import X.C128656Dc;
import X.C131956Rl;
import X.C148326yg;
import X.C1498172w;
import X.C161987no;
import X.C166127v4;
import X.C1690483a;
import X.C18740tg;
import X.C1904898p;
import X.C191979Ff;
import X.C195779Vx;
import X.C196809aZ;
import X.C197149bD;
import X.C197439bi;
import X.C198549dl;
import X.C199559fW;
import X.C204179pa;
import X.C20810yC;
import X.C20973A1j;
import X.C21628ASu;
import X.C23058B2e;
import X.C23103B5a;
import X.C23105B5k;
import X.C23106B5l;
import X.C23107B5m;
import X.C23133B6o;
import X.C36321k7;
import X.C36331k8;
import X.C36351kA;
import X.C36381kD;
import X.C90494aF;
import X.C90514aH;
import X.C98054qm;
import android.content.Context;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

public abstract class VoipPhysicalCamera {
    public static final int CAMERA_MODE_CONSERVATIVE = 1;
    public static final int CAMERA_MODE_DEFAULT = 0;
    public static final int CAMERA_MODE_NO_FPS_RANGE = 2;
    public static final int ERROR_CAMERA_PROCESSOR_SETUP_ERROR = -11;
    public static final int ERROR_CAMERA_SESSION_CONFIGURING = -10;
    public static final int ERROR_EXCEPTION_IN_CAMERA = -9;
    public static final int ERROR_ILLEGAL_STATE_EXCEPTION = -14;
    public static final int ERROR_INVALID_STATE = -1;
    public static final int ERROR_NO_CAMERA_AFTER_OPEN = -5;
    public static final int ERROR_NO_CAMERA_IN_STOP = -6;
    public static final int ERROR_NO_SURFACE_TEXTURE = -12;
    public static final int ERROR_OPEN_CAMERA = -4;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_SECURITY_EXCEPTION = -13;
    public static final int ERROR_SETUP_PREVIEW = -2;
    public static final int ERROR_SET_PARAMETERS = -3;
    public static final int ERROR_START_FINAL_FAILED = -8;
    public static final int ERROR_SWITCH_SURFACE_VIEW = -7;
    public static final int ERROR_SYNC_RUN_TIMEOUT = -99;
    public static final int MESSAGE_LAST_CAMERA_CALLBACK_CHECK = 1;
    public static final int MESSAGE_ON_FRAME_AVAILABLE = 2;
    public static final int MESSAGE_RESEND_LAST_FRAME = 3;
    public static final int SUCCESS = 0;
    public static final String TAG = "voip/video/VoipCamera/";
    public final C20810yC abProps;
    public long cameraCallbackCount;
    public final C195779Vx cameraEventsDispatcher = new C195779Vx(this);
    public C23058B2e cameraProcessor;
    public boolean cameraProcessorEnabled = false;
    public final AnonymousClass9NK cameraProcessorFactory;
    public HandlerThread cameraThread;
    public final Handler cameraThreadHandler;
    public final Context context;
    public int deviceOrientation = 0;
    public long lastCameraCallbackTs;
    public boolean passiveMode;
    public final AnonymousClass13J systemFeatures;
    public volatile boolean textureApiFailed;
    public C1272467n textureHolder;
    public final long thresholdRestartCameraMillis = 2000;
    public long totalElapsedCameraCallbackTime;
    public VideoPort videoPort;
    public final Map virtualCameras = AnonymousClass001.A0J();

    public final synchronized void close(boolean z) {
        HandlerThread handlerThread;
        Log.i("voip/video/VoipCamera/close Enter");
        if (AnonymousClass000.A1X(syncRunOnCameraThread(new AYX(this, z), C36381kD.A0j())) && (handlerThread = this.cameraThread) != null) {
            handlerThread.quit();
            this.cameraThread = null;
        }
        Log.i("voip/video/VoipCamera/close Exit");
    }

    public abstract void closeOnCameraThread();

    public abstract int disableAREffectOnCameraThread();

    public abstract int enableAREffectOnCameraThread(C128656Dc r1, AnonymousClass7d4 r2);

    public abstract Point getAdjustedPreviewSize();

    public abstract CameraInfo getCameraInfo();

    public abstract int getCameraStartMode();

    public abstract C124015xS getLastCachedFrame();

    public abstract int getLatestFrame(ByteBuffer byteBuffer);

    public abstract boolean isCameraOpen();

    public void maybeUpdateCameraProcessorOrientation(int i) {
        syncRunOnCameraThread(new B8Y(this, i, 5), -100);
    }

    public abstract void onFrameAvailableOnCameraThread();

    public void onScreenShareInfoChanged(AnonymousClass6PE r1) {
    }

    public void resendLastFrame() {
    }

    public final synchronized int setVideoPort(VideoPort videoPort2) {
        int i;
        Log.i("voip/video/VoipCamera/setVideoPort Enter");
        i = -100;
        if (!this.abProps.A0E(7585)) {
            i = C90514aH.A0H(syncRunOnCameraThread(new B8X(videoPort2, this, 13), -100));
        } else if (this.cameraThreadHandler.post(new C1498172w(this, videoPort2, 22))) {
            i = 0;
        }
        C36321k7.A1T("voip/video/VoipCamera/setVideoPort Exit with ", AnonymousClass000.A0u(), i);
        return i;
    }

    /* renamed from: setVideoPortOnCameraThread */
    public abstract int m75lambda$setVideoPort$3$comwhatsappvoipcallingcameraVoipPhysicalCamera(VideoPort videoPort2);

    public final synchronized int start() {
        String str;
        int A0H;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/start Enter in ");
        if (this.passiveMode) {
            str = "passive ";
        } else {
            str = "active ";
        }
        A0u.append(str);
        C36321k7.A1a(A0u, "mode");
        A0H = C90514aH.A0H(B8U.A00(this, 22));
        C36321k7.A1T("voip/video/VoipCamera/start Exit with ", AnonymousClass000.A0u(), A0H);
        return A0H;
    }

    public abstract int startOnCameraThread();

    public final synchronized void stop() {
        Log.i("voip/video/VoipCamera/stop Enter");
        C36321k7.A1T("voip/video/VoipCamera/stop Exit with ", AnonymousClass000.A0u(), C90514aH.A0H(B8U.A00(this, 21)));
    }

    public abstract int stopOnCameraThread();

    public abstract void updatePreviewOrientation();

    public class CameraInfo {
        public final int format;
        public final int fps1000;
        public final int height;
        public final int idx;
        public final boolean isFrontCamera;
        public final int orientation;
        public final int width;

        public CameraInfo(int i, int i2, int i3, int i4, boolean z, int i5, int i6) {
            this.width = i;
            this.height = i2;
            this.format = i3;
            this.fps1000 = i4;
            this.isFrontCamera = z;
            this.orientation = i5;
            this.idx = i6;
        }
    }

    private void clearFrameAvailableMessages() {
        this.cameraThreadHandler.removeMessages(2);
    }

    public static int fpsRangeScore(int i, int i2, int i3) {
        int i4;
        if (i <= 5000) {
            i4 = -(5000 - i);
        } else {
            i4 = (-(i - 5000)) * 4;
        }
        return (i4 - AnonymousClass000.A05(i2, i3)) / 1000;
    }

    private void maybeUpdateCameraProcessorOrientationOnCameraThread(int i) {
        if (i != this.deviceOrientation) {
            this.deviceOrientation = i;
            if (this.cameraProcessorEnabled && this.cameraProcessor != null) {
                CameraInfo cameraInfo = getCameraInfo();
                AnonymousClass9XT r2 = new AnonymousClass9XT(cameraInfo.isFrontCamera, cameraInfo.width, cameraInfo.height, cameraInfo.orientation, i * 90);
                C1272467n r1 = this.textureHolder;
                if (r1 != null) {
                    r1.A04 = C36331k8.A02(r2.A06) / 90;
                }
                this.cameraProcessor.Bwq(r2);
            }
        }
    }

    private void notifyFrameAvailable() {
        this.cameraThreadHandler.sendEmptyMessage(2);
    }

    public final void addCameraEventsListener(B3F b3f) {
        C195779Vx r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.add(b3f);
        }
    }

    public final void clearLastFrameResendMessages() {
        this.cameraThreadHandler.removeMessages(3);
    }

    public void createTexture(int i, int i2) {
        C18740tg.A0D(AnonymousClass000.A1V(this.videoPort), "videoPort should not be null in createTexture");
        C1272467n r0 = this.textureHolder;
        if (r0 == null) {
            r0 = this.videoPort.createSurfaceTexture();
            this.textureHolder = r0;
            if (r0 == null) {
                Log.e("voip/video/VoipCamera/createSurfaceTexture failed to create SurfaceTexture");
                this.textureApiFailed = true;
                return;
            }
        }
        r0.A01.setOnFrameAvailableListener(new C204179pa(this));
        int i3 = i;
        int i4 = i2;
        this.textureHolder.A01.setDefaultBufferSize(i3, i4);
        if (this.cameraProcessor != null && this.cameraProcessorEnabled) {
            CameraInfo cameraInfo = getCameraInfo();
            AnonymousClass9XT r10 = new AnonymousClass9XT(cameraInfo.isFrontCamera, i3, i4, cameraInfo.orientation, this.deviceOrientation * 90);
            this.textureHolder.A04 = C36331k8.A02(r10.A06) / 90;
            C23058B2e b2e = this.cameraProcessor;
            SurfaceTexture surfaceTexture = this.textureHolder.A01;
            C21628ASu aSu = (C21628ASu) b2e;
            AnonymousClass00C.A0D(surfaceTexture, 0);
            if (!surfaceTexture.equals(aSu.A00)) {
                C20973A1j a1j = aSu.A05;
                int i5 = r10.A03;
                int i6 = r10.A02;
                boolean z = r10.A09;
                AnonymousClass88M r4 = (AnonymousClass88M) ((C23105B5k) a1j.B9y(C23105B5k.A00));
                if (!r4.A03) {
                    ImageReader imageReader = r4.A00;
                    if (imageReader == null) {
                        imageReader = ImageReader.newInstance(i5, i6, 1, 3);
                        r4.A00 = imageReader;
                    }
                    C199559fW r2 = new C199559fW(imageReader.getSurface(), false);
                    r2.A04 = 2;
                    r2.A02 = 1;
                    A22 a22 = new A22(new C198549dl(), r2);
                    a22.A06 = z;
                    r4.A01 = a22;
                    r4.A02 = r2;
                    ((C1690483a) ((C23107B5m) r4.A05(C23107B5m.A00))).A05.A02.A00(r4.A01);
                    r4.A03 = true;
                }
                C21628ASu.A00(aSu);
                A22 a222 = aSu.A03;
                if (a222 != null) {
                    C1690483a.A00(a1j).A03(a222);
                }
                aSu.A00 = surfaceTexture;
                C199559fW r22 = new C199559fW(surfaceTexture);
                aSu.A03 = new A22(aSu.A06, r22);
                aSu.A04 = r22;
                C1690483a.A00(a1j).A00(aSu.A03);
                aSu.Bwq(r10);
            }
        }
    }

    public int disableAREffect() {
        Log.i("voip/video/VoipCamera/disableAREffect Enter");
        int A0I = AnonymousClass000.A0I(B8U.A00(this, 20));
        C36321k7.A1T("voip/video/VoipCamera/disableAREffect Exit with ", AnonymousClass000.A0u(), A0I);
        return A0I;
    }

    public int enableAREffect(C128656Dc r4, AnonymousClass7d4 r5) {
        Log.i("voip/video/VoipCamera/enableAREffect Enter");
        int A0I = AnonymousClass000.A0I(syncRunOnCameraThread(new B8V(r5, this, r4, 5), -100));
        C36321k7.A1T("voip/video/VoipCamera/enableAREffect Exit with ", AnonymousClass000.A0u(), A0I);
        return A0I;
    }

    public final int getAverageCaptureFps() {
        long j = this.totalElapsedCameraCallbackTime;
        if (j <= 0) {
            return 0;
        }
        return (int) ((this.cameraCallbackCount * 1000) / j);
    }

    public final boolean isAvatarDriver() {
        return this.abProps.A0E(1402);
    }

    /* renamed from: lambda$close$6$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Boolean m70lambda$close$6$comwhatsappvoipcallingcameraVoipPhysicalCamera(boolean z) {
        boolean z2;
        if (z) {
            this.virtualCameras.clear();
        }
        if (this.virtualCameras.size() == 0) {
            closeOnCameraThread();
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: lambda$registerVirtualCamera$7$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m74lambda$registerVirtualCamera$7$comwhatsappvoipcallingcameraVoipPhysicalCamera(VoipCamera voipCamera) {
        boolean containsKey = this.virtualCameras.containsKey(Long.valueOf(voipCamera.userIdentity));
        Integer A0m = C36381kD.A0m();
        if (!containsKey) {
            this.virtualCameras.put(Long.valueOf(voipCamera.userIdentity), voipCamera);
        }
        return A0m;
    }

    /* renamed from: lambda$stop$5$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m77lambda$stop$5$comwhatsappvoipcallingcameraVoipPhysicalCamera() {
        int i;
        Iterator A0y = AnonymousClass000.A0y(this.virtualCameras);
        boolean z = true;
        while (true) {
            i = 0;
            if (!A0y.hasNext()) {
                break;
            } else if (((VoipCamera) C36351kA.A0u(A0y)).started) {
                z = false;
            }
        }
        if (z) {
            i = stopOnCameraThread();
        }
        return Integer.valueOf(i);
    }

    /* renamed from: lambda$unregisterVirtualCamera$8$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m79lambda$unregisterVirtualCamera$8$comwhatsappvoipcallingcameraVoipPhysicalCamera(VoipCamera voipCamera) {
        int i;
        this.virtualCameras.remove(Long.valueOf(voipCamera.userIdentity));
        if (this.virtualCameras.size() == 0) {
            i = stopOnCameraThread();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }

    public void releaseTexture() {
        C23058B2e b2e = this.cameraProcessor;
        if (b2e != null) {
            C21628ASu aSu = (C21628ASu) b2e;
            aSu.A00 = null;
            A22 a22 = aSu.A03;
            if (a22 != null) {
                C1690483a.A00(aSu.A05).A03(a22);
            }
            aSu.A03 = null;
            aSu.A04 = null;
        }
        if (this.textureHolder != null) {
            C18740tg.A0D(AnonymousClass000.A1V(this.videoPort), "videoPort should not be null in releaseTexture");
            this.textureHolder.A01.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
            clearFrameAvailableMessages();
            this.videoPort.releaseSurfaceTexture(this.textureHolder);
            this.textureHolder = null;
        }
    }

    public final void removeCameraEventsListener(B3F b3f) {
        C195779Vx r1 = this.cameraEventsDispatcher;
        synchronized (r1) {
            r1.A00.remove(b3f);
        }
    }

    public void setupCameraProcessor() {
        AnonymousClass9NK r1;
        if (this.cameraProcessor == null && isAvatarDriver() && (r1 = this.cameraProcessorFactory) != null) {
            Context context2 = this.context;
            AnonymousClass00C.A0D(context2, 0);
            C131956Rl.A01 = true;
            C148326yg r0 = r1.A04;
            C1904898p.A00 = r0;
            UserFlowJNIProvider.setUserFlowLogger((UserFlowLogger) r0.A02.getValue());
            C196809aZ r6 = C196809aZ.A00;
            C121875tr r5 = r1.A01;
            C111595cX r8 = new C111595cX();
            C191979Ff r3 = new C191979Ff(r1);
            AnonymousClass00C.A0D(r5, 2);
            C197149bD r4 = new C197149bD();
            r4.A00.put(B4H.A0A, r6);
            C20973A1j a1j = new C20973A1j(context2, new C197439bi(r4));
            a1j.A02(new AnonymousClass88X(a1j));
            a1j.A02(new AnonymousClass88W(a1j));
            AnonymousClass9NK r42 = r3.A00;
            a1j.A02(new AnonymousClass88V(r42.A00, a1j, r42.A03));
            a1j.A01(new C98054qm(a1j), C161987no.A00);
            a1j.A01(new C1690483a(a1j), C23107B5m.A00);
            a1j.A01(new AnonymousClass88N(a1j), C23106B5l.A01);
            a1j.A01(new AnonymousClass83Z(a1j), C23103B5a.A00);
            C114735hk r62 = new C114735hk(r5);
            AnonymousClass9LG r52 = new AnonymousClass9LG(r42.A02);
            AnonymousClass9P9 r43 = new AnonymousClass9P9(r3);
            a1j.A01(new AnonymousClass83Y(r43, r52, r62, a1j, r8), AnonymousClass83Y.A08);
            a1j.A01(new AnonymousClass88M(a1j), C23105B5k.A00);
            this.cameraProcessor = new C21628ASu(context2, a1j);
        }
    }

    public final void stopPeriodicCameraCallbackCheck() {
        this.cameraThreadHandler.removeMessages(1);
        this.lastCameraCallbackTs = SystemClock.elapsedRealtime();
    }

    public final Object syncRunOnCameraThread(Callable callable, Object obj) {
        Exchanger exchanger = new Exchanger();
        if (this.cameraThreadHandler.post(new AnonymousClass737(this, exchanger, callable, 25))) {
            return exchange(exchanger, (Object) null);
        }
        return obj;
    }

    public VoipPhysicalCamera(Context context2, C20810yC r5, AnonymousClass13J r6, AnonymousClass9NK r7) {
        this.context = context2;
        this.abProps = r5;
        this.systemFeatures = r6;
        this.cameraProcessorFactory = r7;
        C166127v4 r0 = new C166127v4(this);
        this.cameraThread = r0;
        r0.start();
        this.cameraThreadHandler = new C23133B6o(this.cameraThread.getLooper(), this, 6);
    }

    private Object exchange(Exchanger exchanger, Object obj) {
        try {
            return exchanger.exchange(obj);
        } catch (InterruptedException e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public long getFrameCount() {
        return this.cameraCallbackCount;
    }

    public long getTotalElapsedCameraCallbackTime() {
        return this.totalElapsedCameraCallbackTime;
    }

    public final boolean isPassiveMode() {
        return this.passiveMode;
    }

    public boolean isTextureApiFailed() {
        return this.textureApiFailed;
    }

    /* renamed from: lambda$enableAREffect$1$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m72lambda$enableAREffect$1$comwhatsappvoipcallingcameraVoipPhysicalCamera(C128656Dc r2, AnonymousClass7d4 r3) {
        return Integer.valueOf(enableAREffectOnCameraThread(r2, r3));
    }

    /* renamed from: lambda$maybeUpdateCameraProcessorOrientation$2$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m73lambda$maybeUpdateCameraProcessorOrientation$2$comwhatsappvoipcallingcameraVoipPhysicalCamera(int i) {
        maybeUpdateCameraProcessorOrientationOnCameraThread(i);
        return C36381kD.A0m();
    }

    /* renamed from: lambda$setVideoPort$4$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ Integer m76lambda$setVideoPort$4$comwhatsappvoipcallingcameraVoipPhysicalCamera(VideoPort videoPort2) {
        return Integer.valueOf(m75lambda$setVideoPort$3$comwhatsappvoipcallingcameraVoipPhysicalCamera(videoPort2));
    }

    /* renamed from: lambda$syncRunOnCameraThread$0$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ void m78lambda$syncRunOnCameraThread$0$comwhatsappvoipcallingcameraVoipPhysicalCamera(Exchanger exchanger, Callable callable) {
        try {
            exchange(exchanger, callable.call());
        } catch (Exception e) {
            throw AnonymousClass001.A0B(e);
        }
    }

    public int registerVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/Add new virtual camera with user identity ");
        C36351kA.A1S(A0u, voipCamera.userIdentity);
        return AnonymousClass000.A0I(syncRunOnCameraThread(new B8X(voipCamera, this, 14), C90494aF.A0U()));
    }

    public final void scheduleLastFrameResend(long j) {
        clearLastFrameResendMessages();
        this.cameraThreadHandler.sendEmptyMessageDelayed(3, j);
    }

    public final void startPeriodicCameraCallbackCheck() {
        stopPeriodicCameraCallbackCheck();
        this.cameraThreadHandler.sendEmptyMessageDelayed(1, 1000);
    }

    public int unregisterVirtualCamera(VoipCamera voipCamera) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("voip/video/VoipCamera/Remove virtual camera with user identity ");
        C36351kA.A1S(A0u, voipCamera.userIdentity);
        return AnonymousClass000.A0I(syncRunOnCameraThread(new B8X(voipCamera, this, 12), C90494aF.A0U()));
    }

    public final void updateCameraCallbackCheck() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.totalElapsedCameraCallbackTime += elapsedRealtime - this.lastCameraCallbackTs;
        this.lastCameraCallbackTs = elapsedRealtime;
        this.cameraCallbackCount++;
    }

    public final boolean useOutputFormatForSecondaryStream() {
        if (isAvatarDriver() || this.systemFeatures.BMU()) {
            return true;
        }
        return false;
    }

    /* renamed from: lambda$createTexture$9$com-whatsapp-voipcalling-camera-VoipPhysicalCamera  reason: not valid java name */
    public /* synthetic */ void m71lambda$createTexture$9$comwhatsappvoipcallingcameraVoipPhysicalCamera(SurfaceTexture surfaceTexture) {
        notifyFrameAvailable();
    }

    public final void setPassiveMode(boolean z) {
        this.passiveMode = z;
    }
}
