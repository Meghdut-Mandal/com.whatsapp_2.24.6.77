package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;

/* renamed from: X.6io  reason: invalid class name and case insensitive filesystem */
public class C138856io implements C159907k7 {
    public static final String A04 = AnonymousClass6VD.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final AnonymousClass6VR A02;
    public final C132116Sf A03;

    public static ArrayList A00(JobScheduler jobScheduler, Context context) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AnonymousClass6VD.A00();
            Log.e(A04, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = C36361kB.A0r(list);
            ComponentName componentName = new ComponentName(context, SystemJobService.class);
            for (JobInfo next : list) {
                if (componentName.equals(next.getService())) {
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }

    public boolean BJv() {
        return true;
    }

    public C138856io(Context context, AnonymousClass6VR r4) {
        C132116Sf r0 = new C132116Sf(context);
        this.A01 = context;
        this.A02 = r4;
        this.A00 = (JobScheduler) context.getSystemService("jobscheduler");
        this.A03 = r0;
    }

    public static void A03(Context context) {
        ArrayList A002;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (A002 = A00(jobScheduler, context)) != null && !A002.isEmpty()) {
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                A02(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
    }

    public static boolean A04(Context context, AnonymousClass6VR r10) {
        int i;
        String str;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList A002 = A00(jobScheduler, context);
        WorkDatabase workDatabase = r10.A04;
        boolean z = false;
        TreeMap treeMap = C138686iW.A08;
        C138686iW A003 = C109355Xg.A00("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        AnonymousClass6Q8 r0 = ((C138906it) workDatabase.A0A()).A00;
        r0.A05();
        Cursor A004 = C109365Xh.A00(r0, A003, false);
        try {
            ArrayList A0n = C90474aD.A0n(A004);
            while (A004.moveToNext()) {
                if (A004.isNull(0)) {
                    str = null;
                } else {
                    str = A004.getString(0);
                }
                A0n.add(str);
            }
            if (A002 != null) {
                i = A002.size();
            } else {
                i = 0;
            }
            HashSet hashSet = new HashSet(i);
            if (A002 != null && !A002.isEmpty()) {
                Iterator it = A002.iterator();
                while (it.hasNext()) {
                    JobInfo jobInfo = (JobInfo) it.next();
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                hashSet.add(new AnonymousClass69L(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0)).A01);
                            }
                        } catch (NullPointerException unused) {
                        }
                    }
                    A02(jobScheduler, jobInfo.getId());
                }
            }
            Iterator it2 = A0n.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (!hashSet.contains(it2.next())) {
                    AnonymousClass6VD.A00().A04(A04, "Reconciling jobs");
                    z = true;
                    workDatabase.A06();
                    try {
                        C160977lt A0D = workDatabase.A0D();
                        Iterator it3 = A0n.iterator();
                        while (it3.hasNext()) {
                            A0D.BP9(AnonymousClass001.A0C(it3), -1);
                        }
                        workDatabase.A07();
                    } finally {
                        AnonymousClass6Q8.A01(workDatabase);
                    }
                }
            }
            return z;
        } finally {
            A004.close();
            A003.A00();
        }
    }

    public void A05(AnonymousClass6QA r9, int i) {
        int i2;
        JobInfo A012 = this.A03.A01(r9, i);
        AnonymousClass6VD A002 = AnonymousClass6VD.A00();
        String str = A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Scheduling work ID ");
        String str2 = r9.A0J;
        A0u.append(str2);
        A002.A04(str, AnonymousClass000.A0r("Job ID ", A0u, i));
        try {
            if (this.A00.schedule(A012) == 0) {
                AnonymousClass6VD.A00();
                Log.w(str, AnonymousClass000.A0p("Unable to schedule work ID ", str2, AnonymousClass000.A0u()));
                if (r9.A0H && r9.A0D == C023109s.A00) {
                    r9.A0H = false;
                    AnonymousClass6VD.A00().A04(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{str2}));
                    A05(r9, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList A003 = A00(this.A00, this.A01);
            if (A003 != null) {
                i2 = A003.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] A1Q = C36441kJ.A1Q();
            AnonymousClass000.A1L(A1Q, i2, 0);
            AnonymousClass6VR r2 = this.A02;
            AnonymousClass000.A1L(A1Q, r2.A04.A0D().BH0().size(), 1);
            AnonymousClass000.A1L(A1Q, r2.A02.A00(), 2);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", A1Q);
            AnonymousClass6VD.A00();
            Log.e(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AnonymousClass6VD.A00();
            Log.e(str, AnonymousClass000.A0l(r9, "Unable to schedule ", AnonymousClass000.A0u()), th);
        }
    }

    public void B2R(String str) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList A012 = A01(jobScheduler, context, str);
        if (A012 != null && !A012.isEmpty()) {
            Iterator it = A012.iterator();
            while (it.hasNext()) {
                A02(jobScheduler, C36341k9.A0A(it));
            }
            C138906it r0 = (C138906it) this.A02.A04.A0A();
            AnonymousClass6Q8 r3 = r0.A00;
            r3.A05();
            AnonymousClass6P9 r2 = r0.A02;
            C161957nk A022 = r2.A02();
            if (str == null) {
                A022.B1p(1);
            } else {
                A022.B1q(1, str);
            }
            r3.A06();
            try {
                C97274ok.A00(r3, A022);
            } finally {
                AnonymousClass6Q8.A01(r3);
                r2.A03(A022);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void BpL(AnonymousClass6QA... r14) {
        int A0I;
        ArrayList A012;
        int A0I2;
        AnonymousClass6VR r10 = this.A02;
        WorkDatabase workDatabase = r10.A04;
        C114475hJ r8 = new C114475hJ(workDatabase);
        int length = r14.length;
        int i = 0;
        while (i < length) {
            AnonymousClass6QA r4 = r14[i];
            workDatabase.A06();
            try {
                C160977lt A0D = workDatabase.A0D();
                String str = r4.A0J;
                AnonymousClass6QA BJH = A0D.BJH(str);
                if (BJH == null) {
                    AnonymousClass6VD.A00();
                    String str2 = A04;
                    StringBuilder A0k = C36331k8.A0k("Skipping scheduling ", str);
                    A0k.append(" because it's no longer in the DB");
                    AnonymousClass000.A1A(A0k, str2);
                } else if (BJH.A0E != C023109s.A00) {
                    AnonymousClass6VD.A00();
                    String str3 = A04;
                    StringBuilder A0k2 = C36331k8.A0k("Skipping scheduling ", str);
                    A0k2.append(" because it is no longer enqueued");
                    AnonymousClass000.A1A(A0k2, str3);
                } else {
                    AnonymousClass69L A002 = C109445Xp.A00(r4);
                    C128086Au BI6 = workDatabase.A0A().BI6(A002);
                    if (BI6 != null) {
                        A0I = BI6.A01;
                    } else {
                        C18850tv r0 = r10.A02;
                        Object A032 = r8.A00.A03(new C163747qh(r8, r0.A02, r0.A01, 0));
                        AnonymousClass00C.A08(A032);
                        A0I = AnonymousClass000.A0I(A032);
                        workDatabase.A0A().BKk(new C128086Au(A002.A01, A002.A00, A0I));
                    }
                    A05(r4, A0I);
                    if (Build.VERSION.SDK_INT == 23 && (A012 = A01(this.A00, this.A01, str)) != null) {
                        int indexOf = A012.indexOf(Integer.valueOf(A0I));
                        if (indexOf >= 0) {
                            A012.remove(indexOf);
                        }
                        if (!A012.isEmpty()) {
                            A0I2 = C90474aD.A07(A012, 0);
                        } else {
                            C18850tv r02 = r10.A02;
                            Object A033 = r8.A00.A03(new C163747qh(r8, r02.A02, r02.A01, 0));
                            AnonymousClass00C.A08(A033);
                            A0I2 = AnonymousClass000.A0I(A033);
                        }
                        A05(r4, A0I2);
                    }
                }
                workDatabase.A07();
                AnonymousClass6Q8.A01(workDatabase);
                i++;
            } catch (Throwable th) {
                AnonymousClass6Q8.A01(workDatabase);
                throw th;
            }
        }
    }

    public static ArrayList A01(JobScheduler jobScheduler, Context context, String str) {
        AnonymousClass69L r0;
        ArrayList A002 = A00(jobScheduler, context);
        if (A002 == null) {
            return null;
        }
        ArrayList A14 = C36441kJ.A14(2);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                try {
                    if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        r0 = new AnonymousClass69L(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                        if (r0 != null && str.equals(r0.A01)) {
                            AnonymousClass000.A1F(A14, jobInfo.getId());
                        }
                    }
                } catch (NullPointerException unused) {
                }
            }
            r0 = null;
            AnonymousClass000.A1F(A14, jobInfo.getId());
        }
        return A14;
    }

    public static void A02(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AnonymousClass6VD.A00();
            String str = A04;
            Locale locale = Locale.getDefault();
            Object[] A0L = AnonymousClass001.A0L();
            C36331k8.A1W(A0L, i);
            Log.e(str, String.format(locale, "Exception while trying to cancel job (%d)", A0L), th);
        }
    }
}
