package X;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.1FR  reason: invalid class name */
public class AnonymousClass1FR {
    public final C19730wQ A00;
    public final AnonymousClass16D A01;
    public final AnonymousClass171 A02;
    public final C19970wo A03;
    public final C19630wG A04;
    public final C18820ts A05;
    public final C20810yC A06;
    public final C24601Db A07;
    public final AnonymousClass1EV A08;
    public final AnonymousClass1EU A09;
    public final AnonymousClass185 A0A;
    public final AnonymousClass17X A0B;
    public final AnonymousClass16T A0C;
    public final C24631De A0D;
    public final C24641Df A0E;
    public final C24611Dc A0F = C24611Dc.A00("PaymentsUtils", "infra", "COMMON");

    public static String A03(int i) {
        if (i == 0) {
            return "native";
        }
        if (i == 6) {
            return "pix";
        }
        if (i == 2) {
            return "cpi";
        }
        if (i != 3) {
            return null;
        }
        return "confirm";
    }

    public static String A04(int i, int i2) {
        if (i == 1) {
            return "main_camera";
        }
        if (i != 3) {
            if (i == 4) {
                return "payments_camera";
            }
            return "unknown";
        } else if (i2 == 1) {
            return "chat_attachment_gallery";
        } else {
            if (i2 == 10) {
                return "main_camera_gallery";
            }
            if (i2 == 13 || i2 == 21) {
                return "chat_camera_gallery";
            }
            if (i2 == 33) {
                return "photo_received";
            }
            if (i2 == 34) {
                return "photo_received_gallery";
            }
            return "unknown";
        }
    }

    public int A0D(AnonymousClass11F r8) {
        AnonymousClass1EV r3 = this.A08;
        if (!r3.A04(0)) {
            return 0;
        }
        C19730wQ r4 = this.A00;
        if (r4.A0M(r8) || (r8 instanceof C177618e5)) {
            return 0;
        }
        if (AnonymousClass143.A0G(r8)) {
            r3.A04.A02();
            int i = 4;
            C225614x it = this.A0B.A07.A0C((AnonymousClass144) r8).A07().iterator();
            while (it.hasNext()) {
                UserJid userJid = ((AnonymousClass6PM) it.next()).A03;
                if (!r4.A0M(userJid)) {
                    i = 3;
                    if (r3.A06(userJid) == 2) {
                        return 4;
                    }
                }
            }
            return i;
        }
        C222813r r0 = UserJid.Companion;
        return r3.A06(C222813r.A00(r8));
    }

    public SpannableStringBuilder A0F(Context context, int i) {
        AnonymousClass16U r1;
        if (i == 1) {
            C19730wQ r0 = this.A00;
            r0.A0G();
            PhoneUserJid phoneUserJid = r0.A03;
            C18740tg.A06(phoneUserJid);
            AnonymousClass16U[] r02 = AnonymousClass16T.A01;
            r1 = C202159l8.A00(C202159l8.A01(AnonymousClass3SI.A02(AnonymousClass3U8.A07(phoneUserJid))).A03).A02;
        } else if (i != 3) {
            return null;
        } else {
            r1 = AnonymousClass16W.A05;
        }
        return ((AnonymousClass16W) r1).BAV(context, 0);
    }

    public synchronized String A0N(C175708av r3, AnonymousClass11F r4, boolean z) {
        String str;
        if (r4 != null) {
            AnonymousClass141 A0D2 = this.A01.A0D(r4);
            if (z) {
                str = this.A02.A0M(A0D2);
            } else {
                str = this.A02.A0H(A0D2);
            }
        } else {
            str = null;
            if (r3 != null) {
                str = A07(r3, true);
            }
        }
        return str;
    }

