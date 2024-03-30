package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3vn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80683vn implements Runnable {
    public final /* synthetic */ C220712t A00;
    public final /* synthetic */ C52152oy A01;
    public final /* synthetic */ AnonymousClass11F A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public /* synthetic */ C80683vn(C220712t r1, C52152oy r2, AnonymousClass11F r3, Runnable runnable, String str, boolean z) {
        this.A00 = r1;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = runnable;
        this.A05 = z;
        this.A01 = r2;
    }

    public final void run() {
        ContentValues contentValues;
        C220712t r0 = this.A00;
        AnonymousClass11F r1 = this.A02;
        String str = this.A04;
        Runnable runnable = this.A03;
        boolean z = this.A05;
        C52152oy r9 = this.A01;
        AnonymousClass005 r52 = r0.A01;
        AnonymousClass163 r7 = ((C24731Do) r52.get()).A0C;
        C220412q r5 = r7.A00;
        if (C36371kC.A0W(r5, r1) != null) {
            Log.w("msgstore/createchat/already exists");
            return;
        }
        C65073Qp r02 = new C65073Qp(r1);
        if (z) {
            r02.A0F = -1;
        }
        if (!(r1 instanceof C28981Uw)) {
            r02.A00 = 1;
        } else {
            long j = r02.A0W;
            long j2 = r02.A0X;
            C52382pL r18 = C52382pL.GUEST;
            C52162oz r22 = C52162oz.PUBLIC;
            C52182p1 r24 = C52182p1.NOT_VERIFIED;
            C52272pA r21 = C52272pA.UNKNOWN_VERIFICATION_SOURCE;
            ArrayList A0I = AnonymousClass001.A0I();
            C52282pB r23 = C52282pB.NOT_ENFORCED;
            C65073Qp r17 = r02;
            C44072La r15 = new C44072La((C23931Ak) null, r17, r18, C52452pS.DEFAULT, C52392pM.DEFAULT, r21, r22, r23, r24, (Long) null, r02.A0h, (String) null, (String) null, (String) null, (String) null, (String) null, A0I, 0, 1, j, 0, 0, 0, 0, j2, 0, true, false, false);
            r02 = r15;
            r15.A00 = 0;
        }
        r5.A0I(r02, r1);
        r02.A04 = 1;
        r02.A0B = -1;
        r02.A0C = -1;
        r02.A0X = System.currentTimeMillis();
        r02.A0h = str;
        if (r02.A0Z == null) {
            r02.A0Z = r9;
        }
        C219712j r6 = r7.A02;
        synchronized (r02) {
            contentValues = new ContentValues(8);
            C36341k9.A0p(contentValues, "jid_row_id", r6.A07(r02.A0q));
            contentValues.put("subject", r02.A0h);
            C36341k9.A0o(contentValues, "plaintext_disabled", r02.A00);
            C36341k9.A0o(contentValues, "vcard_ui_dismissed", r02.A0B);
            C36341k9.A0p(contentValues, "change_number_notified_message_row_id", r02.A0C);
            C36341k9.A0p(contentValues, "sort_timestamp", r02.A0X);
            C36341k9.A0o(contentValues, "spam_detection", 1);
        }
        long A07 = r7.A07(contentValues);
        if (A07 == -1) {
            C36321k7.A1J(r1, "msgstore/addchat/insert/failed gid=", AnonymousClass000.A0u());
        } else {
            r02.A0W = A07;
        }
        if (runnable != null) {
            runnable.run();
        }
        AnonymousClass1DP r4 = ((C24731Do) r52.get()).A0B;
        r4.A00.Bp3(new C35681j5(r4, r1, 42));
    }
}
