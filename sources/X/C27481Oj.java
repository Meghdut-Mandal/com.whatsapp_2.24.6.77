package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.1Oj  reason: invalid class name and case insensitive filesystem */
public class C27481Oj implements C27471Oi {
    public final /* synthetic */ AnonymousClass1O1 A00;

    public void BJi(C108515Tu r6, String str, int i, int i2, long j) {
        AnonymousClass1O1 r3 = this.A00;
        r3.A01 = Long.valueOf((long) i2);
        StringBuilder sb = new StringBuilder();
        sb.append("contactsyncmanager/handleSyncContactError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i2);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            long A002 = C19970wo.A00(r3.A0D) + j;
            AnonymousClass1O6 r4 = r3.A08;
            AnonymousClass1O6.A00(r4).edit().putLong("contact_sync_backoff", A002).apply();
            if (i2 == 503) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("contactsyncmanager/handleSyncContactError need global backoff=");
                sb2.append(j);
                Log.e(sb2.toString());
                r4.A02(A002);
            } else if (r6.mode == AnonymousClass5TH.DELTA && i2 == 429) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("contactsyncmanager/handleSyncContactError/deltaSync need backoff=");
                sb3.append(j);
                Log.e(sb3.toString());
                AnonymousClass1O6.A00(r4).edit().putLong("delta_sync_backoff", A002).apply();
            }
        }
    }

    public void BJj(C192519Hh r20, String str, int i) {
        ObjectOutputStream objectOutputStream;
        AnonymousClass1O1 r5 = this.A00;
        C192519Hh r14 = r20;
        r5.A00 = r14;
        AnonymousClass9OU r2 = r14.A00;
        C194899Rr r13 = r2.A02;
        C194899Rr r11 = r2.A08;
        C194899Rr r7 = r2.A09;
        C194899Rr r8 = r2.A07;
        C194899Rr r9 = r2.A01;
        C194899Rr r10 = r2.A03;
        C194899Rr r12 = r2.A06;
        C194899Rr r17 = r2.A04;
        C194899Rr r6 = r2.A05;
        C194899Rr r4 = r2.A00;
        C194899Rr r3 = r2.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("sync/result sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" users_count=");
        C194169Oj[] r0 = r14.A01;
        C194169Oj[] r16 = r0;
        int length = r0.length;
        int i2 = length;
        sb.append(length);
        sb.append(" version=");
        sb.append(r2.A0C);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (r13 != null) {
            sb2.append(" contact=");
            sb2.append(r13);
            Long l = r13.A02;
            if (l != null) {
                AnonymousClass1O6 r142 = r5.A08;
                AnonymousClass1O6.A00(r142).edit().putLong("contact_full_sync_wait", l.longValue()).apply();
            }
            Long l2 = r13.A01;
            if (l2 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("contact_sync_backoff", C19970wo.A00(r5.A0D) + l2.longValue()).apply();
            }
        }
        if (r11 != null) {
            sb2.append(" sidelist=");
            sb2.append(r11);
            Long l3 = r11.A02;
            if (l3 != null) {
                AnonymousClass1O6 r132 = r5.A08;
                AnonymousClass1O6.A00(r132).edit().putLong("sidelist_full_sync_wait", l3.longValue()).apply();
            }
            Long l4 = r11.A01;
            if (l4 != null) {
                r5.A08.A03(C19970wo.A00(r5.A0D) + l4.longValue());
            }
        }
        if (r7 != null) {
            sb2.append(" status=");
            sb2.append(r7);
            Long l5 = r7.A02;
            if (l5 != null) {
                AnonymousClass1O6 r112 = r5.A08;
                AnonymousClass1O6.A00(r112).edit().putLong("status_full_sync_wait", l5.longValue()).apply();
            }
            Long l6 = r7.A01;
            if (l6 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("status_sync_backoff", C19970wo.A00(r5.A0D) + l6.longValue()).apply();
            }
        }
        if (r3 != null) {
            sb2.append(" textStatus=");
            sb2.append(r3);
            Long l7 = r3.A01;
            if (l7 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("text_status_sync_backoff", C19970wo.A00(r5.A0D) + l7.longValue()).apply();
            }
        }
        if (r8 != null) {
            sb2.append(" picture=");
            sb2.append(r8);
            Long l8 = r8.A01;
            if (l8 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("picture_sync_backoff", C19970wo.A00(r5.A0D) + l8.longValue()).apply();
            }
        }
        if (r9 != null) {
            sb2.append(" business=");
            sb2.append(r9);
            Long l9 = r9.A01;
            if (l9 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("business_sync_backoff", C19970wo.A00(r5.A0D) + l9.longValue()).apply();
            }
        }
        if (r10 != null) {
            sb2.append(" devices=");
            sb2.append(r10);
            Long l10 = r10.A01;
            if (l10 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("devices_sync_backoff", C19970wo.A00(r5.A0D) + l10.longValue()).apply();
            }
        }
        if (r12 != null) {
            sb2.append(" payment=");
            sb2.append(r12);
            Long l11 = r12.A01;
            if (l11 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("payment_sync_backoff", C19970wo.A00(r5.A0D) + l11.longValue()).apply();
            }
        }
        if (r17 != null) {
            sb2.append(" disappearing_mode=");
            C194899Rr r02 = r17;
            sb2.append(r02);
            Long l12 = r02.A01;
            if (l12 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("disappearing_mode_sync_backoff", C19970wo.A00(r5.A0D) + l12.longValue()).apply();
            }
        }
        if (r6 != null) {
            sb2.append(" lid=");
            sb2.append(r6);
            Long l13 = r6.A01;
            if (l13 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("lid_sync_backoff", C19970wo.A00(r5.A0D) + l13.longValue()).apply();
            }
        }
        if (r4 != null) {
            sb2.append(" bot=");
            sb2.append(r4);
            Long l14 = r4.A01;
            if (l14 != null) {
                AnonymousClass1O6.A00(r5.A08).edit().putLong("bot_sync_backoff", C19970wo.A00(r5.A0D) + l14.longValue()).apply();
            }
        }
        Log.i(sb2.toString());
        AnonymousClass1O2 r42 = r5.A09;
        HashSet A002 = r42.A00();
        for (int i3 = 0; i3 < i2; i3++) {
            C194169Oj r72 = r16[i3];
            if (r72.A04 == 3) {
                List list = r72.A0K;
                C18740tg.A06(list);
                A002.addAll(list);
            } else {
                if ((r72.A04 == 1 || r72.A04 == 2) && r72.A0K != null) {
                    for (Object put : r72.A0K) {
                        r5.A0N.put(put, r72);
                    }
                }
                UserJid userJid = r72.A0D;
                if (userJid != null) {
                    r5.A0L.put(userJid, r72);
                } else {
                    Log.w("sync/result/no-jid-found");
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(r42.A01.A00.getFilesDir(), "invalid_numbers"));
            try {
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                r42.A00 = A002;
                objectOutputStream.writeObject(A002);
                objectOutputStream.close();
                fileOutputStream.close();
                return;
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
            throw th;
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void BJk(int i, int i2, String str, long j) {
        AnonymousClass1O1 r3 = this.A00;
        r3.A01 = 1L;
        StringBuilder sb = new StringBuilder();
        sb.append("contactsyncmanager/handleSyncSidelistError/error sid=");
        sb.append(str);
        sb.append(" index=");
        sb.append(0);
        sb.append(" code=");
        sb.append(i2);
        sb.append(" backoff=");
        sb.append(j);
        Log.e(sb.toString());
        if (j > 0) {
            r3.A08.A03(C19970wo.A00(r3.A0D) + j);
        }
    }

    public C27481Oj(AnonymousClass1O1 r1) {
        this.A00 = r1;
    }
}
