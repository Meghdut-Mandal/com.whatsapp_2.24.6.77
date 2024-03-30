package X;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* renamed from: X.3Uc  reason: invalid class name and case insensitive filesystem */
public class C65953Uc {
    public static final int A00 = 8;
    public static final int A01 = 20;
    public static final int A02 = 72;
    public static final int A03 = 108;
    public static final String A04 = "com.whatsapp.sharing.category.SHARE_TARGET_DEFAULT";
    public static final Set A05 = new C53182qu(0);

    public static int A00(Context context) {
        if (Build.VERSION.SDK_INT < 25) {
            return 8;
        }
        return AnonymousClass0Z4.A00(context);
    }

    public static ShortcutInfo A01(Context context, AnonymousClass1Pp r9, AnonymousClass16D r10, AnonymousClass171 r11, C27761Ps r12, C21060yb r13, AnonymousClass141 r14, String str, int i) {
        Log.i("WaShortcutsApiHelper/createShortcutForContact");
        Context context2 = context;
        ShortcutInfo.Builder rank = new ShortcutInfo.Builder(context, C36351kA.A0y(r14)).setShortLabel(str).setCategories(A05).setLongLived(true).setRank(i);
        Intent A0F = C36391kE.A0F(context, C36441kJ.A0j(), C36351kA.A0j(r14));
        AnonymousClass3M9.A02(A0F, "WaShortcutsHelper");
        ShortcutInfo.Builder intent = rank.setIntent(A0F.setAction("android.intent.action.VIEW"));
        Bitmap A07 = r12.A07(context2, r14, 0.0f, 72, true);
        if (A07 == null) {
            A07 = AnonymousClass1Pp.A01(context2, r9, 0.0f, r9.A02(r14), 72);
        }
        intent.setIcon(Icon.createWithAdaptiveBitmap(A02(A07)));
        if (r14.A0H instanceof PhoneUserJid) {
            intent.setPerson(new Person.Builder().setName(r11.A0H(r14)).setUri(A06(r10, r13, r14)).build());
        }
        return intent.build();
    }

    public static Bitmap A02(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(A03, A03, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint A0K = C36441kJ.A0K();
        RectF rectF = new RectF(0.0f, 0.0f, 108.0f, 108.0f);
        canvas.drawARGB(0, 0, 0, 0);
        A0K.setAntiAlias(true);
        A0K.setDither(true);
        A0K.setFilterBitmap(true);
        A0K.setColor(-1);
        canvas.drawRect(rectF, A0K);
        A0K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, ((float) (canvas.getWidth() - bitmap.getWidth())) / 2.0f, ((float) (canvas.getHeight() - bitmap.getHeight())) / 2.0f, A0K);
        return createBitmap;
    }

    public static AnonymousClass0UW A03(AnonymousClass16D r2, AnonymousClass171 r3, C21060yb r4, AnonymousClass141 r5) {
        AnonymousClass0TO r1 = new AnonymousClass0TO();
        r1.A01 = r3.A0H(r5);
        r1.A03 = A06(r2, r4, r5);
        return new AnonymousClass0UW(r1);
    }

