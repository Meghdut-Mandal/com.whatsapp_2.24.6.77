package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.2it  reason: invalid class name and case insensitive filesystem */
public class C49302it extends C132446Tt {
    public final C27761Ps A00;
    public final AnonymousClass141 A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        Context A0G = C36441kJ.A0G(this.A02);
        byte[] bArr = null;
        if (A0G != null) {
            bitmap = C36401kF.A09(A0G, this.A00, this.A01, 96);
            if (bitmap != null) {
                bArr = C36401kF.A1b(bitmap);
            }
        } else {
            bitmap = null;
        }
        return C36441kJ.A0Q(bitmap, bArr);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        byte[] bArr = (byte[]) pair.second;
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
        if (inviteGroupParticipantsActivity != null) {
            inviteGroupParticipantsActivity.A0C = bArr;
            if (bitmap == null) {
                inviteGroupParticipantsActivity.A00.setImageResource(R.drawable.avatar_group);
            } else {
                inviteGroupParticipantsActivity.A00.setImageBitmap(bitmap);
            }
        }
    }

    public C49302it(C27761Ps r2, AnonymousClass141 r3, InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass001.A0F(inviteGroupParticipantsActivity);
        this.A01 = r3;
    }
}
