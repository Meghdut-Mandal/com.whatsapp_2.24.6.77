package com.whatsapp.voipcalling.camera;

import X.AnonymousClass000;
import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass13J;
import X.AnonymousClass6PE;
import X.AnonymousClass710;
import X.AnonymousClass752;
import X.AnonymousClass7d4;
import X.AnonymousClass7dI;
import X.AnonymousClass7dJ;
import X.AnonymousClass7dK;
import X.AnonymousClass7dL;
import X.AnonymousClass9NK;
import X.B3F;
import X.C105545Fb;
import X.C117965n7;
import X.C124015xS;
import X.C124435yB;
import X.C1278669y;
import X.C128656Dc;
import X.C132226Ss;
import X.C1493770z;
import X.C157267cg;
import X.C183828rQ;
import X.C18740tg;
import X.C1901797e;
import X.C19550w8;
import X.C19580wB;
import X.C19630wG;
import X.C19770wU;
import X.C20810yC;
import X.C21060yb;
import X.C27631Pa;
import X.C30531aM;
import X.C34681hT;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36431kI;
import X.C36441kJ;
import X.C90474aD;
import X.C90524aI;
import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class VoipCameraManager extends C19580wB {
    public final C20810yC abProps;
    public Integer cachedCameraCount = null;
    public final B3F cameraEventsListener = new AnonymousClass710(this);
    public final AnonymousClass9NK cameraProcessorFactory;
    public AnonymousClass7dI captureDeviceFactory;
    public AnonymousClass7dJ captureDeviceRefreshListener = null;
    public Integer currentApiVersion;
    public volatile VoipPhysicalCamera currentCamera;
    public Integer hammerHeadIdx;
    public final AtomicBoolean hasBeenQueriedByDriver = C36431kI.A1H();
    public volatile Point lastAdjustedCameraPreviewSize;
    public C157267cg mediaProjectionProvider;
    public AnonymousClass7dL onCameraClosedListener = null;
    public final SparseArray rawCameraInfoCache = new SparseArray();
    public final C124435yB screenShareDisplayManager;
    public Integer screenShareIdx;
    public final AnonymousClass13J systemFeatures;
    public final C21060yb systemServices;
    public final C27631Pa voipSharedPreferences;
    public final C19630wG waContext;
    public final C19770wU waWorkers;

    /* access modifiers changed from: private */
    public synchronized void closeCurrentCamera(VoipPhysicalCamera voipPhysicalCamera) {
        VoipPhysicalCamera voipPhysicalCamera2 = this.currentCamera;
        boolean z = false;
        C18740tg.A0D(C36361kB.A1a(voipPhysicalCamera2, voipPhysicalCamera), "attempted to close orphaned camera");
        if (voipPhysicalCamera2 != null) {
            AnonymousClass7dL r4 = this.onCameraClosedListener;
            if (r4 != null) {
                C124015xS lastCachedFrame = voipPhysicalCamera2.getLastCachedFrame();
                if (voipPhysicalCamera2.cameraProcessor != null && voipPhysicalCamera2.cameraProcessorEnabled) {
                    z = true;
                }
                C1493770z r42 = (C1493770z) r4;
                if (lastCachedFrame != null) {
                    r42.A00.A00.post(new AnonymousClass752(r42, C105545Fb.A01(lastCachedFrame), 10, z));
                }
            }
            if (voipPhysicalCamera2 != voipPhysicalCamera) {
                voipPhysicalCamera2.removeCameraEventsListener(this.cameraEventsListener);
                voipPhysicalCamera2.close(true);
            }
        }
        voipPhysicalCamera.removeCameraEventsListener(this.cameraEventsListener);
        unregisterDisplayListener();
        this.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
        this.currentCamera = null;
    }

    private synchronized int getCameraCountInternal() {
        int i;
        int currentApiVersion2 = getCurrentApiVersion();
        i = 0;
        if (currentApiVersion2 != 0) {
            if (currentApiVersion2 == 1) {
                i = Camera.getNumberOfCameras();
            } else if (currentApiVersion2 == 2) {
                CameraManager A0B = this.systemServices.A0B();
                if (A0B == null) {
                    Log.w("voip/VoipCameraManager/getCameraCount, unable to acquire camera manager");
                } else {
                    try {
                        i = A0B.getCameraIdList().length;
                    } catch (Exception unused) {
                        Log.w("voip/VoipCameraManager/getCameraCount, unable to connect to cameras!");
                    }
                }
            }
            if (this.systemFeatures.BMU()) {
                this.screenShareIdx = Integer.valueOf(i);
                i++;
            } else {
                this.screenShareIdx = null;
            }
            if (C34681hT.A0J(this.abProps)) {
                int i2 = i + 1;
                this.hammerHeadIdx = Integer.valueOf(i);
                i = i2;
            } else {
                this.hammerHeadIdx = null;
            }
        }
        return i;
    }

    private int getCameraInfoCacheKey(int i, int i2) {
        int i3 = i + i2;
        return ((i3 * (i3 + 1)) / 2) + i2;
    }

    public synchronized int getCameraCount(boolean z) {
        Integer num;
        num = this.cachedCameraCount;
        if (num == null || z) {
            num = Integer.valueOf(getCameraCountInternal());
            this.cachedCameraCount = num;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized org.pjsip.PjCameraInfo getCameraInfo(int r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r5 < 0) goto L_0x0058
            r2 = 0
            int r0 = r4.getCameraCount(r2)     // Catch:{ all -> 0x0063 }
            if (r5 >= r0) goto L_0x0058
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.hasBeenQueriedByDriver     // Catch:{ all -> 0x0063 }
            r0 = 1
            r1.compareAndSet(r2, r0)     // Catch:{ all -> 0x0063 }
            boolean r0 = r4.isScreenShareDevice(r5)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x002c
            X.0yC r1 = r4.abProps     // Catch:{ all -> 0x0063 }
            r0 = 4773(0x12a5, float:6.688E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x0027
            X.5yB r0 = r4.screenShareDisplayManager     // Catch:{ all -> 0x0063 }
            int r0 = r0.A00     // Catch:{ all -> 0x0063 }
            int r2 = r0 * 90
        L_0x0027:
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createScreenSharingInfo(r2)     // Catch:{ all -> 0x0063 }
            goto L_0x0036
        L_0x002c:
            boolean r0 = r4.isHammerheadDevice(r5)     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x0038
            org.pjsip.PjCameraInfo r0 = org.pjsip.PjCameraInfo.createHammerheadCameraInfo()     // Catch:{ all -> 0x0063 }
        L_0x0036:
            monitor-exit(r4)
            return r0
        L_0x0038:
            X.6Ss r2 = r4.getRawCameraInfo(r5)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x0061
            X.0yC r1 = r4.abProps     // Catch:{ all -> 0x0063 }
            X.1Pa r0 = r4.voipSharedPreferences     // Catch:{ all -> 0x0063 }
            org.pjsip.PjCameraInfo r3 = org.pjsip.PjCameraInfo.createFromRawInfo(r2, r1, r0)     // Catch:{ all -> 0x0063 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo camera "
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            r1.append(r5)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = " info: "
            X.C36321k7.A1K(r3, r0, r1)     // Catch:{ all -> 0x0063 }
            goto L_0x0061
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "voip/VoipCameraManager/getCameraInfo bad idx: "
            X.C36321k7.A1S(r0, r1, r5)     // Catch:{ all -> 0x0063 }
        L_0x0061:
            monitor-exit(r4)
            return r3
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.getCameraInfo(int):org.pjsip.PjCameraInfo");
    }

    public synchronized int getCurrentApiVersion() {
        int i;
        if (this.currentApiVersion == null) {
            i = 0;
            if (this.systemFeatures.BJo()) {
                this.currentApiVersion = C36361kB.A0i();
                C27631Pa r2 = this.voipSharedPreferences;
                String A09 = r2.A01.A09(151);
                if (TextUtils.isEmpty(A09)) {
                    A09 = C27631Pa.A00(r2).getString("camera2_required_hardware_support_level", (String) null);
                }
                if (!TextUtils.isEmpty(A09) && C183828rQ.A04(A09, getCachedCam2HardwareLevel())) {
                    this.currentApiVersion = C36361kB.A0j();
                }
            }
        }
        Integer num = this.currentApiVersion;
        C18740tg.A06(num);
        i = num.intValue();
        return i;
    }

    public synchronized void setCaptureDeviceFactory(AnonymousClass7dI r2) {
        this.captureDeviceFactory = r2;
    }

    public synchronized void setCaptureDeviceRefreshListener(AnonymousClass7dJ r2) {
        this.captureDeviceRefreshListener = r2;
    }

    public synchronized void setCurrentApiVersion(int i) {
        this.currentApiVersion = Integer.valueOf(i);
    }

    public synchronized void setMediaProjectionProvider(C157267cg r2) {
        this.mediaProjectionProvider = r2;
    }

    /* access modifiers changed from: private */
    public void clearStoredRawCameraInfo(int i, int i2) {
        C36341k9.A0u(C90474aD.A0F(this.voipSharedPreferences), C27631Pa.A01(i, i2));
    }

    private boolean isRawCameraInfoValid(int i, C132226Ss r8) {
        int i2;
        boolean z;
        int i3 = r8.A00;
        if (i3 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.orientation != r8.A01) {
                    return false;
                }
                i2 = cameraInfo.facing;
                z = r8.A05;
            } catch (RuntimeException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else {
            if (i3 == 2) {
                try {
                    CameraManager A0B = this.systemServices.A0B();
                    if (A0B != null) {
                        CameraCharacteristics cameraCharacteristics = A0B.getCameraCharacteristics(Integer.toString(i));
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num == null || num2 == null) {
                            Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                            return false;
                        } else if (r8.A01 != num.intValue()) {
                            return false;
                        } else {
                            i2 = r8.A05;
                            z = AnonymousClass000.A1Q(num2.intValue());
                        }
                    }
                } catch (Exception e2) {
                    Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e2);
                }
            }
            return false;
        }
        if (i2 == z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fe, code lost:
        if (r6 != null) goto L_0x0100;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0100, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r6 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        r6.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0114, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.C132226Ss loadFromCameraService(int r24) {
        /*
            r23 = this;
            r1 = r23
            int r2 = r1.getCurrentApiVersion()
            if (r2 == 0) goto L_0x0120
            r11 = 1
            r4 = r24
            if (r2 == r11) goto L_0x0017
            r0 = 2
            if (r2 != r0) goto L_0x0115
            X.0yb r0 = r1.systemServices
            X.6Ss r15 = X.C132226Ss.A00(r0, r4)
        L_0x0016:
            return r15
        L_0x0017:
            r15 = 0
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            r3.<init>()     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera.getCameraInfo(r4, r3)     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera r6 = android.hardware.Camera.open(r4)     // Catch:{ Exception -> 0x00f9, all -> 0x010c }
            android.hardware.Camera$Parameters r5 = r6.getParameters()     // Catch:{ Exception -> 0x00f7 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "voip/RawCameraInfo camera "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r4)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = " params, supported preview formats: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-format-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}, preview format values: "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.List r0 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = ", supported preview sizes: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-size-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}, preferred preview size: "
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = ", supported fps ranges: {"
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r0 = r5.get(r0)     // Catch:{ Exception -> 0x00f7 }
            r1.append(r0)     // Catch:{ Exception -> 0x00f7 }
            java.lang.String r0 = "}"
            X.C36321k7.A1a(r1, r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.List r1 = r5.getSupportedPreviewFormats()     // Catch:{ Exception -> 0x00f7 }
            if (r1 != 0) goto L_0x0089
            java.lang.String r0 = "voip/RawCameraInfo getSupportedPreviewFormats return null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0104
        L_0x0089:
            int r0 = r1.size()     // Catch:{ Exception -> 0x00f7 }
            int[] r10 = new int[r0]     // Catch:{ Exception -> 0x00f7 }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ Exception -> 0x00f7 }
            r2 = 0
        L_0x0094:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x00f7 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00f7 }
            int r1 = r2 + 1
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00f7 }
            r10[r2] = r0     // Catch:{ Exception -> 0x00f7 }
            r2 = r1
            goto L_0x0094
        L_0x00aa:
            java.util.List r0 = r5.getSupportedPreviewSizes()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d5
            java.util.ArrayList r9 = X.C36361kB.A0r(r0)     // Catch:{ Exception -> 0x00f7 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x00f7 }
        L_0x00b8:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x00f7 }
            android.hardware.Camera$Size r0 = (android.hardware.Camera.Size) r0     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00d3
            int r2 = r0.width     // Catch:{ Exception -> 0x00f7 }
            int r1 = r0.height     // Catch:{ Exception -> 0x00f7 }
            X.69y r0 = new X.69y     // Catch:{ Exception -> 0x00f7 }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x00f7 }
        L_0x00cf:
            r9.add(r0)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00b8
        L_0x00d3:
            r0 = r15
            goto L_0x00cf
        L_0x00d5:
            r9 = r15
        L_0x00d6:
            android.hardware.Camera$Size r0 = r5.getPreferredPreviewSizeForVideo()     // Catch:{ Exception -> 0x00f7 }
            if (r0 == 0) goto L_0x00e8
            int r1 = r0.width     // Catch:{ Exception -> 0x00f7 }
            int r0 = r0.height     // Catch:{ Exception -> 0x00f7 }
            X.69y r8 = new X.69y     // Catch:{ Exception -> 0x00f7 }
            r8.<init>(r1, r0)     // Catch:{ Exception -> 0x00f7 }
        L_0x00e5:
            int r0 = r3.facing     // Catch:{ Exception -> 0x00f7 }
            goto L_0x00ea
        L_0x00e8:
            r8 = r15
            goto L_0x00e5
        L_0x00ea:
            boolean r13 = X.C90514aH.A1V(r0)
            int r12 = r3.orientation     // Catch:{ Exception -> 0x00f7 }
            r14 = 0
            X.6Ss r7 = new X.6Ss     // Catch:{ Exception -> 0x00f7 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00f7 }
            goto L_0x0108
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f9:
            r0 = move-exception
            r6 = r15
        L_0x00fb:
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x010e }
            if (r6 == 0) goto L_0x0016
            r6.release()
            return r15
        L_0x0104:
            r6.release()
            return r15
        L_0x0108:
            r6.release()
            return r7
        L_0x010c:
            r0 = move-exception
            throw r0
        L_0x010e:
            r0 = move-exception
            if (r6 == 0) goto L_0x011f
            r6.release()
            throw r0
        L_0x0115:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "unsupported camera api version "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0d(r0, r1, r2)
        L_0x011f:
            throw r0
        L_0x0120:
            int[] r18 = X.C36441kJ.A1O()
            r18 = {480, 640} // fill-array
            r19 = 0
            r21 = 1
            r16 = 0
            r20 = 0
            r22 = 0
            X.6Ss r15 = new X.6Ss
            r17 = r16
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.loadFromCameraService(int):X.6Ss");
    }

    private void registerDisplayListener() {
        C124435yB r3 = this.screenShareDisplayManager;
        Context context = this.waContext.A00;
        AnonymousClass00C.A0D(context, 0);
        if (!r3.A04) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            r3.A02 = displayManager;
            if (displayManager != null) {
                displayManager.registerDisplayListener(r3.A05, C36341k9.A0H());
                r3.A04 = true;
            }
        }
        if (!C19550w8.A0A()) {
            this.screenShareDisplayManager.A03 = new C117965n7(this);
        }
    }

    private void unregisterDisplayListener() {
        C124435yB r2 = this.screenShareDisplayManager;
        r2.A03 = null;
        if (r2.A04) {
            DisplayManager displayManager = r2.A02;
            if (displayManager != null) {
                displayManager.unregisterDisplayListener(r2.A05);
            }
            r2.A04 = false;
        }
    }

    public void addCameraErrorListener(B3F b3f) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(b3f);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.5Nn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.5Nm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: com.whatsapp.voipcalling.camera.VoipLiteCamera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: X.5Nn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: X.5Nn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: X.5Nn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: X.5Nn} */
    /* JADX WARNING: type inference failed for: r13v3, types: [com.whatsapp.voipcalling.camera.VoipPhysicalCamera] */
    /* JADX WARNING: type inference failed for: r23v4, types: [X.8rQ] */
    /* JADX WARNING: type inference failed for: r23v5, types: [org.pjsip.PjCamera] */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01b5, code lost:
        return r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.whatsapp.voipcalling.camera.VoipCamera createCamera(int r36, int r37, int r38, int r39, int r40, long r41) {
        /*
            r35 = this;
            r5 = r35
            monitor-enter(r5)
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r4 = r5.currentCamera     // Catch:{ all -> 0x01bf }
            r13 = 0
            r8 = r36
            r9 = r37
            r6 = r38
            r7 = r39
            r0 = r41
            if (r4 == 0) goto L_0x0071
            boolean r2 = r4.useOutputFormatForSecondaryStream()     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x0024
            java.lang.String r2 = "voip/VoipCameraManager/createCamera ignoring input parameters. Caller should query getCameraInfo directly."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x01bf }
        L_0x001d:
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x01bf }
            r3.<init>(r4, r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01b4
        L_0x0024:
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera$CameraInfo r10 = r4.getCameraInfo()     // Catch:{ all -> 0x01bf }
            int r3 = r10.width     // Catch:{ all -> 0x01bf }
            if (r3 != r9) goto L_0x0038
            int r2 = r10.height     // Catch:{ all -> 0x01bf }
            if (r2 != r6) goto L_0x0038
            int r2 = r10.format     // Catch:{ all -> 0x01bf }
            if (r2 != r7) goto L_0x0038
            int r2 = r10.idx     // Catch:{ all -> 0x01bf }
            if (r2 == r8) goto L_0x001d
        L_0x0038:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera camera info doesn't match. Current cam: w/h: "
            r4.append(r0)     // Catch:{ all -> 0x01bf }
            r4.append(r3)     // Catch:{ all -> 0x01bf }
            java.lang.String r3 = "/"
            r4.append(r3)     // Catch:{ all -> 0x01bf }
            int r0 = r10.height     // Catch:{ all -> 0x01bf }
            r4.append(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = ", format: "
            r4.append(r2)     // Catch:{ all -> 0x01bf }
            int r0 = r10.format     // Catch:{ all -> 0x01bf }
            r4.append(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r1 = ", idx: "
            r4.append(r1)     // Catch:{ all -> 0x01bf }
            int r0 = r10.idx     // Catch:{ all -> 0x01bf }
            r4.append(r0)     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = ". New cam: w/h: "
            X.C90464aC.A1K(r0, r3, r4, r9, r6)     // Catch:{ all -> 0x01bf }
            r4.append(r2)     // Catch:{ all -> 0x01bf }
            r4.append(r7)     // Catch:{ all -> 0x01bf }
            X.C36321k7.A1S(r1, r4, r8)     // Catch:{ all -> 0x01bf }
            goto L_0x009a
        L_0x0071:
            boolean r2 = r5.isScreenShareDevice(r8)     // Catch:{ all -> 0x01bf }
            r22 = r40
            if (r2 == 0) goto L_0x009c
            X.7dI r2 = r5.captureDeviceFactory     // Catch:{ all -> 0x01bf }
            if (r2 != 0) goto L_0x0084
            java.lang.String r1 = "CaptureDeviceFactory must be set to enable screen share device"
        L_0x007f:
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x01bf }
            goto L_0x009a
        L_0x0084:
            X.7cg r2 = r5.mediaProjectionProvider     // Catch:{ all -> 0x01bf }
            if (r2 != 0) goto L_0x008b
            java.lang.String r1 = "MediaProjectionProvider must be set to enable screen share device"
            goto L_0x007f
        L_0x008b:
            com.whatsapp.calling.screenshare.ScreenShareViewModel r2 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r2     // Catch:{ all -> 0x01bf }
            android.media.projection.MediaProjection r11 = r2.A01     // Catch:{ all -> 0x01bf }
            r2.A01 = r13     // Catch:{ all -> 0x01bf }
            if (r11 == 0) goto L_0x0095
            goto L_0x0169
        L_0x0095:
            java.lang.String r0 = "MediaProjection is null, can't start screen share capture"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x01bf }
        L_0x009a:
            monitor-exit(r5)
            return r13
        L_0x009c:
            boolean r2 = r5.isHammerheadDevice(r8)     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x00d5
            X.0yC r14 = r5.abProps     // Catch:{ Exception -> 0x00c8 }
            X.13J r15 = r5.systemFeatures     // Catch:{ Exception -> 0x00c8 }
            X.0yb r4 = r5.systemServices     // Catch:{ Exception -> 0x00c8 }
            X.9NK r3 = r5.cameraProcessorFactory     // Catch:{ Exception -> 0x00c8 }
            X.0wG r2 = r5.waContext     // Catch:{ Exception -> 0x00c8 }
            android.content.Context r2 = r2.A00     // Catch:{ Exception -> 0x00c8 }
            r24 = 1
            com.whatsapp.voipcalling.camera.VoipLiteCamera r13 = new com.whatsapp.voipcalling.camera.VoipLiteCamera     // Catch:{ Exception -> 0x00c8 }
            r23 = r2
            r19 = r9
            r20 = r6
            r21 = r7
            r17 = r3
            r18 = r8
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ Exception -> 0x00c8 }
            r2 = 0
            r13.passiveMode = r2     // Catch:{ Exception -> 0x00c8 }
            goto L_0x01a6
        L_0x00c8:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x01bf }
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting Lite Camera. Idx: "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r8)     // Catch:{ all -> 0x01bf }
            goto L_0x01b9
        L_0x00d5:
            X.6Ss r2 = r5.getRawCameraInfo(r8)     // Catch:{ RuntimeException -> 0x01b6 }
            if (r2 == 0) goto L_0x0163
            int r3 = r2.A00     // Catch:{ RuntimeException -> 0x01b6 }
            if (r3 != 0) goto L_0x00fc
            X.0wG r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b6 }
            android.content.Context r14 = r2.A00     // Catch:{ RuntimeException -> 0x01b6 }
            X.0yC r15 = r5.abProps     // Catch:{ RuntimeException -> 0x01b6 }
            X.13J r3 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b6 }
            X.9NK r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b6 }
            X.5Nm r13 = new X.5Nm     // Catch:{ RuntimeException -> 0x01b6 }
            r19 = r9
            r20 = r6
            r21 = r7
            r17 = r3
            r18 = r8
            r16 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ RuntimeException -> 0x01b6 }
            goto L_0x01a6
        L_0x00fc:
            r2 = 1
            if (r3 != r2) goto L_0x0100
            goto L_0x012d
        L_0x0100:
            X.0wG r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b6 }
            android.content.Context r12 = r2.A00     // Catch:{ RuntimeException -> 0x01b6 }
            X.0yC r11 = r5.abProps     // Catch:{ RuntimeException -> 0x01b6 }
            X.0wU r10 = r5.waWorkers     // Catch:{ RuntimeException -> 0x01b6 }
            X.13J r4 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b6 }
            X.0yb r3 = r5.systemServices     // Catch:{ RuntimeException -> 0x01b6 }
            X.9NK r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b6 }
            X.8rQ r13 = new X.8rQ     // Catch:{ RuntimeException -> 0x01b6 }
            r23 = r13
            r24 = r12
            r25 = r3
            r26 = r11
            r27 = r2
            r28 = r4
            r29 = r10
            r30 = r8
            r31 = r9
            r32 = r6
            r33 = r7
            r34 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ RuntimeException -> 0x01b6 }
            r2 = 0
            goto L_0x0160
        L_0x012d:
            X.0wG r2 = r5.waContext     // Catch:{ RuntimeException -> 0x01b6 }
            android.content.Context r11 = r2.A00     // Catch:{ RuntimeException -> 0x01b6 }
            X.0yC r10 = r5.abProps     // Catch:{ RuntimeException -> 0x01b6 }
            X.13J r4 = r5.systemFeatures     // Catch:{ RuntimeException -> 0x01b6 }
            X.0yb r3 = r5.systemServices     // Catch:{ RuntimeException -> 0x01b6 }
            X.9NK r2 = r5.cameraProcessorFactory     // Catch:{ RuntimeException -> 0x01b6 }
            org.pjsip.PjCamera r13 = new org.pjsip.PjCamera     // Catch:{ RuntimeException -> 0x01b6 }
            r23 = r13
            r24 = r11
            r25 = r10
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r8
            r30 = r9
            r31 = r6
            r32 = r7
            r33 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ RuntimeException -> 0x01b6 }
            X.1Pa r2 = r5.voipSharedPreferences     // Catch:{ RuntimeException -> 0x01b6 }
            android.content.SharedPreferences r3 = X.C27631Pa.A00(r2)     // Catch:{ RuntimeException -> 0x01b6 }
            java.lang.String r2 = "force_passive_capture_dev_stream_role"
            boolean r2 = X.C36371kC.A1U(r3, r2)     // Catch:{ RuntimeException -> 0x01b6 }
        L_0x0160:
            r13.passiveMode = r2     // Catch:{ RuntimeException -> 0x01b6 }
            goto L_0x01a6
        L_0x0163:
            java.lang.String r2 = "voip/VoipCameraManager/createCamera couldn't get camera info"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ RuntimeException -> 0x01b6 }
            goto L_0x01ab
        L_0x0169:
            r5.registerDisplayListener()     // Catch:{ all -> 0x01bf }
            X.7dI r12 = r5.captureDeviceFactory     // Catch:{ all -> 0x01bf }
            X.70w r12 = (X.C1493470w) r12     // Catch:{ all -> 0x01bf }
            X.0yb r2 = r12.A04     // Catch:{ all -> 0x01bf }
            android.view.WindowManager r3 = r2.A0L()     // Catch:{ all -> 0x01bf }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x01bf }
            X.5zn r2 = X.AnonymousClass6PE.A03     // Catch:{ all -> 0x01bf }
            android.content.Context r10 = r12.A00     // Catch:{ all -> 0x01bf }
            X.6PE r27 = r2.A00(r10, r3)     // Catch:{ all -> 0x01bf }
            X.0yC r9 = r12.A05     // Catch:{ all -> 0x01bf }
            X.13J r6 = r12.A06     // Catch:{ all -> 0x01bf }
            X.1aM r4 = r12.A01     // Catch:{ all -> 0x01bf }
            X.6Oa r3 = r12.A02     // Catch:{ all -> 0x01bf }
            com.whatsapp.calling.screenshare.ScreenShareResourceManager r2 = r12.A03     // Catch:{ all -> 0x01bf }
            X.5Nn r13 = new X.5Nn     // Catch:{ all -> 0x01bf }
            r23 = r13
            r24 = r10
            r25 = r11
            r26 = r4
            r28 = r3
            r29 = r2
            r30 = r9
            r31 = r6
            r32 = r8
            r33 = r7
            r34 = r22
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x01bf }
        L_0x01a6:
            X.B3F r2 = r5.cameraEventsListener     // Catch:{ all -> 0x01bf }
            r13.addCameraEventsListener(r2)     // Catch:{ all -> 0x01bf }
        L_0x01ab:
            r5.currentCamera = r13     // Catch:{ all -> 0x01bf }
            com.whatsapp.voipcalling.camera.VoipPhysicalCamera r2 = r5.currentCamera     // Catch:{ all -> 0x01bf }
            com.whatsapp.voipcalling.camera.VoipCamera r3 = new com.whatsapp.voipcalling.camera.VoipCamera     // Catch:{ all -> 0x01bf }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x01bf }
        L_0x01b4:
            monitor-exit(r5)
            return r3
        L_0x01b6:
            r2 = move-exception
            java.lang.String r0 = "voip/VoipCameraManager/createCamera error while starting camera"
        L_0x01b9:
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x01bf }
            monitor-exit(r5)
            r0 = 0
            return r0
        L_0x01bf:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.createCamera(int, int, int, int, int, long):com.whatsapp.voipcalling.camera.VoipCamera");
    }

    public boolean disableAREffect() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || voipPhysicalCamera.disableAREffect() != 0) {
            return false;
        }
        return true;
    }

    public boolean enableAREffect(C128656Dc r3, AnonymousClass7d4 r4) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || voipPhysicalCamera.enableAREffect(r3, r4) != 0) {
            return false;
        }
        return true;
    }

    public Point getAdjustedCameraPreviewSize(AnonymousClass7dK r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i = C27631Pa.A00(this.voipSharedPreferences).getInt("lowest_camera_hardware_support_level", -1);
        if (i == -1) {
            CameraManager A0B = this.systemServices.A0B();
            if (A0B == null) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
            } else {
                int[] iArr = C183828rQ.A0K;
                int i2 = 4;
                try {
                    if (A0B.getCameraIdList().length > 0) {
                        for (String cameraCharacteristics : A0B.getCameraIdList()) {
                            Integer num = (Integer) A0B.getCameraCharacteristics(cameraCharacteristics).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= i2) {
                                        break;
                                    } else if (num.intValue() == iArr[i3]) {
                                        i2 = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                        if (i2 < 4) {
                            i = iArr[i2];
                            C36341k9.A0v(C90474aD.A0F(this.voipSharedPreferences), "lowest_camera_hardware_support_level", i);
                        }
                    }
                } catch (AssertionError | Exception e) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e);
                }
            }
            i = -1;
            C36341k9.A0v(C90474aD.A0F(this.voipSharedPreferences), "lowest_camera_hardware_support_level", i);
        }
        C36321k7.A1T("voip/VoipCameraManager/getCachedCam2HardwareLevel got:", AnonymousClass000.A0u(), i);
        return i;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public int getHammerheadIndex() {
        Integer num = this.hammerHeadIdx;
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    public C124015xS getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized C132226Ss getRawCameraInfo(int i) {
        C132226Ss r2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        C1278669y r16;
        JSONArray jSONArray3;
        JSONArray jSONArray4;
        synchronized (this) {
            int currentApiVersion2 = getCurrentApiVersion();
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
            int i2 = i;
            A0u.append(i2);
            C36321k7.A1T(" enabled camera version: ", A0u, currentApiVersion2);
            int i3 = i + currentApiVersion2;
            int i4 = ((i3 * (i3 + 1)) / 2) + currentApiVersion2;
            r2 = (C132226Ss) this.rawCameraInfoCache.get(i4);
            if (r2 == null || (r2.A04 && !isRawCameraInfoValid(i2, r2))) {
                String A0t = C36371kC.A0t(C27631Pa.A00(this.voipSharedPreferences), C27631Pa.A01(i2, currentApiVersion2));
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
                A0u2.append(i2);
                C36321k7.A1Q(": ", A0t, A0u2);
                ArrayList arrayList = null;
                if (!TextUtils.isEmpty(A0t)) {
                    try {
                        JSONObject A1C = C36441kJ.A1C(A0t);
                        int i5 = A1C.getInt("version");
                        boolean z = true;
                        if (i5 != 1) {
                            StringBuilder A0u3 = AnonymousClass000.A0u();
                            A0u3.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                            A0u3.append(i5);
                            C36321k7.A1T(", required ", A0u3, 1);
                        } else {
                            int i6 = A1C.getInt("apiVersion");
                            if (i6 == 1 || i6 == 2) {
                                boolean z2 = A1C.getBoolean("isFrontCamera");
                                int i7 = A1C.getInt("orientation");
                                if (!A1C.has("has_unstable_orientation") || !A1C.getBoolean("has_unstable_orientation")) {
                                    z = false;
                                }
                                JSONArray jSONArray5 = A1C.getJSONArray("supportFormats");
                                if (jSONArray5 == null) {
                                    Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                                } else {
                                    int[] iArr = new int[jSONArray5.length()];
                                    for (int i8 = 0; i8 < jSONArray5.length(); i8++) {
                                        iArr[i8] = jSONArray5.getInt(i8);
                                    }
                                    if (!A1C.has("preferredSize") || (jSONArray4 = A1C.getJSONArray("preferredSize")) == null) {
                                        r16 = null;
                                    } else if (jSONArray4.length() != 2) {
                                        C36321k7.A1J(jSONArray4, "voip/RawCameraInfo createFromJson bad preferred size ", AnonymousClass000.A0u());
                                    } else {
                                        r16 = new C1278669y(jSONArray4.getInt(0), jSONArray4.getInt(1));
                                    }
                                    if (A1C.has("previewSizes") && (jSONArray3 = A1C.getJSONArray("previewSizes")) != null) {
                                        int length = jSONArray3.length();
                                        if (length % 2 == 0) {
                                            arrayList = C36441kJ.A14(length / 2);
                                            for (int i9 = 0; i9 < length; i9 += 2) {
                                                arrayList.add(new C1278669y(jSONArray3.getInt(i9), jSONArray3.getInt(i9 + 1)));
                                            }
                                        } else {
                                            throw new JSONException("length is not even");
                                        }
                                    }
                                    r2 = new C132226Ss(r16, arrayList, iArr, i6, i7, z2, z);
                                    if (!isRawCameraInfoValid(i2, r2)) {
                                        C36321k7.A1L(r2, "voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ", AnonymousClass000.A0u());
                                        clearStoredRawCameraInfo(i2, r2.A00);
                                    }
                                    this.rawCameraInfoCache.put(i4, r2);
                                }
                            } else {
                                C36321k7.A1T("voip/RawCameraInfo/createFromJson, skip unsupported api version ", AnonymousClass000.A0u(), i6);
                            }
                        }
                    } catch (JSONException e) {
                        Log.e((Throwable) e);
                    }
                }
                r2 = loadFromCameraService(i2);
                if (r2 != null) {
                    JSONObject A1B = C36441kJ.A1B();
                    String str = null;
                    try {
                        A1B.put("version", 1);
                        A1B.put("apiVersion", r2.A00);
                        A1B.put("isFrontCamera", r2.A05);
                        A1B.put("orientation", r2.A01);
                        A1B.put("has_unstable_orientation", r2.A04);
                        JSONArray A0u4 = C90524aI.A0u();
                        for (int put : r2.A06) {
                            A0u4.put(put);
                        }
                        A1B.put("supportFormats", A0u4);
                        C1278669y r4 = r2.A02;
                        if (r4 != null) {
                            jSONArray = C90524aI.A0u();
                            jSONArray.put(r4.A01);
                            jSONArray.put(r4.A00);
                        } else {
                            jSONArray = null;
                        }
                        A1B.put("preferredSize", jSONArray);
                        List<C1278669y> list = r2.A03;
                        if (list != null) {
                            jSONArray2 = C90524aI.A0u();
                            for (C1278669y r1 : list) {
                                jSONArray2.put(r1.A01);
                                jSONArray2.put(r1.A00);
                            }
                        } else {
                            jSONArray2 = null;
                        }
                        A1B.put("previewSizes", jSONArray2);
                        str = A1B.toString();
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C36341k9.A0x(C90474aD.A0F(this.voipSharedPreferences), C27631Pa.A01(i2, r2.A00), str);
                    }
                    this.rawCameraInfoCache.put(i4, r2);
                } else {
                    clearStoredRawCameraInfo(i2, currentApiVersion2);
                    this.rawCameraInfoCache.put(i4, r2);
                }
            }
        }
        return r2;
    }

    public boolean hasBeenQueriedByDriver() {
        return this.hasBeenQueriedByDriver.get();
    }

    public boolean isCameraOpen() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.isCameraOpen()) {
            return false;
        }
        return true;
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.textureApiFailed) {
            return false;
        }
        return true;
    }

    public boolean isFrontCamera() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera == null || !voipPhysicalCamera.getCameraInfo().isFrontCamera) {
            return false;
        }
        return true;
    }

    /* renamed from: lambda$registerDisplayListener$0$com-whatsapp-voipcalling-camera-VoipCameraManager  reason: not valid java name */
    public /* synthetic */ void m16lambda$registerDisplayListener$0$comwhatsappvoipcallingcameraVoipCameraManager() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            if (this.captureDeviceRefreshListener != null && !this.abProps.A0E(4773)) {
                Voip.refreshCaptureDevice();
            }
            voipPhysicalCamera.onScreenShareInfoChanged(AnonymousClass6PE.A03.A00(this.waContext.A00, this.systemServices.A0L()));
        }
    }

    public void maybeUpdateCameraProcessorOrientation(int i) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.maybeUpdateCameraProcessorOrientation(i);
        }
    }

    public void removeCameraErrorListener(B3F b3f) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(b3f);
        }
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }

    public VoipCameraManager(C19630wG r3, C20810yC r4, C19770wU r5, C21060yb r6, AnonymousClass13J r7, C27631Pa r8, AnonymousClass9NK r9, C124435yB r10, AnonymousClass005 r11) {
        super(r11);
        this.waContext = r3;
        this.abProps = r4;
        this.waWorkers = r5;
        this.systemServices = r6;
        this.systemFeatures = r7;
        this.voipSharedPreferences = r8;
        this.cameraProcessorFactory = r9;
        this.screenShareDisplayManager = r10;
    }

    private boolean isHammerheadDevice(int i) {
        return C1901797e.A00(Integer.valueOf(i), this.hammerHeadIdx);
    }

    private boolean isScreenShareDevice(int i) {
        return C1901797e.A00(Integer.valueOf(i), this.screenShareIdx);
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public void setRequestedCamera2SupportLevel(String str, C30531aM r5) {
        int currentApiVersion2 = getCurrentApiVersion();
        if (!this.systemFeatures.BJo()) {
            setCurrentApiVersion(0);
        } else {
            int i = 1;
            if (str != null && C183828rQ.A04(str, getCachedCam2HardwareLevel())) {
                i = 2;
            }
            setCurrentApiVersion(i);
        }
        if (currentApiVersion2 != getCurrentApiVersion()) {
            Voip.refreshVideoDevice();
        }
    }

    public void setCameraClosedListener(AnonymousClass7dL r1) {
        this.onCameraClosedListener = r1;
    }

    @Deprecated
    public synchronized int getCameraCount() {
        return getCameraCount(true);
    }
}
