package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1XJ  reason: invalid class name */
public class AnonymousClass1XJ implements AnonymousClass1XI {
    public C81793xa A00;
    public boolean A01;
    public final AnonymousClass1XU A02;
    public final C20810yC A03;
    public final C19700wN A04;
    public final AnonymousClass1XN A05;
    public final AnonymousClass1XP A06;

    public /* bridge */ /* synthetic */ Collection B7G(String str, int i, boolean z, boolean z2) {
        return A02(str, i, false);
    }

    private LinkedHashSet A00(String str, List list, List list2, int i, boolean z) {
        C81793xa r1;
        String str2;
        String obj;
        Cursor A09;
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (linkedHashSet.size() < i) {
            if (!this.A01) {
                this.A04.A0E("emoji dictionary is not prepared yet", (String) null, false);
                return linkedHashSet;
            }
            hashSet = new HashSet();
            AnonymousClass00C.A0D(str, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT DISTINCT symbol FROM emoji_search_tag WHERE type=? AND (tag ");
            if (z) {
                str2 = " = ";
            } else {
                str2 = " LIKE ";
            }
            sb.append(str2);
            sb.append(" ? OR symbol=?) ORDER BY _id ASC LIMIT ?");
            String obj2 = sb.toString();
            String[] strArr = new String[4];
            strArr[0] = "1";
            if (z) {
                obj = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('%');
                obj = sb2.toString();
            }
            strArr[1] = obj;
            strArr[2] = str;
            strArr[3] = String.valueOf(256);
            AnonymousClass00I r2 = new AnonymousClass00I(obj2, strArr);
            try {
                AnonymousClass1M0 A032 = this.A02.get();
                try {
                    A09 = A032.A02.A09((String) r2.A00, "DISTINCT_SYMBOL_FROM_EMOJI_SEARCH_TAG", (String[]) r2.A01);
                    int columnIndexOrThrow = A09.getColumnIndexOrThrow("symbol");
                    while (A09.moveToNext()) {
                        hashSet.add(C63873Lt.A00(A09.getString(columnIndexOrThrow)));
                    }
                    A09.close();
                    A032.close();
                } catch (Throwable th) {
                    A032.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        if (linkedHashSet.size() < i) {
            linkedHashSet.addAll(A01(list, hashSet));
        }
        if (linkedHashSet.size() < i) {
            linkedHashSet.addAll(A01(list2, hashSet));
        }
        if (linkedHashSet.size() < i && hashSet.size() > 0) {
            ArrayList arrayList = new ArrayList(hashSet.size());
            arrayList.addAll(hashSet);
            synchronized (this) {
                r1 = this.A00;
                if (r1 == null) {
                    r1 = new C81793xa(AnonymousClass6JA.A00(this.A03));
                    this.A00 = r1;
                }
            }
            Collections.sort(arrayList, r1);
            linkedHashSet.addAll(arrayList);
            return linkedHashSet;
        }
        return linkedHashSet;
        throw th;
    }

    public static LinkedHashSet A01(List list, Set set) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!set.isEmpty()) {
            for (Object next : list) {
                if (set.contains(next)) {
                    linkedHashSet.add(next);
                    set.remove(next);
                }
            }
        }
        return linkedHashSet;
    }

    public ArrayList A02(String str, int i, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.A05.A04().iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            if (iArr != null) {
                arrayList2.add(new AnonymousClass1XQ(iArr));
            }
        }
        AnonymousClass1XP r3 = this.A06;
        synchronized (r3) {
            List list = r3.A00;
            if (list != null) {
                arrayList = new ArrayList(list);
            } else {
                ArrayList arrayList3 = new ArrayList();
                String string = ((SharedPreferences) r3.A02.A00.get()).getString("top_emojis", (String) null);
                if (string != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            arrayList3.add(C63873Lt.A00(jSONArray.getString(i2)));
                        }
                        r3.A00 = arrayList3;
                        arrayList = new ArrayList(arrayList3);
                    } catch (JSONException e) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("topemojisstore/get-top-emojis/failed ");
                        sb.append(e);
                        Log.e(sb.toString());
                        arrayList = new ArrayList(AnonymousClass1XP.A03);
                    }
                } else {
                    arrayList = new ArrayList(AnonymousClass1XP.A03);
                }
            }
        }
        return A03(str, arrayList2, arrayList, i, z);
    }

    public void B2o() {
        C1495671s B1k;
        AnonymousClass1M0 A042 = this.A02.A04();
        try {
            B1k = A042.B1k();
            A042.A02.A03("emoji_search_tag", "type=?", "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG", new String[]{String.valueOf(1)});
            B1k.A00();
            B1k.close();
            A042.close();
            return;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Collection B7H(String[] strArr, int i, boolean z, boolean z2) {
        C18740tg.A0D(false, "Not implemented");
        return new ArrayList();
    }

    public void Br6(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("emojidictionarystore/setIsFetched:");
        sb.append(z);
        Log.i(sb.toString());
        this.A01 = z;
    }

    public int getCount() {
        Cursor A09;
        AnonymousClass1M0 A032 = this.A02.get();
        try {
            int i = 0;
            A09 = A032.A02.A09("SELECT count(*) as count FROM emoji_search_tag WHERE type=?", "GET_COUNT_EMOJI_SEARCH_TAG", new String[]{String.valueOf(1)});
            if (A09.moveToNext()) {
                i = A09.getInt(A09.getColumnIndexOrThrow("count"));
            }
            A09.close();
            A032.close();
            return i;
        } catch (Throwable th) {
            try {
                A032.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass1XJ(C19700wN r3, C19630wG r4, AnonymousClass11g r5, AnonymousClass12S r6, AnonymousClass1XN r7, AnonymousClass1XP r8, C20810yC r9) {
        this.A03 = r9;
        this.A04 = r3;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = new AnonymousClass1XU(r4.A00, r3, r5, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A03(java.lang.String r19, java.util.List r20, java.util.List r21, int r22, boolean r23) {
        /*
            r18 = this;
            java.lang.String r0 = r19.trim()
            java.lang.String r8 = X.AnonymousClass14B.A06(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            if (r23 == 0) goto L_0x0095
            r12 = 1
            java.util.LinkedHashSet r0 = r7.A00(r8, r9, r10, r11, r12)
        L_0x001c:
            r1.addAll(r0)
        L_0x001f:
            X.0yC r3 = r7.A03
            r2 = 2880(0xb40, float:4.036E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r2)
            if (r0 != 0) goto L_0x0036
            X.0u1 r0 = X.C113725g1.A00
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.removeAll(r0)
        L_0x0036:
            int r0 = r1.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x0043:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r6 = r10.next()
            X.1XQ r6 = (X.AnonymousClass1XQ) r6
            int r0 = r5.size()
            if (r0 >= r11) goto L_0x00ca
            int[] r9 = r6.A00
            int r0 = r9.length
            r8 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0082
            r0 = 2
            int[] r1 = new int[r0]
            r0 = r9[r8]
            r1[r8] = r0
            r0 = 65039(0xfe0f, float:9.1139E-41)
            r1[r2] = r0
            X.1XQ r7 = new X.1XQ
            r7.<init>((int[]) r1)
            int[] r1 = r7.A00
            X.2M9 r0 = new X.2M9
            r0.<init>(r1)
            long r3 = X.C1898996a.A00(r0, r2)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0082
            r5.add(r7)
            goto L_0x0043
        L_0x0082:
            X.2M9 r0 = new X.2M9
            r0.<init>(r9)
            long r3 = X.C1898996a.A00(r0, r8)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            r5.add(r6)
            goto L_0x0043
        L_0x0095:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a3
            r1.addAll(r9)
            r1.addAll(r10)
            goto L_0x001f
        L_0x00a3:
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            java.util.LinkedHashSet r0 = r12.A00(r13, r14, r15, r16, r17)
            r1.addAll(r0)
            int r0 = r1.size()
            if (r0 >= r11) goto L_0x001f
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 0
            java.util.LinkedHashSet r0 = r12.A00(r13, r14, r15, r16, r17)
            goto L_0x001c
        L_0x00ca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XJ.A03(java.lang.String, java.util.List, java.util.List, int, boolean):java.util.ArrayList");
    }
}
