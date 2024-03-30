package X;

import com.whatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.2iN  reason: invalid class name and case insensitive filesystem */
public final class C48982iN extends C132446Tt {
    public final AnonymousClass16D A00;
    public final PhoneContactsSelector A01;
    public final List A02;
    public final List A03;

    public C48982iN(AnonymousClass16D r2, PhoneContactsSelector phoneContactsSelector, List list, List list2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
        this.A01 = phoneContactsSelector;
        this.A03 = list;
        this.A02 = list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r4 == null) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.16D r0 = r10.A00
            X.16p r0 = r0.A05
            X.14g r7 = X.C36361kB.A0g()
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.16r r0 = r0.A00
            X.1M0 r5 = r0.get()
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00b1 }
            java.lang.String r2 = X.AnonymousClass2x7.A0B     // Catch:{ all -> 0x00b1 }
            r1 = 0
            java.lang.String r0 = "LID_CONTACTS"
            android.database.Cursor r4 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x00b1 }
            r3 = 0
        L_0x001e:
            boolean r0 = r4.moveToNext()     // Catch:{ IllegalStateException -> 0x002e }
            if (r0 == 0) goto L_0x003a
            int r3 = r3 + 1
            X.141 r0 = X.C53712rl.A00(r4)     // Catch:{ IllegalStateException -> 0x002e }
            r6.add(r0)     // Catch:{ IllegalStateException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r2 = move-exception
            java.lang.String r1 = "contactmanagerdb/getLidContactsList/"
            int r0 = r6.size()     // Catch:{ all -> 0x00a5 }
            X.C229516p.A0L(r2, r1, r3, r0)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x003d
        L_0x003a:
            r4.close()     // Catch:{ all -> 0x00b1 }
        L_0x003d:
            r5.close()
            r6.size()
            r7.A00()
            java.util.ArrayList r9 = X.C36321k7.A0J(r6)
            java.util.Iterator r5 = r6.iterator()
        L_0x004e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x006b
            X.141 r0 = X.C36391kE.A0f(r5)
            java.lang.String r4 = r0.A0J()
            long r2 = r0.A0I()
            java.lang.String r1 = r0.A0R
            X.3Gs r0 = new X.3Gs
            r0.<init>(r4, r2, r1)
            r9.add(r0)
            goto L_0x004e
        L_0x006b:
            java.util.List r0 = r10.A02
            r0.addAll(r9)
            java.util.List r0 = r10.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x0076:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r7 = r8.next()
            X.3Gs r7 = (X.C62583Gs) r7
            java.util.Iterator r6 = r9.iterator()
        L_0x0086:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0076
            java.lang.Object r5 = r6.next()
            X.3Gs r5 = (X.C62583Gs) r5
            long r3 = r5.A04
            long r1 = r7.A04
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0086
            r0 = 1
            r5.A03 = r0
            goto L_0x0086
        L_0x009e:
            com.whatsapp.contact.picker.PhoneContactsSelector r0 = r10.A01
            r0.A3j()
            r0 = 0
            return r0
        L_0x00a5:
            r1 = move-exception
            if (r4 == 0) goto L_0x00b0
            r4.close()     // Catch:{ all -> 0x00ac }
            goto L_0x00b0
        L_0x00ac:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00b6 }
            throw r1
        L_0x00b6:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48982iN.A08(java.lang.Object[]):java.lang.Object");
    }
}
