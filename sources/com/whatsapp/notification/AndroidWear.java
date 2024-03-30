package com.whatsapp.notification;

import X.AVb;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0TA;
import X.AnonymousClass0TH;
import X.AnonymousClass0UA;
import X.AnonymousClass0VG;
import X.AnonymousClass0XK;
import X.AnonymousClass11F;
import X.AnonymousClass141;
import X.AnonymousClass16D;
import X.AnonymousClass171;
import X.AnonymousClass17U;
import X.AnonymousClass17Y;
import X.AnonymousClass1A1;
import X.AnonymousClass1NM;
import X.AnonymousClass1U4;
import X.AnonymousClass1X4;
import X.AnonymousClass1Y3;
import X.AnonymousClass2bU;
import X.AnonymousClass3LF;
import X.AnonymousClass3T1;
import X.AnonymousClass3UJ;
import X.AnonymousClass6YV;
import X.C07250Wx;
import X.C07600Ym;
import X.C07700Yy;
import X.C1502374m;
import X.C18740tg;
import X.C18820ts;
import X.C19890wg;
import X.C20310xM;
import X.C20600xp;
import X.C20810yC;
import X.C21060yb;
import X.C26141Ja;
import X.C28361Si;
import X.C28981Uw;
import X.C30131Zi;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36391kE;
import X.C36441kJ;
import X.C46882bp;
import X.C47172dd;
import X.C600336f;
import X.C64933Qa;
import X.C65743Th;
import X.C81123wV;
import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

public final class AndroidWear extends C47172dd {
    public static AnonymousClass0XK A0B;
    public static final String A0C;
    public static final String A0D = AnonymousClass000.A0q(".intent.action.MUTE_NEWSLETTER", AnonymousClass000.A0v("com.whatsapp"));
    public static final String A0E = AnonymousClass000.A0q(".intent.action.REACTION", AnonymousClass000.A0v("com.whatsapp"));
    public static final String A0F = AnonymousClass000.A0q(".intent.action.REPLY", AnonymousClass000.A0v("com.whatsapp"));
    public static final int[] A0G = {R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved, R.string.f12nameremoved};
    public AnonymousClass17Y A00;
    public AnonymousClass1X4 A01;
    public AnonymousClass16D A02;
    public AnonymousClass1Y3 A03;
    public AnonymousClass1NM A04;
    public C21060yb A05;
    public C26141Ja A06;
    public C30131Zi A07;
    public C28361Si A08;
    public C19890wg A09;
    public boolean A0A = false;

    public AndroidWear() {
        super("AndroidWear");
    }

    public static C07250Wx A00(Context context, AnonymousClass141 r6) {
        AnonymousClass0UA r1 = new AnonymousClass0UA(R.drawable.ic_notif_mark_read, context.getString(R.string.f12nameremoved), C65743Th.A04(context, new Intent(A0C, AnonymousClass1U4.A00(r6), context, AndroidWear.class), 134217728));
        r1.A00 = 2;
        r1.A03 = false;
        return r1.A00();
    }

    public static C07250Wx A01(Context context, AnonymousClass141 r5, AnonymousClass3T1 r6, String str, int i) {
        Intent intent = new Intent(A0E, AnonymousClass1U4.A00(r5).buildUpon().fragment(C36361kB.A0l()).build(), context, AndroidWear.class);
        AnonymousClass3UJ.A00(intent, r6.A1J);
        intent.putExtra("reaction", str);
        AnonymousClass0UA r1 = new AnonymousClass0UA(i, str, C65743Th.A04(context, intent, 0));
        r1.A00 = 8;
        r1.A03 = false;
        return r1.A00();
    }

    public static void A03(AndroidWear androidWear, boolean z) {
        C28361Si.A01(androidWear.A08, (AnonymousClass3T1) null, true, true, true, false, z, false);
    }

    public void onCreate() {
        Log.i("android-wear/onCreate");
        A04();
        super.onCreate();
    }

    public void onDestroy() {
        Log.i("android-wear/onDestroy");
        super.onDestroy();
    }

    public void onHandleIntent(Intent intent) {
        AnonymousClass17Y r4;
        Runnable runnable;
        AnonymousClass17Y r2;
        Runnable aVb;
        if (intent != null) {
            Bundle A012 = AnonymousClass0VG.A01(intent);
            String str = null;
            if (AnonymousClass1U4.A01(intent.getData())) {
                AnonymousClass16D r22 = this.A02;
                Uri data = intent.getData();
                C18740tg.A0B(AnonymousClass1U4.A01(data));
                AnonymousClass141 A052 = r22.A05(ContentUris.parseId(data));
                if (A052 != null) {
                    if (A012 != null) {
                        CharSequence charSequence = A012.getCharSequence("android_wear_voice_input");
                        if (charSequence != null) {
                            str = charSequence.toString().trim();
                        }
                        if (!AnonymousClass6YV.A0P(this.A05, this.A09, str)) {
                            Log.i("androidwear/voiceinputfromandroidwear/message is empty");
                            r2 = this.A00;
                            aVb = new C81123wV((Object) this, 35);
                        } else {
                            r2 = this.A00;
                            aVb = new C1502374m(this, A052, str, 5);
                        }
                    } else if (A0E.equals(intent.getAction())) {
                        String stringExtra = intent.getStringExtra("reaction");
                        C64933Qa A022 = AnonymousClass3UJ.A02(intent);
                        if (stringExtra != null && A022 != null) {
                            r4 = this.A00;
                            runnable = new C1502374m(this, A022, stringExtra, 6);
                            r4.A0H(runnable);
                        }
                        return;
                    } else if (A0C.equals(intent.getAction())) {
                        r2 = this.A00;
                        aVb = new AVb(this, A052, 1);
                    } else if (A0D.equals(intent.getAction())) {
                        AnonymousClass11F A0j = C36351kA.A0j(A052);
                        if (!(A0j instanceof C28981Uw)) {
                            Log.e("androidwear/ACTION_MUTE_NEWSLETTER for non-newsletter jid/ignoring");
                            return;
                        }
                        C28981Uw r23 = (C28981Uw) A0j;
                        this.A06.A09(r23, true);
                        this.A07.A08(r23);
                        A03(this, true);
                        return;
                    } else {
                        return;
                    }
                    r2.A0H(aVb);
                    return;
                }
            }
            r4 = this.A00;
            runnable = new C81123wV((Object) this, 34);
            r4.A0H(runnable);
        }
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("com.whatsapp");
        A0C = AnonymousClass000.A0q(".intent.action.MARK_AS_READ", A0u);
    }

