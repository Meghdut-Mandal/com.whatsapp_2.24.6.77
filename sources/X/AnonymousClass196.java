package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.196  reason: invalid class name */
public class AnonymousClass196 implements AnonymousClass191, C20420xX, AnonymousClass192, AnonymousClass193, AnonymousClass194, AnonymousClass195 {
    public C76933pg A00;
    public AnonymousClass3CM A01 = null;
    public Runnable A02;
    public boolean A03;
    public C203289nj A04;
    public final C19700wN A05;
    public final C19730wQ A06;
    public final C21100yf A07;
    public final C25901Ic A08;
    public final C25921Ie A09;
    public final C25941Ig A0A;
    public final AnonymousClass1C3 A0B;
    public final C25771Hp A0C;
    public final C25991Il A0D;
    public final AnonymousClass1AB A0E;
    public final AnonymousClass1IZ A0F;
    public final C237119n A0G;
    public final AnonymousClass1IR A0H;
    public final AnonymousClass1A9 A0I;
    public final AnonymousClass1AK A0J;
    public final AnonymousClass1AN A0K;
    public final AnonymousClass16D A0L;
    public final C19980wp A0M;
    public final C220412q A0N;
    public final AnonymousClass18P A0O;
    public final C236419g A0P;
    public final AnonymousClass1IT A0Q;
    public final AnonymousClass1AC A0R;
    public final AnonymousClass1AM A0S;
    public final AnonymousClass1AE A0T;
    public final AnonymousClass19A A0U;
    public final AnonymousClass1AP A0V;
    public final C19770wU A0W;
    public final AnonymousClass199 A0X;
    public final C25791Hr A0Y;
    public final C25911Id A0Z;
    public final C25971Ij A0a;
    public final AnonymousClass1IS A0b;
    public final C26011In A0c;
    public final AnonymousClass1A6 A0d;
    public final C19970wo A0e;
    public final AnonymousClass1IU A0f;
    public final C20810yC A0g;
    public final C236919l A0h;
    public final C19930wk A0i;
    public final C229716r A0j;

    public static void A02(AnonymousClass196 r1, boolean z) {
        synchronized (r1) {
            r1.A03 = false;
            if (z) {
                r1.A0H();
            }
        }
    }

