package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.ConditionVariable;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Jd  reason: invalid class name and case insensitive filesystem */
public class C26171Jd implements AnonymousClass00M {
    public final int A00;
    public final C19730wQ A01;
    public final AnonymousClass19J A02;
    public final AnonymousClass16D A03;
    public final C19970wo A04;
    public final AnonymousClass163 A05;
    public final C220412q A06;
    public final C20310xM A07;
    public final AnonymousClass1DQ A08;
    public final C219712j A09;
    public final C26201Jg A0A;
    public final C26181Je A0B;
    public final AnonymousClass12P A0C;
    public final C26361Jw A0D;
    public final C26231Jj A0E;
    public final C26311Jr A0F;
    public final C26261Jm A0G;
    public final C26291Jp A0H;
    public final C20170x8 A0I;
    public final AnonymousClass1A1 A0J;
    public final C19700wN A0K;
    public final AnonymousClass1G5 A0L;
    public final AnonymousClass1FE A0M;
    public final C26211Jh A0N;
    public final C26221Ji A0O;
    public final AnonymousClass1LR A0P;
    public final C25301Ft A0Q;
    public final C26241Jk A0R;
    public final C20810yC A0S;
    public final AnonymousClass1DL A0T;
    public final C26191Jf A0U;
    public final AnonymousClass1LQ A0V;
    public final C19770wU A0W;
    public volatile AnonymousClass1TM A0X;

