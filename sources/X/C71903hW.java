package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3hW  reason: invalid class name and case insensitive filesystem */
public final class C71903hW implements AnonymousClass191, C30631aW {
    public Handler A00 = new AnonymousClass4VT(Looper.getMainLooper(), this, 2);
    public final AnonymousClass17Y A01;
    public final AnonymousClass1XZ A02;
    public final C19970wo A03;
    public final AnonymousClass16J A04;
    public final C20810yC A05;
    public final C19770wU A06;
    public final Map A07 = new ConcurrentHashMap();
    public final AnonymousClass1HX A08;
    public final AnonymousClass1A1 A09;

    public static final void A00(C71903hW r10, AnonymousClass3T1 r11) {
        AnonymousClass3T1 r7 = r11;
        if (!r11.A1J.A02 && C63903Lw.A00(r11)) {
            C63483Kf A0M = r11.A0M();
            C71903hW r9 = r10;
            if (A0M != null) {
                C51962of[] r2 = {C51962of.LAST, C51962of.FULL, C51962of.TIMED_OUT};
                AnonymousClass00C.A0D(r2, 0);
                if (!AnonymousClass02R.A0E(r2).contains(A0M.A01)) {
                    long j = r11.A0I;
                    AnonymousClass37F A0X = r11.A0X();
                    if (A0X != null) {
                        j = A0X.A00;
                    }
                    long A0B = C36441kJ.A0B(r10.A05, 4736) - (C19970wo.A00(r10.A03) - j);
                    if (A0B > 0) {
                        Map map = r10.A07;
                        C64933Qa A0B2 = C66013Ui.A0B(r11);
                        AnonymousClass00C.A08(A0B2);
                        map.put(A0B2, r11);
                        Handler handler = r10.A00;
                        handler.sendMessageDelayed(Message.obtain(handler, 0, r11), A0B);
                        return;
                    }
                    C10810fG r102 = new C10810fG();
                    Map map2 = r9.A07;
                    C64933Qa A0B3 = C66013Ui.A0B(r11);
                    AnonymousClass00C.A08(A0B3);
                    Object remove = map2.remove(A0B3);
                    r102.element = remove;
                    if (remove == null) {
                        r102.element = r11;
                    }
                    C63483Kf A0M2 = r11.A0M();
                    if (A0M2 != null) {
                        r9.A06.Boy(new C1503474x((Object) r7, (Object) A0M2, (Object) r9, (Object) r102, 15));
                        return;
                    }
                    return;
                }
            }
            Map map3 = r10.A07;
            C64933Qa A0B4 = C66013Ui.A0B(r11);
            AnonymousClass00C.A08(A0B4);
            map3.remove(A0B4);
        }
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BV2() {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r2, int i) {
        AnonymousClass00C.A0D(r2, 0);
        A00(this, r2);
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bay(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bb4(Collection collection, int i) {
        C54122sR.A00(this, collection, i);
    }

    public /* synthetic */ void Bb5(AnonymousClass11F r1) {
    }

    public /* synthetic */ void Bb6(Collection collection, Map map) {
    }

    public /* synthetic */ void Bb7(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb8(AnonymousClass11F r1, Collection collection, boolean z) {
    }

    public /* synthetic */ void Bb9(Collection collection) {
    }

    public /* synthetic */ void Bbc(C28981Uw r1) {
    }

    public /* synthetic */ void Bbd(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bbe(C28981Uw r1, boolean z) {
    }

    public /* synthetic */ void Bbf(C28981Uw r1) {
    }

    public /* synthetic */ void Bbr() {
    }

    public /* synthetic */ void Bci(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ void Bck(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV3() {
        /*
            r7 = this;
            X.1XZ r4 = r7.A02
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            X.12P r0 = r4.A00
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0053 }
            java.lang.String r2 = "SELECT message_row_id FROM bot_message_info"
            java.lang.String r1 = "SQL_GET_ALL_ROW_IDS"
            r0 = 0
            android.database.Cursor r2 = r5.A09(r2, r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x0017:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x004c }
            if (r0 == 0) goto L_0x0027
            r0 = 0
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x004c }
            long r0 = (long) r0     // Catch:{ all -> 0x004c }
            X.C36391kE.A1W(r6, r0)     // Catch:{ all -> 0x004c }
            goto L_0x0017
        L_0x0027:
            r2.close()     // Catch:{ all -> 0x0053 }
            r3.close()
            java.util.Iterator r3 = r6.iterator()
        L_0x0031:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004b
            long r1 = X.C36391kE.A0D(r3)
            X.1A1 r0 = r7.A09
            X.3T1 r0 = X.C36421kH.A0R(r0, r1)
            if (r0 == 0) goto L_0x0047
            A00(r7, r0)
            goto L_0x0031
        L_0x0047:
            r4.A01(r1)
            goto L_0x0031
        L_0x004b:
            return
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71903hW.BV3():void");
    }

    public C71903hW(AnonymousClass17Y r4, AnonymousClass1HX r5, AnonymousClass1XZ r6, C19970wo r7, AnonymousClass16J r8, C20810yC r9, AnonymousClass1A1 r10, C19770wU r11) {
        C36321k7.A1B(r7, r9, r4, r11, r5);
        C36321k7.A13(r8, r10, r6);
        this.A03 = r7;
        this.A05 = r9;
        this.A01 = r4;
        this.A06 = r11;
        this.A08 = r5;
        this.A04 = r8;
        this.A09 = r10;
        this.A02 = r6;
    }

    public void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
        C36321k7.A0w(r1, r2);
        A00(this, r2);
    }
}
