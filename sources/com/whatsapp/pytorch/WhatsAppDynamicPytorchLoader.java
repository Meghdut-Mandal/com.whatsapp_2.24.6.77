package com.whatsapp.pytorch;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.C19760wT;
import X.C36321k7;
import android.os.SystemClock;
import com.facebook.soloader.SoLoader;
import java.nio.FloatBuffer;

public final class WhatsAppDynamicPytorchLoader {
    public long A00;
    public boolean A01;
    public final C19760wT A02;

    public WhatsAppDynamicPytorchLoader(C19760wT r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
    }

    private final native void loadDynamicPytorchSymbols();

    public final native void loadModel(String str, String str2);

    public final native boolean modelLoaded(String str);

    public final native float[] runModel(String str, FloatBuffer floatBuffer, long[] jArr);

    public final void A00() {
        if (!this.A01) {
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                SoLoader.A07("dynamic_pytorch_impl", 16);
                SoLoader.A07("torch-code-gen", 16);
                loadDynamicPytorchSymbols();
                this.A01 = true;
            } catch (Throwable th) {
                C36321k7.A1W("WhatsAppDynamicPytorchLoader/Failed to load dynamic pytorch libraries: ", AnonymousClass000.A0u(), th);
            }
            this.A00 = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }
}
