package X;

import android.content.Context;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatRawEventLogger;
import com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper;
import com.facebook.gputimer.GPUTimerImpl;
import com.facebook.hybridlogsink.HybridLogSink;
import com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.A2j  reason: case insensitive filesystem */
public final class C20995A2j implements C160697lR, C23015B0g, C17570rd {
    public static final C23112B5r A0f = new AnonymousClass88U();
    public int A00 = -1;
    public int A01 = -1;
    public long A02;
    public C196059Xm A03;
    public XplatSparsLogger A04;
    public C22779Avp A05;
    public AnonymousClass9c9 A06;
    public C21002A2q A07;
    public C21004A2s A08;
    public String A09 = null;
    public String A0A = null;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G = true;
    public boolean A0H = false;
    public C21001A2p A0I;
    public C21003A2r A0J;
    public final AnonymousClass9LM A0K;
    public final AnonymousClass9MJ A0L;
    public final AnonymousClass9JI A0M;
    public final C201389jR A0N;
    public final AnonymousClass9LN A0O = new AnonymousClass9LN();
    public final QPLUserFlowImpl A0P;
    public final C192429Gy A0Q = new C192429Gy();
    public final Object A0R = C36441kJ.A11();
    public final boolean[] A0S;
    public final AnonymousClass9Bs A0T;
    public final AnonymousClass9P9 A0U;
    public final AnonymousClass94O A0V;
    public final C23110B5p A0W;
    public final Executor A0X;
    public volatile AnonymousClass9SF A0Y = null;
    public volatile C195439Uh A0Z = null;
    public volatile C23112B5r A0a;
    public volatile C197229bL A0b = null;
    public volatile boolean A0c = false;
    public volatile boolean A0d = false;
    public volatile boolean A0e = true;

