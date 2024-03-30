package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1aH  reason: invalid class name and case insensitive filesystem */
public class C30481aH implements C236319f {
    public int A00;
    public final C19460v5 A01;
    public final C19460v5 A02;
    public final C19700wN A03;
    public final C30511aK A04;
    public final C19730wQ A05;
    public final AnonymousClass1DT A06;
    public final C27341Nv A07;
    public final AnonymousClass1XX A08;
    public final AnonymousClass1NG A09;
    public final C25771Hp A0A;
    public final AnonymousClass1AN A0B;
    public final C19600wD A0C;
    public final AnonymousClass185 A0D;
    public final C27301Nr A0E;
    public final C30791am A0F;
    public final C19970wo A0G;
    public final C19420v0 A0H;
    public final AnonymousClass189 A0I;
    public final AnonymousClass18I A0J;
    public final AnonymousClass1C7 A0K;
    public final C20310xM A0L;
    public final AnonymousClass17X A0M;
    public final AnonymousClass1FN A0N;
    public final AnonymousClass17T A0O;
    public final C26171Jd A0P;
    public final AnonymousClass1YE A0Q;
    public final C236419g A0R;
    public final AnonymousClass1OD A0S;
    public final C231417i A0T;
    public final C25701Hi A0U;
    public final AnonymousClass1AI A0V;
    public final C20810yC A0W;
    public final C25181Fh A0X;
    public final C20350xQ A0Y;
    public final C20510xg A0Z;
    public final AnonymousClass1Y4 A0a;
    public final C29841Ye A0b;
    public final AnonymousClass1GO A0c;
    public final AnonymousClass1Y8 A0d;
    public final C30571aQ A0e;
    public final AnonymousClass19I A0f;
    public final AnonymousClass1W9 A0g;
    public final C236919l A0h;
    public final AnonymousClass1C5 A0i;
    public final AnonymousClass1DL A0j;
    public final C24581Cz A0k;
    public final AnonymousClass19L A0l;
    public final C31051bC A0m;
    public final C31041bB A0n;
    public final AnonymousClass1EU A0o;
    public final C30911ay A0p;
    public final C30501aJ A0q;
    public final C30821ap A0r;
    public final C238019x A0s;
    public final C31021b9 A0t;
    public final AnonymousClass1A1 A0u;
    public final C231017e A0v;
    public final C19770wU A0w;
    public final Set A0x = new HashSet();
    public final Set A0y = new HashSet();
    public final C20300xL A0z;
    public final C21100yf A10;
    public final AnonymousClass164 A11;
    public final AnonymousClass19J A12;
    public final AnonymousClass16D A13;
    public final AnonymousClass187 A14;
    public final C220412q A15;
    public final C28291Sb A16;
    public final AnonymousClass1TN A17;
    public final C31011b8 A18;
    public final C21010yW A19;
    public final C30831aq A1A;
    public final C30901ax A1B;
    public final AnonymousClass1C4 A1C;
    public final AnonymousClass1T9 A1D;
    public final C30921az A1E;
    public final C30521aL A1F;
    public final C30491aI A1G;

    private void A01(DeviceJid deviceJid, C23084B3s b3s, Map map) {
        Set set = this.A0x;
        synchronized (set) {
            Integer num = null;
            C23084B3s b3s2 = b3s;
            Map map2 = map;
            if (map != null) {
                if (!set.contains(map)) {
                    set.add(map);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessagingXmppHandler/onMessageForMe message in queue; skipping id:");
                    sb.append((String) map.get(PublicKeyCredentialControllerUtility.JSON_KEY_ID));
                    Log.i(sb.toString());
                    this.A06.A0S(b3s, (Integer) null, 16);
                    this.A0l.A04(b3s.BDf());
                }
            }
            this.A00++;
            C177808eP r3 = (C177808eP) AnonymousClass19L.A00(this.A0l, 0, b3s.BDf());
            if (r3 != null) {
                r3.A01 = (long) (this.A00 - 1);
                r3.A04(2);
                num = r3.A08;
                if (num != null && map == null) {
                    if (C20800yB.A01(C21000yV.A02, this.A0W, 6363)) {
                        this.A0g.A02(num.intValue());
                    }
                }
            }
            this.A0q.A00(new C35421if(this, num, map2, deviceJid, b3s2, 3));
        }
    }