    @Deprecated
    public static C191949Fc A03(UserJid userJid, UserJid userJid2, C000100b r14, String str, List list, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        String obj;
        boolean z = false;
        UserJid userJid3 = userJid;
        UserJid userJid4 = userJid2;
        String str2 = str;
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        if (!(bArr == null || bArr2 == null)) {
            byte[] bArr6 = bArr3;
            if (!(bArr3 == null || str == null || userJid == null || userJid4 == null)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(0);
                sb.append(userJid4.getRawString());
                byte[] A012 = AnonymousClass9Zd.A01(userJid3, userJid4, r14, str2, "Poll Vote", bArr6, bArr5, sb.toString().getBytes(C19430v1.A0D), bArr4);
                if (A012 == null) {
                    obj = "MessageAddOnPollVoteUtils/decryptPollVotePayload pollUpdateMessageContent is null";
                    Log.e(obj);
                    return null;
                }
                try {
                    return C200459hR.A01((AnonymousClass8NX) C170918Hz.A08(AnonymousClass8NX.DEFAULT_INSTANCE, A012), list, i);
                } catch (AnonymousClass186 unused) {
                    Log.e("MessageAddOnPollVoteUtils/decryptPollVoteMessage: failed to parse payload into protobuf");
                    return null;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageAddOnPollVoteUtils/decryptPollVotePayload one of the params is null messageSecret is null = ");
        boolean z2 = false;
        if (bArr == null) {
            z2 = true;
        }
        sb2.append(z2);
        sb2.append(" pollVoteEncPayload is null = ");
        boolean z3 = false;
        if (bArr2 == null) {
            z3 = true;
        }
        sb2.append(z3);
        sb2.append(" pollMessageId is null = ");
        boolean z4 = false;
        if (str == null) {
            z4 = true;
        }
        sb2.append(z4);
        sb2.append(" pollMessageId is null = ");
        boolean z5 = false;
        if (str == null) {
            z5 = true;
        }
        sb2.append(z5);
        sb2.append(" pollCreatorSenderJid is null = ");
        boolean z6 = false;
        if (userJid == null) {
            z6 = true;
        }
        sb2.append(z6);
        sb2.append(" pollVoteSenderJid is null = ");
        if (userJid4 == null) {
            z = true;
        }
        sb2.append(z);
        obj = sb2.toString();
        Log.e(obj);
        return null;
    }

    public static void A05(C26171Jd r5, AnonymousClass2bM r6) {
        AnonymousClass3T1 A002;
        if (Arrays.asList(new Integer[]{67}).contains(Integer.valueOf(r6.A1I)) && (A002 = C65733Tg.A00(r6, r5.A0J)) != null) {
            Message.obtain(r5.A08.A02, 14, A01(r6), 0, A002).sendToTarget();
        }
    }

    public int A07(C64933Qa r6) {
        Cursor A042;
        int i = -1;
        AnonymousClass1M0 A043 = this.A0C.get();
        try {
            A042 = this.A0I.A04(A043, r6);
            int columnIndexOrThrow = A042.getColumnIndexOrThrow("message_add_on_type");
            if (!A042.moveToNext()) {
                Log.w("MessageAddOnManager/getMessageAddOnForMessageKey message add on not found");
            } else {
                i = A042.getInt(columnIndexOrThrow);
            }
            A042.close();
            A043.close();
            return i;
        } catch (Throwable th) {
            try {
                A043.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public AnonymousClass3T1 A08(C64933Qa r4) {
        AnonymousClass2bM A0B2;
        if (r4 == null || (A0B2 = A0B(r4)) == null) {
            return null;
        }
        AnonymousClass1A1 r0 = this.A0J;
        return r0.A01.A01(A0B2.A01);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0075=Splitter:B:30:0x0075, B:26:0x006e=Splitter:B:26:0x006e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass2bM A0A(X.C64933Qa r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0092
            X.11F r0 = r9.A00
            if (r0 == 0) goto L_0x0092
            X.12P r0 = r8.A0C
            X.1M0 r4 = r0.get()
            X.0x8 r5 = r8.A0I     // Catch:{ all -> 0x0088 }
            android.database.Cursor r6 = r5.A04(r4, r9)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "_id"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "message_add_on_type"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007c }
            boolean r1 = r6.moveToNext()     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "MessageAddOnManager/getMessageAddOnForMessageKey message add on not found"
            if (r1 != 0) goto L_0x002b
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x007c }
            goto L_0x0075
        L_0x002b:
            long r1 = r6.getLong(r2)     // Catch:{ all -> 0x007c }
            int r0 = r6.getInt(r3)     // Catch:{ all -> 0x007c }
            r6.close()     // Catch:{ all -> 0x0088 }
            android.database.Cursor r6 = r5.A02(r4, r0, r1)     // Catch:{ all -> 0x0088 }
            java.util.HashMap r1 = X.C65733Tg.A01(r6, r0)     // Catch:{ all -> 0x007c }
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0075
            X.2bM r5 = r5.A05(r6, r1)     // Catch:{ all -> 0x007c }
            if (r5 != 0) goto L_0x0050
            java.lang.String r0 = "MessageAddOnManager/getMessageAddOnForMessageKey failed to read fmessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x007c }
            goto L_0x0075
        L_0x0050:
            X.12j r0 = r8.A09     // Catch:{ all -> 0x007c }
            r5.A1c(r6, r0, r1)     // Catch:{ all -> 0x007c }
            boolean r0 = r5 instanceof X.C180858mX     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x006e
            X.1Jm r0 = r8.A0G     // Catch:{ all -> 0x007c }
            r3 = r5
            X.8mX r3 = (X.C180858mX) r3     // Catch:{ all -> 0x007c }
            X.1Jo r2 = r0.A07     // Catch:{ all -> 0x007c }
            long r0 = r3.A1N     // Catch:{ all -> 0x007c }
            java.util.ArrayList r1 = r2.A00(r0)     // Catch:{ all -> 0x007c }
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x007c }
            r0.clear()     // Catch:{ all -> 0x007c }
            r0.addAll(r1)     // Catch:{ all -> 0x007c }
        L_0x006e:
            r6.close()     // Catch:{ all -> 0x0088 }
            r4.close()
            return r5
        L_0x0075:
            r6.close()     // Catch:{ all -> 0x0088 }
            r4.close()
            return r7
        L_0x007c:
            r1 = move-exception
            if (r6 == 0) goto L_0x0087
            r6.close()     // Catch:{ all -> 0x0083 }
            goto L_0x0087
        L_0x0083:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0088 }
        L_0x0087:
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x008d }
            throw r1
        L_0x008d:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0092:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26171Jd.A0A(X.3Qa):X.2bM");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r7 = (X.AnonymousClass2bS) r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(X.AnonymousClass3T1 r11) {
        /*
            r10 = this;
            r2 = 1
            boolean r0 = r11.A1S(r2)
            r8 = 17
            if (r0 == 0) goto L_0x0029
            X.4Uq r0 = r11.A0J
            if (r0 == 0) goto L_0x0029
            java.util.Collection r0 = r0.B8Y()
            java.util.Iterator r3 = r0.iterator()
        L_0x0015:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r3.next()
            X.2bM r1 = (X.AnonymousClass2bM) r1
            r1.A0n(r8)
            r0 = 0
            A00(r10, r1, r0)
            goto L_0x0015
        L_0x0029:
            boolean r0 = r11 instanceof X.AnonymousClass2bS
            if (r0 == 0) goto L_0x0088
            r7 = r11
            X.2bS r7 = (X.AnonymousClass2bS) r7
            java.util.List r0 = r7.A04
            if (r0 == 0) goto L_0x0088
            java.util.Iterator r9 = r0.iterator()
        L_0x0038:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r6 = r9.next()
            X.2bM r6 = (X.AnonymousClass2bM) r6
            r6.A0n(r8)
            r5 = r6
            X.8mX r5 = (X.C180858mX) r5
            java.util.List r1 = r5.A01
            java.util.List r4 = r7.A05
            if (r1 != 0) goto L_0x0055
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0055:
            int r0 = r1.size()
            if (r0 != 0) goto L_0x006c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0060:
            java.util.List r0 = r5.A06
            r0.clear()
            r0.addAll(r1)
            A00(r10, r6, r2)
            goto L_0x0038
        L_0x006c:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r1.next()
            r3.add(r0)
            goto L_0x0075
        L_0x0083:
            java.util.ArrayList r1 = X.C200459hR.A02(r4, r3)
            goto L_0x0060
        L_0x0088:
            boolean r0 = r11 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x00a9
            r0 = r11
            X.2bT r0 = (X.AnonymousClass2bT) r0
            java.util.List r0 = r0.A1X()
            if (r0 == 0) goto L_0x00a9
            java.util.Iterator r1 = r0.iterator()
        L_0x0099:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r0 = r1.next()
            X.2bM r0 = (X.AnonymousClass2bM) r0
            A00(r10, r0, r2)
            goto L_0x0099
        L_0x00a9:
            r0 = 131072(0x20000, float:1.83671E-40)
            boolean r0 = r11.A1T(r0)
            if (r0 == 0) goto L_0x00cf
            X.1Ji r0 = r10.A0O
            android.util.Pair r0 = r0.A01(r11)
            java.lang.Object r0 = r0.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x00cf
            java.lang.String r0 = "MessageAddOnManager/Unable to insert message into msgstore.db.message_add_on"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0wN r3 = r10.A0K
            r2 = 0
            r1 = 0
            java.lang.String r0 = "MessageAddOnManager/Unable to write FMessageEdit to DB"
            r3.A0E(r0, r2, r1)
        L_0x00cf:
            r0 = 4
            boolean r0 = r11.A1S(r0)
            if (r0 == 0) goto L_0x00de
            X.2bc r1 = r11.A1U
            if (r1 == 0) goto L_0x00de
            r0 = 0
            A00(r10, r1, r0)
        L_0x00de:
            r0 = 8
            boolean r0 = r11.A1S(r0)
            if (r0 == 0) goto L_0x00ee
            X.5J2 r1 = r11.A1V
            if (r1 == 0) goto L_0x00ee
            r0 = 0
            A00(r10, r1, r0)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26171Jd.A0J(X.3T1):void");
    }

    public static int A01(AnonymousClass2bM r1) {
        int i;
        boolean z;
        if (r1 instanceof C180868mY) {
            i = 27;
        } else if (r1 instanceof C46752bc) {
            i = 30;
        } else if (r1 instanceof AnonymousClass5J2) {
            i = 34;
        } else if (r1 instanceof C180858mX) {
            i = 32;
        } else if (r1 instanceof C46732ba) {
            i = 9;
        } else if (r1 instanceof C46742bb) {
            i = 37;
        } else {
            boolean z2 = r1 instanceof C46762bd;
            i = 41;
            if (!z2) {
                i = -1;
                z = false;
                C18740tg.A0B(z);
                return i;
            }
        }
        z = true;
        C18740tg.A0B(z);
        return i;
    }

    public static HashSet A04(C26901Ly r8, C26171Jd r9, int i, long j, long j2, boolean z) {
        String[] strArr;
        C224114e r5;
        String A022;
        String str;
        HashSet hashSet = new HashSet();
        C20170x8 r3 = r9.A0I;
        if (!z) {
            strArr = new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(C19970wo.A00(r3.A00)), String.valueOf(0)};
            r5 = ((AnonymousClass1M0) r8).A02;
            String str2 = AnonymousClass3TN.A01;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass3TN.A02(i));
            sb.append(" AND ");
            sb.append("message_add_on.status = ?");
            A022 = sb.toString();
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJid";
        } else {
            strArr = new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(C19970wo.A00(r3.A00))};
            r5 = ((AnonymousClass1M0) r8).A02;
            A022 = AnonymousClass3TN.A02(i);
            str = "MessageAddOnStore/getSelectUnreadMessageAddOnForJidAndIgnoreStatus";
        }
        Cursor A092 = r5.A09(A022, str, strArr);
        try {
            HashMap A012 = C65733Tg.A01(A092, i);
            while (A092.moveToNext()) {
                AnonymousClass2bM A052 = r3.A05(A092, A012);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getUnreadMessageAddOnForAddOnType unexpected fmessage");
                } else {
                    A052.A1c(A092, r9.A09, A012);
                    hashSet.add(A052);
                }
            }
            A092.close();
            return hashSet;
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    private void A06(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 r2 = (AnonymousClass3T1) it.next();
            if (!C66013Ui.A0R(this.A01, r2)) {
                hashSet.add(r2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageAddOnManager/filterOutSelfReactionsAndSendReadSefReceipts this msg should not be part of the set ");
                sb.append(r2.A1J);
                Log.w(sb.toString());
            }
        }
        this.A0T.A0G(AnonymousClass1DL.A03(hashSet));
    }

    public AnonymousClass2bM A09(C26901Ly r8, long j) {
        AnonymousClass2bM r6;
        Cursor A022;
        C20170x8 r2 = this.A0I;
        Cursor A092 = ((AnonymousClass1M0) r8).A02.A09(AnonymousClass3TN.A04, "MessageAddOnStore/getMessageAddOnTypeForRowId", new String[]{String.valueOf(j), String.valueOf(C19970wo.A00(r2.A00))});
        try {
            int columnIndexOrThrow = A092.getColumnIndexOrThrow("message_add_on_type");
            if (!A092.moveToNext()) {
                Log.w("MessageAddOnManager/getMessageAddOn message add on not found");
                r6 = null;
            } else {
                int i = A092.getInt(columnIndexOrThrow);
                A022 = r2.A02(r8, i, j);
                HashMap A012 = C65733Tg.A01(A022, i);
                r6 = null;
                if (!A022.moveToNext()) {
                    Log.e("MessageAddOnManager/getMessageAddOn couldn't collect data for message add on");
                } else {
                    AnonymousClass2bM A052 = r2.A05(A022, A012);
                    if (A052 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOn couldn't load message add on from cursor");
                    } else {
                        A052.A1c(A022, this.A09, A012);
                        AnonymousClass1A1 r0 = this.A0J;
                        AnonymousClass3T1 A013 = r0.A01.A01(A052.A01);
                        if (A013 == null) {
                            Log.e("MessageAddOnManager/getMessageAddOn parent message missing");
                        } else {
                            A052.A04 = new C195759Vv(A013.A0J(), A013.A1J);
                            A022.close();
                            r6 = A052;
                        }
                    }
                }
                A022.close();
            }
            A092.close();
            return r6;
        } catch (Throwable th) {
            if (A092 != null) {
                try {
                    A092.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw th;
        }
        throw th;
    }

    public AnonymousClass35M A0C(AnonymousClass11F r3) {
        C65073Qp A092 = this.A06.A09(r3, false);
        if (A092 != null) {
            return A092.A0f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageAddOnManager/getLastChatsListCachedDisplayedMessageAddOnV2/no chat for ");
        sb.append(r3);
        Log.w(sb.toString());
        return null;
    }

    public AnonymousClass35M A0D(AnonymousClass11F r7) {
        AnonymousClass3T1 A032;
        if (r7 == null) {
            Log.e("MessageAddOnManager/getChatInfo/jid is null");
        } else {
            C65073Qp A092 = this.A06.A09(r7, false);
            if (A092 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageAddOnManager/getChatInfo/no chat for ");
                sb.append(r7);
                Log.w(sb.toString());
            } else {
                AnonymousClass35M r0 = A092.A0f;
                if (r0 != null) {
                    return r0;
                }
                if (A092.A01() > 0) {
                    AnonymousClass1M0 A042 = this.A0C.get();
                    try {
                        AnonymousClass2bM A093 = A09(A042, A092.A01());
                        AnonymousClass35M r2 = null;
                        if (!(A093 == null || !A0N(A093) || (A032 = this.A0J.A03(A093.A1Z())) == null)) {
                            r2 = new AnonymousClass35M(A032, A093);
                        }
                        A092.A0f = r2;
                        A042.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                        throw th;
                    }
                }
                return A092.A0f;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageAddOnManager/getLastChatsListDisplayedMessageAddOnPreview/no chat for ");
        sb2.append(r7);
        Log.w(sb2.toString());
        return null;
    }

    public ArrayList A0E(AnonymousClass3T1 r11, int i) {
        Cursor A012;
        ArrayList arrayList = new ArrayList();
        AnonymousClass1M0 A042 = this.A0C.get();
        try {
            C20170x8 r5 = this.A0I;
            A012 = r5.A01(A042, i, r11.A1N);
            HashMap A013 = C65733Tg.A01(A012, i);
            while (A012.moveToNext()) {
                AnonymousClass2bM A052 = r5.A05(A012, A013);
                if (A052 == null) {
                    Log.e("MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage");
                } else {
                    boolean z = A052 instanceof C180858mX;
                    if (!z || (r11 instanceof AnonymousClass2bS)) {
                        A052.A1c(A012, this.A09, A013);
                        A052.A04 = new C195759Vv(r11.A0J(), r11.A1J);
                        if (z) {
                            C180858mX r3 = (C180858mX) A052;
                            ArrayList A002 = this.A0G.A07.A00(r3.A1N);
                            List list = r3.A06;
                            list.clear();
                            list.addAll(A002);
                            C26261Jm.A01((AnonymousClass2bS) r11, r3);
                        }
                        arrayList.add(A052);
                    } else {
                        Log.e("MessageAddOnManager/getMessageAddOnForParentMessage parent is not poll for poll vote");
                    }
                }
            }
            A012.close();
            A042.close();
            return arrayList;
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

    /* JADX INFO: finally extract failed */
    public List A0F(AnonymousClass11F r24) {
        AnonymousClass11F r6 = r24;
        C65073Qp A092 = this.A06.A09(r6, false);
        if (A092 == null || A092.A01() == A092.A02()) {
            return new ArrayList();
        }
        long A082 = this.A05.A08(r6);
        long A022 = A092.A02();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A042 = this.A0C.get();
        try {
            C20170x8 r62 = this.A0I;
            C224114e r3 = A042.A02;
            String str = AnonymousClass3TN.A00;
            String valueOf = String.valueOf(A082);
            String valueOf2 = String.valueOf(0);
            String valueOf3 = String.valueOf(A022);
            C19970wo r22 = r62.A00;
            Cursor A093 = r3.A09(str, "MessageAddOnStore/getMessageAddOnKeepInChatInfoCursorForNotification", new String[]{valueOf, valueOf2, valueOf3, String.valueOf(C19970wo.A00(r22)), String.valueOf(7)});
            try {
                int columnIndex = A093.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A093.getColumnIndex("parent_message_row_id");
                while (A093.moveToNext()) {
                    long j = A093.getLong(columnIndex2);
                    Cursor A023 = r62.A02(A042, 68, A093.getLong(columnIndex));
                    try {
                        HashMap A012 = C65733Tg.A01(A023, 68);
                        AnonymousClass37G r11 = null;
                        if (!A023.moveToNext()) {
                            Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview couldn't collect data for message add on");
                        } else {
                            AnonymousClass2bM A052 = r62.A05(A023, A012);
                            if (!(A052 instanceof C46752bc)) {
                                Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview unexpected fmessage");
                            } else {
                                C46752bc r12 = (C46752bc) A052;
                                r12.A1c(A023, this.A09, A012);
                                AnonymousClass1A1 r15 = this.A0J;
                                AnonymousClass3T1 A013 = r15.A01.A01(r12.A01);
                                if (A013 == null) {
                                    Log.e("MessageAddOnManager/createMessageAddOnKeepInChatPreview parent message missing");
                                } else {
                                    A052.A04 = new C195759Vv(A013.A0J(), A013.A1J);
                                    r11 = new AnonymousClass37G(A013, r12);
                                }
                            }
                        }
                        A023.close();
                        if (r11 != null && r11.A00.A1J.A02) {
                            linkedList.addFirst(r11);
                            hashMap.put(Long.valueOf(j), r11);
                        }
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
                if (!hashMap.keySet().isEmpty()) {
                    Set<Long> keySet = hashMap.keySet();
                    boolean z = false;
                    if (keySet.size() > 0) {
                        z = true;
                    }
                    C18740tg.A0B(z);
                    String[] strArr = new String[(keySet.size() + 4)];
                    strArr[0] = valueOf;
                    strArr[1] = valueOf2;
                    int i = 3;
                    strArr[2] = valueOf3;
                    for (Long longValue : keySet) {
                        strArr[i] = String.valueOf(longValue.longValue());
                        i++;
                    }
                    strArr[i] = String.valueOf(C19970wo.A00(r22));
                    Cursor A094 = r3.A09(AnonymousClass3TN.A03(keySet.size(), 68), "MessageAddOnStore/getMessageAddOnKeepInChatSendersCursorForNotification", strArr);
                    try {
                        int columnIndex3 = A094.getColumnIndex("parent_message_row_id");
                        int columnIndex4 = A094.getColumnIndex("sender_jid_row_id");
                        while (A094.moveToNext()) {
                            long j2 = A094.getLong(columnIndex3);
                            long j3 = A094.getLong(columnIndex4);
                            AnonymousClass37G r0 = (AnonymousClass37G) hashMap.get(Long.valueOf(j2));
                            C18740tg.A06(r0);
                            r0.A02.add(Long.valueOf(j3));
                        }
                        A094.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                A093.close();
                A042.close();
                return linkedList;
            } catch (Throwable th3) {
                if (A093 != null) {
                    A093.close();
                }
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A042.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
        throw th;
    }

    public List A0G(AnonymousClass11F r23, int i) {
        Cursor A092;
        AnonymousClass3T1 A032;
        AnonymousClass11F r6 = r23;
        C65073Qp A093 = this.A06.A09(r6, false);
        if (A093 == null || A093.A01() == A093.A02()) {
            return new ArrayList();
        }
        long A082 = this.A05.A08(r6);
        long A022 = A093.A02();
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        AnonymousClass1M0 A042 = this.A0C.get();
        try {
            C20170x8 r1 = this.A0I;
            C224114e r3 = A042.A02;
            int i2 = i;
            String A012 = AnonymousClass3TN.A01(i2);
            String valueOf = String.valueOf(A082);
            String valueOf2 = String.valueOf(0);
            String valueOf3 = String.valueOf(A022);
            C19970wo r7 = r1.A00;
            Cursor A094 = r3.A09(A012, "MessageAddOnStore/getMessageAddOnInfoCursorForNotification", new String[]{valueOf, valueOf2, valueOf3, String.valueOf(C19970wo.A00(r7)), String.valueOf(7)});
            try {
                int columnIndex = A094.getColumnIndex("last_message_add_on_row_id");
                int columnIndex2 = A094.getColumnIndex("unread_count");
                int columnIndex3 = A094.getColumnIndex("parent_message_row_id");
                while (A094.moveToNext()) {
                    long j = A094.getLong(columnIndex3);
                    long j2 = A094.getLong(columnIndex);
                    int i3 = A094.getInt(columnIndex2);
                    AnonymousClass2bM A095 = A09(A042, j2);
                    C605638i r12 = null;
                    if (!(A095 == null || (A032 = this.A0J.A03(A095.A1Z())) == null)) {
                        r12 = new C605638i(A032, A095, i3);
                    }
                    if (r12 != null && r12.A01.A1J.A02) {
                        linkedList.addFirst(r12);
                        hashMap.put(Long.valueOf(j), r12);
                    }
                }
                if (!hashMap.keySet().isEmpty()) {
                    Set<Long> keySet = hashMap.keySet();
                    boolean z = false;
                    if (keySet.size() > 0) {
                        z = true;
                    }
                    C18740tg.A0B(z);
                    String[] strArr = new String[(keySet.size() + 4)];
                    strArr[0] = valueOf;
                    strArr[1] = valueOf2;
                    int i4 = 3;
                    strArr[2] = valueOf3;
                    for (Long longValue : keySet) {
                        strArr[i4] = String.valueOf(longValue.longValue());
                        i4++;
                    }
                    strArr[i4] = String.valueOf(C19970wo.A00(r7));
                    A092 = r3.A09(AnonymousClass3TN.A03(keySet.size(), i2), "MessageAddOnStore/getMessageAddOnSendersCursorForNotification", strArr);
                    int columnIndex4 = A092.getColumnIndex("parent_message_row_id");
                    int columnIndex5 = A092.getColumnIndex("sender_jid_row_id");
                    while (A092.moveToNext()) {
                        long j3 = A092.getLong(columnIndex4);
                        long j4 = A092.getLong(columnIndex5);
                        C605638i r0 = (C605638i) hashMap.get(Long.valueOf(j3));
                        C18740tg.A06(r0);
                        r0.A03.add(Long.valueOf(j4));
                    }
                    A092.close();
                }
                A094.close();
                A042.close();
                return linkedList;
            } catch (Throwable th) {
                if (A094 != null) {
                    A094.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
    }

    public void A0H(AnonymousClass11F r7, int i, int i2, long j) {
        if (C65733Tg.A00.contains(Integer.valueOf(i))) {
            AnonymousClass163 r5 = this.A05;
            C65073Qp A092 = r5.A00.A09(r7, false);
            if (A092 != null && j >= 1) {
                if (A092.A0M < j) {
                    A092.A0M = j;
                }
                int i3 = A092.A07 + i2;
                A092.A07 = i3;
                if (i3 < 0) {
                    A092.A07 = 0;
                }
                r5.A0F(A092);
            }
        }
    }

    public void A0I(AnonymousClass11F r3, AnonymousClass35M r4) {
        C65073Qp A092 = this.A06.A09(r3, false);
        if (A092 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/last/message/no chat for ");
            sb.append(r3);
            Log.w(sb.toString());
            return;
        }
        A092.A0f = r4;
    }

    public void A0K(AnonymousClass2bM r2) {
        if (r2 instanceof AnonymousClass5J2) {
            this.A0F.A03((AnonymousClass5J2) r2);
        }
    }

    public void A0L(AnonymousClass2bM r19, long j) {
        long j2;
        Long valueOf;
        C1495671s B1k;
        String str;
        AnonymousClass2bM r5 = r19;
        r5.A0n(4);
        r5.A1b(j);
        C20170x8 r7 = this.A0I;
        ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp", Long.valueOf(r5.A02));
        if (r5.A1d()) {
            j2 = r5.A00;
        } else {
            j2 = 0;
        }
        Integer num = null;
        if (j2 <= 0) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(j2);
        }
        contentValues.put("expiry_timestamp", valueOf);
        int A1X = r5.A1X();
        if (A1X > 0) {
            num = Integer.valueOf(A1X);
        }
        contentValues.put("expiry_duration_in_secs", num);
        contentValues.put("status", Integer.valueOf(r5.A0D));
        C64933Qa r9 = r5.A1J;
        AnonymousClass1M0 A052 = r7.A03.A05();
        try {
            B1k = A052.B1k();
            String[] strArr = new String[3];
            AnonymousClass163 r2 = r7.A01;
            AnonymousClass11F r72 = r9.A00;
            C18740tg.A06(r72);
            strArr[0] = String.valueOf(r2.A08(r72));
            if (r9.A02) {
                str = "1";
            } else {
                str = "0";
            }
            strArr[1] = str;
            strArr[2] = r9.A01;
            A052.A02.A01(contentValues, "message_add_on", "chat_row_id = ? AND from_me = ? AND key_id = ?", "MessageAddOnStore/updateMessageAddOnUsingKey", strArr);
            B1k.A00();
            B1k.close();
            A052.close();
            A05(this, r5);
            if ((r5 instanceof AnonymousClass5J2) && !this.A01.A0M(r72) && j == r5.A02) {
                this.A0F.A03((AnonymousClass5J2) r5);
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A0M(Map map, Set set) {
        this.A0I.A09(set, 17);
        for (Map.Entry entry : map.entrySet()) {
            this.A05.A0J((AnonymousClass11F) entry.getKey(), ((Number) entry.getValue()).longValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r1 != 93) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0N(X.AnonymousClass2bM r4) {
        /*
            r3 = this;
            int r1 = r4.A1I
            r0 = 56
            r2 = 0
            if (r1 == r0) goto L_0x0034
            r0 = 67
            if (r1 == r0) goto L_0x0014
            r0 = 74
            if (r1 == r0) goto L_0x0019
            r0 = 93
            if (r1 == r0) goto L_0x0034
        L_0x0013:
            return r2
        L_0x0014:
            X.0yC r2 = r3.A0S
            r1 = 2720(0xaa0, float:3.812E-42)
            goto L_0x002d
        L_0x0019:
            X.1A1 r1 = r3.A0J
            X.3Qa r0 = r4.A1Z()
            X.3T1 r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0 instanceof X.AnonymousClass2bT
            if (r0 == 0) goto L_0x0013
            X.0yC r2 = r3.A0S
            r1 = 7358(0x1cbe, float:1.0311E-41)
        L_0x002d:
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            return r0
        L_0x0034:
            X.3Qa r0 = r4.A1J
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0045
            X.3Qa r0 = r4.A1Z()
            X.C18740tg.A06(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0013
        L_0x0045:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26171Jd.A0N(X.2bM):boolean");
    }

    public C26171Jd(C19700wN r4, C19730wQ r5, AnonymousClass19J r6, AnonymousClass16D r7, AnonymousClass1G5 r8, C19970wo r9, AnonymousClass163 r10, C220412q r11, C20310xM r12, AnonymousClass1DQ r13, C219712j r14, AnonymousClass1FE r15, C26201Jg r16, C26181Je r17, AnonymousClass12P r18, C26211Jh r19, C26221Ji r20, C26361Jw r21, C26231Jj r22, C26311Jr r23, C26261Jm r24, C26291Jp r25, AnonymousClass1LR r26, C20170x8 r27, C25301Ft r28, C26241Jk r29, C20810yC r30, AnonymousClass1DL r31, C26191Jf r32, AnonymousClass1LQ r33, AnonymousClass1A1 r34, C19770wU r35) {
        ConditionVariable conditionVariable = C18740tg.A00;
        this.A04 = r9;
        C20810yC r2 = r30;
        this.A0S = r2;
        this.A09 = r14;
        this.A05 = r10;
        this.A01 = r5;
        this.A0W = r35;
        this.A06 = r11;
        this.A0K = r4;
        this.A03 = r7;
        this.A08 = r13;
        this.A02 = r6;
        this.A0J = r34;
        this.A0I = r27;
        this.A0Q = r28;
        this.A0B = r17;
        this.A0T = r31;
        this.A0U = r32;
        this.A0M = r15;
        this.A0C = r18;
        this.A0N = r19;
        this.A0A = r16;
        this.A07 = r12;
        this.A0O = r20;
        this.A0E = r22;
        this.A0R = r29;
        this.A0G = r24;
        this.A0H = r25;
        this.A0F = r23;
        this.A0D = r21;
        this.A0L = r8;
        this.A0V = r33;
        this.A0P = r26;
        this.A00 = C20800yB.A00(C21000yV.A02, r2, 987);
    }

    public static long A02(C26171Jd r14, Set set) {
        C1495671s B1k;
        long j = -1;
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                AnonymousClass3T1 r6 = (AnonymousClass3T1) it.next();
                if (j < r6.A1N) {
                    j = r6.A1N;
                }
                hashSet.add(Long.valueOf(r6.A1N));
            }
            if (!hashSet.isEmpty()) {
                C20170x8 r7 = r14.A0I;
                if (!hashSet.isEmpty()) {
                    AnonymousClass72Z r4 = new AnonymousClass72Z(C65733Tg.A04(hashSet), 975);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("status", 17);
                    AnonymousClass1M0 A052 = r7.A03.A05();
                    try {
                        B1k = A052.B1k();
                        Iterator it2 = r4.iterator();
                        while (it2.hasNext()) {
                            String[] strArr = (String[]) it2.next();
                            StringBuilder sb = new StringBuilder();
                            sb.append("_id IN ");
                            sb.append(AnonymousClass1M2.A00(strArr.length));
                            A052.A02.A01(contentValues, "message_add_on", sb.toString(), "MessageAddOnStore/updateMessageAddOnsStatus", strArr);
                        }
                        B1k.A00();
                        B1k.close();
                        A052.close();
                    } catch (Throwable th) {
                        try {
                            A052.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            }
            hashSet.size();
            r14.A06(set);
        }
        return j;
        throw th;
    }

    public AnonymousClass2bM A0B(C64933Qa r8) {
        UserJid A0L2;
        AnonymousClass2bM A0A2 = A0A(r8);
        if (A0A2 == null) {
            return null;
        }
        AnonymousClass3T1 A012 = this.A0J.A01.A01(A0A2.A01);
        if (A012 == null && !(A0A2 instanceof C46742bb)) {
            return null;
        }
        C26191Jf r5 = this.A0U;
        AnonymousClass3T1 A013 = ((AnonymousClass1A1) r5.A00.get()).A01.A01(A0A2.A01);
        if (A013 != null) {
            C64933Qa r0 = A013.A1J;
            AnonymousClass00C.A07(r0);
            C64933Qa A022 = r5.A02(r0);
            if (A022 != null) {
                if (A012 == null) {
                    A0L2 = null;
                } else {
                    A0L2 = A012.A0L();
                }
                A0A2.A04 = new C195759Vv(A0L2, A022);
                if (A0A2 instanceof C180868mY) {
                    A0A2.A03 = C183338qd.A01(A012);
                } else if (A0A2 instanceof C180858mX) {
                    C180858mX r1 = (C180858mX) A0A2;
                    if (!(A012 instanceof AnonymousClass2bS)) {
                        Log.i("MessageAddOn/getMessageAddOnForMessageKeyForSend/missing parent message");
                        return null;
                    }
                    C26261Jm.A01((AnonymousClass2bS) A012, r1);
                    return A0A2;
                }
                return A0A2;
            }
        }
        Log.e("MessageAddOnManager/getMessageAddOnForMessageKeyForSend/parent reference key was not found");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: X.2bS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: X.5J2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: X.2bT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.2bS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.2bS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v33, resolved type: X.1Jw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.2bT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: X.2bT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v40, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v42, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v43, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v44, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: X.5J2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v50, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: X.1Jr} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v46, resolved type: X.2bc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: X.2bT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: X.2bT} */
    /* JADX WARNING: type inference failed for: r6v7, types: [X.3T1, X.2bJ, X.2c9] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 1003 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x040c A[Catch:{ all -> 0x075b, all -> 0x0b4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0467 A[Catch:{ all -> 0x075b, all -> 0x0b4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x046a A[Catch:{ all -> 0x075b, all -> 0x0b4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x04e6 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x04e7 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x04f0 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0500 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x0511 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x052b A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x05a6 A[Catch:{ all -> 0x075b, all -> 0x0b4b }] */
    /* JADX WARNING: Removed duplicated region for block: B:417:0x06ad A[SYNTHETIC, Splitter:B:417:0x06ad] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x06d1 A[Catch:{ all -> 0x074c, all -> 0x0751, all -> 0x0756 }] */
    /* JADX WARNING: Removed duplicated region for block: B:429:0x06f0 A[SYNTHETIC, Splitter:B:429:0x06f0] */
    /* JADX WARNING: Removed duplicated region for block: B:518:0x088d A[SYNTHETIC, Splitter:B:518:0x088d] */
    /* JADX WARNING: Removed duplicated region for block: B:533:0x08c3 A[Catch:{ all -> 0x0a2d }] */
    /* JADX WARNING: Removed duplicated region for block: B:536:0x08df A[SYNTHETIC, Splitter:B:536:0x08df] */
    /* JADX WARNING: Removed duplicated region for block: B:863:0x0d85 A[Catch:{ all -> 0x0c21, all -> 0x0df9 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:212:0x0323=Splitter:B:212:0x0323, B:717:0x0b45=Splitter:B:717:0x0b45, B:639:0x0a46=Splitter:B:639:0x0a46, B:857:0x0d66=Splitter:B:857:0x0d66, B:426:0x06ed=Splitter:B:426:0x06ed, B:267:0x03ff=Splitter:B:267:0x03ff} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:445:0x0744=Splitter:B:445:0x0744, B:422:0x06e7=Splitter:B:422:0x06e7} */
    public static int A00(X.C26171Jd r27, X.AnonymousClass2bM r28, boolean r29) {
        /*
            r4 = r28
            r5 = 1
            r2 = 6
            r7 = r27
            if (r29 != 0) goto L_0x001f
            boolean r0 = r4 instanceof X.AnonymousClass5J1
            if (r0 == 0) goto L_0x001f
            X.0x8 r0 = r7.A0I
            long r6 = r0.A00(r4)
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0019
            return r5
        L_0x0019:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn placeholder message did not get stored"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x001f:
            X.3Qa r10 = r4.A1Z()
            if (r10 != 0) goto L_0x002c
            java.lang.String r1 = "MessageAddOnManager/storeMessageAddOn parent key must be present"
            r0 = 0
            X.C18740tg.A0D(r0, r1)
            return r2
        L_0x002c:
            X.1A1 r8 = r7.A0J
            X.3T1 r6 = r8.A03(r10)
            if (r6 != 0) goto L_0x00c0
            boolean r0 = r10.A02
            if (r0 != 0) goto L_0x004f
            boolean r0 = r4 instanceof X.C180858mX
            if (r0 != 0) goto L_0x0040
            boolean r0 = r4 instanceof X.C46762bd
            if (r0 == 0) goto L_0x004f
        L_0x0040:
            X.11F r3 = r10.A00
            java.lang.String r1 = r10.A01
            X.3Qa r0 = new X.3Qa
            r0.<init>(r3, r1, r5)
            X.3T1 r6 = r8.A03(r0)
            if (r6 != 0) goto L_0x00c0
        L_0x004f:
            boolean r0 = r4 instanceof X.C46742bb
            if (r0 == 0) goto L_0x00c0
            X.1Jh r9 = r7.A0N
            java.lang.String r3 = r10.A01
            X.11F r1 = r10.A00
            r6 = 0
            if (r1 == 0) goto L_0x00c0
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]
            r0 = 0
            r11[r0] = r3
            X.163 r0 = r9.A02
            long r0 = r0.A08(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r11[r5] = r0
            X.12P r0 = r9.A04
            X.1M0 r3 = r0.get()
            X.14e r8 = r3.A02     // Catch:{ all -> 0x00b8 }
            java.lang.String r1 = "SELECT creation_message_row_id, key_id, key_from_me, key_chat_row_id, call_type, scheduled_timestamp, call_title, creator_jid_row_id, is_upcoming, call_log_row_id FROM scheduled_calls WHERE key_id = ?  AND key_chat_row_id = ? "
            java.lang.String r0 = "ScheduledCallsStore/GET_SCHEDULED_CALL_MESSAGE"
            android.database.Cursor r8 = r8.A09(r1, r0, r11)     // Catch:{ all -> 0x00b8 }
            boolean r0 = r8.moveToLast()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x00a8
            X.3KV r9 = X.C26211Jh.A00(r8, r9)     // Catch:{ all -> 0x00ac }
            if (r9 == 0) goto L_0x00a8
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ac }
            X.2c9 r6 = new X.2c9     // Catch:{ all -> 0x00ac }
            r6.<init>(r10, r0)     // Catch:{ all -> 0x00ac }
            long r0 = r9.A02     // Catch:{ all -> 0x00ac }
            r6.A1N = r0     // Catch:{ all -> 0x00ac }
            com.whatsapp.jid.UserJid r0 = r9.A05     // Catch:{ all -> 0x00ac }
            r6.A0q(r0)     // Catch:{ all -> 0x00ac }
            long r0 = r9.A03     // Catch:{ all -> 0x00ac }
            r6.A01 = r0     // Catch:{ all -> 0x00ac }
            int r0 = r9.A00     // Catch:{ all -> 0x00ac }
            r6.A00 = r0     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = r9.A06     // Catch:{ all -> 0x00ac }
            r6.A02 = r0     // Catch:{ all -> 0x00ac }
        L_0x00a8:
            r8.close()     // Catch:{ all -> 0x00b8 }
            goto L_0x00bd
        L_0x00ac:
            r1 = move-exception
            if (r8 == 0) goto L_0x00b7
            r8.close()     // Catch:{ all -> 0x00b3 }
            goto L_0x00b7
        L_0x00b3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00b8 }
        L_0x00b7:
            throw r1     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0e08 }
            throw r1
        L_0x00bd:
            r3.close()
        L_0x00c0:
            r9 = 2
            if (r6 == 0) goto L_0x00cf
            boolean r8 = r4 instanceof X.C180858mX
            if (r8 != 0) goto L_0x00cb
            boolean r0 = r4 instanceof X.C46762bd
            if (r0 == 0) goto L_0x019f
        L_0x00cb:
            boolean r0 = r6 instanceof X.AnonymousClass2bK
            if (r0 == 0) goto L_0x019f
        L_0x00cf:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message not found, storing orphan message add on"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = r4 instanceof X.C46752bc
            if (r0 == 0) goto L_0x00e5
            X.1Jw r3 = r7.A0D
            r2 = r4
            X.2bc r2 = (X.C46752bc) r2
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.A00(r1, r2, r0, r0)
        L_0x00e5:
            X.1Ft r2 = r7.A0Q
            X.3Qa r12 = r4.A1J
            X.AnonymousClass00C.A07(r12)
            X.11F r10 = r4.A0J()
            X.3Qa r13 = r4.A1Z()
            X.9Vv r0 = r4.A04
            if (r0 != 0) goto L_0x017e
            r11 = 0
        L_0x00f9:
            long r0 = r4.A0I
            boolean r3 = r4 instanceof X.C180868mY
            if (r3 == 0) goto L_0x013b
            r3 = r4
            X.8mY r3 = (X.C180868mY) r3
            byte[] r15 = r3.A02
            if (r15 == 0) goto L_0x013b
        L_0x0106:
            boolean r3 = r4 instanceof X.AnonymousClass5J2
            if (r3 != 0) goto L_0x011d
            r16 = 0
        L_0x010c:
            r14 = 0
            X.9XS r9 = new X.9XS
            r17 = 1
            r18 = 1
            r19 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            int r0 = r2.A01(r9)
            return r0
        L_0x011d:
            X.8QE r3 = X.AnonymousClass8QE.DEFAULT_INSTANCE
            X.8NN r5 = r3.A0p()
            r5.A0S()
            X.8Hz r4 = r5.A00
            X.8QE r4 = (X.AnonymousClass8QE) r4
            int r3 = r4.bitField0_
            r3 = r3 | 2
            r4.bitField0_ = r3
            r4.editVersion_ = r9
            X.8Hz r3 = r5.A0R()
            byte[] r16 = r3.A0o()
            goto L_0x010c
        L_0x013b:
            boolean r3 = r4 instanceof X.C180858mX
            if (r3 == 0) goto L_0x0151
            X.0yC r7 = r2.A02
            X.0yV r6 = X.C21000yV.A01
            r3 = 6772(0x1a74, float:9.49E-42)
            boolean r3 = X.C20800yB.A01(r6, r7, r3)
            if (r3 == 0) goto L_0x0151
            r3 = r4
            X.8mX r3 = (X.C180858mX) r3
            byte[] r15 = r3.A02
            goto L_0x0106
        L_0x0151:
            boolean r3 = r4 instanceof X.C46762bd
            if (r3 == 0) goto L_0x015b
            r3 = r4
            X.2bd r3 = (X.C46762bd) r3
            byte[] r15 = r3.A02
            goto L_0x0106
        L_0x015b:
            X.8SX r3 = X.AnonymousClass8SX.DEFAULT_INSTANCE
            X.8NN r7 = r3.A0p()
            X.8NL r7 = (X.AnonymousClass8NL) r7
            X.0xh r6 = r2.A03     // Catch:{ 1Fu -> 0x0182 }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ 1Fu -> 0x0182 }
            X.9Si r3 = X.C1899396e.A00(r7)     // Catch:{ 1Fu -> 0x0182 }
            r3.A02 = r5     // Catch:{ 1Fu -> 0x0182 }
            X.9Xy r3 = r3.A00()     // Catch:{ 1Fu -> 0x0182 }
            r6.A02(r3, r4)     // Catch:{ 1Fu -> 0x0182 }
            X.8Hz r3 = r7.A0R()
            byte[] r15 = r3.A0o()
            goto L_0x0106
        L_0x017e:
            X.11F r11 = r0.A00
            goto L_0x00f9
        L_0x0182:
            r1 = move-exception
            java.lang.String r0 = "MessageOrphanStore/getMessageAddOnOrphanData/failed to build protobuf message"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Invalid message addon: "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x019f:
            boolean r0 = X.C66013Ui.A0n(r6)
            r10 = 7
            boolean r3 = r4 instanceof X.C46752bc
            if (r0 == 0) goto L_0x01c6
            if (r3 == 0) goto L_0x01c0
            int r0 = r4.A0E()
            if (r0 == 0) goto L_0x01f6
            X.1Jw r2 = r7.A0D
            X.2bc r4 = (X.C46752bc) r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00(r6, r4, r1, r0)
        L_0x01c0:
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is revoked, not storing orphan message add on"
        L_0x01c2:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r10
        L_0x01c6:
            if (r3 != 0) goto L_0x01d7
            X.0wo r0 = r7.A04
            long r0 = X.C19970wo.A00(r0)
            boolean r0 = X.C66013Ui.A0v(r6, r0)
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is ephemerally expired, not storing orphan message add on"
            goto L_0x01c2
        L_0x01d7:
            if (r8 == 0) goto L_0x01e0
            boolean r0 = r6 instanceof X.AnonymousClass2bS
            if (r0 != 0) goto L_0x01e0
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not poll message for poll vote add on"
            goto L_0x01c2
        L_0x01e0:
            boolean r0 = r4 instanceof X.C46742bb
            if (r0 == 0) goto L_0x01eb
            boolean r0 = r6 instanceof X.AnonymousClass2c9
            if (r0 != 0) goto L_0x01eb
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not scheduled call message for scheduled call edit add on"
            goto L_0x01c2
        L_0x01eb:
            boolean r0 = r4 instanceof X.C46762bd
            if (r0 == 0) goto L_0x01f6
            boolean r0 = r6 instanceof X.AnonymousClass2bT
            if (r0 != 0) goto L_0x01f6
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOn parent message is not event message for event's response add on"
            goto L_0x01c2
        L_0x01f6:
            long r0 = r6.A1N
            r4.A01 = r0
            X.1G5 r0 = r7.A0L
            X.1G6 r1 = r0.A00()
            X.3Qa r0 = r4.A1J
            X.11F r0 = r0.A00
            r19 = r0
            boolean r18 = r1.A01(r0)
            if (r18 == 0) goto L_0x0213
            if (r29 != 0) goto L_0x0213
            r0 = 17
            r4.A0n(r0)
        L_0x0213:
            X.12P r0 = r7.A0C
            X.1M0 r17 = r0.A05()
            X.71s r16 = r17.B1k()     // Catch:{ all -> 0x0e03 }
            boolean r0 = r4 instanceof X.C180868mY     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x032e
            X.1Jp r3 = r7.A0H     // Catch:{ all -> 0x0df9 }
            r2 = r4
            X.8mY r2 = (X.C180868mY) r2     // Catch:{ all -> 0x0df9 }
            monitor-enter(r3)     // Catch:{ all -> 0x0df9 }
            X.11F r0 = r2.A0J()     // Catch:{ all -> 0x032a }
            X.3Qa r12 = r2.A1J     // Catch:{ all -> 0x032a }
            boolean r9 = r12.A02     // Catch:{ all -> 0x032a }
            X.8mY r8 = X.C26291Jp.A00(r3, r0, r6, r9)     // Catch:{ all -> 0x032a }
            r5 = 17
            if (r8 != 0) goto L_0x029f
            X.12O r1 = r3.A01     // Catch:{ all -> 0x032a }
            com.whatsapp.jid.UserJid r0 = r2.A0L()     // Catch:{ all -> 0x032a }
            com.whatsapp.jid.UserJid r0 = r1.A0B(r0)     // Catch:{ all -> 0x032a }
            X.8mY r8 = X.C26291Jp.A00(r3, r0, r6, r9)     // Catch:{ all -> 0x032a }
            if (r8 != 0) goto L_0x029f
            X.12P r0 = r3.A00     // Catch:{ all -> 0x032a }
            X.1M0 r8 = r0.A05()     // Catch:{ all -> 0x032a }
            X.71s r11 = r8.B1k()     // Catch:{ all -> 0x0295 }
            if (r9 != 0) goto L_0x0264
            X.3Qa r0 = r6.A1J     // Catch:{ all -> 0x028b }
            boolean r0 = r0.A02     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0261
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x028b }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0264
        L_0x0261:
            r2.A0n(r5)     // Catch:{ all -> 0x028b }
        L_0x0264:
            X.0x8 r0 = r3.A03     // Catch:{ all -> 0x028b }
            long r0 = r0.A00(r2)     // Catch:{ all -> 0x028b }
            X.C26301Jq.A00(r8, r2, r0)     // Catch:{ all -> 0x028b }
            r9 = -1
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x027b
            r11.close()     // Catch:{ all -> 0x0295 }
            r8.close()     // Catch:{ all -> 0x032a }
            goto L_0x0323
        L_0x027b:
            r11.A00()     // Catch:{ all -> 0x028b }
            r11.close()     // Catch:{ all -> 0x0295 }
            r8.close()     // Catch:{ all -> 0x032a }
            r0 = 0
            X.C26291Jp.A01(r3, r6, r0, r2)     // Catch:{ all -> 0x032a }
            r2 = 1
            goto L_0x0327
        L_0x028b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0290 }
            goto L_0x0294
        L_0x0290:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0295 }
        L_0x0294:
            throw r1     // Catch:{ all -> 0x0295 }
        L_0x0295:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x029a }
            goto L_0x029e
        L_0x029a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x032a }
        L_0x029e:
            throw r1     // Catch:{ all -> 0x032a }
        L_0x029f:
            if (r29 == 0) goto L_0x02b3
            java.lang.String r0 = "MessageAddOnReactionManager/adjustSenderClientTimestamp"
            X.C18740tg.A0E(r9, r0)     // Catch:{ all -> 0x032a }
            long r0 = r8.A00     // Catch:{ all -> 0x032a }
            long r10 = r2.A00     // Catch:{ all -> 0x032a }
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x02b3
            r10 = 1
            long r0 = r0 + r10
            r2.A00 = r0     // Catch:{ all -> 0x032a }
        L_0x02b3:
            long r10 = r8.A00     // Catch:{ all -> 0x032a }
            long r0 = r2.A00     // Catch:{ all -> 0x032a }
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0326
            X.12P r0 = r3.A00     // Catch:{ SQLiteConstraintException -> 0x030d }
            X.1M0 r10 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x030d }
            X.71s r13 = r10.B1k()     // Catch:{ all -> 0x0303 }
            long r0 = r8.A1N     // Catch:{ all -> 0x02f9 }
            X.0x8 r11 = r3.A03     // Catch:{ all -> 0x02f9 }
            r11.A08(r0)     // Catch:{ all -> 0x02f9 }
            if (r9 != 0) goto L_0x02dd
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x02f9 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02f9 }
            if (r0 != 0) goto L_0x02da
            int r0 = r8.A0D     // Catch:{ all -> 0x02f9 }
            if (r0 != r5) goto L_0x02dd
        L_0x02da:
            r2.A0n(r5)     // Catch:{ all -> 0x02f9 }
        L_0x02dd:
            long r0 = r11.A00(r2)     // Catch:{ all -> 0x02f9 }
            X.C26301Jq.A00(r10, r2, r0)     // Catch:{ all -> 0x02f9 }
            r2.A1N = r0     // Catch:{ all -> 0x02f9 }
            X.C26291Jp.A01(r3, r6, r8, r2)     // Catch:{ all -> 0x02f9 }
            r13.A00()     // Catch:{ all -> 0x02f9 }
            int r0 = r8.A0D     // Catch:{ all -> 0x02f9 }
            r2 = 2
            if (r0 != r5) goto L_0x02f2
            r2 = 3
        L_0x02f2:
            r13.close()     // Catch:{ all -> 0x0303 }
            r10.close()     // Catch:{ SQLiteConstraintException -> 0x030d }
            goto L_0x0327
        L_0x02f9:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x02fe }
            goto L_0x0302
        L_0x02fe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0303 }
        L_0x0302:
            throw r1     // Catch:{ all -> 0x0303 }
        L_0x0303:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x0308 }
            goto L_0x030c
        L_0x0308:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteConstraintException -> 0x030d }
        L_0x030c:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x030d }
        L_0x030d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x032a }
            r1.<init>()     // Catch:{ all -> 0x032a }
            java.lang.String r0 = "MessageAddOnReactionManager/storeFMessageReactionIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x032a }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x032a }
            r1.append(r0)     // Catch:{ all -> 0x032a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x032a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x032a }
        L_0x0323:
            monitor-exit(r3)     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7c
        L_0x0326:
            r2 = 5
        L_0x0327:
            monitor-exit(r3)     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7f
        L_0x032a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0df9 }
            goto L_0x0b4d
        L_0x032e:
            if (r3 == 0) goto L_0x05b4
            X.1Jw r9 = r7.A0D     // Catch:{ all -> 0x0df9 }
            r10 = r4
            X.2bc r10 = (X.C46752bc) r10     // Catch:{ all -> 0x0df9 }
            monitor-enter(r9)     // Catch:{ all -> 0x0df9 }
            X.0x8 r0 = r9.A09     // Catch:{ all -> 0x0b4b }
            r24 = r0
            r1 = 68
            X.2bM r8 = r0.A06(r6, r1)     // Catch:{ all -> 0x0b4b }
            boolean r0 = r8 instanceof X.C46752bc     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x035b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b4b }
            r1.<init>()     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/getMessageAddOnKeepInChatForParentMessage unexpected fmessage "
            r1.append(r0)     // Catch:{ all -> 0x0b4b }
            r1.append(r8)     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b4b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
            r8 = 0
            goto L_0x0402
        L_0x035b:
            X.2bc r8 = (X.C46752bc) r8     // Catch:{ all -> 0x0b4b }
            if (r8 == 0) goto L_0x0402
            long r2 = r8.A0I     // Catch:{ all -> 0x0b4b }
            long r0 = r10.A0I     // Catch:{ all -> 0x0b4b }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x037e
            r12 = 2
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x03ae
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new messages' timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
            long r2 = r8.A02     // Catch:{ all -> 0x0b4b }
            long r0 = r10.A02     // Catch:{ all -> 0x0b4b }
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x038c
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current sender client timestamp is newer"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
        L_0x037e:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b4b }
            r0 = 5
        L_0x0384:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b4b }
            r9.A00(r6, r10, r1, r0)     // Catch:{ all -> 0x0b4b }
            goto L_0x03ff
        L_0x038c:
            if (r11 != 0) goto L_0x03ae
            java.lang.String r0 = "MessageAddOnKeepInChatManager/shouldUpdateCurrentKeepInChatMessage: current and new sender client timestamps are equal"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0b4b }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0b4b }
            X.3Qa r0 = r10.A1J     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0b4b }
            if (r1 != 0) goto L_0x03a0
            if (r0 != 0) goto L_0x03ae
            goto L_0x03a8
        L_0x03a0:
            if (r0 == 0) goto L_0x03a8
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0b4b }
            if (r0 > 0) goto L_0x03ae
        L_0x03a8:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0b4b }
            r0 = 7
            goto L_0x0384
        L_0x03ae:
            com.whatsapp.jid.UserJid r1 = r6.A0L()     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r0 = r10.A0L()     // Catch:{ all -> 0x0b4b }
            if (r1 == 0) goto L_0x03be
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x03ca
        L_0x03be:
            X.3Qa r0 = r6.A1J     // Catch:{ all -> 0x0b4b }
            boolean r2 = r0.A02     // Catch:{ all -> 0x0b4b }
            if (r2 == 0) goto L_0x03d2
            X.3Qa r0 = r10.A1J     // Catch:{ all -> 0x0b4b }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x03d2
        L_0x03ca:
            long r0 = r8.A1N     // Catch:{ all -> 0x0b4b }
            r2 = r24
            r2.A08(r0)     // Catch:{ all -> 0x0b4b }
            goto L_0x040a
        L_0x03d2:
            int r0 = r8.A01     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x03ca
            com.whatsapp.jid.UserJid r1 = r6.A0L()     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r0 = r8.A0L()     // Catch:{ all -> 0x0b4b }
            if (r1 == 0) goto L_0x03e6
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x03ee
        L_0x03e6:
            if (r2 == 0) goto L_0x03ca
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0b4b }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x03ca
        L_0x03ee:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0b4b }
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b4b }
            r9.A00(r6, r10, r1, r0)     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/isKeepInChatAllowed: false"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
        L_0x03ff:
            monitor-exit(r9)     // Catch:{ all -> 0x0df9 }
            goto L_0x0c92
        L_0x0402:
            boolean r0 = r6.A1G()     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x040a
            goto L_0x06ed
        L_0x040a:
            if (r29 != 0) goto L_0x0499
            int r0 = r10.A01     // Catch:{ all -> 0x0b4b }
            r12 = 1
            r2 = 0
            if (r0 != r5) goto L_0x0413
            r2 = 1
        L_0x0413:
            java.lang.Long r0 = r6.A0g     // Catch:{ all -> 0x0b4b }
            X.3Qa r1 = r6.A1J     // Catch:{ all -> 0x0b4b }
            X.11F r3 = r1.A00     // Catch:{ all -> 0x0b4b }
            X.6SZ r1 = com.whatsapp.jid.GroupJid.Companion     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.GroupJid r14 = X.AnonymousClass6SZ.A00(r3)     // Catch:{ all -> 0x0b4b }
            X.0wQ r1 = r9.A00     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r13 = X.C66013Ui.A07(r1, r6)     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r11 = X.C66013Ui.A07(r1, r10)     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x043c
            if (r2 == 0) goto L_0x043e
            long r22 = r0.longValue()     // Catch:{ all -> 0x0b4b }
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0b4b }
            int r0 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x044b
            r2 = 4
            goto L_0x059d
        L_0x043c:
            if (r2 != 0) goto L_0x044b
        L_0x043e:
            X.0yC r2 = r9.A0A     // Catch:{ all -> 0x0b4b }
            X.0wo r0 = r9.A02     // Catch:{ all -> 0x0b4b }
            boolean r0 = X.C65453Sc.A02(r0, r2, r6)     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x044b
            r2 = 6
            goto L_0x059d
        L_0x044b:
            boolean r0 = X.AnonymousClass143.A0G(r3)     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x0499
            if (r14 == 0) goto L_0x0499
            X.16D r0 = r9.A01     // Catch:{ all -> 0x0b4b }
            X.141 r3 = r0.A08(r14)     // Catch:{ all -> 0x0b4b }
            android.os.Parcelable$Creator r0 = X.AnonymousClass147.CREATOR     // Catch:{ all -> 0x0b4b }
            X.147 r2 = X.C65533Sl.A03(r14)     // Catch:{ all -> 0x0b4b }
            X.17X r0 = r9.A05     // Catch:{ all -> 0x0b4b }
            boolean r15 = r0.A0C(r14)     // Catch:{ all -> 0x0b4b }
            if (r15 != 0) goto L_0x046a
            r2 = 2
            goto L_0x059d
        L_0x046a:
            boolean r0 = r0.A0E(r14, r13)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x0473
            r2 = 3
            goto L_0x059d
        L_0x0473:
            if (r3 == 0) goto L_0x0499
            if (r11 == 0) goto L_0x0499
            if (r2 == 0) goto L_0x0499
            X.12O r14 = r9.A07     // Catch:{ all -> 0x0b4b }
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)     // Catch:{ all -> 0x0b4b }
            r0 = 2
            X.AnonymousClass00C.A0D(r14, r0)     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r13 = X.C66013Ui.A07(r1, r6)     // Catch:{ all -> 0x0b4b }
            com.whatsapp.jid.UserJid r1 = X.C66013Ui.A07(r1, r10)     // Catch:{ all -> 0x0b4b }
            int r0 = r6.A0E()     // Catch:{ all -> 0x0b4b }
            if (r5 != r0) goto L_0x04a0
            if (r13 == 0) goto L_0x04a0
            boolean r0 = r14.A0I(r13, r1)     // Catch:{ all -> 0x0b4b }
            if (r0 == 0) goto L_0x04a0
        L_0x0499:
            X.12P r0 = r9.A06     // Catch:{ all -> 0x0b4b }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0b4b }
            goto L_0x04df
        L_0x04a0:
            X.1LM r13 = r9.A0B     // Catch:{ all -> 0x0b4b }
            X.1EL r1 = r13.A01     // Catch:{ all -> 0x0b4b }
            X.17X r0 = r13.A00     // Catch:{ all -> 0x0b4b }
            boolean r15 = r0.A0E(r2, r11)     // Catch:{ all -> 0x0b4b }
            boolean r14 = r0.A0J(r2, r11)     // Catch:{ all -> 0x0b4b }
            boolean r0 = r1.A00(r3)     // Catch:{ all -> 0x0b4b }
            if (r15 == 0) goto L_0x04b9
            if (r14 == 0) goto L_0x04b9
            if (r0 != 0) goto L_0x04b9
            goto L_0x0499
        L_0x04b9:
            X.1Jx r1 = r13.A02     // Catch:{ all -> 0x0b4b }
            X.17X r0 = r1.A01     // Catch:{ all -> 0x0b4b }
            boolean r13 = r0.A0E(r2, r11)     // Catch:{ all -> 0x0b4b }
            boolean r0 = r0.A0J(r2, r11)     // Catch:{ all -> 0x0b4b }
            if (r13 == 0) goto L_0x059c
            if (r0 != 0) goto L_0x04cd
            boolean r0 = r3.A13     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x059c
        L_0x04cd:
            X.12q r0 = r1.A00     // Catch:{ all -> 0x0b4b }
            int r2 = r0.A05(r2)     // Catch:{ all -> 0x0b4b }
            r0 = 3
            if (r2 == r0) goto L_0x059c
            X.1EL r0 = r1.A02     // Catch:{ all -> 0x0b4b }
            boolean r0 = r0.A00(r3)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x059c
            goto L_0x0499
        L_0x04df:
            X.71s r20 = r3.B1k()     // Catch:{ all -> 0x0756 }
            r11 = 0
            if (r8 == 0) goto L_0x04e7
            goto L_0x04e9
        L_0x04e7:
            r1 = 0
            goto L_0x04eb
        L_0x04e9:
            int r1 = r8.A00     // Catch:{ all -> 0x074c }
        L_0x04eb:
            int r0 = r10.A01     // Catch:{ all -> 0x074c }
            r2 = 1
            if (r0 != r5) goto L_0x04f1
            r11 = 1
        L_0x04f1:
            int r1 = r1 + r11
            r10.A00 = r1     // Catch:{ all -> 0x074c }
            if (r29 == 0) goto L_0x0505
            if (r8 == 0) goto L_0x0505
            long r0 = r8.A02     // Catch:{ all -> 0x074c }
            long r11 = r10.A02     // Catch:{ all -> 0x074c }
            int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0505
            r11 = 1
            long r0 = r0 + r11
            r10.A02 = r0     // Catch:{ all -> 0x074c }
        L_0x0505:
            r0 = r24
            long r13 = r0.A00(r10)     // Catch:{ all -> 0x074c }
            r11 = -1
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x052b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x074c }
            r1.<init>()     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "MessageAddOnKeepInChatManager/storeFMessageKeepInChatIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x074c }
            X.3Qa r0 = r10.A1J     // Catch:{ all -> 0x074c }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x074c }
            r1.append(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x074c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x06e7
        L_0x052b:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x074c }
            r11.<init>()     // Catch:{ all -> 0x074c }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "message_add_on_row_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x074c }
            int r0 = r10.A01     // Catch:{ all -> 0x074c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "keep_in_chat_state"
            r11.put(r0, r1)     // Catch:{ all -> 0x074c }
            long r0 = r10.A02     // Catch:{ all -> 0x074c }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "sender_timestamp"
            r11.put(r0, r1)     // Catch:{ all -> 0x074c }
            int r0 = r10.A00     // Catch:{ all -> 0x074c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "keep_count"
            r11.put(r0, r1)     // Catch:{ all -> 0x074c }
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "actor_device_jid_row_id"
            r11.put(r0, r1)     // Catch:{ all -> 0x074c }
            X.14e r12 = r3.A02     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "message_add_on_keep_in_chat"
            java.lang.String r0 = "MessageAddOnKeepInChatStore/insertMessageAddOnKeepInChat"
            r12.A05(r1, r0, r11)     // Catch:{ all -> 0x074c }
            int r0 = r10.A01     // Catch:{ all -> 0x074c }
            r6.A07 = r0     // Catch:{ all -> 0x074c }
            r6.A1U = r10     // Catch:{ all -> 0x074c }
            r6.A07 = r0     // Catch:{ all -> 0x074c }
            X.17S r0 = r9.A04     // Catch:{ all -> 0x074c }
            r0.A08(r6)     // Catch:{ all -> 0x074c }
            r1 = 4
            boolean r0 = r6.A1S(r1)     // Catch:{ all -> 0x074c }
            if (r0 != 0) goto L_0x0589
            r6.A0i(r1)     // Catch:{ all -> 0x074c }
            X.0xM r0 = r9.A03     // Catch:{ all -> 0x074c }
            r0.A0j(r6)     // Catch:{ all -> 0x074c }
        L_0x0589:
            X.0xM r0 = r9.A03     // Catch:{ all -> 0x074c }
            X.176 r0 = r0.A0W     // Catch:{ all -> 0x074c }
            r0.A0B(r6)     // Catch:{ all -> 0x074c }
            r20.A00()     // Catch:{ all -> 0x074c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x074c }
            r9.A00(r6, r10, r0, r0)     // Catch:{ all -> 0x074c }
            goto L_0x0741
        L_0x059c:
            r2 = 7
        L_0x059d:
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b4b }
            int r0 = r10.A01     // Catch:{ all -> 0x0b4b }
            if (r0 == r5) goto L_0x05a7
            r12 = 0
        L_0x05a7:
            int r0 = X.C65453Sc.A00(r2, r12)     // Catch:{ all -> 0x0b4b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b4b }
            r9.A00(r6, r10, r1, r0)     // Catch:{ all -> 0x0b4b }
            goto L_0x06ed
        L_0x05b4:
            boolean r0 = r4 instanceof X.AnonymousClass5J2     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0760
            X.1Jr r9 = r7.A0F     // Catch:{ all -> 0x0df9 }
            r11 = r4
            X.5J2 r11 = (X.AnonymousClass5J2) r11     // Catch:{ all -> 0x0df9 }
            monitor-enter(r9)     // Catch:{ all -> 0x0df9 }
            X.3Qa r10 = r11.A1J     // Catch:{ all -> 0x0b4b }
            X.11F r15 = r10.A00     // Catch:{ all -> 0x0b4b }
            if (r15 != 0) goto L_0x05cb
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage has null chatJid"
        L_0x05c6:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
            goto L_0x06ed
        L_0x05cb:
            boolean r0 = r6 instanceof X.AnonymousClass2bT     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x05e7
            int r0 = r11.A00     // Catch:{ all -> 0x0b4b }
            if (r0 != r5) goto L_0x05e7
            boolean r0 = r10.A02     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x05e7
            int r1 = r11.A1X()     // Catch:{ all -> 0x0b4b }
            int r0 = X.C26311Jr.A0B     // Catch:{ all -> 0x0b4b }
            if (r1 <= r0) goto L_0x05e2
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat expiry duration longer than 60 days"
            goto L_0x05c6
        L_0x05e2:
            if (r1 > 0) goto L_0x05e7
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat expiry duration shorter than 0"
            goto L_0x05c6
        L_0x05e7:
            X.3Qa r0 = r6.A1J     // Catch:{ all -> 0x0b4b }
            X.11F r0 = r0.A00     // Catch:{ all -> 0x0b4b }
            boolean r0 = r15.equals(r0)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x05f4
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat newPinInChatMessage and parentMessage does not have same chatJid"
            goto L_0x05c6
        L_0x05f4:
            X.1Js r1 = r9.A04     // Catch:{ all -> 0x0b4b }
            X.2nd r0 = X.C51322nd.A02     // Catch:{ all -> 0x0b4b }
            boolean r0 = r1.A01(r0, r6)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x0626
            X.00T r0 = r1.A02     // Catch:{ all -> 0x0b4b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0b4b }
            X.9XG r0 = (X.AnonymousClass9XG) r0     // Catch:{ all -> 0x0b4b }
            int r2 = r6.A1I     // Catch:{ all -> 0x0b4b }
            X.0ow r0 = r0.A00(r2)     // Catch:{ all -> 0x0b4b }
            X.4VA r0 = (X.AnonymousClass4VA) r0     // Catch:{ all -> 0x0b4b }
            boolean r0 = r0.BxS(r6)     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x0626
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b4b }
            r1.<init>()     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = "MessageAddOnPinInChatManager/isInvalidPinInChat message type not pinnable:"
            r1.append(r0)     // Catch:{ all -> 0x0b4b }
            r1.append(r2)     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b4b }
            goto L_0x05c6
        L_0x0626:
            X.0x8 r12 = r9.A03     // Catch:{ all -> 0x0b4b }
            r0 = 79
            X.2bM r2 = r12.A06(r6, r0)     // Catch:{ all -> 0x0b4b }
            r8 = 0
            if (r2 == 0) goto L_0x0689
            boolean r0 = r2 instanceof X.AnonymousClass5J2     // Catch:{ all -> 0x0b4b }
            if (r0 != 0) goto L_0x064a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b4b }
            r1.<init>()     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = "MessageAddOnPinInChatManager/getMessageAddOnPinInChatForParentMessage Unexpected FMessage "
            r1.append(r0)     // Catch:{ all -> 0x0b4b }
            r1.append(r2)     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b4b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0b4b }
            goto L_0x0689
        L_0x064a:
            X.5J2 r2 = (X.AnonymousClass5J2) r2     // Catch:{ all -> 0x0b4b }
            r8 = r2
            if (r2 == 0) goto L_0x0689
            if (r29 != 0) goto L_0x068b
            long r2 = r2.A02     // Catch:{ all -> 0x0b4b }
            r20 = 0
            int r0 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x065b
            long r2 = r8.A0I     // Catch:{ all -> 0x0b4b }
        L_0x065b:
            long r0 = r11.A02     // Catch:{ all -> 0x0b4b }
            int r13 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r13 > 0) goto L_0x0663
            long r0 = r11.A0I     // Catch:{ all -> 0x0b4b }
        L_0x0663:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0686
            if (r13 != 0) goto L_0x06a1
            long r2 = r8.A01     // Catch:{ all -> 0x0b4b }
            long r0 = r11.A01     // Catch:{ all -> 0x0b4b }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0686
            if (r13 != 0) goto L_0x06a1
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0b4b }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x0b4b }
            if (r1 != 0) goto L_0x067e
            if (r0 != 0) goto L_0x0686
            goto L_0x06a1
        L_0x067e:
            if (r0 == 0) goto L_0x06a1
            int r0 = r1.compareTo(r0)     // Catch:{ all -> 0x0b4b }
            if (r0 <= 0) goto L_0x06a1
        L_0x0686:
            r2 = 5
            goto L_0x0d7e
        L_0x0689:
            if (r29 == 0) goto L_0x06a1
        L_0x068b:
            if (r8 == 0) goto L_0x06a1
            boolean r1 = r10.A02     // Catch:{ all -> 0x0b4b }
            java.lang.String r0 = "MessageAddOnPinInChatManager/updateSenderTimestampIfNeeded"
            X.C18740tg.A0E(r1, r0)     // Catch:{ all -> 0x0b4b }
            long r0 = r8.A01     // Catch:{ all -> 0x0b4b }
            long r2 = r11.A01     // Catch:{ all -> 0x0b4b }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 < 0) goto L_0x06a1
            r2 = 1
            long r0 = r0 + r2
            r11.A01 = r0     // Catch:{ all -> 0x0b4b }
        L_0x06a1:
            X.12P r0 = r9.A02     // Catch:{ all -> 0x0b4b }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0b4b }
            X.71s r20 = r3.B1k()     // Catch:{ all -> 0x0756 }
            if (r8 == 0) goto L_0x06c7
            long r0 = r8.A1N     // Catch:{ all -> 0x074c }
            r12.A08(r0)     // Catch:{ all -> 0x074c }
            r13 = 0
            java.lang.String[] r2 = new java.lang.String[r5]     // Catch:{ all -> 0x074c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x074c }
            r2[r13] = r0     // Catch:{ all -> 0x074c }
            X.14e r0 = r3.A02     // Catch:{ all -> 0x074c }
            r14 = r0
            java.lang.String r13 = "message_add_on_pin_in_chat"
            java.lang.String r1 = "message_add_on_row_id = ?"
            java.lang.String r0 = "MessageAddOnPinInChatStore/deleteMessageAddOnPinInChat"
            r14.A03(r13, r1, r0, r2)     // Catch:{ all -> 0x074c }
        L_0x06c7:
            long r12 = r12.A00(r11)     // Catch:{ all -> 0x074c }
            r1 = -1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x06f0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x074c }
            r1.<init>()     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "MessageAddOnPinInChatManager/storeFMessagePinInChatWithSystemMessageIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x074c }
            r1.append(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x074c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x074c }
        L_0x06e7:
            r20.close()     // Catch:{ all -> 0x0756 }
            r3.close()     // Catch:{ all -> 0x0b4b }
        L_0x06ed:
            monitor-exit(r9)     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7c
        L_0x06f0:
            X.14e r10 = r3.A02     // Catch:{ all -> 0x074c }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x074c }
            r2.<init>()     // Catch:{ all -> 0x074c }
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "message_add_on_row_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x074c }
            int r0 = r11.A00     // Catch:{ all -> 0x074c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "pin_in_chat_state"
            r2.put(r0, r1)     // Catch:{ all -> 0x074c }
            long r0 = r11.A01     // Catch:{ all -> 0x074c }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "sender_timestamp"
            r2.put(r0, r1)     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "message_add_on_pin_in_chat"
            java.lang.String r0 = "MessageAddOnPinInChatStore/insertMessageAddOnPinInChat"
            r10.A05(r1, r0, r2)     // Catch:{ all -> 0x074c }
            r0 = r20
            r9.A02(r0, r6, r11)     // Catch:{ all -> 0x074c }
            r20.A00()     // Catch:{ all -> 0x074c }
            if (r29 == 0) goto L_0x0730
            X.0wQ r0 = r9.A00     // Catch:{ all -> 0x074c }
            boolean r0 = r0.A0M(r15)     // Catch:{ all -> 0x074c }
            if (r0 != 0) goto L_0x0730
            goto L_0x0740
        L_0x0730:
            int r0 = r11.A00     // Catch:{ all -> 0x074c }
            if (r0 != r5) goto L_0x0740
            if (r8 == 0) goto L_0x073d
            int r0 = r8.A00     // Catch:{ all -> 0x074c }
            r2 = 9
            if (r0 != r5) goto L_0x0744
            goto L_0x0743
        L_0x073d:
            r2 = 8
            goto L_0x0744
        L_0x0740:
            r2 = 1
        L_0x0741:
            if (r8 == 0) goto L_0x0744
        L_0x0743:
            r2 = 2
        L_0x0744:
            r20.close()     // Catch:{ all -> 0x0756 }
            r3.close()     // Catch:{ all -> 0x0b4b }
            goto L_0x0d7e
        L_0x074c:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0751 }
            goto L_0x0755
        L_0x0751:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0756 }
        L_0x0755:
            throw r1     // Catch:{ all -> 0x0756 }
        L_0x0756:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x075b }
            goto L_0x075f
        L_0x075b:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b4b }
        L_0x075f:
            throw r1     // Catch:{ all -> 0x0b4b }
        L_0x0760:
            if (r8 == 0) goto L_0x0b4e
            r5 = r6
            X.2bS r5 = (X.AnonymousClass2bS) r5     // Catch:{ all -> 0x0df9 }
            java.util.List r0 = r5.A04     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0772
            r0 = 67
            java.util.ArrayList r0 = r7.A0E(r5, r0)     // Catch:{ all -> 0x0df9 }
            r5.A1X(r0)     // Catch:{ all -> 0x0df9 }
        L_0x0772:
            X.1FE r1 = r7.A0M     // Catch:{ all -> 0x0df9 }
            X.3Qa r0 = r6.A1J     // Catch:{ all -> 0x0df9 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x079a
            r6.A0f()     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.DeviceJid r0 = r1.A00(r6)     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x078f
            com.whatsapp.jid.UserJid r13 = r0.userJid     // Catch:{ all -> 0x0df9 }
        L_0x0785:
            X.1Jm r2 = r7.A0G     // Catch:{ all -> 0x0df9 }
            r3 = r4
            X.8mX r3 = (X.C180858mX) r3     // Catch:{ all -> 0x0df9 }
            int r0 = r5.A00     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0a45
            goto L_0x079f
        L_0x078f:
            X.0wQ r0 = r1.A00     // Catch:{ all -> 0x0df9 }
            r0.A0G()     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.PhoneUserJid r13 = r0.A03     // Catch:{ all -> 0x0df9 }
            X.C18740tg.A06(r13)     // Catch:{ all -> 0x0df9 }
            goto L_0x0785
        L_0x079a:
            com.whatsapp.jid.UserJid r13 = r6.A0L()     // Catch:{ all -> 0x0df9 }
            goto L_0x0785
        L_0x079f:
            if (r29 != 0) goto L_0x0835
            X.3Qa r1 = r3.A1J     // Catch:{ all -> 0x0df9 }
            X.11F r12 = r1.A00     // Catch:{ all -> 0x0df9 }
            X.0yC r9 = r2.A09     // Catch:{ all -> 0x0df9 }
            X.0yV r8 = X.C21000yV.A01     // Catch:{ all -> 0x0df9 }
            r0 = 6772(0x1a74, float:9.49E-42)
            boolean r0 = X.C20800yB.A01(r8, r9, r0)     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0835
            X.00b r0 = r2.A0B     // Catch:{ all -> 0x0df9 }
            r22 = r0
            byte[] r15 = r5.A1b     // Catch:{ all -> 0x0df9 }
            java.util.List r0 = r5.A05     // Catch:{ all -> 0x0df9 }
            r24 = r0
            int r11 = r5.A01     // Catch:{ all -> 0x0df9 }
            byte[] r10 = r3.A04     // Catch:{ all -> 0x0df9 }
            byte[] r9 = r3.A03     // Catch:{ all -> 0x0df9 }
            X.3Qa r0 = r5.A1J     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x0df9 }
            r23 = r0
            boolean r8 = r1.A02     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x0819
            X.0wQ r14 = r2.A00     // Catch:{ all -> 0x0df9 }
            X.12q r1 = r2.A01     // Catch:{ all -> 0x0df9 }
            X.17X r0 = r2.A03     // Catch:{ all -> 0x0df9 }
            boolean r0 = r0.A0B(r12)     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.UserJid r21 = X.C200459hR.A00(r14, r1, r12, r0)     // Catch:{ all -> 0x0df9 }
        L_0x07d9:
            r20 = r13
            r25 = r15
            r26 = r10
            r27 = r9
            r28 = r11
            X.9Fc r0 = A03(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x082b
            X.12O r0 = r2.A06     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.UserJid r20 = r0.A0B(r13)     // Catch:{ all -> 0x0df9 }
            byte[] r11 = r5.A1b     // Catch:{ all -> 0x0df9 }
            int r10 = r5.A01     // Catch:{ all -> 0x0df9 }
            byte[] r9 = r3.A04     // Catch:{ all -> 0x0df9 }
            byte[] r1 = r3.A03     // Catch:{ all -> 0x0df9 }
            if (r8 == 0) goto L_0x0814
            X.0wQ r13 = r2.A00     // Catch:{ all -> 0x0df9 }
            X.12q r8 = r2.A01     // Catch:{ all -> 0x0df9 }
            X.17X r0 = r2.A03     // Catch:{ all -> 0x0df9 }
            boolean r0 = r0.A0B(r12)     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.UserJid r21 = X.C200459hR.A00(r13, r8, r12, r0)     // Catch:{ all -> 0x0df9 }
        L_0x0807:
            r25 = r11
            r26 = r9
            r27 = r1
            r28 = r10
            X.9Fc r0 = A03(r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0df9 }
            goto L_0x081e
        L_0x0814:
            com.whatsapp.jid.UserJid r21 = r3.A0L()     // Catch:{ all -> 0x0df9 }
            goto L_0x0807
        L_0x0819:
            com.whatsapp.jid.UserJid r21 = r3.A0L()     // Catch:{ all -> 0x0df9 }
            goto L_0x07d9
        L_0x081e:
            if (r0 != 0) goto L_0x082b
            X.1Jn r2 = r2.A0A     // Catch:{ all -> 0x0df9 }
            r1 = 3
            r0 = 38
            r2.A02(r1, r0)     // Catch:{ all -> 0x0df9 }
            r2 = 6
            goto L_0x0a46
        L_0x082b:
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x0df9 }
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x0df9 }
            r0.clear()     // Catch:{ all -> 0x0df9 }
            r0.addAll(r1)     // Catch:{ all -> 0x0df9 }
        L_0x0835:
            java.lang.Object r0 = r2.A0C     // Catch:{ all -> 0x0df9 }
            r25 = r0
            monitor-enter(r25)     // Catch:{ all -> 0x0df9 }
            X.11F r0 = r3.A0J()     // Catch:{ all -> 0x0a41 }
            X.3Qa r12 = r3.A1J     // Catch:{ all -> 0x0a41 }
            boolean r9 = r12.A02     // Catch:{ all -> 0x0a41 }
            X.8mX r8 = X.C26261Jm.A00(r2, r0, r5, r9)     // Catch:{ all -> 0x0a41 }
            if (r8 != 0) goto L_0x0860
            X.11F r1 = r3.A0J()     // Catch:{ all -> 0x0a41 }
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0a41 }
            if (r0 == 0) goto L_0x087f
            X.12O r0 = r2.A06     // Catch:{ all -> 0x0a41 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x0a41 }
            com.whatsapp.jid.UserJid r0 = r0.A0B(r1)     // Catch:{ all -> 0x0a41 }
            if (r0 == 0) goto L_0x087f
            X.8mX r8 = X.C26261Jm.A00(r2, r0, r5, r9)     // Catch:{ all -> 0x0a41 }
            if (r8 == 0) goto L_0x087f
        L_0x0860:
            if (r29 == 0) goto L_0x0874
            java.lang.String r0 = "MessageAddOnPollVoteManager/adjustSenderClientTimestamp"
            X.C18740tg.A0E(r9, r0)     // Catch:{ all -> 0x0a41 }
            long r0 = r8.A00     // Catch:{ all -> 0x0a41 }
            long r10 = r3.A00     // Catch:{ all -> 0x0a41 }
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 <= 0) goto L_0x0874
            r10 = 1
            long r0 = r0 + r10
            r3.A00 = r0     // Catch:{ all -> 0x0a41 }
        L_0x0874:
            long r10 = r8.A00     // Catch:{ all -> 0x0a41 }
            long r0 = r3.A00     // Catch:{ all -> 0x0a41 }
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x087f
            r2 = 5
            goto L_0x0a08
        L_0x087f:
            X.12P r0 = r2.A04     // Catch:{ all -> 0x0a41 }
            r27 = r0
            X.1M0 r24 = r27.A05()     // Catch:{ all -> 0x0a41 }
            X.71s r23 = r24.B1k()     // Catch:{ all -> 0x0a37 }
            if (r8 == 0) goto L_0x0894
            long r0 = r8.A1N     // Catch:{ all -> 0x0a2d }
            X.0x8 r10 = r2.A08     // Catch:{ all -> 0x0a2d }
            r10.A08(r0)     // Catch:{ all -> 0x0a2d }
        L_0x0894:
            if (r9 != 0) goto L_0x08b7
            X.3Qa r0 = r5.A1J     // Catch:{ all -> 0x0a2d }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0a2d }
            r1 = 17
            if (r0 == 0) goto L_0x08b4
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x0a2d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0a2d }
            if (r0 != 0) goto L_0x08b4
            if (r8 == 0) goto L_0x08b7
            java.util.List r0 = r8.A06     // Catch:{ all -> 0x0a2d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0a2d }
            if (r0 != 0) goto L_0x08b7
            int r0 = r8.A0D     // Catch:{ all -> 0x0a2d }
            if (r0 != r1) goto L_0x08b7
        L_0x08b4:
            r3.A0n(r1)     // Catch:{ all -> 0x0a2d }
        L_0x08b7:
            X.0x8 r0 = r2.A08     // Catch:{ all -> 0x0a2d }
            long r0 = r0.A00(r3)     // Catch:{ all -> 0x0a2d }
            r10 = -1
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x08df
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a2d }
            r1.<init>()     // Catch:{ all -> 0x0a2d }
            java.lang.String r0 = "MessageAddOnPollVoteManager/storeFMessagePollVoteIfNeeded duplicate addon message "
            r1.append(r0)     // Catch:{ all -> 0x0a2d }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x0a2d }
            r1.append(r0)     // Catch:{ all -> 0x0a2d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a2d }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a2d }
            r2 = 7
            r23.close()     // Catch:{ all -> 0x0a37 }
            goto L_0x0a05
        L_0x08df:
            r3.A1N = r0     // Catch:{ all -> 0x0a2d }
            X.71s r22 = r24.B1k()     // Catch:{ all -> 0x0a2d }
            r9 = 3
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0a23 }
            r14.<init>(r9)     // Catch:{ all -> 0x0a23 }
            java.lang.String r13 = "message_add_on_row_id"
            java.lang.Long r12 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0a23 }
            r14.put(r13, r12)     // Catch:{ all -> 0x0a23 }
            java.lang.String r11 = "sender_timestamp"
            long r9 = r3.A00     // Catch:{ all -> 0x0a23 }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0a23 }
            r14.put(r11, r9)     // Catch:{ all -> 0x0a23 }
            r9 = r24
            X.14e r10 = r9.A02     // Catch:{ all -> 0x0a23 }
            java.lang.String r15 = "message_add_on_poll_vote"
            r11 = 0
            java.lang.String r9 = "MessageAddOnPollVoteStore/insertMessageAddOnPollVote"
            r10.A05(r15, r9, r14)     // Catch:{ all -> 0x0a23 }
            X.71s r21 = r24.B1k()     // Catch:{ all -> 0x0a23 }
            r14 = 1
            java.lang.String[] r15 = new java.lang.String[r14]     // Catch:{ all -> 0x0a19 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0a19 }
            r0 = 0
            r15[r0] = r1     // Catch:{ all -> 0x0a19 }
            java.lang.String r14 = "message_add_on_poll_vote_selected_option"
            java.lang.String r1 = "message_add_on_row_id = ?"
            java.lang.String r0 = "MessageAddOnPollVoteStore/deletePollVoteSelectedOptions"
            r10.A03(r14, r1, r0, r15)     // Catch:{ all -> 0x0a19 }
            java.util.List r0 = r3.A06     // Catch:{ all -> 0x0a19 }
            r26 = r0
            boolean r0 = r26.isEmpty()     // Catch:{ all -> 0x0a19 }
            if (r0 != 0) goto L_0x094e
            java.util.Iterator r20 = r26.iterator()     // Catch:{ all -> 0x0a19 }
        L_0x0930:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x0a19 }
            if (r0 == 0) goto L_0x094e
            java.lang.Object r15 = r20.next()     // Catch:{ all -> 0x0a19 }
            java.lang.Long r15 = (java.lang.Long) r15     // Catch:{ all -> 0x0a19 }
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x0a19 }
            r0 = 2
            r1.<init>(r0)     // Catch:{ all -> 0x0a19 }
            r1.put(r13, r12)     // Catch:{ all -> 0x0a19 }
            java.lang.String r0 = "message_poll_option_id"
            r1.put(r0, r15)     // Catch:{ all -> 0x0a19 }
            r10.A05(r14, r9, r1)     // Catch:{ all -> 0x0a19 }
            goto L_0x0930
        L_0x094e:
            r21.A00()     // Catch:{ all -> 0x0a19 }
            r21.close()     // Catch:{ all -> 0x0a23 }
            r22.A00()     // Catch:{ all -> 0x0a23 }
            r22.close()     // Catch:{ all -> 0x0a2d }
            java.util.List r0 = r5.A04     // Catch:{ all -> 0x0a2d }
            X.1M0 r20 = r27.A05()     // Catch:{ all -> 0x0a2d }
            X.71s r15 = r20.B1k()     // Catch:{ all -> 0x0a14 }
            if (r0 != 0) goto L_0x098d
            r9 = 2
            boolean r0 = r5.A1S(r9)     // Catch:{ all -> 0x0a0a }
            if (r0 != 0) goto L_0x09ce
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0a0a }
            r1.<init>()     // Catch:{ all -> 0x0a0a }
            r1.add(r3)     // Catch:{ all -> 0x0a0a }
            r0 = r26
            X.C26261Jm.A02(r5, r1, r0, r11)     // Catch:{ all -> 0x0a0a }
            r5.A0i(r9)     // Catch:{ all -> 0x0a0a }
            X.0xM r1 = r2.A02     // Catch:{ all -> 0x0a0a }
            r1.A0j(r5)     // Catch:{ all -> 0x0a0a }
            X.1Eg r0 = r2.A05     // Catch:{ all -> 0x0a0a }
            r0.A02(r5)     // Catch:{ all -> 0x0a0a }
            X.176 r0 = r1.A0W     // Catch:{ all -> 0x0a0a }
            r0.A0B(r5)     // Catch:{ all -> 0x0a0a }
            goto L_0x09ce
        L_0x098d:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0a0a }
            r12.<init>(r0)     // Catch:{ all -> 0x0a0a }
            if (r8 == 0) goto L_0x09ba
            goto L_0x09d2
        L_0x0995:
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0a0a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0a0a }
            if (r0 != 0) goto L_0x09d8
            com.whatsapp.jid.UserJid r0 = r1.A0L()     // Catch:{ all -> 0x0a0a }
            if (r0 == 0) goto L_0x09d8
            com.whatsapp.jid.UserJid r9 = r1.A0L()     // Catch:{ all -> 0x0a0a }
            com.whatsapp.jid.UserJid r0 = r8.A0L()     // Catch:{ all -> 0x0a0a }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0a0a }
            if (r0 == 0) goto L_0x09d8
        L_0x09af:
            long r9 = r1.A01     // Catch:{ all -> 0x0a0a }
            long r0 = r8.A01     // Catch:{ all -> 0x0a0a }
            int r14 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x09d8
            r13.remove()     // Catch:{ all -> 0x0a0a }
        L_0x09ba:
            r12.add(r3)     // Catch:{ all -> 0x0a0a }
            r0 = r26
            X.C26261Jm.A02(r5, r12, r0, r11)     // Catch:{ all -> 0x0a0a }
            X.1Eg r0 = r2.A05     // Catch:{ all -> 0x0a0a }
            r0.A02(r5)     // Catch:{ all -> 0x0a0a }
            X.0xM r0 = r2.A02     // Catch:{ all -> 0x0a0a }
            X.176 r0 = r0.A0W     // Catch:{ all -> 0x0a0a }
            r0.A0B(r5)     // Catch:{ all -> 0x0a0a }
        L_0x09ce:
            r15.A00()     // Catch:{ all -> 0x0a0a }
            goto L_0x09f1
        L_0x09d2:
            java.util.List r11 = r8.A06     // Catch:{ all -> 0x0a0a }
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x0a0a }
        L_0x09d8:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0a0a }
            if (r0 == 0) goto L_0x09ba
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0a0a }
            X.2bM r1 = (X.AnonymousClass2bM) r1     // Catch:{ all -> 0x0a0a }
            X.3Qa r0 = r1.A1J     // Catch:{ all -> 0x0a0a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0a0a }
            if (r0 == 0) goto L_0x0995
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0a0a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0a0a }
            if (r0 != 0) goto L_0x09af
            goto L_0x09d8
        L_0x09f1:
            r15.close()     // Catch:{ all -> 0x0a14 }
            r20.close()     // Catch:{ all -> 0x0a2d }
            r23.A00()     // Catch:{ all -> 0x0a2d }
            r23.close()     // Catch:{ all -> 0x0a37 }
            r24.close()     // Catch:{ all -> 0x0a41 }
            r2 = 2
            if (r8 != 0) goto L_0x0a08
            r2 = 1
            goto L_0x0a08
        L_0x0a05:
            r24.close()     // Catch:{ all -> 0x0a41 }
        L_0x0a08:
            monitor-exit(r25)     // Catch:{ all -> 0x0a41 }
            goto L_0x0a46
        L_0x0a0a:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0a0f }
            goto L_0x0a13
        L_0x0a0f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a14 }
        L_0x0a13:
            throw r1     // Catch:{ all -> 0x0a14 }
        L_0x0a14:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0a28 }
            goto L_0x0a2c
        L_0x0a19:
            r1 = move-exception
            r21.close()     // Catch:{ all -> 0x0a1e }
            goto L_0x0a22
        L_0x0a1e:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a23 }
        L_0x0a22:
            throw r1     // Catch:{ all -> 0x0a23 }
        L_0x0a23:
            r1 = move-exception
            r22.close()     // Catch:{ all -> 0x0a28 }
            goto L_0x0a2c
        L_0x0a28:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a2d }
        L_0x0a2c:
            throw r1     // Catch:{ all -> 0x0a2d }
        L_0x0a2d:
            r1 = move-exception
            r23.close()     // Catch:{ all -> 0x0a32 }
            goto L_0x0a36
        L_0x0a32:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a37 }
        L_0x0a36:
            throw r1     // Catch:{ all -> 0x0a37 }
        L_0x0a37:
            r1 = move-exception
            r24.close()     // Catch:{ all -> 0x0a3c }
            goto L_0x0a40
        L_0x0a3c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0a41 }
        L_0x0a40:
            throw r1     // Catch:{ all -> 0x0a41 }
        L_0x0a41:
            r0 = move-exception
            monitor-exit(r25)     // Catch:{ all -> 0x0a41 }
            goto L_0x0b4d
        L_0x0a45:
            r2 = 7
        L_0x0a46:
            X.C26261Jm.A01(r5, r3)     // Catch:{ all -> 0x0df9 }
            X.1LQ r10 = r7.A0V     // Catch:{ all -> 0x0df9 }
            monitor-enter(r10)     // Catch:{ all -> 0x0df9 }
            long r0 = r5.A02     // Catch:{ all -> 0x0b48 }
            boolean r8 = r10.A02     // Catch:{ all -> 0x0b48 }
            if (r8 == 0) goto L_0x0b45
            X.3Qa r8 = r5.A1J     // Catch:{ all -> 0x0b48 }
            boolean r9 = r8.A02     // Catch:{ all -> 0x0b48 }
            if (r9 == 0) goto L_0x0b45
            r11 = 0
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x0b45
            r12 = 2
            r9 = 1
            if (r2 == r9) goto L_0x0a66
            if (r2 == r12) goto L_0x0a66
            goto L_0x0b45
        L_0x0a66:
            java.util.List r3 = r3.A06     // Catch:{ all -> 0x0b48 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0b48 }
            if (r3 != 0) goto L_0x0a78
            r12 = 1
            if (r2 != r9) goto L_0x0a78
            r12 = 0
            X.1LP r9 = r10.A01     // Catch:{ all -> 0x0b48 }
            r3 = 4
            r9.A00(r3, r0)     // Catch:{ all -> 0x0b48 }
        L_0x0a78:
            X.1LP r11 = r10.A01     // Catch:{ all -> 0x0b48 }
            boolean r0 = r11.A00(r12, r0)     // Catch:{ all -> 0x0b48 }
            if (r0 != 0) goto L_0x0b45
            monitor-enter(r10)     // Catch:{ all -> 0x0b48 }
            X.11F r3 = r8.A00     // Catch:{ all -> 0x0b42 }
            long r0 = r5.A0I     // Catch:{ all -> 0x0b42 }
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r8 = r0 % r8
            long r0 = r0 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r8
            java.util.List r8 = r5.A04     // Catch:{ all -> 0x0b42 }
            if (r8 != 0) goto L_0x0a95
            r23 = 0
            goto L_0x0a99
        L_0x0a95:
            int r23 = r8.size()     // Catch:{ all -> 0x0b42 }
        L_0x0a99:
            java.util.List r8 = r5.A05     // Catch:{ all -> 0x0b42 }
            int r22 = r8.size()     // Catch:{ all -> 0x0b42 }
            long r8 = r5.A02     // Catch:{ all -> 0x0b42 }
            boolean r21 = X.AnonymousClass143.A0G(r3)     // Catch:{ all -> 0x0b42 }
            if (r21 == 0) goto L_0x0ab7
            X.17X r5 = r10.A00     // Catch:{ all -> 0x0b42 }
            X.147 r3 = (X.AnonymousClass147) r3     // Catch:{ all -> 0x0b42 }
            X.17r r5 = r5.A07     // Catch:{ all -> 0x0b42 }
            int r3 = r5.A0A(r3)     // Catch:{ all -> 0x0b42 }
            int r20 = X.AnonymousClass3UK.A03(r3)     // Catch:{ all -> 0x0b42 }
        L_0x0ab5:
            monitor-enter(r11)     // Catch:{ all -> 0x0b42 }
            goto L_0x0aba
        L_0x0ab7:
            r20 = 0
            goto L_0x0ab5
        L_0x0aba:
            if (r12 == 0) goto L_0x0ac3
            r3 = 1
            if (r12 == r3) goto L_0x0ac0
            goto L_0x0ac6
        L_0x0ac0:
            java.lang.String r14 = "poll_votes_changed"
            goto L_0x0ac8
        L_0x0ac3:
            java.lang.String r14 = "poll_votes"
            goto L_0x0ac8
        L_0x0ac6:
            java.lang.String r14 = "poll_vote_deletes"
        L_0x0ac8:
            X.1LO r3 = r11.A00     // Catch:{ all -> 0x0b3f }
            X.1M0 r13 = r3.A04()     // Catch:{ all -> 0x0b3f }
            X.71s r15 = r13.B1k()     // Catch:{ all -> 0x0b35 }
            r3 = 6
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x0b2b }
            r12.<init>(r3)     // Catch:{ all -> 0x0b2b }
            java.lang.String r3 = "poll_id"
            java.lang.Long r5 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x0b2b }
            r12.put(r3, r5)     // Catch:{ all -> 0x0b2b }
            java.lang.String r5 = "option_count"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0b2b }
            r12.put(r5, r3)     // Catch:{ all -> 0x0b2b }
            java.lang.String r3 = "poll_creation_ds"
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0b2b }
            r12.put(r3, r0)     // Catch:{ all -> 0x0b2b }
            java.lang.String r1 = "users_participated"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)     // Catch:{ all -> 0x0b2b }
            r12.put(r1, r0)     // Catch:{ all -> 0x0b2b }
            java.lang.String r1 = "is_a_group_flag"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r21)     // Catch:{ all -> 0x0b2b }
            r12.put(r1, r0)     // Catch:{ all -> 0x0b2b }
            java.lang.String r1 = "group_size_bucket"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0b2b }
            r12.put(r1, r0)     // Catch:{ all -> 0x0b2b }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b2b }
            r12.put(r14, r0)     // Catch:{ all -> 0x0b2b }
            X.14e r3 = r13.A02     // Catch:{ all -> 0x0b2b }
            java.lang.String r1 = "poll_event_logging"
            java.lang.String r0 = "update_poll_action"
            r3.A04(r1, r0, r12)     // Catch:{ all -> 0x0b2b }
            r15.A00()     // Catch:{ all -> 0x0b2b }
            r15.close()     // Catch:{ all -> 0x0b35 }
            r13.close()     // Catch:{ all -> 0x0b3f }
            monitor-exit(r11)     // Catch:{ all -> 0x0b42 }
            monitor-exit(r10)     // Catch:{ all -> 0x0b48 }
            goto L_0x0b45
        L_0x0b2b:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0b30 }
            goto L_0x0b34
        L_0x0b30:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b35 }
        L_0x0b34:
            throw r1     // Catch:{ all -> 0x0b35 }
        L_0x0b35:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0b3a }
            goto L_0x0b3e
        L_0x0b3a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0b3f }
        L_0x0b3e:
            throw r1     // Catch:{ all -> 0x0b3f }
        L_0x0b3f:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0b42 }
            throw r0     // Catch:{ all -> 0x0b42 }
        L_0x0b42:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0b48 }
            throw r0     // Catch:{ all -> 0x0b48 }
        L_0x0b45:
            monitor-exit(r10)     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7f
        L_0x0b48:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0df9 }
            goto L_0x0b4d
        L_0x0b4b:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0df9 }
        L_0x0b4d:
            throw r0     // Catch:{ all -> 0x0df9 }
        L_0x0b4e:
            boolean r0 = r4 instanceof X.C46732ba     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0b74
            X.1Ji r0 = r7.A0O     // Catch:{ all -> 0x0df9 }
            android.util.Pair r5 = r0.A01(r6)     // Catch:{ all -> 0x0df9 }
            java.lang.Object r0 = r5.first     // Catch:{ all -> 0x0df9 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0df9 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0df9 }
            long r0 = r4.A1N     // Catch:{ all -> 0x0df9 }
            r8 = -1
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x0d7f
            java.lang.Object r0 = r5.second     // Catch:{ all -> 0x0df9 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0df9 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0df9 }
            r4.A1N = r0     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7f
        L_0x0b74:
            boolean r0 = r4 instanceof X.C46742bb     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0c26
            X.1LR r5 = r7.A0P     // Catch:{ all -> 0x0df9 }
            r8 = r6
            X.2c9 r8 = (X.AnonymousClass2c9) r8     // Catch:{ all -> 0x0df9 }
            r2 = r4
            X.2bb r2 = (X.C46742bb) r2     // Catch:{ all -> 0x0df9 }
            X.0x8 r1 = r5.A02     // Catch:{ all -> 0x0df9 }
            r0 = 86
            X.2bM r9 = r1.A06(r8, r0)     // Catch:{ all -> 0x0df9 }
            boolean r0 = r9 instanceof X.C46742bb     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0ba7
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0df9 }
            r3.<init>()     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = "MessageAddOnScheduledCallEditManager/getMessageAddOnScheduledCallEditForParentMessage no existing add on fmessage "
            r3.append(r0)     // Catch:{ all -> 0x0df9 }
            r3.append(r9)     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0df9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0df9 }
        L_0x0ba0:
            X.12P r0 = r5.A01     // Catch:{ all -> 0x0df9 }
            X.1M0 r3 = r0.A05()     // Catch:{ all -> 0x0df9 }
            goto L_0x0bb2
        L_0x0ba7:
            X.2bb r9 = (X.C46742bb) r9     // Catch:{ all -> 0x0df9 }
            if (r9 == 0) goto L_0x0ba0
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0df9 }
            X.AnonymousClass1LR.A00(r5, r0, r2)     // Catch:{ all -> 0x0df9 }
            goto L_0x0c92
        L_0x0bb2:
            X.71s r13 = r3.B1k()     // Catch:{ all -> 0x0c1c }
            long r11 = r1.A00(r2)     // Catch:{ all -> 0x0c12 }
            r0 = 2
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0c12 }
            r10.<init>(r0)     // Catch:{ all -> 0x0c12 }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0c12 }
            java.lang.String r0 = "message_add_on_row_id"
            r10.put(r0, r1)     // Catch:{ all -> 0x0c12 }
            int r0 = r2.A00     // Catch:{ all -> 0x0c12 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0c12 }
            java.lang.String r0 = "edit_type"
            r10.put(r0, r1)     // Catch:{ all -> 0x0c12 }
            int r0 = r2.A01     // Catch:{ all -> 0x0c12 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0c12 }
            java.lang.String r0 = "message_edit_version"
            r10.put(r0, r1)     // Catch:{ all -> 0x0c12 }
            X.14e r9 = r3.A02     // Catch:{ all -> 0x0c12 }
            java.lang.String r1 = "message_add_on_scheduled_call_edit"
            java.lang.String r0 = "MessageAddOnScheduledCallEditStore/insertMessage"
            r9.A05(r1, r0, r10)     // Catch:{ all -> 0x0c12 }
            r8.A00 = r2     // Catch:{ all -> 0x0c12 }
            r1 = 16
            boolean r0 = r8.A1S(r1)     // Catch:{ all -> 0x0c12 }
            if (r0 != 0) goto L_0x0bfa
            r8.A0i(r1)     // Catch:{ all -> 0x0c12 }
            X.0xM r0 = r5.A00     // Catch:{ all -> 0x0c12 }
            r0.A0j(r8)     // Catch:{ all -> 0x0c12 }
        L_0x0bfa:
            X.0xM r0 = r5.A00     // Catch:{ all -> 0x0c12 }
            X.176 r0 = r0.A0W     // Catch:{ all -> 0x0c12 }
            r0.A0B(r8)     // Catch:{ all -> 0x0c12 }
            X.3Qa r0 = r8.A1J     // Catch:{ all -> 0x0c12 }
            X.AnonymousClass1LR.A00(r5, r0, r2)     // Catch:{ all -> 0x0c12 }
            r13.A00()     // Catch:{ all -> 0x0c12 }
            r2 = 1
            r13.close()     // Catch:{ all -> 0x0c1c }
            r3.close()     // Catch:{ all -> 0x0df9 }
            goto L_0x0d7f
        L_0x0c12:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0c17 }
            goto L_0x0c1b
        L_0x0c17:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0c1c }
        L_0x0c1b:
            throw r1     // Catch:{ all -> 0x0c1c }
        L_0x0c1c:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0c21 }
            goto L_0x0c25
        L_0x0c21:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0df9 }
        L_0x0c25:
            throw r1     // Catch:{ all -> 0x0df9 }
        L_0x0c26:
            boolean r0 = r4 instanceof X.C46762bd     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0d7f
            X.1Jk r8 = r7.A0R     // Catch:{ all -> 0x0df9 }
            r3 = r6
            X.2bT r3 = (X.AnonymousClass2bT) r3     // Catch:{ all -> 0x0df9 }
            r2 = r4
            X.2bd r2 = (X.C46762bd) r2     // Catch:{ all -> 0x0df9 }
            X.0wQ r13 = r7.A01     // Catch:{ all -> 0x0df9 }
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)     // Catch:{ all -> 0x0df9 }
            X.AnonymousClass00C.A0D(r2, r5)     // Catch:{ all -> 0x0df9 }
            r0 = 3
            X.AnonymousClass00C.A0D(r13, r0)     // Catch:{ all -> 0x0df9 }
            X.2p2 r1 = r3.A02     // Catch:{ all -> 0x0df9 }
            X.2p2 r0 = X.C52192p2.VALID     // Catch:{ all -> 0x0df9 }
            if (r1 != r0) goto L_0x0d7c
            X.11F r0 = r2.A0J()     // Catch:{ all -> 0x0df9 }
            X.3Qa r12 = r2.A1J     // Catch:{ all -> 0x0df9 }
            boolean r9 = r12.A02     // Catch:{ all -> 0x0df9 }
            X.2bd r5 = X.C26241Jk.A00(r8, r3, r0, r9)     // Catch:{ all -> 0x0df9 }
            if (r5 != 0) goto L_0x0c70
            X.11F r10 = r2.A0J()     // Catch:{ all -> 0x0df9 }
            boolean r0 = r10 instanceof com.whatsapp.jid.UserJid     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0c95
            X.12O r1 = r8.A03     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.AnonymousClass00C.A0E(r10, r0)     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10     // Catch:{ all -> 0x0df9 }
            com.whatsapp.jid.UserJid r0 = r1.A0B(r10)     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0c95
            X.2bd r5 = X.C26241Jk.A00(r8, r3, r0, r9)     // Catch:{ all -> 0x0df9 }
            if (r5 == 0) goto L_0x0c95
        L_0x0c70:
            if (r29 == 0) goto L_0x0c8a
            if (r9 == 0) goto L_0x0c8a
            long r0 = r5.A00     // Catch:{ all -> 0x0df9 }
            long r10 = r2.A00     // Catch:{ all -> 0x0df9 }
            int r14 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x0c8a
            r10 = 1
            long r0 = r0 + r10
            r2.A00 = r0     // Catch:{ all -> 0x0df9 }
            X.0wN r11 = r8.A00     // Catch:{ all -> 0x0df9 }
            r10 = 0
            r1 = 0
            java.lang.String r0 = "event_response_timestamp_adjustment"
            r11.A0E(r0, r10, r1)     // Catch:{ all -> 0x0df9 }
        L_0x0c8a:
            long r10 = r5.A00     // Catch:{ all -> 0x0df9 }
            long r0 = r2.A00     // Catch:{ all -> 0x0df9 }
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 < 0) goto L_0x0c95
        L_0x0c92:
            r2 = 5
            goto L_0x0d7f
        L_0x0c95:
            X.12P r0 = r8.A02     // Catch:{ SQLiteConstraintException -> 0x0d66 }
            X.1M0 r11 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x0d66 }
            X.71s r10 = r11.B1k()     // Catch:{ all -> 0x0d5f }
            if (r5 == 0) goto L_0x0ca8
            long r0 = r5.A1N     // Catch:{ all -> 0x0d58 }
            X.0x8 r14 = r8.A04     // Catch:{ all -> 0x0d58 }
            r14.A08(r0)     // Catch:{ all -> 0x0d58 }
        L_0x0ca8:
            if (r9 != 0) goto L_0x0cc7
            X.3Qa r0 = r3.A1J     // Catch:{ all -> 0x0d58 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0d58 }
            if (r0 == 0) goto L_0x0cc7
            r9 = 17
            if (r5 == 0) goto L_0x0cb9
            int r0 = r5.A0D     // Catch:{ all -> 0x0d58 }
            r14 = 1
            if (r0 == r9) goto L_0x0cba
        L_0x0cb9:
            r14 = 0
        L_0x0cba:
            X.2pC r1 = r2.A01     // Catch:{ all -> 0x0d58 }
            if (r1 == 0) goto L_0x0cc4
            X.2pC r0 = X.C52292pC.A04     // Catch:{ all -> 0x0d58 }
            if (r0 == r1) goto L_0x0cc4
            if (r14 == 0) goto L_0x0cc7
        L_0x0cc4:
            r2.A0n(r9)     // Catch:{ all -> 0x0d58 }
        L_0x0cc7:
            X.0x8 r0 = r8.A04     // Catch:{ all -> 0x0d58 }
            long r0 = r0.A00(r2)     // Catch:{ all -> 0x0d58 }
            r20 = -1
            int r9 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r9 != 0) goto L_0x0cd5
            r2 = 6
            goto L_0x0d42
        L_0x0cd5:
            r2.A1N = r0     // Catch:{ all -> 0x0d58 }
            r0 = 3
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0d51 }
            r9.<init>(r0)     // Catch:{ all -> 0x0d51 }
            X.2pC r0 = r2.A01     // Catch:{ all -> 0x0d51 }
            if (r0 != 0) goto L_0x0ce3
            X.2pC r0 = X.C52292pC.A04     // Catch:{ all -> 0x0d51 }
        L_0x0ce3:
            int r14 = r0.value     // Catch:{ all -> 0x0d51 }
            long r0 = r2.A1N     // Catch:{ all -> 0x0d51 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d51 }
            java.lang.String r0 = "message_add_on_row_id"
            r9.put(r0, r1)     // Catch:{ all -> 0x0d51 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0d51 }
            java.lang.String r0 = "response"
            r9.put(r0, r1)     // Catch:{ all -> 0x0d51 }
            long r0 = r2.A00     // Catch:{ all -> 0x0d51 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0d51 }
            java.lang.String r0 = "sender_timestamp"
            r9.put(r0, r1)     // Catch:{ all -> 0x0d51 }
            X.14e r15 = r11.A02     // Catch:{ all -> 0x0d51 }
            java.lang.String r14 = "message_add_on_event_response"
            r1 = 5
            java.lang.String r0 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse"
            long r14 = r15.A08(r14, r0, r9, r1)     // Catch:{ all -> 0x0d51 }
            int r0 = (r14 > r20 ? 1 : (r14 == r20 ? 0 : -1))
            if (r0 == 0) goto L_0x0d49
            r11.close()     // Catch:{ all -> 0x0d58 }
            r0 = 32
            boolean r1 = r3.A1S(r0)     // Catch:{ all -> 0x0d58 }
            r3.A1Z(r13, r2)     // Catch:{ all -> 0x0d58 }
            boolean r0 = r3.A1S(r0)     // Catch:{ all -> 0x0d58 }
            if (r1 != 0) goto L_0x0d2c
            if (r0 == 0) goto L_0x0d2c
            X.0xM r0 = r8.A01     // Catch:{ all -> 0x0d58 }
            r0.A0j(r3)     // Catch:{ all -> 0x0d58 }
        L_0x0d2c:
            X.0xM r0 = r8.A01     // Catch:{ all -> 0x0d58 }
            X.176 r0 = r0.A0W     // Catch:{ all -> 0x0d58 }
            r0.A0B(r3)     // Catch:{ all -> 0x0d58 }
            r10.A00()     // Catch:{ all -> 0x0d58 }
            if (r5 != 0) goto L_0x0d3a
            r2 = 1
            goto L_0x0d42
        L_0x0d3a:
            int r1 = r5.A0D     // Catch:{ all -> 0x0d58 }
            r0 = 17
            r2 = 2
            if (r1 != r0) goto L_0x0d42
            r2 = 3
        L_0x0d42:
            r10.close()     // Catch:{ all -> 0x0d5f }
            r11.close()     // Catch:{ SQLiteConstraintException -> 0x0d66 }
            goto L_0x0d7f
        L_0x0d49:
            java.lang.String r1 = "EventResponseMessageStore/insertOrUpdateMessageEventResponse the row was not updated"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0d51 }
            r0.<init>(r1)     // Catch:{ all -> 0x0d51 }
            throw r0     // Catch:{ all -> 0x0d51 }
        L_0x0d51:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d53 }
        L_0x0d53:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ all -> 0x0d58 }
            throw r0     // Catch:{ all -> 0x0d58 }
        L_0x0d58:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d5a }
        L_0x0d5a:
            r0 = move-exception
            X.C05600Qi.A00(r10, r1)     // Catch:{ all -> 0x0d5f }
            throw r0     // Catch:{ all -> 0x0d5f }
        L_0x0d5f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d61 }
        L_0x0d61:
            r0 = move-exception
            X.C05600Qi.A00(r11, r1)     // Catch:{ SQLiteConstraintException -> 0x0d66 }
            throw r0     // Catch:{ SQLiteConstraintException -> 0x0d66 }
        L_0x0d66:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0df9 }
            r1.<init>()     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = "EventResponseMessageManager/storeEventResponseMessage failed to insert addon message "
            r1.append(r0)     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = r12.A01     // Catch:{ all -> 0x0df9 }
            r1.append(r0)     // Catch:{ all -> 0x0df9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0df9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0df9 }
        L_0x0d7c:
            r2 = 7
            goto L_0x0d7f
        L_0x0d7e:
            monitor-exit(r9)     // Catch:{ all -> 0x0df9 }
        L_0x0d7f:
            boolean r0 = X.C65733Tg.A02(r2)     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0def
            int r1 = r4.A1Y()     // Catch:{ all -> 0x0df9 }
            boolean r0 = r6.A1S(r1)     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0d97
            r6.A0i(r1)     // Catch:{ all -> 0x0df9 }
            X.0xM r0 = r7.A07     // Catch:{ all -> 0x0df9 }
            r0.A0j(r6)     // Catch:{ all -> 0x0df9 }
        L_0x0d97:
            int r5 = A01(r4)     // Catch:{ all -> 0x0df9 }
            X.1DQ r0 = r7.A08     // Catch:{ all -> 0x0df9 }
            android.os.Handler r3 = r0.A02     // Catch:{ all -> 0x0df9 }
            r1 = 2
            r0 = 0
            android.os.Message r0 = android.os.Message.obtain(r3, r1, r5, r0, r6)     // Catch:{ all -> 0x0df9 }
            r0.sendToTarget()     // Catch:{ all -> 0x0df9 }
            long r0 = r4.A1N     // Catch:{ all -> 0x0df9 }
            r4.A1O = r0     // Catch:{ all -> 0x0df9 }
            if (r18 == 0) goto L_0x0dbd
            X.0wQ r0 = r7.A01     // Catch:{ all -> 0x0df9 }
            boolean r0 = X.C66013Ui.A0R(r0, r4)     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0dbd
            java.util.Set r0 = java.util.Collections.singleton(r4)     // Catch:{ all -> 0x0df9 }
            r7.A06(r0)     // Catch:{ all -> 0x0df9 }
        L_0x0dbd:
            X.0wU r3 = r7.A0W     // Catch:{ all -> 0x0df9 }
            r1 = 33
            X.1j7 r0 = new X.1j7     // Catch:{ all -> 0x0df9 }
            r0.<init>(r7, r4, r1)     // Catch:{ all -> 0x0df9 }
            r3.Boy(r0)     // Catch:{ all -> 0x0df9 }
            if (r19 == 0) goto L_0x0def
            boolean r0 = r4 instanceof X.AnonymousClass5J2     // Catch:{ all -> 0x0df9 }
            if (r0 == 0) goto L_0x0def
            X.19J r0 = r7.A02     // Catch:{ all -> 0x0df9 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0df9 }
            if (r0 != 0) goto L_0x0def
            X.5J2 r4 = (X.AnonymousClass5J2) r4     // Catch:{ all -> 0x0df9 }
            int r1 = r4.A00     // Catch:{ all -> 0x0df9 }
            r0 = 1
            if (r1 != r0) goto L_0x0def
            X.1Jr r5 = r7.A0F     // Catch:{ all -> 0x0df9 }
            X.163 r1 = r7.A05     // Catch:{ all -> 0x0df9 }
            r0 = r19
            long r3 = r1.A08(r0)     // Catch:{ all -> 0x0df9 }
            r1 = r16
            r0 = r17
            r5.A01(r1, r0, r3)     // Catch:{ all -> 0x0df9 }
        L_0x0def:
            r16.A00()     // Catch:{ all -> 0x0df9 }
            r16.close()     // Catch:{ all -> 0x0e03 }
            r17.close()
            return r2
        L_0x0df9:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x0dfe }
            goto L_0x0e02
        L_0x0dfe:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0e03 }
        L_0x0e02:
            throw r1     // Catch:{ all -> 0x0e03 }
        L_0x0e03:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x0e08 }
            throw r1
        L_0x0e08:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26171Jd.A00(X.1Jd, X.2bM, boolean):int");
    }
}