    public static AnonymousClass0X5 A04(Context context, C19460v5 r12, AnonymousClass1Pp r13, AnonymousClass16D r14, AnonymousClass171 r15, C27761Ps r16, C21060yb r17, AnonymousClass141 r18, int i) {
        Log.i("WaShortcutsApiHelper/createShortcutCompatForContact");
        AnonymousClass141 r9 = r18;
        AnonymousClass11F r6 = r9.A0H;
        C18740tg.A06(r6);
        String A0H = r15.A0H(r9);
        if (TextUtils.isEmpty(A0H)) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("WaShortcutsApiHelper/createShortcutCompatForContact empty name for:");
            A0u.append(r6);
            A0u.append(" type:");
            C36321k7.A1Y(A0u, r6.getType());
            return null;
        }
        Context context2 = context;
        AnonymousClass0Y4 r4 = new AnonymousClass0Y4(context, r6.getRawString());
        AnonymousClass0X5 r3 = r4.A00;
        r3.A0K = A0H;
        r3.A0O = true;
        r3.A0E = i;
        Intent A1Z = C36441kJ.A0j().A1Z(context, C36351kA.A0j(r9), 0);
        AnonymousClass3M9.A02(A1Z, "WaShortcutsHelper");
        r3.A0P = new Intent[]{A1Z.setAction("android.intent.action.VIEW")};
        if (r12.A03() != null && C197029b1.A00(r6)) {
            Integer[] numArr = new Integer[6];
            AnonymousClass000.A1L(numArr, 1, 0);
            AnonymousClass000.A1L(numArr, 3, 1);
            numArr[2] = C36401kF.A0i();
            AnonymousClass000.A1L(numArr, 2, 3);
            C36341k9.A1U(numArr, 13);
            List A0m = C36341k9.A0m(20, numArr, 5);
            if (!(A0m instanceof Collection) || !A0m.isEmpty()) {
                Iterator it = A0m.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C36341k9.A0A(it) != 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        Set set = A05;
        C000000a r0 = new C000000a();
        r0.addAll(set);
        r3.A0N = r0;
        Bitmap A07 = r16.A07(context2, r9, 0.0f, 72, true);
        if (A07 == null) {
            A07 = AnonymousClass1Pp.A01(context2, r13, 0.0f, r13.A02(r9), 72);
        }
        Bitmap A022 = A02(A07);
        Objects.requireNonNull(A022);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.A06 = A022;
        r3.A0I = iconCompat;
        if (r9.A0H instanceof PhoneUserJid) {
            r3.A0Q = new AnonymousClass0UW[]{A03(r14, r15, r17, r9)};
        }
        return r4.A00();
    }

    public static List A07(AnonymousClass1NG r5, AnonymousClass16D r6, C220412q r7, AnonymousClass1A5 r8, AnonymousClass1FI r9, AnonymousClass17X r10) {
        Log.i("WaShortcutsApiHelper/getFrequentContacts");
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = r9.A02((AnonymousClass4QE) null, true, true).iterator();
        while (it.hasNext()) {
            AnonymousClass11F A0a = C36401kF.A0a(it);
            AnonymousClass141 A08 = r6.A08(A0a);
            if (A08 != null && !C36351kA.A1X(r5, A0a) && !r7.A0R(A0a) && !(A0a instanceof C177638e7) && !(A0a instanceof C177528dw)) {
                if (!A08.A0G() || r10.A0C((GroupJid) A0a)) {
                    A0I.add(A08);
                }
            }
        }
        if (A0I.isEmpty()) {
            Log.i("WaShortcutsApiHelper/getFrequentContacts/get N contacts");
            A0I = r8.A02(20);
            if (A0I.isEmpty()) {
                Log.i("WaShortcutsApiHelper/getFrequentContacts/get contact picker list");
                r6.A0n(A0I);
            }
        }
        return A08(r7, A0I);
    }

    public static List A08(C220412q r6, List list) {
        ArrayList A14 = C36441kJ.A14(8);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass141 A0f = C36391kE.A0f(it);
            AnonymousClass11F r1 = A0f.A0H;
            if (r1 != null && !AnonymousClass143.A0I(r1) && !r6.A0Q(r1) && !(r1 instanceof C28981Uw) && !AnonymousClass143.A0H(r1)) {
                A14.add(A0f);
                if (A14.size() >= 8) {
                    break;
                }
            }
        }
        return A14;
    }

