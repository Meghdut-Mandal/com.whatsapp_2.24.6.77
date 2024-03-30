package X;

import android.os.Parcelable;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;

/* renamed from: X.18h  reason: invalid class name and case insensitive filesystem */
public final class C233918h {
    public final C19700wN A00;
    public final C234018i A01;
    public final C234118j A02;
    public final C20810yC A03;
    public final AnonymousClass18M A04;
    public final C21010yW A05;

    public C233918h(C19700wN r2, AnonymousClass18M r3, C234018i r4, C234118j r5, C20810yC r6, C21010yW r7) {
        AnonymousClass00C.A0D(r6, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r7, 3);
        AnonymousClass00C.A0D(r3, 4);
        AnonymousClass00C.A0D(r4, 5);
        AnonymousClass00C.A0D(r5, 6);
        this.A03 = r6;
        this.A00 = r2;
        this.A05 = r7;
        this.A04 = r3;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final Long A00(AnonymousClass6EZ r9, int i) {
        Long l;
        String str;
        if (!C20800yB.A01(C21000yV.A02, this.A03, 6542)) {
            return null;
        }
        String str2 = r9.A02;
        AnonymousClass00C.A08(str2);
        int i2 = r9.A01;
        if (i2 == 0) {
            try {
                C234118j r2 = this.A02;
                Parcelable.Creator creator = PhoneUserJid.CREATOR;
                C223313w A09 = r2.A00.A09(C222913s.A00(str2));
                if (A09 != null) {
                    str = A09.user;
                } else {
                    str = null;
                }
                if (str == null) {
                    AnonymousClass2NG r1 = new AnonymousClass2NG();
                    r1.A00 = Integer.valueOf(i);
                    this.A05.Bly(r1);
                    return null;
                }
                l = C54072sM.A00(str);
                if (l == null) {
                    C19700wN r12 = this.A00;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DB source: ");
                    sb.append(i);
                    r12.A0E("AxolotlLidJidMigrationUtils/getLidNumberFromSignalAddress: invalid LID", sb.toString(), true);
                    return l;
                }
            } catch (C19740wR unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid user jid address: ");
                sb2.append(str2);
                Log.e(sb2.toString());
                C19700wN r22 = this.A00;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("invalid JID : ");
                sb3.append(str2);
                r22.A0E("AxolotlLidJidMigrationUtils/getLidNumberFromSignalAddress", sb3.toString(), true);
                return null;
            }
        } else if (i2 != 1) {
            return null;
        } else {
            l = C54072sM.A00(str2);
            if (l == null) {
                C19700wN r13 = this.A00;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("DB source: ");
                sb4.append(i);
                r13.A0E("AxolotlLidJidMigrationUtils/getLidNumberFromSignalAddress: invalid LID", sb4.toString(), true);
            }
        }
        return l;
    }
}
