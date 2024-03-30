package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3Ty  reason: invalid class name and case insensitive filesystem */
public final class C65913Ty {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass16D A02;
    public final C19420v0 A03;
    public final C220412q A04;
    public final C20310xM A05;
    public final C232617u A06;
    public final AnonymousClass17X A07;
    public final AnonymousClass12O A08;
    public final C20810yC A09;
    public final C20350xQ A0A;
    public final C20370xS A0B;
    public final C19970wo A0C;
    public final AnonymousClass12P A0D;
    public final C238019x A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C65913Ty r5, X.C177538dx r6, java.util.Collection r7, java.util.List r8, X.AnonymousClass00S r9) {
        /*
            X.12P r0 = r5.A0D
            X.1M0 r2 = r0.A05()
            X.71s r4 = r2.B1k()     // Catch:{ all -> 0x003a }
            X.0xQ r3 = r5.A0A     // Catch:{ all -> 0x0033 }
            r1 = 0
            X.AnonymousClass00C.A0D(r8, r1)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r0 = X.C36441kJ.A15(r8)     // Catch:{ all -> 0x0033 }
            r3.A0a(r6, r0)     // Catch:{ all -> 0x0033 }
            X.AnonymousClass00C.A0D(r7, r1)     // Catch:{ all -> 0x0033 }
            java.util.ArrayList r0 = X.C36441kJ.A15(r7)     // Catch:{ all -> 0x0033 }
            r3.A0Z(r6, r0)     // Catch:{ all -> 0x0033 }
            r0 = 41
            X.3v5 r0 = X.C80243v5.A00(r9, r0)     // Catch:{ all -> 0x0033 }
            r2.B5o(r0)     // Catch:{ all -> 0x0033 }
            r4.A00()     // Catch:{ all -> 0x0033 }
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0033 }
            r4.close()     // Catch:{ all -> 0x003a }
            goto L_0x0040
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x003a }
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.03N r1 = new X.03N     // Catch:{ all -> 0x0053 }
            r1.<init>(r0)     // Catch:{ all -> 0x0053 }
        L_0x0040:
            java.lang.Throwable r0 = X.AnonymousClass0AK.A00(r1)     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0053 }
            java.lang.String r0 = "BroadcastListManager/replaceParticipants failed to replace participants for "
            X.C36321k7.A1J(r6, r0, r1)     // Catch:{ all -> 0x0053 }
        L_0x004f:
            r2.close()
            return
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65913Ty.A03(X.3Ty, X.8dx, java.util.Collection, java.util.List, X.00S):void");
    }

    public static final boolean A04(List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass143.A0I((Jid) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C65913Ty(C19700wN r1, C19730wQ r2, AnonymousClass16D r3, C19970wo r4, C19420v0 r5, C220412q r6, C20310xM r7, C232617u r8, AnonymousClass17X r9, AnonymousClass12P r10, AnonymousClass12O r11, C20810yC r12, C20350xQ r13, C20370xS r14, C238019x r15) {
        C36321k7.A1B(r4, r12, r1, r2, r6);
        C36321k7.A1C(r3, r11, r13, r10, r5);
        C36321k7.A15(r7, r15, r14);
        C36361kB.A1L(r8, r9);
        this.A0C = r4;
        this.A09 = r12;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r6;
        this.A02 = r3;
        this.A08 = r11;
        this.A0A = r13;
        this.A0D = r10;
        this.A03 = r5;
        this.A05 = r7;
        this.A0E = r15;
        this.A0B = r14;
        this.A06 = r8;
        this.A07 = r9;
    }

    public static final C181758nz A00(C65913Ty r8, C177538dx r9, List list) {
        ArrayList arrayList;
        AnonymousClass11F A0e;
        if (!A04(list) || !r8.A09.A0E(4509)) {
            arrayList = AnonymousClass001.A0I();
            for (Object next : list) {
                if (!(next instanceof C223313w)) {
                    arrayList.add(next);
                }
            }
        } else {
            ArrayList A0I = AnonymousClass001.A0I();
            for (Object next2 : list) {
                if (next2 instanceof PhoneUserJid) {
                    A0I.add(next2);
                }
            }
            LinkedHashMap A0E2 = r8.A08.A0E(A0I);
            arrayList = AnonymousClass001.A0I();
            for (Object next3 : list) {
                if (next3 instanceof PhoneUserJid) {
                    next3 = A0E2.get(next3);
                }
                if (next3 != null) {
                    arrayList.add(next3);
                }
            }
        }
        if (list.size() != arrayList.size()) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("BroadcastListManager/filterParticipants ");
            A0u.append(r9);
            A0u.append("; input=");
            A0u.append(list);
            Log.w(AnonymousClass000.A0t(A0u, ';'));
            C19700wN r3 = r8.A00;
            StringBuilder A11 = C36381kD.A11(r9);
            C36371kC.A1R("; input=", A11, list);
            C36341k9.A1N("; output=", A11, arrayList);
            r3.A0E("lid-broadcast-filtered-participants", A11.toString(), false);
        }
        r8.A0A.A0Y(r9, arrayList, false, A04(arrayList));
        boolean A042 = A04(arrayList);
        C19730wQ r0 = r8.A01;
        if (A042) {
            A0e = r0.A09();
        } else {
            A0e = C36371kC.A0e(r0);
        }
        AnonymousClass00C.A0B(A0e);
        C238019x r1 = r8.A0E;
        C181758nz r02 = new C181758nz(C36411kG.A0o(r9, r1.A01), 9, C19970wo.A00(r8.A0C));
        r02.A16((String) null);
        r02.A01 = arrayList;
        r02.A0q(A0e);
        return r02;
    }

    public static final ArrayList A01(C65913Ty r4, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (next instanceof PhoneUserJid) {
                A0I.add(next);
            }
        }
        LinkedHashMap A0E2 = r4.A08.A0E(A0I);
        ArrayList A0I2 = AnonymousClass001.A0I();
        for (Object next2 : list) {
            if (next2 instanceof PhoneUserJid) {
                next2 = A0E2.get(next2);
            } else if (!(next2 instanceof C223313w)) {
            }
            if (next2 != null) {
                A0I2.add(next2);
            }
        }
        return A0I2;
    }

    public static final List A02(List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (AnonymousClass143.A0J((Jid) next)) {
                A0I.add(next);
            }
        }
        ArrayList A0J = C36321k7.A0J(A0I);
        for (Object next2 : A0I) {
            AnonymousClass00C.A0E(next2, "null cannot be cast to non-null type com.whatsapp.jid.PhoneUserJid");
            A0J.add(next2);
        }
        return A0J;
    }
}
