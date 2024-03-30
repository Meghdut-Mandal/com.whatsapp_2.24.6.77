package X;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.758  reason: invalid class name */
public class AnonymousClass758 implements Runnable {
    public static final String A0I = AnonymousClass6VD.A01("WorkerWrapper");
    public Context A00;
    public C18850tv A01;
    public C109385Xj A02 = C97334ow.A00();
    public C128916Ec A03;
    public C120755s1 A04;
    public WorkDatabase A05;
    public C157137bt A06;
    public AnonymousClass7e9 A07;
    public AnonymousClass6QA A08;
    public C160977lt A09;
    public C97484pl A0A = new C97484pl();
    public AnonymousClass7eB A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public final C97484pl A0F = new C97484pl();
    public final String A0G;
    public volatile boolean A0H;

    private void A00() {
        String str;
        boolean z;
        C160977lt r0 = this.A09;
        String str2 = this.A0G;
        Integer BHw = r0.BHw(str2);
        Integer num = C023109s.A01;
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str3 = A0I;
        StringBuilder A0k = C36331k8.A0k("Status for ", str2);
        if (BHw == num) {
            AnonymousClass6VD.A03(A002, " is RUNNING; not doing any work and rescheduling for later execution", str3, A0k);
            z = true;
        } else {
            A0k.append(" is ");
            if (BHw != null) {
                str = AnonymousClass6GL.A00(BHw);
            } else {
                str = "null";
            }
            A0k.append(str);
            AnonymousClass6VD.A03(A002, " ; not doing any work", str3, A0k);
            z = false;
        }
        A01(z);
    }

