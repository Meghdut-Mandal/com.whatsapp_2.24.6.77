package X;

import android.os.Build;
import com.facebook.systrace.TraceDirect;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X.9kg  reason: invalid class name and case insensitive filesystem */
public abstract class C201899kg {
    public static final String A00 = "TraceConfig";
    public static final C198819eF A01 = new C198819eF();
    public static volatile long A02;

    static {
        A00(false);
        if (Build.VERSION.SDK_INT < 30) {
            AnonymousClass6YR.A06(A00, "Registering systrace sysprop listener");
            C1496672g r2 = new C1496672g(1);
            if (C21760zl.A06) {
                C21760zl.A01(C21760zl.A00, C36431kI.A1Z(r2, 1));
            }
        }
    }

    public static void A00(boolean z) {
        boolean A012;
        long j;
        boolean z2;
        String str;
        long j2 = A02;
        if (Build.VERSION.SDK_INT >= 30) {
            A012 = C1895194c.A00();
        } else {
            A012 = A01();
        }
        long A002 = C21760zl.A00("debug.fbsystrace.tags");
        if (!A012 || A002 == 0) {
            j = 0;
        } else {
            j = A002 | 1;
        }
        boolean z3 = true;
        if ((A02 != 0 || j == 0) && (j != 0 || A02 == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        A02 = j;
        String str2 = A00;
        Object[] objArr = new Object[4];
        if (z) {
            str = "sysprop";
        } else {
            str = "other";
        }
        objArr[0] = str;
        AnonymousClass000.A1N(objArr, 1, z2);
        AnonymousClass000.A1M(objArr, 2, j2);
        AnonymousClass000.A1M(objArr, 3, A02);
        AnonymousClass6YR.A06(str2, String.format("Systrace trace config update - source:%s changed:%b enabledTags:0x%x->0x%x", objArr));
        if (z2) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeSetEnabledTags(j);
            }
            if (!z) {
                z3 = false;
            }
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            C198819eF r6 = A01;
            if (i <= 0) {
                synchronized (r6.A01) {
                    r6.A00 = false;
                    int i2 = 0;
                    while (true) {
                        List list = r6.A02;
                        if (i2 < list.size()) {
                            list.get(i2);
                            AnonymousClass9Z0 r0 = AnonymousClass9Z0.$redex_init_class;
                            i2++;
                        }
                    }
                }
            } else if (!z3) {
                r6.A00();
            } else {
                synchronized (r6.A01) {
                    Thread thread = new Thread(new C80303vB(r6, C198819eF.A03.lastModified(), 0), "fbsystrace notification thread");
                    thread.setPriority(10);
                    thread.start();
                }
            }
        }
    }

    public static boolean A01() {
        long j = C197049b3.A00;
        if (!C197049b3.A03) {
            return false;
        }
        Method method = C197049b3.A01;
        if (method != null) {
            Object[] A0L = AnonymousClass001.A0L();
            AnonymousClass000.A1M(A0L, 0, j);
            Boolean bool = (Boolean) C197049b3.A00(method, A0L);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        throw new AssertionError();
    }
}
