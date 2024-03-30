package X;

import com.whatsapp.jid.UserJid;
import java.io.File;
import java.util.Map;

/* renamed from: X.6qP  reason: invalid class name and case insensitive filesystem */
public class C143356qP implements C158087fm {
    public Map A00 = AnonymousClass001.A0J();
    public final AnonymousClass17Y A01;
    public final AnonymousClass1L1 A02;
    public final AnonymousClass6MZ A03;
    public final C1033054t A04;
    public final C19770wU A05;
    public final C131616Pt A06;
    public final AnonymousClass1L4 A07;
    public final C18820ts A08;

    public void Blq(AnonymousClass67W r10, C134906bn r11, String str, String str2, String str3) {
        String A0F;
        AnonymousClass00C.A0D(str, 0);
        this.A00 = C131866Qy.A01(str2);
        AnonymousClass6MZ r2 = this.A03;
        AnonymousClass5OH r4 = new AnonymousClass5OH(r2, str, (String) null);
        if (r11 != null) {
            String str4 = (String) this.A06.A01(r4, r11.A01);
            AnonymousClass00C.A0B(r4);
            r4.A00();
            if (str4 != null) {
                r10.A01(str4);
                return;
            }
        }
        C131576Pp A002 = A00(str);
        if (A002 != null) {
            C1033054t r5 = this.A04;
            AnonymousClass1L4 r6 = this.A07;
            String A003 = C110475aj.A00(A002, r6);
            File A022 = r5.A02(AnonymousClass000.A0p("commerce_flow_", A003, C36401kF.A0t(A003, 0)));
            if (A022 != null) {
                File[] listFiles = A022.listFiles();
                if (listFiles == null) {
                    listFiles = new File[0];
                }
                if (!(listFiles.length == 0 || (A0F = r5.A0F(C110475aj.A00(A002, r6))) == null)) {
                    r10.A01(A0F);
                    if (r11 != null) {
                        this.A06.A02(new AnonymousClass5OH(r2, str, (String) null), new AnonymousClass6S9((Object) A0F, r11.A00, r11.A02), r11.A01);
                        return;
                    }
                    return;
                }
            }
            this.A01.Bp3(new C1502774q(A002, this, r10, r11, str, 10));
            return;
        }
        this.A02.A04(new C1262863h(r10, r11, this, str));
    }

    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C131576Pp A00(java.lang.String r11) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.AnonymousClass5OM
            if (r0 == 0) goto L_0x0057
            java.util.Map r2 = r10.A00
            r1 = 0
            java.lang.String r0 = "flow_version_id"
            java.lang.String r0 = X.C90464aC.A0a(r0, r2)
            long r8 = java.lang.Long.parseLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            if (r0 == 0) goto L_0x005d
            X.1L1 r7 = r10.A02
            X.5kt r0 = r7.A03()
            if (r0 == 0) goto L_0x0050
            java.util.List r0 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass001.A0I()
            java.util.Iterator r5 = r0.iterator()
        L_0x0029:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0052
            java.lang.Object r4 = r5.next()
            r3 = r4
            X.6Pp r3 = (X.C131576Pp) r3
            java.lang.Long r0 = r3.A02
            if (r0 == 0) goto L_0x0029
            long r1 = r0.longValue()
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r3.A08
            java.lang.String r0 = "android"
            boolean r0 = X.AnonymousClass00C.A0J(r1, r0)
            if (r0 == 0) goto L_0x0029
            r6.add(r4)
            goto L_0x0029
        L_0x0050:
            X.09w r6 = X.C023409w.A00
        L_0x0052:
            X.6Pp r1 = X.AnonymousClass1L1.A00(r7, r6)
            return r1
        L_0x0057:
            X.1L1 r0 = r10.A02
            X.6Pp r1 = r0.A02(r11)
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143356qP.A00(java.lang.String):X.6Pp");
    }

    public void A01(int i) {
        String str;
        String str2;
        if (this instanceof AnonymousClass5OM) {
            AnonymousClass5OM r4 = (AnonymousClass5OM) this;
            C122865vY r1 = r4.A00;
            Object obj = r4.A00.get("flow_id");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            UserJid A022 = UserJid.Companion.A02(C90464aC.A0Z("chat_jid", r4.A00));
            String A0Z = C90464aC.A0Z("message_id", r4.A00);
            String A0Z2 = C90464aC.A0Z("session_id", r4.A00);
            if (r1.A00.A09()) {
                str2 = "extensions-layout-fetch-failed-error";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "extensions-layout-fetch-failed-verification-error";
                    } else if (i == 4) {
                        str2 = "extensions-layout-fetch-failed-storing-error";
                    }
                }
            } else {
                str2 = "extensions-layout-fetch-failed-network-error";
            }
            r1.A02.A02(r1.A01, r1.A03, A022, (Boolean) null, "galaxy_message", str, A0Z, A0Z2, str2, (String) null);
        }
    }

    public C143356qP(AnonymousClass17Y r2, AnonymousClass1L1 r3, AnonymousClass6MZ r4, C1033054t r5, C18820ts r6, C19770wU r7, C131616Pt r8, AnonymousClass1L4 r9) {
        C36321k7.A1B(r8, r2, r7, r4, r6);
        C36321k7.A10(r3, r9);
        this.A06 = r8;
        this.A01 = r2;
        this.A05 = r7;
        this.A03 = r4;
        this.A08 = r6;
        this.A02 = r3;
        this.A07 = r9;
        this.A04 = r5;
    }
}