    public C20995A2j(Context context, AnonymousClass9Bs r5, AnonymousClass9P9 r6, AnonymousClass94O r7, C201389jR r8, QPLUserFlowImpl qPLUserFlowImpl, Executor executor) {
        this.A0U = r6;
        this.A0V = r7;
        this.A0T = r5;
        this.A0W = r5.A00;
        this.A0X = executor;
        this.A0N = r8;
        this.A0M = new AnonymousClass9JI(r8);
        this.A0K = new AnonymousClass9LM(context, new AnonymousClass9CQ(r6));
        this.A0L = new AnonymousClass9MJ(r7, r8);
        this.A0S = new boolean[C023109s.A00(6).length];
        this.A0P = qPLUserFlowImpl;
        AnonymousClass6YR.A02(C165607th.A0j(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - ctor");
    }

    private synchronized void A04() {
        C21001A2p a2p;
        C21002A2q a2q;
        C21003A2r a2r;
        int i;
        if (this.A0c && this.A03 != null) {
            AnonymousClass9LN r4 = this.A0O;
            if (!(!r4.A03 || (a2p = r4.A00) == null || (a2q = r4.A01) == null || (a2r = r4.A02) == null)) {
                int i2 = 0;
                r4.A03 = false;
                AnonymousClass9JI r7 = this.A0M;
                int i3 = a2q.A01;
                int i4 = a2q.A00;
                Integer num = a2p.A00;
                Integer num2 = C023109s.A00;
                boolean A1a = C36361kB.A1a(num, num2);
                int i5 = a2r.A00 * 90;
                int i6 = a2r.A01;
                if (A1a) {
                    i = 360 - ((i6 + i5) % 360);
                } else {
                    i = (i6 - i5) + 360;
                }
                int i7 = i % 360;
                boolean A1a2 = C36361kB.A1a(num, num2);
                r7.A00 = i7;
                r7.A01 = A1a2;
                C201389jR.A00(r7.A02).setupImageSourceFacet(i3, i4, i3, i7, A1a2);
                C201389jR r1 = this.A0N;
                if (r4.A00.A00 != num2) {
                    i2 = 1;
                }
                C201389jR.A00(r1).setCameraFacing(i2);
            }
        }
    }

    public void BqB(AnonymousClass60K r1) {
    }

    private C23112B5r A01(String str) {
        C23112B5r b5r = this.A0a;
        if (b5r != null) {
            return b5r;
        }
        AnonymousClass6YR.A05("FbMsqrdRenderer", "====== No proper logger !!!!!!!!!! ======");
        if (!C108825Vb.isDebugBuild()) {
            QuickPerformanceLogger A002 = C1904898p.A00();
            if (A002 != null) {
                HashMap A0J2 = AnonymousClass001.A0J();
                A0J2.put("use_case", str);
                A002.markerGenerateWithAnnotations(11282540, 4, 1, TimeUnit.MILLISECONDS, A0J2);
            }
            return A0f;
        }
        throw C90514aH.A0s("FbMsqrdRenderer has null logger. Report to camera_platform_android oncall");
    }

    private void A02() {
        if (!this.A0E) {
            C201389jR r2 = this.A0N;
            synchronized (r2) {
                C201389jR.A00(r2).setupServiceHost(r2.A02());
                AREngineController A002 = C201389jR.A00(r2);
                if (A002.renderSessionInit(false, r2.A06.A00, 0, (GPUTimerImpl) null, (HybridLogSink) null, false)) {
                    A002.updatePerSessionDebugConfiguration(0, false, false, false);
                }
            }
            this.A0E = true;
        }
    }

    private void A03() {
        C22779Avp avp = this.A05;
        if (avp != null) {
            C21001A2p a2p = this.A0I;
            if (a2p != null) {
                Integer num = a2p.A00;
                Iterator it = ((C20956A0n) avp).A00.iterator();
                while (it.hasNext()) {
                    CaptureEventInputWrapper captureEventInputWrapper = (CaptureEventInputWrapper) it.next();
                    int i = 2;
                    if (num == C023109s.A00) {
                        i = 1;
                    }
                    captureEventInputWrapper.setCaptureDevicePosition(i);
                }
                this.A0I = null;
            }
            C21004A2s a2s = this.A08;
            if (a2s != null) {
                C22779Avp avp2 = this.A05;
                int i2 = a2s.A02;
                int i3 = a2s.A01;
                float f = a2s.A00;
                Iterator it2 = ((C20956A0n) avp2).A00.iterator();
                while (it2.hasNext()) {
                    ((CaptureEventInputWrapper) it2.next()).setPreviewViewInfo(i2, i3, f);
                }
                this.A08 = null;
            }
            C21002A2q a2q = this.A07;
            if (a2q != null) {
                C22779Avp avp3 = this.A05;
                int i4 = a2q.A01;
                int i5 = a2q.A00;
                Iterator it3 = ((C20956A0n) avp3).A00.iterator();
                while (it3.hasNext()) {
                    ((CaptureEventInputWrapper) it3.next()).setCaptureDeviceSize(i4, i5);
                }
                this.A07 = null;
            }
            C21003A2r a2r = this.A0J;
            if (a2r != null) {
                C22779Avp avp4 = this.A05;
                int i6 = a2r.A00;
                Iterator it4 = ((C20956A0n) avp4).A00.iterator();
                while (it4.hasNext()) {
                    ((CaptureEventInputWrapper) it4.next()).setRotation(i6);
                }
                this.A0J = null;
            }
        }
    }

    private void A05(C196059Xm r9) {
        EffectServiceHost effectServiceHost;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        EffectServiceHost effectServiceHost2;
        int ordinal;
        AnonymousClass905 r0;
        if (r9 != null) {
            C201389jR r2 = this.A0N;
            this.A0B = r2.A02().mEffectManifest.platformAlgorithmDataNeeded;
            if (!r2.A02().mEffectManifest.frameDataNeeded) {
                r9.A03(this, AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT);
                r9.A03(this, AnonymousClass905.PLATFORM_ALGORITHM_DATA_EVENT);
                r9.A03(this, AnonymousClass905.A0B);
                r9.A03(this, AnonymousClass905.INPUT_PREVIEW);
                return;
            }
            if (!r2.A02().mEffectManifest.sLAMNeeded) {
                r9.A03(this, AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT);
                r0 = AnonymousClass905.A0B;
            } else {
                if (!(r2.A0B == null || r2.A02() == null)) {
                    if (r2.A0B != null) {
                        effectServiceHost = r2.A02();
                    } else {
                        effectServiceHost = null;
                    }
                    if (effectServiceHost.mArExperimentUtil != null) {
                        int ordinal2 = C187578y8.A02.ordinal();
                        if (ordinal2 == 2 || ordinal2 == 129) {
                            C20997A2l a2l = new C20997A2l();
                            HashMap hashMap = a2l.A00;
                            if (r2.A02().mEffectManifest != null) {
                                z = r2.A02().mEffectManifest.usesWorldTrackingEnvironmentLight;
                            } else {
                                z = false;
                            }
                            hashMap.put("enableARCoreLightEstimation", Boolean.valueOf(z));
                            if (r2.A02() != null) {
                                z2 = r2.A02().mEffectManifest.horizontalTrackableDetectionNeeded;
                            } else {
                                z2 = false;
                            }
                            hashMap.put("enableARCoreHorizontalPlanes", Boolean.valueOf(z2));
                            if (r2.A02() != null) {
                                z3 = r2.A02().mEffectManifest.verticalTrackableDetectionNeeded;
                            } else {
                                z3 = false;
                            }
                            hashMap.put("enableARCoreVerticalPlanes", Boolean.valueOf(z3));
                            EffectManifest effectManifest = r2.A02().mEffectManifest;
                            boolean z5 = false;
                            if (effectManifest != null) {
                                StringBuilder A0u = AnonymousClass000.A0u();
                                A0u.append("manifest.usesSceneDepth: ");
                                AnonymousClass6YR.A04("FbMsqrdRenderer", AnonymousClass000.A0q(String.valueOf(effectManifest.usesSceneDepth), A0u));
                                StringBuilder A0u2 = AnonymousClass000.A0u();
                                A0u2.append("manifest.usesMultiplane: ");
                                AnonymousClass6YR.A04("FbMsqrdRenderer", AnonymousClass000.A0q(String.valueOf(effectManifest.usesMultiplane), A0u2));
                                if (!(r2.A0B == null || r2.A02() == null)) {
                                    if (r2.A0B != null) {
                                        effectServiceHost2 = r2.A02();
                                    } else {
                                        effectServiceHost2 = null;
                                    }
                                    if (effectServiceHost2.mArExperimentUtil != null && ((ordinal = C187578y8.A03.ordinal()) == 2 || ordinal == 129)) {
                                        z4 = true;
                                        AnonymousClass6YR.A04("FbMsqrdRenderer", C36371kC.A0z("WorldTracker_EnableHitTestWithDepth: ", AnonymousClass000.A0u(), z4));
                                        if (effectManifest.usesSceneDepth || (effectManifest.usesMultiplane && z4)) {
                                            z5 = true;
                                        }
                                    }
                                }
                                z4 = false;
                                AnonymousClass6YR.A04("FbMsqrdRenderer", C36371kC.A0z("WorldTracker_EnableHitTestWithDepth: ", AnonymousClass000.A0u(), z4));
                                z5 = true;
                            }
                            hashMap.put("enableARCoreDepth", Boolean.valueOf(z5));
                            r9.A01(a2l, (C23015B0g) null);
                            r9.A02(this, AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT);
                            if (this.A0B) {
                                r9.A02(this, AnonymousClass905.PLATFORM_ALGORITHM_DATA_EVENT);
                            }
                        } else {
                            r9.A03(this, AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT);
                            r0 = AnonymousClass905.PLATFORM_ALGORITHM_DATA_EVENT;
                        }
                    }
                }
                r9.A02(this, AnonymousClass905.INPUT_PREVIEW);
            }
            r9.A03(this, r0);
            r9.A02(this, AnonymousClass905.INPUT_PREVIEW);
        }
    }

    private void A06(C196059Xm r2) {
        if (r2 != null) {
            r2.A02(this, AnonymousClass905.INPUT_PREVIEW_SIZE);
            r2.A02(this, AnonymousClass905.INPUT_FACING);
            r2.A02(this, AnonymousClass905.INPUT_ROTATION);
            r2.A02(this, AnonymousClass905.TOUCH_INPUT_CONFIG);
            r2.A02(this, AnonymousClass905.A0F);
            r2.A02(this, AnonymousClass905.A0H);
            r2.A02(this, AnonymousClass905.A08);
            r2.A02(this, AnonymousClass905.A0G);
            r2.A02(this, AnonymousClass905.PREVIEW_VIEW_SIZE);
            r2.A02(this, AnonymousClass905.A04);
            r2.A02(this, AnonymousClass905.INPUT_CAPTURE_CONTEXT);
            r2.A02(this, AnonymousClass905.A0J);
        }
    }

    private void A07(C196059Xm r2) {
        if (r2 != null) {
            r2.A03(this, AnonymousClass905.INPUT_PREVIEW_SIZE);
            r2.A03(this, AnonymousClass905.INPUT_FACING);
            r2.A03(this, AnonymousClass905.INPUT_ROTATION);
            r2.A03(this, AnonymousClass905.INPUT_PREVIEW);
            r2.A03(this, AnonymousClass905.A0B);
            r2.A03(this, AnonymousClass905.TOUCH_INPUT_CONFIG);
            r2.A03(this, AnonymousClass905.A0F);
            r2.A03(this, AnonymousClass905.A0H);
            r2.A03(this, AnonymousClass905.A08);
            r2.A03(this, AnonymousClass905.A0G);
            r2.A03(this, AnonymousClass905.PREVIEW_VIEW_SIZE);
            r2.A03(this, AnonymousClass905.A04);
            r2.A03(this, AnonymousClass905.INPUT_CAPTURE_CONTEXT);
            r2.A03(this, AnonymousClass905.EXTERNAL_WORLD_TRACKING_EVENT);
            r2.A03(this, AnonymousClass905.PLATFORM_ALGORITHM_DATA_EVENT);
            r2.A03(this, AnonymousClass905.A0J);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A08(X.C195439Uh r38, X.C197229bL r39) {
        /*
            r37 = this;
            r0 = r37
            r0.A04()
            X.9jR r1 = r0.A0N
            r36 = r1
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r3 = r36.A02()
            r1 = r38
            java.lang.String r2 = r1.A04
            if (r2 == 0) goto L_0x0015
            r3.mProductSessionId = r2
        L_0x0015:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r36.A02()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r2 = r2.mEffectServiceHostConfig     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig r2 = r2.mFaceTrackerDataProviderConfig     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.Integer r10 = X.C023109s.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x0027
            int r2 = r2.executionMode     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x0027
            java.lang.Integer r10 = X.C023109s.A01     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x0027:
            X.9LM r6 = r0.A0K     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r4 = 0
            X.9SF r2 = r1.A02     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x005e
            X.9cr r5 = new X.9cr     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r5.<init>(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x0033:
            r6.A00 = r5     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.util.HashMap r5 = r1.A0B     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r7 = 0
            if (r5 == 0) goto L_0x007d
            java.util.Set r3 = r5.keySet()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.Object[] r12 = r3.toArray(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ EffectsFrameworkException -> 0x02fe }
            int r2 = r5.size()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r3 = 0
        L_0x004d:
            int r2 = r5.size()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r3 >= r2) goto L_0x006d
            r2 = r12[r3]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r13[r3] = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            int r3 = r3 + 1
            goto L_0x004d
        L_0x005e:
            android.content.Context r3 = r6.A01     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9cr r5 = new X.9cr     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r5.<init>()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9GQ r2 = new X.9GQ     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.<init>(r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r5.A02 = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            goto L_0x0033
        L_0x006d:
            java.lang.String r11 = r1.A07     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9cr r2 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.A0m r9 = new X.A0m     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r9.<init>(r6, r1)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9MH r8 = new X.9MH     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.A00 = r8     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x007d:
            java.util.Map r5 = r1.A0C     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r5 == 0) goto L_0x00b3
            java.util.Set r3 = r5.keySet()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.Object[] r8 = r3.toArray(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ EffectsFrameworkException -> 0x02fe }
            int r2 = r5.size()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String[] r7 = new java.lang.String[r2]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r3 = 0
        L_0x0094:
            int r2 = r5.size()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r3 >= r2) goto L_0x00a5
            r2 = r8[r3]     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.Object r2 = r5.get(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r7[r3] = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            int r3 = r3 + 1
            goto L_0x0094
        L_0x00a5:
            X.9cr r2 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9Ys r5 = X.AnonymousClass841.A02     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.841 r3 = new X.841     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r3.<init>(r8, r7)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.util.HashMap r2 = r2.A05     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.put(r5, r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x00b3:
            X.9cr r2 = r6.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9SF r7 = new X.9SF     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r7.<init>(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9Ys r3 = X.C1691183z.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.util.HashMap r6 = r7.A05     // Catch:{ EffectsFrameworkException -> 0x02fe }
            boolean r2 = r6.containsKey(r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x00ce
            r7.A00(r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String r2 = "getDataSource"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0A(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            throw r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x00ce:
            r0.A0Y = r7     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r36.A02()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost r2 = (com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost) r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger r2 = r2.analyticsLogger     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r36.A02()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x00fd
            java.lang.String r8 = r1.A03     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r8 != 0) goto L_0x00e3
            java.lang.String r8 = ""
        L_0x00e3:
            java.lang.String r5 = r1.A01     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r5 != 0) goto L_0x00e9
            java.lang.String r5 = ""
        L_0x00e9:
            X.8zN r3 = r1.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r2 = (com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl) r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.mProductName = r8     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.mEffectStartIntent = r3     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9LG r2 = r2.mCameraARAnalyticsLogger     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x00fd
            r2.A00 = r8     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.A33 r2 = r2.A01     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.A01 = r5     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.A00 = r3     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x00fd:
            X.8zN r3 = r1.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.8zN r2 = X.C188308zN.USER_INTERACTION     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r3 != r2) goto L_0x0107
            X.8zN r2 = X.C188308zN.SYSTEM     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r1.A00 = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x0107:
            r1.A01 = r4     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9GQ r4 = r7.A03     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r4 == 0) goto L_0x011a
            java.lang.String r2 = "tryPassLoggerToAudioConfiguration"
            X.B5r r3 = r0.A01(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9CP r2 = new X.9CP     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.<init>(r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r4.A00 = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x011a:
            java.lang.String r8 = "Time to setEffect: %d"
            java.lang.String r5 = "FbMsqrdRenderer"
            java.lang.String r2 = r1.A06     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r20 = r2
            r4 = r2
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r36.A02()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            java.lang.String r2 = r2.mProductSessionId     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r19 = r2
            java.lang.String r12 = r1.A01     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.8zN r11 = r1.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2 = 1
            r0.A0C = r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r0.A0D = r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r2 = 0
            r0.A02 = r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r3 = 0
            r0.A0F = r3     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r14 = r36.A02()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.List r2 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x0149:
            boolean r2 = r9.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r2 == 0) goto L_0x0159
            java.lang.Object r2 = r9.next()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration r2 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration) r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r2.destroy()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x0149
        L_0x0159:
            java.util.List r2 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r2.clear()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r14.mServicesHostConfiguration = r7     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.ArrayList r13 = X.AnonymousClass001.A0I()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r2 = 4
            X.9Ys[] r15 = new X.AnonymousClass9Ys[r2]     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9Ys r2 = X.AnonymousClass845.A01     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r15[r3] = r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r10 = 1
            X.9Ys r9 = X.AnonymousClass83x.A00     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r15[r10] = r9     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r10 = 2
            X.9Ys r9 = com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration.A00     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r15[r10] = r9     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r10 = 3
            X.9Ys r9 = X.AnonymousClass843.A03     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.List r9 = X.C36341k9.A0m(r9, r15, r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.ArrayList r15 = X.AnonymousClass001.A0I()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.Iterator r16 = r9.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x0184:
            boolean r9 = r16.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01cf
            java.lang.Object r10 = r16.next()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r6.containsKey(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x0184
            java.lang.Object r10 = r6.get(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9T6 r10 = (X.AnonymousClass9T6) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r10 instanceof X.AnonymousClass842     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01a9
            X.842 r10 = (X.AnonymousClass842) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.services.instruction.InstructionServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x01a5:
            r15.add(r9)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x0184
        L_0x01a9:
            boolean r9 = r10 instanceof com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01b5
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration r10 = (com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x01a5
        L_0x01b5:
            boolean r9 = r10 instanceof X.AnonymousClass845     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01c1
            X.845 r10 = (X.AnonymousClass845) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventServiceConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x01a5
        L_0x01c1:
            boolean r9 = r10 instanceof X.AnonymousClass843     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01cd
            X.843 r10 = (X.AnonymousClass843) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x01a5
        L_0x01cd:
            r9 = 0
            goto L_0x01a5
        L_0x01cf:
            r13.addAll(r15)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9MH r10 = r7.A01     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r10 == 0) goto L_0x01de
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r13.add(r9)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x01de:
            X.9Ys r10 = X.C1690983w.A00     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r6.containsKey(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x01f5
            r7.A00(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r3 = 0
            r2 = 1
            X.AnonymousClass00C.A0D(r3, r2)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.String r2 = "getDelegate"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0A(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x01f4:
            throw r2     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x01f5:
            X.9Ys r10 = X.C1690883v.A00     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r6.containsKey(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x0207
            r7.A00(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.String r2 = "getMotionDataSource"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0A(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x01f4
        L_0x0207:
            X.9Ys r10 = X.AnonymousClass841.A02     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r6.containsKey(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x021d
            X.9T6 r10 = r7.A00(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.841 r10 = (X.AnonymousClass841) r10     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid r9 = new com.facebook.cameracore.mediapipeline.dataproviders.javascriptmodules.implementation.JavascriptModulesDataProviderConfigurationHybrid     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9.<init>(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r13.add(r9)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x021d:
            r14.mServiceConfigurations = r13     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.List r9 = r14.mServiceModules     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.Iterator r13 = r9.iterator()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
        L_0x0225:
            boolean r9 = r13.hasNext()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x0240
            r13.next()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9Ys r10 = X.C1691083y.A00     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            boolean r9 = r6.containsKey(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            if (r9 == 0) goto L_0x0225
            r7.A00(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.String r2 = "getUserScopeDelegate"
            java.lang.NullPointerException r2 = X.AnonymousClass001.A0A(r2)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            goto L_0x01f4
        L_0x0240:
            java.util.List r9 = r14.mServiceConfigurations     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r16 = r9
            java.lang.String r9 = r1.A08     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.String r15 = r1.A09     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r34 = 0
            com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher r33 = new com.facebook.cameracore.ardelivery.effectasyncassetfetcher.AsyncAssetFetcher     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r25 = r34
            r26 = 0
            r21 = r33
            r22 = r9
            r23 = r15
            r24 = r34
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.String r22 = "0"
            java.lang.String r9 = ""
            if (r20 != 0) goto L_0x0263
            r20 = r9
        L_0x0263:
            if (r19 != 0) goto L_0x0267
            r19 = r9
        L_0x0267:
            if (r12 != 0) goto L_0x026a
            r12 = r9
        L_0x026a:
            java.lang.String r14 = r1.A05     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.util.Objects.requireNonNull(r14)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.featureconfig.ProductFeatureConfig r13 = r7.A02     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9Gy r10 = r0.A0Q     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r9 = 1
            java.util.List r30 = r33.getAsyncAssets()     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r21 = X.C201389jR.A00(r36)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            int r11 = r11.mCppValue     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.Integer r10 = r10.A01     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            int r35 = A00(r10)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r29 = 1
            r24 = r20
            r25 = r19
            r26 = r12
            r27 = r11
            r28 = r14
            r31 = r16
            r32 = r13
            r21.setEffect(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r10 = X.C201389jR.A00(r36)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r10.updatePerEffectDebugConfiguration(r3, r3, r3, r3)     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            X.9MJ r3 = r0.A0L     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            r3.A01 = r9     // Catch:{ UnsatisfiedLinkError -> 0x02ea }
            java.lang.Long r3 = X.C90494aF.A0V(r17)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.AnonymousClass6YR.A02(r3, r5, r8)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            boolean r3 = r6.containsKey(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r3 == 0) goto L_0x02bc
            X.9T6 r2 = r7.A00(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.845 r2 = (X.AnonymousClass845) r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.Avp r2 = r2.A00     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r0.A05 = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r0.A03()     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x02bc:
            X.9c9 r2 = r0.A06     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 != 0) goto L_0x02cc
            X.9CO r3 = new X.9CO     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r3.<init>(r0)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.9c9 r2 = new X.9c9     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2.<init>(r3)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r0.A06 = r2     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x02cc:
            r2 = r36
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r2.A0B     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r2 == 0) goto L_0x02d5
            r36.A02()     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x02d5:
            X.9Xm r2 = r0.A03     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r0.A05(r2)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            if (r4 == 0) goto L_0x0350
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r3 = r0.A0P     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r5 = r3.getInstanceIdWithString(r2, r4)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            r2 = 3
            r3.markPoint(r5, r2, r4)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            goto L_0x0350
        L_0x02ea:
            r2 = move-exception
            java.lang.String r3 = r2.getMessage()     // Catch:{ all -> 0x02f5 }
            com.facebook.cameracore.common.exception.EffectsFrameworkException r2 = new com.facebook.cameracore.common.exception.EffectsFrameworkException     // Catch:{ all -> 0x02f5 }
            r2.<init>(r3)     // Catch:{ all -> 0x02f5 }
            throw r2     // Catch:{ all -> 0x02f5 }
        L_0x02f5:
            r3 = move-exception
            java.lang.Long r2 = X.C90494aF.A0V(r17)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            X.AnonymousClass6YR.A02(r2, r5, r8)     // Catch:{ EffectsFrameworkException -> 0x02fe }
            throw r3     // Catch:{ EffectsFrameworkException -> 0x02fe }
        L_0x02fe:
            r5 = move-exception
            X.9Uh r4 = r0.A0Z
            X.9Xm r2 = r0.A03
            r0.A07(r2)
            r2 = 1
            r3 = 0
            r0.A09(r4, r5, r2)
            r2 = 0
            r0.A0b = r2
            r0.A0c = r3
            r0.A0Y = r2
            r0.A0Z = r2
            java.lang.String r4 = r1.A05
            X.9P9 r3 = r0.A0U
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r1 = "setEffectToEngine failed, file exist: "
            r2.append(r1)
            if (r4 == 0) goto L_0x0356
            java.io.File r1 = X.C90524aI.A0S(r4)
            boolean r1 = r1.exists()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x032f:
            java.lang.String r2 = X.AnonymousClass000.A0o(r1, r2)
            java.lang.String r1 = "FbMsqrdRenderer"
            r3.A00(r1, r2, r5)
            r3 = r39
            if (r39 == 0) goto L_0x0350
            X.7d4 r1 = r3.A00
            if (r1 == 0) goto L_0x034d
            X.6yu r1 = (X.C148466yu) r1
            X.0AP r2 = r1.A04
            X.529 r1 = X.AnonymousClass529.A00
            X.03N r1 = X.AnonymousClass00C.A02(r1)
            r2.resumeWith(r1)
        L_0x034d:
            r1 = 0
            r3.A00 = r1
        L_0x0350:
            X.9MJ r1 = r0.A0L
            r0 = 1
            r1.A01 = r0
            return
        L_0x0356:
            java.lang.String r1 = "null path"
            goto L_0x032f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20995A2j.A08(X.9Uh, X.9bL):void");
    }

    private void A09(C195439Uh r10, Exception exc, boolean z) {
        String message;
        String str;
        AnalyticsLogger analyticsLogger;
        String str2;
        if (!(r10 == null || (str2 = r10.A06) == null)) {
            QPLUserFlowImpl qPLUserFlowImpl = this.A0P;
            qPLUserFlowImpl.markPoint(qPLUserFlowImpl.getInstanceIdWithString(16321564, str2), 7, str2);
        }
        boolean z2 = this.A0C;
        C201389jR r4 = this.A0N;
        synchronized (r4) {
            if (z2) {
                if (r4.A0B != null) {
                    r4.A0B.stopEffect();
                    r4.A0B.cleanupServices();
                }
                AREngineController aREngineController = r4.A04;
                if (aREngineController != null) {
                    aREngineController.onEffectStopped();
                }
            } else if (r4.A0B != null) {
                r4.A0B.cleanupServices();
            }
        }
        AnonymousClass9SF r0 = this.A0Y;
        if (r0 != null) {
            Iterator A10 = C36391kE.A10(r0.A05);
            while (A10.hasNext()) {
                AnonymousClass9T6 r1 = (AnonymousClass9T6) A10.next();
                if (r1 instanceof AnonymousClass845) {
                    ((C20956A0n) ((AnonymousClass845) r1).A00).A00.clear();
                }
            }
        }
        this.A0J = null;
        this.A07 = null;
        this.A0I = null;
        this.A08 = null;
        this.A05 = null;
        this.A0C = false;
        if (exc == null) {
            if (z && r10 != null && (str = r10.A06) != null) {
                XplatSparsLogger xplatSparsLogger = this.A04;
                if (xplatSparsLogger == null) {
                    if (r4.A0B != null && (analyticsLogger = ((WhatsAppEffectServiceHost) r4.A02()).analyticsLogger) != null) {
                        C20954A0l a0l = new C20954A0l(analyticsLogger);
                        C1894593w r02 = XplatSparsLogger.Companion;
                        xplatSparsLogger = new XplatSparsLogger(new XplatRawEventLogger(a0l));
                        this.A04 = xplatSparsLogger;
                    } else {
                        return;
                    }
                }
                Objects.requireNonNull(xplatSparsLogger);
                xplatSparsLogger.logSessionClosureNative(str, false);
                QPLUserFlowImpl qPLUserFlowImpl2 = this.A0P;
                qPLUserFlowImpl2.endSuccess(qPLUserFlowImpl2.getInstanceIdWithString(16321564, str), str);
            }
        } else if (r10 != null) {
            QPLUserFlowImpl qPLUserFlowImpl3 = this.A0P;
            String str3 = r10.A06;
            long instanceIdWithString = qPLUserFlowImpl3.getInstanceIdWithString(16321564, str3);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Loading effect error: ");
            if (exc.getMessage() == null) {
                message = "";
            } else {
                message = exc.getMessage();
            }
            String A0q = AnonymousClass000.A0q(message, A0u);
            if (str3 == null) {
                str3 = "";
            }
            qPLUserFlowImpl3.endFail(instanceIdWithString, "renderer", 1, A0q, str3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c6, code lost:
        if (r5.A02().mEffectManifest.multipleOutputsSupported == false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014c, code lost:
        if (r9.A00 != r8) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BWE(X.AnonymousClass6NG r37, long r38) {
        /*
            r36 = this;
            java.lang.String r0 = "FbMsqrdRenderer.onDrawFrameInternal"
            android.os.Trace.beginSection(r0)
            r4 = r36
            boolean r0 = r4.A0d
            r7 = 0
            if (r0 != 0) goto L_0x0050
            monitor-enter(r4)
            java.lang.Object r3 = r4.A0R     // Catch:{ all -> 0x004d }
            monitor-enter(r3)     // Catch:{ all -> 0x004d }
            boolean r0 = r4.A0d     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x003f
            boolean r0 = r4.A0c     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x003f
            r4.A02()     // Catch:{ all -> 0x004a }
            r0 = 1
            r4.A0d = r0     // Catch:{ all -> 0x004a }
            boolean r0 = r4.A0H     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0031
            X.9jR r0 = r4.A0N     // Catch:{ all -> 0x004a }
            int r2 = r4.A01     // Catch:{ all -> 0x004a }
            int r1 = r4.A00     // Catch:{ all -> 0x004a }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = X.C201389jR.A00(r0)     // Catch:{ all -> 0x004a }
            r0.resize(r2, r1)     // Catch:{ all -> 0x004a }
            r4.A0H = r7     // Catch:{ all -> 0x004a }
        L_0x0031:
            X.9Uh r1 = r4.A0Z     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x003f
            X.9Xm r0 = r4.A03     // Catch:{ all -> 0x004a }
            r4.A06(r0)     // Catch:{ all -> 0x004a }
            X.9bL r0 = r4.A0b     // Catch:{ all -> 0x004a }
            r4.A08(r1, r0)     // Catch:{ all -> 0x004a }
        L_0x003f:
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            monitor-exit(r4)
            boolean r0 = r4.A0d
            if (r0 != 0) goto L_0x0050
            android.os.Trace.endSection()
            r12 = 0
            return r12
        L_0x004a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0050:
            X.9Uh r6 = r4.A0Z
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x005f
            X.9bL r0 = r4.A0b
            if (r0 == 0) goto L_0x005f
            X.9jR r0 = r4.A0N
            r0.A02()
        L_0x005f:
            r8 = r37
            X.67V r0 = r8.A01
            if (r0 == 0) goto L_0x0262
            X.9jR r5 = r4.A0N
            int r3 = r0.A00
            int r2 = r0.A01
            X.5sE r0 = r0.A02
            int r1 = r0.A01
            int r0 = r0.A00
            r5.A00 = r3
            r5.A02 = r2
            r5.A03 = r1
            r5.A01 = r0
            boolean r2 = r4.A0D
            r0 = 0
            if (r2 == 0) goto L_0x00dd
            long r18 = android.os.SystemClock.elapsedRealtime()
        L_0x0083:
            if (r6 != 0) goto L_0x00da
            r9 = 0
        L_0x0086:
            if (r2 == 0) goto L_0x009d
            if (r9 == 0) goto L_0x0093
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r1 = r4.A0P
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r0 = r1.getInstanceIdWithString(r0, r9)
        L_0x0093:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r3 = r4.A0P
            r2 = 4
            if (r9 != 0) goto L_0x009a
            java.lang.String r9 = "null_config_session"
        L_0x009a:
            r3.markPoint(r0, r2, r9)
        L_0x009d:
            boolean r2 = r4.A0c
            r3 = 1
            if (r2 == 0) goto L_0x0128
            boolean r2 = r4.A0G
            if (r2 != 0) goto L_0x00c8
            boolean[] r9 = r4.A0S
            X.9Gy r2 = r4.A0Q
            java.lang.Integer r2 = r2.A01
            int r2 = r2.intValue()
            boolean r2 = r9[r2]
            if (r2 == 0) goto L_0x00c8
            boolean r2 = r4.A0C
            if (r2 == 0) goto L_0x00c8
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r5.A0B
            if (r2 == 0) goto L_0x00c8
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r2 = r5.A02()
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r2 = r2.mEffectManifest
            boolean r2 = r2.multipleOutputsSupported
            r34 = 0
            if (r2 != 0) goto L_0x00ca
        L_0x00c8:
            r34 = 1
        L_0x00ca:
            float[] r2 = r8.A04
            r25 = r2
            float[] r2 = r8.A05
            r21 = r2
            float[] r15 = r8.A03
            long r8 = r8.A00
            X.9Gy r2 = r4.A0Q
            monitor-enter(r5)
            goto L_0x00e0
        L_0x00da:
            java.lang.String r9 = r6.A06
            goto L_0x0086
        L_0x00dd:
            r18 = 0
            goto L_0x0083
        L_0x00e0:
            com.facebook.cameracore.mediapipeline.engine.AREngineController r20 = X.C201389jR.A00(r5)     // Catch:{ all -> 0x0125 }
            int r14 = r5.A00     // Catch:{ all -> 0x0125 }
            int r13 = r5.A02     // Catch:{ all -> 0x0125 }
            int r12 = r5.A03     // Catch:{ all -> 0x0125 }
            int r11 = r5.A01     // Catch:{ all -> 0x0125 }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r28 = r38 * r16
            java.lang.Integer r10 = r2.A01     // Catch:{ all -> 0x0125 }
            int r32 = A00(r10)     // Catch:{ all -> 0x0125 }
            java.lang.Integer r10 = r2.A00     // Catch:{ all -> 0x0125 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x0125 }
            switch(r10) {
                case 1: goto L_0x0102;
                case 2: goto L_0x0105;
                case 3: goto L_0x0108;
                case 4: goto L_0x010b;
                case 5: goto L_0x010e;
                default: goto L_0x00ff;
            }     // Catch:{ all -> 0x0125 }
        L_0x00ff:
            r33 = -1
            goto L_0x0110
        L_0x0102:
            r33 = 0
            goto L_0x0110
        L_0x0105:
            r33 = 1
            goto L_0x0110
        L_0x0108:
            r33 = 2
            goto L_0x0110
        L_0x010b:
            r33 = 3
            goto L_0x0110
        L_0x010e:
            r33 = 4
        L_0x0110:
            r35 = 0
            r26 = r21
            r27 = r15
            r30 = r8
            r21 = r14
            r22 = r13
            r23 = r12
            r24 = r11
            boolean r12 = r20.doFrame(r21, r22, r23, r24, r25, r26, r27, r28, r30, r32, r33, r34, r35)     // Catch:{ all -> 0x0125 }
            goto L_0x012a
        L_0x0125:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0128:
            r12 = 0
            goto L_0x0139
        L_0x012a:
            monitor-exit(r5)
            if (r12 == 0) goto L_0x0139
            r4.A0G = r7
            boolean[] r5 = r4.A0S
            java.lang.Integer r2 = r2.A01
            int r2 = r2.intValue()
            r5[r2] = r3
        L_0x0139:
            X.9MJ r9 = r4.A0L
            X.9jR r2 = r9.A02     // Catch:{ all -> 0x0260 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r2 = X.C201389jR.A00(r2)     // Catch:{ all -> 0x0260 }
            int r8 = r2.getFacesCount()     // Catch:{ all -> 0x0260 }
            boolean r2 = r9.A01     // Catch:{ all -> 0x0260 }
            if (r2 != 0) goto L_0x014e
            int r5 = r9.A00     // Catch:{ all -> 0x0260 }
            r2 = 0
            if (r5 == r8) goto L_0x014f
        L_0x014e:
            r2 = 1
        L_0x014f:
            r9.A01 = r2     // Catch:{ all -> 0x0260 }
            r9.A00 = r8     // Catch:{ all -> 0x0260 }
            r8 = 0
            java.util.Set r5 = r9.A03     // Catch:{ all -> 0x0260 }
            monitor-enter(r5)     // Catch:{ all -> 0x0260 }
            boolean r2 = r5.isEmpty()     // Catch:{ all -> 0x016b }
            if (r2 != 0) goto L_0x0167
            boolean r2 = r9.A01     // Catch:{ all -> 0x016b }
            if (r2 == 0) goto L_0x0167
            java.util.ArrayList r8 = X.C36441kJ.A15(r5)     // Catch:{ all -> 0x016b }
            r9.A01 = r7     // Catch:{ all -> 0x016b }
        L_0x0167:
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            if (r8 == 0) goto L_0x0182
            goto L_0x016e
        L_0x016b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x016b }
            goto L_0x0181
        L_0x016e:
            java.util.Iterator r5 = r8.iterator()     // Catch:{ all -> 0x0260 }
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x0260 }
            if (r2 == 0) goto L_0x0182
            r5.next()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "onFacesCountChanged"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)     // Catch:{ all -> 0x0260 }
        L_0x0181:
            throw r0     // Catch:{ all -> 0x0260 }
        L_0x0182:
            boolean r2 = r4.A0D
            if (r2 == 0) goto L_0x01b2
            r4.A0D = r7
            java.lang.String r8 = "null_config_session"
            if (r12 == 0) goto L_0x0248
            java.lang.Long r11 = X.C90494aF.A0V(r18)
            long r9 = android.os.Debug.getNativeHeapAllocatedSize()
            float r5 = (float) r9
            r2 = 1149239296(0x44800000, float:1024.0)
            float r5 = r5 / r2
            float r5 = r5 / r2
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.String r5 = "FbMsqrdRenderer"
            java.lang.String r2 = "Time to render first frame: %d, current native memory allocation: %.2fMB"
            X.AnonymousClass6YR.A01(r11, r7, r5, r2)
            if (r6 == 0) goto L_0x01ac
            java.lang.String r8 = r6.A06
            if (r8 != 0) goto L_0x01ac
            java.lang.String r8 = ""
        L_0x01ac:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r5 = r4.A0P
            r2 = 5
            r5.markPoint(r0, r2, r8)
        L_0x01b2:
            long r5 = r4.A02
            r0 = 1
            long r5 = r5 + r0
            r4.A02 = r5
            r1 = 10
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x022c
            r2 = 15
        L_0x01c1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "logXEvent "
            java.lang.String r0 = X.AnonymousClass000.A0r(r0, r1, r2)
            r4.A01(r0)
        L_0x01ce:
            if (r12 == 0) goto L_0x0224
            X.9bL r0 = r4.A0b
            if (r0 == 0) goto L_0x0224
            X.9Uh r0 = r4.A0Z
            if (r0 == 0) goto L_0x0224
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x01f7
            r4.A0F = r3
            X.9bL r0 = r4.A0b
            X.7d4 r0 = r0.A00
            if (r0 == 0) goto L_0x01f7
            X.6yu r0 = (X.C148466yu) r0
            X.5pf r5 = r0.A03
            if (r5 == 0) goto L_0x01f7
            com.whatsapp.calling.avatar.camera.InitializeAvatarEffectUseCase r0 = r0.A02
            X.17Y r2 = r0.A00
            r1 = 0
            X.74e r0 = new X.74e
            r0.<init>(r5, r1)
            r2.A0H(r0)
        L_0x01f7:
            X.9bL r5 = r4.A0b
            X.7d4 r4 = r5.A00
            r2 = 0
            if (r4 == 0) goto L_0x022a
            X.6yu r4 = (X.C148466yu) r4
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0228
            int r0 = r4.A00
            int r1 = r0 + 1
            r4.A00 = r1
            r0 = 2
            if (r1 <= r0) goto L_0x0228
            X.0AP r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.resumeWith(r0)
            r0 = 0
        L_0x0217:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x021b:
            r0 = 0
            boolean r0 = X.C36371kC.A1X(r1, r0)
            if (r0 == 0) goto L_0x0224
            r5.A00 = r2
        L_0x0224:
            android.os.Trace.endSection()
            return r12
        L_0x0228:
            r0 = 1
            goto L_0x0217
        L_0x022a:
            r1 = r2
            goto L_0x021b
        L_0x022c:
            r1 = 30
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0235
            r2 = 16
            goto L_0x01c1
        L_0x0235:
            r1 = 150(0x96, double:7.4E-322)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x023e
            r2 = 17
            goto L_0x01c1
        L_0x023e:
            r1 = 600(0x258, double:2.964E-321)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ce
            r2 = 18
            goto L_0x01c1
        L_0x0248:
            if (r6 == 0) goto L_0x0250
            java.lang.String r8 = r6.A06
            if (r8 != 0) goto L_0x0250
            java.lang.String r8 = ""
        L_0x0250:
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r13 = r4.A0P
            r17 = 2
            java.lang.String r16 = "renderer"
            java.lang.String r18 = "Render first frame failed"
            r14 = r0
            r19 = r8
            r13.endFail(r14, r16, r17, r18, r19)
            goto L_0x01b2
        L_0x0260:
            r0 = move-exception
            throw r0
        L_0x0262:
            java.lang.String r0 = "MutableVideoFrame not initialized, missing rgbTexture"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20995A2j.BWE(X.6NG, long):boolean");
    }

    public void Bij(int i, int i2) {
        boolean z;
        this.A01 = i;
        this.A00 = i2;
        if (this.A0d) {
            C201389jR.A00(this.A0N).resize(i, i2);
            z = false;
        } else {
            z = true;
        }
        this.A0H = z;
    }

    public void Bik(C131296Om r3) {
        this.A0O.A03 = true;
    }

    public void Bil() {
        Arrays.fill(this.A0S, false);
        A07(this.A03);
        if (this.A0d || this.A0E) {
            synchronized (this.A0R) {
                A09(this.A0Z, (Exception) null, true);
                this.A0d = false;
                C201389jR r1 = this.A0N;
                synchronized (r1) {
                    C201389jR.A00(r1).releaseGl();
                    C201389jR.A01(r1);
                }
                this.A0E = false;
                this.A04 = null;
            }
        }
        this.A0b = null;
        this.A0c = false;
        this.A0Y = null;
        AnonymousClass6YR.A02(C165607th.A0j(this), "FbMsqrdRenderer", "FbMsqrdRenderer %s - released");
    }

    public void Brw(C196059Xm r3) {
        C196059Xm r1 = this.A03;
        if (r3 != r1) {
            if (r1 != null) {
                r1.A03(this, AnonymousClass905.A0I);
                r1.A03(this, AnonymousClass905.A0N);
                r1.A03(this, AnonymousClass905.A0D);
                r1.A03(this, AnonymousClass905.A0O);
            }
            if (r3 != null) {
                r3.A02(this, AnonymousClass905.A0I);
                r3.A02(this, AnonymousClass905.A0N);
                r3.A02(this, AnonymousClass905.A0D);
                r3.A02(this, AnonymousClass905.A0O);
            }
            if (this.A0c) {
                A07(this.A03);
                A06(r3);
                if (this.A0d) {
                    A05(r3);
                }
            }
            this.A03 = r3;
        }
    }

    public boolean isEnabled() {
        if (!this.A0e || !this.A0c) {
            return false;
        }
        return true;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            default:
                return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f6, code lost:
        A03();
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0101, code lost:
        A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Beh(X.C22884Axf r12) {
        /*
            r11 = this;
            X.905 r0 = r12.BIb()
            int r0 = r0.ordinal()
            switch(r0) {
                case 3: goto L_0x007c;
                case 5: goto L_0x00b5;
                case 6: goto L_0x00cb;
                case 7: goto L_0x00e1;
                case 8: goto L_0x000c;
                case 9: goto L_0x0028;
                case 10: goto L_0x0044;
                case 11: goto L_0x0060;
                case 13: goto L_0x0101;
                case 14: goto L_0x00fd;
                case 17: goto L_0x0105;
                case 18: goto L_0x021d;
                case 22: goto L_0x0250;
                case 26: goto L_0x0257;
                case 27: goto L_0x025e;
                case 30: goto L_0x0262;
                case 31: goto L_0x0262;
                case 43: goto L_0x0267;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            X.Avp r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.A0n r0 = (X.C20956A0n) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0018:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.startRecording()
            goto L_0x0018
        L_0x0028:
            X.Avp r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.A0n r0 = (X.C20956A0n) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.stopRecording()
            goto L_0x0034
        L_0x0044:
            X.Avp r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.A0n r0 = (X.C20956A0n) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0050:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.capturePhoto()
            goto L_0x0050
        L_0x0060:
            X.Avp r0 = r11.A05
            if (r0 == 0) goto L_0x000b
            X.A0n r0 = (X.C20956A0n) r0
            java.util.ArrayList r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x006c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x000b
            java.lang.Object r0 = r1.next()
            com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper r0 = (com.facebook.cameracore.mediapipeline.services.captureevent.CaptureEventInputWrapper) r0
            r0.finishCapturePhoto()
            goto L_0x006c
        L_0x007c:
            X.A2m r12 = (X.C20998A2m) r12
            java.lang.Object r6 = r11.A0R
            monitor-enter(r6)
            boolean r0 = r11.A0c     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            X.9JI r5 = r11.A0M     // Catch:{ all -> 0x00b2 }
            X.A0q r4 = r12.A00     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x00b0
            X.9jR r3 = r5.A02     // Catch:{ all -> 0x00b2 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A02()     // Catch:{ all -> 0x00b2 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest r0 = r0.mEffectManifest     // Catch:{ all -> 0x00b2 }
            boolean r0 = r0.frameDataNeeded     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x00b2 }
            X.9UW r0 = (X.AnonymousClass9UW) r0     // Catch:{ all -> 0x00b2 }
            int r2 = r5.A00     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x00a7
            int r1 = r0.A00     // Catch:{ all -> 0x00b2 }
            r0 = -1
            if (r1 == r0) goto L_0x00a7
            r2 = r1
        L_0x00a7:
            boolean r1 = r5.A01     // Catch:{ all -> 0x00b2 }
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost r0 = r3.A02()     // Catch:{ all -> 0x00b2 }
            r0.updateFrame(r4, r2, r1)     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r6)     // Catch:{ all -> 0x00b2 }
            return
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b2 }
            throw r0
        L_0x00b5:
            X.A2q r12 = (X.C21002A2q) r12
            X.9LN r1 = r11.A0O
            if (r12 == 0) goto L_0x00c8
            X.A2q r0 = r1.A01
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00c8
            r1.A01 = r12
            r0 = 1
            r1.A03 = r0
        L_0x00c8:
            r11.A07 = r12
            goto L_0x00f6
        L_0x00cb:
            X.A2p r12 = (X.C21001A2p) r12
            X.9LN r1 = r11.A0O
            if (r12 == 0) goto L_0x00de
            X.A2p r0 = r1.A00
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00de
            r1.A00 = r12
            r0 = 1
            r1.A03 = r0
        L_0x00de:
            r11.A0I = r12
            goto L_0x00f6
        L_0x00e1:
            X.A2r r12 = (X.C21003A2r) r12
            X.9LN r1 = r11.A0O
            if (r12 == 0) goto L_0x00f4
            X.A2r r0 = r1.A02
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x00f4
            r1.A02 = r12
            r0 = 1
            r1.A03 = r0
        L_0x00f4:
            r11.A0J = r12
        L_0x00f6:
            r11.A03()
            r11.A04()
            return
        L_0x00fd:
            X.A2s r12 = (X.C21004A2s) r12
            r11.A08 = r12
        L_0x0101:
            r11.A03()
            return
        L_0x0105:
            X.A2n r12 = (X.C20999A2n) r12
            java.lang.Object r2 = r11.A0R
            monitor-enter(r2)
            X.9Uh r1 = r12.A00     // Catch:{ all -> 0x021a }
            X.9bL r4 = r12.A01     // Catch:{ all -> 0x021a }
            java.lang.Integer r3 = X.C165607th.A0j(r11)     // Catch:{ all -> 0x021a }
            java.lang.String r5 = "FbMsqrdRenderer"
            java.lang.String r0 = "FbMsqrdRenderer %s - setMsqrdConfig %s"
            X.AnonymousClass6YR.A01(r3, r1, r5, r0)     // Catch:{ all -> 0x021a }
            X.9Uh r8 = r11.A0Z     // Catch:{ all -> 0x021a }
            r9 = 0
            if (r8 == 0) goto L_0x0184
            if (r1 == 0) goto L_0x0184
            r6 = 0
            int r3 = (int) r6     // Catch:{ all -> 0x021a }
            r0 = 1
            if (r3 == r0) goto L_0x0152
            r0 = 2
            if (r3 == r0) goto L_0x0161
            r0 = 3
            if (r3 == r0) goto L_0x014d
            r0 = 4
            if (r3 != r0) goto L_0x0184
            r9 = 1
            if (r8 == r1) goto L_0x0184
            java.lang.Class r3 = r8.getClass()     // Catch:{ all -> 0x021a }
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x021a }
            if (r3 != r0) goto L_0x0183
            boolean r0 = r8.A00(r1)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0183
            java.lang.String r3 = r8.A01     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A01     // Catch:{ all -> 0x021a }
            boolean r0 = java.util.Objects.equals(r3, r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0183
            goto L_0x0184
        L_0x014d:
            boolean r9 = r8.A00(r1)     // Catch:{ all -> 0x021a }
            goto L_0x0184
        L_0x0152:
            java.lang.String r3 = r8.A08     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x021a }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0184
            java.lang.String r6 = r8.A09     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x021a }
            goto L_0x017b
        L_0x0161:
            java.lang.String r6 = r8.A06     // Catch:{ all -> 0x021a }
            if (r6 == 0) goto L_0x0184
            java.lang.String r3 = r8.A08     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x021a }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0184
            java.lang.String r3 = r8.A09     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x021a }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0184
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x021a }
        L_0x017b:
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0184
            r9 = 1
            goto L_0x0184
        L_0x0183:
            r9 = 0
        L_0x0184:
            r7 = 0
            r3 = 1
            if (r9 == 0) goto L_0x0189
            goto L_0x0205
        L_0x0189:
            r8 = 0
            if (r1 == 0) goto L_0x01f2
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x021a }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x01f2
            X.9Uh r6 = r11.A0Z     // Catch:{ all -> 0x021a }
            if (r6 == 0) goto L_0x01a0
            java.lang.String r5 = r6.A06     // Catch:{ all -> 0x021a }
            if (r5 != 0) goto L_0x01e8
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x01f0
        L_0x01a0:
            r11.A09(r6, r8, r7)     // Catch:{ all -> 0x021a }
            java.lang.String r10 = r1.A06     // Catch:{ all -> 0x021a }
            if (r10 == 0) goto L_0x01c8
            com.facebook.cameracore.logging.spars.xplatimpl.XplatSparsLogger.debugExpectSessionOpen(r10)     // Catch:{ all -> 0x021a }
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r5 = r11.A0P     // Catch:{ all -> 0x021a }
            r0 = 16321564(0xf90c1c, float:2.2871383E-38)
            long r6 = r5.getInstanceIdWithString(r0, r10)     // Catch:{ all -> 0x021a }
            r0 = 2
            r5.markPoint(r6, r0, r10)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "setMsqrdConfig"
            X.B5r r0 = r11.A01(r0)     // Catch:{ all -> 0x021a }
            boolean r0 = r0 instanceof X.AnonymousClass88U     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01e5
            java.lang.String r9 = "true"
        L_0x01c3:
            java.lang.String r8 = "is_fbcameralogger_dummy"
            r5.annotate(r6, r8, r9, r10)     // Catch:{ all -> 0x021a }
        L_0x01c8:
            r11.A0Z = r1     // Catch:{ all -> 0x021a }
            r11.A0b = r4     // Catch:{ all -> 0x021a }
            r11.A0c = r3     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A08     // Catch:{ all -> 0x021a }
            r11.A09 = r0     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r1.A09     // Catch:{ all -> 0x021a }
            r11.A0A = r0     // Catch:{ all -> 0x021a }
            boolean r0 = r11.A0d     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x0212
            X.9Xm r0 = r11.A03     // Catch:{ all -> 0x021a }
            r11.A06(r0)     // Catch:{ all -> 0x021a }
            X.9bL r0 = r11.A0b     // Catch:{ all -> 0x021a }
            r11.A08(r1, r0)     // Catch:{ all -> 0x021a }
            goto L_0x0212
        L_0x01e5:
            java.lang.String r9 = "false"
            goto L_0x01c3
        L_0x01e8:
            java.lang.String r0 = r1.A06     // Catch:{ all -> 0x021a }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x01a0
        L_0x01f0:
            r7 = 1
            goto L_0x01a0
        L_0x01f2:
            X.9Uh r1 = r11.A0Z     // Catch:{ all -> 0x021a }
            X.9Xm r0 = r11.A03     // Catch:{ all -> 0x021a }
            r11.A07(r0)     // Catch:{ all -> 0x021a }
            r11.A09(r1, r8, r3)     // Catch:{ all -> 0x021a }
            r11.A0b = r8     // Catch:{ all -> 0x021a }
            r11.A0c = r7     // Catch:{ all -> 0x021a }
            r11.A0Y = r8     // Catch:{ all -> 0x021a }
            r11.A0Z = r8     // Catch:{ all -> 0x021a }
            goto L_0x0212
        L_0x0205:
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x021a }
            if (r8 != 0) goto L_0x0214
            java.lang.String r0 = "null"
        L_0x020b:
            r1[r7] = r0     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "Effect already set, current=%s"
            X.AnonymousClass6YR.A0F(r5, r0, r1)     // Catch:{ all -> 0x021a }
        L_0x0212:
            monitor-exit(r2)     // Catch:{ all -> 0x021a }
            goto L_0x0219
        L_0x0214:
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x021a }
            goto L_0x020b
        L_0x0219:
            return
        L_0x021a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021a }
            throw r0
        L_0x021d:
            java.lang.Object r6 = r11.A0R
            monitor-enter(r6)
            java.lang.String r5 = "Time to reset effect: %d"
            java.lang.String r4 = "FbMsqrdRenderer"
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x024d }
            r0 = 1
            r11.A0D = r0     // Catch:{ all -> 0x0244 }
            r0 = 0
            r11.A02 = r0     // Catch:{ all -> 0x0244 }
            r0 = 0
            r11.A0F = r0     // Catch:{ all -> 0x0244 }
            X.9jR r0 = r11.A0N     // Catch:{ all -> 0x0244 }
            com.facebook.cameracore.mediapipeline.engine.AREngineController r0 = X.C201389jR.A00(r0)     // Catch:{ all -> 0x0244 }
            r0.resetCurrentEffect()     // Catch:{ all -> 0x0244 }
            java.lang.Long r0 = X.C90494aF.A0V(r2)     // Catch:{ all -> 0x024d }
            X.AnonymousClass6YR.A02(r0, r4, r5)     // Catch:{ all -> 0x024d }
            monitor-exit(r6)     // Catch:{ all -> 0x024d }
            return
        L_0x0244:
            r1 = move-exception
            java.lang.Long r0 = X.C90494aF.A0V(r2)     // Catch:{ all -> 0x024d }
            X.AnonymousClass6YR.A02(r0, r4, r5)     // Catch:{ all -> 0x024d }
            throw r1     // Catch:{ all -> 0x024d }
        L_0x024d:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x024d }
            throw r0
        L_0x0250:
            java.lang.String r0 = "getTouchInput"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x0257:
            java.lang.String r0 = "getConfig"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x025e:
            r0 = 1
            r11.A0G = r0
            return
        L_0x0262:
            r0 = 0
            java.util.Objects.requireNonNull(r0)
            return
        L_0x0267:
            java.lang.Object r1 = r11.A0R
            monitor-enter(r1)
            r11.A02()     // Catch:{ all -> 0x026f }
            monitor-exit(r1)     // Catch:{ all -> 0x026f }
            return
        L_0x026f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x026f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20995A2j.Beh(X.Axf):void");
    }
}
