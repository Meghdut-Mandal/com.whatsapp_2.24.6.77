package X;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.whatsapp.registration.directmigration.MigrationRequesterBroadcastReceiver;
import java.io.File;
import java.io.Serializable;

/* renamed from: X.2iV  reason: invalid class name and case insensitive filesystem */
public class C49062iV extends C132446Tt {
    public final AnonymousClass1QD A00;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass1QD r3 = this.A00;
        AnonymousClass12P r0 = r3.A02;
        r0.A06();
        long length = r0.A03.length();
        AnonymousClass1B5 r7 = r3.A03;
        C224214g r6 = new C224214g(false);
        File databasePath = r7.A01.A00.getDatabasePath("stickers.db");
        AnonymousClass00C.A08(databasePath);
        long A002 = AnonymousClass6YY.A00((C02680Bk) null, r7.A00.A00.A0G()) + 0 + databasePath.length();
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StickerDBStorage/getStickerFilesSize: took = ");
        A0u.append(r6.A01());
        C36321k7.A1V(" ms for total file size of = ", A0u, A002);
        Context context = r3.A00.A00;
        return C36441kJ.A0Q(Long.valueOf(((A002 + length) * 3) + C36441kJ.A0w(context.getFilesDir(), "wallpaper.jpg").length() + context.getDatabasePath("chatsettings.db").length() + 10000000), Long.valueOf(length));
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        AnonymousClass1QD r4 = this.A00;
        C36321k7.A1Q("InterAppCommunicationManager/sendProviderToRequesterBroadcast/action = ", "com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction", AnonymousClass000.A0u());
        Intent A0D = C36431kI.A0D();
        C36421kH.A0o(A0D, "com.whatsapp.w4b", MigrationRequesterBroadcastReceiver.class.getName());
        A0D.addFlags(32);
        A0D.setAction("com.whatsapp.registration.directmigration.providerAppMigrationSpaceNeededAction");
        if (pair != null) {
            A0D.putExtra("extra_min_storage_needed", (Serializable) pair.first);
            A0D.putExtra("extra_msg_db_size", (Serializable) pair.second);
        }
        r4.A00.A00.sendBroadcast(A0D, "com.whatsapp.permission.REGISTRATION");
    }

    public C49062iV(AnonymousClass1QD r1) {
        this.A00 = r1;
    }
}
