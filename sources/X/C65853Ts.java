package X;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
public abstract class C65853Ts {
    public static C598835q A00(Context context, C16680pu r18, TextEmojiLabel textEmojiLabel, C74243lI r20, C21060yb r21, AnonymousClass1H2 r22, C28371Sj r23, C19890wg r24, AnonymousClass3T1 r25, String str, float f, int i, boolean z, boolean z2) {
        float f2 = f;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        if (f > 0.0f) {
            textEmojiLabel2.setTextSize(f2);
        }
        String charSequence = AnonymousClass14B.A02(str).toString();
        SpannableStringBuilder A0P = C36441kJ.A0P(charSequence);
        C21060yb r5 = r21;
        C19890wg r6 = r24;
        if (z && !z2) {
            AnonymousClass6YV.A08(r5, r6, A0P);
        }
        C74243lI r10 = r20;
        SpannableStringBuilder spannableStringBuilder = A0P;
        AnonymousClass3UG.A00(textEmojiLabel2.getContext(), textEmojiLabel2.getPaint(), r10, r22, spannableStringBuilder, 1.3f);
        boolean A05 = A05(textEmojiLabel2.getContext(), spannableStringBuilder, r18, charSequence, i, r10.A00);
        Context context2 = context;
        if (context != null) {
            AnonymousClass3T1 r4 = r25;
            if (r25 != null) {
                C28371Sj r8 = r23;
                if (r23 != null) {
                    r8.A04(context2, A0P, r4.A1J.A00, r4.A0w, true);
                }
            }
        }
        if (z && z2) {
            AnonymousClass6YV.A05(textEmojiLabel2.getPaint(), r5, r6, A0P, AnonymousClass00F.A00(textEmojiLabel2.getContext(), R.color.f6nameremoved), AnonymousClass00F.A00(textEmojiLabel2.getContext(), R.color.f6nameremoved), false);
        }
        return new C598835q(A0P, Boolean.valueOf(A05));
    }

    public static boolean A05(Context context, SpannableStringBuilder spannableStringBuilder, C16680pu r8, String str, int i, int i2) {
        int charCount;
        if (i2 <= 0 || i2 >= spannableStringBuilder.length() || i == 78 || (charCount = (i2 + Character.charCount(str.codePointAt(i2 - 1))) - 1) == spannableStringBuilder.length()) {
            return false;
        }
        spannableStringBuilder.delete(charCount, spannableStringBuilder.length());
        SpannableStringBuilder A0P = C36441kJ.A0P(context.getString(R.string.f12nameremoved));
        A0P.setSpan(r8.get(), 0, A0P.length(), 18);
        spannableStringBuilder.append("... ");
        spannableStringBuilder.append(A0P);
        return true;
    }

    public static String A02(Context context, C18820ts r8, C46952bw r9) {
        BigDecimal bigDecimal;
        String str = r9.A05;
        if (str == null || (bigDecimal = r9.A0A) == null) {
            return null;
        }
        return C36391kE.A0v(context, new C132386Tk(str).A03(r8, bigDecimal, true), new Object[1], 0, R.string.f12nameremoved);
    }

