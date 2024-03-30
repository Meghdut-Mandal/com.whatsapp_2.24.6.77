package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1IS  reason: invalid class name */
public class AnonymousClass1IS {
    public static final byte[] A0D = "WhatsApp Patch Integrity".getBytes(C19430v1.A0D);
    public final C19700wN A00;
    public final C19730wQ A01;
    public final C21100yf A02;
    public final C237119n A03;
    public final AnonymousClass1IW A04;
    public final AnonymousClass1A9 A05;
    public final C19970wo A06;
    public final AnonymousClass1IU A07;
    public final AnonymousClass1IT A08;
    public final AnonymousClass1AC A09;
    public final C20810yC A0A;
    public final C19770wU A0B;
    public final AnonymousClass1AB A0C;

    public static byte[] A03(List list, byte[] bArr, byte[] bArr2, boolean z) {
        int i;
        boolean z2 = false;
        if (bArr.length == 128) {
            z2 = true;
        }
        C18740tg.A0E(z2, "Current hash array must be of size 128");
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        for (Object next : list) {
            C18740tg.A06(next);
            ByteBuffer wrap2 = ByteBuffer.wrap(AnonymousClass6R0.A00((byte[]) next, bArr2, 128));
            wrap2.order(ByteOrder.LITTLE_ENDIAN);
            wrap.mark();
            while (wrap.hasRemaining()) {
                int position = wrap.position();
                short s = wrap.getShort() & 65535;
                short s2 = wrap2.getShort() & 65535;
                if (z) {
                    i = s + s2;
                } else {
                    i = s - s2;
                }
                int position2 = wrap.position();
                wrap.position(position);
                wrap.putShort((short) (((short) i) & 65535));
                wrap.position(position2);
            }
            wrap.reset();
        }
        return wrap.array();
    }

