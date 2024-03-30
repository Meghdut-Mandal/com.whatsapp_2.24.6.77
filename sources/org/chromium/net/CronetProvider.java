package org.chromium.net;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.chromium.net.CronetEngine;

public abstract class CronetProvider {
    public static final String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    public static final String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    public static final String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    public static final String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    public static final String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    public static final String TAG = "CronetProvider";
    public final Context mContext;

    public abstract CronetEngine.Builder createBuilder();

    public abstract String getName();

    public abstract String getVersion();

    public abstract boolean isEnabled();

    public static List getAllProviders(Context context) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public static void logReflectiveOperationException(String str, boolean z, Exception exc) {
        String str2 = TAG;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to load provider class: ");
            sb.append(str);
            Log.e(str2, sb.toString(), exc);
        } else if (Log.isLoggable(str2, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tried to load ");
            sb2.append(str);
            sb2.append(" provider class but it wasn't");
            sb2.append(" included in the app classpath");
            Log.d(str2, sb2.toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[class=");
        sb.append(getClass().getName());
        sb.append(", ");
        sb.append("name=");
        sb.append("Google-Play-Services-Cronet-Provider");
        sb.append(", ");
        sb.append("version=");
        sb.append(getVersion());
        sb.append(", ");
        sb.append("enabled=");
        sb.append(isEnabled());
        sb.append("]");
        return sb.toString();
    }

    public CronetProvider(Context context) {
        if (context != null) {
            this.mContext = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }

    public static boolean addCronetProviderFromResourceFile(Context context, Set set) {
        String string;
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, "string", context.getPackageName());
        boolean z = false;
        if (identifier != 0 && (string = context.getResources().getString(identifier)) != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to instantiate Cronet implementation class ");
                sb.append(string);
                sb.append(" that is listed as in the app string resource file under ");
                sb.append(RES_KEY_CRONET_IMPL_CLASS);
                sb.append(" key");
                Log.e(str, sb.toString());
            }
        }
        return z;
    }

    public static boolean addCronetProviderImplByClassName(Context context, String str, Set set, boolean z) {
        try {
            set.add(context.getClassLoader().loadClass(str).asSubclass(CronetProvider.class).getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        }
    }
}
