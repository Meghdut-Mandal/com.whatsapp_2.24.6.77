package X;

import android.content.ContentValues;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3sI  reason: invalid class name and case insensitive filesystem */
public final class C78553sI implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    public void BmI(AnonymousClass3T1 r9, C52942qQ r10) {
        AnonymousClass141 A08;
        String A0K;
        Class<C78553sI> cls = C78553sI.class;
        AnonymousClass00C.A0D(r9, 0);
        if (AnonymousClass000.A1S(r9.A0A & ZipDecompressor.UNZIP_BUFFER_SIZE, ZipDecompressor.UNZIP_BUFFER_SIZE)) {
            AnonymousClass1TV r1 = (AnonymousClass1TV) this.A01.get();
            AnonymousClass16D r3 = (AnonymousClass16D) this.A00.get();
            C80113ur r6 = r9.A0b;
            if (r6 == null) {
                r6 = new C80113ur();
            }
            AnonymousClass1M0 A05 = r1.A02.A05();
            try {
                ContentValues A0E = C36441kJ.A0E();
                C36341k9.A0p(A0E, "message_row_id", r9.A1N);
                C36341k9.A0o(A0E, "host_storage", r6.hostStorage);
                C36341k9.A0o(A0E, "actual_actors", r6.actualActors);
                C36341k9.A0p(A0E, "privacy_mode_ts", r6.privacyModeTs);
                if (r9.A0E == 3 && r9.A16 && (A08 = r3.A08(r9.A0L())) != null && (A0K = A08.A0K()) != null) {
                    A0E.put("business_name", A0K);
                    r9.A0o = A0K;
                }
                A05.A02.A08("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", A0E, 5);
                A05.close();
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        } else {
            C64933Qa r12 = r9.A1J;
            AnonymousClass11F r32 = r12.A00;
            if (!(r32 instanceof UserJid)) {
                return;
            }
            if ((r12.A02 || r9.A1Y) && r9.A1I != 7 && r9.A0D != 6) {
                AnonymousClass1TV r2 = (AnonymousClass1TV) this.A01.get();
                AnonymousClass3L0 A02 = r2.A00.A02(C36401kF.A0b(r32));
                if (A02 != null && A02.A01()) {
                    AnonymousClass1M0 A052 = r2.A02.A05();
                    try {
                        ContentValues A0E2 = C36441kJ.A0E();
                        C36341k9.A0p(A0E2, "message_row_id", r9.A1N);
                        C36341k9.A0o(A0E2, "host_storage", A02.A01);
                        C36341k9.A0o(A0E2, "actual_actors", A02.A00);
                        C36341k9.A0p(A0E2, "privacy_mode_ts", A02.A04);
                        A052.A02.A08("message_privacy_state", "INSERT_PRIVACY_STATE_INFO", A0E2, 5);
                    } finally {
                        th = th;
                        A052.close();
                    }
                }
            } else {
                return;
            }
        }
        if (r10 != null) {
            throw C36321k7.A04(cls);
        }
    }

    public C78553sI(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
