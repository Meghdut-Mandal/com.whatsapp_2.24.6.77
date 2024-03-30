package com.whatsapp.jobqueue.job.messagejob;

import X.AnonymousClass1M0;
import X.AnonymousClass3T1;
import X.C202859mm;
import X.C20650xu;
import X.C224114e;
import X.C224214g;
import X.C36351kA;
import X.C36371kC;
import X.C64203Nb;
import android.content.ContentValues;
import android.content.Context;

public final class AsyncMessageTokenizationJob extends AsyncMessageJob {
    public static final long serialVersionUID = 1;
    public transient C20650xu A00;

    public String A0F() {
        return "asyncTokenize";
    }

    public AsyncMessageTokenizationJob(AnonymousClass3T1 r5) {
        super(r5.A1N, r5.A1O);
    }

    public /* bridge */ /* synthetic */ Object A0E(AnonymousClass3T1 r4) {
        C224214g r2 = new C224214g("ftsMessageStore/backgroundTokenize");
        String A01 = C202859mm.A01(this.A00.A04, this.A00.A0G(r4));
        r2.A01();
        return A01;
    }

    public /* bridge */ /* synthetic */ void A0G(AnonymousClass3T1 r22, Object obj) {
        String str = (String) obj;
        C20650xu r3 = this.A00;
        long A09 = r3.A09();
        C64203Nb r15 = new C64203Nb(1, this.sortId, this.rowId);
        AnonymousClass1M0 A05 = r3.A0C.A05();
        try {
            ContentValues contentValues = new ContentValues(1);
            contentValues.put("content", str);
            C224114e r9 = A05.A02;
            String[] strArr = new String[1];
            C36351kA.A1V(strArr, 0, r15.A02);
            r9.A01(contentValues, "message_ftsv2", "docid = ?", "UPDATE_FTS_TEXT", strArr);
            A05.close();
            if (A09 == 1) {
                C20650xu.A00(r15, r3, str);
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public void Bqf(Context context) {
        super.Bqf(context);
        this.A00 = (C20650xu) C36371kC.A0P(context).A3Z.get();
    }
}
