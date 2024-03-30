package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1Z7  reason: invalid class name */
public class AnonymousClass1Z7 implements AnonymousClass1Z6 {
    public final C24711Dm A00;
    public final C24681Dj A01;
    public final C24701Dl A02;
    public final AnonymousClass1Z5 A03;
    public volatile boolean A04 = false;

    public void BJY(JSONObject jSONObject, int[] iArr) {
        int i;
        String string;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("results");
            int i2 = 0;
            while (true) {
                int[] iArr2 = iArr;
                int length = iArr2.length;
                if (i2 < length) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        i = jSONObject2.getInt("notice_id");
                        jSONObject2.toString();
                        int[] copyOf = Arrays.copyOf(iArr2, length);
                        Arrays.sort(copyOf);
                        int binarySearch = Arrays.binarySearch(copyOf, i);
                        if (binarySearch >= 0 && binarySearch < length && i == iArr[binarySearch] && (string = jSONObject2.getJSONObject("privacy-disclosure").getString("deeplink")) != null) {
                            this.A02.A05((Integer) null, string, jSONObject2.toString(), i, 1, -1, false);
                            AnonymousClass1Z5 r6 = this.A03;
                            AnonymousClass3NX r5 = AnonymousClass3NX.A06;
                            AnonymousClass00C.A0D(r5, 3);
                            AnonymousClass1Z5.A00(r5, r6, i, 1);
                            C24681Dj r1 = this.A01;
                            r1.A08.A00(i, 1);
                            r1.A02(i, 100);
                            AnonymousClass1Z5.A00(r5, r6, i, 100);
                        }
                    } catch (JSONException e) {
                        this.A03.A01(i, 3);
                        throw e;
                    } catch (JSONException e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("pdfndisclosurehandler/handledisclosurecontent wrong json object for disclosure ");
                        sb.append(e2);
                        Log.e(sb.toString());
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } catch (JSONException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("pdfndisclosurehandler/handledisclosurecontent wrong json object for disclosure ");
            sb2.append(e3);
            Log.e(sb2.toString());
        }
    }

    public boolean BJZ(List list, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!this.A04) {
            this.A04 = true;
            this.A02.A00 = this.A01;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C65613Su r5 = (C65613Su) it.next();
            int i = r5.A01;
            Integer valueOf = Integer.valueOf(i);
            arrayList2.add(valueOf);
            C24701Dl r8 = this.A02;
            C24701Dl.A02(r8);
            C34331gr r2 = (C34331gr) r8.A04.get(valueOf);
            if (r2 == null) {
                if (!C34391gx.A00.contains(Integer.valueOf(r5.A00))) {
                    arrayList.add(valueOf);
                }
                r8.A04(i, r5.A00, r5.A02, r5.A03, z2 ? 1 : 0);
            } else {
                int i2 = r2.A03;
                int i3 = r5.A03;
                if (i2 != i3) {
                    arrayList.add(valueOf);
                }
                r8.A05(Integer.valueOf(i3), (String) null, (String) null, i, r5.A00, -1, true);
            }
        }
        C24701Dl r6 = this.A02;
        ArrayList arrayList3 = new ArrayList();
        ConcurrentHashMap concurrentHashMap = r6.A04;
        for (Object next : concurrentHashMap.keySet()) {
            C34331gr r22 = (C34331gr) concurrentHashMap.get(next);
            if ((r22 == null || r22.A00 != 1) && !arrayList2.contains(next)) {
                arrayList3.add(next);
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            C34331gr r0 = (C34331gr) concurrentHashMap.get(number);
            if (r0 != null) {
                if (!C34391gx.A00.contains(Integer.valueOf(r0.A01))) {
                    int intValue = number.intValue();
                    C24701Dl.A02(r6);
                    if (concurrentHashMap.get(number) != null) {
                        concurrentHashMap.remove(number);
                        C24701Dl.A01(r6).edit().remove(String.valueOf(intValue)).apply();
                    }
                    SharedPreferences.Editor A002 = C24701Dl.A00(r6);
                    StringBuilder sb = new StringBuilder();
                    sb.append("repeat_last_ts_");
                    sb.append(intValue);
                    A002.putLong(sb.toString(), 0).apply();
                    SharedPreferences.Editor A003 = C24701Dl.A00(r6);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("repeat_last_index_");
                    sb2.append(intValue);
                    A003.putInt(sb2.toString(), -1).apply();
                    C24681Dj r02 = r6.A00;
                    if (r02 != null) {
                        File file = new File(new File(r02.A05.A00.A00.getFilesDir(), "privacy_disclosure"), String.valueOf(intValue));
                        if (!file.exists()) {
                            Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
                        } else {
                            AnonymousClass6YY.A0Q(file);
                        }
                    }
                }
            }
        }
        if (z && arrayList.size() > 0) {
            this.A00.A01(arrayList, 1200000, false);
        }
        return true;
    }

    public void BVo(int[] iArr, int i) {
        C24681Dj r4 = this.A01;
        if (i == 430) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror no eligible disclosure");
            Object obj = r4.A01;
            synchronized (obj) {
                if (r4.A0D && iArr.length > 0 && iArr[0] == r4.A0B) {
                    r4.A0D = false;
                    r4.A0B = 0;
                    obj.notify();
                }
            }
        } else if (i == 400 || i == 410) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror fail dl or parse case");
            Object obj2 = r4.A00;
            synchronized (obj2) {
                if (r4.A0C && iArr.length > 0 && iArr[0] == r4.A0A) {
                    r4.A0C = false;
                    r4.A0A = 0;
                    obj2.notify();
                }
            }
        }
    }

    public AnonymousClass1Z7(C24681Dj r2, C24701Dl r3, AnonymousClass1Z5 r4, C24711Dm r5) {
        this.A02 = r3;
        this.A00 = r5;
        this.A03 = r4;
        this.A01 = r2;
    }
}
