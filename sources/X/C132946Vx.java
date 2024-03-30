package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.zzw;
import java.lang.reflect.Method;

/* renamed from: X.6Vx  reason: invalid class name and case insensitive filesystem */
public class C132946Vx {
    public static String A00 = "0";
    public static AnonymousClass0Z3 A01;
    public static final Object A02 = C36441kJ.A11();
    public static final C02600Bc A03 = C02600Bc.A00;

    public static zzw A00(Context context) {
        AnonymousClass006.A02(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (A02()) {
            taskCompletionSource.setResult((Object) null);
        } else {
            new Thread(AnonymousClass74N.A00(context, taskCompletionSource, 15)).start();
        }
        return taskCompletionSource.zza;
    }

    @Deprecated
    public static void A01(Context context) {
        Throwable r1;
        Class<C132946Vx> cls = C132946Vx.class;
        synchronized (A02) {
            if (!A02()) {
                AnonymousClass006.A02(context, "Context must not be null");
                ClassLoader classLoader = cls.getClassLoader();
                AnonymousClass006.A01(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    C02600Bc r7 = A03;
                    C02620Be.A01(context, 11925000);
                    AnonymousClass0Z3 A04 = AnonymousClass0Z3.A04(context, AnonymousClass0Z3.A09, "com.google.android.gms.cronet_dynamite");
                    Class<?> loadClass = A04.A00.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != cls.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                        Integer num = (Integer) method.invoke((Object) null, new Object[0]);
                        AnonymousClass006.A01(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke((Object) null, new Object[0]);
                        AnonymousClass006.A01(str);
                        A00 = str;
                        if (3 > intValue) {
                            Intent A032 = r7.A03(context, "cr", 2);
                            if (A032 == null) {
                                Log.e("CronetProviderInstaller", "Unable to fetch error resolution intent");
                                r1 = new AnonymousClass0O8(2);
                            } else {
                                String str2 = A00;
                                StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str2) + 174);
                                A0h.append("Google Play Services update is required. The API Level of the client is ");
                                A0h.append(3);
                                A0h.append(". The API Level of the implementation is ");
                                A0h.append(intValue);
                                r1 = new C04030Iz(A032, AnonymousClass000.A0p(". The Cronet implementation version is ", str2, A0h), 2);
                            }
                            throw r1;
                        }
                        A01 = A04;
                    } else {
                        Log.e("CronetProviderInstaller", "ImplVersion class is missing from Cronet module.");
                        throw new AnonymousClass0O8(8);
                    }
                } catch (ClassNotFoundException e) {
                    Log.e("CronetProviderInstaller", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((AnonymousClass0O8) new AnonymousClass0O8(10).initCause(e));
                } catch (AnonymousClass0OB e2) {
                    Log.e("CronetProviderInstaller", "Unable to load Cronet module", e2);
                    throw ((AnonymousClass0O8) new AnonymousClass0O8(8).initCause(e2));
                } catch (Exception e3) {
                    Log.e("CronetProviderInstaller", "Unable to read Cronet version from the Cronet module ", e3);
                    throw ((AnonymousClass0O8) new AnonymousClass0O8(8).initCause(e3));
                }
            }
        }
    }

    public static boolean A02() {
        AnonymousClass0Z3 r0;
        synchronized (A02) {
            r0 = A01;
        }
        return AnonymousClass000.A1V(r0);
    }
}
