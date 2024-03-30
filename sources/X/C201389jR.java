package X;

import android.content.Context;
import android.content.res.AssetManager;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfig;
import com.facebook.cameracore.mediapipeline.engine.AREngineController;
import com.facebook.cameracore.mediapipeline.engine.provider.whatsapp.WhatsAppPluginConfigProvider;
import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.9jR  reason: invalid class name and case insensitive filesystem */
public class C201389jR {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AREngineController A04;
    public AnonymousClass9LF A05;
    public final AnonymousClass9CS A06;
    public final Context A07;
    public final AssetManager A08;
    public final AndroidAsyncExecutorFactory A09;
    public final AndroidAsyncExecutorFactory A0A;
    public volatile EffectServiceHost A0B;

    public static synchronized AREngineController A00(C201389jR r5) {
        AREngineController aREngineController;
        synchronized (r5) {
            aREngineController = r5.A04;
            if (aREngineController == null) {
                aREngineController = new AREngineController(r5.A08, r5.A09, r5.A0A, new WhatsAppPluginConfigProvider(((WhatsAppEffectServiceHost) r5.A02()).context));
                r5.A04 = aREngineController;
            }
        }
        return aREngineController;
    }

    public static synchronized void A01(C201389jR r1) {
        synchronized (r1) {
            if (r1.A0B != null) {
                r1.A0B.destroy();
                r1.A0B = null;
            }
        }
    }

    public EffectServiceHost A02() {
        if (this.A0B == null) {
            synchronized (this) {
                if (this.A0B == null) {
                    AnonymousClass9LF r3 = this.A05;
                    Context applicationContext = this.A07.getApplicationContext();
                    AnonymousClass00C.A0D(applicationContext, 0);
                    C1894893z r0 = WhatsAppEffectServiceHost.Companion;
                    AnonymousClass9C4 r1 = r3.A00;
                    r1.A00 = new FaceTrackerDataProviderConfig();
                    this.A0B = new WhatsAppEffectServiceHost(applicationContext, new EffectServiceHostConfig(r1), r3.A03, new ARClass(0), r3.A02, r3.A01);
                }
            }
        }
        return this.A0B;
    }

    public C201389jR(Context context, AnonymousClass9LF r3, AnonymousClass9CS r4, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
        this.A06 = r4;
        this.A07 = context;
        this.A08 = context.getResources().getAssets();
        this.A09 = new AndroidAsyncExecutorFactory(scheduledExecutorService);
        this.A0A = new AndroidAsyncExecutorFactory(scheduledExecutorService2);
        this.A05 = r3;
    }

    public void finalize() {
        A01(this);
        super.finalize();
    }
}