    private int A00(String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String obj;
        if (bArr2 == null) {
            return 1;
        }
        if (bArr == null) {
            obj = "MessagingXmppHandler/validateServerErrorEncData/badmediadata;";
        } else if (bArr3 == null) {
            obj = "MessagingXmppHandler/validateServerErrorEncData/incomplete enc data";
        } else {
            AnonymousClass00C.A0D(str, 2);
            AnonymousClass1Y8.A00(bArr, bArr3);
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
            if (nativeHolder != null) {
                C197259bO r0 = new C197259bO(nativeHolder);
                JniBridge.getInstance();
                NativeHolder nativeHolder2 = r0.A00;
                long j = (long) 36;
                if (str.equals(JniBridge.jvidispatchOIO(1, j, nativeHolder2))) {
                    return 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("MessagingXmppHandler/validateServerErrorEncData/incorrect stanza id; key=");
                sb.append(str);
                sb.append("; stanzaId=");
                JniBridge.getInstance();
                sb.append((String) JniBridge.jvidispatchOIO(1, j, nativeHolder2));
                obj = sb.toString();
            } else {
                Log.e("MessagingXmppHandler/validateServerErrorEncData/malformed enc data");
                return 3;
            }
        }
        Log.e(obj);
        return 0;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x019a A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.B3V r36, X.C30481aH r37, long r38) {
        /*
            r6 = r37
            X.1C7 r0 = r6.A0K
            r0.A00()
            r37 = r36
            X.9uj r5 = r37.BuJ()
            X.19L r3 = r6.A0l
            if (r5 == 0) goto L_0x0371
            long r1 = r5.A00
        L_0x0013:
            r0 = 1
            X.9ju r4 = X.AnonymousClass19L.A00(r3, r0, r1)
            X.8eQ r4 = (X.C177818eQ) r4
            if (r4 == 0) goto L_0x0020
            r0 = 3
            r4.A04(r0)
        L_0x0020:
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            java.util.HashSet r22 = new java.util.HashSet
            r22.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.HashSet r20 = new java.util.HashSet
            r20.<init>()
            java.util.HashMap r19 = new java.util.HashMap
            r19.<init>()
            if (r5 == 0) goto L_0x036e
            com.whatsapp.jid.UserJid r3 = r5.A03
        L_0x003d:
            r1 = 0
            X.14g r18 = new X.14g
            r0 = r18
            r0.<init>((boolean) r1)
            r18.A03()
            int r15 = r37.size()
            if (r4 == 0) goto L_0x0051
            long r0 = (long) r15
            r4.A02 = r0
        L_0x0051:
            r2 = 0
        L_0x0052:
            r7 = 1
            if (r2 >= r15) goto L_0x0098
            long r8 = r18.A00()
            int r0 = (r8 > r38 ? 1 : (r8 == r38 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            if (r4 == 0) goto L_0x0062
            long r0 = (long) r2
            r4.A01 = r0
        L_0x0062:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageStatusUpdate: processed "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = " items in "
            r3.append(r0)
            long r0 = r18.A00()
            r3.append(r0)
            java.lang.String r0 = " msec.  Requeuing "
            r3.append(r0)
            int r0 = r15 - r2
            r3.append(r0)
            java.lang.String r0 = " items."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.164 r1 = r6.A11
            r0 = r37
            r0.BpO(r1, r2)
        L_0x0098:
            if (r2 < r15) goto L_0x009f
            if (r4 == 0) goto L_0x009f
            long r0 = (long) r15
            r4.A01 = r0
        L_0x009f:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x00ac
            X.1Sb r1 = r6.A16
            r0 = r23
            r1.A02(r0)
        L_0x00ac:
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L_0x037a
            X.1YE r9 = r6.A0Q
            X.1Jd r2 = r9.A09
            r1 = r19
            r0 = r22
            r2.A0M(r1, r0)
            java.util.Set r0 = r19.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x00c5:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0375
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1Si r4 = r9.A0D
            java.lang.Object r3 = r0.getKey()
            android.os.Handler r2 = r4.A04()
            r1 = 46
            X.1jB r0 = new X.1jB
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            goto L_0x00c5
        L_0x00e6:
            r0 = r37
            com.whatsapp.jid.DeviceJid r1 = r0.BlJ(r2)
            long r29 = r0.Bvd(r2)
            X.3Qa r8 = r0.BNu(r2)
            com.whatsapp.jid.Jid r9 = r37.Bna()
            X.11F r10 = r8.A00
            boolean r0 = X.AnonymousClass143.A0G(r10)
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10 instanceof X.C177528dw
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10 instanceof X.C177618e5
            if (r0 != 0) goto L_0x0114
            boolean r0 = r10 instanceof X.C28981Uw
            if (r0 != 0) goto L_0x0114
            boolean r0 = r8.A02
            if (r0 != 0) goto L_0x0368
            boolean r0 = r9 instanceof X.C177538dx
            if (r0 == 0) goto L_0x0368
        L_0x0114:
            int r0 = r37.Bv2()
            if (r1 == 0) goto L_0x012b
            com.whatsapp.jid.UserJid r9 = r1.userJid
            boolean r9 = X.C197029b1.A00(r9)
            if (r9 == 0) goto L_0x012b
            if (r3 == 0) goto L_0x012b
            java.lang.String r9 = r8.A01
            X.3Qa r8 = new X.3Qa
            r8.<init>(r3, r9, r7)
        L_0x012b:
            X.1A1 r9 = r6.A0u
            X.3T1 r7 = r9.A03(r8)
            if (r7 != 0) goto L_0x0260
            X.1Jd r7 = r6.A0P
            X.2bM r7 = r7.A0B(r8)
            if (r7 != 0) goto L_0x0260
            X.11F r11 = r8.A00
            r12 = 0
            java.lang.String r10 = r8.A01
            X.3Qa r7 = new X.3Qa
            r7.<init>(r11, r10, r12)
            X.3T1 r7 = r9.A03(r7)
            if (r7 != 0) goto L_0x0260
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r7 = "MessagingXmppHandler/updatetargetstatus/nosuchmessage: "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            com.whatsapp.util.Log.w((java.lang.String) r7)
            boolean r7 = X.AnonymousClass3TJ.A01(r0)
            if (r7 == 0) goto L_0x0195
            X.1TN r9 = r6.A17
            X.C18740tg.A06(r1)
            X.3Jf r7 = new X.3Jf
            r31 = r7
            r32 = r1
            r33 = r3
            r34 = r0
            r35 = r29
            r31.<init>(r32, r33, r34, r35)
            long r0 = r7.A01
            r13 = 0
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x019e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = "orphanedreceiptstore/addorphanedreceiptsformessage/invalid timestamp: "
            r8.append(r7)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0195:
            if (r4 == 0) goto L_0x019a
            r0 = 1
            r4.A05 = r0
        L_0x019a:
            int r2 = r2 + 1
            goto L_0x0052
        L_0x019e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = "orphanedreceiptstore/addorphanedreceiptsformessage/key:"
            r13.append(r12)
            r13.append(r8)
            java.lang.String r12 = ";receipt:"
            r13.append(r12)
            r13.append(r7)
            java.lang.String r12 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r12)
            r13 = 6
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>(r13)
            X.163 r13 = r9.A01
            X.C18740tg.A06(r11)
            long r13 = r13.A08(r11)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            java.lang.String r11 = "chat_row_id"
            r12.put(r11, r13)
            java.lang.String r11 = "key_id"
            r12.put(r11, r10)
            boolean r10 = r8.A02
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            java.lang.String r10 = "from_me"
            r12.put(r10, r11)
            X.12j r13 = r9.A02
            com.whatsapp.jid.DeviceJid r11 = r7.A02
            long r16 = r13.A07(r11)
            java.lang.Long r14 = java.lang.Long.valueOf(r16)
            java.lang.String r10 = "receipt_device_jid_row_id"
            r12.put(r10, r14)
            com.whatsapp.jid.UserJid r10 = r7.A03
            if (r10 == 0) goto L_0x0204
            long r13 = r13.A07(r10)
            java.lang.Long r14 = java.lang.Long.valueOf(r13)
            java.lang.String r13 = "receipt_recipient_jid_row_id"
            r12.put(r13, r14)
        L_0x0204:
            int r14 = r7.A00
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
            java.lang.String r7 = "status"
            r12.put(r7, r13)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r12.put(r0, r1)
            X.12P r0 = r9.A03     // Catch:{ SQLiteConstraintException -> 0x0236 }
            X.1M0 r9 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x0236 }
            X.14e r7 = r9.A02     // Catch:{ all -> 0x022c }
            java.lang.String r1 = "receipt_orphaned"
            java.lang.String r0 = "addOrphanedReceiptsForMessage/INSERT_RECEIPT_ORPHANED"
            r7.A05(r1, r0, r12)     // Catch:{ all -> 0x022c }
            r9.close()     // Catch:{ SQLiteConstraintException -> 0x0236 }
            goto L_0x0195
        L_0x022c:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0231 }
            goto L_0x0235
        L_0x0231:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLiteConstraintException -> 0x0236 }
        L_0x0235:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x0236 }
        L_0x0236:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "orphanedreceiptstore/addorphanedreceiptsformessage/failed "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r11)
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0195
        L_0x0260:
            if (r3 == 0) goto L_0x02a5
            X.3Qa r9 = r7.A1J
            X.11F r9 = r9.A00
            boolean r9 = X.AnonymousClass143.A0G(r9)
            if (r9 == 0) goto L_0x02a5
            X.11F r9 = r7.A0J()
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x02a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageStatusUpdate: invalid message update. StanzaKey="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0wN r8 = r6.A03
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "StanzaKey="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r7 = r1.toString()
            java.lang.String r1 = "invalid_message_status_update"
            r0 = 0
            r8.A0E(r1, r7, r0)
            goto L_0x019a
        L_0x02a5:
            X.3Qa r10 = r7.A1J
            X.11F r9 = r10.A00
            boolean r11 = r9 instanceof X.C28981Uw
            if (r11 != 0) goto L_0x0310
            boolean r11 = r7 instanceof X.AnonymousClass2bM
            if (r11 == 0) goto L_0x0323
            r8 = 17
            if (r0 != r8) goto L_0x02fa
            r0 = r22
            r0.add(r10)
            r0 = r19
            java.lang.Object r10 = r0.get(r9)
            java.lang.Number r10 = (java.lang.Number) r10
            if (r10 == 0) goto L_0x02ce
            long r12 = r10.longValue()
            long r0 = r7.A1N
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 >= 0) goto L_0x02d4
        L_0x02ce:
            long r0 = r7.A1N
            java.lang.Long r10 = java.lang.Long.valueOf(r0)
        L_0x02d4:
            int r0 = r7.A1I
            java.util.List r1 = X.C65733Tg.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x019a
            r0 = r7
            X.2bM r0 = (X.AnonymousClass2bM) r0
            X.3Qa r1 = r0.A1Z()
            int r0 = r7.A0D
            if (r0 == r8) goto L_0x019a
            if (r1 == 0) goto L_0x019a
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x019a
            r0 = r19
            r0.put(r9, r10)
            goto L_0x019a
        L_0x02fa:
            r8 = 15
            if (r0 == r8) goto L_0x0301
            r8 = 5
            if (r0 != r8) goto L_0x019a
        L_0x0301:
            X.3ur r11 = r37.Bmw()
            r8 = r6
            r9 = r1
            r10 = r7
            r12 = r0
            r13 = r29
            r8.A08(r9, r10, r11, r12, r13)
            goto L_0x019a
        L_0x0310:
            X.3ur r27 = r37.Bmw()
            r24 = r6
            r25 = r1
            r26 = r7
            r28 = r0
            boolean r1 = r24.A08(r25, r26, r27, r28, r29)
            if (r1 == 0) goto L_0x019a
            goto L_0x0342
        L_0x0323:
            r10 = 17
            if (r0 != r10) goto L_0x034f
            boolean r9 = r9 instanceof X.C177638e7
            if (r9 != 0) goto L_0x0310
            X.11F r9 = r7.A0J()
            boolean r9 = X.C197029b1.A00(r9)
            if (r9 != 0) goto L_0x0310
            X.1C5 r9 = r6.A0i
            boolean r9 = r9.A06(r7)
            if (r9 == 0) goto L_0x0310
            r1 = r21
        L_0x033f:
            r1.add(r7)
        L_0x0342:
            boolean r0 = X.C28291Sb.A00(r8, r0)
            if (r0 == 0) goto L_0x019a
            r0 = r23
            r0.add(r8)
            goto L_0x019a
        L_0x034f:
            r9 = 18
            if (r0 != r9) goto L_0x0310
            X.3ur r27 = r37.Bmw()
            r28 = 8
            r24 = r6
            r25 = r1
            r26 = r7
            boolean r1 = r24.A08(r25, r26, r27, r28, r29)
            if (r1 == 0) goto L_0x019a
            r1 = r20
            goto L_0x033f
        L_0x0368:
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r9)
            goto L_0x0114
        L_0x036e:
            r3 = 0
            goto L_0x003d
        L_0x0371:
            r1 = 0
            goto L_0x0013
        L_0x0375:
            X.1Si r0 = r9.A0D
            r0.A09()
        L_0x037a:
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0387
            X.1DL r1 = r6.A0j
            r0 = r21
            r1.A0F(r0)
        L_0x0387:
            boolean r0 = r20.isEmpty()
            if (r0 != 0) goto L_0x0394
            X.1C4 r1 = r6.A1C
            r0 = r20
            r1.A04(r0, r7)
        L_0x0394:
            r18.A01()
            if (r5 == 0) goto L_0x039e
            X.1C4 r0 = r6.A1C
            r0.A01(r5)
        L_0x039e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30481aH.A02(X.B3V, X.1aH, long):void");
    }

    private void A03(AnonymousClass3T1 r3, C64933Qa r4, int i) {
        if (r3 != null) {
            try {
                A04(r3, r4, 20);
            } catch (Exception e) {
                Log.e("MessagingXmppHandler/markAndLogMessageSendFailure/", e);
            }
            A05(r3, r4, 3, i);
        }
    }

    private void A04(AnonymousClass3T1 r5, C64933Qa r6, int i) {
        if (r5 instanceof AnonymousClass2bM) {
            AnonymousClass1YE r3 = this.A0Q;
            if (!C66013Ui.A0R(r3.A01, r5)) {
                Log.e("MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self");
            } else {
                r3.A04.A01(new C35701j7(r3, r5, 37), 57);
            }
        } else if (r5 != null) {
            r5.A0n(i);
            this.A0L.A0n(r5, 23);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("MessagingXmppHandler/onMessageError/bounce unable to find message ");
            sb.append(r6);
            Log.w(sb.toString());
        }
    }

    private void A05(AnonymousClass3T1 r19, C64933Qa r20, int i, int i2) {
        int i3;
        try {
            C64933Qa r2 = r20;
            HashSet A002 = this.A0N.A00(r2);
            AnonymousClass1DT r4 = this.A06;
            AnonymousClass3T1 r5 = r19;
            if (r5.A0H() == 1) {
                i3 = this.A0L.A0k.A01(r5);
            } else {
                i3 = 0;
            }
            r4.A0P(r5, (Integer) null, i, i3, AnonymousClass143.A09(this.A03, A002).size(), A002.size(), 0, 0, i2, true, true, false, this.A0f.A02.contains(r2));
        } catch (Exception e) {
            Log.e("MessagingXmppHandler/logMessageSendFailure/", e);
        }
    }

    private void A06(C64933Qa r15, boolean z, boolean z2) {
        Object obj;
        long j;
        long j2;
        C64933Qa r7 = r15;
        HashSet hashSet = new HashSet(this.A0N.A00(r15));
        C19730wQ r0 = this.A05;
        if (z2) {
            obj = r0.A07();
        } else {
            r0.A0G();
            obj = r0.A02;
        }
        hashSet.add(obj);
        Set A092 = AnonymousClass143.A09(this.A03, hashSet);
        C27301Nr r6 = this.A0E;
        UserJid[] userJidArr = (UserJid[]) A092.toArray(new UserJid[0]);
        if (z) {
            j2 = 0;
        } else {
            long A002 = C19970wo.A00(this.A0G);
            long A003 = (long) C20800yB.A00(C21000yV.A02, this.A0W, 2257);
            if (A003 <= 0 || A003 > 60) {
                j = 300000;
            } else {
                j = A003 * 60000;
            }
            j2 = A002 + j;
        }
        boolean A022 = this.A12.A02();
        if (userJidArr.length == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("SyncDeviceAndResendMessageJob/empty recipients for ");
            sb.append(r15);
            Log.w(sb.toString());
        } else if (r6.A02.A01(r15)) {
            r6.A00.A01(new SyncDeviceAndResendMessageJob(r7, userJidArr, C19970wo.A00(r6.A04), j2, A022));
        }
    }

    private boolean A08(DeviceJid deviceJid, AnonymousClass3T1 r22, C80113ur r23, int i, long j) {
        this.A0K.A00();
        AnonymousClass3T1 r8 = r22;
        boolean z = true;
        if (r8.A0D == 21) {
            StringBuilder sb = new StringBuilder();
            sb.append("MessagingXmppHandler/onMessageStatusUpdate: ");
            sb.append(r8.A1J.A01);
            sb.append(" Ignoring status update as the message has permanent send failure");
            Log.i(sb.toString());
        } else {
            C64933Qa r6 = r8.A1J;
            int i2 = i;
            if (!AnonymousClass3TJ.A01(i2)) {
                return this.A16.A03((C06120Sj) null, r6, i2);
            }
            DeviceJid deviceJid2 = deviceJid;
            long j2 = j;
            if (r8 instanceof AnonymousClass2bM) {
                this.A0N.A01(deviceJid2, r8, j2);
            } else {
                C31011b8 r5 = this.A18;
                r5.A01.A00();
                AnonymousClass3T1 A032 = r5.A03.A03(r6);
                if (A032 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("PrivacyStateMessageManager/check privacy conflict on receipt/fMsg not found for messageKey=");
                    sb2.append(r6);
                    Log.e(sb2.toString());
                } else {
                    AnonymousClass1TV r3 = r5.A02;
                    C600436g A002 = r3.A00(A032.A1N);
                    C80113ur r2 = null;
                    C80113ur r9 = r23;
                    if (A002 != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("PrivacyStateMessageManager/check privacy conflict on receipt/");
                        sb3.append(r6);
                        Log.i(sb3.toString());
                        r2 = A002.A00;
                    } else if (r23 != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("PrivacyStateMessageManager/check privacy conflict on receipt (ent upgrade)/");
                        sb4.append(r6);
                        Log.i(sb4.toString());
                    }
                    if (AnonymousClass3MX.A01(r2, r9)) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("PrivacyStateMessageManager/check privacy conflict on receipt/privacy mismatch. jid=");
                        AnonymousClass11F r4 = A032.A1J.A00;
                        sb5.append(r4);
                        sb5.append(" privacy mode=");
                        sb5.append(r9);
                        sb5.append(" row id=");
                        sb5.append(A032.A1N);
                        Log.w(sb5.toString());
                        if (r23 != null) {
                            AnonymousClass1M0 A052 = r3.A02.A05();
                            try {
                                C1495671s B1k = A052.B1k();
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("message_row_id", Long.valueOf(A032.A1N));
                                    contentValues.put("host_storage", Integer.valueOf(r9.hostStorage));
                                    contentValues.put("actual_actors", Integer.valueOf(r9.actualActors));
                                    contentValues.put("privacy_mode_ts", Long.valueOf(r9.privacyModeTs));
                                    A052.A02.A08("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", contentValues, 5);
                                    A032.A0j(ZipDecompressor.UNZIP_BUFFER_SIZE);
                                    r3.A01.A05(A032, false);
                                    B1k.A00();
                                } catch (IOException e) {
                                    StringBuilder sb6 = new StringBuilder();
                                    sb6.append("Failed to update msg privacy flag for ");
                                    sb6.append(A032.A1N);
                                    Log.e(sb6.toString(), e);
                                } catch (Throwable th) {
                                    B1k.close();
                                    throw th;
                                }
                                B1k.close();
                                A052.close();
                                if (r2 == null || r2.privacyModeTs < r9.privacyModeTs) {
                                    StringBuilder sb7 = new StringBuilder();
                                    sb7.append("PrivacyStateMessageManager/check privacy conflict on receipt/GetVNameCertificateJob. UserJid=");
                                    sb7.append(r4);
                                    Log.w(sb7.toString());
                                    AnonymousClass164 r24 = r5.A00;
                                    C222813r r0 = UserJid.Companion;
                                    r24.A01(new GetVNameCertificateJob(C222813r.A00(r4)));
                                }
                            } catch (Throwable th2) {
                                try {
                                    A052.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } else {
                            r3.A01(A032.A1N);
                        }
                    }
                }
                C28291Sb r1 = this.A16;
                C18740tg.A06(deviceJid2);
                r1.A02.A00();
                r1.A0C.remove(r6);
                z = r1.A04(deviceJid2, r8, i2, j2);
            }
            if (r6.A02 || C66013Ui.A0T(this.A05, r8)) {
                AnonymousClass6EZ A022 = C133256Xm.A02(deviceJid2);
                AnonymousClass189 r12 = this.A0I;
                if (r12.A0X()) {
                    r12.A0T(A022, r6);
                    return z;
                }
                AnonymousClass187 r25 = this.A14;
                r25.A00.execute(new C35661j3(r6, A022, this, 5));
                return z;
            }
        }
        return z;
    }

    public int[] BCF() {
        return new int[]{0, 255, 1, 2, 19, 69, 86, 16, 15, 215, 227, 259};
    }

    private void A07(C23084B3s b3s) {
        String BB5;
        if (b3s.BGp() == 0 && (BB5 = b3s.BB5()) != null) {
            C231517j r1 = this.A0T.A04;
            if (r1.A08 == null) {
                synchronized (r1) {
                    if (r1.A08 == null) {
                        r1.A06();
                    }
                }
            }
            if (!BB5.equals(r1.A08)) {
                this.A19.Bly(new C44302Mz());
            }
        }
    }

    public C30481aH(C19460v5 r2, C19460v5 r3, C19700wN r4, C30511aK r5, C19730wQ r6, AnonymousClass1DT r7, C20300xL r8, C27341Nv r9, C21100yf r10, AnonymousClass1XX r11, AnonymousClass164 r12, AnonymousClass19J r13, AnonymousClass1NG r14, C25771Hp r15, AnonymousClass1AN r16, C19600wD r17, AnonymousClass16D r18, AnonymousClass185 r19, C27301Nr r20, C30791am r21, C19970wo r22, C19420v0 r23, AnonymousClass189 r24, AnonymousClass187 r25, AnonymousClass18I r26, AnonymousClass1C7 r27, C220412q r28, C20310xM r29, AnonymousClass17X r30, C28291Sb r31, AnonymousClass1TN r32, C31011b8 r33, AnonymousClass1FN r34, AnonymousClass17T r35, C26171Jd r36, AnonymousClass1YE r37, C236419g r38, AnonymousClass1OD r39, C231417i r40, C25701Hi r41, AnonymousClass1AI r42, C20810yC r43, C21010yW r44, C25181Fh r45, C20350xQ r46, C20510xg r47, AnonymousClass1Y4 r48, C29841Ye r49, AnonymousClass1GO r50, AnonymousClass1Y8 r51, C30571aQ r52, AnonymousClass19I r53, AnonymousClass1W9 r54, C30831aq r55, C236919l r56, C30901ax r57, AnonymousClass1C5 r58, AnonymousClass1DL r59, AnonymousClass1C4 r60, C24581Cz r61, AnonymousClass19L r62, C31051bC r63, C31041bB r64, AnonymousClass1T9 r65, AnonymousClass1EU r66, C30911ay r67, C30921az r68, C30501aJ r69, C30821ap r70, C30521aL r71, C30491aI r72, C238019x r73, C31021b9 r74, AnonymousClass1A1 r75, C231017e r76, C19770wU r77) {
        this.A0G = r22;
        this.A0W = r43;
        this.A03 = r4;
        this.A05 = r6;
        this.A0w = r77;
        this.A15 = r28;
        this.A0O = r35;
        this.A19 = r44;
        this.A1C = r60;
        this.A10 = r10;
        this.A0J = r26;
        this.A0j = r59;
        this.A11 = r12;
        this.A13 = r18;
        this.A06 = r7;
        this.A14 = r25;
        this.A08 = r11;
        this.A0o = r66;
        this.A09 = r14;
        this.A0L = r29;
        this.A0u = r75;
        this.A0Y = r46;
        this.A0Z = r47;
        this.A0f = r53;
        this.A0z = r8;
        this.A0i = r58;
        this.A12 = r13;
        this.A0c = r50;
        this.A0E = r20;
        this.A0b = r49;
        this.A0h = r56;
        this.A0V = r42;
        this.A0I = r24;
        this.A0T = r40;
        this.A0v = r76;
        this.A0K = r27;
        this.A16 = r31;
        this.A0l = r62;
        this.A0P = r36;
        this.A1D = r65;
        this.A1G = r72;
        this.A0D = r19;
        this.A0H = r23;
        this.A04 = r5;
        this.A0S = r39;
        this.A1F = r71;
        this.A17 = r32;
        this.A0N = r34;
        this.A0s = r73;
        this.A0e = r52;
        this.A07 = r9;
        this.A0F = r21;
        this.A0R = r38;
        this.A0q = r69;
        this.A0r = r70;
        this.A0k = r61;
        this.A0A = r15;
        this.A0d = r51;
        this.A0X = r45;
        this.A0U = r41;
        this.A1B = r57;
        this.A0p = r67;
        this.A0a = r48;
        this.A0M = r30;
        this.A1A = r55;
        this.A02 = r2;
        this.A0C = r17;
        this.A1E = r68;
        this.A18 = r33;
        this.A0t = r74;
        this.A0Q = r37;
        this.A0n = r64;
        this.A0g = r54;
        this.A0B = r16;
        this.A0m = r63;
        this.A01 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: X.1jD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: java.util.HashSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v339, resolved type: X.1iL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: X.1iL} */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r1v50, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r5v43, types: [java.lang.Runnable] */
    /* JADX WARNING: type inference failed for: r24v8, types: [X.1iL] */
    /* JADX WARNING: type inference failed for: r24v9, types: [X.1iq] */
    /* JADX WARNING: type inference failed for: r24v10, types: [X.1iO] */
    /* JADX WARNING: type inference failed for: r7v14, types: [X.73t] */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0519, code lost:
        if (r11 == 8) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x063d, code lost:
        if (r11 == 3) goto L_0x063f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0645, code lost:
        if (r14 != false) goto L_0x0647;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x088c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:?, code lost:
        X.C05600Qi.A00(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0890, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0893, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:?, code lost:
        X.C05600Qi.A00(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0897, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0729 A[Catch:{ Exception -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0745 A[Catch:{ Exception -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x076f A[Catch:{ Exception -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0775 A[Catch:{ Exception -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x08a9 A[Catch:{ Exception -> 0x08e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BJl(android.os.Message r43, int r44) {
        /*
            r42 = this;
            r23 = 1
            r0 = r42
            r5 = r43
            r2 = r44
            if (r44 == 0) goto L_0x0d66
            r1 = 1
            if (r2 == r1) goto L_0x0d17
            r1 = 2
            if (r2 == r1) goto L_0x0ba7
            r1 = 15
            if (r2 == r1) goto L_0x0b2c
            r1 = 16
            if (r2 == r1) goto L_0x0916
            r1 = 19
            r3 = 0
            if (r2 == r1) goto L_0x0389
            r1 = 69
            if (r2 == r1) goto L_0x0131
            r1 = 86
            if (r2 == r1) goto L_0x0127
            r1 = 215(0xd7, float:3.01E-43)
            if (r2 == r1) goto L_0x011b
            r1 = 227(0xe3, float:3.18E-43)
            if (r2 == r1) goto L_0x009f
            r1 = 255(0xff, float:3.57E-43)
            if (r2 == r1) goto L_0x0036
            r1 = 259(0x103, float:3.63E-43)
            if (r2 == r1) goto L_0x0adc
            return r3
        L_0x0036:
            java.lang.Object r1 = r5.obj
            X.C18740tg.A06(r1)
            X.9Hr r1 = (X.C192569Hr) r1
            X.AHo r5 = r1.A00
            java.util.Map r4 = r1.A01
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onAppDataForMe id="
            r6.append(r1)
            java.lang.String r1 = r5.A09
            r6.append(r1)
            java.lang.String r1 = " t="
            r6.append(r1)
            long r1 = r5.A06
            r6.append(r1)
            java.lang.String r1 = " now="
            r6.append(r1)
            long r1 = java.lang.System.currentTimeMillis()
            r6.append(r1)
            java.lang.String r1 = " retry="
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.11F r1 = r5.BGb()
            boolean r1 = r1 instanceof X.C177528dw
            if (r1 != 0) goto L_0x0097
            r0.A07(r5)
            com.whatsapp.jid.Jid r1 = r5.BHI()
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r1)
            r0.A01(r1, r5, r4)
            X.1Ye r2 = r0.A0b
            android.os.Handler r1 = r2.A01
            java.lang.Runnable r0 = r2.A09
            r1.removeCallbacks(r0)
            r2.A00 = r3
            return r23
        L_0x0097:
            java.lang.String r0 = "AppData doesn't support status JIDs"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x009f:
            java.lang.Object r2 = r5.obj
            X.9nx r2 = (X.C203399nx) r2
            java.lang.String r9 = "readreceipts"
            r1 = 0
            java.lang.String r2 = r2.A0i(r9, r1)
            java.lang.String r1 = "all"
            boolean r8 = r1.equals(r2)
            java.lang.String r7 = "none"
            if (r8 != 0) goto L_0x00cf
            boolean r1 = r7.equals(r2)
            if (r1 != 0) goto L_0x00cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onSyncPrivacySetting unknown readreceipts setting: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r23
        L_0x00cf:
            X.0v0 r6 = r0.A0H
            boolean r5 = r6.A2L()
            if (r8 == r5) goto L_0x0b03
            X.0wN r4 = r0.A03
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "server="
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = "; client="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "readReceipt-setting-inconsistency"
            r4.A0E(r1, r2, r3)
            if (r5 == 0) goto L_0x0115
            android.content.SharedPreferences$Editor r2 = X.C19420v0.A00(r6)
            java.lang.String r1 = "read_receipts_enabled"
            android.content.SharedPreferences$Editor r1 = r2.putBoolean(r1, r8)
            r1.apply()
            X.1Nv r3 = r0.A07
            X.17Y r2 = r3.A00
            r1 = 45
            X.1j1 r0 = new X.1j1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Bp3(r0)
            return r23
        L_0x0115:
            X.1Nv r0 = r0.A07
            r0.A02(r9, r7)
            return r23
        L_0x011b:
            X.1T9 r2 = r0.A1D
            int r1 = r5.arg2
            r0 = 1
            if (r1 != r0) goto L_0x0123
            r3 = 1
        L_0x0123:
            r2.A00(r3)
            return r23
        L_0x0127:
            java.lang.Object r1 = r5.obj
            android.os.BaseBundle r1 = (android.os.BaseBundle) r1
            java.lang.String r0 = "msgid"
            r1.getString(r0)
            return r23
        L_0x0131:
            java.lang.Object r2 = r5.obj
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = "recipient"
            java.lang.String r1 = r2.getString(r1)
            X.13o r6 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r5 = r6.A02(r1)
            X.11F r5 = (X.AnonymousClass11F) r5
            java.lang.String r1 = "remote_jid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r7 = r6.A02(r1)
            if (r5 != 0) goto L_0x0155
            X.13q r1 = X.AnonymousClass11F.A00
            X.11F r5 = X.C222713q.A00(r7)
        L_0x0155:
            java.lang.String r1 = "from_me"
            boolean r4 = r2.getBoolean(r1)
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r2.getString(r1)
            X.3Qa r3 = new X.3Qa
            r3.<init>(r5, r1, r4)
            java.lang.String r1 = "category"
            java.lang.String r5 = r2.getString(r1)
            java.lang.String r1 = "requester"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r10 = r6.A02(r1)
            java.lang.String r1 = "participant"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r11 = r6.A02(r1)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            com.whatsapp.jid.DeviceJid r4 = com.whatsapp.jid.DeviceJid.of(r7)
            java.lang.String r1 = "is_md_rmr"
            boolean r14 = r2.getBoolean(r1)
            java.lang.String r1 = "enc_data"
            byte[] r7 = r2.getByteArray(r1)
            java.lang.String r1 = "enc_iv"
            byte[] r6 = r2.getByteArray(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget; key="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = "; participant="
            r2.append(r1)
            r2.append(r11)
            java.lang.String r1 = "; remoteJid="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r1 = "peer"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x023b
            if (r7 == 0) goto L_0x0237
            if (r6 == 0) goto L_0x0237
            if (r4 == 0) goto L_0x0237
            X.1AI r1 = r0.A0V
            java.lang.String r2 = r3.A01
            X.8mn r5 = r1.A03(r4, r2)
            X.5J9 r5 = (X.AnonymousClass5J9) r5
            if (r5 != 0) goto L_0x01da
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/message-missing"
            goto L_0x04c9
        L_0x01da:
            int r1 = r5.A02
            if (r1 <= 0) goto L_0x01e2
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/too many retries"
            goto L_0x04c9
        L_0x01e2:
            byte[] r1 = r5.A0J
            int r2 = r0.A00(r2, r1, r7, r6)
            r1 = 1
            if (r2 != r1) goto L_0x0b03
            com.whatsapp.jid.DeviceJid r2 = r5.A00
            if (r2 != 0) goto L_0x01f3
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no recipient"
            goto L_0x04c9
        L_0x01f3:
            int r1 = r5.A03
            r3 = 4
            if (r1 != r3) goto L_0x0203
            X.0wU r4 = r0.A0w
            X.1j3 r1 = new X.1j3
            r1.<init>(r2, r5, r0, r3)
            r4.Boy(r1)
            return r23
        L_0x0203:
            r3 = 2
            if (r1 == r3) goto L_0x0209
            r3 = 3
            if (r1 != r3) goto L_0x0b03
        L_0x0209:
            X.1Hi r4 = r0.A0U
            long r5 = r5.A1N
            r19 = 0
            r24 = -1
            r22 = -1
            X.6E9 r3 = new X.6E9
            r26 = -1
            r28 = -1
            r30 = -1
            r32 = -1
            r34 = -1
            r38 = r5
            r40 = -1
            r36 = r5
            r20 = r2
            r21 = r1
            r18 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r38, r40)
            r4.A03(r3)
            X.1Hp r0 = r0.A0A
            r0.A00()
            return r23
        L_0x0237:
            java.lang.String r0 = "MessagingXmppHandler/onPeerMessageServerError/no-data"
            goto L_0x04c9
        L_0x023b:
            X.11F r9 = r3.A00
            if (r9 != 0) goto L_0x026a
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/key doesn't have chat jid"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0244:
            java.lang.String r13 = r3.A01
            r12 = 0
            r15 = 0
        L_0x0248:
            boolean r2 = r3.A02
        L_0x024a:
            if (r14 == 0) goto L_0x0b03
            X.0wQ r3 = r0.A05
            r3.A0G()
            com.whatsapp.jid.PhoneUserJid r1 = r3.A03
            if (r1 == 0) goto L_0x0b03
            com.whatsapp.jid.DeviceJid r1 = com.whatsapp.jid.DeviceJid.of(r10)
            boolean r1 = r3.A0N(r1)
            if (r1 == 0) goto L_0x0b03
            if (r12 == 0) goto L_0x0330
            X.3Qj r1 = r12.A01
            if (r1 == 0) goto L_0x0b03
            byte[] r1 = r1.A0a
            if (r1 != 0) goto L_0x0330
            return r23
        L_0x026a:
            boolean r1 = r9 instanceof X.C177618e5
            if (r1 == 0) goto L_0x02cd
            if (r11 == 0) goto L_0x02cd
            boolean r1 = r9 instanceof X.C177528dw
            if (r1 != 0) goto L_0x02cd
            boolean r2 = r3.A02
            java.lang.String r1 = r3.A01
            X.3Qa r5 = new X.3Qa
            r5.<init>(r11, r1, r2)
        L_0x027d:
            X.19I r1 = r0.A0f
            r1.A02(r4, r5)
            X.1A1 r1 = r0.A0u
            X.3T1 r12 = r1.A03(r5)
            if (r12 != 0) goto L_0x0294
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/messagemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x028f:
            java.lang.String r13 = r3.A01
            r12 = 0
            r15 = 2
            goto L_0x0248
        L_0x0294:
            int r2 = r12.A1I
            boolean r1 = X.C66013Ui.A0J(r2)
            if (r1 != 0) goto L_0x02a8
            boolean r1 = X.C66013Ui.A0K(r2)
            if (r1 != 0) goto L_0x02a8
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/wrongtype"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0244
        L_0x02a8:
            X.2bU r12 = (X.AnonymousClass2bU) r12
            X.3Qj r1 = r12.A01
            X.C18740tg.A06(r1)
            X.3Qj r4 = new X.3Qj
            r4.<init>(r1)
            java.io.File r1 = r4.A0I
            if (r1 != 0) goto L_0x02cf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/badmediadata; mediaDataV2="
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x028f
        L_0x02cd:
            r5 = r3
            goto L_0x027d
        L_0x02cf:
            java.lang.String r2 = r5.A01
            byte[] r1 = r4.A0a
            int r15 = r0.A00(r2, r1, r7, r6)
            r1 = 1
            if (r15 == r1) goto L_0x02df
            java.lang.String r13 = r3.A01
            r12 = 0
            goto L_0x0248
        L_0x02df:
            java.io.File r1 = r4.A0I
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x02f3
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filemissing"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r13 = r3.A01
            boolean r2 = r3.A02
            r15 = 2
            goto L_0x024a
        L_0x02f3:
            long r1 = r4.A0C
            r7 = 0
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0339
            java.io.File r6 = r4.A0I
            long r7 = r6.length()
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0339
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onMessageServerErrorForTarget/filereplaced; mediaDataV2.fileSize="
            r5.append(r1)
            long r1 = r4.A0C
            r5.append(r1)
            java.lang.String r1 = "; mediaDataV2.file.length="
            r5.append(r1)
            java.io.File r1 = r4.A0I
            long r1 = r1.length()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r13 = r3.A01
            boolean r2 = r3.A02
            r15 = 0
            goto L_0x024a
        L_0x0330:
            X.1Y8 r8 = r0.A0d
            r14 = 0
            r16 = r2
            r8.A01(r9, r10, r11, r12, r13, r14, r15, r16)
            return r23
        L_0x0339:
            if (r14 != 0) goto L_0x0cae
            X.0wD r2 = r0.A0C
            r1 = 1
            int r6 = r2.A03(r1)
            X.1GO r2 = r0.A0c
            boolean r1 = r2.A03(r12)
            if (r1 != 0) goto L_0x0cae
            boolean r1 = r2.A04(r12, r6)
            if (r1 != 0) goto L_0x0cae
            int r4 = r12.A1I
            r1 = 1
            if (r4 != r1) goto L_0x035a
            if (r6 == 0) goto L_0x035a
            r1 = 3
            if (r6 != r1) goto L_0x0cae
        L_0x035a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageServerErrorForTarget/skipreupload; activeNetworkType="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = "; message.media_wa_type="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = "; message.origin="
            r2.append(r0)
            int r0 = r12.A09
            r2.append(r0)
            java.lang.String r0 = "; message.media_size="
            r2.append(r0)
            long r0 = r12.A00
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x04c9
        L_0x0389:
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "edit"
            java.lang.String r2 = r2.getString(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x04cd
            r11 = 0
        L_0x039a:
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "remote_chat_jid"
            java.lang.String r2 = r2.getString(r1)
            X.13q r1 = X.AnonymousClass11F.A00
            X.11F r6 = r1.A02(r2)
            r1 = 8
            if (r11 == r1) goto L_0x03af
            r3 = 1
        L_0x03af:
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "msgid"
            java.lang.String r1 = r2.getString(r1)
            X.3Qa r4 = new X.3Qa
            r4.<init>(r6, r1, r3)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "participant"
            java.lang.String r1 = r2.getString(r1)
            X.13o r3 = com.whatsapp.jid.Jid.Companion
            com.whatsapp.jid.Jid r17 = r3.A02(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "remoteJid"
            java.lang.String r1 = r2.getString(r1)
            com.whatsapp.jid.Jid r16 = r3.A02(r1)
            r1 = r16
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            r16 = r1
            android.os.Bundle r2 = r5.getData()
            java.lang.String r22 = "phash"
            r1 = r22
            java.lang.String r6 = r2.getString(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "counter_abuse_token"
            java.lang.String r21 = r2.getString(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "count"
            int r20 = r2.getInt(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "timestamp"
            long r7 = r2.getLong(r1)
            android.os.Bundle r2 = r5.getData()
            java.lang.String r1 = "smid"
            long r1 = r2.getLong(r1)
            android.os.Bundle r5 = r5.getData()
            java.lang.String r3 = "addressing_mode"
            java.lang.String r15 = r5.getString(r3)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r3 = "MessagingXmppHandler/onMessageReceivedByServer; key="
            r13.append(r3)
            r13.append(r4)
            java.lang.String r19 = "; participant="
            r3 = r19
            r13.append(r3)
            r3 = r17
            r13.append(r3)
            java.lang.String r18 = "; remoteJid="
            r3 = r18
            r13.append(r3)
            r3 = r16
            r13.append(r3)
            java.lang.String r12 = "; serverParticipantHash="
            r13.append(r12)
            r13.append(r6)
            java.lang.String r10 = "; recipientCount="
            r13.append(r10)
            r3 = r20
            r13.append(r3)
            java.lang.String r9 = "; counterAbuseToken="
            r13.append(r9)
            r3 = r21
            r13.append(r3)
            java.lang.String r5 = "; edit="
            r13.append(r5)
            r13.append(r11)
            java.lang.String r3 = "; timestamp="
            r13.append(r3)
            r13.append(r7)
            java.lang.String r14 = "; smid="
            r13.append(r14)
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.whatsapp.util.Log.i((java.lang.String) r13)
            if (r17 == 0) goto L_0x04d3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessagingXmppHandler/onMessageReceivedByServer message received by server ignored; key="
            r1.append(r0)
            r1.append(r4)
            r0 = r19
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            r0 = r18
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            r1.append(r12)
            r1.append(r6)
            r1.append(r10)
            r0 = r20
            r1.append(r0)
            r1.append(r9)
            r0 = r21
            r1.append(r0)
            r1.append(r5)
            r1.append(r11)
            r1.append(r3)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
        L_0x04c9:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r23
        L_0x04cd:
            int r11 = java.lang.Integer.parseInt(r2)
            goto L_0x039a
        L_0x04d3:
            X.19I r13 = r0.A0f
            java.util.Map r5 = r13.A01
            monitor-enter(r5)
            java.lang.Object r3 = r5.get(r4)     // Catch:{ all -> 0x0913 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0913 }
            if (r3 == 0) goto L_0x04e6
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x0913 }
            X.3T1 r3 = (X.AnonymousClass3T1) r3     // Catch:{ all -> 0x0913 }
        L_0x04e4:
            monitor-exit(r5)     // Catch:{ all -> 0x0913 }
            goto L_0x04e8
        L_0x04e6:
            r3 = 0
            goto L_0x04e4
        L_0x04e8:
            X.0xQ r12 = r0.A0Y     // Catch:{ Exception -> 0x08e3 }
            X.11F r10 = r4.A00     // Catch:{ Exception -> 0x08e3 }
            android.os.Parcelable$Creator r5 = X.AnonymousClass147.CREATOR     // Catch:{ Exception -> 0x08e3 }
            X.147 r14 = X.C65533Sl.A03(r10)     // Catch:{ Exception -> 0x08e3 }
            X.17b r9 = r12.A0i     // Catch:{ Exception -> 0x08e3 }
            java.lang.String r5 = X.C54102sP.A00(r15)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = X.C230717b.A00(r9, r14, r5)     // Catch:{ Exception -> 0x08e3 }
            if (r5 == 0) goto L_0x0506
            X.0xg r12 = r12.A0k     // Catch:{ Exception -> 0x08e3 }
            r9 = 6
            java.lang.String r5 = "lid_migration"
            r12.A0E(r14, r5, r9)     // Catch:{ Exception -> 0x08e3 }
        L_0x0506:
            r5 = r16
            r13.A02(r5, r4)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x08e3 }
            r13 = 0
            if (r5 != 0) goto L_0x0513
            r13 = 1
        L_0x0513:
            r5 = 7
            if (r11 == r5) goto L_0x051b
            r5 = 8
            r12 = 0
            if (r11 != r5) goto L_0x051c
        L_0x051b:
            r12 = 1
        L_0x051c:
            X.13r r5 = com.whatsapp.jid.UserJid.Companion     // Catch:{ Exception -> 0x08e3 }
            com.whatsapp.jid.UserJid r9 = X.C222813r.A00(r10)     // Catch:{ Exception -> 0x08e3 }
            if (r9 == 0) goto L_0x0529
            X.1ay r5 = r0.A0p     // Catch:{ Exception -> 0x08e3 }
            r5.A02(r9)     // Catch:{ Exception -> 0x08e3 }
        L_0x0529:
            boolean r5 = r10 instanceof X.C177528dw     // Catch:{ Exception -> 0x08e3 }
            if (r5 != 0) goto L_0x0533
            boolean r5 = r10 instanceof X.C177538dx     // Catch:{ Exception -> 0x08e3 }
            if (r5 == 0) goto L_0x0537
            if (r12 != 0) goto L_0x0537
        L_0x0533:
            r9 = 1
        L_0x0534:
            if (r13 == 0) goto L_0x062a
            goto L_0x0539
        L_0x0537:
            r9 = 0
            goto L_0x0534
        L_0x0539:
            boolean r5 = X.AnonymousClass143.A0G(r10)     // Catch:{ Exception -> 0x08e3 }
            if (r5 != 0) goto L_0x0543
            if (r9 != 0) goto L_0x0543
            goto L_0x05c6
        L_0x0543:
            X.144 r14 = X.AnonymousClass6H4.A00(r10)     // Catch:{ Exception -> 0x08e3 }
            X.C18740tg.A06(r14)     // Catch:{ Exception -> 0x08e3 }
            X.1Fh r5 = r0.A0X     // Catch:{ Exception -> 0x08e3 }
            boolean r13 = r5.A00(r3)     // Catch:{ Exception -> 0x08e3 }
            X.1FN r5 = r0.A0N     // Catch:{ Exception -> 0x08e3 }
            java.util.HashSet r5 = r5.A00(r4)     // Catch:{ Exception -> 0x08e3 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x08e3 }
            r9.<init>(r5)     // Catch:{ Exception -> 0x08e3 }
            X.0wQ r5 = r0.A05     // Catch:{ Exception -> 0x08e3 }
            if (r13 == 0) goto L_0x0587
            X.8du r5 = r5.A07()     // Catch:{ Exception -> 0x08e3 }
        L_0x0563:
            r9.add(r5)     // Catch:{ Exception -> 0x08e3 }
            java.lang.String r9 = X.AnonymousClass6UD.A03(r9)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = android.text.TextUtils.equals(r9, r6)     // Catch:{ Exception -> 0x08e3 }
            if (r5 != 0) goto L_0x062a
            r0.A06(r4, r12, r13)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = X.AnonymousClass143.A0G(r14)     // Catch:{ Exception -> 0x08e3 }
            if (r5 == 0) goto L_0x05ed
            X.0xg r5 = r0.A0Z     // Catch:{ Exception -> 0x08e3 }
            r30 = r5
            X.147 r15 = X.C65533Sl.A03(r14)     // Catch:{ Exception -> 0x08e3 }
            X.C18740tg.A06(r15)     // Catch:{ Exception -> 0x08e3 }
            X.1DT r14 = r0.A06     // Catch:{ Exception -> 0x08e3 }
            goto L_0x058d
        L_0x0587:
            r5.A0G()     // Catch:{ Exception -> 0x08e3 }
            X.13x r5 = r5.A02     // Catch:{ Exception -> 0x08e3 }
            goto L_0x0563
        L_0x058d:
            if (r3 == 0) goto L_0x0590
            goto L_0x0592
        L_0x0590:
            r5 = 1
            goto L_0x059c
        L_0x0592:
            X.1DW r13 = r14.A0B     // Catch:{ Exception -> 0x08e3 }
            X.1AW r6 = r14.A0P     // Catch:{ Exception -> 0x08e3 }
            X.1EO r5 = r14.A0Q     // Catch:{ Exception -> 0x08e3 }
            int r5 = X.C55802vD.A00(r13, r3, r6, r5)     // Catch:{ Exception -> 0x08e3 }
        L_0x059c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x08e3 }
            boolean r29 = r14.A0V(r10, r5)     // Catch:{ Exception -> 0x08e3 }
            X.0yC r13 = r0.A0W     // Catch:{ Exception -> 0x08e3 }
            r6 = 7053(0x1b8d, float:9.883E-42)
            X.0yV r5 = X.C21000yV.A02     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = X.C20800yB.A01(r5, r13, r6)     // Catch:{ Exception -> 0x08e3 }
            if (r5 != 0) goto L_0x05b1
            r9 = 0
        L_0x05b1:
            X.3S5 r5 = new X.3S5     // Catch:{ Exception -> 0x08e3 }
            r27 = 1
            r24 = r5
            r25 = r22
            r26 = r9
            r28 = r12
            r24.<init>(r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x08e3 }
            r6 = r30
            r6.A09(r5, r15)     // Catch:{ Exception -> 0x08e3 }
            goto L_0x05ed
        L_0x05c6:
            boolean r5 = r10 instanceof com.whatsapp.jid.UserJid     // Catch:{ Exception -> 0x08e3 }
            if (r5 == 0) goto L_0x062a
            r9 = 0
            X.1FN r5 = r0.A0N     // Catch:{ Exception -> 0x08e3 }
            java.util.HashSet r5 = r5.A00(r4)     // Catch:{ Exception -> 0x08e3 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ Exception -> 0x08e3 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x08e3 }
            X.0wQ r5 = r0.A05     // Catch:{ Exception -> 0x08e3 }
            r5.A0G()     // Catch:{ Exception -> 0x08e3 }
            X.13x r5 = r5.A02     // Catch:{ Exception -> 0x08e3 }
            r13.add(r5)     // Catch:{ Exception -> 0x08e3 }
            java.lang.String r5 = X.AnonymousClass6UD.A03(r13)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = android.text.TextUtils.equals(r5, r6)     // Catch:{ Exception -> 0x08e3 }
            if (r5 != 0) goto L_0x062a
            r0.A06(r4, r12, r9)     // Catch:{ Exception -> 0x08e3 }
        L_0x05ed:
            X.1DT r9 = r0.A06     // Catch:{ Exception -> 0x08e3 }
            X.2QL r6 = new X.2QL     // Catch:{ Exception -> 0x08e3 }
            r6.<init>()     // Catch:{ Exception -> 0x08e3 }
            java.lang.Integer r5 = X.AnonymousClass1DT.A06(r10)     // Catch:{ Exception -> 0x08e3 }
            r6.A02 = r5     // Catch:{ Exception -> 0x08e3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r12)     // Catch:{ Exception -> 0x08e3 }
            r6.A01 = r5     // Catch:{ Exception -> 0x08e3 }
            if (r3 == 0) goto L_0x0603
            goto L_0x0605
        L_0x0603:
            r5 = 1
            goto L_0x060f
        L_0x0605:
            X.1DW r13 = r9.A0B     // Catch:{ Exception -> 0x08e3 }
            X.1AW r12 = r9.A0P     // Catch:{ Exception -> 0x08e3 }
            X.1EO r5 = r9.A0Q     // Catch:{ Exception -> 0x08e3 }
            int r5 = X.C55802vD.A00(r13, r3, r12, r5)     // Catch:{ Exception -> 0x08e3 }
        L_0x060f:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x08e3 }
            boolean r5 = r9.A0V(r10, r5)     // Catch:{ Exception -> 0x08e3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x08e3 }
            r6.A00 = r5     // Catch:{ Exception -> 0x08e3 }
            X.12q r5 = r9.A07     // Catch:{ Exception -> 0x08e3 }
            java.lang.Integer r5 = X.AnonymousClass3UK.A06(r5, r10)     // Catch:{ Exception -> 0x08e3 }
            r6.A03 = r5     // Catch:{ Exception -> 0x08e3 }
            X.0yW r5 = r9.A0E     // Catch:{ Exception -> 0x08e3 }
            r5.Bly(r6)     // Catch:{ Exception -> 0x08e3 }
        L_0x062a:
            boolean r5 = r10 instanceof X.C28981Uw     // Catch:{ Exception -> 0x08e3 }
            if (r5 == 0) goto L_0x068d
            X.1bB r12 = r0.A0n     // Catch:{ Exception -> 0x08e3 }
            java.lang.Long r20 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x08e3 }
            r9 = 0
            r5 = 8
            r15 = 1
            if (r11 == r5) goto L_0x063f
            r15 = 0
            r5 = 3
            r14 = 0
            if (r11 != r5) goto L_0x0640
        L_0x063f:
            r14 = 1
        L_0x0640:
            boolean r6 = r4.A02     // Catch:{ Exception -> 0x08e6 }
            if (r6 != 0) goto L_0x0647
            r5 = 0
            if (r14 == 0) goto L_0x0648
        L_0x0647:
            r5 = 1
        L_0x0648:
            java.lang.String r11 = "Failed requirement."
            if (r5 == 0) goto L_0x0686
            X.1SQ r13 = r12.A02     // Catch:{ Exception -> 0x08e6 }
            X.1A1 r5 = r13.A08     // Catch:{ Exception -> 0x08e6 }
            X.3T1 r5 = r5.A03(r4)     // Catch:{ Exception -> 0x08e6 }
            if (r5 != 0) goto L_0x065c
            X.1Jd r5 = r13.A05     // Catch:{ Exception -> 0x08e6 }
            X.2bM r5 = r5.A0A(r4)     // Catch:{ Exception -> 0x08e6 }
        L_0x065c:
            if (r14 == 0) goto L_0x066f
            if (r5 != 0) goto L_0x066f
            X.1A1 r14 = r12.A05     // Catch:{ Exception -> 0x08e6 }
            r13 = r6 ^ 1
            java.lang.String r6 = r4.A01     // Catch:{ Exception -> 0x08e6 }
            X.3Qa r5 = new X.3Qa     // Catch:{ Exception -> 0x08e6 }
            r5.<init>(r10, r6, r13)     // Catch:{ Exception -> 0x08e6 }
            X.3T1 r5 = r14.A03(r5)     // Catch:{ Exception -> 0x08e6 }
        L_0x066f:
            r13 = 0
            if (r15 != 0) goto L_0x070e
            boolean r6 = r5 instanceof X.AnonymousClass2bM     // Catch:{ Exception -> 0x08e6 }
            if (r6 != 0) goto L_0x070e
            if (r20 == 0) goto L_0x067f
            int r6 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r6 > 0) goto L_0x070e
            goto L_0x08dd
        L_0x067f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08e6 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x08e2
        L_0x0686:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08e6 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x08e2
        L_0x068d:
            r9 = 0
            if (r3 == 0) goto L_0x06bf
            r1 = 131072(0x20000, float:1.83671E-40)
            boolean r1 = r3.A1T(r1)     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x06bf
            X.0yC r10 = r0.A0W     // Catch:{ Exception -> 0x08e6 }
            X.3Qa r12 = r3.A1J     // Catch:{ Exception -> 0x08e6 }
            X.11F r1 = r12.A00     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = r1 instanceof X.C28981Uw     // Catch:{ Exception -> 0x08e6 }
            if (r1 != 0) goto L_0x06bf
            boolean r1 = r3 instanceof X.AnonymousClass2bT     // Catch:{ Exception -> 0x08e6 }
            if (r1 != 0) goto L_0x06bf
            long r5 = r3.A0I     // Catch:{ Exception -> 0x08e6 }
            r2 = 2983(0xba7, float:4.18E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x08e6 }
            int r1 = X.C20800yB.A00(r1, r10, r2)     // Catch:{ Exception -> 0x08e6 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x08e6 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r10
            long r5 = r5 + r1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x06bf
            r1 = 21
            r0.A04(r3, r12, r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x0721
        L_0x06bf:
            boolean r1 = r3 instanceof X.AnonymousClass2bM     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x06ea
            X.1YE r10 = r0.A0Q     // Catch:{ Exception -> 0x08e6 }
            r2 = r3
            X.2bM r2 = (X.AnonymousClass2bM) r2     // Catch:{ Exception -> 0x08e6 }
            X.0wQ r1 = r10.A01     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = X.C66013Ui.A0R(r1, r2)     // Catch:{ Exception -> 0x08e6 }
            if (r1 != 0) goto L_0x06d6
            java.lang.String r1 = "MessageAddOnSendRecvManager/cant use this method for messageAddOn not from self"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x0721
        L_0x06d6:
            X.1C7 r6 = r10.A04     // Catch:{ Exception -> 0x08e6 }
            r27 = 4
            X.1iO r5 = new X.1iO     // Catch:{ Exception -> 0x08e6 }
            r24 = r5
            r25 = r10
            r26 = r2
            r28 = r7
            r24.<init>(r25, r26, r27, r28)     // Catch:{ Exception -> 0x08e6 }
            r1 = 56
            goto L_0x070a
        L_0x06ea:
            X.0xM r2 = r0.A0L     // Catch:{ Exception -> 0x08e6 }
            java.util.Map r1 = r2.A1H     // Catch:{ Exception -> 0x08e6 }
            r1.remove(r4)     // Catch:{ Exception -> 0x08e6 }
            X.1C7 r6 = r2.A0F     // Catch:{ Exception -> 0x08e6 }
            X.1iq r5 = new X.1iq     // Catch:{ Exception -> 0x08e6 }
            r30 = 0
            r24 = r5
            r25 = r2
            r26 = r4
            r27 = r3
            r28 = r21
            r29 = r20
            r31 = r7
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)     // Catch:{ Exception -> 0x08e6 }
            r1 = 23
        L_0x070a:
            r6.A01(r5, r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x0721
        L_0x070e:
            boolean r6 = r5 instanceof X.AnonymousClass2bM     // Catch:{ Exception -> 0x08e6 }
            if (r6 == 0) goto L_0x07c0
            boolean r1 = r5 instanceof X.C180868mY     // Catch:{ Exception -> 0x08e6 }
            X.1Jd r6 = r12.A00     // Catch:{ Exception -> 0x08e6 }
            X.2bM r5 = (X.AnonymousClass2bM) r5     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x07bb
            long r1 = r5.A1N     // Catch:{ Exception -> 0x08e6 }
            X.0x8 r5 = r6.A0I     // Catch:{ Exception -> 0x08e6 }
            r5.A08(r1)     // Catch:{ Exception -> 0x08e6 }
        L_0x0721:
            X.1XX r1 = r0.A08     // Catch:{ Exception -> 0x08e6 }
            X.1YT r2 = r1.A0A     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = r2.A02     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x0733
            r2.A02 = r9     // Catch:{ Exception -> 0x08e6 }
            X.1Fq r5 = r2.A01     // Catch:{ Exception -> 0x08e6 }
            r2 = 6
            java.lang.String r1 = "UnsentMessagesNotification2"
            r5.A03(r2, r1)     // Catch:{ Exception -> 0x08e6 }
        L_0x0733:
            X.1b9 r8 = r0.A0t     // Catch:{ Exception -> 0x08e6 }
            boolean r5 = r3 instanceof X.AnonymousClass2c9     // Catch:{ Exception -> 0x08e6 }
            if (r5 != 0) goto L_0x0751
            boolean r1 = r3 instanceof X.C46742bb     // Catch:{ Exception -> 0x08e6 }
            if (r1 != 0) goto L_0x0751
        L_0x073d:
            X.0v5 r2 = r0.A01     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = r2.A05()     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x08a9
            r2.A02()     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x08e6 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x08e2
        L_0x0751:
            X.0yC r6 = r8.A07     // Catch:{ Exception -> 0x08e6 }
            r2 = 4411(0x113b, float:6.181E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = X.C20800yB.A01(r1, r6, r2)     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x073d
            X.0wQ r1 = r8.A01     // Catch:{ Exception -> 0x08e6 }
            boolean r1 = X.C66013Ui.A0R(r1, r3)     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x073d
            X.3Qa r11 = r3.A1J     // Catch:{ Exception -> 0x08e6 }
            X.11F r1 = r11.A00     // Catch:{ Exception -> 0x08e6 }
            com.whatsapp.jid.GroupJid r10 = X.AnonymousClass6SZ.A00(r1)     // Catch:{ Exception -> 0x08e6 }
            if (r10 != 0) goto L_0x0775
            java.lang.String r1 = "updateServerReminder/groupJid is null"
        L_0x0771:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x073d
        L_0x0775:
            r7 = 0
            if (r5 == 0) goto L_0x0779
            goto L_0x0789
        L_0x0779:
            boolean r1 = r3 instanceof X.C46742bb     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x073d
            r1 = r3
            X.2bM r1 = (X.AnonymousClass2bM) r1     // Catch:{ Exception -> 0x08e6 }
            X.3Qa r1 = r1.A1Z()     // Catch:{ Exception -> 0x08e6 }
            if (r1 != 0) goto L_0x07a1
            java.lang.String r1 = "updateServerReminder/parentMessageKey is null"
            goto L_0x0771
        L_0x0789:
            r1 = r3
            X.2bJ r1 = (X.AnonymousClass2bJ) r1     // Catch:{ Exception -> 0x08e6 }
            long r1 = r1.A01     // Catch:{ Exception -> 0x08e6 }
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r5
            java.lang.String r6 = r11.A01     // Catch:{ Exception -> 0x08e6 }
            X.6BJ r5 = new X.6BJ     // Catch:{ Exception -> 0x08e6 }
            r5.<init>(r6, r10, r1)     // Catch:{ Exception -> 0x08e6 }
            android.os.Message r6 = android.os.Message.obtain(r7, r9, r5)     // Catch:{ Exception -> 0x08e6 }
            X.1PW r5 = r8.A02     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r2 = "set_scheduled_call_reminder"
            goto L_0x07b2
        L_0x07a1:
            java.lang.String r6 = r1.A01     // Catch:{ Exception -> 0x08e6 }
            r1 = -1
            X.6BJ r5 = new X.6BJ     // Catch:{ Exception -> 0x08e6 }
            r5.<init>(r6, r10, r1)     // Catch:{ Exception -> 0x08e6 }
            android.os.Message r6 = android.os.Message.obtain(r7, r9, r5)     // Catch:{ Exception -> 0x08e6 }
            X.1PW r5 = r8.A02     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r2 = "cancel_scheduled_call_reminder"
        L_0x07b2:
            X.6Up r1 = new X.6Up     // Catch:{ Exception -> 0x08e6 }
            r1.<init>((android.os.Message) r6, (java.lang.String) r2)     // Catch:{ Exception -> 0x08e6 }
            r5.A00(r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x073d
        L_0x07bb:
            r6.A0L(r5, r7)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x0721
        L_0x07c0:
            if (r5 == 0) goto L_0x08d5
            if (r20 == 0) goto L_0x07cd
            int r6 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x07cd
        L_0x07c8:
            int r6 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r6 <= 0) goto L_0x08b6
            goto L_0x07d0
        L_0x07cd:
            long r1 = r5.A1O     // Catch:{ Exception -> 0x08e6 }
            goto L_0x07c8
        L_0x07d0:
            r5.A1O = r1     // Catch:{ Exception -> 0x08e6 }
            r1 = 4
            r5.A0n(r1)     // Catch:{ Exception -> 0x08e6 }
            r5.A0H = r7     // Catch:{ Exception -> 0x08e6 }
            X.37F r1 = r5.A0X()     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x07f2
            X.3Qa r10 = r1.A02     // Catch:{ Exception -> 0x08e6 }
            long r1 = r1.A01     // Catch:{ Exception -> 0x08e6 }
            X.37F r6 = new X.37F     // Catch:{ Exception -> 0x08e6 }
            r24 = r6
            r25 = r10
            r26 = r7
            r28 = r1
            r24.<init>(r25, r26, r28)     // Catch:{ Exception -> 0x08e6 }
            r5.A11(r6)     // Catch:{ Exception -> 0x08e6 }
        L_0x07f2:
            X.1SM r6 = r12.A01     // Catch:{ Exception -> 0x08e6 }
            X.12P r1 = r6.A03     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            X.1M0 r8 = r1.A05()     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            X.71s r12 = r8.B1k()     // Catch:{ all -> 0x0891 }
            X.14e r11 = r8.A02     // Catch:{ all -> 0x088a }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x088a }
            r7.<init>()     // Catch:{ all -> 0x088a }
            long r1 = r5.A1O     // Catch:{ all -> 0x088a }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x088a }
            java.lang.String r1 = "sort_id"
            r7.put(r1, r2)     // Catch:{ all -> 0x088a }
            int r1 = r5.A0D     // Catch:{ all -> 0x088a }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x088a }
            java.lang.String r1 = "status"
            r7.put(r1, r2)     // Catch:{ all -> 0x088a }
            long r1 = r5.A0H     // Catch:{ all -> 0x088a }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x088a }
            java.lang.String r1 = "receipt_server_timestamp"
            r7.put(r1, r2)     // Catch:{ all -> 0x088a }
            r1 = 1
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x088a }
            long r1 = r5.A1N     // Catch:{ all -> 0x088a }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x088a }
            r10[r9] = r1     // Catch:{ all -> 0x088a }
            java.lang.String r26 = "message"
            java.lang.String r27 = "_id = ?"
            java.lang.String r28 = "UPDATE_MAIN_MESSAGE_TABLE_FOR_NEWSLETTER"
            r24 = r11
            r25 = r7
            r29 = r10
            r24.A01(r25, r26, r27, r28, r29)     // Catch:{ all -> 0x088a }
            r6.A03(r8, r5)     // Catch:{ all -> 0x088a }
            X.12q r2 = r6.A01     // Catch:{ all -> 0x088a }
            X.3Qa r1 = r5.A1J     // Catch:{ all -> 0x088a }
            X.11F r1 = r1.A00     // Catch:{ all -> 0x088a }
            X.3Qp r7 = r2.A09(r1, r9)     // Catch:{ all -> 0x088a }
            boolean r1 = r7 instanceof X.C44072La     // Catch:{ all -> 0x088a }
            if (r1 == 0) goto L_0x0882
            X.2La r7 = (X.C44072La) r7     // Catch:{ all -> 0x088a }
            if (r7 == 0) goto L_0x0882
            long r10 = r7.A0U     // Catch:{ all -> 0x088a }
            long r1 = r5.A1N     // Catch:{ all -> 0x088a }
            int r13 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x086d
            long r1 = r5.A1O     // Catch:{ all -> 0x088a }
            r7.A0V = r1     // Catch:{ all -> 0x088a }
            long r1 = r5.A1O     // Catch:{ all -> 0x088a }
            r7.A0O = r1     // Catch:{ all -> 0x088a }
            long r1 = r5.A1O     // Catch:{ all -> 0x088a }
            r7.A0Q = r1     // Catch:{ all -> 0x088a }
            r7.A0d = r5     // Catch:{ all -> 0x088a }
            r7.A0c = r5     // Catch:{ all -> 0x088a }
        L_0x086d:
            X.1Ja r1 = r6.A04     // Catch:{ all -> 0x088a }
            r1.A02(r7)     // Catch:{ all -> 0x088a }
            r12.A00()     // Catch:{ all -> 0x088a }
            r12.close()     // Catch:{ all -> 0x0891 }
            r8.close()     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            X.1SP r1 = r6.A06     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            r1.A00(r5)     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            goto L_0x0721
        L_0x0882:
            java.lang.String r2 = "Corrupt newsletter in cache"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x088a }
            r1.<init>(r2)     // Catch:{ all -> 0x088a }
            throw r1     // Catch:{ all -> 0x088a }
        L_0x088a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x088c }
        L_0x088c:
            r1 = move-exception
            X.C05600Qi.A00(r12, r2)     // Catch:{ all -> 0x0891 }
            throw r1     // Catch:{ all -> 0x0891 }
        L_0x0891:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0893 }
        L_0x0893:
            r1 = move-exception
            X.C05600Qi.A00(r8, r2)     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
            throw r1     // Catch:{ SQLNonTransientException -> 0x0898, IllegalArgumentException -> 0x089c }
        L_0x0898:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message"
            goto L_0x089f
        L_0x089c:
            r2 = move-exception
            java.lang.String r1 = "NewsletterMessageStore/failed to update the message due to message constraints"
        L_0x089f:
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r1 = "NewsletterMessageManager/failed to insert a message"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x0721
        L_0x08a9:
            boolean r1 = r3 instanceof X.AnonymousClass2bZ     // Catch:{ Exception -> 0x08e6 }
            if (r1 == 0) goto L_0x0b03
            r2 = r3
            X.2bZ r2 = (X.AnonymousClass2bZ) r2     // Catch:{ Exception -> 0x08e6 }
            X.0xM r1 = r0.A0L     // Catch:{ Exception -> 0x08e6 }
            r1.A0s(r2)     // Catch:{ Exception -> 0x08e6 }
            return r23
        L_0x08b6:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x08e6 }
            r6.<init>()     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r5 = "NewsletterMessageManager/unexpected server message id "
            r6.append(r5)     // Catch:{ Exception -> 0x08e6 }
            r6.append(r1)     // Catch:{ Exception -> 0x08e6 }
            r1 = 32
            r6.append(r1)     // Catch:{ Exception -> 0x08e6 }
            r6.append(r4)     // Catch:{ Exception -> 0x08e6 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x08e6 }
            X.19b r2 = new X.19b     // Catch:{ Exception -> 0x08e6 }
            r2.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x08e2
        L_0x08d5:
            java.lang.String r1 = "NewsletterMessageManager/unable to find a message to update"
            X.19b r2 = new X.19b     // Catch:{ Exception -> 0x08e6 }
            r2.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x08e6 }
            goto L_0x08e2
        L_0x08dd:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x08e6 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x08e6 }
        L_0x08e2:
            throw r2     // Catch:{ Exception -> 0x08e6 }
        L_0x08e3:
            r5 = move-exception
            r9 = 0
            goto L_0x08e7
        L_0x08e6:
            r5 = move-exception
        L_0x08e7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/Error handling ack/key="
            r2.append(r1)
            r2.append(r4)
            r1 = r19
            r2.append(r1)
            r1 = r17
            r2.append(r1)
            r1 = r18
            r2.append(r1)
            r1 = r16
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e(r1, r5)
            r0.A03(r3, r4, r9)
            return r23
        L_0x0913:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0913 }
            throw r1
        L_0x0916:
            java.lang.Object r1 = r5.obj
            X.9Ma r1 = (X.C193579Ma) r1
            X.3Qa r6 = r1.A03
            com.whatsapp.jid.DeviceJid r15 = r1.A01
            com.whatsapp.jid.DeviceJid r7 = r1.A02
            int r5 = r1.A00
            java.lang.String r3 = r1.A04
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onMessageError; key="
            r2.append(r1)
            r2.append(r6)
            java.lang.String r9 = "; participant="
            r2.append(r9)
            r2.append(r15)
            java.lang.String r8 = "; remoteJid="
            r2.append(r8)
            r2.append(r7)
            java.lang.String r1 = "; error="
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = "; phash="
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.19I r3 = r0.A0f
            java.util.Map r2 = r3.A01
            monitor-enter(r2)
            java.lang.Object r1 = r2.get(r6)     // Catch:{ all -> 0x0b29 }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x0b29 }
            if (r1 == 0) goto L_0x096b
            java.lang.Object r4 = r1.second     // Catch:{ all -> 0x0b29 }
            X.3T1 r4 = (X.AnonymousClass3T1) r4     // Catch:{ all -> 0x0b29 }
        L_0x0969:
            monitor-exit(r2)     // Catch:{ all -> 0x0b29 }
            goto L_0x096d
        L_0x096b:
            r4 = 0
            goto L_0x0969
        L_0x096d:
            if (r4 == 0) goto L_0x0974
            r1 = 14
            r0.A05(r4, r6, r1, r5)     // Catch:{ Exception -> 0x0b04 }
        L_0x0974:
            r3.A02(r7, r6)     // Catch:{ Exception -> 0x0b04 }
            X.11F r3 = r6.A00     // Catch:{ Exception -> 0x0b04 }
            boolean r2 = X.AnonymousClass143.A0G(r3)     // Catch:{ Exception -> 0x0b04 }
            r12 = 7
            if (r2 == 0) goto L_0x0986
            r1 = 401(0x191, float:5.62E-43)
            if (r5 != r1) goto L_0x0986
            goto L_0x0a7f
        L_0x0986:
            r1 = 405(0x195, float:5.68E-43)
            if (r5 == r1) goto L_0x0a7b
            if (r2 != 0) goto L_0x099b
            r1 = 403(0x193, float:5.65E-43)
            if (r5 != r1) goto L_0x09b7
            r0.A04(r4, r6, r12)     // Catch:{ Exception -> 0x0b04 }
            X.1NG r2 = r0.A09     // Catch:{ Exception -> 0x0b04 }
            r1 = 0
            r2.A0K(r1)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x099b:
            r1 = 420(0x1a4, float:5.89E-43)
            if (r5 != r1) goto L_0x09a1
            goto L_0x0a68
        L_0x09a1:
            r1 = 460(0x1cc, float:6.45E-43)
            if (r5 != r1) goto L_0x09b7
            r1 = 21
            r0.A04(r4, r6, r1)     // Catch:{ Exception -> 0x0b04 }
            X.0xg r11 = r0.A0Z     // Catch:{ Exception -> 0x0b04 }
            r10 = r3
            X.147 r10 = (X.AnonymousClass147) r10     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r2 = "send_failure"
            r1 = 1
            r11.A0E(r10, r2, r1)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x09b7:
            if (r4 == 0) goto L_0x0a01
            X.9lY r1 = r4.A0M     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0a01
            int r11 = r4.A0D     // Catch:{ Exception -> 0x0b04 }
            r0.A04(r4, r6, r12)     // Catch:{ Exception -> 0x0b04 }
            X.9lY r2 = r4.A0M     // Catch:{ Exception -> 0x0b04 }
            boolean r1 = r2.A0K()     // Catch:{ Exception -> 0x0b04 }
            r20 = 406(0x196, float:5.69E-43)
            if (r1 == 0) goto L_0x09ce
            r20 = 13
        L_0x09ce:
            X.0wo r1 = r0.A0G     // Catch:{ Exception -> 0x0b04 }
            long r17 = X.C19970wo.A00(r1)     // Catch:{ Exception -> 0x0b04 }
            X.9lY r1 = r4.A0M     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r1 = r1.A0H     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r21 = java.lang.Integer.toString(r5)     // Catch:{ Exception -> 0x0b04 }
            r22 = 0
            r16 = r2
            r19 = r1
            r16.A07(r17, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0b04 }
            X.1EU r1 = r0.A0o     // Catch:{ Exception -> 0x0b04 }
            X.AnonymousClass1EU.A00(r1)     // Catch:{ Exception -> 0x0b04 }
            X.1Ed r10 = r1.A05     // Catch:{ Exception -> 0x0b04 }
            X.3Qa r2 = r4.A1J     // Catch:{ Exception -> 0x0b04 }
            X.9lY r1 = r4.A0M     // Catch:{ Exception -> 0x0b04 }
            r21 = 0
            r20 = 0
            r16 = r10
            r17 = r1
            r18 = r2
            r19 = r11
            r16.A0d(r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x0a01:
            boolean r1 = r4 instanceof X.AnonymousClass2bZ     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0a2f
            r1 = 473(0x1d9, float:6.63E-43)
            if (r5 != r1) goto L_0x0a2f
            X.1am r10 = r0.A0F     // Catch:{ Exception -> 0x0b04 }
            r2 = r4
            X.2bZ r2 = (X.AnonymousClass2bZ) r2     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r1 = "review_and_pay"
            boolean r1 = r10.A03(r2, r1)     // Catch:{ Exception -> 0x0b04 }
            if (r1 != 0) goto L_0x0a7b
            java.lang.String r1 = "review_order"
            boolean r1 = r10.A03(r2, r1)     // Catch:{ Exception -> 0x0b04 }
            if (r1 != 0) goto L_0x0a7b
            java.lang.String r1 = "payment_method"
            boolean r1 = r10.A03(r2, r1)     // Catch:{ Exception -> 0x0b04 }
            if (r1 != 0) goto L_0x0a7b
            java.lang.String r1 = "payment_status"
            boolean r1 = r10.A03(r2, r1)     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0ac7
            goto L_0x0a7b
        L_0x0a2f:
            boolean r1 = r3 instanceof X.C28981Uw     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0a43
            X.1bB r11 = r0.A0n     // Catch:{ Exception -> 0x0b04 }
            X.0wU r10 = r11.A06     // Catch:{ Exception -> 0x0b04 }
            r2 = 32
            X.1iP r1 = new X.1iP     // Catch:{ Exception -> 0x0b04 }
            r1.<init>((java.lang.Object) r11, (int) r5, (int) r2, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0b04 }
            r10.Boy(r1)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x0a43:
            X.0v5 r2 = r0.A02     // Catch:{ Exception -> 0x0b04 }
            boolean r1 = r2.A05()     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0a62
            r1 = 430(0x1ae, float:6.03E-43)
            if (r5 == r1) goto L_0x0a57
            r1 = 432(0x1b0, float:6.05E-43)
            if (r5 == r1) goto L_0x0a57
            r1 = 433(0x1b1, float:6.07E-43)
            if (r5 != r1) goto L_0x0a62
        L_0x0a57:
            r2.A02()     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r1 = "setReceivedCertRelatedNack"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0b04 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0adb
        L_0x0a62:
            r1 = 20
            r0.A04(r4, r6, r1)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x0a68:
            X.0xM r11 = r0.A0L     // Catch:{ Exception -> 0x0b04 }
            X.19x r13 = r0.A0s     // Catch:{ Exception -> 0x0b04 }
            X.0wo r1 = r0.A0G     // Catch:{ Exception -> 0x0b04 }
            long r1 = X.C19970wo.A00(r1)     // Catch:{ Exception -> 0x0b04 }
            r10 = 33
            X.2bI r1 = r13.A02(r3, r10, r1)     // Catch:{ Exception -> 0x0b04 }
            r11.A0h(r1)     // Catch:{ Exception -> 0x0b04 }
        L_0x0a7b:
            r0.A04(r4, r6, r12)     // Catch:{ Exception -> 0x0b04 }
            goto L_0x0ac7
        L_0x0a7f:
            X.0xM r14 = r0.A0L     // Catch:{ Exception -> 0x0b04 }
            X.19x r10 = r0.A0s     // Catch:{ Exception -> 0x0b04 }
            X.0wo r1 = r0.A0G     // Catch:{ Exception -> 0x0b04 }
            long r1 = X.C19970wo.A00(r1)     // Catch:{ Exception -> 0x0b04 }
            X.19w r11 = r10.A01     // Catch:{ Exception -> 0x0b04 }
            r10 = 1
            X.3Qa r13 = r11.A02(r3, r10)     // Catch:{ Exception -> 0x0b04 }
            r11 = 8
            X.8nz r10 = new X.8nz     // Catch:{ Exception -> 0x0b04 }
            r10.<init>(r13, r11, r1)     // Catch:{ Exception -> 0x0b04 }
            r14.A0h(r10)     // Catch:{ Exception -> 0x0b04 }
            r0.A04(r4, r6, r12)     // Catch:{ Exception -> 0x0b04 }
            X.17X r2 = r0.A0M     // Catch:{ Exception -> 0x0b04 }
            r1 = r3
            X.147 r1 = (X.AnonymousClass147) r1     // Catch:{ Exception -> 0x0b04 }
            boolean r1 = r2.A0C(r1)     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0ac7
            X.0xQ r10 = r0.A0Y     // Catch:{ Exception -> 0x0b04 }
            android.os.Parcelable$Creator r1 = X.AnonymousClass147.CREATOR     // Catch:{ Exception -> 0x0b04 }
            X.147 r2 = X.C65533Sl.A03(r3)     // Catch:{ Exception -> 0x0b04 }
            X.C18740tg.A06(r2)     // Catch:{ Exception -> 0x0b04 }
            X.0wQ r1 = r0.A05     // Catch:{ Exception -> 0x0b04 }
            r1.A0G()     // Catch:{ Exception -> 0x0b04 }
            X.142 r1 = r1.A0E     // Catch:{ Exception -> 0x0b04 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x0b04 }
            X.11F r1 = r1.A0H     // Catch:{ Exception -> 0x0b04 }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x0b04 }
            X.C18740tg.A06(r1)     // Catch:{ Exception -> 0x0b04 }
            r10.A0d(r2, r1)     // Catch:{ Exception -> 0x0b04 }
        L_0x0ac7:
            X.0v5 r2 = r0.A01     // Catch:{ Exception -> 0x0b04 }
            boolean r1 = r2.A05()     // Catch:{ Exception -> 0x0b04 }
            if (r1 == 0) goto L_0x0b03
            if (r3 == 0) goto L_0x0b03
            r2.A02()     // Catch:{ Exception -> 0x0b04 }
            java.lang.String r1 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0b04 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0b04 }
        L_0x0adb:
            throw r2     // Catch:{ Exception -> 0x0b04 }
        L_0x0adc:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "messageCount"
            int r4 = r2.getInt(r1)
            java.lang.String r1 = "receiptCount"
            r2.getInt(r1)
            java.lang.String r1 = "notificationCount"
            r2.getInt(r1)
            X.1aL r2 = r0.A1F
            r2.A0Y = r4
            X.1VU r0 = r2.A0P
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A03
            r0 = 1
            r1.set(r0)
            X.1W9 r0 = r2.A0M
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A04
            r0.set(r3)
        L_0x0b03:
            return r23
        L_0x0b04:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessagingXmppHandler/Error handling nack/key="
            r2.append(r1)
            r2.append(r6)
            r2.append(r9)
            r2.append(r15)
            r2.append(r8)
            r2.append(r7)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e(r1, r3)
            r0.A03(r4, r6, r5)
            return r23
        L_0x0b29:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0b29 }
            throw r1
        L_0x0b2c:
            java.lang.Object r2 = r5.obj
            android.os.BaseBundle r2 = (android.os.BaseBundle) r2
            java.lang.String r1 = "messageCount"
            int r4 = r2.getInt(r1)
            X.1aL r5 = r0.A1F
            java.lang.Boolean r0 = X.C18750th.A03
            X.0yC r2 = r5.A0H
            r0 = 7918(0x1eee, float:1.1095E-41)
            X.0yV r1 = X.C21000yV.A02
            boolean r3 = X.C20800yB.A01(r1, r2, r0)
            if (r4 != 0) goto L_0x0b4d
            if (r3 != 0) goto L_0x0b4d
            X.1W9 r0 = r5.A0M
            r0.A00()
        L_0x0b4d:
            r0 = 6856(0x1ac8, float:9.607E-42)
            boolean r2 = X.C20800yB.A01(r1, r2, r0)
            X.1aJ r1 = r5.A0S
            X.3vP r0 = new X.3vP
            r0.<init>(r5, r4, r3, r2)
            r1.A00(r0)
            X.1T9 r1 = r5.A0R
            monitor-enter(r1)
            boolean r0 = r1.A02     // Catch:{ all -> 0x0ba4 }
            if (r0 != 0) goto L_0x0b68
            r0 = 0
            r1.A00(r0)     // Catch:{ all -> 0x0ba4 }
        L_0x0b68:
            monitor-exit(r1)
            X.1GU r0 = r5.A0I
            int r4 = r0.A00()
            if (r4 == 0) goto L_0x0b7d
            X.1Ye r3 = r5.A0J
            r2 = 0
            android.os.Handler r1 = r3.A01
            java.lang.Runnable r0 = r3.A09
            r1.removeCallbacks(r0)
            r3.A00 = r2
        L_0x0b7d:
            X.0wU r2 = r5.A0U
            r0 = 10
            X.1iJ r1 = new X.1iJ
            r1.<init>(r5, r4, r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete-retry-media-download"
            r2.Boz(r1, r0)
            r0 = 19
            X.1jA r1 = new X.1jA
            r1.<init>((java.lang.Object) r5, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete-zombie-cleanup"
            r2.Boz(r1, r0)
            r0 = 20
            X.1jA r1 = new X.1jA
            r1.<init>((java.lang.Object) r5, (int) r0)
            java.lang.String r0 = "OfflineResumeHandler/onOfflineComplete channel orphan my reaction processing"
            r2.Boz(r1, r0)
            return r23
        L_0x0ba4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0ba7:
            java.lang.Object r2 = r5.obj
            X.9OM r2 = (X.AnonymousClass9OM) r2
            java.lang.String r3 = "peer"
            java.lang.String r1 = r2.A06
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0cf1
            X.1ax r13 = r0.A1B
            X.9uj r12 = r2.A05
            X.3Qa r11 = r2.A02
            byte[] r10 = r2.A0A
            int r9 = r2.A00
            long r4 = r2.A01
            byte[] r0 = r2.A09
            r20 = r0
            byte[] r15 = r2.A08
            X.5tq r8 = r2.A04
            X.5tq r7 = r2.A03
            boolean r6 = r2.A07
            com.whatsapp.jid.Jid r0 = r12.A02
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r0)
            r0 = 0
            int r2 = X.C203239na.A01(r10, r0)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got retry request from peer "
            r14.append(r0)
            r14.append(r3)
            java.lang.String r0 = " retryCount "
            r14.append(r0)
            r14.append(r9)
            java.lang.String r0 = " for "
            r14.append(r0)
            java.lang.String r1 = r11.A01
            r14.append(r1)
            java.lang.String r0 = " with "
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = " originally sent at "
            r14.append(r0)
            r14.append(r4)
            java.lang.String r0 = r14.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0c7a
            X.0wQ r0 = r13.A00
            boolean r0 = r0.A0N(r3)
            if (r0 == 0) goto L_0x0c7a
            X.17i r0 = r13.A07
            X.0y7 r0 = r0.A02()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0c7a
            X.1AI r0 = r13.A08
            X.8mn r4 = r0.A03(r3, r1)
            if (r4 != 0) goto L_0x0c4e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/invalid peer message: "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " device: "
        L_0x0c3b:
            r2.append(r0)
            r2.append(r3)
        L_0x0c41:
            java.lang.String r0 = r2.toString()
        L_0x0c45:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1C4 r0 = r13.A09
            r0.A01(r12)
            return r23
        L_0x0c4e:
            long r0 = r4.A0I
            X.0wo r5 = r13.A03
            long r18 = X.C19970wo.A00(r5)
            r16 = 5184000000(0x134fd9000, double:2.561236308E-314)
            long r18 = r18 - r16
            int r5 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r5 >= 0) goto L_0x0c64
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/cannot send retry to older message"
            goto L_0x0c45
        L_0x0c64:
            X.1AB r0 = r13.A02
            r0.A0F(r4, r9)
            r0 = 4
            if (r9 <= r0) goto L_0x0c82
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/skipping retry for "
            r2.append(r0)
            r2.append(r11)
            goto L_0x0c41
        L_0x0c7a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got peer message retry from device other than my companion: "
            goto L_0x0c3b
        L_0x0c82:
            X.189 r0 = r13.A04
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0ccb
            X.0wU r1 = r13.A0B
            X.1iL r0 = new X.1iL
            r24 = r0
            r25 = r3
            r26 = r13
            r27 = r11
            r28 = r8
            r29 = r7
            r30 = r12
            r31 = r4
            r32 = r10
            r33 = r20
            r34 = r15
            r35 = r9
            r36 = r2
            r37 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            goto L_0x0cc7
        L_0x0cae:
            X.1Y4 r4 = r0.A0a
            if (r14 != 0) goto L_0x0cb8
            X.11F r10 = r5.A00
            X.C18740tg.A06(r10)
            r9 = 0
        L_0x0cb8:
            boolean r2 = r3.A02
            X.0wU r1 = r4.A0P
            X.73t r0 = new X.73t
            r7 = r0
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r4
            r13 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        L_0x0cc7:
            r1.Boy(r0)
            return r23
        L_0x0ccb:
            X.187 r0 = r13.A05
            X.1iL r1 = new X.1iL
            r24 = r1
            r25 = r3
            r26 = r13
            r27 = r11
            r28 = r8
            r29 = r7
            r30 = r12
            r31 = r4
            r32 = r10
            r33 = r20
            r34 = r15
            r35 = r9
            r36 = r2
            r37 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            goto L_0x0d13
        L_0x0cf1:
            X.1aI r4 = r0.A1G
            X.189 r0 = r4.A08
            boolean r0 = r0.A0X()
            if (r0 == 0) goto L_0x0d08
            X.0wU r3 = r4.A0R
            r1 = 32
            X.1jD r0 = new X.1jD
            r0.<init>(r4, r2, r1)
            r3.Boy(r0)
            return r23
        L_0x0d08:
            X.187 r3 = r4.A09
            r0 = 33
            X.1jD r1 = new X.1jD
            r1.<init>(r4, r2, r0)
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00
        L_0x0d13:
            r0.execute(r1)
            return r23
        L_0x0d17:
            java.lang.Object r6 = r5.obj
            X.B3V r6 = (X.B3V) r6
            r5 = 12
            X.9uj r4 = r6.BuJ()
            java.util.Set r3 = r0.A0y
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0d39
            boolean r1 = r3.contains(r4)     // Catch:{ all -> 0x0d63 }
            if (r1 != 0) goto L_0x0d46
            X.0yf r2 = r0.A10     // Catch:{ all -> 0x0d63 }
            X.0yi r1 = X.C21100yf.A0r     // Catch:{ all -> 0x0d63 }
            boolean r1 = r2.A09(r1)     // Catch:{ all -> 0x0d63 }
            if (r1 == 0) goto L_0x0d39
            r3.add(r4)     // Catch:{ all -> 0x0d63 }
        L_0x0d39:
            r2 = 6
            X.1j3 r1 = new X.1j3     // Catch:{ all -> 0x0d63 }
            r1.<init>(r4, r6, r0, r2)     // Catch:{ all -> 0x0d63 }
            X.1C7 r0 = r0.A0K     // Catch:{ all -> 0x0d63 }
            r0.A02(r1, r5)     // Catch:{ all -> 0x0d63 }
        L_0x0d44:
            monitor-exit(r3)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d62
        L_0x0d46:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d63 }
            r2.<init>()     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "MessagingXmppHandler/onMessageStatusUpdate receipt in queue; skipping stanzaKey:"
            r2.append(r1)     // Catch:{ all -> 0x0d63 }
            r2.append(r4)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0d63 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0d63 }
            X.19L r2 = r0.A0l     // Catch:{ all -> 0x0d63 }
            long r0 = r4.A00     // Catch:{ all -> 0x0d63 }
            r2.A04(r0)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d44
        L_0x0d62:
            return r23
        L_0x0d63:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0d63 }
            throw r1
        L_0x0d66:
            java.lang.Object r1 = r5.obj
            X.9Hs r1 = (X.C192579Hs) r1
            X.AHp r7 = r1.A00
            java.util.Map r1 = r1.A01
            r19 = r1
            X.19L r4 = r0.A0l
            long r2 = r7.A07
            r1 = 0
            X.9ju r1 = X.AnonymousClass19L.A00(r4, r1, r2)
            r8 = 0
            if (r1 == 0) goto L_0x1109
            java.lang.Integer r6 = r1.A08
        L_0x0d7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "MessagingXmppHandler/onMessageForMe id="
            r5.append(r1)
            java.lang.String r1 = r7.A1C
            r5.append(r1)
            java.lang.String r1 = " t="
            r5.append(r1)
            long r1 = r7.A18
            r5.append(r1)
            java.lang.String r3 = " now="
            r5.append(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r5.append(r3)
            java.lang.String r3 = " retry="
            r5.append(r3)
            int r3 = r7.BGp()
            r5.append(r3)
            java.lang.String r3 = " offline="
            r5.append(r3)
            java.lang.Integer r3 = r7.A0W
            r5.append(r3)
            java.lang.String r3 = " edit="
            r5.append(r3)
            int r3 = r7.A01
            r5.append(r3)
            java.lang.String r3 = " stanzaAttrshash="
            r5.append(r3)
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.11F r3 = r7.BGb()
            boolean r3 = r3 instanceof X.C177528dw
            if (r3 == 0) goto L_0x0e0b
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r9 = r1 + r3
            X.0wo r3 = r0.A0G
            long r4 = X.C19970wo.A00(r3)
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0e0b
            X.630 r3 = r7.A0N
            if (r3 != 0) goto L_0x0e0b
            X.1DL r2 = r0.A0j
            java.lang.String r1 = "status-old"
            r2.A0E(r7, r1, r8)
        L_0x0df4:
            X.1Ye r5 = r0.A0b
            boolean r4 = r7.BMW()
            android.os.Handler r3 = r5.A01
            java.lang.Runnable r2 = r5.A09
            r3.removeCallbacks(r2)
            if (r4 == 0) goto L_0x0e08
            r0 = 15000(0x3a98, double:7.411E-320)
            r3.postDelayed(r2, r0)
        L_0x0e08:
            r5.A00 = r4
            return r23
        L_0x0e0b:
            X.11F r3 = r7.BGb()
            boolean r3 = r3 instanceof X.C28981Uw
            if (r3 == 0) goto L_0x0ea2
            X.8SX r3 = r7.A0M
            if (r3 != 0) goto L_0x0e86
            int r4 = r7.A01
            r3 = 8
            if (r4 == r3) goto L_0x0e86
            X.1bC r5 = r0.A0m
            X.3Qa r3 = r7.A0Q
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0df4
            java.lang.String r4 = r7.A0w
            java.lang.String r3 = "reaction"
            boolean r3 = X.AnonymousClass00C.A0J(r4, r3)
            if (r3 != 0) goto L_0x0e43
            java.lang.String r4 = r7.A0w
            java.lang.String r3 = "poll"
            boolean r3 = X.AnonymousClass00C.A0J(r4, r3)
            if (r3 == 0) goto L_0x0df4
            java.lang.String r4 = r7.A0s
            java.lang.String r3 = "vote"
            boolean r3 = X.AnonymousClass00C.A0J(r4, r3)
            if (r3 == 0) goto L_0x0df4
        L_0x0e43:
            X.11F r4 = r7.BGb()
            X.1Uw r4 = (X.C28981Uw) r4
            java.lang.Long r3 = r7.A0Z
            if (r4 == 0) goto L_0x0e6a
            if (r3 == 0) goto L_0x0e6a
            long r12 = r3.longValue()
            java.lang.String r3 = r7.A0t
            r9 = r5
            r10 = r4
            r11 = r3
            r14 = r1
            r9.A01(r10, r11, r12, r14)
            java.util.Set r3 = r7.A0x
            r11 = r3
            r9.A02(r10, r11, r12, r14)
            X.9uj r1 = r7.BHp(r8)
            X.C31051bC.A00(r5, r1)
            goto L_0x0df4
        L_0x0e6a:
            X.1DT r4 = r5.A00
            r3 = 5
            r4.A0S(r7, r8, r3)
            java.lang.String r3 = "491"
            X.9uj r3 = r7.BHp(r3)
            X.C31051bC.A00(r5, r3)
            X.0xM r5 = r5.A01
            r4 = 491(0x1eb, float:6.88E-43)
            X.3Qa r3 = r7.BE4()
            r5.A0r(r3, r4, r1)
            goto L_0x0df4
        L_0x0e86:
            java.lang.Long r1 = r7.A0Z
            if (r1 != 0) goto L_0x0e9d
            r9 = -1
        L_0x0e8c:
            X.1bC r3 = r0.A0m
            X.0wk r2 = r3.A07
            r8 = 6
            X.1iO r1 = new X.1iO
            r5 = r1
            r6 = r3
            r5.<init>(r6, r7, r8, r9)
            r2.execute(r1)
            goto L_0x0df4
        L_0x0e9d:
            long r9 = r1.longValue()
            goto L_0x0e8c
        L_0x0ea2:
            X.19l r3 = r0.A0h
            X.0v0 r3 = r3.A01
            boolean r3 = r3.A2H()
            if (r3 == 0) goto L_0x0ed6
            X.1AN r6 = r0.A0B
            X.19L r9 = r6.A02
            long r3 = r7.A07
            r5 = 0
            X.9ju r4 = X.AnonymousClass19L.A00(r9, r5, r3)
            if (r4 == 0) goto L_0x0ebd
            r3 = 7
            r4.A04(r3)
        L_0x0ebd:
            X.3Qa r10 = r7.BE4()
            X.11F r5 = r10.A00
            r13 = 0
            if (r5 == 0) goto L_0x0ed6
            boolean r3 = X.AnonymousClass143.A0G(r5)
            if (r3 == 0) goto L_0x0ee8
            boolean r3 = r10.A02
            if (r3 != 0) goto L_0x0ee8
            com.whatsapp.jid.UserJid r13 = r7.BHK()
            if (r13 != 0) goto L_0x0ee8
        L_0x0ed6:
            boolean r3 = r7.A11
            if (r3 == 0) goto L_0x1067
            X.1aJ r3 = r0.A0q
            r2 = 28
            X.1jD r1 = new X.1jD
            r1.<init>(r0, r7, r2)
            r3.A00(r1)
            goto L_0x0df4
        L_0x0ee8:
            boolean r4 = r10.A02
            java.lang.String r3 = r10.A01
            X.9Xq r9 = new X.9Xq
            r11 = r9
            r12 = r5
            r14 = r3
            r15 = r1
            r17 = r4
            r11.<init>(r12, r13, r14, r15, r17)
            r11 = 0
            X.11F r3 = r9.A01
            r17 = r3
            monitor-enter(r6)
            java.util.Set r14 = r6.A00     // Catch:{ all -> 0x1122 }
            if (r14 != 0) goto L_0x0f66
            X.1AC r13 = r6.A01     // Catch:{ all -> 0x1122 }
            X.AAS r16 = X.AAS.A00     // Catch:{ all -> 0x1122 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x1122 }
            r14.<init>()     // Catch:{ all -> 0x1122 }
            X.18P r3 = r13.A00     // Catch:{ all -> 0x1122 }
            X.1M0 r15 = r3.get()     // Catch:{ all -> 0x1122 }
            X.14e r5 = r15.A02     // Catch:{ all -> 0x1118 }
            java.lang.String r4 = "SELECT mutation_index, chat_jid FROM syncd_mutations WHERE chat_jid IS NOT NULL  AND are_dependencies_missing = 1"
            java.lang.String r3 = "SyncdMutationsTable.SELECT_ALL_CHAT_JIDS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            android.database.Cursor r12 = r5.A09(r4, r3, r8)     // Catch:{ all -> 0x1118 }
        L_0x0f1a:
            boolean r3 = r12.moveToNext()     // Catch:{ all -> 0x110c }
            if (r3 == 0) goto L_0x0f5e
            java.lang.String r3 = "mutation_index"
            int r3 = r12.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x110c }
            java.lang.String r5 = r12.getString(r3)     // Catch:{ all -> 0x110c }
            X.1AE r4 = r13.A01     // Catch:{ all -> 0x110c }
            java.lang.String r3 = X.C202599mH.A00(r5)     // Catch:{ all -> 0x110c }
            X.AnonymousClass00C.A0D(r3, r11)     // Catch:{ all -> 0x110c }
            X.1LZ r3 = r4.A00(r3)     // Catch:{ all -> 0x110c }
            if (r3 == 0) goto L_0x0f1a
            boolean r3 = r3.A0H()     // Catch:{ all -> 0x110c }
            if (r3 == 0) goto L_0x0f1a
            r3 = r16
            boolean r3 = r3.B5m(r5)     // Catch:{ all -> 0x110c }
            if (r3 == 0) goto L_0x0f1a
            java.lang.String r3 = "chat_jid"
            int r3 = r12.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x110c }
            java.lang.String r4 = r12.getString(r3)     // Catch:{ all -> 0x110c }
            X.13q r3 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x110c }
            X.11F r3 = r3.A02(r4)     // Catch:{ all -> 0x110c }
            X.C18740tg.A06(r3)     // Catch:{ all -> 0x110c }
            r14.add(r3)     // Catch:{ all -> 0x110c }
            goto L_0x0f1a
        L_0x0f5e:
            r12.close()     // Catch:{ all -> 0x1118 }
            r15.close()     // Catch:{ all -> 0x1122 }
            r6.A00 = r14     // Catch:{ all -> 0x1122 }
        L_0x0f66:
            r3 = r17
            boolean r3 = r14.contains(r3)     // Catch:{ all -> 0x1122 }
            monitor-exit(r6)
            if (r3 == 0) goto L_0x0ed6
            X.1AC r12 = r6.A01
            X.AAT r6 = X.AAT.A00
            r3 = 1
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String r3 = r17.getRawString()
            r5[r11] = r3
            java.lang.String r4 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE chat_jid == ? AND are_dependencies_missing = 1 ORDER BY _id ASC"
            java.lang.String r3 = "SyncdMutationsTable.SELECT_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES"
            java.util.ArrayList r6 = X.AnonymousClass1AC.A03(r6, r12, r4, r3, r5)
            java.util.Iterator r5 = r6.iterator()
        L_0x0f88:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x1063
            java.lang.Object r4 = r5.next()
            X.9k5 r4 = (X.C201669k5) r4
            boolean r3 = r4 instanceof X.C176128bc
            if (r3 == 0) goto L_0x0f88
            X.8bc r4 = (X.C176128bc) r4
            X.3Qa r3 = r4.A01
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0f88
            r18 = 1
        L_0x0fa4:
            java.util.Iterator r17 = r6.iterator()
        L_0x0fa8:
            boolean r3 = r17.hasNext()
            if (r3 == 0) goto L_0x0ed6
            java.lang.Object r4 = r17.next()
            X.9k5 r4 = (X.C201669k5) r4
            boolean r14 = r4 instanceof X.C176058bV
            if (r14 != 0) goto L_0x0ff8
            boolean r3 = r4 instanceof X.C176048bU
            if (r3 != 0) goto L_0x0ff8
            boolean r3 = r4 instanceof X.C176118bb
            if (r3 == 0) goto L_0x0fa8
            r3 = r4
            X.8bb r3 = (X.C176118bb) r3
            X.3Qa r3 = r3.A02
            boolean r3 = r3.equals(r10)
            if (r3 == 0) goto L_0x0fa8
            r4.A08(r11)
            java.util.Set r1 = java.util.Collections.singleton(r4)
            r12.A0H(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted deleteForMeMutation: deletedId = "
            r2.append(r1)
            java.lang.String r1 = r9.A03
            r2.append(r1)
        L_0x0fe4:
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.1DT r2 = r0.A06
            r1 = 1
            r2.A0S(r7, r8, r1)
            X.1DL r1 = r0.A0j
            r1.A0C(r7)
            goto L_0x0df4
        L_0x0ff8:
            r3 = r4
            X.4QK r3 = (X.AnonymousClass4QK) r3
            X.9mP r13 = r3.BE5()
            if (r14 == 0) goto L_0x1009
            X.8bV r4 = (X.C176058bV) r4
            boolean r3 = r4.A03
            if (r3 != 0) goto L_0x1009
            if (r18 != 0) goto L_0x0fa8
        L_0x1009:
            long r5 = r9.A00
            long r3 = r13.A00
            int r15 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x1036
            java.lang.String r15 = "MessageRangeUtil/isKeyEnclosedByRange enclosed by the range"
            com.whatsapp.util.Log.i((java.lang.String) r15)
            long r15 = X.C21158AAs.A00(r3, r5)
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x1036
        L_0x101e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "SyncdDeleteMessageRangeHelper/checkIfMessageNeedsToBeDeleted: deletedId = "
            r2.append(r1)
            java.lang.String r1 = r9.A03
            r2.append(r1)
            java.lang.String r1 = "; isClearChat="
            r2.append(r1)
            r2.append(r14)
            goto L_0x0fe4
        L_0x1036:
            java.util.Set r3 = r13.A02
            boolean r4 = r3.contains(r9)
            java.util.Set r3 = r13.A03
            boolean r3 = r3.contains(r9)
            if (r4 != 0) goto L_0x1046
            if (r3 == 0) goto L_0x0fa8
        L_0x1046:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessageRangeUtil/isKeyEnclosedByRange messageRangeContains:"
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = " messagesWithoutTimestampContains:"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x101e
        L_0x1063:
            r18 = 0
            goto L_0x0fa4
        L_0x1067:
            X.11F r3 = r7.BGb()
            boolean r3 = X.AnonymousClass9ZV.A01(r3)
            if (r3 == 0) goto L_0x10b7
            com.whatsapp.jid.Jid r3 = r7.A0E
            java.util.Objects.requireNonNull(r3)
            boolean r3 = X.AnonymousClass9ZV.A00(r3)
            if (r3 == 0) goto L_0x10b7
            X.1DT r8 = r0.A06
            r6 = 12
            X.11F r3 = r7.BGb()
            int r5 = r3.getType()
            r3 = 5
            if (r5 != r3) goto L_0x10a6
            r4 = 72
        L_0x108d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x1091:
            r8.A0S(r7, r4, r6)
            X.1DL r3 = r0.A0j
            r5 = 493(0x1ed, float:6.91E-43)
            r3.A0D(r7, r5)
            X.0xM r4 = r0.A0L
            X.3Qa r3 = r7.BE4()
            r4.A0r(r3, r5, r1)
            goto L_0x0df4
        L_0x10a6:
            r4 = 73
            r3 = 1
            if (r5 == r3) goto L_0x108d
            r3 = 3
            r4 = 74
            if (r5 == r3) goto L_0x108d
            r3 = 6
            r4 = 0
            if (r5 != r3) goto L_0x1091
            r4 = 75
            goto L_0x108d
        L_0x10b7:
            r0.A07(r7)
            X.17e r2 = r0.A0v
            X.11F r1 = r7.BGb()
            X.11F r2 = r2.BQG(r1)
            X.3ur r6 = r7.A0S
            if (r2 == 0) goto L_0x10e2
            X.17T r1 = r0.A0O
            boolean r1 = r1.A08(r2)
            if (r1 != 0) goto L_0x10e2
            if (r6 == 0) goto L_0x10e2
            int r1 = r6.actualActors
            if (r1 != 0) goto L_0x10f1
            long r4 = r6.privacyModeTs
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x10f1
            int r1 = r6.hostStorage
            if (r1 != 0) goto L_0x10f1
        L_0x10e2:
            com.whatsapp.jid.Jid r1 = r7.BHI()
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r1)
            r1 = r19
            r0.A01(r2, r7, r1)
            goto L_0x0df4
        L_0x10f1:
            byte[] r5 = r7.A15
            if (r5 == 0) goto L_0x1103
            X.185 r4 = r0.A0D
            com.whatsapp.jid.UserJid r3 = r7.BHK()
            int r2 = r7.A06
            X.3ur r1 = r7.A0S
            r4.A06(r3, r1, r5, r2)
            goto L_0x10e2
        L_0x1103:
            java.lang.String r1 = "MessagingXmppHandler/Missing vname cert"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x10e2
        L_0x1109:
            r6 = r8
            goto L_0x0d7e
        L_0x110c:
            r1 = move-exception
            if (r12 == 0) goto L_0x1117
            r12.close()     // Catch:{ all -> 0x1113 }
            goto L_0x1117
        L_0x1113:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1118 }
        L_0x1117:
            throw r1     // Catch:{ all -> 0x1118 }
        L_0x1118:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x111d }
            goto L_0x1121
        L_0x111d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x1122 }
        L_0x1121:
            throw r1     // Catch:{ all -> 0x1122 }
        L_0x1122:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30481aH.BJl(android.os.Message, int):boolean");
    }
}
