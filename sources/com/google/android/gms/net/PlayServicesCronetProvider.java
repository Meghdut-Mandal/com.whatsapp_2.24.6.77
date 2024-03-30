package com.google.android.gms.net;

import X.AnonymousClass006;
import X.AnonymousClass0O8;
import X.AnonymousClass0Z3;
import X.C04030Iz;
import X.C132946Vx;
import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;

public class PlayServicesCronetProvider extends CronetProvider {
    public static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    public static final String TAG = "PlayServicesCronet";

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof PlayServicesCronetProvider) && this.mContext.equals(((PlayServicesCronetProvider) obj).mContext));
    }

    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    private void tryToInstallCronetProvider() {
        String str;
        try {
            C132946Vx.A01(this.mContext);
        } catch (C04030Iz unused) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is not installed yet.";
                Log.i(TAG, str);
            }
        } catch (AnonymousClass0O8 unused2) {
            if (Log.isLoggable(TAG, 4)) {
                str = "Google-Play-Services-Cronet-Provider is unavailable.";
                Log.i(TAG, str);
            }
        }
    }

    public CronetEngine.Builder createBuilder() {
        AnonymousClass0Z3 r0;
        try {
            C132946Vx.A01(this.mContext);
            try {
                synchronized (C132946Vx.A02) {
                    r0 = C132946Vx.A01;
                }
                AnonymousClass006.A01(r0);
                ClassLoader classLoader = r0.A00.getClassLoader();
                AnonymousClass006.A01(classLoader);
                return new ExperimentalCronetEngine.Builder((ICronetEngineBuilder) classLoader.loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(ICronetEngineBuilder.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.mContext}));
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", e);
            }
        } catch (C04030Iz e2) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e2);
        } catch (AnonymousClass0O8 e3) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e3);
        }
    }

    public String getVersion() {
        String str;
        tryToInstallCronetProvider();
        synchronized (C132946Vx.A02) {
            str = C132946Vx.A00;
        }
        return str;
    }

    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return C132946Vx.A02();
    }

    public PlayServicesCronetProvider(Context context) {
        super(context);
    }
}
