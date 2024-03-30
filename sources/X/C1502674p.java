package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.74p  reason: invalid class name and case insensitive filesystem */
public class C1502674p implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C1502674p(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.A05 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = z;
        this.A03 = obj4;
    }

    public final void run() {
        long j;
        long j2;
        long j3;
        switch (this.A05) {
            case 0:
                A29 a29 = (A29) this.A00;
                List list = (List) this.A01;
                boolean z = this.A04;
                UUID uuid = (UUID) this.A03;
                if (0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass001.A0A("onError");
                } else if (z) {
                    a29.A0R.A03(uuid);
                    a29.B5Z((AnonymousClass9T8) null);
                    return;
                } else {
                    return;
                }
            case 1:
                A28 a28 = (A28) this.A00;
                List list2 = (List) this.A01;
                UUID uuid2 = (UUID) this.A03;
                if (0 < list2.size()) {
                    list2.get(0);
                    throw AnonymousClass001.A0A("onError");
                }
                a28.A0W.A03(uuid2);
                a28.B5Z((AnonymousClass9T8) null);
                return;
            case 2:
                C125065zG r11 = (C125065zG) this.A00;
                C101534xr r2 = (C101534xr) this.A01;
                Map map = (Map) this.A02;
                boolean z2 = this.A04;
                AnonymousClass635 r24 = (AnonymousClass635) this.A03;
                C224214g r0 = new C224214g("restore>BackupApiBackupSelector/download-size-calc");
                try {
                    C132346Te r7 = r2.A01;
                    AtomicBoolean atomicBoolean = r11.A0K;
                    JSONObject jSONObject = r7.A0B;
                    JSONObject jSONObject2 = jSONObject;
                    long j4 = -1;
                    if (jSONObject != null) {
                        j4 = jSONObject.optLong("chatdbSize", -1);
                    }
                    if (z2) {
                        j = j4;
                    } else {
                        j = 0;
                    }
                    boolean z3 = false;
                    if (j > 0) {
                        r24.A00(false);
                    }
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("restore>BackupApiBackupSelector/calc-approx-total-download total size:");
                    long j5 = r7.A04;
                    A0u.append(j5);
                    A0u.append(" dbSize: ");
                    A0u.append(j4);
                    C36321k7.A1X(" includeDbSize: ", A0u, z2);
                    if (j5 < 0) {
                        Log.e("restore>BackupApiBackupSelector/calc-approx-total-download totalSize is negative.");
                    }
                    if (j4 < 0) {
                        Log.e("restore>BackupApiBackupSelector/calc-approx-total-download dbSize is negative.");
                    }
                    long j6 = j5 - j4;
                    C20690y0 r27 = r11.A01;
                    if (r27.A0H().exists()) {
                        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                        int i = 20;
                        if (map.size() < 10) {
                            i = 1;
                        }
                        int i2 = 0;
                        long j7 = 0;
                        long j8 = 0;
                        while (true) {
                            if (i2 < strArr.length) {
                                if (atomicBoolean.get()) {
                                    Log.i("restore>BackupApiBackupSelector/calc-approx-media-download-size/interrupted");
                                    j6 = -1;
                                } else {
                                    String str = strArr[i2];
                                    if (str == null) {
                                        Log.e("restore>BackupApiBackupSelector/calc-approx-media-download-size file upload path is null, unexpected.");
                                    } else {
                                        AnonymousClass179 r02 = r11.A09;
                                        AnonymousClass179 r13 = r02;
                                        String A06 = C34191gb.A06(r02, str);
                                        if (A06 == null) {
                                            C36321k7.A1Q("restore>BackupApiBackupSelector/calc-approx-media-download-size/no-local-path-mapping ", str, AnonymousClass000.A0u());
                                        } else {
                                            C131526Pk r15 = (C131526Pk) C90514aH.A0p(str, map);
                                            File A0S = C90524aI.A0S(A06);
                                            if (AnonymousClass6Y6.A03(r27, A0S)) {
                                                if (!A0S.exists() || A0S.length() == 0) {
                                                    j3 = r15.A00;
                                                    j8 += j3;
                                                } else if (!z2) {
                                                    j8 += r15.A00;
                                                } else if (i2 % i == 0) {
                                                    j3 = r15.A00;
                                                    j8 += j3;
                                                    if (AnonymousClass6YN.A00(r15, r13, r11.A0B, A06) != 4) {
                                                    }
                                                }
                                                j7 += j3;
                                                r24.A00(false);
                                            }
                                        }
                                    }
                                    i2++;
                                }
                            } else if (j8 == 0) {
                                if (j7 > 0) {
                                    StringBuilder A0u2 = AnonymousClass000.A0u();
                                    A0u2.append("restore>BackupApiBackupSelector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=");
                                    A0u2.append(j7);
                                    C36341k9.A1M(" be greater than totalSampleSize=", A0u2, j8);
                                }
                                j6 = 0;
                            } else {
                                j6 = (long) (((((double) j7) * 1.0d) / ((double) j8)) * ((double) j6));
                            }
                        }
                    }
                    long j9 = j + j6;
                    if (j9 == 0) {
                        z3 = true;
                    }
                    r24.A00(Boolean.valueOf(z3));
                    if (z2) {
                        long j10 = -1;
                        if (jSONObject2 != null) {
                            j10 = jSONObject2.optLong("chatdbSize", -1);
                        }
                        j2 = j9 - j10;
                    } else {
                        j2 = j9;
                    }
                    RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r11.A0J.get();
                    if (restoreFromBackupActivity != null) {
                        restoreFromBackupActivity.A3q(j9, j2);
                    }
                } catch (AnonymousClass5VQ e) {
                    Log.e((Throwable) e);
                }
                r0.A01();
                return;
            case 3:
                C65633Sw r6 = (C65633Sw) this.A00;
                C46962bx r5 = (C46962bx) this.A01;
                boolean z4 = this.A04;
                C135066c4 r3 = (C135066c4) this.A02;
                AnonymousClass31E r22 = (AnonymousClass31E) this.A03;
                if (r5.A1J.equals(r6.A08.getTag())) {
                    C65633Sw.A00(r6, r5, r3, z4);
                    if (r22 != null) {
                        AnonymousClass2IL r1 = r22.A00;
                        if (!r1.A0T.A0L() && ((C46962bx) ((AnonymousClass2bU) r1.A0K)).A05 != null) {
                            r1.A1e();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                C96124mp r52 = (C96124mp) this.A00;
                boolean z5 = this.A04;
                AnonymousClass6CW r32 = (AnonymousClass6CW) this.A01;
                C96934o8 r23 = (C96934o8) this.A02;
                AnonymousClass68B r03 = (AnonymousClass68B) this.A03;
                if (z5) {
                    C96124mp.A01(r52, r23, r32);
                }
                C96124mp.A00(r03, r52, r23);
                return;
            default:
                AnonymousClass3OB r62 = (AnonymousClass3OB) this.A00;
                AnonymousClass11F r53 = (AnonymousClass11F) this.A02;
                C20750y6 r4 = (C20750y6) this.A03;
                boolean z6 = this.A04;
                for (AnonymousClass144 r33 : (Set) this.A01) {
                    C225614x it = r4.iterator();
                    while (true) {
                        boolean z7 = false;
                        while (true) {
                            if (it.hasNext()) {
                                if (r62.A05.A0A.A07(new AnonymousClass6EU(C133256Xm.A02((DeviceJid) it.next()), r33.getRawString()), false) || z7) {
                                    z7 = true;
                                }
                            } else if (z7 && !z6) {
                                AnonymousClass1DT r25 = r62.A01;
                                int i3 = 8;
                                if (r62.A00.A0M(r53)) {
                                    i3 = 7;
                                }
                                r25.A0K(r33, Integer.valueOf(i3));
                            }
                        }
                    }
                }
                return;
        }
    }

    public C1502674p(AnonymousClass78P r2, A28 a28, List list, UUID uuid) {
        this.A05 = 1;
        this.A00 = a28;
        this.A01 = list;
        this.A02 = r2;
        this.A04 = true;
        this.A03 = uuid;
    }
}
