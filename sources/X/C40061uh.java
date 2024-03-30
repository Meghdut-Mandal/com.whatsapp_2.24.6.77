package X;

import android.content.Intent;
import android.database.Cursor;
import android.os.Handler;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1uh  reason: invalid class name and case insensitive filesystem */
public class C40061uh extends AnonymousClass04R {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03 = 8;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08 = -1;
    public long A09 = Long.MIN_VALUE;
    public long A0A = 1;
    public long A0B = Long.MIN_VALUE;
    public C600336f A0C = null;
    public AnonymousClass1JN A0D;
    public AnonymousClass3T1 A0E = null;
    public AnonymousClass3T1 A0F;
    public String A0G;
    public String A0H;
    public ArrayList A0I;
    public boolean A0J;
    public boolean A0K = false;
    public boolean A0L = true;
    public AnonymousClass3T1 A0M;
    public Set A0N;
    public final long A0O;
    public final Intent A0P;
    public final Handler A0Q = C36341k9.A0H();
    public final C001700s A0R;
    public final C001700s A0S;
    public final C001700s A0T;
    public final C001700s A0U = C36431kI.A0S();
    public final C001700s A0V = C36441kJ.A0t();
    public final C001700s A0W = C36441kJ.A0t();
    public final C001700s A0X;
    public final C001700s A0Y;
    public final C19460v5 A0Z;
    public final C19730wQ A0a;
    public final C25791Hr A0b;
    public final AnonymousClass319 A0c;
    public final AnonymousClass1YX A0d;
    public final MessageSelectionViewModel A0e;
    public final C62113Ev A0f;
    public final C19970wo A0g;
    public final C18820ts A0h;
    public final C24901Ef A0i;
    public final C220412q A0j;
    public final C20310xM A0k;
    public final AnonymousClass1A4 A0l;
    public final AnonymousClass1QH A0m;
    public final AnonymousClass17T A0n;
    public final AnonymousClass17U A0o;
    public final AnonymousClass141 A0p;
    public final C26311Jr A0q;
    public final C235518x A0r;
    public final C20810yC A0s;
    public final AnonymousClass11F A0t;
    public final AnonymousClass1SL A0u;
    public final C237919w A0v;
    public final AnonymousClass1A1 A0w;
    public final AnonymousClass1GX A0x;
    public final C28201Rs A0y = C36441kJ.A0t();
    public final C28201Rs A0z = C36441kJ.A0t();
    public final C28201Rs A10 = C36441kJ.A0t();
    public final C28201Rs A11 = C36441kJ.A0t();
    public final C28201Rs A12 = C36441kJ.A0t();
    public final C28201Rs A13 = new C28201Rs(Collections.emptyList());
    public final C28201Rs A14 = C36441kJ.A0t();
    public final C28201Rs A15 = C36441kJ.A0t();
    public final C28201Rs A16;
    public final C28201Rs A17 = C36441kJ.A0t();
    public final C28201Rs A18 = C36441kJ.A0t();
    public final C19770wU A19;
    public final C88974Ut A1A;
    public final C62683Hc A1B;
    public final AnonymousClass005 A1C;
    public final ArrayList A1D = AnonymousClass001.A0I();
    public final List A1E = AnonymousClass001.A0I();
    public final Map A1F = AnonymousClass001.A0J();
    public final C006302t A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final AnonymousClass08M A1J;
    public final AnonymousClass191 A1K;
    public final AnonymousClass16J A1L;
    public final Set A1M = C36441kJ.A16();

    public static int A01(C40061uh r2) {
        int i;
        synchronized (r2) {
            i = r2.A02;
        }
        return i + r2.A1E.size() + (AnonymousClass000.A1R(r2.A07) ? 1 : 0);
    }

    public static void A09(C40061uh r2) {
        r2.A07 = 0;
        r2.A05 = 0;
        r2.A06 = 0;
        r2.A09 = Long.MIN_VALUE;
    }

