package X;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9mw  reason: invalid class name and case insensitive filesystem */
public abstract class C202919mw {
    public static Context A05;
    public static final Object A06 = C36441kJ.A11();
    public static volatile Boolean A07;
    public final String A00;
    public final String A01;
    public final C192919Jd A02;
    public final Object A03;
    public volatile C200909iS A04 = null;

    public static Object A01(C22886Axh axh) {
        long clearCallingIdentity;
        try {
            return axh.Byy();
        } catch (SecurityException unused) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object Byy = axh.Byy();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return Byy;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    public static void A02(Context context) {
        Context applicationContext;
        if (A05 == null) {
            synchronized (A06) {
                if ((Build.VERSION.SDK_INT < 24 || !context.isDeviceProtectedStorage()) && (applicationContext = context.getApplicationContext()) != null) {
                    context = applicationContext;
                }
                if (A05 != context) {
                    A07 = null;
                }
                A05 = context;
            }
        }
    }

    private final Object A00() {
        boolean z;
        if (A03()) {
            z = AnonymousClass000.A1X(A01(new A3O("gms:phenotype:phenotype_flag:debug_bypass_phenotype")));
        } else {
            z = false;
        }
        if (!z) {
            Uri uri = this.A02.A00;
            if (uri != null) {
                if (this.A04 == null) {
                    ContentResolver contentResolver = A05.getContentResolver();
                    ConcurrentHashMap concurrentHashMap = C200909iS.A07;
                    C200909iS r3 = (C200909iS) concurrentHashMap.get(uri);
                    if (r3 == null) {
                        r3 = new C200909iS(contentResolver, uri);
                        C200909iS r0 = (C200909iS) concurrentHashMap.putIfAbsent(uri, r3);
                        if (r0 == null) {
                            r3.A00.registerContentObserver(r3.A02, false, r3.A01);
                        } else {
                            r3 = r0;
                        }
                    }
                    this.A04 = r3;
                }
                String str = (String) A01(new A3P(this.A04, this));
                if (str != null) {
                    return A05(str);
                }
            }
        } else {
            Log.w("PhenotypeFlag", C90464aC.A0c("Bypass reading Phenotype values for flag: ", this.A00));
        }
        return null;
    }

    public static boolean A03() {
        String str;
        if (A07 == null) {
            Context context = A05;
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (Binder.getCallingPid() == Process.myPid()) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            if (C05320Pg.A00(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", str, Binder.getCallingPid(), Binder.getCallingUid()) == 0) {
                z = true;
            }
            A07 = Boolean.valueOf(z);
        }
        return A07.booleanValue();
    }

    public final Object A04() {
        String str;
        if (A05 != null) {
            Object A002 = A00();
            if (A002 == null && (!A03() || (str = (String) A01(new A3N(this))) == null || (A002 = A05(str)) == null)) {
                return this.A03;
            }
            return A002;
        }
        throw AnonymousClass001.A09("Must call PhenotypeFlag.init() first");
    }

    public Object A05(String str) {
        boolean z;
        Object obj;
        C187308xd r1;
        C187308xd r12;
        if (this instanceof C170298Cw) {
            C170298Cw r2 = (C170298Cw) this;
            try {
                synchronized (r2.A02) {
                    if (!str.equals(r2.A01)) {
                        byte[] decode = Base64.decode(str, 3);
                        AnonymousClass8DG r8 = (AnonymousClass8DG) AnonymousClass8DC.zzbir.A06(4);
                        try {
                            C198719e5 r5 = C198719e5.A02;
                            Class<?> cls = r8.getClass();
                            r5.A00(cls).ByN(new C192929Je(), r8, decode, 0, decode.length);
                            r5.A00(cls).Byd(r8);
                            if (r8.zzex == 0) {
                                byte byteValue = ((Byte) r8.A06(1)).byteValue();
                                if (byteValue != 1) {
                                    if (byteValue != 0) {
                                        boolean Byx = r5.A00(cls).Byx(r8);
                                        r8.A06(2);
                                        if (Byx) {
                                        }
                                    }
                                    r12 = new C187308xd(new C21824Ab0().getMessage());
                                    r12.zzkw = r8;
                                    r1 = r12;
                                    throw r1;
                                }
                                r2.A01 = str;
                                r2.A00 = (AnonymousClass8DC) r8;
                            } else {
                                throw new RuntimeException();
                            }
                        } catch (IOException e) {
                            if (e.getCause() instanceof C187308xd) {
                                r1 = e.getCause();
                            } else {
                                r12 = new C187308xd(e.getMessage());
                            }
                        } catch (IndexOutOfBoundsException unused) {
                            r12 = new C187308xd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    }
                    obj = r2.A00;
                }
                return obj;
            } catch (IOException | IllegalArgumentException unused2) {
                String str2 = r2.A00;
                StringBuilder A0i = C90464aC.A0i(str, C90474aD.A05(str2) + 27);
                A0i.append("Invalid byte[] value for ");
                A0i.append(str2);
                Log.e("PhenotypeFlag", AnonymousClass000.A0p(": ", str, A0i));
                return null;
            }
        } else if (this instanceof C170288Cv) {
            return str;
        } else {
            if (C36361kB.A1Z(str, C201949kl.A05)) {
                z = true;
            } else if (C36361kB.A1Z(str, C201949kl.A06)) {
                z = false;
            } else {
                String str3 = this.A00;
                StringBuilder A0i2 = C90464aC.A0i(str, C90474aD.A05(str3) + 28);
                A0i2.append("Invalid boolean value for ");
                A0i2.append(str3);
                Log.e("PhenotypeFlag", AnonymousClass000.A0p(": ", str, A0i2));
                return null;
            }
            return Boolean.valueOf(z);
        }
    }

    public C202919mw(C192919Jd r2, Object obj, String str) {
        if (r2.A00 != null) {
            this.A02 = r2;
            this.A01 = C90464aC.A0c(String.valueOf(r2.A01), str);
            this.A00 = C90464aC.A0c(String.valueOf(r2.A02), str);
            this.A03 = obj;
            return;
        }
        throw AnonymousClass001.A08("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }
}