    public static boolean A06(C19730wQ r4, AnonymousClass16D r5, C220412q r6, AnonymousClass1A5 r7, C20810yC r8, C20350xQ r9, AnonymousClass3T1 r10, AnonymousClass1C6 r11) {
        AnonymousClass141 r52;
        C64933Qa r2 = r10.A1J;
        if (r2.A02) {
            return true;
        }
        AnonymousClass11F r3 = r2.A00;
        C18740tg.A06(r3);
        if (AnonymousClass1C6.A00(r3, r11) == 1 || C203369nr.A07(r10)) {
            return true;
        }
        AnonymousClass141 A01 = r7.A01(r3);
        if (A01.A0G()) {
            AnonymousClass11F A0J = r10.A0J();
            if (A0J == null) {
                return false;
            }
            AnonymousClass141 A0D = r5.A0D(A0J);
            Class<AnonymousClass147> cls = AnonymousClass147.class;
            UserJid A0G = r5.A0G((GroupJid) A01.A06(cls));
            if (A0G != null) {
                r52 = r5.A0D(A0G);
            } else {
                r52 = null;
            }
            PhoneUserJid A0e = C36371kC.A0e(r4);
            if (r9.A0U.A0H((AnonymousClass147) C36381kD.A0e(A01, cls))) {
                return true;
            }
            if ((r52 == null || (r52.A0F == null && !A0e.equals(r52.A0H))) && A0D.A0F == null && A0D.A08 != 3) {
                return false;
            }
            return true;
        } else if (A01.A0F != null || A01.A08 == 3) {
            return true;
        } else {
            AnonymousClass11F r1 = A01.A0H;
            if (r1 instanceof C28981Uw) {
                C44072La r12 = (C44072La) r6.A09(r1, false);
                if (r12 == null) {
                    return false;
                }
                if (r12.A0P() || !r12.A0N()) {
                    return true;
                }
                return r8.A0E(3209);
            } else if ((r3 instanceof C177628e6) || (r3 instanceof C177638e7)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static C88974Ut A01(Context context) {
        C88974Ut inlineVideoPlaybackHandler;
        AnonymousClass4V7 A01 = AnonymousClass3SS.A01(context);
        if (A01 == null || (inlineVideoPlaybackHandler = A01.getInlineVideoPlaybackHandler()) == null) {
            return new C79623u1();
        }
        return inlineVideoPlaybackHandler;
    }

    public static String A03(C18820ts r5, C46952bw r6) {
        int i = r6.A00;
        Object[] A0L = AnonymousClass001.A0L();
        AnonymousClass000.A1J(A0L, i);
        return r5.A0L(A0L, R.plurals.f10nameremoved, (long) i);
    }

    public static void A04(Context context, AnonymousClass17Y r11, C19730wQ r12, AnonymousClass16D r13, AnonymousClass171 r14, C21060yb r15, C18820ts r16, C28371Sj r17, C19890wg r18, AnonymousClass1AW r19, Collection collection) {
        String A0b;
        String A0u;
        HashSet A16 = C36441kJ.A16();
        StringBuilder A0u2 = AnonymousClass000.A0u();
        StringBuilder A0u3 = AnonymousClass000.A0u();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            if (!A0l.A1R(8) || C61583Cq.A00(A0l) == null) {
                int i = A0l.A1I;
                if (i == 0 || i == 32 || i == 46) {
                    A0b = A0l.A0b();
                } else {
                    A0b = null;
                    if (A0l instanceof C23043B1o) {
                        C200259gz A01 = r19.A01((C23043B1o) A0l);
                        if (A01 != null) {
                            A0b = A01.A08();
                        }
                    } else if (A0l instanceof C46852bm) {
                        A0b = ((C46852bm) A0l).A1k();
                    } else if (A0l instanceof C46972by) {
                        A0b = ((C46972by) A0l).A01;
                    } else if (A0l instanceof AnonymousClass2bU) {
                        A0b = ((AnonymousClass2bU) A0l).A1a();
                    } else if (A0l instanceof AnonymousClass2cW) {
                        A0b = ((AnonymousClass2cW) A0l).A1d();
                    }
                }
            } else {
                A0b = C202359le.A02(C61583Cq.A00(A0l), A0l.A0b());
            }
            if (!TextUtils.isEmpty(A0b)) {
                StringBuilder A0u4 = AnonymousClass000.A0u();
                if (A0u2.length() != 0) {
                    A0u4.append(10);
                }
                if (collection.size() > 1) {
                    A0u4.append('[');
                    A0u4.append(DateUtils.formatDateTime(context, A0l.A0I, 655377));
                    A0u4.append("] ");
                    if (A0l.A1J.A02) {
                        A0u = r12.A0A.A02();
                    } else {
                        A0u = C36381kD.A0u(r13, r14, A0l.A0L());
                    }
                    A0u4.append(A0u);
                    A0u4.append(": ");
                }
                A0u2.append(A0u4);
                A0u3.append(A0u4);
                A0u3.append(A0b);
                if (A0l.A0w != null) {
                    A0u2.append(r17.A01(context, A0l, A0b));
                    A16.addAll(A0l.A0w);
                } else {
                    A0u2.append(A0b);
                }
            }
        }
        String obj = A0u2.toString();
        SharedPreferences.Editor A0G = C36381kD.A0G(r18, C19430v1.A0A);
        if (!A16.isEmpty()) {
            A0G.putString("copied_message", obj);
            A0G.putString("copied_message_without_mentions", A0u3.toString());
            A0G.putString("copied_message_jids", C65713Te.A01(A16));
        } else {
            A0G.remove("copied_message");
            A0G.remove("copied_message_without_mentions");
            A0G.remove("copied_message_jids");
        }
        A0G.apply();
        try {
            r15.A09().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                r11.A06(R.string.f12nameremoved, 0);
                return;
            }
            long size = (long) collection.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1L(objArr, collection.size(), 0);
            r11.A0E(r16.A0L(objArr, R.plurals.f10nameremoved, size), 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("conversation/copymessage/npe", e);
            r11.A06(R.string.f12nameremoved, 0);
        }
    }
}