    public synchronized void A0Y(C600336f r4) {
        int i;
        this.A0C = r4;
        Cursor cursor = r4.A00;
        if (cursor == null || cursor.isClosed() || !cursor.moveToFirst()) {
            this.A0E = null;
            i = 0;
        } else {
            this.A0E = this.A0w.A01(cursor, this.A0t);
            i = cursor.getCount();
        }
        this.A02 = i;
        A0A(this);
    }

    public static int A02(C40061uh r4) {
        int i = r4.A07;
        int i2 = r4.A00;
        int i3 = i2 - 10;
        StringBuilder A0u2 = AnonymousClass000.A0u();
        if (i > i3) {
            A0u2.append("conversation/page size (from unseen):");
            C36321k7.A1Y(A0u2, i + 10);
            return r4.A07 + 10;
        }
        C36321k7.A1T("conversation/page size:", A0u2, i2);
        return r4.A00;
    }

    public static C600336f A03(C40061uh r9, int i, long j) {
        C20310xM r2 = r9.A0k;
        AnonymousClass11F r3 = r9.A0t;
        C600336f A0S2 = r2.A0S(r3, i, r9.A0A, j);
        if (r3 instanceof C28981Uw) {
            r9.A0u.A05((C28981Uw) r3, (C22949Az1) null, (Long) null, i);
        }
        Cursor cursor = A0S2.A00;
        if (cursor != null) {
            cursor.getCount();
        }
        return A0S2;
    }

    public static void A06(C40061uh r3) {
        r3.A19.Bp1(new C81113wU((Object) r3, 0));
    }

    public static void A07(C40061uh r5) {
        r5.A18.A0D(new AnonymousClass3GJ(r5.A05, r5.A06, r5.A07));
    }

    public static void A08(C40061uh r4) {
        int i;
        String format;
        ArrayList arrayList = r4.A1D;
        if (arrayList.isEmpty()) {
            i = 8;
            format = null;
        } else {
            i = 0;
            format = r4.A0h.A0M().format((long) arrayList.size());
        }
        r4.A0U.A0C(new C62343Fu(i, format));
    }

    public static void A0A(C40061uh r2) {
        AnonymousClass3R7.A01(r2.A0T, r2.A0S());
    }

    public static void A0B(C40061uh r4, long j) {
        AnonymousClass11F r2 = r4.A0t;
        if (r2 instanceof C28981Uw) {
            Set set = r4.A0N;
            if (set == null) {
                set = C36441kJ.A16();
                r4.A0N = set;
            }
            Long valueOf = Long.valueOf(j);
            if (!set.contains(valueOf)) {
                r4.A0N.add(valueOf);
                r4.A19.Boz(new C80303vB(r4, j, 10), AnonymousClass000.A0l(r2, "MessageViewModel/scheduleCheckForGapsInNewsletter/", AnonymousClass000.A0u()));
            }
        }
    }

    public static void A0C(C40061uh r7, AnonymousClass3T1 r8) {
        long A0B2 = C36441kJ.A0B(r7.A0s, 4736);
        r7.A0Q.postDelayed(new C80303vB(r7, A0B2, 9), A0B2 - AnonymousClass3T1.A05(r7.A0g, r8));
    }

    public static void A0D(C40061uh r6, AnonymousClass3T1 r7) {
        int i;
        if (r7 != null && (i = r7.A1I) != 7 && i != 87) {
            C28201Rs r5 = r6.A16;
            if (!C36351kA.A1W(r5)) {
                C19460v5 r1 = r6.A0Z;
                if (!r1.A05()) {
                    return;
                }
                if (((r1.A05() && C36441kJ.A0f(r1).BLB(r7.A1J.A00)) || r6.A0p.A0E()) && r7.A1J.A02 && r7.A0D >= 4 && AnonymousClass3T1.A05(r6.A0g, r7) < C36441kJ.A0B(r6.A0s, 4736) && r6.A0S().A1J.A02) {
                    C36341k9.A18(r5, true);
                    A0C(r6, r7);
                }
            }
        }
    }

