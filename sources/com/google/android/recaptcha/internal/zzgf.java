package com.google.android.recaptcha.internal;

import X.AnonymousClass000;
import X.C90524aI;
import java.io.IOException;
import java.util.Comparator;

public abstract class zzgf implements zzke {
    public int zza = 0;

    public abstract int zza(zzkr zzkr);

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzc(java.lang.Iterable r6, java.util.List r7) {
        /*
            java.nio.charset.Charset r0 = com.google.android.recaptcha.internal.zzjc.zza
            java.util.Objects.requireNonNull(r6)
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzjm
            java.lang.String r3 = " is null."
            java.lang.String r4 = "Element at index "
            if (r0 == 0) goto L_0x0055
            com.google.android.recaptcha.internal.zzjm r6 = (com.google.android.recaptcha.internal.zzjm) r6
            java.util.List r0 = r6.zzh()
            r6 = r7
            com.google.android.recaptcha.internal.zzjm r6 = (com.google.android.recaptcha.internal.zzjm) r6
            int r5 = r7.size()
            java.util.Iterator r2 = r0.iterator()
        L_0x001e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r1 = r2.next()
            if (r1 != 0) goto L_0x0042
            int r0 = X.C36421kH.A06(r6, r5)
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r4)
            java.lang.String r1 = X.AnonymousClass000.A0q(r3, r0)
            int r0 = r6.size()
        L_0x003a:
            int r0 = r0 + -1
            if (r0 < r5) goto L_0x0050
            r6.remove(r0)
            goto L_0x003a
        L_0x0042:
            boolean r0 = r1 instanceof com.google.android.recaptcha.internal.zzgw
            if (r0 == 0) goto L_0x004c
            com.google.android.recaptcha.internal.zzgw r1 = (com.google.android.recaptcha.internal.zzgw) r1
            r6.zzi(r1)
            goto L_0x001e
        L_0x004c:
            r6.add(r1)
            goto L_0x001e
        L_0x0050:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r1)
            throw r0
        L_0x0055:
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzkm
            if (r0 != 0) goto L_0x00a2
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x006c
            r2 = r7
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r1 = r7.size()
            int r0 = r6.size()
            int r1 = r1 + r0
            r2.ensureCapacity(r1)
        L_0x006c:
            int r2 = r7.size()
            java.util.Iterator r1 = r6.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r1.next()
            if (r0 != 0) goto L_0x0098
            int r0 = X.C36421kH.A06(r7, r2)
            java.lang.StringBuilder r0 = X.C90464aC.A0h(r0, r4)
            java.lang.String r1 = X.AnonymousClass000.A0q(r3, r0)
            int r0 = r7.size()
        L_0x0090:
            int r0 = r0 + -1
            if (r0 < r2) goto L_0x009c
            r7.remove(r0)
            goto L_0x0090
        L_0x0098:
            r7.add(r0)
            goto L_0x0074
        L_0x009c:
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r1)
            throw r0
        L_0x00a1:
            return
        L_0x00a2:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzgf.zzc(java.lang.Iterable, java.util.List):void");
    }

    public final zzgw zzb() {
        try {
            int zzn = zzn();
            Comparator comparator = zzgw.zza;
            byte[] bArr = new byte[zzn];
            zzhe zzhe = new zzhe(bArr, 0, zzn);
            zze(zzhe);
            zzhe.zzB();
            return new zzgt(bArr);
        } catch (IOException e) {
            String A0k = AnonymousClass000.A0k(this);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Serializing ");
            A0u.append(A0k);
            throw C90524aI.A0e(AnonymousClass000.A0q(" to a ByteString threw an IOException (should never happen).", A0u), e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzn = zzn();
            byte[] bArr = new byte[zzn];
            zzhe zzhe = new zzhe(bArr, 0, zzn);
            zze(zzhe);
            zzhe.zzB();
            return bArr;
        } catch (IOException e) {
            String A0k = AnonymousClass000.A0k(this);
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Serializing ");
            A0u.append(A0k);
            throw C90524aI.A0e(AnonymousClass000.A0q(" to a byte array threw an IOException (should never happen).", A0u), e);
        }
    }
}
