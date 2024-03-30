package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.job.BulkGetPreKeyJob;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1XT  reason: invalid class name */
public class AnonymousClass1XT {
    public boolean A00;
    public boolean A01;
    public final Handler A02;
    public final AnonymousClass164 A03;
    public final C19970wo A04;
    public final C20810yC A05;
    public final C21010yW A06;
    public final C24111Bd A07 = new C24111Bd(10, 610);
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();

    public synchronized void A00() {
        if (this.A01) {
            this.A01 = false;
            this.A00 = false;
            this.A07.A02();
            A01();
        }
    }

    public synchronized void A01() {
        Map map = this.A09;
        if (!map.isEmpty()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                DeviceJid deviceJid = (DeviceJid) entry.getKey();
                AnonymousClass9MQ r2 = (AnonymousClass9MQ) entry.getValue();
                Map map2 = this.A08;
                if (!map2.containsKey(deviceJid)) {
                    arrayList.add(deviceJid);
                    boolean z = r2.A00;
                    if (z) {
                        arrayList2.add(deviceJid);
                    }
                    map2.put(deviceJid, new AnonymousClass9MQ(r2.A01, r2.A03, r2.A02, uptimeMillis, z));
                }
            }
            A02(arrayList, arrayList2, 9);
            map.clear();
            this.A00 = false;
        }
    }

    public synchronized void A04(DeviceJid[] deviceJidArr, int i, boolean z) {
        synchronized (this) {
            A03(deviceJidArr, i, 0, 0, z);
        }
    }

    public synchronized void A03(DeviceJid[] deviceJidArr, int i, int i2, int i3, boolean z) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("prekeysmanager/getprekeys request for jids:");
            DeviceJid[] deviceJidArr2 = deviceJidArr;
            sb.append(Arrays.toString(deviceJidArr2));
            Log.i(sb.toString());
            long uptimeMillis = SystemClock.uptimeMillis();
            Map map = this.A08;
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                if (((AnonymousClass9MQ) ((Map.Entry) it.next()).getValue()).A04 + 60000 < uptimeMillis) {
                    it.remove();
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long uptimeMillis2 = SystemClock.uptimeMillis();
            int length = deviceJidArr2.length;
            int i4 = 0;
            while (true) {
                int i5 = i;
                if (i4 < length) {
                    DeviceJid deviceJid = deviceJidArr[i4];
                    if (!map.containsKey(deviceJid)) {
                        arrayList.add(deviceJid);
                        map.put(deviceJid, new AnonymousClass9MQ(i5, i2, i3, uptimeMillis2, z));
                        if (z) {
                            arrayList2.add(deviceJid);
                        }
                    }
                    i4++;
                } else {
                    A02(arrayList, arrayList2, i5);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("prekeysmanager/sending getprekeys for jids:");
                    sb2.append(Arrays.toString(deviceJidArr2));
                    Log.i(sb2.toString());
                    A00();
                }
            }
        }
    }

    public AnonymousClass1XT(AnonymousClass164 r7, C19970wo r8, C20810yC r9, C21010yW r10) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.A04 = r8;
        this.A05 = r9;
        this.A02 = handler;
        this.A06 = r10;
        this.A03 = r7;
    }

    public void A02(List list, List list2, int i) {
        DeviceJid[] deviceJidArr;
        C20810yC r2;
        int A002;
        int A003;
        if (list.isEmpty()) {
            Log.i("prekeysmanager/startPrekeyFetchJobs jids list is empty");
            return;
        }
        Log.i("prekeysmanager/startPrekeyFetchJobs creating BulkGetPreKeyJob");
        if (list2.isEmpty()) {
            deviceJidArr = null;
        } else {
            deviceJidArr = (DeviceJid[]) list2.toArray(new DeviceJid[0]);
        }
        synchronized (this) {
            r2 = this.A05;
            A002 = C20800yB.A00(C21000yV.A01, r2, 767);
        }
        int size = list.size();
        if (A002 <= 0 || size < A002 || (A003 = C20800yB.A00(C21000yV.A02, r2, 921)) <= 0 || size <= A003) {
            this.A03.A01(new BulkGetPreKeyJob((DeviceJid[]) list.toArray(new DeviceJid[0]), deviceJidArr, i));
            return;
        }
        Iterator it = new AnonymousClass72Z(list.toArray(new DeviceJid[0]), A003).iterator();
        while (it.hasNext()) {
            this.A03.A01(new BulkGetPreKeyJob((DeviceJid[]) it.next(), deviceJidArr, i));
        }
    }
}
