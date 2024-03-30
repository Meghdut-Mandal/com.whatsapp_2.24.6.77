package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1hN  reason: invalid class name and case insensitive filesystem */
public class C34621hN {
    public int A00 = 100;
    public int A01 = 1000;
    public C106895Lt A02;
    public C107015Mf A03;
    public C49012iQ A04;
    public C49022iR A05;
    public AnonymousClass6TP A06;
    public C34751ha A07;
    public boolean A08 = true;
    public final AnonymousClass17Y A09;
    public final C19730wQ A0A;
    public final C30531aM A0B;
    public final C34631hO A0C;
    public final AnonymousClass16D A0D;
    public final C226815j A0E;
    public final AnonymousClass16I A0F;
    public final AnonymousClass171 A0G;
    public final C19970wo A0H;
    public final AnonymousClass1HJ A0I;
    public final C26211Jh A0J;
    public final C34641hP A0K;
    public final C20810yC A0L;
    public final C20350xQ A0M;
    public final C24511Cs A0N;
    public final C233117z A0O;
    public final C34661hR A0P;
    public final C31031bA A0Q;
    public final AnonymousClass1C6 A0R;
    public final C19770wU A0S;
    public final C32011co A0T;
    public final AnonymousClass1HP A0U;
    public final AnonymousClass1NK A0V;
    public final C27721Pm A0W;

    public static void A00(C34621hN r14, List list) {
        String str;
        if (list == null) {
            str = "CallsHistoryDataSource/notifyCallItemsUpdated task result null";
        } else {
            C34751ha r1 = r14.A07;
            if (r1 != null) {
                ArrayList arrayList = new ArrayList(list);
                Log.i("CallsHistoryViewModel/onCallLogUpdated");
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r1.A00;
                if (callsHistoryFragmentV2ViewModel.A0H || callsHistoryFragmentV2ViewModel.A0I) {
                    callsHistoryFragmentV2ViewModel.A0I = false;
                    C106975Mb r12 = callsHistoryFragmentV2ViewModel.A09;
                    if (r12 != null) {
                        r12.A0D(true);
                    }
                    C34761hb r5 = callsHistoryFragmentV2ViewModel.A0Q;
                    Lock lock = callsHistoryFragmentV2ViewModel.A0n;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentV2ViewModel.A0m;
                    ArrayList arrayList2 = callsHistoryFragmentV2ViewModel.A0k;
                    AnonymousClass1C6 r11 = callsHistoryFragmentV2ViewModel.A0h;
                    AnonymousClass16D r8 = callsHistoryFragmentV2ViewModel.A0X;
                    C20350xQ r10 = callsHistoryFragmentV2ViewModel.A0g;
                    C106975Mb r4 = new C106975Mb(r5, callsHistoryFragmentV2ViewModel, callsHistoryFragmentV2ViewModel.A0V, r8, callsHistoryFragmentV2ViewModel.A0e, r10, r11, arrayList, arrayList2, linkedHashMap, lock);
                    callsHistoryFragmentV2ViewModel.A09 = r4;
                    r4.A02.executeOnExecutor(callsHistoryFragmentV2ViewModel.A0B, new Void[0]);
                    return;
                }
                str = "CallsHistoryViewModel/onCallLogUpdated skip due to no active observer";
            } else {
                return;
            }
        }
        Log.i(str);
    }

    public void A01() {
        C107015Mf r1 = this.A03;
        if (r1 != null) {
            r1.A0D(true);
        }
        C107015Mf r2 = new C107015Mf(this);
        this.A03 = r2;
        this.A0S.Bp0(r2, new Void[0]);
    }

    public void A02() {
        C49022iR r1 = this.A05;
        if (r1 != null) {
            r1.A0D(true);
        }
        C49022iR r2 = new C49022iR(this);
        this.A05 = r2;
        this.A0S.Box(r2, new Void[0]);
    }

    public C34621hN(AnonymousClass17Y r13, C19730wQ r14, C30531aM r15, C34631hO r16, AnonymousClass16D r17, AnonymousClass16I r18, AnonymousClass171 r19, C19970wo r20, AnonymousClass1HJ r21, C26211Jh r22, C34641hP r23, C20810yC r24, C20350xQ r25, C233117z r26, C31031bA r27, AnonymousClass1C6 r28, C19770wU r29, AnonymousClass1HP r30, C27721Pm r31) {
        C36161jr r6 = new C36161jr(this, 0);
        this.A0T = r6;
        C36081jj r4 = new C36081jj(this, 1);
        this.A0V = r4;
        C36001jb r3 = new C36001jb(this, 1);
        this.A0E = r3;
        C34671hS r2 = new C34671hS(this);
        this.A0P = r2;
        C36021jd r1 = new C36021jd(this, 0);
        this.A0N = r1;
        C20810yC r5 = r24;
        this.A0L = r5;
        C27721Pm r0 = r31;
        this.A0W = r0;
        AnonymousClass1HP r7 = r30;
        this.A0U = r7;
        this.A0I = r21;
        this.A0D = r17;
        AnonymousClass16I r11 = r18;
        this.A0F = r11;
        this.A09 = r13;
        this.A0M = r25;
        this.A0J = r22;
        C31031bA r9 = r27;
        this.A0Q = r9;
        C233117z r10 = r26;
        this.A0O = r10;
        this.A0C = r16;
        this.A0R = r28;
        this.A0H = r20;
        this.A0G = r19;
        this.A0S = r29;
        this.A0A = r14;
        this.A0B = r15;
        this.A0K = r23;
        r0.registerObserver(r4);
        r7.registerObserver(r6);
        r11.registerObserver(r3);
        if (C34681hT.A0M(r5)) {
            r9.registerObserver(r2);
            r10.registerObserver(r1);
        }
        C21000yV r12 = C21000yV.A02;
        if (C20800yB.A01(r12, r5, 4119)) {
            this.A01 = C20800yB.A00(r12, r5, 4120);
            this.A00 = C20800yB.A00(r12, r5, 4284);
        }
    }
}
