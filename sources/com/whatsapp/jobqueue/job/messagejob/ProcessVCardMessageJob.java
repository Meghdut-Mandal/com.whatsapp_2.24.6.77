package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass11F;
import X.AnonymousClass12P;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass1M0;
import X.AnonymousClass1YI;
import X.AnonymousClass2bW;
import X.AnonymousClass363;
import X.AnonymousClass3RN;
import X.AnonymousClass3T1;
import X.C108695Un;
import X.C1495671s;
import X.C18800tq;
import X.C18820ts;
import X.C18830tt;
import X.C19630wG;
import X.C20650xu;
import X.C21060yb;
import X.C224114e;
import X.C25071Ew;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36441kJ;
import X.C607439e;
import X.C65033Ql;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;

public class ProcessVCardMessageJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass16D A00;
    public transient C21060yb A01;
    public transient C19630wG A02;
    public transient C18820ts A03;
    public transient C20650xu A04;
    public transient C25071Ew A05;
    public transient AnonymousClass1YI A06;

    public String A0F() {
        return "processVCard";
    }

    public ProcessVCardMessageJob(AnonymousClass3T1 r5) {
        super(r5.A1N, r5.A1O);
    }

    public /* bridge */ /* synthetic */ Object A0E(AnonymousClass3T1 r7) {
        List A022 = AnonymousClass3RN.A02(r7, this.A06);
        if (A022 != null) {
            try {
                return new C65033Ql(this.A00, this.A01, this.A02, this.A03).A01(A022);
            } catch (Exception e) {
                Log.e("processvcard/error constructing contacts", new C108695Un(e));
            }
        }
        return Collections.emptyList();
    }

    public /* bridge */ /* synthetic */ void A0G(AnonymousClass3T1 r19, Object obj) {
        AnonymousClass11F A0L;
        Throwable th;
        Cursor A09;
        long j;
        List<AnonymousClass363> list = (List) obj;
        AnonymousClass3T1 r11 = r19;
        if (r11 instanceof AnonymousClass2bW) {
            ((AnonymousClass2bW) r11).A01 = list;
        }
        this.A04.A0K(r11);
        C25071Ew r10 = this.A05;
        if (r11.A1J.A02) {
            A0L = C36441kJ.A0n(r10.A00);
        } else {
            A0L = r11.A0L();
        }
        if (A0L != null) {
            AnonymousClass141 A08 = r10.A01.A08(A0L);
            if (r10.A00.A0M(A0L) || !(A08 == null || A08.A0F == null)) {
                AnonymousClass12P r9 = r10.A07;
                AnonymousClass1M0 A052 = r9.A05();
                try {
                    C1495671s B1k = A052.B1k();
                    try {
                        for (AnonymousClass363 r8 : list) {
                            long j2 = r11.A1N;
                            String str = r8.A00;
                            AnonymousClass1M0 A042 = r9.get();
                            try {
                                C224114e r3 = A042.A02;
                                String[] A1S = C36441kJ.A1S();
                                C36401kF.A1T(A1S, 0, j2);
                                A1S[1] = str;
                                A09 = r3.A09("SELECT _id FROM message_vcard WHERE message_row_id = ? AND vcard = ?", "GET_VCARD_ROW_ID_BY_VCARD", A1S);
                                if (A09.moveToFirst()) {
                                    j = C36351kA.A07(A09, "_id");
                                    A09.close();
                                    A042.close();
                                } else {
                                    A09.close();
                                    A042.close();
                                    j = -1;
                                }
                                List<C607439e> list2 = r8.A01.A06;
                                if (list2 != null) {
                                    AnonymousClass1M0 A053 = r9.A05();
                                    try {
                                        B1k = A053.B1k();
                                        for (C607439e r12 : list2) {
                                            if (r12.A01 != null) {
                                                ContentValues contentValues = new ContentValues(3);
                                                C36341k9.A0p(contentValues, "vcard_jid_row_id", r10.A05.A07(r12.A01));
                                                C36341k9.A0p(contentValues, "vcard_row_id", j);
                                                C36341k9.A0p(contentValues, "message_row_id", j2);
                                                A053.A02.A04("message_vcard_jid", "INSERT_VCARD_JID_SQL", contentValues);
                                            }
                                        }
                                        B1k.A00();
                                        B1k.close();
                                        A053.close();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            A053.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                A042.close();
                                throw th;
                            }
                        }
                        B1k.A00();
                        B1k.close();
                        A052.close();
                        return;
                    } finally {
                        B1k.close();
                    }
                } catch (Throwable th5) {
                    try {
                        A052.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    public void Bqf(Context context) {
        super.Bqf(context);
        C18800tq A0P = C36371kC.A0P(context);
        this.A02 = C36351kA.A0W(A0P);
        this.A06 = (AnonymousClass1YI) A0P.A8s.get();
        this.A00 = C36341k9.A0R(A0P);
        this.A01 = C36351kA.A0U(A0P);
        this.A03 = A0P.BxU();
        this.A04 = C18830tt.A4m(A0P.AfI.A00);
        this.A05 = (C25071Ew) A0P.A8t.get();
    }
}