    public static void A00(AnonymousClass1IS r9, String str, int i) {
        Cursor A092;
        Cursor A093;
        AnonymousClass1IT r0 = r9.A08;
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A032 = r0.A00.get();
        try {
            A092 = A032.A02.A09("SELECT collection_name, lt_hash FROM collection_versions", "CollectionVersionsTable.GET_ALL_LT_HASHES", (String[]) null);
            while (A092.moveToNext()) {
                String string = A092.getString(A092.getColumnIndexOrThrow("collection_name"));
                byte[] blob = A092.getBlob(A092.getColumnIndexOrThrow("lt_hash"));
                if (blob == null) {
                    blob = new byte[128];
                }
                hashMap.put(string, blob);
            }
            A092.close();
            A032.close();
            AnonymousClass1AC r02 = r9.A09;
            HashMap hashMap2 = new HashMap();
            AnonymousClass1M0 A033 = r02.A00.get();
            try {
                A093 = A033.A02.A09("SELECT collection_name, mutation_mac FROM syncd_mutations", "SyncdMutationsStore.SELECT_COLLECTION_NAME_AND_MUTATION_MAC", (String[]) null);
                int columnIndexOrThrow = A093.getColumnIndexOrThrow("collection_name");
                int columnIndexOrThrow2 = A093.getColumnIndexOrThrow("mutation_mac");
                while (A093.moveToNext()) {
                    String string2 = A093.getString(columnIndexOrThrow);
                    byte[] blob2 = A093.getBlob(columnIndexOrThrow2);
                    List list = (List) hashMap2.get(string2);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap2.put(string2, list);
                    }
                    list.add(blob2);
                }
                A093.close();
                A033.close();
                HashSet hashSet = new HashSet();
                if (str == null) {
                    hashSet.addAll(hashMap.keySet());
                    hashSet.addAll(hashMap2.keySet());
                } else {
                    hashSet.add(str);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    List list2 = (List) hashMap2.get(str2);
                    if (list2 == null) {
                        list2 = Collections.emptyList();
                    }
                    byte[] A034 = A03(list2, new byte[128], A0D, true);
                    byte[] bArr = (byte[]) hashMap.get(str2);
                    if (!Arrays.equals(A034, bArr)) {
                        r9.A0C.A08(i, str2);
                    }
                    A01(r9, A034);
                    A01(r9, bArr);
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A033.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
            throw th;
        } catch (Throwable th3) {
            th = th3;
            A032.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r5 = X.C18750th.A06(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass1IS r6, byte[] r7) {
        /*
            if (r7 == 0) goto L_0x001e
            java.lang.String r5 = X.C18750th.A06(r7)
            int r4 = r5.length()
            r3 = 16
            if (r4 <= r3) goto L_0x001e
            X.0yC r2 = r6.A0A
            r1 = 624(0x270, float:8.74E-43)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 != 0) goto L_0x001e
            int r4 = r4 - r3
            r5.substring(r4)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IS.A01(X.1IS, byte[]):void");
    }

    public static byte[] A02(C608639q r10, AnonymousClass1IS r11, String str, List list, byte[] bArr, String[] strArr) {
        Cursor A092;
        AnonymousClass1AC r2 = r11.A09;
        HashMap hashMap = new HashMap();
        if (strArr.length != 0) {
            AnonymousClass72Z r1 = new AnonymousClass72Z(strArr, 975);
            ArrayList arrayList = new ArrayList();
            AnonymousClass1M0 A032 = r2.A00.get();
            try {
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    String[] strArr2 = (String[]) it.next();
                    arrayList.clear();
                    arrayList.add(str);
                    arrayList.addAll(Arrays.asList(strArr2));
                    C224114e r3 = A032.A02;
                    int length = strArr2.length;
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT mutation_index, mutation_mac FROM syncd_mutations WHERE collection_name = ? AND mutation_index IN ");
                    sb.append(AnonymousClass1M2.A00(length));
                    A092 = r3.A09(sb.toString(), "SyncdMutationsStore.getMutationsMac", (String[]) arrayList.toArray(C19430v1.A0N));
                    int columnIndexOrThrow = A092.getColumnIndexOrThrow("mutation_index");
                    int columnIndexOrThrow2 = A092.getColumnIndexOrThrow("mutation_mac");
                    while (A092.moveToNext()) {
                        String string = A092.getString(columnIndexOrThrow);
                        byte[] blob = A092.getBlob(columnIndexOrThrow2);
                        if (blob != null) {
                            hashMap.put(string, blob);
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("SyncdMutationsStore/getLatestMutationsMac: Should never be null for index:");
                            sb2.append(string);
                            Log.e(sb2.toString());
                        }
                    }
                    A092.close();
                }
                A032.close();
            } catch (Throwable th) {
                try {
                    A032.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        if (C20800yB.A01(C21000yV.A02, r11.A0A, 624)) {
            Arrays.toString(strArr);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList(hashMap.values());
        byte[] bArr2 = A0D;
        byte[] A033 = A03(arrayList2, bArr, bArr2, false);
        byte[] A034 = A03(list, A033, bArr2, true);
        if (r10 != null) {
            r10.A03 = bArr;
            r10.A04 = A033;
            r10.A00 = list.size();
            r10.A02 = hashMap.size() - hashSet.size();
            r10.A01 = hashSet.size();
        }
        return A034;
        throw th;
    }

    public AnonymousClass1IS(C19700wN r1, C19730wQ r2, C21100yf r3, AnonymousClass1AB r4, C237119n r5, AnonymousClass1IW r6, AnonymousClass1A9 r7, C19970wo r8, AnonymousClass1IU r9, AnonymousClass1IT r10, AnonymousClass1AC r11, C20810yC r12, C19770wU r13) {
        this.A06 = r8;
        this.A0A = r12;
        this.A00 = r1;
        this.A01 = r2;
        this.A0B = r13;
        this.A02 = r3;
        this.A05 = r7;
        this.A0C = r4;
        this.A09 = r11;
        this.A08 = r10;
        this.A07 = r9;
        this.A03 = r5;
        this.A04 = r6;
    }
}
