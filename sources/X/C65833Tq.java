package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.report.ReportActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Tq  reason: invalid class name and case insensitive filesystem */
public class C65833Tq implements C236119d {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C65833Tq(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public void BVN(String str) {
        switch (this.A03) {
            case 0:
                C36321k7.A1Q("GroupXmppMethods/sendGetGroupInfoByCode/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                C36321k7.A0R((C170888Hw) this.A01, "sendGetGroupInfoByCode IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
            case 1:
                ((C79593ty) this.A02).A0D(C52912qN.A00);
                return;
            case 2:
                C36321k7.A1Q("GdprXmppMethods/sendRequestGdprReport/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                C36321k7.A0R((C170888Hw) this.A01, "XMPP IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
            default:
                C36321k7.A1Q("GdprXmppMethods/sendGetGdprReport/onDeliveryFailure; iq=", str, AnonymousClass000.A0u());
                C36321k7.A0R((C170888Hw) this.A01, "XMPP IQ was not delivered: iq=", str, AnonymousClass000.A0u());
                return;
        }
    }

    public void BWw(C203399nx r8, String str) {
        C52552pc r1;
        C20350xQ r12;
        int i;
        switch (this.A03) {
            case 0:
                C589631s r13 = (C589631s) this.A02;
                int A002 = AnonymousClass3ME.A00(r8);
                if (A002 == 401) {
                    r12 = r13.A00.A03;
                    i = 2019;
                } else if (A002 != 403) {
                    r12 = r13.A00.A03;
                    i = 2021;
                    if (A002 != 404) {
                        i = 2018;
                    }
                } else {
                    r12 = r13.A00.A03;
                    i = 2020;
                }
                r12.A0T(i, (Object) null);
                ((C170888Hw) this.A01).A04((Object) null);
                return;
            case 1:
                AnonymousClass00C.A0D(r8, 1);
                int A0R = r8.A0d("error").A0R("code");
                C79593ty r5 = (C79593ty) this.A02;
                C52552pc[] values = C52552pc.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        r1 = values[i2];
                        if (r1.code != A0R) {
                            i2++;
                        }
                    } else {
                        r1 = C52552pc.A03;
                    }
                }
                r5.A0D(new C52872qJ(r1));
                return;
            case 2:
                int A003 = AnonymousClass3ME.A00(r8);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("GdprXmppMethods/sendRequestGdprReport/onError; iq=");
                A0u.append(str);
                C36321k7.A1T(", error=", A0u, A003);
                AnonymousClass3MN r2 = (AnonymousClass3MN) ((AnonymousClass4TV) this.A02);
                int i3 = r2.A02;
                StringBuilder A0u2 = AnonymousClass000.A0u();
                if (i3 == 0) {
                    C36321k7.A1S("AutoReportScheduler/sendReportRequestForType error ", A0u2, A003);
                    break;
                } else {
                    C36321k7.A1S("send-request-gdpr-report/failed/error ", A0u2, A003);
                    C225314u r22 = (C225314u) r2.A00;
                    C81153wY.A00(r22.A05, r22, 33);
                    break;
                }
            default:
                int A004 = AnonymousClass3ME.A00(r8);
                StringBuilder A0u3 = AnonymousClass000.A0u();
                A0u3.append("GdprXmppMethods/sendGetGdprReport/onError; iq=");
                A0u3.append(str);
                C36321k7.A1T(", errorCode=", A0u3, A004);
                AnonymousClass35S r14 = (AnonymousClass35S) this.A02;
                if (A004 != 404) {
                    C36321k7.A1S("send-get-gdpr-report/failed/error ", AnonymousClass000.A0u(), A004);
                    break;
                } else {
                    C74173lB r23 = r14.A01;
                    if (r23.A04() == C52472pU.REQUESTED) {
                        r23.A08();
                        break;
                    }
                }
                break;
        }
        C36381kD.A1J(this.A01);
    }

    public void BiM(C203399nx r15, String str) {
        C52412pO r1;
        long j;
        C19420v0 r0;
        long j2;
        SharedPreferences.Editor A002;
        String str2;
        C19420v0 r02;
        int i;
        String str3 = str;
        switch (this.A03) {
            case 0:
                HashMap A0J = AnonymousClass001.A0J();
                HashMap A0J2 = AnonymousClass001.A0J();
                AnonymousClass3R9.A02(r15, "admin", A0J, A0J2);
                C589631s r6 = (C589631s) this.A02;
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("modify-admins/");
                C50012k3 r9 = r6.A00;
                A0u.append(r9.A05);
                C36321k7.A1a(A0u, C36341k9.A0h(A0u, A0J, A0J2));
                if (!A0J2.isEmpty()) {
                    StringBuilder A0u2 = AnonymousClass000.A0u();
                    Activity A0D = C36441kJ.A0D(r9.A06);
                    if (A0D != null && !A0D.isFinishing()) {
                        Iterator A10 = C36371kC.A10(A0J2);
                        while (A10.hasNext()) {
                            Map.Entry A11 = AnonymousClass000.A11(A10);
                            AnonymousClass11F r3 = (AnonymousClass11F) A11.getKey();
                            StringBuilder A0u3 = AnonymousClass000.A0u();
                            A0u3.append("modify-admins/error/");
                            A0u3.append(r3);
                            A0u3.append("/");
                            C36331k8.A1P(A11.getValue(), A0u3);
                            int A0I = AnonymousClass000.A0I(A11.getValue());
                            AnonymousClass141 A0D2 = r9.A01.A0D(r3);
                            boolean contains = r9.A08.contains(r3);
                            if (A0I != 404) {
                                if (A0I == 406) {
                                    i = R.string.f12nameremoved;
                                } else if (A0I == 419) {
                                    i = R.string.f12nameremoved;
                                }
                                Object[] objArr = new Object[1];
                                C36361kB.A1F(r9.A02, A0D2, objArr, 0);
                                A0u2.append(A0D.getString(i, objArr));
                                A0u2.append("\n");
                            }
                            i = R.string.f12nameremoved;
                            if (contains) {
                                i = R.string.f12nameremoved;
                            }
                            Object[] objArr2 = new Object[1];
                            C36361kB.A1F(r9.A02, A0D2, objArr2, 0);
                            A0u2.append(A0D.getString(i, objArr2));
                            A0u2.append("\n");
                        }
                        r9.A00.A0H(new C80293vA(r6, A0u2, 5));
                        break;
                    }
                }
                break;
            case 1:
                AnonymousClass00C.A0D(r15, 1);
                boolean A0J3 = AnonymousClass00C.A0J(r15.A0Y(GroupJid.class, "from"), this.A00);
                C18740tg.A0D(A0J3, "Group Jid in request and response don't match.");
                if (!A0J3) {
                    ((C79593ty) this.A02).A0D(C52902qM.A00);
                    return;
                }
                C203399nx A0d = r15.A0d("cancel_membership_requests").A0d("participant");
                boolean A0J4 = AnonymousClass00C.A0J(A0d.A0Y(UserJid.class, "jid"), this.A01);
                C18740tg.A0D(A0J4, "Requester Jid in request and response don't match.");
                if (!A0J4) {
                    ((C79593ty) this.A02).A0D(C52902qM.A00);
                }
                String A0x = C36391kE.A0x(A0d, "error");
                if (A0x == null) {
                    ((C79593ty) this.A02).A0C(AnonymousClass0AJ.A00);
                    return;
                }
                C79593ty r62 = (C79593ty) this.A02;
                int parseInt = Integer.parseInt(A0x);
                C52412pO[] values = C52412pO.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        r1 = values[i2];
                        if (r1.code != parseInt) {
                            i2++;
                        }
                    } else {
                        r1 = C52412pO.DEFAULT;
                    }
                }
                r62.A0D(new C52882qK(r1));
                return;
            case 2:
                C36321k7.A1Q("GdprXmppMethods/sendRequestGdprReport/onSuccess; iq=", str3, AnonymousClass000.A0u());
                C203399nx A0c = r15.A0c("gdpr");
                long j3 = 0;
                if (A0c != null) {
                    j3 = 1000 * A0c.A0V("timestamp", 0);
                }
                AnonymousClass3MN r63 = (AnonymousClass3MN) ((AnonymousClass4TV) this.A02);
                if (r63.A02 != 0) {
                    Object obj = r63.A01;
                    j = 1000;
                    if (obj != C51622o7.ACCOUNT) {
                        if (obj == C51622o7.NEWSLETTER) {
                            ReportActivity reportActivity = (ReportActivity) r63.A00;
                            ((C74173lB) reportActivity.A0I.get()).A0D(j3);
                            r0 = reportActivity.A09;
                            j2 = j3 / j;
                            A002 = C19420v0.A00(r0);
                            str2 = "automatic_channels_report_requested_ts_sec";
                            C36341k9.A0w(A002, str2, j2);
                            break;
                        }
                    } else {
                        ReportActivity reportActivity2 = (ReportActivity) r63.A00;
                        ((C74173lB) reportActivity2.A0H.get()).A0D(j3);
                        r02 = reportActivity2.A09;
                    }
                } else {
                    Object obj2 = r63.A00;
                    j = 1000;
                    if (obj2 == C51622o7.ACCOUNT) {
                        C62633Gx r12 = (C62633Gx) r63.A01;
                        r12.A03.A0D(j3);
                        r02 = r12.A01;
                    } else if (obj2 == C51622o7.NEWSLETTER) {
                        C62633Gx r13 = (C62633Gx) r63.A01;
                        r13.A04.A0D(j3);
                        r0 = r13.A01;
                        j2 = j3 / j;
                        A002 = C19420v0.A00(r0);
                        str2 = "automatic_channels_report_requested_ts_sec";
                        C36341k9.A0w(A002, str2, j2);
                    }
                }
                j2 = j3 / j;
                A002 = C19420v0.A00(r02);
                str2 = "automatic_account_report_requested_ts_sec";
                C36341k9.A0w(A002, str2, j2);
                break;
            default:
                C36321k7.A1Q("GdprXmppMethods/sendGetGdprReport/onSuccess; iq=", str3, AnonymousClass000.A0u());
                C203399nx A0c2 = r15.A0c("gdpr");
                if (A0c2 != null) {
                    C203399nx A0c3 = A0c2.A0c("document");
                    if (A0c3 == null) {
                        ((AnonymousClass35S) this.A02).A01.A0D(A0c2.A0V("timestamp", 0) * 1000);
                        break;
                    } else {
                        long A0V = A0c3.A0V("creation", 0) * 1000;
                        byte[] bArr = A0c3.A01;
                        long A0V2 = A0c3.A0V("expiration", (C19970wo.A00(((AnonymousClass3DN) this.A00).A00) + 2592000000L) / 1000) * 1000;
                        C74173lB r8 = ((AnonymousClass35S) this.A02).A01;
                        if (r8.A04().value < C52472pU.DOWNLOADED.value) {
                            r8.A0F(bArr, A0V, A0V2);
                            break;
                        }
                    }
                } else {
                    C36321k7.A1Q("GdprXmppMethods/sendGetGdprReport/onSuccess; no GDPR node, iq=", str3, AnonymousClass000.A0u());
                    C36321k7.A1S("send-get-gdpr-report/failed/error ", AnonymousClass000.A0u(), 0);
                    ((C170888Hw) this.A01).A05(new C235919b(AnonymousClass000.A0p("Invalid response from server for GDPR report request: iq=", str3, AnonymousClass000.A0u())));
                    return;
                }
                break;
        }
        C36381kD.A1J(this.A01);
    }
}
