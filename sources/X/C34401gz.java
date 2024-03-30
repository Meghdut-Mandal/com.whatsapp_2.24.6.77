package X;

import android.content.Context;
import android.view.View;
import com.whatsapp.conversationslist.ViewHolder;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.1gz  reason: invalid class name and case insensitive filesystem */
public class C34401gz implements C28251Rx {
    public final Context A00;
    public final C19460v5 A01;
    public final C20230xE A02;

    public /* synthetic */ void B2q() {
    }

    public /* synthetic */ void BTj(ViewHolder viewHolder, AnonymousClass3T1 r2) {
    }

    public /* synthetic */ Set BHD() {
        return new HashSet();
    }

    public void BTh(ViewHolder viewHolder, AnonymousClass11F r4, int i) {
        this.A02.Bl2(this.A00, r4, i);
    }

    public void BTi(View view, ViewHolder viewHolder, ViewHolder viewHolder2, AnonymousClass11F r6, int i, int i2) {
        this.A02.Bl2(this.A00, r6, i2);
    }

    public void BTm(AnonymousClass146 r2) {
        Log.e("CommunityHomeActivity/pending group in search results");
    }

    public boolean BaP(ViewHolder viewHolder, ViewHolder viewHolder2, AnonymousClass11F r5, int i) {
        this.A02.Bl2(this.A00, r5, i);
        return true;
    }

    public C34401gz(Context context, C19460v5 r2, C20230xE r3) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
    }

    public /* synthetic */ AnonymousClass11F BCP() {
        return null;
    }

    public /* synthetic */ View.OnCreateContextMenuListener BEe() {
        return null;
    }

    public List BFy() {
        return Collections.emptyList();
    }

    public /* synthetic */ boolean BLN(AnonymousClass11F r2) {
        return false;
    }

    public /* synthetic */ boolean Bnh(Jid jid) {
        return false;
    }
}
