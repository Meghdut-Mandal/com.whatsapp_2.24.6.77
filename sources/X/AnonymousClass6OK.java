package X;

import android.content.SharedPreferences;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6OK  reason: invalid class name */
public class AnonymousClass6OK {
    public SharedPreferences A00;
    public boolean A01;
    public final C21510zM A02;
    public final C130066Jo A03;
    public final C1261562t A04;
    public final C19890wg A05;
    public final C20810yC A06;

    public static synchronized void A00(AnonymousClass6OK r13) {
        synchronized (r13) {
            if (!r13.A01) {
                C130066Jo r8 = r13.A03;
                C1261562t r6 = r13.A04;
                List<C121605tP> list = r8.A01.A00;
                ArrayList A0I = AnonymousClass001.A0I();
                ArrayList A0I2 = AnonymousClass001.A0I();
                for (C121605tP r9 : list) {
                    if (r9.A00.BLd(r6)) {
                        C130066Jo.A00(r8).update(r9.A01.getBytes());
                        int intValue = new BigInteger(1, C130066Jo.A00(r8).digest(((String) r6.A00("device_id")).getBytes())).mod(new BigInteger(Integer.toString(SearchActionVerificationClientService.NOTIFICATION_ID))).intValue();
                        Iterator it = r9.A02.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C123285wF r3 = (C123285wF) it.next();
                            Iterator it2 = r3.A04.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    C121595tO r1 = (C121595tO) it2.next();
                                    i += r1.A00;
                                    if (intValue < i) {
                                        Pair create = Pair.create(r3, r1);
                                        if (create != null) {
                                            C123285wF r4 = (C123285wF) create.first;
                                            C121595tO r32 = (C121595tO) create.second;
                                            if (r4.A02.BLd(r6)) {
                                                long A0B = C36391kE.A0B(System.currentTimeMillis());
                                                if (A0B >= r4.A01 && A0B <= r4.A00) {
                                                    C1261462s r0 = new C1261462s(r32, r4, r9);
                                                    A0I.add(r0);
                                                    A0I2.addAll(r0.A00.A02);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                SparseArray sparseArray = new SparseArray();
                Iterator it3 = A0I2.iterator();
                while (it3.hasNext()) {
                    AnonymousClass5q9 r02 = (AnonymousClass5q9) it3.next();
                    int i2 = r02.A00;
                    Object obj = r02.A01;
                    if (obj instanceof Boolean) {
                        obj = Integer.valueOf(AnonymousClass000.A1X(obj) ? 1 : 0);
                    }
                    sparseArray.append(i2, obj.toString());
                }
                C21510zM r42 = r13.A02;
                synchronized (r42) {
                    try {
                        SharedPreferences.Editor edit = r42.A00.edit();
                        edit.remove("ab_props:sys:config_hash");
                        edit.remove("ab_props:sys:last_refresh_time");
                        edit.remove("ab_props:sys:last_version");
                        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                            C21510zM.A00(edit, r42, (String) sparseArray.valueAt(i3), sparseArray.keyAt(i3));
                        }
                        edit.apply();
                        r42.A05.A0B();
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
                HashSet A16 = C36441kJ.A16();
                Iterator it4 = A0I.iterator();
                while (it4.hasNext()) {
                    A16.add(((C1261462s) it4.next()).toString());
                }
                try {
                    SharedPreferences sharedPreferences = r13.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = r13.A05.A00(C19430v1.A0A);
                        r13.A00 = sharedPreferences;
                    }
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    edit2.putStringSet("ab_offline_props:offline_exposure_strings", A16);
                    edit2.apply();
                    r13.A01 = true;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
    }

    public synchronized int A01(int i) {
        A00(this);
        return this.A06.A07(i);
    }

    public synchronized boolean A02(int i) {
        A00(this);
        return this.A06.A0E(i);
    }

    public AnonymousClass6OK(C20810yC r1, C21510zM r2, C130066Jo r3, C1261562t r4, C19890wg r5) {
        this.A06 = r1;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
    }
}
