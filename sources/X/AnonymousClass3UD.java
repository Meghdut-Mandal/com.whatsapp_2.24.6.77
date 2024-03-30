package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import com.whatsapp.R;
import com.whatsapp.calling.calllink.CallLinkShareReceiver;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3UD  reason: invalid class name */
public abstract class AnonymousClass3UD {
    public static C45192Qk A03(String str, int i, boolean z, boolean z2) {
        C45192Qk r1 = new C45192Qk();
        r1.A04 = str;
        r1.A03 = Integer.valueOf(i);
        r1.A02 = Boolean.valueOf(z);
        r1.A01 = true;
        r1.A00 = Boolean.valueOf(z2);
        return r1;
    }

    public static void A06(AnonymousClass01I r7, C19730wQ r8, AnonymousClass16D r9, C20810yC r10, C107265Nh r11, int i) {
        ArrayList arrayList;
        ArrayList A0C = r11.A0C();
        ArrayList A0v = C36401kF.A0v(A0C);
        Iterator it = A0C.iterator();
        while (it.hasNext()) {
            UserJid A0b = C36401kF.A0b(((C107255Nf) it.next()).A00);
            if (A0b != null && !r8.A0M(A0b)) {
                A0v.add(A0b);
            }
        }
        if (A0v.size() < r10.A07(862)) {
            arrayList = C36441kJ.A15(A0v);
        } else {
            arrayList = null;
        }
        A07(r7, r9, (GroupJid) null, A0v, arrayList, i, false);
    }

    public static AnonymousClass2Q9 A02(String str, int i, int i2, boolean z) {
        AnonymousClass2Q9 r1 = new AnonymousClass2Q9();
        r1.A00 = Integer.valueOf(i);
        r1.A01 = Integer.valueOf(i2);
        r1.A02 = Integer.valueOf(C36371kC.A00(z ? 1 : 0));
        r1.A03 = str;
        return r1;
    }

    public static String A05(String str, boolean z) {
        String str2;
        Uri.Builder authority = new Uri.Builder().scheme("https").authority("call.whatsapp.com");
        if (z) {
            str2 = "video";
        } else {
            str2 = "voice";
        }
        return authority.appendPath(str2).appendPath(str).build().toString();
    }

    public static boolean A08(C20830yE r1, AnonymousClass13J r2, boolean z) {
        if (!z || !r2.BJo()) {
            return false;
        }
        if (C19550w8.A01()) {
            if (r1.A02("android.permission.CAMERA") != 0) {
                return true;
            }
            return false;
        } else if (r1.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static Intent A00(Context context, String str, String str2, int i, boolean z) {
        IntentSender intentSender;
        Intent A0B = C36431kI.A0B();
        A0B.putExtra("android.intent.extra.TEXT", str);
        A0B.putExtra("android.intent.extra.SUBJECT", str2);
        C36371kC.A18(A0B, "text/plain");
        if (Build.VERSION.SDK_INT < 22) {
            intentSender = null;
        } else {
            Intent putExtra = C36441kJ.A0H(context, CallLinkShareReceiver.class).putExtra("extra_entry_point", i).putExtra("extra_is_video", z);
            int i2 = 134217728;
            C65743Th.A05(putExtra, 134217728);
            if (C65743Th.A02) {
                i2 = 167772160;
            }
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, putExtra, i2);
            synchronized (C65743Th.A01) {
                C65743Th.A00++;
            }
            intentSender = broadcast.getIntentSender();
        }
        return AnonymousClass3UJ.A01(intentSender, (CharSequence) null, Collections.singletonList(A0B));
    }

    public static Bitmap A01(Context context, AnonymousClass1Pp r5, C27731Pn r6, AnonymousClass141 r7) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(17104902);
        Bitmap A02 = r6.A02(context, r7, dimensionPixelSize, dimensionPixelSize2);
        if (A02 != null) {
            return A02;
        }
        return r5.A04(r7, resources.getDimension(R.dimen.f7nameremoved), Math.min(dimensionPixelSize, dimensionPixelSize2));
    }

    public static C61243Bc A04(AnonymousClass16D r7, AnonymousClass171 r8, List list, int i, boolean z) {
        Object[] objArr;
        int i2;
        String A0v;
        ArrayList A0I = AnonymousClass001.A0I();
        int i3 = 0;
        while (i3 < i && i3 < list.size()) {
            AnonymousClass141 A0D = r7.A0D((AnonymousClass11F) list.get(i3));
            if (z) {
                A0v = r8.A0H(A0D);
            } else {
                A0v = C36381kD.A0v(r8, A0D);
            }
            A0I.add(A0v);
            i3++;
        }
        if (list.size() > i) {
            int A06 = C36421kH.A06(list, 1);
            Object[] objArr2 = new Object[2];
            objArr2[0] = A0I.get(0);
            AnonymousClass000.A1L(objArr2, C36421kH.A06(list, 1), 1);
            return new C47872fu(objArr2, R.plurals.f10nameremoved, A06);
        }
        if (list.size() == 2) {
            objArr = new Object[2];
            C36341k9.A1P(A0I, objArr);
            i2 = R.string.f12nameremoved;
        } else if (list.size() == 3) {
            objArr = new Object[3];
            C36341k9.A1P(A0I, objArr);
            objArr[2] = A0I.get(2);
            i2 = R.string.f12nameremoved;
        } else if (list.size() == 1) {
            return new C47842fr(C36421kH.A0e(A0I, 0));
        } else {
            if (list.size() == 0) {
                objArr = new Object[0];
                i2 = R.string.f12nameremoved;
            } else {
                C18740tg.A0D(false, "Number of names not supported");
                return null;
            }
        }
        return new C47862ft(objArr, i2);
    }

    public static void A07(AnonymousClass01I r6, AnonymousClass16D r7, GroupJid groupJid, List list, List list2, int i, boolean z) {
        ArrayList A0r = C36361kB.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid A0o = C36441kJ.A0o(it);
            if (r7.A0q(A0o) || !z) {
                A0r.add(A0o);
            }
        }
        int size = list.size() - A0r.size();
        Integer valueOf = Integer.valueOf(i);
        C18740tg.A0D(C36411kG.A1a(A0r), "List must be non empty");
        Intent A0D = C36431kI.A0D();
        A0D.setClassName(r6.getPackageName(), "com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet");
        A0D.putStringArrayListExtra("jids", AnonymousClass143.A07(A0r));
        if (list2 != null && !list2.isEmpty()) {
            A0D.putStringArrayListExtra("selected", AnonymousClass143.A07(list2));
        }
        if (groupJid != null) {
            A0D.putExtra("source_group_jid", groupJid);
        }
        A0D.putExtra("hidden_jids", size);
        A0D.putExtra("call_from_ui", valueOf);
        r6.startActivity(A0D);
        r6.overridePendingTransition(0, 0);
    }
}