    public void A0F() {
        AnonymousClass1AE r3;
        Cursor A092;
        synchronized (this) {
            if (A0S()) {
                if (!this.A06.A0L()) {
                    Class<UserJid> cls = UserJid.class;
                    AnonymousClass199 r5 = this.A0X;
                    ArrayList A062 = AnonymousClass143.A06(cls, r5.A09("SYNC_MANAGER_CONTACTS_JID_ADDED"));
                    ArrayList A063 = AnonymousClass143.A06(cls, r5.A09("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
                    AnonymousClass2FS r7 = (AnonymousClass2FS) this.A0T.A00("contact");
                    A062.size();
                    A063.size();
                    if (r7 != null) {
                        C18740tg.A0F(!r7.A02.A0L(), "Companion cannot create contact mutations");
                        ArrayList arrayList = new ArrayList(A062);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = A063.iterator();
                        while (it.hasNext()) {
                            AnonymousClass11F r9 = (AnonymousClass11F) it.next();
                            if (!arrayList.contains(r9)) {
                                AnonymousClass16D r2 = r7.A03;
                                AnonymousClass141 A0E2 = r2.A0E(r9, false);
                                if (A0E2 == null || !r2.A05.A0Z(A0E2) || !A0E2.A0z) {
                                    arrayList2.add(r9);
                                } else {
                                    arrayList.add(r9);
                                }
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(r7.A0I(C199769fw.A03, arrayList));
                        arrayList3.addAll(r7.A0I(C199769fw.A02, arrayList2));
                        A0C(arrayList3);
                    }
                    AnonymousClass199.A04(r5, "SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
                    AnonymousClass199.A04(r5, "SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
                }
                AnonymousClass1AK r22 = this.A0J;
                synchronized (r22) {
                    r3 = r22.A02;
                    Iterator it2 = r3.A01().iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
                AnonymousClass1AC r72 = this.A0R;
                ArrayList arrayList4 = new ArrayList();
                AnonymousClass1M0 A032 = r72.A00.get();
                try {
                    A092 = A032.A02.A09("SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 0  ORDER BY _id ASC ", "PendingMutationsTable.SELECT_NOT_READY_TO_SYNC_MUTATIONS", (String[]) null);
                    while (A092.moveToNext()) {
                        arrayList4.add(AnonymousClass1AC.A00(A092, r72));
                    }
                    A092.close();
                    A032.close();
                    StringBuilder sb = new StringBuilder();
                    sb.append("sync-manager/handleNotReadyToSyncPendingMutations count: ");
                    sb.append(arrayList4.size());
                    Log.i(sb.toString());
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        C201669k5 r1 = (C201669k5) it3.next();
                        if (r1 != null) {
                            String A072 = r1.A07();
                            AnonymousClass00C.A08(A072);
                            AnonymousClass1LZ A002 = r3.A00(A072);
                            if (A002 != null) {
                                A002.A0F(r1);
                            }
                        }
                    }
                    A0G();
                } catch (Throwable th) {
                    try {
                        A032.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
        return;
        throw th;
    }

    public void A0G() {
        synchronized (this) {
            Runnable runnable = this.A02;
            if (runnable != null) {
                this.A0W.Bnx(runnable);
                this.A02 = null;
                Log.i("sync-manager/forceSync removed scheduled sync");
            }
            A0H();
        }
    }

    public void A0I(int i) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/deleteAllSyncdData: isSyncing = ");
            sb.append(this.A03);
            Log.i(sb.toString());
            this.A01 = new AnonymousClass2FO(this, i);
            if (!this.A03) {
                A0R();
            }
        }
    }

    public void A0K(Integer num) {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append("sync-manager/handleFatalFailure: errorCode = ");
            sb.append(num);
            sb.append("; isSyncing = ");
            sb.append(this.A03);
            Log.i(sb.toString());
            this.A01 = new AnonymousClass2FP(this, num);
            if (!this.A03) {
                A0R();
            }
        }
    }

    public boolean A0R() {
        boolean z;
        synchronized (this) {
            AnonymousClass3CM r2 = this.A01;
            if (r2 == null) {
                z = false;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("sync-manager/handleSyncdStateIfRequired: syncdState = ");
                sb.append(r2);
                Log.i(sb.toString());
                this.A01.A00();
                this.A01 = null;
                z = true;
            }
        }
        return z;
    }

    public boolean A0U(int i) {
        boolean A2H = this.A0h.A01.A2H();
        if (i != 0) {
            return A2H || this.A06.A0L();
        }
        if (!A2H || this.A06.A0L()) {
            return false;
        }
    }

    public /* synthetic */ void BSA(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void BUx(C63133Iw r1) {
    }

    public /* synthetic */ void BVT(C63133Iw r1) {
    }

    public /* synthetic */ void BVX(C20760y7 r1, int i) {
    }

    public /* synthetic */ void BVZ(C63133Iw r1) {
    }

    public /* synthetic */ void BVb(AnonymousClass3SB r1) {
    }

    public /* synthetic */ void BWH(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void BYm() {
    }

    public /* synthetic */ void BYn() {
    }

    public /* synthetic */ void BYo() {
    }

    public /* synthetic */ void BYp() {
    }

    public /* synthetic */ void BZj(AnonymousClass11F r1) {
    }

    public void Bas(AnonymousClass3T1 r4, int i) {
        if (A0U(1) && r4.A1J.A00 != null) {
            if (i == -1 || i == 22) {
                this.A0i.execute(new C35651j2(this, r4, 29));
            }
        }
    }

    public /* synthetic */ void Bau(AnonymousClass3T1 r1, int i) {
    }

    public /* synthetic */ void Baw(AnonymousClass3T1 r1) {
    }

    public /* synthetic */ void Bax(AnonymousClass3T1 r1, AnonymousClass3T1 r2) {
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

    public void Bec() {
    }

    public void Bir() {
    }

    public static Pair A00(AnonymousClass196 r4, Collection collection, Collection collection2) {
        Class<UserJid> cls = UserJid.class;
        AnonymousClass199 r2 = r4.A0X;
        ArrayList A062 = AnonymousClass143.A06(cls, r2.A09("SYNC_MANAGER_CONTACTS_JID_ADDED"));
        ArrayList A063 = AnonymousClass143.A06(cls, r2.A09("SYNC_MANAGER_CONTACTS_JID_REMOVED"));
        collection.addAll(A062);
        collection2.addAll(A063);
        HashSet hashSet = new HashSet();
        AnonymousClass143.A0C(collection, hashSet);
        HashSet hashSet2 = new HashSet();
        AnonymousClass143.A0C(collection2, hashSet2);
        return new Pair(hashSet, hashSet2);
    }

    public static synchronized C203289nj A01(AnonymousClass196 r38) {
        C203289nj r13;
        AnonymousClass196 r9 = r38;
        synchronized (r9) {
            r13 = r9.A04;
            if (r13 == null) {
                String[] strArr = C203289nj.A0L;
                C19970wo r20 = r9.A0e;
                C20810yC r19 = r9.A0g;
                C19700wN r18 = r9.A05;
                C19730wQ r17 = r9.A06;
                AnonymousClass18P r16 = r9.A0O;
                AnonymousClass1A9 r15 = r9.A0I;
                AnonymousClass1AK r12 = r9.A0J;
                AnonymousClass1AB r11 = r9.A0E;
                C25791Hr r10 = r9.A0Y;
                AnonymousClass1AC r8 = r9.A0R;
                AnonymousClass1IS r7 = r9.A0b;
                AnonymousClass1IT r6 = r9.A0Q;
                C236419g r5 = r9.A0P;
                AnonymousClass1IU r4 = r9.A0f;
                C237119n r3 = r9.A0G;
                C25911Id r2 = r9.A0Z;
                C25971Ij r1 = r9.A0a;
                C19980wp r0 = r9.A0M;
                C24451Cm r33 = new C24451Cm(new Random(), 20, 3600000);
                C20810yC r32 = r19;
                AnonymousClass18P r28 = r16;
                C587630y r192 = new C587630y(r9);
                AnonymousClass1AB r202 = r11;
                C237119n r21 = r3;
                AnonymousClass1IS r22 = r7;
                AnonymousClass1A9 r23 = r15;
                C19700wN r14 = r18;
                C19730wQ r152 = r17;
                C25791Hr r162 = r10;
                C25911Id r172 = r2;
                C25971Ij r182 = r1;
                r13 = new C203289nj(r14, r152, r162, r172, r182, r192, r202, r21, r22, r23, r12, r0, r20, r4, r28, r5, r6, r8, r32, r33);
                r9.A04 = r13;
            }
        }
        return r13;
    }

    public Set A03(AnonymousClass11F r11, long j, boolean z) {
        AnonymousClass8YC r0 = (AnonymousClass8YC) this.A0T.A00("mute");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A0C(Collections.singletonList(new C176098bZ((C201539jo) null, r11, (String) null, j, C19970wo.A00(r0.A00), z, false)));
    }

    public Set A04(AnonymousClass11F r8, boolean z) {
        AnonymousClass8YM r0;
        AnonymousClass1AE r6 = this.A0T;
        AnonymousClass8YL r4 = (AnonymousClass8YL) r6.A00("archive");
        if (r4 != null) {
            C19730wQ r02 = this.A06;
            r02.A0G();
            if (r02.A03 != null && A0S()) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    AnonymousClass8YH r2 = (AnonymousClass8YH) r6.A00("pin_v1");
                    if (r2 != null) {
                        r2.A01.A07(1);
                        arrayList.add(new C176108ba(r8, C19970wo.A00(r2.A02), false));
                    }
                    if (C20800yB.A01(C21000yV.A02, this.A0g, 7279) && (r0 = (AnonymousClass8YM) r6.A00("lock")) != null) {
                        arrayList.add(r0.A0I(r8, false));
                    }
                }
                arrayList.add(r4.A0I(r8, z));
                return A0C(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A05(AnonymousClass11F r8, boolean z) {
        AnonymousClass8YM r0;
        AnonymousClass1AE r6 = this.A0T;
        AnonymousClass8YH r5 = (AnonymousClass8YH) r6.A00("pin_v1");
        if (r5 != null) {
            C19730wQ r02 = this.A06;
            r02.A0G();
            if (r02.A03 != null && A0S()) {
                ArrayList arrayList = new ArrayList();
                if (z) {
                    AnonymousClass8YL r03 = (AnonymousClass8YL) r6.A00("archive");
                    if (r03 != null) {
                        arrayList.add(r03.A0I(r8, false));
                    }
                    if (C20800yB.A01(C21000yV.A02, this.A0g, 7279) && (r0 = (AnonymousClass8YM) r6.A00("lock")) != null) {
                        arrayList.add(r0.A0I(r8, false));
                    }
                }
                r5.A01.A07(1);
                arrayList.add(new C176108ba(r8, C19970wo.A00(r5.A02), z));
                return A0C(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public Set A06(AnonymousClass11F r11, boolean z) {
        AnonymousClass8YG r3 = (AnonymousClass8YG) this.A0T.A00("deleteChat");
        if (r3 == null || !A0S()) {
            return Collections.emptySet();
        }
        AnonymousClass1AK r2 = this.A0J;
        AnonymousClass11F r4 = r11;
        Set A052 = A05(r11, false);
        synchronized (r2) {
            r2.A00.A0I(A052);
        }
        r3.A01.A07(3);
        return A0C(Collections.singletonList(new C176048bU((C201539jo) null, r3.A00.A03(r11), r4, (String) null, C19970wo.A00(r3.A02), z, true)));
    }

    public Set A07(AnonymousClass11F r8, boolean z) {
        AnonymousClass1AE r6 = this.A0T;
        AnonymousClass8YM r5 = (AnonymousClass8YM) r6.A00("lock");
        if (r5 != null) {
            C19730wQ r0 = this.A06;
            r0.A0G();
            if (r0.A03 != null && A0S()) {
                if (C20800yB.A01(C21000yV.A02, this.A0g, 7279)) {
                    ArrayList arrayList = new ArrayList();
                    if (z) {
                        AnonymousClass8YH r2 = (AnonymousClass8YH) r6.A00("pin_v1");
                        if (r2 != null) {
                            r2.A01.A07(1);
                            arrayList.add(new C176108ba(r8, C19970wo.A00(r2.A02), false));
                        }
                        AnonymousClass8YL r02 = (AnonymousClass8YL) r6.A00("archive");
                        if (r02 != null) {
                            arrayList.add(r02.A0I(r8, false));
                        }
                    }
                    arrayList.add(r5.A0I(r8, z));
                    return A0C(arrayList);
                }
            }
        }
        return Collections.emptySet();
    }

    public Set A08(AnonymousClass11F r10, boolean z) {
        AnonymousClass8YJ r1 = (AnonymousClass8YJ) this.A0T.A00("markChatAsRead");
        if (r1 == null) {
            return Collections.emptySet();
        }
        long A002 = C19970wo.A00(r1.A01);
        return A0C(Collections.singletonList(new C176068bW((C201539jo) null, r1.A00.A04(r10, false), r10, (String) null, A002, z, false)));
    }

    public Set A09(AnonymousClass11F r11, boolean z, boolean z2) {
        AnonymousClass8YF r2 = (AnonymousClass8YF) this.A0T.A00("clearChat");
        if (r2 != null) {
            C19730wQ r0 = this.A06;
            r0.A0G();
            if (r0.A03 != null) {
                AnonymousClass1AB r1 = r2.A01;
                int i = 5;
                boolean z3 = z;
                if (z) {
                    i = 4;
                }
                r1.A07(i);
                long A002 = C19970wo.A00(r2.A02);
                return A0C(Collections.singletonList(new C176058bV((C201539jo) null, r2.A00.A03(r11), r11, (String) null, A002, z3, z2, true)));
            }
        }
        return Collections.emptySet();
    }

    public Set A0A(C135066c4 r20, long j, boolean z) {
        List singletonList;
        AnonymousClass540 r2 = (AnonymousClass540) this.A0T.A00("favoriteSticker");
        if (r2 != null) {
            C135066c4 r3 = r20;
            if (!r3.A0L) {
                if (TextUtils.isEmpty(r3.A0E)) {
                    Log.e("FavoriteStickerHandler/empty sticker fileHash");
                    singletonList = Collections.emptyList();
                } else {
                    int A042 = r2.A00.A04();
                    String str = r3.A0E;
                    C18740tg.A06(str);
                    singletonList = Collections.singletonList(new C1032354m(new C1266464w(str, r3.A0H, r3.A09, r3.A0C, r3.A0D, r3.A07, r3.A03, r3.A02, (long) r3.A00), (C201539jo) null, (String) null, A042, j, z, false));
                }
                return A0C(singletonList);
            }
        }
        return Collections.emptySet();
    }

    public Set A0B(String str, long j) {
        AnonymousClass8YE r0 = (AnonymousClass8YE) this.A0T.A00("removeRecentSticker");
        if (r0 == null) {
            return Collections.emptySet();
        }
        return A0C(Collections.singletonList(new C176018bR((C201539jo) null, (String) null, str, C19970wo.A00(r0.A00), j, false)));
    }

    public Set A0D(Collection collection, boolean z) {
        AnonymousClass11F A0J2;
        AnonymousClass8YK r1 = (AnonymousClass8YK) this.A0T.A00("star");
        if (r1 != null) {
            C19730wQ r0 = this.A06;
            r0.A0G();
            if (r0.A03 != null) {
                long A002 = C19970wo.A00(r1.A01);
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass3T1 r2 = (AnonymousClass3T1) it.next();
                    AnonymousClass11F r12 = r2.A1J.A00;
                    if (AnonymousClass143.A0G(r12) || (r12 instanceof C177618e5)) {
                        A0J2 = r2.A0J();
                    } else {
                        A0J2 = null;
                    }
                    arrayList.add(new C176128bc((C201539jo) null, A0J2, C66013Ui.A0B(r2), (String) null, A002, z, false));
                }
                return A0C(arrayList);
            }
        }
        return Collections.emptySet();
    }

    public void A0J(AnonymousClass3I4 r14, C26691Ld r15) {
        AnonymousClass1LZ r5;
        Object obj;
        AnonymousClass1AE r4 = this.A0T;
        synchronized (r4) {
            Iterator it = ((Map) r4.A00.getValue()).values().iterator();
            while (true) {
                r5 = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                AnonymousClass1LZ r1 = (AnonymousClass1LZ) obj;
                if (r1 instanceof C26661La) {
                    if (((C26661La) r1).A0J() == r15) {
                        break;
                    }
                } else if (AnonymousClass00C.A0J(r1.A0C(), r15.mutationName)) {
                    break;
                }
            }
            if (obj instanceof AnonymousClass1LZ) {
                r5 = (AnonymousClass1LZ) obj;
            }
        }
        C26661La r52 = (C26661La) r5;
        StringBuilder sb = new StringBuilder();
        sb.append("There was no handler for ");
        sb.append(r15);
        C18740tg.A07(r52, sb.toString());
        C26011In r12 = this.A0c;
        AnonymousClass00C.A0D(r52, 1);
        C175958bL r42 = new C175958bL(r52, (C201539jo) null, r14.A00, r14.A01, (String) null, C19970wo.A00(r12.A00), false);
        if (!r52.A0H() || !A0S()) {
            r52.A0N(r42);
            return;
        }
        Set A0C2 = A0C(Collections.singletonList(r42));
        r52.A0N(r42);
        A0Q(A0C2);
    }

    public void A0L(String str) {
        if (this.A0T.A00("removeRecentSticker") != null && A0S()) {
            AnonymousClass1AK r2 = this.A0J;
            StringBuilder sb = new StringBuilder();
            sb.append("[\"removeRecentSticker\",\"");
            sb.append(str);
            sb.append("\"]");
            r2.A04(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0395, code lost:
        if (r22 == false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0397, code lost:
        r6.A01.post(new X.C35671j4(r6, 42));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a7, code lost:
        if (r7.size() <= 0) goto L_0x03ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03a9, code lost:
        r6.A0m(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03ac, code lost:
        r6.A05.A0X(r27);
        r25.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:?, code lost:
        r25.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r26.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03bc, code lost:
        if (r4 == false) goto L_0x03d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03d3, code lost:
        A0F();
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02de A[Catch:{ all -> 0x0390, all -> 0x03bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0301 A[Catch:{ all -> 0x0390, all -> 0x03bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0325 A[Catch:{ all -> 0x0390, all -> 0x03bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x032b A[Catch:{ all -> 0x0390, all -> 0x03bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01eb A[Catch:{ all -> 0x0390, all -> 0x03bf }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(java.util.Collection r29, java.util.Collection r30) {
        /*
            r28 = this;
            r5 = r28
            X.0wQ r0 = r5.A06
            boolean r0 = r0.A0L()
            if (r0 != 0) goto L_0x03db
            monitor-enter(r5)
            r4 = 0
            boolean r0 = r5.A0U(r4)     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x03d6
            X.1AE r1 = r5.A0T     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = "contact"
            X.1LZ r0 = r1.A00(r0)     // Catch:{ all -> 0x03d8 }
            X.2FS r0 = (X.AnonymousClass2FS) r0     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0025
            boolean r0 = r5.A0S()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0025
            r4 = 1
        L_0x0025:
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x03d8 }
            r3.<init>()     // Catch:{ all -> 0x03d8 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x03d8 }
            r2.<init>()     // Catch:{ all -> 0x03d8 }
            r27 = r29
            if (r4 == 0) goto L_0x00ba
            X.199 r9 = r5.A0X     // Catch:{ all -> 0x03d8 }
            java.lang.String r8 = "SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION"
            java.util.HashSet r7 = r9.A09(r8)     // Catch:{ all -> 0x03d8 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x03d8 }
            r10.<init>()     // Catch:{ all -> 0x03d8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03d8 }
            r3.<init>()     // Catch:{ all -> 0x03d8 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x03d8 }
            r6.<init>()     // Catch:{ all -> 0x03d8 }
            java.util.Iterator r2 = r27.iterator()     // Catch:{ all -> 0x03d8 }
        L_0x004e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0080
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03d8 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x03d8 }
            X.3IL r0 = r1.A0F     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x03d8 }
            boolean r0 = r7.contains(r0)     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x006e
            X.3IL r0 = r1.A0F     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x03d8 }
            r6.add(r0)     // Catch:{ all -> 0x03d8 }
            goto L_0x004e
        L_0x006e:
            boolean r0 = r1.A0z     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x004e
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)     // Catch:{ all -> 0x03d8 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x004e
            r10.add(r0)     // Catch:{ all -> 0x03d8 }
            goto L_0x004e
        L_0x0080:
            java.util.Iterator r2 = r30.iterator()     // Catch:{ all -> 0x03d8 }
        L_0x0084:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03d8 }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x03d8 }
            boolean r0 = r1.A0z     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0084
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)     // Catch:{ all -> 0x03d8 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0084
            r3.add(r0)     // Catch:{ all -> 0x03d8 }
            goto L_0x0084
        L_0x00a2:
            android.util.Pair r0 = A00(r5, r10, r3)     // Catch:{ all -> 0x03d8 }
            java.lang.Object r3 = r0.first     // Catch:{ all -> 0x03d8 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ all -> 0x03d8 }
            java.lang.Object r2 = r0.second     // Catch:{ all -> 0x03d8 }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x03d8 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x03d8 }
            if (r0 != 0) goto L_0x00ba
            r7.removeAll(r6)     // Catch:{ all -> 0x03d8 }
            r9.A0A(r8, r7)     // Catch:{ all -> 0x03d8 }
        L_0x00ba:
            X.16r r0 = r5.A0j     // Catch:{ all -> 0x03d8 }
            X.1M0 r26 = r0.A04()     // Catch:{ all -> 0x03d8 }
            X.71s r25 = r26.B1k()     // Catch:{ all -> 0x03c9 }
            if (r4 == 0) goto L_0x00d2
            X.199 r1 = r5.A0X     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            r1.A0A(r0, r3)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "SYNC_MANAGER_CONTACTS_JID_REMOVED"
            r1.A0A(r0, r2)     // Catch:{ all -> 0x03bf }
        L_0x00d2:
            X.16D r6 = r5.A0L     // Catch:{ all -> 0x03bf }
            X.1A6 r7 = r5.A0d     // Catch:{ all -> 0x03bf }
            java.util.HashMap r24 = new java.util.HashMap     // Catch:{ all -> 0x03bf }
            r24.<init>()     // Catch:{ all -> 0x03bf }
            java.util.Iterator r3 = r30.iterator()     // Catch:{ all -> 0x03bf }
        L_0x00df:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x0104
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x03bf }
            X.141 r2 = (X.AnonymousClass141) r2     // Catch:{ all -> 0x03bf }
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r0 = r2.A06(r0)     // Catch:{ all -> 0x03bf }
            X.11F r0 = (X.AnonymousClass11F) r0     // Catch:{ all -> 0x03bf }
            boolean r0 = r7.A0E(r0)     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x0101
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x03bf }
        L_0x00fb:
            r0 = r24
            r0.put(r2, r1)     // Catch:{ all -> 0x03bf }
            goto L_0x00df
        L_0x0101:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x03bf }
            goto L_0x00fb
        L_0x0104:
            java.util.Set r1 = r24.keySet()     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "dbinfo/manager/deleteContacts"
            X.AnonymousClass16D.A02(r0, r1)     // Catch:{ all -> 0x03bf }
            java.util.Set r0 = r24.keySet()     // Catch:{ all -> 0x03bf }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x03bf }
            r3.<init>()     // Catch:{ all -> 0x03bf }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x03bf }
        L_0x011a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x03bf }
            X.141 r1 = (X.AnonymousClass141) r1     // Catch:{ all -> 0x03bf }
            if (r1 == 0) goto L_0x011a
            X.11F r0 = r1.A0H     // Catch:{ all -> 0x03bf }
            boolean r0 = r0 instanceof X.C177628e6     // Catch:{ all -> 0x03bf }
            if (r0 != 0) goto L_0x011a
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x03bf }
            if (r0 != 0) goto L_0x011a
            r3.add(r1)     // Catch:{ all -> 0x03bf }
            goto L_0x011a
        L_0x0138:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x03bf }
            r7.<init>()     // Catch:{ all -> 0x03bf }
            java.util.Iterator r23 = r3.iterator()     // Catch:{ all -> 0x03bf }
        L_0x0141:
            r22 = 0
        L_0x0143:
            boolean r0 = r23.hasNext()     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x0395
            java.lang.Object r3 = r23.next()     // Catch:{ all -> 0x03bf }
            X.141 r3 = (X.AnonymousClass141) r3     // Catch:{ all -> 0x03bf }
            boolean r0 = r3.A0z     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x037a
            X.16p r2 = r6.A05     // Catch:{ all -> 0x03bf }
            r0 = 1
            X.14g r1 = new X.14g     // Catch:{ all -> 0x03bf }
            r1.<init>((boolean) r0)     // Catch:{ all -> 0x03bf }
            r1.A03()     // Catch:{ all -> 0x03bf }
            X.11F r10 = r3.A0H     // Catch:{ all -> 0x03bf }
            X.16r r9 = r2.A00     // Catch:{ all -> 0x03bf }
            X.1M0 r8 = r9.get()     // Catch:{ all -> 0x03bf }
            java.lang.String r13 = "SELECT count(*) AS _count FROM wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid) LEFT JOIN wa_biz_profiles ON (wa_contacts.jid = wa_biz_profiles.jid) WHERE wa_contacts.jid = ?"
            r15 = 1
            java.lang.String[] r12 = new java.lang.String[r0]     // Catch:{ all -> 0x038b }
            java.lang.String r11 = X.AnonymousClass143.A03(r10)     // Catch:{ all -> 0x038b }
            X.C18740tg.A06(r11)     // Catch:{ all -> 0x038b }
            r0 = 0
            r12[r0] = r11     // Catch:{ all -> 0x038b }
            java.lang.String r0 = "COUNT_DUPLICATES"
            android.database.Cursor r14 = X.C229416o.A03(r8, r13, r0, r12)     // Catch:{ all -> 0x038b }
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x037f }
            if (r0 == 0) goto L_0x019b
            java.lang.String r0 = "_count"
            int r0 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x037f }
            long r12 = r14.getLong(r0)     // Catch:{ all -> 0x037f }
            r10 = 1
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0192
            r15 = 0
        L_0x0192:
            r14.close()     // Catch:{ all -> 0x038b }
            r8.close()     // Catch:{ all -> 0x03bf }
            if (r15 != 0) goto L_0x037a
            goto L_0x01c1
        L_0x019b:
            r14.close()     // Catch:{ all -> 0x038b }
            r8.close()     // Catch:{ all -> 0x03bf }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bf }
            r8.<init>()     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "failed during duplicate contact detection for jid ("
            r8.append(r0)     // Catch:{ all -> 0x03bf }
            r8.append(r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = ") | time: "
            r8.append(r0)     // Catch:{ all -> 0x03bf }
            long r0 = r1.A00()     // Catch:{ all -> 0x03bf }
            r8.append(r0)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x03bf }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x03bf }
        L_0x01c1:
            r0 = r24
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x03bf }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x03bf }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x03bf }
            if (r0 != 0) goto L_0x01ed
            long r0 = r3.A0B     // Catch:{ all -> 0x03bf }
            X.0wo r8 = r6.A09     // Catch:{ all -> 0x03bf }
            long r10 = X.C19970wo.A00(r8)     // Catch:{ all -> 0x03bf }
            int r8 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x01ed
            r7.add(r3)     // Catch:{ all -> 0x03bf }
        L_0x01de:
            X.11F r1 = r3.A0H     // Catch:{ all -> 0x03bf }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x03bf }
            com.whatsapp.jid.UserJid r3 = X.C222813r.A00(r1)     // Catch:{ all -> 0x03bf }
            X.13z r1 = X.C223613z.A00     // Catch:{ all -> 0x03bf }
            r0 = 0
            if (r3 != r1) goto L_0x0322
            goto L_0x0321
        L_0x01ed:
            X.3IL r0 = r3.A0F     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x01de
            r1 = 1
            X.14g r21 = new X.14g     // Catch:{ all -> 0x03bf }
            r0 = r21
            r0.<init>((boolean) r1)     // Catch:{ all -> 0x03bf }
            r21.A03()     // Catch:{ all -> 0x03bf }
            android.content.ContentValues r13 = new android.content.ContentValues     // Catch:{ all -> 0x03bf }
            r13.<init>()     // Catch:{ all -> 0x03bf }
            long r0 = r3.A0B     // Catch:{ all -> 0x03bf }
            X.0wo r8 = r2.A05     // Catch:{ all -> 0x03bf }
            long r14 = X.C19970wo.A00(r8)     // Catch:{ all -> 0x03bf }
            r12 = 1
            r8 = 0
            int r10 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            r20 = 0
            if (r10 <= 0) goto L_0x0213
            r20 = 1
        L_0x0213:
            r0 = -1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "raw_contact_id"
            r13.put(r0, r11)     // Catch:{ all -> 0x03bf }
            r10 = 0
            if (r20 != 0) goto L_0x0225
            java.lang.String r0 = "display_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
        L_0x0225:
            java.lang.String r0 = "given_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "family_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "sort_name"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "phone_type"
            r13.put(r0, r11)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "phone_label"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "nickname"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "company"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "title"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "is_starred"
            r13.put(r0, r10)     // Catch:{ all -> 0x03bf }
            X.11F r14 = r3.A0H     // Catch:{ all -> 0x03bf }
            X.1M0 r9 = r9.A04()     // Catch:{ IllegalArgumentException -> 0x02c3 }
            X.71s r19 = r9.B1k()     // Catch:{ all -> 0x02b5 }
            java.lang.String r17 = "wa_contacts"
            java.lang.String r16 = "wa_contacts._id = ?"
            java.lang.String[] r15 = new java.lang.String[r12]     // Catch:{ all -> 0x02a7 }
            long r0 = r3.A0I()     // Catch:{ all -> 0x02a7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x02a7 }
            r15[r8] = r0     // Catch:{ all -> 0x02a7 }
            r1 = r17
            r0 = r16
            long r17 = X.C229416o.A01(r13, r9, r1, r0, r15)     // Catch:{ all -> 0x02a5 }
            r15 = 1
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            r16 = 0
            if (r0 != 0) goto L_0x027e
            r16 = 1
        L_0x027e:
            boolean r0 = r14 instanceof X.AnonymousClass147     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x028a
            r1 = r14
            X.147 r1 = (X.AnonymousClass147) r1     // Catch:{ all -> 0x02a3 }
            r0 = r19
            X.C229516p.A0J(r0, r9, r1, r10)     // Catch:{ all -> 0x02a3 }
        L_0x028a:
            java.lang.String r15 = "wa_group_admin_settings"
            java.lang.String r13 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r12]     // Catch:{ all -> 0x02a3 }
            java.lang.String r0 = X.AnonymousClass143.A03(r14)     // Catch:{ all -> 0x02a3 }
            r1[r8] = r0     // Catch:{ all -> 0x02a3 }
            X.C229416o.A02(r9, r15, r13, r1)     // Catch:{ all -> 0x02a3 }
            r19.A00()     // Catch:{ all -> 0x02a3 }
            r19.close()     // Catch:{ all -> 0x02b3 }
            r9.close()     // Catch:{ IllegalArgumentException -> 0x02c1 }
            goto L_0x02da
        L_0x02a3:
            r1 = move-exception
            goto L_0x02aa
        L_0x02a5:
            r1 = move-exception
            goto L_0x02a8
        L_0x02a7:
            r1 = move-exception
        L_0x02a8:
            r16 = 0
        L_0x02aa:
            r19.close()     // Catch:{ all -> 0x02ae }
            goto L_0x02b2
        L_0x02ae:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x02b3 }
        L_0x02b2:
            throw r1     // Catch:{ all -> 0x02b3 }
        L_0x02b3:
            r1 = move-exception
            goto L_0x02b8
        L_0x02b5:
            r1 = move-exception
            r16 = 0
        L_0x02b8:
            r9.close()     // Catch:{ all -> 0x02bc }
            goto L_0x02c0
        L_0x02bc:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IllegalArgumentException -> 0x02c1 }
        L_0x02c0:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02c1 }
        L_0x02c1:
            r9 = move-exception
            goto L_0x02c6
        L_0x02c3:
            r9 = move-exception
            r16 = 0
        L_0x02c6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bf }
            r1.<init>()     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = "contact-mgr-db/unable to nullify contact android info "
            r1.append(r0)     // Catch:{ all -> 0x03bf }
            r1.append(r3)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03bf }
            X.C18740tg.A08(r0, r9)     // Catch:{ all -> 0x03bf }
        L_0x02da:
            r3.A0F = r10     // Catch:{ all -> 0x03bf }
            if (r20 == 0) goto L_0x02e4
            java.lang.String r0 = r3.A0J()     // Catch:{ all -> 0x03bf }
            r3.A0N = r0     // Catch:{ all -> 0x03bf }
        L_0x02e4:
            r3.A0P = r10     // Catch:{ all -> 0x03bf }
            r3.A0L = r11     // Catch:{ all -> 0x03bf }
            r3.A0V = r10     // Catch:{ all -> 0x03bf }
            r3.A0R = r10     // Catch:{ all -> 0x03bf }
            r3.A0Q = r10     // Catch:{ all -> 0x03bf }
            r3.A0W = r10     // Catch:{ all -> 0x03bf }
            r3.A0U = r10     // Catch:{ all -> 0x03bf }
            r3.A0O = r10     // Catch:{ all -> 0x03bf }
            r3.A0Z = r10     // Catch:{ all -> 0x03bf }
            X.3QL r0 = X.AnonymousClass3QL.A05     // Catch:{ all -> 0x03bf }
            r3.A0K = r0     // Catch:{ all -> 0x03bf }
            r3.A0q = r8     // Catch:{ all -> 0x03bf }
            r21.A00()     // Catch:{ all -> 0x03bf }
            if (r16 == 0) goto L_0x01de
            X.005 r0 = r2.A08     // Catch:{ all -> 0x03bf }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03bf }
            X.2ZF r0 = (X.AnonymousClass2ZF) r0     // Catch:{ all -> 0x03bf }
            java.lang.Iterable r0 = r0.getObservers()     // Catch:{ all -> 0x03bf }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x03bf }
        L_0x0311:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x03bf }
            X.169 r0 = (X.AnonymousClass169) r0     // Catch:{ all -> 0x03bf }
            r0.BUR(r3)     // Catch:{ all -> 0x03bf }
            goto L_0x0311
        L_0x0321:
            r0 = 1
        L_0x0322:
            r8 = 0
            if (r0 == 0) goto L_0x032b
            java.lang.String r0 = "deleting MeJid status from ContactManager/deleteStatusesOnContactDeletion"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03bf }
            goto L_0x0372
        L_0x032b:
            X.0yC r2 = r6.A0H     // Catch:{ all -> 0x03bf }
            r0 = 7435(0x1d0b, float:1.0419E-41)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ all -> 0x03bf }
            boolean r0 = X.C20800yB.A01(r1, r2, r0)     // Catch:{ all -> 0x03bf }
            if (r0 != 0) goto L_0x0372
            r0 = 7202(0x1c22, float:1.0092E-41)
            boolean r0 = X.C20800yB.A01(r1, r2, r0)     // Catch:{ all -> 0x03bf }
            if (r0 == 0) goto L_0x0368
            X.005 r0 = r6.A0K     // Catch:{ all -> 0x03bf }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x03bf }
            X.1HT r0 = (X.AnonymousClass1HT) r0     // Catch:{ all -> 0x03bf }
            int r2 = r0.A01(r3)     // Catch:{ all -> 0x03bf }
        L_0x034b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x03bf }
            r1.<init>()     // Catch:{ all -> 0x03bf }
            r1.append(r2)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = " status of UserJid "
            r1.append(r0)     // Catch:{ all -> 0x03bf }
            r1.append(r3)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = " deleted."
            r1.append(r0)     // Catch:{ all -> 0x03bf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03bf }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03bf }
            goto L_0x036f
        L_0x0368:
            X.16E r0 = r6.A0E     // Catch:{ all -> 0x03bf }
            int r2 = r0.A06(r3)     // Catch:{ all -> 0x03bf }
            goto L_0x034b
        L_0x036f:
            if (r2 <= 0) goto L_0x0372
            r8 = 1
        L_0x0372:
            if (r22 != 0) goto L_0x0376
            if (r8 == 0) goto L_0x0141
        L_0x0376:
            r22 = 1
            goto L_0x0143
        L_0x037a:
            r7.add(r3)     // Catch:{ all -> 0x03bf }
            goto L_0x0143
        L_0x037f:
            r1 = move-exception
            if (r14 == 0) goto L_0x038a
            r14.close()     // Catch:{ all -> 0x0386 }
            goto L_0x038a
        L_0x0386:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x038b }
        L_0x038a:
            throw r1     // Catch:{ all -> 0x038b }
        L_0x038b:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0390:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03bf }
        L_0x0394:
            throw r1     // Catch:{ all -> 0x03bf }
        L_0x0395:
            if (r22 == 0) goto L_0x03a3
            android.os.Handler r2 = r6.A01     // Catch:{ all -> 0x03bf }
            r1 = 42
            X.1j4 r0 = new X.1j4     // Catch:{ all -> 0x03bf }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x03bf }
            r2.post(r0)     // Catch:{ all -> 0x03bf }
        L_0x03a3:
            int r0 = r7.size()     // Catch:{ all -> 0x03bf }
            if (r0 <= 0) goto L_0x03ac
            r6.A0m(r7)     // Catch:{ all -> 0x03bf }
        L_0x03ac:
            X.16p r1 = r6.A05     // Catch:{ all -> 0x03bf }
            r0 = r27
            r1.A0X(r0)     // Catch:{ all -> 0x03bf }
            r25.A00()     // Catch:{ all -> 0x03bf }
            r25.close()     // Catch:{ all -> 0x03c9 }
            r26.close()     // Catch:{ all -> 0x03d8 }
            if (r4 == 0) goto L_0x03d6
            goto L_0x03d3
        L_0x03bf:
            r1 = move-exception
            r25.close()     // Catch:{ all -> 0x03c4 }
            goto L_0x03c8
        L_0x03c4:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03c9 }
        L_0x03c8:
            throw r1     // Catch:{ all -> 0x03c9 }
        L_0x03c9:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x03ce }
            goto L_0x03d2
        L_0x03ce:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x03d8 }
        L_0x03d2:
            throw r1     // Catch:{ all -> 0x03d8 }
        L_0x03d3:
            r5.A0F()     // Catch:{ all -> 0x03d8 }
        L_0x03d6:
            monitor-exit(r5)     // Catch:{ all -> 0x03d8 }
            return
        L_0x03d8:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03d8 }
            throw r0
        L_0x03db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass196.A0N(java.util.Collection, java.util.Collection):void");
    }

    public void A0O(Collection collection, boolean z) {
        C1495671s B1k;
        if (!this.A06.A0L()) {
            synchronized (this) {
                boolean z2 = false;
                if (A0U(0)) {
                    if (((AnonymousClass2FS) this.A0T.A00("contact")) != null && A0S()) {
                        z2 = true;
                    }
                    Set hashSet = new HashSet();
                    Set hashSet2 = new HashSet();
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            AnonymousClass141 r2 = (AnonymousClass141) it.next();
                            UserJid userJid = (UserJid) r2.A06(UserJid.class);
                            if (userJid != null) {
                                if (r2.A0z) {
                                    arrayList.add(userJid);
                                } else {
                                    arrayList2.add(userJid);
                                }
                            }
                        }
                        Pair A002 = A00(this, arrayList, arrayList2);
                        hashSet = (Set) A002.first;
                        hashSet2 = (Set) A002.second;
                    }
                    AnonymousClass1M0 A042 = this.A0j.A04();
                    try {
                        B1k = A042.B1k();
                        AnonymousClass199 r1 = this.A0X;
                        r1.A0A("SYNC_MANAGER_CONTACTS_JID_ADDED", hashSet);
                        r1.A0A("SYNC_MANAGER_CONTACTS_JID_REMOVED", hashSet2);
                        if (z) {
                            this.A0L.A0j(collection);
                        } else {
                            this.A0L.A0l(collection);
                        }
                        B1k.A00();
                        B1k.close();
                        A042.close();
                        if (z2) {
                            A0F();
                        }
                    } catch (Throwable th) {
                        try {
                            A042.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    public boolean A0T() {
        if (this.A09.A04.A08()) {
            return true;
        }
        C25941Ig r1 = this.A0A;
        if (!r1.A00.A0L() || !C19980wp.A00(r1.A03).getBoolean("companion_syncd_dirty", false)) {
            return false;
        }
        return true;
    }

    public void BVW(C63133Iw r11) {
        if (this.A0P.A0A().size() == 1 && !this.A06.A0L()) {
            AnonymousClass1AB r8 = this.A0E;
            long A002 = C19970wo.A00(r8.A02);
            C237119n r9 = r8.A01;
            C237119n.A00(r9).edit().putLong("syncd_first_companion_reg_logging_time", A002).apply();
            long j = C237119n.A00(r9).getLong("syncd_last_companion_dereg_logging_time", 0);
            if (j != 0) {
                C237119n.A00(r9).edit().remove("syncd_last_companion_dereg_logging_time").apply();
                C44332Nc r1 = new C44332Nc();
                r1.A00 = Long.valueOf(A002 - j);
                r8.A06.Bly(r1);
            }
            A0E();
            A0G();
        }
    }

    public void BVa(C20760y7 r3) {
        if (!this.A06.A0L()) {
            this.A0W.Boy(new C35171iG(r3, this));
        }
    }

    public void BXE(C181018mn r4) {
        if (r4 instanceof C180998ml) {
            try {
                AnonymousClass1A9 r2 = this.A0I;
                C180998ml r42 = (C180998ml) r4;
                if (r42.A01 && !r2.A0B()) {
                    AnonymousClass1A9.A02(r2);
                    r2.A0A(new HashSet(r42.A1Z().values()));
                    this.A0W.Boy(new C35181iH(this));
                }
            } catch (AnonymousClass198 e) {
                A0K(Integer.valueOf(e.errorCode));
            }
        }
    }

    public void BYl() {
        this.A0W.Boz(new C35671j4(this, 31), "SyncManager/onHandlerConnected");
    }

    public void Biq() {
        AnonymousClass1AN r1 = this.A0K;
        synchronized (r1) {
            Set set = r1.A00;
            if (set != null) {
                set.clear();
            }
        }
        this.A0O.A05();
        SharedPreferences.Editor edit = C237119n.A00(this.A0G).edit();
        for (String remove : C237119n.A03) {
            edit.remove(remove);
        }
        edit.apply();
        AnonymousClass199 r2 = this.A0X;
        AnonymousClass199.A04(r2, "SYNC_MANAGER_CONTACTS_JID_ADDED", (String) null);
        AnonymousClass199.A04(r2, "SYNC_MANAGER_CONTACTS_JID_REMOVED", (String) null);
    }

    public void BkB(UserJid userJid, String str, String str2) {
        if (!this.A06.A0L() && str.isEmpty() && !str2.isEmpty()) {
            this.A0W.Boy(new C35671j4(this, 32));
        }
    }

    public Set A0C(Collection collection) {
        HashSet A0E2;
        if (!A0S()) {
            return Collections.emptySet();
        }
        AnonymousClass1AK r1 = this.A0J;
        synchronized (r1) {
            A0E2 = r1.A00.A0E(collection);
        }
        return A0E2;
    }

    public void A0E() {
        AnonymousClass8YB r0;
        if (A0S() && !this.A06.A0L() && (r0 = (AnonymousClass8YB) this.A0T.A00("primary_feature")) != null) {
            A0M(r0.A0J());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        if (r4.isEmpty() != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H() {
        /*
            r10 = this;
            boolean r0 = r10.A0T()
            if (r0 != 0) goto L_0x0195
            monitor-enter(r10)
            boolean r0 = r10.A03     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0190
            X.1IT r0 = r10.A0Q     // Catch:{ all -> 0x0192 }
            X.18P r0 = r0.A00     // Catch:{ all -> 0x0192 }
            X.1M0 r4 = r0.get()     // Catch:{ all -> 0x0192 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0184 }
            java.lang.String r2 = "SELECT collection_name FROM collection_versions WHERE dirty_version = 0 OR dirty_version > version"
            r1 = 0
            java.lang.String r0 = "CollectionVersionsTable.SELECT_DIRTY_COLLECTIONS"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0184 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ all -> 0x0178 }
            r5.<init>()     // Catch:{ all -> 0x0178 }
        L_0x0023:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0178 }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "collection_name"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0178 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0178 }
            r5.add(r0)     // Catch:{ all -> 0x0178 }
            goto L_0x0023
        L_0x0037:
            r2.close()     // Catch:{ all -> 0x0184 }
            r4.close()     // Catch:{ all -> 0x0192 }
            X.1AC r8 = r10.A0R     // Catch:{ all -> 0x0192 }
            boolean r0 = r8.A0J()     // Catch:{ all -> 0x0192 }
            r0 = r0 ^ 1
            r9 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x0073
            java.util.Set r0 = X.C201669k5.A09     // Catch:{ all -> 0x0192 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0192 }
            r1.<init>(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "critical_unblock_low"
            r1.remove(r0)     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r4 = r8.A0D(r1, r9)     // Catch:{ all -> 0x0192 }
            java.util.Set r2 = java.util.Collections.singleton(r0)     // Catch:{ all -> 0x0192 }
            X.0yf r1 = r10.A07     // Catch:{ all -> 0x0192 }
            X.0yh r0 = X.C21100yf.A1S     // Catch:{ all -> 0x0192 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x0192 }
            java.util.ArrayList r0 = r8.A0D(r2, r0)     // Catch:{ all -> 0x0192 }
            r4.addAll(r0)     // Catch:{ all -> 0x0192 }
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00b9
        L_0x0073:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            r4.<init>()     // Catch:{ all -> 0x0192 }
            X.18P r0 = r8.A00     // Catch:{ all -> 0x0192 }
            X.1M0 r6 = r0.get()     // Catch:{ all -> 0x0192 }
            X.14e r7 = r6.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = "SELECT _id, mutation_index, mutation_value, mutation_version, operation, device_id, epoch, are_dependencies_missing FROM pending_mutations WHERE is_ready_to_sync = 1  ORDER BY _id ASC  LIMIT ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00b0 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00b0 }
            r2[r1] = r0     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "PendingMutationsTable.SELECT_MUTATIONS_WITH_LIMIT"
            android.database.Cursor r2 = r7.A09(r3, r0, r2)     // Catch:{ all -> 0x00b0 }
        L_0x0092:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00a4 }
            if (r0 == 0) goto L_0x00a0
            X.9k5 r0 = X.AnonymousClass1AC.A00(r2, r8)     // Catch:{ all -> 0x00a4 }
            r4.add(r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x0092
        L_0x00a0:
            r2.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x00b6
        L_0x00a4:
            r1 = move-exception
            if (r2 == 0) goto L_0x00af
            r2.close()     // Catch:{ all -> 0x00ab }
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b0 }
        L_0x00af:
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x00b6:
            r6.close()     // Catch:{ all -> 0x0192 }
        L_0x00b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0192 }
            r1.<init>()     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "sync-manager/prepareAndSendRequest loaded "
            r1.append(r0)     // Catch:{ all -> 0x0192 }
            int r0 = r4.size()     // Catch:{ all -> 0x0192 }
            r1.append(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = " pending mutation(s)"
            r1.append(r0)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0192 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0192 }
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x0192 }
            r1 = 0
        L_0x00db:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x00db
            r2.remove()     // Catch:{ all -> 0x0192 }
            r1 = 1
            goto L_0x00db
        L_0x00ec:
            if (r1 == 0) goto L_0x00f6
            X.1AB r2 = r10.A0E     // Catch:{ all -> 0x0192 }
            r1 = 12
            r0 = 0
            r2.A08(r1, r0)     // Catch:{ all -> 0x0192 }
        L_0x00f6:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0103
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0103
            goto L_0x0176
        L_0x0103:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0192 }
            r3.<init>()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0192 }
        L_0x010c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x012e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0192 }
            X.9k5 r2 = (X.C201669k5) r2     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = r2.A06     // Catch:{ all -> 0x0192 }
            java.lang.Object r0 = r3.get(r1)     // Catch:{ all -> 0x0192 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x012a
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0192 }
            r0.<init>()     // Catch:{ all -> 0x0192 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0192 }
        L_0x012a:
            r0.add(r2)     // Catch:{ all -> 0x0192 }
            goto L_0x010c
        L_0x012e:
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0132:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x014a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0192 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0132
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0192 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0192 }
            goto L_0x0132
        L_0x014a:
            X.1A9 r0 = r10.A0I     // Catch:{ all -> 0x0192 }
            X.1AJ r0 = r0.A0A     // Catch:{ all -> 0x0192 }
            java.util.HashSet r0 = r0.A00()     // Catch:{ all -> 0x0192 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0192 }
        L_0x0156:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0164
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0192 }
            r3.remove(r0)     // Catch:{ all -> 0x0192 }
            goto L_0x0156
        L_0x0164:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0192 }
            if (r0 != 0) goto L_0x0176
            X.0wU r1 = r10.A0W     // Catch:{ all -> 0x0192 }
            X.1iG r0 = new X.1iG     // Catch:{ all -> 0x0192 }
            r0.<init>((X.AnonymousClass196) r10, (java.util.Map) r3)     // Catch:{ all -> 0x0192 }
            r1.Boy(r0)     // Catch:{ all -> 0x0192 }
            r0 = 1
            goto L_0x018e
        L_0x0176:
            r0 = 0
            goto L_0x018e
        L_0x0178:
            r1 = move-exception
            if (r2 == 0) goto L_0x0183
            r2.close()     // Catch:{ all -> 0x017f }
            goto L_0x0183
        L_0x017f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0184 }
        L_0x0183:
            throw r1     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0192 }
        L_0x018d:
            throw r1     // Catch:{ all -> 0x0192 }
        L_0x018e:
            r10.A03 = r0     // Catch:{ all -> 0x0192 }
        L_0x0190:
            monitor-exit(r10)     // Catch:{ all -> 0x0192 }
            return
        L_0x0192:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0192 }
            throw r0
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass196.A0H():void");
    }

    public void A0M(Collection collection) {
        if (A0S()) {
            this.A0J.A05(collection);
        }
    }

    public void A0P(Set set) {
        C1495671s B1k;
        if (!set.isEmpty()) {
            AnonymousClass1AK r4 = this.A0J;
            synchronized (r4) {
                AnonymousClass1M0 A042 = r4.A00.A00.A04();
                try {
                    B1k = A042.B1k();
                    AnonymousClass1AC.A07(A042.A02, (String[]) set.toArray(C19430v1.A0N));
                    B1k.A00();
                    B1k.close();
                    A042.close();
                } catch (Throwable th) {
                    try {
                        A042.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            return;
        }
        return;
        throw th;
    }

    public void A0Q(Set set) {
        if (!set.isEmpty()) {
            AnonymousClass1AK r1 = this.A0J;
            synchronized (r1) {
                r1.A00.A0I(set);
            }
            A0G();
        }
    }

    public boolean A0S() {
        Cursor A092;
        if (!A0T() && A0U(1)) {
            AnonymousClass1AC r1 = this.A0R;
            if (r1.A0J()) {
                return true;
            }
            AnonymousClass1M0 A032 = r1.A00.get();
            try {
                A092 = A032.A02.A09("SELECT _id FROM pending_mutations WHERE is_ready_to_sync = 1  LIMIT 1", "PendingMutationsTable.SELECT_ANY_MUTATION", (String[]) null);
                boolean z = false;
                if (A092.moveToNext() && A092.getString(A092.getColumnIndexOrThrow("_id")) != null) {
                    z = true;
                }
                A092.close();
                A032.close();
                if (z) {
                    return true;
                }
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
        return false;
        throw th;
    }

    public AnonymousClass196(C19700wN r4, C19730wQ r5, C21100yf r6, C25791Hr r7, C25901Ic r8, C25921Ie r9, C25911Id r10, C25941Ig r11, C25971Ij r12, AnonymousClass1C3 r13, C25771Hp r14, C25991Il r15, AnonymousClass1AB r16, AnonymousClass1IZ r17, C237119n r18, AnonymousClass1IR r19, AnonymousClass1IS r20, AnonymousClass1A9 r21, AnonymousClass1AK r22, C26011In r23, AnonymousClass1AN r24, AnonymousClass16D r25, AnonymousClass1A6 r26, C19980wp r27, C19970wo r28, AnonymousClass1IU r29, C220412q r30, AnonymousClass18P r31, C236419g r32, AnonymousClass1IT r33, AnonymousClass1AC r34, AnonymousClass1AM r35, C20810yC r36, AnonymousClass1AE r37, AnonymousClass19A r38, C236919l r39, AnonymousClass1AP r40, C19770wU r41, AnonymousClass199 r42, C229716r r43) {
        this.A0e = r28;
        this.A0g = r36;
        this.A05 = r4;
        this.A06 = r5;
        C19770wU r2 = r41;
        this.A0W = r2;
        this.A0N = r30;
        this.A07 = r6;
        this.A0O = r31;
        this.A0X = r42;
        this.A0U = r38;
        this.A0L = r25;
        this.A0I = r21;
        this.A0J = r22;
        this.A0E = r16;
        this.A0j = r43;
        this.A0h = r39;
        this.A0V = r40;
        this.A0Y = r7;
        this.A0B = r13;
        this.A0R = r34;
        this.A0H = r19;
        this.A0d = r26;
        this.A0b = r20;
        this.A0F = r17;
        this.A0Q = r33;
        this.A0P = r32;
        this.A0C = r14;
        this.A0f = r29;
        this.A0G = r18;
        this.A0T = r37;
        this.A08 = r8;
        this.A0Z = r10;
        this.A0S = r35;
        this.A09 = r9;
        this.A0A = r11;
        this.A0a = r12;
        this.A0D = r15;
        this.A0c = r23;
        this.A0K = r24;
        this.A0M = r27;
        this.A0i = new C19930wk(r2, false);
    }
}