    public static boolean A0E(AnonymousClass3T1 r3) {
        int i = r3.A1I;
        if (i == 8 || i == 87 || i == 88 || AnonymousClass000.A1S(r3.A0A & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING, EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING)) {
            return true;
        }
        if ((!(r3 instanceof AnonymousClass2c3) || ((AnonymousClass2c3) r3).A00 != 1) && !(r3 instanceof AnonymousClass0p5)) {
            return false;
        }
        return true;
    }

    public void A0R() {
        this.A1L.unregisterObserver(this.A1K);
        C64153Mv r2 = C64153Mv.A01;
        C006302t r1 = this.A1G;
        AnonymousClass00C.A0D(r1, 0);
        synchronized (r2) {
            C64153Mv.A02.remove(r1);
        }
    }

    public AnonymousClass3T1 A0S() {
        AnonymousClass3T1 r0;
        List list = this.A1E;
        if (!list.isEmpty()) {
            return (AnonymousClass3T1) C36401kF.A0n(list);
        }
        synchronized (this) {
            r0 = this.A0E;
        }
        return r0;
    }

    public void A0T() {
        List list = this.A1E;
        list.clear();
        C28201Rs r2 = this.A0z;
        C62103Eu r1 = new C62103Eu();
        r1.A00 = C23931Ak.copyOf((Collection) list);
        r1.A06 = true;
        r2.A0D(r1.A00());
        A0A(this);
    }

    public void A0V(long j) {
        this.A0A = j;
        this.A1J.A03("start_ref", Long.valueOf(j));
    }

    public void A0W(long j) {
        this.A0B = j;
        this.A1J.A03("start_sort_ref", Long.valueOf(j));
    }

    public void A0X(AnonymousClass3CQ r21, AnonymousClass3T1 r22, List list, int i, int i2, int i3, int i4, boolean z) {
        boolean z2;
        C600336f r9;
        AnonymousClass3T1 r10 = r22;
        if (r10.A1O < this.A0B) {
            z2 = true;
            long j = this.A0O;
            AnonymousClass11F r6 = this.A0t;
            long j2 = r10.A1N;
            C20310xM r5 = this.A0k;
            AnonymousClass11F r12 = r6;
            long j3 = j;
            r9 = r5.A0S(r12, 100, r5.A0j.A05(r12, 100, j2, j3), j3);
            r9.A00.getCount();
            A0V(r9.A01);
            A0W(r9.A02);
            A0Y(r9);
            A0T();
        } else {
            z2 = false;
            r9 = null;
        }
        C28201Rs r62 = this.A15;
        int A032 = this.A0o.A03(this.A0t, this.A0B, r10.A1O);
        if (this.A07 > 0 && A032 >= i2) {
            A032++;
        }
        r62.A0D(new AnonymousClass3H5(r21, r9, r10, list, A032, i, i3, i4, this.A0O, z2, z));
    }

    public void A0Z(AnonymousClass3T1 r4) {
        if (!C1901797e.A00(this.A0M, r4)) {
            this.A0M = r4;
            AnonymousClass08M r1 = this.A1J;
            if (r4 != null) {
                A04(r1, r4.A1J, "commentedParentMessage_");
            } else {
                A05(r1, "commentedParentMessage_");
            }
            this.A0R.A0D(r4);
        }
    }

