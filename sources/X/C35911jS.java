package X;

import android.os.ConditionVariable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.1jS  reason: invalid class name and case insensitive filesystem */
public class C35911jS extends C50502l1 {
    public C35911jS(C16490pK r10, String str) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r2.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:push"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        ConditionVariable conditionVariable = C18740tg.A00;
        r2.A06(((C592133b) r10).A00);
        this.A00 = r2.A03();
    }

    public C35911jS(AnonymousClass147 r11, AnonymousClass147 r12, String str) {
        AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
        r3.A04(new AnonymousClass1AL("xmlns", "w:g2"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        if (C203539oF.A0N(r11, "to")) {
            r3.A04(new AnonymousClass1AL((Jid) r11, "to"));
        }
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        AnonymousClass6QB r2 = new AnonymousClass6QB("sub_group_suggestions");
        if (C203539oF.A0N(r12, "sub_group_suggestions->sub_group_jid")) {
            r2.A04(new AnonymousClass1AL((Jid) r12, "sub_group_jid"));
        }
        r3.A05(r2.A03());
        this.A00 = r3.A03();
    }

    public C35911jS(AnonymousClass147 r10, C35891jQ r11, C35891jQ r12, C35891jQ r13, String str) {
        AnonymousClass6QB r1 = new AnonymousClass6QB("iq");
        r1.A04(new AnonymousClass1AL("xmlns", "w:g2"));
        r1.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0N(r10, "to")) {
            r1.A04(new AnonymousClass1AL((Jid) r10, "to"));
        }
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r1.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        AnonymousClass6QB r2 = new AnonymousClass6QB("sub_group_suggestions_action");
        if (r11 != null) {
            r2.A05(r11.A00);
        }
        if (r12 != null) {
            r2.A05(r12.A00);
        }
        if (r13 != null) {
            r2.A05(r13.A00);
        }
        r1.A05(r2.A03());
        this.A00 = r1.A03();
    }

    public C35911jS(AnonymousClass147 r10, String str) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL("xmlns", "w:g2"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        if (C203539oF.A0N(r10, "to")) {
            r2.A04(new AnonymousClass1AL((Jid) r10, "to"));
        }
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r2.A05(new AnonymousClass6QB("linked_groups_participants").A03());
        this.A00 = r2.A03();
    }

    public C35911jS(C35891jQ r13, C107455Pa r14, String str, byte[] bArr, int i) {
        AnonymousClass6QB r5 = new AnonymousClass6QB("iq");
        r5.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r5.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r5.A05(r13.A00);
        AnonymousClass6QB r4 = new AnonymousClass6QB("l3");
        byte[] bArr2 = bArr;
        C203539oF.A0I(bArr2, 1, 1024);
        r4.A01 = bArr2;
        r5.A05(r4.A03());
        this.A00 = r5.A03();
    }

    public C35911jS(C35891jQ r13, C107465Pb r14, String str, byte[] bArr, int i) {
        AnonymousClass6QB r5 = new AnonymousClass6QB("iq");
        r5.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r5.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r5.A05(r13.A00);
        AnonymousClass6QB r4 = new AnonymousClass6QB("reg_payload");
        byte[] bArr2 = bArr;
        C203539oF.A0I(bArr2, 1, 1024);
        r4.A01 = bArr2;
        r5.A05(r4.A03());
        this.A00 = r5.A03();
    }

    public C35911jS(C35891jQ r10, C107475Pc r11, Long l, String str, int i) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r2.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r2.A05(r10.A00);
        r2.A05(new AnonymousClass6QB("init_login").A03());
        this.A00 = r2.A03();
    }

    public C35911jS(C35891jQ r10, C107485Pd r11, Long l, String str, int i) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r2.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r2.A05(r10.A00);
        r2.A05(new AnonymousClass6QB("init_reg").A03());
        this.A00 = r2.A03();
    }

    public C35911jS(C35891jQ r14, Long l, String str) {
        AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
        r3.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        String str2 = str;
        if (C203539oF.A0P(str2, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2));
        }
        r3.A05(r14.A00);
        AnonymousClass6QB r6 = new AnonymousClass6QB("migration_urgency");
        if (C203539oF.A0L(l, 1, 5, false)) {
            r6.A04(new AnonymousClass1AL("value", l.longValue()));
        }
        r3.A05(r6.A03());
        this.A00 = r3.A03();
    }

    public C35911jS(C35891jQ r10, String str) {
        AnonymousClass6QB r2 = new AnonymousClass6QB("iq");
        r2.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r2.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r2.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r2.A05(r10.A00);
        r2.A05(new AnonymousClass6QB("delete").A03());
        this.A00 = r2.A03();
    }

    public C35911jS(C35891jQ r13, String str, byte[] bArr) {
        AnonymousClass6QB r5 = new AnonymousClass6QB("iq");
        r5.A04(new AnonymousClass1AL("xmlns", "vesta"));
        r5.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r5.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        r5.A05(r13.A00);
        AnonymousClass6QB r4 = new AnonymousClass6QB("r1");
        C203539oF.A0I(bArr, 1, 1024);
        r4.A01 = bArr;
        r5.A05(r4.A03());
        this.A00 = r5.A03();
    }

    public C35911jS(String str, int i) {
        String str2;
        AnonymousClass6QB r0;
        C203399nx A03;
        String str3 = str;
        switch (i) {
            case 0:
                r0 = new AnonymousClass6QB("iq");
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                str2 = "email";
                break;
            case 4:
                r0 = new AnonymousClass6QB("iq");
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "bot"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                str2 = "add_to_waitlist";
                break;
            case 5:
                r0 = new AnonymousClass6QB("iq");
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "bot"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                str2 = "user_state";
                break;
            case 6:
                AnonymousClass6QB r4 = new AnonymousClass6QB("iq");
                r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                r4.A04(new AnonymousClass1AL("xmlns", "w:interop"));
                r4.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r4.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                AnonymousClass6QB r3 = new AnonymousClass6QB("integrator");
                r3.A04(new AnonymousClass1AL("fetch", "all"));
                r4.A05(r3.A03());
                A03 = r4.A03();
                break;
            case 12:
                r0 = new AnonymousClass6QB("iq");
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "offline:pull"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                str2 = "notifications";
                break;
            default:
                AnonymousClass6QB r32 = new AnonymousClass6QB("iq");
                r32.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                r32.A04(new AnonymousClass1AL("xmlns", "w:p"));
                r32.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r32.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
                }
                A03 = r32.A03();
                break;
        }
        r0.A05(new AnonymousClass6QB(str2).A03());
        A03 = r0.A03();
        this.A00 = A03;
    }

    public C35911jS(String str, Long l) {
        AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r3.A04(new AnonymousClass1AL("xmlns", "tos"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        AnonymousClass6QB r6 = new AnonymousClass6QB("notice");
        if (C203539oF.A0L(l, 0, 9007199254740991L, false)) {
            r6.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, l.longValue()));
        }
        r6.A04(new AnonymousClass1AL("stage", 5));
        r3.A05(r6.A03());
        this.A00 = r3.A03();
    }

    public C35911jS(String str, String str2, int i) {
        AnonymousClass6QB r0;
        long j;
        long j2;
        AnonymousClass6QB r4;
        AnonymousClass6QB r3;
        C203399nx A03;
        String str3 = str;
        String str4 = str2;
        switch (i) {
            case 2:
                r0 = new AnonymousClass6QB("iq");
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
                }
                r4 = new AnonymousClass6QB("email");
                r3 = new AnonymousClass6QB("email_address");
                j = 320;
                j2 = 0;
                break;
            case 3:
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
                }
                r4 = new AnonymousClass6QB("verify_email");
                r3 = new AnonymousClass6QB("code");
                j2 = 6;
                j = 6;
                break;
            default:
                r0.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:push"));
                r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
                r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
                if (C203539oF.A0P(str3, 0, 9007199254740991L, false)) {
                    r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
                }
                AnonymousClass6QB r32 = new AnonymousClass6QB("pn");
                if (C203539oF.A0P(str4, 0, 300, false)) {
                    r32.A07(str4);
                }
                A03 = r32.A03();
                break;
        }
        if (C203539oF.A0P(str4, j2, j, false)) {
            r3.A07(str4);
        }
        r4.A05(r3.A03());
        A03 = r4.A03();
        r0.A05(A03);
        this.A00 = r0.A03();
    }

    public C35911jS(String str, String str2, String str3) {
        AnonymousClass6QB r0 = new AnonymousClass6QB("iq");
        r0.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        r0.A04(new AnonymousClass1AL("xmlns", "urn:xmpp:whatsapp:account"));
        r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r0.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        AnonymousClass6QB r3 = new AnonymousClass6QB("verify_email");
        AnonymousClass6QB r4 = new AnonymousClass6QB("lg");
        if (C203539oF.A0P(str2, 2, 3, false)) {
            r4.A07(str2);
        }
        r3.A05(r4.A03());
        AnonymousClass6QB r42 = new AnonymousClass6QB("lc");
        if (C203539oF.A0P(str3, 2, 3, false)) {
            r42.A07(str3);
        }
        r3.A05(r42.A03());
        r0.A05(r3.A03());
        this.A00 = r0.A03();
    }

    public C35911jS(String str, byte[] bArr) {
        AnonymousClass6QB r3 = new AnonymousClass6QB("iq");
        r3.A04(new AnonymousClass1AL("xmlns", "privatestats"));
        r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"));
        r3.A04(new AnonymousClass1AL((Jid) C177588e2.A00, "to"));
        if (C203539oF.A0P(str, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1AL(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str));
        }
        AnonymousClass6QB r4 = new AnonymousClass6QB("sign_credential");
        r4.A04(new AnonymousClass1AL("version", "1"));
        AnonymousClass6QB r2 = new AnonymousClass6QB("blinded_credential");
        C203539oF.A0I(bArr, 32, 32);
        r2.A01 = bArr;
        r4.A05(r2.A03());
        r3.A05(r4.A03());
        this.A00 = r3.A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01b0, code lost:
        r1 = r7.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01b4, code lost:
        r0.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b7, code lost:
        r13.A00 = r0.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35911jS(java.util.List r14, int r15, java.lang.String r16) {
        /*
            r13 = this;
            r13.<init>()
            java.lang.String r3 = "iq"
            X.6QB r0 = new X.6QB
            r6 = r16
            switch(r15) {
                case 7: goto L_0x006c;
                case 8: goto L_0x00d2;
                case 16: goto L_0x014b;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0.<init>(r3)
            X.8e2 r5 = X.C177588e2.A00
            java.lang.String r4 = "to"
            X.1AL r3 = new X.1AL
            r3.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r4)
            r0.A04(r3)
            java.lang.String r5 = "xmlns"
            java.lang.String r4 = "tos"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            java.lang.String r5 = "type"
            java.lang.String r4 = "get"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            r11 = 0
            r7 = 0
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r3 = X.C203539oF.A0P(r6, r7, r9, r11)
            if (r3 == 0) goto L_0x004b
            java.lang.String r4 = "id"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (java.lang.String) r6)
            r0.A04(r3)
        L_0x004b:
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            boolean r3 = X.C203539oF.A0Y(r14, r7, r3)
            if (r3 == 0) goto L_0x01b7
            java.util.Iterator r3 = r14.iterator()
        L_0x005a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01b7
            java.lang.Object r1 = r3.next()
            X.33b r1 = (X.C592133b) r1
            X.9nx r1 = r1.A00
            r0.A05(r1)
            goto L_0x005a
        L_0x006c:
            r0.<init>(r3)
            java.lang.String r5 = "type"
            java.lang.String r4 = "get"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            java.lang.String r5 = "xmlns"
            java.lang.String r4 = "w:interop"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            X.8e2 r5 = X.C177588e2.A00
            java.lang.String r4 = "to"
            X.1AL r3 = new X.1AL
            r3.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r4)
            r0.A04(r3)
            r11 = 0
            r7 = 0
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r3 = X.C203539oF.A0P(r6, r7, r9, r11)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r4 = "id"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (java.lang.String) r6)
            r0.A04(r3)
        L_0x00ab:
            java.lang.String r3 = "users"
            X.6QB r7 = new X.6QB
            r7.<init>(r3)
            r5 = 1
            r3 = 256(0x100, double:1.265E-321)
            boolean r3 = X.C203539oF.A0Y(r14, r5, r3)
            if (r3 == 0) goto L_0x01b0
            java.util.Iterator r3 = r14.iterator()
        L_0x00c0:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01b0
            java.lang.Object r1 = r3.next()
            X.33b r1 = (X.C592133b) r1
            X.9nx r1 = r1.A00
            r7.A05(r1)
            goto L_0x00c0
        L_0x00d2:
            r0.<init>(r3)
            java.lang.String r5 = "type"
            java.lang.String r4 = "set"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            java.lang.String r5 = "xmlns"
            java.lang.String r4 = "w:interop"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            X.8e2 r5 = X.C177588e2.A00
            java.lang.String r4 = "to"
            X.1AL r3 = new X.1AL
            r3.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r4)
            r0.A04(r3)
            r11 = 0
            r7 = 0
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r3 = X.C203539oF.A0P(r6, r7, r9, r11)
            if (r3 == 0) goto L_0x0111
            java.lang.String r4 = "id"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (java.lang.String) r6)
            r0.A04(r3)
        L_0x0111:
            java.lang.String r3 = "opt_in_integrators"
            X.6QB r8 = new X.6QB
            r8.<init>(r3)
            java.lang.String r3 = "integrator_list"
            X.6QB r7 = new X.6QB
            r7.<init>(r3)
            r5 = 0
            r3 = 999(0x3e7, double:4.936E-321)
            boolean r3 = X.C203539oF.A0Y(r14, r5, r3)
            if (r3 == 0) goto L_0x013f
            java.util.Iterator r3 = r14.iterator()
        L_0x012d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x013f
            java.lang.Object r1 = r3.next()
            X.33b r1 = (X.C592133b) r1
            X.9nx r1 = r1.A00
            r7.A05(r1)
            goto L_0x012d
        L_0x013f:
            X.9nx r1 = r7.A03()
            r8.A05(r1)
            X.9nx r1 = r8.A03()
            goto L_0x01b4
        L_0x014b:
            r0.<init>(r3)
            java.lang.String r5 = "xmlns"
            java.lang.String r4 = "w:comms"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            X.8e2 r5 = X.C177588e2.A00
            java.lang.String r4 = "to"
            X.1AL r3 = new X.1AL
            r3.<init>((com.whatsapp.jid.Jid) r5, (java.lang.String) r4)
            r0.A04(r3)
            java.lang.String r5 = "type"
            java.lang.String r4 = "get"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r5, (java.lang.String) r4)
            r0.A04(r3)
            r12 = 0
            r8 = 0
            r10 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r7 = r6
            boolean r3 = X.C203539oF.A0P(r7, r8, r10, r12)
            if (r3 == 0) goto L_0x018b
            java.lang.String r4 = "id"
            X.1AL r3 = new X.1AL
            r3.<init>((java.lang.String) r4, (java.lang.String) r6)
            r0.A04(r3)
        L_0x018b:
            java.lang.String r3 = "get_promotions"
            X.6QB r7 = new X.6QB
            r7.<init>(r3)
            r3 = 10
            boolean r3 = X.C203539oF.A0Y(r14, r8, r3)
            if (r3 == 0) goto L_0x01b0
            java.util.Iterator r3 = r14.iterator()
        L_0x019e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01b0
            java.lang.Object r1 = r3.next()
            X.33b r1 = (X.C592133b) r1
            X.9nx r1 = r1.A00
            r7.A05(r1)
            goto L_0x019e
        L_0x01b0:
            X.9nx r1 = r7.A03()
        L_0x01b4:
            r0.A05(r1)
        L_0x01b7:
            X.9nx r0 = r0.A03()
            r13.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35911jS.<init>(java.util.List, int, java.lang.String):void");
    }
}
