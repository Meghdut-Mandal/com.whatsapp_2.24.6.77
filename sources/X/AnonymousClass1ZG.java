package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.1ZG  reason: invalid class name */
public class AnonymousClass1ZG implements C236319f {
    public final AnonymousClass1ZF A00;
    public final C29341Wg A01;

    public int[] BCF() {
        return new int[]{216};
    }

    public boolean BJl(Message message, int i) {
        String str;
        int i2;
        int i3;
        StringBuilder sb;
        String obj;
        if (i != 216) {
            return false;
        }
        List<C65613Su> list = (List) message.obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C65613Su r2 : list) {
                int i4 = r2.A02;
                if (i4 == 2 || i4 == 1) {
                    arrayList.add(r2);
                } else if (i4 == 0) {
                    arrayList2.add(r2);
                }
            }
            if (arrayList2.size() > 0) {
                arrayList2.size();
                C29341Wg r22 = this.A01;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: ");
                sb2.append(arrayList2.size());
                Log.i(sb2.toString());
                C29361Wi r7 = r22.A03;
                TreeMap A02 = r7.A02();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    C65613Su r11 = (C65613Su) it.next();
                    C65613Su r15 = (C65613Su) A02.get(Integer.valueOf(r11.A01));
                    if (r15 == null) {
                        obj = "UserNoticeManager/getUpdatedUserNoticeList/new notice";
                    } else {
                        int i5 = r15.A00;
                        int i6 = r11.A00;
                        if (i5 < i6) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: ");
                            sb3.append(i5);
                            sb3.append(" sever stage: ");
                            sb3.append(i6);
                            obj = sb3.toString();
                        } else {
                            int i7 = r15.A03;
                            int i8 = r11.A03;
                            if (i7 < i8) {
                                sb.append("UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: ");
                                sb.append(i7);
                                sb.append(" sever version: ");
                                sb.append(i8);
                                Log.i(sb.toString());
                                r15 = new C65613Su(r15.A01, r15.A00, i8, r15.A04, 0);
                            } else {
                                sb = new StringBuilder();
                                sb.append("UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: ");
                                sb.append(i5);
                                sb.append(" sever stage: ");
                                sb.append(i6);
                                Log.i(sb.toString());
                            }
                            arrayList3.add(r15);
                        }
                    }
                    Log.i(obj);
                    arrayList3.add(r11);
                }
                r7.A05(arrayList3);
                C65613Su A012 = r7.A01();
                TreeMap A022 = r7.A02();
                if (A022.isEmpty()) {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty");
                } else {
                    Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/found metadata");
                    Map.Entry firstEntry = A022.firstEntry();
                    C18740tg.A06(firstEntry);
                    C65613Su r6 = (C65613Su) firstEntry.getValue();
                    if (r6 != null) {
                        r7.A04(r6);
                        if (A012 != null && ((i2 = A012.A01) != (i3 = r6.A01) || A012.A03 < r6.A03)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: ");
                            boolean z = true;
                            boolean z2 = false;
                            if (i2 != i3) {
                                z2 = true;
                            }
                            sb4.append(z2);
                            sb4.append(" old version: ");
                            if (A012.A03 >= r6.A03) {
                                z = false;
                            }
                            sb4.append(z);
                            Log.i(sb4.toString());
                            r22.A02.A07(i2);
                        }
                        C29351Wh r72 = r22.A02;
                        int i9 = r6.A03;
                        int i10 = r6.A01;
                        int i11 = r6.A00;
                        int i12 = 0;
                        if (i11 != 0) {
                            i12 = 1;
                            if (i11 != 1) {
                                i12 = 2;
                                if (i11 != 2) {
                                    i12 = 3;
                                    if (i11 != 3) {
                                        i12 = 4;
                                        if (i11 != 4) {
                                            i12 = 5;
                                            if (i11 != 5) {
                                                i12 = -1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id ");
                        sb5.append(i10);
                        sb5.append(" version: ");
                        sb5.append(i9);
                        sb5.append(" stage: ");
                        sb5.append(i12);
                        Log.i(sb5.toString());
                        if (i12 == 5) {
                            str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch";
                        } else {
                            C20810yC r1 = r72.A04;
                            if (AnonymousClass3RI.A00(r1, i10)) {
                                str = "UserNoticeContentManager/fetchUserNoticeContentIfNecessary/green alert disabled";
                            } else {
                                if (!AnonymousClass3RI.A01(r1, r6) && !C29351Wh.A05(r72, new String[]{"content.json"}, i10)) {
                                    Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/content does not exist, fetch");
                                    r72.A08(i10);
                                }
                                C29341Wg.A01(r72.A06(r6), r22, r6);
                            }
                        }
                        Log.i(str);
                        C29341Wg.A01(r72.A06(r6), r22, r6);
                    }
                }
                r22.A09();
                C29341Wg.A03(r22);
            }
            if (arrayList.size() > 0) {
                arrayList.size();
                AnonymousClass1ZF r62 = this.A00;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C65613Su r23 = (C65613Su) it2.next();
                    Integer valueOf = Integer.valueOf(r23.A02);
                    List list2 = (List) hashMap.get(valueOf);
                    if (list2 == null) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList4.add(r23);
                        hashMap.put(valueOf, arrayList4);
                    } else {
                        list2.add(r23);
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int intValue = ((Number) entry.getKey()).intValue();
                    List list3 = (List) entry.getValue();
                    list3.size();
                    if (list3.size() > 0) {
                        r62.A01.execute(new C35261iP((Object) r62, intValue, 34, (Object) list3));
                    }
                }
            }
        }
        return true;
    }

    public AnonymousClass1ZG(AnonymousClass1ZF r1, C29341Wg r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
