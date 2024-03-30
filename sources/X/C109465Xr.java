package X;

import android.os.Build;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.Collection;
import java.util.List;

/* renamed from: X.5Xr  reason: invalid class name and case insensitive filesystem */
public abstract class C109465Xr {
    public static final AnonymousClass6QA A00(AnonymousClass6QA r43, List list) {
        AnonymousClass6QA r15 = r43;
        List<Object> list2 = list;
        AnonymousClass00C.A0D(list2, 0);
        int i = Build.VERSION.SDK_INT;
        if (23 > i) {
            try {
                Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                if ((list2 instanceof Collection) && list2.isEmpty()) {
                    return r15;
                }
                for (Object obj : list2) {
                    if (cls.isAssignableFrom(obj.getClass())) {
                    }
                }
                return r15;
            } catch (ClassNotFoundException unused) {
                return r15;
            }
        } else if (i >= 26) {
            return r15;
        }
        C132316Tb r1 = r15.A09;
        String str = r15.A0G;
        String name = ConstraintTrackingWorker.class.getName();
        if (AnonymousClass00C.A0J(str, name)) {
            return r15;
        }
        if (!r1.A04 && !r1.A07) {
            return r15;
        }
        AnonymousClass6EH r2 = new AnonymousClass6EH();
        r2.A03(r15.A0A.A00);
        r2.A00.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
        AnonymousClass6X2 A00 = r2.A00();
        AnonymousClass00C.A08(name);
        String str2 = r15.A0J;
        Integer num = r15.A0E;
        String str3 = r15.A0F;
        AnonymousClass6X2 r19 = r15.A0B;
        long j = r15.A04;
        long j2 = r15.A05;
        long j3 = r15.A03;
        C132316Tb r18 = r15.A09;
        int i2 = r15.A01;
        Integer num2 = r15.A0C;
        long j4 = r15.A02;
        long j5 = r15.A06;
        long j6 = r15.A07;
        long j7 = r15.A08;
        boolean z = r15.A0H;
        AnonymousClass00C.A0D(A00, 4);
        boolean z2 = z;
        return new AnonymousClass6QA(r18, A00, r19, num, num2, r15.A0D, str2, name, str3, i2, r15.A00, r15.A0I, j, j2, j3, j4, j5, j6, j7, z2);
    }
}