    public static void A0A(Context context) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        List<ShortcutInfo> shortcuts = shortcutManager.getShortcuts(8);
        ArrayList A0I = AnonymousClass001.A0I();
        for (ShortcutInfo id : shortcuts) {
            A0I.add(id.getId());
        }
        shortcutManager.removeLongLivedShortcuts(A0I);
    }

    public static synchronized void A0E(Context context, C19460v5 r14, C19700wN r15, AnonymousClass1NG r16, AnonymousClass1Pp r17, AnonymousClass16D r18, AnonymousClass171 r19, C27761Ps r20, C21060yb r21, C20830yE r22, C220412q r23, AnonymousClass1A5 r24, AnonymousClass1FI r25, AnonymousClass17X r26) {
        synchronized (C65953Uc.class) {
            AnonymousClass16D r8 = r18;
            List A07 = A07(r16, r8, r23, r24, r25, r26);
            ArrayList A0I = AnonymousClass001.A0I();
            Context context2 = context;
            if (AnonymousClass000.A1Q(r22.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA"))) {
                A0I.add(C29411Wn.A00(context));
            }
            int A002 = A00(context);
            int i = 0;
            while (true) {
                if (i < A07.size()) {
                    AnonymousClass0X5 A042 = A04(context2, r14, r17, r8, r19, r20, r21, (AnonymousClass141) A07.get(i), i);
                    if (A042 != null) {
                        A0I.add(A042);
                        if (A002 == A0I.size()) {
                            break;
                        }
                    }
                    i++;
                }
            }
            try {
                A0K(context2, A0I);
            } catch (IllegalArgumentException | IllegalStateException | SecurityException e) {
                r15.A0E("WaShortcutsHelper/rebuildDynamicShortcuts", (String) null, true);
                Log.w("WaShortcutsHelper/exception happened. ", e);
            }
        }
        return;
    }

    public static synchronized void A0G(Context context, AnonymousClass1Pp r14, AnonymousClass16D r15, AnonymousClass171 r16, C27761Ps r17, C21060yb r18, AnonymousClass141 r19, String str) {
        synchronized (C65953Uc.class) {
            Context context2 = context;
            List A032 = AnonymousClass0Z4.A03(context);
            AnonymousClass141 r11 = r19;
            String str2 = str;
            if (A0M(A05(C36351kA.A0y(r11), A032), str2)) {
                Log.i("WaShortcutsApiHelper/publishShortcut/shortcut already published");
            } else {
                AnonymousClass1Pp r6 = r14;
                AnonymousClass16D r7 = r15;
                AnonymousClass171 r8 = r16;
                C27761Ps r9 = r17;
                C21060yb r10 = r18;
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(A01(context2, r6, r7, r8, r9, r10, r11, str2, Math.min(A032.size(), A00(context))));
            }
        }
    }

    public static void A0K(Context context, List list) {
        Log.i("WaShortcutsApiHelper/rebuild shortcut lists");
        AnonymousClass0Z4.A05(context);
        int A002 = A00(context);
        if (list.size() > A002) {
            list = list.subList(0, A002);
        }
        AnonymousClass0Z4.A07(context, list);
    }

    public static void A0L(Context context, List list) {
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager != null) {
            shortcutManager.disableShortcuts(list);
        }
    }

    public static boolean A0M(AnonymousClass0X5 r0, String str) {
        if (r0 == null || !r0.A0K.toString().equals(str)) {
            return false;
        }
        return true;
    }

    public static AnonymousClass0X5 A05(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass0X5 r1 = (AnonymousClass0X5) it.next();
            if (r1.A0M.equals(str)) {
                return r1;
            }
        }
        return null;
    }

    public static String A06(AnonymousClass16D r1, C21060yb r2, AnonymousClass141 r3) {
        Uri A042 = r1.A04(r3, r2.A0O());
        if (A042 != null) {
            return A042.toString();
        }
        return null;
    }

    public static void A0H(Context context, AnonymousClass141 r3) {
        ArrayList A0I = AnonymousClass001.A0I();
        A0I.add(C36351kA.A0y(r3));
        A0L(context, A0I);
    }

    public static void A0I(Context context, AnonymousClass11F r4) {
        String rawString = r4.getRawString();
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        for (ShortcutInfo shortcutInfo : shortcutManager.getShortcuts(8)) {
            if (shortcutInfo.getId().equals(rawString)) {
                shortcutManager.removeLongLivedShortcuts(Collections.singletonList(shortcutInfo.getId()));
                return;
            }
        }
    }

    public static void A09(Context context) {
        AnonymousClass0Z4.A05(context);
    }
}