    public static C07600Ym A02(Context context, Bitmap bitmap, AnonymousClass171 r20, C18820ts r21, C20310xM r22, AnonymousClass17U r23, AnonymousClass141 r24, C20810yC r25, AnonymousClass3LF r26, C20600xp r27, AnonymousClass1A1 r28, boolean z, boolean z2, boolean z3) {
        String str;
        String str2;
        CharSequence charSequence;
        C07600Ym r0 = new C07600Ym();
        Context context2 = context;
        AnonymousClass3LF r5 = r26;
        if (z) {
            AnonymousClass3T1 r2 = r5.A00;
            if ((r2 instanceof C46882bp) && ((AnonymousClass2bU) r2).A01 != null) {
                C07600Ym r4 = new C07600Ym();
                r4.A05 = 4 | r4.A05;
                C07700Yy r1 = new C07700Yy(context2, (String) null);
                r4.A04(r1);
                r0.A0D.add(r1.A05());
            }
        }
        AnonymousClass141 r11 = r24;
        if (z2) {
            Class<AnonymousClass11F> cls = AnonymousClass11F.class;
            C600336f A0S = r22.A0S(C36441kJ.A0k(r11, cls), 20, 1, -1);
            Cursor cursor = A0S.A00;
            CharSequence charSequence2 = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        if (r23.A07(C36441kJ.A0k(r11, cls), A0S.A02)) {
                            charSequence = TextUtils.concat(new CharSequence[]{charSequence2, "…"});
                        } else {
                            charSequence = charSequence2;
                        }
                        do {
                            AnonymousClass11F A0k = C36441kJ.A0k(r11, cls);
                            C18740tg.A06(A0k);
                            AnonymousClass3T1 A012 = r28.A01(cursor, A0k);
                            CharSequence A0F2 = (A012 == null || A012.A1I == 90) ? charSequence2 : r27.A0F(r11, A012, false, true, true);
                            if (A0F2 != charSequence2) {
                                if (charSequence != charSequence2) {
                                    charSequence = TextUtils.concat(new CharSequence[]{charSequence, "\n\n"});
                                }
                                charSequence = TextUtils.concat(new CharSequence[]{charSequence, A0F2});
                            }
                        } while (cursor.moveToPrevious());
                        charSequence2 = charSequence;
                    }
                } finally {
                    cursor.close();
                }
            }
            C07700Yy r6 = new C07700Yy(context2, (String) null);
            C36341k9.A14(r6, charSequence2);
            C07600Ym r42 = new C07600Ym();
            r42.A05 = 8 | r42.A05;
            r42.A04(r6);
            r0.A0D.add(r6.A05());
        }
        if (z3) {
            String A0v = C36391kE.A0v(context2, r20.A0H(r11), new Object[1], 0, R.string.f12nameremoved);
            String[] A0Q = r21.A0Q(A0G);
            if (Build.VERSION.SDK_INT >= 23) {
                str = "&#x1F603;";
                str2 = "&#x1F61E;";
            } else {
                str = ":-)";
                str2 = ":-(";
            }
            AnonymousClass0TA r8 = new AnonymousClass0TA();
            r8.A00 = A0v;
            String[][] strArr = {new String[]{str, str2}, A0Q};
            int i = 0;
            int i2 = 0;
            do {
                i2 += strArr[i].length;
                i++;
            } while (i < 2);
            Object[] copyOf = Arrays.copyOf(strArr[0], i2);
            int length = strArr[0].length;
            String[] strArr2 = strArr[1];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            CharSequence[] charSequenceArr = (CharSequence[]) copyOf;
            r8.A01 = charSequenceArr;
            AnonymousClass0TH r12 = new AnonymousClass0TH(r8.A02, r8.A00, "android_wear_voice_input", r8.A03, charSequenceArr);
            Intent intent = new Intent(A0F, AnonymousClass1U4.A00(r11), context2, AndroidWear.class);
            int i3 = 134217728;
            C65743Th.A05(intent, 134217728);
            if (C65743Th.A02) {
                i3 = 167772160;
            }
            AnonymousClass0UA r29 = new AnonymousClass0UA(R.drawable.ic_full_reply, r12.A01, PendingIntent.getService(context2, 0, intent, i3));
            ArrayList arrayList = r29.A01;
            if (arrayList == null) {
                arrayList = AnonymousClass001.A0I();
                r29.A01 = arrayList;
            }
            arrayList.add(r12);
            r0.A0C.add(r29.A00());
            if (r25.A0E(2773)) {
                r0.A0C.add(A01(context2, r11, r5.A00, "👍", R.drawable.ic_notif_thumbs_up));
                r0.A0C.add(A01(context2, r11, r5.A00, "❤️", R.drawable.ic_notif_heart));
            }
        }
        r0.A0C.add(A00(context2, r11));
        Bitmap bitmap2 = bitmap;
        if (bitmap != null) {
            r0.A09 = bitmap2;
        }
        return r0;
    }
}