    private void A01(boolean z) {
        Map map;
        boolean containsKey;
        WorkDatabase workDatabase = this.A05;
        workDatabase.A06();
        boolean z2 = false;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A002 = C109355Xg.A00("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        AnonymousClass6Q8 r0 = ((C138936iw) workDatabase.A0D()).A02;
        r0.A05();
        Cursor A003 = C109365Xh.A00(r0, A002, false);
        try {
            if (A003.moveToFirst() && A003.getInt(0) != 0) {
                z2 = true;
            }
            A003.close();
            A002.A00();
            if (!z2) {
                AnonymousClass6I0.A00(this.A00, RescheduleReceiver.class, false);
            }
            if (z) {
                C160977lt r3 = this.A09;
                Integer num = C023109s.A00;
                String str = this.A0G;
                r3.BsK(num, str);
                r3.BP9(str, -1);
            }
            if (this.A03 != null) {
                C157137bt r4 = this.A06;
                String str2 = this.A0G;
                C138836im r42 = (C138836im) r4;
                Object obj = r42.A0A;
                synchronized (obj) {
                    try {
                        map = r42.A05;
                        containsKey = map.containsKey(str2);
                    } catch (Throwable th) {
                        while (true) {
                            th = th;
                            break;
                        }
                    }
                }
                if (containsKey) {
                    synchronized (obj) {
                        try {
                            map.remove(str2);
                            C138836im.A00(r42);
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
            workDatabase.A07();
            AnonymousClass6Q8.A01(workDatabase);
            this.A0A.A06(Boolean.valueOf(z));
        } catch (Throwable th3) {
            AnonymousClass6Q8.A01(workDatabase);
            throw th3;
        }
    }

    public static boolean A02(AnonymousClass758 r5) {
        if (!r5.A0H) {
            return false;
        }
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A0I;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Work interrupted for ");
        AnonymousClass6VD.A03(A002, r5.A0C, str, A0u);
        Integer BHw = r5.A09.BHw(r5.A0G);
        if (BHw == null) {
            r5.A01(false);
            return true;
        }
        r5.A01(!AnonymousClass6GL.A01(BHw));
        return true;
    }

    public void A03() {
        WorkDatabase workDatabase = this.A05;
        workDatabase.A06();
        try {
            String str = this.A0G;
            LinkedList A0l = C90524aI.A0l();
            A0l.add(str);
            while (!A0l.isEmpty()) {
                String str2 = (String) A0l.remove();
                C160977lt r2 = this.A09;
                if (r2.BHw(str2) != C023109s.A0S) {
                    r2.BsK(C023109s.A0G, str2);
                }
                A0l.addAll(this.A07.BAz(str2));
            }
            this.A09.BrR(((C97334ow) this.A02).A00, str);
            workDatabase.A07();
        } finally {
            AnonymousClass6Q8.A01(workDatabase);
            A01(false);
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        String str;
        StringBuilder A0u;
        String str2;
        AnonymousClass6X2 A002;
        Class cls;
        Object newInstance;
        byte[] bArr;
        boolean z;
        AnonymousClass6Q8 r7;
        AnonymousClass6P9 r2;
        C161957nk A003;
        List list = this.A0D;
        StringBuilder A0i = C90524aI.A0i("Work [ id=");
        String str3 = this.A0G;
        A0i.append(str3);
        A0i.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(it);
            if (z2) {
                z2 = false;
            } else {
                C90504aG.A1M(A0i);
            }
            A0i.append(A0C2);
        }
        this.A0C = AnonymousClass000.A0q(" } ]", A0i);
        if (!A02(this)) {
            WorkDatabase workDatabase = this.A05;
            workDatabase.A06();
            try {
                AnonymousClass6QA r3 = this.A08;
                Integer num = r3.A0E;
                Integer num2 = C023109s.A00;
                if (num != num2) {
                    A00();
                    workDatabase.A07();
                    AnonymousClass6VD A004 = AnonymousClass6VD.A00();
                    String str4 = A0I;
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    A0u2.append(r3.A0G);
                    AnonymousClass6VD.A03(A004, " is not in ENQUEUED state. Nothing more to do", str4, A0u2);
                } else if ((r3.A05 != 0 || r3.A01 > 0) && System.currentTimeMillis() < r3.A04()) {
                    AnonymousClass6VD.A00().A04(A0I, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{r3.A0G}));
                    A01(true);
                    workDatabase.A07();
                } else {
                    workDatabase.A07();
                    AnonymousClass6Q8.A01(workDatabase);
                    if (r3.A05 != 0) {
                        A002 = r3.A0A;
                    } else {
                        String str5 = r3.A0F;
                        try {
                            AnonymousClass6M3 r11 = (AnonymousClass6M3) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            if (r11 != null) {
                                ArrayList<AnonymousClass6X2> A0I2 = AnonymousClass001.A0I();
                                A0I2.add(r3.A0A);
                                TreeMap treeMap = C138686iW.A08;
                                C138686iW A005 = C109355Xg.A00("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                                A005.B1q(1, str3);
                                AnonymousClass6Q8 r0 = ((C138936iw) this.A09).A02;
                                r0.A05();
                                Cursor A006 = C109365Xh.A00(r0, A005, false);
                                try {
                                    ArrayList A0n = C90474aD.A0n(A006);
                                    while (A006.moveToNext()) {
                                        if (A006.isNull(0)) {
                                            bArr = null;
                                        } else {
                                            bArr = A006.getBlob(0);
                                        }
                                        A0n.add(AnonymousClass6X2.A00(bArr));
                                    }
                                    A006.close();
                                    A005.A00();
                                    A0I2.addAll(A0n);
                                    if (r11 instanceof OverwritingInputMerger) {
                                        AnonymousClass6EH r9 = new AnonymousClass6EH();
                                        HashMap A0J = AnonymousClass001.A0J();
                                        for (AnonymousClass6X2 r02 : A0I2) {
                                            A0J.putAll(Collections.unmodifiableMap(r02.A00));
                                        }
                                        r9.A03(A0J);
                                        A002 = r9.A00();
                                    } else {
                                        AnonymousClass6EH r12 = new AnonymousClass6EH();
                                        HashMap A0J2 = AnonymousClass001.A0J();
                                        for (AnonymousClass6X2 r03 : A0I2) {
                                            Map unmodifiableMap = Collections.unmodifiableMap(r03.A00);
                                            AnonymousClass00C.A08(unmodifiableMap);
                                            Iterator A0y = AnonymousClass000.A0y(unmodifiableMap);
                                            while (true) {
                                                if (A0y.hasNext()) {
                                                    Map.Entry A11 = AnonymousClass000.A11(A0y);
                                                    Object key = A11.getKey();
                                                    Object value = A11.getValue();
                                                    if (value == null || (cls = value.getClass()) == null) {
                                                        cls = String.class;
                                                    }
                                                    Object obj = A0J2.get(key);
                                                    AnonymousClass00C.A06(key);
                                                    if (obj != null) {
                                                        Class<?> cls2 = obj.getClass();
                                                        if (AnonymousClass00C.A0J(cls2, cls)) {
                                                            AnonymousClass00C.A08(value);
                                                            int length = Array.getLength(obj);
                                                            int length2 = Array.getLength(value);
                                                            Class<?> componentType = cls2.getComponentType();
                                                            AnonymousClass00C.A0B(componentType);
                                                            newInstance = Array.newInstance(componentType, length + length2);
                                                            System.arraycopy(obj, 0, newInstance, 0, length);
                                                            System.arraycopy(value, 0, newInstance, length, length2);
                                                        } else if (AnonymousClass00C.A0J(cls2.getComponentType(), cls)) {
                                                            int length3 = Array.getLength(obj);
                                                            newInstance = Array.newInstance(cls, length3 + 1);
                                                            System.arraycopy(obj, 0, newInstance, 0, length3);
                                                            Array.set(newInstance, length3, value);
                                                        } else {
                                                            throw new IllegalArgumentException();
                                                        }
                                                    } else if (!cls.isArray()) {
                                                        newInstance = Array.newInstance(cls, 1);
                                                        Array.set(newInstance, 0, value);
                                                    } else {
                                                        AnonymousClass00C.A0A(value);
                                                        A0J2.put(key, value);
                                                    }
                                                    AnonymousClass00C.A08(newInstance);
                                                    value = newInstance;
                                                    AnonymousClass00C.A0A(value);
                                                    A0J2.put(key, value);
                                                }
                                            }
                                        }
                                        r12.A03(A0J2);
                                        A002 = r12.A00();
                                    }
                                } catch (Throwable th) {
                                    A006.close();
                                    A005.A00();
                                    throw th;
                                }
                            }
                        } catch (Exception e) {
                            AnonymousClass6VD.A00();
                            Log.e(AnonymousClass6M3.A00, AnonymousClass000.A0p("Trouble instantiating + ", str5, AnonymousClass000.A0u()), e);
                        }
                        AnonymousClass6VD.A00();
                        str = A0I;
                        A0u = AnonymousClass000.A0u();
                        A0u.append("Could not create Input Merger ");
                        str2 = r3.A0F;
                        Log.e(str, AnonymousClass000.A0q(str2, A0u));
                        A03();
                        return;
                    }
                    UUID fromString = UUID.fromString(str3);
                    C120755s1 r13 = this.A04;
                    int i = r3.A01;
                    C18850tv r8 = this.A01;
                    Executor executor = r8.A05;
                    AnonymousClass7eB r14 = this.A0B;
                    C130966Nd r122 = r8.A04;
                    WorkerParameters workerParameters = new WorkerParameters(A002, new C138766if(workDatabase, this.A06, r14), new C138786ih(workDatabase, r14), r122, r13, r14, list, fromString, executor, i);
                    C128916Ec r1 = this.A03;
                    if (r1 == null) {
                        Context context = this.A00;
                        str2 = r3.A0G;
                        r1 = r122.A00(context, workerParameters, str2);
                        this.A03 = r1;
                        if (r1 == null) {
                            AnonymousClass6VD.A00();
                            str = A0I;
                            A0u = AnonymousClass000.A0u();
                            A0u.append("Could not create Worker ");
                            Log.e(str, AnonymousClass000.A0q(str2, A0u));
                            A03();
                            return;
                        }
                    }
                    if (r1.A02) {
                        AnonymousClass6VD.A00();
                        str = A0I;
                        A0u = AnonymousClass000.A0u();
                        A0u.append("Received an already-used Worker ");
                        A0u.append(r3.A0G);
                        str2 = "; Worker Factory should return new instances";
                        Log.e(str, AnonymousClass000.A0q(str2, A0u));
                        A03();
                        return;
                    }
                    r1.A02 = true;
                    workDatabase.A06();
                    C160977lt r15 = this.A09;
                    if (r15.BHw(str3) == num2) {
                        r15.BsK(C023109s.A01, str3);
                        C138936iw r16 = (C138936iw) r15;
                        r7 = r16.A02;
                        r7.A05();
                        r2 = r16.A04;
                        A003 = AnonymousClass6P9.A00(r7, r2, str3);
                        C97274ok.A00(r7, A003);
                        AnonymousClass6Q8.A01(r7);
                        r2.A03(A003);
                        z = true;
                    } else {
                        z = false;
                    }
                    workDatabase.A07();
                    AnonymousClass6Q8.A01(workDatabase);
                    if (!z) {
                        A00();
                        return;
                    } else if (!A02(this)) {
                        AnonymousClass75A r72 = new AnonymousClass75A(this.A00, workerParameters.A02, this.A03, r3, r14);
                        C138956iy r142 = (C138956iy) r14;
                        Executor executor2 = r142.A02;
                        executor2.execute(r72);
                        A6T a6t = (A6T) r72.A02;
                        C97484pl r22 = this.A0F;
                        r22.B0P(new AnonymousClass75C(this, (C17880sD) a6t, 12), new C1508476z());
                        a6t.B0P(new AnonymousClass75C(this, (C17880sD) a6t, 13), executor2);
                        r22.B0P(new AnonymousClass751(0, this.A0C, this), r142.A01);
                        return;
                    } else {
                        return;
                    }
                }
                AnonymousClass6Q8.A01(workDatabase);
            } catch (Throwable th2) {
                AnonymousClass6Q8.A01(workDatabase);
                throw th2;
            }
        }
    }

    public AnonymousClass758(C124505yI r2) {
        this.A00 = r2.A00;
        this.A0B = r2.A05;
        this.A06 = r2.A03;
        AnonymousClass6QA r0 = r2.A04;
        this.A08 = r0;
        this.A0G = r0.A0J;
        this.A0E = r2.A07;
        this.A04 = r2.A06;
        this.A03 = null;
        this.A01 = r2.A01;
        WorkDatabase workDatabase = r2.A02;
        this.A05 = workDatabase;
        this.A09 = workDatabase.A0D();
        this.A07 = this.A05.A08();
        this.A0D = r2.A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        X.AnonymousClass6Q8.A01(r7);
        r2.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0173, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.AnonymousClass6Q8.A01(r3);
        A01(r6);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:45:0x00f7, B:54:0x0142] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r14 = this;
            boolean r0 = A02(r14)
            if (r0 != 0) goto L_0x0194
            androidx.work.impl.WorkDatabase r3 = r14.A05
            r3.A06()
            X.7lt r5 = r14.A09     // Catch:{ all -> 0x018c }
            java.lang.String r4 = r14.A0G     // Catch:{ all -> 0x018c }
            java.lang.Integer r1 = r5.BHw(r4)     // Catch:{ all -> 0x018c }
            X.7eA r0 = r3.A0C()     // Catch:{ all -> 0x018c }
            r0.B5B(r4)     // Catch:{ all -> 0x018c }
            if (r1 != 0) goto L_0x001e
            goto L_0x0184
        L_0x001e:
            java.lang.Integer r0 = X.C023109s.A01     // Catch:{ all -> 0x018c }
            if (r1 != r0) goto L_0x00d1
            X.5Xj r1 = r14.A02     // Catch:{ all -> 0x018c }
            boolean r0 = r1 instanceof X.C97344ox     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x00d8
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x018c }
            java.lang.String r9 = A0I     // Catch:{ all -> 0x018c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "Worker result SUCCESS for "
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x018c }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x018c }
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x018c }
            X.6QA r0 = r14.A08     // Catch:{ all -> 0x018c }
            long r0 = r0.A05     // Catch:{ all -> 0x018c }
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0124
            r3.A06()     // Catch:{ all -> 0x018c }
            r7 = 0
            java.lang.Integer r0 = X.C023109s.A0C     // Catch:{ all -> 0x017c }
            r5.BsK(r0, r4)     // Catch:{ all -> 0x017c }
            X.5Xj r0 = r14.A02     // Catch:{ all -> 0x017c }
            X.4ox r0 = (X.C97344ox) r0     // Catch:{ all -> 0x017c }
            X.6X2 r0 = r0.A00     // Catch:{ all -> 0x017c }
            r5.BrR(r0, r4)     // Catch:{ all -> 0x017c }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017c }
            X.7e9 r8 = r14.A07     // Catch:{ all -> 0x017c }
            java.util.ArrayList r0 = r8.BAz(r4)     // Catch:{ all -> 0x017c }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x017c }
        L_0x0069:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x017c }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r6 = X.AnonymousClass001.A0C(r13)     // Catch:{ all -> 0x017c }
            java.lang.Integer r4 = r5.BHw(r6)     // Catch:{ all -> 0x017c }
            java.lang.Integer r0 = X.C023109s.A0R     // Catch:{ all -> 0x017c }
            if (r4 != r0) goto L_0x0069
            r4 = r8
            X.6ir r4 = (X.C138886ir) r4     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)"
            r12 = 1
            X.6iW r11 = X.C109355Xg.A01(r0, r6)     // Catch:{ all -> 0x017c }
            X.6Q8 r0 = r4.A01     // Catch:{ all -> 0x017c }
            r0.A05()     // Catch:{ all -> 0x017c }
            r10 = 0
            android.database.Cursor r4 = X.C109365Xh.A00(r0, r11, r7)     // Catch:{ all -> 0x017c }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x009d
            int r0 = r4.getInt(r7)     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x009c
            r12 = 0
        L_0x009c:
            r10 = r12
        L_0x009d:
            r4.close()     // Catch:{ all -> 0x017c }
            r11.A00()     // Catch:{ all -> 0x017c }
            if (r10 == 0) goto L_0x0069
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x017c }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x017c }
            java.lang.String r0 = "Setting status to enqueued for "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r6, r4)     // Catch:{ all -> 0x017c }
            android.util.Log.i(r9, r0)     // Catch:{ all -> 0x017c }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x017c }
            r5.BsK(r0, r6)     // Catch:{ all -> 0x017c }
            r5.Br7(r6, r1)     // Catch:{ all -> 0x017c }
            goto L_0x0069
        L_0x00be:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x017c }
            r11.A00()     // Catch:{ all -> 0x017c }
            throw r0     // Catch:{ all -> 0x017c }
        L_0x00c6:
            r3.A07()     // Catch:{ all -> 0x017c }
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x018c }
            r14.A01(r7)     // Catch:{ all -> 0x018c }
            goto L_0x0188
        L_0x00d1:
            boolean r0 = X.AnonymousClass6GL.A01(r1)     // Catch:{ all -> 0x018c }
            if (r0 != 0) goto L_0x0188
            goto L_0x00f3
        L_0x00d8:
            boolean r0 = r1 instanceof X.C97324ov     // Catch:{ all -> 0x018c }
            X.AnonymousClass6VD.A00()     // Catch:{ all -> 0x018c }
            java.lang.String r2 = A0I     // Catch:{ all -> 0x018c }
            if (r0 == 0) goto L_0x0104
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "Worker result RETRY for "
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x018c }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x018c }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x018c }
        L_0x00f3:
            r3.A06()     // Catch:{ all -> 0x018c }
            r6 = 1
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0174 }
            r5.BsK(r0, r4)     // Catch:{ all -> 0x0174 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0174 }
            r5.Br7(r4, r0)     // Catch:{ all -> 0x0174 }
            goto L_0x015d
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x018c }
            java.lang.String r0 = "Worker result FAILURE for "
            r1.append(r0)     // Catch:{ all -> 0x018c }
            java.lang.String r0 = r14.A0C     // Catch:{ all -> 0x018c }
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x018c }
            android.util.Log.i(r2, r0)     // Catch:{ all -> 0x018c }
            X.6QA r0 = r14.A08     // Catch:{ all -> 0x018c }
            long r1 = r0.A05     // Catch:{ all -> 0x018c }
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0124
            r14.A03()     // Catch:{ all -> 0x018c }
            goto L_0x0188
        L_0x0124:
            r3.A06()     // Catch:{ all -> 0x018c }
            r6 = 0
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0174 }
            r5.Br7(r4, r0)     // Catch:{ all -> 0x0174 }
            java.lang.Integer r0 = X.C023109s.A00     // Catch:{ all -> 0x0174 }
            r5.BsK(r0, r4)     // Catch:{ all -> 0x0174 }
            r0 = r5
            X.6iw r0 = (X.C138936iw) r0     // Catch:{ all -> 0x0174 }
            X.6Q8 r7 = r0.A02     // Catch:{ all -> 0x0174 }
            r7.A05()     // Catch:{ all -> 0x0174 }
            X.6P9 r2 = r0.A06     // Catch:{ all -> 0x0174 }
            X.7nk r1 = X.AnonymousClass6P9.A00(r7, r2, r4)     // Catch:{ all -> 0x0174 }
            X.C97274ok.A00(r7, r1)     // Catch:{ all -> 0x016c }
            X.AnonymousClass6Q8.A01(r7)     // Catch:{ all -> 0x0174 }
            r2.A03(r1)     // Catch:{ all -> 0x0174 }
            r7.A05()     // Catch:{ all -> 0x0174 }
            X.6P9 r2 = r0.A03     // Catch:{ all -> 0x0174 }
            X.7nk r1 = X.AnonymousClass6P9.A00(r7, r2, r4)     // Catch:{ all -> 0x0174 }
            X.C97274ok.A00(r7, r1)     // Catch:{ all -> 0x016c }
            X.AnonymousClass6Q8.A01(r7)     // Catch:{ all -> 0x0174 }
            r2.A03(r1)     // Catch:{ all -> 0x0174 }
        L_0x015d:
            r0 = -1
            r5.BP9(r4, r0)     // Catch:{ all -> 0x0174 }
            r3.A07()     // Catch:{ all -> 0x0174 }
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x018c }
            r14.A01(r6)     // Catch:{ all -> 0x018c }
            goto L_0x0188
        L_0x016c:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r7)     // Catch:{ all -> 0x0174 }
            r2.A03(r1)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ all -> 0x0174 }
        L_0x0174:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x018c }
            r14.A01(r6)     // Catch:{ all -> 0x018c }
            goto L_0x0183
        L_0x017c:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)     // Catch:{ all -> 0x018c }
            r14.A01(r7)     // Catch:{ all -> 0x018c }
        L_0x0183:
            throw r0     // Catch:{ all -> 0x018c }
        L_0x0184:
            r0 = 0
            r14.A01(r0)     // Catch:{ all -> 0x018c }
        L_0x0188:
            r3.A07()     // Catch:{ all -> 0x018c }
            goto L_0x0191
        L_0x018c:
            r0 = move-exception
            X.AnonymousClass6Q8.A01(r3)
            throw r0
        L_0x0191:
            X.AnonymousClass6Q8.A01(r3)
        L_0x0194:
            java.util.List r3 = r14.A0E
            if (r3 == 0) goto L_0x01b5
            java.util.Iterator r2 = r3.iterator()
        L_0x019c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r1 = r2.next()
            X.7k7 r1 = (X.C159907k7) r1
            java.lang.String r0 = r14.A0G
            r1.B2R(r0)
            goto L_0x019c
        L_0x01ae:
            X.0tv r1 = r14.A01
            androidx.work.impl.WorkDatabase r0 = r14.A05
            X.AnonymousClass6RH.A01(r1, r0, r3)
        L_0x01b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass758.A04():void");
    }
}
