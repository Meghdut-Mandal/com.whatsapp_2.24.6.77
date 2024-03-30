package X;

import android.os.SystemClock;
import com.whatsapp.gallerypicker.GalleryPickerFragment;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2k6  reason: invalid class name and case insensitive filesystem */
public final class C50042k6 extends C132446Tt {
    public final int A00;
    public final int A01;
    public final C235718z A02;
    public final C21060yb A03;
    public final C19970wo A04;
    public final C19630wG A05;
    public final C18820ts A06;
    public final C20810yC A07;
    public final AnonymousClass6N7 A08;
    public final AnonymousClass1A2 A09;
    public final WeakReference A0A;

    public static long A00(C50042k6 r3, AbstractCollection abstractCollection) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        abstractCollection.clear();
        r3.A0F(arrayList);
        return SystemClock.uptimeMillis();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 214 */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02bd, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        if (r6.intValue() == r7.getCount()) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x023d, code lost:
        if (r6.A06.A0Q(r10) == false) goto L_0x023f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r31) {
        /*
            r30 = this;
            r0 = r30
            int r5 = r0.A00
            X.0wo r3 = r0.A04
            r2 = 0
            r13 = 0
            r1 = 3
            X.AnonymousClass00C.A0D(r3, r1)
            long r18 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r3 = X.AnonymousClass001.A0I()
            int r4 = r0.A01
            r1 = 7
            if (r4 != r1) goto L_0x00bc
            X.38L[] r11 = X.C64143Mu.A01
        L_0x001b:
            java.util.HashMap r10 = X.AnonymousClass001.A0J()
            int r12 = r11.length
            r1 = 0
            r9 = 0
        L_0x0022:
            if (r9 >= r12) goto L_0x00c0
            r15 = r11[r9]
            boolean r6 = X.C36431kI.A1Y(r0)
            if (r6 != 0) goto L_0x00c0
            int r14 = r15.A00
            r7 = r14 & r4
            if (r7 == 0) goto L_0x008b
            java.lang.String r8 = r15.A03
            X.6N7 r6 = r0.A08
            X.4Uo r7 = X.C36431kI.A0c(r6, r8, r7, r1)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x00b8
            java.lang.String r6 = X.C64143Mu.A00()
            boolean r6 = X.AnonymousClass00C.A0J(r6, r8)
            if (r6 == 0) goto L_0x00a2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r6 = r7.getCount()
            X.C36341k9.A1K(r14, r10, r6)
        L_0x0055:
            int r14 = r15.A02
            X.0wG r6 = r0.A05
            android.content.Context r6 = r6.A00
            int r15 = r15.A01
            java.lang.String r23 = X.C36361kB.A0m(r6, r15)
            X.4V2 r21 = r7.BDy(r1)
            int r26 = r7.getCount()
            X.3Gv r6 = new X.3Gv
            r27 = 0
            r20 = r6
            r22 = r8
            r24 = r14
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r7.close()
            if (r2 >= r5) goto L_0x008e
            java.util.List r7 = X.C36371kC.A11(r6)
            r6 = 1
            java.util.List[] r6 = new java.util.List[r6]
            r6[r1] = r7
            r0.A0F(r6)
        L_0x0089:
            int r2 = r2 + 1
        L_0x008b:
            int r9 = r9 + 1
            goto L_0x0022
        L_0x008e:
            r3.add(r6)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r14 = r18 + r6
            long r7 = android.os.SystemClock.uptimeMillis()
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x0089
            long r18 = A00(r0, r3)
            goto L_0x0089
        L_0x00a2:
            if (r8 != 0) goto L_0x0055
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Number r6 = X.C36441kJ.A10(r6, r10)
            if (r6 == 0) goto L_0x0055
            int r14 = r7.getCount()
            int r6 = r6.intValue()
            if (r6 != r14) goto L_0x0055
        L_0x00b8:
            r7.close()
            goto L_0x008b
        L_0x00bc:
            X.38L[] r11 = X.C64143Mu.A00
            goto L_0x001b
        L_0x00c0:
            X.4c6 r11 = r0.A02
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x02c1
            boolean r6 = X.C19550w8.A07()
            if (r6 == 0) goto L_0x0110
            X.6N7 r7 = r0.A08
            r6 = 7
            r8 = 1
            X.4Uo r7 = X.C36431kI.A0c(r7, r13, r6, r8)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x010d
            X.0wG r6 = r0.A05
            android.content.Context r9 = r6.A00
            r6 = 2131886464(0x7f120180, float:1.9407508E38)
            java.lang.String r23 = X.C36361kB.A0m(r9, r6)
            X.4V2 r21 = r7.BDy(r1)
            int r26 = r7.getCount()
            r24 = 3
            X.3Gv r6 = new X.3Gv
            r25 = 7
            r27 = 1
            r20 = r6
            r22 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            if (r2 >= r5) goto L_0x01f8
            java.util.List r9 = X.C36371kC.A11(r6)
            java.util.List[] r6 = new java.util.List[r8]
            r6[r1] = r9
            r0.A0F(r6)
        L_0x010b:
            int r2 = r2 + 1
        L_0x010d:
            r7.close()
        L_0x0110:
            X.6N7 r10 = r0.A08
            X.4Uo r12 = X.C36431kI.A0c(r10, r13, r4, r1)
            boolean r6 = r11.isCancelled()
            if (r6 == 0) goto L_0x0155
            r12.close()
        L_0x011f:
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x02c1
            X.0yb r9 = r0.A03
            X.0ya r20 = r9.A0O()
            if (r20 == 0) goto L_0x02a1
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()
            java.lang.String r6 = "content://"
            r7.append(r6)
            java.lang.String r6 = "com.whatsapp"
            r7.append(r6)
            java.lang.String r6 = ".provider.media/buckets"
            java.lang.String r6 = X.AnonymousClass000.A0q(r6, r7)
            android.net.Uri r21 = android.net.Uri.parse(r6)
            r23 = r13
            r24 = r13
            r25 = r13
            r22 = r13
            android.database.Cursor r8 = r20.A03(r21, r22, r23, r24, r25)
            if (r8 == 0) goto L_0x02a2
            goto L_0x0210
        L_0x0155:
            java.util.HashMap r6 = r12.B90()
            java.util.Set r6 = r6.entrySet()
            java.util.ArrayList r9 = X.C36441kJ.A15(r6)
            X.0ts r6 = r0.A06
            java.text.Collator r7 = X.C36361kB.A0p(r6)
            r6 = 1
            r7.setDecomposition(r6)
            X.4NR r8 = new X.4NR
            r8.<init>(r7)
            r7 = 9
            X.4YZ r6 = new X.4YZ
            r6.<init>(r8, r7)
            X.AnonymousClass03X.A08(r9, r6)
            r12.close()
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x011f
            java.util.Iterator r12 = r9.iterator()
        L_0x0187:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto L_0x011f
            java.util.Map$Entry r6 = X.AnonymousClass000.A11(r12)
            java.lang.Object r9 = r6.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r6.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r6 = r11.isCancelled()
            if (r6 != 0) goto L_0x011f
            java.lang.String r6 = X.C64143Mu.A00()
            boolean r6 = X.AnonymousClass00C.A0J(r9, r6)
            if (r6 != 0) goto L_0x0187
            X.4Uo r7 = X.C36431kI.A0c(r10, r9, r4, r1)
            boolean r6 = r7.isEmpty()
            if (r6 != 0) goto L_0x01e0
            X.4V2 r21 = r7.BDy(r1)
            int r26 = r7.getCount()
            r24 = 8
            X.3Gv r6 = new X.3Gv
            r27 = 0
            r20 = r6
            r22 = r9
            r23 = r8
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            if (r2 >= r5) goto L_0x01e4
            java.util.List r8 = X.C36371kC.A11(r6)
            r6 = 1
            java.util.List[] r6 = new java.util.List[r6]
            r6[r1] = r8
            r0.A0F(r6)
        L_0x01de:
            int r2 = r2 + 1
        L_0x01e0:
            r7.close()
            goto L_0x0187
        L_0x01e4:
            r3.add(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r14 = r18 + r8
            long r8 = android.os.SystemClock.uptimeMillis()
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x01de
            long r18 = A00(r0, r3)
            goto L_0x01de
        L_0x01f8:
            r3.add(r6)
            r8 = 1000(0x3e8, double:4.94E-321)
            long r14 = r18 + r8
            long r8 = android.os.SystemClock.uptimeMillis()
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x010b
            long r18 = A00(r0, r3)
            goto L_0x010b
        L_0x020d:
            r7.close()     // Catch:{ all -> 0x02ba }
        L_0x0210:
            boolean r6 = r8.moveToNext()     // Catch:{ all -> 0x02ba }
            if (r6 == 0) goto L_0x02a8
            X.13o r7 = com.whatsapp.jid.Jid.Companion     // Catch:{ all -> 0x02ba }
            java.lang.String r6 = r8.getString(r1)     // Catch:{ all -> 0x02ba }
            com.whatsapp.jid.Jid r7 = r7.A02(r6)     // Catch:{ all -> 0x02ba }
            r6 = 1
            java.lang.String r23 = r8.getString(r6)     // Catch:{ all -> 0x02ba }
            boolean r6 = r11.isCancelled()     // Catch:{ all -> 0x02ba }
            if (r6 != 0) goto L_0x02a8
            boolean r6 = r7 instanceof X.AnonymousClass11F     // Catch:{ all -> 0x02ba }
            if (r6 == 0) goto L_0x023f
            X.18z r6 = r0.A02     // Catch:{ all -> 0x02ba }
            r10 = r7
            X.11F r10 = (X.AnonymousClass11F) r10     // Catch:{ all -> 0x02ba }
            X.AnonymousClass00C.A0D(r10, r1)     // Catch:{ all -> 0x02ba }
            X.12q r6 = r6.A06     // Catch:{ all -> 0x02ba }
            boolean r6 = r6.A0Q(r10)     // Catch:{ all -> 0x02ba }
            if (r6 != 0) goto L_0x0210
        L_0x023f:
            java.lang.String r22 = X.AnonymousClass143.A03(r7)     // Catch:{ all -> 0x02ba }
            X.0yC r10 = r0.A07     // Catch:{ all -> 0x02ba }
            X.1A2 r6 = r0.A09     // Catch:{ all -> 0x02ba }
            X.2UH r7 = new X.2UH     // Catch:{ all -> 0x02ba }
            r24 = r7
            r25 = r9
            r26 = r10
            r27 = r6
            r28 = r22
            r29 = r4
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x02ba }
            int r6 = r7.getCount()     // Catch:{ all -> 0x02ba }
            boolean r6 = X.AnonymousClass000.A1Q(r6)     // Catch:{ all -> 0x02ba }
            if (r6 != 0) goto L_0x020d
            if (r23 != 0) goto L_0x0266
            java.lang.String r23 = ""
        L_0x0266:
            X.4V2 r21 = r7.BDy(r1)     // Catch:{ all -> 0x02ba }
            int r26 = r7.getCount()     // Catch:{ all -> 0x02ba }
            r24 = 9
            X.3Gv r6 = new X.3Gv     // Catch:{ all -> 0x02ba }
            r27 = 0
            r20 = r6
            r25 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x02ba }
            if (r2 >= r5) goto L_0x028a
            java.util.List r10 = X.C36371kC.A11(r6)     // Catch:{ all -> 0x02ba }
            r6 = 1
            java.util.List[] r6 = new java.util.List[r6]     // Catch:{ all -> 0x02ba }
            r6[r1] = r10     // Catch:{ all -> 0x02ba }
            r0.A0F(r6)     // Catch:{ all -> 0x02ba }
            goto L_0x029d
        L_0x028a:
            r3.add(r6)     // Catch:{ all -> 0x02ba }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r16 = r18 + r14
            long r14 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x02ba }
            int r6 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r6 >= 0) goto L_0x029d
            long r18 = A00(r0, r3)     // Catch:{ all -> 0x02ba }
        L_0x029d:
            int r2 = r2 + 1
            goto L_0x020d
        L_0x02a1:
            r8 = r13
        L_0x02a2:
            java.lang.String r2 = "GalleryPicker/cursor/null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x02ba }
            goto L_0x02ab
        L_0x02a8:
            r8.close()
        L_0x02ab:
            boolean r2 = r11.isCancelled()
            if (r2 != 0) goto L_0x02c1
            r2 = 1
            java.util.List[] r2 = new java.util.List[r2]
            r2[r1] = r3
            r0.A0F(r2)
            return r13
        L_0x02ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02bc }
        L_0x02bc:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)
            throw r0
        L_0x02c1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50042k6.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0E(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        AnonymousClass00C.A0D(listArr, 0);
        GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) this.A0A.get();
        if (galleryPickerFragment != null) {
            for (List A052 : listArr) {
                GalleryPickerFragment.A05(galleryPickerFragment, A052);
            }
        }
    }

    public C50042k6(C235718z r2, C21060yb r3, C19970wo r4, C19630wG r5, C18820ts r6, C20810yC r7, GalleryPickerFragment galleryPickerFragment, AnonymousClass6N7 r9, AnonymousClass1A2 r10, int i, int i2) {
        this.A04 = r4;
        this.A07 = r7;
        this.A05 = r5;
        this.A08 = r9;
        this.A06 = r6;
        this.A03 = r3;
        this.A02 = r2;
        this.A09 = r10;
        this.A01 = i;
        this.A00 = i2;
        this.A0A = AnonymousClass001.A0F(galleryPickerFragment);
    }
}