    public synchronized String A0Q(C202319lY r2) {
        return A0W(r2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r0 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (r3 != 1000) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0R(X.C202319lY r8) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x001d
            X.16D r0 = r7.A01     // Catch:{ all -> 0x0094 }
            X.141 r5 = r0.A0D(r1)     // Catch:{ all -> 0x0094 }
        L_0x000c:
            X.0wG r0 = r7.A04     // Catch:{ all -> 0x0094 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0094 }
            r0 = 2131895206(0x7f1223a6, float:1.9425238E38)
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            int r3 = r8.A03     // Catch:{ all -> 0x0094 }
            r1 = 1
            if (r3 == r1) goto L_0x001f
            goto L_0x0036
        L_0x001d:
            r5 = 0
            goto L_0x000c
        L_0x001f:
            if (r5 == 0) goto L_0x0028
            X.171 r0 = r7.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0M(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0028:
            X.8av r0 = r8.A0A     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r7.A07(r0, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0050
        L_0x0034:
            monitor-exit(r6)
            return r0
        L_0x0036:
            r0 = 2
            if (r3 == r0) goto L_0x008a
            r0 = 3
            if (r3 == r0) goto L_0x0052
            r0 = 10
            if (r3 == r0) goto L_0x008a
            r0 = 20
            if (r3 == r0) goto L_0x001f
            r0 = 100
            if (r3 == r0) goto L_0x001f
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x008a
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r0) goto L_0x005b
        L_0x0050:
            monitor-exit(r6)
            return r4
        L_0x0052:
            if (r5 == 0) goto L_0x005b
            X.171 r0 = r7.A02     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = r0.A0M(r5)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x005b:
            X.0wQ r1 = r7.A00     // Catch:{ all -> 0x0092 }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x0092 }
            boolean r0 = r1.A0M(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006d
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x006d:
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0078
            X.16D r0 = r7.A01     // Catch:{ all -> 0x0092 }
            X.141 r1 = r0.A0D(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0079
        L_0x0078:
            r1 = 0
        L_0x0079:
            if (r1 == 0) goto L_0x0082
            X.171 r0 = r7.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = r0.A0M(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x0082:
            r0 = 2131895206(0x7f1223a6, float:1.9425238E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0034
        L_0x008a:
            r0 = 2131896229(0x7f1227a5, float:1.9427313E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0034
        L_0x0092:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0R(X.9lY):java.lang.String");
    }

    public synchronized String A0S(C202319lY r4) {
        AnonymousClass141 r2;
        String str;
        C18740tg.A0C(r4.A0K());
        UserJid userJid = r4.A0E;
        if (userJid != null) {
            r2 = this.A01.A0D(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            C175708av r0 = r4.A0A;
            if (r0 != null) {
                str = A07(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(R.string.f12nameremoved);
            }
        } else if (this.A00.A0M(r2.A0H)) {
            str = this.A04.A00.getString(R.string.f12nameremoved);
        } else {
            str = this.A02.A0M(r2);
        }
        return str;
    }

    public synchronized String A0T(C202319lY r4) {
        AnonymousClass141 r2;
        String str;
        C18740tg.A0C(r4.A0K());
        UserJid userJid = r4.A0D;
        if (userJid != null) {
            r2 = this.A01.A0D(userJid);
        } else {
            r2 = null;
        }
        if (r2 == null) {
            C175708av r0 = r4.A0A;
            if (r0 != null) {
                str = A07(r0, true);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(R.string.f12nameremoved);
            }
        } else if (this.A00.A0M(r2.A0H)) {
            str = this.A04.A00.getString(R.string.f12nameremoved);
        } else {
            str = this.A02.A0M(r2);
        }
        return str;
    }

    public synchronized String A0U(C202319lY r3) {
        AnonymousClass141 r1;
        String str;
        UserJid userJid = r3.A0E;
        if (userJid != null) {
            r1 = this.A01.A0D(userJid);
        } else {
            r1 = null;
        }
        if (r1 != null) {
            str = this.A02.A0M(r1);
        } else {
            C175708av r0 = r3.A0A;
            if (r0 != null) {
                str = A07(r0, false);
            } else {
                str = null;
            }
            if (str == null) {
                str = this.A04.A00.getString(R.string.f12nameremoved);
            }
        }
        return str;
    }

    public synchronized String A0V(C202319lY r7, AnonymousClass3T1 r8) {
        String str;
        AnonymousClass16D r1 = this.A01;
        UserJid A0L = r8.A0L();
        C18740tg.A06(A0L);
        AnonymousClass141 A0D2 = r1.A0D(A0L);
        if (r8 instanceof C180978mj) {
            boolean z = r8.A1J.A02;
            int i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            if (r7.A08 == null) {
                i = R.string.f12nameremoved;
                if (z) {
                    i = R.string.f12nameremoved;
                }
            }
            str = this.A04.A00.getString(i, new Object[]{this.A02.A0H(A0D2), A0P(r7)});
        } else if (r8 instanceof C180968mi) {
            boolean z2 = r8.A1J.A02;
            int i2 = R.string.f12nameremoved;
            if (z2) {
                i2 = R.string.f12nameremoved;
            }
            if (r7.A08 == null) {
                i2 = R.string.f12nameremoved;
                if (z2) {
                    i2 = R.string.f12nameremoved;
                }
            }
            str = this.A04.A00.getString(i2, new Object[]{this.A02.A0H(A0D2), A0P(r7)});
        } else {
            throw new IllegalStateException(C24611Dc.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
        }
        return str;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c0, code lost:
        if (r0 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r0 = r3.A04.A00.getString(com.whatsapp.R.string.f12nameremoved);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0W(X.C202319lY r4, boolean r5) {
        /*
            r3 = this;
            r2 = r3
            monitor-enter(r2)
            int r1 = r4.A03     // Catch:{ all -> 0x00d0 }
            r0 = 20
            if (r1 == r0) goto L_0x00b6
            r0 = 30
            if (r1 == r0) goto L_0x007c
            r0 = 40
            if (r1 == r0) goto L_0x00b6
            r0 = 100
            if (r1 == r0) goto L_0x00b6
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0058
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x007c
            switch(r1) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x0058;
                case 3: goto L_0x007c;
                case 4: goto L_0x007c;
                case 5: goto L_0x007c;
                case 6: goto L_0x002c;
                case 7: goto L_0x0039;
                case 8: goto L_0x004c;
                case 9: goto L_0x0021;
                case 10: goto L_0x0058;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x00d0 }
        L_0x001f:
            goto L_0x00c4
        L_0x0021:
            r1 = 0
            X.8av r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r3.A07(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c0
        L_0x002c:
            X.0wG r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131892309(0x7f121855, float:1.9419363E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0039:
            X.0wG r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            X.1EU r0 = r3.A09     // Catch:{ all -> 0x00d0 }
            X.B66 r0 = r0.A05()     // Catch:{ all -> 0x00d0 }
            int r0 = r0.BFR()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x004c:
            X.0wG r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131892310(0x7f121856, float:1.9419365E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0058:
            com.whatsapp.jid.UserJid r1 = r4.A0E     // Catch:{ all -> 0x00d0 }
            if (r1 == 0) goto L_0x0072
            X.16D r0 = r3.A01     // Catch:{ all -> 0x00d0 }
            X.141 r1 = r0.A0D(r1)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x006b
            X.171 r0 = r3.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.A0M(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x006b:
            X.171 r0 = r3.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r0.A0H(r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x0072:
            r1 = 0
            X.8av r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r0 = r3.A07(r0, r1)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c0
        L_0x007c:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00b4 }
            if (r1 == 0) goto L_0x00a8
            com.whatsapp.jid.UserJid r0 = r4.A0E     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00a8
            X.0wQ r0 = r3.A00     // Catch:{ all -> 0x00b4 }
            boolean r0 = r0.A0M(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0095
            com.whatsapp.jid.UserJid r1 = r4.A0E     // Catch:{ all -> 0x00b4 }
        L_0x008e:
            X.16D r0 = r3.A01     // Catch:{ all -> 0x00b4 }
            X.141 r1 = r0.A0D(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x0098
        L_0x0095:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00b4 }
            goto L_0x008e
        L_0x0098:
            if (r5 == 0) goto L_0x00a1
            X.171 r0 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.A0M(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00a1:
            X.171 r0 = r3.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = r0.A0H(r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00a8:
            X.0wG r0 = r3.A04     // Catch:{ all -> 0x00b4 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00b4 }
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x00c2
        L_0x00b4:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d0 }
        L_0x00b6:
            com.whatsapp.jid.UserJid r1 = r4.A0D     // Catch:{ all -> 0x00d0 }
            X.8av r0 = r4.A0A     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r3.A0N(r0, r1, r5)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            monitor-exit(r2)
            return r0
        L_0x00c4:
            X.0wG r0 = r3.A04     // Catch:{ all -> 0x00d0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00d0 }
            r0 = 2131895200(0x7f1223a0, float:1.9425226E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00d0 }
            goto L_0x00c2
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0W(X.9lY, boolean):java.lang.String");
    }

    public synchronized String A0Z(AnonymousClass3T1 r16) {
        String string;
        int i;
        String str;
        String str2;
        String str3;
        AnonymousClass3T1 r9 = r16;
        C202319lY r1 = r9.A0M;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        C18740tg.A0C(z);
        AnonymousClass16X r0 = r1.A08;
        if (r0 != null) {
            i = r0.A00.intValue();
            string = A0P(r9.A0M);
        } else {
            string = this.A04.A00.getString(R.string.f12nameremoved);
            i = 1;
        }
        C19730wQ r12 = this.A00;
        boolean A0M = r12.A0M(r9.A0M.A0E);
        boolean A0M2 = r12.A0M(r9.A0M.A0D);
        if (r9.A0M.A0K()) {
            String A0T = A0T(r9.A0M);
            String A0S = A0S(r9.A0M);
            C24611Dc r2 = this.A0F;
            StringBuilder sb = new StringBuilder();
            sb.append("payment request: ");
            sb.append(r9.A1J);
            sb.append(" requester: ");
            sb.append(A0T);
            sb.append(" requestee: ");
            sb.append(A0S);
            r2.A06(sb.toString());
            if (A0M2) {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{string, A0S});
            } else if (A0M) {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{A0T, string});
            } else {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{A0T, string, A0S});
            }
        } else {
            C64933Qa r10 = r9.A1J;
            AnonymousClass11F r22 = r10.A00;
            if (r22 != null) {
                AnonymousClass11F A0J = r9.A0J();
                if (AnonymousClass143.A0G(r22) && A0J != null) {
                    r22 = A0J;
                }
                AnonymousClass171 r13 = this.A02;
                AnonymousClass16D r02 = this.A01;
                C18740tg.A06(r22);
                str2 = r13.A0M(r02.A0D(r22));
            } else {
                str2 = A0U(r9.A0M);
            }
            String A0R = A0R(r9.A0M);
            C24611Dc r23 = this.A0F;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("payment message: ");
            sb2.append(r10);
            sb2.append(" sender: ");
            sb2.append(str2);
            sb2.append(" receiver: ");
            sb2.append(A0R);
            r23.A06(sb2.toString());
            boolean z2 = true;
            if (!TextUtils.isEmpty(str2)) {
                z2 = false;
            }
            C202319lY r92 = r9.A0M;
            int i2 = r92.A03;
            if ((i2 == 2 || i2 == 200) && r92.A02 == 102) {
                Long A0L = A0L(r92);
                if (A0L != null) {
                    str3 = A0M(A0L.longValue());
                } else {
                    str3 = null;
                }
                if (z2) {
                    if (TextUtils.isEmpty(str3)) {
                        str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{string});
                    } else {
                        str = this.A04.A00.getResources().getString(R.string.f12nameremoved, new Object[]{string, str3});
                    }
                } else if (TextUtils.isEmpty(str3)) {
                    str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{str2, string});
                } else {
                    str = this.A04.A00.getResources().getString(R.string.f12nameremoved, new Object[]{str2, string, str3});
                }
            } else if (i2 == 1000) {
                if (z2) {
                    str = A08(r92, this);
                } else if (A0M2) {
                    str = this.A04.A00.getString(R.string.f12nameremoved, new Object[]{str2});
                } else {
                    str = this.A04.A00.getString(R.string.f12nameremoved, new Object[]{str2, A0R});
                }
            } else if (z2) {
                if (A0M2) {
                    str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{string});
                } else {
                    str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{string, A0R});
                }
            } else if (A0M) {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{string, A0R});
            } else if (A0M2) {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{str2, string});
            } else {
                str = this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i, new Object[]{str2, string, A0R});
            }
        }
        return str;
    }

    public boolean A0h(AnonymousClass11F r6) {
        if (r6 != null) {
            String str = r6.user;
            try {
                JSONArray jSONArray = new JSONArray(this.A06.A09(2462));
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (str.equals(jSONArray.getString(i))) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsUtils/isMessageBusinessSupported: Unable to parse allowed_message_merchants");
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r6.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0i(X.AnonymousClass11F r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0030
            X.0yC r3 = r6.A06
            r0 = 2435(0x983, float:3.412E-42)
            java.lang.String r2 = r3.A09(r0)
            if (r2 == 0) goto L_0x0030
            r1 = 2221(0x8ad, float:3.112E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r3, r1)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = ","
            java.lang.String[] r4 = r2.split(r0)
            java.lang.String r3 = r7.user
            int r2 = r4.length
            r1 = 0
        L_0x0021:
            if (r1 >= r2) goto L_0x0030
            r0 = r4[r1]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            return r0
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0i(X.11F):boolean");
    }

    public static int A00(C202319lY r1) {
        int i = r1.A02;
        if (i == 802 || i == 804 || i == 902 || i == 904 || i == 906 || i == 908) {
            return R.color.f6nameremoved;
        }
        switch (i) {
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
                return R.color.f6nameremoved;
            case 13:
            case 14:
                return R.color.f6nameremoved;
            case 17:
                return R.color.f6nameremoved;
            default:
                switch (i) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 109:
                    case 112:
                        return R.color.f6nameremoved;
                    case 105:
                    case 107:
                    case C65953Uc.A03 /*108*/:
                    case 110:
                    case 111:
                        return R.color.f6nameremoved;
                    case 106:
                        return R.color.f6nameremoved;
                    default:
                        switch (i) {
                            case 401:
                            case 402:
                            case 403:
                            case 410:
                            case 415:
                            case 417:
                            case 418:
                                return R.color.f6nameremoved;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 416:
                                return R.color.f6nameremoved;
                            case 405:
                                return R.color.f6nameremoved;
                            default:
                                switch (i) {
                                    case 420:
                                    case 421:
                                        return R.color.f6nameremoved;
                                    case 422:
                                    case 423:
                                    case 424:
                                        return R.color.f6nameremoved;
                                    default:
                                        switch (i) {
                                            case 601:
                                            case 602:
                                            case 603:
                                            case 606:
                                            case 607:
                                            case 608:
                                                return R.color.f6nameremoved;
                                            case 604:
                                                return R.color.f6nameremoved;
                                            case 605:
                                                return R.color.f6nameremoved;
                                            default:
                                                switch (i) {
                                                    case 703:
                                                        return R.color.f6nameremoved;
                                                    case 704:
                                                        return R.color.f6nameremoved;
                                                    default:
                                                        return R.color.f6nameremoved;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return X.C023109s.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return X.C023109s.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return X.C023109s.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A02(X.C202319lY r0) {
        /*
            int r0 = r0.A02
            switch(r0) {
                case 11: goto L_0x0014;
                case 12: goto L_0x0014;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x0014;
                case 16: goto L_0x0014;
                case 17: goto L_0x0017;
                case 18: goto L_0x0014;
                case 19: goto L_0x0014;
                case 20: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            switch(r0) {
                case 101: goto L_0x0014;
                case 102: goto L_0x0014;
                case 103: goto L_0x0014;
                case 104: goto L_0x0014;
                case 105: goto L_0x001a;
                case 106: goto L_0x0017;
                case 107: goto L_0x001a;
                case 108: goto L_0x001a;
                case 109: goto L_0x0014;
                case 110: goto L_0x001a;
                case 111: goto L_0x001a;
                case 112: goto L_0x0014;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r0) {
                case 401: goto L_0x0014;
                case 402: goto L_0x0014;
                case 403: goto L_0x0014;
                case 404: goto L_0x001a;
                case 405: goto L_0x0017;
                case 406: goto L_0x001a;
                case 407: goto L_0x001a;
                case 408: goto L_0x001a;
                case 409: goto L_0x001a;
                case 410: goto L_0x0014;
                case 411: goto L_0x001a;
                case 412: goto L_0x001a;
                case 413: goto L_0x001a;
                case 414: goto L_0x001a;
                case 415: goto L_0x0014;
                case 416: goto L_0x001a;
                case 417: goto L_0x0014;
                case 418: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r0) {
                case 420: goto L_0x0014;
                case 421: goto L_0x0014;
                case 422: goto L_0x001a;
                case 423: goto L_0x001a;
                case 424: goto L_0x001a;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 601: goto L_0x0014;
                case 602: goto L_0x0014;
                case 603: goto L_0x0014;
                case 604: goto L_0x0017;
                case 605: goto L_0x001a;
                case 606: goto L_0x0014;
                case 607: goto L_0x0014;
                case 608: goto L_0x0014;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r0) {
                case 703: goto L_0x0017;
                case 704: goto L_0x001a;
                default: goto L_0x0014;
            }
        L_0x0014:
            java.lang.Integer r0 = X.C023109s.A00
            return r0
        L_0x0017:
            java.lang.Integer r0 = X.C023109s.A0C
            return r0
        L_0x001a:
            java.lang.Integer r0 = X.C023109s.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A02(X.9lY):java.lang.Integer");
    }

    private String A05(long j, int i) {
        C18820ts r2;
        String str = "";
        if (j > 0) {
            long j2 = 86400000;
            int i2 = (int) (j / 86400000);
            if (i2 > 0) {
                r2 = this.A05;
                str = AnonymousClass3UY.A03(r2, i2, 3);
            } else {
                j2 = 3600000;
                int i3 = (int) (j / 3600000);
                if (i3 > 0) {
                    r2 = this.A05;
                    str = AnonymousClass3UY.A03(r2, i3, 2);
                } else {
                    int i4 = (int) (j / 60000);
                    if (i4 > 0) {
                        return AnonymousClass3UY.A03(this.A05, i4, 1);
                    }
                }
            }
            long j3 = j % j2;
            if (!(i == 1 || j3 == 0)) {
                return r2.A0C(244, str, A05(j3, 1));
            }
        }
        return str;
    }

    public static String A06(AnonymousClass16X r2, String str) {
        if (r2 == null) {
            return "";
        }
        return TextUtils.join(";", Arrays.asList(new String[]{str, Long.toString(r2.A00.scaleByPowerOfTen(3).longValue())}));
    }

    private String A07(C175708av r5, boolean z) {
        C135086c7 A0D2;
        Object obj;
        boolean z2;
        if (z) {
            A0D2 = r5.A0C();
        } else {
            A0D2 = r5.A0D();
        }
        if (A0D2 == null) {
            obj = null;
        } else {
            obj = A0D2.A00;
        }
        String str = (String) obj;
        if (str != null) {
            if (!AnonymousClass14B.A0F(str)) {
                try {
                    JSONArray jSONArray = new JSONArray(this.A06.A09(1940));
                    int i = 0;
                    while (true) {
                        if (i >= jSONArray.length()) {
                            break;
                        } else if (str.equalsIgnoreCase(jSONArray.getString(i))) {
                            z2 = false;
                            break;
                        } else {
                            i++;
                        }
                    }
                } catch (JSONException unused) {
                    Log.e("PaymentsUtils failed to parse json in abprop");
                }
            }
            z2 = true;
            if (z2) {
                return str;
            }
        }
        if (z) {
            return r5.A0F();
        }
        return r5.A0G();
    }

    public static String A08(C202319lY r5, AnonymousClass1FR r6) {
        boolean A0M = r6.A00.A0M(r5.A0D);
        C19630wG r0 = r6.A04;
        if (A0M) {
            return r0.A00.getString(R.string.f12nameremoved);
        }
        return r0.A00.getString(R.string.f12nameremoved, new Object[]{r6.A0R(r5)});
    }

    public static String A09(AnonymousClass1FR r9, String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, long j) {
        int i12 = i9;
        long j2 = j;
        if (j <= 0) {
            return r9.A04.A00.getString(i, new Object[]{str});
        }
        int A002 = AnonymousClass6XI.A00(C19970wo.A00(r9.A03), j2);
        if (A002 == 0) {
            return r9.A04.A00.getString(i2, new Object[]{str});
        } else if (A002 == 1) {
            return r9.A04.A00.getString(i3, new Object[]{str});
        } else if (A002 < 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j2);
            switch (instance.get(7)) {
                case 1:
                    i12 = i10;
                    break;
                case 2:
                    i12 = i4;
                    break;
                case 3:
                    i12 = i5;
                    break;
                case 4:
                    i12 = i6;
                    break;
                case 5:
                    i12 = i7;
                    break;
                case 6:
                    i12 = i8;
                    break;
                case 7:
                    break;
                default:
                    i12 = 0;
                    break;
            }
            return r9.A04.A00.getString(i12, new Object[]{str});
        } else {
            return r9.A04.A00.getString(i11, new Object[]{str, C20040wv.A03(r9.A05, j2)});
        }
    }

    public static boolean A0B(C20810yC r2, C207199ui r3) {
        if (!C20800yB.A01(C21000yV.A02, r2, 6710) || r3 == null || !"quick_pay".equals(r3.A09.A08)) {
            return false;
        }
        return true;
    }

    public int A0C(C202319lY r4) {
        int i = r4.A02;
        if (i == 0) {
            return 0;
        }
        switch (i) {
            case 11:
                return R.string.f12nameremoved;
            case 12:
            case 20:
                return R.string.f12nameremoved;
            case 13:
            case 14:
                return R.string.f12nameremoved;
            case 15:
                return R.string.f12nameremoved;
            case 16:
                return R.string.f12nameremoved;
            case 17:
                return R.string.f12nameremoved;
            case 18:
                return R.string.f12nameremoved;
            case 19:
                if (r4.A03 == 10) {
                    return R.string.f12nameremoved;
                }
                return R.string.f12nameremoved;
            default:
                switch (i) {
                    case 101:
                    case 103:
                    case 104:
                    case 109:
                    case 113:
                    case 114:
                        return R.string.f12nameremoved;
                    case 102:
                    case 110:
                    case 115:
                        return R.string.f12nameremoved;
                    case 105:
                    case C65953Uc.A03 /*108*/:
                    case 111:
                        return R.string.f12nameremoved;
                    case 106:
                        return R.string.f12nameremoved;
                    case 107:
                        return R.string.f12nameremoved;
                    case 112:
                        return R.string.f12nameremoved;
                    default:
                        switch (i) {
                            case 401:
                            case 403:
                            case 410:
                            case 420:
                                return R.string.f12nameremoved;
                            case 402:
                            case 419:
                            case 425:
                                return R.string.f12nameremoved;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 422:
                            case 423:
                            case 424:
                                return R.string.f12nameremoved;
                            case 405:
                                return R.string.f12nameremoved;
                            case 415:
                            case 421:
                                return R.string.f12nameremoved;
                            case 416:
                                return R.string.f12nameremoved;
                            case 417:
                                return this.A09.A05().BGz(r4);
                            case 418:
                                return R.string.f12nameremoved;
                            default:
                                switch (i) {
                                    case 601:
                                    case 602:
                                        return R.string.f12nameremoved;
                                    case 603:
                                        return R.string.f12nameremoved;
                                    case 604:
                                        return R.string.f12nameremoved;
                                    case 605:
                                        return R.string.f12nameremoved;
                                    case 606:
                                        return R.string.f12nameremoved;
                                    case 607:
                                        return R.string.f12nameremoved;
                                    case 608:
                                        return R.string.f12nameremoved;
                                    default:
                                        switch (i) {
                                            case 701:
                                                return R.string.f12nameremoved;
                                            case 702:
                                                return R.string.f12nameremoved;
                                            case 703:
                                                return R.string.f12nameremoved;
                                            case 704:
                                                return R.string.f12nameremoved;
                                            case 705:
                                                return R.string.f12nameremoved;
                                            default:
                                                switch (i) {
                                                    case 801:
                                                    case 803:
                                                        return R.string.f12nameremoved;
                                                    case 802:
                                                    case 804:
                                                        return R.string.f12nameremoved;
                                                    default:
                                                        switch (i) {
                                                            case 901:
                                                            case 905:
                                                                return R.string.f12nameremoved;
                                                            case 902:
                                                            case 904:
                                                            case 906:
                                                            case 908:
                                                                return R.string.f12nameremoved;
                                                            case 903:
                                                                return R.string.f12nameremoved;
                                                            case 907:
                                                                return R.string.f12nameremoved;
                                                            default:
                                                                return R.string.f12nameremoved;
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public int A0E(C207009uP r4) {
        if ("pending".equals(r4.A01) && "PAYMENT_REQUEST".equals(r4.A08)) {
            C20810yC r2 = this.A08.A02;
            C21000yV r1 = C21000yV.A02;
            if (C20800yB.A01(r1, r2, 5575) || C20800yB.A01(r1, r2, 5574)) {
                return 7;
            }
        }
        return C207199ui.A00(r4.A01);
    }

    public Pair A0G(long j) {
        Integer valueOf;
        C18820ts r1;
        int i;
        if (j <= 0) {
            return null;
        }
        int i2 = (int) (j / 86400000);
        if (i2 > 0) {
            valueOf = Integer.valueOf(i2);
            r1 = this.A05;
            i = 3;
        } else {
            i2 = (int) (j / 3600000);
            if (i2 > 0) {
                valueOf = Integer.valueOf(i2);
                r1 = this.A05;
                i = 2;
            } else {
                i2 = (int) (j / 60000);
                if (i2 <= 0) {
                    return null;
                }
                valueOf = Integer.valueOf(i2);
                r1 = this.A05;
                i = 1;
            }
        }
        return new Pair(valueOf, AnonymousClass3UY.A03(r1, i2, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        if (r6.A08.A0J(r7.A0E, r7.A0L) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C188098z2 A0I(X.C207199ui r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x000f
            X.1EV r2 = r6.A08
            java.lang.String r1 = r7.A0E
            java.util.List r0 = r7.A0L
            boolean r0 = r2.A0J(r1, r0)
            r5 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            X.1EU r1 = r6.A09
            java.lang.String r0 = "p2p_context"
            X.1EY r0 = r1.A02(r0)
            X.1Ea r1 = r0.A03()
            if (r1 == 0) goto L_0x0038
            java.lang.String r0 = "unset"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "tos_with_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003b
        L_0x0038:
            X.8z2 r0 = X.C188098z2.TOS_NONE
            return r0
        L_0x003b:
            X.1Db r4 = r6.A07
            android.content.SharedPreferences r1 = r4.A03()
            java.lang.String r0 = "pref_p2m_hybrid_tos_accepted"
            r3 = 0
            boolean r2 = r1.getBoolean(r0, r3)
            if (r5 == 0) goto L_0x005b
            android.content.SharedPreferences r1 = r4.A03()
            java.lang.String r0 = "pref_p2m_hybrid_v2_tos_accepted"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0038
            if (r2 == 0) goto L_0x0060
            X.8z2 r0 = X.C188098z2.TOS_V2
            return r0
        L_0x005b:
            if (r2 != 0) goto L_0x0038
            X.8z2 r0 = X.C188098z2.TOS_V1
            return r0
        L_0x0060:
            X.8z2 r0 = X.C188098z2.TOS_ALL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0I(X.9ui):X.8z2");
    }

    public C36811lL A0K(Context context, C202159l8 r3, int i, int i2) {
        if (r3 == null || r3.A02() == null) {
            return null;
        }
        return A0J(context, r3.A02(), i, i2);
    }

    public Long A0L(C202319lY r5) {
        C175708av r0 = r5.A0A;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(r0.A09() - C19970wo.A00(this.A03));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r1 != 200) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0O(X.C202319lY r22) {
        /*
            r21 = this;
            r9 = r21
            X.1Dc r3 = r9.A0F
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "getStatusChangeNotifStringWithoutMessage status:"
            r1.append(r0)
            r2 = r22
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.A06(r0)
            X.16X r0 = r2.A08
            r6 = 1
            if (r0 != 0) goto L_0x00b4
            r15 = 1
        L_0x002c:
            X.16X r0 = r2.A08
            if (r0 != 0) goto L_0x00af
            X.0wG r0 = r9.A04
            android.content.Context r1 = r0.A00
            r0 = 2131895201(0x7f1223a1, float:1.9425228E38)
            java.lang.String r5 = r1.getString(r0)
        L_0x003b:
            int r1 = r2.A03
            r8 = 0
            if (r1 == r6) goto L_0x00f7
            r7 = 2
            if (r1 == r7) goto L_0x00d6
            r0 = 9
            if (r1 == r0) goto L_0x00bc
            r0 = 10
            java.lang.String r3 = ""
            if (r1 == r0) goto L_0x0079
            r0 = 20
            if (r1 == r0) goto L_0x005a
            r0 = 100
            if (r1 == r0) goto L_0x00f7
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00d6
        L_0x0059:
            return r3
        L_0x005a:
            int r1 = r2.A02
            r0 = 12
            if (r1 != r0) goto L_0x0059
            X.1EU r1 = r9.A09
            X.B66 r0 = r1.A05()
            X.9RR r0 = r0.B9r()
            if (r0 == 0) goto L_0x0059
            X.B66 r0 = r1.A05()
            X.9RR r0 = r0.B9r()
            java.lang.String r0 = r0.A00(r2, r5)
            return r0
        L_0x0079:
            int r1 = r2.A02
            r0 = 13
            if (r1 == r0) goto L_0x00a7
            r0 = 14
            if (r1 == r0) goto L_0x00a7
            r0 = 16
            if (r1 != r0) goto L_0x009b
            X.0wG r0 = r9.A04
            android.content.Context r4 = r0.A00
            r3 = 2131892515(0x7f121923, float:1.941978E38)
        L_0x008e:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r9.A0U(r2)
            r1[r8] = r0
            java.lang.String r0 = r4.getString(r3, r1)
            return r0
        L_0x009b:
            r0 = 15
            if (r1 != r0) goto L_0x0059
            X.0wG r0 = r9.A04
            android.content.Context r4 = r0.A00
            r3 = 2131892517(0x7f121925, float:1.9419785E38)
            goto L_0x008e
        L_0x00a7:
            X.0wG r0 = r9.A04
            android.content.Context r4 = r0.A00
            r3 = 2131892516(0x7f121924, float:1.9419782E38)
            goto L_0x008e
        L_0x00af:
            java.lang.String r5 = r9.A0P(r2)
            goto L_0x003b
        L_0x00b4:
            java.math.BigDecimal r0 = r0.A00
            int r15 = r0.intValue()
            goto L_0x002c
        L_0x00bc:
            X.0wG r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131755282(0x7f100112, float:1.9141439E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r9.A0U(r2)
            r1[r8] = r0
            r1[r6] = r5
            java.lang.String r0 = r4.getQuantityString(r3, r15, r1)
            return r0
        L_0x00d6:
            X.0wG r0 = r9.A04
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131755279(0x7f10010f, float:1.9141433E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A0U(r2)
            r1[r8] = r0
            r1[r6] = r5
            java.lang.String r0 = r9.A0R(r2)
            r1[r7] = r0
            java.lang.String r0 = r4.getQuantityString(r3, r15, r1)
            return r0
        L_0x00f7:
            java.lang.String r10 = r9.A0R(r2)
            java.lang.String r11 = r9.A0U(r2)
            int r13 = r2.A02
            X.8av r0 = r2.A0A
            if (r0 != 0) goto L_0x0117
            r14 = 0
        L_0x0106:
            r16 = 0
            long r0 = r2.A06
            java.lang.String r12 = r9.A0P(r2)
            r20 = 1
            r18 = r0
            java.lang.String r0 = r9.A0b(r10, r11, r12, r13, r14, r15, r16, r18, r20)
            return r0
        L_0x0117:
            int r14 = r0.A08()
            goto L_0x0106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0O(X.9lY):java.lang.String");
    }

    public String A0X(C23083B3q b3q, AnonymousClass3T1 r9) {
        Context context;
        int i;
        String str;
        long j;
        Context context2;
        int i2;
        if (!C203419nz.A06(r9.A0M)) {
            C202319lY r3 = r9.A0M;
            int i3 = r3.A02;
            if (i3 != 12) {
                if (i3 != 102) {
                    if (i3 != 105) {
                        if (i3 != 402) {
                            if (i3 == 406 || i3 == 407) {
                                String str2 = r3.A0J;
                                if (!(str2 == null || b3q == null)) {
                                    int A002 = AnonymousClass6R8.A00(str2, -1);
                                    if (b3q.BNT(A002) || b3q.BM7(A002) || b3q.BMB(A002)) {
                                        context2 = this.A04.A00;
                                        i2 = R.string.f12nameremoved;
                                    } else if (b3q.BM6(A002)) {
                                        int BFg = this.A09.A05().BFg();
                                        Context context3 = this.A04.A00;
                                        return context3.getString(R.string.f12nameremoved, new Object[]{context3.getString(BFg)});
                                    } else if (b3q.BM5(A002)) {
                                        context2 = this.A04.A00;
                                        i2 = R.string.f12nameremoved;
                                    } else if (b3q.BMP(A002)) {
                                        int BFg2 = this.A09.A05().BFg();
                                        Context context4 = this.A04.A00;
                                        return context4.getString(R.string.f12nameremoved, new Object[]{context4.getString(BFg2)});
                                    }
                                    return b3q.BBd(context2.getString(i2), A002);
                                }
                            } else {
                                if (i3 != 420) {
                                    if (i3 != 421) {
                                        switch (i3) {
                                            case C65953Uc.A03 /*108*/:
                                                break;
                                            case 109:
                                                context = this.A04.A00;
                                                i = R.string.f12nameremoved;
                                                break;
                                            case 110:
                                                context = this.A04.A00;
                                                i = R.string.f12nameremoved;
                                                break;
                                            case 111:
                                                context = this.A04.A00;
                                                i = R.string.f12nameremoved;
                                                break;
                                            case 112:
                                                break;
                                        }
                                    }
                                    context = this.A04.A00;
                                    i = R.string.f12nameremoved;
                                } else {
                                    context = this.A04.A00;
                                    i = R.string.f12nameremoved;
                                }
                                return context.getString(i);
                            }
                        }
                    }
                    String str3 = r3.A0J;
                    if (!(str3 == null || b3q == null || !b3q.BMr(AnonymousClass6R8.A00(str3, -1)))) {
                        context = this.A04.A00;
                        i = R.string.f12nameremoved;
                        return context.getString(i);
                    }
                }
                Long A0L = A0L(r3);
                if (A0L == null) {
                    return "";
                }
                j = A0L.longValue();
                str = A0M(j);
            } else {
                int i4 = r3.A03;
                if (i4 == 10 || i4 == 20) {
                    Long A0L2 = A0L(r3);
                    if (A0L2 == null) {
                        return "";
                    }
                    j = A0L2.longValue();
                    Pair A0G = A0G(j);
                    if (A0G == null) {
                        str = null;
                    } else {
                        str = (String) A0G.second;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, 1, new Object[]{str});
            }
            int i5 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            context = this.A04.A00;
            i = R.string.f12nameremoved;
            if (i5 > 0) {
                i = R.string.f12nameremoved;
            }
            return context.getString(i);
        }
        return null;
    }

    public String A0b(String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z) {
        int i4;
        Object[] objArr;
        int i5 = i;
        long j3 = j;
        if (z) {
            String str4 = str;
            if (i5 == 406 || i5 == 407 || i5 == 412) {
                return A09(this, str4, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, j3);
            }
            if (i5 == 408 || i5 == 404 || i5 == 411) {
                return A09(this, str4, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, j2);
            }
            if (i5 == 409) {
                int i6 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                Context context = this.A04.A00;
                if (i6 > 0) {
                    i4 = R.string.f12nameremoved;
                    objArr = new Object[]{str, context.getString(R.string.f12nameremoved, new Object[]{C20040wv.A05(this.A05, j3)})};
                } else {
                    i4 = R.string.f12nameremoved;
                    objArr = new Object[]{str};
                }
                return context.getString(i4, objArr);
            } else if (i5 == 421) {
                return this.A04.A00.getString(R.string.f12nameremoved, new Object[]{str, str3});
            }
        } else {
            String str5 = str2;
            if (i5 == 102) {
                return this.A04.A00.getResources().getQuantityString(R.plurals.f10nameremoved, i3, new Object[]{str2, str3});
            } else if (i5 == 106) {
                int i7 = i2;
                if (i7 == 104 || i7 == 103 || i7 == 102) {
                    return A09(this, str5, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, j3);
                }
            } else if (i5 == 420) {
                return this.A04.A00.getString(R.string.f12nameremoved);
            } else {
                if (i5 == 112) {
                    return this.A04.A00.getString(R.string.f12nameremoved, new Object[]{str2, str3});
                }
            }
        }
        return "";
    }

    public HashSet A0c(C207199ui r7, AnonymousClass3T1 r8) {
        int i;
        HashSet hashSet = new HashSet();
        List<C206929uE> list = r7.A0J;
        if (list != null) {
            for (C206929uE r0 : list) {
                if ("payment_instruction".equals(r0.A01)) {
                    hashSet.add(2);
                }
            }
        }
        List<C206909uC> list2 = r7.A0L;
        if (list2 != null && list2.size() > 0) {
            for (C206909uC r2 : list2) {
                String str = r2.A01;
                if ("pix_static_code".equals(str) || "pix_dynamic_code".equals(str)) {
                    i = 6;
                } else if ("cards".equals(str) && ((C21331AHj) r2.A00).A02) {
                    i = 0;
                }
                hashSet.add(i);
            }
        }
        String A052 = r7.A05();
        if (!hashSet.contains(0) && !TextUtils.isEmpty(A052)) {
            AnonymousClass11F r1 = r8.A1J.A00;
            if ((r1 instanceof UserJid) && this.A0A.A04((UserJid) r1)) {
                hashSet.add(0);
            }
        }
        return hashSet;
    }

    public boolean A0d(Context context, UserJid userJid, int i) {
        if (this.A00.A0L() || i == 0) {
            return false;
        }
        if (userJid != null) {
            AnonymousClass185 r0 = this.A0A;
            AnonymousClass3L0 A012 = r0.A01(userJid);
            if (r0.A04(userJid)) {
                return false;
            }
            if (A012 != null && A012.A02() && C202159l8.A0F == this.A0D.A02()) {
                return C20800yB.A01(C21000yV.A02, this.A06, 5415);
            }
        }
        AnonymousClass16U A013 = this.A0D.A01();
        if (A013 == null || TextUtils.isEmpty(((AnonymousClass16W) A013).BAV(context, 0))) {
            return false;
        }
        return true;
    }

    public boolean A0e(C202319lY r4) {
        if (r4.A03 == 1 && r4.A02 == 402 && this.A00.A0M(r4.A0E)) {
            return true;
        }
        return false;
    }

    public boolean A0f(C202319lY r6, AnonymousClass9jA r7, C23083B3q b3q, int i) {
        int i2;
        int A002 = AnonymousClass6R8.A00(r6.A0J, -1);
        int i3 = r6.A03;
        if (i3 != 1 && i3 != 100) {
            return false;
        }
        C175708av r0 = r6.A0A;
        if ((r0 != null && r0.A02 != null && (!this.A08.A0B() || r7 == null)) || !this.A00.A0M(r6.A0E) || !r6.A0G() || (i2 = r6.A02) == 419 || i2 == 420 || i2 == 409) {
            return false;
        }
        if (i2 != 405) {
            if (i2 == 407 || i2 == 0) {
                return false;
            }
        } else if (r6.A03 != 1) {
            return false;
        } else {
            if (!C20800yB.A01(C21000yV.A02, this.A08.A02, 2381) || i != 1) {
                return false;
            }
        }
        if (A002 == 441 || A002 == 410 || A002 == 11455 || A002 == 2826008) {
            return false;
        }
        if (b3q == null || b3q.BtV(A002)) {
            return true;
        }
        return false;
    }

    public boolean A0g(C202319lY r4, C207199ui r5) {
        if (this.A08.A0I(r5.A0E)) {
            if (r4 == null || !r4.A0G()) {
                return false;
            }
        } else if (!TextUtils.isEmpty(r5.A06) || (!TextUtils.isEmpty(r5.A04) && !"pending_buyer_confirmation".equals(r5.A05))) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public boolean A0k(C207199ui r3) {
        C19730wQ r0 = this.A00;
        r0.A0G();
        if (!"BR".equals(AnonymousClass1EV.A00(r0.A03))) {
            return false;
        }
        if (r3.A06 != null && r3.A00 == 405) {
            return true;
        }
        String str = r3.A05;
        if ("captured".equals(str) || "pending".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean A0l(C207199ui r4) {
        C206979uM r1;
        if (!C20800yB.A01(C21000yV.A02, this.A06, 6012) || (r1 = r4.A0B) == null || r4.A02 == null) {
            return false;
        }
        if (r4.A02.A02.A00.compareTo(r4.A03(r1).A02.A00) < 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass1FR(C19730wQ r4, AnonymousClass16D r5, AnonymousClass185 r6, AnonymousClass171 r7, C19970wo r8, C19630wG r9, C18820ts r10, AnonymousClass17X r11, AnonymousClass16T r12, C20810yC r13, C24601Db r14, C24631De r15, AnonymousClass1EV r16, AnonymousClass1EU r17, C24641Df r18) {
        this.A04 = r9;
        this.A03 = r8;
        this.A06 = r13;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r7;
        this.A05 = r10;
        this.A09 = r17;
        this.A07 = r14;
        this.A0A = r6;
        this.A08 = r16;
        this.A0E = r18;
        this.A0C = r12;
        this.A0D = r15;
        this.A0B = r11;
    }

    public static CharSequence A01(Context context, C202319lY r3) {
        AnonymousClass16U A032 = r3.A03();
        if (A032 != AnonymousClass16W.A06) {
            return A032.BAV(context, r3.A0K() ? 1 : 0);
        }
        return "";
    }

    public static void A0A(Context context, CharSequence charSequence, int i) {
        String string = context.getString(R.string.f12nameremoved);
        AlertDialog.Builder builder = new AlertDialog.Builder(context, i);
        builder.setMessage(charSequence);
        if (string != null) {
            builder.setPositiveButton(string, (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (r2 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0H(X.C202319lY r9) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A0S(r9)
            java.lang.String r6 = r8.A0T(r9)
            X.0ts r0 = r8.A05
            java.lang.String r1 = r0.A06()
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r1)
            X.0wQ r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r9.A0D
            boolean r0 = r1.A0M(r0)
            r5 = 0
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0039
            if (r2 != 0) goto L_0x0039
            X.0wG r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131892524(0x7f12192c, float:1.9419799E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
        L_0x002f:
            java.lang.String r1 = r2.getString(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            return r0
        L_0x0039:
            com.whatsapp.jid.UserJid r0 = r9.A0E
            boolean r0 = r1.A0M(r0)
            if (r0 == 0) goto L_0x004f
            if (r2 != 0) goto L_0x0051
            X.0wG r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131892523(0x7f12192b, float:1.9419797E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            goto L_0x002f
        L_0x004f:
            if (r2 == 0) goto L_0x0052
        L_0x0051:
            r3 = r6
        L_0x0052:
            X.0wG r0 = r8.A04
            android.content.Context r2 = r0.A00
            r1 = 2131892522(0x7f12192a, float:1.9419795E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r6
            r0[r4] = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FR.A0H(X.9lY):android.util.Pair");
    }

    public C36811lL A0J(Context context, AnonymousClass16U r7, int i, int i2) {
        int color = context.getResources().getColor(i);
        return new C36811lL(C015006m.A03(context, R.font.payment_icons_regular), ((AnonymousClass16W) r7).BAV(context, 0), color, context.getResources().getDimensionPixelSize(i2));
    }

    public String A0M(long j) {
        int i = 2;
        if (j <= 86400000) {
            i = 1;
        }
        return A05(j, i);
    }

    public String A0P(C202319lY r4) {
        if (C203419nz.A06(r4) || TextUtils.isEmpty(r4.A0I) || r4.A08 == null) {
            return "";
        }
        return r4.A03().B7d(this.A05, r4.A08);
    }

    public String A0Y(C207199ui r6) {
        String str;
        if (r6.A05() != null) {
            str = r6.A05();
        } else {
            str = "";
        }
        AnonymousClass1EV r2 = this.A08;
        String str2 = r6.A0E;
        List list = r6.A0L;
        if (r2.A0J(str2, list) && list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C206909uC r22 = (C206909uC) it.next();
                if ("payment_gateway".equals(r22.A01)) {
                    C21332AHk aHk = (C21332AHk) r22.A00;
                    if (aHk != null) {
                        String str3 = aHk.A00;
                        if (!TextUtils.isEmpty(str3)) {
                            return str3;
                        }
                    }
                }
            }
        }
        return str;
    }

    public String A0a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            if (split.length == 2) {
                AnonymousClass16U A012 = this.A0C.A01(split[0]);
                try {
                    return A012.B7d(this.A05, new AnonymousClass16X(new BigDecimal(split[1]).movePointLeft(3), ((AnonymousClass16V) A012).A01));
                } catch (NumberFormatException unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public boolean A0j(UserJid userJid, UserJid userJid2, String str) {
        String A022 = AnonymousClass3SI.A02(AnonymousClass3U8.A07(userJid));
        String A023 = AnonymousClass3SI.A02(AnonymousClass3U8.A07(userJid2));
        if (A022 == null || A023 == null || !A022.equals(str) || !A022.equals(A023)) {
            return false;
        }
        return true;
    }
}
