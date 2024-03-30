package com.google.android.gms.flags.impl;

import X.AYV;
import X.AnonymousClass0LR;
import X.C1507476m;
import X.C165917uN;
import X.C1892092r;
import X.C21724AYb;
import X.C21725AYc;
import X.C21726AYd;
import X.C90464aC;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IInterface;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public class FlagProviderImpl extends C165917uN implements IInterface {
    public SharedPreferences A00;
    public boolean A01;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        Boolean bool;
        if (!this.A01) {
            return z;
        }
        SharedPreferences sharedPreferences = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            bool = (Boolean) A00(new C21724AYb(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C90464aC.A0c("Flag value not available, returning default: ", e.getMessage()));
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        Integer num;
        if (!this.A01) {
            return i;
        }
        SharedPreferences sharedPreferences = this.A00;
        Integer valueOf = Integer.valueOf(i);
        try {
            num = (Integer) A00(new C21725AYc(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C90464aC.A0c("Flag value not available, returning default: ", e.getMessage()));
            num = valueOf;
        }
        return num.intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        Long l;
        if (!this.A01) {
            return j;
        }
        SharedPreferences sharedPreferences = this.A00;
        Long valueOf = Long.valueOf(j);
        try {
            l = (Long) A00(new C1507476m(sharedPreferences, valueOf, str));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C90464aC.A0c("Flag value not available, returning default: ", e.getMessage()));
            l = valueOf;
        }
        return l.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.A01) {
            return str2;
        }
        try {
            return (String) A00(new C21726AYd(this.A00, str, str2));
        } catch (Exception e) {
            Log.w("FlagDataUtils", C90464aC.A0c("Flag value not available, returning default: ", e.getMessage()));
            return str2;
        }
    }

    /* JADX INFO: finally extract failed */
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) AnonymousClass0LR.A00(iObjectWrapper);
        if (!this.A01) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = C1892092r.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) A00(new AYV(createPackageContext));
                        C1892092r.A00 = sharedPreferences;
                    }
                }
                this.A00 = sharedPreferences;
                this.A01 = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                Log.w("FlagProviderImpl", C90464aC.A0c("Could not retrieve sdk flags, continuing with defaults: ", e.getMessage()));
            }
        }
    }

    public FlagProviderImpl(int i) {
    }

    public FlagProviderImpl() {
        this.A01 = false;
    }
}