    public void A0a(AnonymousClass3T1 r5) {
        if (!C1901797e.A00(this.A0F, r5)) {
            this.A0F = r5;
            HashMap hashMap = this.A0c.A00;
            AnonymousClass08M r1 = this.A1J;
            if (r5 != null) {
                A04(r1, r5.A1J, "quotedMessage_");
                hashMap.put(this.A0t, r5);
            } else {
                A05(r1, "quotedMessage_");
                hashMap.remove(this.A0t);
            }
            this.A0Y.A0D(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        if (r12.A0L != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(boolean r33) {
        /*
            r32 = this;
            r2 = 100
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r12 = r32
            X.11F r0 = r12.A0t
            r17 = r0
            java.lang.String r0 = r17.getRawString()
            r1.append(r0)
            java.lang.String r0 = "_"
            r1.append(r0)
            r1.append(r2)
            r1.append(r0)
            long r2 = r12.A0O
            java.lang.String r13 = X.C36411kG.A11(r1, r2)
            java.util.Set r11 = r12.A1M
            monitor-enter(r11)
            if (r33 != 0) goto L_0x002d
            boolean r0 = r12.A0L     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
        L_0x002d:
            boolean r0 = r11.add(r13)     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x006f
            X.0wU r14 = r12.A19     // Catch:{ all -> 0x0071 }
            X.0xM r0 = r12.A0k     // Catch:{ all -> 0x0071 }
            r16 = r0
            X.1A1 r15 = r12.A0w     // Catch:{ all -> 0x0071 }
            long r7 = r12.A0A     // Catch:{ all -> 0x0071 }
            long r5 = r12.A0B     // Catch:{ all -> 0x0071 }
            X.12q r10 = r12.A0j     // Catch:{ all -> 0x0071 }
            X.17U r9 = r12.A0o     // Catch:{ all -> 0x0071 }
            X.1SL r4 = r12.A0u     // Catch:{ all -> 0x0071 }
            java.util.List r1 = r12.A1E     // Catch:{ all -> 0x0071 }
            X.31S r0 = new X.31S     // Catch:{ all -> 0x0071 }
            r0.<init>(r12)     // Catch:{ all -> 0x0071 }
            X.3wA r12 = new X.3wA     // Catch:{ all -> 0x0071 }
            r30 = r5
            r26 = r2
            r28 = r7
            r23 = r13
            r24 = r1
            r25 = r11
            r20 = r17
            r21 = r4
            r22 = r15
            r17 = r10
            r18 = r16
            r19 = r9
            r15 = r12
            r16 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ all -> 0x0071 }
            r14.Bp1(r12)     // Catch:{ all -> 0x0071 }
        L_0x006f:
            monitor-exit(r11)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40061uh.A0b(boolean):void");
    }

    public static void A04(AnonymousClass08M r4, C64933Qa r5, String str) {
        String A0q2 = AnonymousClass000.A0q("fMessageKeyJid", AnonymousClass000.A0v(str));
        String A0q3 = AnonymousClass000.A0q("fMessageKeyFromMe", AnonymousClass000.A0v(str));
        r4.A03(AnonymousClass000.A0q("fMessageKeyId", AnonymousClass000.A0v(str)), r5.A01);
        r4.A03(A0q3, Boolean.valueOf(r5.A02));
        r4.A03(A0q2, AnonymousClass143.A03(r5.A00));
    }

    public static void A05(AnonymousClass08M r4, String str) {
        String A0q2 = AnonymousClass000.A0q("fMessageKeyJid", AnonymousClass000.A0v(str));
        String A0q3 = AnonymousClass000.A0q("fMessageKeyFromMe", AnonymousClass000.A0v(str));
        r4.A02(AnonymousClass000.A0q("fMessageKeyId", AnonymousClass000.A0v(str)));
        r4.A02(A0q3);
        r4.A02(A0q2);
    }

    public void A0U() {
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("messagesViewModel/recreatemessagelist/");
        A0u2.append(this.A0A);
        C36421kH.A1N(A0u2);
        C36331k8.A1S(A0u2, this.A0L);
        int A012 = A01(this);
        C600336f A032 = A03(this, A02(this), this.A0O);
        A0V(A032.A01);
        A0W(A032.A02);
        Cursor cursor = A032.A00;
        if (cursor != null && this.A07 > cursor.getCount()) {
            A09(this);
        }
        A0Y(A032);
        this.A0W.A0D(new AnonymousClass3GW(new AnonymousClass3GJ(this.A05, this.A06, this.A07), A032, this.A01, this.A0L));
        this.A1E.clear();
        if (this.A0L && A012 > A01(this)) {
            Log.i("messagesViewModel/messagesViewModel/loadMoreMessages");
            A0b(false);
        }
        A0A(this);
    }

    public C40061uh(Intent intent, AnonymousClass08M r15, C19460v5 r16, C19730wQ r17, C25791Hr r18, AnonymousClass319 r19, AnonymousClass1YX r20, MessageSelectionViewModel messageSelectionViewModel, C62113Ev r22, C19970wo r23, C18820ts r24, C24901Ef r25, C220412q r26, C20310xM r27, AnonymousClass1A4 r28, AnonymousClass1QH r29, AnonymousClass16J r30, AnonymousClass17T r31, AnonymousClass17U r32, AnonymousClass141 r33, C26311Jr r34, C235518x r35, C20810yC r36, AnonymousClass11F r37, AnonymousClass1SL r38, C237919w r39, AnonymousClass1A1 r40, AnonymousClass1GX r41, C19770wU r42, C88974Ut r43, C62683Hc r44, AnonymousClass005 r45) {
        C001700s A0S2 = C36431kI.A0S();
        this.A0Y = A0S2;
        this.A0R = C36431kI.A0S();
        this.A0X = C36431kI.A0S();
        this.A16 = new C28201Rs(false);
        this.A0T = C36431kI.A0S();
        this.A0S = C36431kI.A0S();
        this.A1G = new C40611vp(this, 8);
        C90394a5 A002 = C90394a5.A00(this, 17);
        this.A1K = A002;
        this.A0s = r36;
        this.A0o = r32;
        this.A0k = r27;
        this.A0w = r40;
        this.A19 = r42;
        this.A0j = r26;
        this.A0n = r31;
        this.A0h = r24;
        this.A0i = r25;
        this.A0a = r17;
        this.A1C = r45;
        this.A0u = r38;
        this.A0q = r34;
        this.A1A = r43;
        AnonymousClass319 r8 = r19;
        this.A0c = r8;
        this.A0r = r35;
        this.A1B = r44;
        this.A0x = r41;
        this.A0v = r39;
        this.A0g = r23;
        this.A0d = r20;
        this.A0f = r22;
        AnonymousClass1A4 r6 = r28;
        this.A0l = r6;
        this.A0m = r29;
        AnonymousClass16J r5 = r30;
        this.A1L = r5;
        this.A0Z = r16;
        this.A1J = r15;
        AnonymousClass11F r3 = r37;
        this.A0t = r3;
        AnonymousClass141 r4 = r33;
        this.A0p = r4;
        this.A0P = intent;
        this.A0e = messageSelectionViewModel;
        this.A0b = r18;
        Map map = r15.A03;
        Number number = (Number) map.get("start_ref");
        if (number != null) {
            this.A0A = number.longValue();
        }
        Number number2 = (Number) map.get("start_sort_ref");
        if (number2 != null) {
            this.A0B = number2.longValue();
        }
        String A0q2 = AnonymousClass000.A0q("fMessageKeyJid", AnonymousClass000.A0v("quotedMessage_"));
        String A0q3 = AnonymousClass000.A0q("fMessageKeyFromMe", AnonymousClass000.A0v("quotedMessage_"));
        String A0q4 = AnonymousClass000.A0q("fMessageKeyId", AnonymousClass000.A0v("quotedMessage_"));
        AnonymousClass00C.A0D(A0q2, 0);
        if (map.containsKey(A0q2)) {
            AnonymousClass00C.A0D(A0q3, 0);
            if (map.containsKey(A0q3)) {
                AnonymousClass00C.A0D(A0q4, 0);
                if (map.containsKey(A0q4)) {
                    AnonymousClass3T1 A032 = this.A0w.A03(new C64933Qa(C36421kH.A0N(C36431kI.A1A(A0q2, map)), C36431kI.A1A(A0q4, map), Boolean.TRUE.equals(map.get(A0q3))));
                    this.A0F = A032;
                    if (A032 != null) {
                        A0S2.A0C(A032);
                        r8.A00.put(r3, this.A0F);
                    }
                }
            }
        }
        this.A0O = r6.A00;
        this.A1H = r4.A0G();
        this.A1I = r4.A0H instanceof C177618e5;
        r5.registerObserver(A002);
    }
}
